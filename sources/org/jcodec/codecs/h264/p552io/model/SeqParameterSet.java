package org.jcodec.codecs.h264.p552io.model;

import java.nio.ByteBuffer;
import org.jcodec.codecs.h264.decode.CAVLCReader;
import org.jcodec.codecs.h264.p552io.model.VUIParameters.BitstreamRestriction;
import org.jcodec.codecs.h264.p552io.write.CAVLCWriter;
import org.jcodec.common.model.ColorSpace;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

/* renamed from: org.jcodec.codecs.h264.io.model.SeqParameterSet */
public class SeqParameterSet {
    public int bit_depth_chroma_minus8;
    public int bit_depth_luma_minus8;
    public ColorSpace chroma_format_idc;
    public boolean constraint_set_0_flag;
    public boolean constraint_set_1_flag;
    public boolean constraint_set_2_flag;
    public boolean constraint_set_3_flag;
    public boolean delta_pic_order_always_zero_flag;
    public boolean direct_8x8_inference_flag;
    public boolean field_pic_flag;
    public int frame_crop_bottom_offset;
    public int frame_crop_left_offset;
    public int frame_crop_right_offset;
    public int frame_crop_top_offset;
    public boolean frame_cropping_flag;
    public boolean frame_mbs_only_flag;
    public boolean gaps_in_frame_num_value_allowed_flag;
    public int level_idc;
    public int log2_max_frame_num_minus4;
    public int log2_max_pic_order_cnt_lsb_minus4;
    public boolean mb_adaptive_frame_field_flag;
    public int num_ref_frames;
    public int num_ref_frames_in_pic_order_cnt_cycle;
    public int[] offsetForRefFrame;
    public int offset_for_non_ref_pic;
    public int offset_for_top_to_bottom_field;
    public int pic_height_in_map_units_minus1;
    public int pic_order_cnt_type;
    public int pic_width_in_mbs_minus1;
    public int profile_idc;
    public boolean qpprime_y_zero_transform_bypass_flag;
    public boolean residual_color_transform_flag;
    public ScalingMatrix scalingMatrix;
    public int seq_parameter_set_id;
    public VUIParameters vuiParams;

    /* renamed from: org.jcodec.codecs.h264.io.model.SeqParameterSet$a */
    static /* synthetic */ class C15526a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44743a = new int[ColorSpace.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.jcodec.common.model.ColorSpace[] r0 = org.jcodec.common.model.ColorSpace.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44743a = r0
                int[] r0 = f44743a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.MONO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44743a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV420     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44743a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV422     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f44743a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.common.model.ColorSpace r1 = org.jcodec.common.model.ColorSpace.YUV444     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.h264.p552io.model.SeqParameterSet.C15526a.<clinit>():void");
        }
    }

    public static int fromColor(ColorSpace colorSpace) {
        int i = C15526a.f44743a[colorSpace.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        throw new RuntimeException("Colorspace not supported");
    }

    public static ColorSpace getColor(int i) {
        if (i == 0) {
            return ColorSpace.MONO;
        }
        if (i == 1) {
            return ColorSpace.YUV420;
        }
        if (i == 2) {
            return ColorSpace.YUV422;
        }
        if (i == 3) {
            return ColorSpace.YUV444;
        }
        throw new RuntimeException("Colorspace not supported");
    }

    public static SeqParameterSet read(ByteBuffer byteBuffer) {
        BitReader bitReader = new BitReader(byteBuffer);
        SeqParameterSet seqParameterSet = new SeqParameterSet();
        seqParameterSet.profile_idc = CAVLCReader.readNBit(bitReader, 8, "SPS: profile_idc");
        seqParameterSet.constraint_set_0_flag = CAVLCReader.readBool(bitReader, "SPS: constraint_set_0_flag");
        seqParameterSet.constraint_set_1_flag = CAVLCReader.readBool(bitReader, "SPS: constraint_set_1_flag");
        seqParameterSet.constraint_set_2_flag = CAVLCReader.readBool(bitReader, "SPS: constraint_set_2_flag");
        seqParameterSet.constraint_set_3_flag = CAVLCReader.readBool(bitReader, "SPS: constraint_set_3_flag");
        CAVLCReader.readNBit(bitReader, 4, "SPS: reserved_zero_4bits");
        seqParameterSet.level_idc = CAVLCReader.readNBit(bitReader, 8, "SPS: level_idc");
        seqParameterSet.seq_parameter_set_id = CAVLCReader.readUE(bitReader, "SPS: seq_parameter_set_id");
        int i = seqParameterSet.profile_idc;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            seqParameterSet.chroma_format_idc = getColor(CAVLCReader.readUE(bitReader, "SPS: chroma_format_idc"));
            if (seqParameterSet.chroma_format_idc == ColorSpace.YUV444) {
                seqParameterSet.residual_color_transform_flag = CAVLCReader.readBool(bitReader, "SPS: residual_color_transform_flag");
            }
            seqParameterSet.bit_depth_luma_minus8 = CAVLCReader.readUE(bitReader, "SPS: bit_depth_luma_minus8");
            seqParameterSet.bit_depth_chroma_minus8 = CAVLCReader.readUE(bitReader, "SPS: bit_depth_chroma_minus8");
            seqParameterSet.qpprime_y_zero_transform_bypass_flag = CAVLCReader.readBool(bitReader, "SPS: qpprime_y_zero_transform_bypass_flag");
            if (CAVLCReader.readBool(bitReader, "SPS: seq_scaling_matrix_present_lag")) {
                readScalingListMatrix(bitReader, seqParameterSet);
            }
        } else {
            seqParameterSet.chroma_format_idc = ColorSpace.YUV420;
        }
        seqParameterSet.log2_max_frame_num_minus4 = CAVLCReader.readUE(bitReader, "SPS: log2_max_frame_num_minus4");
        seqParameterSet.pic_order_cnt_type = CAVLCReader.readUE(bitReader, "SPS: pic_order_cnt_type");
        int i2 = seqParameterSet.pic_order_cnt_type;
        if (i2 == 0) {
            seqParameterSet.log2_max_pic_order_cnt_lsb_minus4 = CAVLCReader.readUE(bitReader, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (i2 == 1) {
            seqParameterSet.delta_pic_order_always_zero_flag = CAVLCReader.readBool(bitReader, "SPS: delta_pic_order_always_zero_flag");
            seqParameterSet.offset_for_non_ref_pic = CAVLCReader.readSE(bitReader, "SPS: offset_for_non_ref_pic");
            seqParameterSet.offset_for_top_to_bottom_field = CAVLCReader.readSE(bitReader, "SPS: offset_for_top_to_bottom_field");
            seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle = CAVLCReader.readUE(bitReader, "SPS: num_ref_frames_in_pic_order_cnt_cycle");
            seqParameterSet.offsetForRefFrame = new int[seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle];
            for (int i3 = 0; i3 < seqParameterSet.num_ref_frames_in_pic_order_cnt_cycle; i3++) {
                int[] iArr = seqParameterSet.offsetForRefFrame;
                StringBuilder sb = new StringBuilder();
                sb.append("SPS: offsetForRefFrame [");
                sb.append(i3);
                sb.append("]");
                iArr[i3] = CAVLCReader.readSE(bitReader, sb.toString());
            }
        }
        seqParameterSet.num_ref_frames = CAVLCReader.readUE(bitReader, "SPS: num_ref_frames");
        seqParameterSet.gaps_in_frame_num_value_allowed_flag = CAVLCReader.readBool(bitReader, "SPS: gaps_in_frame_num_value_allowed_flag");
        seqParameterSet.pic_width_in_mbs_minus1 = CAVLCReader.readUE(bitReader, "SPS: pic_width_in_mbs_minus1");
        seqParameterSet.pic_height_in_map_units_minus1 = CAVLCReader.readUE(bitReader, "SPS: pic_height_in_map_units_minus1");
        seqParameterSet.frame_mbs_only_flag = CAVLCReader.readBool(bitReader, "SPS: frame_mbs_only_flag");
        if (!seqParameterSet.frame_mbs_only_flag) {
            seqParameterSet.mb_adaptive_frame_field_flag = CAVLCReader.readBool(bitReader, "SPS: mb_adaptive_frame_field_flag");
        }
        seqParameterSet.direct_8x8_inference_flag = CAVLCReader.readBool(bitReader, "SPS: direct_8x8_inference_flag");
        seqParameterSet.frame_cropping_flag = CAVLCReader.readBool(bitReader, "SPS: frame_cropping_flag");
        if (seqParameterSet.frame_cropping_flag) {
            seqParameterSet.frame_crop_left_offset = CAVLCReader.readUE(bitReader, "SPS: frame_crop_left_offset");
            seqParameterSet.frame_crop_right_offset = CAVLCReader.readUE(bitReader, "SPS: frame_crop_right_offset");
            seqParameterSet.frame_crop_top_offset = CAVLCReader.readUE(bitReader, "SPS: frame_crop_top_offset");
            seqParameterSet.frame_crop_bottom_offset = CAVLCReader.readUE(bitReader, "SPS: frame_crop_bottom_offset");
        }
        if (CAVLCReader.readBool(bitReader, "SPS: vui_parameters_present_flag")) {
            seqParameterSet.vuiParams = readVUIParameters(bitReader);
        }
        return seqParameterSet;
    }

    private static HRDParameters readHRDParameters(BitReader bitReader) {
        HRDParameters hRDParameters = new HRDParameters();
        hRDParameters.cpb_cnt_minus1 = CAVLCReader.readUE(bitReader, "SPS: cpb_cnt_minus1");
        hRDParameters.bit_rate_scale = CAVLCReader.readNBit(bitReader, 4, "HRD: bit_rate_scale");
        hRDParameters.cpb_size_scale = CAVLCReader.readNBit(bitReader, 4, "HRD: cpb_size_scale");
        int i = hRDParameters.cpb_cnt_minus1;
        hRDParameters.bit_rate_value_minus1 = new int[(i + 1)];
        hRDParameters.cpb_size_value_minus1 = new int[(i + 1)];
        hRDParameters.cbr_flag = new boolean[(i + 1)];
        for (int i2 = 0; i2 <= hRDParameters.cpb_cnt_minus1; i2++) {
            hRDParameters.bit_rate_value_minus1[i2] = CAVLCReader.readUE(bitReader, "HRD: bit_rate_value_minus1");
            hRDParameters.cpb_size_value_minus1[i2] = CAVLCReader.readUE(bitReader, "HRD: cpb_size_value_minus1");
            hRDParameters.cbr_flag[i2] = CAVLCReader.readBool(bitReader, "HRD: cbr_flag");
        }
        hRDParameters.initial_cpb_removal_delay_length_minus1 = CAVLCReader.readNBit(bitReader, 5, "HRD: initial_cpb_removal_delay_length_minus1");
        hRDParameters.cpb_removal_delay_length_minus1 = CAVLCReader.readNBit(bitReader, 5, "HRD: cpb_removal_delay_length_minus1");
        hRDParameters.dpb_output_delay_length_minus1 = CAVLCReader.readNBit(bitReader, 5, "HRD: dpb_output_delay_length_minus1");
        hRDParameters.time_offset_length = CAVLCReader.readNBit(bitReader, 5, "HRD: time_offset_length");
        return hRDParameters;
    }

    private static void readScalingListMatrix(BitReader bitReader, SeqParameterSet seqParameterSet) {
        seqParameterSet.scalingMatrix = new ScalingMatrix();
        for (int i = 0; i < 8; i++) {
            if (CAVLCReader.readBool(bitReader, "SPS: seqScalingListPresentFlag")) {
                ScalingMatrix scalingMatrix2 = seqParameterSet.scalingMatrix;
                scalingMatrix2.ScalingList4x4 = new ScalingList[8];
                scalingMatrix2.ScalingList8x8 = new ScalingList[8];
                if (i < 6) {
                    scalingMatrix2.ScalingList4x4[i] = ScalingList.read(bitReader, 16);
                } else {
                    scalingMatrix2.ScalingList8x8[i - 6] = ScalingList.read(bitReader, 64);
                }
            }
        }
    }

    private static VUIParameters readVUIParameters(BitReader bitReader) {
        VUIParameters vUIParameters = new VUIParameters();
        vUIParameters.aspect_ratio_info_present_flag = CAVLCReader.readBool(bitReader, "VUI: aspect_ratio_info_present_flag");
        if (vUIParameters.aspect_ratio_info_present_flag) {
            vUIParameters.aspect_ratio = AspectRatio.fromValue(CAVLCReader.readNBit(bitReader, 8, "VUI: aspect_ratio"));
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                vUIParameters.sar_width = CAVLCReader.readNBit(bitReader, 16, "VUI: sar_width");
                vUIParameters.sar_height = CAVLCReader.readNBit(bitReader, 16, "VUI: sar_height");
            }
        }
        vUIParameters.overscan_info_present_flag = CAVLCReader.readBool(bitReader, "VUI: overscan_info_present_flag");
        if (vUIParameters.overscan_info_present_flag) {
            vUIParameters.overscan_appropriate_flag = CAVLCReader.readBool(bitReader, "VUI: overscan_appropriate_flag");
        }
        vUIParameters.video_signal_type_present_flag = CAVLCReader.readBool(bitReader, "VUI: video_signal_type_present_flag");
        if (vUIParameters.video_signal_type_present_flag) {
            vUIParameters.video_format = CAVLCReader.readNBit(bitReader, 3, "VUI: video_format");
            vUIParameters.video_full_range_flag = CAVLCReader.readBool(bitReader, "VUI: video_full_range_flag");
            vUIParameters.colour_description_present_flag = CAVLCReader.readBool(bitReader, "VUI: colour_description_present_flag");
            if (vUIParameters.colour_description_present_flag) {
                vUIParameters.colour_primaries = CAVLCReader.readNBit(bitReader, 8, "VUI: colour_primaries");
                vUIParameters.transfer_characteristics = CAVLCReader.readNBit(bitReader, 8, "VUI: transfer_characteristics");
                vUIParameters.matrix_coefficients = CAVLCReader.readNBit(bitReader, 8, "VUI: matrix_coefficients");
            }
        }
        vUIParameters.chroma_loc_info_present_flag = CAVLCReader.readBool(bitReader, "VUI: chroma_loc_info_present_flag");
        if (vUIParameters.chroma_loc_info_present_flag) {
            vUIParameters.chroma_sample_loc_type_top_field = CAVLCReader.readUE(bitReader, "VUI chroma_sample_loc_type_top_field");
            vUIParameters.chroma_sample_loc_type_bottom_field = CAVLCReader.readUE(bitReader, "VUI chroma_sample_loc_type_bottom_field");
        }
        vUIParameters.timing_info_present_flag = CAVLCReader.readBool(bitReader, "VUI: timing_info_present_flag");
        if (vUIParameters.timing_info_present_flag) {
            vUIParameters.num_units_in_tick = CAVLCReader.readNBit(bitReader, 32, "VUI: num_units_in_tick");
            vUIParameters.time_scale = CAVLCReader.readNBit(bitReader, 32, "VUI: time_scale");
            vUIParameters.fixed_frame_rate_flag = CAVLCReader.readBool(bitReader, "VUI: fixed_frame_rate_flag");
        }
        boolean readBool = CAVLCReader.readBool(bitReader, "VUI: nal_hrd_parameters_present_flag");
        if (readBool) {
            vUIParameters.nalHRDParams = readHRDParameters(bitReader);
        }
        boolean readBool2 = CAVLCReader.readBool(bitReader, "VUI: vcl_hrd_parameters_present_flag");
        if (readBool2) {
            vUIParameters.vclHRDParams = readHRDParameters(bitReader);
        }
        if (readBool || readBool2) {
            vUIParameters.low_delay_hrd_flag = CAVLCReader.readBool(bitReader, "VUI: low_delay_hrd_flag");
        }
        vUIParameters.pic_struct_present_flag = CAVLCReader.readBool(bitReader, "VUI: pic_struct_present_flag");
        if (CAVLCReader.readBool(bitReader, "VUI: bitstream_restriction_flag")) {
            vUIParameters.bitstreamRestriction = new BitstreamRestriction();
            vUIParameters.bitstreamRestriction.motion_vectors_over_pic_boundaries_flag = CAVLCReader.readBool(bitReader, "VUI: motion_vectors_over_pic_boundaries_flag");
            vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom = CAVLCReader.readUE(bitReader, "VUI max_bytes_per_pic_denom");
            vUIParameters.bitstreamRestriction.max_bits_per_mb_denom = CAVLCReader.readUE(bitReader, "VUI max_bits_per_mb_denom");
            vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal = CAVLCReader.readUE(bitReader, "VUI log2_max_mv_length_horizontal");
            vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical = CAVLCReader.readUE(bitReader, "VUI log2_max_mv_length_vertical");
            vUIParameters.bitstreamRestriction.num_reorder_frames = CAVLCReader.readUE(bitReader, "VUI num_reorder_frames");
            vUIParameters.bitstreamRestriction.max_dec_frame_buffering = CAVLCReader.readUE(bitReader, "VUI max_dec_frame_buffering");
        }
        return vUIParameters;
    }

    private void writeHRDParameters(HRDParameters hRDParameters, BitWriter bitWriter) {
        CAVLCWriter.writeUE(bitWriter, hRDParameters.cpb_cnt_minus1, "HRD: cpb_cnt_minus1");
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.bit_rate_scale, 4, "HRD: bit_rate_scale");
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.cpb_size_scale, 4, "HRD: cpb_size_scale");
        for (int i = 0; i <= hRDParameters.cpb_cnt_minus1; i++) {
            String str = "HRD: ";
            CAVLCWriter.writeUE(bitWriter, hRDParameters.bit_rate_value_minus1[i], str);
            CAVLCWriter.writeUE(bitWriter, hRDParameters.cpb_size_value_minus1[i], str);
            CAVLCWriter.writeBool(bitWriter, hRDParameters.cbr_flag[i], str);
        }
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.initial_cpb_removal_delay_length_minus1, 5, "HRD: initial_cpb_removal_delay_length_minus1");
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.cpb_removal_delay_length_minus1, 5, "HRD: cpb_removal_delay_length_minus1");
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.dpb_output_delay_length_minus1, 5, "HRD: dpb_output_delay_length_minus1");
        CAVLCWriter.writeNBit(bitWriter, (long) hRDParameters.time_offset_length, 5, "HRD: time_offset_length");
    }

    private void writeVUIParameters(VUIParameters vUIParameters, BitWriter bitWriter) {
        CAVLCWriter.writeBool(bitWriter, vUIParameters.aspect_ratio_info_present_flag, "VUI: aspect_ratio_info_present_flag");
        if (vUIParameters.aspect_ratio_info_present_flag) {
            CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.aspect_ratio.getValue(), 8, "VUI: aspect_ratio");
            if (vUIParameters.aspect_ratio == AspectRatio.Extended_SAR) {
                CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.sar_width, 16, "VUI: sar_width");
                CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.sar_height, 16, "VUI: sar_height");
            }
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.overscan_info_present_flag, "VUI: overscan_info_present_flag");
        if (vUIParameters.overscan_info_present_flag) {
            CAVLCWriter.writeBool(bitWriter, vUIParameters.overscan_appropriate_flag, "VUI: overscan_appropriate_flag");
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.video_signal_type_present_flag, "VUI: video_signal_type_present_flag");
        if (vUIParameters.video_signal_type_present_flag) {
            CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.video_format, 3, "VUI: video_format");
            CAVLCWriter.writeBool(bitWriter, vUIParameters.video_full_range_flag, "VUI: video_full_range_flag");
            CAVLCWriter.writeBool(bitWriter, vUIParameters.colour_description_present_flag, "VUI: colour_description_present_flag");
            if (vUIParameters.colour_description_present_flag) {
                CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.colour_primaries, 8, "VUI: colour_primaries");
                CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.transfer_characteristics, 8, "VUI: transfer_characteristics");
                CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.matrix_coefficients, 8, "VUI: matrix_coefficients");
            }
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.chroma_loc_info_present_flag, "VUI: chroma_loc_info_present_flag");
        if (vUIParameters.chroma_loc_info_present_flag) {
            CAVLCWriter.writeUE(bitWriter, vUIParameters.chroma_sample_loc_type_top_field, "VUI: chroma_sample_loc_type_top_field");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.chroma_sample_loc_type_bottom_field, "VUI: chroma_sample_loc_type_bottom_field");
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.timing_info_present_flag, "VUI: timing_info_present_flag");
        if (vUIParameters.timing_info_present_flag) {
            CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.num_units_in_tick, 32, "VUI: num_units_in_tick");
            CAVLCWriter.writeNBit(bitWriter, (long) vUIParameters.time_scale, 32, "VUI: time_scale");
            CAVLCWriter.writeBool(bitWriter, vUIParameters.fixed_frame_rate_flag, "VUI: fixed_frame_rate_flag");
        }
        boolean z = true;
        String str = "VUI: ";
        CAVLCWriter.writeBool(bitWriter, vUIParameters.nalHRDParams != null, str);
        HRDParameters hRDParameters = vUIParameters.nalHRDParams;
        if (hRDParameters != null) {
            writeHRDParameters(hRDParameters, bitWriter);
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.vclHRDParams != null, str);
        HRDParameters hRDParameters2 = vUIParameters.vclHRDParams;
        if (hRDParameters2 != null) {
            writeHRDParameters(hRDParameters2, bitWriter);
        }
        if (!(vUIParameters.nalHRDParams == null && vUIParameters.vclHRDParams == null)) {
            CAVLCWriter.writeBool(bitWriter, vUIParameters.low_delay_hrd_flag, "VUI: low_delay_hrd_flag");
        }
        CAVLCWriter.writeBool(bitWriter, vUIParameters.pic_struct_present_flag, "VUI: pic_struct_present_flag");
        if (vUIParameters.bitstreamRestriction == null) {
            z = false;
        }
        CAVLCWriter.writeBool(bitWriter, z, str);
        BitstreamRestriction bitstreamRestriction = vUIParameters.bitstreamRestriction;
        if (bitstreamRestriction != null) {
            CAVLCWriter.writeBool(bitWriter, bitstreamRestriction.motion_vectors_over_pic_boundaries_flag, "VUI: motion_vectors_over_pic_boundaries_flag");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.max_bytes_per_pic_denom, "VUI: max_bytes_per_pic_denom");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.max_bits_per_mb_denom, "VUI: max_bits_per_mb_denom");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.log2_max_mv_length_horizontal, "VUI: log2_max_mv_length_horizontal");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.log2_max_mv_length_vertical, "VUI: log2_max_mv_length_vertical");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.num_reorder_frames, "VUI: num_reorder_frames");
            CAVLCWriter.writeUE(bitWriter, vUIParameters.bitstreamRestriction.max_dec_frame_buffering, "VUI: max_dec_frame_buffering");
        }
    }

    public SeqParameterSet copy() {
        ByteBuffer allocate = ByteBuffer.allocate(2048);
        write(allocate);
        allocate.flip();
        return read(allocate);
    }

    public void write(ByteBuffer byteBuffer) {
        BitWriter bitWriter = new BitWriter(byteBuffer);
        CAVLCWriter.writeNBit(bitWriter, (long) this.profile_idc, 8, "SPS: profile_idc");
        CAVLCWriter.writeBool(bitWriter, this.constraint_set_0_flag, "SPS: constraint_set_0_flag");
        CAVLCWriter.writeBool(bitWriter, this.constraint_set_1_flag, "SPS: constraint_set_1_flag");
        CAVLCWriter.writeBool(bitWriter, this.constraint_set_2_flag, "SPS: constraint_set_2_flag");
        CAVLCWriter.writeBool(bitWriter, this.constraint_set_3_flag, "SPS: constraint_set_3_flag");
        CAVLCWriter.writeNBit(bitWriter, 0, 4, "SPS: reserved");
        CAVLCWriter.writeNBit(bitWriter, (long) this.level_idc, 8, "SPS: level_idc");
        CAVLCWriter.writeUE(bitWriter, this.seq_parameter_set_id, "SPS: seq_parameter_set_id");
        int i = this.profile_idc;
        boolean z = false;
        String str = "SPS: ";
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            CAVLCWriter.writeUE(bitWriter, fromColor(this.chroma_format_idc), "SPS: chroma_format_idc");
            if (this.chroma_format_idc == ColorSpace.YUV444) {
                CAVLCWriter.writeBool(bitWriter, this.residual_color_transform_flag, "SPS: residual_color_transform_flag");
            }
            CAVLCWriter.writeUE(bitWriter, this.bit_depth_luma_minus8, str);
            CAVLCWriter.writeUE(bitWriter, this.bit_depth_chroma_minus8, str);
            CAVLCWriter.writeBool(bitWriter, this.qpprime_y_zero_transform_bypass_flag, "SPS: qpprime_y_zero_transform_bypass_flag");
            CAVLCWriter.writeBool(bitWriter, this.scalingMatrix != null, str);
            if (this.scalingMatrix != null) {
                for (int i2 = 0; i2 < 8; i2++) {
                    if (i2 < 6) {
                        CAVLCWriter.writeBool(bitWriter, this.scalingMatrix.ScalingList4x4[i2] != null, str);
                        ScalingList[] scalingListArr = this.scalingMatrix.ScalingList4x4;
                        if (scalingListArr[i2] != null) {
                            scalingListArr[i2].write(bitWriter);
                        }
                    } else {
                        int i3 = i2 - 6;
                        CAVLCWriter.writeBool(bitWriter, this.scalingMatrix.ScalingList8x8[i3] != null, str);
                        ScalingList[] scalingListArr2 = this.scalingMatrix.ScalingList8x8;
                        if (scalingListArr2[i3] != null) {
                            scalingListArr2[i3].write(bitWriter);
                        }
                    }
                }
            }
        }
        CAVLCWriter.writeUE(bitWriter, this.log2_max_frame_num_minus4, "SPS: log2_max_frame_num_minus4");
        CAVLCWriter.writeUE(bitWriter, this.pic_order_cnt_type, "SPS: pic_order_cnt_type");
        int i4 = this.pic_order_cnt_type;
        if (i4 == 0) {
            CAVLCWriter.writeUE(bitWriter, this.log2_max_pic_order_cnt_lsb_minus4, "SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (i4 == 1) {
            CAVLCWriter.writeBool(bitWriter, this.delta_pic_order_always_zero_flag, "SPS: delta_pic_order_always_zero_flag");
            CAVLCWriter.writeSE(bitWriter, this.offset_for_non_ref_pic, "SPS: offset_for_non_ref_pic");
            CAVLCWriter.writeSE(bitWriter, this.offset_for_top_to_bottom_field, "SPS: offset_for_top_to_bottom_field");
            CAVLCWriter.writeUE(bitWriter, this.offsetForRefFrame.length, str);
            int i5 = 0;
            while (true) {
                int[] iArr = this.offsetForRefFrame;
                if (i5 >= iArr.length) {
                    break;
                }
                CAVLCWriter.writeSE(bitWriter, iArr[i5], str);
                i5++;
            }
        }
        CAVLCWriter.writeUE(bitWriter, this.num_ref_frames, "SPS: num_ref_frames");
        CAVLCWriter.writeBool(bitWriter, this.gaps_in_frame_num_value_allowed_flag, "SPS: gaps_in_frame_num_value_allowed_flag");
        CAVLCWriter.writeUE(bitWriter, this.pic_width_in_mbs_minus1, "SPS: pic_width_in_mbs_minus1");
        CAVLCWriter.writeUE(bitWriter, this.pic_height_in_map_units_minus1, "SPS: pic_height_in_map_units_minus1");
        CAVLCWriter.writeBool(bitWriter, this.frame_mbs_only_flag, "SPS: frame_mbs_only_flag");
        if (!this.frame_mbs_only_flag) {
            CAVLCWriter.writeBool(bitWriter, this.mb_adaptive_frame_field_flag, "SPS: mb_adaptive_frame_field_flag");
        }
        CAVLCWriter.writeBool(bitWriter, this.direct_8x8_inference_flag, "SPS: direct_8x8_inference_flag");
        CAVLCWriter.writeBool(bitWriter, this.frame_cropping_flag, "SPS: frame_cropping_flag");
        if (this.frame_cropping_flag) {
            CAVLCWriter.writeUE(bitWriter, this.frame_crop_left_offset, "SPS: frame_crop_left_offset");
            CAVLCWriter.writeUE(bitWriter, this.frame_crop_right_offset, "SPS: frame_crop_right_offset");
            CAVLCWriter.writeUE(bitWriter, this.frame_crop_top_offset, "SPS: frame_crop_top_offset");
            CAVLCWriter.writeUE(bitWriter, this.frame_crop_bottom_offset, "SPS: frame_crop_bottom_offset");
        }
        if (this.vuiParams != null) {
            z = true;
        }
        CAVLCWriter.writeBool(bitWriter, z, str);
        VUIParameters vUIParameters = this.vuiParams;
        if (vUIParameters != null) {
            writeVUIParameters(vUIParameters, bitWriter);
        }
        CAVLCWriter.writeTrailingBits(bitWriter);
    }
}
