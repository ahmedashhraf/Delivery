package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.iovation.mobile.android.FraudForceConfiguration;
import com.iovation.mobile.android.FraudForceManager;
import com.oppwa.mobile.connect.payment.PaymentParams;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.g0 */
class C11840g0 {

    /* renamed from: a */
    private PaymentParams f34224a;

    C11840g0(@C0193h0 PaymentParams paymentParams) {
        this.f34224a = paymentParams;
    }

    /* renamed from: b */
    private static String m53261b(Context context) {
        FraudForceManager instance = FraudForceManager.getInstance();
        instance.initialize(new FraudForceConfiguration(), context.getApplicationContext());
        return instance.getBlackbox(context.getApplicationContext());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public PaymentParams mo40465a() {
        return this.f34224a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40466a(Context context) {
        if (C11825d1.f34193d) {
            String b = m53261b(context);
            if (b != null && !b.isEmpty()) {
                this.f34224a.mo40887a("customer.browserFingerprint.value", b);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40467a(@C0193h0 C11798a1 a1Var) {
        this.f34224a.mo40890b("SHOPPER_MSDKIntegrationType", a1Var.mo40409d());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo40468a(@C0195i0 String str) {
        this.f34224a.mo40895e(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40469b() {
        this.f34224a.mo40890b("SHOPPER_TOUCHID", "SUCCESS");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo40470b(@C0195i0 String str) {
        if (str != null) {
            this.f34224a.mo40890b("SHOPPER_deviceId", str);
        }
    }
}
