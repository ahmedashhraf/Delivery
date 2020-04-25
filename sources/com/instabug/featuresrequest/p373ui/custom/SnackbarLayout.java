package com.instabug.featuresrequest.p373ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import com.instabug.featuresrequest.C9525R;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.ui.custom.SnackbarLayout */
public class SnackbarLayout extends LinearLayout {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f25541R;

    /* renamed from: N */
    public int f25542N;

    /* renamed from: O */
    private int f25543O;

    /* renamed from: P */
    private C9637b f25544P;

    /* renamed from: Q */
    private C9636a f25545Q;

    /* renamed from: a */
    private TextView f25546a;

    /* renamed from: b */
    private Button f25547b;

    /* renamed from: com.instabug.featuresrequest.ui.custom.SnackbarLayout$a */
    interface C9636a {
        /* renamed from: a */
        void mo34506a(View view);

        /* renamed from: b */
        void mo34507b(View view);
    }

    /* renamed from: com.instabug.featuresrequest.ui.custom.SnackbarLayout$b */
    interface C9637b {
        /* renamed from: a */
        void mo34508a(View view, int i, int i2, int i3, int i4);
    }

    public SnackbarLayout(Context context) {
        boolean[] a = m45057a();
        this(context, null);
        a[0] = true;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m45057a() {
        boolean[] zArr = f25541R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8222455801263189717L, "com/instabug/featuresrequest/ui/custom/SnackbarLayout", 108);
        f25541R = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34495a(int i, int i2) {
        boolean[] a = m45057a();
        C0962e0.m5431a((View) this.f25546a, 0.0f);
        a[45] = true;
        C0990i0 a2 = C0962e0.m5428a(this.f25546a);
        a[46] = true;
        C0990i0 a3 = a2.mo4824a(1.0f);
        long j = (long) i2;
        a[47] = true;
        C0990i0 a4 = a3.mo4825a(j);
        long j2 = (long) i;
        a[48] = true;
        C0990i0 b = a4.mo4833b(j2);
        a[49] = true;
        b.mo4840e();
        a[50] = true;
        if (this.f25547b.getVisibility() != 0) {
            a[51] = true;
        } else {
            a[52] = true;
            C0962e0.m5431a((View) this.f25547b, 0.0f);
            a[53] = true;
            C0990i0 a5 = C0962e0.m5428a(this.f25547b);
            a[54] = true;
            C0990i0 a6 = a5.mo4824a(1.0f);
            a[55] = true;
            C0990i0 a7 = a6.mo4825a(j);
            a[56] = true;
            C0990i0 b2 = a7.mo4833b(j2);
            a[57] = true;
            b2.mo4840e();
            a[58] = true;
        }
        a[59] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34496b(int i, int i2) {
        boolean[] a = m45057a();
        C0962e0.m5431a((View) this.f25546a, 1.0f);
        a[60] = true;
        C0990i0 a2 = C0962e0.m5428a(this.f25546a);
        a[61] = true;
        C0990i0 a3 = a2.mo4824a(0.0f);
        long j = (long) i2;
        a[62] = true;
        C0990i0 a4 = a3.mo4825a(j);
        long j2 = (long) i;
        a[63] = true;
        C0990i0 b = a4.mo4833b(j2);
        a[64] = true;
        b.mo4840e();
        a[65] = true;
        if (this.f25547b.getVisibility() != 0) {
            a[66] = true;
        } else {
            a[67] = true;
            C0962e0.m5431a((View) this.f25547b, 1.0f);
            a[68] = true;
            C0990i0 a5 = C0962e0.m5428a(this.f25547b);
            a[69] = true;
            C0990i0 a6 = a5.mo4824a(0.0f);
            a[70] = true;
            C0990i0 a7 = a6.mo4825a(j);
            a[71] = true;
            C0990i0 b2 = a7.mo4833b(j2);
            a[72] = true;
            b2.mo4840e();
            a[73] = true;
        }
        a[74] = true;
    }

    /* access modifiers changed from: 0000 */
    public Button getActionView() {
        boolean[] a = m45057a();
        Button button = this.f25547b;
        a[17] = true;
        return button;
    }

    /* access modifiers changed from: 0000 */
    public TextView getMessageView() {
        boolean[] a = m45057a();
        TextView textView = this.f25546a;
        a[16] = true;
        return textView;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        boolean[] a = m45057a();
        super.onAttachedToWindow();
        C9636a aVar = this.f25545Q;
        if (aVar == null) {
            a[80] = true;
        } else {
            a[81] = true;
            aVar.mo34507b(this);
            a[82] = true;
        }
        a[83] = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        boolean[] a = m45057a();
        super.onDetachedFromWindow();
        C9636a aVar = this.f25545Q;
        if (aVar == null) {
            a[84] = true;
        } else {
            a[85] = true;
            aVar.mo34506a(this);
            a[86] = true;
        }
        a[87] = true;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        boolean[] a = m45057a();
        super.onFinishInflate();
        a[13] = true;
        this.f25546a = (TextView) findViewById(C9525R.C9529id.snackbar_text);
        a[14] = true;
        this.f25547b = (Button) findViewById(C9525R.C9529id.snackbar_action);
        a[15] = true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean[] a = m45057a();
        super.onLayout(z, i, i2, i3, i4);
        if (!z) {
            a[75] = true;
        } else {
            C9637b bVar = this.f25544P;
            if (bVar == null) {
                a[76] = true;
            } else {
                a[77] = true;
                bVar.mo34508a(this, i, i2, i3, i4);
                a[78] = true;
            }
        }
        a[79] = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            boolean[] r0 = m45057a()
            super.onMeasure(r9, r10)
            r1 = 1
            r2 = 18
            r0[r2] = r1
            int r2 = r8.f25542N
            if (r2 > 0) goto L_0x0015
            r2 = 19
            r0[r2] = r1
            goto L_0x0037
        L_0x0015:
            int r2 = r8.getMeasuredWidth()
            int r3 = r8.f25542N
            if (r2 > r3) goto L_0x0022
            r2 = 20
            r0[r2] = r1
            goto L_0x0037
        L_0x0022:
            r9 = 21
            r0[r9] = r1
            r9 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r9)
            r2 = 22
            r0[r2] = r1
            super.onMeasure(r9, r10)
            r2 = 23
            r0[r2] = r1
        L_0x0037:
            android.content.res.Resources r2 = r8.getResources()
            int r3 = com.instabug.featuresrequest.C9525R.dimen.ib_fr_toast_multi_line_padding
            int r2 = r2.getDimensionPixelSize(r3)
            r3 = 24
            r0[r3] = r1
            android.content.res.Resources r3 = r8.getResources()
            int r4 = com.instabug.featuresrequest.C9525R.dimen.ib_fr_toast_single_line_padding
            int r3 = r3.getDimensionPixelSize(r4)
            r4 = 25
            r0[r4] = r1
            android.widget.TextView r4 = r8.f25546a
            android.text.Layout r4 = r4.getLayout()
            r5 = 26
            r0[r5] = r1
            int r4 = r4.getLineCount()
            r5 = 0
            if (r4 <= r1) goto L_0x006a
            r4 = 27
            r0[r4] = r1
            r4 = 1
            goto L_0x006f
        L_0x006a:
            r4 = 28
            r0[r4] = r1
            r4 = 0
        L_0x006f:
            if (r4 != 0) goto L_0x0076
            r6 = 29
            r0[r6] = r1
            goto L_0x0091
        L_0x0076:
            int r6 = r8.f25543O
            if (r6 > 0) goto L_0x007f
            r6 = 30
            r0[r6] = r1
            goto L_0x0091
        L_0x007f:
            android.widget.Button r6 = r8.f25547b
            r7 = 31
            r0[r7] = r1
            int r6 = r6.getMeasuredWidth()
            int r7 = r8.f25543O
            if (r6 > r7) goto L_0x00b1
            r6 = 32
            r0[r6] = r1
        L_0x0091:
            if (r4 == 0) goto L_0x0098
            r3 = 36
            r0[r3] = r1
            goto L_0x009d
        L_0x0098:
            r2 = 37
            r0[r2] = r1
            r2 = r3
        L_0x009d:
            r3 = 38
            r0[r3] = r1
            boolean r2 = r8.m45056a(r5, r2, r2)
            if (r2 != 0) goto L_0x00ac
            r2 = 39
            r0[r2] = r1
            goto L_0x00c5
        L_0x00ac:
            r2 = 40
            r0[r2] = r1
            goto L_0x00c4
        L_0x00b1:
            r3 = 33
            r0[r3] = r1
            boolean r2 = r8.m45056a(r1, r2, r2)
            if (r2 != 0) goto L_0x00c0
            r2 = 34
            r0[r2] = r1
            goto L_0x00c5
        L_0x00c0:
            r2 = 35
            r0[r2] = r1
        L_0x00c4:
            r5 = 1
        L_0x00c5:
            if (r5 != 0) goto L_0x00cc
            r9 = 41
            r0[r9] = r1
            goto L_0x00d7
        L_0x00cc:
            r2 = 42
            r0[r2] = r1
            super.onMeasure(r9, r10)
            r9 = 43
            r0[r9] = r1
        L_0x00d7:
            r9 = 44
            r0[r9] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.p373ui.custom.SnackbarLayout.onMeasure(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    public void setOnAttachStateChangeListener(C9636a aVar) {
        boolean[] a = m45057a();
        this.f25545Q = aVar;
        a[89] = true;
    }

    /* access modifiers changed from: 0000 */
    public void setOnLayoutChangeListener(C9637b bVar) {
        boolean[] a = m45057a();
        this.f25544P = bVar;
        a[88] = true;
    }

    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        boolean[] a = m45057a();
        super(context, attributeSet);
        a[1] = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9525R.styleable.SnackbarLayout);
        a[2] = true;
        this.f25542N = obtainStyledAttributes.getDimensionPixelSize(C9525R.styleable.SnackbarLayout_android_maxWidth, -1);
        a[3] = true;
        this.f25543O = obtainStyledAttributes.getDimensionPixelSize(C9525R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        a[4] = true;
        if (!obtainStyledAttributes.hasValue(C9525R.styleable.SnackbarLayout_elevation)) {
            a[5] = true;
        } else {
            a[6] = true;
            C0962e0.m5472b((View) this, (float) obtainStyledAttributes.getDimensionPixelSize(C9525R.styleable.SnackbarLayout_elevation, 0));
            a[7] = true;
        }
        obtainStyledAttributes.recycle();
        a[8] = true;
        setClickable(true);
        a[9] = true;
        LayoutInflater from = LayoutInflater.from(context);
        int i = C9525R.layout.ib_fr_insta_toast_include;
        a[10] = true;
        from.inflate(i, this);
        a[11] = true;
        C0962e0.m5527k((View) this, 1);
        a[12] = true;
    }

    /* renamed from: a */
    private boolean m45056a(int i, int i2, int i3) {
        boolean z;
        boolean[] a = m45057a();
        a[90] = true;
        if (i == getOrientation()) {
            a[91] = true;
            z = false;
        } else {
            a[92] = true;
            setOrientation(i);
            a[93] = true;
            z = true;
        }
        if (this.f25546a.getPaddingTop() != i2) {
            a[94] = true;
        } else {
            TextView textView = this.f25546a;
            a[95] = true;
            if (textView.getPaddingBottom() == i3) {
                a[96] = true;
                a[99] = true;
                return z;
            }
            a[97] = true;
        }
        m45055a((View) this.f25546a, i2, i3);
        a[98] = true;
        z = true;
        a[99] = true;
        return z;
    }

    /* renamed from: a */
    private static void m45055a(View view, int i, int i2) {
        boolean[] a = m45057a();
        if (C0962e0.m5553r0(view)) {
            a[100] = true;
            int I = C0962e0.m5405I(view);
            a[101] = true;
            int H = C0962e0.m5404H(view);
            a[102] = true;
            C0962e0.m5473b(view, I, i, H, i2);
            a[103] = true;
        } else {
            int paddingLeft = view.getPaddingLeft();
            a[104] = true;
            int paddingRight = view.getPaddingRight();
            a[105] = true;
            view.setPadding(paddingLeft, i, paddingRight, i2);
            a[106] = true;
        }
        a[107] = true;
    }
}
