package p076c.p082c.p083a.p108y;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Queue;
import p076c.p082c.p083a.C2244p;
import p076c.p082c.p083a.p084a0.C2212e;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p089h.C2279c;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p090i.C2303d;
import p076c.p082c.p083a.p088u.p090i.C2303d.C2306c;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p107x.C2521f;
import p076c.p082c.p083a.p108y.p109i.C2537d;
import p076c.p082c.p083a.p108y.p110j.C2558k;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.y.b */
/* compiled from: GenericRequest */
public final class C2523b<A, T, Z, R> implements C2525c, C2558k, C2530g {

    /* renamed from: D */
    private static final String f9561D = "GenericRequest";

    /* renamed from: E */
    private static final Queue<C2523b<?, ?, ?, ?>> f9562E = C2216i.m11342a(0);

    /* renamed from: F */
    private static final double f9563F = 9.5367431640625E-7d;

    /* renamed from: A */
    private C2306c f9564A;

    /* renamed from: B */
    private long f9565B;

    /* renamed from: C */
    private C2524a f9566C;

    /* renamed from: a */
    private final String f9567a = String.valueOf(hashCode());

    /* renamed from: b */
    private C2272c f9568b;

    /* renamed from: c */
    private Drawable f9569c;

    /* renamed from: d */
    private int f9570d;

    /* renamed from: e */
    private int f9571e;

    /* renamed from: f */
    private int f9572f;

    /* renamed from: g */
    private Context f9573g;

    /* renamed from: h */
    private C2276g<Z> f9574h;

    /* renamed from: i */
    private C2521f<A, T, Z, R> f9575i;

    /* renamed from: j */
    private C2526d f9576j;

    /* renamed from: k */
    private A f9577k;

    /* renamed from: l */
    private Class<R> f9578l;

    /* renamed from: m */
    private boolean f9579m;

    /* renamed from: n */
    private C2244p f9580n;

    /* renamed from: o */
    private C2561m<R> f9581o;

    /* renamed from: p */
    private C2529f<? super A, R> f9582p;

    /* renamed from: q */
    private float f9583q;

    /* renamed from: r */
    private C2303d f9584r;

    /* renamed from: s */
    private C2537d<R> f9585s;

    /* renamed from: t */
    private int f9586t;

    /* renamed from: u */
    private int f9587u;

    /* renamed from: v */
    private C2302c f9588v;

    /* renamed from: w */
    private Drawable f9589w;

    /* renamed from: x */
    private Drawable f9590x;

    /* renamed from: y */
    private boolean f9591y;

    /* renamed from: z */
    private C2322l<?> f9592z;

    /* renamed from: c.c.a.y.b$a */
    /* compiled from: GenericRequest */
    private enum C2524a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CANCELLED,
        CLEARED,
        PAUSED
    }

    private C2523b() {
    }

    /* renamed from: b */
    public static <A, T, Z, R> C2523b<A, T, Z, R> m12527b(C2521f<A, T, Z, R> fVar, A a, C2272c cVar, Context context, C2244p pVar, C2561m<R> mVar, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, C2529f<? super A, R> fVar2, C2526d dVar, C2303d dVar2, C2276g<Z> gVar, Class<R> cls, boolean z, C2537d<R> dVar3, int i4, int i5, C2302c cVar2) {
        C2523b<A, T, Z, R> bVar = (C2523b) f9562E.poll();
        if (bVar == null) {
            bVar = new C2523b<>();
        }
        bVar.m12524a(fVar, a, cVar, context, pVar, mVar, f, drawable, i, drawable2, i2, drawable3, i3, fVar2, dVar, dVar2, gVar, cls, z, dVar3, i4, i5, cVar2);
        return bVar;
    }

    /* renamed from: h */
    private boolean m12530h() {
        C2526d dVar = this.f9576j;
        return dVar == null || dVar.mo9996a(this);
    }

    /* renamed from: i */
    private boolean m12531i() {
        C2526d dVar = this.f9576j;
        return dVar == null || dVar.mo9998b(this);
    }

    /* renamed from: j */
    private Drawable m12532j() {
        if (this.f9590x == null && this.f9572f > 0) {
            this.f9590x = this.f9573g.getResources().getDrawable(this.f9572f);
        }
        return this.f9590x;
    }

    /* renamed from: k */
    private Drawable m12533k() {
        if (this.f9569c == null && this.f9570d > 0) {
            this.f9569c = this.f9573g.getResources().getDrawable(this.f9570d);
        }
        return this.f9569c;
    }

    /* renamed from: l */
    private Drawable m12534l() {
        if (this.f9589w == null && this.f9571e > 0) {
            this.f9589w = this.f9573g.getResources().getDrawable(this.f9571e);
        }
        return this.f9589w;
    }

    /* renamed from: m */
    private boolean m12535m() {
        C2526d dVar = this.f9576j;
        return dVar == null || !dVar.mo9997b();
    }

    /* renamed from: n */
    private void m12536n() {
        C2526d dVar = this.f9576j;
        if (dVar != null) {
            dVar.mo9999c(this);
        }
    }

    /* renamed from: a */
    public void mo9985a() {
        this.f9575i = null;
        this.f9577k = null;
        this.f9573g = null;
        this.f9581o = null;
        this.f9589w = null;
        this.f9590x = null;
        this.f9569c = null;
        this.f9582p = null;
        this.f9576j = null;
        this.f9574h = null;
        this.f9585s = null;
        this.f9591y = false;
        this.f9564A = null;
        f9562E.offer(this);
    }

    /* renamed from: c */
    public void mo9987c() {
        this.f9565B = C2212e.m11320a();
        if (this.f9577k == null) {
            mo9693a((Exception) null);
            return;
        }
        this.f9566C = C2524a.WAITING_FOR_SIZE;
        if (C2216i.m11344a(this.f9586t, this.f9587u)) {
            mo9402a(this.f9586t, this.f9587u);
        } else {
            this.f9581o.mo9506a((C2558k) this);
        }
        if (!mo9989d() && !mo9991f() && m12530h()) {
            this.f9581o.mo9486a(m12534l());
        }
        if (Log.isLoggable(f9561D, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("finished run method in ");
            sb.append(C2212e.m11319a(this.f9565B));
            m12525a(sb.toString());
        }
    }

    public void clear() {
        C2216i.m11347b();
        if (this.f9566C != C2524a.CLEARED) {
            mo9986b();
            C2322l<?> lVar = this.f9592z;
            if (lVar != null) {
                m12528b((C2322l) lVar);
            }
            if (m12530h()) {
                this.f9581o.mo9488b(m12534l());
            }
            this.f9566C = C2524a.CLEARED;
        }
    }

    /* renamed from: d */
    public boolean mo9989d() {
        return this.f9566C == C2524a.COMPLETE;
    }

    /* renamed from: e */
    public boolean mo9990e() {
        return mo9989d();
    }

    /* renamed from: f */
    public boolean mo9991f() {
        return this.f9566C == C2524a.FAILED;
    }

    /* renamed from: g */
    public boolean mo9992g() {
        return this.f9566C == C2524a.PAUSED;
    }

    public boolean isCancelled() {
        C2524a aVar = this.f9566C;
        return aVar == C2524a.CANCELLED || aVar == C2524a.CLEARED;
    }

    public boolean isRunning() {
        C2524a aVar = this.f9566C;
        return aVar == C2524a.RUNNING || aVar == C2524a.WAITING_FOR_SIZE;
    }

    /* renamed from: o */
    public void mo9995o() {
        clear();
        this.f9566C = C2524a.PAUSED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9986b() {
        this.f9566C = C2524a.CANCELLED;
        C2306c cVar = this.f9564A;
        if (cVar != null) {
            cVar.mo9687a();
            this.f9564A = null;
        }
    }

    /* renamed from: b */
    private void m12528b(C2322l lVar) {
        this.f9584r.mo9685b(lVar);
        this.f9592z = null;
    }

    /* renamed from: b */
    private void m12529b(Exception exc) {
        if (m12530h()) {
            Drawable k = this.f9577k == null ? m12533k() : null;
            if (k == null) {
                k = m12532j();
            }
            if (k == null) {
                k = m12534l();
            }
            this.f9581o.mo9487a(exc, k);
        }
    }

    /* renamed from: a */
    private void m12524a(C2521f<A, T, Z, R> fVar, A a, C2272c cVar, Context context, C2244p pVar, C2561m<R> mVar, float f, Drawable drawable, int i, Drawable drawable2, int i2, Drawable drawable3, int i3, C2529f<? super A, R> fVar2, C2526d dVar, C2303d dVar2, C2276g<Z> gVar, Class<R> cls, boolean z, C2537d<R> dVar3, int i4, int i5, C2302c cVar2) {
        A a2 = a;
        C2276g<Z> gVar2 = gVar;
        this.f9575i = fVar;
        this.f9577k = a2;
        this.f9568b = cVar;
        this.f9569c = drawable3;
        this.f9570d = i3;
        this.f9573g = context.getApplicationContext();
        this.f9580n = pVar;
        this.f9581o = mVar;
        this.f9583q = f;
        this.f9589w = drawable;
        this.f9571e = i;
        this.f9590x = drawable2;
        this.f9572f = i2;
        this.f9582p = fVar2;
        this.f9576j = dVar;
        this.f9584r = dVar2;
        this.f9574h = gVar2;
        this.f9578l = cls;
        this.f9579m = z;
        this.f9585s = dVar3;
        this.f9586t = i4;
        this.f9587u = i5;
        this.f9588v = cVar2;
        this.f9566C = C2524a.PENDING;
        if (a2 != null) {
            m12526a("ModelLoader", fVar.mo9981g(), "try .using(ModelLoader)");
            m12526a("Transcoder", fVar.mo9979c(), "try .as*(Class).transcode(ResourceTranscoder)");
            m12526a("Transformation", gVar2, "try .transform(UnitTransformation.get())");
            if (cVar2.mo9678e()) {
                m12526a("SourceEncoder", fVar.mo9867b(), "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)");
            } else {
                m12526a("SourceDecoder", fVar.mo9869e(), "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)");
            }
            if (cVar2.mo9678e() || cVar2.mo9677d()) {
                m12526a("CacheDecoder", fVar.mo9870f(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (cVar2.mo9677d()) {
                m12526a("Encoder", fVar.mo9868d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
    }

    /* renamed from: a */
    private static void m12526a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder(str);
            sb.append(" must not be null");
            if (str2 != null) {
                sb.append(", ");
                sb.append(str2);
            }
            throw new NullPointerException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo9402a(int i, int i2) {
        String str = f9561D;
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Got onSizeReady in ");
            sb.append(C2212e.m11319a(this.f9565B));
            m12525a(sb.toString());
        }
        if (this.f9566C == C2524a.WAITING_FOR_SIZE) {
            this.f9566C = C2524a.RUNNING;
            int round = Math.round(this.f9583q * ((float) i));
            int round2 = Math.round(this.f9583q * ((float) i2));
            C2279c a = this.f9575i.mo9981g().mo9812a(this.f9577k, round, round2);
            if (a == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to load model: '");
                sb2.append(this.f9577k);
                sb2.append("'");
                mo9693a(new Exception(sb2.toString()));
                return;
            }
            C2491f c = this.f9575i.mo9979c();
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("finished setup for calling load in ");
                sb3.append(C2212e.m11319a(this.f9565B));
                m12525a(sb3.toString());
            }
            boolean z = true;
            this.f9591y = true;
            this.f9564A = this.f9584r.mo9679a(this.f9568b, round, round2, a, this.f9575i, this.f9574h, c, this.f9580n, this.f9579m, this.f9588v, this);
            if (this.f9592z == null) {
                z = false;
            }
            this.f9591y = z;
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("finished onSizeReady in ");
                sb4.append(C2212e.m11319a(this.f9565B));
                m12525a(sb4.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo9691a(C2322l<?> lVar) {
        if (lVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected to receive a Resource<R> with an object of ");
            sb.append(this.f9578l);
            sb.append(" inside, but instead got null.");
            mo9693a(new Exception(sb.toString()));
            return;
        }
        Object obj = lVar.get();
        if (obj == null || !this.f9578l.isAssignableFrom(obj.getClass())) {
            m12528b((C2322l) lVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Expected to receive an object of ");
            sb2.append(this.f9578l);
            sb2.append(" but instead got ");
            String str = "";
            sb2.append(obj != null ? obj.getClass() : str);
            sb2.append("{");
            sb2.append(obj);
            sb2.append("}");
            sb2.append(" inside Resource{");
            sb2.append(lVar);
            sb2.append("}.");
            if (obj == null) {
                str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
            }
            sb2.append(str);
            mo9693a(new Exception(sb2.toString()));
        } else if (!m12531i()) {
            m12528b((C2322l) lVar);
            this.f9566C = C2524a.COMPLETE;
        } else {
            m12523a(lVar, (R) obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r0.mo10011a(r9, r7.f9577k, r7.f9581o, r7.f9591y, r6) == false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12523a(p076c.p082c.p083a.p088u.p090i.C2322l<?> r8, R r9) {
        /*
            r7 = this;
            boolean r6 = r7.m12535m()
            c.c.a.y.b$a r0 = p076c.p082c.p083a.p108y.C2523b.C2524a.COMPLETE
            r7.f9566C = r0
            r7.f9592z = r8
            c.c.a.y.f<? super A, R> r0 = r7.f9582p
            if (r0 == 0) goto L_0x001c
            A r2 = r7.f9577k
            c.c.a.y.j.m<R> r3 = r7.f9581o
            boolean r4 = r7.f9591y
            r1 = r9
            r5 = r6
            boolean r0 = r0.mo10011a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0029
        L_0x001c:
            c.c.a.y.i.d<R> r0 = r7.f9585s
            boolean r1 = r7.f9591y
            c.c.a.y.i.c r0 = r0.mo10013a(r1, r6)
            c.c.a.y.j.m<R> r1 = r7.f9581o
            r1.mo9404a(r9, r0)
        L_0x0029:
            r7.m12536n()
            r9 = 2
            java.lang.String r0 = "GenericRequest"
            boolean r9 = android.util.Log.isLoggable(r0, r9)
            if (r9 == 0) goto L_0x006d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Resource ready in "
            r9.append(r0)
            long r0 = r7.f9565B
            double r0 = p076c.p082c.p083a.p084a0.C2212e.m11319a(r0)
            r9.append(r0)
            java.lang.String r0 = " size: "
            r9.append(r0)
            int r8 = r8.getSize()
            double r0 = (double) r8
            r2 = 4517110426252607488(0x3eb0000000000000, double:9.5367431640625E-7)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            r9.append(r0)
            java.lang.String r8 = " fromCache: "
            r9.append(r8)
            boolean r8 = r7.f9591y
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.m12525a(r8)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.p108y.C2523b.m12523a(c.c.a.u.i.l, java.lang.Object):void");
    }

    /* renamed from: a */
    public void mo9693a(Exception exc) {
        boolean isLoggable = Log.isLoggable(f9561D, 3);
        this.f9566C = C2524a.FAILED;
        C2529f<? super A, R> fVar = this.f9582p;
        if (fVar == null || !fVar.mo10010a(exc, this.f9577k, this.f9581o, m12535m())) {
            m12529b(exc);
        }
    }

    /* renamed from: a */
    private void m12525a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f9567a);
        sb.toString();
    }
}
