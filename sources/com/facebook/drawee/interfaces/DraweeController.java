package com.facebook.drawee.interfaces;

import android.graphics.drawable.Animatable;
import android.view.MotionEvent;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5969d;

@C5969d
public interface DraweeController {
    Animatable getAnimatable();

    String getContentDescription();

    @C5952h
    DraweeHierarchy getHierarchy();

    boolean isSameImageRequest(DraweeController draweeController);

    void onAttach();

    void onDetach();

    boolean onTouchEvent(MotionEvent motionEvent);

    void onViewportVisibilityHint(boolean z);

    void setContentDescription(String str);

    void setHierarchy(@C5952h DraweeHierarchy draweeHierarchy);
}
