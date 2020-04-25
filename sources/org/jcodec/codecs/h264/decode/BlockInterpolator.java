package org.jcodec.codecs.h264.decode;

import org.jcodec.common.model.Picture;

public class BlockInterpolator {
    private static C15504g0[] safe = {new C15508k(), new C15519v(), new C15523z(), new C15492a0(), new C15494b0(), new C15496c0(), new C15498d0(), new C15500e0(), new C15502f0(), new C15491a(), new C15493b(), new C15495c(), new C15497d(), new C15499e(), new C15501f(), new C15503g()};
    private static int[] tmp1 = new int[1024];
    private static C15504g0[] unsafe = {new C15505h(), new C15506i(), new C15507j(), new C15509l(), new C15510m(), new C15511n(), new C15512o(), new C15513p(), new C15514q(), new C15515r(), new C15516s(), new C15517t(), new C15518u(), new C15520w(), new C15521x(), new C15522y()};

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$a */
    static class C15491a implements C15504g0 {
        C15491a() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma12(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$a0 */
    static class C15492a0 implements C15504g0 {
        C15492a0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma30(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$b */
    static class C15493b implements C15504g0 {
        C15493b() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma22(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$b0 */
    static class C15494b0 implements C15504g0 {
        C15494b0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma01(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$c */
    static class C15495c implements C15504g0 {
        C15495c() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma32(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$c0 */
    static class C15496c0 implements C15504g0 {
        C15496c0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma11(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$d */
    static class C15497d implements C15504g0 {
        C15497d() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma03(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$d0 */
    static class C15498d0 implements C15504g0 {
        C15498d0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma21(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$e */
    static class C15499e implements C15504g0 {
        C15499e() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma13(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$e0 */
    static class C15500e0 implements C15504g0 {
        C15500e0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma31(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$f */
    static class C15501f implements C15504g0 {
        C15501f() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma23(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$f0 */
    static class C15502f0 implements C15504g0 {
        C15502f0() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma02(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$g */
    static class C15503g implements C15504g0 {
        C15503g() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma33(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$g0 */
    private interface C15504g0 {
        /* renamed from: a */
        void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8);
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$h */
    static class C15505h implements C15504g0 {
        C15505h() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma00Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$i */
    static class C15506i implements C15504g0 {
        C15506i() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma10Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$j */
    static class C15507j implements C15504g0 {
        C15507j() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma20Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$k */
    static class C15508k implements C15504g0 {
        C15508k() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma00(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$l */
    static class C15509l implements C15504g0 {
        C15509l() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma30Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$m */
    static class C15510m implements C15504g0 {
        C15510m() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma01Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$n */
    static class C15511n implements C15504g0 {
        C15511n() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma11Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$o */
    static class C15512o implements C15504g0 {
        C15512o() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma21Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$p */
    static class C15513p implements C15504g0 {
        C15513p() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma31Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$q */
    static class C15514q implements C15504g0 {
        C15514q() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma02Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$r */
    static class C15515r implements C15504g0 {
        C15515r() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma12Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$s */
    static class C15516s implements C15504g0 {
        C15516s() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma22Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$t */
    static class C15517t implements C15504g0 {
        C15517t() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma32Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$u */
    static class C15518u implements C15504g0 {
        C15518u() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma03Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$v */
    static class C15519v implements C15504g0 {
        C15519v() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma10(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$w */
    static class C15520w implements C15504g0 {
        C15520w() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma13Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$x */
    static class C15521x implements C15504g0 {
        C15521x() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma23Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$y */
    static class C15522y implements C15504g0 {
        C15522y() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma33Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: org.jcodec.codecs.h264.decode.BlockInterpolator$z */
    static class C15523z implements C15504g0 {
        C15523z() {
        }

        /* renamed from: a */
        public void mo47944a(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
            BlockInterpolator.getLuma20(iArr, i, iArr2, i3, i4, i5, i6, i7, i8);
        }
    }

    public static void getBlockChroma(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i5 & 7;
        int i10 = i6 & 7;
        int i11 = i5 >> 3;
        int i12 = i6 >> 3;
        if (i11 < 0 || i11 > (i - i7) - 1 || i12 < 0 || i12 > (i2 - i8) - 1) {
            if (i9 == 0 && i10 == 0) {
                getChroma00Unsafe(iArr, i, i2, iArr2, i3, i4, i11, i12, i7, i8);
            } else if (i10 == 0) {
                getChromaX0Unsafe(iArr, i, i2, iArr2, i3, i4, i11, i12, i9, i7, i8);
            } else if (i9 == 0) {
                getChroma0XUnsafe(iArr, i, i2, iArr2, i3, i4, i11, i12, i10, i7, i8);
            } else {
                getChromaXXUnsafe(iArr, i, i2, iArr2, i3, i4, i11, i12, i9, i10, i7, i8);
            }
        } else if (i9 == 0 && i10 == 0) {
            getChroma00(iArr, i, i2, iArr2, i3, i4, i11, i12, i7, i8);
        } else if (i10 == 0) {
            getChromaX0(iArr, i, i2, iArr2, i3, i4, i11, i12, i9, i7, i8);
        } else if (i9 == 0) {
            getChroma0X(iArr, i, i2, iArr2, i3, i4, i11, i12, i10, i7, i8);
        } else {
            getChromaXX(iArr, i, i2, iArr2, i3, i4, i11, i12, i9, i10, i7, i8);
        }
    }

    public static void getBlockLuma(Picture picture, Picture picture2, int i, int i2, int i3, int i4, int i5) {
        Picture picture3 = picture2;
        int i6 = i2 & 3;
        int i7 = i3 & 3;
        int i8 = i2 >> 2;
        int i9 = i3 >> 2;
        if (i8 < 2 || i9 < 2 || i8 > (picture.getWidth() - i4) - 5 || i9 > (picture.getHeight() - i5) - 5) {
            unsafe[(i7 << 2) + i6].mo47944a(picture.getData()[0], picture.getWidth(), picture.getHeight(), picture3.getPlaneData(0), i, picture3.getPlaneWidth(0), i8, i9, i4, i5);
            return;
        }
        safe[(i7 << 2) + i6].mo47944a(picture.getData()[0], picture.getWidth(), picture.getHeight(), picture3.getPlaneData(0), i, picture3.getPlaneWidth(0), i8, i9, i4, i5);
    }

    private static void getChroma00(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = (i6 * i) + i5;
        for (int i10 = 0; i10 < i8; i10++) {
            System.arraycopy(iArr, i9, iArr2, i3, i7);
            i9 += i;
            i3 += i4;
        }
    }

    private static void getChroma00Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i13 + i6) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                iArr2[i11 + i15] = iArr[iClip3(0, i10, i5 + i15) + iClip3];
            }
            i11 += i4;
        }
    }

    private static void getChroma0X(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i6;
        int i11 = (i10 * i) + i5;
        int i12 = 8 - i7;
        int i13 = i3;
        int i14 = (i10 < i2 + -1 ? i : 0) + i11;
        int i15 = i11;
        int i16 = i9;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i8;
            for (int i19 = 0; i19 < i18; i19++) {
                iArr2[i13 + i19] = (((iArr[i15 + i19] * i12) + (iArr[i14 + i19] * i7)) + 4) >> 3;
            }
            i15 += i;
            i14 += i;
            i13 += i4;
        }
    }

    private static void getChroma0XUnsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i - 1;
        int i11 = i2 - 1;
        int i12 = 8 - i7;
        int i13 = i3;
        int i14 = i9;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i6 + i15;
            int iClip3 = iClip3(0, i11, i16) * i;
            int iClip32 = iClip3(0, i11, i16 + 1) * i;
            int i17 = i8;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i5 + i18;
                iArr2[i13 + i18] = (((iArr[iClip3(0, i10, i19) + iClip3] * i12) + (iArr[iClip3(0, i10, i19) + iClip32] * i7)) + 4) >> 3;
            }
            i13 += i4;
        }
    }

    private static void getChromaX0(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i5;
        int i11 = (i6 * i) + i10;
        int i12 = 8 - i7;
        int i13 = i3;
        int i14 = (i10 < i + -1 ? 1 : 0) + i11;
        int i15 = i11;
        int i16 = i9;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i8;
            for (int i19 = 0; i19 < i18; i19++) {
                iArr2[i13 + i19] = (((iArr[i15 + i19] * i12) + (iArr[i14 + i19] * i7)) + 4) >> 3;
            }
            i15 += i;
            i14 += i;
            i13 += i4;
        }
    }

    private static void getChromaX0Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = 8 - i7;
        int i11 = i - 1;
        int i12 = i2 - 1;
        int i13 = i3;
        int i14 = i9;
        for (int i15 = 0; i15 < i14; i15++) {
            int i16 = i8;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = i6 + i15;
                int i19 = i5 + i17;
                iArr2[i13 + i17] = (((iArr[(iClip3(0, i12, i18) * i) + iClip3(0, i11, i19)] * i10) + (iArr[(iClip3(0, i12, i18) * i) + iClip3(0, i11, i19 + 1)] * i7)) + 4) >> 3;
            }
            i13 += i4;
        }
    }

    private static void getChromaXX(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i5;
        int i12 = i6;
        int i13 = (i12 * i) + i11;
        int i14 = 1;
        int i15 = (i12 < i2 + -1 ? i : 0) + i13;
        if (i11 >= i - 1) {
            i14 = 0;
        }
        int i16 = i14 + i13;
        int i17 = 8 - i7;
        int i18 = 8 - i8;
        int i19 = i3;
        int i20 = (i16 + i15) - i13;
        int i21 = i16;
        int i22 = i10;
        int i23 = i15;
        for (int i24 = 0; i24 < i22; i24++) {
            int i25 = i9;
            for (int i26 = 0; i26 < i25; i26++) {
                iArr2[i19 + i26] = ((((((i17 * i18) * iArr[i13 + i26]) + ((i7 * i18) * iArr[i21 + i26])) + ((i17 * i8) * iArr[i23 + i26])) + ((i7 * i8) * iArr[i20 + i26])) + 32) >> 6;
            }
            i19 += i4;
            i13 += i;
            i23 += i;
            i21 += i;
            i20 += i;
        }
    }

    private static void getChromaXXUnsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        int i11 = i2 - 1;
        int i12 = i - 1;
        int i13 = 8 - i7;
        int i14 = 8 - i8;
        int i15 = i3;
        int i16 = i10;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i9;
            for (int i19 = 0; i19 < i18; i19++) {
                int i20 = i6 + i17;
                int i21 = i5 + i19;
                int iClip3 = (iClip3(0, i11, i20) * i) + iClip3(0, i12, i21);
                int i22 = i20 + 1;
                int iClip32 = (iClip3(0, i11, i22) * i) + iClip3(0, i12, i21);
                int i23 = i21 + 1;
                iArr2[i15 + i19] = ((((((i13 * i14) * iArr[iClip3]) + ((i7 * i14) * iArr[(iClip3(0, i11, i20) * i) + iClip3(0, i12, i23)])) + ((i13 * i8) * iArr[iClip32])) + ((i7 * i8) * iArr[(iClip3(0, i11, i22) * i) + iClip3(0, i12, i23)])) + 32) >> 6;
            }
            i15 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma00(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i5 * i) + i4;
        for (int i9 = 0; i9 < i7; i9++) {
            System.arraycopy(iArr, i8, iArr2, i2, i6);
            i8 += i;
            i2 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma00Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i13 + i6) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                iArr2[i11 + i15] = iArr[iClip3(0, i10, i5 + i15) + iClip3];
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma01(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma02(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        int i8 = (i5 * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = i9 + i11;
                iArr2[i12] = ((iArr2[i12] + iArr[i8 + i11]) + 1) >> 1;
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma01Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        getLuma02Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i6 + i13) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i11 + i15;
                iArr2[i16] = ((iArr2[i16] + iArr[iClip3(0, i10, i5 + i15) + iClip3]) + 1) >> 1;
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma02(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma02NoRound(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        for (int i8 = 0; i8 < i7; i8++) {
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = i2 + i9;
                iArr2[i10] = iClip3(0, 255, (iArr2[i10] + 16) >> 5);
            }
            i2 += i3;
        }
    }

    private static void getLuma02NoRound(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = ((i5 - 2) * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = i8 + i11;
                iArr2[i9 + i11] = ((iArr[i12] + iArr[(i * 5) + i12]) - ((iArr[i12 + i] + iArr[(i * 4) + i12]) * 5)) + ((iArr[(i * 2) + i12] + iArr[i12 + (i * 3)]) * 20);
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma02Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getLuma02UnsafeNoRound(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        for (int i9 = 0; i9 < i8; i9++) {
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = i3 + i10;
                iArr2[i11] = iClip3(0, 255, (iArr2[i11] + 16) >> 5);
            }
            i3 += i4;
        }
    }

    private static void getLuma02UnsafeNoRound(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i6 + i13;
            int iClip3 = iClip3(0, i9, i14 - 2) * i;
            int iClip32 = iClip3(0, i9, i14 - 1) * i;
            int iClip33 = iClip3(0, i9, i14) * i;
            int iClip34 = iClip3(0, i9, i14 + 1) * i;
            int iClip35 = iClip3(0, i9, i14 + 2) * i;
            int iClip36 = iClip3(0, i9, i14 + 3) * i;
            int i15 = i7;
            for (int i16 = 0; i16 < i15; i16++) {
                int iClip37 = iClip3(0, i10, i5 + i16);
                iArr2[i11 + i16] = ((iArr[iClip37 + iClip3] + iArr[iClip37 + iClip36]) - ((iArr[iClip37 + iClip32] + iArr[iClip37 + iClip35]) * 5)) + ((iArr[iClip37 + iClip33] + iArr[iClip37 + iClip34]) * 20);
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma03(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma02(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        int i8 = (i5 * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = i9 + i11;
                iArr2[i12] = ((iArr2[i12] + iArr[(i8 + i11) + i]) + 1) >> 1;
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma03Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        getLuma02Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i6 + i13 + 1) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i11 + i15;
                iArr2[i16] = ((iArr2[i16] + iArr[iClip3(0, i10, i5 + i15) + iClip3]) + 1) >> 1;
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma10(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma20(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        int i8 = (i5 * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = i9 + i11;
                iArr2[i12] = ((iArr2[i12] + iArr[i8 + i11]) + 1) >> 1;
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma10Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        getLuma20Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i13 + i6) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i11 + i15;
                iArr2[i16] = ((iArr2[i16] + iArr[iClip3(0, i10, i5 + i15) + iClip3]) + 1) >> 1;
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma11(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma20(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        getLuma02(iArr, i, tmp1, 0, i6, i4, i5, i6, i7);
        int[] iArr3 = iArr2;
        int i8 = i2;
        int i9 = i3;
        mergeCrap(iArr2, i2, i3, i6, i7);
    }

    /* access modifiers changed from: private */
    public static void getLuma11Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getLuma20Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        getLuma02Unsafe(iArr, i, i2, tmp1, 0, i7, i5, i6, i7, i8);
        int[] iArr3 = iArr2;
        int i9 = i3;
        int i10 = i4;
        mergeCrap(iArr2, i3, i4, i7, i8);
    }

    /* access modifiers changed from: private */
    public static void getLuma12(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i8 + 7;
        int i10 = 2;
        int i11 = i7;
        getLuma02NoRound(iArr, i, tmp1, 0, i9, i4 - 2, i5, i9, i11);
        int i12 = i2;
        getLuma20NoRound(tmp1, i9, iArr2, i12, i3, 2, 0, i6, i11);
        int i13 = i7;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = i12 + i15;
                iArr2[i16] = ((iClip3(0, 255, (iArr2[i16] + 512) >> 10) + iClip3(0, 255, (tmp1[i10 + i15] + 16) >> 5)) + 1) >> 1;
            }
            i12 += i3;
            i10 += i9;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma12Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7;
        int i10 = i9 + 7;
        int i11 = 2;
        getLuma02UnsafeNoRound(iArr, i, i2, tmp1, 0, i10, i5 - 2, i6, i10, i8);
        int i12 = i3;
        getLuma20NoRound(tmp1, i10, iArr2, i12, i4, 2, 0, i7, i8);
        int i13 = i8;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = i12 + i15;
                iArr2[i16] = ((iClip3(0, 255, (iArr2[i16] + 512) >> 10) + iClip3(0, 255, (tmp1[i11 + i15] + 16) >> 5)) + 1) >> 1;
            }
            i12 += i4;
            i11 += i10;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma13(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int[] iArr3 = iArr;
        int i8 = i;
        int i9 = i4;
        int i10 = i6;
        int i11 = i7;
        getLuma20(iArr3, i8, iArr2, i2, i3, i9, i5 + 1, i10, i11);
        getLuma02(iArr3, i8, tmp1, 0, i6, i9, i5, i10, i11);
        int[] iArr4 = iArr2;
        int i12 = i2;
        int i13 = i3;
        mergeCrap(iArr2, i2, i3, i6, i7);
    }

    /* access modifiers changed from: private */
    public static void getLuma13Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr3 = iArr;
        int i9 = i;
        int i10 = i2;
        int i11 = i5;
        int i12 = i7;
        int i13 = i8;
        getLuma20Unsafe(iArr3, i9, i10, iArr2, i3, i4, i11, i6 + 1, i12, i13);
        getLuma02Unsafe(iArr3, i9, i10, tmp1, 0, i7, i11, i6, i12, i13);
        int[] iArr4 = iArr2;
        int i14 = i3;
        int i15 = i4;
        mergeCrap(iArr2, i3, i4, i7, i8);
    }

    /* access modifiers changed from: private */
    public static void getLuma20(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma20NoRound(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        for (int i8 = 0; i8 < i7; i8++) {
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = i2 + i9;
                iArr2[i10] = iClip3(0, 255, (iArr2[i10] + 16) >> 5);
            }
            i2 += i3;
        }
    }

    private static void getLuma20NoRound(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = (i5 * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = -2;
            for (int i12 = 0; i12 < i6; i12++) {
                int i13 = i8 + i11;
                i11++;
                iArr2[i9 + i12] = ((iArr[i13] + iArr[i13 + 5]) - ((iArr[i13 + 1] + iArr[i13 + 4]) * 5)) + ((iArr[i13 + 2] + iArr[i13 + 3]) * 20);
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma20Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getLuma20UnsafeNoRound(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = i3;
            for (int i11 = 0; i11 < i8; i11++) {
                int i12 = i10 + i9;
                iArr2[i12] = iClip3(0, 255, (iArr2[i12] + 16) >> 5);
                i10 += i4;
            }
        }
    }

    private static void getLuma20UnsafeNoRound(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i - 1;
        int i10 = i2 - 1;
        int i11 = i7;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i5 + i12;
            int iClip3 = iClip3(0, i9, i13 - 2);
            int iClip32 = iClip3(0, i9, i13 - 1);
            int iClip33 = iClip3(0, i9, i13);
            int iClip34 = iClip3(0, i9, i13 + 1);
            int iClip35 = iClip3(0, i9, i13 + 2);
            int iClip36 = iClip3(0, i9, i13 + 3);
            int i14 = i3;
            int i15 = i8;
            for (int i16 = 0; i16 < i15; i16++) {
                int iClip37 = iClip3(0, i10, i16 + i6) * i;
                iArr2[i14 + i12] = ((iArr[iClip37 + iClip3] + iArr[iClip37 + iClip36]) - ((iArr[iClip37 + iClip32] + iArr[iClip37 + iClip35]) * 5)) + ((iArr[iClip37 + iClip33] + iArr[iClip37 + iClip34]) * 20);
                i14 += i4;
            }
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma21(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i7;
        int i10 = i6;
        getLuma20NoRound(iArr, i, tmp1, 0, i6, i4, i5 - 2, i10, i9 + 7);
        getLuma02NoRound(tmp1, i6, iArr2, i2, i3, 0, 2, i10, i7);
        int i11 = i2;
        int i12 = i8 << 1;
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = i11 + i14;
                iArr2[i15] = ((iClip3(0, 255, (iArr2[i15] + 512) >> 10) + iClip3(0, 255, (tmp1[i12 + i14] + 16) >> 5)) + 1) >> 1;
            }
            i11 += i3;
            i12 += i8;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma21Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7;
        int i10 = i8;
        getLuma20UnsafeNoRound(iArr, i, i2, tmp1, 0, i7, i5, i6 - 2, i7, i10 + 7);
        getLuma02NoRound(tmp1, i7, iArr2, i3, i4, 0, 2, i7, i8);
        int i11 = i3;
        int i12 = i9 << 1;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = 0; i14 < i9; i14++) {
                int i15 = i11 + i14;
                iArr2[i15] = ((iClip3(0, 255, (iArr2[i15] + 512) >> 10) + iClip3(0, 255, (tmp1[i12 + i14] + 16) >> 5)) + 1) >> 1;
            }
            i11 += i4;
            i12 += i9;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma22(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i7;
        int i9 = i6;
        getLuma20NoRound(iArr, i, tmp1, 0, i6, i4, i5 - 2, i9, i8 + 7);
        getLuma02NoRound(tmp1, i6, iArr2, i2, i3, 0, 2, i9, i7);
        int i10 = i2;
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = i6;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i10 + i13;
                iArr2[i14] = iClip3(0, 255, (iArr2[i14] + 512) >> 10);
            }
            i10 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma22Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i8;
        getLuma20UnsafeNoRound(iArr, i, i2, tmp1, 0, i7, i5, i6 - 2, i7, i9 + 7);
        getLuma02NoRound(tmp1, i7, iArr2, i3, i4, 0, 2, i7, i8);
        int i10 = i3;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = i7;
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = i10 + i13;
                iArr2[i14] = iClip3(0, 255, (iArr2[i14] + 512) >> 10);
            }
            i10 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma23(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i7;
        int i10 = i6;
        getLuma20NoRound(iArr, i, tmp1, 0, i6, i4, i5 - 2, i10, i9 + 7);
        getLuma02NoRound(tmp1, i6, iArr2, i2, i3, 0, 2, i10, i7);
        int i11 = i2;
        int i12 = i8 << 1;
        for (int i13 = 0; i13 < i9; i13++) {
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = i11 + i14;
                iArr2[i15] = ((iClip3(0, 255, (iArr2[i15] + 512) >> 10) + iClip3(0, 255, (tmp1[(i12 + i14) + i8] + 16) >> 5)) + 1) >> 1;
            }
            i11 += i3;
            i12 += i8;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma23Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7;
        int i10 = i8;
        getLuma20UnsafeNoRound(iArr, i, i2, tmp1, 0, i7, i5, i6 - 2, i7, i10 + 7);
        getLuma02NoRound(tmp1, i7, iArr2, i3, i4, 0, 2, i7, i8);
        int i11 = i3;
        int i12 = i9 << 1;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = 0; i14 < i9; i14++) {
                int i15 = i11 + i14;
                iArr2[i15] = ((iClip3(0, 255, (iArr2[i15] + 512) >> 10) + iClip3(0, 255, (tmp1[(i12 + i14) + i9] + 16) >> 5)) + 1) >> 1;
            }
            i11 += i4;
            i12 += i9;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma30(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma20(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        int i8 = (i5 * i) + i4;
        int i9 = i2;
        for (int i10 = 0; i10 < i7; i10++) {
            for (int i11 = 0; i11 < i6; i11++) {
                int i12 = i9 + i11;
                iArr2[i12] = ((iArr[(i8 + i11) + 1] + iArr2[i12]) + 1) >> 1;
            }
            i8 += i;
            i9 += i3;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma30Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i2 - 1;
        int i10 = i - 1;
        getLuma20Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        int i11 = i3;
        int i12 = i8;
        for (int i13 = 0; i13 < i12; i13++) {
            int iClip3 = iClip3(0, i9, i13 + i6) * i;
            int i14 = i7;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = i11 + i15;
                iArr2[i16] = ((iArr2[i16] + iArr[iClip3(0, i10, (i5 + i15) + 1) + iClip3]) + 1) >> 1;
            }
            i11 += i4;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma31(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        getLuma20(iArr, i, iArr2, i2, i3, i4, i5, i6, i7);
        getLuma02(iArr, i, tmp1, 0, i6, i4 + 1, i5, i6, i7);
        int[] iArr3 = iArr2;
        int i8 = i2;
        int i9 = i3;
        mergeCrap(iArr2, i2, i3, i6, i7);
    }

    /* access modifiers changed from: private */
    public static void getLuma31Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getLuma20Unsafe(iArr, i, i2, iArr2, i3, i4, i5, i6, i7, i8);
        getLuma02Unsafe(iArr, i, i2, tmp1, 0, i7, i5 + 1, i6, i7, i8);
        int[] iArr3 = iArr2;
        int i9 = i3;
        int i10 = i4;
        mergeCrap(iArr2, i3, i4, i7, i8);
    }

    /* access modifiers changed from: private */
    public static void getLuma32(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i6;
        int i9 = i8 + 7;
        int i10 = 2;
        int i11 = i7;
        getLuma02NoRound(iArr, i, tmp1, 0, i9, i4 - 2, i5, i9, i11);
        int i12 = i2;
        getLuma20NoRound(tmp1, i9, iArr2, i12, i3, 2, 0, i6, i11);
        int i13 = i7;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i8; i15++) {
                int i16 = i12 + i15;
                iArr2[i16] = ((iClip3(0, 255, (iArr2[i16] + 512) >> 10) + iClip3(0, 255, (tmp1[(i10 + i15) + 1] + 16) >> 5)) + 1) >> 1;
            }
            i12 += i3;
            i10 += i9;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma32Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i7;
        int i10 = i9 + 7;
        int i11 = 2;
        getLuma02UnsafeNoRound(iArr, i, i2, tmp1, 0, i10, i5 - 2, i6, i10, i8);
        int i12 = i3;
        getLuma20NoRound(tmp1, i10, iArr2, i12, i4, 2, 0, i7, i8);
        int i13 = i8;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i9; i15++) {
                int i16 = i12 + i15;
                iArr2[i16] = ((iClip3(0, 255, (iArr2[i16] + 512) >> 10) + iClip3(0, 255, (tmp1[(i11 + i15) + 1] + 16) >> 5)) + 1) >> 1;
            }
            i12 += i4;
            i11 += i10;
        }
    }

    /* access modifiers changed from: private */
    public static void getLuma33(int[] iArr, int i, int[] iArr2, int i2, int i3, int i4, int i5, int i6, int i7) {
        int[] iArr3 = iArr;
        int i8 = i;
        int i9 = i6;
        int i10 = i7;
        getLuma20(iArr3, i8, iArr2, i2, i3, i4, i5 + 1, i9, i10);
        getLuma02(iArr3, i8, tmp1, 0, i6, i4 + 1, i5, i9, i10);
        int[] iArr4 = iArr2;
        int i11 = i2;
        int i12 = i3;
        mergeCrap(iArr2, i2, i3, i6, i7);
    }

    /* access modifiers changed from: private */
    public static void getLuma33Unsafe(int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int[] iArr3 = iArr;
        int i9 = i;
        int i10 = i2;
        int i11 = i7;
        int i12 = i8;
        getLuma20Unsafe(iArr3, i9, i10, iArr2, i3, i4, i5, i6 + 1, i11, i12);
        getLuma02Unsafe(iArr3, i9, i10, tmp1, 0, i7, i5 + 1, i6, i11, i12);
        int[] iArr4 = iArr2;
        int i13 = i3;
        int i14 = i4;
        mergeCrap(iArr2, i3, i4, i7, i8);
    }

    private static int iClip3(int i, int i2, int i3) {
        return i3 < i ? i : i3 > i2 ? i2 : i3;
    }

    private static void mergeCrap(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            for (int i8 = 0; i8 < i3; i8++) {
                int i9 = i5 + i8;
                iArr[i9] = ((iArr[i9] + tmp1[i6 + i8]) + 1) >> 1;
            }
            i5 += i2;
            i6 += i3;
        }
    }
}
