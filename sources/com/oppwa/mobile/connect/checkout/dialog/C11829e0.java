package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.e0 */
public class C11829e0 extends C11901s {
    /* renamed from: g */
    private PaymentParams m53224g() {
        try {
            return BankAccountPaymentParams.m53912d(this.f34111P.mo40717i(), mo40574f());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        return m53224g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11832b[] mo40447e() {
        return new C11832b[]{new C11832b(getString(C11771R.string.germany), "DE"), new C11832b(getString(C11771R.string.netherlands), "NL"), new C11832b(getString(C11771R.string.austria), "AT"), new C11832b(getString(C11771R.string.belgium), "BE"), new C11832b(getString(C11771R.string.switzerland), "CH"), new C11832b(getString(C11771R.string.united_kingdom), "GB"), new C11832b(getString(C11771R.string.spain), "ES"), new C11832b(getString(C11771R.string.italy), "IT"), new C11832b(getString(C11771R.string.poland), "PL")};
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo40405d(C11771R.string.checkout_layout_text_select_country);
    }
}
