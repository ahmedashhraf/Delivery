package bolts;

import java.util.Locale;
import java.util.concurrent.CancellationException;

/* renamed from: bolts.h */
/* compiled from: CancellationToken */
public class C2170h {

    /* renamed from: a */
    private final C2172j f8621a;

    C2170h(C2172j jVar) {
        this.f8621a = jVar;
    }

    /* renamed from: a */
    public boolean mo9283a() {
        return this.f8621a.mo9294e();
    }

    /* renamed from: b */
    public void mo9284b() throws CancellationException {
        this.f8621a.mo9295f();
    }

    public String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{C2170h.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(this.f8621a.mo9294e())});
    }

    /* renamed from: a */
    public C2171i mo9282a(Runnable runnable) {
        return this.f8621a.mo9288a(runnable);
    }
}
