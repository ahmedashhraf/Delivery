package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.C0238R;
import androidx.appcompat.p011d.C0337a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0356b;
import androidx.appcompat.view.menu.C0358b;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0384m;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.view.menu.C0388o.C0389a;
import androidx.appcompat.view.menu.C0391q;
import androidx.appcompat.view.menu.C0395s;
import androidx.appcompat.widget.ActionMenuView.C0411a;
import androidx.core.graphics.drawable.C0892a;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.C0950b.C0951a;
import androidx.core.p034l.C0984g;
import java.util.ArrayList;

class ActionMenuPresenter extends C0358b implements C0951a {

    /* renamed from: p0 */
    private static final String f1520p0 = "ActionMenuPresenter";

    /* renamed from: V */
    C0407d f1521V;

    /* renamed from: W */
    private Drawable f1522W;

    /* renamed from: X */
    private boolean f1523X;

    /* renamed from: Y */
    private boolean f1524Y;

    /* renamed from: Z */
    private boolean f1525Z;

    /* renamed from: a0 */
    private int f1526a0;

    /* renamed from: b0 */
    private int f1527b0;

    /* renamed from: c0 */
    private int f1528c0;

    /* renamed from: d0 */
    private boolean f1529d0;

    /* renamed from: e0 */
    private boolean f1530e0;

    /* renamed from: f0 */
    private boolean f1531f0;

    /* renamed from: g0 */
    private boolean f1532g0;

    /* renamed from: h0 */
    private int f1533h0;

    /* renamed from: i0 */
    private final SparseBooleanArray f1534i0 = new SparseBooleanArray();

    /* renamed from: j0 */
    C0409e f1535j0;

    /* renamed from: k0 */
    C0404a f1536k0;

    /* renamed from: l0 */
    C0406c f1537l0;

    /* renamed from: m0 */
    private C0405b f1538m0;

    /* renamed from: n0 */
    final C0410f f1539n0 = new C0410f();

    /* renamed from: o0 */
    int f1540o0;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C0403a();

        /* renamed from: a */
        public int f1541a;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        static class C0403a implements Creator<SavedState> {
            C0403a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1541a);
        }

        SavedState(Parcel parcel) {
            this.f1541a = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0404a extends C0384m {
        public C0404a(Context context, C0395s sVar, View view) {
            super(context, sVar, view, false, C0238R.attr.actionOverflowMenuStyle);
            if (!((C0375j) sVar.getItem()).mo1672k()) {
                View view2 = ActionMenuPresenter.this.f1521V;
                if (view2 == null) {
                    view2 = (View) ActionMenuPresenter.this.f1265T;
                }
                mo1771a(view2);
            }
            mo1637a((C0387a) ActionMenuPresenter.this.f1539n0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1778e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1536k0 = null;
            actionMenuPresenter.f1540o0 = 0;
            super.mo1778e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0405b extends C0356b {
        C0405b() {
        }

        /* renamed from: a */
        public C0391q mo1410a() {
            C0404a aVar = ActionMenuPresenter.this.f1536k0;
            if (aVar != null) {
                return aVar.mo1776c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0406c implements Runnable {

        /* renamed from: a */
        private C0409e f1544a;

        public C0406c(C0409e eVar) {
            this.f1544a = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f1259N != null) {
                ActionMenuPresenter.this.f1259N.mo1557a();
            }
            View view = (View) ActionMenuPresenter.this.f1265T;
            if (!(view == null || view.getWindowToken() == null || !this.f1544a.mo1780g())) {
                ActionMenuPresenter.this.f1535j0 = this.f1544a;
            }
            ActionMenuPresenter.this.f1537l0 = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0407d extends AppCompatImageView implements C0411a {

        /* renamed from: a */
        private final float[] f1546a = new float[2];

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0408a extends C0486d0 {

            /* renamed from: U */
            final /* synthetic */ ActionMenuPresenter f1548U;

            C0408a(View view, ActionMenuPresenter actionMenuPresenter) {
                this.f1548U = actionMenuPresenter;
                super(view);
            }

            /* renamed from: a */
            public C0391q mo1408a() {
                C0409e eVar = ActionMenuPresenter.this.f1535j0;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1776c();
            }

            /* renamed from: b */
            public boolean mo1409b() {
                ActionMenuPresenter.this.mo1959k();
                return true;
            }

            /* renamed from: c */
            public boolean mo1967c() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1537l0 != null) {
                    return false;
                }
                actionMenuPresenter.mo1954f();
                return true;
            }
        }

        public C0407d(Context context) {
            super(context, null, C0238R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0557v0.m3031a(this, getContentDescription());
            setOnTouchListener(new C0408a(this, ActionMenuPresenter.this));
        }

        /* renamed from: c */
        public boolean mo1391c() {
            return false;
        }

        /* renamed from: d */
        public boolean mo1392d() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1959k();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0892a.m5145a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0409e extends C0384m {
        public C0409e(Context context, C0370g gVar, View view, boolean z) {
            super(context, gVar, view, z, C0238R.attr.actionOverflowMenuStyle);
            mo1769a((int) C0984g.f4395c);
            mo1637a((C0387a) ActionMenuPresenter.this.f1539n0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo1778e() {
            if (ActionMenuPresenter.this.f1259N != null) {
                ActionMenuPresenter.this.f1259N.close();
            }
            ActionMenuPresenter.this.f1535j0 = null;
            super.mo1778e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0410f implements C0387a {
        C0410f() {
        }

        /* renamed from: a */
        public boolean mo873a(C0370g gVar) {
            boolean z = false;
            if (gVar == null) {
                return false;
            }
            ActionMenuPresenter.this.f1540o0 = ((C0395s) gVar).getItem().getItemId();
            C0387a b = ActionMenuPresenter.this.mo1495b();
            if (b != null) {
                z = b.mo873a(gVar);
            }
            return z;
        }

        /* renamed from: a */
        public void mo872a(C0370g gVar, boolean z) {
            if (gVar instanceof C0395s) {
                gVar.mo1614n().mo1565a(false);
            }
            C0387a b = ActionMenuPresenter.this.mo1495b();
            if (b != null) {
                b.mo872a(gVar, z);
            }
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C0238R.layout.abc_action_menu_layout, C0238R.layout.abc_action_menu_item_layout);
    }

    /* renamed from: g */
    public boolean mo1955g() {
        C0404a aVar = this.f1536k0;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    /* renamed from: h */
    public boolean mo1956h() {
        return this.f1537l0 != null || mo1957i();
    }

    /* renamed from: i */
    public boolean mo1957i() {
        C0409e eVar = this.f1535j0;
        return eVar != null && eVar.mo1777d();
    }

    /* renamed from: j */
    public boolean mo1958j() {
        return this.f1524Y;
    }

    /* renamed from: k */
    public boolean mo1959k() {
        if (this.f1524Y && !mo1957i()) {
            C0370g gVar = this.f1259N;
            if (gVar != null && this.f1265T != null && this.f1537l0 == null && !gVar.mo1611k().isEmpty()) {
                C0409e eVar = new C0409e(this.f1268b, this.f1259N, this.f1521V, true);
                this.f1537l0 = new C0406c(eVar);
                ((View) this.f1265T).post(this.f1537l0);
                super.mo1494a((C0395s) null);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo1484a(@C0193h0 Context context, @C0195i0 C0370g gVar) {
        super.mo1484a(context, gVar);
        Resources resources = context.getResources();
        C0337a a = C0337a.m1868a(context);
        if (!this.f1525Z) {
            this.f1524Y = a.mo1317g();
        }
        if (!this.f1531f0) {
            this.f1526a0 = a.mo1312b();
        }
        if (!this.f1529d0) {
            this.f1528c0 = a.mo1313c();
        }
        int i = this.f1526a0;
        if (this.f1524Y) {
            if (this.f1521V == null) {
                this.f1521V = new C0407d(this.f1267a);
                if (this.f1523X) {
                    this.f1521V.setImageDrawable(this.f1522W);
                    this.f1522W = null;
                    this.f1523X = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f1521V.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1521V.getMeasuredWidth();
        } else {
            this.f1521V = null;
        }
        this.f1527b0 = i;
        this.f1533h0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    /* renamed from: b */
    public void mo1948b(int i) {
        this.f1528c0 = i;
        this.f1529d0 = true;
    }

    /* renamed from: c */
    public void mo1950c(boolean z) {
        this.f1532g0 = z;
    }

    /* renamed from: d */
    public void mo1951d(boolean z) {
        this.f1524Y = z;
        this.f1525Z = true;
    }

    /* renamed from: e */
    public Drawable mo1953e() {
        C0407d dVar = this.f1521V;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1523X) {
            return this.f1522W;
        }
        return null;
    }

    /* renamed from: f */
    public boolean mo1954f() {
        C0406c cVar = this.f1537l0;
        if (cVar != null) {
            C0388o oVar = this.f1265T;
            if (oVar != null) {
                ((View) oVar).removeCallbacks(cVar);
                this.f1537l0 = null;
                return true;
            }
        }
        C0409e eVar = this.f1535j0;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    /* renamed from: c */
    public Parcelable mo1512c() {
        SavedState savedState = new SavedState();
        savedState.f1541a = this.f1540o0;
        return savedState;
    }

    /* renamed from: b */
    public void mo1949b(boolean z) {
        if (z) {
            super.mo1494a((C0395s) null);
            return;
        }
        C0370g gVar = this.f1259N;
        if (gVar != null) {
            gVar.mo1565a(false);
        }
    }

    /* renamed from: d */
    public boolean mo1952d() {
        return mo1954f() | mo1955g();
    }

    /* renamed from: a */
    public void mo1945a(Configuration configuration) {
        if (!this.f1529d0) {
            this.f1528c0 = C0337a.m1868a(this.f1268b).mo1313c();
        }
        C0370g gVar = this.f1259N;
        if (gVar != null) {
            gVar.mo1583b(true);
        }
    }

    /* renamed from: a */
    public void mo1944a(int i, boolean z) {
        this.f1526a0 = i;
        this.f1530e0 = z;
        this.f1531f0 = true;
    }

    /* renamed from: a */
    public void mo1946a(Drawable drawable) {
        C0407d dVar = this.f1521V;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1523X = true;
        this.f1522W = drawable;
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        C0388o oVar = this.f1265T;
        C0388o a = super.mo1482a(viewGroup);
        if (oVar != a) {
            ((ActionMenuView) a).setPresenter(this);
        }
        return a;
    }

    /* renamed from: a */
    public View mo1481a(C0375j jVar, View view, ViewGroup viewGroup) {
        View actionView = jVar.getActionView();
        if (actionView == null || jVar.mo1666i()) {
            actionView = super.mo1481a(jVar, view, viewGroup);
        }
        actionView.setVisibility(jVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo1487a(C0375j jVar, C0389a aVar) {
        aVar.mo1387a(jVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1265T);
        if (this.f1538m0 == null) {
            this.f1538m0 = new C0405b();
        }
        actionMenuItemView.setPopupCallback(this.f1538m0);
    }

    /* renamed from: a */
    public boolean mo1491a(int i, C0375j jVar) {
        return jVar.mo1672k();
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        super.mo1489a(z);
        ((View) this.f1265T).requestLayout();
        C0370g gVar = this.f1259N;
        boolean z2 = false;
        if (gVar != null) {
            ArrayList d = gVar.mo1594d();
            int size = d.size();
            for (int i = 0; i < size; i++) {
                C0950b a = ((C0375j) d.get(i)).mo1423a();
                if (a != null) {
                    a.mo4766a((C0951a) this);
                }
            }
        }
        C0370g gVar2 = this.f1259N;
        ArrayList k = gVar2 != null ? gVar2.mo1611k() : null;
        if (this.f1524Y && k != null) {
            int size2 = k.size();
            if (size2 == 1) {
                z2 = !((C0375j) k.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1521V == null) {
                this.f1521V = new C0407d(this.f1267a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1521V.getParent();
            if (viewGroup != this.f1265T) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1521V);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1265T;
                actionMenuView.addView(this.f1521V, actionMenuView.mo1979h());
            }
        } else {
            C0407d dVar = this.f1521V;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                C0388o oVar = this.f1265T;
                if (parent == oVar) {
                    ((ViewGroup) oVar).removeView(this.f1521V);
                }
            }
        }
        ((ActionMenuView) this.f1265T).setOverflowReserved(this.f1524Y);
    }

    /* renamed from: a */
    public boolean mo1492a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1521V) {
            return false;
        }
        return super.mo1492a(viewGroup, i);
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        boolean z = false;
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        C0395s sVar2 = sVar;
        while (sVar2.mo1820u() != this.f1259N) {
            sVar2 = (C0395s) sVar2.mo1820u();
        }
        View a = m2312a(sVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f1540o0 = sVar.getItem().getItemId();
        int size = sVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = sVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f1536k0 = new C0404a(this.f1268b, sVar, a);
        this.f1536k0.mo1773a(z);
        this.f1536k0.mo1779f();
        super.mo1494a(sVar);
        return true;
    }

    /* renamed from: a */
    private View m2312a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1265T;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof C0389a) && ((C0389a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo1490a() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        C0370g gVar = actionMenuPresenter.f1259N;
        View view = null;
        int i5 = 0;
        if (gVar != null) {
            arrayList = gVar.mo1615o();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f1528c0;
        int i7 = actionMenuPresenter.f1527b0;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f1265T;
        int i8 = i6;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0375j jVar = (C0375j) arrayList.get(i11);
            if (jVar.mo1425c()) {
                i9++;
            } else if (jVar.mo1674m()) {
                i10++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f1532g0 && jVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f1524Y && (z || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1534i0;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1530e0) {
            int i13 = actionMenuPresenter.f1533h0;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0375j jVar2 = (C0375j) arrayList.get(i15);
            if (jVar2.mo1425c()) {
                View a = actionMenuPresenter.mo1481a(jVar2, view, viewGroup);
                if (actionMenuPresenter.f1530e0) {
                    i2 -= ActionMenuView.m2357a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = jVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                jVar2.mo1647d(true);
                i16 = measuredWidth;
                i4 = i;
            } else if (jVar2.mo1674m()) {
                int groupId2 = jVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i14 > 0 && (!actionMenuPresenter.f1530e0 || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = actionMenuPresenter.mo1481a(jVar2, null, viewGroup);
                    if (actionMenuPresenter.f1530e0) {
                        int a3 = ActionMenuView.m2357a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        z4 = a3 == 0 ? false : z4;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z3 = z4 & (!actionMenuPresenter.f1530e0 ? i14 + i16 > 0 : i14 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0375j jVar3 = (C0375j) arrayList.get(i17);
                        if (jVar3.getGroupId() == groupId2) {
                            if (jVar3.mo1672k()) {
                                i12++;
                            }
                            jVar3.mo1647d(false);
                        }
                        i17++;
                    }
                }
                if (z3) {
                    i12--;
                }
                jVar2.mo1647d(z3);
            } else {
                i4 = i;
                jVar2.mo1647d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                actionMenuPresenter = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        mo1952d();
        super.mo1486a(gVar, z);
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f1541a;
            if (i > 0) {
                MenuItem findItem = this.f1259N.findItem(i);
                if (findItem != null) {
                    mo1494a((C0395s) findItem.getSubMenu());
                }
            }
        }
    }

    /* renamed from: a */
    public void mo1947a(ActionMenuView actionMenuView) {
        this.f1265T = actionMenuView;
        actionMenuView.mo1411a(this.f1259N);
    }
}
