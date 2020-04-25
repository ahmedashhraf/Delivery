package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0209o;
import androidx.annotation.C0211p;
import androidx.annotation.C0213q;
import androidx.annotation.C0216r0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0225w;
import androidx.annotation.RequiresApi;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.widget.C0549t0;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.C5582R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6928p;
import com.google.android.material.internal.C6936w;
import com.google.android.material.internal.C6936w.C6941e;
import com.google.android.material.internal.C6936w.C6942f;
import com.google.android.material.p187p.C6978j;
import com.google.android.material.p187p.C6982k;
import com.google.android.material.p302m.C6952c;
import com.google.android.material.p303n.C6961b;
import com.google.android.material.theme.p307a.C7109a;

public class BottomNavigationView extends FrameLayout {

    /* renamed from: S */
    private static final int f16188S = C5582R.style.Widget_Design_BottomNavigationView;

    /* renamed from: T */
    private static final int f16189T = 1;

    /* renamed from: N */
    private final BottomNavigationPresenter f16190N;
    @C0195i0

    /* renamed from: O */
    private ColorStateList f16191O;

    /* renamed from: P */
    private MenuInflater f16192P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C5648d f16193Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C5647c f16194R;
    @C0193h0

    /* renamed from: a */
    private final C0370g f16195a;
    @C0193h0
    @C0224v0

    /* renamed from: b */
    final C5653c f16196b;

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C5644a();
        @C0195i0

        /* renamed from: a */
        Bundle f16197a;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$a */
        static class C5644a implements ClassLoaderCreator<SavedState> {
            C5644a() {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m24652a(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            this.f16197a = parcel.readBundle(classLoader);
        }

        public void writeToParcel(@C0193h0 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f16197a);
        }

        public SavedState(@C0193h0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = SavedState.class.getClassLoader();
            }
            m24652a(parcel, classLoader);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$a */
    class C5645a implements C0371a {
        C5645a() {
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, @C0193h0 MenuItem menuItem) {
            boolean z = true;
            if (BottomNavigationView.this.f16194R == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                if (BottomNavigationView.this.f16193Q == null || BottomNavigationView.this.f16193Q.mo22403a(menuItem)) {
                    z = false;
                }
                return z;
            }
            BottomNavigationView.this.f16194R.mo22402a(menuItem);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$b */
    class C5646b implements C6941e {
        C5646b() {
        }

        @C0193h0
        /* renamed from: a */
        public C1006n0 mo22334a(View view, @C0193h0 C1006n0 n0Var, @C0193h0 C6942f fVar) {
            fVar.f19416d += n0Var.mo4885i();
            fVar.mo27675a(view);
            return n0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$c */
    public interface C5647c {
        /* renamed from: a */
        void mo22402a(@C0193h0 MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$d */
    public interface C5648d {
        /* renamed from: a */
        boolean mo22403a(@C0193h0 MenuItem menuItem);
    }

    public BottomNavigationView(@C0193h0 Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.f16192P == null) {
            this.f16192P = new C0345g(getContext());
        }
        return this.f16192P;
    }

    /* renamed from: c */
    public void mo22367c(int i) {
        this.f16190N.mo22359b(true);
        getMenuInflater().inflate(i, this.f16195a);
        this.f16190N.mo22359b(false);
        this.f16190N.mo1489a(true);
    }

    /* renamed from: d */
    public void mo22368d(int i) {
        this.f16196b.mo22427e(i);
    }

    @C0195i0
    public Drawable getItemBackground() {
        return this.f16196b.getItemBackground();
    }

    @Deprecated
    @C0213q
    public int getItemBackgroundResource() {
        return this.f16196b.getItemBackgroundRes();
    }

    @C0211p
    public int getItemIconSize() {
        return this.f16196b.getItemIconSize();
    }

    @C0195i0
    public ColorStateList getItemIconTintList() {
        return this.f16196b.getIconTintList();
    }

    @C0195i0
    public ColorStateList getItemRippleColor() {
        return this.f16191O;
    }

    @C0216r0
    public int getItemTextAppearanceActive() {
        return this.f16196b.getItemTextAppearanceActive();
    }

    @C0216r0
    public int getItemTextAppearanceInactive() {
        return this.f16196b.getItemTextAppearanceInactive();
    }

    @C0195i0
    public ColorStateList getItemTextColor() {
        return this.f16196b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f16196b.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @C0193h0
    public Menu getMenu() {
        return this.f16195a;
    }

    @C0225w
    public int getSelectedItemId() {
        return this.f16196b.getSelectedItemId();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C6982k.m33513a((View) this);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f16195a.mo1581b(savedState.f16197a);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f16197a = new Bundle();
        this.f16195a.mo1595d(savedState.f16197a);
        return savedState;
    }

    @RequiresApi(21)
    public void setElevation(float f) {
        super.setElevation(f);
        C6982k.m33514a((View) this, f);
    }

    public void setItemBackground(@C0195i0 Drawable drawable) {
        this.f16196b.setItemBackground(drawable);
        this.f16191O = null;
    }

    public void setItemBackgroundResource(@C0213q int i) {
        this.f16196b.setItemBackgroundRes(i);
        this.f16191O = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f16196b.mo22423b() != z) {
            this.f16196b.setItemHorizontalTranslationEnabled(z);
            this.f16190N.mo1489a(false);
        }
    }

    public void setItemIconSize(@C0211p int i) {
        this.f16196b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@C0209o int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@C0195i0 ColorStateList colorStateList) {
        this.f16196b.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(@C0195i0 ColorStateList colorStateList) {
        if (this.f16191O == colorStateList) {
            if (colorStateList == null && this.f16196b.getItemBackground() != null) {
                this.f16196b.setItemBackground(null);
            }
            return;
        }
        this.f16191O = colorStateList;
        if (colorStateList == null) {
            this.f16196b.setItemBackground(null);
        } else {
            ColorStateList a = C6961b.m33357a(colorStateList);
            if (VERSION.SDK_INT >= 21) {
                this.f16196b.setItemBackground(new RippleDrawable(a, null, null));
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(1.0E-5f);
                Drawable i = C0892a.m5161i(gradientDrawable);
                C0892a.m5146a(i, a);
                this.f16196b.setItemBackground(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@C0216r0 int i) {
        this.f16196b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(@C0216r0 int i) {
        this.f16196b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@C0195i0 ColorStateList colorStateList) {
        this.f16196b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f16196b.getLabelVisibilityMode() != i) {
            this.f16196b.setLabelVisibilityMode(i);
            this.f16190N.mo1489a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@C0195i0 C5647c cVar) {
        this.f16194R = cVar;
    }

    public void setOnNavigationItemSelectedListener(@C0195i0 C5648d dVar) {
        this.f16193Q = dVar;
    }

    public void setSelectedItemId(@C0225w int i) {
        MenuItem findItem = this.f16195a.findItem(i);
        if (findItem != null && !this.f16195a.mo1567a(findItem, (C0386n) this.f16190N, 0)) {
            findItem.setChecked(true);
        }
    }

    public BottomNavigationView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C5582R.attr.bottomNavigationStyle);
    }

    /* renamed from: b */
    private void m24646b() {
        C6936w.m33297a((View) this, (C6941e) new C5646b());
    }

    /* renamed from: a */
    public boolean mo22365a() {
        return this.f16196b.mo22423b();
    }

    public BottomNavigationView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(C7109a.m34252b(context, attributeSet, i, f16188S), attributeSet, i);
        this.f16190N = new BottomNavigationPresenter();
        Context context2 = getContext();
        this.f16195a = new C5652b(context2);
        this.f16196b = new C5653c(context2);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f16196b.setLayoutParams(layoutParams);
        this.f16190N.mo22358a(this.f16196b);
        this.f16190N.mo22357a(1);
        this.f16196b.setPresenter(this.f16190N);
        this.f16195a.mo1562a((C0386n) this.f16190N);
        this.f16190N.mo1484a(getContext(), this.f16195a);
        C0549t0 d = C6928p.m33266d(context2, attributeSet, C5582R.styleable.BottomNavigationView, i, C5582R.style.Widget_Design_BottomNavigationView, C5582R.styleable.BottomNavigationView_itemTextAppearanceInactive, C5582R.styleable.BottomNavigationView_itemTextAppearanceActive);
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_itemIconTint)) {
            this.f16196b.setIconTintList(d.mo2868a(C5582R.styleable.BottomNavigationView_itemIconTint));
        } else {
            C5653c cVar = this.f16196b;
            cVar.setIconTintList(cVar.mo22420a(16842808));
        }
        setItemIconSize(d.mo2876c(C5582R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_icon_size)));
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(d.mo2888g(C5582R.styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(d.mo2888g(C5582R.styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(d.mo2868a(C5582R.styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0962e0.m5440a((View) this, (Drawable) m24645b(context2));
        }
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_elevation)) {
            C0962e0.m5472b((View) this, (float) d.mo2876c(C5582R.styleable.BottomNavigationView_elevation, 0));
        }
        C0892a.m5146a(getBackground().mutate(), C6952c.m33333a(context2, d, C5582R.styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(d.mo2883e(C5582R.styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(d.mo2871a(C5582R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int g = d.mo2888g(C5582R.styleable.BottomNavigationView_itemBackground, 0);
        if (g != 0) {
            this.f16196b.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(C6952c.m33333a(context2, d, C5582R.styleable.BottomNavigationView_itemRippleColor));
        }
        if (d.mo2892j(C5582R.styleable.BottomNavigationView_menu)) {
            mo22367c(d.mo2888g(C5582R.styleable.BottomNavigationView_menu, 0));
        }
        d.mo2887f();
        addView(this.f16196b, layoutParams);
        if (VERSION.SDK_INT < 21) {
            m24643a(context2);
        }
        this.f16195a.mo1561a((C0371a) new C5645a());
        m24646b();
    }

    @C0193h0
    /* renamed from: b */
    private C6978j m24645b(Context context) {
        C6978j jVar = new C6978j();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            jVar.mo27790a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        jVar.mo27789a(context);
        return jVar;
    }

    @C0195i0
    /* renamed from: a */
    public BadgeDrawable mo22364a(int i) {
        return this.f16196b.mo22424c(i);
    }

    /* renamed from: a */
    private void m24643a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(C0841b.m4915a(context, C5582R.C5584color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new LayoutParams(-1, getResources().getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    /* renamed from: b */
    public BadgeDrawable mo22366b(int i) {
        return this.f16196b.mo22426d(i);
    }
}
