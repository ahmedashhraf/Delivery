package com.mrsool.coupon;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.bean.CouponDetailBean;
import com.mrsool.bean.DefaultBean;
import com.mrsool.bean.MyCouponsMainBean;
import com.mrsool.bean.UseCouponBean;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyCouponsActivity extends C0295d implements OnClickListener {

    /* renamed from: N */
    private ImageView f28719N;

    /* renamed from: O */
    private RecyclerView f28720O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public ProgressBar f28721P;

    /* renamed from: Q */
    private TextView f28722Q;

    /* renamed from: R */
    private TextView f28723R;

    /* renamed from: S */
    C10568a f28724S;

    /* renamed from: T */
    private String f28725T;

    /* renamed from: U */
    private Bundle f28726U;

    /* renamed from: V */
    WrapContentLinearLayoutManager f28727V;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5887x f28728a;

    /* renamed from: b */
    private LinearLayout f28729b;

    /* renamed from: com.mrsool.coupon.MyCouponsActivity$a */
    class C10563a implements Callback<MyCouponsMainBean> {
        C10563a() {
        }

        public void onFailure(Call<MyCouponsMainBean> call, Throwable th) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28721P.setVisibility(8);
                MyCouponsActivity.this.f28728a.mo23653q0();
            }
        }

        public void onResponse(Call<MyCouponsMainBean> call, Response<MyCouponsMainBean> response) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28721P.setVisibility(8);
                if (!response.isSuccessful()) {
                    MyCouponsActivity.this.f28728a.mo23615f(response.message(), MyCouponsActivity.this.getString(C10232R.string.app_name));
                } else if (((MyCouponsMainBean) response.body()).getCode() <= 300) {
                    MyCouponsActivity.this.m48765a((MyCouponsMainBean) response.body());
                } else {
                    MyCouponsActivity.this.f28728a.mo23615f(((MyCouponsMainBean) response.body()).getMessage(), MyCouponsActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.coupon.MyCouponsActivity$b */
    class C10564b implements Callback<UseCouponBean> {
        C10564b() {
        }

        public void onFailure(Call<UseCouponBean> call, Throwable th) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28728a.mo23489M(MyCouponsActivity.this.getResources().getString(C10232R.string.msg_error_server_issue));
                MyCouponsActivity.this.m48761H();
                MyCouponsActivity.this.m48757C();
            }
        }

        public void onResponse(Call<UseCouponBean> call, Response<UseCouponBean> response) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28728a.mo23492O();
                if (!response.isSuccessful()) {
                    MyCouponsActivity.this.f28728a.mo23489M(response.message());
                    MyCouponsActivity.this.m48761H();
                    MyCouponsActivity.this.m48757C();
                } else if (((UseCouponBean) response.body()).getCode().intValue() > 300) {
                    MyCouponsActivity.this.f28728a.mo23489M(((UseCouponBean) response.body()).getMessage());
                    MyCouponsActivity.this.m48761H();
                    MyCouponsActivity.this.m48757C();
                } else if (((UseCouponBean) response.body()).getAsk_replace() == null || ((UseCouponBean) response.body()).getAsk_replace().intValue() != 1) {
                    C5887x a = MyCouponsActivity.this.f28728a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(((UseCouponBean) response.body()).getMessage());
                    a.mo23489M(sb.toString());
                    MyCouponsActivity.this.m48761H();
                    MyCouponsActivity.this.m48757C();
                } else {
                    MyCouponsActivity.this.m48773e(((UseCouponBean) response.body()).getMessage());
                }
            }
        }
    }

    /* renamed from: com.mrsool.coupon.MyCouponsActivity$c */
    class C10565c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28732a;

        C10565c(Dialog dialog) {
            this.f28732a = dialog;
        }

        public void onClick(View view) {
            this.f28732a.dismiss();
            if (MyCouponsActivity.this.f28728a != null && MyCouponsActivity.this.f28728a.mo23502X()) {
                MyCouponsActivity.this.m48758D();
            }
        }
    }

    /* renamed from: com.mrsool.coupon.MyCouponsActivity$d */
    class C10566d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f28734a;

        C10566d(Dialog dialog) {
            this.f28734a = dialog;
        }

        public void onClick(View view) {
            this.f28734a.dismiss();
            MyCouponsActivity.this.m48761H();
        }
    }

    /* renamed from: com.mrsool.coupon.MyCouponsActivity$e */
    class C10567e implements Callback<DefaultBean> {
        C10567e() {
        }

        public void onFailure(Call<DefaultBean> call, Throwable th) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28728a.mo23489M(MyCouponsActivity.this.getResources().getString(C10232R.string.msg_error_server_issue));
            }
        }

        public void onResponse(Call<DefaultBean> call, Response<DefaultBean> response) {
            if (MyCouponsActivity.this.f28728a != null) {
                MyCouponsActivity.this.f28728a.mo23492O();
                if (!response.isSuccessful()) {
                    MyCouponsActivity.this.f28728a.mo23489M(response.message());
                    MyCouponsActivity.this.m48757C();
                } else if (((DefaultBean) response.body()).getCode().intValue() <= 300) {
                    C5887x a = MyCouponsActivity.this.f28728a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(((DefaultBean) response.body()).getMessage());
                    a.mo23489M(sb.toString());
                    MyCouponsActivity.this.m48757C();
                } else {
                    MyCouponsActivity.this.f28728a.mo23489M(((DefaultBean) response.body()).getMessage());
                    MyCouponsActivity.this.m48757C();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m48757C() {
        C5887x xVar = this.f28728a;
        if (xVar != null && xVar.mo23502X()) {
            this.f28721P.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f28728a.mo23476G());
            hashMap.put("auth_token", this.f28728a.mo23468C().mo23459f(C11644i.f33443w5));
            C11687c.m52645a(this.f28728a).getCouponList(this.f28728a.mo23476G(), hashMap).enqueue(new C10563a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m48758D() {
        C5887x xVar = this.f28728a;
        if (xVar != null) {
            xVar.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f28728a.mo23476G());
            hashMap.put("auth_token", this.f28728a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11644i.f33049B);
            hashMap.put(C11687c.f33725S2, sb.toString());
            C11687c.m52645a(this.f28728a).ReplaceCoupon(this.f28728a.mo23476G(), hashMap).enqueue(new C10567e());
            m48761H();
        }
    }

    /* renamed from: E */
    private void m48759E() {
        C5887x xVar = this.f28728a;
        if (xVar != null && xVar.mo23502X()) {
            this.f28728a.mo23619g(getResources().getString(C10232R.string.lbl_dg_loader_loading), getResources().getString(C10232R.string.app_name));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f28728a.mo23476G());
            hashMap.put("auth_token", this.f28728a.mo23468C().mo23459f(C11644i.f33443w5));
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(C11644i.f33049B);
            hashMap.put(C11687c.f33725S2, sb.toString());
            C11687c.m52645a(this.f28728a).AddCoupon(this.f28728a.mo23476G(), hashMap).enqueue(new C10564b());
        }
    }

    /* renamed from: G */
    private void m48760G() {
        this.f28728a = new C5887x(this);
        this.f28726U = getIntent().getExtras();
        this.f28729b = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        this.f28722Q = (TextView) findViewById(C10232R.C10236id.txtNDF);
        ((TextView) findViewById(C10232R.C10236id.txtTitle)).setText(getResources().getString(C10232R.string.lbl_coupons));
        this.f28719N = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f28719N.setOnClickListener(this);
        this.f28723R = (TextView) findViewById(C10232R.C10236id.btnAddCoupon);
        this.f28723R.setOnClickListener(this);
        m48763J();
        this.f28720O = (RecyclerView) findViewById(C10232R.C10236id.rvMyCoupons);
        this.f28721P = (ProgressBar) findViewById(C10232R.C10236id.pgCoupons);
        m48762I();
        Bundle bundle = this.f28726U;
        if (bundle != null && bundle.containsKey(C11644i.f33067D1)) {
            this.f28725T = this.f28726U.getString(C11644i.f33067D1);
            if (this.f28725T.equalsIgnoreCase(C11644i.f33384p2)) {
                m48759E();
            }
        }
        m48757C();
        if (this.f28728a.mo23496R()) {
            this.f28719N.setScaleX(-1.0f);
        }
        C11644i.f33057C = "";
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void m48761H() {
        C11644i.f33453y = false;
        C11644i.f33049B = "";
    }

    /* renamed from: I */
    private void m48762I() {
        this.f28727V = new WrapContentLinearLayoutManager(this);
        this.f28727V.mo7000l(1);
        this.f28720O.setLayoutManager(this.f28727V);
        this.f28720O.setItemAnimator(this.f28728a.mo23672x());
        this.f28720O.setNestedScrollingEnabled(false);
    }

    /* renamed from: J */
    private void m48763J() {
        try {
            this.f28723R.setVisibility(C11644i.f33072D6.getUser().getCoupon_count().intValue() > 0 ? 0 : 8);
        } catch (Exception unused) {
        }
    }

    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1004) {
            m48757C();
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C10232R.C10236id.btnAddCoupon) {
            startActivityForResult(new Intent(this, AddNewCouponActivity.class), 1004);
        } else if (id == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_my_coupons);
        m48760G();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: c */
    private void m48770c(boolean z) {
        if (z) {
            this.f28720O.setVisibility(0);
            this.f28729b.setVisibility(8);
            return;
        }
        this.f28720O.setVisibility(8);
        this.f28729b.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m48773e(String str) {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_pos_neg);
        dialog.setCancelable(true);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(C10232R.string.app_name);
        textView.setText(str);
        textView2.setText(C10232R.string.lbl_yes);
        textView3.setText(C10232R.string.lbl_no_revised);
        textView2.setAllCaps(true);
        textView3.setAllCaps(true);
        textView2.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView2.setOnClickListener(new C10565c(dialog));
        textView3.setOnClickListener(new C10566d(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m48765a(MyCouponsMainBean myCouponsMainBean) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            z = true;
            if (i >= myCouponsMainBean.getAvailable_coupon().size()) {
                break;
            }
            ((CouponDetailBean) myCouponsMainBean.getAvailable_coupon().get(i)).setNotUsed(true);
            arrayList.add(myCouponsMainBean.getAvailable_coupon().get(i));
            i++;
        }
        this.f28724S = new C10568a(arrayList, this);
        this.f28720O.setAdapter(this.f28724S);
        if (arrayList.size() <= 0) {
            z = false;
        }
        m48770c(z);
        if (arrayList.size() == 0) {
            this.f28723R.setVisibility(8);
            this.f28722Q.setText(TextUtils.isEmpty(myCouponsMainBean.getMessage()) ? getString(C10232R.string.hint_no_data_found) : myCouponsMainBean.getMessage());
            return;
        }
        this.f28723R.setVisibility(0);
    }
}
