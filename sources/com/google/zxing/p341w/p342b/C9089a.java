package com.google.zxing.p341w.p342b;

import androidx.core.app.C0753l;
import androidx.core.p034l.C0986h;
import androidx.recyclerview.widget.C1744m.C1750f;
import com.facebook.imagepipeline.common.RotationOptions;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.p335u.C9044b;
import com.instabug.library.invocation.InvocationSettings;
import com.instabug.library.p397ui.custom.MaterialMenuDrawable;
import com.mrsool.p423v.C11718b;
import com.mrsool.utils.C11644i;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import org.jcodec.containers.mps.MPSUtils;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

/* renamed from: com.google.zxing.w.b.a */
/* compiled from: BitMatrixParser */
final class C9089a {

    /* renamed from: b */
    private static final int[][] f23805b = {new int[]{121, 120, C13959t.f40827P1, C13959t.f40823O1, C13959t.f40851V1, C13959t.f40847U1, C13959t.f40877b2, C13959t.f40872a2, C13959t.f40907h2, C13959t.f40902g2, C13959t.f40933n2, C13959t.f40929m2, C13959t.f40957t2, C13959t.f40953s2, C13959t.f40981z2, C13959t.f40977y2, C13959t.f40788F2, C13959t.f40784E2, 175, C13959t.f40808K2, 181, 180, C13959t.f40860X2, C13959t.f40856W2, 193, 192, C13959t.f40913i3, C13959t.f40908h3, -2, -2}, new int[]{123, 122, C13959t.f40835R1, 128, C13959t.f40859X1, C13959t.f40855W1, C13959t.f40887d2, C13959t.f40882c2, C13959t.f40917j2, C13959t.f40912i2, C13959t.f40941p2, C13959t.f40937o2, C13959t.f40965v2, C13959t.f40961u2, C13959t.f40772B2, C13959t.f40768A2, C13959t.f40796H2, C13959t.f40792G2, C13959t.f40820N2, C13959t.f40816M2, 183, C13959t.f40840S2, C13959t.f40868Z2, C13959t.f40864Y2, 195, 194, 201, 200, 816, -3}, new int[]{C13959t.f40819N1, 124, C13959t.f40843T1, C13959t.f40839S1, C13959t.f40867Z1, C13959t.f40863Y1, C13959t.f40897f2, C13959t.f40892e2, C13959t.f40925l2, C13959t.f40921k2, C13959t.f40949r2, C13959t.f40945q2, C13959t.f40973x2, C13959t.f40969w2, C13959t.f40780D2, C13959t.f40776C2, C13959t.f40804J2, C13959t.f40800I2, 179, 178, C13959t.f40852V2, 184, C13959t.f40878b3, 190, C13959t.f40903g3, JpegConst.DHT, 203, C15470v.f44665f, 818, 817}, new int[]{283, 282, 277, 276, 271, RotationOptions.ROTATE_270, 265, 264, 259, 258, 253, 252, 247, 246, 241, 240, JpegConst.APPB, JpegConst.APPA, JpegConst.APP5, JpegConst.APP4, 223, C11644i.f33366n0, 217, 216, JpegConst.RST3, JpegConst.RST2, C15470v.f44668i, 204, 819, -3}, new int[]{285, 284, 279, 278, 273, 272, 267, 266, 261, 260, 255, JpegConst.COM, 249, 248, 243, 242, JpegConst.APPD, JpegConst.APPC, JpegConst.APP7, JpegConst.APP6, 225, JpegConst.APP0, JpegConst.DQT, 218, JpegConst.RST5, JpegConst.RST4, C15470v.f44670k, C15470v.f44669j, 821, 820}, new int[]{287, 286, 281, 280, 275, TiffUtil.TIFF_TAG_ORIENTATION, 269, 268, 263, 262, C0986h.f4407i, 256, 251, C1750f.f6813c, 245, 244, JpegConst.APPF, JpegConst.APPE, JpegConst.APP9, JpegConst.APP8, JpegConst.APP3, JpegConst.APP2, JpegConst.DRI, 220, 215, JpegConst.RST6, JpegConst.RST1, 208, 822, -3}, new int[]{289, 288, 295, 294, 301, 300, 307, 306, 313, 312, 319, 318, 325, 324, 331, 330, 337, 336, 343, 342, 349, 348, 355, 354, 361, 360, 367, 366, 824, 823}, new int[]{291, 290, 297, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, 825, -3}, new int[]{293, 292, 299, 298, C15470v.f44676q, 304, 311, 310, 317, 316, 323, 322, 329, 328, 335, 334, FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS, 340, 347, 346, 353, 352, 359, 358, 365, 364, 371, 370, 827, 826}, new int[]{409, C15470v.f44638A, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 379, 378, 373, 372, 828, -3}, new int[]{C15470v.f44641D, C15470v.f44640C, 405, 404, 399, 398, 393, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, 387, 386, 381, 380, 375, 374, 830, 829}, new int[]{C15470v.f44643F, 412, C15470v.f44685z, C15470v.f44684y, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, 389, 388, 383, 382, 377, 376, 831, -3}, new int[]{C15470v.f44645H, C15470v.f44644G, 421, C15470v.f44649L, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, 433, 432, 439, 438, MPSUtils.PRIVATE_1, MPSUtils.PSM, 833, 832}, new int[]{C15470v.f44647J, C15470v.f44646I, C15470v.f44651N, 422, 429, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, 435, 434, 441, 440, MPSUtils.PRIVATE_2, 446, 834, -3}, new int[]{C15470v.f44648K, 418, 425, C15470v.f44652O, 431, 430, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, MPSUtils.PACK, 449, MPSUtils.AUDIO_MIN, 836, 835}, new int[]{481, MPSUtils.VIDEO_MIN, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, 451, 450, 837, -3}, new int[]{483, 482, 477, 476, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 453, 452, 839, 838}, new int[]{485, 484, MPSUtils.AUDIO_MAX, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, 460, 455, 454, 840, -3}, new int[]{487, 486, FacebookRequestErrorClassification.ESC_APP_INACTIVE, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, C15470v.f44658U, C15470v.f44657T, C0753l.f3451u, 510, 517, 516, 842, 841}, new int[]{489, 488, MPSUtils.VIDEO_MAX, 494, C15470v.f44654Q, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, C15470v.f44659V, 506, C0986h.f4408j, 512, 519, 518, 843, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, 508, 515, 514, 521, 520, 845, 844}, new int[]{559, 558, 553, 552, 547, 546, 541, 540, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, C11644i.f33374o0, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, 537, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, 557, 556, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, 526, 849, -3}, new int[]{565, 564, 571, 570, 577, 576, 583, 582, 589, 588, 595, 594, 601, C14330v.f42355w, 607, 606, 613, C11718b.f33924p, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, 851, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, 852, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, 592, 599, 598, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, 640, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, C11644i.f33382p0, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, InvocationSettings.SHAKE_DEFAULT_THRESHOLD, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, C14139l.f41589l, 757, 756, 763, 762, 769, 768, 775, 774, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, 811, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, 771, 770, C11644i.f33390q0, 776, 783, 782, 789, 788, 795, 794, 801, MaterialMenuDrawable.DEFAULT_TRANSFORM_DURATION, 807, 806, 813, 812, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, 773, 772, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, 809, 808, 815, 814, 863, 862}};

    /* renamed from: a */
    private final C9044b f23806a;

    C9089a(C9044b bVar) {
        this.f23806a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public byte[] mo33103a() {
        byte[] bArr = new byte[C13959t.f40902g2];
        int e = this.f23806a.mo33001e();
        int h = this.f23806a.mo33005h();
        for (int i = 0; i < e; i++) {
            int[] iArr = f23805b[i];
            for (int i2 = 0; i2 < h; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0 && this.f23806a.mo32995b(i2, i)) {
                    int i4 = i3 / 6;
                    bArr[i4] = (byte) (((byte) (1 << (5 - (i3 % 6)))) | bArr[i4]);
                }
            }
        }
        return bArr;
    }
}
