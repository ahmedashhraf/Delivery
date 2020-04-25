package p468g;

import java.util.concurrent.TimeUnit;
import p201f.p202a.C5952h;

/* renamed from: g.d */
/* compiled from: CacheControl */
public final class C13815d {

    /* renamed from: n */
    public static final C13815d f39934n = new C13816a().mo43397c().mo43394a();

    /* renamed from: o */
    public static final C13815d f39935o = new C13816a().mo43401f().mo43396b(Integer.MAX_VALUE, TimeUnit.SECONDS).mo43394a();

    /* renamed from: a */
    private final boolean f39936a;

    /* renamed from: b */
    private final boolean f39937b;

    /* renamed from: c */
    private final int f39938c;

    /* renamed from: d */
    private final int f39939d;

    /* renamed from: e */
    private final boolean f39940e;

    /* renamed from: f */
    private final boolean f39941f;

    /* renamed from: g */
    private final boolean f39942g;

    /* renamed from: h */
    private final int f39943h;

    /* renamed from: i */
    private final int f39944i;

    /* renamed from: j */
    private final boolean f39945j;

    /* renamed from: k */
    private final boolean f39946k;

    /* renamed from: l */
    private final boolean f39947l;
    @C5952h

    /* renamed from: m */
    String f39948m;

    /* renamed from: g.d$a */
    /* compiled from: CacheControl */
    public static final class C13816a {

        /* renamed from: a */
        boolean f39949a;

        /* renamed from: b */
        boolean f39950b;

        /* renamed from: c */
        int f39951c = -1;

        /* renamed from: d */
        int f39952d = -1;

        /* renamed from: e */
        int f39953e = -1;

        /* renamed from: f */
        boolean f39954f;

        /* renamed from: g */
        boolean f39955g;

        /* renamed from: h */
        boolean f39956h;

        /* renamed from: a */
        public C13816a mo43393a(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f39951c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxAge < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public C13816a mo43396b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f39952d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: c */
        public C13816a mo43397c() {
            this.f39949a = true;
            return this;
        }

        /* renamed from: d */
        public C13816a mo43399d() {
            this.f39950b = true;
            return this;
        }

        /* renamed from: e */
        public C13816a mo43400e() {
            this.f39955g = true;
            return this;
        }

        /* renamed from: f */
        public C13816a mo43401f() {
            this.f39954f = true;
            return this;
        }

        /* renamed from: c */
        public C13816a mo43398c(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f39953e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("minFresh < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C13815d mo43394a() {
            return new C13815d(this);
        }

        /* renamed from: b */
        public C13816a mo43395b() {
            this.f39956h = true;
            return this;
        }
    }

    private C13815d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, @C5952h String str) {
        this.f39936a = z;
        this.f39937b = z2;
        this.f39938c = i;
        this.f39939d = i2;
        this.f39940e = z3;
        this.f39941f = z4;
        this.f39942g = z5;
        this.f39943h = i3;
        this.f39944i = i4;
        this.f39945j = z6;
        this.f39946k = z7;
        this.f39947l = z8;
        this.f39948m = str;
    }

    /* renamed from: m */
    private String m59006m() {
        StringBuilder sb = new StringBuilder();
        if (this.f39936a) {
            sb.append("no-cache, ");
        }
        if (this.f39937b) {
            sb.append("no-store, ");
        }
        String str = ", ";
        if (this.f39938c != -1) {
            sb.append("max-age=");
            sb.append(this.f39938c);
            sb.append(str);
        }
        if (this.f39939d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f39939d);
            sb.append(str);
        }
        if (this.f39940e) {
            sb.append("private, ");
        }
        if (this.f39941f) {
            sb.append("public, ");
        }
        if (this.f39942g) {
            sb.append("must-revalidate, ");
        }
        if (this.f39943h != -1) {
            sb.append("max-stale=");
            sb.append(this.f39943h);
            sb.append(str);
        }
        if (this.f39944i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f39944i);
            sb.append(str);
        }
        if (this.f39945j) {
            sb.append("only-if-cached, ");
        }
        if (this.f39946k) {
            sb.append("no-transform, ");
        }
        if (this.f39947l) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo43380a() {
        return this.f39947l;
    }

    /* renamed from: b */
    public boolean mo43381b() {
        return this.f39940e;
    }

    /* renamed from: c */
    public boolean mo43382c() {
        return this.f39941f;
    }

    /* renamed from: d */
    public int mo43383d() {
        return this.f39938c;
    }

    /* renamed from: e */
    public int mo43384e() {
        return this.f39943h;
    }

    /* renamed from: f */
    public int mo43385f() {
        return this.f39944i;
    }

    /* renamed from: g */
    public boolean mo43386g() {
        return this.f39942g;
    }

    /* renamed from: h */
    public boolean mo43387h() {
        return this.f39936a;
    }

    /* renamed from: i */
    public boolean mo43388i() {
        return this.f39937b;
    }

    /* renamed from: j */
    public boolean mo43389j() {
        return this.f39946k;
    }

    /* renamed from: k */
    public boolean mo43390k() {
        return this.f39945j;
    }

    /* renamed from: l */
    public int mo43391l() {
        return this.f39939d;
    }

    public String toString() {
        String str = this.f39948m;
        if (str != null) {
            return str;
        }
        String m = m59006m();
        this.f39948m = m;
        return m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p468g.C13815d m59005a(p468g.C13866u r22) {
        /*
            r0 = r22
            int r1 = r22.mo43618d()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x0146
            java.lang.String r2 = r0.mo43611a(r6)
            java.lang.String r4 = r0.mo43613b(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r4
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x013f
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x013f
            java.lang.String r3 = "=,;"
            int r3 = okhttp3.internal.p516g.C14947e.m66224a(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0099
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0099
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = okhttp3.internal.p516g.C14947e.m66235b(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = okhttp3.internal.p516g.C14947e.m66224a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009d
        L_0x0089:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = okhttp3.internal.p516g.C14947e.m66224a(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a9
            r5 = -1
            r9 = 1
            goto L_0x013a
        L_0x00a9:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b5
            r5 = -1
            r10 = 1
            goto L_0x013a
        L_0x00b5:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c5
            r5 = -1
            int r0 = okhttp3.internal.p516g.C14947e.m66223a(r0, r5)
            r11 = r0
            goto L_0x013a
        L_0x00c5:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00d5
            r5 = -1
            int r0 = okhttp3.internal.p516g.C14947e.m66223a(r0, r5)
            r12 = r0
            goto L_0x013a
        L_0x00d5:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e0
            r5 = -1
            r13 = 1
            goto L_0x013a
        L_0x00e0:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00eb
            r5 = -1
            r14 = 1
            goto L_0x013a
        L_0x00eb:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f6
            r5 = -1
            r15 = 1
            goto L_0x013a
        L_0x00f6:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0109
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r0 = okhttp3.internal.p516g.C14947e.m66223a(r0, r2)
            r16 = r0
            r5 = -1
            goto L_0x013a
        L_0x0109:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0119
            r5 = -1
            int r0 = okhttp3.internal.p516g.C14947e.m66223a(r0, r5)
            r17 = r0
            goto L_0x013a
        L_0x0119:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r18 = 1
            goto L_0x013a
        L_0x0125:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0130
            r19 = 1
            goto L_0x013a
        L_0x0130:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x013a
            r20 = 1
        L_0x013a:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x013f:
            r5 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x0146:
            if (r7 != 0) goto L_0x014b
            r21 = 0
            goto L_0x014d
        L_0x014b:
            r21 = r8
        L_0x014d:
            g.d r0 = new g.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p468g.C13815d.m59005a(g.u):g.d");
    }

    C13815d(C13816a aVar) {
        this.f39936a = aVar.f39949a;
        this.f39937b = aVar.f39950b;
        this.f39938c = aVar.f39951c;
        this.f39939d = -1;
        this.f39940e = false;
        this.f39941f = false;
        this.f39942g = false;
        this.f39943h = aVar.f39952d;
        this.f39944i = aVar.f39953e;
        this.f39945j = aVar.f39954f;
        this.f39946k = aVar.f39955g;
        this.f39947l = aVar.f39956h;
    }
}
