package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.appcompat.widget.C0557v0;
import androidx.core.content.C0841b;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1056z;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1017a;
import androidx.core.p034l.p035o0.C1016d.C1019c;
import androidx.core.widget.C1120m;
import com.google.android.material.C5582R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.C5622a;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.bottomnavigation.a */
/* compiled from: BottomNavigationItemView */
public class C5649a extends FrameLayout implements C0389a {

    /* renamed from: d0 */
    public static final int f16200d0 = -1;

    /* renamed from: e0 */
    private static final int[] f16201e0 = {16842912};

    /* renamed from: N */
    private float f16202N;

    /* renamed from: O */
    private float f16203O;

    /* renamed from: P */
    private int f16204P;

    /* renamed from: Q */
    private boolean f16205Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public ImageView f16206R;

    /* renamed from: S */
    private final TextView f16207S;

    /* renamed from: T */
    private final TextView f16208T;

    /* renamed from: U */
    private int f16209U;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: V */
    public C0375j f16210V;
    @C0195i0

    /* renamed from: W */
    private ColorStateList f16211W;

    /* renamed from: a */
    private final int f16212a;
    @C0195i0

    /* renamed from: a0 */
    private Drawable f16213a0;

    /* renamed from: b */
    private float f16214b;
    @C0195i0

    /* renamed from: b0 */
    private Drawable f16215b0;
    /* access modifiers changed from: private */
    @C0195i0

    /* renamed from: c0 */
    public BadgeDrawable f16216c0;

    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    /* compiled from: BottomNavigationItemView */
    class C5650a implements OnLayoutChangeListener {
        C5650a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (C5649a.this.f16206R.getVisibility() == 0) {
                C5649a aVar = C5649a.this;
                aVar.m24668d(aVar.f16206R);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.a$b */
    /* compiled from: BottomNavigationItemView */
    class C5651b extends C0947a {
        C5651b() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            if (C5649a.this.f16216c0 != null && C5649a.this.f16216c0.isVisible()) {
                CharSequence title = C5649a.this.f16210V.getTitle();
                if (!TextUtils.isEmpty(C5649a.this.f16210V.getContentDescription())) {
                    title = C5649a.this.f16210V.getContentDescription();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(title);
                sb.append(", ");
                sb.append(C5649a.this.f16216c0.mo22263f());
                dVar.mo4948b((CharSequence) sb.toString());
            }
            dVar.mo4949b((Object) C1019c.m5966a(0, 1, C5649a.this.getItemPosition(), 1, false, C5649a.this.isSelected()));
            if (C5649a.this.isSelected()) {
                dVar.mo4976e(false);
                dVar.mo4953b(C1017a.f4617k);
            }
        }
    }

    public C5649a(@C0193h0 Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private boolean m24669d() {
        return this.f16216c0 != null;
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

    /* access modifiers changed from: 0000 */
    @C0195i0
    public BadgeDrawable getBadge() {
        return this.f16216c0;
    }

    public C0375j getItemData() {
        return this.f16210V;
    }

    public int getItemPosition() {
        return this.f16209U;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0375j jVar = this.f16210V;
        if (jVar != null && jVar.isCheckable() && this.f16210V.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f16201e0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: 0000 */
    public void setBadge(@C0193h0 BadgeDrawable badgeDrawable) {
        this.f16216c0 = badgeDrawable;
        ImageView imageView = this.f16206R;
        if (imageView != null) {
            m24665b((View) imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.f16208T;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f16208T;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f16207S;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f16207S;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f16204P;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    m24662a(this.f16206R, this.f16212a, 49);
                    m24661a(this.f16208T, 1.0f, 1.0f, 0);
                } else {
                    m24662a(this.f16206R, this.f16212a, 17);
                    m24661a(this.f16208T, 0.5f, 0.5f, 4);
                }
                this.f16207S.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    m24662a(this.f16206R, this.f16212a, 17);
                    this.f16208T.setVisibility(8);
                    this.f16207S.setVisibility(8);
                }
            } else if (z) {
                m24662a(this.f16206R, (int) (((float) this.f16212a) + this.f16214b), 49);
                m24661a(this.f16208T, 1.0f, 1.0f, 0);
                TextView textView5 = this.f16207S;
                float f = this.f16202N;
                m24661a(textView5, f, f, 4);
            } else {
                m24662a(this.f16206R, this.f16212a, 49);
                TextView textView6 = this.f16208T;
                float f2 = this.f16203O;
                m24661a(textView6, f2, f2, 4);
                m24661a(this.f16207S, 1.0f, 1.0f, 0);
            }
        } else if (this.f16205Q) {
            if (z) {
                m24662a(this.f16206R, this.f16212a, 49);
                m24661a(this.f16208T, 1.0f, 1.0f, 0);
            } else {
                m24662a(this.f16206R, this.f16212a, 17);
                m24661a(this.f16208T, 0.5f, 0.5f, 4);
            }
            this.f16207S.setVisibility(4);
        } else if (z) {
            m24662a(this.f16206R, (int) (((float) this.f16212a) + this.f16214b), 49);
            m24661a(this.f16208T, 1.0f, 1.0f, 0);
            TextView textView7 = this.f16207S;
            float f3 = this.f16202N;
            m24661a(textView7, f3, f3, 4);
        } else {
            m24662a(this.f16206R, this.f16212a, 49);
            TextView textView8 = this.f16208T;
            float f4 = this.f16203O;
            m24661a(textView8, f4, f4, 4);
            m24661a(this.f16207S, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f16207S.setEnabled(z);
        this.f16208T.setEnabled(z);
        this.f16206R.setEnabled(z);
        if (z) {
            C0962e0.m5449a((View) this, C1056z.m6138a(getContext(), 1002));
        } else {
            C0962e0.m5449a((View) this, (C1056z) null);
        }
    }

    public void setIcon(@C0195i0 Drawable drawable) {
        if (drawable != this.f16213a0) {
            this.f16213a0 = drawable;
            if (drawable != null) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0892a.m5161i(drawable).mutate();
                this.f16215b0 = drawable;
                ColorStateList colorStateList = this.f16211W;
                if (colorStateList != null) {
                    C0892a.m5146a(this.f16215b0, colorStateList);
                }
            }
            this.f16206R.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f16206R.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f16206R.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f16211W = colorStateList;
        if (this.f16210V != null) {
            Drawable drawable = this.f16215b0;
            if (drawable != null) {
                C0892a.m5146a(drawable, this.f16211W);
                this.f16215b0.invalidateSelf();
            }
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : C0841b.m4928c(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.f16209U = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f16204P != i) {
            this.f16204P = i;
            if (this.f16210V != null) {
                setChecked(this.f16210V.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.f16205Q != z) {
            this.f16205Q = z;
            if (this.f16210V != null) {
                setChecked(this.f16210V.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(@C0216r0 int i) {
        C1120m.m6391e(this.f16208T, i);
        m24660a(this.f16207S.getTextSize(), this.f16208T.getTextSize());
    }

    public void setTextAppearanceInactive(@C0216r0 int i) {
        C1120m.m6391e(this.f16207S, i);
        m24660a(this.f16207S.getTextSize(), this.f16208T.getTextSize());
    }

    public void setTextColor(@C0195i0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f16207S.setTextColor(colorStateList);
            this.f16208T.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f16207S.setText(charSequence);
        this.f16208T.setText(charSequence);
        C0375j jVar = this.f16210V;
        if (jVar == null || TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0375j jVar2 = this.f16210V;
        if (jVar2 != null && !TextUtils.isEmpty(jVar2.getTooltipText())) {
            charSequence = this.f16210V.getTooltipText();
        }
        C0557v0.m3031a(this, charSequence);
    }

    public C5649a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m24665b(@C0195i0 View view) {
        if (m24669d() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            C5622a.m24509a(this.f16216c0, view, m24658a(view));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m24668d(View view) {
        if (m24669d()) {
            C5622a.m24511c(this.f16216c0, view, m24658a(view));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo22404c() {
        m24667c((View) this.f16206R);
    }

    public C5649a(@C0193h0 Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16209U = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C5582R.layout.design_bottom_navigation_item, this, true);
        setBackgroundResource(C5582R.C5585drawable.design_bottom_navigation_item_background);
        this.f16212a = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_margin);
        this.f16206R = (ImageView) findViewById(C5582R.C5586id.icon);
        this.f16207S = (TextView) findViewById(C5582R.C5586id.smallLabel);
        this.f16208T = (TextView) findViewById(C5582R.C5586id.largeLabel);
        C0962e0.m5531l((View) this.f16207S, 2);
        C0962e0.m5531l((View) this.f16208T, 2);
        setFocusable(true);
        m24660a(this.f16207S.getTextSize(), this.f16208T.getTextSize());
        ImageView imageView = this.f16206R;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new C5650a());
        }
        C0962e0.m5443a((View) this, (C0947a) new C5651b());
    }

    /* renamed from: c */
    private void m24667c(@C0195i0 View view) {
        if (m24669d()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                C5622a.m24510b(this.f16216c0, view, m24658a(view));
            }
            this.f16216c0 = null;
        }
    }

    /* renamed from: a */
    public void mo1387a(@C0193h0 C0375j jVar, int i) {
        CharSequence charSequence;
        this.f16210V = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(jVar.getTooltipText())) {
            charSequence = jVar.getTooltipText();
        } else {
            charSequence = jVar.getTitle();
        }
        C0557v0.m3031a(this, charSequence);
        setVisibility(jVar.isVisible() ? 0 : 8);
    }

    public void setItemBackground(@C0195i0 Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0962e0.m5440a((View) this, drawable);
    }

    /* renamed from: a */
    private void m24662a(@C0193h0 View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private void m24661a(@C0193h0 View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m24660a(float f, float f2) {
        this.f16214b = f - f2;
        this.f16202N = (f2 * 1.0f) / f;
        this.f16203O = (f * 1.0f) / f2;
    }

    @C0195i0
    /* renamed from: a */
    private FrameLayout m24658a(View view) {
        ImageView imageView = this.f16206R;
        if (view != imageView || !C5622a.f16090a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }
}
