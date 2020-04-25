package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import java.util.LinkedHashMap;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.u */
public class C11907u extends C11799b {

    /* renamed from: P */
    private LayoutInflater f34368P;

    /* renamed from: Q */
    private OrderSummary f34369Q;

    /* renamed from: R */
    private String f34370R;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.u$a */
    class C11908a implements OnClickListener {
        C11908a() {
        }

        public void onClick(View view) {
            C11907u.this.f34130a.mo40400x();
        }
    }

    /* renamed from: a */
    private View m53536a(String str, String str2) {
        LinearLayout linearLayout = (LinearLayout) this.f34368P.inflate(C11771R.layout.opp_item_order_details, null);
        TextView textView = (TextView) linearLayout.findViewById(C11771R.C11775id.order_item_amount);
        ((TextView) linearLayout.findViewById(C11771R.C11775id.order_item_title)).setText(str);
        textView.setText(str2);
        return linearLayout;
    }

    /* renamed from: a */
    public static C11907u m53537a(OrderSummary orderSummary, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CheckoutActivity.f34079t0, orderSummary);
        bundle.putString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CURRENCY", str);
        C11907u uVar = new C11907u();
        uVar.setArguments(bundle);
        return uVar;
    }

    /* renamed from: a */
    private void m53538a(View view) {
        ((TextView) view.findViewById(C11771R.C11775id.card_description)).setText(this.f34369Q.mo40373i());
        ((ImageView) view.findViewById(C11771R.C11775id.brand_logo)).setImageBitmap(C11887q.m53456a(getContext()).mo40544a(this.f34369Q.mo40368c()));
    }

    /* renamed from: b */
    private void m53539b(View view) {
        if (TextUtils.isEmpty(this.f34369Q.mo40374j())) {
            view.findViewById(C11771R.C11775id.shipping_address_layout).setVisibility(8);
        } else {
            ((TextView) view.findViewById(C11771R.C11775id.shipping_address)).setText(this.f34369Q.mo40374j());
        }
    }

    /* renamed from: c */
    private void m53540c(View view) {
        ((TextView) view.findViewById(C11771R.C11775id.total_amount_value)).setText(C11868k0.m53354a(this.f34369Q.mo40366b().doubleValue(), this.f34370R));
        LinkedHashMap a = this.f34369Q.mo40365a();
        if (a.isEmpty()) {
            view.findViewById(C11771R.C11775id.total_amount_divider).setVisibility(8);
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C11771R.C11775id.order_details_layout);
        for (String str : a.keySet()) {
            Double d = (Double) a.get(str);
            if (d != null) {
                linearLayout.addView(m53536a(str, C11868k0.m53354a(d.doubleValue(), this.f34370R)));
            }
        }
    }

    /* renamed from: d */
    private void m53541d(View view) {
        Button button = (Button) view.findViewById(C11771R.C11775id.payment_button);
        button.setText(C11771R.string.checkout_layout_text_pay);
        button.setOnClickListener(new C11908a());
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f34369Q = (OrderSummary) arguments.getParcelable(CheckoutActivity.f34079t0);
            this.f34370R = arguments.getString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CURRENCY");
        }
    }

    @C0195i0
    public View onCreateView(@C0193h0 LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        this.f34368P = layoutInflater;
        return layoutInflater.inflate(C11771R.layout.opp_fragment_order_summary, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34131b.setText(C11771R.string.checkout_order_review);
        m53538a(view);
        m53539b(view);
        m53540c(view);
        m53541d(view);
    }
}
