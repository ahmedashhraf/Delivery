package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.chinaunionpay.ChinaUnionPayPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.f */
public class C11834f extends C11795a0 {

    /* renamed from: a0 */
    private InputLayout f34208a0;

    /* renamed from: e */
    private void m53230e() {
        this.f34208a0.getEditText().setFilters(new InputFilter[]{new LengthFilter(getResources().getInteger(C11771R.integer.cardHolderMaxLength))});
        this.f34208a0.getEditText().setInputType(528384);
        this.f34208a0.getEditText().setImeOptions(6);
        this.f34208a0.setHint(getString(C11771R.string.checkout_layout_hint_card_holder));
        this.f34208a0.getEditText().setContentDescription(getString(C11771R.string.checkout_layout_hint_card_holder));
        this.f34208a0.setHelperText(getString(C11771R.string.checkout_helper_card_holder));
        this.f34208a0.setInputValidator(C11923z0.m53609a());
        this.f34208a0.setOptional(true);
    }

    /* renamed from: f */
    private PaymentParams m53231f() {
        String i = this.f34111P.mo40717i();
        if (!m53232g()) {
            return null;
        }
        try {
            return new ChinaUnionPayPaymentParams(i, this.f34208a0.getText());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private boolean m53232g() {
        return this.f34208a0.mo40337g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
        this.f34208a0.mo40330a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        return m53231f();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_china_union_pay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34208a0 = (InputLayout) view.findViewById(C11771R.C11775id.holder_text_input_layout);
        m53230e();
    }
}
