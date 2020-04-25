package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import androidx.appcompat.C0238R;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import androidx.core.p034l.C0996j0;

/* renamed from: androidx.appcompat.widget.a */
/* compiled from: AbsActionBarView */
abstract class C0466a extends ViewGroup {

    /* renamed from: T */
    private static final int f1851T = 200;

    /* renamed from: N */
    protected ActionMenuView f1852N;

    /* renamed from: O */
    protected ActionMenuPresenter f1853O;

    /* renamed from: P */
    protected int f1854P;

    /* renamed from: Q */
    protected C0990i0 f1855Q;

    /* renamed from: R */
    private boolean f1856R;

    /* renamed from: S */
    private boolean f1857S;

    /* renamed from: a */
    protected final C0468b f1858a;

    /* renamed from: b */
    protected final Context f1859b;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* compiled from: AbsActionBarView */
    class C0467a implements Runnable {
        C0467a() {
        }

        public void run() {
            C0466a.this.mo1864h();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    /* compiled from: AbsActionBarView */
    protected class C0468b implements C0996j0 {

        /* renamed from: a */
        private boolean f1861a = false;

        /* renamed from: b */
        int f1862b;

        protected C0468b() {
        }

        /* renamed from: a */
        public C0468b mo2464a(C0990i0 i0Var, int i) {
            C0466a.this.f1855Q = i0Var;
            this.f1862b = i;
            return this;
        }

        /* renamed from: b */
        public void mo865b(View view) {
            if (!this.f1861a) {
                C0466a aVar = C0466a.this;
                aVar.f1855Q = null;
                C0466a.super.setVisibility(this.f1862b);
            }
        }

        /* renamed from: c */
        public void mo866c(View view) {
            C0466a.super.setVisibility(0);
            this.f1861a = false;
        }

        /* renamed from: a */
        public void mo2465a(View view) {
            this.f1861a = true;
        }
    }

    C0466a(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    protected static int m2575a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public boolean mo1853c() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1954f();
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo1854d() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1956h();
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo1855e() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1957i();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo1856f() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        return actionMenuPresenter != null && actionMenuPresenter.mo1958j();
    }

    /* renamed from: g */
    public void mo1857g() {
        post(new C0467a());
    }

    public int getAnimatedVisibility() {
        if (this.f1855Q != null) {
            return this.f1858a.f1862b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1854P;
    }

    /* renamed from: h */
    public boolean mo1864h() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1959k();
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0238R.styleable.ActionBar, C0238R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0238R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1945a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1857S = false;
        }
        if (!this.f1857S) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1857S = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1857S = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1856R = false;
        }
        if (!this.f1856R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1856R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1856R = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1854P = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0990i0 i0Var = this.f1855Q;
            if (i0Var != null) {
                i0Var.mo4830a();
            }
            super.setVisibility(i);
        }
    }

    C0466a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public C0990i0 mo1848a(int i, long j) {
        C0990i0 i0Var = this.f1855Q;
        if (i0Var != null) {
            i0Var.mo4830a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0990i0 a = C0962e0.m5428a(this).mo4824a(1.0f);
            a.mo4825a(j);
            a.mo4827a((C0996j0) this.f1858a.mo2464a(a, i));
            return a;
        }
        C0990i0 a2 = C0962e0.m5428a(this).mo4824a(0.0f);
        a2.mo4825a(j);
        a2.mo4827a((C0996j0) this.f1858a.mo2464a(a2, i));
        return a2;
    }

    /* renamed from: b */
    public void mo1852b() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1952d();
        }
    }

    C0466a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1858a = new C0468b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0238R.attr.actionBarPopupTheme, typedValue, true)) {
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f1859b = new ContextThemeWrapper(context, i2);
                return;
            }
        }
        this.f1859b = context;
    }

    /* renamed from: a */
    public void mo1849a(int i) {
        mo1848a(i, 200).mo4840e();
    }

    /* renamed from: a */
    public boolean mo1851a() {
        return mo1856f() && getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2460a(View view, int i, int i2, int i3) {
        view.measure(MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo2461a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
