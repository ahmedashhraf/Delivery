package p470h;

import java.util.concurrent.TimeUnit;

/* renamed from: h.t */
/* compiled from: PushableTimeout */
final class C13916t extends C13885b0 {

    /* renamed from: e */
    private C13885b0 f40412e;

    /* renamed from: f */
    private boolean f40413f;

    /* renamed from: g */
    private long f40414g;

    /* renamed from: h */
    private long f40415h;

    C13916t() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44010a(C13885b0 b0Var) {
        this.f40412e = b0Var;
        this.f40413f = b0Var.mo43830d();
        this.f40414g = this.f40413f ? b0Var.mo43829c() : -1;
        this.f40415h = b0Var.mo43832f();
        b0Var.mo43828b(C13885b0.m59471a(this.f40415h, mo43832f()), TimeUnit.NANOSECONDS);
        if (this.f40413f && mo43830d()) {
            b0Var.mo43824a(Math.min(mo43829c(), this.f40414g));
        } else if (mo43830d()) {
            b0Var.mo43824a(mo43829c());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo44011g() {
        this.f40412e.mo43828b(this.f40415h, TimeUnit.NANOSECONDS);
        if (this.f40413f) {
            this.f40412e.mo43824a(this.f40414g);
        } else {
            this.f40412e.mo43823a();
        }
    }
}
