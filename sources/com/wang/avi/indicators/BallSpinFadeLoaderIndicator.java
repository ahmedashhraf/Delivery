package com.wang.avi.indicators;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.wang.avi.Indicator;
import java.util.ArrayList;
import org.jcodec.containers.mps.MPSUtils;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

public class BallSpinFadeLoaderIndicator extends Indicator {
    public static final int ALPHA = 255;
    public static final float SCALE = 1.0f;
    int[] alphas = {255, 255, 255, 255, 255, 255, 255, 255};
    float[] scaleFloats = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};

    final class Point {

        /* renamed from: x */
        public float f35116x;

        /* renamed from: y */
        public float f35117y;

        public Point(float f, float f2) {
            this.f35116x = f;
            this.f35117y = f2;
        }
    }

    /* access modifiers changed from: 0000 */
    public Point circleAt(int i, int i2, float f, double d) {
        double d2 = (double) (i / 2);
        double d3 = (double) f;
        double cos = Math.cos(d);
        Double.isNaN(d3);
        double d4 = cos * d3;
        Double.isNaN(d2);
        float f2 = (float) (d2 + d4);
        double d5 = (double) (i2 / 2);
        double sin = Math.sin(d);
        Double.isNaN(d3);
        double d6 = d3 * sin;
        Double.isNaN(d5);
        return new Point(f2, (float) (d5 + d6));
    }

    public void draw(Canvas canvas, Paint paint) {
        float width = (float) (getWidth() / 10);
        for (int i = 0; i < 8; i++) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            float width3 = ((float) (getWidth() / 2)) - width;
            double d = (double) i;
            Double.isNaN(d);
            Point circleAt = circleAt(width2, height, width3, 0.7853981633974483d * d);
            canvas.translate(circleAt.f35116x, circleAt.f35117y);
            float[] fArr = this.scaleFloats;
            canvas.scale(fArr[i], fArr[i]);
            paint.setAlpha(this.alphas[i]);
            canvas.drawCircle(0.0f, 0.0f, width, paint);
            canvas.restore();
        }
    }

    public ArrayList<ValueAnimator> onCreateAnimators() {
        ArrayList<ValueAnimator> arrayList = new ArrayList<>();
        int[] iArr = {0, 120, 240, 360, MPSUtils.VIDEO_MIN, C14330v.f42355w, 720, 780, 840};
        for (final int i = 0; i < 8; i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.4f, 1.0f});
            ofFloat.setDuration(1000);
            ofFloat.setRepeatCount(-1);
            ofFloat.setStartDelay((long) iArr[i]);
            addUpdateListener(ofFloat, new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.scaleFloats[i] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{255, 77, 255});
            ofInt.setDuration(1000);
            ofInt.setRepeatCount(-1);
            ofInt.setStartDelay((long) iArr[i]);
            addUpdateListener(ofInt, new AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BallSpinFadeLoaderIndicator.this.alphas[i] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    BallSpinFadeLoaderIndicator.this.postInvalidate();
                }
            });
            arrayList.add(ofFloat);
            arrayList.add(ofInt);
        }
        return arrayList;
    }
}
