package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.C0195i0;
import com.google.android.material.textfield.TextInputLayout;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.i */
public class C11858i extends C11795a0 {
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public TextInputLayout f34268a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public EditText f34269b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public TextView f34270c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public TextInputLayout f34271d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public EditText f34272e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public TextView f34273f0;

    /* renamed from: g0 */
    private C11836f1 f34274g0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.i$a */
    class C11859a implements OnFocusChangeListener {
        C11859a() {
        }

        public void onFocusChange(View view, boolean z) {
            C11858i iVar = C11858i.this;
            if (!z) {
                iVar.m53312a(iVar.f34269b0.getText().toString());
            } else {
                iVar.mo40401a(iVar.f34268a0, C11858i.this.f34270c0);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.i$b */
    class C11860b implements OnFocusChangeListener {
        C11860b() {
        }

        public void onFocusChange(View view, boolean z) {
            C11858i iVar = C11858i.this;
            if (!z) {
                iVar.m53316b(iVar.f34272e0.getText().toString());
            } else {
                iVar.mo40401a(iVar.f34271d0, C11858i.this.f34273f0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m53312a(String str) {
        if (!this.f34111P.mo40668G()) {
            return true;
        }
        String a = this.f34274g0.mo40460a(str);
        if (BankAccountPaymentParams.m53920m(a) || BankAccountPaymentParams.m53914g(a)) {
            mo40401a(this.f34268a0, this.f34270c0);
            return true;
        }
        mo40402a(this.f34268a0, this.f34270c0, getString(C11771R.string.checkout_error_iban_account_number_invalid));
        return false;
    }

    /* renamed from: a */
    private boolean m53313a(String str, String str2) {
        return m53316b(str2) || m53312a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m53316b(String str) {
        if (BankAccountPaymentParams.m53917j(str) || BankAccountPaymentParams.m53915h(str)) {
            mo40401a(this.f34271d0, this.f34273f0);
            return true;
        }
        mo40402a(this.f34271d0, this.f34273f0, getString(C11771R.string.checkout_error_bic_bank_code_invalid));
        return false;
    }

    /* renamed from: c */
    private boolean m53318c(String str) {
        if (BankAccountPaymentParams.m53920m(str)) {
            return true;
        }
        boolean g = BankAccountPaymentParams.m53914g(str);
        return false;
    }

    /* renamed from: d */
    private boolean m53320d(String str) {
        if (BankAccountPaymentParams.m53915h(str)) {
            return true;
        }
        boolean j = BankAccountPaymentParams.m53917j(str);
        return false;
    }

    /* renamed from: e */
    private void m53322e() {
        if (!this.f34111P.mo40668G()) {
            this.f34268a0.setVisibility(8);
            this.f34269b0.setVisibility(8);
            this.f34270c0.setVisibility(8);
            return;
        }
        this.f34268a0.setErrorEnabled(true);
        this.f34274g0 = new C11836f1(Character.valueOf(' '), "#### #### #### #### #### #### #### ###");
        this.f34269b0.addTextChangedListener(this.f34274g0);
        this.f34269b0.setContentDescription(getString(C11771R.string.checkout_helper_iban_account_number));
        this.f34269b0.setFilters(new InputFilter[]{new C11873m0(false), new LengthFilter(38)});
        this.f34269b0.setOnFocusChangeListener(new C11859a());
    }

    /* renamed from: f */
    private void m53324f() {
        this.f34272e0.setContentDescription(getString(C11771R.string.checkout_helper_bic_bank_code));
        this.f34272e0.setFilters(new InputFilter[]{new C11873m0(false), new LengthFilter(12)});
        this.f34272e0.setOnFocusChangeListener(new C11860b());
    }

    /* renamed from: g */
    private PaymentParams m53325g() {
        String str;
        String str2;
        String str3;
        String i = this.f34111P.mo40717i();
        String obj = this.f34269b0.getText().toString();
        String obj2 = this.f34272e0.getText().toString();
        if (!m53313a(obj, obj2)) {
            return null;
        }
        if (this.f34111P.mo40668G()) {
            str2 = this.f34274g0.mo40460a(obj);
            if (m53318c(str2)) {
                str = null;
            } else {
                str = str2;
                str2 = null;
            }
        } else {
            str2 = null;
            str = null;
        }
        if (m53320d(obj2)) {
            str3 = obj2;
            obj2 = null;
        } else {
            str3 = null;
        }
        try {
            return BankAccountPaymentParams.m53909a(i, str2, str, obj2, str3);
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
        String str = "";
        this.f34269b0.setText(str);
        this.f34272e0.setText(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        return m53325g();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_giropay_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34268a0 = (TextInputLayout) view.findViewById(C11771R.C11775id.iban_text_input_layout);
        this.f34269b0 = (EditText) view.findViewById(C11771R.C11775id.iban_edit_text);
        this.f34270c0 = (TextView) view.findViewById(C11771R.C11775id.iban_helper);
        this.f34271d0 = (TextInputLayout) view.findViewById(C11771R.C11775id.bic_bankcode_text_input_layout);
        this.f34272e0 = (EditText) view.findViewById(C11771R.C11775id.bic_bankcode);
        this.f34273f0 = (TextView) view.findViewById(C11771R.C11775id.bic_bankcode_helper);
        m53322e();
        m53324f();
    }
}
