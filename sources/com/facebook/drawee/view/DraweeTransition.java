package com.facebook.drawee.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.graphics.Rect;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.drawable.ScalingUtils.InterpolatingScaleType;
import com.facebook.drawee.drawable.ScalingUtils.ScaleType;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import java.util.Map;
import p201f.p202a.C5952h;

@TargetApi(19)
public class DraweeTransition extends Transition {
    private static final String PROPNAME_BOUNDS = "draweeTransition:bounds";
    @C5952h
    private final PointF mFromFocusPoint;
    private final ScaleType mFromScale;
    /* access modifiers changed from: private */
    @C5952h
    public final PointF mToFocusPoint;
    /* access modifiers changed from: private */
    public final ScaleType mToScale;

    public DraweeTransition(ScaleType scaleType, ScaleType scaleType2, @C5952h PointF pointF, @C5952h PointF pointF2) {
        this.mFromScale = scaleType;
        this.mToScale = scaleType2;
        this.mFromFocusPoint = pointF;
        this.mToFocusPoint = pointF2;
    }

    private void captureValues(TransitionValues transitionValues) {
        View view = transitionValues.view;
        if (view instanceof GenericDraweeView) {
            transitionValues.values.put(PROPNAME_BOUNDS, new Rect(0, 0, view.getWidth(), transitionValues.view.getHeight()));
        }
    }

    public static TransitionSet createTransitionSet(ScaleType scaleType, ScaleType scaleType2) {
        return createTransitionSet(scaleType, scaleType2, null, null);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues);
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (!(transitionValues == null || transitionValues2 == null)) {
            Map map = transitionValues.values;
            String str = PROPNAME_BOUNDS;
            Rect rect = (Rect) map.get(str);
            Rect rect2 = (Rect) transitionValues2.values.get(str);
            if (!(rect == null || rect2 == null)) {
                if (this.mFromScale == this.mToScale && this.mFromFocusPoint == this.mToFocusPoint) {
                    return null;
                }
                final GenericDraweeView genericDraweeView = (GenericDraweeView) transitionValues.view;
                final InterpolatingScaleType interpolatingScaleType = new InterpolatingScaleType(this.mFromScale, this.mToScale, rect, rect2, this.mFromFocusPoint, this.mToFocusPoint);
                ((GenericDraweeHierarchy) genericDraweeView.getHierarchy()).setActualImageScaleType(interpolatingScaleType);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        interpolatingScaleType.setValue(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        ((GenericDraweeHierarchy) genericDraweeView.getHierarchy()).setActualImageScaleType(DraweeTransition.this.mToScale);
                        if (DraweeTransition.this.mToFocusPoint != null) {
                            ((GenericDraweeHierarchy) genericDraweeView.getHierarchy()).setActualImageFocusPoint(DraweeTransition.this.mToFocusPoint);
                        }
                    }
                });
                return ofFloat;
            }
        }
        return null;
    }

    public static TransitionSet createTransitionSet(ScaleType scaleType, ScaleType scaleType2, @C5952h PointF pointF, @C5952h PointF pointF2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.addTransition(new DraweeTransition(scaleType, scaleType2, pointF, pointF2));
        return transitionSet;
    }

    public DraweeTransition(ScaleType scaleType, ScaleType scaleType2) {
        this(scaleType, scaleType2, null, null);
    }
}
