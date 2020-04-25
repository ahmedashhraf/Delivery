package com.facebook.fresco.animation.backend;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.C0237z;
import p201f.p202a.C5952h;

public interface AnimationBackend extends AnimationInformation {
    public static final int INTRINSIC_DIMENSION_UNSET = -1;

    void clear();

    boolean drawFrame(Drawable drawable, Canvas canvas, int i);

    int getIntrinsicHeight();

    int getIntrinsicWidth();

    int getSizeInBytes();

    void setAlpha(@C0237z(from = 0, mo691to = 255) int i);

    void setBounds(Rect rect);

    void setColorFilter(@C5952h ColorFilter colorFilter);
}
