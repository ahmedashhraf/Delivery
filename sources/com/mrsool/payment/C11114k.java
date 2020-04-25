package com.mrsool.payment;

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

/* renamed from: com.mrsool.payment.k */
/* compiled from: AvailablePaymentMethodsAdapter */
public class C11114k extends C1638g<C11116b> {

    /* renamed from: c */
    private Context f30778c;

    /* renamed from: d */
    private List<PaymentListBean> f30779d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11117c f30780e;

    /* renamed from: f */
    private String f30781f = "";

    /* renamed from: g */
    private C5887x f30782g;

    /* renamed from: com.mrsool.payment.k$a */
    /* compiled from: AvailablePaymentMethodsAdapter */
    class C11115a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ int f30783a;

        C11115a(int i) {
            this.f30783a = i;
        }

        public void onClick(View view) {
            C11114k.this.f30780e.mo38870a(this.f30783a);
        }
    }

    /* renamed from: com.mrsool.payment.k$b */
    /* compiled from: AvailablePaymentMethodsAdapter */
    public static class C11116b extends C1635d0 {

        /* renamed from: s0 */
        TextView f30785s0;

        /* renamed from: t0 */
        ImageView f30786t0;

        /* renamed from: u0 */
        LinearLayout f30787u0;

        /* renamed from: v0 */
        LinearLayout f30788v0;

        /* renamed from: w0 */
        View f30789w0;

        public C11116b(View view) {
            super(view);
            this.f30785s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f30788v0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f30786t0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f30789w0 = view.findViewById(C10232R.C10236id.vDivider);
            this.f30787u0 = (LinearLayout) view.findViewById(C10232R.C10236id.llWarning);
        }
    }

    /* renamed from: com.mrsool.payment.k$c */
    /* compiled from: AvailablePaymentMethodsAdapter */
    public interface C11117c {
        /* renamed from: a */
        void mo38870a(int i);
    }

    public C11114k(List<PaymentListBean> list, Context context, String str) {
        this.f30778c = context;
        this.f30779d = list;
        this.f30781f = str;
        this.f30782g = new C5887x(this.f30778c);
    }

    /* renamed from: f */
    public C11117c mo38923f() {
        return this.f30780e;
    }

    /* renamed from: a */
    public void mo38922a(C11117c cVar) {
        this.f30780e = cVar;
    }

    /* renamed from: a */
    public void mo7330b(C11116b bVar, int i) {
        bVar.f30785s0.setText(((PaymentListBean) this.f30779d.get(i)).getName());
        bVar.f6294a.setOnClickListener(new C11115a(i));
        if (i == mo7325b() - 1) {
            bVar.f30789w0.setVisibility(8);
        } else {
            bVar.f30789w0.setVisibility(0);
        }
    }

    /* renamed from: b */
    public C11116b m50470b(ViewGroup viewGroup, int i) {
        return new C11116b(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_available_payment_method, viewGroup, false));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<PaymentListBean> list = this.f30779d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
