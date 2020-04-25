package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0216r0;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0370g.C0372b;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.widget.C0490e0.C0492b;
import p076c.p112d.p148d.p150g.C6637f;

public class ActionMenuView extends C0490e0 implements C0372b, C0388o {

    /* renamed from: B0 */
    private static final String f1552B0 = "ActionMenuView";

    /* renamed from: C0 */
    static final int f1553C0 = 56;

    /* renamed from: D0 */
    static final int f1554D0 = 4;

    /* renamed from: A0 */
    C0415e f1555A0;

    /* renamed from: p0 */
    private C0370g f1556p0;

    /* renamed from: q0 */
    private Context f1557q0;

    /* renamed from: r0 */
    private int f1558r0;

    /* renamed from: s0 */
    private boolean f1559s0;

    /* renamed from: t0 */
    private ActionMenuPresenter f1560t0;

    /* renamed from: u0 */
    private C0387a f1561u0;

    /* renamed from: v0 */
    C0371a f1562v0;

    /* renamed from: w0 */
    private boolean f1563w0;

    /* renamed from: x0 */
    private int f1564x0;

    /* renamed from: y0 */
    private int f1565y0;

    /* renamed from: z0 */
    private int f1566z0;

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface C0411a {
        /* renamed from: c */
        boolean mo1391c();

        /* renamed from: d */
        boolean mo1392d();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    private static class C0412b implements C0387a {
        C0412b() {
        }

        /* renamed from: a */
        public void mo872a(C0370g gVar, boolean z) {
        }

        /* renamed from: a */
        public boolean mo873a(C0370g gVar) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0413c extends C0492b {
        @ExportedProperty

        /* renamed from: c */
        public boolean f1567c;
        @ExportedProperty

        /* renamed from: d */
        public int f1568d;
        @ExportedProperty

        /* renamed from: e */
        public int f1569e;
        @ExportedProperty

        /* renamed from: f */
        public boolean f1570f;
        @ExportedProperty

        /* renamed from: g */
        public boolean f1571g;

        /* renamed from: h */
        boolean f1572h;

        public C0413c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0413c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0413c(C0413c cVar) {
            super((LayoutParams) cVar);
            this.f1567c = cVar.f1567c;
        }

        public C0413c(int i, int i2) {
            super(i, i2);
            this.f1567c = false;
        }

        C0413c(int i, int i2, boolean z) {
            super(i, i2);
            this.f1567c = z;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    private class C0414d implements C0371a {
        C0414d() {
        }

        /* renamed from: a */
        public boolean mo803a(C0370g gVar, MenuItem menuItem) {
            C0415e eVar = ActionMenuView.this.f1555A0;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        /* renamed from: a */
        public void mo796a(C0370g gVar) {
            C0371a aVar = ActionMenuView.this.f1562v0;
            if (aVar != null) {
                aVar.mo796a(gVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface C0415e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    static int m2357a(View view, int i, int i2, int i3, int i4) {
        C0413c cVar = (C0413c) view.getLayoutParams();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(i3) - i4, MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = true;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.mo1393e();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (cVar.f1567c || !z2) {
            z = false;
        }
        cVar.f1570f = z;
        cVar.f1568d = i5;
        view.measure(MeasureSpec.makeMeasureSpec(i * i5, C6637f.f18605b), makeMeasureSpec);
        return i5;
    }

    /* renamed from: c */
    private void m2358c(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f1565y0;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int i14 = i11;
        int i15 = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j = 0;
        while (i15 < childCount) {
            View childAt = getChildAt(i15);
            int i20 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z4 = childAt instanceof ActionMenuItemView;
                int i21 = i17 + 1;
                if (z4) {
                    int i22 = this.f1566z0;
                    i8 = i21;
                    z2 = false;
                    childAt.setPadding(i22, 0, i22, 0);
                } else {
                    i8 = i21;
                    z2 = false;
                }
                C0413c cVar = (C0413c) childAt.getLayoutParams();
                cVar.f1572h = z2;
                cVar.f1569e = z2 ? 1 : 0;
                cVar.f1568d = z2;
                cVar.f1570f = z2;
                cVar.leftMargin = z2;
                cVar.rightMargin = z2;
                cVar.f1571g = z4 && ((ActionMenuItemView) childAt).mo1393e();
                int a = m2357a(childAt, i13, cVar.f1567c ? 1 : i14, childMeasureSpec, paddingTop);
                int max = Math.max(i18, a);
                if (cVar.f1570f) {
                    i19++;
                }
                if (cVar.f1567c) {
                    z3 = true;
                }
                i14 -= a;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (a == 1) {
                    j |= (long) (1 << i15);
                    i16 = i16;
                } else {
                    int i23 = i16;
                }
                i18 = max;
                i17 = i8;
            }
            i15++;
            size2 = i20;
        }
        int i24 = size2;
        boolean z5 = z3 && i17 == 2;
        boolean z6 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                i5 = mode;
                i3 = i9;
                z = z6;
                i4 = i16;
            } else {
                int i25 = Integer.MAX_VALUE;
                int i26 = 0;
                int i27 = 0;
                long j2 = 0;
                while (i26 < childCount) {
                    boolean z7 = z6;
                    C0413c cVar2 = (C0413c) getChildAt(i26).getLayoutParams();
                    int i28 = i16;
                    if (cVar2.f1570f) {
                        int i29 = cVar2.f1568d;
                        if (i29 < i25) {
                            i25 = i29;
                            j2 = 1 << i26;
                            i27 = 1;
                        } else if (i29 == i25) {
                            j2 |= 1 << i26;
                            i27++;
                        }
                    }
                    i26++;
                    i16 = i28;
                    z6 = z7;
                }
                z = z6;
                i4 = i16;
                j |= j2;
                if (i27 > i14) {
                    i5 = mode;
                    i3 = i9;
                    break;
                }
                int i30 = i25 + 1;
                int i31 = 0;
                while (i31 < childCount) {
                    View childAt2 = getChildAt(i31);
                    C0413c cVar3 = (C0413c) childAt2.getLayoutParams();
                    int i32 = i9;
                    int i33 = mode;
                    long j3 = (long) (1 << i31);
                    if ((j2 & j3) == 0) {
                        if (cVar3.f1568d == i30) {
                            j |= j3;
                        }
                        i7 = i30;
                    } else {
                        if (!z5 || !cVar3.f1571g || i14 != 1) {
                            i7 = i30;
                        } else {
                            int i34 = this.f1566z0;
                            i7 = i30;
                            childAt2.setPadding(i34 + i13, 0, i34, 0);
                        }
                        cVar3.f1568d++;
                        cVar3.f1572h = true;
                        i14--;
                    }
                    i31++;
                    mode = i33;
                    i30 = i7;
                    i9 = i32;
                }
                i16 = i4;
                z6 = true;
            }
        }
        boolean z8 = !z3 && i17 == 1;
        if (i14 <= 0 || j == 0 || (i14 >= i17 - 1 && !z8 && i18 <= 1)) {
            i6 = 0;
        } else {
            float bitCount = (float) Long.bitCount(j);
            if (!z8) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0413c) getChildAt(0).getLayoutParams()).f1571g) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & ((long) (1 << i35))) != 0 && !((C0413c) getChildAt(i35).getLayoutParams()).f1571g) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i14 * i13)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount; i37++) {
                if ((j & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    C0413c cVar4 = (C0413c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f1569e = i36;
                        cVar4.f1572h = true;
                        if (i37 == 0 && !cVar4.f1571g) {
                            cVar4.leftMargin = (-i36) / 2;
                        }
                    } else if (cVar4.f1567c) {
                        cVar4.f1569e = i36;
                        cVar4.f1572h = true;
                        cVar4.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            cVar4.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount - 1) {
                            cVar4.rightMargin = i36 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0413c cVar5 = (C0413c) childAt4.getLayoutParams();
                if (cVar5.f1572h) {
                    childAt4.measure(MeasureSpec.makeMeasureSpec((cVar5.f1568d * i13) + cVar5.f1569e, C6637f.f18605b), childMeasureSpec);
                }
                i6++;
            }
        }
        setMeasuredDimension(i3, i5 != 1073741824 ? i4 : i24);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof C0413c;
    }

    /* access modifiers changed from: protected */
    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public boolean mo1970d(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C0411a)) {
            z = false | ((C0411a) childAt).mo1391c();
        }
        if (i > 0 && (childAt2 instanceof C0411a)) {
            z |= ((C0411a) childAt2).mo1392d();
        }
        return z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* renamed from: g */
    public void mo1972g() {
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1952d();
        }
    }

    public Menu getMenu() {
        if (this.f1556p0 == null) {
            Context context = getContext();
            this.f1556p0 = new C0370g(context);
            this.f1556p0.mo1561a((C0371a) new C0414d());
            this.f1560t0 = new ActionMenuPresenter(context);
            this.f1560t0.mo1951d(true);
            ActionMenuPresenter actionMenuPresenter = this.f1560t0;
            C0387a aVar = this.f1561u0;
            if (aVar == null) {
                aVar = new C0412b();
            }
            actionMenuPresenter.mo1488a(aVar);
            this.f1556p0.mo1563a((C0386n) this.f1560t0, this.f1557q0);
            this.f1560t0.mo1947a(this);
        }
        return this.f1556p0;
    }

    @C0195i0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1560t0.mo1953e();
    }

    public int getPopupTheme() {
        return this.f1558r0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public C0413c mo1979h() {
        C0413c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f1567c = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: i */
    public boolean mo1980i() {
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        return actionMenuPresenter != null && actionMenuPresenter.mo1954f();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public boolean mo1981j() {
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        return actionMenuPresenter != null && actionMenuPresenter.mo1956h();
    }

    /* renamed from: k */
    public boolean mo1982k() {
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        return actionMenuPresenter != null && actionMenuPresenter.mo1957i();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: l */
    public boolean mo1983l() {
        return this.f1559s0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: m */
    public C0370g mo1984m() {
        return this.f1556p0;
    }

    /* renamed from: n */
    public boolean mo1985n() {
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        return actionMenuPresenter != null && actionMenuPresenter.mo1959k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f1560t0;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1489a(false);
            if (this.f1560t0.mo1957i()) {
                this.f1560t0.mo1954f();
                this.f1560t0.mo1959k();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1972g();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!this.f1563w0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i9 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i10 = i3 - i;
        int paddingRight = (i10 - getPaddingRight()) - getPaddingLeft();
        boolean a = C0567z0.m3141a(this);
        int i11 = paddingRight;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0413c cVar = (C0413c) childAt.getLayoutParams();
                if (cVar.f1567c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (mo1970d(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        i8 = i7 + measuredWidth;
                    } else {
                        i8 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = i8 - measuredWidth;
                    }
                    int i15 = i9 - (measuredHeight / 2);
                    childAt.layout(i7, i15, i8, measuredHeight + i15);
                    i11 -= measuredWidth;
                    i12 = 1;
                } else {
                    i11 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    boolean d = mo1970d(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i10 / 2) - (measuredWidth2 / 2);
            int i17 = i9 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        if (i18 > 0) {
            i5 = i11 / i18;
            i6 = 0;
        } else {
            i6 = 0;
            i5 = 0;
        }
        int max = Math.max(i6, i5);
        if (a) {
            int width = getWidth() - getPaddingRight();
            while (i6 < childCount) {
                View childAt3 = getChildAt(i6);
                C0413c cVar2 = (C0413c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f1567c) {
                    int i19 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i20 = i9 - (measuredHeight3 / 2);
                    childAt3.layout(i19 - measuredWidth3, i20, i19, measuredHeight3 + i20);
                    width = i19 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i6++;
            }
        } else {
            int paddingLeft = getPaddingLeft();
            while (i6 < childCount) {
                View childAt4 = getChildAt(i6);
                C0413c cVar3 = (C0413c) childAt4.getLayoutParams();
                if (childAt4.getVisibility() != 8 && !cVar3.f1567c) {
                    int i21 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth4 = childAt4.getMeasuredWidth();
                    int measuredHeight4 = childAt4.getMeasuredHeight();
                    int i22 = i9 - (measuredHeight4 / 2);
                    childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                    paddingLeft = i21 + measuredWidth4 + cVar3.rightMargin + max;
                }
                i6++;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z = this.f1563w0;
        this.f1563w0 = MeasureSpec.getMode(i) == 1073741824;
        if (z != this.f1563w0) {
            this.f1564x0 = 0;
        }
        int size = MeasureSpec.getSize(i);
        if (this.f1563w0) {
            C0370g gVar = this.f1556p0;
            if (!(gVar == null || size == this.f1564x0)) {
                this.f1564x0 = size;
                gVar.mo1583b(true);
            }
        }
        int childCount = getChildCount();
        if (!this.f1563w0 || childCount <= 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                C0413c cVar = (C0413c) getChildAt(i3).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        m2358c(i, i2);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1560t0.mo1950c(z);
    }

    public void setOnMenuItemClickListener(C0415e eVar) {
        this.f1555A0 = eVar;
    }

    public void setOverflowIcon(@C0195i0 Drawable drawable) {
        getMenu();
        this.f1560t0.mo1946a(drawable);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z) {
        this.f1559s0 = z;
    }

    public void setPopupTheme(@C0216r0 int i) {
        if (this.f1558r0 != i) {
            this.f1558r0 = i;
            if (i == 0) {
                this.f1557q0 = getContext();
            } else {
                this.f1557q0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f1560t0 = actionMenuPresenter;
        this.f1560t0.mo1947a(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1565y0 = (int) (56.0f * f);
        this.f1566z0 = (int) (f * 4.0f);
        this.f1557q0 = context;
        this.f1558r0 = 0;
    }

    /* access modifiers changed from: protected */
    public C0413c generateDefaultLayoutParams() {
        C0413c cVar = new C0413c(-2, -2);
        cVar.f1973b = 16;
        return cVar;
    }

    public C0413c generateLayoutParams(AttributeSet attributeSet) {
        return new C0413c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public C0413c generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0413c cVar = layoutParams instanceof C0413c ? new C0413c((C0413c) layoutParams) : new C0413c(layoutParams);
        if (cVar.f1973b <= 0) {
            cVar.f1973b = 16;
        }
        return cVar;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public boolean mo1412a(C0375j jVar) {
        return this.f1556p0.mo1566a((MenuItem) jVar, 0);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo1411a(C0370g gVar) {
        this.f1556p0 = gVar;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo1968a(C0387a aVar, C0371a aVar2) {
        this.f1561u0 = aVar;
        this.f1562v0 = aVar2;
    }
}
