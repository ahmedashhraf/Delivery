package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0183c0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0211p;
import androidx.annotation.C0216r0;
import androidx.appcompat.view.menu.C0370g;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0386n;
import androidx.appcompat.view.menu.C0386n.C0387a;
import androidx.appcompat.view.menu.C0388o;
import androidx.appcompat.view.menu.C0395s;
import androidx.core.p034l.C0962e0;
import androidx.core.p034l.C1006n0;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1018b;
import androidx.recyclerview.widget.C1780y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.google.android.material.C5582R;
import java.util.ArrayList;

@C0207n0({C0208a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.internal.i */
/* compiled from: NavigationMenuPresenter */
public class C6902i implements C0386n {

    /* renamed from: h0 */
    private static final String f19314h0 = "android:menu:list";

    /* renamed from: i0 */
    private static final String f19315i0 = "android:menu:adapter";

    /* renamed from: j0 */
    private static final String f19316j0 = "android:menu:header";

    /* renamed from: N */
    private C0387a f19317N;

    /* renamed from: O */
    C0370g f19318O;

    /* renamed from: P */
    private int f19319P;

    /* renamed from: Q */
    C6905c f19320Q;

    /* renamed from: R */
    LayoutInflater f19321R;

    /* renamed from: S */
    int f19322S;

    /* renamed from: T */
    boolean f19323T;

    /* renamed from: U */
    ColorStateList f19324U;

    /* renamed from: V */
    ColorStateList f19325V;

    /* renamed from: W */
    Drawable f19326W;

    /* renamed from: X */
    int f19327X;

    /* renamed from: Y */
    int f19328Y;

    /* renamed from: Z */
    int f19329Z;

    /* renamed from: a */
    private NavigationMenuView f19330a;

    /* renamed from: a0 */
    boolean f19331a0;

    /* renamed from: b */
    LinearLayout f19332b;

    /* renamed from: b0 */
    boolean f19333b0 = true;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f19334c0;

    /* renamed from: d0 */
    private int f19335d0;

    /* renamed from: e0 */
    int f19336e0;

    /* renamed from: f0 */
    private int f19337f0 = -1;

    /* renamed from: g0 */
    final OnClickListener f19338g0 = new C6903a();

    /* renamed from: com.google.android.material.internal.i$a */
    /* compiled from: NavigationMenuPresenter */
    class C6903a implements OnClickListener {
        C6903a() {
        }

        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            boolean z = true;
            C6902i.this.mo27601c(true);
            C0375j itemData = navigationMenuItemView.getItemData();
            C6902i iVar = C6902i.this;
            boolean a = iVar.f19318O.mo1567a((MenuItem) itemData, (C0386n) iVar, 0);
            if (itemData == null || !itemData.isCheckable() || !a) {
                z = false;
            } else {
                C6902i.this.f19320Q.mo27618a(itemData);
            }
            C6902i.this.mo27601c(false);
            if (z) {
                C6902i.this.mo1489a(false);
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    /* compiled from: NavigationMenuPresenter */
    private static class C6904b extends C6914l {
        public C6904b(View view) {
            super(view);
        }
    }

    /* renamed from: com.google.android.material.internal.i$c */
    /* compiled from: NavigationMenuPresenter */
    private class C6905c extends C1638g<C6914l> {

        /* renamed from: g */
        private static final String f19340g = "android:menu:checked";

        /* renamed from: h */
        private static final String f19341h = "android:menu:action_views";

        /* renamed from: i */
        private static final int f19342i = 0;

        /* renamed from: j */
        private static final int f19343j = 1;

        /* renamed from: k */
        private static final int f19344k = 2;

        /* renamed from: l */
        private static final int f19345l = 3;

        /* renamed from: c */
        private final ArrayList<C6907e> f19346c = new ArrayList<>();

        /* renamed from: d */
        private C0375j f19347d;

        /* renamed from: e */
        private boolean f19348e;

        C6905c() {
            m33201j();
        }

        /* renamed from: e */
        private void m33200e(int i, int i2) {
            while (i < i2) {
                ((C6909g) this.f19346c.get(i)).f19353b = true;
                i++;
            }
        }

        /* renamed from: j */
        private void m33201j() {
            if (!this.f19348e) {
                this.f19348e = true;
                this.f19346c.clear();
                this.f19346c.add(new C6906d());
                int size = C6902i.this.f19318O.mo1615o().size();
                int i = -1;
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0375j jVar = (C0375j) C6902i.this.f19318O.mo1615o().get(i3);
                    if (jVar.isChecked()) {
                        mo27618a(jVar);
                    }
                    if (jVar.isCheckable()) {
                        jVar.mo1645c(false);
                    }
                    if (jVar.hasSubMenu()) {
                        SubMenu subMenu = jVar.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i3 != 0) {
                                this.f19346c.add(new C6908f(C6902i.this.f19336e0, 0));
                            }
                            this.f19346c.add(new C6909g(jVar));
                            int size2 = this.f19346c.size();
                            int size3 = subMenu.size();
                            boolean z2 = false;
                            for (int i4 = 0; i4 < size3; i4++) {
                                C0375j jVar2 = (C0375j) subMenu.getItem(i4);
                                if (jVar2.isVisible()) {
                                    if (!z2 && jVar2.getIcon() != null) {
                                        z2 = true;
                                    }
                                    if (jVar2.isCheckable()) {
                                        jVar2.mo1645c(false);
                                    }
                                    if (jVar.isChecked()) {
                                        mo27618a(jVar);
                                    }
                                    this.f19346c.add(new C6909g(jVar2));
                                }
                            }
                            if (z2) {
                                m33200e(size2, this.f19346c.size());
                            }
                        }
                    } else {
                        int groupId = jVar.getGroupId();
                        if (groupId != i) {
                            i2 = this.f19346c.size();
                            boolean z3 = jVar.getIcon() != null;
                            if (i3 != 0) {
                                i2++;
                                ArrayList<C6907e> arrayList = this.f19346c;
                                int i5 = C6902i.this.f19336e0;
                                arrayList.add(new C6908f(i5, i5));
                            }
                            z = z3;
                        } else if (!z && jVar.getIcon() != null) {
                            m33200e(i2, this.f19346c.size());
                            z = true;
                        }
                        C6909g gVar = new C6909g(jVar);
                        gVar.f19353b = z;
                        this.f19346c.add(gVar);
                        i = groupId;
                    }
                }
                this.f19348e = false;
            }
        }

        /* renamed from: a */
        public void mo7330b(@C0193h0 C6914l lVar, int i) {
            int c = mo7333c(i);
            if (c == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f6294a;
                navigationMenuItemView.setIconTintList(C6902i.this.f19325V);
                C6902i iVar = C6902i.this;
                if (iVar.f19323T) {
                    navigationMenuItemView.setTextAppearance(iVar.f19322S);
                }
                ColorStateList colorStateList = C6902i.this.f19324U;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable = C6902i.this.f19326W;
                C0962e0.m5440a((View) navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
                C6909g gVar = (C6909g) this.f19346c.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.f19353b);
                navigationMenuItemView.setHorizontalPadding(C6902i.this.f19327X);
                navigationMenuItemView.setIconPadding(C6902i.this.f19328Y);
                C6902i iVar2 = C6902i.this;
                if (iVar2.f19331a0) {
                    navigationMenuItemView.setIconSize(iVar2.f19329Z);
                }
                navigationMenuItemView.setMaxLines(C6902i.this.f19334c0);
                navigationMenuItemView.mo1387a(gVar.mo27628a(), 0);
            } else if (c == 1) {
                ((TextView) lVar.f6294a).setText(((C6909g) this.f19346c.get(i)).mo27628a().getTitle());
            } else if (c == 2) {
                C6908f fVar = (C6908f) this.f19346c.get(i);
                lVar.f6294a.setPadding(0, fVar.mo27627b(), 0, fVar.mo27626a());
            }
        }

        /* renamed from: b */
        public long mo7326b(int i) {
            return (long) i;
        }

        /* renamed from: c */
        public int mo7333c(int i) {
            C6907e eVar = (C6907e) this.f19346c.get(i);
            if (eVar instanceof C6908f) {
                return 2;
            }
            if (eVar instanceof C6906d) {
                return 3;
            }
            if (eVar instanceof C6909g) {
                return ((C6909g) eVar).mo27628a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @C0193h0
        /* renamed from: f */
        public Bundle mo27622f() {
            Bundle bundle = new Bundle();
            C0375j jVar = this.f19347d;
            if (jVar != null) {
                bundle.putInt(f19340g, jVar.getItemId());
            }
            SparseArray sparseArray = new SparseArray();
            int size = this.f19346c.size();
            for (int i = 0; i < size; i++) {
                C6907e eVar = (C6907e) this.f19346c.get(i);
                if (eVar instanceof C6909g) {
                    C0375j a = ((C6909g) eVar).mo27628a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(f19341h, sparseArray);
            return bundle;
        }

        /* renamed from: g */
        public C0375j mo27623g() {
            return this.f19347d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo27624h() {
            int i = C6902i.this.f19332b.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < C6902i.this.f19320Q.mo7325b(); i2++) {
                if (C6902i.this.f19320Q.mo7333c(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: i */
        public void mo27625i() {
            m33201j();
            mo7341e();
        }

        /* renamed from: b */
        public int mo7325b() {
            return this.f19346c.size();
        }

        @C0195i0
        /* renamed from: b */
        public C6914l m33209b(ViewGroup viewGroup, int i) {
            if (i == 0) {
                C6902i iVar = C6902i.this;
                return new C6911i(iVar.f19321R, viewGroup, iVar.f19338g0);
            } else if (i == 1) {
                return new C6913k(C6902i.this.f19321R, viewGroup);
            } else {
                if (i == 2) {
                    return new C6912j(C6902i.this.f19321R, viewGroup);
                }
                if (i != 3) {
                    return null;
                }
                return new C6904b(C6902i.this.f19332b);
            }
        }

        /* renamed from: b */
        public void mo27621b(boolean z) {
            this.f19348e = z;
        }

        /* renamed from: a */
        public void mo7339d(C6914l lVar) {
            if (lVar instanceof C6911i) {
                ((NavigationMenuItemView) lVar.f6294a).mo27510g();
            }
        }

        /* renamed from: a */
        public void mo27618a(@C0193h0 C0375j jVar) {
            if (this.f19347d != jVar && jVar.isCheckable()) {
                C0375j jVar2 = this.f19347d;
                if (jVar2 != null) {
                    jVar2.setChecked(false);
                }
                this.f19347d = jVar;
                jVar.setChecked(true);
            }
        }

        /* renamed from: a */
        public void mo27617a(@C0193h0 Bundle bundle) {
            int i = bundle.getInt(f19340g, 0);
            if (i != 0) {
                this.f19348e = true;
                int size = this.f19346c.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    C6907e eVar = (C6907e) this.f19346c.get(i2);
                    if (eVar instanceof C6909g) {
                        C0375j a = ((C6909g) eVar).mo27628a();
                        if (a != null && a.getItemId() == i) {
                            mo27618a(a);
                            break;
                        }
                    }
                    i2++;
                }
                this.f19348e = false;
                m33201j();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(f19341h);
            if (sparseParcelableArray != null) {
                int size2 = this.f19346c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    C6907e eVar2 = (C6907e) this.f19346c.get(i3);
                    if (eVar2 instanceof C6909g) {
                        C0375j a2 = ((C6909g) eVar2).mo27628a();
                        if (a2 != null) {
                            View actionView = a2.getActionView();
                            if (actionView != null) {
                                ParcelableSparseArray parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId());
                                if (parcelableSparseArray != null) {
                                    actionView.restoreHierarchyState(parcelableSparseArray);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$d */
    /* compiled from: NavigationMenuPresenter */
    private static class C6906d implements C6907e {
        C6906d() {
        }
    }

    /* renamed from: com.google.android.material.internal.i$e */
    /* compiled from: NavigationMenuPresenter */
    private interface C6907e {
    }

    /* renamed from: com.google.android.material.internal.i$f */
    /* compiled from: NavigationMenuPresenter */
    private static class C6908f implements C6907e {

        /* renamed from: a */
        private final int f19350a;

        /* renamed from: b */
        private final int f19351b;

        public C6908f(int i, int i2) {
            this.f19350a = i;
            this.f19351b = i2;
        }

        /* renamed from: a */
        public int mo27626a() {
            return this.f19351b;
        }

        /* renamed from: b */
        public int mo27627b() {
            return this.f19350a;
        }
    }

    /* renamed from: com.google.android.material.internal.i$g */
    /* compiled from: NavigationMenuPresenter */
    private static class C6909g implements C6907e {

        /* renamed from: a */
        private final C0375j f19352a;

        /* renamed from: b */
        boolean f19353b;

        C6909g(C0375j jVar) {
            this.f19352a = jVar;
        }

        /* renamed from: a */
        public C0375j mo27628a() {
            return this.f19352a;
        }
    }

    /* renamed from: com.google.android.material.internal.i$h */
    /* compiled from: NavigationMenuPresenter */
    private class C6910h extends C1780y {
        C6910h(@C0193h0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        /* renamed from: a */
        public void mo4749a(View view, @C0193h0 C1016d dVar) {
            super.mo4749a(view, dVar);
            dVar.mo4939a((Object) C1018b.m5959a(C6902i.this.f19320Q.mo27624h(), 0, false));
        }
    }

    /* renamed from: com.google.android.material.internal.i$i */
    /* compiled from: NavigationMenuPresenter */
    private static class C6911i extends C6914l {
        public C6911i(@C0193h0 LayoutInflater layoutInflater, ViewGroup viewGroup, OnClickListener onClickListener) {
            super(layoutInflater.inflate(C5582R.layout.design_navigation_item, viewGroup, false));
            this.f6294a.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: com.google.android.material.internal.i$j */
    /* compiled from: NavigationMenuPresenter */
    private static class C6912j extends C6914l {
        public C6912j(@C0193h0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C5582R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.i$k */
    /* compiled from: NavigationMenuPresenter */
    private static class C6913k extends C6914l {
        public C6913k(@C0193h0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(C5582R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* renamed from: com.google.android.material.internal.i$l */
    /* compiled from: NavigationMenuPresenter */
    private static abstract class C6914l extends C1635d0 {
        public C6914l(View view) {
            super(view);
        }
    }

    /* renamed from: l */
    private void m33161l() {
        int i = (this.f19332b.getChildCount() != 0 || !this.f19333b0) ? 0 : this.f19335d0;
        NavigationMenuView navigationMenuView = this.f19330a;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: a */
    public boolean mo1490a() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1493a(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo1494a(C0395s sVar) {
        return false;
    }

    @C0195i0
    /* renamed from: b */
    public C0375j mo27596b() {
        return this.f19320Q.mo27623g();
    }

    /* renamed from: b */
    public boolean mo1497b(C0370g gVar, C0375j jVar) {
        return false;
    }

    /* renamed from: c */
    public void mo27600c(int i) {
        this.f19319P = i;
    }

    /* renamed from: d */
    public int mo27602d() {
        return this.f19332b.getChildCount();
    }

    @C0195i0
    /* renamed from: e */
    public Drawable mo27604e() {
        return this.f19326W;
    }

    /* renamed from: f */
    public int mo27606f() {
        return this.f19327X;
    }

    /* renamed from: g */
    public int mo27608g() {
        return this.f19328Y;
    }

    public int getId() {
        return this.f19319P;
    }

    /* renamed from: h */
    public void mo27611h(@C0216r0 int i) {
        this.f19322S = i;
        this.f19323T = true;
        mo1489a(false);
    }

    @C0195i0
    /* renamed from: i */
    public ColorStateList mo27612i() {
        return this.f19324U;
    }

    @C0195i0
    /* renamed from: j */
    public ColorStateList mo27614j() {
        return this.f19325V;
    }

    /* renamed from: k */
    public boolean mo27615k() {
        return this.f19333b0;
    }

    /* renamed from: a */
    public void mo1484a(@C0193h0 Context context, @C0193h0 C0370g gVar) {
        this.f19321R = LayoutInflater.from(context);
        this.f19318O = gVar;
        this.f19336e0 = context.getResources().getDimensionPixelOffset(C5582R.dimen.design_navigation_separator_vertical_padding);
    }

    /* renamed from: b */
    public View mo27595b(@C0183c0 int i) {
        View inflate = this.f19321R.inflate(i, this.f19332b, false);
        mo27592a(inflate);
        return inflate;
    }

    @C0193h0
    /* renamed from: c */
    public Parcelable mo1512c() {
        Bundle bundle = new Bundle();
        if (this.f19330a != null) {
            SparseArray sparseArray = new SparseArray();
            this.f19330a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C6905c cVar = this.f19320Q;
        if (cVar != null) {
            bundle.putBundle(f19315i0, cVar.mo27622f());
        }
        if (this.f19332b != null) {
            SparseArray sparseArray2 = new SparseArray();
            this.f19332b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(f19316j0, sparseArray2);
        }
        return bundle;
    }

    /* renamed from: d */
    public void mo27603d(int i) {
        this.f19327X = i;
        mo1489a(false);
    }

    /* renamed from: e */
    public void mo27605e(int i) {
        this.f19328Y = i;
        mo1489a(false);
    }

    /* renamed from: f */
    public void mo27607f(@C0211p int i) {
        if (this.f19329Z != i) {
            this.f19329Z = i;
            this.f19331a0 = true;
            mo1489a(false);
        }
    }

    /* renamed from: g */
    public void mo27609g(int i) {
        this.f19334c0 = i;
        mo1489a(false);
    }

    /* renamed from: i */
    public void mo27613i(int i) {
        this.f19337f0 = i;
        NavigationMenuView navigationMenuView = this.f19330a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    /* renamed from: b */
    public void mo27598b(@C0193h0 View view) {
        this.f19332b.removeView(view);
        if (this.f19332b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f19330a;
            navigationMenuView.setPadding(0, this.f19335d0, 0, navigationMenuView.getPaddingBottom());
        }
    }

    /* renamed from: h */
    public int mo27610h() {
        return this.f19334c0;
    }

    /* renamed from: a */
    public C0388o mo1482a(ViewGroup viewGroup) {
        if (this.f19330a == null) {
            this.f19330a = (NavigationMenuView) this.f19321R.inflate(C5582R.layout.design_navigation_menu, viewGroup, false);
            NavigationMenuView navigationMenuView = this.f19330a;
            navigationMenuView.setAccessibilityDelegateCompat(new C6910h(navigationMenuView));
            if (this.f19320Q == null) {
                this.f19320Q = new C6905c();
            }
            int i = this.f19337f0;
            if (i != -1) {
                this.f19330a.setOverScrollMode(i);
            }
            this.f19332b = (LinearLayout) this.f19321R.inflate(C5582R.layout.design_navigation_item_header, this.f19330a, false);
            this.f19330a.setAdapter(this.f19320Q);
        }
        return this.f19330a;
    }

    /* renamed from: b */
    public void mo27597b(@C0195i0 ColorStateList colorStateList) {
        this.f19324U = colorStateList;
        mo1489a(false);
    }

    /* renamed from: b */
    public void mo27599b(boolean z) {
        if (this.f19333b0 != z) {
            this.f19333b0 = z;
            m33161l();
        }
    }

    /* renamed from: c */
    public void mo27601c(boolean z) {
        C6905c cVar = this.f19320Q;
        if (cVar != null) {
            cVar.mo27621b(z);
        }
    }

    /* renamed from: a */
    public void mo1489a(boolean z) {
        C6905c cVar = this.f19320Q;
        if (cVar != null) {
            cVar.mo27625i();
        }
    }

    /* renamed from: a */
    public void mo1488a(C0387a aVar) {
        this.f19317N = aVar;
    }

    /* renamed from: a */
    public void mo1486a(C0370g gVar, boolean z) {
        C0387a aVar = this.f19317N;
        if (aVar != null) {
            aVar.mo872a(gVar, z);
        }
    }

    /* renamed from: a */
    public void mo1505a(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f19330a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(f19315i0);
            if (bundle2 != null) {
                this.f19320Q.mo27617a(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(f19316j0);
            if (sparseParcelableArray2 != null) {
                this.f19332b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    /* renamed from: a */
    public void mo27593a(@C0193h0 C0375j jVar) {
        this.f19320Q.mo27618a(jVar);
    }

    /* renamed from: a */
    public void mo27592a(@C0193h0 View view) {
        this.f19332b.addView(view);
        NavigationMenuView navigationMenuView = this.f19330a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    /* renamed from: a */
    public View mo27589a(int i) {
        return this.f19332b.getChildAt(i);
    }

    /* renamed from: a */
    public void mo27590a(@C0195i0 ColorStateList colorStateList) {
        this.f19325V = colorStateList;
        mo1489a(false);
    }

    /* renamed from: a */
    public void mo27591a(@C0195i0 Drawable drawable) {
        this.f19326W = drawable;
        mo1489a(false);
    }

    /* renamed from: a */
    public void mo27594a(@C0193h0 C1006n0 n0Var) {
        int l = n0Var.mo4888l();
        if (this.f19335d0 != l) {
            this.f19335d0 = l;
            m33161l();
        }
        NavigationMenuView navigationMenuView = this.f19330a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, n0Var.mo4885i());
        C0962e0.m5429a((View) this.f19332b, n0Var);
    }
}
