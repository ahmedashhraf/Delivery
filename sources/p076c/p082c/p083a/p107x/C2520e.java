package p076c.p082c.p083a.p107x;

import java.io.File;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;

/* renamed from: c.c.a.x.e */
/* compiled from: FixedLoadProvider */
public class C2520e<A, T, Z, R> implements C2521f<A, T, Z, R> {

    /* renamed from: N */
    private final C2517b<T, Z> f9558N;

    /* renamed from: a */
    private final C2409l<A, T> f9559a;

    /* renamed from: b */
    private final C2491f<Z, R> f9560b;

    public C2520e(C2409l<A, T> lVar, C2491f<Z, R> fVar, C2517b<T, Z> bVar) {
        if (lVar != null) {
            this.f9559a = lVar;
            if (fVar != null) {
                this.f9560b = fVar;
                if (bVar != null) {
                    this.f9558N = bVar;
                    return;
                }
                throw new NullPointerException("DataLoadProvider must not be null");
            }
            throw new NullPointerException("Transcoder must not be null");
        }
        throw new NullPointerException("ModelLoader must not be null");
    }

    /* renamed from: b */
    public C2271b<T> mo9867b() {
        return this.f9558N.mo9867b();
    }

    /* renamed from: c */
    public C2491f<Z, R> mo9979c() {
        return this.f9560b;
    }

    /* renamed from: d */
    public C2275f<Z> mo9868d() {
        return this.f9558N.mo9868d();
    }

    /* renamed from: e */
    public C2274e<T, Z> mo9869e() {
        return this.f9558N.mo9869e();
    }

    /* renamed from: f */
    public C2274e<File, Z> mo9870f() {
        return this.f9558N.mo9870f();
    }

    /* renamed from: g */
    public C2409l<A, T> mo9981g() {
        return this.f9559a;
    }
}
