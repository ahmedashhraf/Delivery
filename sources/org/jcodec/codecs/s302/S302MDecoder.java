package org.jcodec.codecs.s302;

import com.google.common.base.C5785c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jcodec.common.AudioDecoder;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.model.AudioBuffer;
import org.jcodec.common.tools.MathUtil;

public class S302MDecoder implements AudioDecoder {
    public static int SAMPLE_RATE = 48000;

    public AudioBuffer decodeFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        int i = byteBuffer.getInt();
        if (byteBuffer.remaining() == ((i >> 16) & 65535)) {
            int i2 = (((i >> 14) & 3) * 2) + 2;
            int i3 = (((i >> 4) & 3) * 4) + 16;
            if (i3 == 24) {
                int remaining = (byteBuffer.remaining() / 7) * 2;
                while (byteBuffer.remaining() > 6) {
                    byte reverse = (byte) MathUtil.reverse(byteBuffer.get() & 255);
                    byte reverse2 = (byte) MathUtil.reverse(byteBuffer.get() & 255);
                    byte reverse3 = (byte) MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse4 = MathUtil.reverse(byteBuffer.get() & C5785c.f16698q);
                    int reverse5 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse6 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse7 = MathUtil.reverse(byteBuffer.get() & 240);
                    duplicate.put(reverse3);
                    duplicate.put(reverse2);
                    duplicate.put(reverse);
                    duplicate.put((byte) ((reverse7 << 4) | (reverse6 >> 4)));
                    duplicate.put((byte) ((reverse6 << 4) | (reverse5 >> 4)));
                    duplicate.put((byte) ((reverse5 << 4) | (reverse4 >> 4)));
                }
                duplicate.flip();
                AudioFormat audioFormat = new AudioFormat(SAMPLE_RATE, 24, i2, true, true);
                return new AudioBuffer(duplicate, audioFormat, remaining / i2);
            } else if (i3 == 20) {
                int remaining2 = (byteBuffer.remaining() / 6) * 2;
                while (byteBuffer.remaining() > 5) {
                    int reverse8 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse9 = MathUtil.reverse(byteBuffer.get() & 255);
                    duplicate.put((byte) ((MathUtil.reverse(byteBuffer.get() & 240) << 4) | (reverse9 >> 4)));
                    duplicate.put((byte) ((reverse9 << 4) | (reverse8 >> 4)));
                    duplicate.put((byte) (reverse8 << 4));
                    int reverse10 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse11 = MathUtil.reverse(byteBuffer.get() & 255);
                    duplicate.put((byte) ((MathUtil.reverse(byteBuffer.get() & 240) << 4) | (reverse11 >> 4)));
                    duplicate.put((byte) ((reverse11 << 4) | (reverse10 >> 4)));
                    duplicate.put((byte) (reverse10 << 4));
                }
                duplicate.flip();
                AudioFormat audioFormat2 = new AudioFormat(SAMPLE_RATE, 24, i2, true, true);
                return new AudioBuffer(duplicate, audioFormat2, remaining2 / i2);
            } else {
                int remaining3 = (byteBuffer.remaining() / 5) * 2;
                while (byteBuffer.remaining() > 4) {
                    byte reverse12 = (byte) MathUtil.reverse(byteBuffer.get() & 255);
                    byte reverse13 = (byte) MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse14 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse15 = MathUtil.reverse(byteBuffer.get() & 255);
                    int reverse16 = MathUtil.reverse(byteBuffer.get() & 240);
                    byteBuffer2.put(reverse13);
                    byteBuffer2.put(reverse12);
                    byteBuffer2.put((byte) ((reverse16 << 4) | (reverse15 >> 4)));
                    byteBuffer2.put((byte) ((reverse15 << 4) | (reverse14 >> 4)));
                }
                duplicate.flip();
                AudioFormat audioFormat3 = new AudioFormat(SAMPLE_RATE, 16, i2, true, true);
                return new AudioBuffer(duplicate, audioFormat3, remaining3 / i2);
            }
        } else {
            throw new IllegalArgumentException("Wrong s302m frame");
        }
    }
}
