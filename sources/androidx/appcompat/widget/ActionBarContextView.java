package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0338b;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0386n;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0990i0;
import p076c.p112d.p148d.p150g.C6637f;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends C0466a {

    /* renamed from: i0 */
    private static final String f1473i0 = "ActionBarContextView";

    /* renamed from: U */
    private CharSequence f1474U;

    /* renamed from: V */
    private CharSequence f1475V;

    /* renamed from: W */
    private View f1476W;

    /* renamed from: a0 */
    private View f1477a0;

    /* renamed from: b0 */
    private LinearLayout f1478b0;

    /* renamed from: c0 */
    private TextView f1479c0;

    /* renamed from: d0 */
    private TextView f1480d0;

    /* renamed from: e0 */
    private int f1481e0;

    /* renamed from: f0 */
    private int f1482f0;

    /* renamed from: g0 */
    private boolean f1483g0;

    /* renamed from: h0 */
    private int f1484h0;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    class C0397a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C0338b f1485a;

        C0397a(C0338b bVar) {
            this.f1485a = bVar;
        }

        public void onClick(View view) {
            this.f1485a.mo1121a();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* renamed from: l */
    private void m2260l() {
        if (this.f1478b0 == null) {
            LayoutInflater.from(getContext()).inflate(C0238R.layout.abc_action_bar_title_item, this);
            this.f1478b0 = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1479c0 = (TextView) this.f1478b0.findViewById(C0238R.C0241id.action_bar_title);
            this.f1480d0 = (TextView) this.f1478b0.findViewById(C0238R.C0241id.action_bar_subtitle);
            if (this.f1481e0 != 0) {
                this.f1479c0.setTextAppearance(getContext(), this.f1481e0);
            }
            if (this.f1482f0 != 0) {
                this.f1480d0.setTextAppearance(getContext(), this.f1482f0);
            }
        }
        this.f1479c0.setText(this.f1474U);
        this.f1480d0.setText(this.f1475V);
        boolean z = !TextUtils.isEmpty(this.f1474U);
        boolean z2 = !TextUtils.isEmpty(this.f1475V);
        int i = 0;
        this.f1480d0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = this.f1478b0;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout.setVisibility(i);
        if (this.f1478b0.getParent() == null) {
            addView(this.f1478b0);
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo1849a(int i) {
        super.mo1849a(i);
    }

    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo1852b() {
        super.mo1852b();
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
    public /* bridge */ /* synthetic */ boolean mo1854d() {
        return super.mo1854d();
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
    public /* bridge */ /* synthetic */ boolean mo1856f() {
        return super.mo1856f();
    }

    /* renamed from: g */
    public /* bridge */ /* synthetic */ void mo1857g() {
        super.mo1857g();
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f1475V;
    }

    public CharSequence getTitle() {
        return this.f1474U;
    }

    /* renamed from: h */
    public boolean mo1864h() {
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo1959k();
        }
        return false;
    }

    /* renamed from: i */
    public void mo1865i() {
        if (this.f1476W == null) {
            mo1867k();
        }
    }

    /* renamed from: j */
    public boolean mo1866j() {
        return this.f1483g0;
    }

    /* renamed from: k */
    public void mo1867k() {
        removeAllViews();
        this.f1477a0 = null;
        this.f1852N = null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1954f();
            this.f1853O.mo1955g();
        }
    }

    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(ActionBarContextView.class.getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1474U);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        boolean a = C0567z0.m3141a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1476W;
        if (view == null || view.getVisibility() == 8) {
            i5 = paddingRight;
        } else {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1476W.getLayoutParams();
            int i6 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = C0466a.m2575a(paddingRight, i6, a);
            i5 = C0466a.m2575a(a2 + mo2461a(this.f1476W, a2, paddingTop, paddingTop2, a), i7, a);
        }
        LinearLayout linearLayout = this.f1478b0;
        if (!(linearLayout == null || this.f1477a0 != null || linearLayout.getVisibility() == 8)) {
            i5 += mo2461a(this.f1478b0, i5, paddingTop, paddingTop2, a);
        }
        int i8 = i5;
        View view2 = this.f1477a0;
        if (view2 != null) {
            mo2461a(view2, i8, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1852N;
        if (actionMenuView != null) {
            mo2461a(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int i3 = C6637f.f18605b;
        if (mode != 1073741824) {
            StringBuilder sb = new StringBuilder();
            sb.append(ActionBarContextView.class.getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        } else if (MeasureSpec.getMode(i2) != 0) {
            int size = MeasureSpec.getSize(i);
            int i4 = this.f1854P;
            if (i4 <= 0) {
                i4 = MeasureSpec.getSize(i2);
            }
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingTop;
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.f1476W;
            if (view != null) {
                int a = mo2460a(view, paddingLeft, makeMeasureSpec, 0);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f1476W.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f1852N;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = mo2460a(this.f1852N, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f1478b0;
            if (linearLayout != null && this.f1477a0 == null) {
                if (this.f1483g0) {
                    this.f1478b0.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f1478b0.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f1478b0.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = mo2460a(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f1477a0;
            if (view2 != null) {
                LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width != -2 ? C6637f.f18605b : Integer.MIN_VALUE;
                int i7 = layoutParams.width;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                int i8 = layoutParams.height;
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.f1477a0.measure(MeasureSpec.makeMeasureSpec(paddingLeft, i6), MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.f1854P <= 0) {
                int childCount = getChildCount();
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingTop;
                    if (measuredHeight > i9) {
                        i9 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i9);
                return;
            }
            setMeasuredDimension(size, i4);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ActionBarContextView.class.getSimpleName());
            sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
            throw new IllegalStateException(sb2.toString());
        }
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setContentHeight(int i) {
        this.f1854P = i;
    }

    public void setCustomView(View view) {
        View view2 = this.f1477a0;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1477a0 = view;
        if (view != null) {
            LinearLayout linearLayout = this.f1478b0;
            if (linearLayout != null) {
                removeView(linearLayout);
                this.f1478b0 = null;
            }
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1475V = charSequence;
        m2260l();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1474U = charSequence;
        m2260l();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f1483g0) {
            requestLayout();
        }
        this.f1483g0 = z;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.actionModeStyle);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1851a() {
        return super.mo1851a();
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0549t0 a = C0549t0.m2910a(context, attributeSet, C0238R.styleable.ActionMode, i, 0);
        C0962e0.m5440a((View) this, a.mo2875b(C0238R.styleable.ActionMode_background));
        this.f1481e0 = a.mo2888g(C0238R.styleable.ActionMode_titleTextStyle, 0);
        this.f1482f0 = a.mo2888g(C0238R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f1854P = a.mo2885f(C0238R.styleable.ActionMode_height, 0);
        this.f1484h0 = a.mo2888g(C0238R.styleable.ActionMode_closeItemLayout, C0238R.layout.abc_action_mode_close_item_material);
        a.mo2887f();
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ C0990i0 mo1848a(int i, long j) {
        return super.mo1848a(i, j);
    }

    /* renamed from: a */
    public void mo1850a(C0338b bVar) {
        View view = this.f1476W;
        if (view == null) {
            this.f1476W = LayoutInflater.from(getContext()).inflate(this.f1484h0, this, false);
            addView(this.f1476W);
        } else if (view.getParent() == null) {
            addView(this.f1476W);
        }
        this.f1476W.findViewById(C0238R.C0241id.action_mode_close_button).setOnClickListener(new C0397a(bVar));
        C0370g gVar = (C0370g) bVar.mo1132c();
        ActionMenuPresenter actionMenuPresenter = this.f1853O;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1952d();
        }
        this.f1853O = new ActionMenuPresenter(getContext());
        this.f1853O.mo1951d(true);
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        gVar.mo1563a((C0386n) this.f1853O, this.f1859b);
        this.f1852N = (ActionMenuView) this.f1853O.mo1482a((ViewGroup) this);
        C0962e0.m5440a((View) this.f1852N, (Drawable) null);
        addView(this.f1852N, layoutParams);
    }
}
