package p053b.p054a.p055a.p056b;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.concurrent.Executor;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: b.a.a.b.a */
/* compiled from: ArchTaskExecutor */
public class C2076a extends C2081c {

    /* renamed from: c */
    private static volatile C2076a f7937c;
    @C0193h0

    /* renamed from: d */
    private static final Executor f7938d = new C2077a();
    @C0193h0

    /* renamed from: e */
    private static final Executor f7939e = new C2078b();
    @C0193h0

    /* renamed from: a */
    private C2081c f7940a = this.f7941b;
    @C0193h0

    /* renamed from: b */
    private C2081c f7941b = new C2079b();

    /* renamed from: b.a.a.b.a$a */
    /* compiled from: ArchTaskExecutor */
    static class C2077a implements Executor {
        C2077a() {
        }

        public void execute(Runnable runnable) {
            C2076a.m10816c().mo9049c(runnable);
        }
    }

    /* renamed from: b.a.a.b.a$b */
    /* compiled from: ArchTaskExecutor */
    static class C2078b implements Executor {
        C2078b() {
        }

        public void execute(Runnable runnable) {
            C2076a.m10816c().mo9047a(runnable);
        }
    }

    private C2076a() {
    }

    @C0193h0
    /* renamed from: b */
    public static Executor m10815b() {
        return f7939e;
    }

    @C0193h0
    /* renamed from: c */
    public static C2076a m10816c() {
        if (f7937c != null) {
            return f7937c;
        }
        synchronized (C2076a.class) {
            if (f7937c == null) {
                f7937c = new C2076a();
            }
        }
        return f7937c;
    }

    @C0193h0
    /* renamed from: d */
    public static Executor m10817d() {
        return f7938d;
    }

    /* renamed from: a */
    public void mo9046a(@C0195i0 C2081c cVar) {
        if (cVar == null) {
            cVar = this.f7941b;
        }
        this.f7940a = cVar;
    }

    /* renamed from: a */
    public void mo9047a(Runnable runnable) {
        this.f7940a.mo9047a(runnable);
    }

    /* renamed from: a */
    public boolean mo9048a() {
        return this.f7940a.mo9048a();
    }

    /* renamed from: c */
    public void mo9049c(Runnable runnable) {
        this.f7940a.mo9049c(runnable);
    }
}
