package com.mrsool.shopmenu;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.content.Intent;
import android.graphics.Point;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.app.C0737c;
import androidx.core.content.C0841b;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.C1103b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.C1817b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.C7051h;
import com.google.android.material.tabs.TabLayout.C7056k;
import com.google.gson.C8775f;
import com.mrsool.C10232R;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.p423v.C11725f;
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
import p076c.p082c.p083a.p088u.p098k.p100g.C2449b;
import p076c.p082c.p083a.p108y.C2529f;
import p076c.p082c.p083a.p108y.p110j.C2561m;
import p076c.p112d.p148d.p150g.C6637f;

/* renamed from: com.mrsool.shopmenu.o */
/* compiled from: AddServiceMenuClass */
public class C11383o implements OnClickListener, Cloneable {

    /* renamed from: A0 */
    private C11397m f31968A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public DialogInterface f31969B0;

    /* renamed from: C0 */
    private C2529f<String, C2449b> f31970C0 = new C11389e();

    /* renamed from: D0 */
    boolean f31971D0 = false;

    /* renamed from: E0 */
    boolean f31972E0 = false;

    /* renamed from: F0 */
    int f31973F0 = 0;

    /* renamed from: G0 */
    Handler f31974G0 = new Handler();

    /* renamed from: H0 */
    Runnable f31975H0 = new C11392h();

    /* renamed from: N */
    private RecyclerView f31976N;

    /* renamed from: O */
    private RecyclerView f31977O;

    /* renamed from: P */
    private WrapContentLinearLayoutManager f31978P;

    /* renamed from: Q */
    private WrapContentLinearLayoutManager f31979Q;

    /* renamed from: R */
    private C11454x f31980R;

    /* renamed from: S */
    private C11378n f31981S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public ImageView f31982T;

    /* renamed from: U */
    private ImageView f31983U;

    /* renamed from: V */
    private ImageView f31984V;

    /* renamed from: W */
    private FrameLayout f31985W;

    /* renamed from: X */
    private FrameLayout f31986X;

    /* renamed from: Y */
    private TextView f31987Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public TextView f31988Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f31989a;

    /* renamed from: a0 */
    private TextView f31990a0;

    /* renamed from: b */
    private ImageView f31991b;

    /* renamed from: b0 */
    private TextView f31992b0;

    /* renamed from: c0 */
    private TextView f31993c0;

    /* renamed from: d0 */
    private TextView f31994d0;

    /* renamed from: e0 */
    private TextView f31995e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public TextView f31996f0;

    /* renamed from: g0 */
    private View f31997g0;

    /* renamed from: h0 */
    private int f31998h0 = 1;

    /* renamed from: i0 */
    private ArrayList<MenuVarietyBean> f31999i0 = new ArrayList<>();

    /* renamed from: j0 */
    private List<MenuAddonsBean> f32000j0;

    /* renamed from: k0 */
    private LinearLayout f32001k0;

    /* renamed from: l0 */
    private Boolean f32002l0 = Boolean.valueOf(false);

    /* renamed from: m0 */
    private int f32003m0 = -1;

    /* renamed from: n0 */
    private int f32004n0 = -1;

    /* renamed from: o0 */
    private int f32005o0 = -1;

    /* renamed from: p0 */
    private Bundle f32006p0;

    /* renamed from: q0 */
    private LinearLayout f32007q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public NestedScrollView f32008r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public ExpandableListView f32009s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public C11408r f32010t0;
    /* access modifiers changed from: private */

    /* renamed from: u0 */
    public ArrayList<MenuAddonsBean> f32011u0;

    /* renamed from: v0 */
    public TabLayout f32012v0;

    /* renamed from: w0 */
    private int f32013w0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: x0 */
    public Context f32014x0;

    /* renamed from: y0 */
    View f32015y0;

    /* renamed from: z0 */
    private C5665a f32016z0;

    /* renamed from: com.mrsool.shopmenu.o$a */
    /* compiled from: AddServiceMenuClass */
    class C11384a implements OnShowListener {

        /* renamed from: com.mrsool.shopmenu.o$a$a */
        /* compiled from: AddServiceMenuClass */
        class C11385a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ DialogInterface f32018a;

            C11385a(DialogInterface dialogInterface) {
                this.f32018a = dialogInterface;
            }

            /* renamed from: a */
            public /* synthetic */ void mo39443a(DialogInterface dialogInterface, int i) {
                View view = C11383o.this.f32015y0;
                if (view != null && dialogInterface != null) {
                    int height = view.getHeight();
                    C11383o.this.f31969B0 = dialogInterface;
                    BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet));
                    if (i < C11383o.this.f32015y0.getHeight()) {
                        LayoutParams layoutParams = C11383o.this.f32015y0.getLayoutParams();
                        layoutParams.height = i;
                        C11383o.this.f32015y0.setLayoutParams(layoutParams);
                        c.mo22467c(i);
                    } else {
                        c.mo22467c(height);
                    }
                    c.mo22465b(false);
                    c.mo22474e(3);
                }
            }

            public void run() {
                C11383o.this.f32015y0.post(new C11310a(this, this.f32018a, C11644i.f33105I - C11383o.this.f31989a.mo23601d(5)));
            }
        }

        C11384a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            new Handler().postDelayed(new C11385a(dialogInterface), 300);
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$b */
    /* compiled from: AddServiceMenuClass */
    class C11386b implements OnChildClickListener {
        C11386b() {
        }

        public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
            if (((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getType() == 0) {
                C11383o.this.m51488d(i);
                ((MenuVarietyBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getmVarietiesArray().get(i2)).setSelected(true);
                C11383o.this.f32010t0.notifyDataSetChanged();
            } else if (((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().size() == 0) {
                ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).setSelected(!((MenuAddonsBean) C11383o.this.f32011u0.get(i)).isSelected());
                C11383o.this.f32010t0.notifyDataSetChanged();
            } else if (((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMaxAllowedOption() == 0 || (((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMaxAllowedOption() == 0 && ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMinAllowedOption() == 0)) {
                ((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).setValidationError(false);
                C11383o.this.f32010t0.notifyDataSetChanged();
            } else {
                MenuAddonsOptionsBean menuAddonsOptionsBean = (MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2);
                if (TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    C11383o.this.f32010t0.notifyDataSetChanged();
                } else if (!TextUtils.isEmpty(menuAddonsOptionsBean.getErrorMessage()) && menuAddonsOptionsBean.getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    C11383o.this.f32010t0.notifyDataSetChanged();
                } else if (((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).isSelected()) {
                    ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).setValidationError(false);
                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                    C11383o.this.f32010t0.notifyDataSetChanged();
                } else if (C11383o.this.m51478b(i) < ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMaxAllowedOption()) {
                    ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).setValidationError(false);
                    ((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).setSelected(!((MenuAddonsOptionsBean) ((MenuAddonsBean) C11383o.this.f32011u0.get(i)).getMenuAddonOptions().get(i2)).isSelected());
                    C11383o.this.f32010t0.notifyDataSetChanged();
                }
            }
            C11383o.this.m51464A();
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$c */
    /* compiled from: AddServiceMenuClass */
    class C11387c implements Runnable {
        C11387c() {
        }

        public void run() {
            if (C11383o.this.f32011u0 != null) {
                C11383o oVar = C11383o.this;
                oVar.mo39433a(oVar.f32009s0);
                C11383o.this.m51465C();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$d */
    /* compiled from: AddServiceMenuClass */
    class C11388d implements Runnable {
        C11388d() {
        }

        /* renamed from: a */
        public /* synthetic */ void mo39447a(int i) {
            C11383o oVar = C11383o.this;
            if (oVar.f32015y0 != null && oVar.f31969B0 != null) {
                int height = C11383o.this.f32015y0.getHeight();
                BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) C11383o.this.f31969B0).findViewById(C10232R.C10236id.design_bottom_sheet));
                if (i < C11383o.this.f32015y0.getHeight()) {
                    LayoutParams layoutParams = C11383o.this.f32015y0.getLayoutParams();
                    layoutParams.height = i;
                    C11383o.this.f32015y0.setLayoutParams(layoutParams);
                    c.mo22467c(i);
                } else {
                    c.mo22467c(height);
                }
                c.mo22465b(false);
                c.mo22474e(3);
            }
        }

        public void run() {
            C11383o.this.f32015y0.post(new C11311b(this, C11644i.f33105I - C11383o.this.f31989a.mo23601d(5)));
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$e */
    /* compiled from: AddServiceMenuClass */
    class C11389e implements C2529f<String, C2449b> {
        C11389e() {
        }

        /* renamed from: a */
        public boolean mo10011a(C2449b bVar, String str, C2561m<C2449b> mVar, boolean z, boolean z2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo10010a(Exception exc, String str, C2561m<C2449b> mVar, boolean z) {
            C11383o.this.f31982T.setImageResource(C10232R.C10235drawable.img_place_holder_text);
            C11383o.this.f31982T.setScaleType(ScaleType.CENTER_INSIDE);
            return true;
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$f */
    /* compiled from: AddServiceMenuClass */
    class C11390f implements C11457c {
        C11390f() {
        }

        /* renamed from: a */
        public void mo39105a(int i) {
            if (Integer.parseInt(C11383o.this.f31988Z.getTag().toString()) == 1) {
                C11383o.this.m51512q();
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$g */
    /* compiled from: AddServiceMenuClass */
    class C11391g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f32025a;

        C11391g(int i) {
            this.f32025a = i;
        }

        public void run() {
            C11383o oVar = C11383o.this;
            C11383o.this.f32008r0.mo5286b(0, ((int) ((((float) oVar.m51484c(oVar.f32009s0, this.f32025a)) + C11383o.this.f32014x0.getResources().getDimension(C10232R.dimen.dp_140)) + ((float) C11383o.this.f31996f0.getMeasuredHeight()))) - C11383o.this.f32012v0.getMeasuredHeight());
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$h */
    /* compiled from: AddServiceMenuClass */
    class C11392h implements Runnable {
        C11392h() {
        }

        public void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("Runnable isUserClick =");
            sb.append(C11383o.this.f31972E0);
            sb.toString();
            C11383o oVar = C11383o.this;
            if (oVar.f31972E0) {
                oVar.f31972E0 = false;
                return;
            }
            ExpandableListAdapter expandableListAdapter = oVar.f32009s0.getExpandableListAdapter();
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(C11383o.this.f32009s0.getWidth(), C6637f.f18605b);
            int i = 0;
            int i2 = 0;
            while (i < expandableListAdapter.getGroupCount()) {
                View groupView = expandableListAdapter.getGroupView(i, false, null, C11383o.this.f32009s0);
                groupView.measure(makeMeasureSpec, 0);
                int measuredHeight = groupView.getMeasuredHeight() + i2;
                groupView.getMeasuredHeight();
                if (C11383o.this.f32009s0.isGroupExpanded(i)) {
                    int i3 = measuredHeight;
                    for (int i4 = 0; i4 < expandableListAdapter.getChildrenCount(i); i4++) {
                        View childView = expandableListAdapter.getChildView(i, i4, false, null, C11383o.this.f32009s0);
                        childView.measure(makeMeasureSpec, 0);
                        i3 += childView.getMeasuredHeight();
                        childView.getMeasuredHeight();
                    }
                    measuredHeight = i3;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scroll=");
                sb2.append(C11383o.this.f31973F0);
                sb2.append("   item=");
                sb2.append(i);
                sb2.append("   start=");
                sb2.append(i2);
                sb2.append("   end=");
                sb2.append(measuredHeight);
                sb2.toString();
                C11383o oVar2 = C11383o.this;
                int i5 = oVar2.f31973F0;
                if (i5 >= i2 && i5 <= measuredHeight && i != oVar2.f32012v0.getSelectedTabPosition()) {
                    C11383o oVar3 = C11383o.this;
                    oVar3.f31971D0 = true;
                    TabLayout tabLayout = oVar3.f32012v0;
                    tabLayout.mo28123d(tabLayout.mo28096a(i));
                }
                i++;
                i2 = measuredHeight;
            }
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$i */
    /* compiled from: AddServiceMenuClass */
    class C11393i implements C1103b {
        C11393i() {
        }

        /* renamed from: a */
        public void mo710a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            C11383o oVar = C11383o.this;
            float f = (float) i2;
            oVar.f31973F0 = (int) ((f - (oVar.f32014x0.getResources().getDimension(C10232R.dimen.dp_132) + ((float) C11383o.this.f31996f0.getMeasuredHeight()))) + ((float) C11383o.this.f32012v0.getMeasuredHeight()));
            C11383o.this.f31974G0.removeCallbacksAndMessages(null);
            if (f > (C11383o.this.f32014x0.getResources().getDimension(C10232R.dimen.dp_132) + ((float) C11383o.this.f31996f0.getMeasuredHeight())) - ((float) C11383o.this.f32012v0.getMeasuredHeight())) {
                C11383o.this.m51521z();
                C11383o oVar2 = C11383o.this;
                oVar2.f31974G0.postDelayed(oVar2.f31975H0, 80);
                return;
            }
            C11383o oVar3 = C11383o.this;
            oVar3.f31971D0 = true;
            TabLayout tabLayout = oVar3.f32012v0;
            tabLayout.mo28123d(tabLayout.mo28096a(0));
            C11383o.this.m51508n();
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$j */
    /* compiled from: AddServiceMenuClass */
    class C11394j implements C7051h {
        C11394j() {
        }

        /* renamed from: a */
        public void mo12005a(C7056k kVar) {
            C11383o oVar = C11383o.this;
            if (!oVar.f31971D0) {
                oVar.f31972E0 = true;
            }
            C11383o.this.m51486c(kVar.mo28203f());
        }

        /* renamed from: b */
        public void mo12006b(C7056k kVar) {
            C11383o oVar = C11383o.this;
            if (!oVar.f31971D0) {
                oVar.f31972E0 = true;
            }
            C11383o.this.m51486c(kVar.mo28203f());
        }

        /* renamed from: c */
        public void mo12007c(C7056k kVar) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$k */
    /* compiled from: AddServiceMenuClass */
    class C11395k extends C11725f {
        C11395k() {
        }

        /* renamed from: e */
        public void mo38064e(int i) {
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$l */
    /* compiled from: AddServiceMenuClass */
    class C11396l implements OnGroupClickListener {
        C11396l() {
        }

        public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            C11383o.this.m51489d(expandableListView, i);
            expandableListView.isGroupExpanded(i);
            return false;
        }
    }

    /* renamed from: com.mrsool.shopmenu.o$m */
    /* compiled from: AddServiceMenuClass */
    public interface C11397m {
        /* renamed from: a */
        void mo39129a();
    }

    public C11383o(Context context, Bundle bundle) {
        this.f32014x0 = context;
        this.f32006p0 = bundle;
        m51510o();
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m51464A() {
        Iterator it = this.f32011u0.iterator();
        int i = 0;
        double d = 0.0d;
        boolean z = false;
        while (it.hasNext()) {
            MenuAddonsBean menuAddonsBean = (MenuAddonsBean) it.next();
            if (menuAddonsBean.getType() == 0) {
                Iterator it2 = menuAddonsBean.getmVarietiesArray().iterator();
                while (it2.hasNext()) {
                    MenuVarietyBean menuVarietyBean = (MenuVarietyBean) it2.next();
                    if (menuVarietyBean.isSelected()) {
                        d += menuVarietyBean.getPrice();
                    }
                    z = true;
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
        if (!z) {
            try {
                d += Double.parseDouble(mo39437c().getPrice());
            } catch (Exception unused) {
            }
        }
        View view = this.f31997g0;
        if (mo39437c().shouldHidePriceZero()) {
            i = 8;
        }
        view.setVisibility(i);
        TextView textView = this.f31995e0;
        double parseInt = (double) Integer.parseInt(this.f31993c0.getText().toString().trim());
        Double.isNaN(parseInt);
        textView.setText(C5887x.m25809b(Double.valueOf(d * parseInt)));
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m51465C() {
        new Handler().postDelayed(new C11388d(), 300);
    }

    /* renamed from: D */
    private void m51466D() {
        int i = this.f31998h0;
        if (i == 1) {
            this.f31986X.setEnabled(false);
            this.f31983U.setEnabled(false);
            this.f31983U.setAlpha(0.5f);
            this.f31984V.setAlpha(1.0f);
        } else if (i >= 1 && ((float) i) < C11644i.f33257a7) {
            this.f31983U.setEnabled(true);
            this.f31986X.setEnabled(true);
            this.f31983U.setAlpha(1.0f);
            this.f31984V.setAlpha(1.0f);
            this.f31984V.setEnabled(true);
            this.f31985W.setEnabled(true);
        } else if (((float) this.f31998h0) == C11644i.f33257a7) {
            this.f31983U.setEnabled(true);
            this.f31986X.setEnabled(true);
            this.f31983U.setAlpha(1.0f);
            this.f31984V.setEnabled(false);
            this.f31985W.setEnabled(false);
            this.f31984V.setAlpha(0.5f);
        }
    }

    /* renamed from: p */
    private Boolean m51511p() {
        boolean z = true;
        for (int i = 0; i < this.f32000j0.size(); i++) {
            if (((MenuAddonsBean) this.f32000j0.get(i)).getMaxAllowedOption() <= 0 || ((MenuAddonsBean) this.f32000j0.get(i)).getMinAllowedOption() <= 0) {
                if (((MenuAddonsBean) this.f32000j0.get(i)).getMaxAllowedOption() == 0 && ((MenuAddonsBean) this.f32000j0.get(i)).getMinAllowedOption() > 0) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < ((MenuAddonsBean) this.f32000j0.get(i)).getMenuAddonOptions().size(); i3++) {
                        if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f32000j0.get(i)).getMenuAddonOptions().get(i3)).isSelected()) {
                            i2++;
                        }
                    }
                    if (!((MenuAddonsBean) this.f32000j0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33266b7) || i2 >= ((MenuAddonsBean) this.f32000j0.get(i)).getMinAllowedOption()) {
                        ((MenuAddonsBean) this.f32000j0.get(i)).setValidationError(false);
                    } else {
                        ((MenuAddonsBean) this.f32000j0.get(i)).setValidationError(true);
                    }
                }
                if (z && ((MenuAddonsBean) this.f32000j0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33275c7)) {
                    ((MenuAddonsBean) this.f32000j0.get(i)).setSelected(false);
                }
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < ((MenuAddonsBean) this.f32000j0.get(i)).getMenuAddonOptions().size(); i5++) {
                    if (((MenuAddonsOptionsBean) ((MenuAddonsBean) this.f32000j0.get(i)).getMenuAddonOptions().get(i5)).isSelected()) {
                        i4++;
                    }
                }
                if ((!((MenuAddonsBean) this.f32000j0.get(i)).getStatus().equalsIgnoreCase(C11644i.f33266b7) || i4 >= ((MenuAddonsBean) this.f32000j0.get(i)).getMinAllowedOption()) && i4 <= ((MenuAddonsBean) this.f32000j0.get(i)).getMaxAllowedOption()) {
                    ((MenuAddonsBean) this.f32000j0.get(i)).setValidationError(false);
                    ((MenuAddonsBean) this.f32000j0.get(i)).setSelected(false);
                } else {
                    ((MenuAddonsBean) this.f32000j0.get(i)).setValidationError(true);
                }
            }
            z = false;
            ((MenuAddonsBean) this.f32000j0.get(i)).setSelected(false);
        }
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public Boolean m51512q() {
        boolean z;
        int size = this.f31999i0.size();
        Boolean valueOf = Boolean.valueOf(true);
        if (size == 0) {
            return valueOf;
        }
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (i >= this.f31999i0.size()) {
                z = false;
                break;
            }
            if (((MenuVarietyBean) this.f31999i0.get(i)).getStatus().equals(C11644i.f33266b7)) {
                z2 = true;
            }
            if (((MenuVarietyBean) this.f31999i0.get(i)).getSelected()) {
                z = true;
                break;
            }
            i++;
        }
        if (!z2) {
            return valueOf;
        }
        if (!z) {
            this.f31988Z.setTag(Integer.valueOf(1));
            this.f31988Z.setTextColor(C0841b.m4915a(this.f32014x0, (int) C10232R.C10234color.red_lite_2));
            this.f32013w0 = 0;
            this.f31990a0.setVisibility(0);
        } else {
            this.f31988Z.setTag(Integer.valueOf(0));
            this.f31988Z.setTextColor(C0841b.m4915a(this.f32014x0, (int) C10232R.C10234color.Black));
            this.f31990a0.setVisibility(8);
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: r */
    private void m51513r() {
        Bundle bundle = this.f32006p0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33332j1)) {
                this.f32003m0 = this.f32006p0.getInt(C11644i.f33332j1);
            }
            if (this.f32006p0.containsKey(C11644i.f33043A1)) {
                this.f32002l0 = Boolean.valueOf(this.f32006p0.getBoolean(C11644i.f33043A1));
            }
        }
    }

    /* renamed from: s */
    private void m51514s() {
        this.f32008r0.setOnScrollChangeListener(new C11393i());
        Iterator it = this.f32011u0.iterator();
        while (it.hasNext()) {
            MenuAddonsBean menuAddonsBean = (MenuAddonsBean) it.next();
            TabLayout tabLayout = this.f32012v0;
            tabLayout.mo28105a(tabLayout.mo28126f().mo28195b((CharSequence) menuAddonsBean.getTitle().trim()));
            TabLayout tabLayout2 = this.f32012v0;
            ((TextView) tabLayout2.mo28096a(tabLayout2.getTabCount() - 1).f19940i.getChildAt(1)).setSingleLine(true);
        }
        this.f32012v0.mo28104a((C7051h) new C11394j());
        this.f32010t0 = new C11408r(this.f32014x0, mo39437c().getCurrency(), new C11395k());
        this.f32009s0.setOnGroupClickListener(new C11396l());
        this.f32009s0.setOnChildClickListener(new C11386b());
        this.f32010t0.mo39479a(this.f32011u0);
        this.f32009s0.setAdapter(this.f32010t0);
        m51498i();
        this.f32010t0.notifyDataSetChanged();
        new Handler().postDelayed(new C11387c(), 100);
        m51464A();
    }

    /* renamed from: t */
    private void m51515t() {
        try {
            C2232l.m11649c(this.f32014x0).mo9515a(mo39437c().getPhotoUrl()).m11468a(this.f31970C0).mo9424a(this.f31982T);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f31987Y.setText(mo39437c().getName());
    }

    /* renamed from: u */
    private void m51516u() {
        if (!TextUtils.isEmpty(mo39437c().getLongDesc())) {
            this.f31996f0.setVisibility(0);
            this.f31996f0.setText(mo39437c().getLongDesc());
        }
    }

    /* renamed from: v */
    private void m51517v() {
        if (this.f32002l0.booleanValue()) {
            this.f31998h0 = mo39437c().getOrderCount();
            this.f31993c0.setText(String.valueOf(this.f31998h0));
        }
    }

    /* renamed from: w */
    private void m51518w() {
        this.f31979Q = new WrapContentLinearLayoutManager(this.f32014x0);
        this.f31978P.mo7000l(1);
        this.f31977O.setLayoutManager(this.f31979Q);
        this.f31977O.setItemAnimator(this.f31989a.mo23672x());
        this.f31977O.setNestedScrollingEnabled(false);
        this.f31981S = new C11378n(this.f32000j0, this.f32014x0, mo39437c().getCurrency());
        this.f31977O.setAdapter(this.f31981S);
    }

    /* renamed from: x */
    private void m51519x() {
        this.f31991b = (ImageView) this.f32015y0.findViewById(C10232R.C10236id.ivClose);
        this.f31991b.setOnClickListener(this);
    }

    /* renamed from: y */
    private void m51520y() {
        this.f31978P = new WrapContentLinearLayoutManager(this.f32014x0);
        this.f31978P.mo7000l(1);
        this.f31976N.setLayoutManager(this.f31978P);
        this.f31976N.setItemAnimator(this.f31989a.mo23672x());
        this.f31976N.setNestedScrollingEnabled(false);
        this.f31980R = new C11454x(this.f31999i0, this.f32014x0, mo39437c().getCurrency());
        this.f31976N.setAdapter(this.f31980R);
        this.f31980R.mo39525a((C11457c) new C11390f());
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m51521z() {
        this.f32012v0.animate().alpha(1.0f).setDuration(400);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.btnDone /*2131361973*/:
                if (!m51512q().booleanValue() || !m51511p().booleanValue()) {
                    this.f32010t0.notifyDataSetChanged();
                    this.f31981S.mo7341e();
                    m51486c(m51499j());
                    return;
                }
                if (!this.f32002l0.booleanValue()) {
                    MenuItemBean menuItemBean = new MenuItemBean();
                    menuItemBean.setId(mo39437c().getId());
                    menuItemBean.setBusinessAccountId(mo39437c().getBusinessAccountId());
                    menuItemBean.setName(mo39437c().getName());
                    menuItemBean.setPrice(mo39437c().getPrice());
                    if (mo39437c().shouldHidePriceZero()) {
                        menuItemBean.setShouldHidePriceZero();
                    }
                    menuItemBean.setShortDesc(mo39437c().getShortDesc());
                    menuItemBean.setLongDesc(mo39437c().getLongDesc());
                    menuItemBean.setActive(mo39437c().isActive());
                    menuItemBean.setPhotoUrl(mo39437c().getPhotoUrl());
                    menuItemBean.setCurrency(mo39437c().getCurrency());
                    menuItemBean.setDefaultVarietyId(mo39437c().getDefaultVarietyId());
                    menuItemBean.setArrayListVariety(this.f31999i0);
                    menuItemBean.setArrayListAddons((ArrayList) this.f32000j0);
                    menuItemBean.setOrderCount(this.f31998h0);
                    menuItemBean.setChildPosition(ShopDetailPackageActivity.f31153q0);
                    menuItemBean.setParentPosition(ShopDetailPackageActivity.f31152p0);
                    int a = m51467a(menuItemBean);
                    if (a == -1) {
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().add(menuItemBean);
                    } else {
                        ((MenuItemBean) m51506m().getArrayListUsersMenuItems().get(a)).setOrderCount(((MenuItemBean) m51506m().getArrayListUsersMenuItems().get(a)).getOrderCount() + this.f31998h0);
                    }
                    m51482b(menuItemBean);
                } else {
                    mo39437c().setOrderCount(this.f31998h0);
                    mo39437c().setArrayListVariety(this.f31999i0);
                    mo39437c().setArrayListAddons((ArrayList) this.f32000j0);
                    int a2 = m51467a(mo39437c());
                    String str = "";
                    if (a2 == -1) {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32003m0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32003m0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f32003m0, mo39437c());
                    } else if (a2 != this.f32003m0) {
                        ((MenuItemBean) m51506m().getArrayListUsersMenuItems().get(a2)).setOrderCount(((MenuItemBean) m51506m().getArrayListUsersMenuItems().get(a2)).getOrderCount() + this.f31998h0);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().remove(this.f32003m0);
                    } else {
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32003m0)).setErrorMessage(str);
                        ((MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32003m0)).setErrorType(C11411s.NONE);
                        ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().set(this.f32003m0, mo39437c());
                    }
                }
                C11397m mVar = this.f31968A0;
                if (mVar != null) {
                    mVar.mo39129a();
                }
                mo39439e();
                return;
            case C10232R.C10236id.flMinus /*2131362288*/:
            case C10232R.C10236id.ivMinus /*2131362815*/:
                m51477a(Boolean.valueOf(false));
                return;
            case C10232R.C10236id.flPlus /*2131362301*/:
            case C10232R.C10236id.ivPlus /*2131362839*/:
                m51477a(Boolean.valueOf(true));
                return;
            case C10232R.C10236id.ivClose /*2131362756*/:
                mo39439e();
                return;
            case C10232R.C10236id.ivItemPic /*2131362793*/:
                try {
                    if (!TextUtils.isEmpty(mo39437c().getPhotoUrl())) {
                        if (VERSION.SDK_INT >= 21) {
                            ((Activity) this.f32014x0).getWindow().setExitTransition(null);
                        }
                        Intent intent = new Intent(this.f32014x0, ViewPhotoFullActivity.class);
                        intent.putExtra(C11644i.f33463z1, mo39437c().getPhotoUrl());
                        C0841b.m4921a(this.f32014x0, intent, C0737c.m4272a((Activity) this.f32014x0, (View) this.f31982T, this.f32014x0.getString(C10232R.string.tran_menu_item_image)).mo4091b());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: g */
    private List<MenuAddonsBean> m51493g() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mo39437c().getArrayListAddons().size(); i++) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setTitle(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getName());
            menuAddonsBean.setType(1);
            menuAddonsBean.setDescription(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getDescription());
            menuAddonsBean.setId(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getId());
            menuAddonsBean.setName(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getName());
            menuAddonsBean.setMaxAllowedOption(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMaxAllowedOption());
            menuAddonsBean.setMinAllowedOption(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMinAllowedOption());
            menuAddonsBean.setMenuAddonId(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonId());
            menuAddonsBean.setPrice(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getPrice());
            menuAddonsBean.setErrorMessage(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getErrorMessage());
            menuAddonsBean.setStatus(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getStatus());
            if (((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMinAllowedOption() == 1 && ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMaxAllowedOption() <= 1) {
                ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).setSelected(true);
            }
            menuAddonsBean.setSelected(((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).isSelected());
            menuAddonsBean.setMenuAddonOptions(m51470a(i));
            this.f32011u0.add(menuAddonsBean);
            arrayList.add(menuAddonsBean);
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m51495h() {
        for (MenuVarietyBean menuVarietyBean : mo39436b()) {
            if (!this.f32002l0.booleanValue() && menuVarietyBean.getId().equalsIgnoreCase(mo39437c().getDefaultVarietyId())) {
                menuVarietyBean.setSelected(true);
            }
            try {
                this.f31999i0.add((MenuVarietyBean) menuVarietyBean.clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        if (this.f31999i0.size() > 0) {
            MenuAddonsBean menuAddonsBean = new MenuAddonsBean();
            menuAddonsBean.setType(0);
            menuAddonsBean.setTitle(this.f32014x0.getString(C10232R.string.lbl_varieties));
            menuAddonsBean.setmVarietiesArray(this.f31999i0);
            this.f32011u0.add(menuAddonsBean);
        }
    }

    /* renamed from: i */
    private void m51498i() {
        for (int i = 0; i < this.f32009s0.getExpandableListAdapter().getGroupCount(); i++) {
            this.f32009s0.expandGroup(i);
        }
    }

    /* renamed from: j */
    private int m51499j() {
        if (!m51512q().booleanValue()) {
            return 0;
        }
        for (int i = 0; i < this.f32011u0.size(); i++) {
            if (((MenuAddonsBean) this.f32011u0.get(i)).isValidationError()) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: k */
    private C1817b m51501k() {
        C1817b bVar = new C1817b(this.f32014x0);
        bVar.mo8171d(5.0f);
        bVar.mo8164b(20.0f);
        bVar.mo8163a(this.f32014x0.getResources().getColor(C10232R.C10234color.colorAccent));
        bVar.start();
        return bVar;
    }

    /* renamed from: l */
    private Activity m51503l() {
        Context context = this.f32014x0;
        if (context instanceof ShopDetailPackageActivity) {
            return (ShopDetailPackageActivity) context;
        }
        if (context instanceof MenuOrderActivityStep1) {
            return (MenuOrderActivityStep1) context;
        }
        return (C0295d) context;
    }

    /* renamed from: m */
    private MenuCategoryBean m51506m() {
        return (MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m51508n() {
        this.f32012v0.animate().alpha(0.0f).setDuration(400);
    }

    /* renamed from: o */
    private void m51510o() {
        this.f31989a = new C5887x(this.f32014x0);
        this.f32015y0 = m51503l().getLayoutInflater().inflate(C10232R.layout.bottom_sheet_add_menu_new, null);
        this.f32016z0 = new C5665a(this.f32014x0, C10232R.style.DialogStyle);
        this.f31989a = new C5887x(this.f32014x0);
        m51519x();
        this.f32011u0 = new ArrayList<>();
        this.f32008r0 = (NestedScrollView) this.f32015y0.findViewById(C10232R.C10236id.svMain);
        this.f31985W = (FrameLayout) this.f32015y0.findViewById(C10232R.C10236id.flPlus);
        this.f31985W.setOnClickListener(this);
        this.f31986X = (FrameLayout) this.f32015y0.findViewById(C10232R.C10236id.flMinus);
        this.f31986X.setOnClickListener(this);
        this.f32012v0 = (TabLayout) this.f32015y0.findViewById(C10232R.C10236id.tabLayoutMenu);
        this.f32009s0 = (ExpandableListView) this.f32015y0.findViewById(C10232R.C10236id.expandableListView);
        this.f31995e0 = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvTotalAmount);
        this.f31997g0 = this.f32015y0.findViewById(C10232R.C10236id.tvAmountAndCurrency);
        this.f31996f0 = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvDescription);
        this.f31976N = (RecyclerView) this.f32015y0.findViewById(C10232R.C10236id.rvVarient);
        this.f31977O = (RecyclerView) this.f32015y0.findViewById(C10232R.C10236id.rvAddOns);
        this.f31983U = (ImageView) this.f32015y0.findViewById(C10232R.C10236id.ivMinus);
        this.f31983U.setOnClickListener(this);
        this.f31984V = (ImageView) this.f32015y0.findViewById(C10232R.C10236id.ivPlus);
        this.f31984V.setOnClickListener(this);
        this.f31993c0 = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvQty);
        this.f31994d0 = (TextView) this.f32015y0.findViewById(C10232R.C10236id.btnDone);
        this.f31994d0.setOnClickListener(this);
        this.f32007q0 = (LinearLayout) this.f32015y0.findViewById(C10232R.C10236id.llCounterView);
        this.f31982T = (ImageView) this.f32015y0.findViewById(C10232R.C10236id.ivItemPic);
        this.f31982T.setOnClickListener(this);
        this.f31987Y = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvItemName);
        this.f31988Z = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvVariety);
        this.f31990a0 = (TextView) this.f32015y0.findViewById(C10232R.C10236id.tvVarietyError);
        m51513r();
        m51517v();
        this.f32001k0 = (LinearLayout) this.f32015y0.findViewById(C10232R.C10236id.llVarietyContainer);
        m51495h();
        this.f32000j0 = m51493g();
        m51520y();
        m51518w();
        m51466D();
        m51515t();
        m51516u();
        m51514s();
        if (this.f32011u0.size() == 0) {
            this.f32012v0.setVisibility(8);
            this.f32009s0.setVisibility(8);
        }
        this.f32016z0.setOnShowListener(new C11384a());
        this.f32016z0.setCancelable(true);
        this.f32016z0.setContentView(this.f32015y0);
        this.f32016z0.getWindow().setSoftInputMode(19);
    }

    /* renamed from: d */
    public C11397m mo39438d() {
        return this.f31968A0;
    }

    /* renamed from: e */
    public void mo39439e() {
        C5665a aVar = this.f32016z0;
        if (aVar != null && aVar.isShowing()) {
            this.f32016z0.dismiss();
        }
    }

    /* renamed from: f */
    public void mo39440f() {
        C5665a aVar = this.f32016z0;
        if (aVar != null && !aVar.isShowing()) {
            this.f32016z0.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51489d(ExpandableListView expandableListView, int i) {
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

    /* renamed from: c */
    public MenuItemBean mo39437c() {
        if (!this.f32002l0.booleanValue()) {
            return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListMenuItems().get(ShopDetailPackageActivity.f31153q0);
        }
        return (MenuItemBean) ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getArrayListUsersMenuItems().get(this.f32003m0);
    }

    /* renamed from: b */
    public List<MenuVarietyBean> mo39436b() {
        return mo39437c().getArrayListVariety();
    }

    /* renamed from: a */
    private List<MenuAddonsBean> m51472a(ArrayList<MenuAddonsBean> arrayList) {
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
            menuAddonsBean.setMenuAddonOptions(m51471a((MenuAddonsBean) arrayList.get(i)));
            arrayList2.add(menuAddonsBean);
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m51478b(int i) {
        Iterator it = ((MenuAddonsBean) this.f32011u0.get(i)).getMenuAddonOptions().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((MenuAddonsOptionsBean) it.next()).isSelected()) {
                i2++;
            }
        }
        return i2;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public int m51484c(ExpandableListView expandableListView, int i) {
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

    /* renamed from: b */
    private int m51479b(ExpandableListView expandableListView, int i) {
        ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(expandableListView.getWidth(), C6637f.f18605b);
        View groupView = expandableListAdapter.getGroupView(i, false, null, expandableListView);
        groupView.measure(makeMeasureSpec, 0);
        return groupView.getMeasuredHeight() * ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(i)).getArrayListMenuItems().size();
    }

    /* renamed from: b */
    private void m51482b(MenuItemBean menuItemBean) {
        boolean z;
        boolean z2;
        try {
            Iterator it = this.f32000j0.iterator();
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
            Iterator it2 = this.f31999i0.iterator();
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
            C11598a.m52263f().mo39817a(menuItemBean.getName(), ((MenuCategoryBean) ShopDetailPackageActivity.f31150n0.get(ShopDetailPackageActivity.f31152p0)).getCategoryName(), ShopDetailPackageActivity.f31153q0 + 1, ShopDetailPackageActivity.f31152p0 + 1, this.f31998h0, Double.parseDouble(menuItemBean.getPrice()), z, z2, C11644i.f33218W0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m51486c(int i) {
        if (this.f31971D0) {
            this.f31971D0 = false;
            return;
        }
        if (!this.f32009s0.isGroupExpanded(i)) {
            this.f32009s0.expandGroup(i);
            mo39433a(this.f32009s0);
        }
        this.f32008r0.postDelayed(new C11391g(i), 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m51488d(int i) {
        Iterator it = ((MenuAddonsBean) this.f32011u0.get(i)).getmVarietiesArray().iterator();
        while (it.hasNext()) {
            ((MenuVarietyBean) it.next()).setSelected(false);
        }
    }

    /* renamed from: a */
    private ArrayList<MenuAddonsOptionsBean> m51470a(int i) {
        ArrayList<MenuAddonsOptionsBean> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().size(); i2++) {
            MenuAddonsOptionsBean menuAddonsOptionsBean = new MenuAddonsOptionsBean();
            menuAddonsOptionsBean.setDescription(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getDescription());
            menuAddonsOptionsBean.setName(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getName());
            menuAddonsOptionsBean.setId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getId());
            menuAddonsOptionsBean.setMenuAddonOptionId(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getMenuAddonOptionId());
            menuAddonsOptionsBean.setPrice(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getPrice());
            menuAddonsOptionsBean.setSelected(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).isSelected());
            menuAddonsOptionsBean.setErrorMessage(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getErrorMessage());
            menuAddonsOptionsBean.setStatus(((MenuAddonsOptionsBean) ((MenuAddonsBean) mo39437c().getArrayListAddons().get(i)).getMenuAddonOptions().get(i2)).getStatus());
            arrayList.add(menuAddonsOptionsBean);
        }
        return arrayList;
    }

    /* renamed from: a */
    private ArrayList<MenuAddonsOptionsBean> m51471a(MenuAddonsBean menuAddonsBean) {
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

    /* renamed from: a */
    public void mo39435a(C11397m mVar) {
        this.f31968A0 = mVar;
    }

    /* renamed from: a */
    private int m51467a(MenuItemBean menuItemBean) {
        C8775f fVar = new C8775f();
        MenuCategoryBean m = m51506m();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < m.getArrayListUsersMenuItems().size()) {
            boolean z3 = !this.f32002l0.booleanValue() ? ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId()) : this.f32003m0 != i && ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).getId().equalsIgnoreCase(menuItemBean.getId());
            if (z3) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).getArrayListVariety().iterator();
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
                List<MenuAddonsBean> a = m51472a(((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).getArrayListAddons());
                String errorMessage = ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).getErrorMessage();
                for (MenuAddonsBean menuAddonsBean : a) {
                    menuAddonsBean.setErrorMessage(null);
                    Iterator it2 = menuAddonsBean.getMenuAddonOptions().iterator();
                    while (it2.hasNext()) {
                        ((MenuAddonsOptionsBean) it2.next()).setErrorMessage(null);
                    }
                }
                ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).setErrorMessage(null);
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
                ((MenuItemBean) m.getArrayListUsersMenuItems().get(i)).setErrorMessage(errorMessage);
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
    private void m51474a(NestedScrollView nestedScrollView, View view) {
        Point point = new Point();
        m51473a(nestedScrollView, view.getParent(), view, point);
        nestedScrollView.mo5276a(0, point.y);
    }

    /* renamed from: a */
    private void m51477a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f31998h0++;
        } else {
            this.f31998h0--;
        }
        this.f31993c0.setText(String.valueOf(this.f31998h0));
        m51466D();
        m51464A();
    }

    /* renamed from: a */
    public void mo39433a(ExpandableListView expandableListView) {
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
    private void m51473a(ViewGroup viewGroup, ViewParent viewParent, View view, Point point) {
        ViewGroup viewGroup2 = (ViewGroup) viewParent;
        point.x += view.getLeft();
        point.y += view.getTop();
        if (!viewGroup2.equals(viewGroup)) {
            m51473a(viewGroup, viewGroup2.getParent(), viewGroup2, point);
        }
    }

    /* renamed from: a */
    public void mo39434a(ExpandableListView expandableListView, int i) {
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
