package com.google.zxing.p350z.p354g;

import androidx.core.app.C0753l;
import androidx.core.p034l.C0986h;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.WriterException;
import com.google.zxing.p350z.C9161a;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable;
import com.mrsool.p423v.C11718b;
import com.mrsool.utils.C11644i;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.containers.mps.MPSUtils;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.zxing.z.g.f */
/* compiled from: PDF417ErrorCorrection */
final class C9187f {

    /* renamed from: a */
    private static final int[][] f24152a = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{JpegConst.APPD, 308, 436, 284, 646, 653, 428, 379}, new int[]{TiffUtil.TIFF_TAG_ORIENTATION, 562, JpegConst.APP8, 755, 599, 524, 801, C13959t.f40847U1, 295, 116, MPSUtils.PACK, 428, 295, 42, C13959t.f40816M2, 65}, new int[]{361, 575, 922, 525, C13959t.f40816M2, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, C13959t.f40917j2, 593, MaterialMenuDrawable.DEFAULT_TRANSFORM_DURATION, 571, 320, 803, C13959t.f40851V1, JpegConst.APP7, 390, 685, 330, 63, C15470v.f44640C}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, C15470v.f44658U, 733, C11644i.f33430v0, 381, C11718b.f33924p, 723, 476, 462, C13959t.f40800I2, 430, 609, 858, 822, 543, 376, C0753l.f3451u, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, C13959t.f40961u2, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, MPSUtils.PSM, 400, 925, 749, C15470v.f44645H, 822, 93, 217, 208, C9161a.f24031b, 244, 583, 620, 246, C13959t.f40921k2, MPSUtils.PRIVATE_2, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, JpegConst.DQT, C13959t.f40835R1, C13959t.f40856W2, JpegConst.APPC, 287, 192, 775, 278, C13959t.f40804J2, 40, 379, 712, 463, 646, 776, C13959t.f40796H2, 491, 297, 763, C13959t.f40953s2, 732, 95, RotationOptions.ROTATE_270, MPSUtils.PRIVATE_2, 90, C15470v.f44659V, 48, JpegConst.APP4, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, C13959t.f40957t2, 374, 242, 726, C14330v.f42355w, 269, 375, 898, 845, 454, 354, C13959t.f40839S1, 814, 587, 804, 34, JpegConst.RST3, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, C1750f.f6813c, 905, 786, C13959t.f40872a2, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, C13959t.f40867Z1, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, C0986h.f4407i, 284, 549, JpegConst.RST1, 884, 315, 70, 329, 793, 490, TiffUtil.TIFF_TAG_ORIENTATION, C11644i.f33430v0, C13959t.f40977y2, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, C0753l.f3451u, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, C13959t.f40863Y1, 538, 906, 90, 2, 290, 743, C13959t.f40913i3, 655, 903, 329, 49, 802, 580, 355, 588, C13959t.f40864Y2, 462, 10, C13959t.f40855W1, 628, 320, MPSUtils.AUDIO_MAX, C13959t.f40839S1, 739, 71, 263, 318, 374, 601, 192, 605, C13959t.f40892e2, 673, 687, JpegConst.APPA, 722, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, C13959t.f40820N2, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, JpegConst.APP7, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, C13959t.f40902g2, 500, JpegConst.APPE, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, C13959t.f40823O1, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, JpegConst.APP4, 749, 760, JpegConst.RST5, 54, 297, C13959t.f40855W1, 54, 834, 299, 922, C13959t.f40878b3, 910, 532, 609, 829, C13959t.f40868Z2, 20, C13959t.f40780D2, 29, 872, 449, 83, 402, 41, 656, C15470v.f44658U, 579, 481, C13959t.f40804J2, 404, 251, 688, 95, 497, C11644i.f33374o0, 642, 543, 307, C13959t.f40965v2, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, C15470v.f44657T, 35, 599, 428, C15470v.f44670k, 409, 574, 118, 498, 285, 380, 350, 492, C13959t.f40903g3, 265, 920, C13959t.f40949r2, 914, 299, JpegConst.APP5, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, C11644i.f33382p0, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, C15470v.f44638A, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, MaterialMenuDrawable.DEFAULT_TRANSFORM_DURATION, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, C15470v.f44685z, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, C13959t.f40892e2, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, C0986h.f4408j, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, C13959t.f40784E2, 190, 826, 328, 596, 786, 303, 570, 381, C15470v.f44645H, 641, C13959t.f40953s2, JpegConst.APPD, C13959t.f40933n2, 429, 531, C15470v.f44670k, 676, 710, 89, C13959t.f40784E2, 304, 402, 40, 708, 575, C13959t.f40977y2, 864, JpegConst.APP5, 65, 861, 841, 512, C13959t.f40768A2, 477, JpegConst.DRI, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, C13959t.f40937o2, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, C13959t.f40780D2, 342, 244, C13959t.f40804J2, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, C11644i.f33390q0, 475, 850, 764, 364, 578, 911, 283, 711, 472, C15470v.f44649L, 245, 288, 594, 394, C0753l.f3451u, 327, 589, C11644i.f33390q0, 699, 688, 43, C15470v.f44638A, 842, 383, 721, 521, 560, 644, 714, 559, 62, C13959t.f40907h2, 873, 663, 713, C13959t.f40965v2, 672, 729, 624, 59, 193, C15470v.f44647J, C13959t.f40961u2, JpegConst.RST1, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, C15470v.f44640C, 579, 870, 617, 841, 632, 860, 289, 536, 35, C11644i.f33390q0, 618, 586, C15470v.f44652O, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, C15470v.f44685z, 369, 54, 492, JpegConst.APP4, 613, 830, 922, 437, 519, 644, 905, 789, C15470v.f44649L, C15470v.f44676q, 441, C15470v.f44670k, 300, 892, 827, C13959t.f40887d2, 537, 381, 662, C0986h.f4408j, 56, 252, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 242, 797, 838, 837, 720, JpegConst.APP0, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, JpegConst.RST2, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, C13959t.f40977y2, 498, 308, C13959t.f40949r2, 422, 907, 817, C13959t.f40860X2, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, C15470v.f44652O, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, MPSUtils.PRIVATE_2, C13959t.f40796H2, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, C13959t.f40855W1, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, C13959t.f40872a2, 646, C15470v.f44641D, C11644i.f33430v0, 669, C13959t.f40887d2, 919, 45, 780, C15470v.f44685z, C13959t.f40768A2, 332, 899, C13959t.f40772B2, 726, C14330v.f42355w, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, C15470v.f44640C, 389, 244, 31, 121, 303, 263}};

    private C9187f() {
    }

    /* renamed from: a */
    static int m42986a(int i) {
        if (i >= 0 && i <= 8) {
            return 1 << (i + 1);
        }
        throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
    }

    /* renamed from: b */
    static int m42988b(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        } else if (i <= 40) {
            return 2;
        } else {
            if (i <= 160) {
                return 3;
            }
            if (i <= 320) {
                return 4;
            }
            if (i <= 863) {
                return 5;
            }
            throw new WriterException("No recommendation possible");
        }
    }

    /* renamed from: a */
    static String m42987a(CharSequence charSequence, int i) {
        int a = m42986a(i);
        char[] cArr = new char[a];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = a - 1;
            int charAt = (charSequence.charAt(i2) + cArr[i3]) % C9161a.f24030a;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((f24152a[i][i3] * charAt) % C9161a.f24030a))) % C9161a.f24030a);
                i3--;
            }
            cArr[0] = (char) ((929 - ((charAt * f24152a[i][0]) % C9161a.f24030a)) % C9161a.f24030a);
        }
        StringBuilder sb = new StringBuilder(a);
        for (int i4 = a - 1; i4 >= 0; i4--) {
            if (cArr[i4] != 0) {
                cArr[i4] = (char) (929 - cArr[i4]);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }
}
