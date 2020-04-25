package p468g;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.p217i1.C14662d0;
import okhttp3.internal.C14910b;
import p076c.p112d.p148d.p279f.C6610c;
import p201f.p202a.C5952h;
import p470h.C13892d;
import p470h.C13896f;

/* renamed from: g.y */
/* compiled from: MultipartBody */
public final class C13873y extends C13817d0 {

    /* renamed from: f */
    public static final C13872x f40244f = C13872x.m59360a("multipart/mixed");

    /* renamed from: g */
    public static final C13872x f40245g = C13872x.m59360a("multipart/alternative");

    /* renamed from: h */
    public static final C13872x f40246h = C13872x.m59360a("multipart/digest");

    /* renamed from: i */
    public static final C13872x f40247i = C13872x.m59360a("multipart/parallel");

    /* renamed from: j */
    public static final C13872x f40248j = C13872x.m59360a("multipart/form-data");

    /* renamed from: k */
    private static final byte[] f40249k = {58, 32};

    /* renamed from: l */
    private static final byte[] f40250l = {13, 10};

    /* renamed from: m */
    private static final byte[] f40251m = {45, 45};

    /* renamed from: a */
    private final C13896f f40252a;

    /* renamed from: b */
    private final C13872x f40253b;

    /* renamed from: c */
    private final C13872x f40254c;

    /* renamed from: d */
    private final List<C13875b> f40255d;

    /* renamed from: e */
    private long f40256e = -1;

    /* renamed from: g.y$a */
    /* compiled from: MultipartBody */
    public static final class C13874a {

        /* renamed from: a */
        private final C13896f f40257a;

        /* renamed from: b */
        private C13872x f40258b;

        /* renamed from: c */
        private final List<C13875b> f40259c;

        public C13874a() {
            this(UUID.randomUUID().toString());
        }

        /* renamed from: a */
        public C13874a mo43721a(C13872x xVar) {
            if (xVar == null) {
                throw new NullPointerException("type == null");
            } else if (xVar.mo43710c().equals("multipart")) {
                this.f40258b = xVar;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(xVar);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public C13874a(String str) {
            this.f40258b = C13873y.f40244f;
            this.f40259c = new ArrayList();
            this.f40257a = C13896f.m59655e(str);
        }

        /* renamed from: a */
        public C13874a mo43719a(C13817d0 d0Var) {
            return mo43722a(C13875b.m59380a(d0Var));
        }

        /* renamed from: a */
        public C13874a mo43720a(@C5952h C13866u uVar, C13817d0 d0Var) {
            return mo43722a(C13875b.m59381a(uVar, d0Var));
        }

        /* renamed from: a */
        public C13874a mo43723a(String str, String str2) {
            return mo43722a(C13875b.m59382a(str, str2));
        }

        /* renamed from: a */
        public C13874a mo43724a(String str, @C5952h String str2, C13817d0 d0Var) {
            return mo43722a(C13875b.m59383a(str, str2, d0Var));
        }

        /* renamed from: a */
        public C13874a mo43722a(C13875b bVar) {
            if (bVar != null) {
                this.f40259c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        /* renamed from: a */
        public C13873y mo43725a() {
            if (!this.f40259c.isEmpty()) {
                return new C13873y(this.f40257a, this.f40258b, this.f40259c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: g.y$b */
    /* compiled from: MultipartBody */
    public static final class C13875b {
        @C5952h

        /* renamed from: a */
        final C13866u f40260a;

        /* renamed from: b */
        final C13817d0 f40261b;

        private C13875b(@C5952h C13866u uVar, C13817d0 d0Var) {
            this.f40260a = uVar;
            this.f40261b = d0Var;
        }

        /* renamed from: a */
        public static C13875b m59380a(C13817d0 d0Var) {
            return m59381a((C13866u) null, d0Var);
        }

        @C5952h
        /* renamed from: b */
        public C13866u mo43727b() {
            return this.f40260a;
        }

        /* renamed from: a */
        public static C13875b m59381a(@C5952h C13866u uVar, C13817d0 d0Var) {
            if (d0Var == null) {
                throw new NullPointerException("body == null");
            } else if (uVar != null && uVar.mo43612a("Content-Type") != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (uVar == null || uVar.mo43612a("Content-Length") == null) {
                return new C13875b(uVar, d0Var);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        /* renamed from: a */
        public static C13875b m59382a(String str, String str2) {
            return m59383a(str, null, C13817d0.create((C13872x) null, str2));
        }

        /* renamed from: a */
        public static C13875b m59383a(String str, @C5952h String str2, C13817d0 d0Var) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C13873y.m59367a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C13873y.m59367a(sb, str2);
                }
                return m59381a(C13866u.m59238a(C6610c.f18396R, sb.toString()), d0Var);
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public C13817d0 mo43726a() {
            return this.f40261b;
        }
    }

    C13873y(C13896f fVar, C13872x xVar, List<C13875b> list) {
        this.f40252a = fVar;
        this.f40253b = xVar;
        StringBuilder sb = new StringBuilder();
        sb.append(xVar);
        sb.append("; boundary=");
        sb.append(fVar.mo43990v());
        this.f40254c = C13872x.m59360a(sb.toString());
        this.f40255d = C14910b.m66049a(list);
    }

    /* renamed from: a */
    public String mo43715a() {
        return this.f40252a.mo43990v();
    }

    /* renamed from: b */
    public List<C13875b> mo43716b() {
        return this.f40255d;
    }

    /* renamed from: c */
    public int mo43717c() {
        return this.f40255d.size();
    }

    public long contentLength() throws IOException {
        long j = this.f40256e;
        if (j != -1) {
            return j;
        }
        long a = m59366a((C13892d) null, true);
        this.f40256e = a;
        return a;
    }

    public C13872x contentType() {
        return this.f40254c;
    }

    /* renamed from: d */
    public C13872x mo43718d() {
        return this.f40253b;
    }

    public void writeTo(C13892d dVar) throws IOException {
        m59366a(dVar, false);
    }

    /* renamed from: a */
    public C13875b mo43714a(int i) {
        return (C13875b) this.f40255d.get(i);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [h.d] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [h.c] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long m59366a(@p201f.p202a.C5952h p470h.C13892d r13, boolean r14) throws java.io.IOException {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x0009
            h.c r13 = new h.c
            r13.<init>()
            r0 = r13
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List<g.y$b> r1 = r12.f40255d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r3 = 0
        L_0x0015:
            if (r3 >= r1) goto L_0x00a7
            java.util.List<g.y$b> r6 = r12.f40255d
            java.lang.Object r6 = r6.get(r3)
            g.y$b r6 = (p468g.C13873y.C13875b) r6
            g.u r7 = r6.f40260a
            g.d0 r6 = r6.f40261b
            byte[] r8 = f40251m
            r13.write(r8)
            h.f r8 = r12.f40252a
            r13.mo43847a(r8)
            byte[] r8 = f40250l
            r13.write(r8)
            if (r7 == 0) goto L_0x0059
            int r8 = r7.mo43618d()
            r9 = 0
        L_0x0039:
            if (r9 >= r8) goto L_0x0059
            java.lang.String r10 = r7.mo43611a(r9)
            h.d r10 = r13.mo43853a(r10)
            byte[] r11 = f40249k
            h.d r10 = r10.write(r11)
            java.lang.String r11 = r7.mo43613b(r9)
            h.d r10 = r10.mo43853a(r11)
            byte[] r11 = f40250l
            r10.write(r11)
            int r9 = r9 + 1
            goto L_0x0039
        L_0x0059:
            g.x r7 = r6.contentType()
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = "Content-Type: "
            h.d r8 = r13.mo43853a(r8)
            java.lang.String r7 = r7.toString()
            h.d r7 = r8.mo43853a(r7)
            byte[] r8 = f40250l
            r7.write(r8)
        L_0x0072:
            long r7 = r6.contentLength()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x008c
            java.lang.String r9 = "Content-Length: "
            h.d r9 = r13.mo43853a(r9)
            h.d r9 = r9.mo43885f(r7)
            byte[] r10 = f40250l
            r9.write(r10)
            goto L_0x0092
        L_0x008c:
            if (r14 == 0) goto L_0x0092
            r0.mo43879d()
            return r9
        L_0x0092:
            byte[] r9 = f40250l
            r13.write(r9)
            if (r14 == 0) goto L_0x009b
            long r4 = r4 + r7
            goto L_0x009e
        L_0x009b:
            r6.writeTo(r13)
        L_0x009e:
            byte[] r6 = f40250l
            r13.write(r6)
            int r3 = r3 + 1
            goto L_0x0015
        L_0x00a7:
            byte[] r1 = f40251m
            r13.write(r1)
            h.f r1 = r12.f40252a
            r13.mo43847a(r1)
            byte[] r1 = f40251m
            r13.write(r1)
            byte[] r1 = f40250l
            r13.write(r1)
            if (r14 == 0) goto L_0x00c5
            long r13 = r0.size()
            long r4 = r4 + r13
            r0.mo43879d()
        L_0x00c5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p468g.C13873y.m59366a(h.d, boolean):long");
    }

    /* renamed from: a */
    static StringBuilder m59367a(StringBuilder sb, String str) {
        sb.append(C14662d0.f42850a);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append(C14662d0.f42850a);
        return sb;
    }
}
