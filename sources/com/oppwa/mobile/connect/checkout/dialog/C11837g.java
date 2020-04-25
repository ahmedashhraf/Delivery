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
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.g */
public class C11837g extends C11801b0 {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public TextInputLayout f34215b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public EditText f34216c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public TextView f34217d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public TextInputLayout f34218e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public EditText f34219f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public TextView f34220g0;

    /* renamed from: h0 */
    private C11836f1 f34221h0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.g$a */
    class C11838a implements OnFocusChangeListener {
        C11838a() {
        }

        public void onFocusChange(View view, boolean z) {
            C11837g gVar = C11837g.this;
            if (!z) {
                gVar.m53244a(gVar.f34216c0.getText().toString());
            } else {
                gVar.mo40401a(gVar.f34215b0, C11837g.this.f34217d0);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.g$b */
    class C11839b implements OnFocusChangeListener {
        C11839b() {
        }

        public void onFocusChange(View view, boolean z) {
            C11837g gVar = C11837g.this;
            if (!z) {
                gVar.m53248b(gVar.f34219f0.getText().toString());
            } else {
                gVar.mo40401a(gVar.f34218e0, C11837g.this.f34220g0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean m53244a(String str) {
        if (!BankAccountPaymentParams.m53919l(str.trim())) {
            mo40402a(this.f34215b0, this.f34217d0, getString(C11771R.string.checkout_error_account_holder_invalid));
            return false;
        }
        mo40401a(this.f34215b0, this.f34217d0);
        return true;
    }

    /* renamed from: a */
    private boolean m53245a(String str, String str2) {
        boolean a = m53244a(str);
        if (!m53248b(str2)) {
            return false;
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m53248b(String str) {
        if (!BankAccountPaymentParams.m53920m(this.f34221h0.mo40460a(str))) {
            mo40402a(this.f34218e0, this.f34220g0, getString(C11771R.string.checkout_error_iban_invalid));
            return false;
        }
        mo40401a(this.f34218e0, this.f34220g0);
        return true;
    }

    /* renamed from: f */
    private void m53253f() {
        this.f34215b0.setErrorEnabled(true);
        this.f34216c0.setContentDescription(getString(C11771R.string.checkout_layout_hint_direct_debit_sepa_account_holder));
        this.f34216c0.setOnFocusChangeListener(new C11838a());
    }

    /* renamed from: g */
    private void m53254g() {
        this.f34216c0.setText(this.f34115T.mo41007b().mo40984b());
        this.f34216c0.setFocusable(false);
        this.f34216c0.setBackgroundResource(0);
        this.f34217d0.setVisibility(4);
    }

    /* renamed from: h */
    private void m53255h() {
        this.f34218e0.setErrorEnabled(true);
        this.f34219f0.setContentDescription(getString(C11771R.string.checkout_layout_hint_direct_debit_sepa_iban));
        this.f34221h0 = new C11836f1(Character.valueOf(' '), "#### #### #### #### #### #### #### ###");
        this.f34219f0.addTextChangedListener(this.f34221h0);
        this.f34219f0.setFilters(new InputFilter[]{new C11873m0(false), new LengthFilter(38)});
        this.f34219f0.setOnFocusChangeListener(new C11839b());
    }

    /* renamed from: i */
    private void m53256i() {
        this.f34221h0 = new C11836f1(Character.valueOf(' '), "#### #### #### #### #### #### #### ###");
        this.f34219f0.addTextChangedListener(this.f34221h0);
        this.f34219f0.setText(this.f34115T.mo41007b().mo40985c());
        this.f34219f0.setFocusable(false);
        this.f34219f0.setBackgroundResource(0);
        this.f34220g0.setVisibility(4);
    }

    /* renamed from: j */
    private PaymentParams m53257j() {
        String i = this.f34111P.mo40717i();
        String obj = this.f34216c0.getText().toString();
        String obj2 = this.f34219f0.getText().toString();
        if (!m53245a(obj, obj2)) {
            return null;
        }
        try {
            return BankAccountPaymentParams.m53910a(i, obj, this.f34221h0.mo40460a(obj2), mo40412e());
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private PaymentParams m53258l() {
        try {
            return new TokenPaymentParams(this.f34111P.mo40717i(), this.f34115T.mo41013j(), this.f34114S);
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
        if (this.f34115T == null) {
            String str = "";
            this.f34216c0.setText(str);
            this.f34219f0.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        return this.f34115T == null ? m53257j() : m53258l();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_direct_debit_sepa_payment_info, viewGroup, false);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34215b0 = (TextInputLayout) view.findViewById(C11771R.C11775id.holder_text_input_layout);
        this.f34216c0 = (EditText) view.findViewById(C11771R.C11775id.holder_edit_text);
        this.f34217d0 = (TextView) view.findViewById(C11771R.C11775id.holder_helper);
        this.f34218e0 = (TextInputLayout) view.findViewById(C11771R.C11775id.iban_text_input_layout);
        this.f34219f0 = (EditText) view.findViewById(C11771R.C11775id.iban_edit_text);
        this.f34220g0 = (TextView) view.findViewById(C11771R.C11775id.iban_helper);
        if (this.f34115T == null) {
            m53253f();
            m53255h();
            return;
        }
        m53254g();
        m53256i();
    }
}
