package com.mrsool.createorder;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.core.p034l.C0984g;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.api.C2876e;
import com.facebook.appevents.AppEventsConstants;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.material.p296f.C6845b;
import com.mrsool.C10232R;
import com.mrsool.bean.CheckDiscountBean;
import com.mrsool.bean.DiscountOptionBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.chat.ViewPhotoFullActivity;
import com.mrsool.coupon.AddNewCouponActivity;
import com.mrsool.newBean.OrderItemBean;
import com.mrsool.newBean.UploadImageBean;
import com.mrsool.order.C11061r;
import com.mrsool.order.C11061r.C11064c;
import com.mrsool.p423v.C11719c;
import com.mrsool.p423v.C11725f;
import com.mrsool.p423v.C11737m;
import com.mrsool.payment.C11095j;
import com.mrsool.payment.C11124o;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11641f;
import com.mrsool.utils.C11642g;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C11651o;
import com.mrsool.utils.C11664r.C11667c;
import com.mrsool.utils.C11669t;
import com.mrsool.utils.C11669t.C11673d;
import com.mrsool.utils.C5880q;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.TakeImages;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11600b;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p422c0.C11618a;
import com.mrsool.utils.p422c0.C11618a.C11620b;
import com.mrsool.utils.p422c0.C11618a.C11622d;
import com.mrsool.utils.p422c0.C11618a.C11623e;
import com.mrsool.utils.webservice.C11692d;
import java.io.File;
import java.util.ArrayList;
import p053b.p063d.p064b.C2108a;
import p076c.p082c.p083a.C2232l;
import retrofit2.Response;

/* renamed from: com.mrsool.createorder.r */
/* compiled from: OrderStepFragment1 */
public class C10657r extends Fragment implements OnClickListener {

    /* renamed from: A0 */
    private NestedScrollView f29110A0;
    /* access modifiers changed from: private */

    /* renamed from: B0 */
    public FrameLayout f29111B0;

    /* renamed from: C0 */
    private C11095j f29112C0;

    /* renamed from: D0 */
    private View f29113D0;

    /* renamed from: E0 */
    private TextView f29114E0;

    /* renamed from: F0 */
    public C11600b f29115F0 = C11600b.DefaultOrder;

    /* renamed from: N */
    public int f29116N = -1;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public PaymentListBean f29117O;

    /* renamed from: P */
    public int f29118P = 3;

    /* renamed from: Q */
    private LinearLayout f29119Q;

    /* renamed from: R */
    private ImageView f29120R;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public ImageView f29121S;

    /* renamed from: T */
    private TextView f29122T;

    /* renamed from: U */
    private TextView f29123U;

    /* renamed from: V */
    private TextView f29124V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public AppSingleton f29125W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C5887x f29126X;

    /* renamed from: Y */
    private C11669t f29127Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public int f29128Z = 0;

    /* renamed from: a */
    private View f29129a;

    /* renamed from: a0 */
    CheckDiscountBean f29130a0;

    /* renamed from: b */
    public EditText f29131b;

    /* renamed from: b0 */
    private WrapContentLinearLayoutManager f29132b0;

    /* renamed from: c0 */
    private C11061r f29133c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public RecyclerView f29134d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public C10652q f29135e0;

    /* renamed from: f0 */
    public ArrayList<UploadImageBean> f29136f0;

    /* renamed from: g0 */
    private RecyclerView f29137g0;

    /* renamed from: h0 */
    private RecyclerView f29138h0;

    /* renamed from: i0 */
    private RelativeLayout f29139i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public C10648p f29140j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public C10696t f29141k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ArrayList<DiscountOptionBean> f29142l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public ArrayList<PaymentListBean> f29143m0;

    /* renamed from: n0 */
    public int f29144n0 = -1;

    /* renamed from: o0 */
    private View f29145o0;

    /* renamed from: p0 */
    public LinearLayout f29146p0;

    /* renamed from: q0 */
    public LinearLayout f29147q0;

    /* renamed from: r0 */
    private LinearLayout f29148r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public LinearLayout f29149s0;
    /* access modifiers changed from: private */

    /* renamed from: t0 */
    public ArrayList<OrderItemBean> f29150t0 = new ArrayList<>();

    /* renamed from: u0 */
    private int f29151u0 = 0;

    /* renamed from: v0 */
    private LinearLayout f29152v0;
    /* access modifiers changed from: private */

    /* renamed from: w0 */
    public LinearLayout f29153w0;

    /* renamed from: x0 */
    String f29154x0;
    /* access modifiers changed from: private */

    /* renamed from: y0 */
    public boolean f29155y0 = false;
    /* access modifiers changed from: private */

    /* renamed from: z0 */
    public boolean f29156z0 = false;

    /* renamed from: com.mrsool.createorder.r$a */
    /* compiled from: OrderStepFragment1 */
    class C10658a implements OnClickListener {
        C10658a() {
        }

        public void onClick(View view) {
            C10657r.this.m49119a(Integer.parseInt(view.getTag().toString()), true);
        }
    }

    /* renamed from: com.mrsool.createorder.r$b */
    /* compiled from: OrderStepFragment1 */
    class C10659b implements Runnable {
        C10659b() {
        }

        public void run() {
            C10657r.this.m49130d(true);
        }
    }

    /* renamed from: com.mrsool.createorder.r$c */
    /* compiled from: OrderStepFragment1 */
    class C10660c implements Runnable {
        C10660c() {
        }

        public void run() {
            C10657r.this.m49130d(true);
        }
    }

    /* renamed from: com.mrsool.createorder.r$d */
    /* compiled from: OrderStepFragment1 */
    class C10661d implements C11064c {

        /* renamed from: a */
        final /* synthetic */ Dialog f29160a;

        C10661d(Dialog dialog) {
            this.f29160a = dialog;
        }

        /* renamed from: a */
        public void mo38058a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Payement Method Clicked == ");
            sb.append(i);
            C5880q.m25751b(sb.toString());
            C10657r rVar = C10657r.this;
            rVar.f29116N = ((PaymentListBean) rVar.f29130a0.getPaymentOptions().get(i)).getId().intValue();
            C10657r rVar2 = C10657r.this;
            rVar2.f29117O = (PaymentListBean) rVar2.f29130a0.getPaymentOptions().get(i);
            C10657r.this.m49127c(i);
            C10657r.this.mo38053x();
            this.f29160a.dismiss();
        }
    }

    /* renamed from: com.mrsool.createorder.r$e */
    /* compiled from: OrderStepFragment1 */
    class C10662e implements C11124o {
        C10662e() {
        }

        /* renamed from: a */
        public void mo37723a() {
        }

        /* renamed from: a */
        public void mo37724a(int i) {
            C10657r rVar = C10657r.this;
            rVar.f29116N = ((PaymentListBean) rVar.f29130a0.getPaymentOptions().get(i)).getId().intValue();
            C10657r rVar2 = C10657r.this;
            rVar2.f29117O = (PaymentListBean) rVar2.f29130a0.getPaymentOptions().get(i);
            C10657r.this.m49127c(i);
            C10657r.this.mo38053x();
        }
    }

    /* renamed from: com.mrsool.createorder.r$f */
    /* compiled from: OrderStepFragment1 */
    class C10663f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29163a;

        C10663f(Dialog dialog) {
            this.f29163a = dialog;
        }

        public void onClick(View view) {
            this.f29163a.dismiss();
            C10657r.this.m49118a(1);
        }
    }

    /* renamed from: com.mrsool.createorder.r$g */
    /* compiled from: OrderStepFragment1 */
    class C10664g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29165a;

        C10664g(Dialog dialog) {
            this.f29165a = dialog;
        }

        public void onClick(View view) {
            this.f29165a.dismiss();
            C10657r.this.m49118a(0);
        }
    }

    /* renamed from: com.mrsool.createorder.r$h */
    /* compiled from: OrderStepFragment1 */
    class C10665h implements C11673d {

        /* renamed from: a */
        final /* synthetic */ int f29167a;

        C10665h(int i) {
            this.f29167a = i;
        }

        /* renamed from: a */
        public void mo36513a() {
        }

        /* renamed from: b */
        public void mo36514b() {
            C10657r.this.f29128Z = this.f29167a;
            String str = "1,1";
            String str2 = "pictureRatio";
            String str3 = "PicType";
            if (this.f29167a == 1) {
                Intent intent = new Intent(C10657r.this.getActivity(), TakeImages.class);
                intent.putExtra(str3, C10657r.this.getString(C10232R.string.lbl_dg_title_camera));
                intent.putExtra(str2, str);
                C10657r.this.startActivityForResult(intent, C11644i.f33390q0);
                return;
            }
            Intent intent2 = new Intent(C10657r.this.getActivity(), TakeImages.class);
            intent2.putExtra(str3, C10657r.this.getString(C10232R.string.lbl_dg_title_gallery));
            intent2.putExtra(str2, str);
            C10657r.this.startActivityForResult(intent2, C11644i.f33390q0);
        }
    }

    /* renamed from: com.mrsool.createorder.r$i */
    /* compiled from: OrderStepFragment1 */
    class C10666i implements C11667c {

        /* renamed from: a */
        final /* synthetic */ String f29169a;

        /* renamed from: com.mrsool.createorder.r$i$a */
        /* compiled from: OrderStepFragment1 */
        class C10667a implements DialogInterface.OnClickListener {
            C10667a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        }

        C10666i(String str) {
            this.f29169a = str;
        }

        /* renamed from: a */
        public void mo38061a(boolean z, boolean z2) {
            if (!C10657r.this.getActivity().isFinishing() && !z2) {
                if (z) {
                    C11641f.m52485a(this.f29169a, 500);
                    C10657r.this.f29126X.mo23481I(this.f29169a);
                    C10657r.this.f29126X.mo23579b(new File(this.f29169a));
                    C10657r.this.m49103A();
                    return;
                }
                C6845b bVar = new C6845b(C10657r.this.getActivity(), C10232R.style.AlertDialogTheme);
                bVar.mo758a((CharSequence) "Can not rotate image").mo760a(false).mo776c((CharSequence) "Okay", (DialogInterface.OnClickListener) new C10667a());
                bVar.mo778c();
            }
        }
    }

    /* renamed from: com.mrsool.createorder.r$j */
    /* compiled from: OrderStepFragment1 */
    class C10668j extends C11725f {
        C10668j() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            try {
                Intent intent = new Intent(C10657r.this.getActivity(), ViewPhotoFullActivity.class);
                intent.putExtra(C11644i.f33463z1, ((UploadImageBean) C10657r.this.f29136f0.get(i)).getImagePath());
                intent.putExtra(C11644i.f33360m2, true);
                C10657r.this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* renamed from: c */
        public void mo38063c(int i) {
            C10657r.this.mo38054y();
        }

        /* renamed from: e */
        public void mo38064e(int i) {
            C10657r.this.f29136f0.remove(i);
            C10657r.this.f29135e0.mo7341e();
            C10657r.this.f29121S.setVisibility(0);
            if (C10657r.this.f29136f0.size() == 0) {
                C10657r.this.f29134d0.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.r$k */
    /* compiled from: OrderStepFragment1 */
    class C10669k extends C11725f {
        C10669k() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C10657r rVar = C10657r.this;
            int i2 = 0;
            if (rVar.f29144n0 != -1) {
                ((DiscountOptionBean) rVar.f29142l0.get(C10657r.this.f29144n0)).setDefualtValue(false);
            }
            C10657r rVar2 = C10657r.this;
            if (rVar2.f29144n0 == i) {
                rVar2.f29144n0 = -1;
                rVar2.f29118P = 3;
                ((DiscountOptionBean) rVar2.f29142l0.get(i)).setDefualtValue(false);
                C10657r.this.f29140j0.mo7341e();
            } else {
                rVar2.f29144n0 = i;
                ((DiscountOptionBean) rVar2.f29142l0.get(C10657r.this.f29144n0)).setDefualtValue(true);
                C10657r rVar3 = C10657r.this;
                rVar3.f29118P = Integer.parseInt(((DiscountOptionBean) rVar3.f29142l0.get(C10657r.this.f29144n0)).getDiscountType());
                C10657r.this.f29140j0.mo7341e();
            }
            LinearLayout n = C10657r.this.f29153w0;
            if (C10657r.this.f29144n0 != -1) {
                i2 = 8;
            }
            n.setVisibility(i2);
        }

        /* renamed from: c */
        public void mo38063c(int i) {
            if (C10657r.this.f29126X.mo23497S()) {
                C10657r.this.startActivityForResult(new Intent(C10657r.this.getActivity(), AddNewCouponActivity.class), 1004);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.r$l */
    /* compiled from: OrderStepFragment1 */
    class C10670l extends C11725f {
        C10670l() {
        }

        /* renamed from: a */
        public void mo37847a(int i) {
            C10657r rVar = C10657r.this;
            if (rVar.f29116N != ((PaymentListBean) rVar.f29143m0.get(i)).getId().intValue()) {
                C10657r rVar2 = C10657r.this;
                rVar2.f29116N = ((PaymentListBean) rVar2.f29143m0.get(i)).getId().intValue();
                C10657r rVar3 = C10657r.this;
                rVar3.f29117O = (PaymentListBean) rVar3.f29143m0.get(i);
                C10657r.this.f29141k0.mo38102g(i);
                C10657r.this.f29141k0.mo7341e();
                C10657r.this.mo38053x();
            }
        }

        /* renamed from: c */
        public void mo38063c(int i) {
        }
    }

    /* renamed from: com.mrsool.createorder.r$m */
    /* compiled from: OrderStepFragment1 */
    class C10671m implements OnFocusChangeListener {
        C10671m() {
        }

        public void onFocusChange(View view, boolean z) {
            if (!z && C10657r.this.f29131b.getText().toString().trim().equals("") && C10657r.this.f29155y0 && C10657r.this.f29125W.f16955b.getShop().isShowItemList()) {
                C10657r.this.f29111B0.setVisibility(0);
                C10657r.this.f29149s0.setVisibility(8);
            }
        }
    }

    /* renamed from: com.mrsool.createorder.r$n */
    /* compiled from: OrderStepFragment1 */
    class C10672n implements TextWatcher {
        C10672n() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C10657r.this.mo38053x();
        }
    }

    /* renamed from: com.mrsool.createorder.r$o */
    /* compiled from: OrderStepFragment1 */
    class C10673o implements OnEditorActionListener {
        C10673o() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return false;
        }
    }

    /* renamed from: com.mrsool.createorder.r$p */
    /* compiled from: OrderStepFragment1 */
    class C10674p implements C11737m {
        C10674p() {
        }

        /* renamed from: a */
        public void mo38070a(EditText editText, EditText editText2, ImageView imageView, Editable editable) {
            if (!C10657r.this.f29156z0 || (editable.toString().equals("") && editable.toString().length() > 1)) {
                C10657r.this.mo38053x();
            }
        }

        /* renamed from: a */
        public void mo38071a(EditText editText, EditText editText2, ImageView imageView, CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo38072b(EditText editText, EditText editText2, ImageView imageView, CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.mrsool.createorder.r$q */
    /* compiled from: OrderStepFragment1 */
    class C10675q implements OnFocusChangeListener {
        C10675q() {
        }

        public void onFocusChange(View view, boolean z) {
            C10657r.this.m49110H();
        }
    }

    /* renamed from: com.mrsool.createorder.r$r */
    /* compiled from: OrderStepFragment1 */
    class C10676r implements C11737m {
        C10676r() {
        }

        /* renamed from: a */
        public void mo38070a(EditText editText, EditText editText2, ImageView imageView, Editable editable) {
            String str = "";
            if (editable.toString().equals(str)) {
                if (C10657r.this.f29150t0.size() > 0) {
                    ((OrderItemBean) C10657r.this.f29150t0.get(0)).getEtQty().clearFocus();
                }
                imageView.setVisibility(8);
                editText.setTextColor(C0841b.m4915a((Context) C10657r.this.getActivity(), (int) C10232R.C10234color.search_text_gray_lite));
            } else {
                editText.setTextColor(C0841b.m4915a((Context) C10657r.this.getActivity(), (int) C10232R.C10234color.shops_title_text_gray));
                imageView.setVisibility(0);
            }
            if (!C10657r.this.f29156z0 || (editable.toString().equals(str) && editable.toString().length() > 10)) {
                C10657r.this.mo38053x();
            }
        }

        /* renamed from: a */
        public void mo38071a(EditText editText, EditText editText2, ImageView imageView, CharSequence charSequence, int i, int i2, int i3) {
        }

        /* renamed from: b */
        public void mo38072b(EditText editText, EditText editText2, ImageView imageView, CharSequence charSequence, int i, int i2, int i3) {
            C10657r.this.m49130d(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public void m49103A() {
        this.f29134d0.setVisibility(0);
        UploadImageBean uploadImageBean = new UploadImageBean();
        uploadImageBean.setImageBitmap(this.f29126X.mo23484K());
        uploadImageBean.setImageFile(this.f29126X.mo23486L());
        uploadImageBean.setImagePath(this.f29126X.mo23488M());
        this.f29136f0.add(uploadImageBean);
        if (((float) this.f29136f0.size()) >= C11644i.f33248Z6) {
            this.f29121S.setVisibility(8);
        }
        this.f29135e0.mo7341e();
        this.f29134d0.scrollToPosition(this.f29136f0.size());
    }

    /* renamed from: B */
    private void m49104B() {
        OrderItemBean orderItemBean = new OrderItemBean();
        orderItemBean.setTag(this.f29151u0);
        View inflate = ((LayoutInflater) getActivity().getApplicationContext().getSystemService("layout_inflater")).inflate(C10232R.layout.row_order_items, null);
        inflate.setTag(Integer.valueOf(this.f29151u0));
        EditText editText = (EditText) inflate.findViewById(C10232R.C10236id.etIndex);
        editText.setFilters(new InputFilter[]{new C11651o("1", "99")});
        EditText editText2 = (EditText) inflate.findViewById(C10232R.C10236id.etDetail);
        editText.addTextChangedListener(new C11719c(editText, editText2, (ImageView) inflate.findViewById(C10232R.C10236id.ivDelete), new C10674p()));
        if (this.f29155y0) {
            editText2.setHint(this.f29125W.f16955b.getShop().getItemDescriptionText());
        } else {
            editText2.setHint(getResources().getString(C10232R.string.lbl_item_hint));
        }
        editText2.setTag(Integer.valueOf(this.f29151u0));
        editText2.setOnFocusChangeListener(new C10675q());
        editText2.addTextChangedListener(new C11719c(editText, editText2, (ImageView) inflate.findViewById(C10232R.C10236id.ivDelete), new C10676r()));
        inflate.findViewById(C10232R.C10236id.ivDelete).setTag(Integer.valueOf(this.f29151u0));
        inflate.findViewById(C10232R.C10236id.ivDelete).setOnClickListener(new C10658a());
        this.f29148r0.addView(inflate);
        orderItemBean.setView(inflate);
        this.f29150t0.add(orderItemBean);
        m49114L();
        this.f29151u0++;
    }

    /* renamed from: C */
    private int m49105C() {
        if (this.f29125W.f16955b.getShouldCheckIfHasValidCard()) {
            for (int i = 0; i < this.f29143m0.size(); i++) {
                if (((PaymentListBean) this.f29143m0.get(i)).getCode().equalsIgnoreCase("credit_card")) {
                    this.f29116N = ((PaymentListBean) this.f29143m0.get(i)).getId().intValue();
                    this.f29117O = (PaymentListBean) this.f29143m0.get(i);
                    return i;
                }
            }
        }
        return 0;
    }

    /* renamed from: D */
    private void m49106D() {
        Intent intent = getActivity().getIntent();
        if (intent != null) {
            this.f29154x0 = intent.getStringExtra(C11644i.f33431v1);
            if (this.f29154x0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_info))) {
                this.f29155y0 = false;
            } else if (this.f29154x0.equalsIgnoreCase(getString(C10232R.string.lbl_tab_shop_pkg_info))) {
                this.f29155y0 = true;
            }
        }
    }

    /* renamed from: E */
    private void m49107E() {
        this.f29126X = new C5887x(getActivity());
        this.f29127Y = new C11669t(getActivity());
        this.f29136f0 = new ArrayList<>();
        this.f29142l0 = new ArrayList<>();
        this.f29143m0 = new ArrayList<>();
        this.f29152v0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llAddCoupon);
        this.f29152v0.setOnClickListener(this);
        this.f29114E0 = (TextView) this.f29129a.findViewById(C10232R.C10236id.btnDone);
        this.f29113D0 = this.f29129a.findViewById(C10232R.C10236id.bgDone);
        this.f29113D0.setOnClickListener(this);
        this.f29145o0 = this.f29129a.findViewById(C10232R.C10236id.llForceDigitalPayment);
        this.f29124V = (TextView) this.f29129a.findViewById(C10232R.C10236id.tvForceDigitPayTitle);
        this.f29153w0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llCouponWarning);
        m49106D();
        this.f29125W = (AppSingleton) getActivity().getApplicationContext();
        if (this.f29125W.f16955b.getShouldCheckIfHasValidCard()) {
            this.f29145o0.setVisibility(0);
            this.f29124V.setText(this.f29125W.f16955b.getCashNotAllowedLabel());
        }
        this.f29139i0 = (RelativeLayout) this.f29129a.findViewById(C10232R.C10236id.rlCouponView);
        this.f29134d0 = (RecyclerView) this.f29129a.findViewById(C10232R.C10236id.rvImages);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager.mo7000l(0);
        this.f29134d0.setLayoutManager(wrapContentLinearLayoutManager);
        this.f29134d0.setItemAnimator(this.f29126X.mo23672x());
        this.f29135e0 = new C10652q(getActivity(), this.f29136f0, new C10668j());
        this.f29134d0.setAdapter(this.f29135e0);
        this.f29148r0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llItems);
        this.f29149s0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llDescription);
        this.f29146p0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llItemsMain);
        this.f29147q0 = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.llChangePayment);
        this.f29147q0.setOnClickListener(this);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager2 = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager2.mo7000l(0);
        this.f29137g0 = (RecyclerView) this.f29129a.findViewById(C10232R.C10236id.rvCoupon);
        this.f29137g0.setLayoutManager(wrapContentLinearLayoutManager2);
        this.f29137g0.setItemAnimator(this.f29126X.mo23672x());
        this.f29140j0 = new C10648p(getActivity(), this.f29142l0, new C10669k());
        this.f29137g0.setAdapter(this.f29140j0);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager3 = new WrapContentLinearLayoutManager(getActivity());
        wrapContentLinearLayoutManager3.mo7000l(0);
        this.f29138h0 = (RecyclerView) this.f29129a.findViewById(C10232R.C10236id.rvPaymentType);
        this.f29138h0.setLayoutManager(wrapContentLinearLayoutManager3);
        this.f29138h0.setItemAnimator(this.f29126X.mo23672x());
        this.f29141k0 = new C10696t(getActivity(), this.f29143m0, new C10670l());
        this.f29138h0.setAdapter(this.f29141k0);
        this.f29111B0 = (FrameLayout) this.f29129a.findViewById(C10232R.C10236id.mrlAddComments);
        this.f29111B0.setOnClickListener(this);
        this.f29123U = (TextView) this.f29129a.findViewById(C10232R.C10236id.tvOrderInstructions);
        this.f29122T = (TextView) this.f29129a.findViewById(C10232R.C10236id.txtPaymentMode);
        this.f29119Q = (LinearLayout) this.f29129a.findViewById(C10232R.C10236id.layPaymentMode);
        this.f29120R = (ImageView) this.f29129a.findViewById(C10232R.C10236id.ivSelectedPaymentMode);
        this.f29121S = (ImageView) this.f29129a.findViewById(C10232R.C10236id.ivCamera);
        this.f29131b = (EditText) this.f29129a.findViewById(C10232R.C10236id.edtOrderDesc);
        this.f29131b.setHint(this.f29125W.f16955b.getShop().getOrder_description_text());
        this.f29131b.setOnFocusChangeListener(new C10671m());
        this.f29131b.addTextChangedListener(new C10672n());
        this.f29121S.setOnClickListener(this);
        this.f29131b.setOnEditorActionListener(new C10673o());
        if (this.f29150t0.size() == 0) {
            m49104B();
        }
        if (!this.f29155y0 || !this.f29125W.f16955b.getShop().isShowItemList()) {
            this.f29146p0.setVisibility(8);
            this.f29111B0.setVisibility(8);
            this.f29149s0.setVisibility(0);
        } else {
            this.f29111B0.setVisibility(0);
            this.f29149s0.setVisibility(8);
            this.f29115F0 = C11600b.ItemListOrder;
        }
        m49109G();
        mo38053x();
        if (this.f29126X.mo23496R()) {
            this.f29126X.mo23545a((ImageView) this.f29129a.findViewById(C10232R.C10236id.ivChangeArrow));
        }
    }

    /* renamed from: F */
    private void m49108F() {
        C11598a f = C11598a.m52263f();
        StringBuilder sb = new StringBuilder();
        sb.append(mo38050c(false));
        sb.append(this.f29131b.getText().toString());
        String sb2 = sb.toString();
        boolean z = true;
        boolean z2 = this.f29136f0.size() > 0;
        if (this.f29144n0 == -1) {
            z = false;
        }
        f.mo39823a(sb2, z2, z, C11601c.Cash.mo39844d(), this.f29125W.f16955b.getShop().getVShopId());
    }

    /* renamed from: G */
    private void m49109G() {
        C11598a.m52263f().mo39822a(this.f29115F0.mo39843d(), this.f29125W.f16955b.getShop().isHasDiscount(), this.f29126X.mo23639m(this.f29125W.f16955b.getShop().getDiscountShortLabel()), this.f29125W.f16955b.getShop().getVShopId());
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m49110H() {
    }

    /* renamed from: I */
    private void m49111I() {
        if (this.f29130a0 != null) {
            Dialog dialog = new Dialog(getActivity(), C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_choose_payment_mode);
            dialog.setCancelable(true);
            RecyclerView recyclerView = (RecyclerView) dialog.findViewById(C10232R.C10236id.rvPaymentModes);
            this.f29132b0 = new WrapContentLinearLayoutManager(getActivity());
            this.f29132b0.mo7000l(1);
            recyclerView.setLayoutManager(this.f29132b0);
            recyclerView.setItemAnimator(this.f29126X.mo23672x());
            recyclerView.setNestedScrollingEnabled(false);
            this.f29133c0 = new C11061r(this.f29130a0.getPaymentOptions(), getActivity(), "placeOrderScreen");
            this.f29133c0.mo38822g(((PaymentListBean) this.f29130a0.getPaymentOptions().get(this.f29116N)).getId().intValue());
            recyclerView.setAdapter(this.f29133c0);
            this.f29133c0.mo38819a((C11064c) new C10661d(dialog));
            if (!getActivity().isFinishing()) {
                dialog.show();
            }
        }
    }

    /* renamed from: J */
    private void m49112J() {
        boolean z = false;
        for (int i = 0; i < this.f29150t0.size(); i++) {
            if (((OrderItemBean) this.f29150t0.get(i)).isEmptyItem() && i < this.f29150t0.size() - 1) {
                m49119a(((OrderItemBean) this.f29150t0.get(i)).getTag(), false);
                z = true;
            }
        }
        if (z) {
            new Handler().postDelayed(new C10660c(), 10);
        }
    }

    /* renamed from: K */
    private void m49113K() {
        if (this.f29126X.mo23497S()) {
            C11692d dVar = new C11692d(getActivity(), this.f29130a0.getPaymentOptions(), this.f29116N);
            dVar.mo40193c();
            dVar.mo40190a((C11124o) new C10662e());
        }
    }

    /* renamed from: L */
    private void m49114L() {
        if (this.f29150t0.size() == 1) {
            ((OrderItemBean) this.f29150t0.get(0)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_center);
            ((OrderItemBean) this.f29150t0.get(0)).showBottomPadding(true);
        } else if (this.f29150t0.size() == 2) {
            ((OrderItemBean) this.f29150t0.get(0)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_top);
            ((OrderItemBean) this.f29150t0.get(1)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_bottom);
            ((OrderItemBean) this.f29150t0.get(0)).showBottomPadding(false);
            ((OrderItemBean) this.f29150t0.get(1)).showBottomPadding(true);
        } else if (this.f29150t0.size() > 2) {
            ((OrderItemBean) this.f29150t0.get(0)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_top);
            ArrayList<OrderItemBean> arrayList = this.f29150t0;
            ((OrderItemBean) arrayList.get(arrayList.size() - 1)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_bottom);
            ((OrderItemBean) this.f29150t0.get(0)).showBottomPadding(false);
            ArrayList<OrderItemBean> arrayList2 = this.f29150t0;
            ((OrderItemBean) arrayList2.get(arrayList2.size() - 1)).showBottomPadding(true);
            for (int i = 1; i < this.f29150t0.size() - 1; i++) {
                ((OrderItemBean) this.f29150t0.get(i)).showBottomPadding(false);
                ((OrderItemBean) this.f29150t0.get(i)).getMainLayout().setBackgroundResource(C10232R.C10235drawable.bg_round_corner_edit_text_gray_square);
            }
        }
    }

    /* renamed from: M */
    private void m49115M() {
        for (int i = 0; i < this.f29150t0.size(); i++) {
            if (((OrderItemBean) this.f29150t0.get(i)).getDescription().equals("")) {
                ((OrderItemBean) this.f29150t0.get(i)).getEtQty().setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.search_text_gray_lite));
            } else {
                ((OrderItemBean) this.f29150t0.get(i)).getEtQty().setTextColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.shops_title_text_gray));
            }
        }
    }

    /* renamed from: z */
    private void m49147z() {
        CheckDiscountBean checkDiscountBean = this.f29130a0;
        if (checkDiscountBean != null && checkDiscountBean.getPaymentOptions() != null) {
            if (this.f29130a0.getPaymentOptions().size() == 0) {
                this.f29119Q.setVisibility(8);
            } else if (this.f29130a0.getPaymentOptions().size() == 1) {
                this.f29116N = ((PaymentListBean) this.f29130a0.getPaymentOptions().get(0)).getId().intValue();
                this.f29117O = (PaymentListBean) this.f29130a0.getPaymentOptions().get(0);
                this.f29119Q.setEnabled(false);
                m49127c(0);
                this.f29119Q.setVisibility(0);
                mo38053x();
            } else if (this.f29130a0.getPaymentOptions().size() > 0) {
                this.f29119Q.setVisibility(0);
                this.f29116N = ((PaymentListBean) this.f29130a0.getPaymentOptions().get(0)).getId().intValue();
                this.f29117O = (PaymentListBean) this.f29130a0.getPaymentOptions().get(0);
                m49127c(0);
                mo38053x();
            }
            this.f29143m0.clear();
            this.f29143m0.addAll(this.f29130a0.getPaymentOptions());
            this.f29141k0.mo38102g(m49105C());
            this.f29141k0.mo7341e();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "image_path";
        super.onActivityResult(i, i2, intent);
        if (i == 777 && i2 == -1) {
            try {
                if (intent.getExtras().getString(str) != null) {
                    this.f29126X.mo23481I(intent.getExtras().getString(str));
                    this.f29126X.mo23579b(new File(this.f29126X.mo23488M()));
                    this.f29126X.mo23605d(this.f29126X.mo23511a(this.f29126X.mo23486L()));
                    if (this.f29126X.mo23484K().getWidth() != 0) {
                        if (this.f29126X.mo23484K().getHeight() != 0) {
                            if (this.f29126X.mo23484K().getWidth() > 720) {
                                this.f29126X.mo23589c(720);
                            } else {
                                this.f29126X.mo23589c(this.f29126X.mo23484K().getWidth());
                            }
                            m49137h(this.f29126X.mo23488M());
                        }
                    }
                    this.f29126X.mo23491N(getString(C10232R.string.error_upload_image));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (i == 1004 && i2 == -1) {
            ((CreateOrderActivity) getActivity()).mo37971a(true, true, AppEventsConstants.EVENT_PARAM_VALUE_NO, 0, true, false);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case C10232R.C10236id.bgDone /*2131361930*/:
                ((CreateOrderActivity) getActivity()).mo37966D();
                m49108F();
                return;
            case C10232R.C10236id.ivCamera /*2131362739*/:
                mo38054y();
                return;
            case C10232R.C10236id.llAddCoupon /*2131362956*/:
                if (this.f29126X.mo23497S()) {
                    startActivityForResult(new Intent(getActivity(), AddNewCouponActivity.class), 1004);
                    return;
                }
                return;
            case C10232R.C10236id.llChangePayment /*2131362985*/:
                m49113K();
                return;
            case C10232R.C10236id.mrlAddComments /*2131363247*/:
                this.f29149s0.setPadding(0, (int) getResources().getDimension(C10232R.dimen.dp_4), 0, 0);
                this.f29131b.setHint(getResources().getString(C10232R.string.lbl_add_comments));
                this.f29123U.setVisibility(8);
                this.f29149s0.setVisibility(0);
                this.f29111B0.setVisibility(8);
                this.f29131b.requestFocus();
                return;
            default:
                return;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f29129a = layoutInflater.inflate(C10232R.layout.fragment_create_order_1, viewGroup, false);
        return this.f29129a;
    }

    public void onDetach() {
        super.onDetach();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C11669t tVar = this.f29127Y;
        if (tVar != null) {
            tVar.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    public void onResume() {
        C5880q.m25751b("onResume ShopInfoPackageFragment");
        super.onResume();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m49107E();
    }

    /* renamed from: w */
    public String mo38052w() {
        String str = "";
        String str2 = str;
        int i = 0;
        while (i < this.f29150t0.size()) {
            try {
                if (((OrderItemBean) this.f29150t0.get(i)).getDescription().equals(str) || (!((OrderItemBean) this.f29150t0.get(i)).getQty().equals(str) && !((OrderItemBean) this.f29150t0.get(i)).getQty().equals(AppEventsConstants.EVENT_PARAM_VALUE_NO))) {
                    if (!((OrderItemBean) this.f29150t0.get(i)).getDescription().equals(str) && !((OrderItemBean) this.f29150t0.get(i)).getQty().equals(str)) {
                        str2 = "selectedItem";
                    }
                    i++;
                } else {
                    this.f29156z0 = false;
                    return str;
                }
            } catch (Exception unused) {
            }
        }
        this.f29156z0 = false;
        return str2;
    }

    /* renamed from: x */
    public void mo38053x() {
        String str = "";
        try {
            boolean z = this.f29125W.f16955b.getShouldCheckIfHasValidCard() && this.f29117O.isCash();
            if (!(this.f29131b.getText().toString().trim().equals(str) && mo38052w().equals(str))) {
                if (!z) {
                    this.f29114E0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.sky_blue_color));
                    this.f29114E0.setEnabled(true);
                    this.f29113D0.setEnabled(true);
                    return;
                }
            }
            this.f29114E0.setBackgroundColor(C0841b.m4915a((Context) getActivity(), (int) C10232R.C10234color.gray_3));
            this.f29114E0.setEnabled(false);
            this.f29113D0.setEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: y */
    public void mo38054y() {
        Dialog dialog = new Dialog(getActivity());
        dialog.requestWindowFeature(1);
        dialog.setContentView(C10232R.layout.dialog_attach_photo);
        dialog.setCancelable(true);
        C5887x xVar = this.f29126X;
        if (xVar != null) {
            xVar.mo23535a(dialog);
        }
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.tvPhotos);
        ((TextView) dialog.findViewById(C10232R.C10236id.tvCamera)).setOnClickListener(new C10663f(dialog));
        textView.setOnClickListener(new C10664g(dialog));
        if (isAdded() && !dialog.isShowing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        if (((com.mrsool.newBean.OrderItemBean) r0.get(r0.size() - 1)).getEtDescription().hasFocus() != false) goto L_0x0022;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m49130d(boolean r3) {
        /*
            r2 = this;
            java.util.ArrayList<com.mrsool.newBean.OrderItemBean> r0 = r2.f29150t0
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0022
            if (r3 != 0) goto L_0x0022
            java.util.ArrayList<com.mrsool.newBean.OrderItemBean> r0 = r2.f29150t0
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            com.mrsool.newBean.OrderItemBean r0 = (com.mrsool.newBean.OrderItemBean) r0
            android.widget.EditText r0 = r0.getEtDescription()
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x005c
        L_0x0022:
            java.util.ArrayList<com.mrsool.newBean.OrderItemBean> r0 = r2.f29150t0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x005c
            java.util.ArrayList<com.mrsool.newBean.OrderItemBean> r0 = r2.f29150t0
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            com.mrsool.newBean.OrderItemBean r0 = (com.mrsool.newBean.OrderItemBean) r0
            boolean r0 = r0.isEmptyItem()
            if (r0 != 0) goto L_0x005c
            java.util.ArrayList<com.mrsool.newBean.OrderItemBean> r0 = r2.f29150t0
            int r0 = r0.size()
            int r1 = com.mrsool.utils.C11644i.f33232X6
            if (r0 >= r1) goto L_0x005c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "needToAddNewItem() fromDelete = "
            r0.append(r1)
            r0.append(r3)
            r0.toString()
            r2.m49104B()
            goto L_0x0071
        L_0x005c:
            if (r3 == 0) goto L_0x0071
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateItemBg() fromDelete = "
            r0.append(r1)
            r0.append(r3)
            r0.toString()
            r2.m49114L()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mrsool.createorder.C10657r.m49130d(boolean):void");
    }

    /* renamed from: e */
    private int m49131e(int i) {
        for (int i2 = 0; i2 < this.f29150t0.size(); i2++) {
            if (i == ((OrderItemBean) this.f29150t0.get(i2)).getTag()) {
                return i2;
            }
        }
        return 0;
    }

    /* renamed from: g */
    private String m49134g(String str) {
        if (str.length() <= 1) {
            return "   ";
        }
        return str.length() <= 2 ? C3868i.f12248b : "  ";
    }

    /* renamed from: h */
    private void m49137h(String str) {
        if (this.f29128Z == 1) {
            C11642g gVar = new C11642g(getActivity(), new C10666i(str), "", true);
            gVar.mo39990a(this.f29126X.mo23488M());
            gVar.execute(new String[0]);
            return;
        }
        m49103A();
    }

    /* renamed from: c */
    public String mo38050c(boolean z) {
        String str = "";
        String str2 = str;
        int i = 0;
        while (i < this.f29150t0.size()) {
            try {
                if (!((OrderItemBean) this.f29150t0.get(i)).getDescription().equals(str) && !((OrderItemBean) this.f29150t0.get(i)).getQty().equals(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(((OrderItemBean) this.f29150t0.get(i)).getQty());
                    sb.append(m49134g(((OrderItemBean) this.f29150t0.get(i)).getQty()));
                    sb.append(((OrderItemBean) this.f29150t0.get(i)).getDescription());
                    sb.append("\n");
                    str2 = sb.toString();
                    if (z && !str2.equals(str)) {
                        this.f29156z0 = false;
                        return "selectedItem";
                    }
                }
                i++;
            } catch (Exception unused) {
            }
        }
        if (!str2.equals(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("\n----------\n");
            str2 = sb2.toString();
        }
        this.f29156z0 = false;
        return str2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49119a(int i, boolean z) {
        if (this.f29150t0.size() > 0) {
            int e = m49131e(i);
            ((OrderItemBean) this.f29150t0.get(e)).getView().setVisibility(8);
            ((OrderItemBean) this.f29150t0.get(e)).getEtQty().clearFocus();
            ((OrderItemBean) this.f29150t0.get(e)).getEtDescription().clearFocus();
            this.f29148r0.removeViewInLayout(((OrderItemBean) this.f29150t0.get(e)).getView());
            this.f29150t0.remove(e);
            if (this.f29150t0.size() > 0) {
                ArrayList<OrderItemBean> arrayList = this.f29150t0;
                ((OrderItemBean) arrayList.get(arrayList.size() - 1)).getEtDescription().requestFocus();
            }
            if (z) {
                new Handler().postDelayed(new C10659b(), 10);
            }
            mo38053x();
            return;
        }
        this.f29148r0.removeAllViews();
        m49104B();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m49127c(int i) {
        C2232l.m11636a(getActivity()).mo9515a(((PaymentListBean) this.f29130a0.getPaymentOptions().get(i)).getPaymentIconUrl()).m11498d(87, 50).mo9424a(this.f29120R);
        this.f29122T.setText(((PaymentListBean) this.f29130a0.getPaymentOptions().get(i)).getName());
    }

    /* renamed from: a */
    public void mo38049a(Response<CheckDiscountBean> response) {
        this.f29130a0 = (CheckDiscountBean) response.body();
        this.f29142l0.clear();
        for (int i = 0; i < ((CheckDiscountBean) response.body()).getDiscountOptions().size(); i++) {
            if (!((DiscountOptionBean) ((CheckDiscountBean) response.body()).getDiscountOptions().get(i)).getDiscountType().equals(C2108a.f8151T4)) {
                this.f29142l0.add(((CheckDiscountBean) response.body()).getDiscountOptions().get(i));
                if (((DiscountOptionBean) ((CheckDiscountBean) response.body()).getDiscountOptions().get(i)).isDefualtValue()) {
                    this.f29118P = Integer.parseInt(((DiscountOptionBean) this.f29142l0.get(i)).getDiscountType());
                    this.f29144n0 = this.f29142l0.size() - 1;
                }
            }
        }
        this.f29153w0.setVisibility((this.f29142l0.size() <= 0 || this.f29144n0 != -1) ? 8 : 0);
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        if (this.f29142l0.size() == 0) {
            layoutParams.gravity = C0984g.f4395c;
        } else {
            layoutParams.gravity = C0984g.f4394b;
        }
        this.f29137g0.setLayoutParams(layoutParams);
        this.f29140j0.mo7341e();
        m49147z();
        String a = this.f29126X.mo23528a(response.body());
        if (!TextUtils.isEmpty(a)) {
            this.f29126X.mo23551a(new ServiceManualDataBean("", a));
        }
        if (((CheckDiscountBean) response.body()).isShopDiscount()) {
            this.f29137g0.setVisibility(8);
        } else {
            this.f29137g0.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49118a(int i) {
        this.f29127Y.mo40036a(C11644i.f33330j, (C11673d) new C10665h(i));
    }

    /* renamed from: a */
    private void m49120a(ImageView imageView) {
        if (imageView.getVisibility() != 8) {
            C11618a.m52340a((Context) getActivity(), new C11620b(101).mo39885a((View) imageView, C11623e.BOTTOM).mo39888a(new C11622d().mo39906a(true, false).mo39908b(true, true), (long) C2876e.f10137n).mo39889a((CharSequence) getString(C10232R.string.lbl_mark_as_favorite)).mo39891b(500).mo39898c(true).mo39900d(false).mo39878a()).mo39913b();
            this.f29126X.mo23468C().mo23448a(C11644i.f33286e0, Boolean.valueOf(true));
        }
    }
}
