package org.jcodec.codecs.mjpeg;

import java.nio.ByteBuffer;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;

public class JPEGBitStream {
    private int[] dcPredictor = new int[3];
    private VLC[] huff;

    /* renamed from: in */
    private BitReader f44751in;
    private int lumaLen;

    public JPEGBitStream(ByteBuffer byteBuffer, VLC[] vlcArr, int i) {
        this.f44751in = new BitReader(byteBuffer);
        this.huff = vlcArr;
        this.lumaLen = i;
    }

    public void readACValues(int[] iArr, VLC vlc) {
        int i = 1;
        do {
            int readVLC = vlc.readVLC(this.f44751in);
            if (readVLC == 240) {
                i += 16;
            } else if (readVLC > 0) {
                int i2 = i + (readVLC >> 4);
                int i3 = readVLC & 15;
                iArr[i2] = toValue(this.f44751in.readNBit(i3), i3);
                i = i2 + 1;
            }
            if (readVLC == 0) {
                return;
            }
        } while (i < 64);
    }

    public int readDCValue(int i, VLC vlc) {
        int readVLC = vlc.readVLC(this.f44751in);
        return readVLC != 0 ? i + toValue(this.f44751in.readNBit(readVLC), readVLC) : i;
    }

    public void readMCU(int[][] iArr) {
        int i = 0;
        int i2 = 0;
        while (i < this.lumaLen) {
            int[] iArr2 = this.dcPredictor;
            int[] iArr3 = iArr[i2];
            int readDCValue = readDCValue(iArr2[0], this.huff[0]);
            iArr3[0] = readDCValue;
            iArr2[0] = readDCValue;
            readACValues(iArr[i2], this.huff[2]);
            i++;
            i2++;
        }
        int[] iArr4 = this.dcPredictor;
        int[] iArr5 = iArr[i2];
        int readDCValue2 = readDCValue(iArr4[1], this.huff[1]);
        iArr5[0] = readDCValue2;
        iArr4[1] = readDCValue2;
        readACValues(iArr[i2], this.huff[3]);
        int i3 = i2 + 1;
        int[] iArr6 = this.dcPredictor;
        int[] iArr7 = iArr[i3];
        int readDCValue3 = readDCValue(iArr6[2], this.huff[1]);
        iArr7[0] = readDCValue3;
        iArr6[2] = readDCValue3;
        readACValues(iArr[i3], this.huff[3]);
    }

    public final int toValue(int i, int i2) {
        return (i2 < 1 || i >= (1 << (i2 + -1))) ? i : i + (-(1 << i2)) + 1;
    }
}
