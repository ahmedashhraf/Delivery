package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0189f0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0198k;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0213q;
import androidx.annotation.C0214q0;
import androidx.annotation.C0216r0;
import androidx.appcompat.C0238R;
import androidx.appcompat.app.C0279a.C0281b;
import androidx.appcompat.p006a.p007a.C0242a;
import androidx.appcompat.p011d.C0340c;
import androidx.appcompat.p011d.C0345g;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0370g.C0371a;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.view.menu.C0395s;
import androidx.appcompat.widget.ActionMenuView.C0415e;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C0984g;
import androidx.core.p034l.C0999l;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p076c.p112d.p148d.p150g.C6637f;

public class Toolbar extends ViewGroup {

    /* renamed from: D0 */
    private static final String f1794D0 = "Toolbar";

    /* renamed from: A0 */
    private C0371a f1795A0;

    /* renamed from: B0 */
    private boolean f1796B0;

    /* renamed from: C0 */
    private final Runnable f1797C0;

    /* renamed from: N */
    private TextView f1798N;

    /* renamed from: O */
    private ImageButton f1799O;

    /* renamed from: P */
    private ImageView f1800P;

    /* renamed from: Q */
    private Drawable f1801Q;

    /* renamed from: R */
    private CharSequence f1802R;

    /* renamed from: S */
    ImageButton f1803S;

    /* renamed from: T */
    View f1804T;

    /* renamed from: U */
    private Context f1805U;

    /* renamed from: V */
    private int f1806V;

    /* renamed from: W */
    private int f1807W;

    /* renamed from: a */
    private ActionMenuView f1808a;

    /* renamed from: a0 */
    private int f1809a0;

    /* renamed from: b */
    private TextView f1810b;

    /* renamed from: b0 */
    int f1811b0;

    /* renamed from: c0 */
    private int f1812c0;

    /* renamed from: d0 */
    private int f1813d0;

    /* renamed from: e0 */
    private int f1814e0;

    /* renamed from: f0 */
    private int f1815f0;

    /* renamed from: g0 */
    private int f1816g0;

    /* renamed from: h0 */
    private C0521k0 f1817h0;

    /* renamed from: i0 */
    private int f1818i0;

    /* renamed from: j0 */
    private int f1819j0;

    /* renamed from: k0 */
    private int f1820k0;

    /* renamed from: l0 */
    private CharSequence f1821l0;

    /* renamed from: m0 */
    private CharSequence f1822m0;

    /* renamed from: n0 */
    private ColorStateList f1823n0;

    /* renamed from: o0 */
    private ColorStateList f1824o0;

    /* renamed from: p0 */
    private boolean f1825p0;

    /* renamed from: q0 */
    private boolean f1826q0;

    /* renamed from: r0 */
    private final ArrayList<View> f1827r0;

    /* renamed from: s0 */
    private final ArrayList<View> f1828s0;

    /* renamed from: t0 */
    private final int[] f1829t0;

    /* renamed from: u0 */
    C0464f f1830u0;

    /* renamed from: v0 */
    private final C0415e f1831v0;

    /* renamed from: w0 */
    private C0551u0 f1832w0;

    /* renamed from: x0 */
    private ActionMenuPresenter f1833x0;

    /* renamed from: y0 */
    private C0462d f1834y0;

    /* renamed from: z0 */
    private C0387a f1835z0;

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C0458a();
        int expandedMenuItemId;
        boolean isOverflowOpen;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        static class C0458a implements ClassLoaderCreator<SavedState> {
            C0458a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0459a implements C0415e {
        C0459a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C0464f fVar = Toolbar.this.f1830u0;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0460b implements Runnable {
        C0460b() {
        }

        public void run() {
            Toolbar.this.mo2401l();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0461c implements OnClickListener {
        C0461c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo2358c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0462d implements C0386n {

        /* renamed from: a */
        C0370g f1840a;

        /* renamed from: b */
        C0375j f1841b;

        C0462d() {
        }

        /* renamed from: a */
        public C0388o mo1482a(ViewGroup viewGroup) {
            return null;
        }

        /* renamed from: a */
        public void mo1484a(Context context, C0370g gVar) {
            C0370g gVar2 = this.f1840a;
            if (gVar2 != null) {
                C0375j jVar = this.f1841b;
                if (jVar != null) {
                    gVar2.mo1569a(jVar);
                }
            }
            this.f1840a = gVar;
        }

        /* renamed from: a */
        public void mo1505a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo1486a(C0370g gVar, boolean z) {
        }

        /* renamed from: a */
        public void mo1488a(C0387a aVar) {
        }

        /* renamed from: a */
        public boolean mo1490a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo1494a(C0395s sVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1497b(C0370g gVar, C0375j jVar) {
            Toolbar.this.mo2361e();
            ViewParent parent = Toolbar.this.f1803S.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1803S);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1803S);
            }
            Toolbar.this.f1804T = jVar.getActionView();
            this.f1841b = jVar;
            ViewParent parent2 = Toolbar.this.f1804T.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1804T);
                }
                C0463e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f866a = 8388611 | (toolbar4.f1811b0 & 112);
                generateDefaultLayoutParams.f1845b = 2;
                toolbar4.f1804T.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1804T);
            }
            Toolbar.this.mo2400k();
            Toolbar.this.requestLayout();
            jVar.mo1643a(true);
            View view = Toolbar.this.f1804T;
            if (view instanceof C0340c) {
                ((C0340c) view).mo1322c();
            }
            return true;
        }

        /* renamed from: c */
        public Parcelable mo1512c() {
            return null;
        }

        public int getId() {
            return 0;
        }

        /* renamed from: a */
        public void mo1489a(boolean z) {
            if (this.f1841b != null) {
                C0370g gVar = this.f1840a;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1840a.getItem(i) == this.f1841b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo1493a(this.f1840a, this.f1841b);
                }
            }
        }

        /* renamed from: a */
        public boolean mo1493a(C0370g gVar, C0375j jVar) {
            View view = Toolbar.this.f1804T;
            if (view instanceof C0340c) {
                ((C0340c) view).mo1323d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1804T);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1803S);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1804T = null;
            toolbar3.mo2348a();
            this.f1841b = null;
            Toolbar.this.requestLayout();
            jVar.mo1643a(false);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0463e extends C0281b {

        /* renamed from: c */
        static final int f1842c = 0;

        /* renamed from: d */
        static final int f1843d = 1;

        /* renamed from: e */
        static final int f1844e = 2;

        /* renamed from: b */
        int f1845b;

        public C0463e(@C0193h0 Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1845b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2446a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0463e(int i, int i2) {
            super(i, i2);
            this.f1845b = 0;
            this.f866a = 8388627;
        }

        public C0463e(int i, int i2, int i3) {
            super(i, i2);
            this.f1845b = 0;
            this.f866a = i3;
        }

        public C0463e(int i) {
            this(-2, -1, i);
        }

        public C0463e(C0463e eVar) {
            super((C0281b) eVar);
            this.f1845b = 0;
            this.f1845b = eVar.f1845b;
        }

        public C0463e(C0281b bVar) {
            super(bVar);
            this.f1845b = 0;
        }

        public C0463e(MarginLayoutParams marginLayoutParams) {
            super((LayoutParams) marginLayoutParams);
            this.f1845b = 0;
            mo2446a(marginLayoutParams);
        }

        public C0463e(LayoutParams layoutParams) {
            super(layoutParams);
            this.f1845b = 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface C0464f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new C0345g(getContext());
    }

    /* renamed from: m */
    private void mo22314m() {
        if (this.f1817h0 == null) {
            this.f1817h0 = new C0521k0();
        }
    }

    /* renamed from: n */
    private void mo22315n() {
        if (this.f1800P == null) {
            this.f1800P = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: o */
    private void m2536o() {
        m2537p();
        if (this.f1808a.mo1984m() == null) {
            C0370g gVar = (C0370g) this.f1808a.getMenu();
            if (this.f1834y0 == null) {
                this.f1834y0 = new C0462d();
            }
            this.f1808a.setExpandedActionViewsExclusive(true);
            gVar.mo1563a((C0386n) this.f1834y0, this.f1805U);
        }
    }

    /* renamed from: p */
    private void m2537p() {
        if (this.f1808a == null) {
            this.f1808a = new ActionMenuView(getContext());
            this.f1808a.setPopupTheme(this.f1806V);
            this.f1808a.setOnMenuItemClickListener(this.f1831v0);
            this.f1808a.mo1968a(this.f1835z0, this.f1795A0);
            C0463e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f866a = 8388613 | (this.f1811b0 & 112);
            this.f1808a.setLayoutParams(generateDefaultLayoutParams);
            m2525a((View) this.f1808a, false);
        }
    }

    /* renamed from: q */
    private void m2538q() {
        if (this.f1799O == null) {
            this.f1799O = new C0522l(getContext(), null, C0238R.attr.toolbarNavigationButtonStyle);
            C0463e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f866a = 8388611 | (this.f1811b0 & 112);
            this.f1799O.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: r */
    private void m2539r() {
        removeCallbacks(this.f1797C0);
        post(this.f1797C0);
    }

    /* renamed from: s */
    private boolean m2540s() {
        if (!this.f1796B0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m2533e(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo2351a(int i, int i2, int i3, int i4) {
        this.f1813d0 = i;
        this.f1815f0 = i2;
        this.f1814e0 = i3;
        this.f1816g0 = i4;
        requestLayout();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public boolean mo2357b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f1808a;
            if (actionMenuView != null && actionMenuView.mo1983l()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo2358c() {
        C0462d dVar = this.f1834y0;
        C0375j jVar = dVar == null ? null : dVar.f1841b;
        if (jVar != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0463e);
    }

    /* renamed from: d */
    public void mo2360d() {
        ActionMenuView actionMenuView = this.f1808a;
        if (actionMenuView != null) {
            actionMenuView.mo1972g();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2361e() {
        if (this.f1803S == null) {
            this.f1803S = new C0522l(getContext(), null, C0238R.attr.toolbarNavigationButtonStyle);
            this.f1803S.setImageDrawable(this.f1801Q);
            this.f1803S.setContentDescription(this.f1802R);
            C0463e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f866a = 8388611 | (this.f1811b0 & 112);
            generateDefaultLayoutParams.f1845b = 2;
            this.f1803S.setLayoutParams(generateDefaultLayoutParams);
            this.f1803S.setOnClickListener(new C0461c());
        }
    }

    /* renamed from: f */
    public boolean mo2362f() {
        C0462d dVar = this.f1834y0;
        return (dVar == null || dVar.f1841b == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo2363g() {
        ActionMenuView actionMenuView = this.f1808a;
        return actionMenuView != null && actionMenuView.mo1980i();
    }

    @C0195i0
    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1803S;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @C0195i0
    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1803S;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0521k0 k0Var = this.f1817h0;
        if (k0Var != null) {
            return k0Var.mo2743a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1819j0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0521k0 k0Var = this.f1817h0;
        if (k0Var != null) {
            return k0Var.mo2746b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0521k0 k0Var = this.f1817h0;
        if (k0Var != null) {
            return k0Var.mo2748c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0521k0 k0Var = this.f1817h0;
        if (k0Var != null) {
            return k0Var.mo2749d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1818i0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1808a
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.g r0 = r0.mo1984m()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1819j0
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (C0962e0.m5566x(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C0962e0.m5566x(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1818i0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1800P;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1800P;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m2536o();
        return this.f1808a.getMenu();
    }

    @C0195i0
    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1799O;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    @C0195i0
    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1799O;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1833x0;
    }

    @C0195i0
    public Drawable getOverflowIcon() {
        m2536o();
        return this.f1808a.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f1805U;
    }

    public int getPopupTheme() {
        return this.f1806V;
    }

    public CharSequence getSubtitle() {
        return this.f1822m0;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.TESTS})
    @C0195i0
    public final TextView getSubtitleTextView() {
        return this.f1798N;
    }

    public CharSequence getTitle() {
        return this.f1821l0;
    }

    public int getTitleMarginBottom() {
        return this.f1816g0;
    }

    public int getTitleMarginEnd() {
        return this.f1814e0;
    }

    public int getTitleMarginStart() {
        return this.f1813d0;
    }

    public int getTitleMarginTop() {
        return this.f1815f0;
    }

    /* access modifiers changed from: 0000 */
    @C0207n0({C0208a.TESTS})
    @C0195i0
    public final TextView getTitleTextView() {
        return this.f1810b;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public C0566z getWrapper() {
        if (this.f1832w0 == null) {
            this.f1832w0 = new C0551u0(this, true);
        }
        return this.f1832w0;
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: h */
    public boolean mo2397h() {
        ActionMenuView actionMenuView = this.f1808a;
        return actionMenuView != null && actionMenuView.mo1981j();
    }

    /* renamed from: i */
    public boolean mo2398i() {
        ActionMenuView actionMenuView = this.f1808a;
        return actionMenuView != null && actionMenuView.mo1982k();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: j */
    public boolean mo2399j() {
        TextView textView = this.f1810b;
        if (textView == null) {
            return false;
        }
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2400k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((C0463e) childAt.getLayoutParams()).f1845b == 2 || childAt == this.f1808a)) {
                removeViewAt(childCount);
                this.f1828s0.add(childAt);
            }
        }
    }

    /* renamed from: l */
    public boolean mo2401l() {
        ActionMenuView actionMenuView = this.f1808a;
        return actionMenuView != null && actionMenuView.mo1985n();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1797C0);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1826q0 = false;
        }
        if (!this.f1826q0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1826q0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1826q0 = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.p034l.C0962e0.m5566x(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1829t0
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.p034l.C0962e0.m5399C(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1799O
            boolean r13 = r0.m2533e(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1799O
            int r13 = r0.m2529b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1799O
            int r13 = r0.m2522a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1803S
            boolean r15 = r0.m2533e(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1803S
            int r14 = r0.m2529b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1803S
            int r13 = r0.m2522a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1808a
            boolean r15 = r0.m2533e(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1808a
            int r13 = r0.m2522a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1808a
            int r14 = r0.m2529b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1804T
            boolean r13 = r0.m2533e(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1804T
            int r10 = r0.m2529b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1804T
            int r2 = r0.m2522a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1800P
            boolean r13 = r0.m2533e(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1800P
            int r10 = r0.m2529b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1800P
            int r2 = r0.m2522a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1810b
            boolean r13 = r0.m2533e(r13)
            android.widget.TextView r14 = r0.f1798N
            boolean r14 = r0.m2533e(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1810b
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.C0463e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1810b
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1798N
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0463e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1798N
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0296
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1810b
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1798N
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1798N
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1810b
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.C0463e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.C0463e) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1810b
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f1798N
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f1820k0
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019a
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f1815f0
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0183
            int r6 = r12 + r2
            goto L_0x0198
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1816g0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0198
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0198:
            int r8 = r8 + r6
            goto L_0x01b7
        L_0x019a:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1816g0
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b7
        L_0x01a8:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1815f0
            int r8 = r2 + r3
        L_0x01b7:
            if (r1 == 0) goto L_0x022c
            if (r15 == 0) goto L_0x01bf
            int r3 = r0.f1813d0
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = 1
            r3 = 0
        L_0x01c1:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f7
            android.widget.TextView r1 = r0.f1810b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0463e) r1
            android.widget.TextView r2 = r0.f1810b
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1810b
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1810b
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1814e0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f8
        L_0x01f7:
            r2 = r10
        L_0x01f8:
            if (r18 == 0) goto L_0x0220
            android.widget.TextView r1 = r0.f1798N
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0463e) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1798N
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1798N
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1798N
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f1814e0
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0221
        L_0x0220:
            r3 = r10
        L_0x0221:
            if (r15 == 0) goto L_0x0228
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0228:
            r2 = r24
            goto L_0x0128
        L_0x022c:
            if (r15 == 0) goto L_0x0231
            int r3 = r0.f1813d0
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0268
            android.widget.TextView r1 = r0.f1810b
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0463e) r1
            android.widget.TextView r3 = r0.f1810b
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f1810b
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1810b
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f1814e0
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0269
        L_0x0268:
            r3 = r2
        L_0x0269:
            if (r18 == 0) goto L_0x028f
            android.widget.TextView r1 = r0.f1798N
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.C0463e) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f1798N
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1798N
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1798N
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f1814e0
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            if (r15 == 0) goto L_0x0296
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0296:
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            r3 = 3
            r0.m2526a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a4:
            if (r2 >= r1) goto L_0x02b7
            java.util.ArrayList<android.view.View> r4 = r0.f1827r0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m2522a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02b7:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            r2 = 5
            r0.m2526a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            int r1 = r1.size()
            r2 = 0
        L_0x02c6:
            if (r2 >= r1) goto L_0x02d7
            java.util.ArrayList<android.view.View> r4 = r0.f1827r0
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m2529b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d7:
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            r2 = 1
            r0.m2526a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            int r1 = r0.m2523a(r1, r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            if (r1 <= r10) goto L_0x02f9
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fa
        L_0x02f9:
            r3 = r2
        L_0x02fa:
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            int r1 = r1.size()
        L_0x0300:
            if (r7 >= r1) goto L_0x0311
            java.util.ArrayList<android.view.View> r2 = r0.f1827r0
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m2522a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0311:
            java.util.ArrayList<android.view.View> r1 = r0.f1827r0
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1829t0;
        if (C0567z0.m3141a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m2533e(this.f1799O)) {
            m2524a((View) this.f1799O, i, 0, i2, 0, this.f1812c0);
            i5 = this.f1799O.getMeasuredWidth() + m2519a((View) this.f1799O);
            i4 = Math.max(0, this.f1799O.getMeasuredHeight() + m2528b((View) this.f1799O));
            i3 = View.combineMeasuredStates(0, this.f1799O.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m2533e(this.f1803S)) {
            m2524a((View) this.f1803S, i, 0, i2, 0, this.f1812c0);
            i5 = this.f1803S.getMeasuredWidth() + m2519a((View) this.f1803S);
            i4 = Math.max(i4, this.f1803S.getMeasuredHeight() + m2528b((View) this.f1803S));
            i3 = View.combineMeasuredStates(i3, this.f1803S.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m2533e(this.f1808a)) {
            m2524a((View) this.f1808a, i, max, i2, 0, this.f1812c0);
            i6 = this.f1808a.getMeasuredWidth() + m2519a((View) this.f1808a);
            i4 = Math.max(i4, this.f1808a.getMeasuredHeight() + m2528b((View) this.f1808a));
            i3 = View.combineMeasuredStates(i3, this.f1808a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m2533e(this.f1804T)) {
            max2 += m2521a(this.f1804T, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1804T.getMeasuredHeight() + m2528b(this.f1804T));
            i3 = View.combineMeasuredStates(i3, this.f1804T.getMeasuredState());
        }
        if (m2533e(this.f1800P)) {
            max2 += m2521a((View) this.f1800P, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1800P.getMeasuredHeight() + m2528b((View) this.f1800P));
            i3 = View.combineMeasuredStates(i3, this.f1800P.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0463e) childAt.getLayoutParams()).f1845b == 0 && m2533e(childAt)) {
                i11 += m2521a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m2528b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f1815f0 + this.f1816g0;
        int i14 = this.f1813d0 + this.f1814e0;
        if (m2533e(this.f1810b)) {
            m2521a((View) this.f1810b, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f1810b.getMeasuredWidth() + m2519a((View) this.f1810b);
            i7 = this.f1810b.getMeasuredHeight() + m2528b((View) this.f1810b);
            i9 = View.combineMeasuredStates(i3, this.f1810b.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m2533e(this.f1798N)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m2521a((View) this.f1798N, i, i11 + i14, i2, i15, iArr));
            i7 += this.f1798N.getMeasuredHeight() + m2528b((View) this.f1798N);
            i9 = View.combineMeasuredStates(i16, this.f1798N.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m2540s()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.f1808a;
        C0370g m = actionMenuView != null ? actionMenuView.mo1984m() : null;
        int i = savedState.expandedMenuItemId;
        if (!(i == 0 || this.f1834y0 == null || m == null)) {
            MenuItem findItem = m.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.isOverflowOpen) {
            m2539r();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        mo22314m();
        C0521k0 k0Var = this.f1817h0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        k0Var.mo2745a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0462d dVar = this.f1834y0;
        if (dVar != null) {
            C0375j jVar = dVar.f1841b;
            if (jVar != null) {
                savedState.expandedMenuItemId = jVar.getItemId();
            }
        }
        savedState.isOverflowOpen = mo2398i();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1825p0 = false;
        }
        if (!this.f1825p0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1825p0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1825p0 = false;
        }
        return true;
    }

    public void setCollapseContentDescription(@C0214q0 int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(@C0213q int i) {
        setCollapseIcon(C0242a.m1109c(getContext(), i));
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    public void setCollapsible(boolean z) {
        this.f1796B0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1819j0) {
            this.f1819j0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1818i0) {
            this.f1818i0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(@C0213q int i) {
        setLogo(C0242a.m1109c(getContext(), i));
    }

    public void setLogoDescription(@C0214q0 int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(@C0214q0 int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(@C0213q int i) {
        setNavigationIcon(C0242a.m1109c(getContext(), i));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m2538q();
        this.f1799O.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(C0464f fVar) {
        this.f1830u0 = fVar;
    }

    public void setOverflowIcon(@C0195i0 Drawable drawable) {
        m2536o();
        this.f1808a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(@C0216r0 int i) {
        if (this.f1806V != i) {
            this.f1806V = i;
            if (i == 0) {
                this.f1805U = getContext();
            } else {
                this.f1805U = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(@C0214q0 int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(@C0198k int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(@C0214q0 int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1816g0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1814e0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1813d0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1815f0 = i;
        requestLayout();
    }

    public void setTitleTextColor(@C0198k int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, @C0195i0 AttributeSet attributeSet) {
        this(context, attributeSet, C0238R.attr.toolbarStyle);
    }

    /* renamed from: b */
    public void mo2356b(Context context, @C0216r0 int i) {
        this.f1807W = i;
        TextView textView = this.f1810b;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public C0463e generateDefaultLayoutParams() {
        return new C0463e(-2, -2);
    }

    public void setCollapseContentDescription(@C0195i0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo2361e();
        }
        ImageButton imageButton = this.f1803S;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(@C0195i0 Drawable drawable) {
        if (drawable != null) {
            mo2361e();
            this.f1803S.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1803S;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1801Q);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            mo22315n();
            if (!m2531c((View) this.f1800P)) {
                m2525a((View) this.f1800P, true);
            }
        } else {
            ImageView imageView = this.f1800P;
            if (imageView != null && m2531c((View) imageView)) {
                removeView(this.f1800P);
                this.f1828s0.remove(this.f1800P);
            }
        }
        ImageView imageView2 = this.f1800P;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo22315n();
        }
        ImageView imageView = this.f1800P;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(@C0195i0 CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m2538q();
        }
        ImageButton imageButton = this.f1799O;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(@C0195i0 Drawable drawable) {
        if (drawable != null) {
            m2538q();
            if (!m2531c((View) this.f1799O)) {
                m2525a((View) this.f1799O, true);
            }
        } else {
            ImageButton imageButton = this.f1799O;
            if (imageButton != null && m2531c((View) imageButton)) {
                removeView(this.f1799O);
                this.f1828s0.remove(this.f1799O);
            }
        }
        ImageButton imageButton2 = this.f1799O;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1798N == null) {
                Context context = getContext();
                this.f1798N = new AppCompatTextView(context);
                this.f1798N.setSingleLine();
                this.f1798N.setEllipsize(TruncateAt.END);
                int i = this.f1809a0;
                if (i != 0) {
                    this.f1798N.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1824o0;
                if (colorStateList != null) {
                    this.f1798N.setTextColor(colorStateList);
                }
            }
            if (!m2531c((View) this.f1798N)) {
                m2525a((View) this.f1798N, true);
            }
        } else {
            TextView textView = this.f1798N;
            if (textView != null && m2531c((View) textView)) {
                removeView(this.f1798N);
                this.f1828s0.remove(this.f1798N);
            }
        }
        TextView textView2 = this.f1798N;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1822m0 = charSequence;
    }

    public void setSubtitleTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f1824o0 = colorStateList;
        TextView textView = this.f1798N;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1810b == null) {
                Context context = getContext();
                this.f1810b = new AppCompatTextView(context);
                this.f1810b.setSingleLine();
                this.f1810b.setEllipsize(TruncateAt.END);
                int i = this.f1807W;
                if (i != 0) {
                    this.f1810b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1823n0;
                if (colorStateList != null) {
                    this.f1810b.setTextColor(colorStateList);
                }
            }
            if (!m2531c((View) this.f1810b)) {
                m2525a((View) this.f1810b, true);
            }
        } else {
            TextView textView = this.f1810b;
            if (textView != null && m2531c((View) textView)) {
                removeView(this.f1810b);
                this.f1828s0.remove(this.f1810b);
            }
        }
        TextView textView2 = this.f1810b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1821l0 = charSequence;
    }

    public void setTitleTextColor(@C0193h0 ColorStateList colorStateList) {
        this.f1823n0 = colorStateList;
        TextView textView = this.f1810b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, @C0195i0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1820k0 = 8388627;
        this.f1827r0 = new ArrayList<>();
        this.f1828s0 = new ArrayList<>();
        this.f1829t0 = new int[2];
        this.f1831v0 = new C0459a();
        this.f1797C0 = new C0460b();
        C0549t0 a = C0549t0.m2910a(getContext(), attributeSet, C0238R.styleable.Toolbar, i, 0);
        this.f1807W = a.mo2888g(C0238R.styleable.Toolbar_titleTextAppearance, 0);
        this.f1809a0 = a.mo2888g(C0238R.styleable.Toolbar_subtitleTextAppearance, 0);
        this.f1820k0 = a.mo2883e(C0238R.styleable.Toolbar_android_gravity, this.f1820k0);
        this.f1811b0 = a.mo2883e(C0238R.styleable.Toolbar_buttonGravity, 48);
        int b = a.mo2874b(C0238R.styleable.Toolbar_titleMargin, 0);
        if (a.mo2892j(C0238R.styleable.Toolbar_titleMargins)) {
            b = a.mo2874b(C0238R.styleable.Toolbar_titleMargins, b);
        }
        this.f1816g0 = b;
        this.f1815f0 = b;
        this.f1814e0 = b;
        this.f1813d0 = b;
        int b2 = a.mo2874b(C0238R.styleable.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f1813d0 = b2;
        }
        int b3 = a.mo2874b(C0238R.styleable.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f1814e0 = b3;
        }
        int b4 = a.mo2874b(C0238R.styleable.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f1815f0 = b4;
        }
        int b5 = a.mo2874b(C0238R.styleable.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f1816g0 = b5;
        }
        this.f1812c0 = a.mo2876c(C0238R.styleable.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo2874b(C0238R.styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo2874b(C0238R.styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo2876c(C0238R.styleable.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo2876c(C0238R.styleable.Toolbar_contentInsetRight, 0);
        mo22314m();
        this.f1817h0.mo2744a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f1817h0.mo2747b(b6, b7);
        }
        this.f1818i0 = a.mo2874b(C0238R.styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1819j0 = a.mo2874b(C0238R.styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1801Q = a.mo2875b(C0238R.styleable.Toolbar_collapseIcon);
        this.f1802R = a.mo2889g(C0238R.styleable.Toolbar_collapseContentDescription);
        CharSequence g = a.mo2889g(C0238R.styleable.Toolbar_title);
        if (!TextUtils.isEmpty(g)) {
            setTitle(g);
        }
        CharSequence g2 = a.mo2889g(C0238R.styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(g2)) {
            setSubtitle(g2);
        }
        this.f1805U = getContext();
        setPopupTheme(a.mo2888g(C0238R.styleable.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo2875b(C0238R.styleable.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence g3 = a.mo2889g(C0238R.styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(g3)) {
            setNavigationContentDescription(g3);
        }
        Drawable b9 = a.mo2875b(C0238R.styleable.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence g4 = a.mo2889g(C0238R.styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(g4)) {
            setLogoDescription(g4);
        }
        if (a.mo2892j(C0238R.styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo2868a(C0238R.styleable.Toolbar_titleTextColor));
        }
        if (a.mo2892j(C0238R.styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo2868a(C0238R.styleable.Toolbar_subtitleTextColor));
        }
        if (a.mo2892j(C0238R.styleable.Toolbar_menu)) {
            mo2349a(a.mo2888g(C0238R.styleable.Toolbar_menu, 0));
        }
        a.mo2887f();
    }

    /* renamed from: c */
    private int mo22306c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1820k0 & 112;
    }

    /* renamed from: d */
    private static boolean m2532d(View view) {
        return ((C0463e) view.getLayoutParams()).f1845b == 0;
    }

    public C0463e generateLayoutParams(AttributeSet attributeSet) {
        return new C0463e(getContext(), attributeSet);
    }

    /* renamed from: c */
    private boolean m2531c(View view) {
        return view.getParent() == this || this.f1828s0.contains(view);
    }

    /* access modifiers changed from: protected */
    public C0463e generateLayoutParams(LayoutParams layoutParams) {
        if (layoutParams instanceof C0463e) {
            return new C0463e((C0463e) layoutParams);
        }
        if (layoutParams instanceof C0281b) {
            return new C0463e((C0281b) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new C0463e((MarginLayoutParams) layoutParams);
        }
        return new C0463e(layoutParams);
    }

    /* renamed from: b */
    public void mo2355b(int i, int i2) {
        mo22314m();
        this.f1817h0.mo2747b(i, i2);
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2353a(C0370g gVar, ActionMenuPresenter actionMenuPresenter) {
        if (gVar != null || this.f1808a != null) {
            m2537p();
            C0370g m = this.f1808a.mo1984m();
            if (m != gVar) {
                if (m != null) {
                    m.mo1582b((C0386n) this.f1833x0);
                    m.mo1582b((C0386n) this.f1834y0);
                }
                if (this.f1834y0 == null) {
                    this.f1834y0 = new C0462d();
                }
                actionMenuPresenter.mo1950c(true);
                if (gVar != null) {
                    gVar.mo1563a((C0386n) actionMenuPresenter, this.f1805U);
                    gVar.mo1563a((C0386n) this.f1834y0, this.f1805U);
                } else {
                    actionMenuPresenter.mo1484a(this.f1805U, (C0370g) null);
                    this.f1834y0.mo1484a(this.f1805U, (C0370g) null);
                    actionMenuPresenter.mo1489a(true);
                    this.f1834y0.mo1489a(true);
                }
                this.f1808a.setPopupTheme(this.f1806V);
                this.f1808a.setPresenter(actionMenuPresenter);
                this.f1833x0 = actionMenuPresenter;
            }
        }
    }

    /* renamed from: b */
    private int m2529b(View view, int i, int[] iArr, int i2) {
        C0463e eVar = (C0463e) view.getLayoutParams();
        int i3 = eVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m2520a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + eVar.leftMargin);
    }

    /* renamed from: e */
    private boolean m2533e(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private int mo22304b(int i) {
        int x = C0962e0.m5566x(this);
        int a = C0984g.m5636a(i, x) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (x == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m2528b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo2352a(Context context, @C0216r0 int i) {
        this.f1809a0 = i;
        TextView textView = this.f1798N;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo2349a(@C0189f0 int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo2350a(int i, int i2) {
        mo22314m();
        this.f1817h0.mo2744a(i, i2);
    }

    /* renamed from: a */
    private void m2525a(View view, boolean z) {
        C0463e eVar;
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (C0463e) layoutParams;
        }
        eVar.f1845b = 1;
        if (!z || this.f1804T == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.f1828s0.add(view);
    }

    /* renamed from: a */
    private void m2524a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, C6637f.f18605b);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m2521a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m2523a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            C0463e eVar = (C0463e) view.getLayoutParams();
            int i7 = eVar.leftMargin - i4;
            int i8 = eVar.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = Math.max(0, -i8);
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private int m2522a(View view, int i, int[] iArr, int i2) {
        C0463e eVar = (C0463e) view.getLayoutParams();
        int i3 = eVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m2520a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + eVar.rightMargin;
    }

    /* renamed from: a */
    private int m2520a(View view, int i) {
        C0463e eVar = (C0463e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = mo22306c(eVar.f866a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = eVar.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = eVar.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private void m2526a(List<View> list, int i) {
        boolean z = C0962e0.m5566x(this) == 1;
        int childCount = getChildCount();
        int a = C0984g.m5636a(i, C0962e0.m5566x(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0463e eVar = (C0463e) childAt.getLayoutParams();
                if (eVar.f1845b == 0 && m2533e(childAt) && mo22304b(eVar.f866a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0463e eVar2 = (C0463e) childAt2.getLayoutParams();
            if (eVar2.f1845b == 0 && m2533e(childAt2) && mo22304b(eVar2.f866a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private int m2519a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0999l.m5724c(marginLayoutParams) + C0999l.m5722b(marginLayoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2348a() {
        for (int size = this.f1828s0.size() - 1; size >= 0; size--) {
            addView((View) this.f1828s0.get(size));
        }
        this.f1828s0.clear();
    }

    @C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public void mo2354a(C0387a aVar, C0371a aVar2) {
        this.f1835z0 = aVar;
        this.f1795A0 = aVar2;
        ActionMenuView actionMenuView = this.f1808a;
        if (actionMenuView != null) {
            actionMenuView.mo1968a(aVar, aVar2);
        }
    }
}
