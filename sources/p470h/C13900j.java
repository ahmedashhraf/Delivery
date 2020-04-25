package p470h;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: h.j */
/* compiled from: ForwardingTimeout */
public class C13900j extends C13885b0 {

    /* renamed from: e */
    private C13885b0 f40360e;

    public C13900j(C13885b0 b0Var) {
        if (b0Var != null) {
            this.f40360e = b0Var;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: a */
    public final C13900j mo43997a(C13885b0 b0Var) {
        if (b0Var != null) {
            this.f40360e = b0Var;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    /* renamed from: b */
    public C13885b0 mo43828b(long j, TimeUnit timeUnit) {
        return this.f40360e.mo43828b(j, timeUnit);
    }

    /* renamed from: c */
    public long mo43829c() {
        return this.f40360e.mo43829c();
    }

    /* renamed from: d */
    public boolean mo43830d() {
        return this.f40360e.mo43830d();
    }

    /* renamed from: e */
    public void mo43831e() throws IOException {
        this.f40360e.mo43831e();
    }

    /* renamed from: f */
    public long mo43832f() {
        return this.f40360e.mo43832f();
    }

    /* renamed from: g */
    public final C13885b0 mo43998g() {
        return this.f40360e;
    }

    /* renamed from: b */
    public C13885b0 mo43827b() {
        return this.f40360e.mo43827b();
    }

    /* renamed from: a */
    public C13885b0 mo43824a(long j) {
        return this.f40360e.mo43824a(j);
    }

    /* renamed from: a */
    public C13885b0 mo43823a() {
        return this.f40360e.mo43823a();
    }
}
