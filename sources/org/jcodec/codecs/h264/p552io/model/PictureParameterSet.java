package org.jcodec.codecs.h264.p552io.model;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.jcodec.codecs.h264.decode.CAVLCReader;
import org.jcodec.codecs.h264.p552io.write.CAVLCWriter;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

/* renamed from: org.jcodec.codecs.h264.io.model.PictureParameterSet */
public class PictureParameterSet {
    public int[] bottom_right;
    public int chroma_qp_index_offset;
    public boolean constrained_intra_pred_flag;
    public boolean deblocking_filter_control_present_flag;
    public boolean entropy_coding_mode_flag;
    public PPSExt extended;
    public int[] num_ref_idx_active_minus1 = new int[2];
    public int num_slice_groups_minus1;
    public int pic_init_qp_minus26;
    public int pic_init_qs_minus26;
    public boolean pic_order_present_flag;
    public int pic_parameter_set_id;
    public boolean redundant_pic_cnt_present_flag;
    public int[] run_length_minus1;
    public int seq_parameter_set_id;
    public boolean slice_group_change_direction_flag;
    public int slice_group_change_rate_minus1;
    public int[] slice_group_id;
    public int slice_group_map_type;
    public int[] top_left;
    public int weighted_bipred_idc;
    public boolean weighted_pred_flag;

    /* renamed from: org.jcodec.codecs.h264.io.model.PictureParameterSet$PPSExt */
    public static class PPSExt {
        public boolean[] pic_scaling_list_present_flag;
        public ScalingMatrix scalindMatrix;
        public int second_chroma_qp_index_offset;
        public boolean transform_8x8_mode_flag;
    }

    public static PictureParameterSet read(ByteBuffer byteBuffer) {
        BitReader bitReader = new BitReader(byteBuffer);
        PictureParameterSet pictureParameterSet = new PictureParameterSet();
        pictureParameterSet.pic_parameter_set_id = CAVLCReader.readUE(bitReader, "PPS: pic_parameter_set_id");
        pictureParameterSet.seq_parameter_set_id = CAVLCReader.readUE(bitReader, "PPS: seq_parameter_set_id");
        pictureParameterSet.entropy_coding_mode_flag = CAVLCReader.readBool(bitReader, "PPS: entropy_coding_mode_flag");
        pictureParameterSet.pic_order_present_flag = CAVLCReader.readBool(bitReader, "PPS: pic_order_present_flag");
        pictureParameterSet.num_slice_groups_minus1 = CAVLCReader.readUE(bitReader, "PPS: num_slice_groups_minus1");
        if (pictureParameterSet.num_slice_groups_minus1 > 0) {
            pictureParameterSet.slice_group_map_type = CAVLCReader.readUE(bitReader, "PPS: slice_group_map_type");
            int i = pictureParameterSet.num_slice_groups_minus1;
            pictureParameterSet.top_left = new int[(i + 1)];
            pictureParameterSet.bottom_right = new int[(i + 1)];
            pictureParameterSet.run_length_minus1 = new int[(i + 1)];
            int i2 = pictureParameterSet.slice_group_map_type;
            if (i2 == 0) {
                for (int i3 = 0; i3 <= pictureParameterSet.num_slice_groups_minus1; i3++) {
                    pictureParameterSet.run_length_minus1[i3] = CAVLCReader.readUE(bitReader, "PPS: run_length_minus1");
                }
            } else if (i2 == 2) {
                for (int i4 = 0; i4 < pictureParameterSet.num_slice_groups_minus1; i4++) {
                    pictureParameterSet.top_left[i4] = CAVLCReader.readUE(bitReader, "PPS: top_left");
                    pictureParameterSet.bottom_right[i4] = CAVLCReader.readUE(bitReader, "PPS: bottom_right");
                }
            } else {
                int i5 = 3;
                if (i2 == 3 || i2 == 4 || i2 == 5) {
                    pictureParameterSet.slice_group_change_direction_flag = CAVLCReader.readBool(bitReader, "PPS: slice_group_change_direction_flag");
                    pictureParameterSet.slice_group_change_rate_minus1 = CAVLCReader.readUE(bitReader, "PPS: slice_group_change_rate_minus1");
                } else if (i2 == 6) {
                    if (i + 1 <= 4) {
                        i5 = i + 1 > 2 ? 2 : 1;
                    }
                    int readUE = CAVLCReader.readUE(bitReader, "PPS: pic_size_in_map_units_minus1");
                    pictureParameterSet.slice_group_id = new int[(readUE + 1)];
                    for (int i6 = 0; i6 <= readUE; i6++) {
                        int[] iArr = pictureParameterSet.slice_group_id;
                        StringBuilder sb = new StringBuilder();
                        sb.append("PPS: slice_group_id [");
                        sb.append(i6);
                        sb.append("]f");
                        iArr[i6] = CAVLCReader.readU(bitReader, i5, sb.toString());
                    }
                }
            }
        }
        pictureParameterSet.num_ref_idx_active_minus1 = new int[]{CAVLCReader.readUE(bitReader, "PPS: num_ref_idx_l0_active_minus1"), CAVLCReader.readUE(bitReader, "PPS: num_ref_idx_l1_active_minus1")};
        pictureParameterSet.weighted_pred_flag = CAVLCReader.readBool(bitReader, "PPS: weighted_pred_flag");
        pictureParameterSet.weighted_bipred_idc = CAVLCReader.readNBit(bitReader, 2, "PPS: weighted_bipred_idc");
        pictureParameterSet.pic_init_qp_minus26 = CAVLCReader.readSE(bitReader, "PPS: pic_init_qp_minus26");
        pictureParameterSet.pic_init_qs_minus26 = CAVLCReader.readSE(bitReader, "PPS: pic_init_qs_minus26");
        pictureParameterSet.chroma_qp_index_offset = CAVLCReader.readSE(bitReader, "PPS: chroma_qp_index_offset");
        pictureParameterSet.deblocking_filter_control_present_flag = CAVLCReader.readBool(bitReader, "PPS: deblocking_filter_control_present_flag");
        pictureParameterSet.constrained_intra_pred_flag = CAVLCReader.readBool(bitReader, "PPS: constrained_intra_pred_flag");
        pictureParameterSet.redundant_pic_cnt_present_flag = CAVLCReader.readBool(bitReader, "PPS: redundant_pic_cnt_present_flag");
        if (CAVLCReader.moreRBSPData(bitReader)) {
            pictureParameterSet.extended = new PPSExt();
            pictureParameterSet.extended.transform_8x8_mode_flag = CAVLCReader.readBool(bitReader, "PPS: transform_8x8_mode_flag");
            if (CAVLCReader.readBool(bitReader, "PPS: pic_scaling_matrix_present_flag")) {
                for (int i7 = 0; i7 < ((pictureParameterSet.extended.transform_8x8_mode_flag ? 1 : 0) * true) + 6; i7++) {
                    if (CAVLCReader.readBool(bitReader, "PPS: pic_scaling_list_present_flag")) {
                        ScalingMatrix scalingMatrix = pictureParameterSet.extended.scalindMatrix;
                        scalingMatrix.ScalingList4x4 = new ScalingList[8];
                        scalingMatrix.ScalingList8x8 = new ScalingList[8];
                        if (i7 < 6) {
                            scalingMatrix.ScalingList4x4[i7] = ScalingList.read(bitReader, 16);
                        } else {
                            scalingMatrix.ScalingList8x8[i7 - 6] = ScalingList.read(bitReader, 64);
                        }
                    }
                }
            }
            pictureParameterSet.extended.second_chroma_qp_index_offset = CAVLCReader.readSE(bitReader, "PPS: second_chroma_qp_index_offset");
        }
        return pictureParameterSet;
    }

    public PictureParameterSet copy() {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        write(allocate);
        allocate.flip();
        return read(allocate);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureParameterSet.class != obj.getClass()) {
            return false;
        }
        PictureParameterSet pictureParameterSet = (PictureParameterSet) obj;
        if (!Arrays.equals(this.bottom_right, pictureParameterSet.bottom_right) || this.chroma_qp_index_offset != pictureParameterSet.chroma_qp_index_offset || this.constrained_intra_pred_flag != pictureParameterSet.constrained_intra_pred_flag || this.deblocking_filter_control_present_flag != pictureParameterSet.deblocking_filter_control_present_flag || this.entropy_coding_mode_flag != pictureParameterSet.entropy_coding_mode_flag) {
            return false;
        }
        PPSExt pPSExt = this.extended;
        if (pPSExt == null) {
            if (pictureParameterSet.extended != null) {
                return false;
            }
        } else if (!pPSExt.equals(pictureParameterSet.extended)) {
            return false;
        }
        int[] iArr = this.num_ref_idx_active_minus1;
        int i = iArr[0];
        int[] iArr2 = pictureParameterSet.num_ref_idx_active_minus1;
        return i == iArr2[0] && iArr[1] == iArr2[1] && this.num_slice_groups_minus1 == pictureParameterSet.num_slice_groups_minus1 && this.pic_init_qp_minus26 == pictureParameterSet.pic_init_qp_minus26 && this.pic_init_qs_minus26 == pictureParameterSet.pic_init_qs_minus26 && this.pic_order_present_flag == pictureParameterSet.pic_order_present_flag && this.pic_parameter_set_id == pictureParameterSet.pic_parameter_set_id && this.redundant_pic_cnt_present_flag == pictureParameterSet.redundant_pic_cnt_present_flag && Arrays.equals(this.run_length_minus1, pictureParameterSet.run_length_minus1) && this.seq_parameter_set_id == pictureParameterSet.seq_parameter_set_id && this.slice_group_change_direction_flag == pictureParameterSet.slice_group_change_direction_flag && this.slice_group_change_rate_minus1 == pictureParameterSet.slice_group_change_rate_minus1 && Arrays.equals(this.slice_group_id, pictureParameterSet.slice_group_id) && this.slice_group_map_type == pictureParameterSet.slice_group_map_type && Arrays.equals(this.top_left, pictureParameterSet.top_left) && this.weighted_bipred_idc == pictureParameterSet.weighted_bipred_idc && this.weighted_pred_flag == pictureParameterSet.weighted_pred_flag;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((Arrays.hashCode(this.bottom_right) + 31) * 31) + this.chroma_qp_index_offset) * 31) + (this.constrained_intra_pred_flag ? 1231 : 1237)) * 31) + (this.deblocking_filter_control_present_flag ? 1231 : 1237)) * 31) + (this.entropy_coding_mode_flag ? 1231 : 1237)) * 31;
        PPSExt pPSExt = this.extended;
        int hashCode2 = (hashCode + (pPSExt == null ? 0 : pPSExt.hashCode())) * 31;
        int[] iArr = this.num_ref_idx_active_minus1;
        int hashCode3 = (((((((((((((((((((((((((((((((hashCode2 + iArr[0]) * 31) + iArr[1]) * 31) + this.num_slice_groups_minus1) * 31) + this.pic_init_qp_minus26) * 31) + this.pic_init_qs_minus26) * 31) + (this.pic_order_present_flag ? 1231 : 1237)) * 31) + this.pic_parameter_set_id) * 31) + (this.redundant_pic_cnt_present_flag ? 1231 : 1237)) * 31) + Arrays.hashCode(this.run_length_minus1)) * 31) + this.seq_parameter_set_id) * 31) + (this.slice_group_change_direction_flag ? 1231 : 1237)) * 31) + this.slice_group_change_rate_minus1) * 31) + Arrays.hashCode(this.slice_group_id)) * 31) + this.slice_group_map_type) * 31) + Arrays.hashCode(this.top_left)) * 31) + this.weighted_bipred_idc) * 31;
        if (!this.weighted_pred_flag) {
            i = 1237;
        }
        return hashCode3 + i;
    }

    public void write(ByteBuffer byteBuffer) {
        BitWriter bitWriter = new BitWriter(byteBuffer);
        CAVLCWriter.writeUE(bitWriter, this.pic_parameter_set_id, "PPS: pic_parameter_set_id");
        CAVLCWriter.writeUE(bitWriter, this.seq_parameter_set_id, "PPS: seq_parameter_set_id");
        CAVLCWriter.writeBool(bitWriter, this.entropy_coding_mode_flag, "PPS: entropy_coding_mode_flag");
        CAVLCWriter.writeBool(bitWriter, this.pic_order_present_flag, "PPS: pic_order_present_flag");
        CAVLCWriter.writeUE(bitWriter, this.num_slice_groups_minus1, "PPS: num_slice_groups_minus1");
        String str = "PPS: ";
        if (this.num_slice_groups_minus1 > 0) {
            CAVLCWriter.writeUE(bitWriter, this.slice_group_map_type, "PPS: slice_group_map_type");
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            int i = this.slice_group_map_type;
            if (i == 0) {
                for (int i2 = 0; i2 <= this.num_slice_groups_minus1; i2++) {
                    CAVLCWriter.writeUE(bitWriter, iArr3[i2], str);
                }
            } else if (i == 2) {
                for (int i3 = 0; i3 < this.num_slice_groups_minus1; i3++) {
                    CAVLCWriter.writeUE(bitWriter, iArr[i3], str);
                    CAVLCWriter.writeUE(bitWriter, iArr2[i3], str);
                }
            } else {
                int i4 = 3;
                if (i == 3 || i == 4 || i == 5) {
                    CAVLCWriter.writeBool(bitWriter, this.slice_group_change_direction_flag, "PPS: slice_group_change_direction_flag");
                    CAVLCWriter.writeUE(bitWriter, this.slice_group_change_rate_minus1, "PPS: slice_group_change_rate_minus1");
                } else if (i == 6) {
                    int i5 = this.num_slice_groups_minus1;
                    if (i5 + 1 <= 4) {
                        i4 = i5 + 1 > 2 ? 2 : 1;
                    }
                    CAVLCWriter.writeUE(bitWriter, this.slice_group_id.length, str);
                    int i6 = 0;
                    while (true) {
                        int[] iArr4 = this.slice_group_id;
                        if (i6 > iArr4.length) {
                            break;
                        }
                        CAVLCWriter.writeU(bitWriter, iArr4[i6], i4);
                        i6++;
                    }
                }
            }
        }
        CAVLCWriter.writeUE(bitWriter, this.num_ref_idx_active_minus1[0], "PPS: num_ref_idx_l0_active_minus1");
        CAVLCWriter.writeUE(bitWriter, this.num_ref_idx_active_minus1[1], "PPS: num_ref_idx_l1_active_minus1");
        CAVLCWriter.writeBool(bitWriter, this.weighted_pred_flag, "PPS: weighted_pred_flag");
        CAVLCWriter.writeNBit(bitWriter, (long) this.weighted_bipred_idc, 2, "PPS: weighted_bipred_idc");
        CAVLCWriter.writeSE(bitWriter, this.pic_init_qp_minus26, "PPS: pic_init_qp_minus26");
        CAVLCWriter.writeSE(bitWriter, this.pic_init_qs_minus26, "PPS: pic_init_qs_minus26");
        CAVLCWriter.writeSE(bitWriter, this.chroma_qp_index_offset, "PPS: chroma_qp_index_offset");
        CAVLCWriter.writeBool(bitWriter, this.deblocking_filter_control_present_flag, "PPS: deblocking_filter_control_present_flag");
        CAVLCWriter.writeBool(bitWriter, this.constrained_intra_pred_flag, "PPS: constrained_intra_pred_flag");
        CAVLCWriter.writeBool(bitWriter, this.redundant_pic_cnt_present_flag, "PPS: redundant_pic_cnt_present_flag");
        PPSExt pPSExt = this.extended;
        if (pPSExt != null) {
            CAVLCWriter.writeBool(bitWriter, pPSExt.transform_8x8_mode_flag, "PPS: transform_8x8_mode_flag");
            CAVLCWriter.writeBool(bitWriter, this.extended.scalindMatrix != null, "PPS: scalindMatrix");
            if (this.extended.scalindMatrix != null) {
                int i7 = 0;
                while (true) {
                    PPSExt pPSExt2 = this.extended;
                    if (i7 >= ((pPSExt2.transform_8x8_mode_flag ? 1 : 0) * true) + 6) {
                        break;
                    }
                    if (i7 < 6) {
                        CAVLCWriter.writeBool(bitWriter, pPSExt2.scalindMatrix.ScalingList4x4[i7] != null, str);
                        ScalingList[] scalingListArr = this.extended.scalindMatrix.ScalingList4x4;
                        if (scalingListArr[i7] != null) {
                            scalingListArr[i7].write(bitWriter);
                        }
                    } else {
                        int i8 = i7 - 6;
                        CAVLCWriter.writeBool(bitWriter, pPSExt2.scalindMatrix.ScalingList8x8[i8] != null, str);
                        ScalingList[] scalingListArr2 = this.extended.scalindMatrix.ScalingList8x8;
                        if (scalingListArr2[i8] != null) {
                            scalingListArr2[i8].write(bitWriter);
                        }
                    }
                    i7++;
                }
            }
            CAVLCWriter.writeSE(bitWriter, this.extended.second_chroma_qp_index_offset, str);
        }
        CAVLCWriter.writeTrailingBits(bitWriter);
    }
}
