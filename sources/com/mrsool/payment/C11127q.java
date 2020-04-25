package com.mrsool.payment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.C0295d;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C5665a;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.chat.ChatActivityNew;
import com.mrsool.payment.C11131r.C11136e;
import com.mrsool.utils.C11644i;
import com.mrsool.utils.C5887x;
import com.mrsool.utils.WrapContentLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.payment.q */
/* compiled from: SavedCardAndPaymentListBottomSheet */
public class C11127q implements OnClickListener {

    /* renamed from: N */
    private C5887x f30811N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public View f30812O;

    /* renamed from: P */
    private C5665a f30813P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public C11131r f30814Q;

    /* renamed from: R */
    private WrapContentLinearLayoutManager f30815R;

    /* renamed from: S */
    private ImageView f30816S;

    /* renamed from: T */
    private RecyclerView f30817T;

    /* renamed from: U */
    private C11130c f30818U;

    /* renamed from: V */
    private List<PaymentCardsBean> f30819V;

    /* renamed from: a */
    private Context f30820a;

    /* renamed from: b */
    private Bundle f30821b;

    /* renamed from: com.mrsool.payment.q$a */
    /* compiled from: SavedCardAndPaymentListBottomSheet */
    class C11128a implements OnShowListener {
        C11128a() {
        }

        public void onShow(DialogInterface dialogInterface) {
            BottomSheetBehavior c = BottomSheetBehavior.m24700c((FrameLayout) ((C5665a) dialogInterface).findViewById(C10232R.C10236id.design_bottom_sheet));
            c.mo22467c(C11127q.this.f30812O.getHeight());
            c.mo22474e(3);
        }
    }

    /* renamed from: com.mrsool.payment.q$b */
    /* compiled from: SavedCardAndPaymentListBottomSheet */
    class C11129b implements C11136e {
        C11129b() {
        }

        /* renamed from: a */
        public void mo38943a(int i) {
            C11127q.this.f30814Q.mo7333c(i);
            C11127q.this.m50500a(i);
        }
    }

    /* renamed from: com.mrsool.payment.q$c */
    /* compiled from: SavedCardAndPaymentListBottomSheet */
    public interface C11130c {
        /* renamed from: a */
        void mo37856a(List<PaymentCardsBean> list, PaymentCardsBean paymentCardsBean);
    }

    public C11127q(Context context, Bundle bundle) {
        this.f30820a = context;
        this.f30821b = bundle;
        m50505e();
    }

    /* renamed from: c */
    private Activity m50503c() {
        Context context = this.f30820a;
        if (context instanceof ChatActivityNew) {
            return (ChatActivityNew) context;
        }
        return (C0295d) context;
    }

    /* renamed from: d */
    private void m50504d() {
        this.f30816S = (ImageView) this.f30812O.findViewById(C10232R.C10236id.imgClose);
        if (this.f30811N.mo23496R()) {
            this.f30816S.setScaleX(-1.0f);
        }
        this.f30817T = (RecyclerView) this.f30812O.findViewById(C10232R.C10236id.rvPaymentModes);
        List<PaymentCardsBean> list = this.f30819V;
        if (list != null) {
            list.add(new PaymentCardsBean());
        }
        this.f30814Q = new C11131r(this.f30819V, this.f30820a);
        this.f30815R = new WrapContentLinearLayoutManager(this.f30820a);
        this.f30815R.mo7000l(1);
        this.f30817T.setLayoutManager(this.f30815R);
        this.f30817T.setAdapter(this.f30814Q);
        this.f30814Q.mo38945a((C11136e) new C11129b());
        this.f30816S.setOnClickListener(this);
    }

    /* renamed from: e */
    private void m50505e() {
        this.f30811N = new C5887x(this.f30820a);
        this.f30812O = m50503c().getLayoutInflater().inflate(C10232R.layout.bottomsheet_saved_and_payment_list, null);
        this.f30813P = new C5665a(this.f30820a, C10232R.style.DialogStyle);
        Bundle bundle = this.f30821b;
        if (bundle != null && bundle.containsKey(C11644i.f33164P2)) {
            this.f30819V = (ArrayList) this.f30821b.getSerializable(C11644i.f33164P2);
        }
        m50504d();
        m50507g();
        this.f30813P.setOnShowListener(new C11128a());
        this.f30813P.setCancelable(false);
        this.f30813P.setContentView(this.f30812O);
        this.f30813P.getWindow().setSoftInputMode(19);
    }

    /* renamed from: f */
    private void m50506f() {
        List<PaymentCardsBean> list = this.f30819V;
        list.remove(list.size() - 1);
    }

    /* renamed from: g */
    private void m50507g() {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= this.f30819V.size()) {
                break;
            } else if (((PaymentCardsBean) this.f30819V.get(i)).isDefault()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            List<PaymentCardsBean> list = this.f30819V;
            ((PaymentCardsBean) list.get(list.size() - 1)).setDefault(true);
        }
        C11131r rVar = this.f30814Q;
        if (rVar != null) {
            rVar.mo7341e();
        }
    }

    public void onClick(View view) {
        if (view == this.f30816S) {
            m50506f();
            mo38938a();
        }
    }

    /* renamed from: b */
    public void mo38940b() {
        C5665a aVar = this.f30813P;
        if (aVar != null && !aVar.isShowing()) {
            this.f30813P.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m50500a(int i) {
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= this.f30819V.size()) {
                break;
            }
            PaymentCardsBean paymentCardsBean = (PaymentCardsBean) this.f30819V.get(i2);
            if (i2 != i) {
                z = false;
            }
            paymentCardsBean.setDefault(z);
            i2++;
        }
        this.f30814Q.mo7341e();
        if (this.f30818U != null) {
            m50506f();
            C11130c cVar = this.f30818U;
            List<PaymentCardsBean> list = this.f30819V;
            cVar.mo37856a(list, i <= list.size() - 1 ? (PaymentCardsBean) this.f30819V.get(i) : null);
        }
    }

    /* renamed from: a */
    public void mo38938a() {
        C5665a aVar = this.f30813P;
        if (aVar != null && aVar.isShowing()) {
            this.f30813P.dismiss();
        }
    }

    /* renamed from: a */
    public void mo38939a(C11130c cVar) {
        this.f30818U = cVar;
    }
}
