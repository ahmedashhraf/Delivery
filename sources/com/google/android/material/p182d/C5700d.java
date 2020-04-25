package com.google.android.material.p182d;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.p182d.C5705g.C5710e;
import com.google.android.material.p300k.C6947a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.android.material.d.d */
/* compiled from: CircularRevealHelper */
public class C5700d {

    /* renamed from: k */
    private static final boolean f16543k = false;

    /* renamed from: l */
    public static final int f16544l = 0;

    /* renamed from: m */
    public static final int f16545m = 1;

    /* renamed from: n */
    public static final int f16546n = 2;

    /* renamed from: o */
    public static final int f16547o;

    /* renamed from: a */
    private final C5701a f16548a;
    @C0193h0

    /* renamed from: b */
    private final View f16549b;
    @C0193h0

    /* renamed from: c */
    private final Path f16550c = new Path();
    @C0193h0

    /* renamed from: d */
    private final Paint f16551d = new Paint(7);
    @C0193h0

    /* renamed from: e */
    private final Paint f16552e = new Paint(1);
    @C0195i0

    /* renamed from: f */
    private C5710e f16553f;
    @C0195i0

    /* renamed from: g */
    private Drawable f16554g;

    /* renamed from: h */
    private Paint f16555h;

    /* renamed from: i */
    private boolean f16556i;

    /* renamed from: j */
    private boolean f16557j;

    /* renamed from: com.google.android.material.d.d$a */
    /* compiled from: CircularRevealHelper */
    public interface C5701a {
        /* renamed from: a */
        void mo22994a(Canvas canvas);

        /* renamed from: c */
        boolean mo22996c();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.d.d$b */
    /* compiled from: CircularRevealHelper */
    public @interface C5702b {
    }

    static {
        int i = VERSION.SDK_INT;
        if (i >= 21) {
            f16547o = 2;
        } else if (i >= 18) {
            f16547o = 1;
        } else {
            f16547o = 0;
        }
    }

    public C5700d(C5701a aVar) {
        this.f16548a = aVar;
        this.f16549b = (View) aVar;
        this.f16549b.setWillNotDraw(false);
        this.f16552e.setColor(0);
    }

    /* renamed from: g */
    private void m25144g() {
        if (f16547o == 1) {
            this.f16550c.rewind();
            C5710e eVar = this.f16553f;
            if (eVar != null) {
                this.f16550c.addCircle(eVar.f16565a, eVar.f16566b, eVar.f16567c, Direction.CW);
            }
        }
        this.f16549b.invalidate();
    }

    /* renamed from: h */
    private boolean m25145h() {
        C5710e eVar = this.f16553f;
        boolean z = false;
        boolean z2 = eVar == null || eVar.mo23027a();
        if (f16547o != 0) {
            return !z2;
        }
        if (!z2 && this.f16557j) {
            z = true;
        }
        return z;
    }

    /* renamed from: i */
    private boolean m25146i() {
        return (this.f16556i || this.f16554g == null || this.f16553f == null) ? false : true;
    }

    /* renamed from: j */
    private boolean m25147j() {
        return !this.f16556i && Color.alpha(this.f16552e.getColor()) != 0;
    }

    /* renamed from: a */
    public void mo23005a() {
        if (f16547o == 0) {
            this.f16556i = true;
            this.f16557j = false;
            this.f16549b.buildDrawingCache();
            Bitmap drawingCache = this.f16549b.getDrawingCache();
            if (!(drawingCache != null || this.f16549b.getWidth() == 0 || this.f16549b.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.f16549b.getWidth(), this.f16549b.getHeight(), Config.ARGB_8888);
                this.f16549b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f16551d;
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f16556i = false;
            this.f16557j = true;
        }
    }

    /* renamed from: b */
    public void mo23010b() {
        if (f16547o == 0) {
            this.f16557j = false;
            this.f16549b.destroyDrawingCache();
            this.f16551d.setShader(null);
            this.f16549b.invalidate();
        }
    }

    @C0195i0
    /* renamed from: c */
    public Drawable mo23011c() {
        return this.f16554g;
    }

    @C0198k
    /* renamed from: d */
    public int mo23012d() {
        return this.f16552e.getColor();
    }

    @C0195i0
    /* renamed from: e */
    public C5710e mo23013e() {
        C5710e eVar = this.f16553f;
        if (eVar == null) {
            return null;
        }
        C5710e eVar2 = new C5710e(eVar);
        if (eVar2.mo23027a()) {
            eVar2.f16567c = m25141b(eVar2);
        }
        return eVar2;
    }

    /* renamed from: f */
    public boolean mo23014f() {
        return this.f16548a.mo22996c() && !m25145h();
    }

    /* renamed from: c */
    private void m25143c(@C0193h0 Canvas canvas) {
        if (m25146i()) {
            Rect bounds = this.f16554g.getBounds();
            float width = this.f16553f.f16565a - (((float) bounds.width()) / 2.0f);
            float height = this.f16553f.f16566b - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.f16554g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    /* renamed from: b */
    private float m25141b(@C0193h0 C5710e eVar) {
        return C6947a.m33313a(eVar.f16565a, eVar.f16566b, 0.0f, 0.0f, (float) this.f16549b.getWidth(), (float) this.f16549b.getHeight());
    }

    /* renamed from: b */
    private void m25142b(@C0193h0 Canvas canvas) {
        this.f16548a.mo22994a(canvas);
        if (m25147j()) {
            C5710e eVar = this.f16553f;
            canvas.drawCircle(eVar.f16565a, eVar.f16566b, eVar.f16567c, this.f16552e);
        }
        if (m25145h()) {
            m25140a(canvas, C0962e0.f4343t, 10.0f);
            m25140a(canvas, C0886a.f4059c, 5.0f);
        }
        m25143c(canvas);
    }

    /* renamed from: a */
    public void mo23009a(@C0195i0 C5710e eVar) {
        if (eVar == null) {
            this.f16553f = null;
        } else {
            C5710e eVar2 = this.f16553f;
            if (eVar2 == null) {
                this.f16553f = new C5710e(eVar);
            } else {
                eVar2.mo23026a(eVar);
            }
            if (C6947a.m33314a(eVar.f16567c, m25141b(eVar), 1.0E-4f)) {
                this.f16553f.f16567c = Float.MAX_VALUE;
            }
        }
        m25144g();
    }

    /* renamed from: a */
    public void mo23006a(@C0198k int i) {
        this.f16552e.setColor(i);
        this.f16549b.invalidate();
    }

    /* renamed from: a */
    public void mo23008a(@C0195i0 Drawable drawable) {
        this.f16554g = drawable;
        this.f16549b.invalidate();
    }

    /* renamed from: a */
    public void mo23007a(@C0193h0 Canvas canvas) {
        if (m25145h()) {
            int i = f16547o;
            if (i == 0) {
                C5710e eVar = this.f16553f;
                canvas.drawCircle(eVar.f16565a, eVar.f16566b, eVar.f16567c, this.f16551d);
                if (m25147j()) {
                    C5710e eVar2 = this.f16553f;
                    canvas.drawCircle(eVar2.f16565a, eVar2.f16566b, eVar2.f16567c, this.f16552e);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.f16550c);
                this.f16548a.mo22994a(canvas);
                if (m25147j()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f16549b.getWidth(), (float) this.f16549b.getHeight(), this.f16552e);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f16548a.mo22994a(canvas);
                if (m25147j()) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.f16549b.getWidth(), (float) this.f16549b.getHeight(), this.f16552e);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported strategy ");
                sb.append(f16547o);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.f16548a.mo22994a(canvas);
            if (m25147j()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.f16549b.getWidth(), (float) this.f16549b.getHeight(), this.f16552e);
            }
        }
        m25143c(canvas);
    }

    /* renamed from: a */
    private void m25140a(@C0193h0 Canvas canvas, int i, float f) {
        this.f16555h.setColor(i);
        this.f16555h.setStrokeWidth(f);
        C5710e eVar = this.f16553f;
        canvas.drawCircle(eVar.f16565a, eVar.f16566b, eVar.f16567c - (f / 2.0f), this.f16555h);
    }
}
