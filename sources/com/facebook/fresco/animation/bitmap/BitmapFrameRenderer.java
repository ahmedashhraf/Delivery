package com.facebook.fresco.animation.bitmap;

import android.graphics.Bitmap;
import android.graphics.Rect;
import p201f.p202a.C5952h;

public interface BitmapFrameRenderer {
    int getIntrinsicHeight();

    int getIntrinsicWidth();

    boolean renderFrame(int i, Bitmap bitmap);

    void setBounds(@C5952h Rect rect);
}
