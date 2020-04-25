package com.mrsool.p409me;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.DefaultBeanWithhalalahError;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.PaymentMethodListMainBean;
import com.mrsool.p409me.C10926i.C10936j;
import com.mrsool.p423v.C11730j;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.PaymentMethodActivity */
public class PaymentMethodActivity extends C10787d implements OnClickListener {

    /* renamed from: S */
    private ImageView f29834S;

    /* renamed from: T */
    private RecyclerView f29835T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ProgressBar f29836U;

    /* renamed from: V */
    private TextView f29837V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<PaymentListBean> f29838W = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C10926i f29839X;

    /* renamed from: Y */
    private WrapContentLinearLayoutManager f29840Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public String f29841Z = "halalahewallet://Transaction?terminal=512345677&amount=0.20&referenceNo=MRSL_15480520&billNo=MRSL_15480520&memo=TestTransaction&callback=mrsool://open";

    /* renamed from: com.mrsool.me.PaymentMethodActivity$a */
    class C10859a implements Callback<PaymentMethodListMainBean> {
        C10859a() {
        }

        public void onFailure(Call<PaymentMethodListMainBean> call, Throwable th) {
            try {
                if (PaymentMethodActivity.this.f29642a != null) {
                    PaymentMethodActivity.this.f29836U.setVisibility(8);
                    PaymentMethodActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<PaymentMethodListMainBean> call, Response<PaymentMethodListMainBean> response) {
            try {
                if (PaymentMethodActivity.this.f29642a != null) {
                    PaymentMethodActivity.this.f29836U.setVisibility(8);
                    if (!response.isSuccessful()) {
                        PaymentMethodActivity.this.f29642a.mo23615f(response.message(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                    } else if (((PaymentMethodListMainBean) response.body()).getCode().intValue() <= 300) {
                        PaymentMethodActivity.this.f29838W = ((PaymentMethodListMainBean) response.body()).getPaymentOptions();
                        PaymentMethodActivity.this.m49711L();
                    } else {
                        PaymentMethodActivity.this.f29642a.mo23615f(((PaymentMethodListMainBean) response.body()).getMessage(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodActivity$b */
    class C10860b implements Callback<DefaultBeanWithhalalahError> {

        /* renamed from: a */
        final /* synthetic */ int f29843a;

        /* renamed from: b */
        final /* synthetic */ boolean f29844b;

        C10860b(int i, boolean z) {
            this.f29843a = i;
            this.f29844b = z;
        }

        public void onFailure(Call<DefaultBeanWithhalalahError> call, Throwable th) {
            try {
                if (PaymentMethodActivity.this.f29642a != null) {
                    PaymentMethodActivity.this.f29642a.mo23492O();
                    PaymentMethodActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<DefaultBeanWithhalalahError> call, Response<DefaultBeanWithhalalahError> response) {
            try {
                if (PaymentMethodActivity.this.f29642a != null) {
                    PaymentMethodActivity.this.f29642a.mo23492O();
                    if (!response.isSuccessful()) {
                        PaymentMethodActivity.this.f29642a.mo23615f(response.message(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                    } else if (((DefaultBeanWithhalalahError) response.body()).getCode().intValue() < 300) {
                        PaymentMethodActivity.this.f29642a.mo23615f(((DefaultBeanWithhalalahError) response.body()).getMessage(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                        ((PaymentListBean) PaymentMethodActivity.this.f29838W.get(this.f29843a)).setActivated(this.f29844b);
                        PaymentMethodActivity.this.f29839X.mo7341e();
                    } else if (((DefaultBeanWithhalalahError) response.body()).isHalalahError()) {
                        PaymentMethodActivity.this.f29642a.mo23615f(((DefaultBeanWithhalalahError) response.body()).getMessage(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                    } else {
                        PaymentMethodActivity.this.f29642a.mo23615f(((DefaultBeanWithhalalahError) response.body()).getMessage(), PaymentMethodActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodActivity$c */
    class C10861c implements C10936j {
        C10861c() {
        }

        /* renamed from: a */
        public void mo38489a(int i) {
            if (!((PaymentListBean) PaymentMethodActivity.this.f29838W.get(i)).getCode().equalsIgnoreCase("bank")) {
                PaymentMethodActivity paymentMethodActivity = PaymentMethodActivity.this;
                paymentMethodActivity.m49714a(((PaymentListBean) paymentMethodActivity.f29838W.get(i)).getId().intValue(), !((PaymentListBean) PaymentMethodActivity.this.f29838W.get(i)).isActivated(), i);
            } else if (PaymentMethodActivity.this.f29642a.mo23502X()) {
                PaymentMethodActivity.this.f29642a.mo23677z(C5887x.m25819y0());
                PaymentMethodActivity.this.onBackPressed();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodActivity$d */
    class C10862d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Dialog f29847a;

        C10862d(Dialog dialog) {
            this.f29847a = dialog;
        }

        public void onClick(View view) {
            this.f29847a.dismiss();
            String str = "sa.halalah.halalah";
            if (!PaymentMethodActivity.this.f29642a.mo23598c(C11644i.f33445x)) {
                PaymentMethodActivity.this.f29642a.mo23469C(str);
                return;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(PaymentMethodActivity.this.f29841Z));
                intent.addFlags(268435456);
                PaymentMethodActivity.this.startActivity(intent);
            } catch (Exception e) {
                PaymentMethodActivity.this.f29642a.mo23469C(str);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: J */
    private void m49709J() {
        if (this.f29642a.mo23502X()) {
            this.f29836U.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).getPayemntMethods(hashMap).enqueue(new C10859a());
        }
    }

    /* renamed from: K */
    private void m49710K() {
        this.f29834S = (ImageView) findViewById(C10232R.C10236id.imgClose);
        this.f29834S.setOnClickListener(this);
        this.f29837V = (TextView) findViewById(C10232R.C10236id.txtTitle);
        this.f29837V.setText(getResources().getString(C10232R.string.lbl_payment_collection));
        if (this.f29642a.mo23496R()) {
            this.f29834S.setScaleX(-1.0f);
        }
        this.f29835T = (RecyclerView) findViewById(C10232R.C10236id.rvPaymentModes);
        this.f29836U = (ProgressBar) findViewById(C10232R.C10236id.pgPaymentMethod);
        m49709J();
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m49711L() {
        if (this.f29838W.size() != 0) {
            this.f29840Y = new WrapContentLinearLayoutManager(this);
            this.f29840Y.mo7000l(1);
            this.f29835T.setLayoutManager(this.f29840Y);
            this.f29835T.setItemAnimator(this.f29642a.mo23672x());
            this.f29835T.setNestedScrollingEnabled(false);
            this.f29839X = new C10926i(this.f29838W, this, "selectPaymentScreen");
            this.f29835T.setAdapter(this.f29839X);
            this.f29839X.mo38552a((C10936j) new C10861c());
        }
    }

    public void onClick(View view) {
        if (view.getId() == C10232R.C10236id.imgClose) {
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
        setContentView((int) C10232R.layout.activity_payment_method);
        m49710K();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C5887x xVar = this.f29642a;
        if (xVar != null) {
            xVar.mo23626i();
        }
    }

    /* renamed from: b */
    public void mo38487b(String str, String str2) {
        try {
            Dialog dialog = new Dialog(this, C10232R.style.AlertCustomerDialogStyle);
            dialog.setContentView(C10232R.layout.dialog_show_ok);
            TextView textView = (TextView) dialog.findViewById(C10232R.C10236id.txtdOk);
            TextView textView2 = (TextView) dialog.findViewById(C10232R.C10236id.txtdMessage);
            ((TextView) dialog.findViewById(C10232R.C10236id.txtdTitle)).setText(str2);
            textView2.setText(str);
            textView.setOnClickListener(new C10862d(dialog));
            if (!isFinishing()) {
                dialog.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49714a(int i, boolean z, int i2) {
        if (this.f29642a.mo23502X()) {
            this.f29642a.mo23665u0();
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put(C11687c.f33676G1, this.f29642a.mo23476G());
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append(str);
            sb.append(i);
            hashMap.put(C11687c.f33696L1, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(z);
            hashMap.put(C11687c.f33700M1, sb2.toString());
            C11687c.m52645a(this.f29642a).callOptinPayment(hashMap).enqueue(new C10860b(i2, z));
        }
    }
}
