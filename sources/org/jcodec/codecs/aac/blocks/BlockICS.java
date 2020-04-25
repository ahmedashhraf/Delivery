package org.jcodec.codecs.aac.blocks;

import androidx.core.p034l.C0986h;
import java.io.PrintStream;
import java.lang.reflect.Array;
import org.jcodec.codecs.aac.Profile;
import org.jcodec.codecs.prores.ProresDecoder;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.p554io.VLC;
import org.jcodec.common.p554io.VLCBuilder;
import org.jcodec.common.tools.MathUtil;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p212io.branch.referral.C14153p;

public class BlockICS extends Block {
    private static final int MAX_LTP_LONG_SFB = 40;
    private static final int POW_SF2_ZERO = 200;
    static float[] ff_aac_pow2sf_tab = new float[428];
    private static VLC[] spectral = {new VLCBuilder(AACTab.codes1, AACTab.bits1, AACTab.codebook_vector02_idx).getVLC(), new VLCBuilder(AACTab.codes2, AACTab.bits2, AACTab.codebook_vector02_idx).getVLC(), new VLCBuilder(AACTab.codes3, AACTab.bits3, AACTab.codebook_vector02_idx).getVLC(), new VLCBuilder(AACTab.codes4, AACTab.bits4, AACTab.codebook_vector02_idx).getVLC(), new VLCBuilder(AACTab.codes5, AACTab.bits5, AACTab.codebook_vector4_idx).getVLC(), new VLCBuilder(AACTab.codes6, AACTab.bits6, AACTab.codebook_vector4_idx).getVLC(), new VLCBuilder(AACTab.codes7, AACTab.bits7, AACTab.codebook_vector6_idx).getVLC(), new VLCBuilder(AACTab.codes8, AACTab.bits8, AACTab.codebook_vector6_idx).getVLC(), new VLCBuilder(AACTab.codes9, AACTab.bits9, AACTab.codebook_vector8_idx).getVLC(), new VLCBuilder(AACTab.codes10, AACTab.bits10, AACTab.codebook_vector8_idx).getVLC(), new VLCBuilder(AACTab.codes11, AACTab.bits11, AACTab.codebook_vector10_idx).getVLC()};
    private static VLC vlc = new VLC(AACTab.ff_aac_scalefactor_code, AACTab.ff_aac_scalefactor_bits);
    private int[] band_type = new int[120];
    private int[] band_type_run_end = new int[120];
    private boolean commonWindow;
    float[][] ff_aac_codebook_vector_vals;
    private int globalGain;
    private int[] group_len = new int[8];
    int maxSfb;
    private int numSwb;
    private int numWindows;
    int num_window_groups;
    private Profile profile;
    private int samplingIndex;
    private boolean scaleFlag;
    private double[] sfs;
    private int[] swbOffset;
    private int windowSequence;

    public static class Pulse {
        private int[] amp;
        private int numPulse;
        private int[] pos;

        public Pulse(int i, int[] iArr, int[] iArr2) {
            this.numPulse = i;
            this.pos = iArr;
            this.amp = iArr2;
        }

        public int[] getAmp() {
            return this.amp;
        }

        public int getNumPulse() {
            return this.numPulse;
        }

        public int[] getPos() {
            return this.pos;
        }
    }

    public static class Tns {
        private float[][][] coeff;
        private int[][] direction;
        private int[][] length;
        private int[] nFilt;
        private int[][] order;

        public Tns(int[] iArr, int[][] iArr2, int[][] iArr3, int[][] iArr4, float[][][] fArr) {
            this.nFilt = iArr;
            this.length = iArr2;
            this.order = iArr3;
            this.direction = iArr4;
            this.coeff = fArr;
        }
    }

    /* renamed from: org.jcodec.codecs.aac.blocks.BlockICS$a */
    enum C15485a {
        ZERO_BT,
        BT_1,
        BT_2,
        BT_3,
        BT_4,
        FIRST_PAIR_BT,
        BT_6,
        BT_7,
        BT_8,
        BT_9,
        BT_10,
        ESC_BT,
        BT_12,
        NOISE_BT,
        INTENSITY_BT2,
        INTENSITY_BT
    }

    /* renamed from: org.jcodec.codecs.aac.blocks.BlockICS$b */
    private enum C15486b {
        ONLY_LONG_SEQUENCE,
        LONG_START_SEQUENCE,
        EIGHT_SHORT_SEQUENCE,
        LONG_STOP_SEQUENCE
    }

    static {
        for (int i = 0; i < 428; i++) {
            float[] fArr = ff_aac_pow2sf_tab;
            double d = (double) (i + C14153p.f41642l);
            Double.isNaN(d);
            fArr[i] = (float) Math.pow(2.0d, d / 4.0d);
        }
    }

    public BlockICS() {
        float[] fArr = AACTab.codebook_vector0_vals;
        float[] fArr2 = AACTab.codebook_vector10_vals;
        float[] fArr3 = AACTab.codebook_vector4_vals;
        float[] fArr4 = AACTab.codebook_vector10_vals;
        this.ff_aac_codebook_vector_vals = new float[][]{fArr, fArr, fArr2, fArr2, fArr3, fArr3, fArr4, fArr4, fArr4, fArr4, fArr4};
    }

    private void decodeBandTypes(BitReader bitReader) {
        int readNBit;
        int i;
        int i2 = this.windowSequence == C15486b.EIGHT_SHORT_SEQUENCE.ordinal() ? 3 : 5;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.num_window_groups) {
            int i5 = i4;
            int i6 = 0;
            while (i6 < this.maxSfb) {
                int readNBit2 = bitReader.readNBit(4);
                if (readNBit2 != 12) {
                    int i7 = i6;
                    while (true) {
                        readNBit = bitReader.readNBit(i2);
                        i = (1 << i2) - 1;
                        if (readNBit != i) {
                            break;
                        }
                        i7 += readNBit;
                    }
                    int i8 = i7 + readNBit;
                    if (!bitReader.moreData() || readNBit == i) {
                        throw new RuntimeException("Overread");
                    } else if (i8 <= this.maxSfb) {
                        while (i6 < i8) {
                            this.band_type[i5] = readNBit2;
                            int i9 = i5 + 1;
                            this.band_type_run_end[i5] = i8;
                            i6++;
                            i5 = i9;
                        }
                    } else {
                        throw new RuntimeException(String.format("Number of bands (%d) exceeds limit (%d).\n", new Object[]{Integer.valueOf(i8), Integer.valueOf(this.maxSfb)}));
                    }
                } else {
                    throw new RuntimeException("invalid band type");
                }
            }
            i3++;
            i4 = i5;
        }
    }

    private void decodeLtp(BitReader bitReader, int i) {
        bitReader.readNBit(11);
        float f = AACTab.ltpCoefTab[bitReader.readNBit(3)];
        for (int i2 = 0; i2 < Math.min(i, 40); i2++) {
            bitReader.read1Bit();
        }
    }

    private void decodePrediction(BitReader bitReader, int i) {
        if (bitReader.read1Bit() != 0) {
            bitReader.readNBit(5);
        }
        for (int i2 = 0; i2 < Math.min(i, AACTab.maxSfbTab[this.samplingIndex]); i2++) {
            bitReader.read1Bit();
        }
    }

    private Pulse decodePulses(BitReader bitReader) {
        int[] iArr = new int[4];
        int[] iArr2 = new int[4];
        int i = 1;
        int readNBit = bitReader.readNBit(2) + 1;
        int readNBit2 = bitReader.readNBit(6);
        if (readNBit2 < this.numSwb) {
            iArr[0] = this.swbOffset[readNBit2];
            iArr[0] = iArr[0] + bitReader.readNBit(5);
            if (iArr[0] <= 1023) {
                iArr2[0] = bitReader.readNBit(4);
                while (i < readNBit) {
                    iArr[i] = bitReader.readNBit(5) + iArr[i - 1];
                    if (iArr[i] <= 1023) {
                        iArr2[i] = bitReader.readNBit(5);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("pos[");
                        sb.append(i);
                        sb.append("] > 1023");
                        throw new RuntimeException(sb.toString());
                    }
                }
                return new Pulse(readNBit, iArr, iArr2);
            }
            throw new RuntimeException("pos[0] > 1023");
        }
        throw new RuntimeException("pulseSwb >= numSwb");
    }

    private void decodeScalefactors(BitReader bitReader) {
        BitReader bitReader2 = bitReader;
        int i = this.globalGain;
        int i2 = 2;
        int[] iArr = {i, i - 90, 0};
        String[] strArr = {"Global gain", "Noise gain", "Intensity stereo position"};
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < this.num_window_groups) {
            int i6 = i5;
            int i7 = i4;
            int i8 = 0;
            while (i8 < this.maxSfb) {
                int i9 = this.band_type_run_end[i7];
                if (this.band_type[i7] == C15485a.ZERO_BT.ordinal()) {
                    while (i8 < i9) {
                        this.sfs[i7] = 0.0d;
                        i8++;
                        i7++;
                    }
                } else {
                    int i10 = 100;
                    if (this.band_type[i7] == C15485a.INTENSITY_BT.ordinal() || this.band_type[i7] == C15485a.INTENSITY_BT2.ordinal()) {
                        while (i8 < i9) {
                            iArr[i2] = iArr[i2] + (vlc.readVLC(bitReader2) - 60);
                            int clip = MathUtil.clip(iArr[i2], -155, 100);
                            if (iArr[i2] != clip) {
                                PrintStream printStream = System.out;
                                Object[] objArr = new Object[i2];
                                objArr[0] = Integer.valueOf(iArr[i2]);
                                objArr[1] = Integer.valueOf(clip);
                                printStream.println(String.format("Intensity stereo position clipped (%d -> %d).\nIf you heard an audible artifact, there may be a bug in the decoder. ", objArr));
                            }
                            this.sfs[i7] = (double) ff_aac_pow2sf_tab[(-clip) + 200];
                            i8++;
                            i7++;
                            i2 = 2;
                        }
                    } else if (this.band_type[i7] == C15485a.NOISE_BT.ordinal()) {
                        while (i8 < i9) {
                            int i11 = i6 - 1;
                            if (i6 > 0) {
                                iArr[1] = iArr[1] + bitReader2.readNBit(9) + C0986h.f4419u;
                            } else {
                                iArr[1] = iArr[1] + (vlc.readVLC(bitReader2) - 60);
                            }
                            int clip2 = MathUtil.clip(iArr[1], -100, C13959t.f40949r2);
                            if (iArr[1] != clip2) {
                                PrintStream printStream2 = System.out;
                                Object[] objArr2 = new Object[i2];
                                objArr2[0] = Integer.valueOf(iArr[1]);
                                objArr2[1] = Integer.valueOf(clip2);
                                printStream2.println(String.format("Noise gain clipped (%d -> %d).\nIf you heard an audible artifact, there may be a bug in the decoder. ", objArr2));
                            }
                            this.sfs[i7] = (double) (-ff_aac_pow2sf_tab[clip2 + 200]);
                            i8++;
                            i7++;
                            i6 = i11;
                        }
                    } else {
                        while (i8 < i9) {
                            iArr[0] = iArr[0] + (vlc.readVLC(bitReader2) - 60);
                            if (iArr[0] <= 255) {
                                this.sfs[i7] = (double) (-ff_aac_pow2sf_tab[(iArr[0] - i10) + 200]);
                                i8++;
                                i7++;
                                i10 = 100;
                            } else {
                                Object[] objArr3 = new Object[i2];
                                objArr3[0] = strArr[0];
                                objArr3[1] = Integer.valueOf(iArr[0]);
                                throw new RuntimeException(String.format("%s (%d) out of range.\n", objArr3));
                            }
                        }
                        continue;
                    }
                }
                i2 = 2;
            }
            i3++;
            i4 = i7;
            i5 = i6;
            i2 = 2;
        }
    }

    private void decodeSpectrum(BitReader bitReader) {
        float[] fArr = new float[1024];
        int i = 0;
        int i2 = 0;
        while (i2 < this.num_window_groups) {
            int i3 = i;
            int i4 = 0;
            while (i4 < this.maxSfb) {
                int i5 = this.band_type[i3] - 1;
                if (i5 < C15485a.INTENSITY_BT2.ordinal() - 1 && i5 != C15485a.NOISE_BT.ordinal() - 1) {
                    float[] fArr2 = this.ff_aac_codebook_vector_vals[i5];
                    VLC vlc2 = spectral[i5];
                    int i6 = i5 >> 1;
                    if (i6 == 0) {
                        readBandType1And2(bitReader, fArr, i3, i2, i4, fArr2, vlc2);
                    } else if (i6 == 1) {
                        readBandType3And4(bitReader, fArr, i3, i2, i4, fArr2, vlc2);
                    } else if (i6 == 2) {
                        readBandType5And6(bitReader, fArr, i3, i2, i4, fArr2, vlc2);
                    } else if (i6 == 3 || i6 == 4) {
                        readBandType7Through10(bitReader, fArr, i3, i2, i4, fArr2, vlc2);
                    } else {
                        readOther(bitReader, fArr, i3, i2, i4, fArr2, vlc2);
                    }
                }
                i4++;
                i3++;
            }
            i2++;
            i = i3;
        }
    }

    private Tns decodeTns(BitReader bitReader) {
        int i;
        int i2;
        BlockICS blockICS = this;
        BitReader bitReader2 = bitReader;
        Class<int> cls = int.class;
        int i3 = blockICS.windowSequence == C15486b.EIGHT_SHORT_SEQUENCE.ordinal() ? 1 : 0;
        int i4 = i3 != 0 ? 7 : blockICS.profile == Profile.MAIN ? 20 : 12;
        int i5 = blockICS.numWindows;
        int[] iArr = new int[i5];
        int[][] iArr2 = (int[][]) Array.newInstance(cls, new int[]{i5, 2});
        int[][] iArr3 = (int[][]) Array.newInstance(cls, new int[]{blockICS.numWindows, 2});
        int[][] iArr4 = (int[][]) Array.newInstance(cls, new int[]{blockICS.numWindows, 2});
        int i6 = i3 * 2;
        int i7 = 5 - i6;
        float[][][] fArr = (float[][][]) Array.newInstance(float.class, new int[]{blockICS.numWindows, 2, 1 << i7});
        int i8 = 0;
        while (i8 < blockICS.numWindows) {
            int readNBit = bitReader2.readNBit(2 - i3);
            iArr[i8] = readNBit;
            if (readNBit != 0) {
                int read1Bit = bitReader.read1Bit();
                int i9 = 0;
                while (i9 < iArr[i8]) {
                    iArr2[i8][i9] = bitReader2.readNBit(6 - i6);
                    int[] iArr5 = iArr3[i8];
                    int readNBit2 = bitReader2.readNBit(i7);
                    iArr5[i9] = readNBit2;
                    if (readNBit2 <= i4) {
                        if (iArr3[i8][i9] != 0) {
                            iArr4[i8][i9] = bitReader.read1Bit();
                            int read1Bit2 = bitReader.read1Bit();
                            int i10 = (read1Bit + 3) - read1Bit2;
                            int i11 = (read1Bit2 * 2) + read1Bit;
                            int i12 = 0;
                            while (true) {
                                i2 = i3;
                                if (i12 >= iArr3[i8][i9]) {
                                    break;
                                }
                                fArr[i8][i9][i12] = AACTab.tns_tmp2_map[i11][bitReader2.readNBit(i10)];
                                i12++;
                                i3 = i2;
                            }
                        } else {
                            i2 = i3;
                        }
                        i9++;
                        i3 = i2;
                    } else {
                        throw new RuntimeException(String.format("TNS filter order %d is greater than maximum %d.\n", new Object[]{Integer.valueOf(iArr3[i8][i9]), Integer.valueOf(i4)}));
                    }
                }
                i = i3;
            } else {
                i = i3;
            }
            i8++;
            blockICS = this;
            i3 = i;
        }
        Tns tns = new Tns(iArr, iArr2, iArr3, iArr4, fArr);
        return tns;
    }

    private void readBandType1And2(BitReader bitReader, float[] fArr, int i, int i2, int i3, float[] fArr2, VLC vlc2) {
        int i4 = this.group_len[i2];
        int[] iArr = this.swbOffset;
        int i5 = iArr[i3 + 1] - iArr[i3];
        int i6 = iArr[i3];
        int i7 = 0;
        while (i7 < i4) {
            BitReader bitReader2 = bitReader;
            VLC vlc3 = vlc2;
            int i8 = i5;
            int i9 = i6;
            do {
                VMUL4(fArr, i9, fArr2, vlc3.readVLC(bitReader2), (float) this.sfs[i]);
                i9 += 4;
                i8 -= 4;
            } while (i8 > 0);
            i7++;
            i6 += 128;
        }
    }

    private void readBandType3And4(BitReader bitReader, float[] fArr, int i, int i2, int i3, float[] fArr2, VLC vlc2) {
        int i4;
        BitReader bitReader2 = bitReader;
        int i5 = this.group_len[i2];
        int[] iArr = this.swbOffset;
        int i6 = iArr[i3 + 1] - iArr[i3];
        int i7 = iArr[i3];
        int i8 = 0;
        while (i8 < i5) {
            VLC vlc3 = vlc2;
            int i9 = i6;
            int i10 = i7;
            do {
                int readVLC = vlc3.readVLC(bitReader2);
                int i11 = (readVLC >> 8) & 15;
                if (i11 == 0) {
                    i4 = 0;
                } else {
                    i4 = bitReader2.readNBit(i11);
                }
                VMUL4S(fArr, i10, fArr2, readVLC, i4, (float) this.sfs[i]);
                i10 += 4;
                i9 -= 4;
            } while (i9 > 0);
            i8++;
            i7 += 128;
        }
    }

    private void readBandType5And6(BitReader bitReader, float[] fArr, int i, int i2, int i3, float[] fArr2, VLC vlc2) {
        int i4 = this.group_len[i2];
        int[] iArr = this.swbOffset;
        int i5 = iArr[i3 + 1] - iArr[i3];
        int i6 = iArr[i3];
        int i7 = 0;
        while (i7 < i4) {
            BitReader bitReader2 = bitReader;
            VLC vlc3 = vlc2;
            int i8 = i5;
            int i9 = i6;
            do {
                VMUL2(fArr, i9, fArr2, vlc3.readVLC(bitReader2), (float) this.sfs[i]);
                i9 += 2;
                i8 -= 2;
            } while (i8 > 0);
            i7++;
            i6 += 128;
        }
    }

    private void readBandType7Through10(BitReader bitReader, float[] fArr, int i, int i2, int i3, float[] fArr2, VLC vlc2) {
        int i4;
        BitReader bitReader2 = bitReader;
        int i5 = this.group_len[i2];
        int[] iArr = this.swbOffset;
        int i6 = iArr[i3 + 1] - iArr[i3];
        int i7 = iArr[i3];
        int i8 = 0;
        while (i8 < i5) {
            VLC vlc3 = vlc2;
            int i9 = i6;
            int i10 = i7;
            do {
                int readVLC = vlc3.readVLC(bitReader2);
                int i11 = (readVLC >> 8) & 15;
                if (i11 == 0) {
                    i4 = 0;
                } else {
                    i4 = bitReader2.readNBit(i11) << (readVLC >> 12);
                }
                VMUL2S(fArr, i10, fArr2, readVLC, i4, (float) this.sfs[i]);
                i10 += 2;
                i9 -= 2;
            } while (i9 > 0);
            i8++;
            i7 += 128;
        }
    }

    private void readOther(BitReader bitReader, float[] fArr, int i, int i2, int i3, float[] fArr2, VLC vlc2) {
        int i4;
        BitReader bitReader2 = bitReader;
        int i5 = this.group_len[i2];
        int[] iArr = this.swbOffset;
        int i6 = iArr[i3 + 1] - iArr[i3];
        int i7 = iArr[i3];
        int i8 = 0;
        while (i8 < i5) {
            VLC vlc3 = vlc2;
            int i9 = i6;
            int i10 = i7;
            do {
                int readVLC = vlc3.readVLC(bitReader2);
                if (readVLC != 0) {
                    int i11 = readVLC >> 12;
                    int i12 = readVLC >> 8;
                    int readNBit = bitReader2.readNBit(i11) << (32 - i11);
                    int i13 = readVLC;
                    int i14 = i10;
                    for (int i15 = 0; i15 < 2; i15++) {
                        if (((1 << i15) & i12) != 0) {
                            int nZeros = ProresDecoder.nZeros(bitReader2.checkNBit(14) ^ -1);
                            if (nZeros <= 8) {
                                bitReader2.skip(nZeros + 1);
                                int i16 = nZeros + 4;
                                i4 = i14 + 1;
                                fArr[i14] = (float) (MathUtil.cubeRoot((1 << i16) + bitReader2.readNBit(i16)) | (readNBit & Integer.MIN_VALUE));
                                readNBit <<= 1;
                            } else {
                                throw new RuntimeException("error in spectral data, ESC overflow\n");
                            }
                        } else {
                            i4 = i14 + 1;
                            fArr[i14] = (float) (((int) fArr2[i13 & 15]) | (readNBit & Integer.MIN_VALUE));
                        }
                        i14 = i4;
                        i13 >>= 4;
                    }
                    i9 += 2;
                    i10 = i14 + 2;
                    continue;
                }
            } while (i9 > 0);
            i8++;
            i7 += 128;
        }
    }

    /* access modifiers changed from: 0000 */
    public void VMUL2(float[] fArr, int i, float[] fArr2, int i2, float f) {
        fArr[i] = fArr2[i2 & 15] * f;
        fArr[i + 1] = fArr2[(i2 >> 4) & 15] * f;
    }

    /* access modifiers changed from: 0000 */
    public void VMUL2S(float[] fArr, int i, float[] fArr2, int i2, int i3, float f) {
        fArr[i] = fArr2[i2 & 15] * f;
        fArr[i + 1] = fArr2[(i2 >> 4) & 15] * f;
    }

    /* access modifiers changed from: 0000 */
    public void VMUL4(float[] fArr, int i, float[] fArr2, int i2, float f) {
        fArr[i] = fArr2[i2 & 3] * f;
        fArr[i + 1] = fArr2[(i2 >> 2) & 3] * f;
        fArr[i + 2] = fArr2[(i2 >> 4) & 3] * f;
        fArr[i + 3] = fArr2[(i2 >> 6) & 3] * f;
    }

    /* access modifiers changed from: 0000 */
    public void VMUL4S(float[] fArr, int i, float[] fArr2, int i2, int i3, float f) {
        fArr[i + 0] = fArr2[i & 3] * f;
        fArr[i + 1] = fArr2[(i >> 2) & 3] * f;
        fArr[i + 2] = fArr2[(i >> 4) & 3] * f;
        fArr[i + 3] = fArr2[(i >> 6) & 3] * f;
    }

    public void parse(BitReader bitReader) {
        this.globalGain = bitReader.readNBit(8);
        if (!this.commonWindow && !this.scaleFlag) {
            parseICSInfo(bitReader);
        }
        decodeBandTypes(bitReader);
        decodeScalefactors(bitReader);
        if (!this.scaleFlag) {
            if (bitReader.read1Bit() != 0) {
                if (this.windowSequence != C15486b.EIGHT_SHORT_SEQUENCE.ordinal()) {
                    decodePulses(bitReader);
                } else {
                    throw new RuntimeException("Pulse tool not allowed in eight short sequence.");
                }
            }
            if (bitReader.read1Bit() != 0) {
                decodeTns(bitReader);
            }
            if (bitReader.read1Bit() != 0) {
                throw new RuntimeException("SSR is not supported");
            }
        }
        decodeSpectrum(bitReader);
    }

    /* access modifiers changed from: protected */
    public int parseICSInfo(BitReader bitReader) {
        bitReader.read1Bit();
        this.windowSequence = bitReader.readNBit(2);
        bitReader.read1Bit();
        this.num_window_groups = 1;
        this.group_len[0] = 1;
        if (this.windowSequence == C15486b.EIGHT_SHORT_SEQUENCE.ordinal()) {
            bitReader.readNBit(4);
            for (int i = 0; i < 7; i++) {
                if (bitReader.read1Bit() != 0) {
                    int[] iArr = this.group_len;
                    int i2 = this.num_window_groups - 1;
                    iArr[i2] = iArr[i2] + 1;
                } else {
                    this.num_window_groups++;
                    this.group_len[this.num_window_groups - 1] = 1;
                }
            }
            int[] iArr2 = AACTab.ff_aac_num_swb_128;
            int i3 = this.samplingIndex;
            this.numSwb = iArr2[i3];
            this.swbOffset = AACTab.ff_swb_offset_128[i3];
            this.numWindows = 8;
        } else {
            this.maxSfb = bitReader.readNBit(6);
            int[] iArr3 = AACTab.ff_aac_num_swb_1024;
            int i4 = this.samplingIndex;
            this.numSwb = iArr3[i4];
            this.swbOffset = AACTab.ff_swb_offset_1024[i4];
            this.numWindows = 1;
            if (bitReader.read1Bit() != 0) {
                Profile profile2 = this.profile;
                if (profile2 == Profile.MAIN) {
                    decodePrediction(bitReader, this.maxSfb);
                } else if (profile2 == Profile.LC) {
                    throw new RuntimeException("Prediction is not allowed in AAC-LC.\n");
                } else if (bitReader.read1Bit() != 0) {
                    decodeLtp(bitReader, this.maxSfb);
                }
            }
        }
        return 0;
    }
}
