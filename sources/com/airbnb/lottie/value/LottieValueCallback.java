package com.airbnb.lottie.value;

import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

public class LottieValueCallback<T> {
    @C0195i0
    private BaseKeyframeAnimation<?, ?> animation;
    private final LottieFrameInfo<T> frameInfo = new LottieFrameInfo<>();
    @C0195i0
    protected T value = null;

    public LottieValueCallback() {
    }

    @C0195i0
    public T getValue(LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    @C0207n0({C0208a.LIBRARY})
    @C0195i0
    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.frameInfo.set(f, f2, t, t2, f3, f4, f5));
    }

    @C0207n0({C0208a.LIBRARY})
    public final void setAnimation(@C0195i0 BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animation = baseKeyframeAnimation;
    }

    public final void setValue(@C0195i0 T t) {
        this.value = t;
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.animation;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public LottieValueCallback(@C0195i0 T t) {
        this.value = t;
    }
}
