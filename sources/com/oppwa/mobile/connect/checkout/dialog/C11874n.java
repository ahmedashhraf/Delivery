package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.C0195i0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.n */
public class C11874n extends C11901s {
    /* renamed from: g */
    private C11832b[] m53368g() {
        return new C11832b[]{new C11832b(getString(C11771R.string.abn_amro_test), "ABN_AMRO_TEST"), new C11832b(getString(C11771R.string.asn_bank), "ASN_BANK"), new C11832b(getString(C11771R.string.bunq_bank), "BUNQ_BANK"), new C11832b(getString(C11771R.string.ing_test), "ING_TEST"), new C11832b(getString(C11771R.string.knab_bank), "KNAB_BANK"), new C11832b(getString(C11771R.string.rabobank), "RABOBANK"), new C11832b(getString(C11771R.string.sns_regio_bank), "SNS_REGIO_BANK"), new C11832b(getString(C11771R.string.sns_bank), "SNS_BANK"), new C11832b(getString(C11771R.string.triodos_bank), "TRIODOS_BANK"), new C11832b(getString(C11771R.string.van_lanschot_bankiers), "VAN_LANSCHOT_BANKIERS"), new C11832b(getString(C11771R.string.rbs_test), "RBS_TEST"), new C11832b(getString(C11771R.string.moneyou), "MONEYOU"), new C11832b(getString(C11771R.string.svenska_handelsbanken), "SVENSKA_HANDELSBANKEN")};
    }

    /* renamed from: h */
    private C11832b[] m53369h() {
        return new C11832b[]{new C11832b(getString(C11771R.string.abn_amro), "ABN_AMRO"), new C11832b(getString(C11771R.string.asn_bank), "ASN_BANK"), new C11832b(getString(C11771R.string.bunq_bank), "BUNQ_BANK"), new C11832b(getString(C11771R.string.ing), "ING"), new C11832b(getString(C11771R.string.knab_bank), "KNAB_BANK"), new C11832b(getString(C11771R.string.rabobank), "RABOBANK"), new C11832b(getString(C11771R.string.sns_regio_bank), "SNS_REGIO_BANK"), new C11832b(getString(C11771R.string.sns_bank), "SNS_BANK"), new C11832b(getString(C11771R.string.triodos_bank), "TRIODOS_BANK"), new C11832b(getString(C11771R.string.van_lanschot_bankiers), "VAN_LANSCHOT_BANKIERS"), new C11832b(getString(C11771R.string.moneyou), "MONEYOU"), new C11832b(getString(C11771R.string.svenska_handelsbanken), "SVENSKA_HANDELSBANKEN")};
    }

    /* renamed from: i */
    private PaymentParams m53370i() {
        try {
            return BankAccountPaymentParams.m53911c(this.f34111P.mo40717i(), mo40574f());
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
        return m53370i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C11832b[] mo40447e() {
        return C11978a.TEST.name().equals(this.f34116U) ? m53368g() : m53369h();
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo40405d(C11771R.string.checkout_layout_text_select_bank);
    }
}
