package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import p468g.C13832g0;

/* renamed from: okhttp3.internal.connection.d */
/* compiled from: RouteDatabase */
public final class C14918d {

    /* renamed from: a */
    private final Set<C13832g0> f43204a = new LinkedHashSet();

    /* renamed from: a */
    public synchronized void mo46387a(C13832g0 g0Var) {
        this.f43204a.remove(g0Var);
    }

    /* renamed from: b */
    public synchronized void mo46388b(C13832g0 g0Var) {
        this.f43204a.add(g0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo46389c(C13832g0 g0Var) {
        return this.f43204a.contains(g0Var);
    }
}
