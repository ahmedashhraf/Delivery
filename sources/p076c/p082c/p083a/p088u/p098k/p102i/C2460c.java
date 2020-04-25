package p076c.p082c.p083a.p088u.p098k.p102i;

import android.content.Context;
import java.io.File;
import java.io.InputStream;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2412o;
import p076c.p082c.p083a.p088u.p098k.p101h.C2452c;
import p076c.p082c.p083a.p107x.C2517b;

/* renamed from: c.c.a.u.k.i.c */
/* compiled from: GifDrawableLoadProvider */
public class C2460c implements C2517b<InputStream, C2458b> {

    /* renamed from: N */
    private final C2412o f9444N;

    /* renamed from: O */
    private final C2452c<C2458b> f9445O = new C2452c<>(this.f9446a);

    /* renamed from: a */
    private final C2472i f9446a;

    /* renamed from: b */
    private final C2475j f9447b;

    public C2460c(Context context, C2330c cVar) {
        this.f9446a = new C2472i(context, cVar);
        this.f9447b = new C2475j(cVar);
        this.f9444N = new C2412o();
    }

    /* renamed from: b */
    public C2271b<InputStream> mo9867b() {
        return this.f9444N;
    }

    /* renamed from: d */
    public C2275f<C2458b> mo9868d() {
        return this.f9447b;
    }

    /* renamed from: e */
    public C2274e<InputStream, C2458b> mo9869e() {
        return this.f9446a;
    }

    /* renamed from: f */
    public C2274e<File, C2458b> mo9870f() {
        return this.f9445O;
    }
}
