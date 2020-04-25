package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0209o;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0216r0;
import androidx.annotation.C0225w;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.widget.C0549t0;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.internal.C6901h;
import com.google.android.material.internal.C6902i;
import com.google.android.material.internal.C6916k;
import com.google.android.material.internal.C6928p;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p187p.C6986o;
import com.google.android.material.p302m.C6952c;
import p076c.p112d.p148d.p150g.C6637f;

public class NavigationView extends C6916k {

    /* renamed from: a0 */
    private static final int[] f19481a0 = {16842912};

    /* renamed from: b0 */
    private static final int[] f19482b0 = {-16842910};

    /* renamed from: c0 */
    private static final int f19483c0 = 1;
    @C0193h0

    /* renamed from: Q */
    private final C6901h f19484Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final C6902i f19485R;

    /* renamed from: S */
    C6965c f19486S;

    /* renamed from: T */
    private final int f19487T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final int[] f19488U;

    /* renamed from: V */
    private MenuInflater f19489V;

    /* renamed from: W */
    private OnGlobalLayoutListener f19490W;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C6962a();
        @C0195i0
        public Bundle menuState;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$a */
        static class C6962a implements ClassLoaderCreator<SavedState> {
            C6962a() {
            }

            @C0193h0
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @C0193h0
            public SavedState createFromParcel(@C0193h0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @C0195i0
            public SavedState createFromParcel(@C0193h0 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@C0193h0 Parcel parcel, @C0195i0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$a */
    class C6963a implements C0371a {
        C6963a() {
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, MenuItem menuItem) {
            C6965c cVar = NavigationView.this.f19486S;
            return cVar != null && cVar.mo27746a(menuItem);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$b */
    class C6964b implements OnGlobalLayoutListener {
        C6964b() {
        }

        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f19488U);
            boolean z = true;
            boolean z2 = NavigationView.this.f19488U[1] == 0;
            NavigationView.this.f19485R.mo27599b(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Context context = NavigationView.this.getContext();
            if ((context instanceof Activity) && VERSION.SDK_INT >= 21) {
                Activity activity = (Activity) context;
                boolean z3 = activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
                boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView2 = NavigationView.this;
                if (!z3 || !z4) {
                    z = false;
                }
                navigationView2.setDrawBottomInsetForeground(z);
            }
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$c */
    public interface C6965c {
        /* renamed from: a */
        boolean mo27746a(@C0193h0 MenuItem menuItem);
    }

    public NavigationView(@C0193h0 Context context) {
        this(context, null);
    }

    @C0195i0
    /* renamed from: d */
    private ColorStateList m33365d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b = C0242a.m1108b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C0238R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b.getDefaultColor();
        return new ColorStateList(new int[][]{f19482b0, f19481a0, FrameLayout.EMPTY_STATE_SET}, new int[]{b.getColorForState(f19482b0, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.f19489V == null) {
            this.f19489V = new C0345g(getContext());
        }
        return this.f19489V;
    }

    /* renamed from: c */
    public void mo27713c(int i) {
        this.f19485R.mo27601c(true);
        getMenuInflater().inflate(i, this.f19484Q);
        this.f19485R.mo27601c(false);
        this.f19485R.mo1489a(false);
    }

    @C0195i0
    public MenuItem getCheckedItem() {
        return this.f19485R.mo27596b();
    }

    public int getHeaderCount() {
        return this.f19485R.mo27602d();
    }

    @C0195i0
    public Drawable getItemBackground() {
        return this.f19485R.mo27604e();
    }

    @C0211p
    public int getItemHorizontalPadding() {
        return this.f19485R.mo27606f();
    }

    @C0211p
    public int getItemIconPadding() {
        return this.f19485R.mo27608g();
    }

    @C0195i0
    public ColorStateList getItemIconTintList() {
        return this.f19485R.mo27614j();
    }

    public int getItemMaxLines() {
        return this.f19485R.mo27610h();
    }

    @C0195i0
    public ColorStateList getItemTextColor() {
        return this.f19485R.mo27612i();
    }

    @C0193h0
    public Menu getMenu() {
        return this.f19484Q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33513a((View) this);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f19490W);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f19490W);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(Math.min(MeasureSpec.getSize(i), this.f19487T), C6637f.f18605b);
        } else if (mode == 0) {
            i = MeasureSpec.makeMeasureSpec(this.f19487T, C6637f.f18605b);
        }
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f19484Q.mo1581b(savedState.menuState);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.menuState = new Bundle();
        this.f19484Q.mo1595d(savedState.menuState);
        return savedState;
    }

    public void setCheckedItem(@C0225w int i) {
        MenuItem findItem = this.f19484Q.findItem(i);
        if (findItem != null) {
            this.f19485R.mo27593a((C0375j) findItem);
        }
    }

    public void setElevation(float f) {
        if (VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C6982k.m33514a((View) this, f);
    }

    public void setItemBackground(@C0195i0 Drawable drawable) {
        this.f19485R.mo27591a(drawable);
    }

    public void setItemBackgroundResource(@C0213q int i) {
        setItemBackground(C0841b.m4928c(getContext(), i));
    }

    public void setItemHorizontalPadding(@C0211p int i) {
        this.f19485R.mo27603d(i);
    }

    public void setItemHorizontalPaddingResource(@C0209o int i) {
        this.f19485R.mo27603d(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@C0211p int i) {
        this.f19485R.mo27605e(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f19485R.mo27605e(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@C0211p int i) {
        this.f19485R.mo27607f(i);
    }

    public void setItemIconTintList(@C0195i0 ColorStateList colorStateList) {
        this.f19485R.mo27590a(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f19485R.mo27609g(i);
    }

    public void setItemTextAppearance(@C0216r0 int i) {
        this.f19485R.mo27611h(i);
    }

    public void setItemTextColor(@C0195i0 ColorStateList colorStateList) {
        this.f19485R.mo27597b(colorStateList);
    }

    public void setNavigationItemSelectedListener(@C0195i0 C6965c cVar) {
        this.f19486S = cVar;
    }

    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C6902i iVar = this.f19485R;
        if (iVar != null) {
            iVar.mo27613i(i);
        }
    }

    public NavigationView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.navigationViewStyle);
    }

    @C0193h0
    /* renamed from: a */
    private final Drawable m33360a(@C0193h0 C0549t0 t0Var) {
        C6978j jVar = new C6978j(C6986o.m33523a(getContext(), t0Var.mo2888g(C5582R.styleable.NavigationView_itemShapeAppearance, 0), t0Var.mo2888g(C5582R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).mo27878a());
        jVar.mo27790a(C6952c.m33333a(getContext(), t0Var, C5582R.styleable.NavigationView_itemShapeFillColor));
        InsetDrawable insetDrawable = new InsetDrawable(jVar, t0Var.mo2876c(C5582R.styleable.NavigationView_itemShapeInsetStart, 0), t0Var.mo2876c(C5582R.styleable.NavigationView_itemShapeInsetTop, 0), t0Var.mo2876c(C5582R.styleable.NavigationView_itemShapeInsetEnd, 0), t0Var.mo2876c(C5582R.styleable.NavigationView_itemShapeInsetBottom, 0));
        return insetDrawable;
    }

    /* renamed from: b */
    private boolean m33364b(@C0193h0 C0549t0 t0Var) {
        return t0Var.mo2892j(C5582R.styleable.NavigationView_itemShapeAppearance) || t0Var.mo2892j(C5582R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    public NavigationView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        int i2;
        boolean z;
        super(context, attributeSet, i);
        this.f19485R = new C6902i();
        this.f19488U = new int[2];
        this.f19484Q = new C6901h(context);
        C0549t0 d = C6928p.m33266d(context, attributeSet, C5582R.styleable.NavigationView, i, C5582R.style.Widget_Design_NavigationView, new int[0]);
        if (d.mo2892j(C5582R.styleable.NavigationView_android_background)) {
            C0962e0.m5440a((View) this, d.mo2875b(C5582R.styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            C6978j jVar = new C6978j();
            if (background instanceof ColorDrawable) {
                jVar.mo27790a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            jVar.mo27789a(context);
            C0962e0.m5440a((View) this, (Drawable) jVar);
        }
        if (d.mo2892j(C5582R.styleable.NavigationView_elevation)) {
            setElevation((float) d.mo2876c(C5582R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(d.mo2871a(C5582R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.f19487T = d.mo2876c(C5582R.styleable.NavigationView_android_maxWidth, 0);
        if (d.mo2892j(C5582R.styleable.NavigationView_itemIconTint)) {
            colorStateList = d.mo2868a(C5582R.styleable.NavigationView_itemIconTint);
        } else {
            colorStateList = m33365d(16842808);
        }
        if (d.mo2892j(C5582R.styleable.NavigationView_itemTextAppearance)) {
            i2 = d.mo2888g(C5582R.styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            z = false;
            i2 = 0;
        }
        if (d.mo2892j(C5582R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(d.mo2876c(C5582R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateList2 = null;
        if (d.mo2892j(C5582R.styleable.NavigationView_itemTextColor)) {
            colorStateList2 = d.mo2868a(C5582R.styleable.NavigationView_itemTextColor);
        }
        if (!z && colorStateList2 == null) {
            colorStateList2 = m33365d(16842806);
        }
        Drawable b = d.mo2875b(C5582R.styleable.NavigationView_itemBackground);
        if (b == null && m33364b(d)) {
            b = m33360a(d);
        }
        if (d.mo2892j(C5582R.styleable.NavigationView_itemHorizontalPadding)) {
            this.f19485R.mo27603d(d.mo2876c(C5582R.styleable.NavigationView_itemHorizontalPadding, 0));
        }
        int c = d.mo2876c(C5582R.styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(d.mo2880d(C5582R.styleable.NavigationView_itemMaxLines, 1));
        this.f19484Q.mo1561a((C0371a) new C6963a());
        this.f19485R.mo27600c(1);
        this.f19485R.mo1484a(context, (C0370g) this.f19484Q);
        this.f19485R.mo27590a(colorStateList);
        this.f19485R.mo27613i(getOverScrollMode());
        if (z) {
            this.f19485R.mo27611h(i2);
        }
        this.f19485R.mo27597b(colorStateList2);
        this.f19485R.mo27591a(b);
        this.f19485R.mo27605e(c);
        this.f19484Q.mo1562a((C0386n) this.f19485R);
        addView((View) this.f19485R.mo1482a((ViewGroup) this));
        if (d.mo2892j(C5582R.styleable.NavigationView_menu)) {
            mo27713c(d.mo2888g(C5582R.styleable.NavigationView_menu, 0));
        }
        if (d.mo2892j(C5582R.styleable.NavigationView_headerLayout)) {
            mo27711b(d.mo2888g(C5582R.styleable.NavigationView_headerLayout, 0));
        }
        d.mo2887f();
        m33361a();
    }

    public void setCheckedItem(@C0193h0 MenuItem menuItem) {
        MenuItem findItem = this.f19484Q.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f19485R.mo27593a((C0375j) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    /* renamed from: b */
    public View mo27711b(@C0183c0 int i) {
        return this.f19485R.mo27595b(i);
    }

    /* renamed from: b */
    public void mo27712b(@C0193h0 View view) {
        this.f19485R.mo27598b(view);
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP})
    /* renamed from: a */
    public void mo27629a(@C0193h0 C1006n0 n0Var) {
        this.f19485R.mo27594a(n0Var);
    }

    /* renamed from: a */
    public void mo27710a(@C0193h0 View view) {
        this.f19485R.mo27592a(view);
    }

    /* renamed from: a */
    public View mo27709a(int i) {
        return this.f19485R.mo27589a(i);
    }

    /* renamed from: a */
    private void m33361a() {
        this.f19490W = new C6964b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f19490W);
    }
}
