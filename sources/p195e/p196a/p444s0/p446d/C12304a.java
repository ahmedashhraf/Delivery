package p195e.p196a.p444s0.p446d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p195e.p196a.C12282j0;
import p195e.p196a.p444s0.p445c.C12303a;

/* renamed from: e.a.s0.d.a */
/* compiled from: AndroidSchedulers */
public final class C12304a {

    /* renamed from: a */
    private static final C12282j0 f35486a = C12303a.m55386b((Callable<C12282j0>) new C12305a<C12282j0>());

    /* renamed from: e.a.s0.d.a$a */
    /* compiled from: AndroidSchedulers */
    static class C12305a implements Callable<C12282j0> {
        C12305a() {
        }

        public C12282j0 call() throws Exception {
            return C12306b.f35487a;
        }
    }

    /* renamed from: e.a.s0.d.a$b */
    /* compiled from: AndroidSchedulers */
    private static final class C12306b {

        /* renamed from: a */
        static final C12282j0 f35487a = new C12307b(new Handler(Looper.getMainLooper()));

        private C12306b() {
        }
    }

    private C12304a() {
        throw new AssertionError("No instances.");
    }

    /* renamed from: a */
    public static C12282j0 m55390a() {
        return C12303a.m55380a(f35486a);
    }

    /* renamed from: a */
    public static C12282j0 m55391a(Looper looper) {
        if (looper != null) {
            return new C12307b(new Handler(looper));
        }
        throw new NullPointerException("looper == null");
    }
}
