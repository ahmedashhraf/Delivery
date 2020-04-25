package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import com.alipay.sdk.app.PayTask;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.provider.C11977a;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import io.card.payment.CardIOActivity;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.d1 */
class C11825d1 {

    /* renamed from: a */
    static boolean f34190a = m53212a();

    /* renamed from: b */
    static boolean f34191b = m53215b();

    /* renamed from: c */
    static boolean f34192c = m53217c();

    /* renamed from: d */
    static boolean f34193d = m53218d();

    /* renamed from: a */
    static String m53211a(Activity activity, C11978a aVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("SDK version: ");
        sb.append(C11977a.m54067a());
        sb.append("\n\nLibraries configuration:\n");
        String sb2 = sb.toString();
        if (f34190a) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(m53214b(activity, aVar, str));
            sb2 = sb3.toString();
        }
        if (!f34191b) {
            return sb2;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb2);
        sb4.append(m53216c(activity, aVar, str));
        return sb4.toString();
    }

    /* renamed from: a */
    private static boolean m53212a() {
        return m53213a("com.alipay.sdk.app.PayTask");
    }

    /* renamed from: a */
    private static boolean m53213a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static String m53214b(Activity activity, C11978a aVar, String str) {
        String version = new PayTask(activity).getVersion();
        String str2 = "15.5.9";
        if (!str2.equals(version)) {
            f34190a = false;
            StringBuilder sb = new StringBuilder();
            sb.append("The provided version of Alipay is not supported ");
            sb.append(version);
            sb.append(". Version ");
            sb.append(str2);
            sb.append(" is expected. The library will not be used.");
            C11778a.m52940c(activity, str, sb.toString(), aVar);
            if (aVar == C11978a.TEST) {
                activity.getPackageName();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Alipay version: ");
        sb2.append(version);
        sb2.append("\n");
        return sb2.toString();
    }

    /* renamed from: b */
    private static boolean m53215b() {
        return m53213a("io.card.payment.CardIOActivity");
    }

    /* renamed from: c */
    private static String m53216c(Activity activity, C11978a aVar, String str) {
        String sdkVersion = CardIOActivity.sdkVersion();
        StringBuilder sb = new StringBuilder();
        sb.append("card.io version: ");
        sb.append(sdkVersion);
        sb.append("\n");
        String sb2 = sb.toString();
        String str2 = "5.5.1";
        if (!str2.equals(sdkVersion)) {
            f34191b = false;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The provided version of card.io is not supported ");
            sb3.append(sdkVersion);
            sb3.append(". Version ");
            sb3.append(str2);
            sb3.append(" is expected. The library will not be used.");
            C11778a.m52940c(activity, str, sb3.toString(), aVar);
            if (aVar == C11978a.TEST) {
                activity.getPackageName();
            }
        }
        return sb2;
    }

    /* renamed from: c */
    private static boolean m53217c() {
        return m53213a("com.google.android.gms.wallet.PaymentsClient");
    }

    /* renamed from: d */
    private static boolean m53218d() {
        return m53213a("com.iovation.mobile.android.FraudForceManager");
    }
}
