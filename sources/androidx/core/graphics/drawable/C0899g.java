package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.graphics.drawable.g */
/* compiled from: WrappedDrawableApi14 */
class C0899g extends Drawable implements Callback, C0898f, C0897e {

    /* renamed from: R */
    static final Mode f4113R = Mode.SRC_IN;

    /* renamed from: N */
    private boolean f4114N;

    /* renamed from: O */
    C0901i f4115O;

    /* renamed from: P */
    private boolean f4116P;

    /* renamed from: Q */
    Drawable f4117Q;

    /* renamed from: a */
    private int f4118a;

    /* renamed from: b */
    private Mode f4119b;

    C0899g(@C0193h0 C0901i iVar, @C0195i0 Resources resources) {
        this.f4115O = iVar;
        m5193a(resources);
    }

    /* renamed from: a */
    private void m5193a(@C0195i0 Resources resources) {
        C0901i iVar = this.f4115O;
        if (iVar != null) {
            ConstantState constantState = iVar.f4123b;
            if (constantState != null) {
                mo4620a(constantState.newDrawable(resources));
            }
        }
    }

    @C0193h0
    /* renamed from: c */
    private C0901i mo4651c() {
        return new C0901i(this.f4115O);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4621b() {
        return true;
    }

    public void draw(@C0193h0 Canvas canvas) {
        this.f4117Q.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0901i iVar = this.f4115O;
        return changingConfigurations | (iVar != null ? iVar.getChangingConfigurations() : 0) | this.f4117Q.getChangingConfigurations();
    }

    @C0195i0
    public ConstantState getConstantState() {
        C0901i iVar = this.f4115O;
        if (iVar == null || !iVar.mo4656a()) {
            return null;
        }
        this.f4115O.f4122a = getChangingConfigurations();
        return this.f4115O;
    }

    @C0193h0
    public Drawable getCurrent() {
        return this.f4117Q.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f4117Q.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f4117Q.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f4117Q.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f4117Q.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f4117Q.getOpacity();
    }

    public boolean getPadding(@C0193h0 Rect rect) {
        return this.f4117Q.getPadding(rect);
    }

    @C0193h0
    public int[] getState() {
        return this.f4117Q.getState();
    }

    public Region getTransparentRegion() {
        return this.f4117Q.getTransparentRegion();
    }

    public void invalidateDrawable(@C0193h0 Drawable drawable) {
        invalidateSelf();
    }

    @RequiresApi(19)
    public boolean isAutoMirrored() {
        return this.f4117Q.isAutoMirrored();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (mo4621b()) {
            C0901i iVar = this.f4115O;
            if (iVar != null) {
                colorStateList = iVar.f4124c;
                return (colorStateList == null && colorStateList.isStateful()) || this.f4117Q.isStateful();
            }
        }
        colorStateList = null;
        if (colorStateList == null) {
        }
    }

    public void jumpToCurrentState() {
        this.f4117Q.jumpToCurrentState();
    }

    @C0193h0
    public Drawable mutate() {
        if (!this.f4116P && super.mutate() == this) {
            this.f4115O = mo4651c();
            Drawable drawable = this.f4117Q;
            if (drawable != null) {
                drawable.mutate();
            }
            C0901i iVar = this.f4115O;
            if (iVar != null) {
                Drawable drawable2 = this.f4117Q;
                iVar.f4123b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f4116P = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4117Q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f4117Q.setLevel(i);
    }

    public void scheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f4117Q.setAlpha(i);
    }

    @RequiresApi(19)
    public void setAutoMirrored(boolean z) {
        this.f4117Q.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f4117Q.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4117Q.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f4117Q.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f4117Q.setFilterBitmap(z);
    }

    public boolean setState(@C0193h0 int[] iArr) {
        return m5194a(iArr) || this.f4117Q.setState(iArr);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f4115O.f4124c = colorStateList;
        m5194a(getState());
    }

    public void setTintMode(@C0193h0 Mode mode) {
        this.f4115O.f4125d = mode;
        m5194a(getState());
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f4117Q.setVisible(z, z2);
    }

    public void unscheduleDrawable(@C0193h0 Drawable drawable, @C0193h0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    private boolean m5194a(int[] iArr) {
        if (!mo4621b()) {
            return false;
        }
        C0901i iVar = this.f4115O;
        ColorStateList colorStateList = iVar.f4124c;
        Mode mode = iVar.f4125d;
        if (colorStateList == null || mode == null) {
            this.f4114N = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f4114N && colorForState == this.f4118a && mode == this.f4119b)) {
                setColorFilter(colorForState, mode);
                this.f4118a = colorForState;
                this.f4119b = mode;
                this.f4114N = true;
                return true;
            }
        }
        return false;
    }

    C0899g(@C0195i0 Drawable drawable) {
        this.f4115O = mo4651c();
        mo4620a(drawable);
    }

    /* renamed from: a */
    public final Drawable mo4619a() {
        return this.f4117Q;
    }

    /* renamed from: a */
    public final void mo4620a(Drawable drawable) {
        Drawable drawable2 = this.f4117Q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4117Q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0901i iVar = this.f4115O;
            if (iVar != null) {
                iVar.f4123b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }
}
