package org.jcodec.codecs.h264.p552io.write;

import org.jcodec.codecs.h264.p552io.model.RefPicMarking;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType;
import org.jcodec.codecs.h264.p552io.model.RefPicMarking.Instruction;
import org.jcodec.codecs.h264.p552io.model.RefPicMarkingIDR;
import org.jcodec.codecs.h264.p552io.model.SeqParameterSet;
import org.jcodec.codecs.h264.p552io.model.SliceHeader;
import org.jcodec.codecs.h264.p552io.model.SliceType;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.p554io.BitWriter;

/* renamed from: org.jcodec.codecs.h264.io.write.SliceHeaderWriter */
public class SliceHeaderWriter {

    /* renamed from: org.jcodec.codecs.h264.io.write.SliceHeaderWriter$a */
    static /* synthetic */ class C15527a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44750a = new int[InstrType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType[] r0 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44750a = r0
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.REMOVE_SHORT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.REMOVE_LONG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.CONVERT_INTO_LONG     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.TRUNK_LONG     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.CLEAR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f44750a     // Catch:{ NoSuchFieldError -> 0x004b }
                org.jcodec.codecs.h264.io.model.RefPicMarking$InstrType r1 = org.jcodec.codecs.h264.p552io.model.RefPicMarking.InstrType.MARK_LONG     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.write.SliceHeaderWriter.C15527a.<clinit>():void");
        }
    }

    private static int CeilLog2(int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (i2 != 0) {
            i2 >>= 1;
            i3++;
        }
        return i3;
    }

    private void writeDecRefPicMarking(SliceHeader sliceHeader, boolean z, BitWriter bitWriter) {
        if (z) {
            RefPicMarkingIDR refPicMarkingIDR = sliceHeader.refPicMarkingIDR;
            CAVLCWriter.writeBool(bitWriter, refPicMarkingIDR.isDiscardDecodedPics(), "SH: no_output_of_prior_pics_flag");
            CAVLCWriter.writeBool(bitWriter, refPicMarkingIDR.isUseForlongTerm(), "SH: long_term_reference_flag");
            return;
        }
        CAVLCWriter.writeBool(bitWriter, sliceHeader.refPicMarkingNonIDR != null, "SH: adaptive_ref_pic_marking_mode_flag");
        RefPicMarking refPicMarking = sliceHeader.refPicMarkingNonIDR;
        if (refPicMarking != null) {
            Instruction[] instructions = refPicMarking.getInstructions();
            int length = instructions.length;
            int i = 0;
            while (true) {
                String str = "SH: memory_management_control_operation";
                if (i < length) {
                    Instruction instruction = instructions[i];
                    String str2 = "SH: long_term_frame_idx";
                    String str3 = "SH: difference_of_pic_nums_minus1";
                    switch (C15527a.f44750a[instruction.getType().ordinal()]) {
                        case 1:
                            CAVLCWriter.writeUE(bitWriter, 1, str);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg1() - 1, str3);
                            break;
                        case 2:
                            CAVLCWriter.writeUE(bitWriter, 2, str);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg1(), "SH: long_term_pic_num");
                            break;
                        case 3:
                            CAVLCWriter.writeUE(bitWriter, 3, str);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg1() - 1, str3);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg2(), str2);
                            break;
                        case 4:
                            CAVLCWriter.writeUE(bitWriter, 4, str);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg1() + 1, "SH: max_long_term_frame_idx_plus1");
                            break;
                        case 5:
                            CAVLCWriter.writeUE(bitWriter, 5, str);
                            break;
                        case 6:
                            CAVLCWriter.writeUE(bitWriter, 6, str);
                            CAVLCWriter.writeUE(bitWriter, instruction.getArg1(), str2);
                            break;
                    }
                    i++;
                } else {
                    CAVLCWriter.writeUE(bitWriter, 0, str);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void writeOffsetWeight(org.jcodec.codecs.h264.p552io.model.SliceHeader r11, org.jcodec.common.p554io.BitWriter r12, int r13) {
        /*
            r10 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r11.sps
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r1 = r11.pred_weight_table
            int r2 = r1.luma_log2_weight_denom
            r3 = 1
            int r2 = r3 << r2
            int r1 = r1.chroma_log2_weight_denom
            int r1 = r3 << r1
            r4 = 0
            r5 = 0
        L_0x000f:
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r6 = r11.pred_weight_table
            int[][] r7 = r6.luma_weight
            r8 = r7[r13]
            int r8 = r8.length
            if (r5 >= r8) goto L_0x00e7
            r7 = r7[r13]
            r7 = r7[r5]
            if (r7 != r2) goto L_0x0029
            int[][] r6 = r6.luma_offset
            r6 = r6[r13]
            r6 = r6[r5]
            if (r6 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r6 = 0
            goto L_0x002a
        L_0x0029:
            r6 = 1
        L_0x002a:
            java.lang.String r7 = "SH: luma_weight_l0_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r12, r6, r7)
            if (r6 == 0) goto L_0x0069
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r6 = r11.pred_weight_table
            int[][] r6 = r6.luma_weight
            r6 = r6[r13]
            r6 = r6[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SH: luma_weight_l"
            r7.append(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r12, r6, r7)
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r6 = r11.pred_weight_table
            int[][] r6 = r6.luma_offset
            r6 = r6[r13]
            r6 = r6[r5]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "SH: luma_offset_l"
            r7.append(r8)
            r7.append(r13)
            java.lang.String r7 = r7.toString()
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r12, r6, r7)
        L_0x0069:
            org.jcodec.common.model.ColorSpace r6 = r0.chroma_format_idc
            org.jcodec.common.model.ColorSpace r7 = org.jcodec.common.model.ColorSpace.MONO
            if (r6 == r7) goto L_0x00e3
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r6 = r11.pred_weight_table
            int[][][] r7 = r6.chroma_weight
            r8 = r7[r13]
            r8 = r8[r4]
            r8 = r8[r5]
            if (r8 != r1) goto L_0x0098
            int[][][] r6 = r6.chroma_offset
            r8 = r6[r13]
            r8 = r8[r4]
            r8 = r8[r5]
            if (r8 != 0) goto L_0x0098
            r7 = r7[r13]
            r7 = r7[r3]
            r7 = r7[r5]
            if (r7 != r1) goto L_0x0098
            r6 = r6[r13]
            r6 = r6[r3]
            r6 = r6[r5]
            if (r6 == 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r6 = 0
            goto L_0x0099
        L_0x0098:
            r6 = 1
        L_0x0099:
            java.lang.String r7 = "SH: chroma_weight_l0_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r12, r6, r7)
            if (r6 == 0) goto L_0x00e3
            r6 = 0
        L_0x00a1:
            r7 = 2
            if (r6 >= r7) goto L_0x00e3
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r7 = r11.pred_weight_table
            int[][][] r7 = r7.chroma_weight
            r7 = r7[r13]
            r7 = r7[r6]
            r7 = r7[r5]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "SH: chroma_weight_l"
            r8.append(r9)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r12, r7, r8)
            org.jcodec.codecs.h264.io.model.PredictionWeightTable r7 = r11.pred_weight_table
            int[][][] r7 = r7.chroma_offset
            r7 = r7[r13]
            r7 = r7[r6]
            r7 = r7[r5]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "SH: chroma_offset_l"
            r8.append(r9)
            r8.append(r13)
            java.lang.String r8 = r8.toString()
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r12, r7, r8)
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x00e3:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x00e7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.write.SliceHeaderWriter.writeOffsetWeight(org.jcodec.codecs.h264.io.model.SliceHeader, org.jcodec.common.io.BitWriter, int):void");
    }

    private void writePredWeightTable(SliceHeader sliceHeader, BitWriter bitWriter) {
        SeqParameterSet seqParameterSet = sliceHeader.sps;
        CAVLCWriter.writeUE(bitWriter, sliceHeader.pred_weight_table.luma_log2_weight_denom, "SH: luma_log2_weight_denom");
        if (seqParameterSet.chroma_format_idc != ColorSpace.MONO) {
            CAVLCWriter.writeUE(bitWriter, sliceHeader.pred_weight_table.chroma_log2_weight_denom, "SH: chroma_log2_weight_denom");
        }
        writeOffsetWeight(sliceHeader, bitWriter, 0);
        if (sliceHeader.slice_type == SliceType.B) {
            writeOffsetWeight(sliceHeader, bitWriter, 1);
        }
    }

    private void writeRefPicListReordering(SliceHeader sliceHeader, BitWriter bitWriter) {
        boolean z = false;
        if (sliceHeader.slice_type.isInter()) {
            CAVLCWriter.writeBool(bitWriter, sliceHeader.refPicReordering[0] != null, "SH: ref_pic_list_reordering_flag_l0");
            writeReorderingList(sliceHeader.refPicReordering[0], bitWriter);
        }
        if (sliceHeader.slice_type == SliceType.B) {
            if (sliceHeader.refPicReordering[1] != null) {
                z = true;
            }
            CAVLCWriter.writeBool(bitWriter, z, "SH: ref_pic_list_reordering_flag_l1");
            writeReorderingList(sliceHeader.refPicReordering[1], bitWriter);
        }
    }

    private void writeReorderingList(int[][] iArr, BitWriter bitWriter) {
        if (iArr != null) {
            int i = 0;
            while (true) {
                String str = "SH: reordering_of_pic_nums_idc";
                if (i < iArr[0].length) {
                    CAVLCWriter.writeUE(bitWriter, iArr[0][i], str);
                    CAVLCWriter.writeUE(bitWriter, iArr[1][i], "SH: abs_diff_pic_num_minus1");
                    i++;
                } else {
                    CAVLCWriter.writeUE(bitWriter, 3, str);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r2 != org.jcodec.codecs.h264.p552io.model.SliceType.f44748SP) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        if (r8.slice_type == org.jcodec.codecs.h264.p552io.model.SliceType.f44744B) goto L_0x00f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void write(org.jcodec.codecs.h264.p552io.model.SliceHeader r8, boolean r9, int r10, org.jcodec.common.p554io.BitWriter r11) {
        /*
            r7 = this;
            org.jcodec.codecs.h264.io.model.SeqParameterSet r0 = r8.sps
            org.jcodec.codecs.h264.io.model.PictureParameterSet r1 = r8.pps
            int r2 = r8.first_mb_in_slice
            java.lang.String r3 = "SH: first_mb_in_slice"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r3)
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            int r2 = r2.ordinal()
            boolean r3 = r8.slice_type_restr
            r4 = 5
            r5 = 0
            if (r3 == 0) goto L_0x0019
            r3 = 5
            goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r2 = r2 + r3
            java.lang.String r3 = "SH: slice_type"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r3)
            int r2 = r8.pic_parameter_set_id
            java.lang.String r3 = "SH: pic_parameter_set_id"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r3)
            int r2 = r8.frame_num
            int r3 = r0.log2_max_frame_num_minus4
            int r3 = r3 + 4
            java.lang.String r6 = "SH: frame_num"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeU(r11, r2, r3, r6)
            boolean r2 = r0.frame_mbs_only_flag
            if (r2 != 0) goto L_0x0048
            boolean r2 = r8.field_pic_flag
            java.lang.String r3 = "SH: field_pic_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r11, r2, r3)
            boolean r2 = r8.field_pic_flag
            if (r2 == 0) goto L_0x0048
            boolean r2 = r8.bottom_field_flag
            java.lang.String r3 = "SH: bottom_field_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r11, r2, r3)
        L_0x0048:
            if (r9 == 0) goto L_0x0051
            int r2 = r8.idr_pic_id
            java.lang.String r3 = "SH: idr_pic_id"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r3)
        L_0x0051:
            int r2 = r0.pic_order_cnt_type
            if (r2 != 0) goto L_0x006d
            int r2 = r8.pic_order_cnt_lsb
            int r3 = r0.log2_max_pic_order_cnt_lsb_minus4
            int r3 = r3 + 4
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeU(r11, r2, r3)
            boolean r2 = r1.pic_order_present_flag
            if (r2 == 0) goto L_0x006d
            boolean r2 = r0.field_pic_flag
            if (r2 != 0) goto L_0x006d
            int r2 = r8.delta_pic_order_cnt_bottom
            java.lang.String r3 = "SH: delta_pic_order_cnt_bottom"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r2, r3)
        L_0x006d:
            int r2 = r0.pic_order_cnt_type
            r3 = 1
            if (r2 != r3) goto L_0x008e
            boolean r2 = r0.delta_pic_order_always_zero_flag
            if (r2 != 0) goto L_0x008e
            int[] r2 = r8.delta_pic_order_cnt
            r2 = r2[r5]
            java.lang.String r6 = "SH: delta_pic_order_cnt"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r2, r6)
            boolean r2 = r1.pic_order_present_flag
            if (r2 == 0) goto L_0x008e
            boolean r2 = r0.field_pic_flag
            if (r2 != 0) goto L_0x008e
            int[] r2 = r8.delta_pic_order_cnt
            r2 = r2[r3]
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r2, r6)
        L_0x008e:
            boolean r2 = r1.redundant_pic_cnt_present_flag
            if (r2 == 0) goto L_0x0099
            int r2 = r8.redundant_pic_cnt
            java.lang.String r6 = "SH: redundant_pic_cnt"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r6)
        L_0x0099:
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r6 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r2 != r6) goto L_0x00a6
            boolean r2 = r8.direct_spatial_mv_pred_flag
            java.lang.String r6 = "SH: direct_spatial_mv_pred_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r11, r2, r6)
        L_0x00a6:
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r6 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            if (r2 == r6) goto L_0x00b4
            org.jcodec.codecs.h264.io.model.SliceType r6 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r2 == r6) goto L_0x00b4
            org.jcodec.codecs.h264.io.model.SliceType r6 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r2 != r6) goto L_0x00d7
        L_0x00b4:
            boolean r2 = r8.num_ref_idx_active_override_flag
            java.lang.String r6 = "SH: num_ref_idx_active_override_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r11, r2, r6)
            boolean r2 = r8.num_ref_idx_active_override_flag
            if (r2 == 0) goto L_0x00d7
            int[] r2 = r8.num_ref_idx_active_minus1
            r2 = r2[r5]
            java.lang.String r5 = "SH: num_ref_idx_l0_active_minus1"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r5)
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r2 != r5) goto L_0x00d7
            int[] r2 = r8.num_ref_idx_active_minus1
            r2 = r2[r3]
            java.lang.String r5 = "SH: num_ref_idx_l1_active_minus1"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r2, r5)
        L_0x00d7:
            r7.writeRefPicListReordering(r8, r11)
            boolean r2 = r1.weighted_pred_flag
            if (r2 == 0) goto L_0x00e8
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.p552io.model.SliceType.P
            if (r2 == r5) goto L_0x00f2
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r2 == r5) goto L_0x00f2
        L_0x00e8:
            int r2 = r1.weighted_bipred_idc
            if (r2 != r3) goto L_0x00f5
            org.jcodec.codecs.h264.io.model.SliceType r2 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r5 = org.jcodec.codecs.h264.p552io.model.SliceType.B
            if (r2 != r5) goto L_0x00f5
        L_0x00f2:
            r7.writePredWeightTable(r8, r11)
        L_0x00f5:
            if (r10 == 0) goto L_0x00fa
            r7.writeDecRefPicMarking(r8, r9, r11)
        L_0x00fa:
            boolean r9 = r1.entropy_coding_mode_flag
            if (r9 == 0) goto L_0x010d
            org.jcodec.codecs.h264.io.model.SliceType r9 = r8.slice_type
            boolean r9 = r9.isInter()
            if (r9 == 0) goto L_0x010d
            int r9 = r8.cabac_init_idc
            java.lang.String r10 = "SH: cabac_init_idc"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r9, r10)
        L_0x010d:
            int r9 = r8.slice_qp_delta
            java.lang.String r10 = "SH: slice_qp_delta"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r9, r10)
            org.jcodec.codecs.h264.io.model.SliceType r9 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r10 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r9 == r10) goto L_0x011e
            org.jcodec.codecs.h264.io.model.SliceType r10 = org.jcodec.codecs.h264.p552io.model.SliceType.SI
            if (r9 != r10) goto L_0x0132
        L_0x011e:
            org.jcodec.codecs.h264.io.model.SliceType r9 = r8.slice_type
            org.jcodec.codecs.h264.io.model.SliceType r10 = org.jcodec.codecs.h264.p552io.model.SliceType.SP
            if (r9 != r10) goto L_0x012b
            boolean r9 = r8.sp_for_switch_flag
            java.lang.String r10 = "SH: sp_for_switch_flag"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeBool(r11, r9, r10)
        L_0x012b:
            int r9 = r8.slice_qs_delta
            java.lang.String r10 = "SH: slice_qs_delta"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r9, r10)
        L_0x0132:
            boolean r9 = r1.deblocking_filter_control_present_flag
            if (r9 == 0) goto L_0x014f
            int r9 = r8.disable_deblocking_filter_idc
            java.lang.String r10 = "SH: disable_deblocking_filter_idc"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeUE(r11, r9, r10)
            int r9 = r8.disable_deblocking_filter_idc
            if (r9 == r3) goto L_0x014f
            int r9 = r8.slice_alpha_c0_offset_div2
            java.lang.String r10 = "SH: slice_alpha_c0_offset_div2"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r9, r10)
            int r9 = r8.slice_beta_offset_div2
            java.lang.String r10 = "SH: slice_beta_offset_div2"
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeSE(r11, r9, r10)
        L_0x014f:
            int r9 = r1.num_slice_groups_minus1
            if (r9 <= 0) goto L_0x017d
            int r9 = r1.slice_group_map_type
            r10 = 3
            if (r9 < r10) goto L_0x017d
            if (r9 > r4) goto L_0x017d
            int r9 = r0.pic_height_in_map_units_minus1
            int r10 = r9 + 1
            int r0 = r0.pic_width_in_mbs_minus1
            int r2 = r0 + 1
            int r10 = r10 * r2
            int r1 = r1.slice_group_change_rate_minus1
            int r2 = r1 + 1
            int r10 = r10 / r2
            int r9 = r9 + r3
            int r0 = r0 + r3
            int r9 = r9 * r0
            int r1 = r1 + r3
            int r9 = r9 % r1
            if (r9 <= 0) goto L_0x0173
            int r10 = r10 + 1
        L_0x0173:
            int r10 = r10 + r3
            int r9 = CeilLog2(r10)
            int r8 = r8.slice_group_change_cycle
            org.jcodec.codecs.h264.p552io.write.CAVLCWriter.writeU(r11, r8, r9)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.write.SliceHeaderWriter.write(org.jcodec.codecs.h264.io.model.SliceHeader, boolean, int, org.jcodec.common.io.BitWriter):void");
    }
}
