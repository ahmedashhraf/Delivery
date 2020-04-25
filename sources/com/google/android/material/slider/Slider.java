package com.google.android.material.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0209o;
import androidx.annotation.C0211p;
import androidx.annotation.C0224v0;
import androidx.annotation.C0237z;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6897c;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p297g.C6882a;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p306r.C7006a;
import com.google.android.material.theme.p307a.C7109a;
import java.util.Locale;
import p076c.p112d.p148d.p150g.C6637f;

public class Slider extends View {

    /* renamed from: A0 */
    private static final String f19693A0 = "valueTo must be greater than valueFrom";

    /* renamed from: B0 */
    private static final String f19694B0 = "The stepSize must be 0, or a factor of the valueFrom-valueTo range";

    /* renamed from: C0 */
    private static final int f19695C0 = 63;

    /* renamed from: D0 */
    private static final double f19696D0 = 1.0E-4d;

    /* renamed from: E0 */
    private static final int f19697E0 = C5582R.style.Widget_MaterialComponents_Slider;

    /* renamed from: w0 */
    private static final String f19698w0 = Slider.class.getSimpleName();

    /* renamed from: x0 */
    private static final String f19699x0 = "Slider value must be greater or equal to valueFrom, and lower or equal to valueTo";

    /* renamed from: y0 */
    private static final String f19700y0 = "Value must be equal to valueFrom plus a multiple of stepSize when using stepSize";

    /* renamed from: z0 */
    private static final String f19701z0 = "valueFrom must be smaller than valueTo";
    @C0193h0

    /* renamed from: N */
    private final Paint f19702N;
    @C0193h0

    /* renamed from: O */
    private final Paint f19703O;
    @C0193h0

    /* renamed from: P */
    private final Paint f19704P;
    @C0193h0

    /* renamed from: Q */
    private final Paint f19705Q;
    @C0193h0

    /* renamed from: R */
    private C7006a f19706R;

    /* renamed from: S */
    private final int f19707S;

    /* renamed from: T */
    private int f19708T;

    /* renamed from: U */
    private boolean f19709U;

    /* renamed from: V */
    private int f19710V;

    /* renamed from: W */
    private int f19711W;
    @C0193h0

    /* renamed from: a */
    private final Paint f19712a;

    /* renamed from: a0 */
    private int f19713a0;
    @C0193h0

    /* renamed from: b */
    private final Paint f19714b;

    /* renamed from: b0 */
    private int f19715b0;

    /* renamed from: c0 */
    private int f19716c0;

    /* renamed from: d0 */
    private int f19717d0;

    /* renamed from: e0 */
    private float f19718e0;

    /* renamed from: f0 */
    private C7012d f19719f0;

    /* renamed from: g0 */
    private C7011c f19720g0;

    /* renamed from: h0 */
    private boolean f19721h0;

    /* renamed from: i0 */
    private float f19722i0;

    /* renamed from: j0 */
    private float f19723j0;

    /* renamed from: k0 */
    private float f19724k0;

    /* renamed from: l0 */
    private float f19725l0;

    /* renamed from: m0 */
    private float[] f19726m0;

    /* renamed from: n0 */
    private float[] f19727n0;

    /* renamed from: o0 */
    private int f19728o0;

    /* renamed from: p0 */
    private boolean f19729p0;
    @C0193h0

    /* renamed from: q0 */
    private ColorStateList f19730q0;
    @C0193h0

    /* renamed from: r0 */
    private ColorStateList f19731r0;
    @C0193h0

    /* renamed from: s0 */
    private ColorStateList f19732s0;
    @C0193h0

    /* renamed from: t0 */
    private ColorStateList f19733t0;
    @C0193h0

    /* renamed from: u0 */
    private ColorStateList f19734u0;
    @C0193h0

    /* renamed from: v0 */
    private final C6978j f19735v0;

    static class SliderState extends BaseSavedState {
        public static final Creator<SliderState> CREATOR = new C7008a();

        /* renamed from: N */
        float f19736N;

        /* renamed from: O */
        float f19737O;

        /* renamed from: P */
        float[] f19738P;

        /* renamed from: Q */
        boolean f19739Q;

        /* renamed from: a */
        float f19740a;

        /* renamed from: b */
        float f19741b;

        /* renamed from: com.google.android.material.slider.Slider$SliderState$a */
        static class C7008a implements Creator<SliderState> {
            C7008a() {
            }

            @C0193h0
            public SliderState createFromParcel(@C0193h0 Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @C0193h0
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, C7009a aVar) {
            this(parcel);
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f19740a);
            parcel.writeFloat(this.f19741b);
            parcel.writeFloat(this.f19736N);
            parcel.writeFloat(this.f19737O);
            parcel.writeFloatArray(this.f19738P);
            parcel.writeBooleanArray(new boolean[]{this.f19739Q});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(@C0193h0 Parcel parcel) {
            super(parcel);
            this.f19740a = parcel.readFloat();
            this.f19741b = parcel.readFloat();
            this.f19736N = parcel.readFloat();
            this.f19737O = parcel.readFloat();
            parcel.readFloatArray(this.f19738P);
            this.f19739Q = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.Slider$a */
    class C7009a implements OnFocusChangeListener {
        C7009a() {
        }

        public void onFocusChange(View view, boolean z) {
            Slider.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.slider.Slider$b */
    public static final class C7010b implements C7011c {

        /* renamed from: a */
        private static final long f19743a = 1000000000000L;

        /* renamed from: b */
        private static final int f19744b = 1000000000;

        /* renamed from: c */
        private static final int f19745c = 1000000;

        /* renamed from: d */
        private static final int f19746d = 1000;

        @C0193h0
        /* renamed from: a */
        public String mo27988a(float f) {
            if (f >= 1.0E12f) {
                return String.format(Locale.US, "%.1fT", new Object[]{Float.valueOf(f / 1.0E12f)});
            } else if (f >= 1.0E9f) {
                return String.format(Locale.US, "%.1fB", new Object[]{Float.valueOf(f / 1.0E9f)});
            } else if (f >= 1000000.0f) {
                return String.format(Locale.US, "%.1fM", new Object[]{Float.valueOf(f / 1000000.0f)});
            } else if (f >= 1000.0f) {
                return String.format(Locale.US, "%.1fK", new Object[]{Float.valueOf(f / 1000.0f)});
            } else {
                return String.format(Locale.US, "%.0f", new Object[]{Float.valueOf(f)});
            }
        }
    }

    /* renamed from: com.google.android.material.slider.Slider$c */
    public interface C7011c {
        @C0193h0
        /* renamed from: a */
        String mo27988a(float f);
    }

    /* renamed from: com.google.android.material.slider.Slider$d */
    public interface C7012d {
        /* renamed from: a */
        void mo27989a(Slider slider, float f);
    }

    public Slider(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m33722a(@C0193h0 Resources resources) {
        this.f19708T = resources.getDimensionPixelSize(C5582R.dimen.mtrl_slider_widget_height);
        this.f19711W = resources.getDimensionPixelOffset(C5582R.dimen.mtrl_slider_track_side_padding);
        this.f19713a0 = resources.getDimensionPixelOffset(C5582R.dimen.mtrl_slider_track_top);
        this.f19717d0 = resources.getDimensionPixelSize(C5582R.dimen.mtrl_slider_label_padding);
    }

    /* renamed from: d */
    private int m33728d() {
        return this.f19713a0 + (this.f19709U ? 0 : this.f19706R.getIntrinsicHeight());
    }

    /* renamed from: e */
    private void m33730e() {
        float value = getValue();
        if (mo27948a()) {
            this.f19706R.mo27937a((CharSequence) this.f19720g0.mo27988a(value));
        } else {
            this.f19706R.mo27937a((CharSequence) String.format(((float) ((int) value)) == value ? "%.0f" : "%.2f", new Object[]{Float.valueOf(value)}));
        }
    }

    /* renamed from: f */
    private void m33731f() {
        this.f19712a.setStrokeWidth((float) this.f19710V);
        this.f19714b.setStrokeWidth((float) this.f19710V);
        this.f19704P.setStrokeWidth(((float) this.f19710V) / 2.0f);
        this.f19705Q.setStrokeWidth(((float) this.f19710V) / 2.0f);
    }

    /* renamed from: g */
    private boolean m33732g() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m33733h() {
        if (C0962e0.m5540n0(this)) {
            m33720a(getWidth());
        }
    }

    /* renamed from: i */
    private void m33734i() {
        if (this.f19725l0 > 0.0f) {
            this.f19724k0 = ((float) m33718a(this.f19726m0)) / ((float) ((this.f19726m0.length / 2) - 1));
        }
    }

    /* renamed from: j */
    private void m33735j() {
        if (VERSION.SDK_INT >= 21 && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int i = (int) ((this.f19724k0 * ((float) this.f19728o0)) + ((float) this.f19711W));
                int d = m33728d();
                int i2 = this.f19716c0;
                C0892a.m5145a(background, i - i2, d - i2, i + i2, d + i2);
            }
        }
    }

    /* renamed from: k */
    private void m33736k() {
        int intrinsicWidth = (this.f19711W + ((int) (this.f19724k0 * ((float) this.f19728o0)))) - (this.f19706R.getIntrinsicWidth() / 2);
        int d = m33728d() - (this.f19717d0 + this.f19715b0);
        C7006a aVar = this.f19706R;
        aVar.setBounds(intrinsicWidth, d - aVar.getIntrinsicHeight(), this.f19706R.getIntrinsicWidth() + intrinsicWidth, d);
        Rect rect = new Rect(this.f19706R.getBounds());
        C6897c.m33155b(C6936w.m33294a(this), this, rect);
        this.f19706R.setBounds(rect);
        C6936w.m33298b(this).mo27659a(this.f19706R);
    }

    /* renamed from: l */
    private void m33737l() {
        float f = this.f19725l0;
        String str = f19694B0;
        if (f < 0.0f) {
            throw new IllegalArgumentException(str);
        } else if (f > 0.0f && ((double) (((this.f19723j0 - this.f19722i0) / f) % 1.0f)) > f19696D0) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: m */
    private void m33738m() {
        if (this.f19722i0 >= this.f19723j0) {
            throw new IllegalArgumentException(f19701z0);
        }
    }

    /* renamed from: n */
    private void m33739n() {
        if (this.f19723j0 <= this.f19722i0) {
            throw new IllegalArgumentException(f19693A0);
        }
    }

    private void setTicksCoordinates(float[] fArr) {
        int length = fArr.length / 2;
        float f = ((float) this.f19728o0) / ((float) (length - 1));
        for (int i = 0; i < length * 2; i += 2) {
            fArr[i] = ((float) this.f19711W) + (((float) (i / 2)) * f);
            fArr[i + 1] = (float) m33728d();
        }
    }

    /* renamed from: b */
    public boolean mo27949b() {
        return this.f19719f0 != null;
    }

    /* renamed from: c */
    public boolean mo27950c() {
        return this.f19709U;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f19712a.setColor(m33717a(this.f19734u0));
        this.f19714b.setColor(m33717a(this.f19733t0));
        this.f19704P.setColor(m33717a(this.f19732s0));
        this.f19705Q.setColor(m33717a(this.f19731r0));
        if (this.f19706R.isStateful()) {
            this.f19706R.setState(getDrawableState());
        }
        if (this.f19735v0.isStateful()) {
            this.f19735v0.setState(getDrawableState());
        }
        this.f19703O.setColor(m33717a(this.f19730q0));
        this.f19703O.setAlpha(63);
    }

    @C0211p
    public int getHaloRadius() {
        return this.f19716c0;
    }

    public float getStepSize() {
        return this.f19725l0;
    }

    public float getThumbElevation() {
        return this.f19735v0.mo27812e();
    }

    @C0211p
    public int getThumbRadius() {
        return this.f19715b0;
    }

    @C0211p
    public int getTrackHeight() {
        return this.f19710V;
    }

    public float getValue() {
        float f = this.f19724k0;
        float f2 = this.f19723j0;
        float f3 = this.f19722i0;
        return (f * (f2 - f3)) + f3;
    }

    public float getValueFrom() {
        return this.f19722i0;
    }

    public float getValueTo() {
        return this.f19723j0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19706R.mo27938b(C6936w.m33294a(this));
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C6936w.m33298b(this).mo27660b(this.f19706R);
        this.f19706R.mo27935a((View) C6936w.m33294a(this));
    }

    /* access modifiers changed from: protected */
    public void onDraw(@C0193h0 Canvas canvas) {
        super.onDraw(canvas);
        int d = m33728d();
        m33726b(canvas, this.f19728o0, d);
        if (this.f19724k0 > 0.0f) {
            m33724a(canvas, this.f19728o0, d);
        }
        if (this.f19725l0 > 0.0f) {
            m33723a(canvas);
        }
        if ((this.f19721h0 || isFocused()) && isEnabled()) {
            m33729d(canvas, this.f19728o0, d);
        }
        m33727c(canvas, this.f19728o0, d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.f19708T;
        if (this.f19709U) {
            i3 = 0;
        } else {
            i3 = this.f19706R.getIntrinsicHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i4 + i3, C6637f.f18605b));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f19722i0 = sliderState.f19740a;
        this.f19723j0 = sliderState.f19741b;
        this.f19724k0 = sliderState.f19736N;
        this.f19725l0 = sliderState.f19737O;
        if (sliderState.f19739Q) {
            requestFocus();
        }
        if (mo27949b()) {
            this.f19719f0.mo27989a(this, getValue());
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f19740a = this.f19722i0;
        sliderState.f19741b = this.f19723j0;
        sliderState.f19736N = this.f19724k0;
        sliderState.f19737O = this.f19725l0;
        sliderState.f19739Q = hasFocus();
        return sliderState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m33720a(i);
        m33735j();
    }

    public boolean onTouchEvent(@C0193h0 MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float min = Math.min(1.0f, Math.max(0.0f, (x - ((float) this.f19711W)) / ((float) this.f19728o0)));
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.f19721h0 = false;
                this.f19724k0 = min;
                m33734i();
                C6936w.m33298b(this).mo27660b(this.f19706R);
                invalidate();
            } else if (actionMasked == 2) {
                if (!this.f19721h0) {
                    if (Math.abs(x - this.f19718e0) < ((float) this.f19707S)) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                this.f19721h0 = true;
                this.f19724k0 = min;
                m33734i();
                m33735j();
                m33730e();
                m33736k();
                invalidate();
                if (mo27949b()) {
                    this.f19719f0.mo27989a(this, getValue());
                }
            }
        } else if (m33732g()) {
            this.f19718e0 = motionEvent.getX();
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            requestFocus();
            this.f19721h0 = true;
            this.f19724k0 = min;
            m33734i();
            m33735j();
            m33730e();
            m33736k();
            invalidate();
            if (mo27949b()) {
                this.f19719f0.mo27989a(this, getValue());
            }
        }
        setPressed(this.f19721h0);
        return true;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (VERSION.SDK_INT < 21) {
            setLayerType(z ? 0 : 2, null);
        }
    }

    public void setFloatingLabel(boolean z) {
        if (this.f19709U != z) {
            this.f19709U = z;
            requestLayout();
        }
    }

    public void setHaloRadius(@C0237z(from = 0) @C0211p int i) {
        this.f19716c0 = i;
        if (VERSION.SDK_INT >= 21) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                C6882a.m33053a((RippleDrawable) background, this.f19716c0);
            }
        }
        postInvalidate();
    }

    public void setHaloRadiusResource(@C0209o int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setLabelFormatter(@C0195i0 C7011c cVar) {
        this.f19720g0 = cVar;
    }

    public void setOnChangeListener(@C0195i0 C7012d dVar) {
        this.f19719f0 = dVar;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
    }

    public void setStepSize(float f) {
        this.f19725l0 = f;
        m33737l();
        m33733h();
        postInvalidate();
    }

    public void setThumbElevation(float f) {
        this.f19735v0.mo27799b(f);
        postInvalidate();
    }

    public void setThumbElevationResource(@C0209o int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(@C0237z(from = 0) @C0211p int i) {
        this.f19715b0 = i;
        this.f19735v0.setShapeAppearanceModel(C6986o.m33529n().mo27873a(0, (float) this.f19715b0).mo27878a());
        C6978j jVar = this.f19735v0;
        int i2 = this.f19715b0;
        jVar.setBounds(0, 0, i2 * 2, i2 * 2);
        postInvalidate();
    }

    public void setThumbRadiusResource(@C0209o int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setTrackHeight(@C0237z(from = 0) @C0211p int i) {
        if (this.f19710V != i) {
            this.f19710V = i;
            m33731f();
            m33733h();
            postInvalidate();
        }
    }

    public void setValue(float f) {
        if (m33725a(f)) {
            float f2 = this.f19722i0;
            this.f19724k0 = (f - f2) / (this.f19723j0 - f2);
            if (mo27949b()) {
                this.f19719f0.mo27989a(this, getValue());
            }
            invalidate();
        }
    }

    public void setValueFrom(float f) {
        this.f19722i0 = f;
        m33738m();
    }

    public void setValueTo(float f) {
        this.f19723j0 = f;
        m33739n();
    }

    public Slider(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.sliderStyle);
    }

    /* renamed from: b */
    private void m33726b(@C0193h0 Canvas canvas, int i, int i2) {
        int i3 = this.f19711W;
        float f = ((float) i3) + (this.f19724k0 * ((float) i));
        if (f < ((float) (i3 + i))) {
            float f2 = (float) i2;
            canvas.drawLine(f, f2, (float) (i3 + i), f2, this.f19712a);
        }
    }

    /* renamed from: c */
    private void m33727c(@C0193h0 Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            canvas.drawCircle(((float) this.f19711W) + (this.f19724k0 * ((float) i)), (float) i2, (float) this.f19715b0, this.f19702N);
        }
        canvas.save();
        int i3 = this.f19711W + ((int) (this.f19724k0 * ((float) i)));
        int i4 = this.f19715b0;
        canvas.translate((float) (i3 - i4), (float) (i2 - i4));
        this.f19735v0.draw(canvas);
        canvas.restore();
    }

    /* renamed from: d */
    private void m33729d(@C0193h0 Canvas canvas, int i, int i2) {
        if (this.f19729p0 || VERSION.SDK_INT < 21) {
            int i3 = (int) (((float) this.f19711W) + (this.f19724k0 * ((float) i)));
            if (VERSION.SDK_INT < 21) {
                int i4 = this.f19716c0;
                canvas.clipRect((float) (i3 - i4), (float) (i2 - i4), (float) (i3 + i4), (float) (i4 + i2), Op.UNION);
            }
            canvas.drawCircle((float) i3, (float) i2, (float) this.f19716c0, this.f19703O);
        }
    }

    public Slider(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f19697E0), attributeSet, i);
        this.f19721h0 = false;
        this.f19724k0 = 0.0f;
        this.f19725l0 = 0.0f;
        this.f19735v0 = new C6978j();
        Context context2 = getContext();
        m33722a(context2.getResources());
        m33721a(context2, attributeSet, i);
        this.f19712a = new Paint();
        this.f19712a.setStyle(Style.STROKE);
        this.f19712a.setStrokeWidth((float) this.f19710V);
        this.f19712a.setStrokeCap(Cap.ROUND);
        this.f19714b = new Paint();
        this.f19714b.setStyle(Style.STROKE);
        this.f19714b.setStrokeWidth((float) this.f19710V);
        this.f19714b.setStrokeCap(Cap.ROUND);
        this.f19702N = new Paint(1);
        this.f19702N.setStyle(Style.FILL);
        this.f19702N.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f19703O = new Paint(1);
        this.f19703O.setStyle(Style.FILL);
        this.f19704P = new Paint();
        this.f19704P.setStyle(Style.STROKE);
        this.f19704P.setStrokeWidth(((float) this.f19710V) / 2.0f);
        this.f19704P.setStrokeCap(Cap.ROUND);
        this.f19705Q = new Paint();
        this.f19705Q.setStyle(Style.STROKE);
        this.f19705Q.setStrokeWidth(((float) this.f19710V) / 2.0f);
        this.f19705Q.setStrokeCap(Cap.ROUND);
        if (VERSION.SDK_INT >= 21) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(this.f19730q0);
            }
            setLayerType(2, null);
        }
        super.setOnFocusChangeListener(new C7009a());
        setFocusable(true);
        this.f19735v0.mo27805c(2);
        this.f19707S = ViewConfiguration.get(context2).getScaledTouchSlop();
    }

    /* renamed from: a */
    private void m33721a(Context context, AttributeSet attributeSet, int i) {
        TypedArray c = C6928p.m33264c(context, attributeSet, C5582R.styleable.Slider, i, f19697E0, new int[0]);
        this.f19722i0 = c.getFloat(C5582R.styleable.Slider_android_valueFrom, 0.0f);
        this.f19723j0 = c.getFloat(C5582R.styleable.Slider_android_valueTo, 1.0f);
        setValue(c.getFloat(C5582R.styleable.Slider_android_value, this.f19722i0));
        this.f19725l0 = c.getFloat(C5582R.styleable.Slider_android_stepSize, 0.0f);
        boolean hasValue = c.hasValue(C5582R.styleable.Slider_trackColor);
        int i2 = hasValue ? C5582R.styleable.Slider_trackColor : C5582R.styleable.Slider_trackColorInactive;
        int i3 = hasValue ? C5582R.styleable.Slider_trackColor : C5582R.styleable.Slider_trackColorActive;
        this.f19734u0 = C6952c.m33332a(context, c, i2);
        this.f19733t0 = C6952c.m33332a(context, c, i3);
        this.f19735v0.mo27790a(C6952c.m33332a(context, c, C5582R.styleable.Slider_thumbColor));
        this.f19730q0 = C6952c.m33332a(context, c, C5582R.styleable.Slider_haloColor);
        boolean hasValue2 = c.hasValue(C5582R.styleable.Slider_tickColor);
        int i4 = hasValue2 ? C5582R.styleable.Slider_tickColor : C5582R.styleable.Slider_tickColorInactive;
        int i5 = hasValue2 ? C5582R.styleable.Slider_tickColor : C5582R.styleable.Slider_tickColorActive;
        this.f19732s0 = C6952c.m33332a(context, c, i4);
        this.f19731r0 = C6952c.m33332a(context, c, i5);
        this.f19706R = m33719a(context, c);
        setThumbRadius(c.getDimensionPixelSize(C5582R.styleable.Slider_thumbRadius, 0));
        setHaloRadius(c.getDimensionPixelSize(C5582R.styleable.Slider_haloRadius, 0));
        setThumbElevation(c.getDimension(C5582R.styleable.Slider_thumbElevation, 0.0f));
        this.f19710V = c.getDimensionPixelSize(C5582R.styleable.Slider_trackHeight, 0);
        this.f19709U = c.getBoolean(C5582R.styleable.Slider_floatingLabel, true);
        c.recycle();
        m33738m();
        m33739n();
        m33737l();
    }

    @C0193h0
    /* renamed from: a */
    private C7006a m33719a(@C0193h0 Context context, @C0193h0 TypedArray typedArray) {
        return C7006a.m33694a(context, null, 0, typedArray.getResourceId(C5582R.styleable.Slider_labelStyle, C5582R.style.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: a */
    private boolean m33725a(float f) {
        float f2 = this.f19722i0;
        if (f < f2 || f > this.f19723j0) {
            return false;
        }
        float f3 = this.f19725l0;
        if (f3 <= 0.0f || ((double) (((f2 - f) / f3) % 1.0f)) <= f19696D0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo27948a() {
        return this.f19720g0 != null;
    }

    /* renamed from: a */
    private void m33720a(int i) {
        this.f19728o0 = i - (this.f19711W * 2);
        float f = this.f19725l0;
        if (f > 0.0f) {
            int i2 = (int) (((this.f19723j0 - this.f19722i0) / f) + 1.0f);
            float[] fArr = this.f19726m0;
            if (fArr == null || fArr.length != i2 * 2) {
                this.f19726m0 = new float[(i2 * 2)];
            }
            setTicksCoordinates(this.f19726m0);
            int min = Math.min(i2, (this.f19728o0 / (this.f19710V * 2)) + 1);
            float[] fArr2 = this.f19727n0;
            if (fArr2 == null || fArr2.length != min * 2) {
                this.f19727n0 = new float[(min * 2)];
            }
            setTicksCoordinates(this.f19727n0);
        }
    }

    /* renamed from: a */
    private void m33724a(@C0193h0 Canvas canvas, int i, int i2) {
        int i3 = this.f19711W;
        float f = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine((float) i3, f, ((float) i3) + (this.f19724k0 * ((float) i)), f, this.f19714b);
    }

    /* renamed from: a */
    private void m33723a(@C0193h0 Canvas canvas) {
        int a = m33718a(this.f19727n0) * 2;
        canvas.drawPoints(this.f19727n0, 0, a, this.f19705Q);
        float[] fArr = this.f19727n0;
        canvas.drawPoints(fArr, a, fArr.length - a, this.f19704P);
    }

    /* renamed from: a */
    private int m33718a(float[] fArr) {
        return Math.round(this.f19724k0 * ((float) ((fArr.length / 2) - 1)));
    }

    @C0198k
    /* renamed from: a */
    private int m33717a(@C0193h0 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public void mo27947a(boolean z) {
        this.f19729p0 = z;
    }
}
