package p212io.branch.referral;

import java.io.UnsupportedEncodingException;

/* renamed from: io.branch.referral.c */
/* compiled from: Base64 */
class C14119c {

    /* renamed from: a */
    public static final int f41511a = 0;

    /* renamed from: b */
    public static final int f41512b = 1;

    /* renamed from: c */
    public static final int f41513c = 2;

    /* renamed from: d */
    public static final int f41514d = 4;

    /* renamed from: e */
    public static final int f41515e = 8;

    /* renamed from: f */
    public static final int f41516f = 16;

    /* renamed from: io.branch.referral.c$a */
    /* compiled from: Base64 */
    static abstract class C14120a {

        /* renamed from: a */
        public byte[] f41517a;

        /* renamed from: b */
        public int f41518b;

        C14120a() {
        }

        /* renamed from: a */
        public abstract int mo44630a(int i);

        /* renamed from: a */
        public abstract boolean mo44631a(byte[] bArr, int i, int i2, boolean z);
    }

    /* renamed from: io.branch.referral.c$b */
    /* compiled from: Base64 */
    static class C14121b extends C14120a {

        /* renamed from: f */
        private static final int[] f41519f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g */
        private static final int[] f41520g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: h */
        private static final int f41521h = -1;

        /* renamed from: i */
        private static final int f41522i = -2;

        /* renamed from: c */
        private int f41523c;

        /* renamed from: d */
        private int f41524d;

        /* renamed from: e */
        private final int[] f41525e;

        public C14121b(int i, byte[] bArr) {
            this.f41517a = bArr;
            this.f41525e = (i & 8) == 0 ? f41519f : f41520g;
            this.f41523c = 0;
            this.f41524d = 0;
        }

        /* renamed from: a */
        public int mo44630a(int i) {
            return ((i * 3) / 4) + 10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f1, code lost:
            if (r20 != false) goto L_0x00fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00f3, code lost:
            r0.f41523c = r5;
            r0.f41524d = r8;
            r0.f41518b = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f9, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fa, code lost:
            if (r5 == 0) goto L_0x0123;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fc, code lost:
            if (r5 == 1) goto L_0x0120;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00fe, code lost:
            if (r5 == 2) goto L_0x0117;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0100, code lost:
            if (r5 == 3) goto L_0x0108;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0102, code lost:
            if (r5 == 4) goto L_0x0105;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0105, code lost:
            r0.f41523c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
            r1 = r9 + 1;
            r6[r9] = (byte) (r8 >> 10);
            r9 = r1 + 1;
            r6[r1] = (byte) (r8 >> 2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
            r1 = r9 + 1;
            r6[r9] = (byte) (r8 >> 4);
            r9 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0120, code lost:
            r0.f41523c = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x0123, code lost:
            r0.f41523c = r5;
            r0.f41518b = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x0127, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo44631a(byte[] r17, int r18, int r19, boolean r20) {
            /*
                r16 = this;
                r0 = r16
                int r1 = r0.f41523c
                r2 = 0
                r3 = 6
                if (r1 != r3) goto L_0x0009
                return r2
            L_0x0009:
                int r4 = r19 + r18
                int r5 = r0.f41524d
                byte[] r6 = r0.f41517a
                int[] r7 = r0.f41525e
                r8 = r5
                r9 = 0
                r5 = r1
                r1 = r18
            L_0x0016:
                r10 = 3
                r11 = 4
                r12 = 2
                r13 = 1
                if (r1 >= r4) goto L_0x00f1
                if (r5 != 0) goto L_0x0063
            L_0x001e:
                int r14 = r1 + 4
                if (r14 > r4) goto L_0x005f
                byte r8 = r17[r1]
                r8 = r8 & 255(0xff, float:3.57E-43)
                r8 = r7[r8]
                int r8 = r8 << 18
                int r15 = r1 + 1
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << 12
                r8 = r8 | r15
                int r15 = r1 + 2
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                int r15 = r15 << r3
                r8 = r8 | r15
                int r15 = r1 + 3
                byte r15 = r17[r15]
                r15 = r15 & 255(0xff, float:3.57E-43)
                r15 = r7[r15]
                r8 = r8 | r15
                if (r8 < 0) goto L_0x005f
                int r1 = r9 + 2
                byte r15 = (byte) r8
                r6[r1] = r15
                int r1 = r9 + 1
                int r15 = r8 >> 8
                byte r15 = (byte) r15
                r6[r1] = r15
                int r1 = r8 >> 16
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 3
                r1 = r14
                goto L_0x001e
            L_0x005f:
                if (r1 < r4) goto L_0x0063
                goto L_0x00f1
            L_0x0063:
                int r14 = r1 + 1
                byte r1 = r17[r1]
                r1 = r1 & 255(0xff, float:3.57E-43)
                r1 = r7[r1]
                r15 = 5
                r2 = -1
                if (r5 == 0) goto L_0x00e1
                if (r5 == r13) goto L_0x00d5
                r13 = -2
                if (r5 == r12) goto L_0x00c1
                if (r5 == r10) goto L_0x008e
                if (r5 == r11) goto L_0x0082
                if (r5 == r15) goto L_0x007c
                goto L_0x00ed
            L_0x007c:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
            L_0x0080:
                r10 = 0
                return r10
            L_0x0082:
                r10 = 0
                if (r1 != r13) goto L_0x0089
                int r5 = r5 + 1
                goto L_0x00ed
            L_0x0089:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
                return r10
            L_0x008e:
                if (r1 < 0) goto L_0x00a9
                int r2 = r8 << 6
                r1 = r1 | r2
                int r2 = r9 + 2
                byte r5 = (byte) r1
                r6[r2] = r5
                int r2 = r9 + 1
                int r5 = r1 >> 8
                byte r5 = (byte) r5
                r6[r2] = r5
                int r2 = r1 >> 16
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r9 + 3
                r8 = r1
                r5 = 0
                goto L_0x00ed
            L_0x00a9:
                if (r1 != r13) goto L_0x00bb
                int r1 = r9 + 1
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                int r1 = r8 >> 10
                byte r1 = (byte) r1
                r6[r9] = r1
                int r9 = r9 + 2
                r5 = 5
                goto L_0x00ed
            L_0x00bb:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
            L_0x00bf:
                r1 = 0
                return r1
            L_0x00c1:
                if (r1 < 0) goto L_0x00c4
                goto L_0x00d8
            L_0x00c4:
                if (r1 != r13) goto L_0x00d0
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
                r5 = 4
                goto L_0x00ed
            L_0x00d0:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
                goto L_0x0080
            L_0x00d5:
                r10 = 0
                if (r1 < 0) goto L_0x00dc
            L_0x00d8:
                int r2 = r8 << 6
                r1 = r1 | r2
                goto L_0x00e4
            L_0x00dc:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
                return r10
            L_0x00e1:
                r10 = 0
                if (r1 < 0) goto L_0x00e8
            L_0x00e4:
                int r5 = r5 + 1
                r8 = r1
                goto L_0x00ed
            L_0x00e8:
                if (r1 == r2) goto L_0x00ed
                r0.f41523c = r3
                return r10
            L_0x00ed:
                r1 = r14
                r2 = 0
                goto L_0x0016
            L_0x00f1:
                if (r20 != 0) goto L_0x00fa
                r0.f41523c = r5
                r0.f41524d = r8
                r0.f41518b = r9
                return r13
            L_0x00fa:
                if (r5 == 0) goto L_0x0123
                if (r5 == r13) goto L_0x0120
                if (r5 == r12) goto L_0x0117
                if (r5 == r10) goto L_0x0108
                if (r5 == r11) goto L_0x0105
                goto L_0x0123
            L_0x0105:
                r0.f41523c = r3
                goto L_0x00bf
            L_0x0108:
                int r1 = r9 + 1
                int r2 = r8 >> 10
                byte r2 = (byte) r2
                r6[r9] = r2
                int r9 = r1 + 1
                int r2 = r8 >> 2
                byte r2 = (byte) r2
                r6[r1] = r2
                goto L_0x0123
            L_0x0117:
                int r1 = r9 + 1
                int r2 = r8 >> 4
                byte r2 = (byte) r2
                r6[r9] = r2
                r9 = r1
                goto L_0x0123
            L_0x0120:
                r0.f41523c = r3
                goto L_0x00bf
            L_0x0123:
                r0.f41523c = r5
                r0.f41518b = r9
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14119c.C14121b.mo44631a(byte[], int, int, boolean):boolean");
        }
    }

    /* renamed from: io.branch.referral.c$c */
    /* compiled from: Base64 */
    static class C14122c extends C14120a {

        /* renamed from: j */
        public static final int f41526j = 19;

        /* renamed from: k */
        private static final byte[] f41527k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: l */
        private static final byte[] f41528l = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c */
        private final byte[] f41529c;

        /* renamed from: d */
        int f41530d;

        /* renamed from: e */
        private int f41531e;

        /* renamed from: f */
        public final boolean f41532f;

        /* renamed from: g */
        public final boolean f41533g;

        /* renamed from: h */
        public final boolean f41534h;

        /* renamed from: i */
        private final byte[] f41535i;

        public C14122c(int i, byte[] bArr) {
            this.f41517a = bArr;
            boolean z = true;
            this.f41532f = (i & 1) == 0;
            this.f41533g = (i & 2) == 0;
            if ((i & 4) == 0) {
                z = false;
            }
            this.f41534h = z;
            this.f41535i = (i & 8) == 0 ? f41527k : f41528l;
            this.f41529c = new byte[2];
            this.f41530d = 0;
            this.f41531e = this.f41533g ? 19 : -1;
        }

        /* renamed from: a */
        public int mo44630a(int i) {
            return ((i * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0097  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01bc  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x00e9 A[SYNTHETIC] */
        /* renamed from: a */
        public boolean mo44631a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.f41535i
                byte[] r2 = r0.f41517a
                int r3 = r0.f41531e
                int r4 = r20 + r19
                int r5 = r0.f41530d
                r6 = -1
                r7 = 0
                r8 = 2
                r9 = 1
                if (r5 == 0) goto L_0x0053
                if (r5 == r9) goto L_0x0034
                if (r5 == r8) goto L_0x0017
                goto L_0x0053
            L_0x0017:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0053
                byte[] r10 = r0.f41529c
                byte r11 = r10[r7]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.f41530d = r7
                r11 = r5
                r5 = r10
                goto L_0x0056
            L_0x0034:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0053
                byte[] r5 = r0.f41529c
                byte r5 = r5[r7]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r10 + 1
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r5 = r5 | r10
                r0.f41530d = r7
                goto L_0x0056
            L_0x0053:
                r11 = r19
                r5 = -1
            L_0x0056:
                r12 = 4
                r13 = 13
                r14 = 10
                if (r5 == r6) goto L_0x0092
                int r6 = r5 >> 18
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r7] = r6
                int r6 = r5 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r5 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r8] = r6
                r5 = r5 & 63
                byte r5 = r1[r5]
                r6 = 3
                r2[r6] = r5
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x0090
                boolean r3 = r0.f41534h
                if (r3 == 0) goto L_0x0088
                r3 = 5
                r2[r12] = r13
                goto L_0x0089
            L_0x0088:
                r3 = 4
            L_0x0089:
                int r5 = r3 + 1
                r2[r3] = r14
            L_0x008d:
                r3 = 19
                goto L_0x0093
            L_0x0090:
                r5 = 4
                goto L_0x0093
            L_0x0092:
                r5 = 0
            L_0x0093:
                int r6 = r11 + 3
                if (r6 > r4) goto L_0x00e9
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r10 = r18[r16]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                int r11 = r10 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r5] = r11
                int r11 = r5 + 1
                int r15 = r10 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r5 + 2
                int r15 = r10 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r5 + 3
                r10 = r10 & 63
                byte r10 = r1[r10]
                r2[r11] = r10
                int r5 = r5 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x00e7
                boolean r3 = r0.f41534h
                if (r3 == 0) goto L_0x00e0
                int r3 = r5 + 1
                r2[r5] = r13
                goto L_0x00e1
            L_0x00e0:
                r3 = r5
            L_0x00e1:
                int r5 = r3 + 1
                r2[r3] = r14
                r11 = r6
                goto L_0x008d
            L_0x00e7:
                r11 = r6
                goto L_0x0093
            L_0x00e9:
                if (r21 == 0) goto L_0x01bc
                int r6 = r0.f41530d
                int r10 = r11 - r6
                int r15 = r4 + -1
                if (r10 != r15) goto L_0x013a
                if (r6 <= 0) goto L_0x00fb
                byte[] r4 = r0.f41529c
                byte r4 = r4[r7]
                r7 = 1
                goto L_0x00fd
            L_0x00fb:
                byte r4 = r18[r11]
            L_0x00fd:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r12
                int r6 = r0.f41530d
                int r6 = r6 - r7
                r0.f41530d = r6
                int r6 = r5 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r5] = r7
                int r5 = r6 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r6] = r1
                boolean r1 = r0.f41532f
                if (r1 == 0) goto L_0x0125
                int r1 = r5 + 1
                r4 = 61
                r2[r5] = r4
                int r5 = r1 + 1
                r2[r1] = r4
            L_0x0125:
                boolean r1 = r0.f41533g
                if (r1 == 0) goto L_0x01e7
                boolean r1 = r0.f41534h
                if (r1 == 0) goto L_0x0132
                int r1 = r5 + 1
                r2[r5] = r13
                goto L_0x0133
            L_0x0132:
                r1 = r5
            L_0x0133:
                int r4 = r1 + 1
                r2[r1] = r14
            L_0x0137:
                r5 = r4
                goto L_0x01e7
            L_0x013a:
                int r10 = r11 - r6
                int r4 = r4 - r8
                if (r10 != r4) goto L_0x01a3
                if (r6 <= r9) goto L_0x0147
                byte[] r4 = r0.f41529c
                byte r4 = r4[r7]
                r7 = 1
                goto L_0x014d
            L_0x0147:
                int r4 = r11 + 1
                byte r6 = r18[r11]
                r11 = r4
                r4 = r6
            L_0x014d:
                r4 = r4 & 255(0xff, float:3.57E-43)
                int r4 = r4 << r14
                int r6 = r0.f41530d
                if (r6 <= 0) goto L_0x015c
                byte[] r6 = r0.f41529c
                int r10 = r7 + 1
                byte r6 = r6[r7]
                r7 = r10
                goto L_0x015e
            L_0x015c:
                byte r6 = r18[r11]
            L_0x015e:
                r6 = r6 & 255(0xff, float:3.57E-43)
                int r6 = r6 << r8
                r4 = r4 | r6
                int r6 = r0.f41530d
                int r6 = r6 - r7
                r0.f41530d = r6
                int r6 = r5 + 1
                int r7 = r4 >> 12
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r5] = r7
                int r5 = r6 + 1
                int r7 = r4 >> 6
                r7 = r7 & 63
                byte r7 = r1[r7]
                r2[r6] = r7
                int r6 = r5 + 1
                r4 = r4 & 63
                byte r1 = r1[r4]
                r2[r5] = r1
                boolean r1 = r0.f41532f
                if (r1 == 0) goto L_0x018e
                int r1 = r6 + 1
                r4 = 61
                r2[r6] = r4
                goto L_0x018f
            L_0x018e:
                r1 = r6
            L_0x018f:
                boolean r4 = r0.f41533g
                if (r4 == 0) goto L_0x01a1
                boolean r4 = r0.f41534h
                if (r4 == 0) goto L_0x019c
                int r4 = r1 + 1
                r2[r1] = r13
                r1 = r4
            L_0x019c:
                int r4 = r1 + 1
                r2[r1] = r14
                goto L_0x0137
            L_0x01a1:
                r5 = r1
                goto L_0x01e7
            L_0x01a3:
                boolean r1 = r0.f41533g
                if (r1 == 0) goto L_0x01e7
                if (r5 <= 0) goto L_0x01e7
                r1 = 19
                if (r3 == r1) goto L_0x01e7
                boolean r1 = r0.f41534h
                if (r1 == 0) goto L_0x01b6
                int r1 = r5 + 1
                r2[r5] = r13
                goto L_0x01b7
            L_0x01b6:
                r1 = r5
            L_0x01b7:
                int r5 = r1 + 1
                r2[r1] = r14
                goto L_0x01e7
            L_0x01bc:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x01cd
                byte[] r1 = r0.f41529c
                int r2 = r0.f41530d
                int r4 = r2 + 1
                r0.f41530d = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x01e7
            L_0x01cd:
                int r4 = r4 - r8
                if (r11 != r4) goto L_0x01e7
                byte[] r1 = r0.f41529c
                int r2 = r0.f41530d
                int r4 = r2 + 1
                r0.f41530d = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                int r2 = r0.f41530d
                int r4 = r2 + 1
                r0.f41530d = r4
                int r11 = r11 + r9
                byte r4 = r18[r11]
                r1[r2] = r4
            L_0x01e7:
                r0.f41518b = r5
                r0.f41531e = r3
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14119c.C14122c.mo44631a(byte[], int, int, boolean):boolean");
        }
    }

    private C14119c() {
    }

    /* renamed from: a */
    public static byte[] m61048a(String str, int i) {
        return m61049a(str.getBytes(), i);
    }

    /* renamed from: b */
    public static byte[] m61051b(byte[] bArr, int i) {
        return m61052b(bArr, 0, bArr.length, i);
    }

    /* renamed from: c */
    public static String m61053c(byte[] bArr, int i) {
        try {
            return new String(m61051b(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public static byte[] m61049a(byte[] bArr, int i) {
        return m61050a(bArr, 0, bArr.length, i);
    }

    /* renamed from: b */
    public static byte[] m61052b(byte[] bArr, int i, int i2, int i3) {
        C14122c cVar = new C14122c(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!cVar.f41532f) {
            int i6 = i2 % 3;
            if (i6 != 0) {
                if (i6 == 1) {
                    i4 += 2;
                } else if (i6 == 2) {
                    i4 += 3;
                }
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.f41533g && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.f41534h) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        cVar.f41517a = new byte[i4];
        cVar.mo44631a(bArr, i, i2, true);
        return cVar.f41517a;
    }

    /* renamed from: a */
    public static byte[] m61050a(byte[] bArr, int i, int i2, int i3) {
        C14121b bVar = new C14121b(i3, new byte[((i2 * 3) / 4)]);
        if (bVar.mo44631a(bArr, i, i2, true)) {
            int i4 = bVar.f41518b;
            byte[] bArr2 = bVar.f41517a;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    /* renamed from: c */
    public static String m61054c(byte[] bArr, int i, int i2, int i3) {
        try {
            return new String(m61052b(bArr, i, i2, i3), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
