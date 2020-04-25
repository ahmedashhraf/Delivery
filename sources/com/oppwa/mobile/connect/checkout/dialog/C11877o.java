package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.ikanooi.IkanoOiPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.o */
public class C11877o extends C11795a0 implements OnCheckedChangeListener {

    /* renamed from: a0 */
    private InputLayout f34296a0;

    /* renamed from: b0 */
    private CheckBox f34297b0;

    /* renamed from: c0 */
    private TextView f34298c0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.o$a */
    class C11878a implements Runnable {
        C11878a() {
        }

        public void run() {
            C11877o.this.f34119X.setVisibility(8);
        }
    }

    /* renamed from: a */
    private String m53378a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("https://terms.iklabs.se/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        sb.append("/ikea/openinvoice/toc.pdf");
        return sb.toString();
    }

    /* renamed from: a */
    private void m53379a(View view) {
        this.f34296a0 = (InputLayout) view.findViewById(C11771R.C11775id.national_id_input_layout);
        this.f34297b0 = (CheckBox) view.findViewById(C11771R.C11775id.agreement_checkbox);
        this.f34298c0 = (TextView) view.findViewById(C11771R.C11775id.agreement_link);
        this.f34119X.setVisibility(8);
        m53381e();
        m53380b(view);
    }

    /* renamed from: b */
    private void m53380b(View view) {
        C11868k0.m53358a(getContext(), this.f34298c0, m53382f());
        ((TextView) view.findViewById(C11771R.C11775id.agreement_text)).setText(C11771R.string.checkout_layout_text_terms_and_conditions_agreement);
        this.f34297b0.setOnCheckedChangeListener(this);
    }

    /* renamed from: e */
    private void m53381e() {
        this.f34296a0.getEditText().setInputType(524289);
        this.f34296a0.setHint(getString(C11771R.string.checkout_layout_hint_national_identifier));
        this.f34296a0.setHelperText(getString(C11771R.string.checkout_helper_national_identifier));
        this.f34296a0.setInputValidator(C11923z0.m53612a(this.f34114S));
        this.f34296a0.getEditText().setImeOptions(6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m53382f() {
        /*
            r6 = this;
            int r0 = com.oppwa.mobile.connect.C11771R.string.checkout_layout_text_terms_and_conditions
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r1 = r6.f34114S
            int r2 = r1.hashCode()
            r3 = 580579304(0x229aefe8, float:4.1995794E-18)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0032
            r3 = 580579558(0x229af0e6, float:4.1996845E-18)
            if (r2 == r3) goto L_0x0028
            r3 = 580579703(0x229af177, float:4.1997444E-18)
            if (r2 == r3) goto L_0x001e
            goto L_0x003c
        L_0x001e:
            java.lang.String r2 = "IKANOOI_SE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r2 = "IKANOOI_NO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r2 = "IKANOOI_FI"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 2
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            java.lang.String r2 = "sv"
            if (r1 == 0) goto L_0x0093
            if (r1 == r5) goto L_0x0088
            if (r1 == r4) goto L_0x0048
            java.lang.String r0 = ""
            return r0
        L_0x0048:
            int r1 = com.oppwa.mobile.connect.C11771R.string.checkout_layout_text_finnish
            java.lang.String r1 = r6.getString(r1)
            java.lang.String r3 = "fi"
            java.lang.String r4 = r6.m53378a(r3, r3)
            java.lang.String r1 = com.oppwa.mobile.connect.checkout.dialog.C11868k0.m53357a(r1, r4)
            int r4 = com.oppwa.mobile.connect.C11771R.string.checkout_layout_text_swedish
            java.lang.String r4 = r6.getString(r4)
            java.lang.String r2 = r6.m53378a(r3, r2)
            java.lang.String r2 = com.oppwa.mobile.connect.checkout.dialog.C11868k0.m53357a(r4, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " ("
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " | "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ")"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            return r0
        L_0x0088:
            java.lang.String r1 = "no"
            java.lang.String r1 = r6.m53378a(r1, r1)
            java.lang.String r0 = com.oppwa.mobile.connect.checkout.dialog.C11868k0.m53357a(r0, r1)
            return r0
        L_0x0093:
            java.lang.String r1 = "se"
            java.lang.String r1 = r6.m53378a(r1, r2)
            java.lang.String r0 = com.oppwa.mobile.connect.checkout.dialog.C11868k0.m53357a(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11877o.m53382f():java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        if (this.f34296a0.mo40337g()) {
            try {
                return new IkanoOiPaymentParams(this.f34111P.mo40717i(), this.f34114S, this.f34296a0.getText());
            } catch (PaymentException unused) {
            }
        }
        return null;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.f34119X.setEnabled(true);
            this.f34119X.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_show_button));
            this.f34119X.setVisibility(0);
            return;
        }
        this.f34119X.setEnabled(false);
        this.f34119X.startAnimation(AnimationUtils.loadAnimation(getContext(), C11771R.anim.opp_hide_button));
        new Handler().postDelayed(new C11878a(), (long) getResources().getInteger(C11771R.integer.button_anim_time));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_ikano_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m53379a(view);
    }
}
