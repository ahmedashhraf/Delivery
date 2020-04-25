package p076c.p112d.p113a.p114a.p118d.p121c;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;
import androidx.recyclerview.widget.C1744m.C1750f;

/* renamed from: c.d.a.a.d.c.e */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C2599e extends Drawable implements Callback {

    /* renamed from: N */
    private int f9700N;

    /* renamed from: O */
    private int f9701O;

    /* renamed from: P */
    private int f9702P;

    /* renamed from: Q */
    private int f9703Q;

    /* renamed from: R */
    private int f9704R;

    /* renamed from: S */
    private boolean f9705S;

    /* renamed from: T */
    private boolean f9706T;

    /* renamed from: U */
    private C2602h f9707U;

    /* renamed from: V */
    private Drawable f9708V;

    /* renamed from: W */
    private Drawable f9709W;

    /* renamed from: X */
    private boolean f9710X;

    /* renamed from: Y */
    private boolean f9711Y;

    /* renamed from: Z */
    private boolean f9712Z;

    /* renamed from: a */
    private int f9713a;

    /* renamed from: a0 */
    private int f9714a0;

    /* renamed from: b */
    private long f9715b;

    public C2599e(Drawable drawable, Drawable drawable2) {
        this(null);
        if (drawable == null) {
            drawable = C2600f.f9716a;
        }
        this.f9708V = drawable;
        drawable.setCallback(this);
        C2602h hVar = this.f9707U;
        hVar.f9719b = drawable.getChangingConfigurations() | hVar.f9719b;
        if (drawable2 == null) {
            drawable2 = C2600f.f9716a;
        }
        this.f9709W = drawable2;
        drawable2.setCallback(this);
        C2602h hVar2 = this.f9707U;
        hVar2.f9719b = drawable2.getChangingConfigurations() | hVar2.f9719b;
    }

    /* renamed from: b */
    private final boolean m12706b() {
        if (!this.f9710X) {
            this.f9711Y = (this.f9708V.getConstantState() == null || this.f9709W.getConstantState() == null) ? false : true;
            this.f9710X = true;
        }
        return this.f9711Y;
    }

    /* renamed from: a */
    public final Drawable mo10098a() {
        return this.f9709W;
    }

    public final void draw(Canvas canvas) {
        int i = this.f9713a;
        boolean z = true;
        if (i == 1) {
            this.f9715b = SystemClock.uptimeMillis();
            this.f9713a = 2;
            z = false;
        } else if (i == 2 && this.f9715b >= 0) {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f9715b)) / ((float) this.f9703Q);
            if (uptimeMillis < 1.0f) {
                z = false;
            }
            if (z) {
                this.f9713a = 0;
            }
            this.f9704R = (int) ((((float) this.f9701O) * Math.min(uptimeMillis, 1.0f)) + 0.0f);
        }
        int i2 = this.f9704R;
        boolean z2 = this.f9705S;
        Drawable drawable = this.f9708V;
        Drawable drawable2 = this.f9709W;
        if (z) {
            if (!z2 || i2 == 0) {
                drawable.draw(canvas);
            }
            int i3 = this.f9702P;
            if (i2 == i3) {
                drawable2.setAlpha(i3);
                drawable2.draw(canvas);
            }
            return;
        }
        if (z2) {
            drawable.setAlpha(this.f9702P - i2);
        }
        drawable.draw(canvas);
        if (z2) {
            drawable.setAlpha(this.f9702P);
        }
        if (i2 > 0) {
            drawable2.setAlpha(i2);
            drawable2.draw(canvas);
            drawable2.setAlpha(this.f9702P);
        }
        invalidateSelf();
    }

    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C2602h hVar = this.f9707U;
        return changingConfigurations | hVar.f9718a | hVar.f9719b;
    }

    public final ConstantState getConstantState() {
        if (!m12706b()) {
            return null;
        }
        this.f9707U.f9718a = getChangingConfigurations();
        return this.f9707U;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.f9708V.getIntrinsicHeight(), this.f9709W.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.f9708V.getIntrinsicWidth(), this.f9709W.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if (!this.f9712Z) {
            this.f9714a0 = Drawable.resolveOpacity(this.f9708V.getOpacity(), this.f9709W.getOpacity());
            this.f9712Z = true;
        }
        return this.f9714a0;
    }

    public final void invalidateDrawable(Drawable drawable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final Drawable mutate() {
        if (!this.f9706T && super.mutate() == this) {
            if (m12706b()) {
                this.f9708V.mutate();
                this.f9709W.mutate();
                this.f9706T = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f9708V.setBounds(rect);
        this.f9709W.setBounds(rect);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final void setAlpha(int i) {
        if (this.f9704R == this.f9702P) {
            this.f9704R = i;
        }
        this.f9702P = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9708V.setColorFilter(colorFilter);
        this.f9709W.setColorFilter(colorFilter);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    public final void mo10099a(int i) {
        this.f9700N = 0;
        this.f9701O = this.f9702P;
        this.f9704R = 0;
        this.f9703Q = C1750f.f6813c;
        this.f9713a = 1;
        invalidateSelf();
    }

    C2599e(C2602h hVar) {
        this.f9713a = 0;
        this.f9702P = 255;
        this.f9704R = 0;
        this.f9705S = true;
        this.f9707U = new C2602h(hVar);
    }
}
