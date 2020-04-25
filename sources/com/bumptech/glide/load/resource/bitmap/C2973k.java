package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.bumptech.glide.load.resource.bitmap.k */
/* compiled from: GlideBitmapDrawable */
public class C2973k extends C2449b {

    /* renamed from: N */
    private final Rect f10515N;

    /* renamed from: O */
    private int f10516O;

    /* renamed from: P */
    private int f10517P;

    /* renamed from: Q */
    private boolean f10518Q;

    /* renamed from: R */
    private boolean f10519R;

    /* renamed from: S */
    private C2974a f10520S;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.k$a */
    /* compiled from: GlideBitmapDrawable */
    static class C2974a extends ConstantState {

        /* renamed from: d */
        private static final int f10521d = 6;

        /* renamed from: e */
        private static final Paint f10522e = new Paint(6);

        /* renamed from: f */
        private static final int f10523f = 119;

        /* renamed from: a */
        final Bitmap f10524a;

        /* renamed from: b */
        int f10525b;

        /* renamed from: c */
        Paint f10526c;

        public C2974a(Bitmap bitmap) {
            this.f10526c = f10522e;
            this.f10524a = bitmap;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11782a(ColorFilter colorFilter) {
            mo11780a();
            this.f10526c.setColorFilter(colorFilter);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new C2973k((Resources) null, this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2973k(resources, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11781a(int i) {
            mo11780a();
            this.f10526c.setAlpha(i);
        }

        C2974a(C2974a aVar) {
            this(aVar.f10524a);
            this.f10525b = aVar.f10525b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11780a() {
            if (f10522e == this.f10526c) {
                this.f10526c = new Paint(6);
            }
        }
    }

    public C2973k(Resources resources, Bitmap bitmap) {
        this(resources, new C2974a(bitmap));
    }

    /* renamed from: b */
    public void mo9862b(int i) {
    }

    /* renamed from: b */
    public boolean mo9863b() {
        return false;
    }

    /* renamed from: c */
    public Bitmap mo11767c() {
        return this.f10520S.f10524a;
    }

    public void draw(Canvas canvas) {
        if (this.f10518Q) {
            Gravity.apply(119, this.f10516O, this.f10517P, getBounds(), this.f10515N);
            this.f10518Q = false;
        }
        C2974a aVar = this.f10520S;
        canvas.drawBitmap(aVar.f10524a, null, this.f10515N, aVar.f10526c);
    }

    public ConstantState getConstantState() {
        return this.f10520S;
    }

    public int getIntrinsicHeight() {
        return this.f10517P;
    }

    public int getIntrinsicWidth() {
        return this.f10516O;
    }

    public int getOpacity() {
        Bitmap bitmap = this.f10520S.f10524a;
        return (bitmap == null || bitmap.hasAlpha() || this.f10520S.f10526c.getAlpha() < 255) ? -3 : -1;
    }

    public boolean isRunning() {
        return false;
    }

    public Drawable mutate() {
        if (!this.f10519R && super.mutate() == this) {
            this.f10520S = new C2974a(this.f10520S);
            this.f10519R = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10518Q = true;
    }

    public void setAlpha(int i) {
        if (this.f10520S.f10526c.getAlpha() != i) {
            this.f10520S.mo11781a(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10520S.mo11782a(colorFilter);
        invalidateSelf();
    }

    public void start() {
    }

    public void stop() {
    }

    C2973k(Resources resources, C2974a aVar) {
        int i;
        this.f10515N = new Rect();
        if (aVar != null) {
            this.f10520S = aVar;
            if (resources != null) {
                i = resources.getDisplayMetrics().densityDpi;
                if (i == 0) {
                    i = C13959t.f40969w2;
                }
                aVar.f10525b = i;
            } else {
                i = aVar.f10525b;
            }
            this.f10516O = aVar.f10524a.getScaledWidth(i);
            this.f10517P = aVar.f10524a.getScaledHeight(i);
            return;
        }
        throw new NullPointerException("BitmapState must not be null");
    }
}
