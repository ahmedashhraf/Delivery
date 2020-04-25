package com.instabug.library.annotation;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0210o0;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C1007o;
import com.instabug.library.C9700R;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class ColorPickerPopUpView extends View {

    /* renamed from: S */
    private static final int f25780S = Color.argb(255, 247, 247, 247);

    /* renamed from: T */
    private static transient /* synthetic */ boolean[] f25781T;

    /* renamed from: N */
    private int f25782N;

    /* renamed from: O */
    private C9730b f25783O;
    @C0210o0(7)

    /* renamed from: P */
    private int[] f25784P = {C0886a.f4059c, -15925503, -65028, -15893761, -33280, -1024, -4737097};

    /* renamed from: Q */
    private int f25785Q;

    /* renamed from: R */
    private List<C9729a> f25786R;

    /* renamed from: a */
    private RectF f25787a;

    /* renamed from: b */
    private C9731c f25788b;

    /* renamed from: com.instabug.library.annotation.ColorPickerPopUpView$a */
    static class C9729a {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f25789d;

        /* renamed from: a */
        RectF f25790a = new RectF();

        /* renamed from: b */
        int f25791b;

        /* renamed from: c */
        boolean f25792c;

        public C9729a(int i) {
            boolean[] b = m45367b();
            b[0] = true;
            this.f25791b = i;
            b[1] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m45367b() {
            boolean[] zArr = f25789d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-686249728319383504L, "com/instabug/library/annotation/ColorPickerPopUpView$CheckCircleColor", 5);
            f25789d = a;
            return a;
        }

        /* renamed from: a */
        public RectF mo34740a() {
            boolean[] b = m45367b();
            RectF rectF = new RectF();
            b[2] = true;
            rectF.set(this.f25790a);
            b[3] = true;
            rectF.inset((-this.f25790a.width()) / 3.0f, (-this.f25790a.height()) / 3.0f);
            b[4] = true;
            return rectF;
        }
    }

    /* renamed from: com.instabug.library.annotation.ColorPickerPopUpView$b */
    public interface C9730b {
        /* renamed from: a */
        void mo34703a(@C0198k int i, int i2);
    }

    /* renamed from: com.instabug.library.annotation.ColorPickerPopUpView$c */
    public enum C9731c {
        PORTRAIT,
        LANDSCAPE;

        static {
            boolean[] d;
            d[4] = true;
        }
    }

    static {
        boolean[] a = m45366a();
        a[161] = true;
    }

    public ColorPickerPopUpView(Context context) {
        boolean[] a = m45366a();
        super(context);
        a[0] = true;
        m45365a((AttributeSet) null, 0);
        a[1] = true;
    }

    /* renamed from: a */
    private void m45365a(AttributeSet attributeSet, int i) {
        boolean[] a = m45366a();
        a[6] = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C9700R.styleable.ColorPickerPopUpView, i, 0);
        a[7] = true;
        C9731c screenOrientation = getScreenOrientation();
        C9731c cVar = C9731c.PORTRAIT;
        if (screenOrientation == cVar) {
            a[8] = true;
        } else {
            cVar = C9731c.LANDSCAPE;
            a[9] = true;
        }
        this.f25788b = cVar;
        a[10] = true;
        obtainStyledAttributes.recycle();
        this.f25782N = f25780S;
        a[11] = true;
        this.f25786R = new ArrayList();
        int[] iArr = this.f25784P;
        int length = iArr.length;
        a[12] = true;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            a[13] = true;
            this.f25786R.add(new C9729a(i3));
            i2++;
            a[14] = true;
        }
        setSelectedColor(0);
        a[15] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45366a() {
        boolean[] zArr = f25781T;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5921301261312544925L, "com/instabug/library/annotation/ColorPickerPopUpView", C13959t.f40977y2);
        f25781T = a;
        return a;
    }

    private C9731c getScreenOrientation() {
        boolean[] a = m45366a();
        if (getResources().getConfiguration().orientation == 2) {
            C9731c cVar = C9731c.LANDSCAPE;
            a[16] = true;
            return cVar;
        }
        C9731c cVar2 = C9731c.PORTRAIT;
        a[17] = true;
        return cVar2;
    }

    private void setSelectedColor(int i) {
        boolean z;
        boolean[] a = m45366a();
        this.f25785Q = this.f25784P[i];
        a[141] = true;
        a[142] = true;
        int i2 = 0;
        while (i2 < this.f25786R.size()) {
            a[143] = true;
            C9729a aVar = (C9729a) this.f25786R.get(i2);
            if (i2 == i) {
                a[144] = true;
                z = true;
            } else {
                a[145] = true;
                z = false;
            }
            aVar.f25792c = z;
            i2++;
            a[146] = true;
        }
        invalidate();
        C9730b bVar = this.f25783O;
        if (bVar == null) {
            a[147] = true;
        } else {
            a[148] = true;
            bVar.mo34703a(this.f25785Q, i);
            a[149] = true;
        }
        a[150] = true;
    }

    public int getSelectedColor() {
        boolean[] a = m45366a();
        int i = this.f25785Q;
        a[140] = true;
        return i;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        boolean[] a = m45366a();
        super.onConfigurationChanged(configuration);
        a[35] = true;
        C9731c screenOrientation = getScreenOrientation();
        C9731c cVar = C9731c.PORTRAIT;
        if (screenOrientation == cVar) {
            a[36] = true;
        } else {
            cVar = C9731c.LANDSCAPE;
            a[37] = true;
        }
        this.f25788b = cVar;
        a[38] = true;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean[] a = m45366a();
        super.onDraw(canvas);
        a[83] = true;
        m45363a(canvas);
        a[84] = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean[] a = m45366a();
        super.onMeasure(i, i2);
        a[18] = true;
        int measuredWidth = getMeasuredWidth();
        int i3 = (measuredWidth * 55) / 426;
        a[19] = true;
        setMeasuredDimension(measuredWidth, i3);
        a[20] = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        boolean[] a = m45366a();
        if (!(parcelable instanceof Bundle)) {
            a[155] = true;
        } else {
            Bundle bundle = (Bundle) parcelable;
            a[156] = true;
            this.f25785Q = bundle.getInt("selected_color");
            a[157] = true;
            parcelable = bundle.getParcelable("instabug_color_picker");
            a[158] = true;
            setSelectedColor(m45362a(this.f25784P, this.f25785Q));
            a[159] = true;
        }
        super.onRestoreInstanceState(parcelable);
        a[160] = true;
    }

    /* access modifiers changed from: protected */
    @C0195i0
    public Parcelable onSaveInstanceState() {
        boolean[] a = m45366a();
        Bundle bundle = new Bundle();
        a[152] = true;
        bundle.putParcelable("instabug_color_picker", super.onSaveInstanceState());
        a[153] = true;
        bundle.putInt("selected_color", this.f25785Q);
        a[154] = true;
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean[] a = m45366a();
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f25788b == C9731c.LANDSCAPE) {
            float f = ((float) (i * 55)) / 406.0f;
            a[39] = true;
            if (InstabugDeviceProperties.isTablet(getContext())) {
                a[40] = true;
                this.f25787a = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 110.0f), (float) i, f);
                a[41] = true;
            } else {
                this.f25787a = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 50.0f), (float) i, f);
                a[42] = true;
            }
            a[43] = true;
        } else {
            float f2 = ((float) (i * 55)) / 420.0f;
            a[44] = true;
            if (InstabugDeviceProperties.isTablet(getContext())) {
                a[45] = true;
                this.f25787a = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 60.0f), (float) i, f2);
                a[46] = true;
            } else {
                this.f25787a = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 16.0f), (float) i, f2);
                a[47] = true;
            }
        }
        C9729a aVar = (C9729a) this.f25786R.get(0);
        RectF rectF = this.f25787a;
        float f3 = rectF.left;
        a[48] = true;
        float floor = f3 + ((float) Math.floor((double) ((rectF.width() * 0.04429f) + 0.5f)));
        RectF rectF2 = this.f25787a;
        float f4 = rectF2.top;
        a[49] = true;
        float floor2 = f4 + ((float) Math.floor((double) ((rectF2.height() * 0.2f) + 0.5f)));
        RectF rectF3 = this.f25787a;
        float f5 = rectF3.left;
        a[50] = true;
        float floor3 = f5 + ((float) Math.floor((double) ((rectF3.width() * 0.09857f) + 0.5f)));
        RectF rectF4 = this.f25787a;
        float f6 = rectF4.top;
        a[51] = true;
        aVar.f25790a = new RectF(floor, floor2, floor3, f6 + ((float) Math.floor((double) ((rectF4.height() * 0.66504f) + 0.5f))));
        a[52] = true;
        C9729a aVar2 = (C9729a) this.f25786R.get(1);
        RectF rectF5 = this.f25787a;
        float f7 = rectF5.left;
        a[53] = true;
        float floor4 = f7 + ((float) Math.floor((double) ((rectF5.width() * 0.18714f) + 0.5f)));
        RectF rectF6 = this.f25787a;
        float f8 = rectF6.top;
        a[54] = true;
        float floor5 = f8 + ((float) Math.floor((double) ((rectF6.height() * 0.2f) + 0.5f)));
        RectF rectF7 = this.f25787a;
        float f9 = rectF7.left;
        a[55] = true;
        float floor6 = f9 + ((float) Math.floor((double) ((rectF7.width() * 0.24143f) + 0.5f)));
        RectF rectF8 = this.f25787a;
        float f10 = rectF8.top;
        a[56] = true;
        aVar2.f25790a = new RectF(floor4, floor5, floor6, f10 + ((float) Math.floor((double) ((rectF8.height() * 0.66504f) + 0.5f))));
        a[57] = true;
        C9729a aVar3 = (C9729a) this.f25786R.get(2);
        RectF rectF9 = this.f25787a;
        float f11 = rectF9.left;
        a[58] = true;
        float floor7 = f11 + ((float) Math.floor((double) ((rectF9.width() * 0.33f) + 0.5f)));
        RectF rectF10 = this.f25787a;
        float f12 = rectF10.top;
        a[59] = true;
        float floor8 = f12 + ((float) Math.floor((double) ((rectF10.height() * 0.2f) + 0.5f)));
        RectF rectF11 = this.f25787a;
        float f13 = rectF11.left;
        a[60] = true;
        float floor9 = f13 + ((float) Math.floor((double) ((rectF11.width() * 0.38429f) + 0.5f)));
        RectF rectF12 = this.f25787a;
        float f14 = rectF12.top;
        a[61] = true;
        aVar3.f25790a = new RectF(floor7, floor8, floor9, f14 + ((float) Math.floor((double) ((rectF12.height() * 0.66504f) + 0.5f))));
        a[62] = true;
        C9729a aVar4 = (C9729a) this.f25786R.get(3);
        RectF rectF13 = this.f25787a;
        float f15 = rectF13.left;
        a[63] = true;
        float floor10 = f15 + ((float) Math.floor((double) ((rectF13.width() * 0.47286f) + 0.5f)));
        RectF rectF14 = this.f25787a;
        float f16 = rectF14.top;
        a[64] = true;
        float floor11 = f16 + ((float) Math.floor((double) ((rectF14.height() * 0.2f) + 0.5f)));
        RectF rectF15 = this.f25787a;
        float f17 = rectF15.left;
        a[65] = true;
        float floor12 = f17 + ((float) Math.floor((double) ((rectF15.width() * 0.52714f) + 0.5f)));
        RectF rectF16 = this.f25787a;
        float f18 = rectF16.top;
        a[66] = true;
        aVar4.f25790a = new RectF(floor10, floor11, floor12, f18 + ((float) Math.floor((double) ((rectF16.height() * 0.66504f) + 0.5f))));
        a[67] = true;
        C9729a aVar5 = (C9729a) this.f25786R.get(4);
        RectF rectF17 = this.f25787a;
        float f19 = rectF17.left;
        a[68] = true;
        float floor13 = f19 + ((float) Math.floor((double) ((rectF17.width() * 0.61571f) + 0.5f)));
        RectF rectF18 = this.f25787a;
        float f20 = rectF18.top;
        a[69] = true;
        float floor14 = f20 + ((float) Math.floor((double) ((rectF18.height() * 0.2f) + 0.5f)));
        RectF rectF19 = this.f25787a;
        float f21 = rectF19.left;
        a[70] = true;
        float floor15 = f21 + ((float) Math.floor((double) ((rectF19.width() * 0.67f) + 0.5f)));
        RectF rectF20 = this.f25787a;
        float f22 = rectF20.top;
        a[71] = true;
        aVar5.f25790a = new RectF(floor13, floor14, floor15, f22 + ((float) Math.floor((double) ((rectF20.height() * 0.66504f) + 0.5f))));
        a[72] = true;
        C9729a aVar6 = (C9729a) this.f25786R.get(5);
        RectF rectF21 = this.f25787a;
        float f23 = rectF21.left;
        a[73] = true;
        float floor16 = f23 + ((float) Math.floor((double) ((rectF21.width() * 0.75857f) + 0.5f)));
        RectF rectF22 = this.f25787a;
        float f24 = rectF22.top;
        a[74] = true;
        float floor17 = f24 + ((float) Math.floor((double) ((rectF22.height() * 0.2f) + 0.5f)));
        RectF rectF23 = this.f25787a;
        float f25 = rectF23.left;
        a[75] = true;
        float floor18 = f25 + ((float) Math.floor((double) ((rectF23.width() * 0.81286f) + 0.5f)));
        RectF rectF24 = this.f25787a;
        float f26 = rectF24.top;
        a[76] = true;
        aVar6.f25790a = new RectF(floor16, floor17, floor18, f26 + ((float) Math.floor((double) ((rectF24.height() * 0.66504f) + 0.5f))));
        a[77] = true;
        C9729a aVar7 = (C9729a) this.f25786R.get(6);
        RectF rectF25 = this.f25787a;
        float f27 = rectF25.left;
        a[78] = true;
        float floor19 = f27 + ((float) Math.floor((double) ((rectF25.width() * 0.90143f) + 0.5f)));
        RectF rectF26 = this.f25787a;
        float f28 = rectF26.top;
        a[79] = true;
        float floor20 = f28 + ((float) Math.floor((double) ((rectF26.height() * 0.2f) + 0.5f)));
        RectF rectF27 = this.f25787a;
        float f29 = rectF27.left;
        a[80] = true;
        float floor21 = f29 + ((float) Math.floor((double) ((rectF27.width() * 0.95571f) + 0.5f)));
        RectF rectF28 = this.f25787a;
        float f30 = rectF28.top;
        a[81] = true;
        aVar7.f25790a = new RectF(floor19, floor20, floor21, f30 + ((float) Math.floor((double) ((rectF28.height() * 0.66504f) + 0.5f))));
        a[82] = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean[] a = m45366a();
        int b = C1007o.m5780b(motionEvent);
        a[21] = true;
        float x = motionEvent.getX();
        a[22] = true;
        float y = motionEvent.getY();
        if (b != 1) {
            a[23] = true;
        } else {
            int i = 0;
            a[24] = true;
            while (true) {
                if (i >= this.f25786R.size()) {
                    a[25] = true;
                    break;
                }
                a[26] = true;
                if (((C9729a) this.f25786R.get(i)).mo34740a().contains(x, y)) {
                    a[27] = true;
                    setSelectedColor(i);
                    a[28] = true;
                    break;
                }
                i++;
                a[29] = true;
            }
        }
        a[30] = true;
        return true;
    }

    public void setColors(@C0210o0(7) int[] iArr) {
        boolean[] a = m45366a();
        this.f25784P = Arrays.copyOf(iArr, iArr.length);
        a[136] = true;
    }

    public void setOnColorSelectionListener(C9730b bVar) {
        boolean[] a = m45366a();
        this.f25783O = bVar;
        a[151] = true;
    }

    public void setOrientation(C9731c cVar) {
        boolean[] a = m45366a();
        this.f25788b = cVar;
        a[139] = true;
    }

    public void setPopUpBackgroundColor(int i) {
        boolean[] a = m45366a();
        this.f25782N = i;
        a[137] = true;
        invalidate();
        a[138] = true;
    }

    public ColorPickerPopUpView(Context context, AttributeSet attributeSet) {
        boolean[] a = m45366a();
        super(context, attributeSet);
        a[2] = true;
        m45365a(attributeSet, 0);
        a[3] = true;
    }

    public ColorPickerPopUpView(Context context, AttributeSet attributeSet, int i) {
        boolean[] a = m45366a();
        super(context, attributeSet, i);
        a[4] = true;
        m45365a(attributeSet, i);
        a[5] = true;
    }

    /* renamed from: a */
    private static int m45362a(int[] iArr, int i) {
        boolean[] a = m45366a();
        a[31] = true;
        int i2 = 0;
        while (i2 < iArr.length) {
            if (iArr[i2] == i) {
                a[32] = true;
                return i2;
            }
            i2++;
            a[33] = true;
        }
        a[34] = true;
        return 0;
    }

    /* renamed from: a */
    private void m45364a(Canvas canvas, C9729a aVar) {
        boolean[] a = m45366a();
        RectF rectF = aVar.f25790a;
        int i = aVar.f25791b;
        float f = rectF.left;
        float f2 = rectF.top;
        a[85] = true;
        float floor = ((float) Math.floor((double) (rectF.height() + 0.5f))) + f;
        float f3 = rectF.top;
        a[86] = true;
        RectF rectF2 = new RectF(f, f2, floor, f3 + ((float) Math.floor((double) (rectF.height() + 0.5f))));
        a[87] = true;
        Path path = new Path();
        a[88] = true;
        path.addOval(rectF2, Direction.CW);
        a[89] = true;
        Paint paint = new Paint(1);
        a[90] = true;
        paint.setStyle(Style.FILL);
        a[91] = true;
        paint.setColor(i);
        a[92] = true;
        canvas.drawPath(path, paint);
        if (!aVar.f25792c) {
            a[93] = true;
        } else {
            a[94] = true;
            Path path2 = new Path();
            a[95] = true;
            float height = rectF.left + (rectF.height() * 0.20313f);
            float f4 = rectF.top;
            a[96] = true;
            float height2 = f4 + (rectF.height() * 0.51758f);
            a[97] = true;
            path2.moveTo(height, height2);
            a[98] = true;
            float height3 = rectF.left + (rectF.height() * 0.39844f);
            float f5 = rectF.top;
            a[99] = true;
            float height4 = f5 + (rectF.height() * 0.71875f);
            a[100] = true;
            path2.lineTo(height3, height4);
            a[101] = true;
            float height5 = rectF.left + (rectF.height() * 0.79492f);
            float f6 = rectF.top;
            a[102] = true;
            float height6 = f6 + (rectF.height() * 0.33008f);
            a[103] = true;
            path2.lineTo(height5, height6);
            a[104] = true;
            float height7 = rectF.left + (rectF.height() * 0.74805f);
            float f7 = rectF.top;
            a[105] = true;
            float height8 = f7 + (rectF.height() * 0.28125f);
            a[106] = true;
            path2.lineTo(height7, height8);
            a[107] = true;
            path2.lineTo(rectF.left + (rectF.height() * 0.39844f), rectF.top + (rectF.height() * 0.625f));
            a[108] = true;
            path2.lineTo(rectF.left + (rectF.height() * 0.25f), rectF.top + (rectF.height() * 0.47266f));
            a[109] = true;
            float height9 = rectF.left + (rectF.height() * 0.20313f);
            float f8 = rectF.top;
            a[110] = true;
            float height10 = f8 + (rectF.height() * 0.51758f);
            a[111] = true;
            path2.lineTo(height9, height10);
            a[112] = true;
            path2.close();
            a[113] = true;
            Paint paint2 = new Paint(1);
            a[114] = true;
            paint2.setStyle(Style.FILL);
            a[115] = true;
            paint2.setColor(-1);
            a[116] = true;
            canvas.drawPath(path2, paint2);
            a[117] = true;
        }
        a[118] = true;
    }

    /* renamed from: a */
    private void m45363a(Canvas canvas) {
        boolean[] a = m45366a();
        Path path = new Path();
        a[119] = true;
        RectF rectF = this.f25787a;
        path.moveTo(rectF.left, rectF.top);
        a[120] = true;
        path.lineTo(this.f25787a.width(), this.f25787a.top);
        a[121] = true;
        path.lineTo(this.f25787a.width(), this.f25787a.height() + 200.0f);
        a[122] = true;
        RectF rectF2 = this.f25787a;
        path.lineTo(rectF2.left, rectF2.height() + 200.0f);
        a[123] = true;
        RectF rectF3 = this.f25787a;
        path.lineTo(rectF3.left, rectF3.top);
        a[124] = true;
        path.close();
        a[125] = true;
        Paint paint = new Paint(1);
        a[126] = true;
        paint.setStyle(Style.FILL);
        a[127] = true;
        paint.setColor(this.f25782N);
        a[128] = true;
        canvas.drawPath(path, paint);
        a[129] = true;
        canvas.save();
        a[130] = true;
        canvas.restore();
        a[131] = true;
        a[132] = true;
        for (C9729a aVar : this.f25786R) {
            a[133] = true;
            m45364a(canvas, aVar);
            a[134] = true;
        }
        a[135] = true;
    }
}
