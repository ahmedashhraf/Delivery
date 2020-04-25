package org.jcodec.codecs.pcmdvd;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jcodec.common.AudioDecoder;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.AudioBuffer;

public class PCMDVDDecoder implements AudioDecoder {
    private static final int[] lpcm_freq_tab = {48000, 96000, 44100, 32000};

    public AudioBuffer decodeFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws IOException {
        ByteBuffer duplicate = byteBuffer2.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        duplicate2.order(ByteOrder.BIG_ENDIAN);
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        byte b = duplicate2.get() & 255;
        NIOUtils.skip(duplicate2, 3);
        byte b2 = b & 224;
        if (b2 == 160) {
            duplicate2.get();
            byte b3 = duplicate2.get() & 255;
            duplicate2.get();
            int i = lpcm_freq_tab[(b3 >> 4) & 3];
            int i2 = (b3 & 7) + 1;
            int i3 = (((b3 >> 6) & 3) * 4) + 16;
            int remaining = duplicate2.remaining() / ((i3 >> 3) * i2);
            if (i3 == 20) {
                for (int i4 = 0; i4 < (remaining >> 1); i4++) {
                    for (int i5 = 0; i5 < i2; i5++) {
                        duplicate.putShort(duplicate2.getShort());
                        duplicate.putShort(duplicate2.getShort());
                    }
                    NIOUtils.skip(duplicate2, i2);
                }
            } else if (i3 == 24) {
                for (int i6 = 0; i6 < (remaining >> 1); i6++) {
                    for (int i7 = 0; i7 < i2; i7++) {
                        duplicate.putShort(duplicate2.getShort());
                        duplicate.putShort(duplicate2.getShort());
                    }
                    NIOUtils.skip(duplicate2, i2 << 1);
                }
            }
            duplicate.flip();
            AudioFormat audioFormat = new AudioFormat(i, 16, i2, true, false);
            return new AudioBuffer(duplicate, audioFormat, remaining);
        } else if (b2 != 128) {
            throw new RuntimeException("MPEG DVD unknown coded");
        } else if ((b & 248) == 136) {
            throw new RuntimeException("CODEC_ID_DTS");
        } else {
            throw new RuntimeException("CODEC_ID_AC3");
        }
    }
}
