package p195e.p196a.p199x0.p454e.p461g;

import p195e.p196a.C12292n0;
import p195e.p196a.C5928k0;
import p195e.p196a.C5930q0;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12328d;
import p212io.reactivex.exceptions.C14398a;

/* renamed from: e.a.x0.e.g.c */
/* compiled from: SingleContains */
public final class C13566c<T> extends C5928k0<Boolean> {

    /* renamed from: N */
    final C12328d<Object, Object> f39316N;

    /* renamed from: a */
    final C5930q0<T> f39317a;

    /* renamed from: b */
    final Object f39318b;

    /* renamed from: e.a.x0.e.g.c$a */
    /* compiled from: SingleContains */
    final class C13567a implements C12292n0<T> {

        /* renamed from: a */
        private final C12292n0<? super Boolean> f39319a;

        C13567a(C12292n0<? super Boolean> n0Var) {
            this.f39319a = n0Var;
        }

        /* renamed from: a */
        public void mo41974a(C12314c cVar) {
            this.f39319a.mo41974a(cVar);
        }

        public void onError(Throwable th) {
            this.f39319a.onError(th);
        }

        public void onSuccess(T t) {
            try {
                this.f39319a.onSuccess(Boolean.valueOf(C13566c.this.f39316N.mo42089a(t, C13566c.this.f39318b)));
            } catch (Throwable th) {
                C14398a.m62357b(th);
                this.f39319a.onError(th);
            }
        }
    }

    public C13566c(C5930q0<T> q0Var, Object obj, C12328d<Object, Object> dVar) {
        this.f39317a = q0Var;
        this.f39318b = obj;
        this.f39316N = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo24206b(C12292n0<? super Boolean> n0Var) {
        this.f39317a.mo24192a(new C13567a(n0Var));
    }
}
