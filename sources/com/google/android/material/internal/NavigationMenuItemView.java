package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.appcompat.widget.C0490e0.C0492b;
import androidx.appcompat.widget.C0557v0;
import androidx.core.content.p020h.C0874g;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.widget.C1120m;
import com.google.android.material.C5582R;

@C0207n0({C0208a.LIBRARY_GROUP})
public class NavigationMenuItemView extends C6899f implements C0389a {

    /* renamed from: F0 */
    private static final int[] f19239F0 = {16842912};

    /* renamed from: A0 */
    private C0375j f19240A0;

    /* renamed from: B0 */
    private ColorStateList f19241B0;

    /* renamed from: C0 */
    private boolean f19242C0;

    /* renamed from: D0 */
    private Drawable f19243D0;

    /* renamed from: E0 */
    private final C0947a f19244E0;

    /* renamed from: v0 */
    private int f19245v0;

    /* renamed from: w0 */
    private boolean f19246w0;

    /* renamed from: x0 */
    boolean f19247x0;

    /* renamed from: y0 */
    private final CheckedTextView f19248y0;

    /* renamed from: z0 */
    private FrameLayout f19249z0;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    class C6889a extends C0947a {
        C6889a() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4962c(NavigationMenuItemView.this.f19247x0);
        }
    }

    public NavigationMenuItemView(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: h */
    private void m33080h() {
        if (m33082j()) {
            this.f19248y0.setVisibility(8);
            FrameLayout frameLayout = this.f19249z0;
            if (frameLayout != null) {
                C0492b bVar = (C0492b) frameLayout.getLayoutParams();
                bVar.width = -1;
                this.f19249z0.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.f19248y0.setVisibility(0);
        FrameLayout frameLayout2 = this.f19249z0;
        if (frameLayout2 != null) {
            C0492b bVar2 = (C0492b) frameLayout2.getLayoutParams();
            bVar2.width = -2;
            this.f19249z0.setLayoutParams(bVar2);
        }
    }

    @C0195i0
    /* renamed from: i */
    private StateListDrawable m33081i() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C0238R.attr.colorControlHighlight, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f19239F0, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: j */
    private boolean m33082j() {
        return this.f19240A0.getTitle() == null && this.f19240A0.getIcon() == null && this.f19240A0.getActionView() != null;
    }

    private void setActionView(@C0195i0 View view) {
        if (view != null) {
            if (this.f19249z0 == null) {
                this.f19249z0 = (FrameLayout) ((ViewStub) findViewById(C5582R.C5586id.design_menu_item_action_area_stub)).inflate();
            }
            this.f19249z0.removeAllViews();
            this.f19249z0.addView(view);
        }
    }

    /* renamed from: a */
    public void mo1387a(@C0193h0 C0375j jVar, int i) {
        this.f19240A0 = jVar;
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C0962e0.m5440a((View) this, (Drawable) m33081i());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C0557v0.m3031a(this, jVar.getTooltipText());
        m33080h();
    }

    /* renamed from: a */
    public void mo1388a(boolean z, char c) {
    }

    /* renamed from: a */
    public boolean mo1389a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1390b() {
        return true;
    }

    /* renamed from: g */
    public void mo27510g() {
        FrameLayout frameLayout = this.f19249z0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f19248y0.setCompoundDrawables(null, null, null, null);
    }

    public C0375j getItemData() {
        return this.f19240A0;
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0375j jVar = this.f19240A0;
        if (jVar != null && jVar.isCheckable() && this.f19240A0.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f19239F0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f19247x0 != z) {
            this.f19247x0 = z;
            this.f19244E0.mo4748a((View) this.f19248y0, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f19248y0.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(@C0195i0 Drawable drawable) {
        if (drawable != null) {
            if (this.f19242C0) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0892a.m5161i(drawable).mutate();
                C0892a.m5146a(drawable, this.f19241B0);
            }
            int i = this.f19245v0;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f19246w0) {
            if (this.f19243D0 == null) {
                this.f19243D0 = C0874g.m5058c(getResources(), C5582R.C5585drawable.navigation_empty_icon, getContext().getTheme());
                Drawable drawable2 = this.f19243D0;
                if (drawable2 != null) {
                    int i2 = this.f19245v0;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f19243D0;
        }
        C1120m.m6376a((TextView) this.f19248y0, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i) {
        this.f19248y0.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@C0211p int i) {
        this.f19245v0 = i;
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        this.f19241B0 = colorStateList;
        this.f19242C0 = this.f19241B0 != null;
        C0375j jVar = this.f19240A0;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f19248y0.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f19246w0 = z;
    }

    public void setTextAppearance(int i) {
        C1120m.m6391e(this.f19248y0, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f19248y0.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f19248y0.setText(charSequence);
    }

    public NavigationMenuItemView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19244E0 = new C6889a();
        setOrientation(0);
        LayoutInflater.from(context).inflate(C5582R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C5582R.dimen.design_navigation_icon_size));
        this.f19248y0 = (CheckedTextView) findViewById(C5582R.C5586id.design_menu_item_text);
        this.f19248y0.setDuplicateParentStateEnabled(true);
        C0962e0.m5443a((View) this.f19248y0, this.f19244E0);
    }
}
