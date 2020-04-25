package p076c.p082c.p083a.p108y.p110j;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;

/* renamed from: c.c.a.y.j.l */
/* compiled from: SquaringDrawable */
public class C2559l extends C2449b {

    /* renamed from: N */
    private C2449b f9643N;

    /* renamed from: O */
    private C2560a f9644O;

    /* renamed from: P */
    private boolean f9645P;

    /* renamed from: c.c.a.y.j.l$a */
    /* compiled from: SquaringDrawable */
    static class C2560a extends ConstantState {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final ConstantState f9646a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f9647b;

        C2560a(C2560a aVar) {
            this(aVar.f9646a, aVar.f9647b);
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        C2560a(ConstantState constantState, int i) {
            this.f9646a = constantState;
            this.f9647b = i;
        }

        public Drawable newDrawable(Resources resources) {
            return new C2559l(this, null, resources);
        }
    }

    public C2559l(C2449b bVar, int i) {
        this(new C2560a(bVar.getConstantState(), i), bVar, null);
    }

    /* renamed from: b */
    public boolean mo9863b() {
        return this.f9643N.mo9863b();
    }

    public void clearColorFilter() {
        this.f9643N.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        this.f9643N.draw(canvas);
    }

    @TargetApi(19)
    public int getAlpha() {
        return this.f9643N.getAlpha();
    }

    @TargetApi(11)
    public Callback getCallback() {
        return this.f9643N.getCallback();
    }

    public int getChangingConfigurations() {
        return this.f9643N.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        return this.f9644O;
    }

    public Drawable getCurrent() {
        return this.f9643N.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f9644O.f9647b;
    }

    public int getIntrinsicWidth() {
        return this.f9644O.f9647b;
    }

    public int getMinimumHeight() {
        return this.f9643N.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f9643N.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f9643N.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f9643N.getPadding(rect);
    }

    public void invalidateSelf() {
        super.invalidateSelf();
        this.f9643N.invalidateSelf();
    }

    public boolean isRunning() {
        return this.f9643N.isRunning();
    }

    public Drawable mutate() {
        if (!this.f9645P && super.mutate() == this) {
            this.f9643N = (C2449b) this.f9643N.mutate();
            this.f9644O = new C2560a(this.f9644O);
            this.f9645P = true;
        }
        return this;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        this.f9643N.scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f9643N.setAlpha(i);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f9643N.setBounds(i, i2, i3, i4);
    }

    public void setChangingConfigurations(int i) {
        this.f9643N.setChangingConfigurations(i);
    }

    public void setColorFilter(int i, Mode mode) {
        this.f9643N.setColorFilter(i, mode);
    }

    public void setDither(boolean z) {
        this.f9643N.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f9643N.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.f9643N.setVisible(z, z2);
    }

    public void start() {
        this.f9643N.start();
    }

    public void stop() {
        this.f9643N.stop();
    }

    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f9643N.unscheduleSelf(runnable);
    }

    C2559l(C2560a aVar, C2449b bVar, Resources resources) {
        this.f9644O = aVar;
        if (bVar != null) {
            this.f9643N = bVar;
        } else if (resources != null) {
            this.f9643N = (C2449b) aVar.f9646a.newDrawable(resources);
        } else {
            this.f9643N = (C2449b) aVar.f9646a.newDrawable();
        }
    }

    /* renamed from: b */
    public void mo9862b(int i) {
        this.f9643N.mo9862b(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f9643N.setColorFilter(colorFilter);
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f9643N.setBounds(rect);
    }
}
