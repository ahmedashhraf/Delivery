package p076c.p082c.p083a.p107x;

import java.io.File;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;

/* renamed from: c.c.a.x.a */
/* compiled from: ChildLoadProvider */
public class C2516a<A, T, Z, R> implements C2521f<A, T, Z, R>, Cloneable {

    /* renamed from: N */
    private C2274e<T, Z> f9549N;

    /* renamed from: O */
    private C2275f<Z> f9550O;

    /* renamed from: P */
    private C2491f<Z, R> f9551P;

    /* renamed from: Q */
    private C2271b<T> f9552Q;

    /* renamed from: a */
    private final C2521f<A, T, Z, R> f9553a;

    /* renamed from: b */
    private C2274e<File, Z> f9554b;

    public C2516a(C2521f<A, T, Z, R> fVar) {
        this.f9553a = fVar;
    }

    /* renamed from: a */
    public void mo9975a(C2274e<File, Z> eVar) {
        this.f9554b = eVar;
    }

    /* renamed from: b */
    public void mo9978b(C2274e<T, Z> eVar) {
        this.f9549N = eVar;
    }

    /* renamed from: c */
    public C2491f<Z, R> mo9979c() {
        C2491f<Z, R> fVar = this.f9551P;
        if (fVar != null) {
            return fVar;
        }
        return this.f9553a.mo9979c();
    }

    /* renamed from: d */
    public C2275f<Z> mo9868d() {
        C2275f<Z> fVar = this.f9550O;
        if (fVar != null) {
            return fVar;
        }
        return this.f9553a.mo9868d();
    }

    /* renamed from: e */
    public C2274e<T, Z> mo9869e() {
        C2274e<T, Z> eVar = this.f9549N;
        if (eVar != null) {
            return eVar;
        }
        return this.f9553a.mo9869e();
    }

    /* renamed from: f */
    public C2274e<File, Z> mo9870f() {
        C2274e<File, Z> eVar = this.f9554b;
        if (eVar != null) {
            return eVar;
        }
        return this.f9553a.mo9870f();
    }

    /* renamed from: g */
    public C2409l<A, T> mo9981g() {
        return this.f9553a.mo9981g();
    }

    /* renamed from: a */
    public void mo9976a(C2275f<Z> fVar) {
        this.f9550O = fVar;
    }

    /* renamed from: b */
    public C2271b<T> mo9867b() {
        C2271b<T> bVar = this.f9552Q;
        if (bVar != null) {
            return bVar;
        }
        return this.f9553a.mo9867b();
    }

    public C2516a<A, T, Z, R> clone() {
        try {
            return (C2516a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo9977a(C2491f<Z, R> fVar) {
        this.f9551P = fVar;
    }

    /* renamed from: a */
    public void mo9974a(C2271b<T> bVar) {
        this.f9552Q = bVar;
    }
}
