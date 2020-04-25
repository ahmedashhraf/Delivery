package p076c.p112d.p113a.p130b.p131a.p133d;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: c.d.a.b.a.d.i */
final class C2701i implements C2705m {

    /* renamed from: a */
    private final /* synthetic */ C2711s f9823a;

    /* renamed from: b */
    final /* synthetic */ Set f9824b;

    /* renamed from: c */
    final /* synthetic */ AtomicBoolean f9825c;

    /* renamed from: d */
    private final /* synthetic */ C2698f f9826d;

    C2701i(C2698f fVar, C2711s sVar, Set set, AtomicBoolean atomicBoolean) {
        this.f9826d = fVar;
        this.f9823a = sVar;
        this.f9824b = set;
        this.f9825c = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo10382a(ZipFile zipFile, Set<C2706n> set) throws IOException {
        this.f9826d.m13087a(this.f9823a, set, (C2704l) new C2700h(this));
    }
}
