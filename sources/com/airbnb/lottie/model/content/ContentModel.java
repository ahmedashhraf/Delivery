package com.airbnb.lottie.model.content;

import androidx.annotation.C0195i0;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.layer.BaseLayer;

public interface ContentModel {
    @C0195i0
    Content toContent(LottieDrawable lottieDrawable, BaseLayer baseLayer);
}
