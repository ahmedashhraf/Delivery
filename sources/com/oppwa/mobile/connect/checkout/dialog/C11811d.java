package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import androidx.annotation.C0195i0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.dialog.C11887q.C11889b;
import com.oppwa.mobile.connect.checkout.meta.CheckoutBrandDetectionType;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSkipCVVMode;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11779b;
import com.oppwa.mobile.connect.payment.CVVMode;
import com.oppwa.mobile.connect.payment.CardBrandInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.payment.token.TokenPaymentParams;
import io.card.payment.CardIOActivity;
import io.card.payment.CreditCard;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import p205i.p489f.C14069f;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.d */
public class C11811d extends C11801b0 implements C11889b, C11886b {
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public InputLayout f34157b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public InputLayout f34158c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public InputLayout f34159d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public InputLayout f34160e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public InputLayout f34161f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public InputLayout f34162g0;

    /* renamed from: h0 */
    private Spinner f34163h0;
    /* access modifiers changed from: private */

    /* renamed from: i0 */
    public ImageView f34164i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public ImageView f34165j0;

    /* renamed from: k0 */
    private LinearLayout f34166k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public ScrollView f34167l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public CardBrandSelectionLayout f34168m0;

    /* renamed from: n0 */
    private C11836f1 f34169n0;

    /* renamed from: o0 */
    private C11911v0 f34170o0;

    /* renamed from: p0 */
    private String f34171p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public String f34172q0 = null;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public StringBuilder f34173r0 = new StringBuilder();

    /* renamed from: s0 */
    private CardBrandInfo f34174s0;

    /* renamed from: t0 */
    private int f34175t0 = 0;

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$a */
    class C11812a implements TextWatcher {
        C11812a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C11811d.this.f34161f0.getEditText().length() == 0) {
                C11811d.this.f34161f0.getEditText().setText(C14069f.f41344H);
                C11811d.this.f34161f0.mo40336f();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$b */
    class C11813b implements OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextWatcher f34177a;

        C11813b(TextWatcher textWatcher) {
            this.f34177a = textWatcher;
        }

        public void onFocusChange(View view, boolean z) {
            String str = C14069f.f41344H;
            String str2 = "";
            if (!z) {
                C11811d.this.f34161f0.getEditText().removeTextChangedListener(this.f34177a);
                if (C11811d.this.f34161f0.getText().equals(str)) {
                    C11811d.this.f34161f0.setText(str2);
                }
                C11811d.this.f34161f0.mo40337g();
                C11811d.this.f34162g0.mo40337g();
                return;
            }
            C11811d.this.f34161f0.getEditText().addTextChangedListener(this.f34177a);
            if (C11811d.this.f34161f0.getText().equals(str2)) {
                C11811d.this.f34161f0.setText(str);
            }
            C11811d.this.f34161f0.mo40332b();
            C11811d.this.f34162g0.mo40332b();
            C11811d.this.f34161f0.mo40336f();
            C11811d dVar = C11811d.this;
            dVar.m53147a((View) dVar.f34161f0);
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$c */
    class C11814c implements OnFocusChangeListener {
        C11814c() {
        }

        public void onFocusChange(View view, boolean z) {
            InputLayout m = C11811d.this.f34161f0;
            if (!z) {
                m.mo40337g();
                C11811d.this.f34162g0.mo40337g();
                return;
            }
            m.mo40332b();
            C11811d.this.f34162g0.mo40332b();
            C11811d dVar = C11811d.this;
            dVar.m53147a((View) dVar.f34162g0);
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$d */
    class C11815d implements C11786d {
        C11815d() {
        }

        /* renamed from: a */
        public void mo40323a(String str) {
            C11811d.this.f34172q0 = str;
            C11811d.this.m53152a(str);
            if (C11811d.this.f34168m0.getCardBrands().length == 1) {
                C11811d.this.m53137P();
            }
            if (!C11811d.this.f34111P.mo40667F()) {
                C11811d.this.m53139R();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$e */
    class C11816e implements C11792e {
        C11816e() {
        }

        /* renamed from: a */
        public void mo40360a(Editable editable) {
        }

        /* renamed from: a */
        public void mo40361a(boolean z) {
            if (z) {
                C11811d dVar = C11811d.this;
                dVar.m53147a((View) dVar.f34159d0);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$f */
    class C11817f implements C11792e {
        C11817f() {
        }

        /* renamed from: a */
        public void mo40360a(Editable editable) {
        }

        /* renamed from: a */
        public void mo40361a(boolean z) {
            if (z) {
                C11811d dVar = C11811d.this;
                dVar.m53147a((View) dVar.f34160e0);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$g */
    class C11818g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f34183a;

        C11818g(View view) {
            this.f34183a = view;
        }

        public void run() {
            C11811d dVar = C11811d.this;
            int b = dVar.m53158b((View) dVar.f34119X);
            int b2 = C11811d.this.m53158b(this.f34183a);
            if (b < this.f34183a.getHeight() + b2) {
                C11811d.this.f34167l0.scrollBy(0, (b2 + this.f34183a.getHeight()) - b);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$h */
    class C11819h implements C11792e {
        C11819h() {
        }

        /* renamed from: a */
        public void mo40360a(Editable editable) {
            C11811d.this.m53151a((CharSequence) editable);
        }

        /* renamed from: a */
        public void mo40361a(boolean z) {
            if (z) {
                C11811d dVar = C11811d.this;
                dVar.m53151a((CharSequence) dVar.f34157b0.getEditText().getText());
                return;
            }
            C11779b.m52954b(C11811d.this.f34173r0);
            C11811d.this.m53139R();
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$i */
    class C11820i implements OnEditorActionListener {
        C11820i() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            (C11811d.this.m53123B() ? C11811d.this.f34159d0 : C11811d.this.f34158c0).getEditText().requestFocus();
            return true;
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$j */
    class C11821j implements Runnable {
        C11821j() {
        }

        public void run() {
            Bitmap a = C11887q.m53456a((Context) C11811d.this.getActivity()).mo40544a(C11811d.this.f34114S);
            if (a != null) {
                C11811d.this.f34164i0.setImageBitmap(a);
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$k */
    class C11822k implements OnClickListener {
        C11822k() {
        }

        public void onClick(View view) {
            if (C11811d.this.f34165j0.getVisibility() != 0) {
                return;
            }
            if (C11811d.this.f34168m0.mo40315b()) {
                C11811d.this.m53139R();
            } else {
                C11811d.this.m53138Q();
            }
        }
    }

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.d$l */
    class C11823l implements OnClickListener {
        C11823l() {
        }

        public void onClick(View view) {
            C11811d.this.m53125D();
        }
    }

    /* renamed from: A */
    private boolean m53122A() {
        CheckoutSkipCVVMode B = this.f34111P.mo40663B();
        if (this.f34174s0.mo40818b() == CVVMode.NONE || B == CheckoutSkipCVVMode.ALWAYS) {
            return true;
        }
        boolean z = false;
        if (this.f34115T != null && (B == CheckoutSkipCVVMode.FOR_STORED_CARDS || m53199z())) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean m53123B() {
        return !this.f34111P.mo40666E();
    }

    /* renamed from: C */
    private void m53124C() {
        int i;
        InputLayout inputLayout;
        if (m53122A()) {
            this.f34160e0.setVisibility(8);
            ((MarginLayoutParams) this.f34159d0.getLayoutParams()).setMarginEnd(0);
            return;
        }
        this.f34160e0.setVisibility(0);
        if (this.f34174s0.mo40813a() == 4) {
            inputLayout = this.f34160e0;
            i = C11771R.string.checkout_helper_security_code_amex;
        } else {
            inputLayout = this.f34160e0;
            i = C11771R.string.checkout_helper_security_code;
        }
        inputLayout.setHelperText(getString(i));
        this.f34160e0.getEditText().setInputType(2);
        this.f34160e0.getEditText().setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.f34160e0.setHint(getString(C11771R.string.checkout_layout_hint_card_cvv));
        this.f34160e0.getEditText().setFilters(new InputFilter[]{new LengthFilter(this.f34174s0.mo40813a())});
        this.f34160e0.setInputValidator(C11923z0.m53610a(this.f34174s0.mo40813a()));
        if (this.f34174s0.mo40818b() == CVVMode.OPTIONAL) {
            this.f34160e0.setOptional(true);
        } else {
            this.f34160e0.setOptional(false);
        }
        if (this.f34175t0 == 1) {
            this.f34160e0.mo40335e();
        }
        this.f34160e0.setListener(new C11817f());
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public void m53125D() {
        Intent intent = new Intent(getActivity(), CardIOActivity.class);
        intent.putExtra("io.card.payment.intentSenderIsPayPal", false);
        intent.putExtra("io.card.payment.hideLogo", true);
        intent.putExtra("io.card.payment.scanExpiry", true);
        intent.putExtra("io.card.payment.requireExpiry", true);
        intent.putExtra("io.card.payment.suppressManual", true);
        startActivityForResult(intent, 100);
    }

    /* renamed from: E */
    private PaymentParams m53126E() {
        if (!m53131J()) {
            return null;
        }
        try {
            CardPaymentParams cardPaymentParams = new CardPaymentParams(this.f34111P.mo40717i(), this.f34114S, m53160b((CharSequence) this.f34157b0.getText()).toString(), this.f34158c0.getText(), m53128G(), m53129H(), m53130I());
            cardPaymentParams.mo40949a(mo40412e());
            if (this.f34174s0.mo40831m()) {
                String text = this.f34161f0.getText();
                String text2 = this.f34162g0.getText();
                cardPaymentParams.mo40950f(text.replace(C14069f.f41344H, ""));
                cardPaymentParams.mo40951g(text2);
            }
            if (this.f34111P.mo40669H()) {
                cardPaymentParams.mo40948a((Integer) this.f34163h0.getSelectedItem());
            }
            return cardPaymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    /* renamed from: F */
    private PaymentParams m53127F() {
        if (!m53122A() && !this.f34160e0.mo40337g()) {
            return null;
        }
        try {
            TokenPaymentParams tokenPaymentParams = new TokenPaymentParams(this.f34111P.mo40717i(), this.f34115T.mo41013j(), this.f34114S, m53130I());
            if (this.f34111P.mo40669H()) {
                tokenPaymentParams.mo41019a((Integer) this.f34163h0.getSelectedItem());
            }
            return tokenPaymentParams;
        } catch (PaymentException unused) {
            return null;
        }
    }

    @C0195i0
    /* renamed from: G */
    private String m53128G() {
        if (!this.f34174s0.mo40829k() || !this.f34159d0.mo40334d()) {
            return C11779b.m52947a(this.f34170o0.mo40595a());
        }
        return null;
    }

    @C0195i0
    /* renamed from: H */
    private String m53129H() {
        if (!this.f34174s0.mo40829k() || !this.f34159d0.mo40334d()) {
            return C11779b.m52947a(this.f34170o0.mo40596b());
        }
        return null;
    }

    @C0195i0
    /* renamed from: I */
    private String m53130I() {
        if (m53122A() || (this.f34174s0.mo40818b() == CVVMode.OPTIONAL && this.f34160e0.mo40334d())) {
            return null;
        }
        return C11779b.m52947a(this.f34160e0.getText());
    }

    /* renamed from: J */
    private boolean m53131J() {
        boolean z = m53123B() || this.f34158c0.mo40337g();
        if (!this.f34157b0.mo40337g()) {
            z = false;
        }
        if (!this.f34159d0.mo40337g()) {
            z = false;
        }
        if (!m53122A() && !this.f34160e0.mo40337g()) {
            z = false;
        }
        if (!this.f34174s0.mo40831m()) {
            return z;
        }
        if (!this.f34161f0.mo40337g()) {
            z = false;
        }
        if (!this.f34162g0.mo40337g()) {
            return false;
        }
        return z;
    }

    /* renamed from: K */
    private void m53132K() {
        this.f34157b0.getEditText().setImeOptions(5);
        this.f34158c0.getEditText().setImeOptions(5);
        this.f34159d0.getEditText().setImeOptions(5);
        this.f34160e0.getEditText().setImeOptions(5);
        this.f34161f0.getEditText().setImeOptions(5);
        this.f34162g0.getEditText().setImeOptions(5);
        InputLayout inputLayout = this.f34174s0.mo40831m() ? this.f34162g0 : m53122A() ? this.f34159d0 : this.f34160e0;
        inputLayout.getEditText().setImeOptions(6);
    }

    /* renamed from: L */
    private void m53133L() {
        if (this.f34165j0.getVisibility() == 8) {
            InputLayout inputLayout = this.f34157b0;
            inputLayout.setPaddingStart(inputLayout.getPaddingStart() + this.f34165j0.getDrawable().getIntrinsicWidth());
            this.f34165j0.setVisibility(0);
        }
    }

    /* renamed from: M */
    private void m53134M() {
        this.f34165j0.setImageResource(C11771R.C11774drawable.collapse);
        this.f34165j0.setTag("Collapse");
    }

    /* renamed from: N */
    private void m53135N() {
        this.f34165j0.setImageResource(C11771R.C11774drawable.expand);
        this.f34165j0.setTag("Expand");
    }

    /* renamed from: O */
    private void m53136O() {
        if (!this.f34111P.mo40667F()) {
            m53133L();
        } else {
            m53138Q();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m53137P() {
        if (!this.f34111P.mo40667F()) {
            m53195v();
        }
        m53139R();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m53138Q() {
        if (!this.f34111P.mo40667F()) {
            m53134M();
        }
        this.f34168m0.mo40316c();
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public void m53139R() {
        if (!this.f34111P.mo40667F()) {
            m53135N();
        }
        this.f34168m0.mo40312a();
    }

    /* renamed from: S */
    private void m53140S() {
        if (m53123B()) {
            this.f34158c0.setVisibility(8);
            return;
        }
        this.f34158c0.getEditText().setFilters(new InputFilter[]{new LengthFilter(getResources().getInteger(C11771R.integer.cardHolderMaxLength))});
        this.f34158c0.getEditText().setInputType(528384);
        this.f34158c0.setHint(getString(C11771R.string.checkout_layout_hint_card_holder));
        this.f34158c0.getEditText().setContentDescription(getString(C11771R.string.checkout_layout_hint_card_holder));
        this.f34158c0.setHelperText(getString(C11771R.string.checkout_helper_card_holder));
        this.f34158c0.setInputValidator(C11923z0.m53609a());
        this.f34158c0.setOptional(true);
        this.f34158c0.setPaymentFormListener(this.f34111P.mo40731v());
    }

    /* renamed from: T */
    private void m53141T() {
        this.f34161f0.getEditText().setFilters(new InputFilter[]{new LengthFilter(getResources().getInteger(C11771R.integer.countryCodeMaxLegth))});
        this.f34161f0.setVisibility(0);
        this.f34161f0.clearFocus();
        this.f34161f0.getEditText().setInputType(524290);
        this.f34161f0.setHelperText(getString(C11771R.string.checkout_helper_country_code));
        this.f34161f0.setInputValidator(C11923z0.m53614b());
        this.f34161f0.getEditText().setOnFocusChangeListener(new C11813b(new C11812a()));
    }

    /* renamed from: U */
    private void m53142U() {
        this.f34162g0.setVisibility(0);
        this.f34162g0.clearFocus();
        this.f34162g0.getEditText().setFilters(new InputFilter[]{new LengthFilter(getResources().getInteger(C11771R.integer.mobilePhoneNumberMaxLength))});
        this.f34162g0.getEditText().setInputType(524290);
        this.f34162g0.setHint(getString(C11771R.string.checkout_layout_hint_phone_number));
        this.f34162g0.setHelperText(getString(C11771R.string.checkout_helper_phone_number));
        this.f34162g0.setInputValidator(C11923z0.m53615c());
        this.f34162g0.getEditText().setOnFocusChangeListener(new C11814c());
    }

    /* renamed from: a */
    private InputFilter m53143a(int i) {
        return new LengthFilter(i);
    }

    /* renamed from: a */
    private String m53146a(CharSequence charSequence, String str) {
        if (charSequence.length() <= str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length() - str.length(); i++) {
            sb.append("#");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(sb.toString());
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53147a(View view) {
        view.postDelayed(new C11818g(view), 300);
    }

    /* renamed from: a */
    private void m53150a(CardBrandInfo cardBrandInfo) {
        String a = m53146a((CharSequence) this.f34157b0.getEditText().getText(), cardBrandInfo.mo40827i());
        m53163b(a);
        m53153a(a, cardBrandInfo.mo40830l());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53151a(CharSequence charSequence) {
        StringBuilder b = m53160b(charSequence);
        if (!C11779b.m52952a(b, this.f34173r0)) {
            C11779b.m52954b(this.f34173r0);
            this.f34173r0 = b;
            m53154a(this.f34173r0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m53152a(String str) {
        this.f34114S = str;
        this.f34174s0 = this.f34113R.mo40790a(str);
        this.f34159d0.setOptional(this.f34174s0.mo40829k());
        m53191o();
        m53150a(this.f34174s0);
        m53124C();
        m53132K();
        m53172f();
    }

    /* renamed from: a */
    private void m53153a(String str, boolean z) {
        this.f34157b0.getEditText().removeTextChangedListener(this.f34169n0);
        this.f34169n0 = m53170d(str);
        this.f34157b0.getEditText().addTextChangedListener(this.f34169n0);
        this.f34157b0.setInputValidator(C11923z0.m53613a(this.f34113R.mo40797c(this.f34114S), this.f34169n0, z));
        this.f34157b0.getEditText().setText(this.f34157b0.getEditText().getText().toString());
        this.f34157b0.mo40336f();
    }

    /* renamed from: a */
    private void m53154a(StringBuilder sb) {
        if (sb.length() >= 4) {
            if (this.f34111P.mo40693b().equals(CheckoutBrandDetectionType.REGEX)) {
                m53164b(sb);
            } else {
                m53167c(sb);
            }
        } else if (sb.length() > 0) {
            m53137P();
        } else {
            m53187m();
        }
    }

    /* renamed from: a */
    private void m53155a(List<String> list, String str) {
        boolean z = false;
        if (list.size() == 1 && this.f34172q0 != null && !((String) list.get(0)).equalsIgnoreCase(this.f34172q0)) {
            z = true;
        }
        if (list.size() > 1 || z) {
            String str2 = this.f34172q0;
            if (str2 != null) {
                str = str2;
            }
            this.f34168m0.mo40314a((String[]) list.toArray(new String[list.size()]), this.f34114S);
            this.f34168m0.setSelectedBrand(str);
            m53136O();
            return;
        }
        m53137P();
    }

    /* renamed from: a */
    private void m53156a(List<String> list, boolean z) {
        if (list == null || list.isEmpty() || z) {
            m53137P();
        } else {
            String str = this.f34172q0;
            String str2 = (str == null || str.equalsIgnoreCase("CARD")) ? (String) list.get(0) : this.f34172q0;
            m53155a(list, str2);
            m53152a(str2);
        }
        m53157a(z);
    }

    /* renamed from: a */
    private void m53157a(boolean z) {
        String str;
        if (z && !this.f34157b0.mo40333c()) {
            this.f34157b0.mo40331a(getString(C11771R.string.checkout_error_card_number_invalid));
            str = "CARD";
        } else if (!z && this.f34157b0.mo40333c()) {
            this.f34157b0.mo40332b();
            str = this.f34172q0;
            if (str == null) {
                return;
            }
        } else {
            return;
        }
        m53152a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public int m53158b(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr[1];
    }

    /* renamed from: b */
    private StringBuilder m53160b(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence);
        C11779b.m52948a(sb);
        C11779b.m52949a(sb, C3868i.f12248b);
        return sb;
    }

    /* renamed from: b */
    private void m53163b(String str) {
        this.f34157b0.getEditText().setFilters(new InputFilter[]{m53143a(str == null ? getResources().getInteger(C11771R.integer.cardNumberMaxLength) : str.length())});
    }

    /* renamed from: b */
    private void m53164b(StringBuilder sb) {
        m53156a(this.f34113R.mo40792a(sb.toString(), this.f34171p0), false);
    }

    /* renamed from: c */
    private int m53165c(int i) {
        return (int) getResources().getDimension(i);
    }

    /* renamed from: c */
    private void m53167c(StringBuilder sb) {
        String sb2 = sb.toString();
        if (m53168c(sb2)) {
            C11884p0.m53438b().mo40536a(this.f34116U, this.f34111P.mo40717i(), sb2, this.f34113R);
        }
        String[] a = C11884p0.m53438b().mo40537a(sb2);
        if (a == null) {
            m53164b(sb);
        } else {
            m53156a(Arrays.asList(a), a.length == 0);
        }
    }

    /* renamed from: c */
    private boolean m53168c(String str) {
        long length = (long) str.length();
        return (length == 6 || length == 10 || length == 16) && !C11884p0.m53438b().mo40539b(str);
    }

    /* renamed from: d */
    private C11836f1 m53170d(String str) {
        C11836f1 f1Var = new C11836f1(Character.valueOf(' '), str);
        f1Var.mo40461a(true);
        return f1Var;
    }

    /* renamed from: f */
    private void m53172f() {
        if (this.f34174s0.mo40831m()) {
            if (VERSION.SDK_INT >= 17 && this.f34175t0 == 1) {
                this.f34166k0.setLayoutDirection(0);
                this.f34161f0.mo40335e();
                this.f34162g0.mo40335e();
            }
            m53141T();
            m53142U();
            return;
        }
        this.f34161f0.setVisibility(8);
        this.f34162g0.setVisibility(8);
    }

    /* renamed from: g */
    private void m53175g() {
        if (this.f34115T.mo41008c().mo40999i() != null) {
            this.f34158c0.setHint(getString(C11771R.string.checkout_layout_hint_card_holder));
            this.f34158c0.setNotEditableText(this.f34115T.mo41008c().mo40999i());
        } else {
            this.f34158c0.setVisibility(8);
        }
        this.f34157b0.setHint(getString(C11771R.string.checkout_layout_hint_card_number));
        InputLayout inputLayout = this.f34157b0;
        StringBuilder sb = new StringBuilder();
        sb.append("•••• ");
        sb.append(this.f34115T.mo41008c().mo41000j());
        inputLayout.setNotEditableText(sb.toString());
        m53197x();
        m53124C();
    }

    /* renamed from: h */
    private void m53177h() {
        this.f34168m0.setListener(new C11815d());
    }

    /* renamed from: i */
    private void m53179i() {
        int c = m53165c(C11771R.dimen.checkout_card_number_input_layout_height);
        this.f34157b0.getEditText().setInputType(524290);
        this.f34157b0.setHint(getString(C11771R.string.checkout_layout_hint_card_number));
        this.f34157b0.getEditText().setContentDescription(getString(C11771R.string.checkout_layout_hint_card_number));
        this.f34157b0.setHelperText(getString(C11771R.string.checkout_helper_card_number));
        this.f34157b0.getEditText().getLayoutParams().height = c;
        this.f34157b0.setPaddingStart(m53165c(C11771R.dimen.card_brand_logo_width) + m53165c(C11771R.dimen.checkout_input_layout_drawable_padding));
        if (this.f34175t0 == 1) {
            this.f34157b0.mo40335e();
        }
        m53181j();
        m53184l();
    }

    /* renamed from: j */
    private void m53181j() {
        this.f34157b0.setListener(new C11819h());
    }

    /* renamed from: k */
    private void m53182k() {
        this.f34172q0 = this.f34171p0.equalsIgnoreCase("CARD") ? null : this.f34171p0;
    }

    /* renamed from: l */
    private void m53184l() {
        this.f34157b0.getEditText().setOnEditorActionListener(new C11820i());
    }

    /* renamed from: m */
    private void m53187m() {
        m53182k();
        m53137P();
        m53189n();
    }

    /* renamed from: n */
    private void m53189n() {
        if (!this.f34114S.equalsIgnoreCase(this.f34171p0)) {
            m53152a(this.f34171p0);
        }
    }

    /* renamed from: o */
    private void m53191o() {
        getActivity().runOnUiThread(new C11821j());
    }

    /* renamed from: p */
    private void m53193p() {
        FrameLayout frameLayout = (FrameLayout) getView().findViewById(C11771R.C11775id.ic_brand);
        frameLayout.setVisibility(0);
        frameLayout.findViewById(C11771R.C11775id.loading_panel).setVisibility(4);
        this.f34164i0 = (ImageView) frameLayout.findViewById(C11771R.C11775id.card_brand_logo);
        this.f34165j0 = (ImageView) frameLayout.findViewById(C11771R.C11775id.expand_brand_selection_imageview);
        this.f34165j0.setTag("Expand");
        if (!this.f34111P.mo40667F()) {
            frameLayout.setOnClickListener(new C11822k());
        }
    }

    /* renamed from: r */
    private void m53194r() {
        if (this.f34115T == null && C11825d1.f34191b) {
            ImageView imageView = (ImageView) getView().findViewById(C11771R.C11775id.ic_camera);
            this.f34157b0.setPaddingEnd(imageView.getDrawable().getIntrinsicWidth() + m53165c(C11771R.dimen.checkout_input_layout_drawable_padding));
            imageView.setVisibility(0);
            imageView.setOnClickListener(new C11823l());
        }
    }

    /* renamed from: v */
    private void m53195v() {
        if (this.f34165j0.getVisibility() == 0) {
            InputLayout inputLayout = this.f34157b0;
            inputLayout.setPaddingStart(inputLayout.getPaddingStart() - this.f34165j0.getDrawable().getIntrinsicWidth());
            this.f34165j0.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m53196w() {
        this.f34170o0 = new C11911v0(Character.valueOf('/'), 2);
        this.f34159d0.getEditText().addTextChangedListener(this.f34170o0);
        this.f34159d0.getEditText().setFilters(new InputFilter[]{new LengthFilter(getResources().getInteger(C11771R.integer.cardExpirationDateMaxLength))});
        this.f34159d0.getEditText().setInputType(524290);
        this.f34159d0.setHint(getString(C11771R.string.checkout_layout_hint_card_expiration_date));
        this.f34159d0.getEditText().setContentDescription(getString(C11771R.string.checkout_layout_hint_card_expiration_date));
        this.f34159d0.setHelperText(getString(C11771R.string.checkout_helper_expiration_date));
        this.f34159d0.setInputValidator(C11923z0.m53611a(this.f34170o0));
        if (this.f34175t0 == 1) {
            this.f34159d0.mo40335e();
        }
        this.f34159d0.setListener(new C11816e());
    }

    /* renamed from: x */
    private void m53197x() {
        String b = this.f34115T.mo41008c().mo40994b();
        String c = this.f34115T.mo41008c().mo40995c();
        this.f34159d0.setHint(getString(C11771R.string.checkout_layout_hint_card_expiration_date));
        InputLayout inputLayout = this.f34159d0;
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append("/");
        sb.append(c);
        inputLayout.setNotEditableText(sb.toString());
        if (m53199z()) {
            this.f34159d0.mo40331a(getString(C11771R.string.checkout_error_expiration_date));
            this.f34119X.setVisibility(8);
        }
    }

    /* renamed from: y */
    private void m53198y() {
        if ((this.f34115T == null || !m53199z()) && this.f34111P.mo40669H()) {
            this.f34167l0.findViewById(C11771R.C11775id.number_of_installments_layout).setVisibility(0);
            this.f34163h0.setAdapter(new ArrayAdapter(getActivity(), C11771R.layout.opp_item_installments, this.f34111P.mo40722n()));
            this.f34163h0.setSelection(0);
        }
    }

    /* renamed from: z */
    private boolean m53199z() {
        Token token = this.f34115T;
        if (token != null) {
            return CardPaymentParams.m53953c(token.mo41008c().mo40994b(), this.f34115T.mo41008c().mo40995c());
        }
        return false;
    }

    /* renamed from: a */
    public void mo40432a(String str, String[] strArr) {
        if (this.f34173r0.indexOf(str) == 0 && this.f34157b0.hasFocus()) {
            m53154a(this.f34173r0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo40403c() {
        if (this.f34115T == null) {
            this.f34157b0.mo40330a();
            this.f34159d0.mo40330a();
            this.f34161f0.mo40330a();
            this.f34162g0.mo40330a();
            m53187m();
        }
        this.f34160e0.mo40330a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public PaymentParams mo40404d() {
        return this.f34115T == null ? m53126E() : m53127F();
    }

    /* renamed from: e */
    public void mo40406e(String str) {
        super.mo40406e(str);
        if (str.equals(this.f34114S)) {
            m53191o();
        }
        CardBrandSelectionLayout cardBrandSelectionLayout = this.f34168m0;
        if (cardBrandSelectionLayout != null) {
            cardBrandSelectionLayout.mo40313a(str);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (intent != null) {
                String str = "io.card.payment.scanResult";
                if (intent.hasExtra(str)) {
                    CreditCard parcelableExtra = intent.getParcelableExtra(str);
                    this.f34157b0.setText(parcelableExtra.getFormattedCardNumber());
                    this.f34157b0.mo40336f();
                    if (parcelableExtra.isExpiryValid()) {
                        DecimalFormat decimalFormat = new DecimalFormat("00");
                        InputLayout inputLayout = this.f34159d0;
                        StringBuilder sb = new StringBuilder();
                        sb.append(decimalFormat.format((long) parcelableExtra.expiryMonth));
                        sb.append(String.valueOf(parcelableExtra.expiryYear));
                        inputLayout.setText(sb.toString());
                    }
                }
            }
            this.f34157b0.requestFocus();
        }
    }

    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        this.f34171p0 = this.f34114S;
        m53182k();
    }

    @C0195i0
    public View onCreateView(LayoutInflater layoutInflater, @C0195i0 ViewGroup viewGroup, @C0195i0 Bundle bundle) {
        return layoutInflater.inflate(C11771R.layout.opp_fragment_card_payment_info, viewGroup, false);
    }

    public void onDetach() {
        super.onDetach();
        C11884p0.m53438b().mo40534a();
    }

    public void onStart() {
        super.onStart();
        C11884p0.m53438b().mo40535a((C11886b) this);
    }

    public void onStop() {
        super.onStop();
        C11884p0.m53438b().mo40538b((C11886b) this);
    }

    public void onViewCreated(View view, @C0195i0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f34175t0 = getResources().getConfiguration().getLayoutDirection();
        this.f34157b0 = (InputLayout) view.findViewById(C11771R.C11775id.number_input_layout);
        this.f34158c0 = (InputLayout) view.findViewById(C11771R.C11775id.holder_input_layout);
        this.f34159d0 = (InputLayout) view.findViewById(C11771R.C11775id.expiry_date_input_layout);
        this.f34160e0 = (InputLayout) view.findViewById(C11771R.C11775id.cvv_input_layout);
        this.f34161f0 = (InputLayout) view.findViewById(C11771R.C11775id.country_code_input_layout);
        this.f34162g0 = (InputLayout) view.findViewById(C11771R.C11775id.phone_number_input_layout);
        this.f34166k0 = (LinearLayout) view.findViewById(C11771R.C11775id.country_code_and_phone_number);
        this.f34167l0 = (ScrollView) view.findViewById(C11771R.C11775id.payment_info_scroll_view);
        this.f34163h0 = (Spinner) view.findViewById(C11771R.C11775id.number_of_installments_spinner);
        Token token = this.f34115T;
        if (token == null) {
            this.f34168m0 = (CardBrandSelectionLayout) view.findViewById(C11771R.C11775id.card_brand_selection_layout);
            m53177h();
            m53140S();
            m53193p();
            m53179i();
            m53194r();
            m53196w();
            m53152a(this.f34114S);
        } else {
            this.f34174s0 = this.f34113R.mo40790a(token.mo41012i());
            view.findViewById(C11771R.C11775id.payment_info_header).setVisibility(0);
            m53175g();
        }
        m53198y();
    }
}
