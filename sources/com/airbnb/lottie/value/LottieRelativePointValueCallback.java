package com.airbnb.lottie.value;

import android.graphics.PointF;
import androidx.annotation.C0193h0;
import com.airbnb.lottie.utils.MiscUtils;

public class LottieRelativePointValueCallback extends LottieValueCallback<PointF> {
    private final PointF point = new PointF();

    public LottieRelativePointValueCallback() {
    }

    public PointF getOffset(LottieFrameInfo<PointF> lottieFrameInfo) {
        T t = this.value;
        if (t != null) {
            return (PointF) t;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    public final PointF getValue(LottieFrameInfo<PointF> lottieFrameInfo) {
        this.point.set(MiscUtils.lerp(((PointF) lottieFrameInfo.getStartValue()).x, ((PointF) lottieFrameInfo.getEndValue()).x, lottieFrameInfo.getInterpolatedKeyframeProgress()), MiscUtils.lerp(((PointF) lottieFrameInfo.getStartValue()).y, ((PointF) lottieFrameInfo.getEndValue()).y, lottieFrameInfo.getInterpolatedKeyframeProgress()));
        PointF offset = getOffset(lottieFrameInfo);
        this.point.offset(offset.x, offset.y);
        return this.point;
    }

    public LottieRelativePointValueCallback(@C0193h0 PointF pointF) {
        super(pointF);
    }
}
