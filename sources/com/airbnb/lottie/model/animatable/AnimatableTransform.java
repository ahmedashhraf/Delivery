package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import androidx.annotation.C0195i0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.layer.BaseLayer;

public class AnimatableTransform implements ModifierContent, ContentModel {
    @C0195i0
    private final AnimatablePathValue anchorPoint;
    @C0195i0
    private final AnimatableFloatValue endOpacity;
    @C0195i0
    private final AnimatableIntegerValue opacity;
    @C0195i0
    private final AnimatableValue<PointF, PointF> position;
    @C0195i0
    private final AnimatableFloatValue rotation;
    @C0195i0
    private final AnimatableScaleValue scale;
    @C0195i0
    private final AnimatableFloatValue skew;
    @C0195i0
    private final AnimatableFloatValue skewAngle;
    @C0195i0
    private final AnimatableFloatValue startOpacity;

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public TransformKeyframeAnimation createAnimation() {
        return new TransformKeyframeAnimation(this);
    }

    @C0195i0
    public AnimatablePathValue getAnchorPoint() {
        return this.anchorPoint;
    }

    @C0195i0
    public AnimatableFloatValue getEndOpacity() {
        return this.endOpacity;
    }

    @C0195i0
    public AnimatableIntegerValue getOpacity() {
        return this.opacity;
    }

    @C0195i0
    public AnimatableValue<PointF, PointF> getPosition() {
        return this.position;
    }

    @C0195i0
    public AnimatableFloatValue getRotation() {
        return this.rotation;
    }

    @C0195i0
    public AnimatableScaleValue getScale() {
        return this.scale;
    }

    @C0195i0
    public AnimatableFloatValue getSkew() {
        return this.skew;
    }

    @C0195i0
    public AnimatableFloatValue getSkewAngle() {
        return this.skewAngle;
    }

    @C0195i0
    public AnimatableFloatValue getStartOpacity() {
        return this.startOpacity;
    }

    @C0195i0
    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform(@C0195i0 AnimatablePathValue animatablePathValue, @C0195i0 AnimatableValue<PointF, PointF> animatableValue, @C0195i0 AnimatableScaleValue animatableScaleValue, @C0195i0 AnimatableFloatValue animatableFloatValue, @C0195i0 AnimatableIntegerValue animatableIntegerValue, @C0195i0 AnimatableFloatValue animatableFloatValue2, @C0195i0 AnimatableFloatValue animatableFloatValue3, @C0195i0 AnimatableFloatValue animatableFloatValue4, @C0195i0 AnimatableFloatValue animatableFloatValue5) {
        this.anchorPoint = animatablePathValue;
        this.position = animatableValue;
        this.scale = animatableScaleValue;
        this.rotation = animatableFloatValue;
        this.opacity = animatableIntegerValue;
        this.startOpacity = animatableFloatValue2;
        this.endOpacity = animatableFloatValue3;
        this.skew = animatableFloatValue4;
        this.skewAngle = animatableFloatValue5;
    }
}
