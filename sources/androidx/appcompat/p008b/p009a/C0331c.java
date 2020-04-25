package androidx.appcompat.p008b.p009a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.graphics.drawable.C0892a;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.b.a.c */
/* compiled from: DrawableWrapper */
public class C0331c extends Drawable implements Callback {

    /* renamed from: a */
    private Drawable f1086a;

    public C0331c(Drawable drawable) {
        mo1242a(drawable);
    }

    /* renamed from: a */
    public Drawable mo1241a() {
        return this.f1086a;
    }

    public void draw(Canvas canvas) {
        this.f1086a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f1086a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f1086a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f1086a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f1086a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f1086a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f1086a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f1086a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f1086a.getPadding(rect);
    }

    public int[] getState() {
        return this.f1086a.getState();
    }

    public Region getTransparentRegion() {
        return this.f1086a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return C0892a.m5158f(this.f1086a);
    }

    public boolean isStateful() {
        return this.f1086a.isStateful();
    }

    public void jumpToCurrentState() {
        C0892a.m5159g(this.f1086a);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f1086a.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f1086a.setLevel(i);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setAlpha(int i) {
        this.f1086a.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0892a.m5150a(this.f1086a, z);
    }

    public void setChangingConfigurations(int i) {
        this.f1086a.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1086a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1086a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1086a.setFilterBitmap(z);
    }

    public void setHotspot(float f, float f2) {
        C0892a.m5144a(this.f1086a, f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0892a.m5145a(this.f1086a, i, i2, i3, i4);
    }

    public boolean setState(int[] iArr) {
        return this.f1086a.setState(iArr);
    }

    public void setTint(int i) {
        C0892a.m5154b(this.f1086a, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0892a.m5146a(this.f1086a, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0892a.m5149a(this.f1086a, mode);
    }

    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f1086a.setVisible(z, z2);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    /* renamed from: a */
    public void mo1242a(Drawable drawable) {
        Drawable drawable2 = this.f1086a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1086a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }
}
