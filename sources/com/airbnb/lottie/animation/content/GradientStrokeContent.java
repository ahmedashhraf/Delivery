package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import androidx.annotation.C0195i0;
import androidx.collection.C0642f;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.model.content.GradientStroke;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.layer.BaseLayer;
import com.airbnb.lottie.value.LottieValueCallback;

public class GradientStrokeContent extends BaseStrokeContent {
    private static final int CACHE_STEPS_MS = 32;
    private final RectF boundsRect = new RectF();
    private final int cacheSteps;
    private final BaseKeyframeAnimation<GradientColor, GradientColor> colorAnimation;
    @C0195i0
    private ValueCallbackKeyframeAnimation colorCallbackAnimation;
    private final BaseKeyframeAnimation<PointF, PointF> endPointAnimation;
    private final boolean hidden;
    private final C0642f<LinearGradient> linearGradientCache = new C0642f<>();
    private final String name;
    private final C0642f<RadialGradient> radialGradientCache = new C0642f<>();
    private final BaseKeyframeAnimation<PointF, PointF> startPointAnimation;
    private final GradientType type;

    public GradientStrokeContent(LottieDrawable lottieDrawable, BaseLayer baseLayer, GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.name = gradientStroke.getName();
        this.type = gradientStroke.getGradientType();
        this.hidden = gradientStroke.isHidden();
        this.cacheSteps = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        this.colorAnimation = gradientStroke.getGradientColor().createAnimation();
        this.colorAnimation.addUpdateListener(this);
        baseLayer.addAnimation(this.colorAnimation);
        this.startPointAnimation = gradientStroke.getStartPoint().createAnimation();
        this.startPointAnimation.addUpdateListener(this);
        baseLayer.addAnimation(this.startPointAnimation);
        this.endPointAnimation = gradientStroke.getEndPoint().createAnimation();
        this.endPointAnimation.addUpdateListener(this);
        baseLayer.addAnimation(this.endPointAnimation);
    }

    private int[] applyDynamicColorsIfNeeded(int[] iArr) {
        ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.colorCallbackAnimation;
        if (valueCallbackKeyframeAnimation != null) {
            Integer[] numArr = (Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int getGradientHash() {
        int round = Math.round(this.startPointAnimation.getProgress() * ((float) this.cacheSteps));
        int round2 = Math.round(this.endPointAnimation.getProgress() * ((float) this.cacheSteps));
        int round3 = Math.round(this.colorAnimation.getProgress() * ((float) this.cacheSteps));
        int i = round != 0 ? 527 * round : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private LinearGradient getLinearGradient() {
        long gradientHash = (long) getGradientHash();
        LinearGradient linearGradient = (LinearGradient) this.linearGradientCache.mo3283c(gradientHash);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.startPointAnimation.getValue();
        PointF pointF2 = (PointF) this.endPointAnimation.getValue();
        GradientColor gradientColor = (GradientColor) this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        RectF rectF = this.boundsRect;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + pointF.x);
        RectF rectF2 = this.boundsRect;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointF.y);
        RectF rectF3 = this.boundsRect;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointF2.x);
        RectF rectF4 = this.boundsRect;
        LinearGradient linearGradient2 = new LinearGradient((float) width, (float) height, (float) width2, (float) ((int) (rectF4.top + (rectF4.height() / 2.0f) + pointF2.y)), applyDynamicColorsIfNeeded, positions, TileMode.CLAMP);
        this.linearGradientCache.mo3284c(gradientHash, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient getRadialGradient() {
        long gradientHash = (long) getGradientHash();
        RadialGradient radialGradient = (RadialGradient) this.radialGradientCache.mo3283c(gradientHash);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.startPointAnimation.getValue();
        PointF pointF2 = (PointF) this.endPointAnimation.getValue();
        GradientColor gradientColor = (GradientColor) this.colorAnimation.getValue();
        int[] applyDynamicColorsIfNeeded = applyDynamicColorsIfNeeded(gradientColor.getColors());
        float[] positions = gradientColor.getPositions();
        RectF rectF = this.boundsRect;
        int width = (int) (rectF.left + (rectF.width() / 2.0f) + pointF.x);
        RectF rectF2 = this.boundsRect;
        int height = (int) (rectF2.top + (rectF2.height() / 2.0f) + pointF.y);
        RectF rectF3 = this.boundsRect;
        int width2 = (int) (rectF3.left + (rectF3.width() / 2.0f) + pointF2.x);
        RectF rectF4 = this.boundsRect;
        RadialGradient radialGradient2 = new RadialGradient((float) width, (float) height, (float) Math.hypot((double) (width2 - width), (double) (((int) ((rectF4.top + (rectF4.height() / 2.0f)) + pointF2.y)) - height)), applyDynamicColorsIfNeeded, positions, TileMode.CLAMP);
        this.radialGradientCache.mo3284c(gradientHash, radialGradient2);
        return radialGradient2;
    }

    public <T> void addValueCallback(T t, @C0195i0 LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t != LottieProperty.GRADIENT_COLOR) {
            return;
        }
        if (lottieValueCallback == null) {
            ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.colorCallbackAnimation;
            if (valueCallbackKeyframeAnimation != null) {
                this.layer.removeAnimation(valueCallbackKeyframeAnimation);
            }
            this.colorCallbackAnimation = null;
            return;
        }
        this.colorCallbackAnimation = new ValueCallbackKeyframeAnimation(lottieValueCallback);
        this.colorCallbackAnimation.addUpdateListener(this);
        this.layer.addAnimation(this.colorCallbackAnimation);
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        Shader shader;
        if (!this.hidden) {
            getBounds(this.boundsRect, matrix, false);
            if (this.type == GradientType.LINEAR) {
                shader = getLinearGradient();
            } else {
                shader = getRadialGradient();
            }
            this.paint.setShader(shader);
            super.draw(canvas, matrix, i);
        }
    }

    public String getName() {
        return this.name;
    }
}
