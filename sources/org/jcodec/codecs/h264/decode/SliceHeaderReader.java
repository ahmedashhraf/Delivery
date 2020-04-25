package org.jcodec.codecs.h264.decode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import org.jcodec.codecs.h264.p552io.model.NALUnit;
import org.jcodec.codecs.h264.p552io.model.NALUnitType;
import org.jcodec.codecs.h264.p552io.model.PictureParameterSet;
import org.jcodec.codecs.h264.p552io.model.PredictionWeightTable;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.Instruction;
import org.jcodec.codecs.h264.p552io.model.RefPicMarkingIDR;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.h264.p552io.model.SliceType;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.p554io.BitReader;

public class SliceHeaderReader {
    private static int CeilLog2(int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 1;
            i3++;
        }
        return i3;
    }

    private static void readDecoderPicMarking(NALUnit nALUnit, SliceHeader sliceHeader, BitReader bitReader) {
        int readUE;
        if (nALUnit.type == NALUnitType.IDR_SLICE) {
            sliceHeader.refPicMarkingIDR = new RefPicMarkingIDR(CAVLCReader.readBool(bitReader, "SH: no_output_of_prior_pics_flag"), CAVLCReader.readBool(bitReader, "SH: long_term_reference_flag"));
        } else if (CAVLCReader.readBool(bitReader, "SH: adaptive_ref_pic_marking_mode_flag")) {
            ArrayList arrayList = new ArrayList();
            do {
                readUE = CAVLCReader.readUE(bitReader, "SH: memory_management_control_operation");
                Instruction instruction = null;
                String str = "SH: long_term_frame_idx";
                String str2 = "SH: difference_of_pic_nums_minus1";
                switch (readUE) {
                    case 1:
                        instruction = new Instruction(InstrType.REMOVE_SHORT, CAVLCReader.readUE(bitReader, str2) + 1, 0);
                        break;
                    case 2:
                        instruction = new Instruction(InstrType.REMOVE_LONG, CAVLCReader.readUE(bitReader, "SH: long_term_pic_num"), 0);
                        break;
                    case 3:
                        instruction = new Instruction(InstrType.CONVERT_INTO_LONG, CAVLCReader.readUE(bitReader, str2) + 1, CAVLCReader.readUE(bitReader, str));
                        break;
                    case 4:
                        instruction = new Instruction(InstrType.TRUNK_LONG, CAVLCReader.readUE(bitReader, "SH: max_long_term_frame_idx_plus1") - 1, 0);
                        break;
                    case 5:
                        instruction = new Instruction(InstrType.CLEAR, 0, 0);
                        break;
                    case 6:
                        instruction = new Instruction(InstrType.MARK_LONG, CAVLCReader.readUE(bitReader, str), 0);
                        break;
                }
                if (instruction != null) {
                    arrayList.add(instruction);
                    continue;
                }
            } while (readUE != 0);
            sliceHeader.refPicMarkingNonIDR = new RefPicMarking((Instruction[]) arrayList.toArray(new Instruction[0]));
        }
    }

    private static void readPredWeightTable(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, SliceHeader sliceHeader, BitReader bitReader) {
        Class<int> cls = int.class;
        sliceHeader.pred_weight_table = new PredictionWeightTable();
        int[] iArr = sliceHeader.num_ref_idx_active_override_flag ? sliceHeader.num_ref_idx_active_minus1 : pictureParameterSet.num_ref_idx_active_minus1;
        int[] iArr2 = {iArr[0] + 1, iArr[1] + 1};
        sliceHeader.pred_weight_table.luma_log2_weight_denom = CAVLCReader.readUE(bitReader, "SH: luma_log2_weight_denom");
        if (seqParameterSet.chroma_format_idc != ColorSpace.MONO) {
            sliceHeader.pred_weight_table.chroma_log2_weight_denom = CAVLCReader.readUE(bitReader, "SH: chroma_log2_weight_denom");
        }
        PredictionWeightTable predictionWeightTable = sliceHeader.pred_weight_table;
        int i = 1 << predictionWeightTable.luma_log2_weight_denom;
        int i2 = 1 << predictionWeightTable.chroma_log2_weight_denom;
        for (int i3 = 0; i3 < 2; i3++) {
            PredictionWeightTable predictionWeightTable2 = sliceHeader.pred_weight_table;
            predictionWeightTable2.luma_weight[i3] = new int[iArr2[i3]];
            predictionWeightTable2.luma_offset[i3] = new int[iArr2[i3]];
            predictionWeightTable2.chroma_weight[i3] = (int[][]) Array.newInstance(cls, new int[]{2, iArr2[i3]});
            sliceHeader.pred_weight_table.chroma_offset[i3] = (int[][]) Array.newInstance(cls, new int[]{2, iArr2[i3]});
            for (int i4 = 0; i4 < iArr2[i3]; i4++) {
                PredictionWeightTable predictionWeightTable3 = sliceHeader.pred_weight_table;
                predictionWeightTable3.luma_weight[i3][i4] = i;
                predictionWeightTable3.luma_offset[i3][i4] = 0;
                int[][][] iArr3 = predictionWeightTable3.chroma_weight;
                iArr3[i3][0][i4] = i2;
                int[][][] iArr4 = predictionWeightTable3.chroma_offset;
                iArr4[i3][0][i4] = 0;
                iArr3[i3][1][i4] = i2;
                iArr4[i3][1][i4] = 0;
            }
        }
        readWeightOffset(seqParameterSet, pictureParameterSet, sliceHeader, bitReader, iArr2, 0);
        if (sliceHeader.slice_type == SliceType.B) {
            readWeightOffset(seqParameterSet, pictureParameterSet, sliceHeader, bitReader, iArr2, 1);
        }
    }

    private static void readRefPicListReordering(SliceHeader sliceHeader, BitReader bitReader) {
        sliceHeader.refPicReordering = new int[2][][];
        if (sliceHeader.slice_type.isInter() && CAVLCReader.readBool(bitReader, "SH: ref_pic_list_reordering_flag_l0")) {
            sliceHeader.refPicReordering[0] = readReorderingEntries(bitReader);
        }
        if (sliceHeader.slice_type == SliceType.B && CAVLCReader.readBool(bitReader, "SH: ref_pic_list_reordering_flag_l1")) {
            sliceHeader.refPicReordering[1] = readReorderingEntries(bitReader);
        }
    }

    private static int[][] readReorderingEntries(BitReader bitReader) {
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        while (true) {
            int readUE = CAVLCReader.readUE(bitReader, "SH: reordering_of_pic_nums_idc");
            if (readUE == 3) {
                return new int[][]{intArrayList.toArray(), intArrayList2.toArray()};
            }
            intArrayList.add(readUE);
            intArrayList2.add(CAVLCReader.readUE(bitReader, "SH: abs_diff_pic_num_minus1"));
        }
    }

    private static void readWeightOffset(SeqParameterSet seqParameterSet, PictureParameterSet pictureParameterSet, SliceHeader sliceHeader, BitReader bitReader, int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr[i]; i2++) {
            String str = "SH: offset";
            String str2 = "SH: weight";
            if (CAVLCReader.readBool(bitReader, "SH: luma_weight_l0_flag")) {
                sliceHeader.pred_weight_table.luma_weight[i][i2] = CAVLCReader.readSE(bitReader, str2);
                sliceHeader.pred_weight_table.luma_offset[i][i2] = CAVLCReader.readSE(bitReader, str);
            }
            if (seqParameterSet.chroma_format_idc != ColorSpace.MONO && CAVLCReader.readBool(bitReader, "SH: chroma_weight_l0_flag")) {
                sliceHeader.pred_weight_table.chroma_weight[i][0][i2] = CAVLCReader.readSE(bitReader, str2);
                sliceHeader.pred_weight_table.chroma_offset[i][0][i2] = CAVLCReader.readSE(bitReader, str);
                sliceHeader.pred_weight_table.chroma_weight[i][1][i2] = CAVLCReader.readSE(bitReader, str2);
                sliceHeader.pred_weight_table.chroma_offset[i][1][i2] = CAVLCReader.readSE(bitReader, str);
            }
        }
    }

    public SliceHeader readPart1(BitReader bitReader) {
        SliceHeader sliceHeader = new SliceHeader();
        sliceHeader.first_mb_in_slice = CAVLCReader.readUE(bitReader, "SH: first_mb_in_slice");
        int readUE = CAVLCReader.readUE(bitReader, "SH: slice_type");
        sliceHeader.slice_type = SliceType.fromValue(readUE % 5);
        sliceHeader.slice_type_restr = readUE / 5 > 0;
        sliceHeader.pic_parameter_set_id = CAVLCReader.readUE(bitReader, "SH: pic_parameter_set_id");
        return sliceHeader;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        if (r0 != org.jcodec.codecs.h264.p552io.model.SliceType.f44748SP) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r5.slice_type == org.jcodec.codecs.h264.p552io.model.SliceType.f44744B) goto L_0x00ea;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jcodec.codecs.h264.p552io.model.SliceHeader readPart2(org.jcodec.codecs.h264.p552io.model.SliceHeader r5, org.jcodec.codecs.h264.p552io.model.NALUnit r6, org.jcodec.codecs.h264.p552io.model.SeqParameterSet r7, org.jcodec.codecs.h264.p552io.model.PictureParameterSet r8, org.jcodec.common.p554io.BitReader r9) {
        /*
            r4 = this;
            r5.pps = r8
            r5.sps = r7
            int r0 = r7.log2_max_frame_num_minus4
            int r0 = r0 + 4
            java.lang.String r1 = "SH: frame_num"
            int r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readU(r9, r0, r1)
            r5.frame_num = r0
            boolean r0 = r7.frame_mbs_only_flag
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "SH: field_pic_flag"
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r0)
            r5.field_pic_flag = r0
            boolean r0 = r5.field_pic_flag
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "SH: bottom_field_flag"
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r0)
            r5.bottom_field_flag = r0
        L_0x0028:
            org.jcodec.codecs.h264.io.model.NALUnitType r0 = r6.type
            org.jcodec.codecs.h264.io.model.NALUnitType r1 = org.jcodec.codecs.h264.p552io.model.NALUnitType.IDR_SLICE
            if (r0 != r1) goto L_0x0036
            java.lang.String r0 = "SH: idr_pic_id"
            int r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r0)
            r5.idr_pic_id = r0
        L_0x0036:
            int r0 = r7.pic_order_cnt_type
            if (r0 != 0) goto L_0x0056
            int r0 = r7.log2_max_pic_order_cnt_lsb_minus4
            int r0 = r0 + 4
            java.lang.String r1 = "SH: pic_order_cnt_lsb"
            int r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readU(r9, r0, r1)
            r5.pic_order_cnt_lsb = r0
            boolean r0 = r8.pic_order_present_flag
            if (r0 == 0) goto L_0x0056
            boolean r0 = r7.field_pic_flag
            if (r0 != 0) goto L_0x0056
            java.lang.String r0 = "SH: delta_pic_order_cnt_bottom"
            int r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r0)
            r5.delta_pic_order_cnt_bottom = r0
        L_0x0056:
            r0 = 2
            int[] r0 = new int[r0]
            r5.delta_pic_order_cnt = r0
            int r0 = r7.pic_order_cnt_type
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0081
            boolean r0 = r7.delta_pic_order_always_zero_flag
            if (r0 != 0) goto L_0x0081
            int[] r0 = r5.delta_pic_order_cnt
            java.lang.String r3 = "SH: delta_pic_order_cnt[0]"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r3)
            r0[r1] = r3
            boolean r0 = r8.pic_order_present_flag
            if (r0 == 0) goto L_0x0081
            boolean r0 = r7.field_pic_flag
            if (r0 != 0) goto L_0x0081
            int[] r0 = r5.delta_pic_order_cnt
            java.lang.String r3 = "SH: delta_pic_order_cnt[1]"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r3)
            r0[r2] = r3
        L_0x0081:
            boolean r0 = r8.redundant_pic_cnt_present_flag
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "SH: redundant_pic_cnt"
            int r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r0)
            r5.redundant_pic_cnt = r0
        L_0x008d:
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r0 != r3) goto L_0x009b
            java.lang.String r0 = "SH: direct_spatial_mv_pred_flag"
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r0)
            r5.direct_spatial_mv_pred_flag = r0
        L_0x009b:
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            if (r0 == r3) goto L_0x00a9
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r0 == r3) goto L_0x00a9
            org.jcodec.codecs.h264.io.model.SliceType r3 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r0 != r3) goto L_0x00cf
        L_0x00a9:
            java.lang.String r0 = "SH: num_ref_idx_active_override_flag"
            boolean r0 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r0)
            r5.num_ref_idx_active_override_flag = r0
            boolean r0 = r5.num_ref_idx_active_override_flag
            if (r0 == 0) goto L_0x00cf
            int[] r0 = r5.num_ref_idx_active_minus1
            java.lang.String r3 = "SH: num_ref_idx_l0_active_minus1"
            int r3 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r3)
            r0[r1] = r3
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r0 != r1) goto L_0x00cf
            int[] r0 = r5.num_ref_idx_active_minus1
            java.lang.String r1 = "SH: num_ref_idx_l1_active_minus1"
            int r1 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r1)
            r0[r2] = r1
        L_0x00cf:
            readRefPicListReordering(r5, r9)
            boolean r0 = r8.weighted_pred_flag
            if (r0 == 0) goto L_0x00e0
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            if (r0 == r1) goto L_0x00ea
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r0 == r1) goto L_0x00ea
        L_0x00e0:
            int r0 = r8.weighted_bipred_idc
            if (r0 != r2) goto L_0x00ed
            org.jcodec.codecs.h264.io.model.SliceType r0 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r1 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r0 != r1) goto L_0x00ed
        L_0x00ea:
            readPredWeightTable(r7, r8, r5, r9)
        L_0x00ed:
            int r0 = r6.nal_ref_idc
            if (r0 == 0) goto L_0x00f4
            readDecoderPicMarking(r6, r5, r9)
        L_0x00f4:
            boolean r6 = r8.entropy_coding_mode_flag
            if (r6 == 0) goto L_0x0108
            org.jcodec.codecs.h264.io.model.SliceType r6 = r5.slice_type
            boolean r6 = r6.isInter()
            if (r6 == 0) goto L_0x0108
            java.lang.String r6 = "SH: cabac_init_idc"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r6)
            r5.cabac_init_idc = r6
        L_0x0108:
            java.lang.String r6 = "SH: slice_qp_delta"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r6)
            r5.slice_qp_delta = r6
            org.jcodec.codecs.h264.io.model.SliceType r6 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r6 == r0) goto L_0x011a
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.p552io.model.SliceType.SI
            if (r6 != r0) goto L_0x0130
        L_0x011a:
            org.jcodec.codecs.h264.io.model.SliceType r6 = r5.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r0 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r6 != r0) goto L_0x0128
            java.lang.String r6 = "SH: sp_for_switch_flag"
            boolean r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readBool(r9, r6)
            r5.sp_for_switch_flag = r6
        L_0x0128:
            java.lang.String r6 = "SH: slice_qs_delta"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r6)
            r5.slice_qs_delta = r6
        L_0x0130:
            boolean r6 = r8.deblocking_filter_control_present_flag
            if (r6 == 0) goto L_0x0150
            java.lang.String r6 = "SH: disable_deblocking_filter_idc"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readUE(r9, r6)
            r5.disable_deblocking_filter_idc = r6
            int r6 = r5.disable_deblocking_filter_idc
            if (r6 == r2) goto L_0x0150
            java.lang.String r6 = "SH: slice_alpha_c0_offset_div2"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r6)
            r5.slice_alpha_c0_offset_div2 = r6
            java.lang.String r6 = "SH: slice_beta_offset_div2"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readSE(r9, r6)
            r5.slice_beta_offset_div2 = r6
        L_0x0150:
            int r6 = r8.num_slice_groups_minus1
            if (r6 <= 0) goto L_0x0187
            int r6 = r8.slice_group_map_type
            r0 = 3
            if (r6 < r0) goto L_0x0187
            r0 = 5
            if (r6 > r0) goto L_0x0187
            int r6 = org.jcodec.codecs.h264.H264Utils.getPicHeightInMbs(r7)
            int r0 = r7.pic_width_in_mbs_minus1
            int r0 = r0 + r2
            int r6 = r6 * r0
            int r0 = r8.slice_group_change_rate_minus1
            int r0 = r0 + r2
            int r6 = r6 / r0
            int r0 = org.jcodec.codecs.h264.H264Utils.getPicHeightInMbs(r7)
            int r7 = r7.pic_width_in_mbs_minus1
            int r7 = r7 + r2
            int r0 = r0 * r7
            int r7 = r8.slice_group_change_rate_minus1
            int r7 = r7 + r2
            int r0 = r0 % r7
            if (r0 <= 0) goto L_0x017a
            int r6 = r6 + 1
        L_0x017a:
            int r6 = r6 + r2
            int r6 = CeilLog2(r6)
            java.lang.String r7 = "SH: slice_group_change_cycle"
            int r6 = org.jcodec.codecs.h264.decode.CAVLCReader.readU(r9, r6, r7)
            r5.slice_group_change_cycle = r6
        L_0x0187:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.decode.SliceHeaderReader.readPart2(org.jcodec.codecs.h264.io.model.SliceHeader, org.jcodec.codecs.h264.io.model.NALUnit, org.jcodec.codecs.h264.io.model.SeqParameterSet, org.jcodec.codecs.h264.io.model.PictureParameterSet, org.jcodec.common.io.BitReader):org.jcodec.codecs.h264.io.model.SliceHeader");
    }
}
