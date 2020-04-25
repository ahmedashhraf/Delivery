package com.mrsool.order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0841b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.mrsool.C10232R;
import com.mrsool.bean.PaymentListBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;
import p076c.p082c.p083a.C2232l;

/* renamed from: com.mrsool.order.q */
/* compiled from: OrderPaymentMethodsAdapter */
public class C11057q extends C1638g<C11059b> {

    /* renamed from: c */
    private Context f30585c;

    /* renamed from: d */
    private List<PaymentListBean> f30586d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11060c f30587e;

    /* renamed from: f */
    private String f30588f = "";

    /* renamed from: g */
    private C5887x f30589g;

    /* renamed from: h */
    private int f30590h;

    /* renamed from: com.mrsool.order.q$a */
    /* compiled from: OrderPaymentMethodsAdapter */
    class C11058a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30591a;

        C11058a(int i) {
            this.f30591a = i;
        }

        public void onClick(View view) {
            if (C11057q.this.f30587e != null) {
                C11057q.this.f30587e.mo38817a(this.f30591a);
            }
        }
    }

    /* renamed from: com.mrsool.order.q$b */
    /* compiled from: OrderPaymentMethodsAdapter */
    public static class C11059b extends C1635d0 {

        /* renamed from: s0 */
        TextView f30593s0;

        /* renamed from: t0 */
        ImageView f30594t0;

        /* renamed from: u0 */
        ImageView f30595u0;

        /* renamed from: v0 */
        LinearLayout f30596v0;

        /* renamed from: w0 */
        LinearLayout f30597w0;

        /* renamed from: x0 */
        View f30598x0;

        public C11059b(View view) {
            super(view);
            this.f30593s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f30597w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f30594t0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f30595u0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f30598x0 = view.findViewById(C10232R.C10236id.vDivider);
            this.f30596v0 = (LinearLayout) view.findViewById(C10232R.C10236id.llWarning);
        }
    }

    /* renamed from: com.mrsool.order.q$c */
    /* compiled from: OrderPaymentMethodsAdapter */
    public interface C11060c {
        /* renamed from: a */
        void mo38817a(int i);
    }

    public C11057q(List<PaymentListBean> list, Context context, String str) {
        this.f30585c = context;
        this.f30586d = list;
        this.f30588f = str;
        this.f30589g = new C5887x(this.f30585c);
    }

    /* renamed from: f */
    public int mo38813f() {
        return this.f30590h;
    }

    /* renamed from: g */
    public C11060c mo38814g() {
        return this.f30587e;
    }

    /* renamed from: a */
    public void mo38812a(C11060c cVar) {
        this.f30587e = cVar;
    }

    /* renamed from: g */
    public void mo38815g(int i) {
        this.f30590h = i;
    }

    /* renamed from: a */
    public void mo7330b(C11059b bVar, int i) {
        PaymentListBean paymentListBean = (PaymentListBean) this.f30586d.get(i);
        C2232l.m11649c(this.f30585c).mo9515a(paymentListBean.getPaymentIconUrl()).m11498d(87, 50).mo9424a(bVar.f30594t0);
        bVar.f30593s0.setText(paymentListBean.getName());
        if (paymentListBean.isShowOption()) {
            bVar.f30597w0.setEnabled(true);
            bVar.f30597w0.setAlpha(1.0f);
        } else {
            bVar.f30597w0.setEnabled(false);
            bVar.f30597w0.setAlpha(0.5f);
        }
        if (this.f30590h == ((PaymentListBean) this.f30586d.get(i)).getId().intValue()) {
            bVar.f30593s0.setTextColor(C0841b.m4915a(this.f30585c, (int) C10232R.C10234color.color_selected_payment_method));
        } else {
            bVar.f30593s0.setTextColor(C0841b.m4915a(this.f30585c, (int) C10232R.C10234color.color_payment_method));
        }
        bVar.f30597w0.setOnClickListener(new C11058a(i));
        if (i != this.f30586d.size() - 1 || !this.f30588f.equalsIgnoreCase("placeOrderScreen")) {
            bVar.f30598x0.setVisibility(8);
        } else {
            bVar.f30598x0.setVisibility(8);
        }
    }

    /* renamed from: b */
    public C11059b m50249b(ViewGroup viewGroup, int i) {
        return new C11059b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_order_payment_method, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<PaymentListBean> list = this.f30586d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
