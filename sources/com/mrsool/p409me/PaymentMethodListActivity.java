package com.mrsool.p409me;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C5665a;
import com.google.android.material.p296f.C6845b;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.CardListMainBean;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.bean.PaymentMethodListMainBean;
import com.mrsool.p409me.C10897f.C10903f;
import com.mrsool.p409me.C10897f.C10907j;
import com.mrsool.payment.AddCardActivity;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import com.mrsool.utils.webservice.C11687c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* renamed from: com.mrsool.me.PaymentMethodListActivity */
public class PaymentMethodListActivity extends C10787d {

    /* renamed from: S */
    private final int f29849S = 1;

    /* renamed from: T */
    private RecyclerView f29850T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ProgressBar f29851U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public List<PaymentListBean> f29852V = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: W */
    public List<PaymentCardsBean> f29853W = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C10897f f29854X;

    /* renamed from: Y */
    private WrapContentLinearLayoutManager f29855Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public C5665a f29856Z;

    /* renamed from: a0 */
    private PaymentListBean f29857a0;

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$a */
    class C10863a implements Callback<CardListMainBean> {
        C10863a() {
        }

        public void onFailure(Call<CardListMainBean> call, Throwable th) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    PaymentMethodListActivity.this.f29851U.setVisibility(8);
                    PaymentMethodListActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CardListMainBean> call, Response<CardListMainBean> response) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    PaymentMethodListActivity.this.f29851U.setVisibility(8);
                    if (!response.isSuccessful()) {
                        PaymentMethodListActivity.this.f29642a.mo23615f(response.message(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    } else if (((CardListMainBean) response.body()).getCode().intValue() <= 300) {
                        PaymentMethodListActivity.this.f29853W.clear();
                        PaymentMethodListActivity.this.f29853W.addAll(((CardListMainBean) response.body()).getCardsBeans());
                        PaymentMethodListActivity.this.f29853W.add(new PaymentCardsBean());
                        if (PaymentMethodListActivity.this.f29854X != null) {
                            PaymentMethodListActivity.this.f29854X.mo7341e();
                        }
                    } else {
                        PaymentMethodListActivity.this.f29642a.mo23615f(((CardListMainBean) response.body()).getMessage(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$b */
    class C10864b implements Callback<PaymentMethodListMainBean> {
        C10864b() {
        }

        public void onFailure(Call<PaymentMethodListMainBean> call, Throwable th) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    PaymentMethodListActivity.this.f29851U.setVisibility(8);
                    PaymentMethodListActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<PaymentMethodListMainBean> call, Response<PaymentMethodListMainBean> response) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    if (!response.isSuccessful()) {
                        PaymentMethodListActivity.this.f29851U.setVisibility(8);
                        PaymentMethodListActivity.this.f29642a.mo23615f(response.message(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    } else if (((PaymentMethodListMainBean) response.body()).getCode().intValue() <= 300) {
                        PaymentMethodListActivity.this.f29852V = ((PaymentMethodListMainBean) response.body()).getPaymentOptions();
                        PaymentMethodListActivity.this.m49724L();
                        PaymentMethodListActivity.this.m49722J();
                    } else {
                        PaymentMethodListActivity.this.f29851U.setVisibility(8);
                        PaymentMethodListActivity.this.f29642a.mo23615f(((PaymentMethodListMainBean) response.body()).getMessage(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$c */
    class C10865c implements Callback<CardListMainBean> {
        C10865c() {
        }

        public void onFailure(Call<CardListMainBean> call, Throwable th) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    PaymentMethodListActivity.this.f29851U.setVisibility(8);
                    PaymentMethodListActivity.this.f29642a.mo23653q0();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onResponse(Call<CardListMainBean> call, Response<CardListMainBean> response) {
            try {
                if (PaymentMethodListActivity.this.f29642a != null) {
                    PaymentMethodListActivity.this.f29851U.setVisibility(8);
                    if (!response.isSuccessful()) {
                        PaymentMethodListActivity.this.f29642a.mo23615f(response.message(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    } else if (((CardListMainBean) response.body()).getCode().intValue() <= 300) {
                        PaymentMethodListActivity.this.f29853W.clear();
                        PaymentMethodListActivity.this.f29853W.addAll(((CardListMainBean) response.body()).getCardsBeans());
                        PaymentMethodListActivity.this.f29853W.add(new PaymentCardsBean());
                        if (PaymentMethodListActivity.this.f29854X != null) {
                            PaymentMethodListActivity.this.f29854X.mo7341e();
                        }
                    } else {
                        PaymentMethodListActivity.this.f29642a.mo23615f(((CardListMainBean) response.body()).getMessage(), PaymentMethodListActivity.this.getString(C10232R.string.app_name));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$d */
    class C10866d implements C10907j {
        C10866d() {
        }

        /* renamed from: a */
        public void mo38492a(int i) {
            if (PaymentMethodListActivity.this.f29854X.mo7333c(i) != 2) {
                PaymentMethodListActivity.this.m49726N();
            }
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$e */
    class C10867e implements C10903f {
        C10867e() {
        }

        /* renamed from: a */
        public void mo38493a(int i) {
            PaymentMethodListActivity.this.mo38491j(i);
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$f */
    class C10868f implements OnClickListener {
        C10868f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$g */
    class C10869g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29864a;

        C10869g(int i) {
            this.f29864a = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PaymentMethodListActivity paymentMethodListActivity = PaymentMethodListActivity.this;
            paymentMethodListActivity.m49732a("mark_delete", (PaymentCardsBean) paymentMethodListActivity.f29853W.get(this.f29864a));
            dialogInterface.cancel();
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$h */
    class C10870h implements View.OnClickListener {
        C10870h() {
        }

        public void onClick(View view) {
            PaymentMethodListActivity.this.f29856Z.hide();
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$i */
    class C10871i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29867a;

        C10871i(int i) {
            this.f29867a = i;
        }

        public void onClick(View view) {
            PaymentMethodListActivity.this.f29856Z.hide();
            PaymentMethodListActivity paymentMethodListActivity = PaymentMethodListActivity.this;
            paymentMethodListActivity.m49732a("mark_default", (PaymentCardsBean) paymentMethodListActivity.f29853W.get(this.f29867a));
            PaymentMethodListActivity.this.f29854X.mo7341e();
        }
    }

    /* renamed from: com.mrsool.me.PaymentMethodListActivity$j */
    class C10872j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f29869a;

        C10872j(int i) {
            this.f29869a = i;
        }

        public void onClick(View view) {
            PaymentMethodListActivity.this.f29856Z.hide();
            PaymentMethodListActivity.this.m49739k(this.f29869a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public void m49722J() {
        if (this.f29642a.mo23502X()) {
            this.f29851U.setVisibility(0);
            new HashMap().put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).getCardList(this.f29642a.mo23476G()).enqueue(new C10865c());
        }
    }

    /* renamed from: K */
    private void m49723K() {
        if (this.f29642a.mo23502X()) {
            this.f29851U.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            C11687c.m52645a(this.f29642a).getPayemntMethods(hashMap).enqueue(new C10864b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public void m49724L() {
        List<PaymentListBean> list = this.f29852V;
        if (list != null && list.size() != 0) {
            for (PaymentListBean paymentListBean : this.f29852V) {
                if (paymentListBean.getCode() != null && paymentListBean.getCode().equalsIgnoreCase("cash")) {
                    C10897f fVar = this.f29854X;
                    if (fVar != null) {
                        fVar.mo38527a(paymentListBean);
                        this.f29854X.mo7341e();
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    private void m49725M() {
        this.f29855Y = new WrapContentLinearLayoutManager(this);
        this.f29855Y.mo7000l(1);
        this.f29850T.setLayoutManager(this.f29855Y);
        this.f29850T.setItemAnimator(this.f29642a.mo23672x());
        this.f29850T.setNestedScrollingEnabled(false);
        this.f29854X = new C10897f(this.f29853W, this);
        this.f29850T.setAdapter(this.f29854X);
        this.f29854X.mo38529a((C10907j) new C10866d());
        this.f29854X.mo38528a((C10903f) new C10867e());
        m49723K();
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m49726N() {
        startActivityForResult(new Intent(this, AddCardActivity.class), 1);
    }

    private void initViews() {
        mo38413g(getResources().getString(C10232R.string.payment_method));
        this.f29850T = (RecyclerView) findViewById(C10232R.C10236id.rvPaymentModes);
        this.f29851U = (ProgressBar) findViewById(C10232R.C10236id.pgPaymentMethod);
        m49725M();
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m49739k(int i) {
        C6845b bVar = new C6845b(this, C10232R.style.AlertDialogTheme);
        bVar.mo770b((CharSequence) getString(C10232R.string.app_name)).mo758a((CharSequence) getString(C10232R.string.msg_ask_to_delete)).mo760a(false).mo776c((CharSequence) getString(C10232R.string.lbl_dg_title_yes), (OnClickListener) new C10869g(i)).mo759a((CharSequence) getString(C10232R.string.lbl_dg_title_no), (OnClickListener) new C10868f());
        bVar.mo778c();
    }

    /* renamed from: j */
    public void mo38491j(int i) {
        View inflate = getLayoutInflater().inflate(C10232R.layout.bottom_sheet_payment_configure_options, null);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(C10232R.C10236id.llMarkDefault);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(C10232R.C10236id.llDelete);
        ImageView imageView = (ImageView) inflate.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvPaymentMethodName);
        View findViewById = inflate.findViewById(C10232R.C10236id.llBack);
        PaymentCardsBean paymentCardsBean = (PaymentCardsBean) this.f29853W.get(i);
        imageView.setImageResource(C5887x.m25788P(paymentCardsBean.getBrand()));
        int i2 = 0;
        textView.setText(String.format(getString(C10232R.string.card_ending_format), new Object[]{paymentCardsBean.getLastDigits()}));
        if (((PaymentCardsBean) this.f29853W.get(i)).isDefault()) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        findViewById.setOnClickListener(new C10870h());
        frameLayout.setOnClickListener(new C10871i(i));
        frameLayout2.setOnClickListener(new C10872j(i));
        this.f29856Z = new C5665a(this);
        this.f29856Z.setContentView(inflate);
        this.f29856Z.show();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @C0195i0 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1) {
            m49722J();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5887x.m25803a(getWindow(), C0841b.m4915a((Context) this, (int) C10232R.C10234color.coupon_white), false);
        setContentView((int) C10232R.layout.activity_payment_method_list);
        initViews();
    }

    /* renamed from: a */
    private void m49728a(PaymentListBean paymentListBean) {
        boolean z;
        Iterator it = this.f29852V.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            PaymentListBean paymentListBean2 = (PaymentListBean) it.next();
            if (paymentListBean2.getId() != null && paymentListBean2.getId().intValue() == paymentListBean.getId().intValue()) {
                z = true;
                break;
            }
        }
        if (!z) {
            List<PaymentListBean> list = this.f29852V;
            list.add(list.size() - 1, paymentListBean);
            this.f29854X.mo7341e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m49732a(String str, PaymentCardsBean paymentCardsBean) {
        if (this.f29642a.mo23502X()) {
            this.f29851U.setVisibility(0);
            HashMap hashMap = new HashMap();
            hashMap.put("current_user_id", this.f29642a.mo23476G());
            hashMap.put("auth_token", this.f29642a.mo23640m());
            hashMap.put("action_type", str);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(paymentCardsBean.getId());
            hashMap.put(C11687c.f33756a1, sb.toString());
            C11687c.m52645a(this.f29642a).updatePaymentCard(this.f29642a.mo23476G(), hashMap).enqueue(new C10863a());
        }
    }
}
