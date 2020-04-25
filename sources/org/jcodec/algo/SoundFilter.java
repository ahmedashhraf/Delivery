package org.jcodec.algo;

import androidx.core.app.C0753l;
import androidx.core.p034l.C0986h;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.mrsool.utils.C11644i;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.common.AudioFormat;
import org.jcodec.containers.mps.MPSUtils;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class SoundFilter {
    public static final int[] linear = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, C13959t.f40819N1, C13959t.f40823O1, C13959t.f40827P1, 128, C13959t.f40835R1, C13959t.f40839S1, C13959t.f40843T1, C13959t.f40847U1, C13959t.f40851V1, C13959t.f40855W1, C13959t.f40859X1, C13959t.f40863Y1, C13959t.f40867Z1, C13959t.f40872a2, C13959t.f40877b2, C13959t.f40882c2, C13959t.f40887d2, C13959t.f40892e2, C13959t.f40897f2, C13959t.f40902g2, C13959t.f40907h2, C13959t.f40912i2, C13959t.f40917j2, C13959t.f40921k2, C13959t.f40925l2, C13959t.f40929m2, C13959t.f40933n2, C13959t.f40937o2, C13959t.f40941p2, C13959t.f40945q2, C13959t.f40949r2, C13959t.f40953s2, C13959t.f40957t2, C13959t.f40961u2, C13959t.f40965v2, C13959t.f40969w2, C13959t.f40973x2, C13959t.f40977y2, C13959t.f40981z2, C13959t.f40768A2, C13959t.f40772B2, C13959t.f40776C2, C13959t.f40780D2, C13959t.f40784E2, C13959t.f40788F2, C13959t.f40792G2, C13959t.f40796H2, C13959t.f40800I2, C13959t.f40804J2, C13959t.f40808K2, 175, C13959t.f40816M2, C13959t.f40820N2, 178, 179, 180, 181, C13959t.f40840S2, 183, 184, C13959t.f40852V2, C13959t.f40856W2, C13959t.f40860X2, C13959t.f40864Y2, C13959t.f40868Z2, 190, C13959t.f40878b3, 192, 193, 194, 195, JpegConst.DHT, C13959t.f40903g3, C13959t.f40908h3, C13959t.f40913i3, 200, 201, C15470v.f44665f, 203, 204, C15470v.f44668i, C15470v.f44669j, C15470v.f44670k, 208, JpegConst.RST1, JpegConst.RST2, JpegConst.RST3, JpegConst.RST4, JpegConst.RST5, JpegConst.RST6, 215, 216, 217, 218, JpegConst.DQT, 220, JpegConst.DRI, C11644i.f33366n0, 223, JpegConst.APP0, 225, JpegConst.APP2, JpegConst.APP3, JpegConst.APP4, JpegConst.APP5, JpegConst.APP6, JpegConst.APP7, JpegConst.APP8, JpegConst.APP9, JpegConst.APPA, JpegConst.APPB, JpegConst.APPC, JpegConst.APPD, JpegConst.APPE, JpegConst.APPF, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, C1750f.f6813c, 251, 252, 253, JpegConst.COM, 255, 256, C0986h.f4407i, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, RotationOptions.ROTATE_270, 271, 272, 273, TiffUtil.TIFF_TAG_ORIENTATION, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 290, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, C15470v.f44676q, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 358, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, C15470v.f44684y, C15470v.f44685z, C15470v.f44638A, 409, C15470v.f44640C, C15470v.f44641D, 412, C15470v.f44643F, C15470v.f44644G, C15470v.f44645H, C15470v.f44646I, C15470v.f44647J, 418, C15470v.f44648K, C15470v.f44649L, 421, 422, C15470v.f44651N, C15470v.f44652O, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, MPSUtils.PACK, 443, MPSUtils.PSM, MPSUtils.PRIVATE_1, 446, MPSUtils.PRIVATE_2, MPSUtils.AUDIO_MIN, 449, 450, 451, 452, 453, 454, 455, 456, 457, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, MPSUtils.AUDIO_MAX, MPSUtils.VIDEO_MIN, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, FacebookRequestErrorClassification.ESC_APP_INACTIVE, 494, MPSUtils.VIDEO_MAX, 496, 497, 498, 499, 500, C15470v.f44654Q, 502, 503, C15470v.f44657T, C15470v.f44658U, 506, C15470v.f44659V, 508, 509, 510, C0753l.f3451u};
    public static final int[] sine = {0, 1, 3, 4, 6, 7, 9, 10, 12, 14, 15, 17, 18, 20, 21, 23, 25, 26, 28, 29, 31, 32, 34, 36, 37, 39, 40, 42, 43, 45, 47, 48, 50, 51, 53, 54, 56, 57, 59, 61, 62, 64, 65, 67, 68, 70, 72, 73, 75, 76, 78, 79, 81, 82, 84, 85, 87, 89, 90, 92, 93, 95, 96, 98, 99, 101, 102, 104, 106, 107, 109, 110, 112, 113, 115, 116, 118, 119, 121, 122, 124, C13959t.f40819N1, C13959t.f40827P1, 128, C13959t.f40839S1, C13959t.f40847U1, C13959t.f40851V1, C13959t.f40859X1, C13959t.f40863Y1, C13959t.f40872a2, C13959t.f40877b2, C13959t.f40887d2, C13959t.f40892e2, C13959t.f40902g2, C13959t.f40907h2, C13959t.f40917j2, C13959t.f40921k2, C13959t.f40929m2, C13959t.f40933n2, C13959t.f40941p2, C13959t.f40945q2, C13959t.f40953s2, C13959t.f40957t2, C13959t.f40965v2, C13959t.f40969w2, C13959t.f40977y2, C13959t.f40981z2, C13959t.f40772B2, C13959t.f40776C2, C13959t.f40784E2, C13959t.f40788F2, C13959t.f40796H2, C13959t.f40800I2, C13959t.f40804J2, 175, C13959t.f40816M2, 178, 179, 181, C13959t.f40840S2, 184, C13959t.f40852V2, C13959t.f40860X2, C13959t.f40864Y2, 190, C13959t.f40878b3, 193, 194, 195, C13959t.f40903g3, C13959t.f40908h3, 200, 201, 203, 204, C15470v.f44669j, C15470v.f44670k, 208, JpegConst.RST2, JpegConst.RST3, JpegConst.RST5, JpegConst.RST6, 216, 217, 218, 220, JpegConst.DRI, 223, JpegConst.APP0, 225, JpegConst.APP3, JpegConst.APP4, JpegConst.APP6, JpegConst.APP7, JpegConst.APP9, JpegConst.APPA, JpegConst.APPB, JpegConst.APPD, JpegConst.APPE, JpegConst.APPF, 241, 242, 244, 245, 246, 248, 249, C1750f.f6813c, 252, 253, 255, 256, C0986h.f4407i, 259, 260, 261, 263, 264, 265, 267, 268, 269, 271, 272, 273, 275, 276, 277, 279, 280, 281, 283, 284, 285, 287, 288, 289, 290, 292, 293, 294, 296, 297, 298, 299, 301, 302, 303, 304, 306, 307, 308, 310, 311, 312, 313, 314, 316, 317, 318, 319, 321, 322, 323, 324, 326, 327, 328, 329, 330, 332, 333, 334, 335, 336, 337, 339, 340, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 342, 343, 345, 346, 347, 348, 349, 350, 351, 353, 354, 355, 356, 357, 358, 359, 360, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, C15470v.f44684y, C15470v.f44685z, C15470v.f44638A, 409, C15470v.f44640C, C15470v.f44641D, 412, C15470v.f44643F, C15470v.f44644G, C15470v.f44644G, C15470v.f44645H, C15470v.f44646I, C15470v.f44647J, 418, C15470v.f44648K, C15470v.f44649L, 421, 422, C15470v.f44651N, C15470v.f44651N, C15470v.f44652O, 425, 426, 427, 428, 429, 430, 430, 431, 432, 433, 434, 435, 435, 436, 437, 438, 439, 439, 440, 441, MPSUtils.PACK, 443, 443, MPSUtils.PSM, MPSUtils.PRIVATE_1, 446, MPSUtils.PRIVATE_2, MPSUtils.PRIVATE_2, MPSUtils.AUDIO_MIN, 449, 450, 450, 451, 452, 453, 453, 454, 455, 455, 456, 457, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 459, 460, 460, 461, 462, 462, 463, 464, 464, 465, 466, 466, 467, 468, 468, 469, 469, 470, 471, 471, 472, 473, 473, 474, 474, 475, 475, 476, 477, 477, 478, 478, MPSUtils.AUDIO_MAX, MPSUtils.AUDIO_MAX, MPSUtils.VIDEO_MIN, 481, 481, 482, 482, 483, 483, 484, 484, 485, 485, 486, 486, 487, 487, 488, 488, 489, 489, 489, 490, 490, 491, 491, 492, 492, FacebookRequestErrorClassification.ESC_APP_INACTIVE, FacebookRequestErrorClassification.ESC_APP_INACTIVE, FacebookRequestErrorClassification.ESC_APP_INACTIVE, 494, 494, MPSUtils.VIDEO_MAX, MPSUtils.VIDEO_MAX, MPSUtils.VIDEO_MAX, 496, 496, 497, 497, 497, 498, 498, 498, 499, 499, 499, 500, 500, 500, C15470v.f44654Q, C15470v.f44654Q, C15470v.f44654Q, 502, 502, 502, 503, 503, 503, 503, C15470v.f44657T, C15470v.f44657T, C15470v.f44657T, C15470v.f44657T, C15470v.f44658U, C15470v.f44658U, C15470v.f44658U, C15470v.f44658U, 506, 506, 506, 506, C15470v.f44659V, C15470v.f44659V, C15470v.f44659V, C15470v.f44659V, C15470v.f44659V, 508, 508, 508, 508, 508, 509, 509, 509, 509, 509, 509, 509, 510, 510, 510, 510, 510, 510, 510, 510, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u, C0753l.f3451u};

    /* renamed from: in */
    public static void m68607in(AudioFormat audioFormat, byte[] bArr, int[] iArr) {
        in16BitSignedLE(bArr, audioFormat.getChannels(), iArr);
    }

    public static void in16BitSignedLE(byte[] bArr, int i, int[] iArr) {
        int min = Math.min(bArr.length * i * 2, iArr.length);
        int i2 = 0;
        int i3 = 0;
        while (i2 < min) {
            int i4 = i3;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i4 + 1;
                short s = (short) ((((short) ((bArr[i4] & 255) | ((bArr[i6] & 255) << 8))) * iArr[i2]) >> 9);
                bArr[i4] = (byte) (s & 255);
                bArr[i6] = (byte) (s >> 8);
                i4 += 2;
            }
            i2++;
            i3 = i4;
        }
    }

    public static void out(AudioFormat audioFormat, byte[] bArr, int[] iArr) {
        out16BitSignedLE(bArr, audioFormat.getChannels(), iArr);
    }

    public static void out16BitSignedLE(byte[] bArr, int i, int[] iArr) {
        int min = Math.min(bArr.length * i * 2, iArr.length);
        int length = bArr.length - ((min * i) * 2);
        int i2 = 0;
        while (i2 < min) {
            int i3 = length;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = i3 + 1;
                short s = (short) ((((short) ((bArr[i3] & 255) | ((bArr[i5] & 255) << 8))) * iArr[(512 - i2) - 1]) >> 9);
                bArr[i3] = (byte) (s & 255);
                bArr[i5] = (byte) (s >> 8);
                i3 += 2;
            }
            i2++;
            length = i3;
        }
    }
}
