package com.mrsool.order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.order.r */
/* compiled from: OrderPaymentMethodsAdapterRevised */
public class C11061r extends C1638g<C11063b> {

    /* renamed from: c */
    private Context f30599c;

    /* renamed from: d */
    private List<PaymentListBean> f30600d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11064c f30601e;

    /* renamed from: f */
    private String f30602f = "";

    /* renamed from: g */
    private C5887x f30603g;

    /* renamed from: h */
    private int f30604h;

    /* renamed from: com.mrsool.order.r$a */
    /* compiled from: OrderPaymentMethodsAdapterRevised */
    class C11062a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30605a;

        C11062a(int i) {
            this.f30605a = i;
        }

        public void onClick(View view) {
            if (C11061r.this.f30601e != null) {
                C11061r.this.f30601e.mo38058a(this.f30605a);
            }
        }
    }

    /* renamed from: com.mrsool.order.r$b */
    /* compiled from: OrderPaymentMethodsAdapterRevised */
    public static class C11063b extends C1635d0 {

        /* renamed from: s0 */
        TextView f30607s0;

        /* renamed from: t0 */
        ImageView f30608t0;

        /* renamed from: u0 */
        ImageView f30609u0;

        /* renamed from: v0 */
        LinearLayout f30610v0;

        /* renamed from: w0 */
        LinearLayout f30611w0;

        /* renamed from: x0 */
        View f30612x0;

        public C11063b(View view) {
            super(view);
            this.f30607s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f30611w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f30608t0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f30609u0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f30612x0 = view.findViewById(C10232R.C10236id.vDivider);
        }
    }

    /* renamed from: com.mrsool.order.r$c */
    /* compiled from: OrderPaymentMethodsAdapterRevised */
    public interface C11064c {
        /* renamed from: a */
        void mo38058a(int i);
    }

    public C11061r(List<PaymentListBean> list, Context context, String str) {
        this.f30599c = context;
        this.f30600d = list;
        this.f30602f = str;
        this.f30603g = new C5887x(this.f30599c);
    }

    /* renamed from: f */
    public int mo38820f() {
        return this.f30604h;
    }

    /* renamed from: g */
    public C11064c mo38821g() {
        return this.f30601e;
    }

    /* renamed from: a */
    public void mo38819a(C11064c cVar) {
        this.f30601e = cVar;
    }

    /* renamed from: g */
    public void mo38822g(int i) {
        this.f30604h = i;
    }

    /* renamed from: a */
    public void mo7330b(C11063b bVar, int i) {
        PaymentListBean paymentListBean = (PaymentListBean) this.f30600d.get(i);
        this.f30603g.mo23582b(bVar.f30607s0);
        C2232l.m11649c(this.f30599c).mo9515a(paymentListBean.getPaymentIconUrl()).m11498d(87, 50).mo9424a(bVar.f30608t0);
        bVar.f30607s0.setText(paymentListBean.getName());
        if (paymentListBean.isShowOption()) {
            bVar.f30611w0.setEnabled(true);
            bVar.f30611w0.setAlpha(1.0f);
        } else {
            bVar.f30611w0.setEnabled(false);
            bVar.f30611w0.setAlpha(0.5f);
        }
        if (this.f30604h == ((PaymentListBean) this.f30600d.get(i)).getId().intValue()) {
            bVar.f30609u0.setVisibility(0);
        } else {
            bVar.f30609u0.setVisibility(8);
        }
        bVar.f30611w0.setOnClickListener(new C11062a(i));
        if (i != this.f30600d.size() - 1 || !this.f30602f.equalsIgnoreCase("placeOrderScreen")) {
            bVar.f30612x0.setVisibility(8);
        } else {
            bVar.f30612x0.setVisibility(8);
        }
    }

    /* renamed from: b */
    public C11063b m50260b(ViewGroup viewGroup, int i) {
        return new C11063b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<PaymentListBean> list = this.f30600d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
