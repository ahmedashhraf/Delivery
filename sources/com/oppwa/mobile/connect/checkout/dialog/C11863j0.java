package com.oppwa.mobile.connect.checkout.dialog;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build.VERSION;
import androidx.annotation.C0193h0;
import com.oppwa.mobile.connect.C11771R;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSecurityPolicyMode;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.j0 */
class C11863j0 implements C11917x0 {

    /* renamed from: a */
    private KeyguardManager f34278a;

    /* renamed from: b */
    private C11909u0 f34279b;

    /* renamed from: c */
    private CheckoutSettings f34280c;

    C11863j0(@C0193h0 Context context, @C0193h0 CheckoutSettings checkoutSettings) {
        this.f34278a = (KeyguardManager) context.getSystemService("keyguard");
        this.f34280c = checkoutSettings;
    }

    /* renamed from: a */
    private void m53335a(Activity activity, C11917x0 x0Var) {
        C11845h a = C11845h.m53277a(this.f34280c.mo40734x());
        a.mo40475a(x0Var);
        a.show(activity.getFragmentManager(), null);
    }

    /* renamed from: a */
    private boolean m53336a(CheckoutSecurityPolicyMode checkoutSecurityPolicyMode) {
        if (checkoutSecurityPolicyMode == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED) {
            return true;
        }
        if (checkoutSecurityPolicyMode == CheckoutSecurityPolicyMode.DEVICE_AUTH_REQUIRED_IF_AVAILABLE) {
            return mo40498a();
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(21)
    /* renamed from: a */
    public void mo40497a(Activity activity, C11909u0 u0Var) {
        if (mo40498a()) {
            this.f34279b = u0Var;
            if (VERSION.SDK_INT >= 23 && activity.checkSelfPermission("android.permission.USE_FINGERPRINT") == 0) {
                FingerprintManager fingerprintManager = (FingerprintManager) activity.getSystemService("fingerprint");
                if (fingerprintManager.isHardwareDetected() && fingerprintManager.hasEnrolledFingerprints()) {
                    m53335a(activity, (C11917x0) this);
                    return;
                }
            }
            activity.startActivityForResult(this.f34278a.createConfirmDeviceCredentialIntent(this.f34280c.mo40734x(), activity.getString(C11771R.string.checkout_auth_confirm_payment)), 700);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo40498a() {
        return VERSION.SDK_INT >= 21 && this.f34278a.isKeyguardSecure();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo40499a(String str, boolean z) {
        return m53336a(z ? this.f34280c.mo40736z() : this.f34280c.mo40675a(str));
    }

    /* renamed from: c */
    public void mo40500c() {
    }

    /* renamed from: d */
    public void mo40501d() {
        this.f34279b.mo40398u();
    }

    /* renamed from: e */
    public void mo40502e() {
    }
}
