package org.jcodec.codecs.h264.decode.aso;

import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;

public class MapManager {
    private MBToSliceGroupMap mbToSliceGroupMap;
    private PictureParameterSet pps;
    private int prevSliceGroupChangeCycle;
    private SeqParameterSet sps;

    public MapManager(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet) {
        this.sps = seqParameterSet;
        this.pps = pictureParameterSet;
        this.mbToSliceGroupMap = buildMap(seqParameterSet, pictureParameterSet);
    }

    private MBToSliceGroupMap buildMap(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet) {
        int[] iArr;
        int i = pictureParameterSet.num_slice_groups_minus1 + 1;
        if (i <= 1) {
            return null;
        }
        int i2 = seqParameterSet.pic_width_in_mbs_minus1 + 1;
        int picHeightInMbs = H264Utils.getPicHeightInMbs(seqParameterSet);
        int i3 = pictureParameterSet.slice_group_map_type;
        if (i3 == 0) {
            int[] iArr2 = new int[i];
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = pictureParameterSet.run_length_minus1[i4] + 1;
            }
            iArr = SliceGroupMapBuilder.buildInterleavedMap(i2, picHeightInMbs, iArr2);
        } else if (i3 == 1) {
            iArr = SliceGroupMapBuilder.buildDispersedMap(i2, picHeightInMbs, i);
        } else if (i3 == 2) {
            iArr = SliceGroupMapBuilder.buildForegroundMap(i2, picHeightInMbs, i, pictureParameterSet.top_left, pictureParameterSet.bottom_right);
        } else if (i3 >= 3 && i3 <= 5) {
            return null;
        } else {
            if (pictureParameterSet.slice_group_map_type == 6) {
                iArr = pictureParameterSet.slice_group_id;
            } else {
                throw new RuntimeException("Unsupported slice group map type");
            }
        }
        return buildMapIndices(iArr, i);
    }

    private MBToSliceGroupMap buildMapIndices(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int i4 = iArr2[i3];
            iArr2[i3] = i4 + 1;
            iArr3[i2] = i4;
        }
        int[][] iArr4 = new int[i][];
        for (int i5 = 0; i5 < i; i5++) {
            iArr4[i5] = new int[iArr2[i5]];
        }
        int[] iArr5 = new int[i];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            int[] iArr6 = iArr4[i7];
            int i8 = iArr5[i7];
            iArr5[i7] = i8 + 1;
            iArr6[i8] = i6;
        }
        return new MBToSliceGroupMap(iArr, iArr3, iArr4);
    }

    private void updateMap(SliceHeader sliceHeader) {
        int[] iArr;
        PictureParameterSet pictureParameterSet = this.pps;
        int i = pictureParameterSet.slice_group_map_type;
        int i2 = pictureParameterSet.num_slice_groups_minus1 + 1;
        if (i2 > 1 && i >= 3 && i <= 5) {
            if (sliceHeader.slice_group_change_cycle != this.prevSliceGroupChangeCycle || this.mbToSliceGroupMap == null) {
                this.prevSliceGroupChangeCycle = sliceHeader.slice_group_change_cycle;
                SeqParameterSet seqParameterSet = this.sps;
                int i3 = seqParameterSet.pic_width_in_mbs_minus1 + 1;
                int picHeightInMbs = H264Utils.getPicHeightInMbs(seqParameterSet);
                int i4 = i3 * picHeightInMbs;
                int i5 = sliceHeader.slice_group_change_cycle * (this.pps.slice_group_change_rate_minus1 + 1);
                if (i5 > i4) {
                    i5 = i4;
                }
                int i6 = this.pps.slice_group_change_direction_flag ? i4 - i5 : i5;
                if (i == 3) {
                    iArr = SliceGroupMapBuilder.buildBoxOutMap(i3, picHeightInMbs, this.pps.slice_group_change_direction_flag, i5);
                } else if (i == 4) {
                    iArr = SliceGroupMapBuilder.buildRasterScanMap(i3, picHeightInMbs, i6, this.pps.slice_group_change_direction_flag);
                } else {
                    iArr = SliceGroupMapBuilder.buildWipeMap(i3, picHeightInMbs, i6, this.pps.slice_group_change_direction_flag);
                }
                this.mbToSliceGroupMap = buildMapIndices(iArr, i2);
            }
        }
    }

    public Mapper getMapper(SliceHeader sliceHeader) {
        updateMap(sliceHeader);
        int i = sliceHeader.first_mb_in_slice;
        if (this.pps.num_slice_groups_minus1 > 0) {
            return new PrebuiltMBlockMapper(this.mbToSliceGroupMap, i, this.sps.pic_width_in_mbs_minus1 + 1);
        }
        return new FlatMBlockMapper(this.sps.pic_width_in_mbs_minus1 + 1, i);
    }
}
