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
import com.mrsool.bean.PaymentCardsBean;
import com.mrsool.utils.C5887x;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mrsool.payment.r */
/* compiled from: SavedCardAndPaymentMethodsAdapter */
public class C11131r extends C1638g<C1635d0> {

    /* renamed from: c */
    private Context f30824c;

    /* renamed from: d */
    private List<PaymentCardsBean> f30825d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11136e f30826e;

    /* renamed from: f */
    private C5887x f30827f;

    /* renamed from: com.mrsool.payment.r$a */
    /* compiled from: SavedCardAndPaymentMethodsAdapter */
    class C11132a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11135d f30828a;

        C11132a(C11135d dVar) {
            this.f30828a = dVar;
        }

        public void onClick(View view) {
            if (C11131r.this.f30826e != null) {
                C11131r.this.f30826e.mo38943a(this.f30828a.mo7273f());
            }
        }
    }

    /* renamed from: com.mrsool.payment.r$b */
    /* compiled from: SavedCardAndPaymentMethodsAdapter */
    class C11133b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C11134c f30830a;

        C11133b(C11134c cVar) {
            this.f30830a = cVar;
        }

        public void onClick(View view) {
            if (C11131r.this.f30826e != null) {
                C11131r.this.f30826e.mo38943a(this.f30830a.mo7273f());
            }
        }
    }

    /* renamed from: com.mrsool.payment.r$c */
    /* compiled from: SavedCardAndPaymentMethodsAdapter */
    private static class C11134c extends C1635d0 {

        /* renamed from: s0 */
        ImageView f30832s0;

        /* renamed from: t0 */
        TextView f30833t0;

        C11134c(View view) {
            super(view);
            this.f30832s0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f30833t0 = (TextView) view.findViewById(C10232R.C10236id.tvName);
        }
    }

    /* renamed from: com.mrsool.payment.r$d */
    /* compiled from: SavedCardAndPaymentMethodsAdapter */
    public static class C11135d extends C1635d0 {

        /* renamed from: s0 */
        TextView f30834s0;

        /* renamed from: t0 */
        TextView f30835t0;

        /* renamed from: u0 */
        ImageView f30836u0;

        /* renamed from: v0 */
        ImageView f30837v0;

        /* renamed from: w0 */
        LinearLayout f30838w0;

        /* renamed from: x0 */
        LinearLayout f30839x0;

        /* renamed from: y0 */
        LinearLayout f30840y0;

        /* renamed from: z0 */
        View f30841z0;

        public C11135d(View view) {
            super(view);
            this.f30834s0 = (TextView) view.findViewById(C10232R.C10236id.tvPaymentMethodName);
            this.f30839x0 = (LinearLayout) view.findViewById(C10232R.C10236id.llPayment);
            this.f30836u0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodIcon);
            this.f30837v0 = (ImageView) view.findViewById(C10232R.C10236id.ivPaymentMethodSelected);
            this.f30841z0 = view.findViewById(C10232R.C10236id.vDivider);
            this.f30838w0 = (LinearLayout) view.findViewById(C10232R.C10236id.llWarning);
            this.f30835t0 = (TextView) view.findViewById(C10232R.C10236id.tvDefault);
            this.f30840y0 = (LinearLayout) view.findViewById(C10232R.C10236id.llOptionMenu);
        }
    }

    /* renamed from: com.mrsool.payment.r$e */
    /* compiled from: SavedCardAndPaymentMethodsAdapter */
    public interface C11136e {
        /* renamed from: a */
        void mo38943a(int i);
    }

    public C11131r(List<PaymentCardsBean> list, Context context) {
        this.f30824c = context;
        this.f30825d = list;
        this.f30827f = new C5887x(this.f30824c);
    }

    /* renamed from: b */
    public C1635d0 mo7327b(ViewGroup viewGroup, int i) {
        if (i != 3) {
            return new C11135d(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised, viewGroup, false));
        }
        return new C11134c(LayoutInflater.from(viewGroup.getContext()).inflate(C10232R.layout.row_payment_method_revised_footer, viewGroup, false));
    }

    /* renamed from: c */
    public int mo7333c(int i) {
        return ((PaymentCardsBean) this.f30825d.get(i)).getId() == null ? 3 : 2;
    }

    /* renamed from: a */
    public void mo38944a(C11135d dVar, int i) {
        PaymentCardsBean paymentCardsBean = (PaymentCardsBean) this.f30825d.get(i);
        dVar.f30836u0.setImageResource(C5887x.m25788P(paymentCardsBean.getBrand()));
        dVar.f30834s0.setText(String.format(dVar.f6294a.getContext().getString(C10232R.string.card_ending_format), new Object[]{paymentCardsBean.getLastDigits()}));
        dVar.f30837v0.setVisibility(0);
        if (paymentCardsBean.isDefault()) {
            dVar.f30837v0.setImageResource(C10232R.C10235drawable.ic_tick_sky_blue);
        } else {
            dVar.f30837v0.setImageResource(0);
        }
        dVar.f6294a.setOnClickListener(new C11132a(dVar));
    }

    /* renamed from: b */
    public void mo7330b(C1635d0 d0Var, int i) {
        if (d0Var instanceof C11135d) {
            mo38944a((C11135d) d0Var, i);
        } else if (d0Var instanceof C11134c) {
            m50514a((C11134c) d0Var, i);
        }
    }

    /* renamed from: a */
    private void m50514a(C11134c cVar, int i) {
        PaymentCardsBean paymentCardsBean = (PaymentCardsBean) this.f30825d.get(i);
        cVar.f30832s0.setVisibility(0);
        if (paymentCardsBean.isDefault()) {
            cVar.f30832s0.setImageResource(C10232R.C10235drawable.ic_tick_sky_blue);
        } else {
            cVar.f30832s0.setImageResource(0);
        }
        cVar.f30833t0.setText(this.f30824c.getString(C10232R.string.credit_or_debit_card));
        this.f30827f.mo23582b(cVar.f30833t0);
        cVar.f6294a.setOnClickListener(new C11133b(cVar));
    }

    /* renamed from: b */
    public int mo7325b() {
        List<PaymentCardsBean> list = this.f30825d;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo38945a(C11136e eVar) {
        this.f30826e = eVar;
    }
}
