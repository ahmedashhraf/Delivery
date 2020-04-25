package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0214q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C5582R;
import com.google.android.material.snackbar.BaseTransientBottomBar.C7031s;
import p076c.p112d.p148d.p150g.C6637f;

public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: L */
    private static final int[] f19818L;

    /* renamed from: M */
    private static final int[] f19819M;
    @C0195i0

    /* renamed from: I */
    private final AccessibilityManager f19820I;

    /* renamed from: J */
    private boolean f19821J;
    @C0195i0

    /* renamed from: K */
    private C7031s<Snackbar> f19822K;

    @C0207n0({C0208a.LIBRARY_GROUP})
    public static final class SnackbarLayout extends C7036y {
        public SnackbarLayout(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, C6637f.f18605b), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), C6637f.f18605b));
                }
            }
        }

        public /* bridge */ /* synthetic */ void setBackground(@C0195i0 Drawable drawable) {
            super.setBackground(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@C0195i0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintList(@C0195i0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@C0195i0 Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        public /* bridge */ /* synthetic */ void setOnClickListener(@C0195i0 OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$a */
    class C7038a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f19823a;

        C7038a(OnClickListener onClickListener) {
            this.f19823a = onClickListener;
        }

        public void onClick(View view) {
            this.f19823a.onClick(view);
            Snackbar.this.mo27995a(1);
        }
    }

    /* renamed from: com.google.android.material.snackbar.Snackbar$b */
    public static class C7039b extends C7031s<Snackbar> {

        /* renamed from: f */
        public static final int f19825f = 0;

        /* renamed from: g */
        public static final int f19826g = 1;

        /* renamed from: h */
        public static final int f19827h = 2;

        /* renamed from: i */
        public static final int f19828i = 3;

        /* renamed from: j */
        public static final int f19829j = 4;

        /* renamed from: a */
        public void mo28038a(Snackbar snackbar) {
        }

        /* renamed from: a */
        public void mo28039a(Snackbar snackbar, int i) {
        }
    }

    static {
        int i = C5582R.attr.snackbarButtonStyle;
        f19818L = new int[]{i};
        f19819M = new int[]{i, C5582R.attr.snackbarTextViewStyle};
    }

    private Snackbar(@C0193h0 ViewGroup viewGroup, @C0193h0 View view, @C0193h0 C7040a aVar) {
        super(viewGroup, view, aVar);
        this.f19820I = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @C0193h0
    /* renamed from: a */
    public static Snackbar m33826a(@C0193h0 View view, @C0193h0 CharSequence charSequence, int i) {
        ViewGroup b = m33828b(view);
        if (b != null) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(b.getContext()).inflate(m33829b(b.getContext()) ? C5582R.layout.mtrl_layout_snackbar_include : C5582R.layout.design_layout_snackbar_include, b, false);
            Snackbar snackbar = new Snackbar(b, snackbarContentLayout, snackbarContentLayout);
            snackbar.mo28062a(charSequence);
            snackbar.mo28006f(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: b */
    public void mo27997b() {
        super.mo27997b();
    }

    @C0193h0
    /* renamed from: c */
    public Snackbar mo28065c(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getMessageView().setTextColor(colorStateList);
        return this;
    }

    /* renamed from: g */
    public int mo28007g() {
        int g = super.mo28007g();
        if (g == -2) {
            return -2;
        }
        if (VERSION.SDK_INT >= 29) {
            return this.f19820I.getRecommendedTimeoutMillis(g, (this.f19821J ? 4 : 0) | 1 | 2);
        }
        if (this.f19821J && this.f19820I.isTouchExplorationEnabled()) {
            g = -2;
        }
        return g;
    }

    @C0193h0
    /* renamed from: h */
    public Snackbar mo28067h(@C0198k int i) {
        return mo28064b(ColorStateList.valueOf(i));
    }

    @C0193h0
    /* renamed from: i */
    public Snackbar mo28068i(@C0214q0 int i) {
        return mo28062a(mo28005f().getText(i));
    }

    @C0193h0
    /* renamed from: j */
    public Snackbar mo28069j(@C0198k int i) {
        ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getMessageView().setTextColor(i);
        return this;
    }

    /* renamed from: m */
    public boolean mo28013m() {
        return super.mo28013m();
    }

    /* renamed from: q */
    public void mo28017q() {
        super.mo28017q();
    }

    /* renamed from: b */
    private static boolean m33829b(@C0193h0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f19819M);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @C0195i0
    /* renamed from: b */
    private static ViewGroup m33828b(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @C0193h0
    /* renamed from: g */
    public Snackbar mo28066g(@C0198k int i) {
        ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getActionView().setTextColor(i);
        return this;
    }

    @Deprecated
    /* renamed from: a */
    protected static boolean m33827a(@C0193h0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f19818L);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            return true;
        }
        return false;
    }

    @C0193h0
    /* renamed from: a */
    public static Snackbar m33825a(@C0193h0 View view, @C0214q0 int i, int i2) {
        return m33826a(view, view.getResources().getText(i), i2);
    }

    @C0193h0
    /* renamed from: a */
    public Snackbar mo28062a(@C0193h0 CharSequence charSequence) {
        ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getMessageView().setText(charSequence);
        return this;
    }

    @C0193h0
    /* renamed from: b */
    public Snackbar mo28064b(@C0195i0 ColorStateList colorStateList) {
        this.f19765c.setBackgroundTintList(colorStateList);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public Snackbar mo28058a(@C0214q0 int i, OnClickListener onClickListener) {
        return mo28063a(mo28005f().getText(i), onClickListener);
    }

    @C0193h0
    /* renamed from: a */
    public Snackbar mo28063a(@C0195i0 CharSequence charSequence, @C0195i0 OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f19821J = false;
        } else {
            this.f19821J = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new C7038a(onClickListener));
        }
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public Snackbar mo28059a(ColorStateList colorStateList) {
        ((SnackbarContentLayout) this.f19765c.getChildAt(0)).getActionView().setTextColor(colorStateList);
        return this;
    }

    @C0193h0
    /* renamed from: a */
    public Snackbar mo28060a(@C0195i0 Mode mode) {
        this.f19765c.setBackgroundTintMode(mode);
        return this;
    }

    @C0193h0
    @Deprecated
    /* renamed from: a */
    public Snackbar mo28061a(@C0195i0 C7039b bVar) {
        C7031s<Snackbar> sVar = this.f19822K;
        if (sVar != null) {
            mo27996b(sVar);
        }
        if (bVar != null) {
            mo27992a((C7031s<B>) bVar);
        }
        this.f19822K = bVar;
        return this;
    }
}
