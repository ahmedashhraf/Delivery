package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.appcompat.app.C0295d;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.mrsool.chat.C10526n.C10527a;
import com.mrsool.utils.C11644i;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.ErrorCode;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import com.oppwa.mobile.connect.provider.Transaction;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.a */
public abstract class C11794a extends C0295d implements C11909u0 {

    /* renamed from: N */
    protected boolean f34098N = true;

    /* renamed from: O */
    protected boolean f34099O = false;

    /* renamed from: P */
    protected CheckoutSettings f34100P;

    /* renamed from: Q */
    protected ComponentName f34101Q;

    /* renamed from: R */
    protected String f34102R;

    /* renamed from: S */
    protected BrandsValidation f34103S;

    /* renamed from: T */
    protected CheckoutInfo f34104T;

    /* renamed from: U */
    protected C11921z f34105U;

    /* renamed from: V */
    protected PaymentsClient f34106V;

    /* renamed from: W */
    protected PaymentParams f34107W;

    /* renamed from: X */
    protected C11863j0 f34108X;

    /* renamed from: a */
    protected C11896r0 f34109a;

    /* renamed from: b */
    protected C11798a1 f34110b;

    /* renamed from: a */
    private void m53034a(int i, Intent intent) throws PaymentException {
        if (i == -1) {
            mo40395f();
            PaymentData a = mo40380a(intent);
            this.f34107W = C11903s0.m53515a(this.f34100P.mo40717i(), a);
            mo40381a(a);
        } else if (i == 0) {
            mo40399w();
        } else if (i == 1) {
            throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, m53037b(intent)));
        }
    }

    /* renamed from: a */
    private void m53035a(int i, Transaction transaction, PaymentError paymentError) {
        setResult(i, mo40324b(transaction, paymentError));
        this.f34109a.mo40569f();
    }

    /* renamed from: b */
    private Bundle m53036b(@C0193h0 String str, @C0195i0 Token token, @C0195i0 C11978a aVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(CheckoutActivity.f34061b0, this.f34100P);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_CHECKOUT_INFO", this.f34104T);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_BRANDS_VALIDATION", this.f34103S);
        bundle.putString(CheckoutActivity.f34075p0, str);
        bundle.putParcelable("com.oppwa.mobile.connect.checkout.dialog.EXTRA_TOKEN", token);
        bundle.putBoolean("com.oppwa.mobile.connect.checkout.dialog.EXTRA_SKIP_PAYMENT_METHOD_SELECTION_SCREEN", this.f34109a.mo40563a());
        if (aVar != null) {
            bundle.putString("com.oppwa.mobile.connect.checkout.dialog.EXTRA_PROVIDER_MODE", aVar.name());
        }
        return bundle;
    }

    /* renamed from: b */
    private String m53037b(Intent intent) {
        Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
        return (statusFromIntent == null || statusFromIntent.mo17613P() == null) ? "Google Pay error with no status message" : statusFromIntent.mo17613P();
    }

    /* renamed from: b */
    private void m53038b(int i) {
        if (i == -1) {
            mo40398u();
            return;
        }
        getFragmentManager().popBackStackImmediate();
        if (getSupportFragmentManager().mo6238c() == 0) {
            mo40399w();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PaymentData mo40380a(Intent intent) {
        return PaymentData.getFromIntent(intent);
    }

    /* renamed from: a */
    public void mo40381a(@C0195i0 PaymentData paymentData) {
        this.f34098N = false;
        ComponentName componentName = this.f34101Q;
        if (componentName != null) {
            Intent a = C11903s0.m53513a(this, componentName, this.f34107W, paymentData);
            sendBroadcast(a);
            a.setAction(CheckoutActivity.f34070k0);
            sendBroadcast(a);
            return;
        }
        try {
            mo40389c();
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40382a(@C0193h0 OrderSummary orderSummary) {
        this.f34109a.mo40564b(C11907u.m53537a(orderSummary, this.f34104T.mo40840c()), true, true);
    }

    /* renamed from: a */
    public void mo40383a(PaymentParams paymentParams, boolean z) {
        this.f34107W = paymentParams;
        if (this.f34108X.mo40499a(paymentParams.mo40899j(), z)) {
            this.f34108X.mo40497a((Activity) this, (C11909u0) this);
            return;
        }
        if (mo40397h()) {
            mo40395f();
        }
        mo40381a((PaymentData) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40384a(@C0193h0 String str) {
        C11868k0.m53353a((Context) this).mo3032a(this, Uri.parse(str));
    }

    /* renamed from: a */
    public void mo40385a(String str, Token token) {
        try {
            if (C10527a.f28541b.equals(str)) {
                mo40394e();
            } else if (mo40391c(str)) {
                mo40386a(str, token, mo40392d());
            } else {
                mo40383a(new PaymentParams(this.f34100P.mo40717i(), str), false);
            }
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo40386a(@C0193h0 String str, @C0195i0 Token token, @C0195i0 C11978a aVar) {
        C11795a0 a = C11857h1.m53309a(str, mo40388b(str));
        a.setArguments(m53036b(str, token, aVar));
        if (this.f34110b != C11798a1.PAYMENT_BUTTON || this.f34109a.mo40566c()) {
            this.f34109a.mo40564b(a, true, false);
            return;
        }
        mo40396g();
        this.f34109a.mo40561a((Fragment) a, true, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Intent mo40324b(Transaction transaction, PaymentError paymentError);

    /* renamed from: b */
    public void mo40387b(Transaction transaction) {
        m53035a(100, transaction, (PaymentError) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo40388b(@C0193h0 String str) {
        return this.f34103S.mo40798d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo40389c() throws PaymentException;

    /* renamed from: c */
    public void mo40390c(Transaction transaction, PaymentError paymentError) {
        if (!(this.f34100P == null || paymentError == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(paymentError.mo40760a());
            sb.append(" - ");
            sb.append(paymentError.mo40764c());
            C11778a.m52927a(this, this.f34100P.mo40717i(), sb.toString(), this.f34100P.mo40735y());
            C11778a.m52945e(this);
        }
        m53035a(102, transaction, paymentError);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo40391c(@C0193h0 String str) {
        return C11857h1.m53309a(str, mo40388b(str)) != null;
    }

    /* access modifiers changed from: protected */
    @C0195i0
    /* renamed from: d */
    public abstract C11978a mo40392d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo40393d(@C0193h0 Transaction transaction) {
        this.f34109a.mo40564b(C11826e.m53219a(transaction), true, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo40394e() throws PaymentException {
        if (this.f34106V == null) {
            this.f34106V = C11862j.m53332a(this, mo40392d());
        }
        PaymentDataRequest a = C11903s0.m53514a(this.f34100P, this.f34104T);
        if (a != null) {
            AutoResolveHelper.resolveTask(this.f34106V.loadPaymentData(a), this, C11644i.f33390q0);
            return;
        }
        throw new PaymentException(new PaymentError(ErrorCode.ERROR_CODE_GOOGLEPAY, "Payment data request is invalid."));
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo40395f() {
        this.f34109a.mo40564b(new C11824d0(), false, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo40396g() {
        this.f34109a.mo40564b(C11806c0.m53100a(this.f34105U, this.f34100P, this.f34104T, this.f34103S), false, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo40397h() {
        return this.f34110b == C11798a1.CHECKOUT_UI || mo40391c(this.f34102R);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 700) {
            m53038b(i2);
        } else if (i == 777) {
            try {
                m53034a(i2, intent);
            } catch (PaymentException e) {
                mo40390c(null, e.mo40774a());
            }
        }
    }

    public void onBackPressed() {
        if (this.f34098N) {
            if (this.f34109a.mo40565b() || !this.f34099O) {
                mo40399w();
            } else {
                this.f34109a.mo40568e();
                super.onBackPressed();
            }
        }
    }

    /* renamed from: u */
    public void mo40398u() {
        C11840g0 g0Var = new C11840g0(this.f34107W);
        g0Var.mo40469b();
        this.f34107W = g0Var.mo40465a();
        mo40395f();
        mo40381a((PaymentData) null);
    }

    /* renamed from: w */
    public void mo40399w() {
        CheckoutSettings checkoutSettings = this.f34100P;
        if (checkoutSettings != null) {
            C11778a.m52940c(this, checkoutSettings.mo40717i(), "Checkout was canceled", this.f34100P.mo40735y());
            C11778a.m52945e(this);
        }
        m53035a(101, (Transaction) null, (PaymentError) null);
    }

    /* renamed from: x */
    public void mo40400x() {
        mo40395f();
        try {
            mo40389c();
        } catch (PaymentException e) {
            mo40390c(null, e.mo40774a());
        }
    }
}
