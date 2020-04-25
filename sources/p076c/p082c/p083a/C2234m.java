package p076c.p082c.p083a;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.ExecutorService;
import p076c.p082c.p083a.p088u.C2270a;
import p076c.p082c.p083a.p088u.p090i.C2303d;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p090i.p091n.C2331d;
import p076c.p082c.p083a.p088u.p090i.p091n.C2334f;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2349a.C2350a;
import p076c.p082c.p083a.p088u.p090i.p092o.C2364g;
import p076c.p082c.p083a.p088u.p090i.p092o.C2366h;
import p076c.p082c.p083a.p088u.p090i.p092o.C2367i;
import p076c.p082c.p083a.p088u.p090i.p092o.C2370k;
import p076c.p082c.p083a.p088u.p090i.p093p.C2374a;

/* renamed from: c.c.a.m */
/* compiled from: GlideBuilder */
public class C2234m {

    /* renamed from: a */
    private final Context f8845a;

    /* renamed from: b */
    private C2303d f8846b;

    /* renamed from: c */
    private C2330c f8847c;

    /* renamed from: d */
    private C2367i f8848d;

    /* renamed from: e */
    private ExecutorService f8849e;

    /* renamed from: f */
    private ExecutorService f8850f;

    /* renamed from: g */
    private C2270a f8851g;

    /* renamed from: h */
    private C2350a f8852h;

    /* renamed from: c.c.a.m$a */
    /* compiled from: GlideBuilder */
    class C2235a implements C2350a {

        /* renamed from: c */
        final /* synthetic */ C2349a f8853c;

        C2235a(C2349a aVar) {
            this.f8853c = aVar;
        }

        public C2349a build() {
            return this.f8853c;
        }
    }

    public C2234m(Context context) {
        this.f8845a = context.getApplicationContext();
    }

    /* renamed from: a */
    public C2234m mo9492a(C2330c cVar) {
        this.f8847c = cVar;
        return this;
    }

    /* renamed from: b */
    public C2234m mo9497b(ExecutorService executorService) {
        this.f8849e = executorService;
        return this;
    }

    /* renamed from: a */
    public C2234m mo9495a(C2367i iVar) {
        this.f8848d = iVar;
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2234m mo9494a(C2349a aVar) {
        return mo9493a((C2350a) new C2235a(aVar));
    }

    /* renamed from: a */
    public C2234m mo9493a(C2350a aVar) {
        this.f8852h = aVar;
        return this;
    }

    /* renamed from: a */
    public C2234m mo9496a(ExecutorService executorService) {
        this.f8850f = executorService;
        return this;
    }

    /* renamed from: a */
    public C2234m mo9490a(C2270a aVar) {
        this.f8851g = aVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2234m mo9491a(C2303d dVar) {
        this.f8846b = dVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2232l mo9489a() {
        if (this.f8849e == null) {
            this.f8849e = new C2374a(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f8850f == null) {
            this.f8850f = new C2374a(1);
        }
        C2370k kVar = new C2370k(this.f8845a);
        if (this.f8847c == null) {
            if (VERSION.SDK_INT >= 11) {
                this.f8847c = new C2334f(kVar.mo9778a());
            } else {
                this.f8847c = new C2331d();
            }
        }
        if (this.f8848d == null) {
            this.f8848d = new C2366h(kVar.mo9779b());
        }
        if (this.f8852h == null) {
            this.f8852h = new C2364g(this.f8845a);
        }
        if (this.f8846b == null) {
            this.f8846b = new C2303d(this.f8848d, this.f8852h, this.f8850f, this.f8849e);
        }
        if (this.f8851g == null) {
            this.f8851g = C2270a.DEFAULT;
        }
        C2232l lVar = new C2232l(this.f8846b, this.f8848d, this.f8847c, this.f8845a, this.f8851g);
        return lVar;
    }
}
