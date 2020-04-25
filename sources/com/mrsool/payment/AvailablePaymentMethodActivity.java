package com.mrsool.payment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView;
import com.mrsool.C10232R;
import com.mrsool.C10787d;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.p423v.C11730j;
import com.mrsool.payment.C11114k.C11117c;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

public class AvailablePaymentMethodActivity extends C10787d {

    /* renamed from: S */
    private ImageView f30679S;

    /* renamed from: T */
    private RecyclerView f30680T;

    /* renamed from: U */
    private ProgressBar f30681U;

    /* renamed from: V */
    private TextView f30682V;

    /* renamed from: W */
    private List<PaymentListBean> f30683W = new ArrayList();

    /* renamed from: X */
    private C11114k f30684X;

    /* renamed from: Y */
    private WrapContentLinearLayoutManager f30685Y;

    /* renamed from: Z */
    private String f30686Z = "halalahewallet://Transaction?terminal=512345677&amount=0.20&referenceNo=MRSL_15480520&billNo=MRSL_15480520&memo=TestTransaction&callback=mrsool://open";

    /* renamed from: com.mrsool.payment.AvailablePaymentMethodActivity$a */
    class C11085a implements C11117c {
        C11085a() {
        }

        /* renamed from: a */
        public void mo38870a(int i) {
            AvailablePaymentMethodActivity availablePaymentMethodActivity = AvailablePaymentMethodActivity.this;
            availablePaymentMethodActivity.startActivity(new Intent(availablePaymentMethodActivity, AddCardActivity.class));
        }
    }

    /* renamed from: J */
    private void m50354J() {
        this.f30683W = new ArrayList();
        this.f30683W.add(new PaymentListBean(5, "Credit or MADA Card"));
        this.f30683W.add(new PaymentListBean(2, "Google Pay"));
        this.f30683W.add(new PaymentListBean(3, "Mada Pay"));
        this.f30683W.add(new PaymentListBean(4, "STC Pay"));
    }

    /* renamed from: K */
    private void m50355K() {
        mo38413g(getResources().getString(C10232R.string.title_add_payment_method));
        this.f30680T = (RecyclerView) findViewById(C10232R.C10236id.rvPaymentModes);
        this.f30681U = (ProgressBar) findViewById(C10232R.C10236id.pgPaymentMethod);
        m50354J();
        m50356L();
    }

    /* renamed from: L */
    private void m50356L() {
        if (this.f30683W.size() != 0) {
            this.f30685Y = new WrapContentLinearLayoutManager(this);
            this.f30685Y.mo7000l(1);
            this.f30680T.setLayoutManager(this.f30685Y);
            this.f30680T.setItemAnimator(this.f29642a.mo23672x());
            this.f30680T.setNestedScrollingEnabled(false);
            this.f30684X = new C11114k(this.f30683W, this, "selectPaymentScreen");
            this.f30680T.setAdapter(this.f30684X);
            this.f30684X.mo38922a((C11117c) new C11085a());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 23) {
            C11730j.m52797a((Activity) this, C0841b.m4915a((Context) this, (int) C10232R.C10234color.pending_order_bg));
            C11730j.m52801b(this);
        }
        setContentView((int) C10232R.layout.activity_available_payment_method);
        m50355K();
    }
}
