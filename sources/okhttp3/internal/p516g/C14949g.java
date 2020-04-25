package okhttp3.internal.p516g;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14921f;
import p468g.C13813c0;
import p468g.C13821e;
import p468g.C13823e0;
import p468g.C13839j;
import p468g.C13859r;
import p468g.C13870w;
import p468g.C13870w.C13871a;

/* renamed from: okhttp3.internal.g.g */
/* compiled from: RealInterceptorChain */
public final class C14949g implements C13871a {

    /* renamed from: a */
    private final List<C13870w> f43339a;

    /* renamed from: b */
    private final C14921f f43340b;

    /* renamed from: c */
    private final C14944c f43341c;

    /* renamed from: d */
    private final C14916c f43342d;

    /* renamed from: e */
    private final int f43343e;

    /* renamed from: f */
    private final C13813c0 f43344f;

    /* renamed from: g */
    private final C13821e f43345g;

    /* renamed from: h */
    private final C13859r f43346h;

    /* renamed from: i */
    private final int f43347i;

    /* renamed from: j */
    private final int f43348j;

    /* renamed from: k */
    private final int f43349k;

    /* renamed from: l */
    private int f43350l;

    public C14949g(List<C13870w> list, C14921f fVar, C14944c cVar, C14916c cVar2, int i, C13813c0 c0Var, C13821e eVar, C13859r rVar, int i2, int i3, int i4) {
        this.f43339a = list;
        this.f43342d = cVar2;
        this.f43340b = fVar;
        this.f43341c = cVar;
        this.f43343e = i;
        this.f43344f = c0Var;
        this.f43345g = eVar;
        this.f43346h = rVar;
        this.f43347i = i2;
        this.f43348j = i3;
        this.f43349k = i4;
    }

    /* renamed from: a */
    public int mo43697a() {
        return this.f43348j;
    }

    /* renamed from: b */
    public C13871a mo43701b(int i, TimeUnit timeUnit) {
        C14949g gVar = new C14949g(this.f43339a, this.f43340b, this.f43341c, this.f43342d, this.f43343e, this.f43344f, this.f43345g, this.f43346h, C14910b.m66040a("timeout", (long) i, timeUnit), this.f43348j, this.f43349k);
        return gVar;
    }

    /* renamed from: c */
    public C13839j mo43702c() {
        return this.f43342d;
    }

    public C13821e call() {
        return this.f43345g;
    }

    /* renamed from: d */
    public int mo43705d() {
        return this.f43347i;
    }

    /* renamed from: e */
    public C13859r mo46464e() {
        return this.f43346h;
    }

    /* renamed from: f */
    public C14944c mo46465f() {
        return this.f43341c;
    }

    /* renamed from: g */
    public C14921f mo46466g() {
        return this.f43340b;
    }

    public C13813c0 request() {
        return this.f43344f;
    }

    /* renamed from: a */
    public C13871a mo43699a(int i, TimeUnit timeUnit) {
        C14949g gVar = new C14949g(this.f43339a, this.f43340b, this.f43341c, this.f43342d, this.f43343e, this.f43344f, this.f43345g, this.f43346h, this.f43347i, this.f43348j, C14910b.m66040a("timeout", (long) i, timeUnit));
        return gVar;
    }

    /* renamed from: c */
    public C13871a mo43703c(int i, TimeUnit timeUnit) {
        C14949g gVar = new C14949g(this.f43339a, this.f43340b, this.f43341c, this.f43342d, this.f43343e, this.f43344f, this.f43345g, this.f43346h, this.f43347i, C14910b.m66040a("timeout", (long) i, timeUnit), this.f43349k);
        return gVar;
    }

    /* renamed from: b */
    public int mo43700b() {
        return this.f43349k;
    }

    /* renamed from: a */
    public C13823e0 mo43698a(C13813c0 c0Var) throws IOException {
        return mo46463a(c0Var, this.f43340b, this.f43341c, this.f43342d);
    }

    /* renamed from: a */
    public C13823e0 mo46463a(C13813c0 c0Var, C14921f fVar, C14944c cVar, C14916c cVar2) throws IOException {
        if (this.f43343e < this.f43339a.size()) {
            this.f43350l++;
            String str = "network interceptor ";
            if (this.f43341c == null || this.f43342d.mo46381a(c0Var.mo43359h())) {
                String str2 = " must call proceed() exactly once";
                if (this.f43341c == null || this.f43350l <= 1) {
                    C14949g gVar = new C14949g(this.f43339a, fVar, cVar, cVar2, this.f43343e + 1, c0Var, this.f43345g, this.f43346h, this.f43347i, this.f43348j, this.f43349k);
                    C13870w wVar = (C13870w) this.f43339a.get(this.f43343e);
                    C13823e0 a = wVar.mo23463a(gVar);
                    if (cVar == null || this.f43343e + 1 >= this.f43339a.size() || gVar.f43350l == 1) {
                        String str3 = "interceptor ";
                        if (a == null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append(wVar);
                            sb.append(" returned null");
                            throw new NullPointerException(sb.toString());
                        } else if (a.mo43416a() != null) {
                            return a;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            sb2.append(wVar);
                            sb2.append(" returned a response with no body");
                            throw new IllegalStateException(sb2.toString());
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str);
                        sb3.append(wVar);
                        sb3.append(str2);
                        throw new IllegalStateException(sb3.toString());
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(this.f43339a.get(this.f43343e - 1));
                    sb4.append(str2);
                    throw new IllegalStateException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(this.f43339a.get(this.f43343e - 1));
                sb5.append(" must retain the same host and port");
                throw new IllegalStateException(sb5.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
