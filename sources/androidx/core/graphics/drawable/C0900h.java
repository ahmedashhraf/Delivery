package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(21)
/* renamed from: androidx.core.graphics.drawable.h */
/* compiled from: WrappedDrawableApi21 */
class C0900h extends C0899g {

    /* renamed from: S */
    private static final String f4120S = "WrappedDrawableApi21";

    /* renamed from: T */
    private static Method f4121T;

    C0900h(Drawable drawable) {
        super(drawable);
        m5199d();
    }

    /* renamed from: d */
    private void m5199d() {
        if (f4121T == null) {
            try {
                f4121T = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo4621b() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f4117Q;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo4651c() {
        Drawable drawable = this.f4117Q;
        if (drawable != null) {
            Method method = f4121T;
            if (method != null) {
                try {
                    return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    @C0193h0
    public Rect getDirtyBounds() {
        return this.f4117Q.getDirtyBounds();
    }

    public void getOutline(@C0193h0 Outline outline) {
        this.f4117Q.getOutline(outline);
    }

    public void setHotspot(float f, float f2) {
        this.f4117Q.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f4117Q.setHotspotBounds(i, i2, i3, i4);
    }

    public boolean setState(@C0193h0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i) {
        if (mo4621b()) {
            super.setTint(i);
        } else {
            this.f4117Q.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (mo4621b()) {
            super.setTintList(colorStateList);
        } else {
            this.f4117Q.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (mo4621b()) {
            super.setTintMode(mode);
        } else {
            this.f4117Q.setTintMode(mode);
        }
    }

    C0900h(C0901i iVar, Resources resources) {
        super(iVar, resources);
        m5199d();
    }
}
