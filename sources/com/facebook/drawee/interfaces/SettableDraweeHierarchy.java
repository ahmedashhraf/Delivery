package com.facebook.drawee.interfaces;

import android.graphics.drawable.Drawable;
import p201f.p202a.p203u.C5969d;

@C5969d
public interface SettableDraweeHierarchy extends DraweeHierarchy {
    void reset();

    void setControllerOverlay(Drawable drawable);

    void setFailure(Throwable th);

    void setImage(Drawable drawable, float f, boolean z);

    void setProgress(float f, boolean z);

    void setRetry(Throwable th);
}
