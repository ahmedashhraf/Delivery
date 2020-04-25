package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import androidx.core.p034l.C0962e0;
import p201f.p202a.C5952h;

public class DrawableUtils {
    @C5952h
    public static Drawable cloneDrawable(Drawable drawable) {
        if (drawable instanceof CloneableDrawable) {
            return ((CloneableDrawable) drawable).cloneDrawable();
        }
        ConstantState constantState = drawable.getConstantState();
        return constantState != null ? constantState.newDrawable() : null;
    }

    public static void copyProperties(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static int getOpacityFromColor(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    public static int multiplyColorAlpha(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & C0962e0.f4342s;
        }
        return (i & C0962e0.f4342s) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    public static void setCallbacks(Drawable drawable, @C5952h Callback callback, @C5952h TransformCallback transformCallback) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof TransformAwareDrawable) {
                ((TransformAwareDrawable) drawable).setTransformCallback(transformCallback);
            }
        }
    }

    public static void setDrawableProperties(Drawable drawable, DrawableProperties drawableProperties) {
        if (drawable != null && drawableProperties != null) {
            drawableProperties.applyTo(drawable);
        }
    }
}
