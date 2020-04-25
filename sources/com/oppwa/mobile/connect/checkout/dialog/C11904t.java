package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.mbway.MBWayPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.t */
public class C11904t extends C11795a0 {

    /* renamed from: a0 */
    private RadioGroup f34362a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public RadioButton f34363b0;

    /* renamed from: c0 */
    private InputLayout f34364c0;

    /* renamed from: d0 */
    private InputLayout f34365d0;

    /* renamed from: e0 */
    private InputLayout f34366e0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.t$a */
    class C11905a implements OnCheckedChangeListener {
        C11905a() {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if (C11904t.this.f34363b0.isChecked()) {
                C11904t.this.m53529i();
            } else {
                C11904t.this.m53530j();
            }
        }
    }

    /* renamed from: e */
    private void m53525e() {
        m53526f();
        m53527g();
        m53528h();
    }

    /* renamed from: f */
    private void m53526f() {
        this.f34364c0.getEditText().setInputType(524320);
        this.f34364c0.getEditText().setImeOptions(6);
        this.f34364c0.setInputValidator(C11923z0.m53616d());
        this.f34364c0.setHint(getString(C11771R.string.checkout_layout_hint_email));
    }

    /* renamed from: g */
    private void m53527g() {
        this.f34365d0.setHint(getString(C11771R.string.checkout_layout_hint_country_code));
        this.f34365d0.setNotEditableText("Portugal 351");
        this.f34365d0.setVisibility(8);
        this.f34366e0.getEditText().setInputType(2);
        this.f34366e0.getEditText().setImeOptions(6);
        this.f34366e0.setHint(getString(C11771R.string.checkout_layout_hint_phone_number));
        this.f34366e0.setInputValidator(C11923z0.m53615c());
        this.f34366e0.setVisibility(8);
    }

    /* renamed from: h */
    private void m53528h() {
        this.f34362a0.setOnCheckedChangeListener(new C11905a());
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m53529i() {
        this.f34364c0.mo40332b();
        if (this.f34366e0.hasFocus()) {
            this.f34364c0.requestFocus();
        }
        this.f34364c0.setVisibility(0);
        this.f34365d0.setVisibility(8);
        this.f34366e0.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m53530j() {
        this.f34366e0.mo40332b();
        if (this.f34364c0.hasFocus()) {
            this.f34366e0.requestFocus();
        }
        this.f34364c0.setVisibility(8);
        this.f34365d0.setVisibility(0);
        this.f34366e0.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
        this.f34364c0.mo40330a();
        this.f34366e0.mo40330a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        try {
            PaymentParams paymentParams = (!this.f34363b0.isChecked() || !this.f34364c0.mo40337g()) ? (this.f34363b0.isChecked() || !this.f34366e0.mo40337g()) ? null : new MBWayPaymentParams(this.f34111P.mo40717i(), "351", this.f34366e0.getText()) : new MBWayPaymentParams(this.f34111P.mo40717i(), this.f34364c0.getText());
            return paymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_mbway_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34362a0 = (RadioGroup) view.findViewById(C11771R.C11775id.form_type_radio_group);
        this.f34363b0 = (RadioButton) view.findViewById(C11771R.C11775id.email_radio_button);
        this.f34364c0 = (InputLayout) view.findViewById(C11771R.C11775id.email_input_layout);
        this.f34365d0 = (InputLayout) view.findViewById(C11771R.C11775id.country_code_input_layout);
        this.f34366e0 = (InputLayout) view.findViewById(C11771R.C11775id.mobile_phone_input_layout);
        m53525e();
    }
}
