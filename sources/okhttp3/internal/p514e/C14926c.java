package okhttp3.internal.p514e;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Internal;
import okhttp3.internal.p516g.C14945d;
import okhttp3.internal.p516g.C14947e;
import p076c.p112d.p148d.p279f.C6610c;
import p201f.p202a.C5952h;
import p468g.C13813c0;
import p468g.C13815d;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13866u;
import p468g.C13866u.C13867a;

/* renamed from: okhttp3.internal.e.c */
/* compiled from: CacheStrategy */
public final class C14926c {
    @C5952h

    /* renamed from: a */
    public final C13813c0 f43237a;
    @C5952h

    /* renamed from: b */
    public final C13823e0 f43238b;

    /* renamed from: okhttp3.internal.e.c$a */
    /* compiled from: CacheStrategy */
    public static class C14927a {

        /* renamed from: a */
        final long f43239a;

        /* renamed from: b */
        final C13813c0 f43240b;

        /* renamed from: c */
        final C13823e0 f43241c;

        /* renamed from: d */
        private Date f43242d;

        /* renamed from: e */
        private String f43243e;

        /* renamed from: f */
        private Date f43244f;

        /* renamed from: g */
        private String f43245g;

        /* renamed from: h */
        private Date f43246h;

        /* renamed from: i */
        private long f43247i;

        /* renamed from: j */
        private long f43248j;

        /* renamed from: k */
        private String f43249k;

        /* renamed from: l */
        private int f43250l = -1;

        public C14927a(long j, C13813c0 c0Var, C13823e0 e0Var) {
            this.f43239a = j;
            this.f43240b = c0Var;
            this.f43241c = e0Var;
            if (e0Var != null) {
                this.f43247i = e0Var.mo43415N();
                this.f43248j = e0Var.mo43413L();
                C13866u i = e0Var.mo43427i();
                int d = i.mo43618d();
                for (int i2 = 0; i2 < d; i2++) {
                    String a = i.mo43611a(i2);
                    String b = i.mo43613b(i2);
                    if ("Date".equalsIgnoreCase(a)) {
                        this.f43242d = C14945d.m66221a(b);
                        this.f43243e = b;
                    } else if ("Expires".equalsIgnoreCase(a)) {
                        this.f43246h = C14945d.m66221a(b);
                    } else if ("Last-Modified".equalsIgnoreCase(a)) {
                        this.f43244f = C14945d.m66221a(b);
                        this.f43245g = b;
                    } else if ("ETag".equalsIgnoreCase(a)) {
                        this.f43249k = b;
                    } else if (C6610c.f18394P.equalsIgnoreCase(a)) {
                        this.f43250l = C14947e.m66223a(b, -1);
                    }
                }
            }
        }

        /* renamed from: b */
        private long m66147b() {
            Date date = this.f43242d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f43248j - date.getTime());
            }
            int i = this.f43250l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f43248j;
            return j + (j2 - this.f43247i) + (this.f43239a - j2);
        }

        /* renamed from: c */
        private long m66148c() {
            long j;
            long j2;
            C13815d d = this.f43241c.mo43422d();
            if (d.mo43383d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) d.mo43383d());
            }
            long j3 = 0;
            if (this.f43246h != null) {
                Date date = this.f43242d;
                if (date != null) {
                    j2 = date.getTime();
                } else {
                    j2 = this.f43248j;
                }
                long time = this.f43246h.getTime() - j2;
                if (time > 0) {
                    j3 = time;
                }
                return j3;
            }
            if (this.f43244f != null && this.f43241c.mo43414M().mo43359h().mo43657o() == null) {
                Date date2 = this.f43242d;
                if (date2 != null) {
                    j = date2.getTime();
                } else {
                    j = this.f43247i;
                }
                long time2 = j - this.f43244f.getTime();
                if (time2 > 0) {
                    j3 = time2 / 10;
                }
            }
            return j3;
        }

        /* renamed from: d */
        private C14926c m66149d() {
            if (this.f43241c == null) {
                return new C14926c(this.f43240b, null);
            }
            if (this.f43240b.mo43355d() && this.f43241c.mo43426h() == null) {
                return new C14926c(this.f43240b, null);
            }
            if (!C14926c.m66145a(this.f43241c, this.f43240b)) {
                return new C14926c(this.f43240b, null);
            }
            C13815d b = this.f43240b.mo43352b();
            if (b.mo43387h() || m66146a(this.f43240b)) {
                return new C14926c(this.f43240b, null);
            }
            C13815d d = this.f43241c.mo43422d();
            long b2 = m66147b();
            long c = m66148c();
            if (b.mo43383d() != -1) {
                c = Math.min(c, TimeUnit.SECONDS.toMillis((long) b.mo43383d()));
            }
            long j = 0;
            long millis = b.mo43385f() != -1 ? TimeUnit.SECONDS.toMillis((long) b.mo43385f()) : 0;
            if (!d.mo43386g() && b.mo43384e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) b.mo43384e());
            }
            if (!d.mo43387h()) {
                long j2 = millis + b2;
                if (j2 < j + c) {
                    C13824a I = this.f43241c.mo43410I();
                    String str = C6610c.f18417g;
                    if (j2 >= c) {
                        I.mo43438a(str, "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (b2 > 86400000 && m66150e()) {
                        I.mo43438a(str, "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C14926c(null, I.mo43439a());
                }
            }
            String str2 = this.f43249k;
            String str3 = C6610c.f18447v;
            if (str2 != null) {
                str3 = "If-None-Match";
            } else if (this.f43244f != null) {
                str2 = this.f43245g;
            } else if (this.f43242d == null) {
                return new C14926c(this.f43240b, null);
            } else {
                str2 = this.f43243e;
            }
            C13867a c2 = this.f43240b.mo43354c().mo43616c();
            Internal.instance.addLenient(c2, str3, str2);
            return new C14926c(this.f43240b.mo43357f().mo43363a(c2.mo43627a()).mo43371a(), this.f43241c);
        }

        /* renamed from: e */
        private boolean m66150e() {
            return this.f43241c.mo43422d().mo43383d() == -1 && this.f43246h == null;
        }

        /* renamed from: a */
        public C14926c mo46409a() {
            C14926c d = m66149d();
            return (d.f43237a == null || !this.f43240b.mo43352b().mo43390k()) ? d : new C14926c(null, null);
        }

        /* renamed from: a */
        private static boolean m66146a(C13813c0 c0Var) {
            return (c0Var.mo43351a(C6610c.f18447v) == null && c0Var.mo43351a("If-None-Match") == null) ? false : true;
        }
    }

    C14926c(C13813c0 c0Var, C13823e0 e0Var) {
        this.f43237a = c0Var;
        this.f43238b = e0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo43422d().mo43381b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m66145a(p468g.C13823e0 r3, p468g.C13813c0 r4) {
        /*
            int r0 = r3.mo43425g()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo43419b(r0)
            if (r0 != 0) goto L_0x005a
            g.d r0 = r3.mo43422d()
            int r0 = r0.mo43383d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            g.d r0 = r3.mo43422d()
            boolean r0 = r0.mo43382c()
            if (r0 != 0) goto L_0x005a
            g.d r0 = r3.mo43422d()
            boolean r0 = r0.mo43381b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            g.d r3 = r3.mo43422d()
            boolean r3 = r3.mo43388i()
            if (r3 != 0) goto L_0x006f
            g.d r3 = r4.mo43352b()
            boolean r3 = r3.mo43388i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p514e.C14926c.m66145a(g.e0, g.c0):boolean");
    }
}
