package com.google.api.client.http;

import java.io.IOException;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6368c0;
import p076c.p112d.p134b.p135a.p143g.C6407q;
import p076c.p112d.p134b.p135a.p143g.C6407q.C6408a;

@C2766f
@Deprecated
/* renamed from: com.google.api.client.http.g */
/* compiled from: ExponentialBackOffPolicy */
public class C7265g implements C7256c {

    /* renamed from: c */
    public static final int f20562c = 500;

    /* renamed from: d */
    public static final double f20563d = 0.5d;

    /* renamed from: e */
    public static final double f20564e = 1.5d;

    /* renamed from: f */
    public static final int f20565f = 60000;

    /* renamed from: g */
    public static final int f20566g = 900000;

    /* renamed from: b */
    private final C6407q f20567b;

    @C2766f
    @Deprecated
    /* renamed from: com.google.api.client.http.g$a */
    /* compiled from: ExponentialBackOffPolicy */
    public static class C7266a {

        /* renamed from: a */
        final C6408a f20568a = new C6408a();

        protected C7266a() {
        }

        /* renamed from: a */
        public C7265g mo28903a() {
            return new C7265g(this);
        }

        /* renamed from: b */
        public final int mo28904b() {
            return this.f20568a.mo25815b();
        }

        /* renamed from: c */
        public C7266a mo28908c(int i) {
            this.f20568a.mo25819c(i);
            return this;
        }

        /* renamed from: d */
        public final int mo28909d() {
            return this.f20568a.mo25820d();
        }

        /* renamed from: e */
        public final double mo28910e() {
            return this.f20568a.mo25821e();
        }

        /* renamed from: f */
        public final C6368c0 mo28911f() {
            return this.f20568a.mo25822f();
        }

        /* renamed from: g */
        public final double mo28912g() {
            return this.f20568a.mo25823g();
        }

        /* renamed from: a */
        public C7266a mo28901a(int i) {
            this.f20568a.mo25812a(i);
            return this;
        }

        /* renamed from: b */
        public C7266a mo28905b(double d) {
            this.f20568a.mo25816b(d);
            return this;
        }

        /* renamed from: c */
        public final int mo28907c() {
            return this.f20568a.mo25818c();
        }

        /* renamed from: a */
        public C7266a mo28900a(double d) {
            this.f20568a.mo25811a(d);
            return this;
        }

        /* renamed from: b */
        public C7266a mo28906b(int i) {
            this.f20568a.mo25817b(i);
            return this;
        }

        /* renamed from: a */
        public C7266a mo28902a(C6368c0 c0Var) {
            this.f20568a.mo25813a(c0Var);
            return this;
        }
    }

    public C7265g() {
        this(new C7266a());
    }

    /* renamed from: i */
    public static C7266a m35049i() {
        return new C7266a();
    }

    /* renamed from: a */
    public long mo28865a() throws IOException {
        return this.f20567b.mo25702a();
    }

    /* renamed from: a */
    public boolean mo28866a(int i) {
        return i == 500 || i == 503;
    }

    /* renamed from: b */
    public final int mo28893b() {
        return this.f20567b.mo25804b();
    }

    /* renamed from: c */
    public final long mo28894c() {
        return this.f20567b.mo25805c();
    }

    /* renamed from: d */
    public final int mo28895d() {
        return this.f20567b.mo25806d();
    }

    /* renamed from: e */
    public final int mo28896e() {
        return this.f20567b.mo25807e();
    }

    /* renamed from: f */
    public final int mo28897f() {
        return this.f20567b.mo25808f();
    }

    /* renamed from: g */
    public final double mo28898g() {
        return this.f20567b.mo25809g();
    }

    /* renamed from: h */
    public final double mo28899h() {
        return this.f20567b.mo25810h();
    }

    public final void reset() {
        this.f20567b.reset();
    }

    protected C7265g(C7266a aVar) {
        this.f20567b = aVar.f20568a.mo25814a();
    }
}
