package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView.C12062c;
import com.theartofdev.edmodo.cropper.CropImageView.C12063d;
import java.util.Arrays;

public class CropOverlayView extends View {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final C12088f f34879N;

    /* renamed from: O */
    private C12072b f34880O;

    /* renamed from: P */
    private final RectF f34881P;

    /* renamed from: Q */
    private Paint f34882Q;

    /* renamed from: R */
    private Paint f34883R;

    /* renamed from: S */
    private Paint f34884S;

    /* renamed from: T */
    private Paint f34885T;

    /* renamed from: U */
    private Path f34886U;

    /* renamed from: V */
    private final float[] f34887V;

    /* renamed from: W */
    private final RectF f34888W;

    /* renamed from: a */
    private ScaleGestureDetector f34889a;

    /* renamed from: a0 */
    private int f34890a0;

    /* renamed from: b */
    private boolean f34891b;

    /* renamed from: b0 */
    private int f34892b0;

    /* renamed from: c0 */
    private float f34893c0;

    /* renamed from: d0 */
    private float f34894d0;

    /* renamed from: e0 */
    private float f34895e0;

    /* renamed from: f0 */
    private float f34896f0;

    /* renamed from: g0 */
    private float f34897g0;

    /* renamed from: h0 */
    private C12089g f34898h0;

    /* renamed from: i0 */
    private boolean f34899i0;

    /* renamed from: j0 */
    private int f34900j0;

    /* renamed from: k0 */
    private int f34901k0;

    /* renamed from: l0 */
    private float f34902l0;

    /* renamed from: m0 */
    private C12063d f34903m0;

    /* renamed from: n0 */
    private C12062c f34904n0;

    /* renamed from: o0 */
    private final Rect f34905o0;

    /* renamed from: p0 */
    private boolean f34906p0;

    /* renamed from: q0 */
    private Integer f34907q0;

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    public interface C12072b {
        /* renamed from: a */
        void mo41360a(boolean z);
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$c */
    private class C12073c extends SimpleOnScaleGestureListener {
        private C12073c() {
        }

        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF e = CropOverlayView.this.f34879N.mo41429e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 < f3 && f <= f4 && f2 >= 0.0f && f3 <= CropOverlayView.this.f34879N.mo41425b() && f >= 0.0f && f4 <= CropOverlayView.this.f34879N.mo41419a()) {
                e.set(f2, f, f3, f4);
                CropOverlayView.this.f34879N.mo41423a(e);
                CropOverlayView.this.invalidate();
            }
            return true;
        }
    }

    public CropOverlayView(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m54577e() {
        float max = Math.max(C12083c.m54622e(this.f34887V), 0.0f);
        float max2 = Math.max(C12083c.m54624g(this.f34887V), 0.0f);
        float min = Math.min(C12083c.m54623f(this.f34887V), (float) getWidth());
        float min2 = Math.min(C12083c.m54596a(this.f34887V), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f34906p0 = true;
            float f = this.f34895e0;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f34905o0.width() > 0 && this.f34905o0.height() > 0) {
                rectF.left = (((float) this.f34905o0.left) / this.f34879N.mo41431g()) + max;
                rectF.top = (((float) this.f34905o0.top) / this.f34879N.mo41430f()) + max2;
                rectF.right = rectF.left + (((float) this.f34905o0.width()) / this.f34879N.mo41431g());
                rectF.bottom = rectF.top + (((float) this.f34905o0.height()) / this.f34879N.mo41430f());
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f34899i0 || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f34902l0) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f34902l0 = ((float) this.f34900j0) / ((float) this.f34901k0);
                float max3 = Math.max(this.f34879N.mo41428d(), rectF.height() * this.f34902l0) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(this.f34879N.mo41427c(), rectF.width() / this.f34902l0) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            m54573b(rectF);
            this.f34879N.mo41423a(rectF);
        }
    }

    /* renamed from: f */
    private boolean m54578f() {
        float[] fArr = this.f34887V;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    /* renamed from: g */
    private void m54579g() {
        if (this.f34898h0 != null) {
            this.f34898h0 = null;
            m54574b(false);
            invalidate();
        }
    }

    /* renamed from: b */
    public boolean mo41381b() {
        return this.f34899i0;
    }

    /* renamed from: c */
    public void mo41382c() {
        if (this.f34906p0) {
            setCropWindowRect(C12083c.f34946b);
            m54577e();
            invalidate();
        }
    }

    /* renamed from: d */
    public void mo41383d() {
        if (this.f34906p0) {
            m54577e();
            invalidate();
            m54574b(false);
        }
    }

    public int getAspectRatioX() {
        return this.f34900j0;
    }

    public int getAspectRatioY() {
        return this.f34901k0;
    }

    public C12062c getCropShape() {
        return this.f34904n0;
    }

    public RectF getCropWindowRect() {
        return this.f34879N.mo41429e();
    }

    public C12063d getGuidelines() {
        return this.f34903m0;
    }

    public Rect getInitialCropWindowRect() {
        return this.f34905o0;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m54569a(canvas);
        if (this.f34879N.mo41432h()) {
            C12063d dVar = this.f34903m0;
            if (dVar == C12063d.ON) {
                m54576d(canvas);
            } else if (dVar == C12063d.ON_TOUCH && this.f34898h0 != null) {
                m54576d(canvas);
            }
        }
        m54572b(canvas);
        m54575c(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        if (this.f34891b) {
            this.f34889a.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    m54571b(motionEvent.getX(), motionEvent.getY());
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
            m54579g();
            return true;
        }
        m54568a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f34900j0 != i) {
            this.f34900j0 = i;
            this.f34902l0 = ((float) this.f34900j0) / ((float) this.f34901k0);
            if (this.f34906p0) {
                m54577e();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f34901k0 != i) {
            this.f34901k0 = i;
            this.f34902l0 = ((float) this.f34900j0) / ((float) this.f34901k0);
            if (this.f34906p0) {
                m54577e();
                invalidate();
            }
        }
    }

    public void setCropShape(C12062c cVar) {
        if (this.f34904n0 != cVar) {
            this.f34904n0 = cVar;
            if (VERSION.SDK_INT <= 17) {
                if (this.f34904n0 == C12062c.OVAL) {
                    this.f34907q0 = Integer.valueOf(getLayerType());
                    if (this.f34907q0.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.f34907q0 = null;
                    }
                } else {
                    Integer num = this.f34907q0;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.f34907q0 = null;
                    }
                }
            }
            invalidate();
        }
    }

    public void setCropWindowChangeListener(C12072b bVar) {
        this.f34880O = bVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f34879N.mo41423a(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f34899i0 != z) {
            this.f34899i0 = z;
            if (this.f34906p0) {
                m54577e();
                invalidate();
            }
        }
    }

    public void setGuidelines(C12063d dVar) {
        if (this.f34903m0 != dVar) {
            this.f34903m0 = dVar;
            if (this.f34906p0) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        this.f34879N.mo41424a(cropImageOptions);
        setCropShape(cropImageOptions.f34801a);
        setSnapRadius(cropImageOptions.f34803b);
        setGuidelines(cropImageOptions.f34789O);
        setFixedAspectRatio(cropImageOptions.f34797W);
        setAspectRatioX(cropImageOptions.f34798X);
        setAspectRatioY(cropImageOptions.f34799Y);
        mo41379a(cropImageOptions.f34794T);
        this.f34896f0 = cropImageOptions.f34788N;
        this.f34895e0 = cropImageOptions.f34796V;
        this.f34882Q = m54565a(cropImageOptions.f34800Z, cropImageOptions.f34802a0);
        this.f34893c0 = cropImageOptions.f34805c0;
        this.f34894d0 = cropImageOptions.f34806d0;
        this.f34883R = m54565a(cropImageOptions.f34804b0, cropImageOptions.f34807e0);
        this.f34884S = m54565a(cropImageOptions.f34808f0, cropImageOptions.f34809g0);
        this.f34885T = m54566a(cropImageOptions.f34810h0);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f34905o0;
        if (rect == null) {
            rect = C12083c.f34945a;
        }
        rect2.set(rect);
        if (this.f34906p0) {
            m54577e();
            invalidate();
            m54574b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f34897g0 = f;
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34879N = new C12088f();
        this.f34881P = new RectF();
        this.f34886U = new Path();
        this.f34887V = new float[8];
        this.f34888W = new RectF();
        this.f34902l0 = ((float) this.f34900j0) / ((float) this.f34901k0);
        this.f34905o0 = new Rect();
    }

    /* renamed from: a */
    public void mo41375a() {
        RectF cropWindowRect = getCropWindowRect();
        m54573b(cropWindowRect);
        this.f34879N.mo41423a(cropWindowRect);
    }

    /* renamed from: b */
    public void mo41380b(int i, int i2) {
        this.f34879N.mo41426b(i, i2);
    }

    /* renamed from: b */
    private void m54573b(RectF rectF) {
        if (rectF.width() < this.f34879N.mo41428d()) {
            float d = (this.f34879N.mo41428d() - rectF.width()) / 2.0f;
            rectF.left -= d;
            rectF.right += d;
        }
        if (rectF.height() < this.f34879N.mo41427c()) {
            float c = (this.f34879N.mo41427c() - rectF.height()) / 2.0f;
            rectF.top -= c;
            rectF.bottom += c;
        }
        if (rectF.width() > this.f34879N.mo41425b()) {
            float width = (rectF.width() - this.f34879N.mo41425b()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f34879N.mo41419a()) {
            float height = (rectF.height() - this.f34879N.mo41419a()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        m54570a(rectF);
        if (this.f34888W.width() > 0.0f && this.f34888W.height() > 0.0f) {
            float max = Math.max(this.f34888W.left, 0.0f);
            float max2 = Math.max(this.f34888W.top, 0.0f);
            float min = Math.min(this.f34888W.right, (float) getWidth());
            float min2 = Math.min(this.f34888W.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f34899i0 && ((double) Math.abs(rectF.width() - (rectF.height() * this.f34902l0))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f34902l0) {
                float abs = Math.abs((rectF.height() * this.f34902l0) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f34902l0) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: c */
    private void m54575c(Canvas canvas) {
        if (this.f34883R != null) {
            Paint paint = this.f34882Q;
            float f = 0.0f;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f34883R.getStrokeWidth();
            float f2 = strokeWidth2 / 2.0f;
            if (this.f34904n0 == C12062c.RECTANGLE) {
                f = this.f34893c0;
            }
            float f3 = f + f2;
            RectF e = this.f34879N.mo41429e();
            e.inset(f3, f3);
            float f4 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f5 = f2 + f4;
            float f6 = e.left;
            float f7 = f6 - f4;
            float f8 = e.top;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f7, f8 - f5, f6 - f4, f8 + this.f34894d0, this.f34883R);
            float f9 = e.left;
            float f10 = f9 - f5;
            float f11 = e.top;
            canvas2.drawLine(f10, f11 - f4, f9 + this.f34894d0, f11 - f4, this.f34883R);
            float f12 = e.right;
            float f13 = f12 + f4;
            float f14 = e.top;
            canvas2.drawLine(f13, f14 - f5, f12 + f4, f14 + this.f34894d0, this.f34883R);
            float f15 = e.right;
            float f16 = f15 + f5;
            float f17 = e.top;
            canvas2.drawLine(f16, f17 - f4, f15 - this.f34894d0, f17 - f4, this.f34883R);
            float f18 = e.left;
            float f19 = f18 - f4;
            float f20 = e.bottom;
            canvas2.drawLine(f19, f20 + f5, f18 - f4, f20 - this.f34894d0, this.f34883R);
            float f21 = e.left;
            float f22 = f21 - f5;
            float f23 = e.bottom;
            canvas2.drawLine(f22, f23 + f4, f21 + this.f34894d0, f23 + f4, this.f34883R);
            float f24 = e.right;
            float f25 = f24 + f4;
            float f26 = e.bottom;
            canvas2.drawLine(f25, f26 + f5, f24 + f4, f26 - this.f34894d0, this.f34883R);
            float f27 = e.right;
            float f28 = f27 + f5;
            float f29 = e.bottom;
            canvas2.drawLine(f28, f29 + f4, f27 - this.f34894d0, f29 + f4, this.f34883R);
        }
    }

    /* renamed from: d */
    private void m54576d(Canvas canvas) {
        if (this.f34884S != null) {
            Paint paint = this.f34882Q;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF e = this.f34879N.mo41429e();
            e.inset(strokeWidth, strokeWidth);
            float width = e.width() / 3.0f;
            float height = e.height() / 3.0f;
            if (this.f34904n0 == C12062c.OVAL) {
                float width2 = (e.width() / 2.0f) - strokeWidth;
                float height2 = (e.height() / 2.0f) - strokeWidth;
                float f = e.left + width;
                float f2 = e.right - width;
                double d = (double) height2;
                double sin = Math.sin(Math.acos((double) ((width2 - width) / width2)));
                Double.isNaN(d);
                float f3 = (float) (d * sin);
                canvas.drawLine(f, (e.top + height2) - f3, f, (e.bottom - height2) + f3, this.f34884S);
                canvas.drawLine(f2, (e.top + height2) - f3, f2, (e.bottom - height2) + f3, this.f34884S);
                float f4 = e.top + height;
                float f5 = e.bottom - height;
                double d2 = (double) width2;
                double cos = Math.cos(Math.asin((double) ((height2 - height) / height2)));
                Double.isNaN(d2);
                float f6 = (float) (d2 * cos);
                canvas.drawLine((e.left + width2) - f6, f4, (e.right - width2) + f6, f4, this.f34884S);
                canvas.drawLine((e.left + width2) - f6, f5, (e.right - width2) + f6, f5, this.f34884S);
                return;
            }
            float f7 = e.left + width;
            float f8 = e.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f7, e.top, f7, e.bottom, this.f34884S);
            canvas.drawLine(f8, e.top, f8, e.bottom, this.f34884S);
            float f9 = e.top + height;
            float f10 = e.bottom - height;
            canvas2.drawLine(e.left, f9, e.right, f9, this.f34884S);
            canvas.drawLine(e.left, f10, e.right, f10, this.f34884S);
        }
    }

    /* renamed from: a */
    public void mo41378a(float[] fArr, int i, int i2) {
        if (fArr == null || !Arrays.equals(this.f34887V, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f34887V, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.f34887V, 0, fArr.length);
            }
            this.f34890a0 = i;
            this.f34892b0 = i2;
            RectF e = this.f34879N.mo41429e();
            if (e.width() == 0.0f || e.height() == 0.0f) {
                m54577e();
            }
        }
    }

    /* renamed from: a */
    public boolean mo41379a(boolean z) {
        if (this.f34891b == z) {
            return false;
        }
        this.f34891b = z;
        if (this.f34891b && this.f34889a == null) {
            this.f34889a = new ScaleGestureDetector(getContext(), new C12073c());
        }
        return true;
    }

    /* renamed from: a */
    public void mo41377a(int i, int i2) {
        this.f34879N.mo41422a(i, i2);
    }

    /* renamed from: a */
    public void mo41376a(float f, float f2, float f3, float f4) {
        this.f34879N.mo41421a(f, f2, f3, f4);
    }

    /* renamed from: a */
    private void m54569a(Canvas canvas) {
        RectF e = this.f34879N.mo41429e();
        float max = Math.max(C12083c.m54622e(this.f34887V), 0.0f);
        float max2 = Math.max(C12083c.m54624g(this.f34887V), 0.0f);
        float min = Math.min(C12083c.m54623f(this.f34887V), (float) getWidth());
        float min2 = Math.min(C12083c.m54596a(this.f34887V), (float) getHeight());
        if (this.f34904n0 != C12062c.RECTANGLE) {
            this.f34886U.reset();
            if (VERSION.SDK_INT > 17 || this.f34904n0 != C12062c.OVAL) {
                this.f34881P.set(e.left, e.top, e.right, e.bottom);
            } else {
                this.f34881P.set(e.left + 2.0f, e.top + 2.0f, e.right - 2.0f, e.bottom - 2.0f);
            }
            this.f34886U.addOval(this.f34881P, Direction.CW);
            canvas.save();
            if (VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f34886U);
            } else {
                canvas.clipPath(this.f34886U, Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.f34885T);
            canvas.restore();
        } else if (!m54578f() || VERSION.SDK_INT <= 17) {
            Canvas canvas2 = canvas;
            float f = max;
            float f2 = min;
            canvas2.drawRect(f, max2, f2, e.top, this.f34885T);
            canvas2.drawRect(f, e.bottom, f2, min2, this.f34885T);
            canvas2.drawRect(f, e.top, e.left, e.bottom, this.f34885T);
            canvas.drawRect(e.right, e.top, min, e.bottom, this.f34885T);
        } else {
            this.f34886U.reset();
            Path path = this.f34886U;
            float[] fArr = this.f34887V;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.f34886U;
            float[] fArr2 = this.f34887V;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.f34886U;
            float[] fArr3 = this.f34887V;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.f34886U;
            float[] fArr4 = this.f34887V;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.f34886U.close();
            canvas.save();
            if (VERSION.SDK_INT >= 26) {
                canvas.clipOutPath(this.f34886U);
            } else {
                canvas.clipPath(this.f34886U, Op.INTERSECT);
            }
            canvas.clipRect(e, Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.f34885T);
            canvas.restore();
        }
    }

    /* renamed from: b */
    private void m54572b(Canvas canvas) {
        Paint paint = this.f34882Q;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF e = this.f34879N.mo41429e();
            float f = strokeWidth / 2.0f;
            e.inset(f, f);
            if (this.f34904n0 == C12062c.RECTANGLE) {
                canvas.drawRect(e, this.f34882Q);
            } else {
                canvas.drawOval(e, this.f34882Q);
            }
        }
    }

    /* renamed from: b */
    private void m54571b(float f, float f2) {
        if (this.f34898h0 != null) {
            float f3 = this.f34897g0;
            RectF e = this.f34879N.mo41429e();
            this.f34898h0.mo41433a(e, f, f2, this.f34888W, this.f34890a0, this.f34892b0, m54570a(e) ? 0.0f : f3, this.f34899i0, this.f34902l0);
            this.f34879N.mo41423a(e);
            m54574b(true);
            invalidate();
        }
    }

    /* renamed from: a */
    private static Paint m54566a(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        return paint;
    }

    /* renamed from: a */
    private static Paint m54565a(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: b */
    private void m54574b(boolean z) {
        try {
            if (this.f34880O != null) {
                this.f34880O.mo41360a(z);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m54568a(float f, float f2) {
        this.f34898h0 = this.f34879N.mo41420a(f, f2, this.f34896f0, this.f34904n0);
        if (this.f34898h0 != null) {
            invalidate();
        }
    }

    /* renamed from: a */
    private boolean m54570a(RectF rectF) {
        RectF rectF2 = rectF;
        float e = C12083c.m54622e(this.f34887V);
        float g = C12083c.m54624g(this.f34887V);
        float f = C12083c.m54623f(this.f34887V);
        float a = C12083c.m54596a(this.f34887V);
        if (!m54578f()) {
            this.f34888W.set(e, g, f, a);
            return false;
        }
        float[] fArr = this.f34887V;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f2 = fArr[6];
                f3 = fArr[7];
                f4 = fArr[2];
                f5 = fArr[3];
                f6 = fArr[4];
                f7 = fArr[5];
            } else {
                f2 = fArr[4];
                f3 = fArr[5];
                f4 = fArr[0];
                f5 = fArr[1];
                f6 = fArr[2];
                f7 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f2 = fArr[2];
            f3 = fArr[3];
            f4 = fArr[6];
            f5 = fArr[7];
            f6 = fArr[0];
            f7 = fArr[1];
        }
        float f8 = (f7 - f3) / (f6 - f2);
        float f9 = -1.0f / f8;
        float f10 = f3 - (f8 * f2);
        float f11 = f3 - (f2 * f9);
        float f12 = f5 - (f8 * f4);
        float f13 = f5 - (f4 * f9);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f14 = rectF2.left;
        float f15 = centerY / (centerX - f14);
        float f16 = -f15;
        float f17 = rectF2.top;
        float f18 = f17 - (f14 * f15);
        float f19 = rectF2.right;
        float f20 = f17 - (f16 * f19);
        float f21 = f8 - f15;
        float f22 = (f18 - f10) / f21;
        float max = Math.max(e, f22 < f19 ? f22 : e);
        float f23 = (f18 - f11) / (f9 - f15);
        if (f23 >= rectF2.right) {
            f23 = max;
        }
        float max2 = Math.max(max, f23);
        float f24 = f9 - f16;
        float f25 = (f20 - f13) / f24;
        if (f25 >= rectF2.right) {
            f25 = max2;
        }
        float max3 = Math.max(max2, f25);
        float f26 = (f20 - f11) / f24;
        if (f26 <= rectF2.left) {
            f26 = f;
        }
        float min = Math.min(f, f26);
        float f27 = (f20 - f12) / (f8 - f16);
        if (f27 <= rectF2.left) {
            f27 = min;
        }
        float min2 = Math.min(min, f27);
        float f28 = (f18 - f12) / f21;
        if (f28 <= rectF2.left) {
            f28 = min2;
        }
        float min3 = Math.min(min2, f28);
        float max4 = Math.max(g, Math.max((f8 * max3) + f10, (f9 * min3) + f11));
        float min4 = Math.min(a, Math.min((f9 * max3) + f13, (f8 * min3) + f12));
        RectF rectF3 = this.f34888W;
        rectF3.left = max3;
        rectF3.top = max4;
        rectF3.right = min3;
        rectF3.bottom = min4;
        return true;
    }
}
