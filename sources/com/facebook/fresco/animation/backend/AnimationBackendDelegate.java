package com.facebook.fresco.animation.backend;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0237z;
import com.facebook.fresco.animation.backend.AnimationBackend;
import p201f.p202a.C5952h;

public class AnimationBackendDelegate<T extends AnimationBackend> implements AnimationBackend {
    private static final int ALPHA_UNSET = -1;
    @C0237z(from = -1, mo691to = 255)
    private int mAlpha = -1;
    @C5952h
    private T mAnimationBackend;
    @C5952h
    private Rect mBounds;
    @C5952h
    private ColorFilter mColorFilter;

    public AnimationBackendDelegate(@C5952h T t) {
        this.mAnimationBackend = t;
    }

    @SuppressLint({"Range"})
    private void applyBackendProperties(AnimationBackend animationBackend) {
        Rect rect = this.mBounds;
        if (rect != null) {
            animationBackend.setBounds(rect);
        }
        int i = this.mAlpha;
        if (i >= 0 && i <= 255) {
            animationBackend.setAlpha(i);
        }
        ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter != null) {
            animationBackend.setColorFilter(colorFilter);
        }
    }

    public void clear() {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.clear();
        }
    }

    public boolean drawFrame(Drawable drawable, Canvas canvas, int i) {
        T t = this.mAnimationBackend;
        return t != null && t.drawFrame(drawable, canvas, i);
    }

    @C5952h
    public T getAnimationBackend() {
        return this.mAnimationBackend;
    }

    public int getFrameCount() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    public int getFrameDurationMs(int i) {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getFrameDurationMs(i);
    }

    public int getIntrinsicHeight() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return -1;
        }
        return t.getIntrinsicWidth();
    }

    public int getLoopCount() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    public int getSizeInBytes() {
        T t = this.mAnimationBackend;
        if (t == null) {
            return 0;
        }
        return t.getSizeInBytes();
    }

    public void setAlpha(@C0237z(from = 0, mo691to = 255) int i) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setAlpha(i);
        }
        this.mAlpha = i;
    }

    public void setAnimationBackend(@C5952h T t) {
        this.mAnimationBackend = t;
        T t2 = this.mAnimationBackend;
        if (t2 != null) {
            applyBackendProperties(t2);
        }
    }

    public void setBounds(@C5952h Rect rect) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setBounds(rect);
        }
        this.mBounds = rect;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        T t = this.mAnimationBackend;
        if (t != null) {
            t.setColorFilter(colorFilter);
        }
        this.mColorFilter = colorFilter;
    }
}
