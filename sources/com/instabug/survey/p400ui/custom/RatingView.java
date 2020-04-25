package com.instabug.survey.p400ui.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import androidx.annotation.C0198k;
import androidx.annotation.C0211p;
import androidx.core.p034l.C0962e0;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.survey.C10049R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.ui.custom.RatingView */
public class RatingView extends View {

    /* renamed from: w0 */
    private static transient /* synthetic */ boolean[] f27008w0;
    @C0198k

    /* renamed from: N */
    private int f27009N;
    @C0198k

    /* renamed from: O */
    private int f27010O;
    @C0198k

    /* renamed from: P */
    private int f27011P;
    @C0198k

    /* renamed from: Q */
    private int f27012Q;
    @C0198k

    /* renamed from: R */
    private int f27013R;
    @C0198k

    /* renamed from: S */
    private int f27014S;

    /* renamed from: T */
    private float f27015T;

    /* renamed from: U */
    private float f27016U;

    /* renamed from: V */
    private C10149a f27017V;

    /* renamed from: W */
    private float f27018W;
    @C0198k

    /* renamed from: a */
    private int f27019a;

    /* renamed from: a0 */
    private float f27020a0;
    @C0198k

    /* renamed from: b */
    private int f27021b;

    /* renamed from: b0 */
    private boolean f27022b0;

    /* renamed from: c0 */
    private float f27023c0;

    /* renamed from: d0 */
    private C10150b f27024d0;

    /* renamed from: e0 */
    private OnClickListener f27025e0;

    /* renamed from: f0 */
    private boolean f27026f0;

    /* renamed from: g0 */
    private float[] f27027g0;

    /* renamed from: h0 */
    private RectF f27028h0;

    /* renamed from: i0 */
    private RectF f27029i0;

    /* renamed from: j0 */
    private Canvas f27030j0;

    /* renamed from: k0 */
    private Bitmap f27031k0;

    /* renamed from: l0 */
    private Path f27032l0;

    /* renamed from: m0 */
    private Paint f27033m0;

    /* renamed from: n0 */
    private CornerPathEffect f27034n0;

    /* renamed from: o0 */
    private Paint f27035o0;

    /* renamed from: p0 */
    private Paint f27036p0;

    /* renamed from: q0 */
    private Paint f27037q0;

    /* renamed from: r0 */
    private float f27038r0;

    /* renamed from: s0 */
    private int f27039s0 = 5;

    /* renamed from: t0 */
    private float f27040t0 = 2.14748365E9f;

    /* renamed from: u0 */
    private float f27041u0 = 2.14748365E9f;

    /* renamed from: v0 */
    private float f27042v0;

    /* renamed from: com.instabug.survey.ui.custom.RatingView$a */
    public enum C10149a {
        Left(0),
        Right(1);
        

        /* renamed from: id */
        int f27043id;

        static {
            boolean[] d;
            d[8] = true;
        }

        private C10149a(int i) {
            boolean[] d = m47189d();
            this.f27043id = i;
            d[2] = true;
        }

        /* renamed from: a */
        static C10149a m47188a(int i) {
            boolean[] d = m47189d();
            C10149a[] values = values();
            int length = values.length;
            d[3] = true;
            int i2 = 0;
            while (i2 < length) {
                C10149a aVar = values[i2];
                if (aVar.f27043id == i) {
                    d[4] = true;
                    return aVar;
                }
                i2++;
                d[5] = true;
            }
            String.format("Gravity chosen is neither 'left' nor 'right', I will set it to Left", new Object[0]);
            C10149a aVar2 = Left;
            d[6] = true;
            return aVar2;
        }
    }

    /* renamed from: com.instabug.survey.ui.custom.RatingView$b */
    public interface C10150b {
        /* renamed from: a */
        void mo36310a(RatingView ratingView, float f, boolean z);
    }

    /* renamed from: com.instabug.survey.ui.custom.RatingView$c */
    private static class C10151c extends BaseSavedState {
        public static final Creator<C10151c> CREATOR = new C10152a();

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f27044b;

        /* renamed from: a */
        private float f27045a = 0.0f;

        /* renamed from: com.instabug.survey.ui.custom.RatingView$c$a */
        static class C10152a implements Creator<C10151c> {

            /* renamed from: a */
            private static transient /* synthetic */ boolean[] f27046a;

            C10152a() {
                m47194a()[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m47194a() {
                boolean[] zArr = f27046a;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(418661743145911292L, "com/instabug/survey/ui/custom/RatingView$SavedState$1", 5);
                f27046a = a;
                return a;
            }

            /* renamed from: a */
            public C10151c mo36362a(Parcel parcel) {
                boolean[] a = m47194a();
                C10151c cVar = new C10151c(parcel);
                a[1] = true;
                return cVar;
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                boolean[] a = m47194a();
                C10151c a2 = mo36362a(parcel);
                a[4] = true;
                return a2;
            }

            public /* synthetic */ Object[] newArray(int i) {
                boolean[] a = m47194a();
                C10151c[] a2 = mo36363a(i);
                a[3] = true;
                return a2;
            }

            /* renamed from: a */
            public C10151c[] mo36363a(int i) {
                C10151c[] cVarArr = new C10151c[i];
                m47194a()[2] = true;
                return cVarArr;
            }
        }

        static {
            boolean[] a = m47193a();
            a[8] = true;
        }

        protected C10151c(Parcel parcel) {
            boolean[] a = m47193a();
            super(parcel);
            a[0] = true;
            this.f27045a = parcel.readFloat();
            a[1] = true;
        }

        /* renamed from: a */
        static /* synthetic */ float m47191a(C10151c cVar) {
            boolean[] a = m47193a();
            float f = cVar.f27045a;
            a[7] = true;
            return f;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m47193a() {
            boolean[] zArr = f27044b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7792423353444973765L, "com/instabug/survey/ui/custom/RatingView$SavedState", 9);
            f27044b = a;
            return a;
        }

        public void writeToParcel(Parcel parcel, int i) {
            boolean[] a = m47193a();
            super.writeToParcel(parcel, i);
            a[4] = true;
            parcel.writeFloat(this.f27045a);
            a[5] = true;
        }

        /* renamed from: a */
        static /* synthetic */ float m47192a(C10151c cVar, float f) {
            boolean[] a = m47193a();
            cVar.f27045a = f;
            a[6] = true;
            return f;
        }

        protected C10151c(Parcelable parcelable) {
            boolean[] a = m47193a();
            super(parcelable);
            a[3] = true;
        }
    }

    public RatingView(Context context) {
        boolean[] d = m47186d();
        super(context);
        d[0] = true;
        this.f27042v0 = (float) ((int) m47173a(4.0f, 0));
        d[1] = true;
        m47176a();
        d[2] = true;
    }

    /* renamed from: a */
    private void m47176a() {
        boolean[] d = m47186d();
        this.f27032l0 = new Path();
        d[11] = true;
        this.f27034n0 = new CornerPathEffect(this.f27020a0);
        d[12] = true;
        this.f27033m0 = new Paint(5);
        d[13] = true;
        this.f27033m0.setStyle(Style.FILL_AND_STROKE);
        d[14] = true;
        this.f27033m0.setAntiAlias(true);
        d[15] = true;
        this.f27033m0.setDither(true);
        d[16] = true;
        this.f27033m0.setStrokeJoin(Join.ROUND);
        d[17] = true;
        this.f27033m0.setStrokeCap(Cap.ROUND);
        d[18] = true;
        this.f27033m0.setColor(C0962e0.f4343t);
        d[19] = true;
        this.f27033m0.setPathEffect(this.f27034n0);
        d[20] = true;
        this.f27035o0 = new Paint(5);
        d[21] = true;
        this.f27035o0.setStyle(Style.STROKE);
        d[22] = true;
        this.f27035o0.setStrokeJoin(Join.ROUND);
        d[23] = true;
        this.f27035o0.setStrokeCap(Cap.ROUND);
        d[24] = true;
        this.f27035o0.setStrokeWidth(this.f27018W);
        d[25] = true;
        this.f27035o0.setPathEffect(this.f27034n0);
        d[26] = true;
        this.f27036p0 = new Paint(5);
        d[27] = true;
        this.f27036p0.setStyle(Style.FILL_AND_STROKE);
        d[28] = true;
        this.f27036p0.setAntiAlias(true);
        d[29] = true;
        this.f27036p0.setDither(true);
        d[30] = true;
        this.f27036p0.setStrokeJoin(Join.ROUND);
        d[31] = true;
        this.f27036p0.setStrokeCap(Cap.ROUND);
        d[32] = true;
        this.f27037q0 = new Paint(5);
        d[33] = true;
        this.f27037q0.setStyle(Style.FILL_AND_STROKE);
        d[34] = true;
        this.f27037q0.setAntiAlias(true);
        d[35] = true;
        this.f27037q0.setDither(true);
        d[36] = true;
        this.f27037q0.setStrokeJoin(Join.ROUND);
        d[37] = true;
        this.f27037q0.setStrokeCap(Cap.ROUND);
        d[38] = true;
        this.f27038r0 = TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics());
        d[39] = true;
    }

    /* renamed from: b */
    private void m47181b() {
        int i;
        float f;
        boolean[] d = m47186d();
        this.f27019a = 0;
        d[40] = true;
        this.f27021b = getResources().getColor(C10049R.C10051color.survey_rate_selected);
        d[41] = true;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            d[42] = true;
            i = getResources().getColor(C10049R.C10051color.survey_rate_unselected_light);
            d[43] = true;
        } else {
            d[44] = true;
            i = getResources().getColor(C10049R.C10051color.survey_rate_unselected_dark);
            d[45] = true;
        }
        this.f27010O = i;
        this.f27009N = 0;
        this.f27011P = this.f27019a;
        this.f27012Q = this.f27021b;
        this.f27014S = this.f27010O;
        this.f27013R = this.f27009N;
        this.f27039s0 = 5;
        d[46] = true;
        this.f27042v0 = (float) ((int) m47173a(16.0f, 0));
        d[47] = true;
        if (InstabugDeviceProperties.isTablet(getContext())) {
            f = 80.0f;
            d[48] = true;
        } else {
            f = 52.0f;
            d[49] = true;
        }
        this.f27041u0 = (float) ((int) m47173a(f, 0));
        this.f27040t0 = 2.14748365E9f;
        this.f27015T = 1.0f;
        this.f27018W = 5.0f;
        this.f27020a0 = 1.0f;
        this.f27016U = 0.0f;
        this.f27022b0 = false;
        d[50] = true;
        this.f27017V = C10149a.m47188a(C10149a.Left.f27043id);
        d[51] = true;
    }

    /* renamed from: c */
    private void m47185c(int i, int i2) {
        boolean[] d = m47186d();
        Bitmap bitmap = this.f27031k0;
        if (bitmap == null) {
            d[117] = true;
        } else {
            d[118] = true;
            bitmap.recycle();
            d[119] = true;
        }
        if (i <= 0) {
            d[120] = true;
        } else if (i2 <= 0) {
            d[121] = true;
        } else {
            d[122] = true;
            this.f27031k0 = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            d[123] = true;
            this.f27031k0.eraseColor(0);
            d[124] = true;
            this.f27030j0 = new Canvas(this.f27031k0);
            d[125] = true;
        }
        d[126] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m47186d() {
        boolean[] zArr = f27008w0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6971285747022057390L, "com/instabug/survey/ui/custom/RatingView", 246);
        f27008w0 = a;
        return a;
    }

    @C0198k
    public int getFillColor() {
        boolean[] d = m47186d();
        int i = this.f27021b;
        d[227] = true;
        return i;
    }

    public C10149a getGravity() {
        boolean[] d = m47186d();
        C10149a aVar = this.f27017V;
        d[230] = true;
        return aVar;
    }

    public float getRating() {
        boolean[] d = m47186d();
        float f = this.f27016U;
        d[220] = true;
        return f;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] d = m47186d();
        super.onDraw(canvas);
        d[127] = true;
        int height = getHeight();
        d[128] = true;
        if (getWidth() == 0) {
            d[129] = true;
        } else if (height == 0) {
            d[130] = true;
        } else {
            this.f27030j0.drawColor(0, Mode.CLEAR);
            d[132] = true;
            m47184c();
            if (this.f27017V == C10149a.Left) {
                d[133] = true;
                m47178a(this.f27030j0);
                d[134] = true;
            } else {
                m47183b(this.f27030j0);
                d[135] = true;
            }
            if (this.f27026f0) {
                d[136] = true;
                canvas.drawColor(this.f27013R);
                d[137] = true;
            } else {
                canvas.drawColor(this.f27009N);
                d[138] = true;
            }
            canvas.drawBitmap(this.f27031k0, 0.0f, 0.0f, null);
            d[139] = true;
            return;
        }
        d[131] = true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean[] d = m47186d();
        super.onLayout(z, i, i2, i3, i4);
        d[84] = true;
        int width = getWidth();
        d[85] = true;
        int height = getHeight();
        float f = this.f27040t0;
        if (f == 2.14748365E9f) {
            d[86] = true;
            this.f27023c0 = m47174a(width, height);
            d[87] = true;
        } else {
            this.f27023c0 = f;
            d[88] = true;
        }
        m47182b(width, height);
        d[89] = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] d = m47186d();
        int mode = MeasureSpec.getMode(i);
        d[52] = true;
        int size = MeasureSpec.getSize(i);
        d[53] = true;
        int mode2 = MeasureSpec.getMode(i2);
        d[54] = true;
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            d[55] = true;
        } else if (mode == Integer.MIN_VALUE) {
            float f = this.f27040t0;
            if (f != 2.14748365E9f) {
                d[56] = true;
                int a = m47175a(f, this.f27039s0, this.f27042v0, true);
                d[57] = true;
                size = Math.min(a, size);
                d[58] = true;
            } else {
                float f2 = this.f27041u0;
                if (f2 != 2.14748365E9f) {
                    d[59] = true;
                    int a2 = m47175a(f2, this.f27039s0, this.f27042v0, true);
                    d[60] = true;
                    size = Math.min(a2, size);
                    d[61] = true;
                } else {
                    int a3 = m47175a(this.f27038r0, this.f27039s0, this.f27042v0, true);
                    d[62] = true;
                    size = Math.min(a3, size);
                    d[63] = true;
                }
            }
        } else {
            float f3 = this.f27040t0;
            if (f3 != 2.14748365E9f) {
                d[64] = true;
                size = m47175a(f3, this.f27039s0, this.f27042v0, true);
                d[65] = true;
            } else {
                float f4 = this.f27041u0;
                if (f4 != 2.14748365E9f) {
                    d[66] = true;
                    size = m47175a(f4, this.f27039s0, this.f27042v0, true);
                    d[67] = true;
                } else {
                    size = m47175a(this.f27038r0, this.f27039s0, this.f27042v0, true);
                    d[68] = true;
                }
            }
        }
        float paddingLeft = (float) ((size - getPaddingLeft()) - getPaddingRight());
        float f5 = this.f27042v0;
        int i3 = this.f27039s0;
        float f6 = (paddingLeft - (((float) (i3 - 1)) * f5)) / ((float) i3);
        if (mode2 == 1073741824) {
            d[69] = true;
        } else if (mode2 == Integer.MIN_VALUE) {
            float f7 = this.f27040t0;
            if (f7 != 2.14748365E9f) {
                d[70] = true;
                int b = m47180b(f7, i3, f5, true);
                d[71] = true;
                size2 = Math.min(b, size2);
                d[72] = true;
            } else {
                float f8 = this.f27041u0;
                if (f8 != 2.14748365E9f) {
                    d[73] = true;
                    int b2 = m47180b(f8, i3, f5, true);
                    d[74] = true;
                    size2 = Math.min(b2, size2);
                    d[75] = true;
                } else {
                    int b3 = m47180b(f6, i3, f5, true);
                    d[76] = true;
                    size2 = Math.min(b3, size2);
                    d[77] = true;
                }
            }
        } else {
            float f9 = this.f27040t0;
            if (f9 != 2.14748365E9f) {
                d[78] = true;
                size2 = m47180b(f9, i3, f5, true);
                d[79] = true;
            } else {
                float f10 = this.f27041u0;
                if (f10 != 2.14748365E9f) {
                    d[80] = true;
                    size2 = m47180b(f10, i3, f5, true);
                    d[81] = true;
                } else {
                    size2 = m47180b(f6, i3, f5, true);
                    d[82] = true;
                }
            }
        }
        setMeasuredDimension(size, size2);
        d[83] = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean[] d = m47186d();
        C10151c cVar = (C10151c) parcelable;
        d[217] = true;
        super.onRestoreInstanceState(cVar.getSuperState());
        d[218] = true;
        mo36346a(C10151c.m47191a(cVar), false);
        d[219] = true;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        boolean[] d = m47186d();
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        d[214] = true;
        C10151c cVar = new C10151c(onSaveInstanceState);
        d[215] = true;
        C10151c.m47192a(cVar, getRating());
        d[216] = true;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] d = m47186d();
        super.onSizeChanged(i, i2, i3, i4);
        d[115] = true;
        m47185c(i, i2);
        d[116] = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] d = m47186d();
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                m47177a(motionEvent.getX(), motionEvent.getY());
                OnClickListener onClickListener = this.f27025e0;
                if (onClickListener == null) {
                    d[191] = true;
                } else {
                    d[192] = true;
                    onClickListener.onClick(this);
                    d[193] = true;
                }
                C10150b bVar = this.f27024d0;
                if (bVar == null) {
                    d[194] = true;
                } else {
                    d[195] = true;
                    bVar.mo36310a(this, this.f27016U, true);
                    d[196] = true;
                }
                this.f27026f0 = false;
                d[197] = true;
            } else if (action != 2) {
                if (action != 3) {
                    d[183] = true;
                } else {
                    C10150b bVar2 = this.f27024d0;
                    if (bVar2 == null) {
                        d[198] = true;
                    } else {
                        d[199] = true;
                        bVar2.mo36310a(this, this.f27016U, true);
                        d[200] = true;
                    }
                    this.f27026f0 = false;
                    d[201] = true;
                }
            }
            invalidate();
            d[202] = true;
            return true;
        }
        if (this.f27029i0.contains(motionEvent.getX(), motionEvent.getY())) {
            this.f27026f0 = true;
            d[184] = true;
            m47177a(motionEvent.getX(), motionEvent.getY());
            d[185] = true;
            invalidate();
            d[202] = true;
            return true;
        }
        if (!this.f27026f0) {
            d[186] = true;
        } else {
            C10150b bVar3 = this.f27024d0;
            if (bVar3 == null) {
                d[187] = true;
            } else {
                d[188] = true;
                bVar3.mo36310a(this, this.f27016U, true);
                d[189] = true;
            }
        }
        this.f27026f0 = false;
        d[190] = true;
        return false;
    }

    public void setFillColor(@C0198k int i) {
        boolean[] d = m47186d();
        this.f27021b = i;
        d[228] = true;
        invalidate();
        d[229] = true;
    }

    public void setGravity(C10149a aVar) {
        boolean[] d = m47186d();
        this.f27017V = aVar;
        d[231] = true;
        invalidate();
        d[232] = true;
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        boolean[] d = m47186d();
        this.f27025e0 = onClickListener;
        d[244] = true;
    }

    public void setOnRatingBarChangeListener(C10150b bVar) {
        boolean[] d = m47186d();
        this.f27024d0 = bVar;
        d[245] = true;
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        boolean[] d = m47186d();
        super(context, attributeSet);
        d[3] = true;
        this.f27042v0 = (float) ((int) m47173a(4.0f, 0));
        d[4] = true;
        m47181b();
        d[5] = true;
        m47176a();
        d[6] = true;
    }

    /* renamed from: c */
    private void m47184c() {
        boolean[] d = m47186d();
        if (this.f27026f0) {
            d[140] = true;
            this.f27035o0.setColor(this.f27011P);
            d[141] = true;
            this.f27037q0.setColor(this.f27012Q);
            if (this.f27012Q != 0) {
                d[142] = true;
                this.f27037q0.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
                d[143] = true;
            } else {
                this.f27037q0.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
                d[144] = true;
            }
            this.f27036p0.setColor(this.f27014S);
            if (this.f27014S != 0) {
                d[145] = true;
                this.f27036p0.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
                d[146] = true;
            } else {
                this.f27036p0.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
                d[147] = true;
            }
        } else {
            this.f27035o0.setColor(this.f27019a);
            d[148] = true;
            this.f27037q0.setColor(this.f27021b);
            if (this.f27021b != 0) {
                d[149] = true;
                this.f27037q0.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
                d[150] = true;
            } else {
                this.f27037q0.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
                d[151] = true;
            }
            this.f27036p0.setColor(this.f27010O);
            if (this.f27010O != 0) {
                d[152] = true;
                this.f27036p0.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
                d[153] = true;
            } else {
                this.f27036p0.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
                d[154] = true;
            }
        }
        d[155] = true;
    }

    public RatingView(Context context, AttributeSet attributeSet, int i) {
        boolean[] d = m47186d();
        super(context, attributeSet, i);
        d[7] = true;
        this.f27042v0 = (float) ((int) m47173a(4.0f, 0));
        d[8] = true;
        m47181b();
        d[9] = true;
        m47176a();
        d[10] = true;
    }

    /* renamed from: b */
    private void m47182b(int i, int i2) {
        boolean[] d = m47186d();
        float a = (float) m47175a(this.f27023c0, this.f27039s0, this.f27042v0, false);
        d[101] = true;
        float b = (float) m47180b(this.f27023c0, this.f27039s0, this.f27042v0, false);
        d[102] = true;
        float paddingLeft = ((((float) ((i - getPaddingLeft()) - getPaddingRight())) / 2.0f) - (a / 2.0f)) + ((float) getPaddingLeft());
        d[103] = true;
        float paddingTop = ((((float) ((i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f) - (b / 2.0f)) + ((float) getPaddingTop());
        d[104] = true;
        this.f27028h0 = new RectF(paddingLeft, paddingTop, a + paddingLeft, b + paddingTop);
        d[105] = true;
        float width = this.f27028h0.width() * 0.05f;
        d[106] = true;
        RectF rectF = this.f27028h0;
        this.f27029i0 = new RectF(rectF.left - width, rectF.top, rectF.right + width, rectF.bottom);
        float f = this.f27023c0;
        float f2 = 0.2f * f;
        float f3 = 0.35f * f;
        float f4 = 0.5f * f;
        float f5 = 0.05f * f;
        float f6 = 0.03f * f;
        float f7 = 0.38f * f;
        float f8 = 0.32f * f;
        float f9 = 0.6f * f;
        this.f27027g0 = new float[]{f6, f7, f6 + f3, f7, f4, f5, (f - f6) - f3, f7, f - f6, f7, f - f8, f9, f - f2, f - f5, f4, f - (0.27f * f), f2, f - f5, f8, f9};
        d[107] = true;
    }

    /* renamed from: a */
    private float m47174a(int i, int i2) {
        boolean[] d = m47186d();
        float f = this.f27041u0;
        if (f != 2.14748365E9f) {
            d[90] = true;
            float a = (float) m47175a(f, this.f27039s0, this.f27042v0, true);
            d[91] = true;
            float b = (float) m47180b(this.f27041u0, this.f27039s0, this.f27042v0, true);
            if (a >= ((float) i)) {
                d[92] = true;
            } else if (b >= ((float) i2)) {
                d[93] = true;
            } else {
                float f2 = this.f27041u0;
                d[97] = true;
                return f2;
            }
            float paddingLeft = (float) ((i - getPaddingLeft()) - getPaddingRight());
            float f3 = this.f27042v0;
            int i3 = this.f27039s0;
            float f4 = (paddingLeft - (f3 * ((float) (i3 - 1)))) / ((float) i3);
            d[94] = true;
            float paddingTop = (float) ((i2 - getPaddingTop()) - getPaddingBottom());
            d[95] = true;
            float min = Math.min(f4, paddingTop);
            d[96] = true;
            return min;
        }
        float paddingLeft2 = (float) ((i - getPaddingLeft()) - getPaddingRight());
        float f5 = this.f27042v0;
        int i4 = this.f27039s0;
        float f6 = (paddingLeft2 - (f5 * ((float) (i4 - 1)))) / ((float) i4);
        d[98] = true;
        float paddingTop2 = (float) ((i2 - getPaddingTop()) - getPaddingBottom());
        d[99] = true;
        float min2 = Math.min(f6, paddingTop2);
        d[100] = true;
        return min2;
    }

    /* renamed from: b */
    private int m47180b(float f, int i, float f2, boolean z) {
        int i2;
        boolean[] d = m47186d();
        int round = Math.round(f);
        if (z) {
            i2 = getPaddingTop() + getPaddingBottom();
            d[112] = true;
        } else {
            i2 = 0;
            d[113] = true;
        }
        int i3 = round + i2;
        d[114] = true;
        return i3;
    }

    /* renamed from: b */
    private void m47183b(Canvas canvas) {
        boolean[] d = m47186d();
        float f = this.f27016U;
        RectF rectF = this.f27028h0;
        float f2 = rectF.right - this.f27023c0;
        float f3 = rectF.top;
        d[162] = true;
        float f4 = f2;
        float f5 = f;
        int i = 0;
        while (i < this.f27039s0) {
            if (f5 >= 1.0f) {
                d[163] = true;
                m47179a(canvas, f4, f3, 1.0f, C10149a.Right);
                f5 -= 1.0f;
                d[164] = true;
            } else {
                m47179a(canvas, f4, f3, f5, C10149a.Right);
                f5 = 0.0f;
                d[165] = true;
            }
            f4 -= this.f27042v0 + this.f27023c0;
            i++;
            d[166] = true;
        }
        d[167] = true;
    }

    /* renamed from: a */
    private int m47175a(float f, int i, float f2, boolean z) {
        int i2;
        boolean[] d = m47186d();
        int round = Math.round((f * ((float) i)) + (f2 * ((float) (i - 1))));
        if (z) {
            d[108] = true;
            i2 = getPaddingLeft() + getPaddingRight();
            d[109] = true;
        } else {
            i2 = 0;
            d[110] = true;
        }
        int i3 = round + i2;
        d[111] = true;
        return i3;
    }

    /* renamed from: a */
    private void m47178a(Canvas canvas) {
        boolean[] d = m47186d();
        float f = this.f27016U;
        RectF rectF = this.f27028h0;
        float f2 = rectF.left;
        float f3 = rectF.top;
        d[156] = true;
        float f4 = f2;
        float f5 = f;
        int i = 0;
        while (i < this.f27039s0) {
            if (f5 >= 1.0f) {
                d[157] = true;
                m47179a(canvas, f4, f3, 1.0f, C10149a.Left);
                f5 -= 1.0f;
                d[158] = true;
            } else {
                m47179a(canvas, f4, f3, f5, C10149a.Left);
                f5 = 0.0f;
                d[159] = true;
            }
            f4 += this.f27042v0 + this.f27023c0;
            i++;
            d[160] = true;
        }
        d[161] = true;
    }

    /* renamed from: a */
    private void m47179a(Canvas canvas, float f, float f2, float f3, C10149a aVar) {
        Canvas canvas2 = canvas;
        boolean[] d = m47186d();
        float f4 = this.f27023c0 * f3;
        d[168] = true;
        this.f27032l0.reset();
        d[169] = true;
        Path path = this.f27032l0;
        float[] fArr = this.f27027g0;
        path.moveTo(fArr[0] + f, fArr[1] + f2);
        d[170] = true;
        int i = 2;
        while (true) {
            float[] fArr2 = this.f27027g0;
            if (i >= fArr2.length) {
                break;
            }
            d[171] = true;
            this.f27032l0.lineTo(fArr2[i] + f, fArr2[i + 1] + f2);
            i += 2;
            d[172] = true;
        }
        this.f27032l0.close();
        d[173] = true;
        canvas.drawPath(this.f27032l0, this.f27033m0);
        if (aVar == C10149a.Left) {
            d[174] = true;
            float f5 = f4 + f;
            float f6 = this.f27023c0;
            float f7 = f2;
            canvas.drawRect(f, f7, f5 + (0.02f * f6), f2 + f6, this.f27037q0);
            d[175] = true;
            float f8 = this.f27023c0;
            canvas.drawRect(f5, f7, f + f8, f2 + f8, this.f27036p0);
            d[176] = true;
        } else {
            float f9 = this.f27023c0;
            float f10 = f2;
            canvas.drawRect((f + f9) - ((0.02f * f9) + f4), f10, f + f9, f2 + f9, this.f27037q0);
            d[177] = true;
            float f11 = this.f27023c0;
            canvas.drawRect(f, f10, (f + f11) - f4, f2 + f11, this.f27036p0);
            d[178] = true;
        }
        if (!this.f27022b0) {
            d[179] = true;
        } else {
            d[180] = true;
            canvas.drawPath(this.f27032l0, this.f27035o0);
            d[181] = true;
        }
        d[182] = true;
    }

    /* renamed from: a */
    private void m47177a(float f, float f2) {
        boolean[] d = m47186d();
        if (this.f27017V == C10149a.Left) {
            d[203] = true;
        } else {
            d[204] = true;
            f = ((float) getWidth()) - f;
            d[205] = true;
        }
        RectF rectF = this.f27028h0;
        float f3 = rectF.left;
        if (f < f3) {
            this.f27016U = 0.0f;
            d[206] = true;
        } else if (f > rectF.right) {
            this.f27016U = (float) this.f27039s0;
            d[207] = true;
        } else {
            float f4 = f - f3;
            d[208] = true;
            this.f27016U = (((float) this.f27039s0) / rectF.width()) * f4;
            float f5 = this.f27016U;
            float f6 = this.f27015T;
            float f7 = f5 % f6;
            if (f7 < f6 / 4.0f) {
                this.f27016U = f5 - f7;
                d[209] = true;
                this.f27016U = Math.max(0.0f, this.f27016U);
                d[210] = true;
            } else {
                this.f27016U = (f5 - f7) + f6;
                d[211] = true;
                this.f27016U = Math.min((float) this.f27039s0, this.f27016U);
                d[212] = true;
            }
            d[213] = true;
        }
    }

    /* renamed from: a */
    public void mo36346a(float f, boolean z) {
        boolean[] d = m47186d();
        this.f27016U = m47172a(f);
        d[221] = true;
        invalidate();
        if (!z) {
            d[222] = true;
        } else {
            C10150b bVar = this.f27024d0;
            if (bVar == null) {
                d[223] = true;
            } else {
                d[224] = true;
                bVar.mo36310a(this, f, false);
                d[225] = true;
            }
        }
        d[226] = true;
    }

    /* renamed from: a */
    private float m47173a(float f, @C0211p int i) {
        boolean[] d = m47186d();
        if (i == 0) {
            float applyDimension = TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
            d[233] = true;
            return applyDimension;
        } else if (i != 2) {
            d[235] = true;
            return f;
        } else {
            float applyDimension2 = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
            d[234] = true;
            return applyDimension2;
        }
    }

    /* renamed from: a */
    private float m47172a(float f) {
        boolean[] d = m47186d();
        if (f < 0.0f) {
            d[239] = true;
            String.format("Assigned rating is less than 0 (%f < 0), I will set it to exactly 0", new Object[]{Float.valueOf(f)});
            d[240] = true;
            return 0.0f;
        } else if (f > ((float) this.f27039s0)) {
            d[241] = true;
            String.format("Assigned rating is greater than numberOfStars (%f > %d), I will set it to exactly numberOfStars", new Object[]{Float.valueOf(f), Integer.valueOf(this.f27039s0)});
            float f2 = (float) this.f27039s0;
            d[242] = true;
            return f2;
        } else {
            d[243] = true;
            return f;
        }
    }
}
