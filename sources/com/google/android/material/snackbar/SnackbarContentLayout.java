package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0962e0;
import com.google.android.material.C5582R;
import com.google.android.material.p185e.C5713a;

@C0207n0({C0208a.LIBRARY_GROUP})
public class SnackbarContentLayout extends LinearLayout implements C7040a {

    /* renamed from: N */
    private int f19830N;

    /* renamed from: O */
    private int f19831O;

    /* renamed from: a */
    private TextView f19832a;

    /* renamed from: b */
    private Button f19833b;

    public SnackbarContentLayout(@C0193h0 Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo28074a(float f) {
        if (f != 1.0f) {
            this.f19833b.setTextColor(C5713a.m25187a(C5713a.m25190a((View) this, C5582R.attr.colorSurface), this.f19833b.getCurrentTextColor(), f));
        }
    }

    /* renamed from: b */
    public void mo28076b(int i, int i2) {
        this.f19832a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f19832a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f19833b.getVisibility() == 0) {
            this.f19833b.setAlpha(1.0f);
            this.f19833b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f19833b;
    }

    public TextView getMessageView() {
        return this.f19832a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f19832a = (TextView) findViewById(C5582R.C5586id.snackbar_text);
        this.f19833b = (Button) findViewById(C5582R.C5586id.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (m33851a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (m33851a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f19830N
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f19830N
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C5582R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C5582R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f19832a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f19831O
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f19833b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f19831O
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.m33851a(r4, r0, r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.m33851a(r3, r0, r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public SnackbarContentLayout(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5582R.styleable.SnackbarLayout);
        this.f19830N = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.f19831O = obtainStyledAttributes.getDimensionPixelSize(C5582R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private boolean m33851a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f19832a.getPaddingTop() == i2 && this.f19832a.getPaddingBottom() == i3) {
            return z;
        }
        m33850a((View) this.f19832a, i2, i3);
        return true;
    }

    /* renamed from: a */
    private static void m33850a(@C0193h0 View view, int i, int i2) {
        if (C0962e0.m5553r0(view)) {
            C0962e0.m5473b(view, C0962e0.m5405I(view), i, C0962e0.m5404H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: a */
    public void mo28075a(int i, int i2) {
        this.f19832a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f19832a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f19833b.getVisibility() == 0) {
            this.f19833b.setAlpha(0.0f);
            this.f19833b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }
}
