package com.mrsool.shopmenu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C1103b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.C1817b;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import com.google.gson.C8775f;
import com.mrsool.C10232R;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11730j;
import com.mrsool.shop.ShopDetailPackageActivity;
import com.mrsool.shopmenu.C11454x.C11457c;
import com.mrsool.shopmenu.bean.MenuAddonsBean;
import com.mrsool.shopmenu.bean.MenuAddonsOptionsBean;
import com.mrsool.shopmenu.bean.MenuCategoryBean;
import com.mrsool.shopmenu.bean.MenuItemBean;
import com.mrsool.shopmenu.bean.MenuVarietyBean;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p076c.p082c.p083a.C2232l;
import p076c.p112d.p148d.p150g.C6637f;

public class AddServiceMenuActivity extends C0295d implements OnClickListener, Cloneable {

    /* renamed from: N */
    private RecyclerView f31378N;

    /* renamed from: O */
    private RecyclerView f31379O;

    /* renamed from: P */
    private WrapContentLinearLayoutManager f31380P;

    /* renamed from: Q */
    private WrapContentLinearLayoutManager f31381Q;

    /* renamed from: R */
    private C11454x f31382R;

    /* renamed from: S */
    private C11378n f31383S;

    /* renamed from: T */
    private ImageView f31384T;

    /* renamed from: U */
    private ImageView f31385U;

    /* renamed from: V */
    private ImageView f31386V;

    /* renamed from: W */
    private TextView f31387W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public TextView f31388X;

    /* renamed from: Y */
    private TextView f31389Y;

    /* renamed from: Z */
    private TextView f31390Z;

    /* renamed from: a */
    private C5887x f31391a;

    /* renamed from: a0 */
    private TextView f31392a0;

    /* renamed from: b */
    private ImageView f31393b;

    /* renamed from: b0 */
    private TextView f31394b0;

    /* renamed from: c0 */
    private TextView f31395c0;

    /* renamed from: d0 */
    private TextView f31396d0;

    /* renamed from: e0 */
    private int f31397e0 = 1;

    /* renamed from: f0 */
    private ArrayList<MenuVarietyBean> f31398f0 = new ArrayList<>();

    /* renamed from: g0 */
    private List<MenuAddonsBean> f31399g0;

    /* renamed from: h0 */
    private LinearLayout f31400h0;

    /* renamed from: i0 */
    private Boolean f31401i0 = Boolean.valueOf(false);

    /* renamed from: j0 */
    private int f31402j0 = -1;

    /* renamed from: k0 */
    private int f31403k0 = -1;

    /* renamed from: l0 */
    private int f31404l0 = -1;

    /* renamed from: m0 */
    private Bundle f31405m0;

    /* renamed from: n0 */
    private LinearLayout f31406n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public NestedScrollView f31407o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public ExpandableListView f31408p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public C11408r f31409q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public ArrayList<MenuAddonsBean> f31410r0;

    /* renamed from: s0 */
    public TabLayout f31411s0;

    /* renamed from: t0 */
    private TextView f31412t0;

    /* renamed from: u0 */
    boolean f31413u0 = false;

    /* renamed from: v0 */
    boolean f31414v0 = false;

    /* renamed from: w0 */
    int f31415w0 = 0;

    /* renamed from: x0 */
    Handler f31416x0 = new Handler();

    /* renamed from: y0 */
    Runnable f31417y0 = new C11266c();

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$a */
    class C11264a implements C11457c {
        C11264a() {
        }

        /* renamed from: a */
        public void mo39105a(int i) {
            if (Integer.parseInt(AddServiceMenuActivity.this.f31388X.getTag().toString()) == 1) {
                AddServiceMenuActivity.this.m50923M();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$b */
    class C11265b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f31419a;

        C11265b(int i) {
            this.f31419a = i;
        }

        public void run() {
            AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
            AddServiceMenuActivity.this.f31407o0.mo5286b(0, ((int) (((float) addServiceMenuActivity.m50949c(addServiceMenuActivity.f31408p0, this.f31419a)) + AddServiceMenuActivity.this.getResources().getDimension(C10232R.dimen.dp_141))) - AddServiceMenuActivity.this.f31411s0.getMeasuredHeight());
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$c */
    class C11266c implements Runnable {
        C11266c() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Runnable isUserClick =");
            sb.append(AddServiceMenuActivity.this.f31414v0);
            sb.toString();
            AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
            if (addServiceMenuActivity.f31414v0) {
                addServiceMenuActivity.f31414v0 = false;
                return;
            }
            ExpandableListAdapter expandableListAdapter = addServiceMenuActivity.f31408p0.getExpandableListAdapter();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(AddServiceMenuActivity.this.f31408p0.getWidth(), C6637f.f18605b);
            int i = 0;
            int i2 = 0;
            while (i < expandableListAdapter.getGroupCount()) {
                View groupView = expandableListAdapter.getGroupView(i, false, null, AddServiceMenuActivity.this.f31408p0);
                groupView.measure(makeMeasureSpec, 0);
                int measuredHeight = groupView.getMeasuredHeight() + i2;
                groupView.getMeasuredHeight();
                if (AddServiceMenuActivity.this.f31408p0.isGroupExpanded(i)) {
                    int i3 = measuredHeight;
                    for (int i4 = 0; i4 < expandableListAdapter.getChildrenCount(i); i4++) {
                        View childView = expandableListAdapter.getChildView(i, i4, false, null, AddServiceMenuActivity.this.f31408p0);
                        childView.measure(makeMeasureSpec, 0);
                        i3 += childView.getMeasuredHeight();
                        childView.getMeasuredHeight();
                    }
                    measuredHeight = i3;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scroll=");
                sb2.append(AddServiceMenuActivity.this.f31415w0);
                sb2.append("   item=");
                sb2.append(i);
                sb2.append("   start=");
                sb2.append(i2);
                sb2.append("   end=");
                sb2.append(measuredHeight);
                sb2.toString();
                AddServiceMenuActivity addServiceMenuActivity2 = AddServiceMenuActivity.this;
                int i5 = addServiceMenuActivity2.f31415w0;
                if (i5 >= i2 && i5 <= measuredHeight && i != addServiceMenuActivity2.f31411s0.getSelectedTabPosition()) {
                    AddServiceMenuActivity addServiceMenuActivity3 = AddServiceMenuActivity.this;
                    addServiceMenuActivity3.f31413u0 = true;
                    TabLayout tabLayout = addServiceMenuActivity3.f31411s0;
                    tabLayout.mo28123d(tabLayout.mo28096a(i));
                }
                i++;
                i2 = measuredHeight;
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$d */
    class C11267d implements C1103b {
        C11267d() {
        }

        /* renamed from: a */
        public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
            float f = (float) i2;
            addServiceMenuActivity.f31415w0 = (int) ((f - addServiceMenuActivity.getResources().getDimension(C10232R.dimen.dp_132)) + ((float) AddServiceMenuActivity.this.f31411s0.getMeasuredHeight()));
            AddServiceMenuActivity.this.f31416x0.removeCallbacksAndMessages(null);
            if (f > AddServiceMenuActivity.this.getResources().getDimension(C10232R.dimen.dp_132) - ((float) AddServiceMenuActivity.this.f31411s0.getMeasuredHeight())) {
                AddServiceMenuActivity.this.m50932V();
                AddServiceMenuActivity addServiceMenuActivity2 = AddServiceMenuActivity.this;
                addServiceMenuActivity2.f31416x0.postDelayed(addServiceMenuActivity2.f31417y0, 80);
                return;
            }
            AddServiceMenuActivity addServiceMenuActivity3 = AddServiceMenuActivity.this;
            addServiceMenuActivity3.f31413u0 = true;
            TabLayout tabLayout = addServiceMenuActivity3.f31411s0;
            tabLayout.mo28123d(tabLayout.mo28096a(0));
            AddServiceMenuActivity.this.m50921K();
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$e */
    class C11268e implements C7051h {
        C11268e() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
            if (!addServiceMenuActivity.f31413u0) {
                addServiceMenuActivity.f31414v0 = true;
            }
            AddServiceMenuActivity.this.m50961k(kVar.mo28203f());
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
            if (!addServiceMenuActivity.f31413u0) {
                addServiceMenuActivity.f31414v0 = true;
            }
            AddServiceMenuActivity.this.m50961k(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$f */
    class C11269f extends C11725f {
        C11269f() {
        }

        /* renamed from: e */
        public void mo38064e(int i) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$g */
    class C11270g implements OnGroupClickListener {
        C11270g() {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            AddServiceMenuActivity.this.m50952d(expandableListView, i);
            expandableListView.isGroupExpanded(i);
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$h */
    class C11271h implements OnChildClickListener {
        C11271h() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            if (((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getType() == 0) {
                AddServiceMenuActivity.this.m50962l(i);
                ((MenuVarietyBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getmVarietiesArray().get(i2)).setSelected(true);
                AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
            } else if (((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().size() == 0) {
                ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).setSelected(!((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).isSelected());
                AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
            } else if (((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMaxAllowedOption() == 0 && ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMinAllowedOption() == 0) {
                ((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).setValidationError(false);
                AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
            } else {
                MenuAddonsOptionsBean menuAddonsOptionsBean = (MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2);
                if (TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
                } else if (!TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
                } else if (((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).isSelected()) {
                    ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).setValidationError(false);
                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                    AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
                } else if (AddServiceMenuActivity.this.m50960j(i) < ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMaxAllowedOption()) {
                    ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).setValidationError(false);
                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) AddServiceMenuActivity.this.f31410r0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                    AddServiceMenuActivity.this.f31409q0.notifyDataSetChanged();
                }
            }
            AddServiceMenuActivity.this.m50933W();
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.AddServiceMenuActivity$i */
    class C11272i implements Runnable {
        C11272i() {
        }

        public void run() {
            if (AddServiceMenuActivity.this.f31410r0 != null) {
                AddServiceMenuActivity addServiceMenuActivity = AddServiceMenuActivity.this;
                addServiceMenuActivity.mo39101a(addServiceMenuActivity.f31408p0);
            }
        }
    }

    /* renamed from: E */
    private List<MenuAddonsBean> m50916E() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo39100D().getArrayListAddons().size(); i++) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setTitle(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getName());
            menuAddonsBean.setType(1);
            menuAddonsBean.setDescription(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getDescription());
            menuAddonsBean.setId(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getId());
            menuAddonsBean.setName(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getName());
            menuAddonsBean.setMaxAllowedOption(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMaxAllowedOption());
            menuAddonsBean.setMinAllowedOption(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMinAllowedOption());
            menuAddonsBean.setMenuAddonId(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonId());
            menuAddonsBean.setPrice(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getPrice());
            menuAddonsBean.setErrorMessage(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getErrorMessage());
            menuAddonsBean.setStatus(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getStatus());
            if (((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMinAllowedOption() == 1 && ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMaxAllowedOption() <= 1) {
                ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).setSelected(true);
            }
            menuAddonsBean.setSelected(((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).isSelected());
            menuAddonsBean.setMenuAddonOptions(m50958i(i));
            this.f31410r0.add(menuAddonsBean);
            arrayList.add(menuAddonsBean);
        }
        return arrayList;
    }

    /* renamed from: G */
    private void m50917G() {
        for (MenuVarietyBean menuVarietyBean : mo39099C()) {
            if (!this.f31401i0.booleanValue() && menuVarietyBean.getId().equalsIgnoreCase(mo39100D().getDefaultVarietyId())) {
                menuVarietyBean.setSelected(true);
            }
            try {
                this.f31398f0.add((MenuVarietyBean) menuVarietyBean.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        if (this.f31398f0.size() > 0) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setType(0);
            menuAddonsBean.setTitle(getString(C10232R.string.lbl_varieties));
            menuAddonsBean.setmVarietiesArray(this.f31398f0);
            this.f31410r0.add(menuAddonsBean);
        }
    }

    /* renamed from: H */
    private void m50918H() {
        for (int i = 0; i < this.f31408p0.getExpandableListAdapter().getGroupCount(); i++) {
            this.f31408p0.expandGroup(i);
        }
    }

    /* renamed from: I */
    private C1817b m50919I() {
        C1817b bVar = new C1817b(this);
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* renamed from: J */
    private MenuCategoryBean m50920J() {
        return (MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m50921K() {
        this.f31411s0.animate().alpha(0.0f).setDuration(400);
    }

    /* renamed from: L */
    private Boolean m50922L() {
        boolean z = true;
        for (int i = 0; i < this.f31399g0.size(); i++) {
            if (((MenuAddonsBean) this.f31399g0.get(i)).getMaxAllowedOption() > 0 && ((MenuAddonsBean) this.f31399g0.get(i)).getMinAllowedOption() > 0) {
                int i2 = 0;
                for (int i3 = 0; i3 < ((MenuAddonsBean) this.f31399g0.get(i)).getMenuAddonOptions().size(); i3++) {
                    if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f31399g0.get(i)).getMenuAddonOptions().get(i3)).isSelected()) {
                        i2++;
                    }
                }
                if ((!((MenuAddonsBean) this.f31399g0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33266b7) || i2 >= ((MenuAddonsBean) this.f31399g0.get(i)).getMinAllowedOption()) && i2 <= ((MenuAddonsBean) this.f31399g0.get(i)).getMaxAllowedOption()) {
                    ((MenuAddonsBean) this.f31399g0.get(i)).setValidationError(false);
                } else {
                    ((MenuAddonsBean) this.f31399g0.get(i)).setValidationError(true);
                    z = false;
                }
            }
            if (z && ((MenuAddonsBean) this.f31399g0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                ((MenuAddonsBean) this.f31399g0.get(i)).setSelected(false);
            }
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public Boolean m50923M() {
        boolean z;
        int size = this.f31398f0.size();
        Boolean valueOf = Boolean.valueOf(true);
        if (size == 0) {
            return valueOf;
        }
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= this.f31398f0.size()) {
                z = false;
                break;
            }
            if (((MenuVarietyBean) this.f31398f0.get(i)).getStatus().equals(C11644i.f33266b7)) {
                z2 = true;
            }
            if (((MenuVarietyBean) this.f31398f0.get(i)).getSelected()) {
                z = true;
                break;
            }
            i++;
        }
        if (!z2) {
            return valueOf;
        }
        if (!z) {
            this.f31388X.setTag(Integer.valueOf(1));
            this.f31388X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.red_lite_2));
            this.f31389Y.setVisibility(0);
        } else {
            this.f31388X.setTag(Integer.valueOf(0));
            this.f31388X.setTextColor(C0841b.m4915a((Context) this, (int) C10232R.C10234color.Black));
            this.f31389Y.setVisibility(8);
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: N */
    private void m50924N() {
        this.f31405m0 = getIntent().getExtras();
        Bundle bundle = this.f31405m0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33332j1)) {
                this.f31402j0 = this.f31405m0.getInt(C11644i.f33332j1);
            }
            if (this.f31405m0.containsKey(C11644i.f33043A1)) {
                this.f31401i0 = Boolean.valueOf(this.f31405m0.getBoolean(C11644i.f33043A1));
            }
        }
    }

    /* renamed from: O */
    private void m50925O() {
        this.f31407o0.setOnScrollChangeListener(new C11267d());
        Iterator it = this.f31410r0.iterator();
        while (it.hasNext()) {
            MenuAddonsBean menuAddonsBean = (MenuAddonsBean) it.next();
            TabLayout tabLayout = this.f31411s0;
            tabLayout.mo28105a(tabLayout.mo28126f().mo28195b((CharSequence) menuAddonsBean.getTitle().trim()));
            TabLayout tabLayout2 = this.f31411s0;
            ((TextView) tabLayout2.mo28096a(tabLayout2.getTabCount() - 1).f19940i.getChildAt(1)).setSingleLine(true);
        }
        this.f31411s0.mo28104a((C7051h) new C11268e());
        this.f31409q0 = new C11408r(this, mo39100D().getCurrency(), new C11269f());
        this.f31408p0.setOnGroupClickListener(new C11270g());
        this.f31408p0.setOnChildClickListener(new C11271h());
        this.f31409q0.mo39479a(this.f31410r0);
        this.f31408p0.setAdapter(this.f31409q0);
        m50918H();
        this.f31409q0.notifyDataSetChanged();
        new Handler().postDelayed(new C11272i(), 100);
        m50933W();
    }

    /* renamed from: P */
    private void m50926P() {
        try {
            C2232l.m11649c(getApplicationContext()).mo9515a(mo39100D().getPhotoUrl()).m11492c((Drawable) m50919I()).m11496d().m11491c((int) C10232R.C10235drawable.img_placeholder).mo9424a(this.f31384T);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f31387W.setText(mo39100D().getName());
    }

    /* renamed from: Q */
    private void m50927Q() {
        if (!TextUtils.isEmpty(mo39100D().getLongDesc())) {
            this.f31396d0.setVisibility(0);
            this.f31396d0.setText(mo39100D().getLongDesc());
        }
    }

    /* renamed from: R */
    private void m50928R() {
        if (this.f31401i0.booleanValue()) {
            this.f31397e0 = mo39100D().getOrderCount();
            this.f31392a0.setText(String.valueOf(this.f31397e0));
        }
    }

    /* renamed from: S */
    private void m50929S() {
        this.f31381Q = new WrapContentLinearLayoutManager(this);
        this.f31380P.mo7000l(1);
        this.f31379O.setLayoutManager(this.f31381Q);
        this.f31379O.setItemAnimator(this.f31391a.mo23672x());
        this.f31379O.setNestedScrollingEnabled(false);
        this.f31383S = new C11378n(this.f31399g0, this, mo39100D().getCurrency());
        this.f31379O.setAdapter(this.f31383S);
    }

    /* renamed from: T */
    private void m50930T() {
        this.f31393b = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f31393b.setOnClickListener(this);
        if (this.f31391a.mo23496R()) {
            this.f31393b.setScaleX(-1.0f);
        }
    }

    /* renamed from: U */
    private void m50931U() {
        this.f31380P = new WrapContentLinearLayoutManager(this);
        this.f31380P.mo7000l(1);
        this.f31378N.setLayoutManager(this.f31380P);
        this.f31378N.setItemAnimator(this.f31391a.mo23672x());
        this.f31378N.setNestedScrollingEnabled(false);
        this.f31382R = new C11454x(this.f31398f0, this, mo39100D().getCurrency());
        this.f31378N.setAdapter(this.f31382R);
        this.f31382R.mo39525a((C11457c) new C11264a());
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void m50932V() {
        this.f31411s0.animate().alpha(1.0f).setDuration(400);
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m50933W() {
        Iterator it = this.f31410r0.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            MenuAddonsBean menuAddonsBean = (MenuAddonsBean) it.next();
            if (menuAddonsBean.getType() == 0) {
                Iterator it2 = menuAddonsBean.getmVarietiesArray().iterator();
                while (it2.hasNext()) {
                    MenuVarietyBean menuVarietyBean = (MenuVarietyBean) it2.next();
                    if (menuVarietyBean.isSelected()) {
                        d += menuVarietyBean.getPrice();
                    }
                }
            } else if (menuAddonsBean.getMenuAddonOptions().size() != 0) {
                Iterator it3 = menuAddonsBean.getMenuAddonOptions().iterator();
                while (it3.hasNext()) {
                    MenuAddonsOptionsBean menuAddonsOptionsBean = (MenuAddonsOptionsBean) it3.next();
                    if (menuAddonsOptionsBean.isSelected()) {
                        d += menuAddonsOptionsBean.getPrice().doubleValue();
                    }
                }
            } else if (menuAddonsBean.isSelected()) {
                d += menuAddonsBean.getPrice().doubleValue();
            }
        }
        TextView textView = this.f31395c0;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        double parseInt = (double) Integer.parseInt(this.f31392a0.getText().toString().trim());
        Double.isNaN(parseInt);
        sb.append(d * parseInt);
        textView.setText(sb.toString());
    }

    /* renamed from: X */
    private void m50934X() {
        int i = this.f31397e0;
        if (i == 1) {
            this.f31385U.setEnabled(false);
            this.f31385U.setAlpha(0.5f);
            this.f31386V.setAlpha(1.0f);
        } else if (i >= 1 && ((float) i) < C11644i.f33257a7) {
            this.f31385U.setEnabled(true);
            this.f31385U.setAlpha(1.0f);
            this.f31386V.setAlpha(1.0f);
            this.f31386V.setEnabled(true);
        } else if (((float) this.f31397e0) == C11644i.f33257a7) {
            this.f31385U.setEnabled(true);
            this.f31385U.setAlpha(1.0f);
            this.f31386V.setEnabled(false);
            this.f31386V.setAlpha(0.5f);
        }
    }

    private void initViews() {
        this.f31391a = new C5887x(this);
        m50930T();
        this.f31410r0 = new ArrayList<>();
        this.f31407o0 = (NestedScrollView) findViewById(C10232R.C10236id.svMain);
        this.f31411s0 = (TabLayout) findViewById(C10232R.C10236id.tabLayoutMenu);
        this.f31408p0 = (ExpandableListView) findViewById(C10232R.C10236id.expandableListView);
        this.f31395c0 = (TextView) findViewById(C10232R.C10236id.tvTotalAmount);
        this.f31396d0 = (TextView) findViewById(C10232R.C10236id.tvDescription);
        this.f31378N = (RecyclerView) findViewById(C10232R.C10236id.rvVarient);
        this.f31379O = (RecyclerView) findViewById(C10232R.C10236id.rvAddOns);
        this.f31385U = (ImageView) findViewById(C10232R.C10236id.ivMinus);
        this.f31385U.setOnClickListener(this);
        this.f31386V = (ImageView) findViewById(C10232R.C10236id.ivPlus);
        this.f31386V.setOnClickListener(this);
        this.f31392a0 = (TextView) findViewById(C10232R.C10236id.tvQty);
        this.f31394b0 = (TextView) findViewById(C10232R.C10236id.btnDone);
        this.f31394b0.setOnClickListener(this);
        this.f31406n0 = (LinearLayout) findViewById(C10232R.C10236id.llCounterView);
        this.f31384T = (ImageView) findViewById(C10232R.C10236id.ivItemPic);
        this.f31384T.setOnClickListener(this);
        this.f31387W = (TextView) findViewById(C10232R.C10236id.tvItemName);
        this.f31388X = (TextView) findViewById(C10232R.C10236id.tvVariety);
        this.f31389Y = (TextView) findViewById(C10232R.C10236id.tvVarietyError);
        this.f31412t0 = (TextView) findViewById(C10232R.C10236id.tvCurrency);
        m50924N();
        m50928R();
        this.f31400h0 = (LinearLayout) findViewById(C10232R.C10236id.llVarietyContainer);
        m50917G();
        this.f31399g0 = m50916E();
        m50931U();
        m50929S();
        m50934X();
        m50926P();
        m50927Q();
        m50925O();
        this.f31412t0.setText(mo39100D().getCurrency());
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public int m50960j(int i) {
        Iterator it = ((MenuAddonsBean) this.f31410r0.get(i)).getMenuAddonOptions().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((MenuAddonsOptionsBean) it.next()).isSelected()) {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m50961k(int i) {
        if (this.f31413u0) {
            this.f31413u0 = false;
            return;
        }
        if (!this.f31408p0.isGroupExpanded(i)) {
            this.f31408p0.expandGroup(i);
            mo39101a(this.f31408p0);
        }
        this.f31407o0.postDelayed(new C11265b(i), 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m50962l(int i) {
        Iterator it = ((MenuAddonsBean) this.f31410r0.get(i)).getmVarietiesArray().iterator();
        while (it.hasNext()) {
            ((MenuVarietyBean) it.next()).setSelected(false);
        }
    }

    /* renamed from: C */
    public List<MenuVarietyBean> mo39099C() {
        return mo39100D().getArrayListVariety();
    }

    /* renamed from: D */
    public MenuItemBean mo39100D() {
        if (!this.f31401i0.booleanValue()) {
            return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListMenuItems().get(ShopDetailPackageActivity.f31153q0);
        }
        return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f31402j0);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                if (!m50923M().booleanValue() || !m50922L().booleanValue()) {
                    this.f31409q0.notifyDataSetChanged();
                    this.f31383S.mo7341e();
                    return;
                }
                if (!this.f31401i0.booleanValue()) {
                    MenuItemBean menuItemBean = new MenuItemBean();
                    menuItemBean.setId(mo39100D().getId());
                    menuItemBean.setBusinessAccountId(mo39100D().getBusinessAccountId());
                    menuItemBean.setName(mo39100D().getName());
                    menuItemBean.setPrice(mo39100D().getPrice());
                    if (mo39100D().shouldHidePriceZero()) {
                        menuItemBean.setShouldHidePriceZero();
                    }
                    menuItemBean.setShortDesc(mo39100D().getShortDesc());
                    menuItemBean.setLongDesc(mo39100D().getLongDesc());
                    menuItemBean.setActive(mo39100D().isActive());
                    menuItemBean.setPhotoUrl(mo39100D().getPhotoUrl());
                    menuItemBean.setCurrency(mo39100D().getCurrency());
                    menuItemBean.setDefaultVarietyId(mo39100D().getDefaultVarietyId());
                    menuItemBean.setArrayListVariety(this.f31398f0);
                    menuItemBean.setArrayListAddons((ArrayList) this.f31399g0);
                    menuItemBean.setOrderCount(this.f31397e0);
                    menuItemBean.setChildPosition(ShopDetailPackageActivity.f31153q0);
                    menuItemBean.setParentPosition(ShopDetailPackageActivity.f31152p0);
                    int a = m50936a(menuItemBean);
                    if (a == -1) {
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().add(menuItemBean);
                    } else {
                        ((MenuItemBean) m50920J().getArrayListUsersMenuItems().get(a)).setOrderCount(((MenuItemBean) m50920J().getArrayListUsersMenuItems().get(a)).getOrderCount() + this.f31397e0);
                    }
                    m50948b(menuItemBean);
                } else {
                    mo39100D().setOrderCount(this.f31397e0);
                    mo39100D().setArrayListVariety(this.f31398f0);
                    mo39100D().setArrayListAddons((ArrayList) this.f31399g0);
                    int a2 = m50936a(mo39100D());
                    String str = "";
                    if (a2 == -1) {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f31402j0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f31402j0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f31402j0, mo39100D());
                    } else if (a2 != this.f31402j0) {
                        ((MenuItemBean) m50920J().getArrayListUsersMenuItems().get(a2)).setOrderCount(((MenuItemBean) m50920J().getArrayListUsersMenuItems().get(a2)).getOrderCount() + this.f31397e0);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().remove(this.f31402j0);
                    } else {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f31402j0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f31402j0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f31402j0, mo39100D());
                    }
                }
                setResult(-1);
                onBackPressed();
                return;
            case C10232R.C10236id.imgClose /*2131362467*/:
                onBackPressed();
                return;
            case C10232R.C10236id.ivItemPic /*2131362793*/:
                try {
                    if (!TextUtils.isEmpty(mo39100D().getPhotoUrl())) {
                        Intent intent = new Intent(this, ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, mo39100D().getPhotoUrl());
                        startActivity(intent);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case C10232R.C10236id.ivMinus /*2131362815*/:
                m50942a(Boolean.valueOf(false));
                return;
            case C10232R.C10236id.ivPlus /*2131362839*/:
                m50942a(Boolean.valueOf(true));
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.white));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_add_service_menu);
        initViews();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m50952d(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i2 = 0;
        for (int i3 = 0; i3 < expandableListAdapter.getGroupCount(); i3++) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            i2 += groupView.getMeasuredHeight();
            if ((expandableListView.isGroupExpanded(i3) && i3 != i) || (!expandableListView.isGroupExpanded(i3) && i3 == i)) {
                int i4 = i2;
                for (int i5 = 0; i5 < expandableListAdapter.getChildrenCount(i3); i5++) {
                    View childView = expandableListAdapter.getChildView(i3, i5, false, null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i4 += childView.getMeasuredHeight();
                }
                i2 = i4;
            }
        }
        LayoutParams layoutParams = expandableListView.getLayoutParams();
        int dividerHeight = i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
        if (dividerHeight < 10) {
            dividerHeight = 200;
        }
        layoutParams.height = dividerHeight;
        expandableListView.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
    }

    /* renamed from: i */
    private ArrayList<MenuAddonsOptionsBean> m50958i(int i) {
        ArrayList<MenuAddonsOptionsBean> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().size(); i2++) {
            MenuAddonsOptionsBean menuAddonsOptionsBean = new MenuAddonsOptionsBean();
            menuAddonsOptionsBean.setDescription(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getDescription());
            menuAddonsOptionsBean.setName(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getName());
            menuAddonsOptionsBean.setId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getId());
            menuAddonsOptionsBean.setMenuAddonOptionId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getMenuAddonOptionId());
            menuAddonsOptionsBean.setPrice(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getPrice());
            menuAddonsOptionsBean.setSelected(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).isSelected());
            menuAddonsOptionsBean.setErrorMessage(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getErrorMessage());
            menuAddonsOptionsBean.setStatus(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39100D().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getStatus());
            arrayList.add(menuAddonsOptionsBean);
        }
        return arrayList;
    }

    /* renamed from: h */
    public MenuItemBean mo39103h(int i) {
        if (!this.f31401i0.booleanValue()) {
            return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListMenuItems().get(ShopDetailPackageActivity.f31153q0);
        }
        return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m50949c(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View groupView = expandableListAdapter.getGroupView(i3, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            i2 += groupView.getMeasuredHeight();
            if ((expandableListView.isGroupExpanded(i3) && i3 != i) || (!expandableListView.isGroupExpanded(i3) && i3 == i)) {
                int i4 = i2;
                for (int i5 = 0; i5 < expandableListAdapter.getChildrenCount(i3); i5++) {
                    View childView = expandableListAdapter.getChildView(i3, i5, false, null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i4 += childView.getMeasuredHeight();
                }
                i2 = i4;
            }
        }
        return i2 + (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1));
    }

    /* renamed from: a */
    private ArrayList<MenuAddonsOptionsBean> m50938a(MenuAddonsBean menuAddonsBean) {
        ArrayList<MenuAddonsOptionsBean> arrayList = new ArrayList<>();
        for (int i = 0; i < menuAddonsBean.getMenuAddonOptions().size(); i++) {
            MenuAddonsOptionsBean menuAddonsOptionsBean = new MenuAddonsOptionsBean();
            menuAddonsOptionsBean.setDescription(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getDescription());
            menuAddonsOptionsBean.setName(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getName());
            menuAddonsOptionsBean.setId(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getId());
            menuAddonsOptionsBean.setMenuAddonOptionId(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getMenuAddonOptionId());
            menuAddonsOptionsBean.setPrice(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getPrice());
            menuAddonsOptionsBean.setSelected(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).isSelected());
            menuAddonsOptionsBean.setErrorMessage(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getErrorMessage());
            menuAddonsOptionsBean.setStatus(((MenuAddonsOptionsBean) menuAddonsBean.getMenuAddonOptions().get(i)).getStatus());
            arrayList.add(menuAddonsOptionsBean);
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<MenuAddonsBean> m50946b(ArrayList<MenuAddonsBean> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setDescription(((MenuAddonsBean) arrayList.get(i)).getDescription());
            menuAddonsBean.setTitle(((MenuAddonsBean) arrayList.get(i)).getTitle());
            menuAddonsBean.setType(((MenuAddonsBean) arrayList.get(i)).getType());
            menuAddonsBean.setId(((MenuAddonsBean) arrayList.get(i)).getId());
            menuAddonsBean.setName(((MenuAddonsBean) arrayList.get(i)).getName());
            menuAddonsBean.setMaxAllowedOption(((MenuAddonsBean) arrayList.get(i)).getMaxAllowedOption());
            menuAddonsBean.setMinAllowedOption(((MenuAddonsBean) arrayList.get(i)).getMinAllowedOption());
            menuAddonsBean.setMenuAddonId(((MenuAddonsBean) arrayList.get(i)).getMenuAddonId());
            menuAddonsBean.setPrice(((MenuAddonsBean) arrayList.get(i)).getPrice());
            menuAddonsBean.setErrorMessage(((MenuAddonsBean) arrayList.get(i)).getErrorMessage());
            menuAddonsBean.setStatus(((MenuAddonsBean) arrayList.get(i)).getStatus());
            menuAddonsBean.setSelected(((MenuAddonsBean) arrayList.get(i)).isSelected());
            menuAddonsBean.setMenuAddonOptions(m50938a((MenuAddonsBean) arrayList.get(i)));
            arrayList2.add(menuAddonsBean);
        }
        return arrayList2;
    }

    /* renamed from: a */
    private int m50936a(MenuItemBean menuItemBean) {
        C8775f fVar = new C8775f();
        MenuCategoryBean J = m50920J();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < J.getArrayListUsersMenuItems().size()) {
            boolean z3 = !this.f31401i0.booleanValue() ? ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId()) : this.f31402j0 != i && ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId());
            if (z3) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).getArrayListVariety().iterator();
                while (it.hasNext()) {
                    MenuVarietyBean menuVarietyBean = (MenuVarietyBean) it.next();
                    try {
                        menuVarietyBean.setErrorMessage(null);
                        arrayList.add((MenuVarietyBean) menuVarietyBean.clone());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
                if (fVar.mo32317a((Object) arrayList).equalsIgnoreCase(fVar.mo32317a((Object) menuItemBean.getArrayListVariety()))) {
                    z = true;
                }
                List<MenuAddonsBean> b = m50946b(((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).getArrayListAddons());
                String errorMessage = ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).getErrorMessage();
                for (MenuAddonsBean menuAddonsBean : b) {
                    menuAddonsBean.setErrorMessage(null);
                    Iterator it2 = menuAddonsBean.getMenuAddonOptions().iterator();
                    while (it2.hasNext()) {
                        ((MenuAddonsOptionsBean) it2.next()).setErrorMessage(null);
                    }
                }
                ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).setErrorMessage(null);
                Iterator it3 = menuItemBean.getArrayListAddons().iterator();
                while (it3.hasNext()) {
                    ((MenuAddonsBean) it3.next()).setErrorMessage(null);
                }
                String a = fVar.mo32317a((Object) b);
                StringBuilder sb = new StringBuilder();
                sb.append("COMPLARE : fromSelectedAddOns > ");
                sb.append(a);
                C5880q.m25751b(sb.toString());
                String a2 = fVar.mo32317a((Object) menuItemBean.getArrayListAddons());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("COMPLARE : fromCurrentAddOns > ");
                sb2.append(a2);
                C5880q.m25751b(sb2.toString());
                ((MenuItemBean) J.getArrayListUsersMenuItems().get(i)).setErrorMessage(errorMessage);
                if (a.equalsIgnoreCase(a2)) {
                    z2 = true;
                }
                if (z && z2) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    private int m50943b(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        View groupView = expandableListAdapter.getGroupView(i, false, null, expandableListView);
        groupView.measure(makeMeasureSpec, 0);
        return groupView.getMeasuredHeight() * ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().size();
    }

    /* renamed from: b */
    private void m50948b(MenuItemBean menuItemBean) {
        boolean z;
        boolean z2;
        try {
            Iterator it = this.f31399g0.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MenuAddonsBean) it.next()).isSelected()) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            Iterator it2 = this.f31398f0.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((MenuVarietyBean) it2.next()).isSelected()) {
                        z2 = true;
                        break;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            C11598a.m52263f().mo39817a(menuItemBean.getName(), ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getCategoryName(), ShopDetailPackageActivity.f31153q0 + 1, ShopDetailPackageActivity.f31152p0 + 1, this.f31397e0, Double.parseDouble(menuItemBean.getPrice()), z, z2, C11644i.f33218W0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m50940a(NestedScrollView nestedScrollView, View view) {
        Point point = new Point();
        m50939a(nestedScrollView, view.getParent(), view, point);
        nestedScrollView.mo5276a(0, point.y);
    }

    /* renamed from: a */
    private void m50942a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f31397e0++;
        } else {
            this.f31397e0--;
        }
        this.f31392a0.setText(String.valueOf(this.f31397e0));
        m50934X();
        m50933W();
    }

    /* renamed from: a */
    public void mo39101a(ExpandableListView expandableListView) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        int i = 0;
        for (int i2 = 0; i2 < expandableListAdapter.getGroupCount(); i2++) {
            View groupView = expandableListAdapter.getGroupView(i2, false, null, expandableListView);
            groupView.measure(makeMeasureSpec, 0);
            i += groupView.getMeasuredHeight();
            if (expandableListView.isGroupExpanded(i2)) {
                int i3 = i;
                for (int i4 = 0; i4 < expandableListAdapter.getChildrenCount(i2); i4++) {
                    View childView = expandableListAdapter.getChildView(i2, i4, false, null, expandableListView);
                    childView.measure(makeMeasureSpec, 0);
                    i3 += childView.getMeasuredHeight();
                }
                i = i3;
            }
        }
        LayoutParams layoutParams = expandableListView.getLayoutParams();
        int dividerHeight = (expandableListView.getDividerHeight() * (expandableListAdapter.getGroupCount() - 1)) + i;
        if (dividerHeight < 10) {
            dividerHeight = 200;
        }
        layoutParams.height = dividerHeight;
        expandableListView.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
        StringBuilder sb = new StringBuilder();
        sb.append("setListViewHeightForGroups : totalHeight = ");
        sb.append(i);
        sb.toString();
    }

    /* renamed from: a */
    private void m50939a(ViewGroup viewGroup, ViewParent viewParent, View view, Point point) {
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        point.x += view.getLeft();
        point.y += view.getTop();
        if (!viewGroup2.equals(viewGroup)) {
            m50939a(viewGroup, viewGroup2.getParent(), viewGroup2, point);
        }
    }

    /* renamed from: a */
    public void mo39102a(ExpandableListView expandableListView, int i) {
        ListAdapter adapter = expandableListView.getAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            View view = adapter.getView(i3, null, expandableListView);
            view.measure(makeMeasureSpec, makeMeasureSpec);
            i2 += view.getMeasuredHeight();
        }
        LayoutParams layoutParams = expandableListView.getLayoutParams();
        layoutParams.height = i2;
        expandableListView.setLayoutParams(layoutParams);
        expandableListView.requestLayout();
    }
}
