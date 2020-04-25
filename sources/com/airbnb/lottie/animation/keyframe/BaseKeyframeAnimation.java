package com.airbnb.lottie.animation.keyframe;

import androidx.annotation.C0195i0;
import androidx.annotation.C0215r;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseKeyframeAnimation<K, A> {
    private float cachedEndProgress = -1.0f;
    @C0195i0
    private A cachedGetValue = null;
    @C0195i0
    private Keyframe<K> cachedGetValueKeyframe;
    private float cachedGetValueProgress = -1.0f;
    @C0195i0
    private Keyframe<K> cachedKeyframe;
    private float cachedStartDelayProgress = -1.0f;
    private boolean isDiscrete = false;
    private final List<? extends Keyframe<K>> keyframes;
    final List<AnimationListener> listeners = new ArrayList(1);
    private float progress = 0.0f;
    @C0195i0
    protected LottieValueCallback<A> valueCallback;

    public interface AnimationListener {
        void onValueChanged();
    }

    BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        this.keyframes = list;
    }

    @C0215r(from = 0.0d, mo670to = 1.0d)
    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframes.isEmpty() ? 0.0f : ((Keyframe) this.keyframes.get(0)).getStartProgress();
        }
        return this.cachedStartDelayProgress;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    /* access modifiers changed from: protected */
    public Keyframe<K> getCurrentKeyframe() {
        Keyframe<K> keyframe = this.cachedKeyframe;
        if (keyframe != null && keyframe.containsProgress(this.progress)) {
            return this.cachedKeyframe;
        }
        List<? extends Keyframe<K>> list = this.keyframes;
        Keyframe<K> keyframe2 = (Keyframe) list.get(list.size() - 1);
        if (this.progress < keyframe2.getStartProgress()) {
            for (int size = this.keyframes.size() - 1; size >= 0; size--) {
                keyframe2 = (Keyframe) this.keyframes.get(size);
                if (keyframe2.containsProgress(this.progress)) {
                    break;
                }
            }
        }
        this.cachedKeyframe = keyframe2;
        return keyframe2;
    }

    /* access modifiers changed from: 0000 */
    @C0215r(from = 0.0d, mo670to = 1.0d)
    public float getEndProgress() {
        float f;
        if (this.cachedEndProgress == -1.0f) {
            if (this.keyframes.isEmpty()) {
                f = 1.0f;
            } else {
                List<? extends Keyframe<K>> list = this.keyframes;
                f = ((Keyframe) list.get(list.size() - 1)).getEndProgress();
            }
            this.cachedEndProgress = f;
        }
        return this.cachedEndProgress;
    }

    /* access modifiers changed from: protected */
    public float getInterpolatedCurrentKeyframeProgress() {
        Keyframe currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    /* access modifiers changed from: 0000 */
    public float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return 0.0f;
        }
        Keyframe currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        float interpolatedCurrentKeyframeProgress = getInterpolatedCurrentKeyframeProgress();
        if (this.valueCallback == null && currentKeyframe == this.cachedGetValueKeyframe && this.cachedGetValueProgress == interpolatedCurrentKeyframeProgress) {
            return this.cachedGetValue;
        }
        this.cachedGetValueKeyframe = currentKeyframe;
        this.cachedGetValueProgress = interpolatedCurrentKeyframeProgress;
        A value = getValue(currentKeyframe, interpolatedCurrentKeyframeProgress);
        this.cachedGetValue = value;
        return value;
    }

    /* access modifiers changed from: 0000 */
    public abstract A getValue(Keyframe<K> keyframe, float f);

    public void notifyListeners() {
        for (int i = 0; i < this.listeners.size(); i++) {
            ((AnimationListener) this.listeners.get(i)).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void setProgress(@C0215r(from = 0.0d, mo670to = 1.0d) float f) {
        if (!this.keyframes.isEmpty()) {
            Keyframe currentKeyframe = getCurrentKeyframe();
            if (f < getStartDelayProgress()) {
                f = getStartDelayProgress();
            } else if (f > getEndProgress()) {
                f = getEndProgress();
            }
            if (f != this.progress) {
                this.progress = f;
                Keyframe currentKeyframe2 = getCurrentKeyframe();
                if (currentKeyframe != currentKeyframe2 || !currentKeyframe2.isStatic()) {
                    notifyListeners();
                }
            }
        }
    }

    public void setValueCallback(@C0195i0 LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }
}
