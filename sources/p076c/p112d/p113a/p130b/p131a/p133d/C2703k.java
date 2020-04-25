package p076c.p112d.p113a.p130b.p131a.p133d;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: c.d.a.b.a.d.k */
final class C2703k implements C2705m {

    /* renamed from: a */
    private final /* synthetic */ Set f9830a;

    /* renamed from: b */
    private final /* synthetic */ C2711s f9831b;

    /* renamed from: c */
    private final /* synthetic */ C2698f f9832c;

    C2703k(C2698f fVar, Set set, C2711s sVar) {
        this.f9832c = fVar;
        this.f9830a = set;
        this.f9831b = sVar;
    }

    /* renamed from: a */
    public final void mo10382a(ZipFile zipFile, Set<C2706n> set) throws IOException {
        this.f9830a.addAll(this.f9832c.m13084a(set, this.f9831b, zipFile));
    }
}
