package p560rm.com.audiowave;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import androidx.core.p034l.C0962e0;
import kotlin.C14737p0;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: rm.com.audiowave.b */
/* compiled from: Graphics.kt */
public final class C15781b {
    /* renamed from: a */
    public static final int m68763a(@C6003d View view, int i) {
        C14445h0.m62478f(view, "$receiver");
        float f = (float) i;
        Resources resources = view.getResources();
        C14445h0.m62453a((Object) resources, "resources");
        return (int) (f * resources.getDisplayMetrics().density);
    }

    @C6003d
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Paint m68772b(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C0962e0.f4343t;
        }
        return m68771b(i);
    }

    @C6003d
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ Paint m68774c(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return m68773c(i);
    }

    @C6003d
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ PorterDuffColorFilter m68765a(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = C0962e0.f4343t;
        }
        return m68764a(i);
    }

    @C6003d
    /* renamed from: b */
    public static final Paint m68771b(int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColorFilter(m68764a(i));
        return paint;
    }

    @C6003d
    /* renamed from: c */
    public static final Paint m68773c(int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    @C6003d
    /* renamed from: a */
    public static final PorterDuffColorFilter m68764a(int i) {
        return new PorterDuffColorFilter(i, Mode.SRC_ATOP);
    }

    /* renamed from: a */
    public static final void m68768a(@C6003d Canvas canvas, @C6003d C6080l<? super Canvas, C14737p0> lVar) {
        C14445h0.m62478f(canvas, "$receiver");
        C14445h0.m62478f(lVar, "init");
        canvas.save();
        lVar.invoke(canvas);
        canvas.restore();
    }

    @C6003d
    /* renamed from: b */
    public static final Canvas m68770b(@C6003d Bitmap bitmap) {
        C14445h0.m62478f(bitmap, "$receiver");
        return new Canvas(bitmap);
    }

    /* renamed from: c */
    public static final void m68775c(@C6004e Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    @C6003d
    /* renamed from: a */
    public static final RectF m68766a(int i, int i2, int i3, int i4) {
        return new RectF((float) i, (float) i2, (float) i3, (float) i4);
    }

    /* renamed from: a */
    public static final int m68762a(int i, int i2) {
        if (i2 >= 0 && 255 >= i2) {
            return (i & C0962e0.f4342s) | (i2 << 24);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: a */
    public static final float m68761a(float f, float f2, float f3) {
        return Math.min(f3, Math.max(f, f2));
    }

    @C6004e
    /* renamed from: a */
    public static final C14737p0 m68767a(@C6004e Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        bitmap.eraseColor(0);
        return C14737p0.f42983a;
    }

    /* renamed from: a */
    public static final boolean m68769a(@C6004e Bitmap bitmap, int i, int i2) {
        return bitmap != null && bitmap.getHeight() == i2 && bitmap.getWidth() == i;
    }
}
