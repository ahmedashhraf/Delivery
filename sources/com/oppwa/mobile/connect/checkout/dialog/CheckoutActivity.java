package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.core.app.C0727a;
import com.mrsool.chat.C10526n.C10527a;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.Transaction;

public final class CheckoutActivity extends C11803c {

    /* renamed from: b0 */
    public static final String f34061b0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_SETTINGS";

    /* renamed from: c0 */
    public static final String f34062c0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_RECEIVER";

    /* renamed from: d0 */
    public static final String f34063d0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_PAYMENT_BUTTON_METHOD";
    @Deprecated

    /* renamed from: e0 */
    public static final int f34064e0 = 242;

    /* renamed from: f0 */
    public static final int f34065f0 = 242;

    /* renamed from: g0 */
    public static final int f34066g0 = 100;

    /* renamed from: h0 */
    public static final int f34067h0 = 101;

    /* renamed from: i0 */
    public static final int f34068i0 = 102;

    /* renamed from: j0 */
    public static final String f34069j0 = "com.oppwa.mobile.connect.checkout.dialog.action.ACTION_ON_BEFORE_SUBMIT";
    @Deprecated

    /* renamed from: k0 */
    public static final String f34070k0 = "com.oppwa.mobile.connect.checkout.ACTION_PAYMENT_METHOD_SELECTED";

    /* renamed from: l0 */
    public static final String f34071l0 = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_SETTINGS";

    /* renamed from: m0 */
    public static final String f34072m0 = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_TRANSACTION";

    /* renamed from: n0 */
    public static final String f34073n0 = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_RESOURCE_PATH";

    /* renamed from: o0 */
    public static final String f34074o0 = "com.oppwa.mobile.connect.checkout.dialog.CHECKOUT_RESULT_ERROR";

    /* renamed from: p0 */
    public static final String f34075p0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_PAYMENT_BRAND";

    /* renamed from: q0 */
    public static final String f34076q0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_ID";

    /* renamed from: r0 */
    public static final String f34077r0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_GOOGLE_PAY_PAYMENT_DATA";

    /* renamed from: s0 */
    public static final String f34078s0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_TRANSACTION_ABORTED";

    /* renamed from: t0 */
    public static final String f34079t0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_ORDER_SUMMARY";

    /* renamed from: u0 */
    public static final String f34080u0 = "com.oppwa.mobile.connect.checkout.dialog.EXTRA_SENDER_COMPONENT_NAME";

    /* renamed from: com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity$a */
    class C11787a implements Runnable {
        C11787a() {
        }

        public void run() {
            CheckoutActivity checkoutActivity = CheckoutActivity.this;
            checkoutActivity.mo40385a(checkoutActivity.f34102R, (Token) null);
        }
    }

    /* renamed from: C */
    private void m52984C() {
        Token token;
        if (this.f34105U.mo40622b() != null) {
            token = C11903s0.m53516a(this.f34102R, this.f34105U.mo40622b());
            if (token != null) {
                this.f34102R = token.mo41012i();
            }
        } else {
            token = null;
        }
        mo40385a(this.f34102R, token);
    }

    /* renamed from: a */
    private static void m52985a(Activity activity, CheckoutSettings checkoutSettings) {
        String a = C11825d1.m53211a(activity, checkoutSettings.mo40735y(), checkoutSettings.mo40717i());
        StringBuilder sb = new StringBuilder();
        sb.append("Checkout started:\n");
        sb.append(checkoutSettings.toString());
        sb.append("\n");
        sb.append(a);
        C11778a.m52935b(activity, checkoutSettings.mo40717i(), sb.toString(), checkoutSettings.mo40735y());
    }

    /* renamed from: a */
    private static void m52986a(Context context, String str, C11978a aVar, C11921z zVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Configured payment brands: ");
        sb.append(zVar.mo40616a().toString());
        C11778a.m52935b(context, str, sb.toString(), aVar);
    }

    /* renamed from: a */
    private static void m52987a(Context context, String str, String str2, C11978a aVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Checkout id was changed:\nNew checkout id: ");
        sb.append(str2);
        sb.append("\nOld checkout id: ");
        sb.append(str);
        C11778a.m52935b(context, str2, sb.toString(), aVar);
    }

    /* renamed from: a */
    private void m52988a(@C0193h0 Bundle bundle) {
        this.f34104T = (CheckoutInfo) bundle.getParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_CHECKOUT_INFO");
        this.f34103S = (BrandsValidation) bundle.getParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_BRANDS_VALIDATION");
        this.f34107W = (PaymentParams) bundle.getParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_PAYMENT_PARAMS");
    }

    /* renamed from: a */
    private void m52989a(@C0195i0 CheckoutSettings checkoutSettings) throws PaymentException {
        if (checkoutSettings != null) {
            if (checkoutSettings.mo40723o() == null) {
                checkoutSettings.mo40706e(C11802b1.m53072a((Context) this));
            }
            m52985a(this, checkoutSettings);
            return;
        }
        throw new PaymentException(PaymentError.m53763i());
    }

    /* renamed from: b */
    private void m52990b(Intent intent) throws PaymentException {
        if (!intent.getBooleanExtra(f34078s0, false)) {
            String stringExtra = intent.getStringExtra(f34076q0);
            if (!TextUtils.isEmpty(stringExtra)) {
                m52991d(stringExtra);
                return;
            }
            throw new PaymentException(PaymentError.m53779y());
        }
        throw new PaymentException(PaymentError.m53760N());
    }

    /* renamed from: d */
    private void m52991d(@C0193h0 String str) {
        String b = this.f34107W.mo40889b();
        String k = this.f34104T.mo40847k();
        if (!str.equals(b)) {
            this.f34107W.mo40893d(str);
            this.f34100P.mo40701c(str);
            if (k != null) {
                this.f34104T.mo40841c(k.replace(b, str));
            }
            m52987a((Context) this, b, str, this.f34100P.mo40735y());
        }
    }

    /* renamed from: o */
    private void m52992o() {
        if (this.f34100P.mo40665D() != 0) {
            setTheme(this.f34100P.mo40665D());
        }
        if (this.f34100P.mo40726r() != null) {
            C11903s0.m53518a(getBaseContext(), this.f34100P.mo40726r());
        }
    }

    /* renamed from: p */
    private void m52993p() {
        getWindow().setFlags(8192, 8192);
    }

    /* renamed from: r */
    private void m52994r() throws PaymentException {
        if (this.f34109a.mo40563a()) {
            mo40385a("CARD", (Token) null);
        } else if (!this.f34105U.mo40616a().isEmpty()) {
            mo40396g();
        } else {
            throw new PaymentException(PaymentError.m53764j());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Intent mo40324b(Transaction transaction, PaymentError paymentError) {
        Intent intent = new Intent();
        intent.putExtra(f34071l0, this.f34100P);
        intent.putExtra(f34072m0, transaction);
        intent.putExtra(f34074o0, paymentError);
        CheckoutInfo checkoutInfo = this.f34104T;
        if (checkoutInfo != null) {
            intent.putExtra(f34073n0, checkoutInfo.mo40847k());
        }
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo40325i() {
        if (!this.f34099O && this.f34103S != null) {
            this.f34099O = true;
            m52986a((Context) this, this.f34100P.mo40717i(), this.f34100P.mo40735y(), this.f34105U);
            C11778a.m52945e(this);
            try {
                if (this.f34110b == C11798a1.CHECKOUT_UI) {
                    m52994r();
                } else if (mo40397h()) {
                    m52984C();
                }
                mo40326k();
            } catch (PaymentException e) {
                mo40390c(null, e.mo40774a());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo40326k() {
        if (this.f34100P.mo40670I() && C11861i0.m53328a(this)) {
            C0727a.m4243a(this, new String[]{"android.permission.READ_PHONE_STATE"}, 1);
            return;
        }
        this.f34135Y = C11861i0.m53329b(this);
        mo40327n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo40327n() {
        if (!mo40397h()) {
            runOnUiThread(new C11787a());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(@C0195i0 Bundle bundle) {
        super.onCreate(bundle);
        C11778a.m52943d((Context) this);
        this.f34100P = (CheckoutSettings) getIntent().getParcelableExtra(f34061b0);
        this.f34101Q = (ComponentName) getIntent().getParcelableExtra(f34062c0);
        this.f34102R = getIntent().getStringExtra(f34063d0);
        this.f34110b = this.f34102R == null ? C11798a1.CHECKOUT_UI : C11798a1.PAYMENT_BUTTON;
        CheckoutSettings checkoutSettings = this.f34100P;
        if (checkoutSettings != null && checkoutSettings.mo40673L()) {
            m52993p();
        }
        setContentView(C11771R.layout.opp_activity_checkout);
        this.f34109a = new C11896r0(this);
        try {
            m52989a(this.f34100P);
            m52992o();
            C11903s0.m53519a(this, this.f34100P.mo40717i(), this.f34100P.mo40735y());
            this.f34108X = new C11863j0(this, this.f34100P);
            if (bundle != null) {
                m52988a(bundle);
            } else if (this.f34110b == C11798a1.CHECKOUT_UI) {
                mo40395f();
            }
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent.getAction();
        if (f34070k0.equals(action) || f34069j0.equals(action)) {
            try {
                m52990b(intent);
                OrderSummary orderSummary = (OrderSummary) intent.getParcelableExtra(f34079t0);
                if (orderSummary == null || !this.f34107W.mo40899j().equals(C10527a.f28541b)) {
                    mo40389c();
                    return;
                }
                this.f34098N = true;
                mo40382a(orderSummary);
            } catch (PaymentException e) {
                mo40390c(null, e.mo40774a());
            }
        }
    }

    public void onRequestPermissionsResult(int i, @C0193h0 String[] strArr, @C0193h0 int[] iArr) {
        if (i == 1) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f34135Y = C11861i0.m53329b(this);
            }
            mo40327n();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_CHECKOUT_INFO", this.f34104T);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_PAYMENT_PARAMS", this.f34107W);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.STATE_BRANDS_VALIDATION", this.f34103S);
        super.onSaveInstanceState(bundle);
    }
}
