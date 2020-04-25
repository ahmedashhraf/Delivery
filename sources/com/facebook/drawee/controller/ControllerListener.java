package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import p201f.p202a.C5952h;

public interface ControllerListener<INFO> {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, @C5952h INFO info, @C5952h Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, @C5952h INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
