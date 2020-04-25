package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import androidx.annotation.C0195i0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.FillContent;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.layer.BaseLayer;

public class ShapeFill implements ContentModel {
    @C0195i0
    private final AnimatableColorValue color;
    private final boolean fillEnabled;
    private final FillType fillType;
    private final boolean hidden;
    private final String name;
    @C0195i0
    private final AnimatableIntegerValue opacity;

    public ShapeFill(String str, boolean z, FillType fillType2, @C0195i0 AnimatableColorValue animatableColorValue, @C0195i0 AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.name = str;
        this.fillEnabled = z;
        this.fillType = fillType2;
        this.color = animatableColorValue;
        this.opacity = animatableIntegerValue;
        this.hidden = z2;
    }

    @C0195i0
    public AnimatableColorValue getColor() {
        return this.color;
    }

    public FillType getFillType() {
        return this.fillType;
    }

    public String getName() {
        return this.name;
    }

    @C0195i0
    public AnimatableIntegerValue getOpacity() {
        return this.opacity;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer) {
        return new FillContent(lottieDrawable, baseLayer, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeFill{color=, fillEnabled=");
        sb.append(this.fillEnabled);
        sb.append('}');
        return sb.toString();
    }
}
