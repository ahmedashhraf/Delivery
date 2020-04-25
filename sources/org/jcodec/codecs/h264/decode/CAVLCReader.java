package org.jcodec.codecs.h264.decode;

import org.jcodec.codecs.h264.H264Utils;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.Debug;

public class CAVLCReader {
    private CAVLCReader() {
    }

    public static boolean moreRBSPData(BitReader bitReader) {
        return (bitReader.remaining() < 32 && bitReader.checkNBit(1) == 1 && (bitReader.checkNBit(24) << 9) == 0) ? false : true;
    }

    public static boolean readBool(BitReader bitReader, String str) {
        boolean z = bitReader.read1Bit() != 0;
        Debug.trace(str, Integer.valueOf(z ? 1 : 0));
        return z;
    }

    public static int readME(BitReader bitReader, String str) {
        return readUE(bitReader, str);
    }

    public static int readNBit(BitReader bitReader, int i, String str) {
        int readNBit = bitReader.readNBit(i);
        Debug.trace(str, Integer.valueOf(readNBit));
        return readNBit;
    }

    public static int readSE(BitReader bitReader, String str) {
        int golomb2Signed = H264Utils.golomb2Signed(readUE(bitReader));
        Debug.trace(str, Integer.valueOf(golomb2Signed));
        return golomb2Signed;
    }

    public static int readTE(BitReader bitReader, int i) {
        if (i > 1) {
            return readUE(bitReader);
        }
        return (bitReader.read1Bit() ^ -1) & 1;
    }

    public static int readU(BitReader bitReader, int i, String str) {
        return readNBit(bitReader, i, str);
    }

    public static int readUE(BitReader bitReader) {
        int i = 0;
        while (bitReader.read1Bit() == 0 && i < 31) {
            i++;
        }
        if (i <= 0) {
            return 0;
        }
        return (int) (((long) ((1 << i) - 1)) + ((long) bitReader.readNBit(i)));
    }

    public static int readZeroBitCount(BitReader bitReader, String str) {
        int i = 0;
        while (bitReader.read1Bit() == 0 && i < 32) {
            i++;
        }
        Debug.trace(str, String.valueOf(i));
        return i;
    }

    public static int readUE(BitReader bitReader, String str) {
        int readUE = readUE(bitReader);
        Debug.trace(str, Integer.valueOf(readUE));
        return readUE;
    }
}
