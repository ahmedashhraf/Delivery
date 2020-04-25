package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import p201f.p202a.C5952h;

public class BaseControllerListener<INFO> implements ControllerListener<INFO> {
    private static final ControllerListener<Object> NO_OP_LISTENER = new BaseControllerListener();

    public static <INFO> ControllerListener<INFO> getNoOpListener() {
        return NO_OP_LISTENER;
    }

    public void onFailure(String str, Throwable th) {
    }

    public void onFinalImageSet(String str, @C5952h INFO info, @C5952h Animatable animatable) {
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    public void onIntermediateImageSet(String str, @C5952h INFO info) {
    }

    public void onRelease(String str) {
    }

    public void onSubmit(String str, Object obj) {
    }
}
