package com.mrsool.customeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import com.bumptech.glide.load.resource.bitmap.C2963d;
import p076c.p082c.p083a.C2232l;
import p076c.p082c.p083a.p088u.C2276g;
import p076c.p082c.p083a.p088u.p090i.C2322l;
import p076c.p082c.p083a.p088u.p090i.p091n.C2330c;

/* renamed from: com.mrsool.customeview.j */
/* compiled from: RoundedCornersTransformation */
public class C10783j implements C2276g<Bitmap> {

    /* renamed from: a */
    private C2330c f29631a;

    /* renamed from: b */
    private int f29632b;

    /* renamed from: c */
    private int f29633c;

    /* renamed from: d */
    private int f29634d;

    /* renamed from: e */
    private C10785b f29635e;

    /* renamed from: com.mrsool.customeview.j$a */
    /* compiled from: RoundedCornersTransformation */
    static /* synthetic */ class C10784a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29636a = new int[C10785b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.mrsool.customeview.j$b[] r0 = com.mrsool.customeview.C10783j.C10785b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29636a = r0
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.ALL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.TOP     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.LEFT     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.RIGHT     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.OTHER_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.OTHER_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.OTHER_BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.OTHER_BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.DIAGONAL_FROM_TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = f29636a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.mrsool.customeview.j$b r1 = com.mrsool.customeview.C10783j.C10785b.DIAGONAL_FROM_TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mrsool.customeview.C10783j.C10784a.<clinit>():void");
        }
    }

    /* renamed from: com.mrsool.customeview.j$b */
    /* compiled from: RoundedCornersTransformation */
    public enum C10785b {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public C10783j(Context context, int i, int i2) {
        this(context, i, i2, C10785b.ALL);
    }

    /* renamed from: b */
    private void m49542b(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29633c;
        RectF rectF = new RectF(f - ((float) i), f2 - ((float) i), f, f2);
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f29634d;
        canvas.drawRect(new RectF((float) i3, (float) i3, f - ((float) this.f29632b), f2), paint);
        int i4 = this.f29632b;
        canvas.drawRect(new RectF(f - ((float) i4), (float) this.f29634d, f, f2 - ((float) i4)), paint);
    }

    /* renamed from: c */
    private void m49543c(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.f29634d, f2 - ((float) this.f29633c), f, f2);
        int i = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.f29634d;
        canvas.drawRect(new RectF((float) i2, (float) i2, f, f2 - ((float) this.f29632b)), paint);
    }

    /* renamed from: d */
    private void m49544d(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        float f3 = (float) i;
        float f4 = (float) i;
        int i2 = this.f29633c;
        RectF rectF = new RectF(f3, f4, (float) (i + i2), (float) (i + i2));
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f29633c;
        RectF rectF2 = new RectF(f - ((float) i4), f2 - ((float) i4), f, f2);
        int i5 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
        int i6 = this.f29634d;
        canvas.drawRect(new RectF((float) i6, (float) (i6 + this.f29632b), f - ((float) this.f29633c), f2), paint);
        int i7 = this.f29634d;
        canvas.drawRect(new RectF((float) (this.f29633c + i7), (float) i7, f, f2 - ((float) this.f29632b)), paint);
    }

    /* renamed from: e */
    private void m49545e(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29633c;
        float f3 = f - ((float) i);
        int i2 = this.f29634d;
        RectF rectF = new RectF(f3, (float) i2, f, (float) (i2 + i));
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        float f4 = (float) i4;
        int i5 = this.f29633c;
        RectF rectF2 = new RectF(f4, f2 - ((float) i5), (float) (i4 + i5), f2);
        int i6 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i6, (float) i6, paint);
        int i7 = this.f29634d;
        float f5 = (float) i7;
        float f6 = (float) i7;
        int i8 = this.f29632b;
        canvas.drawRect(new RectF(f5, f6, f - ((float) i8), f2 - ((float) i8)), paint);
        int i9 = this.f29634d;
        int i10 = this.f29632b;
        canvas.drawRect(new RectF((float) (i9 + i10), (float) (i9 + i10), f, f2), paint);
    }

    /* renamed from: f */
    private void m49546f(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.f29633c), f2);
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f29634d;
        canvas.drawRect(new RectF((float) (this.f29632b + i3), (float) i3, f, f2), paint);
    }

    /* renamed from: g */
    private void m49547g(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f29633c));
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF(f - ((float) this.f29633c), (float) this.f29634d, f, f2);
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        float f3 = (float) i4;
        int i5 = this.f29632b;
        canvas.drawRect(new RectF(f3, (float) (i4 + i5), f - ((float) i5), f2), paint);
    }

    /* renamed from: h */
    private void m49548h(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f29633c));
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f29634d;
        RectF rectF2 = new RectF((float) i3, (float) i3, (float) (i3 + this.f29633c), f2);
        int i4 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i4, (float) i4, paint);
        int i5 = this.f29634d;
        int i6 = this.f29632b;
        canvas.drawRect(new RectF((float) (i5 + i6), (float) (i5 + i6), f, f2), paint);
    }

    /* renamed from: i */
    private void m49549i(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF((float) this.f29634d, f2 - ((float) this.f29633c), f, f2);
        int i = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        RectF rectF2 = new RectF(f - ((float) this.f29633c), (float) this.f29634d, f, f2);
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i2, (float) i2, paint);
        int i3 = this.f29634d;
        float f3 = (float) i3;
        float f4 = (float) i3;
        int i4 = this.f29632b;
        canvas.drawRect(new RectF(f3, f4, f - ((float) i4), f2 - ((float) i4)), paint);
    }

    /* renamed from: j */
    private void m49550j(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        RectF rectF = new RectF((float) i, (float) i, (float) (i + this.f29633c), f2);
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        RectF rectF2 = new RectF((float) this.f29634d, f2 - ((float) this.f29633c), f, f2);
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF2, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        int i5 = this.f29632b;
        canvas.drawRect(new RectF((float) (i4 + i5), (float) i4, f, f2 - ((float) i5)), paint);
    }

    /* renamed from: k */
    private void m49551k(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - ((float) this.f29633c), (float) this.f29634d, f, f2);
        int i = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i, (float) i, paint);
        int i2 = this.f29634d;
        canvas.drawRect(new RectF((float) i2, (float) i2, f - ((float) this.f29632b), f2), paint);
    }

    /* renamed from: l */
    private void m49552l(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        float f3 = f - ((float) i);
        float f4 = f2 - ((float) i);
        switch (C10784a.f29636a[this.f29635e.ordinal()]) {
            case 1:
                int i2 = this.f29634d;
                RectF rectF = new RectF((float) i2, (float) i2, f3, f4);
                int i3 = this.f29632b;
                canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
                return;
            case 2:
                m49553m(canvas, paint, f3, f4);
                return;
            case 3:
                m49554n(canvas, paint, f3, f4);
                return;
            case 4:
                m49541a(canvas, paint, f3, f4);
                return;
            case 5:
                m49542b(canvas, paint, f3, f4);
                return;
            case 6:
                m49555o(canvas, paint, f3, f4);
                return;
            case 7:
                m49543c(canvas, paint, f3, f4);
                return;
            case 8:
                m49546f(canvas, paint, f3, f4);
                return;
            case 9:
                m49551k(canvas, paint, f3, f4);
                return;
            case 10:
                m49549i(canvas, paint, f3, f4);
                return;
            case 11:
                m49550j(canvas, paint, f3, f4);
                return;
            case 12:
                m49547g(canvas, paint, f3, f4);
                return;
            case 13:
                m49548h(canvas, paint, f3, f4);
                return;
            case 14:
                m49544d(canvas, paint, f3, f4);
                return;
            case 15:
                m49545e(canvas, paint, f3, f4);
                return;
            default:
                int i4 = this.f29634d;
                RectF rectF2 = new RectF((float) i4, (float) i4, f3, f4);
                int i5 = this.f29632b;
                canvas.drawRoundRect(rectF2, (float) i5, (float) i5, paint);
                return;
        }
    }

    /* renamed from: m */
    private void m49553m(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        float f3 = (float) i;
        float f4 = (float) i;
        int i2 = this.f29633c;
        RectF rectF = new RectF(f3, f4, (float) (i + i2), (float) (i + i2));
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        float f5 = (float) i4;
        int i5 = this.f29632b;
        canvas.drawRect(new RectF(f5, (float) (i4 + i5), (float) (i4 + i5), f2), paint);
        int i6 = this.f29634d;
        canvas.drawRect(new RectF((float) (this.f29632b + i6), (float) i6, f, f2), paint);
    }

    /* renamed from: n */
    private void m49554n(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29633c;
        float f3 = f - ((float) i);
        int i2 = this.f29634d;
        RectF rectF = new RectF(f3, (float) i2, f, (float) (i2 + i));
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        canvas.drawRect(new RectF((float) i4, (float) i4, f - ((float) this.f29632b), f2), paint);
        int i5 = this.f29632b;
        canvas.drawRect(new RectF(f - ((float) i5), (float) (this.f29634d + i5), f, f2), paint);
    }

    /* renamed from: o */
    private void m49555o(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        RectF rectF = new RectF((float) i, (float) i, f, (float) (i + this.f29633c));
        int i2 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i2, (float) i2, paint);
        int i3 = this.f29634d;
        canvas.drawRect(new RectF((float) i3, (float) (i3 + this.f29632b), f, f2), paint);
    }

    /* renamed from: a */
    public C2322l<Bitmap> mo9639a(C2322l<Bitmap> lVar, int i, int i2) {
        Bitmap bitmap = (Bitmap) lVar.get();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap a = this.f29631a.mo9731a(width, height, Config.ARGB_8888);
        if (a == null) {
            a = Bitmap.createBitmap(width, height, Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(a);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        TileMode tileMode = TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        m49552l(canvas, paint, (float) width, (float) height);
        return C2963d.m14190a(a, this.f29631a);
    }

    public String getId() {
        StringBuilder sb = new StringBuilder();
        sb.append("RoundedTransformation(radius=");
        sb.append(this.f29632b);
        sb.append(", margin=");
        sb.append(this.f29634d);
        sb.append(", diameter=");
        sb.append(this.f29633c);
        sb.append(", cornerType=");
        sb.append(this.f29635e.name());
        sb.append(")");
        return sb.toString();
    }

    public C10783j(C2330c cVar, int i, int i2) {
        this(cVar, i, i2, C10785b.ALL);
    }

    public C10783j(Context context, int i, int i2, C10785b bVar) {
        this(C2232l.m11632a(context).mo9480e(), i, i2, bVar);
    }

    public C10783j(C2330c cVar, int i, int i2, C10785b bVar) {
        this.f29631a = cVar;
        this.f29632b = i;
        this.f29633c = this.f29632b * 2;
        this.f29634d = i2;
        this.f29635e = bVar;
    }

    /* renamed from: a */
    private void m49541a(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.f29634d;
        float f3 = (float) i;
        int i2 = this.f29633c;
        RectF rectF = new RectF(f3, f2 - ((float) i2), (float) (i + i2), f2);
        int i3 = this.f29632b;
        canvas.drawRoundRect(rectF, (float) i3, (float) i3, paint);
        int i4 = this.f29634d;
        canvas.drawRect(new RectF((float) i4, (float) i4, (float) (i4 + this.f29633c), f2 - ((float) this.f29632b)), paint);
        int i5 = this.f29634d;
        canvas.drawRect(new RectF((float) (this.f29632b + i5), (float) i5, f, f2), paint);
    }
}
