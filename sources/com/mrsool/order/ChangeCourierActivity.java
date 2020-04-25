package com.mrsool.order;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.AppEventsConstants;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.C10831j;
import com.mrsool.bean.CancelReasonBean;
import com.mrsool.bean.CancelReasonMainBean;
import com.mrsool.bean.ChangeCourierBean;
import com.mrsool.bean.ChangeCourierMainBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.ServiceManualDataBean;
import com.mrsool.bean.ServiceManualDefaultBean;
import com.mrsool.order.C10983d.C10988e;
import com.mrsool.utils.AppSingleton;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.p421c.C11598a;
import com.mrsool.utils.p421c.C11598a.C11601c;
import com.mrsool.utils.p421c.C11617f;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p212io.branch.referral.C6009d;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ChangeCourierActivity extends C10787d implements OnClickListener, C11056p {
    /* access modifiers changed from: private */

    /* renamed from: S */
    public C5887x f30241S;

    /* renamed from: T */
    private AppSingleton f30242T;

    /* renamed from: U */
    private Toolbar f30243U;

    /* renamed from: V */
    private TextView f30244V;

    /* renamed from: W */
    private LinearLayout f30245W;

    /* renamed from: X */
    private LinearLayout f30246X;

    /* renamed from: Y */
    private ImageView f30247Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public ProgressBar f30248Z;

    /* renamed from: a0 */
    private RecyclerView f30249a0;

    /* renamed from: b0 */
    private WrapContentLinearLayoutManager f30250b0;

    /* renamed from: c0 */
    private Spinner f30251c0;

    /* renamed from: d0 */
    private C10983d f30252d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public List<ChangeCourierBean> f30253e0 = new ArrayList();

    /* renamed from: f0 */
    private C10831j f30254f0;

    /* renamed from: g0 */
    public List<CancelReasonBean> f30255g0 = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public String f30256h0;

    /* renamed from: i0 */
    private String f30257i0;

    /* renamed from: j0 */
    private String f30258j0;

    /* renamed from: k0 */
    private String f30259k0;

    /* renamed from: l0 */
    private String f30260l0;

    /* renamed from: m0 */
    private String f30261m0;

    /* renamed from: n0 */
    private String f30262n0;

    /* renamed from: o0 */
    private double f30263o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public boolean f30264p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f30265q0 = -1;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public C11617f f30266r0;

    /* renamed from: s0 */
    private final String f30267s0 = "acceptOffer";

    /* renamed from: t0 */
    private ImageView f30268t0;

    /* renamed from: u0 */
    private TextView f30269u0;

    /* renamed from: v0 */
    private Bundle f30270v0;

    /* renamed from: com.mrsool.order.ChangeCourierActivity$a */
    class C10969a implements Callback<ChangeCourierMainBean> {
        C10969a() {
        }

        public void onFailure(Call<ChangeCourierMainBean> call, Throwable th) {
            try {
                if (ChangeCourierActivity.this.f30241S != null) {
                    ChangeCourierActivity.this.f30248Z.setVisibility(8);
                    ChangeCourierActivity.this.f30241S.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<ChangeCourierMainBean> call, Response<ChangeCourierMainBean> response) {
            if (ChangeCourierActivity.this.f30241S != null) {
                ChangeCourierActivity.this.f30248Z.setVisibility(8);
                if (!response.isSuccessful()) {
                    ChangeCourierActivity.this.f30241S.mo23615f(response.message(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                } else if (((ChangeCourierMainBean) response.body()).getCode().intValue() <= 300) {
                    ChangeCourierActivity.this.f30253e0 = ((ChangeCourierMainBean) response.body()).getOffers();
                    ChangeCourierActivity changeCourierActivity = ChangeCourierActivity.this;
                    changeCourierActivity.m50036c(changeCourierActivity.f30253e0.size() > 0);
                    ChangeCourierActivity.this.m50024P();
                    String a = ChangeCourierActivity.this.f30241S.mo23528a(response.body());
                    if (!TextUtils.isEmpty(a)) {
                        ChangeCourierActivity.this.f30241S.mo23551a(new ServiceManualDataBean("", a));
                    }
                } else {
                    ChangeCourierActivity.this.f30241S.mo23615f(((ChangeCourierMainBean) response.body()).getMessage(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.ChangeCourierActivity$b */
    class C10970b implements C10988e {
        C10970b() {
        }

        /* renamed from: a */
        public void mo38736a(int i) {
            if (ChangeCourierActivity.this.f30241S.mo23502X()) {
                ChangeCourierActivity.this.f30265q0 = i;
                if (ChangeCourierActivity.this.f30264p0) {
                    ChangeCourierActivity.this.m50044j(1);
                } else {
                    ChangeCourierActivity.this.m50045k(i);
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.ChangeCourierActivity$c */
    class C10971c implements Callback<ServiceManualDefaultBean> {

        /* renamed from: a */
        final /* synthetic */ int f30273a;

        C10971c(int i) {
            this.f30273a = i;
        }

        public void onFailure(Call<ServiceManualDefaultBean> call, Throwable th) {
            try {
                if (ChangeCourierActivity.this.f30241S != null) {
                    ChangeCourierActivity.this.f30241S.mo23492O();
                    ChangeCourierActivity.this.f30241S.mo23615f(ChangeCourierActivity.this.getString(C10232R.string.msg_error_server_issue), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<ServiceManualDefaultBean> call, Response<ServiceManualDefaultBean> response) {
            if (ChangeCourierActivity.this.f30241S != null && !ChangeCourierActivity.this.isFinishing()) {
                ChangeCourierActivity.this.f30241S.mo23492O();
                if (response.isSuccessful()) {
                    if (response.body() == null) {
                        ChangeCourierActivity.this.f30241S.mo23485K(ChangeCourierActivity.this.getString(C10232R.string.msg_alert_something_went_wrong));
                    } else if (((ServiceManualDefaultBean) response.body()).getCode() == null || ((ServiceManualDefaultBean) response.body()).getCode().intValue() > 300) {
                        ChangeCourierActivity.this.f30241S.mo23615f(((ServiceManualDefaultBean) response.body()).getMessage(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                    } else {
                        ChangeCourierActivity.this.f30241S.mo23473E(C11644i.f33141M3);
                        ChangeCourierActivity.this.f30241S.mo23473E(C11644i.f33181R3);
                        try {
                            C6009d.m27516c(ChangeCourierActivity.this.getApplicationContext()).mo24810e(ChangeCourierActivity.this.getResources().getString(C10232R.string.branch_event_accept_offer));
                            if (C11644i.f33437w) {
                                ChangeCourierActivity.this.f30266r0.mo39872d(ChangeCourierActivity.this.f30266r0.mo39860a(), String.valueOf(((ChangeCourierBean) ChangeCourierActivity.this.f30253e0.get(this.f30273a)).getOffer_cost()), ChangeCourierActivity.this.f30256h0);
                            }
                            ChangeCourierActivity.this.m50029a((ChangeCourierBean) ChangeCourierActivity.this.f30253e0.get(this.f30273a));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        String a = ChangeCourierActivity.this.f30241S.mo23528a(response.body());
                        String str = "acceptOffer";
                        if (!TextUtils.isEmpty(a)) {
                            ChangeCourierActivity.this.f30241S.mo23551a(new ServiceManualDataBean(str, a));
                            return;
                        }
                        ChangeCourierActivity.this.mo36511f(str);
                    }
                } else if (ChangeCourierActivity.this.f30241S != null) {
                    ChangeCourierActivity.this.f30241S.mo23615f(response.message(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: com.mrsool.order.ChangeCourierActivity$d */
    class C10972d implements OnClickListener {
        C10972d() {
        }

        public void onClick(View view) {
            if (ChangeCourierActivity.this.m50021M()) {
                ChangeCourierActivity changeCourierActivity = ChangeCourierActivity.this;
                changeCourierActivity.m50045k(changeCourierActivity.f30265q0);
            }
        }
    }

    /* renamed from: com.mrsool.order.ChangeCourierActivity$e */
    class C10973e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f30276a;

        C10973e(Dialog dialog) {
            this.f30276a = dialog;
        }

        public void onClick(View view) {
            this.f30276a.dismiss();
        }
    }

    /* renamed from: com.mrsool.order.ChangeCourierActivity$f */
    class C10974f implements Callback<CancelReasonMainBean> {
        C10974f() {
        }

        public void onFailure(Call<CancelReasonMainBean> call, Throwable th) {
            if (ChangeCourierActivity.this.f30241S != null) {
                ChangeCourierActivity.this.f30241S.mo23653q0();
            }
        }

        public void onResponse(Call<CancelReasonMainBean> call, Response<CancelReasonMainBean> response) {
            if (ChangeCourierActivity.this.f30241S != null) {
                ChangeCourierActivity.this.f30241S.mo23492O();
                if (response.isSuccessful()) {
                    if (((CancelReasonMainBean) response.body()).getCode() <= 300) {
                        ChangeCourierActivity.this.f30255g0 = ((CancelReasonMainBean) response.body()).getReasons();
                        ChangeCourierActivity changeCourierActivity = ChangeCourierActivity.this;
                        changeCourierActivity.f30255g0.add(0, new CancelReasonBean(AppEventsConstants.EVENT_PARAM_VALUE_NO, changeCourierActivity.getString(C10232R.string.lbl_select_reason)));
                        ChangeCourierActivity.this.m50022N();
                        String a = ChangeCourierActivity.this.f30241S.mo23528a(response.body());
                        if (!TextUtils.isEmpty(a)) {
                            ChangeCourierActivity.this.f30241S.mo23551a(new ServiceManualDataBean("", a));
                        }
                    } else {
                        ChangeCourierActivity.this.f30241S.mo23615f(((CancelReasonMainBean) response.body()).getMessage(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                    }
                } else if (ChangeCourierActivity.this.f30241S != null) {
                    ChangeCourierActivity.this.f30241S.mo23615f(response.message(), ChangeCourierActivity.this.getString(C10232R.string.app_name));
                }
            }
        }
    }

    /* renamed from: J */
    private void m50018J() {
        this.f30248Z.setVisibility(0);
        HashMap hashMap = new HashMap();
        hashMap.put("iBuyerId", this.f30241S.mo23476G());
        C11687c.m52645a(this.f30241S).getRejectedOffers(this.f30256h0, hashMap).enqueue(new C10969a());
    }

    /* renamed from: K */
    private void m50019K() {
        Bundle bundle = this.f30270v0;
        if (bundle != null) {
            if (bundle.containsKey(C11644i.f33314h1)) {
                this.f30256h0 = this.f30270v0.getString(C11644i.f33314h1);
            }
            if (this.f30270v0.containsKey(C11644i.f33219W1)) {
                this.f30257i0 = this.f30270v0.getString(C11644i.f33219W1);
            }
            if (this.f30270v0.containsKey(C11644i.f33211V1)) {
                this.f30258j0 = this.f30270v0.getString(C11644i.f33211V1);
            }
            if (this.f30270v0.containsKey(C11644i.f33203U1)) {
                this.f30264p0 = this.f30270v0.getBoolean(C11644i.f33203U1);
            }
            if (this.f30270v0.containsKey(C11644i.f33367n1)) {
                this.f30259k0 = this.f30270v0.getString(C11644i.f33367n1);
            }
            if (this.f30270v0.containsKey(C11644i.f33323i1)) {
                this.f30260l0 = this.f30270v0.getString(C11644i.f33323i1);
            }
            if (this.f30270v0.containsKey(C11644i.f33351l2)) {
                this.f30261m0 = this.f30270v0.getString(C11644i.f33351l2);
            }
            if (this.f30270v0.containsKey(C11644i.f33188S2)) {
                this.f30263o0 = this.f30270v0.getDouble(C11644i.f33188S2);
            }
        }
    }

    /* renamed from: L */
    private void m50020L() {
        this.f30241S = new C5887x(this);
        this.f30241S.mo23553a((C11056p) this);
        this.f30242T = (AppSingleton) getApplicationContext();
        this.f30266r0 = new C11617f(this);
        this.f30270v0 = getIntent().getExtras();
        m50019K();
        m50025Q();
        this.f30248Z = (ProgressBar) findViewById(C10232R.C10236id.pgAllOffer);
        this.f30249a0 = (RecyclerView) findViewById(C10232R.C10236id.rvAllOffer);
        this.f30246X = (LinearLayout) findViewById(C10232R.C10236id.layNDF);
        if (this.f30241S.mo23502X()) {
            m50018J();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public boolean m50021M() {
        if (this.f30251c0.getSelectedItemPosition() > 0) {
            return true;
        }
        this.f30241S.mo23615f(getString(C10232R.string.alert_please_select_reason), getString(C10232R.string.app_name));
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m50022N() {
        Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
        dialog.setContentView(C10232R.layout.dialog_change_courier);
        dialog.setCancelable(true);
        TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdTitle);
        TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
        this.f30251c0 = (Spinner) dialog.findViewById(C10232R.C10236id.spWithdrawReason);
        textView.setText(getResources().getString(C10232R.string.lbl_change_courier));
        textView2.setText(C10232R.string.msg_change_courier_dialog);
        TextView textView3 = (TextView) dialog.findViewById(C10232R.C10236id.txtPositive);
        TextView textView4 = (TextView) dialog.findViewById(C10232R.C10236id.txtNegetive);
        textView.setAllCaps(true);
        textView3.setTextColor(getResources().getColor(C10232R.C10234color.colorPrimary));
        textView3.setText(C10232R.string.lbl_dg_title_change);
        textView3.setAllCaps(true);
        textView4.setText(getResources().getString(C10232R.string.lbl_dg_title_cancel));
        textView4.setAllCaps(true);
        this.f30254f0 = new C10831j(this, this.f30255g0);
        this.f30251c0.setAdapter(this.f30254f0);
        m50023O();
        textView3.setOnClickListener(new C10972d());
        textView4.setOnClickListener(new C10973e(dialog));
        if (!isFinishing()) {
            dialog.show();
        }
    }

    /* renamed from: O */
    private void m50023O() {
        for (int i = 0; i < this.f30255g0.size(); i++) {
            if (((CancelReasonBean) this.f30255g0.get(i)).getCode() == ((CancelReasonBean) this.f30255g0.get(this.f30251c0.getSelectedItemPosition())).getCode()) {
                this.f30251c0.setSelection(i);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m50024P() {
        if (this.f30253e0.size() != 0) {
            this.f30250b0 = new WrapContentLinearLayoutManager(this);
            this.f30250b0.mo7000l(1);
            this.f30249a0.setLayoutManager(this.f30250b0);
            this.f30249a0.setItemAnimator(this.f30241S.mo23672x());
            this.f30249a0.setNestedScrollingEnabled(false);
            this.f30252d0 = new C10983d(this.f30253e0, this, this.f30241S, this.f30261m0);
            this.f30249a0.setAdapter(this.f30252d0);
            this.f30252d0.mo38744a((C10988e) new C10970b());
        }
    }

    /* renamed from: Q */
    private void m50025Q() {
        this.f29640Q = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f30269u0 = (TextView) findViewById(C10232R.C10236id.txtOrderId);
        this.f29640Q.setText(this.f30260l0);
        TextView textView = this.f30269u0;
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(this.f30256h0);
        textView.setText(sb.toString());
        this.f30268t0 = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f30268t0.setImageDrawable(C0841b.m4928c(this, C10232R.C10235drawable.back_white));
        this.f30268t0.setOnClickListener(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m50045k(int i) {
        C5887x xVar = this.f30241S;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("current_user_id", this.f30241S.mo23476G());
        hashMap.put("iBuyerId", this.f30241S.mo23476G());
        hashMap.put("auth_token", this.f30241S.mo23468C().mo23459f(C11644i.f33443w5));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(((ChangeCourierBean) this.f30253e0.get(i)).getOffer_id());
        hashMap.put("new_offer_id", sb.toString());
        hashMap.put("vStatus", C11644i.f33385p3);
        C11687c.m52645a(this.f30241S).AccpetRejectOffer(getIntent().getExtras().getString(C11644i.f33314h1), hashMap).enqueue(new C10971c(i));
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C10232R.layout.activity_change_courier);
        m50020L();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        try {
            C11644i.f33226X0 = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m50044j(int i) {
        C5887x xVar = this.f30241S;
        if (xVar != null) {
            xVar.mo23619g(getString(C10232R.string.app_name), getString(C10232R.string.lbl_dg_loader_loading));
            HashMap hashMap = new HashMap();
            hashMap.put("current_user", this.f30241S.mo23476G());
            hashMap.put("auth_token", this.f30241S.mo23468C().mo23459f(C11644i.f33443w5));
            hashMap.put("user_id", this.f30241S.mo23476G());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(this.f30256h0);
            hashMap.put("order_id", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(i);
            hashMap.put("type", sb2.toString());
            C11687c.m52645a(this.f30241S).cancelReason(hashMap).enqueue(new C10974f());
        }
    }

    /* renamed from: f */
    public void mo36511f(String str) {
        if (((str.hashCode() == 613505588 && str.equals("acceptOffer")) ? (char) 0 : 65535) == 0) {
            onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m50036c(boolean z) {
        int i = 0;
        this.f30249a0.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.f30246X;
        if (z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50029a(ChangeCourierBean changeCourierBean) {
        boolean z;
        Iterator it = changeCourierBean.getPaymentOptions().iterator();
        while (true) {
            if (it.hasNext()) {
                if (!((PaymentListBean) it.next()).getCode().equalsIgnoreCase(C11601c.Cash.mo39844d())) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        C11598a.m52263f().mo39826a(this.f30253e0.size() == 0, this.f30253e0.size(), changeCourierBean.getOffer_cost() - this.f30263o0, changeCourierBean.getOffer_cost() - this.f30263o0 == 0.0d, z, changeCourierBean.getOffer_cost(), this.f30256h0);
    }
}
