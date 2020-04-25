package p076c.p082c.p083a.p088u.p098k.p102i;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.view.Gravity;
import p076c.p082c.p083a.p086s.C2262a;
import p076c.p082c.p083a.p086s.C2262a.C2263a;
import p076c.p082c.p083a.p086s.C2265c;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p088u.p098k.p102i.C2463f.C2466c;

/* renamed from: c.c.a.u.k.i.b */
/* compiled from: GifDrawable */
public class C2458b extends C2449b implements C2466c {

    /* renamed from: N */
    private final Paint f9422N;

    /* renamed from: O */
    private final Rect f9423O;

    /* renamed from: P */
    private final C2459a f9424P;

    /* renamed from: Q */
    private final C2262a f9425Q;

    /* renamed from: R */
    private final C2463f f9426R;

    /* renamed from: S */
    private boolean f9427S;

    /* renamed from: T */
    private boolean f9428T;

    /* renamed from: U */
    private boolean f9429U;

    /* renamed from: V */
    private boolean f9430V;

    /* renamed from: W */
    private int f9431W;

    /* renamed from: X */
    private int f9432X;

    /* renamed from: Y */
    private boolean f9433Y;

    /* renamed from: c.c.a.u.k.i.b$a */
    /* compiled from: GifDrawable */
    static class C2459a extends ConstantState {

        /* renamed from: j */
        private static final int f9434j = 119;

        /* renamed from: a */
        C2265c f9435a;

        /* renamed from: b */
        byte[] f9436b;

        /* renamed from: c */
        Context f9437c;

        /* renamed from: d */
        C2276g<Bitmap> f9438d;

        /* renamed from: e */
        int f9439e;

        /* renamed from: f */
        int f9440f;

        /* renamed from: g */
        C2263a f9441g;

        /* renamed from: h */
        C2330c f9442h;

        /* renamed from: i */
        Bitmap f9443i;

        public C2459a(C2265c cVar, byte[] bArr, Context context, C2276g<Bitmap> gVar, int i, int i2, C2263a aVar, C2330c cVar2, Bitmap bitmap) {
            if (bitmap != null) {
                this.f9435a = cVar;
                this.f9436b = bArr;
                this.f9442h = cVar2;
                this.f9443i = bitmap;
                this.f9437c = context.getApplicationContext();
                this.f9438d = gVar;
                this.f9439e = i;
                this.f9440f = i2;
                this.f9441g = aVar;
                return;
            }
            throw new NullPointerException("The first frame of the GIF must not be null");
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        public Drawable newDrawable() {
            return new C2458b(this);
        }

        public C2459a(C2459a aVar) {
            if (aVar != null) {
                this.f9435a = aVar.f9435a;
                this.f9436b = aVar.f9436b;
                this.f9437c = aVar.f9437c;
                this.f9438d = aVar.f9438d;
                this.f9439e = aVar.f9439e;
                this.f9440f = aVar.f9440f;
                this.f9441g = aVar.f9441g;
                this.f9442h = aVar.f9442h;
                this.f9443i = aVar.f9443i;
            }
        }
    }

    public C2458b(Context context, C2263a aVar, C2330c cVar, C2276g<Bitmap> gVar, int i, int i2, C2265c cVar2, byte[] bArr, Bitmap bitmap) {
        C2459a aVar2 = new C2459a(cVar2, bArr, context, gVar, i, i2, aVar, cVar, bitmap);
        this(aVar2);
    }

    /* renamed from: j */
    private void m12343j() {
        this.f9426R.mo9897a();
        invalidateSelf();
    }

    /* renamed from: k */
    private void m12344k() {
        this.f9431W = 0;
    }

    /* renamed from: l */
    private void m12345l() {
        if (this.f9425Q.mo9589e() == 1) {
            invalidateSelf();
        } else if (!this.f9427S) {
            this.f9427S = true;
            this.f9426R.mo9901c();
            invalidateSelf();
        }
    }

    /* renamed from: m */
    private void m12346m() {
        this.f9427S = false;
        this.f9426R.mo9902d();
    }

    /* renamed from: a */
    public void mo9873a(C2276g<Bitmap> gVar, Bitmap bitmap) {
        if (bitmap == null) {
            throw new NullPointerException("The first frame of the GIF must not be null");
        } else if (gVar != null) {
            C2459a aVar = this.f9424P;
            aVar.f9438d = gVar;
            aVar.f9443i = bitmap;
            this.f9426R.mo9898a(gVar);
        } else {
            throw new NullPointerException("The frame transformation must not be null");
        }
    }

    /* renamed from: b */
    public void mo9862b(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            this.f9432X = this.f9425Q.mo9591g();
        } else {
            this.f9432X = i;
        }
    }

    /* renamed from: b */
    public boolean mo9863b() {
        return true;
    }

    /* renamed from: c */
    public byte[] mo9875c() {
        return this.f9424P.f9436b;
    }

    /* renamed from: d */
    public C2262a mo9876d() {
        return this.f9425Q;
    }

    public void draw(Canvas canvas) {
        if (!this.f9429U) {
            if (this.f9433Y) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f9423O);
                this.f9433Y = false;
            }
            Bitmap b = this.f9426R.mo9900b();
            if (b == null) {
                b = this.f9424P.f9443i;
            }
            canvas.drawBitmap(b, null, this.f9423O, this.f9422N);
        }
    }

    /* renamed from: e */
    public Bitmap mo9878e() {
        return this.f9424P.f9443i;
    }

    /* renamed from: f */
    public int mo9879f() {
        return this.f9425Q.mo9589e();
    }

    /* renamed from: g */
    public C2276g<Bitmap> mo9880g() {
        return this.f9424P.f9438d;
    }

    public ConstantState getConstantState() {
        return this.f9424P;
    }

    public int getIntrinsicHeight() {
        return this.f9424P.f9443i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.f9424P.f9443i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo9885h() {
        return this.f9429U;
    }

    /* renamed from: i */
    public void mo9886i() {
        this.f9429U = true;
        C2459a aVar = this.f9424P;
        aVar.f9442h.mo9734a(aVar.f9443i);
        this.f9426R.mo9897a();
        this.f9426R.mo9902d();
    }

    public boolean isRunning() {
        return this.f9427S;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9433Y = true;
    }

    public void setAlpha(int i) {
        this.f9422N.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9422N.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.f9430V = z;
        if (!z) {
            m12346m();
        } else if (this.f9428T) {
            m12345l();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.f9428T = true;
        m12344k();
        if (this.f9430V) {
            m12345l();
        }
    }

    public void stop() {
        this.f9428T = false;
        m12346m();
        if (VERSION.SDK_INT < 11) {
            m12343j();
        }
    }

    public C2458b(C2458b bVar, Bitmap bitmap, C2276g<Bitmap> gVar) {
        C2459a aVar = bVar.f9424P;
        C2459a aVar2 = new C2459a(aVar.f9435a, aVar.f9436b, aVar.f9437c, gVar, aVar.f9439e, aVar.f9440f, aVar.f9441g, aVar.f9442h, bitmap);
        this(aVar2);
    }

    C2458b(C2459a aVar) {
        this.f9423O = new Rect();
        this.f9430V = true;
        this.f9432X = -1;
        if (aVar != null) {
            this.f9424P = aVar;
            this.f9425Q = new C2262a(aVar.f9441g);
            this.f9422N = new Paint();
            this.f9425Q.mo9585a(aVar.f9435a, aVar.f9436b);
            C2463f fVar = new C2463f(aVar.f9437c, this, this.f9425Q, aVar.f9439e, aVar.f9440f);
            this.f9426R = fVar;
            this.f9426R.mo9898a(aVar.f9438d);
            return;
        }
        throw new NullPointerException("GifState must not be null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9874a(boolean z) {
        this.f9427S = z;
    }

    @TargetApi(11)
    /* renamed from: a */
    public void mo9872a(int i) {
        if (VERSION.SDK_INT < 11 || getCallback() != null) {
            invalidateSelf();
            if (i == this.f9425Q.mo9589e() - 1) {
                this.f9431W++;
            }
            int i2 = this.f9432X;
            if (i2 != -1 && this.f9431W >= i2) {
                stop();
            }
            return;
        }
        stop();
        m12343j();
    }

    C2458b(C2262a aVar, C2463f fVar, Bitmap bitmap, C2330c cVar, Paint paint) {
        this.f9423O = new Rect();
        this.f9430V = true;
        this.f9432X = -1;
        this.f9425Q = aVar;
        this.f9426R = fVar;
        this.f9424P = new C2459a(null);
        this.f9422N = paint;
        C2459a aVar2 = this.f9424P;
        aVar2.f9442h = cVar;
        aVar2.f9443i = bitmap;
    }
}
