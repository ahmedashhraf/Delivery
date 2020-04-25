package com.google.android.material.bottomnavigation;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0216r0;
import androidx.annotation.C0224v0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0388o;
import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0943c;
import androidx.core.p034l.C0947a;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1018b;
import androidx.transition.C1833c;
import androidx.transition.C1880f0;
import androidx.transition.C1906i0;
import androidx.transition.C1913k0;
import com.google.android.material.C5582R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.C6926o;
import java.util.HashSet;
import p053b.p065e.p066b.p067a.C2117b;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.bottomnavigation.c */
/* compiled from: BottomNavigationMenuView */
public class C5653c extends ViewGroup implements C0388o {

    /* renamed from: n0 */
    private static final long f16220n0 = 115;

    /* renamed from: o0 */
    private static final int f16221o0 = 5;

    /* renamed from: p0 */
    private static final int[] f16222p0 = {16842912};

    /* renamed from: q0 */
    private static final int[] f16223q0 = {-16842910};

    /* renamed from: N */
    private final int f16224N;

    /* renamed from: O */
    private final int f16225O;

    /* renamed from: P */
    private final int f16226P;

    /* renamed from: Q */
    private final int f16227Q;
    @C0193h0

    /* renamed from: R */
    private final OnClickListener f16228R;

    /* renamed from: S */
    private final C0941a<C5649a> f16229S;

    /* renamed from: T */
    private boolean f16230T;

    /* renamed from: U */
    private int f16231U;
    @C0195i0

    /* renamed from: V */
    private C5649a[] f16232V;

    /* renamed from: W */
    private int f16233W;
    @C0193h0

    /* renamed from: a */
    private final C1913k0 f16234a;

    /* renamed from: a0 */
    private int f16235a0;

    /* renamed from: b */
    private final int f16236b;

    /* renamed from: b0 */
    private ColorStateList f16237b0;
    @C0211p

    /* renamed from: c0 */
    private int f16238c0;

    /* renamed from: d0 */
    private ColorStateList f16239d0;
    @C0195i0

    /* renamed from: e0 */
    private final ColorStateList f16240e0;
    @C0216r0

    /* renamed from: f0 */
    private int f16241f0;
    @C0216r0

    /* renamed from: g0 */
    private int f16242g0;

    /* renamed from: h0 */
    private Drawable f16243h0;

    /* renamed from: i0 */
    private int f16244i0;

    /* renamed from: j0 */
    private int[] f16245j0;
    @C0193h0

    /* renamed from: k0 */
    private SparseArray<BadgeDrawable> f16246k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public BottomNavigationPresenter f16247l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public C0370g f16248m0;

    /* renamed from: com.google.android.material.bottomnavigation.c$a */
    /* compiled from: BottomNavigationMenuView */
    class C5654a implements OnClickListener {
        C5654a() {
        }

        public void onClick(View view) {
            C0375j itemData = ((C5649a) view).getItemData();
            if (!C5653c.this.f16248m0.mo1567a((MenuItem) itemData, (C0386n) C5653c.this.f16247l0, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.c$b */
    /* compiled from: BottomNavigationMenuView */
    class C5655b extends C0947a {
        C5655b() {
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4939a((Object) C1018b.m5960a(1, C5653c.this.f16248m0.mo1615o().size(), false, 1));
        }
    }

    public C5653c(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private boolean m24678a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m24681g(int i) {
        return i != -1;
    }

    private C5649a getNewItem() {
        C5649a aVar = (C5649a) this.f16229S.mo4743a();
        return aVar == null ? new C5649a(getContext()) : aVar;
    }

    /* renamed from: h */
    private void m24682h(int i) {
        if (!m24681g(i)) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not a valid view id");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void setBadgeIfNeeded(@C0193h0 C5649a aVar) {
        int id = aVar.getId();
        if (m24681g(id)) {
            BadgeDrawable badgeDrawable = (BadgeDrawable) this.f16246k0.get(id);
            if (badgeDrawable != null) {
                aVar.setBadge(badgeDrawable);
            }
        }
    }

    /* renamed from: c */
    public void mo22425c() {
        C0370g gVar = this.f16248m0;
        if (!(gVar == null || this.f16232V == null)) {
            int size = gVar.size();
            if (size != this.f16232V.length) {
                mo22421a();
                return;
            }
            int i = this.f16233W;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = this.f16248m0.getItem(i2);
                if (item.isChecked()) {
                    this.f16233W = item.getItemId();
                    this.f16235a0 = i2;
                }
            }
            if (i != this.f16233W) {
                C1906i0.m10073a((ViewGroup) this, (C1880f0) this.f16234a);
            }
            boolean a = m24678a(this.f16231U, this.f16248m0.mo1615o().size());
            for (int i3 = 0; i3 < size; i3++) {
                this.f16247l0.mo22359b(true);
                this.f16232V[i3].setLabelVisibilityMode(this.f16231U);
                this.f16232V[i3].setShifting(a);
                this.f16232V[i3].mo1387a((C0375j) this.f16248m0.getItem(i3), 0);
                this.f16247l0.mo22359b(false);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public BadgeDrawable mo22426d(int i) {
        m24682h(i);
        BadgeDrawable badgeDrawable = (BadgeDrawable) this.f16246k0.get(i);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.m24470a(getContext());
            this.f16246k0.put(i, badgeDrawable);
        }
        C5649a b = mo22422b(i);
        if (b != null) {
            b.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo22427e(int i) {
        m24682h(i);
        BadgeDrawable badgeDrawable = (BadgeDrawable) this.f16246k0.get(i);
        C5649a b = mo22422b(i);
        if (b != null) {
            b.mo22404c();
        }
        if (badgeDrawable != null) {
            this.f16246k0.remove(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo22428f(int i) {
        int size = this.f16248m0.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.f16248m0.getItem(i2);
            if (i == item.getItemId()) {
                this.f16233W = i;
                this.f16235a0 = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f16246k0;
    }

    @C0195i0
    public ColorStateList getIconTintList() {
        return this.f16237b0;
    }

    @C0195i0
    public Drawable getItemBackground() {
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr == null || aVarArr.length <= 0) {
            return this.f16243h0;
        }
        return aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f16244i0;
    }

    @C0211p
    public int getItemIconSize() {
        return this.f16238c0;
    }

    @C0216r0
    public int getItemTextAppearanceActive() {
        return this.f16242g0;
    }

    @C0216r0
    public int getItemTextAppearanceInactive() {
        return this.f16241f0;
    }

    public ColorStateList getItemTextColor() {
        return this.f16239d0;
    }

    public int getLabelVisibilityMode() {
        return this.f16231U;
    }

    public int getSelectedItemId() {
        return this.f16233W;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C0962e0.m5566x(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int size2 = this.f16248m0.mo1615o().size();
        int childCount = getChildCount();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f16227Q, C6637f.f18605b);
        if (!m24678a(this.f16231U, size2) || !this.f16230T) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.f16225O);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.f16245j0;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.f16245j0[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.f16235a0);
            int i5 = this.f16226P;
            if (childAt.getVisibility() != 8) {
                childAt.measure(MeasureSpec.makeMeasureSpec(this.f16225O, Integer.MIN_VALUE), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f16224N * i6), Math.min(i5, this.f16225O));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f16236b);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.f16245j0[i9] = i9 == this.f16235a0 ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.f16245j0;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f16245j0[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(MeasureSpec.makeMeasureSpec(this.f16245j0[i11], C6637f.f18605b), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, MeasureSpec.makeMeasureSpec(i10, C6637f.f18605b), 0), View.resolveSizeAndState(this.f16227Q, makeMeasureSpec, 0));
    }

    /* access modifiers changed from: 0000 */
    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f16246k0 = sparseArray;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a aVar : aVarArr) {
                aVar.setBadge((BadgeDrawable) sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f16237b0 = colorStateList;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a iconTintList : aVarArr) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(@C0195i0 Drawable drawable) {
        this.f16243h0 = drawable;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a itemBackground : aVarArr) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f16244i0 = i;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a itemBackground : aVarArr) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f16230T = z;
    }

    public void setItemIconSize(@C0211p int i) {
        this.f16238c0 = i;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a iconSize : aVarArr) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@C0216r0 int i) {
        this.f16242g0 = i;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f16239d0;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@C0216r0 int i) {
        this.f16241f0 = i;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f16239d0;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f16239d0 = colorStateList;
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a textColor : aVarArr) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f16231U = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f16247l0 = bottomNavigationPresenter;
    }

    public C5653c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16229S = new C0943c(5);
        this.f16233W = 0;
        this.f16235a0 = 0;
        this.f16246k0 = new SparseArray<>(5);
        Resources resources = getResources();
        this.f16236b = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_item_max_width);
        this.f16224N = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_item_min_width);
        this.f16225O = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_active_item_max_width);
        this.f16226P = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_active_item_min_width);
        this.f16227Q = resources.getDimensionPixelSize(C5582R.dimen.design_bottom_navigation_height);
        this.f16240e0 = mo22420a(16842808);
        this.f16234a = new C1833c();
        this.f16234a.mo8426d(0);
        this.f16234a.mo8320a((long) f16220n0);
        this.f16234a.mo8321a((TimeInterpolator) new C2117b());
        this.f16234a.mo8424a((C1880f0) new C6926o());
        this.f16228R = new C5654a();
        this.f16245j0 = new int[5];
        C0962e0.m5443a((View) this, (C0947a) new C5655b());
        C0962e0.m5531l((View) this, 1);
    }

    /* renamed from: a */
    public void mo1411a(C0370g gVar) {
        this.f16248m0 = gVar;
    }

    /* renamed from: b */
    public boolean mo22423b() {
        return this.f16230T;
    }

    @C0195i0
    /* renamed from: a */
    public ColorStateList mo22420a(int i) {
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
        return new ColorStateList(new int[][]{f16223q0, f16222p0, ViewGroup.EMPTY_STATE_SET}, new int[]{b.getColorForState(f16223q0, defaultColor), i2, defaultColor});
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    @C0195i0
    /* renamed from: b */
    public C5649a mo22422b(int i) {
        m24682h(i);
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a aVar : aVarArr) {
                if (aVar.getId() == i) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m24680d() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f16248m0.size(); i++) {
            hashSet.add(Integer.valueOf(this.f16248m0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f16246k0.size(); i2++) {
            int keyAt = this.f16246k0.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f16246k0.delete(keyAt);
            }
        }
    }

    /* renamed from: a */
    public void mo22421a() {
        removeAllViews();
        C5649a[] aVarArr = this.f16232V;
        if (aVarArr != null) {
            for (C5649a aVar : aVarArr) {
                if (aVar != null) {
                    this.f16229S.release(aVar);
                    aVar.mo22404c();
                }
            }
        }
        if (this.f16248m0.size() == 0) {
            this.f16233W = 0;
            this.f16235a0 = 0;
            this.f16232V = null;
            return;
        }
        m24680d();
        this.f16232V = new C5649a[this.f16248m0.size()];
        boolean a = m24678a(this.f16231U, this.f16248m0.mo1615o().size());
        for (int i = 0; i < this.f16248m0.size(); i++) {
            this.f16247l0.mo22359b(true);
            this.f16248m0.getItem(i).setCheckable(true);
            this.f16247l0.mo22359b(false);
            C5649a newItem = getNewItem();
            this.f16232V[i] = newItem;
            newItem.setIconTintList(this.f16237b0);
            newItem.setIconSize(this.f16238c0);
            newItem.setTextColor(this.f16240e0);
            newItem.setTextAppearanceInactive(this.f16241f0);
            newItem.setTextAppearanceActive(this.f16242g0);
            newItem.setTextColor(this.f16239d0);
            Drawable drawable = this.f16243h0;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f16244i0);
            }
            newItem.setShifting(a);
            newItem.setLabelVisibilityMode(this.f16231U);
            newItem.mo1387a((C0375j) this.f16248m0.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.f16228R);
            if (this.f16233W != 0 && this.f16248m0.getItem(i).getItemId() == this.f16233W) {
                this.f16235a0 = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        this.f16235a0 = Math.min(this.f16248m0.size() - 1, this.f16235a0);
        this.f16248m0.getItem(this.f16235a0).setChecked(true);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: c */
    public BadgeDrawable mo22424c(int i) {
        return (BadgeDrawable) this.f16246k0.get(i);
    }
}
