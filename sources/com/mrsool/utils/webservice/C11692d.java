package com.mrsool.utils.webservice;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0295d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.C5665a;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.createorder.CreateOrderActivity;
import com.mrsool.order.C11061r;
import com.mrsool.order.C11061r.C11064c;
import com.mrsool.payment.C11124o;
import com.mrsool.shopmenu.MenuOrderActivityStep1;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import java.util.List;

/* renamed from: com.mrsool.utils.webservice.d */
/* compiled from: PaymentBottomSheet */
public class C11692d {

    /* renamed from: a */
    private Context f33867a;

    /* renamed from: b */
    private C5887x f33868b;

    /* renamed from: c */
    private C5665a f33869c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C11124o f33870d;

    /* renamed from: com.mrsool.utils.webservice.d$a */
    /* compiled from: PaymentBottomSheet */
    class C11693a implements C11064c {
        C11693a() {
        }

        /* renamed from: a */
        public void mo38058a(int i) {
            C11692d.this.f33870d.mo37724a(i);
            C11692d.this.mo40192b();
        }
    }

    public C11692d(Context context, List<PaymentListBean> list, int i) {
        this.f33867a = context;
        this.f33868b = new C5887x(context);
        mo40191a(list, i);
    }

    /* renamed from: d */
    private Activity m52654d() {
        Context context = this.f33867a;
        if (context instanceof CreateOrderActivity) {
            return (CreateOrderActivity) context;
        }
        if (context instanceof MenuOrderActivityStep1) {
            return (MenuOrderActivityStep1) context;
        }
        return (C0295d) context;
    }

    /* renamed from: b */
    public void mo40192b() {
        C5665a aVar = this.f33869c;
        if (aVar != null && aVar.isShowing()) {
            this.f33869c.dismiss();
        }
    }

    /* renamed from: c */
    public void mo40193c() {
        C5665a aVar = this.f33869c;
        if (aVar != null && !aVar.isShowing()) {
            this.f33869c.show();
        }
    }

    /* renamed from: a */
    public void mo40191a(List<PaymentListBean> list, int i) {
        View inflate = m52654d().getLayoutInflater().inflate(C10232R.layout.bottom_sheet_payment_method, null);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C10232R.C10236id.llClose);
        TextView textView = (TextView) inflate.findViewById(C10232R.C10236id.tvInstruction);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10232R.C10236id.rvPaymentModes);
        this.f33869c = new C5665a(this.f33867a);
        this.f33869c.setContentView(inflate);
        this.f33869c.setCancelable(false);
        WrapContentLinearLayoutManager wrapContentLinearLayoutManager = new WrapContentLinearLayoutManager(this.f33867a);
        wrapContentLinearLayoutManager.mo7000l(1);
        recyclerView.setLayoutManager(wrapContentLinearLayoutManager);
        recyclerView.setItemAnimator(this.f33868b.mo23672x());
        recyclerView.setNestedScrollingEnabled(false);
        C11061r rVar = new C11061r(list, this.f33867a, "placeOrderScreen");
        rVar.mo38822g(i);
        recyclerView.setAdapter(rVar);
        rVar.mo38819a((C11064c) new C11693a());
        linearLayout.setOnClickListener(new C11686a(this));
        this.f33868b.mo23550a(this.f33869c);
    }

    /* renamed from: a */
    public /* synthetic */ void mo40189a(View view) {
        mo40192b();
        this.f33870d.mo37723a();
    }

    /* renamed from: a */
    public C11124o mo40188a() {
        return this.f33870d;
    }

    /* renamed from: a */
    public void mo40190a(C11124o oVar) {
        this.f33870d = oVar;
    }
}
