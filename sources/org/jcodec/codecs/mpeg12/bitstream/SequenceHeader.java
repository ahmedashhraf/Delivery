package org.jcodec.codecs.mpeg12.bitstream;

import java.nio.ByteBuffer;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.BitWriter;

public class SequenceHeader implements MPEGHeader {
    public static final int Sequence_Display_Extension = 2;
    public static final int Sequence_Extension = 1;
    public static final int Sequence_Scalable_Extension = 5;
    private static boolean hasExtensions;
    public int aspect_ratio_information;
    public int bit_rate;
    public int constrained_parameters_flag;
    public int frame_rate_code;
    public int horizontal_size;
    public int[] intra_quantiser_matrix;
    public int[] non_intra_quantiser_matrix;
    public SequenceDisplayExtension sequenceDisplayExtension;
    public SequenceExtension sequenceExtension;
    public SequenceScalableExtension sequenceScalableExtension;
    public int vbv_buffer_size_value;
    public int vertical_size;

    public SequenceHeader(int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2) {
        this.horizontal_size = i;
        this.vertical_size = i2;
        this.aspect_ratio_information = i3;
        this.frame_rate_code = i4;
        this.bit_rate = i5;
        this.vbv_buffer_size_value = i6;
        this.constrained_parameters_flag = i7;
        this.intra_quantiser_matrix = iArr;
        this.non_intra_quantiser_matrix = iArr2;
    }

    public static SequenceHeader read(ByteBuffer byteBuffer) {
        BitReader bitReader = new BitReader(byteBuffer);
        SequenceHeader sequenceHeader = new SequenceHeader();
        sequenceHeader.horizontal_size = bitReader.readNBit(12);
        sequenceHeader.vertical_size = bitReader.readNBit(12);
        sequenceHeader.aspect_ratio_information = bitReader.readNBit(4);
        sequenceHeader.frame_rate_code = bitReader.readNBit(4);
        sequenceHeader.bit_rate = bitReader.readNBit(18);
        bitReader.read1Bit();
        sequenceHeader.vbv_buffer_size_value = bitReader.readNBit(10);
        sequenceHeader.constrained_parameters_flag = bitReader.read1Bit();
        if (bitReader.read1Bit() != 0) {
            sequenceHeader.intra_quantiser_matrix = new int[64];
            for (int i = 0; i < 64; i++) {
                sequenceHeader.intra_quantiser_matrix[i] = bitReader.readNBit(8);
            }
        }
        if (bitReader.read1Bit() != 0) {
            sequenceHeader.non_intra_quantiser_matrix = new int[64];
            for (int i2 = 0; i2 < 64; i2++) {
                sequenceHeader.non_intra_quantiser_matrix[i2] = bitReader.readNBit(8);
            }
        }
        return sequenceHeader;
    }

    public static void readExtension(ByteBuffer byteBuffer, SequenceHeader sequenceHeader) {
        hasExtensions = true;
        BitReader bitReader = new BitReader(byteBuffer);
        int readNBit = bitReader.readNBit(4);
        if (readNBit == 1) {
            sequenceHeader.sequenceExtension = SequenceExtension.read(bitReader);
        } else if (readNBit == 2) {
            sequenceHeader.sequenceDisplayExtension = SequenceDisplayExtension.read(bitReader);
        } else if (readNBit == 5) {
            sequenceHeader.sequenceScalableExtension = SequenceScalableExtension.read(bitReader);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported extension: ");
            sb.append(readNBit);
            throw new RuntimeException(sb.toString());
        }
    }

    private void writeExtensions(ByteBuffer byteBuffer) {
        if (this.sequenceExtension != null) {
            byteBuffer.putInt(181);
            this.sequenceExtension.write(byteBuffer);
        }
        if (this.sequenceScalableExtension != null) {
            byteBuffer.putInt(181);
            this.sequenceScalableExtension.write(byteBuffer);
        }
        if (this.sequenceDisplayExtension != null) {
            byteBuffer.putInt(181);
            this.sequenceDisplayExtension.write(byteBuffer);
        }
    }

    public void copyExtensions(SequenceHeader sequenceHeader) {
        this.sequenceExtension = sequenceHeader.sequenceExtension;
        this.sequenceScalableExtension = sequenceHeader.sequenceScalableExtension;
        this.sequenceDisplayExtension = sequenceHeader.sequenceDisplayExtension;
    }

    public boolean hasExtensions() {
        return hasExtensions;
    }

    public void write(ByteBuffer byteBuffer) {
        BitWriter bitWriter = new BitWriter(byteBuffer);
        bitWriter.writeNBit(this.horizontal_size, 12);
        bitWriter.writeNBit(this.vertical_size, 12);
        bitWriter.writeNBit(this.aspect_ratio_information, 4);
        bitWriter.writeNBit(this.frame_rate_code, 4);
        bitWriter.writeNBit(this.bit_rate, 18);
        int i = 1;
        bitWriter.write1Bit(1);
        bitWriter.writeNBit(this.vbv_buffer_size_value, 10);
        bitWriter.write1Bit(this.constrained_parameters_flag);
        bitWriter.write1Bit(this.intra_quantiser_matrix != null ? 1 : 0);
        if (this.intra_quantiser_matrix != null) {
            for (int i2 = 0; i2 < 64; i2++) {
                bitWriter.writeNBit(this.intra_quantiser_matrix[i2], 8);
            }
        }
        if (this.non_intra_quantiser_matrix == null) {
            i = 0;
        }
        bitWriter.write1Bit(i);
        if (this.non_intra_quantiser_matrix != null) {
            for (int i3 = 0; i3 < 64; i3++) {
                bitWriter.writeNBit(this.non_intra_quantiser_matrix[i3], 8);
            }
        }
        bitWriter.flush();
        writeExtensions(byteBuffer);
    }

    private SequenceHeader() {
    }
}
