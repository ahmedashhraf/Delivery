package com.mrsool.shopmenu;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.google.gson.C8775f;
import com.mrsool.C10232R;
import com.mrsool.chat.ViewPhotoFullActivity;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.shopmenu.p */
/* compiled from: AddServiceMenuClassOld */
public class C11398p implements OnClickListener, Cloneable {

    /* renamed from: N */
    private RecyclerView f32032N;

    /* renamed from: O */
    private WrapContentLinearLayoutManager f32033O;

    /* renamed from: P */
    private WrapContentLinearLayoutManager f32034P;

    /* renamed from: Q */
    private C11454x f32035Q;

    /* renamed from: R */
    private C11378n f32036R;

    /* renamed from: S */
    private ImageView f32037S;

    /* renamed from: T */
    private ImageView f32038T;

    /* renamed from: U */
    private TextView f32039U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f32040V;

    /* renamed from: W */
    private TextView f32041W;

    /* renamed from: X */
    private TextView f32042X;

    /* renamed from: Y */
    private TextView f32043Y;

    /* renamed from: Z */
    private TextView f32044Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f32045a;

    /* renamed from: a0 */
    private TextView f32046a0;

    /* renamed from: b */
    private RecyclerView f32047b;

    /* renamed from: b0 */
    private int f32048b0 = 1;

    /* renamed from: c0 */
    private ArrayList<MenuVarietyBean> f32049c0 = new ArrayList<>();

    /* renamed from: d0 */
    private List<MenuAddonsBean> f32050d0;

    /* renamed from: e0 */
    private LinearLayout f32051e0;

    /* renamed from: f0 */
    private LinearLayout f32052f0;

    /* renamed from: g0 */
    private LinearLayout f32053g0;

    /* renamed from: h0 */
    private Boolean f32054h0 = Boolean.valueOf(false);

    /* renamed from: i0 */
    private int f32055i0 = -1;

    /* renamed from: j0 */
    private int f32056j0 = -1;

    /* renamed from: k0 */
    private int f32057k0 = -1;

    /* renamed from: l0 */
    private Bundle f32058l0;

    /* renamed from: m0 */
    private LinearLayout f32059m0;

    /* renamed from: n0 */
    private Context f32060n0;

    /* renamed from: o0 */
    private C5665a f32061o0;

    /* renamed from: p0 */
    private C11402c f32062p0;

    /* renamed from: q0 */
    private Activity f32063q0;

    /* renamed from: com.mrsool.shopmenu.p$a */
    /* compiled from: AddServiceMenuClassOld */
    class C11399a implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ View f32064a;

        /* renamed from: com.mrsool.shopmenu.p$a$a */
        /* compiled from: AddServiceMenuClassOld */
        class C11400a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DialogInterface f32066a;

            C11400a(DialogInterface dialogInterface) {
                this.f32066a = dialogInterface;
            }

            public void run() {
                int d = C11644i.f33105I - C11398p.this.f32045a.mo23601d(100);
                int height = C11399a.this.f32064a.getHeight();
                BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) this.f32066a).findViewById(C10232R.C10236id.design_bottom_sheet));
                if (d < C11399a.this.f32064a.getHeight()) {
                    LayoutParams layoutParams = C11399a.this.f32064a.getLayoutParams();
                    layoutParams.height = d;
                    C11399a.this.f32064a.setLayoutParams(layoutParams);
                    c.mo22467c(d);
                } else {
                    c.mo22467c(height);
                }
                c.mo22474e(3);
            }
        }

        C11399a(View view) {
            this.f32064a = view;
        }

        public void onShow(DialogInterface dialogInterface) {
            new Handler().postDelayed(new C11400a(dialogInterface), 0);
        }
    }

    /* renamed from: com.mrsool.shopmenu.p$b */
    /* compiled from: AddServiceMenuClassOld */
    class C11401b implements C11457c {
        C11401b() {
        }

        /* renamed from: a */
        public void mo39105a(int i) {
            if (Integer.parseInt(C11398p.this.f32040V.getTag().toString()) == 1) {
                C11398p.this.m51557m();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.p$c */
    /* compiled from: AddServiceMenuClassOld */
    public interface C11402c {
        /* renamed from: a */
        void mo39464a();
    }

    public C11398p(Context context, Bundle bundle) {
        this.f32060n0 = context;
        this.f32058l0 = bundle;
        m51555k();
    }

    /* renamed from: g */
    private List<MenuAddonsBean> m51551g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo39457c().getArrayListAddons().size(); i++) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setId(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getId());
            menuAddonsBean.setName(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getName());
            menuAddonsBean.setMaxAllowedOption(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMaxAllowedOption());
            menuAddonsBean.setMinAllowedOption(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMinAllowedOption());
            menuAddonsBean.setMenuAddonId(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonId());
            menuAddonsBean.setPrice(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getPrice());
            menuAddonsBean.setErrorMessage(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getErrorMessage());
            menuAddonsBean.setStatus(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getStatus());
            if (((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMinAllowedOption() == 1 && ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMaxAllowedOption() <= 1) {
                ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).setSelected(true);
            }
            menuAddonsBean.setSelected(((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).isSelected());
            menuAddonsBean.setMenuAddonOptions(m51549b(i));
            arrayList.add(menuAddonsBean);
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m51552h() {
        for (MenuVarietyBean menuVarietyBean : mo39456b()) {
            if (!this.f32054h0.booleanValue() && menuVarietyBean.getId().equalsIgnoreCase(mo39457c().getDefaultVarietyId())) {
                menuVarietyBean.setSelected(true);
            }
            try {
                this.f32049c0.add((MenuVarietyBean) menuVarietyBean.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        this.f32051e0.setVisibility(this.f32049c0.size() > 0 ? 0 : 8);
    }

    /* renamed from: i */
    private Activity m51553i() {
        Context context = this.f32060n0;
        if (context instanceof ShopDetailPackageActivity) {
            return (ShopDetailPackageActivity) context;
        }
        if (context instanceof MenuOrderActivityStep1) {
            return (MenuOrderActivityStep1) context;
        }
        return (C0295d) context;
    }

    /* renamed from: j */
    private MenuCategoryBean m51554j() {
        return (MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0);
    }

    /* renamed from: k */
    private void m51555k() {
        this.f32045a = new C5887x(this.f32060n0);
        View inflate = m51553i().getLayoutInflater().inflate(C10232R.layout.bottom_sheet_add_menu, null);
        this.f32061o0 = new C5665a(this.f32060n0, C10232R.style.DialogStyle);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMain);
        this.f32047b = (RecyclerView) inflate.findViewById(C10232R.C10236id.rvVarient);
        this.f32032N = (RecyclerView) inflate.findViewById(C10232R.C10236id.rvAddOns);
        this.f32043Y = (TextView) inflate.findViewById(C10232R.C10236id.tvQty);
        this.f32044Z = (TextView) inflate.findViewById(C10232R.C10236id.btnDone);
        this.f32044Z.setOnClickListener(this);
        this.f32059m0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llCounterView);
        this.f32037S = (ImageView) inflate.findViewById(C10232R.C10236id.ivItemPic);
        this.f32037S.setOnClickListener(this);
        this.f32038T = (ImageView) inflate.findViewById(C10232R.C10236id.ivClose);
        this.f32038T.setOnClickListener(this);
        this.f32039U = (TextView) inflate.findViewById(C10232R.C10236id.tvItemName);
        this.f32040V = (TextView) inflate.findViewById(C10232R.C10236id.tvVariety);
        this.f32041W = (TextView) inflate.findViewById(C10232R.C10236id.tvVarietyError);
        this.f32046a0 = (TextView) inflate.findViewById(C10232R.C10236id.tvItemDesc);
        this.f32052f0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llMinus);
        this.f32053g0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llPlus);
        this.f32052f0.setOnClickListener(this);
        this.f32053g0.setOnClickListener(this);
        m51558n();
        m51560p();
        this.f32051e0 = (LinearLayout) inflate.findViewById(C10232R.C10236id.llVarietyContainer);
        m51552h();
        this.f32050d0 = m51551g();
        m51562r();
        m51561q();
        m51563s();
        m51559o();
        TextView textView = this.f32046a0;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(mo39457c().getLongDesc());
        textView.setText(sb.toString());
        this.f32061o0.setOnShowListener(new C11399a(inflate));
        this.f32061o0.setCancelable(true);
        this.f32061o0.setContentView(inflate);
        this.f32061o0.getWindow().setSoftInputMode(19);
    }

    /* renamed from: l */
    private Boolean m51556l() {
        boolean z = true;
        for (int i = 0; i < this.f32050d0.size(); i++) {
            if (((MenuAddonsBean) this.f32050d0.get(i)).getMaxAllowedOption() > 0 && ((MenuAddonsBean) this.f32050d0.get(i)).getMinAllowedOption() > 0) {
                int i2 = 0;
                for (int i3 = 0; i3 < ((MenuAddonsBean) this.f32050d0.get(i)).getMenuAddonOptions().size(); i3++) {
                    if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f32050d0.get(i)).getMenuAddonOptions().get(i3)).isSelected()) {
                        i2++;
                    }
                }
                if ((!((MenuAddonsBean) this.f32050d0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33266b7) || i2 >= ((MenuAddonsBean) this.f32050d0.get(i)).getMinAllowedOption()) && i2 <= ((MenuAddonsBean) this.f32050d0.get(i)).getMaxAllowedOption()) {
                    ((MenuAddonsBean) this.f32050d0.get(i)).setValidationError(false);
                } else {
                    ((MenuAddonsBean) this.f32050d0.get(i)).setValidationError(true);
                    z = false;
                }
            }
            if (z && ((MenuAddonsBean) this.f32050d0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                ((MenuAddonsBean) this.f32050d0.get(i)).setSelected(false);
            }
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public Boolean m51557m() {
        int size = this.f32049c0.size();
        Boolean valueOf = Boolean.valueOf(true);
        if (size == 0) {
            return valueOf;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < this.f32049c0.size(); i++) {
            if (((MenuVarietyBean) this.f32049c0.get(i)).getStatus().equals(C11644i.f33266b7)) {
                z = true;
            }
            if (((MenuVarietyBean) this.f32049c0.get(i)).getSelected()) {
                z2 = true;
            }
        }
        if (!z) {
            return valueOf;
        }
        if (!z2) {
            this.f32040V.setTag(Integer.valueOf(1));
            this.f32040V.setTextColor(C0841b.m4915a(this.f32060n0, (int) C10232R.C10234color.red_lite_2));
            this.f32041W.setVisibility(0);
        } else {
            this.f32040V.setTag(Integer.valueOf(0));
            this.f32040V.setTextColor(C0841b.m4915a(this.f32060n0, (int) C10232R.C10234color.Black));
            this.f32041W.setVisibility(8);
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: n */
    private void m51558n() {
        Bundle bundle = this.f32058l0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33332j1)) {
                this.f32055i0 = this.f32058l0.getInt(C11644i.f33332j1);
            }
            if (this.f32058l0.containsKey(C11644i.f33043A1)) {
                this.f32054h0 = Boolean.valueOf(this.f32058l0.getBoolean(C11644i.f33043A1));
            }
        }
    }

    /* renamed from: o */
    private void m51559o() {
        try {
            C2232l.m11649c(this.f32060n0).mo9515a(mo39457c().getPhotoUrl()).m11500e((int) C10232R.C10235drawable.bg_menu_item).m11496d().mo9424a(this.f32037S);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f32039U.setText(mo39457c().getName());
    }

    /* renamed from: p */
    private void m51560p() {
        if (this.f32054h0.booleanValue()) {
            this.f32048b0 = mo39457c().getOrderCount();
            this.f32043Y.setText(String.valueOf(this.f32048b0));
            this.f32059m0.setVisibility(8);
        }
    }

    /* renamed from: q */
    private void m51561q() {
        this.f32034P = new WrapContentLinearLayoutManager(this.f32060n0);
        this.f32033O.mo7000l(1);
        this.f32032N.setLayoutManager(this.f32034P);
        this.f32032N.setItemAnimator(this.f32045a.mo23672x());
        this.f32032N.setNestedScrollingEnabled(false);
        this.f32036R = new C11378n(this.f32050d0, this.f32060n0, mo39457c().getCurrency());
        this.f32032N.setAdapter(this.f32036R);
    }

    /* renamed from: r */
    private void m51562r() {
        this.f32033O = new WrapContentLinearLayoutManager(this.f32060n0);
        this.f32033O.mo7000l(1);
        this.f32047b.setLayoutManager(this.f32033O);
        this.f32047b.setItemAnimator(this.f32045a.mo23672x());
        this.f32047b.setNestedScrollingEnabled(false);
        this.f32035Q = new C11454x(this.f32049c0, this.f32060n0, mo39457c().getCurrency());
        this.f32047b.setAdapter(this.f32035Q);
        this.f32035Q.mo39525a((C11457c) new C11401b());
    }

    /* renamed from: s */
    private void m51563s() {
        int i = this.f32048b0;
        if (i == 1) {
            this.f32045a.mo23557a(false, (View) this.f32052f0, true);
        } else if (i >= 1 && ((float) i) < C11644i.f33257a7) {
            this.f32045a.mo23557a(true, (View) this.f32052f0, false);
            this.f32045a.mo23557a(true, (View) this.f32053g0, false);
        } else if (((float) this.f32048b0) == C11644i.f33257a7) {
            this.f32045a.mo23557a(true, (View) this.f32052f0, false);
            this.f32045a.mo23557a(false, (View) this.f32053g0, true);
        }
    }

    /* renamed from: d */
    public C11402c mo39458d() {
        return this.f32062p0;
    }

    /* renamed from: e */
    public void mo39459e() {
        C5665a aVar = this.f32061o0;
        if (aVar != null && aVar.isShowing()) {
            this.f32061o0.dismiss();
        }
    }

    /* renamed from: f */
    public void mo39460f() {
        C5665a aVar = this.f32061o0;
        if (aVar != null && !aVar.isShowing()) {
            this.f32061o0.show();
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                if (!m51557m().booleanValue() || !m51556l().booleanValue()) {
                    this.f32036R.mo7341e();
                    return;
                }
                if (!this.f32054h0.booleanValue()) {
                    MenuItemBean menuItemBean = new MenuItemBean();
                    menuItemBean.setId(mo39457c().getId());
                    menuItemBean.setBusinessAccountId(mo39457c().getBusinessAccountId());
                    menuItemBean.setName(mo39457c().getName());
                    menuItemBean.setPrice(mo39457c().getPrice());
                    menuItemBean.setShortDesc(mo39457c().getShortDesc());
                    menuItemBean.setLongDesc(mo39457c().getLongDesc());
                    menuItemBean.setActive(mo39457c().isActive());
                    menuItemBean.setPhotoUrl(mo39457c().getPhotoUrl());
                    menuItemBean.setCurrency(mo39457c().getCurrency());
                    menuItemBean.setDefaultVarietyId(mo39457c().getDefaultVarietyId());
                    menuItemBean.setArrayListVariety(this.f32049c0);
                    menuItemBean.setArrayListAddons((ArrayList) this.f32050d0);
                    menuItemBean.setOrderCount(this.f32048b0);
                    menuItemBean.setChildPosition(ShopDetailPackageActivity.f31153q0);
                    menuItemBean.setParentPosition(ShopDetailPackageActivity.f31152p0);
                    int a = m51543a(menuItemBean);
                    if (a == -1) {
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().add(menuItemBean);
                    } else {
                        ((MenuItemBean) m51554j().getArrayListUsersMenuItems().get(a)).setOrderCount(((MenuItemBean) m51554j().getArrayListUsersMenuItems().get(a)).getOrderCount() + this.f32048b0);
                    }
                } else {
                    mo39457c().setOrderCount(this.f32048b0);
                    mo39457c().setArrayListVariety(this.f32049c0);
                    mo39457c().setArrayListAddons((ArrayList) this.f32050d0);
                    int a2 = m51543a(mo39457c());
                    String str = "";
                    if (a2 == -1) {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32055i0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32055i0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f32055i0, mo39457c());
                    } else if (a2 != this.f32055i0) {
                        ((MenuItemBean) m51554j().getArrayListUsersMenuItems().get(a2)).setOrderCount(((MenuItemBean) m51554j().getArrayListUsersMenuItems().get(a2)).getOrderCount() + this.f32048b0);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().remove(this.f32055i0);
                    } else {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32055i0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32055i0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f32055i0, mo39457c());
                    }
                }
                C11402c cVar = this.f32062p0;
                if (cVar != null) {
                    cVar.mo39464a();
                }
                mo39459e();
                return;
            case C10232R.C10236id.ivClose /*2131362756*/:
                mo39459e();
                return;
            case C10232R.C10236id.ivItemPic /*2131362793*/:
                try {
                    if (!TextUtils.isEmpty(mo39457c().getPhotoUrl())) {
                        Intent intent = new Intent(this.f32060n0, ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, mo39457c().getPhotoUrl());
                        this.f32060n0.startActivity(intent);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case C10232R.C10236id.llMinus /*2131363093*/:
                m51547a(Boolean.valueOf(false));
                return;
            case C10232R.C10236id.llPlus /*2131363131*/:
                m51547a(Boolean.valueOf(true));
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private List<MenuAddonsBean> m51546a(ArrayList<MenuAddonsBean> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setId(((MenuAddonsBean) arrayList.get(i)).getId());
            menuAddonsBean.setName(((MenuAddonsBean) arrayList.get(i)).getName());
            menuAddonsBean.setMaxAllowedOption(((MenuAddonsBean) arrayList.get(i)).getMaxAllowedOption());
            menuAddonsBean.setMinAllowedOption(((MenuAddonsBean) arrayList.get(i)).getMinAllowedOption());
            menuAddonsBean.setMenuAddonId(((MenuAddonsBean) arrayList.get(i)).getMenuAddonId());
            menuAddonsBean.setPrice(((MenuAddonsBean) arrayList.get(i)).getPrice());
            menuAddonsBean.setErrorMessage(((MenuAddonsBean) arrayList.get(i)).getErrorMessage());
            menuAddonsBean.setStatus(((MenuAddonsBean) arrayList.get(i)).getStatus());
            menuAddonsBean.setSelected(((MenuAddonsBean) arrayList.get(i)).isSelected());
            menuAddonsBean.setMenuAddonOptions(m51545a((MenuAddonsBean) arrayList.get(i)));
            arrayList2.add(menuAddonsBean);
        }
        return arrayList2;
    }

    /* renamed from: b */
    private ArrayList<MenuAddonsOptionsBean> m51549b(int i) {
        ArrayList<MenuAddonsOptionsBean> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().size(); i2++) {
            MenuAddonsOptionsBean menuAddonsOptionsBean = new MenuAddonsOptionsBean();
            menuAddonsOptionsBean.setName(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getName());
            menuAddonsOptionsBean.setId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getId());
            menuAddonsOptionsBean.setMenuAddonOptionId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getMenuAddonOptionId());
            menuAddonsOptionsBean.setPrice(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getPrice());
            menuAddonsOptionsBean.setSelected(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).isSelected());
            menuAddonsOptionsBean.setErrorMessage(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getErrorMessage());
            menuAddonsOptionsBean.setStatus(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39457c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getStatus());
            arrayList.add(menuAddonsOptionsBean);
        }
        return arrayList;
    }

    /* renamed from: c */
    public MenuItemBean mo39457c() {
        if (!this.f32054h0.booleanValue()) {
            return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListMenuItems().get(ShopDetailPackageActivity.f31153q0);
        }
        return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32055i0);
    }

    /* renamed from: b */
    public List<MenuVarietyBean> mo39456b() {
        return mo39457c().getArrayListVariety();
    }

    /* renamed from: a */
    private ArrayList<MenuAddonsOptionsBean> m51545a(MenuAddonsBean menuAddonsBean) {
        ArrayList<MenuAddonsOptionsBean> arrayList = new ArrayList<>();
        for (int i = 0; i < menuAddonsBean.getMenuAddonOptions().size(); i++) {
            MenuAddonsOptionsBean menuAddonsOptionsBean = new MenuAddonsOptionsBean();
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

    /* renamed from: a */
    public MenuItemBean mo39454a(int i) {
        if (!this.f32054h0.booleanValue()) {
            return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListMenuItems().get(ShopDetailPackageActivity.f31153q0);
        }
        return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(i);
    }

    /* renamed from: a */
    private int m51543a(MenuItemBean menuItemBean) {
        C8775f fVar = new C8775f();
        MenuCategoryBean j = m51554j();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < j.getArrayListUsersMenuItems().size()) {
            boolean z3 = !this.f32054h0.booleanValue() ? ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId()) : this.f32055i0 != i && ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId());
            if (z3) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).getArrayListVariety().iterator();
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
                List<MenuAddonsBean> a = m51546a(((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).getArrayListAddons());
                String errorMessage = ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).getErrorMessage();
                for (MenuAddonsBean menuAddonsBean : a) {
                    menuAddonsBean.setErrorMessage(null);
                    Iterator it2 = menuAddonsBean.getMenuAddonOptions().iterator();
                    while (it2.hasNext()) {
                        ((MenuAddonsOptionsBean) it2.next()).setErrorMessage(null);
                    }
                }
                ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).setErrorMessage(null);
                Iterator it3 = menuItemBean.getArrayListAddons().iterator();
                while (it3.hasNext()) {
                    ((MenuAddonsBean) it3.next()).setErrorMessage(null);
                }
                String a2 = fVar.mo32317a((Object) a);
                StringBuilder sb = new StringBuilder();
                sb.append("COMPLARE : fromSelectedAddOns > ");
                sb.append(a2);
                C5880q.m25751b(sb.toString());
                String a3 = fVar.mo32317a((Object) menuItemBean.getArrayListAddons());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("COMPLARE : fromCurrentAddOns > ");
                sb2.append(a3);
                C5880q.m25751b(sb2.toString());
                ((MenuItemBean) j.getArrayListUsersMenuItems().get(i)).setErrorMessage(errorMessage);
                if (a2.equalsIgnoreCase(a3)) {
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

    /* renamed from: a */
    private void m51547a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f32048b0++;
        } else {
            this.f32048b0--;
        }
        this.f32043Y.setText(String.valueOf(this.f32048b0));
        m51563s();
    }

    /* renamed from: a */
    public void mo39455a(C11402c cVar) {
        this.f32062p0 = cVar;
    }
}
