package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4341i0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.plus.internal.C5526m;

@Deprecated
/* renamed from: com.google.android.gms.plus.d */
public final class C5485d extends FrameLayout {
    @Deprecated

    /* renamed from: R */
    public static final int f15753R = 0;
    @Deprecated

    /* renamed from: S */
    public static final int f15754S = 1;
    @Deprecated

    /* renamed from: T */
    public static final int f15755T = 2;
    @Deprecated

    /* renamed from: U */
    public static final int f15756U = 3;
    @Deprecated

    /* renamed from: V */
    public static final int f15757V = 0;
    @Deprecated

    /* renamed from: W */
    public static final int f15758W = 1;
    @Deprecated

    /* renamed from: a0 */
    public static final int f15759a0 = 2;
    @Deprecated

    /* renamed from: b0 */
    public static final int f15760b0 = -1;

    /* renamed from: N */
    private int f15761N;

    /* renamed from: O */
    private String f15762O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public int f15763P;

    /* renamed from: Q */
    private C5487b f15764Q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public View f15765a;

    /* renamed from: b */
    private int f15766b;

    @Deprecated
    /* renamed from: com.google.android.gms.plus.d$a */
    protected class C5486a implements OnClickListener, C5487b {

        /* renamed from: a */
        private final C5487b f15767a;

        @Deprecated
        public C5486a(C5487b bVar) {
            this.f15767a = bVar;
        }

        @Deprecated
        /* renamed from: a */
        public void mo21902a(Intent intent) {
            Context context = C5485d.this.getContext();
            if ((context instanceof Activity) && intent != null) {
                ((Activity) context).startActivityForResult(intent, C5485d.this.f15763P);
            }
        }

        @Deprecated
        public void onClick(View view) {
            Intent intent = (Intent) C5485d.this.f15765a.getTag();
            C5487b bVar = this.f15767a;
            if (bVar != null) {
                bVar.mo21902a(intent);
            } else {
                mo21902a(intent);
            }
        }
    }

    @Deprecated
    /* renamed from: com.google.android.gms.plus.d$b */
    public interface C5487b {
        @Deprecated
        /* renamed from: a */
        void mo21902a(Intent intent);
    }

    @Deprecated
    public C5485d(Context context) {
        this(context, null);
    }

    @Deprecated
    public C5485d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15766b = m23903b(context, attributeSet);
        this.f15761N = m23900a(context, attributeSet);
        this.f15763P = -1;
        m23902a(getContext());
        boolean isInEditMode = isInEditMode();
    }

    @Deprecated
    /* renamed from: a */
    protected static int m23900a(Context context, AttributeSet attributeSet) {
        String a = C4341i0.m18803a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeSet, true, false, "PlusOneButton");
        if ("INLINE".equalsIgnoreCase(a)) {
            return 2;
        }
        return "NONE".equalsIgnoreCase(a) ? 0 : 1;
    }

    /* renamed from: a */
    private final void m23902a(Context context) {
        View view = this.f15765a;
        if (view != null) {
            removeView(view);
        }
        this.f15765a = C5526m.m24082a(context, this.f15766b, this.f15761N, this.f15762O, this.f15763P);
        setOnPlusOneClickListener(this.f15764Q);
        addView(this.f15765a);
    }

    @Deprecated
    /* renamed from: b */
    protected static int m23903b(Context context, AttributeSet attributeSet) {
        String a = C4341i0.m18803a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeSet, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(a)) {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(a)) {
            return 1;
        }
        return "TALL".equalsIgnoreCase(a) ? 2 : 3;
    }

    @Deprecated
    @C4476d0
    /* renamed from: a */
    public final void mo21893a() {
        this.f15765a.performClick();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21894a(String str, int i) {
        C4300a0.m18632b(getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.f15762O = str;
        this.f15763P = i;
        m23902a(getContext());
    }

    @Deprecated
    /* renamed from: a */
    public final void mo21895a(String str, C5487b bVar) {
        this.f15762O = str;
        this.f15763P = 0;
        m23902a(getContext());
        setOnPlusOneClickListener(bVar);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f15765a.layout(0, 0, i3 - i, i4 - i2);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View view = this.f15765a;
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Deprecated
    public final void setAnnotation(int i) {
        this.f15761N = i;
        m23902a(getContext());
    }

    @Deprecated
    @C4476d0
    public final void setIntent(Intent intent) {
        this.f15765a.setTag(intent);
    }

    @Deprecated
    public final void setOnPlusOneClickListener(C5487b bVar) {
        this.f15764Q = bVar;
        this.f15765a.setOnClickListener(new C5486a(bVar));
    }

    @Deprecated
    public final void setSize(int i) {
        this.f15766b = i;
        m23902a(getContext());
    }
}
