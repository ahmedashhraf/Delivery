package com.instabug.library.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ScaleImageView extends ImageView implements OnTouchListener {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private float MAX_SCALE = 5.0f;
    private boolean isScaling;
    private Context mContext;
    private GestureDetector mDetector;
    private int mHeight;
    private int mIntrinsicHeight;
    private int mIntrinsicWidth;
    private Matrix mMatrix;
    private final float[] mMatrixValues = new float[9];
    private float mMinScale;
    private float mPrevDistance;
    private int mPrevMoveX;
    private int mPrevMoveY;
    private float mScale;
    private int mWidth;

    /* renamed from: com.instabug.library.view.ScaleImageView$a */
    class C10029a extends SimpleOnGestureListener {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26693b;

        /* renamed from: a */
        final /* synthetic */ ScaleImageView f26694a;

        C10029a(ScaleImageView scaleImageView) {
            boolean[] a = m46655a();
            this.f26694a = scaleImageView;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46655a() {
            boolean[] zArr = f26693b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3296570346566607714L, "com/instabug/library/view/ScaleImageView$1", 4);
            f26693b = a;
            return a;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean[] a = m46655a();
            this.f26694a.maxZoomTo((int) motionEvent.getX(), (int) motionEvent.getY());
            a[1] = true;
            this.f26694a.cutting();
            a[2] = true;
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            a[3] = true;
            return onDoubleTap;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-434002267121397016L, "com/instabug/library/view/ScaleImageView", 96);
        $jacocoData = a;
        return a;
    }

    public ScaleImageView(Context context, AttributeSet attributeSet) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context, attributeSet);
        this.mContext = context;
        $jacocoInit[0] = true;
        initialize();
        $jacocoInit[1] = true;
    }

    private float dispDistance() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.mWidth;
        int i2 = i * i;
        int i3 = this.mHeight;
        float sqrt = (float) Math.sqrt((double) (i2 + (i3 * i3)));
        $jacocoInit[69] = true;
        return sqrt;
    }

    private float distance(float f, float f2, float f3, float f4) {
        boolean[] $jacocoInit = $jacocoInit();
        float f5 = f - f2;
        float f6 = f3 - f4;
        $jacocoInit[67] = true;
        float sqrt = (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        $jacocoInit[68] = true;
        return sqrt;
    }

    private void initialize() {
        boolean[] $jacocoInit = $jacocoInit();
        setScaleType(ScaleType.MATRIX);
        $jacocoInit[8] = true;
        this.mMatrix = new Matrix();
        $jacocoInit[9] = true;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            $jacocoInit[10] = true;
        } else {
            $jacocoInit[11] = true;
            this.mIntrinsicWidth = drawable.getIntrinsicWidth();
            $jacocoInit[12] = true;
            this.mIntrinsicHeight = drawable.getIntrinsicHeight();
            $jacocoInit[13] = true;
            setOnTouchListener(this);
            $jacocoInit[14] = true;
        }
        this.mDetector = new GestureDetector(this.mContext, new C10029a(this));
        $jacocoInit[15] = true;
    }

    public void cutting() {
        boolean[] $jacocoInit = $jacocoInit();
        int scale = (int) (((float) this.mIntrinsicWidth) * getScale());
        $jacocoInit[46] = true;
        int scale2 = (int) (((float) this.mIntrinsicHeight) * getScale());
        $jacocoInit[47] = true;
        if (getTranslateX() >= ((float) (-(scale - this.mWidth)))) {
            $jacocoInit[48] = true;
        } else {
            $jacocoInit[49] = true;
            this.mMatrix.postTranslate(-((getTranslateX() + ((float) scale)) - ((float) this.mWidth)), 0.0f);
            $jacocoInit[50] = true;
        }
        if (getTranslateX() <= 0.0f) {
            $jacocoInit[51] = true;
        } else {
            $jacocoInit[52] = true;
            this.mMatrix.postTranslate(-getTranslateX(), 0.0f);
            $jacocoInit[53] = true;
        }
        if (getTranslateY() >= ((float) (-(scale2 - this.mHeight)))) {
            $jacocoInit[54] = true;
        } else {
            $jacocoInit[55] = true;
            this.mMatrix.postTranslate(0.0f, -((getTranslateY() + ((float) scale2)) - ((float) this.mHeight)));
            $jacocoInit[56] = true;
        }
        if (getTranslateY() <= 0.0f) {
            $jacocoInit[57] = true;
        } else {
            $jacocoInit[58] = true;
            this.mMatrix.postTranslate(0.0f, -getTranslateY());
            $jacocoInit[59] = true;
        }
        int i = this.mWidth;
        if (scale >= i) {
            $jacocoInit[60] = true;
        } else {
            $jacocoInit[61] = true;
            this.mMatrix.postTranslate(((float) (i - scale)) / 2.0f, 0.0f);
            $jacocoInit[62] = true;
        }
        int i2 = this.mHeight;
        if (scale2 >= i2) {
            $jacocoInit[63] = true;
        } else {
            $jacocoInit[64] = true;
            this.mMatrix.postTranslate(0.0f, ((float) (i2 - scale2)) / 2.0f);
            $jacocoInit[65] = true;
        }
        setImageMatrix(this.mMatrix);
        $jacocoInit[66] = true;
    }

    /* access modifiers changed from: protected */
    public float getScale() {
        boolean[] $jacocoInit = $jacocoInit();
        float value = getValue(this.mMatrix, 0);
        $jacocoInit[26] = true;
        return value;
    }

    public float getTranslateX() {
        boolean[] $jacocoInit = $jacocoInit();
        float value = getValue(this.mMatrix, 2);
        $jacocoInit[27] = true;
        return value;
    }

    /* access modifiers changed from: protected */
    public float getTranslateY() {
        boolean[] $jacocoInit = $jacocoInit();
        float value = getValue(this.mMatrix, 5);
        $jacocoInit[28] = true;
        return value;
    }

    /* access modifiers changed from: protected */
    public float getValue(Matrix matrix, int i) {
        boolean[] $jacocoInit = $jacocoInit();
        matrix.getValues(this.mMatrixValues);
        float f = this.mMatrixValues[i];
        $jacocoInit[25] = true;
        return f;
    }

    /* access modifiers changed from: protected */
    public void maxZoomTo(int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.mMinScale == getScale()) {
            $jacocoInit[29] = true;
        } else {
            float scale = getScale();
            float f = this.mMinScale;
            if (scale - f <= 0.1f) {
                $jacocoInit[30] = true;
            } else {
                $jacocoInit[31] = true;
                float scale2 = f / getScale();
                $jacocoInit[32] = true;
                zoomTo(scale2, i, i2);
                $jacocoInit[33] = true;
                $jacocoInit[36] = true;
            }
        }
        float scale3 = this.MAX_SCALE / getScale();
        $jacocoInit[34] = true;
        zoomTo(scale3, i, i2);
        $jacocoInit[35] = true;
        $jacocoInit[36] = true;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        $jacocoInit[95] = true;
        return onTouchEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.mDetector.onTouchEvent(motionEvent)) {
            $jacocoInit[70] = true;
            return true;
        }
        int pointerCount = motionEvent.getPointerCount();
        $jacocoInit[71] = true;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (pointerCount < 2) {
                        $jacocoInit[77] = true;
                    } else if (!this.isScaling) {
                        $jacocoInit[78] = true;
                    } else {
                        $jacocoInit[79] = true;
                        float distance = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
                        $jacocoInit[80] = true;
                        float dispDistance = (distance - this.mPrevDistance) / dispDistance();
                        this.mPrevDistance = distance;
                        float f = dispDistance + 1.0f;
                        float f2 = f * f;
                        $jacocoInit[81] = true;
                        zoomTo(f2, this.mWidth / 2, this.mHeight / 2);
                        $jacocoInit[82] = true;
                        cutting();
                        $jacocoInit[83] = true;
                    }
                    if (this.isScaling) {
                        $jacocoInit[84] = true;
                    } else {
                        $jacocoInit[85] = true;
                        int x = this.mPrevMoveX - ((int) motionEvent.getX());
                        $jacocoInit[86] = true;
                        int y = this.mPrevMoveY - ((int) motionEvent.getY());
                        $jacocoInit[87] = true;
                        this.mPrevMoveX = (int) motionEvent.getX();
                        $jacocoInit[88] = true;
                        this.mPrevMoveY = (int) motionEvent.getY();
                        $jacocoInit[89] = true;
                        this.mMatrix.postTranslate((float) (-x), (float) (-y));
                        $jacocoInit[90] = true;
                        cutting();
                        $jacocoInit[91] = true;
                    }
                } else if (action != 5) {
                    if (action != 6) {
                        if (action != 261) {
                            if (action != 262) {
                                $jacocoInit[72] = true;
                            }
                        }
                    }
                }
                $jacocoInit[94] = true;
                return true;
            }
            if (motionEvent.getPointerCount() > 1) {
                $jacocoInit[92] = true;
            } else {
                this.isScaling = false;
                $jacocoInit[93] = true;
            }
            $jacocoInit[94] = true;
            return true;
        }
        if (pointerCount >= 2) {
            $jacocoInit[73] = true;
            this.mPrevDistance = distance(motionEvent.getX(0), motionEvent.getX(1), motionEvent.getY(0), motionEvent.getY(1));
            this.isScaling = true;
            $jacocoInit[74] = true;
        } else {
            this.mPrevMoveX = (int) motionEvent.getX();
            $jacocoInit[75] = true;
            this.mPrevMoveY = (int) motionEvent.getY();
            $jacocoInit[76] = true;
        }
        $jacocoInit[94] = true;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        int i5;
        boolean[] $jacocoInit = $jacocoInit();
        int i6 = i3 - i;
        this.mWidth = i6;
        this.mHeight = i4 - i2;
        $jacocoInit[16] = true;
        this.mMatrix.reset();
        this.mScale = ((float) i6) / ((float) this.mIntrinsicWidth);
        float f = this.mScale;
        int i7 = this.mIntrinsicHeight;
        float f2 = ((float) i7) * f;
        int i8 = this.mHeight;
        int i9 = 0;
        if (f2 > ((float) i8)) {
            this.mScale = ((float) i8) / ((float) i7);
            $jacocoInit[17] = true;
            Matrix matrix = this.mMatrix;
            float f3 = this.mScale;
            matrix.postScale(f3, f3);
            i5 = (i3 - this.mWidth) / 2;
            $jacocoInit[18] = true;
        } else {
            this.mMatrix.postScale(f, f);
            int i10 = (i4 - this.mHeight) / 2;
            $jacocoInit[19] = true;
            i9 = i10;
            i5 = 0;
        }
        this.mMatrix.postTranslate((float) i5, (float) i9);
        $jacocoInit[20] = true;
        setImageMatrix(this.mMatrix);
        float f4 = this.mScale;
        this.mMinScale = f4;
        $jacocoInit[21] = true;
        zoomTo(f4, this.mWidth / 2, this.mHeight / 2);
        $jacocoInit[22] = true;
        cutting();
        $jacocoInit[23] = true;
        boolean frame = super.setFrame(i, i2, i3, i4);
        $jacocoInit[24] = true;
        return frame;
    }

    public void setImageBitmap(Bitmap bitmap) {
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageBitmap(bitmap);
        $jacocoInit[4] = true;
        initialize();
        $jacocoInit[5] = true;
    }

    public void setImageResource(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        super.setImageResource(i);
        $jacocoInit[6] = true;
        initialize();
        $jacocoInit[7] = true;
    }

    public void zoomTo(float f, int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        if (getScale() * f < this.mMinScale) {
            $jacocoInit[37] = true;
            return;
        }
        if (f < 1.0f) {
            $jacocoInit[38] = true;
        } else if (getScale() * f <= this.MAX_SCALE) {
            $jacocoInit[39] = true;
        } else {
            $jacocoInit[40] = true;
            return;
        }
        this.mMatrix.postScale(f, f);
        $jacocoInit[41] = true;
        Matrix matrix = this.mMatrix;
        int i3 = this.mWidth;
        float f2 = (-((((float) i3) * f) - ((float) i3))) / 2.0f;
        int i4 = this.mHeight;
        matrix.postTranslate(f2, (-((((float) i4) * f) - ((float) i4))) / 2.0f);
        $jacocoInit[42] = true;
        this.mMatrix.postTranslate(((float) (-(i - (this.mWidth / 2)))) * f, 0.0f);
        $jacocoInit[43] = true;
        this.mMatrix.postTranslate(0.0f, ((float) (-(i2 - (this.mHeight / 2)))) * f);
        $jacocoInit[44] = true;
        setImageMatrix(this.mMatrix);
        $jacocoInit[45] = true;
    }

    public ScaleImageView(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super(context);
        this.mContext = context;
        $jacocoInit[2] = true;
        initialize();
        $jacocoInit[3] = true;
    }
}
