package org.jcodec.common.p554io;

import java.io.PrintStream;
import org.jcodec.common.IntArrayList;

/* renamed from: org.jcodec.common.io.VLC */
public class VLC {
    private int[] codeSizes;
    private int[] codes;
    private int[] valueSizes;
    private int[] values;

    public VLC(int[] iArr, int[] iArr2) {
        this.codes = iArr;
        this.codeSizes = iArr2;
        invert();
    }

    private String binary(int i, int i2) {
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = ((1 << ((i2 - i3) - 1)) & i) != 0 ? '1' : '0';
        }
        return new String(cArr);
    }

    private String extracted(int i) {
        String num = Integer.toString(i & 255, 2);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < 8 - num.length(); i2++) {
            sb.append('0');
        }
        sb.append(num);
        return sb.toString();
    }

    private void invert() {
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        invert(0, 0, 0, intArrayList, intArrayList2);
        this.values = intArrayList.toArray();
        this.valueSizes = intArrayList2.toArray();
    }

    public int[] getCodeSizes() {
        return this.codeSizes;
    }

    public int[] getCodes() {
        return this.codes;
    }

    public void printTable(PrintStream printStream) {
        for (int i = 0; i < this.values.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(": ");
            sb.append(extracted(i));
            sb.append(" (");
            sb.append(this.valueSizes[i]);
            sb.append(") -> ");
            sb.append(this.values[i]);
            printStream.println(sb.toString());
        }
    }

    public int readVLC(BitReader bitReader) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i == 0) {
            int checkNBit = bitReader.checkNBit(8);
            int i5 = i2 + checkNBit;
            int i6 = this.values[i5];
            int i7 = this.valueSizes[i5];
            int i8 = i7 != 0 ? i7 : 8;
            i3 = (i3 << i8) | (checkNBit >> (8 - i8));
            bitReader.skip(i8);
            if (i6 != -1) {
                i4++;
                i = i7;
                i2 = i6;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid code prefix ");
                sb.append(binary(i3, (i4 << 3) + i8));
                throw new RuntimeException(sb.toString());
            }
        }
        return i2;
    }

    public int readVLC16(BitReader bitReader) {
        int check16Bits = bitReader.check16Bits();
        int i = check16Bits >>> 8;
        int[] iArr = this.values;
        int i2 = iArr[i];
        int[] iArr2 = this.valueSizes;
        int i3 = iArr2[i];
        if (i3 == 0) {
            int i4 = (check16Bits & 255) + i2;
            int i5 = iArr[i4];
            bitReader.skipFast(iArr2[i4] + 8);
            return i5;
        }
        bitReader.skipFast(i3);
        return i2;
    }

    public void writeVLC(BitWriter bitWriter, int i) {
        int i2 = this.codes[i];
        int[] iArr = this.codeSizes;
        bitWriter.writeNBit(i2 >>> (32 - iArr[i]), iArr[i]);
    }

    public VLC(String... strArr) {
        IntArrayList intArrayList = new IntArrayList();
        IntArrayList intArrayList2 = new IntArrayList();
        for (String str : strArr) {
            intArrayList.add(Integer.parseInt(str, 2) << (32 - str.length()));
            intArrayList2.add(str.length());
        }
        this.codes = intArrayList.toArray();
        this.codeSizes = intArrayList2.toArray();
        invert();
    }

    private int invert(int i, int i2, int i3, IntArrayList intArrayList, IntArrayList intArrayList2) {
        int i4 = i;
        IntArrayList intArrayList3 = intArrayList;
        IntArrayList intArrayList4 = intArrayList2;
        int i5 = i4 + 256;
        intArrayList3.fill(i4, i5, -1);
        intArrayList4.fill(i4, i5, 0);
        int i6 = i2 << 3;
        int i7 = i5;
        int i8 = 0;
        while (true) {
            int[] iArr = this.codeSizes;
            if (i8 >= iArr.length) {
                return i7;
            }
            if (iArr[i8] > i6) {
                if (i2 <= 0) {
                    int i9 = i3;
                } else if ((this.codes[i8] >>> (32 - i6)) != i3) {
                }
                int i10 = this.codes[i8] >>> ((32 - i6) - 8);
                int i11 = i10 & 255;
                int i12 = this.codeSizes[i8] - i6;
                if (i12 <= 8) {
                    for (int i13 = 0; i13 < (1 << (8 - i12)); i13++) {
                        int i14 = i4 + i11 + i13;
                        intArrayList3.set(i14, i8);
                        intArrayList4.set(i14, i12);
                    }
                } else {
                    int i15 = i11 + i4;
                    if (intArrayList3.get(i15) == -1) {
                        intArrayList3.set(i15, i7);
                        i7 = invert(i7, i2 + 1, i10, intArrayList, intArrayList2);
                    }
                }
            } else {
                int i16 = i3;
            }
            i8++;
        }
    }
}
