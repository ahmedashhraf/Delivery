package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.C0279a.C0285f;
import androidx.appcompat.p011d.C0337a;
import androidx.appcompat.widget.C0490e0.C0492b;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.l0 */
/* compiled from: ScrollingTabContainerView */
public class C0523l0 extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: W */
    private static final String f2081W = "ScrollingTabContainerView";

    /* renamed from: a0 */
    private static final Interpolator f2082a0 = new DecelerateInterpolator();

    /* renamed from: b0 */
    private static final int f2083b0 = 200;

    /* renamed from: N */
    C0490e0 f2084N;

    /* renamed from: O */
    private Spinner f2085O;

    /* renamed from: P */
    private boolean f2086P;

    /* renamed from: Q */
    int f2087Q;

    /* renamed from: R */
    int f2088R;

    /* renamed from: S */
    private int f2089S;

    /* renamed from: T */
    private int f2090T;

    /* renamed from: U */
    protected ViewPropertyAnimator f2091U;

    /* renamed from: V */
    protected final C0528e f2092V = new C0528e();

    /* renamed from: a */
    Runnable f2093a;

    /* renamed from: b */
    private C0526c f2094b;

    /* renamed from: androidx.appcompat.widget.l0$a */
    /* compiled from: ScrollingTabContainerView */
    class C0524a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f2095a;

        C0524a(View view) {
            this.f2095a = view;
        }

        public void run() {
            C0523l0.this.smoothScrollTo(this.f2095a.getLeft() - ((C0523l0.this.getWidth() - this.f2095a.getWidth()) / 2), 0);
            C0523l0.this.f2093a = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    /* compiled from: ScrollingTabContainerView */
    private class C0525b extends BaseAdapter {
        C0525b() {
        }

        public int getCount() {
            return C0523l0.this.f2084N.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0527d) C0523l0.this.f2084N.getChildAt(i)).mo2781a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0523l0.this.mo2762b((C0285f) getItem(i), true);
            }
            ((C0527d) view).mo2782a((C0285f) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$c */
    /* compiled from: ScrollingTabContainerView */
    private class C0526c implements OnClickListener {
        C0526c() {
        }

        public void onClick(View view) {
            ((C0527d) view).mo2781a().mo1010g();
            int childCount = C0523l0.this.f2084N.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0523l0.this.f2084N.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$d */
    /* compiled from: ScrollingTabContainerView */
    private class C0527d extends LinearLayout {

        /* renamed from: R */
        private static final String f2099R = "androidx.appcompat.app.ActionBar$Tab";

        /* renamed from: N */
        private TextView f2100N;

        /* renamed from: O */
        private ImageView f2101O;

        /* renamed from: P */
        private View f2102P;

        /* renamed from: a */
        private final int[] f2104a = {16842964};

        /* renamed from: b */
        private C0285f f2105b;

        public C0527d(Context context, C0285f fVar, boolean z) {
            super(context, null, C0238R.attr.actionBarTabStyle);
            this.f2105b = fVar;
            C0549t0 a = C0549t0.m2910a(context, null, this.f2104a, C0238R.attr.actionBarTabStyle, 0);
            if (a.mo2892j(0)) {
                setBackgroundDrawable(a.mo2875b(0));
            }
            a.mo2887f();
            if (z) {
                setGravity(8388627);
            }
            mo2783b();
        }

        /* renamed from: a */
        public void mo2782a(C0285f fVar) {
            this.f2105b = fVar;
            mo2783b();
        }

        /* renamed from: b */
        public void mo2783b() {
            C0285f fVar = this.f2105b;
            View b = fVar.mo1001b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f2102P = b;
                TextView textView = this.f2100N;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f2101O;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f2101O.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f2102P;
            if (view != null) {
                removeView(view);
                this.f2102P = null;
            }
            Drawable c = fVar.mo1004c();
            CharSequence f = fVar.mo1009f();
            if (c != null) {
                if (this.f2101O == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f2101O = appCompatImageView;
                }
                this.f2101O.setImageDrawable(c);
                this.f2101O.setVisibility(0);
            } else {
                ImageView imageView2 = this.f2101O;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f2101O.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(f);
            if (z) {
                if (this.f2100N == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C0238R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f2100N = appCompatTextView;
                }
                this.f2100N.setText(f);
                this.f2100N.setVisibility(0);
            } else {
                TextView textView2 = this.f2100N;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f2100N.setText(null);
                }
            }
            ImageView imageView3 = this.f2101O;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.mo1000a());
            }
            if (!z) {
                charSequence = fVar.mo1000a();
            }
            C0557v0.m3031a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(f2099R);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(f2099R);
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0523l0.this.f2087Q > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0523l0.this.f2087Q;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, C6637f.f18605b), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: a */
        public C0285f mo2781a() {
            return this.f2105b;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$e */
    /* compiled from: ScrollingTabContainerView */
    protected class C0528e extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f2106a = false;

        /* renamed from: b */
        private int f2107b;

        protected C0528e() {
        }

        /* renamed from: a */
        public C0528e mo2788a(ViewPropertyAnimator viewPropertyAnimator, int i) {
            this.f2107b = i;
            C0523l0.this.f2091U = viewPropertyAnimator;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2106a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2106a) {
                C0523l0 l0Var = C0523l0.this;
                l0Var.f2091U = null;
                l0Var.setVisibility(this.f2107b);
            }
        }

        public void onAnimationStart(Animator animator) {
            C0523l0.this.setVisibility(0);
            this.f2106a = false;
        }
    }

    public C0523l0(Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        C0337a a = C0337a.m1868a(context);
        setContentHeight(a.mo1315e());
        this.f2088R = a.mo1314d();
        this.f2084N = m2816c();
        addView(this.f2084N, new ViewGroup.LayoutParams(-2, -1));
    }

    /* renamed from: b */
    private Spinner m2815b() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C0238R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new C0492b(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: c */
    private C0490e0 m2816c() {
        C0490e0 e0Var = new C0490e0(getContext(), null, C0238R.attr.actionBarTabBarStyle);
        e0Var.setMeasureWithLargestChildEnabled(true);
        e0Var.setGravity(17);
        e0Var.setLayoutParams(new C0492b(-2, -1));
        return e0Var;
    }

    /* renamed from: d */
    private boolean m2817d() {
        Spinner spinner = this.f2085O;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m2818e() {
        if (!m2817d()) {
            if (this.f2085O == null) {
                this.f2085O = m2815b();
            }
            removeView(this.f2084N);
            addView(this.f2085O, new ViewGroup.LayoutParams(-2, -1));
            if (this.f2085O.getAdapter() == null) {
                this.f2085O.setAdapter(new C0525b());
            }
            Runnable runnable = this.f2093a;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f2093a = null;
            }
            this.f2085O.setSelection(this.f2090T);
        }
    }

    /* renamed from: f */
    private boolean m2819f() {
        if (!m2817d()) {
            return false;
        }
        removeView(this.f2085O);
        addView(this.f2084N, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f2085O.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void mo2759a(int i) {
        View childAt = this.f2084N.getChildAt(i);
        Runnable runnable = this.f2093a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f2093a = new C0524a(childAt);
        post(this.f2093a);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f2093a;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0337a a = C0337a.m1868a(getContext());
        setContentHeight(a.mo1315e());
        this.f2088R = a.mo1314d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f2093a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0527d) view).mo2781a().mo1010g();
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f2084N.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f2087Q = -1;
        } else {
            if (childCount > 2) {
                this.f2087Q = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f2087Q = MeasureSpec.getSize(i) / 2;
            }
            this.f2087Q = Math.min(this.f2087Q, this.f2088R);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f2089S, C6637f.f18605b);
        if (z2 || !this.f2086P) {
            z = false;
        }
        if (z) {
            this.f2084N.measure(0, makeMeasureSpec);
            if (this.f2084N.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m2818e();
            } else {
                m2819f();
            }
        } else {
            m2819f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f2090T);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f2086P = z;
    }

    public void setContentHeight(int i) {
        this.f2089S = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f2090T = i;
        int childCount = this.f2084N.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f2084N.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2759a(i);
            }
            i2++;
        }
        Spinner spinner = this.f2085O;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: d */
    public void mo2765d(int i) {
        ((C0527d) this.f2084N.getChildAt(i)).mo2783b();
        Spinner spinner = this.f2085O;
        if (spinner != null) {
            ((C0525b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2086P) {
            requestLayout();
        }
    }

    /* renamed from: b */
    public void mo2763b(int i) {
        ViewPropertyAnimator viewPropertyAnimator = this.f2091U;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ViewPropertyAnimator alpha = animate().alpha(1.0f);
            alpha.setDuration(200);
            alpha.setInterpolator(f2082a0);
            alpha.setListener(this.f2092V.mo2788a(alpha, i));
            alpha.start();
            return;
        }
        ViewPropertyAnimator alpha2 = animate().alpha(0.0f);
        alpha2.setDuration(200);
        alpha2.setInterpolator(f2082a0);
        alpha2.setListener(this.f2092V.mo2788a(alpha2, i));
        alpha2.start();
    }

    /* renamed from: c */
    public void mo2764c(int i) {
        this.f2084N.removeViewAt(i);
        Spinner spinner = this.f2085O;
        if (spinner != null) {
            ((C0525b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2086P) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo2761a(C0285f fVar, boolean z) {
        C0527d b = mo2762b(fVar, false);
        this.f2084N.addView(b, new C0492b(0, -1, 1.0f));
        Spinner spinner = this.f2085O;
        if (spinner != null) {
            ((C0525b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            b.setSelected(true);
        }
        if (this.f2086P) {
            requestLayout();
        }
    }

    /* renamed from: a */
    public void mo2760a(C0285f fVar, int i, boolean z) {
        C0527d b = mo2762b(fVar, false);
        this.f2084N.addView(b, i, new C0492b(0, -1, 1.0f));
        Spinner spinner = this.f2085O;
        if (spinner != null) {
            ((C0525b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z) {
            b.setSelected(true);
        }
        if (this.f2086P) {
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0527d mo2762b(C0285f fVar, boolean z) {
        C0527d dVar = new C0527d(getContext(), fVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f2089S));
        } else {
            dVar.setFocusable(true);
            if (this.f2094b == null) {
                this.f2094b = new C0526c();
            }
            dVar.setOnClickListener(this.f2094b);
        }
        return dVar;
    }

    /* renamed from: a */
    public void mo2758a() {
        this.f2084N.removeAllViews();
        Spinner spinner = this.f2085O;
        if (spinner != null) {
            ((C0525b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.f2086P) {
            requestLayout();
        }
    }
}
