package p076c.p082c.p083a.p088u.p098k.p102i;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.UUID;
import p076c.p082c.p083a.C2226h;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p086s.C2262a;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p095j.C2409l;
import p076c.p082c.p083a.p088u.p098k.C2443b;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2557j;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.u.k.i.f */
/* compiled from: GifFrameLoader */
class C2463f {

    /* renamed from: a */
    private final C2466c f9450a;

    /* renamed from: b */
    private final C2262a f9451b;

    /* renamed from: c */
    private final Handler f9452c;

    /* renamed from: d */
    private boolean f9453d;

    /* renamed from: e */
    private boolean f9454e;

    /* renamed from: f */
    private C2226h<C2262a, C2262a, Bitmap, Bitmap> f9455f;

    /* renamed from: g */
    private C2465b f9456g;

    /* renamed from: h */
    private boolean f9457h;

    /* renamed from: c.c.a.u.k.i.f$b */
    /* compiled from: GifFrameLoader */
    static class C2465b extends C2557j<Bitmap> {

        /* renamed from: O */
        private final Handler f9458O;
        /* access modifiers changed from: private */

        /* renamed from: P */
        public final int f9459P;

        /* renamed from: Q */
        private final long f9460Q;

        /* renamed from: R */
        private Bitmap f9461R;

        public C2465b(Handler handler, int i, long j) {
            this.f9458O = handler;
            this.f9459P = i;
            this.f9460Q = j;
        }

        /* renamed from: c */
        public Bitmap mo9904c() {
            return this.f9461R;
        }

        /* renamed from: a */
        public void mo9404a(Bitmap bitmap, C2535c<? super Bitmap> cVar) {
            this.f9461R = bitmap;
            this.f9458O.sendMessageAtTime(this.f9458O.obtainMessage(1, this), this.f9460Q);
        }
    }

    /* renamed from: c.c.a.u.k.i.f$c */
    /* compiled from: GifFrameLoader */
    public interface C2466c {
        /* renamed from: a */
        void mo9872a(int i);
    }

    /* renamed from: c.c.a.u.k.i.f$d */
    /* compiled from: GifFrameLoader */
    private class C2467d implements Callback {

        /* renamed from: b */
        public static final int f9462b = 1;

        /* renamed from: c */
        public static final int f9463c = 2;

        private C2467d() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                C2463f.this.mo9899a((C2465b) message.obj);
                return true;
            }
            if (i == 2) {
                C2232l.m11645a((C2561m<?>) (C2465b) message.obj);
            }
            return false;
        }
    }

    /* renamed from: c.c.a.u.k.i.f$e */
    /* compiled from: GifFrameLoader */
    static class C2468e implements C2272c {

        /* renamed from: b */
        private final UUID f9465b;

        public C2468e() {
            this(UUID.randomUUID());
        }

        /* renamed from: a */
        public void mo9636a(MessageDigest messageDigest) throws UnsupportedEncodingException {
            throw new UnsupportedOperationException("Not implemented");
        }

        public boolean equals(Object obj) {
            if (obj instanceof C2468e) {
                return ((C2468e) obj).f9465b.equals(this.f9465b);
            }
            return false;
        }

        public int hashCode() {
            return this.f9465b.hashCode();
        }

        C2468e(UUID uuid) {
            this.f9465b = uuid;
        }
    }

    public C2463f(Context context, C2466c cVar, C2262a aVar, int i, int i2) {
        this(cVar, aVar, null, m12365a(context, aVar, i, i2, C2232l.m11632a(context).mo9480e()));
    }

    /* renamed from: e */
    private void m12366e() {
        if (this.f9453d && !this.f9454e) {
            this.f9454e = true;
            this.f9451b.mo9584a();
            this.f9455f.mo9413a((C2272c) new C2468e()).mo9458b(new C2465b(this.f9452c, this.f9451b.mo9587c(), SystemClock.uptimeMillis() + ((long) this.f9451b.mo9592h())));
        }
    }

    /* renamed from: a */
    public void mo9898a(C2276g<Bitmap> gVar) {
        if (gVar != null) {
            this.f9455f = this.f9455f.mo9422a((C2276g<ResourceType>[]) new C2276g[]{gVar});
            return;
        }
        throw new NullPointerException("Transformation must not be null");
    }

    /* renamed from: b */
    public Bitmap mo9900b() {
        C2465b bVar = this.f9456g;
        if (bVar != null) {
            return bVar.mo9904c();
        }
        return null;
    }

    /* renamed from: c */
    public void mo9901c() {
        if (!this.f9453d) {
            this.f9453d = true;
            this.f9457h = false;
            m12366e();
        }
    }

    /* renamed from: d */
    public void mo9902d() {
        this.f9453d = false;
    }

    C2463f(C2466c cVar, C2262a aVar, Handler handler, C2226h<C2262a, C2262a, Bitmap, Bitmap> hVar) {
        this.f9453d = false;
        this.f9454e = false;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper(), new C2467d());
        }
        this.f9450a = cVar;
        this.f9451b = aVar;
        this.f9452c = handler;
        this.f9455f = hVar;
    }

    /* renamed from: a */
    public void mo9897a() {
        mo9902d();
        C2465b bVar = this.f9456g;
        if (bVar != null) {
            C2232l.m11645a((C2561m<?>) bVar);
            this.f9456g = null;
        }
        this.f9457h = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9899a(C2465b bVar) {
        if (this.f9457h) {
            this.f9452c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        C2465b bVar2 = this.f9456g;
        this.f9456g = bVar;
        this.f9450a.mo9872a(bVar.f9459P);
        if (bVar2 != null) {
            this.f9452c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.f9454e = false;
        m12366e();
    }

    /* renamed from: a */
    private static C2226h<C2262a, C2262a, Bitmap, Bitmap> m12365a(Context context, C2262a aVar, int i, int i2, C2330c cVar) {
        C2471h hVar = new C2471h(cVar);
        C2469g gVar = new C2469g();
        return C2232l.m11649c(context).mo9519a((C2409l<A, T>) gVar, C2262a.class).mo9545a(aVar).mo9546a(Bitmap.class).mo9412a(C2443b.m12319a()).mo9428b((C2274e<DataType, ResourceType>) hVar).mo9421a(true).mo9416a(C2302c.NONE).mo9434d(i, i2);
    }
}
