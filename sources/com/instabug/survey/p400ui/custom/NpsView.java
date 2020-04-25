package com.instabug.survey.p400ui.custom;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0237z;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.survey.C10049R;
import java.util.ArrayList;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.survey.ui.custom.NpsView */
public class NpsView extends View {

    /* renamed from: s0 */
    private static transient /* synthetic */ boolean[] f26977s0;

    /* renamed from: N */
    private int f26978N = 11;

    /* renamed from: O */
    private int f26979O = -1;

    /* renamed from: P */
    private boolean f26980P = false;

    /* renamed from: Q */
    private C10148a f26981Q;

    /* renamed from: R */
    private ArrayList<Rect> f26982R;
    @C0198k

    /* renamed from: S */
    private int f26983S;
    @C0198k

    /* renamed from: T */
    private int f26984T;
    @C0198k

    /* renamed from: U */
    private int f26985U;
    @C0198k

    /* renamed from: V */
    private int f26986V;
    @C0198k

    /* renamed from: W */
    private int f26987W;

    /* renamed from: a */
    private int f26988a;
    @C0198k

    /* renamed from: a0 */
    private int f26989a0;

    /* renamed from: b */
    private int f26990b;
    @C0198k

    /* renamed from: b0 */
    private int f26991b0;
    @C0198k

    /* renamed from: c0 */
    private int f26992c0;
    @C0198k

    /* renamed from: d0 */
    private int f26993d0;
    @C0198k

    /* renamed from: e0 */
    private int f26994e0;

    /* renamed from: f0 */
    private Paint f26995f0;

    /* renamed from: g0 */
    private Paint f26996g0;

    /* renamed from: h0 */
    private Paint f26997h0;

    /* renamed from: i0 */
    private Paint f26998i0;

    /* renamed from: j0 */
    private Paint f26999j0;

    /* renamed from: k0 */
    private Path f27000k0;

    /* renamed from: l0 */
    private Path f27001l0;

    /* renamed from: m0 */
    private Path f27002m0;

    /* renamed from: n0 */
    private CornerPathEffect f27003n0;

    /* renamed from: o0 */
    private CornerPathEffect f27004o0;

    /* renamed from: p0 */
    private float f27005p0;

    /* renamed from: q0 */
    private float f27006q0;

    /* renamed from: r0 */
    private float f27007r0;

    /* renamed from: com.instabug.survey.ui.custom.NpsView$a */
    public interface C10148a {
        /* renamed from: b */
        void mo36308b(int i);
    }

    public NpsView(Context context) {
        boolean[] d = m47169d();
        super(context);
        d[0] = true;
        this.f26982R = new ArrayList<>();
        d[1] = true;
    }

    /* renamed from: a */
    private void m47162a(@C0195i0 AttributeSet attributeSet) {
        boolean[] d = m47169d();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10049R.styleable.NpsView);
        d[23] = true;
        this.f26978N = obtainStyledAttributes.getInt(C10049R.styleable.NpsView_nps_count, 11);
        int i = C10049R.styleable.NpsView_nps_num_text_size;
        d[24] = true;
        int b = (int) m47163b(getContext(), 40.0f);
        d[25] = true;
        this.f27005p0 = (float) obtainStyledAttributes.getDimensionPixelSize(i, b);
        int i2 = C10049R.styleable.NpsView_nps_selected_view_edge_size;
        d[26] = true;
        int b2 = (int) m47163b(getContext(), 30.0f);
        d[27] = true;
        this.f26991b0 = obtainStyledAttributes.getDimensionPixelSize(i2, b2);
        int i3 = C10049R.styleable.NpsView_nps_selected_num_text_size;
        d[28] = true;
        int b3 = (int) m47163b(getContext(), 20.0f);
        d[29] = true;
        this.f27006q0 = (float) obtainStyledAttributes.getDimensionPixelSize(i3, b3);
        int i4 = C10049R.styleable.NpsView_nps_selected_rect_size;
        d[30] = true;
        int b4 = (int) m47163b(getContext(), 100.0f);
        d[31] = true;
        this.f26994e0 = obtainStyledAttributes.getDimensionPixelSize(i4, b4);
        d[32] = true;
        this.f27007r0 = (float) obtainStyledAttributes.getDimensionPixelSize(C10049R.styleable.NpsView_nps_rect_corners_radius, 2);
        if (this.f26978N != 0) {
            d[33] = true;
        } else {
            this.f26978N = 1;
            d[34] = true;
        }
        d[35] = true;
        Context context = getContext();
        int i5 = C10049R.attr.survey_nps_circles_container_background;
        d[36] = true;
        setCirclesRectColor(AttrResolver.resolveAttributeColor(context, i5));
        d[37] = true;
        Context context2 = getContext();
        int i6 = C10049R.attr.survey_nps_circles_container_border_background;
        d[38] = true;
        setBorderColor(AttrResolver.resolveAttributeColor(context2, i6));
        d[39] = true;
        Context context3 = getContext();
        int i7 = C10049R.attr.survey_nps_numbers_color;
        d[40] = true;
        setNumbersColor(AttrResolver.resolveAttributeColor(context3, i7));
        d[41] = true;
        if (isInEditMode()) {
            d[42] = true;
        } else {
            d[43] = true;
            setIndicatorViewBackgroundColor(Instabug.getPrimaryColor());
            d[44] = true;
        }
        setIndicatorViewTextColor(-1);
        d[45] = true;
        setIndicatorViewCircleColor(-1);
        d[46] = true;
        obtainStyledAttributes.recycle();
        d[47] = true;
        this.f27001l0 = new Path();
        d[48] = true;
        this.f27002m0 = new Path();
        d[49] = true;
        this.f27000k0 = new Path();
        d[50] = true;
        this.f26996g0 = new Paint(1);
        d[51] = true;
        this.f26995f0 = new TextPaint(1);
        d[52] = true;
        this.f26997h0 = new Paint(1);
        d[53] = true;
        this.f26998i0 = new Paint(1);
        d[54] = true;
        this.f26999j0 = new TextPaint(1);
        d[55] = true;
        this.f27003n0 = new CornerPathEffect(m47158a(getContext(), 4.0f));
        d[56] = true;
        this.f27004o0 = new CornerPathEffect(this.f27007r0);
        d[57] = true;
    }

    /* renamed from: b */
    public static float m47163b(Context context, float f) {
        float f2 = f / context.getResources().getDisplayMetrics().density;
        m47169d()[88] = true;
        return f2;
    }

    /* renamed from: c */
    private void m47167c(Canvas canvas) {
        boolean[] d = m47169d();
        int width = (getWidth() - (this.f26991b0 * 2)) / this.f26978N;
        d[108] = true;
        double d2 = (double) this.f26993d0;
        Double.isNaN(d2);
        int round = (int) (((float) Math.round(d2 / 1.3d)) + m47158a(getContext(), 8.0f));
        d[109] = true;
        this.f26995f0.setColor(getNumbersColor());
        d[110] = true;
        this.f26995f0.setTextSize(this.f27005p0);
        d[111] = true;
        this.f26995f0.setStyle(Style.FILL);
        d[112] = true;
        this.f26995f0.setFakeBoldText(true);
        d[113] = true;
        this.f26995f0.setTypeface(Typeface.defaultFromStyle(0));
        int i = (width / 2) + this.f26991b0;
        d[114] = true;
        float measureText = this.f26995f0.measureText("9", 0, 1) / 2.0f;
        int i2 = (int) (((float) i) - measureText);
        d[115] = true;
        int i3 = i2;
        int i4 = 0;
        while (i4 < this.f26978N) {
            if (i4 != 10) {
                d[116] = true;
            } else {
                int i5 = (int) (((float) i3) + measureText);
                d[117] = true;
                i3 = (int) (((float) i5) - (this.f26995f0.measureText("10", 0, 2) / 2.0f));
                d[118] = true;
            }
            canvas.drawText(String.valueOf(i4), (float) i3, (float) round, this.f26995f0);
            i3 += width;
            i4++;
            d[119] = true;
        }
        d[120] = true;
    }

    /* renamed from: d */
    private void m47168d(Canvas canvas) {
        boolean[] d = m47169d();
        if (this.f26979O == -1) {
            d[121] = true;
        } else {
            d[122] = true;
            this.f27001l0.reset();
            d[123] = true;
            this.f26997h0.setColor(getIndicatorViewBackgroundColor());
            d[124] = true;
            this.f26997h0.setPathEffect(this.f27003n0);
            d[125] = true;
            float f = (float) ((Rect) this.f26982R.get(this.f26979O)).left;
            d[126] = true;
            float f2 = (float) ((Rect) this.f26982R.get(this.f26979O)).right;
            d[127] = true;
            float f3 = (float) ((Rect) this.f26982R.get(this.f26979O)).top;
            int i = this.f26992c0;
            int i2 = this.f26994e0;
            if (i <= i2) {
                d[128] = true;
            } else {
                float f4 = ((float) (i - i2)) / 2.0f;
                f += f4;
                f2 -= f4;
                d[129] = true;
            }
            int i3 = this.f26991b0;
            float f5 = f - ((float) i3);
            float f6 = ((float) i3) + f2;
            d[130] = true;
            this.f27001l0.moveTo(f5, f3);
            d[131] = true;
            this.f27001l0.lineTo(f5, ((float) this.f26993d0) / 1.7f);
            d[132] = true;
            this.f27001l0.lineTo(f, (((float) this.f26993d0) / 1.7f) + ((float) this.f26991b0));
            d[133] = true;
            this.f27001l0.lineTo(f, (float) this.f26993d0);
            d[134] = true;
            this.f27001l0.lineTo(f2, (float) this.f26993d0);
            d[135] = true;
            this.f27001l0.lineTo(f2, (((float) this.f26993d0) / 1.7f) + ((float) this.f26991b0));
            d[136] = true;
            this.f27001l0.lineTo(f6, ((float) this.f26993d0) / 1.7f);
            d[137] = true;
            this.f27001l0.lineTo(f6, 0.0f);
            d[138] = true;
            this.f27001l0.close();
            d[139] = true;
            canvas.drawPath(this.f27001l0, this.f26997h0);
            d[140] = true;
            this.f26999j0.setColor(getIndicatorViewTextColor());
            d[141] = true;
            this.f26999j0.setTextAlign(Align.CENTER);
            d[142] = true;
            this.f26999j0.setTextSize(this.f27006q0);
            d[143] = true;
            this.f26999j0.setTypeface(Typeface.defaultFromStyle(1));
            d[144] = true;
            canvas.drawText(String.valueOf(this.f26979O), f + ((f2 - f) / 2.0f), (((float) this.f26993d0) / 1.7f) / 1.5f, this.f26999j0);
            d[145] = true;
        }
        d[146] = true;
    }

    /* renamed from: d */
    private static /* synthetic */ boolean[] m47169d() {
        boolean[] zArr = f26977s0;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1824501054808979446L, "com/instabug/survey/ui/custom/NpsView", C13959t.f40908h3);
        f26977s0 = a;
        return a;
    }

    /* renamed from: e */
    private void m47170e(Canvas canvas) {
        boolean[] d = m47169d();
        if (this.f26979O == -1) {
            d[147] = true;
        } else {
            d[148] = true;
            this.f27002m0.reset();
            d[149] = true;
            this.f26997h0.setColor(getIndicatorViewBackgroundColor());
            d[150] = true;
            this.f26997h0.setPathEffect(null);
            d[151] = true;
            int i = ((Rect) this.f26982R.get(this.f26979O)).left;
            d[152] = true;
            int i2 = ((Rect) this.f26982R.get(this.f26979O)).right;
            int i3 = this.f26992c0;
            int i4 = this.f26994e0;
            if (i3 <= i4) {
                d[153] = true;
            } else {
                int i5 = (i3 - i4) / 2;
                i += i5;
                i2 -= i5;
                d[154] = true;
            }
            float f = (float) i;
            this.f27002m0.moveTo(f, ((float) this.f26993d0) / 1.7f);
            d[155] = true;
            this.f27002m0.lineTo(f, (float) this.f26993d0);
            d[156] = true;
            float f2 = (float) i2;
            this.f27002m0.lineTo(f2, (float) this.f26993d0);
            d[157] = true;
            this.f27002m0.lineTo(f2, ((float) this.f26993d0) / 1.7f);
            d[158] = true;
            this.f27002m0.close();
            d[159] = true;
            canvas.drawPath(this.f27002m0, this.f26997h0);
            float f3 = ((float) this.f26993d0) / 1.3f;
            d[160] = true;
            float a = m47158a(getContext(), 4.0f);
            d[161] = true;
            if (((float) (((Rect) this.f26982R.get(this.f26979O)).right - ((Rect) this.f26982R.get(this.f26979O)).left)) <= ((float) this.f26993d0) / 1.7f) {
                d[162] = true;
            } else {
                a /= 1.5f;
                d[163] = true;
            }
            this.f26998i0.setColor(getIndicatorViewCircleColor());
            d[164] = true;
            canvas.drawCircle((float) (i + ((i2 - i) / 2)), f3 + m47158a(getContext(), 4.0f), a, this.f26998i0);
            d[165] = true;
        }
        d[166] = true;
    }

    public int getBorderColor() {
        boolean[] d = m47169d();
        int i = this.f26984T;
        d[13] = true;
        return i;
    }

    public int getCirclesRectColor() {
        boolean[] d = m47169d();
        int i = this.f26983S;
        d[11] = true;
        return i;
    }

    public int getIndicatorViewBackgroundColor() {
        boolean[] d = m47169d();
        int i = this.f26985U;
        d[15] = true;
        return i;
    }

    public int getIndicatorViewCircleColor() {
        boolean[] d = m47169d();
        int i = this.f26989a0;
        d[21] = true;
        return i;
    }

    public int getIndicatorViewTextColor() {
        boolean[] d = m47169d();
        int i = this.f26987W;
        d[19] = true;
        return i;
    }

    public int getNumbersColor() {
        boolean[] d = m47169d();
        int i = this.f26986V;
        d[17] = true;
        return i;
    }

    public int getScore() {
        boolean[] d = m47169d();
        int i = this.f26979O;
        d[195] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] d = m47169d();
        super.onDraw(canvas);
        d[79] = true;
        m47159a();
        d[80] = true;
        m47161a(canvas);
        d[81] = true;
        m47165b(canvas);
        d[82] = true;
        m47167c(canvas);
        if (this.f26980P) {
            d[83] = true;
            m47170e(canvas);
            d[84] = true;
        } else {
            m47168d(canvas);
            d[85] = true;
        }
        d[86] = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] d = m47169d();
        super.onMeasure(i, i2);
        d[64] = true;
        int mode = MeasureSpec.getMode(i);
        d[65] = true;
        int size = MeasureSpec.getSize(i);
        d[66] = true;
        int mode2 = MeasureSpec.getMode(i2);
        d[67] = true;
        int size2 = MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            this.f26988a = size;
            d[68] = true;
        } else if (mode == Integer.MIN_VALUE) {
            d[69] = true;
            this.f26988a = Math.min(500, size);
            d[70] = true;
        } else {
            this.f26988a = 500;
            d[71] = true;
        }
        if (mode2 == 1073741824) {
            this.f26990b = size2;
            d[72] = true;
        } else if (mode == Integer.MIN_VALUE) {
            d[73] = true;
            this.f26990b = Math.min(280, size2);
            d[74] = true;
        } else {
            this.f26990b = 280;
            d[75] = true;
        }
        this.f26988a = Math.abs(this.f26988a);
        d[76] = true;
        this.f26990b = Math.abs(this.f26990b);
        int i3 = this.f26990b;
        this.f26993d0 = i3 - 2;
        d[77] = true;
        setMeasuredDimension(this.f26988a, i3);
        d[78] = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] d = m47169d();
        float x = motionEvent.getX();
        d[167] = true;
        float y = motionEvent.getY();
        d[168] = true;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    m47160a(x, y);
                    d[172] = true;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            d[169] = true;
                        }
                    }
                }
                invalidate();
                d[175] = true;
                return true;
            }
            m47164b();
            d[173] = true;
            m47166c();
            d[174] = true;
            invalidate();
            d[175] = true;
            return true;
        }
        m47160a(x, y);
        d[170] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("onTouchEvent: NPS view touch rect : ");
        sb.append(this.f26979O);
        sb.toString();
        d[171] = true;
        invalidate();
        d[175] = true;
        return true;
    }

    public void setBorderColor(@C0198k int i) {
        boolean[] d = m47169d();
        this.f26984T = i;
        d[14] = true;
    }

    public void setCirclesRectColor(int i) {
        boolean[] d = m47169d();
        this.f26983S = i;
        d[12] = true;
    }

    public void setIndicatorViewBackgroundColor(@C0198k int i) {
        boolean[] d = m47169d();
        this.f26985U = i;
        d[16] = true;
    }

    public void setIndicatorViewCircleColor(int i) {
        boolean[] d = m47169d();
        this.f26989a0 = i;
        d[22] = true;
    }

    public void setIndicatorViewTextColor(int i) {
        boolean[] d = m47169d();
        this.f26987W = i;
        d[20] = true;
    }

    public void setNumbersColor(@C0198k int i) {
        boolean[] d = m47169d();
        this.f26986V = i;
        d[18] = true;
    }

    public void setOnSelectionListener(C10148a aVar) {
        boolean[] d = m47169d();
        this.f26981Q = aVar;
        d[194] = true;
    }

    public void setScore(@C0237z(from = 0, mo691to = 11) int i) {
        boolean[] d = m47169d();
        this.f26979O = i;
        this.f26980P = true;
        d[196] = true;
        postInvalidate();
        d[197] = true;
    }

    /* renamed from: b */
    private void m47165b(Canvas canvas) {
        boolean[] d = m47169d();
        this.f26996g0.setStrokeWidth(m47158a(getContext(), 2.0f));
        d[101] = true;
        this.f26996g0.setStyle(Style.STROKE);
        d[102] = true;
        this.f26996g0.setColor(getBorderColor());
        d[103] = true;
        this.f26996g0.setPathEffect(this.f27004o0);
        d[104] = true;
        float f = (float) this.f26991b0;
        double d2 = (double) this.f26993d0;
        Double.isNaN(d2);
        float floor = (float) Math.floor(d2 / 1.7d);
        d[105] = true;
        float width = (float) (getWidth() - this.f26991b0);
        float f2 = (float) this.f26993d0;
        Paint paint = this.f26996g0;
        d[106] = true;
        canvas.drawRect(f, floor, width, f2, paint);
        d[107] = true;
    }

    public NpsView(Context context, @C0195i0 AttributeSet attributeSet) {
        boolean[] d = m47169d();
        super(context, attributeSet);
        d[2] = true;
        this.f26982R = new ArrayList<>();
        d[3] = true;
        m47162a(attributeSet);
        d[4] = true;
    }

    /* renamed from: b */
    private void m47164b() {
        boolean[] d = m47169d();
        this.f26980P = true;
        d[188] = true;
        invalidate();
        d[189] = true;
    }

    public NpsView(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        boolean[] d = m47169d();
        super(context, attributeSet, i);
        d[5] = true;
        this.f26982R = new ArrayList<>();
        d[6] = true;
        m47162a(attributeSet);
        d[7] = true;
    }

    /* renamed from: c */
    private void m47166c() {
        boolean[] d = m47169d();
        C10148a aVar = this.f26981Q;
        if (aVar == null) {
            d[190] = true;
        } else {
            d[191] = true;
            aVar.mo36308b(this.f26979O);
            d[192] = true;
        }
        d[193] = true;
    }

    @TargetApi(21)
    public NpsView(Context context, @C0195i0 AttributeSet attributeSet, int i, int i2) {
        boolean[] d = m47169d();
        super(context, attributeSet, i, i2);
        d[8] = true;
        this.f26982R = new ArrayList<>();
        d[9] = true;
        m47162a(attributeSet);
        d[10] = true;
    }

    /* renamed from: a */
    private void m47159a() {
        boolean[] d = m47169d();
        this.f26982R.clear();
        d[58] = true;
        int width = getWidth();
        int i = this.f26991b0;
        this.f26992c0 = (width - (i * 2)) / this.f26978N;
        int i2 = this.f26990b;
        d[59] = true;
        int i3 = i;
        int i4 = i3;
        int i5 = 0;
        while (i5 < this.f26978N) {
            i3 += this.f26992c0;
            d[60] = true;
            Rect rect = new Rect(i4, 0, i3, i2);
            d[61] = true;
            this.f26982R.add(rect);
            i4 += this.f26992c0;
            i5++;
            d[62] = true;
        }
        d[63] = true;
    }

    /* renamed from: a */
    public static float m47158a(Context context, float f) {
        float f2 = f * context.getResources().getDisplayMetrics().density;
        m47169d()[87] = true;
        return f2;
    }

    /* renamed from: a */
    private void m47161a(Canvas canvas) {
        boolean[] d = m47169d();
        this.f27000k0.rewind();
        d[89] = true;
        Path path = this.f27000k0;
        float f = (float) this.f26991b0;
        double d2 = (double) this.f26993d0;
        Double.isNaN(d2);
        path.moveTo(f, (float) ((int) Math.floor(d2 / 1.7d)));
        d[90] = true;
        this.f27000k0.lineTo((float) this.f26991b0, (float) this.f26993d0);
        d[91] = true;
        this.f27000k0.lineTo((float) (getWidth() - this.f26991b0), (float) this.f26993d0);
        d[92] = true;
        Path path2 = this.f27000k0;
        float width = (float) (getWidth() - this.f26991b0);
        double d3 = (double) this.f26993d0;
        Double.isNaN(d3);
        double d4 = d3 / 1.7d;
        d[93] = true;
        float floor = (float) ((int) Math.floor(d4));
        d[94] = true;
        path2.lineTo(width, floor);
        d[95] = true;
        this.f27000k0.close();
        d[96] = true;
        this.f26996g0.setStyle(Style.FILL);
        d[97] = true;
        this.f26996g0.setColor(getCirclesRectColor());
        d[98] = true;
        this.f26996g0.setPathEffect(this.f27004o0);
        d[99] = true;
        canvas.drawPath(this.f27000k0, this.f26996g0);
        d[100] = true;
    }

    /* renamed from: a */
    private void m47160a(float f, float f2) {
        boolean[] d = m47169d();
        int i = 0;
        this.f26980P = false;
        d[176] = true;
        int i2 = this.f26979O;
        if (i2 == -1) {
            d[177] = true;
        } else if (!((Rect) this.f26982R.get(i2)).contains((int) f, (int) f2)) {
            d[178] = true;
        } else {
            d[179] = true;
            return;
        }
        d[180] = true;
        while (i < this.f26978N) {
            d[181] = true;
            if (((Rect) this.f26982R.get(i)).contains((int) f, (int) f2)) {
                if (this.f26979O == i) {
                    d[182] = true;
                } else {
                    this.f26979O = i;
                    d[183] = true;
                    invalidate();
                    d[184] = true;
                }
                d[185] = true;
                return;
            }
            i++;
            d[186] = true;
        }
        d[187] = true;
    }
}
