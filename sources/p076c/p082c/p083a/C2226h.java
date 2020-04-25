package p076c.p082c.p083a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.io.File;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p088u.C2271b;
import p076c.p082c.p083a.p088u.C2272c;
import p076c.p082c.p083a.p088u.C2273d;
import p076c.p082c.p083a.p088u.C2274e;
import p076c.p082c.p083a.p088u.C2275f;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2302c;
import p076c.p082c.p083a.p088u.p098k.C2446e;
import p076c.p082c.p083a.p088u.p098k.p104k.C2491f;
import p076c.p082c.p083a.p105v.C2502g;
import p076c.p082c.p083a.p105v.C2510m;
import p076c.p082c.p083a.p107x.C2516a;
import p076c.p082c.p083a.p107x.C2521f;
import p076c.p082c.p083a.p108y.C2522a;
import p076c.p082c.p083a.p108y.C2523b;
import p076c.p082c.p083a.p108y.C2525c;
import p076c.p082c.p083a.p108y.C2526d;
import p076c.p082c.p083a.p108y.C2527e;
import p076c.p082c.p083a.p108y.C2529f;
import p076c.p082c.p083a.p108y.C2531h;
import p076c.p082c.p083a.p108y.p109i.C2537d;
import p076c.p082c.p083a.p108y.p109i.C2538e;
import p076c.p082c.p083a.p108y.p109i.C2542g;
import p076c.p082c.p083a.p108y.p109i.C2545h.C2546a;
import p076c.p082c.p083a.p108y.p109i.C2547i;
import p076c.p082c.p083a.p108y.p110j.C2556i;
import p076c.p082c.p083a.p108y.p110j.C2561m;
import p076c.p082c.p083a.p111z.C2566b;

/* renamed from: c.c.a.h */
/* compiled from: GenericRequestBuilder */
public class C2226h<ModelType, DataType, ResourceType, TranscodeType> implements Cloneable {

    /* renamed from: N */
    protected final C2232l f8791N;

    /* renamed from: O */
    protected final Class<TranscodeType> f8792O;

    /* renamed from: P */
    protected final C2510m f8793P;

    /* renamed from: Q */
    protected final C2502g f8794Q;

    /* renamed from: R */
    private C2516a<ModelType, DataType, ResourceType, TranscodeType> f8795R;

    /* renamed from: S */
    private ModelType f8796S;

    /* renamed from: T */
    private C2272c f8797T;

    /* renamed from: U */
    private boolean f8798U;

    /* renamed from: V */
    private int f8799V;

    /* renamed from: W */
    private int f8800W;

    /* renamed from: X */
    private C2529f<? super ModelType, TranscodeType> f8801X;

    /* renamed from: Y */
    private Float f8802Y;

    /* renamed from: Z */
    private C2226h<?, ?, ?, TranscodeType> f8803Z;

    /* renamed from: a */
    protected final Class<ModelType> f8804a;

    /* renamed from: a0 */
    private Float f8805a0;

    /* renamed from: b */
    protected final Context f8806b;

    /* renamed from: b0 */
    private Drawable f8807b0;

    /* renamed from: c0 */
    private Drawable f8808c0;

    /* renamed from: d0 */
    private C2244p f8809d0;

    /* renamed from: e0 */
    private boolean f8810e0;

    /* renamed from: f0 */
    private C2537d<TranscodeType> f8811f0;

    /* renamed from: g0 */
    private int f8812g0;

    /* renamed from: h0 */
    private int f8813h0;

    /* renamed from: i0 */
    private C2302c f8814i0;

    /* renamed from: j0 */
    private C2276g<ResourceType> f8815j0;

    /* renamed from: k0 */
    private boolean f8816k0;

    /* renamed from: l0 */
    private boolean f8817l0;

    /* renamed from: m0 */
    private Drawable f8818m0;

    /* renamed from: n0 */
    private int f8819n0;

    /* renamed from: c.c.a.h$a */
    /* compiled from: GenericRequestBuilder */
    class C2227a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2527e f8820a;

        C2227a(C2527e eVar) {
            this.f8820a = eVar;
        }

        public void run() {
            if (!this.f8820a.isCancelled()) {
                C2226h.this.mo9458b(this.f8820a);
            }
        }
    }

    /* renamed from: c.c.a.h$b */
    /* compiled from: GenericRequestBuilder */
    static /* synthetic */ class C2228b {

        /* renamed from: a */
        static final /* synthetic */ int[] f8822a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8822a = r0
                int[] r0 = f8822a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f8822a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f8822a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f8822a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p082c.p083a.C2226h.C2228b.<clinit>():void");
        }
    }

    C2226h(C2521f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls, C2226h<ModelType, ?, ?, ?> hVar) {
        this(hVar.f8806b, hVar.f8804a, fVar, cls, hVar.f8791N, hVar.f8793P, hVar.f8794Q);
        this.f8796S = hVar.f8796S;
        this.f8798U = hVar.f8798U;
        this.f8797T = hVar.f8797T;
        this.f8814i0 = hVar.f8814i0;
        this.f8810e0 = hVar.f8810e0;
    }

    /* renamed from: j */
    private C2244p mo9441j() {
        C2244p pVar = this.f8809d0;
        if (pVar == C2244p.LOW) {
            return C2244p.NORMAL;
        }
        if (pVar == C2244p.NORMAL) {
            return C2244p.HIGH;
        }
        return C2244p.IMMEDIATE;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9409a(C2226h<?, ?, ?, TranscodeType> hVar) {
        if (!equals(hVar)) {
            this.f8803Z = hVar;
            return this;
        }
        throw new IllegalArgumentException("You cannot set a request as a thumbnail for itself. Consider using clone() on the request you are passing to thumbnail()");
    }

    /* renamed from: b */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9425b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f8802Y = Float.valueOf(f);
        return this;
    }

    /* renamed from: c */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9430c(Drawable drawable) {
        this.f8807b0 = drawable;
        return this;
    }

    /* renamed from: d */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9433d(int i) {
        this.f8819n0 = i;
        return this;
    }

    /* renamed from: e */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9436e(int i) {
        this.f8799V = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo9437e() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo9438f() {
    }

    /* renamed from: g */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9439g() {
        return mo9457a(C2538e.m12598c());
    }

    /* renamed from: h */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9440h() {
        return mo9422a((C2276g<ResourceType>[]) new C2276g[]{C2446e.m12325a()});
    }

    /* renamed from: i */
    public C2561m<TranscodeType> mo9461i() {
        return mo9460e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: c */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9429c(int i) {
        this.f8800W = i;
        return this;
    }

    public C2226h<ModelType, DataType, ResourceType, TranscodeType> clone() {
        try {
            C2226h<ModelType, DataType, ResourceType, TranscodeType> hVar = (C2226h) super.clone();
            hVar.f8795R = this.f8795R != null ? this.f8795R.clone() : null;
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9434d(int i, int i2) {
        if (C2216i.m11344a(i, i2)) {
            this.f8813h0 = i;
            this.f8812g0 = i2;
            return this;
        }
        throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
    }

    /* renamed from: e */
    public C2561m<TranscodeType> mo9460e(int i, int i2) {
        return mo9458b((Y) C2556i.m12632a(i, i2));
    }

    /* renamed from: b */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9428b(C2274e<DataType, ResourceType> eVar) {
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        if (aVar != null) {
            aVar.mo9978b(eVar);
        }
        return this;
    }

    /* renamed from: c */
    public C2522a<TranscodeType> mo9459c(int i, int i2) {
        C2527e eVar = new C2527e(this.f8791N.mo9485j(), i, i2);
        this.f8791N.mo9485j().post(new C2227a(eVar));
        return eVar;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9405a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f8805a0 = Float.valueOf(f);
        return this;
    }

    /* renamed from: c */
    private C2525c m11515c(C2561m<TranscodeType> mVar) {
        if (this.f8809d0 == null) {
            this.f8809d0 = C2244p.NORMAL;
        }
        return m11514a(mVar, null);
    }

    /* renamed from: b */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9426b(int i) {
        return mo9457a((C2537d<TranscodeType>) new C2542g<TranscodeType>(this.f8806b, i));
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9414a(C2274e<File, ResourceType> eVar) {
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        if (aVar != null) {
            aVar.mo9975a(eVar);
        }
        return this;
    }

    /* renamed from: b */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9427b(Drawable drawable) {
        this.f8818m0 = drawable;
        return this;
    }

    C2226h(Context context, Class<ModelType> cls, C2521f<ModelType, DataType, ResourceType, TranscodeType> fVar, Class<TranscodeType> cls2, C2232l lVar, C2510m mVar, C2502g gVar) {
        this.f8797T = C2566b.m12665a();
        this.f8805a0 = Float.valueOf(1.0f);
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = null;
        this.f8809d0 = null;
        this.f8810e0 = true;
        this.f8811f0 = C2538e.m12598c();
        this.f8812g0 = -1;
        this.f8813h0 = -1;
        this.f8814i0 = C2302c.RESULT;
        this.f8815j0 = C2446e.m12325a();
        this.f8806b = context;
        this.f8804a = cls;
        this.f8792O = cls2;
        this.f8791N = lVar;
        this.f8793P = mVar;
        this.f8794Q = gVar;
        if (fVar != null) {
            aVar = new C2516a<>(fVar);
        }
        this.f8795R = aVar;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        } else if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    /* renamed from: b */
    public <Y extends C2561m<TranscodeType>> Y mo9458b(Y y) {
        C2216i.m11347b();
        if (y == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        } else if (this.f8798U) {
            C2525c a = y.mo10000a();
            if (a != null) {
                a.clear();
                this.f8793P.mo9961b(a);
                a.mo9985a();
            }
            C2525c c = m11515c((C2561m<TranscodeType>) y);
            y.mo10001a(c);
            this.f8794Q.mo9931a(y);
            this.f8793P.mo9964c(c);
            return y;
        } else {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9412a(C2271b<DataType> bVar) {
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        if (aVar != null) {
            aVar.mo9974a(bVar);
        }
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9416a(C2302c cVar) {
        this.f8814i0 = cVar;
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9415a(C2275f<ResourceType> fVar) {
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        if (aVar != null) {
            aVar.mo9976a(fVar);
        }
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9410a(C2244p pVar) {
        this.f8809d0 = pVar;
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9422a(C2276g<ResourceType>... gVarArr) {
        this.f8816k0 = true;
        if (gVarArr.length == 1) {
            this.f8815j0 = gVarArr[0];
        } else {
            this.f8815j0 = new C2273d((C2276g<T>[]) gVarArr);
        }
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9417a(C2491f<ResourceType, TranscodeType> fVar) {
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        if (aVar != null) {
            aVar.mo9977a(fVar);
        }
        return this;
    }

    @Deprecated
    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9407a(Animation animation) {
        return mo9457a((C2537d<TranscodeType>) new C2542g<TranscodeType>(animation));
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9419a(C2546a aVar) {
        return mo9457a((C2537d<TranscodeType>) new C2547i<TranscodeType>(aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9457a(C2537d<TranscodeType> dVar) {
        if (dVar != null) {
            this.f8811f0 = dVar;
            return this;
        }
        throw new NullPointerException("Animation factory must not be null!");
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9406a(Drawable drawable) {
        this.f8808c0 = drawable;
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9418a(C2529f<? super ModelType, TranscodeType> fVar) {
        this.f8801X = fVar;
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9421a(boolean z) {
        this.f8810e0 = !z;
        return this;
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9413a(C2272c cVar) {
        if (cVar != null) {
            this.f8797T = cVar;
            return this;
        }
        throw new NullPointerException("Signature must not be null");
    }

    /* renamed from: a */
    public C2226h<ModelType, DataType, ResourceType, TranscodeType> mo9420a(ModelType modeltype) {
        this.f8796S = modeltype;
        this.f8798U = true;
        return this;
    }

    /* renamed from: a */
    public C2561m<TranscodeType> mo9424a(ImageView imageView) {
        C2216i.m11347b();
        if (imageView != null) {
            if (!this.f8816k0 && imageView.getScaleType() != null) {
                int i = C2228b.f8822a[imageView.getScaleType().ordinal()];
                if (i == 1) {
                    mo9437e();
                } else if (i == 2 || i == 3 || i == 4) {
                    mo9438f();
                }
            }
            return mo9458b((Y) this.f8791N.mo9469a(imageView, this.f8792O));
        }
        throw new IllegalArgumentException("You must pass in a non null View");
    }

    /* renamed from: a */
    private C2525c m11514a(C2561m<TranscodeType> mVar, C2531h hVar) {
        C2226h<?, ?, ?, TranscodeType> hVar2 = this.f8803Z;
        if (hVar2 != null) {
            if (!this.f8817l0) {
                if (hVar2.f8811f0.equals(C2538e.m12598c())) {
                    this.f8803Z.f8811f0 = this.f8811f0;
                }
                C2226h<?, ?, ?, TranscodeType> hVar3 = this.f8803Z;
                if (hVar3.f8809d0 == null) {
                    hVar3.f8809d0 = mo9441j();
                }
                if (C2216i.m11344a(this.f8813h0, this.f8812g0)) {
                    C2226h<?, ?, ?, TranscodeType> hVar4 = this.f8803Z;
                    if (!C2216i.m11344a(hVar4.f8813h0, hVar4.f8812g0)) {
                        this.f8803Z.mo9434d(this.f8813h0, this.f8812g0);
                    }
                }
                C2531h hVar5 = new C2531h(hVar);
                C2525c a = m11513a(mVar, this.f8805a0.floatValue(), this.f8809d0, hVar5);
                this.f8817l0 = true;
                C2525c a2 = this.f8803Z.m11514a(mVar, hVar5);
                this.f8817l0 = false;
                hVar5.mo10012a(a, a2);
                return hVar5;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f8802Y == null) {
            return m11513a(mVar, this.f8805a0.floatValue(), this.f8809d0, hVar);
        } else {
            C2531h hVar6 = new C2531h(hVar);
            hVar6.mo10012a(m11513a(mVar, this.f8805a0.floatValue(), this.f8809d0, hVar6), m11513a(mVar, this.f8802Y.floatValue(), mo9441j(), hVar6));
            return hVar6;
        }
    }

    /* renamed from: a */
    private C2525c m11513a(C2561m<TranscodeType> mVar, float f, C2244p pVar, C2526d dVar) {
        C2561m<TranscodeType> mVar2 = mVar;
        float f2 = f;
        C2244p pVar2 = pVar;
        C2526d dVar2 = dVar;
        C2516a<ModelType, DataType, ResourceType, TranscodeType> aVar = this.f8795R;
        return C2523b.m12527b(aVar, this.f8796S, this.f8797T, this.f8806b, pVar2, mVar2, f2, this.f8807b0, this.f8799V, this.f8808c0, this.f8800W, this.f8818m0, this.f8819n0, this.f8801X, dVar2, this.f8791N.mo9484i(), this.f8815j0, this.f8792O, this.f8810e0, this.f8811f0, this.f8813h0, this.f8812g0, this.f8814i0);
    }
}
