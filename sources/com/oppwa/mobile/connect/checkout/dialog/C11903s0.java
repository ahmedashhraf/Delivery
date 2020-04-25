package com.oppwa.mobile.connect.checkout.dialog;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.oppwa.mobile.connect.checkout.meta.CheckoutSettings;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentParams;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p076c.p112d.p113a.p114a.p127g.C2676a;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.s0 */
class C11903s0 {
    /* renamed from: a */
    static Intent m53513a(@C0193h0 Activity activity, @C0193h0 ComponentName componentName, @C0193h0 PaymentParams paymentParams, @C0195i0 PaymentData paymentData) {
        Intent intent = new Intent(CheckoutActivity.f34069j0);
        intent.setComponent(componentName);
        intent.setPackage(componentName.getPackageName());
        intent.putExtra(CheckoutActivity.f34075p0, paymentParams.mo40899j());
        intent.putExtra(CheckoutActivity.f34076q0, paymentParams.mo40889b());
        if (paymentData != null) {
            intent.putExtra(CheckoutActivity.f34077r0, paymentData);
        }
        intent.putExtra(CheckoutActivity.f34080u0, new ComponentName(activity.getPackageName(), activity.getClass().getName()));
        return intent;
    }

    /* renamed from: a */
    static PaymentDataRequest m53514a(@C0193h0 CheckoutSettings checkoutSettings, @C0193h0 CheckoutInfo checkoutInfo) {
        PaymentDataRequest m = checkoutSettings.mo40721m();
        if (m != null || checkoutSettings.mo40718j() == null) {
            return m;
        }
        return C11862j.m53331a(String.format("%.2f", new Object[]{Double.valueOf(checkoutInfo.mo40837a())}), checkoutInfo.mo40840c(), checkoutSettings.mo40718j(), checkoutSettings.mo40720l(), checkoutSettings.mo40719k()).build();
    }

    /* renamed from: a */
    static PaymentParams m53515a(String str, PaymentData paymentData) throws PaymentException {
        return new GooglePayPaymentParams(str, (paymentData == null || paymentData.getPaymentMethodToken() == null) ? null : paymentData.getPaymentMethodToken().getToken());
    }

    /* renamed from: a */
    static Token m53516a(String str, Token[] tokenArr) {
        if (tokenArr != null) {
            for (Token token : tokenArr) {
                if (token.mo41012i().equals(str) && !m53521a(token)) {
                    return token;
                }
                if (str.equalsIgnoreCase("CARD") && !m53521a(token) && token.mo41008c() != null) {
                    return token;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    static List<Integer> m53517a(CheckoutSettings checkoutSettings) {
        PaymentDataRequest m = checkoutSettings.mo40721m();
        return m != null ? m.getAllowedPaymentMethods() : Arrays.asList(checkoutSettings.mo40720l());
    }

    /* renamed from: a */
    public static void m53518a(Context context, String str) {
        Configuration configuration = context.getResources().getConfiguration();
        String[] split = str.split(C14282d.ROLL_OVER_FILE_NAME_SEPARATOR);
        if (split.length == 2) {
            Locale locale = new Locale(split[0], split[1]);
            Locale.setDefault(locale);
            Configuration configuration2 = new Configuration(configuration);
            configuration2.locale = locale;
            context.getResources().updateConfiguration(configuration2, context.getResources().getDisplayMetrics());
        }
    }

    /* renamed from: a */
    static void m53519a(Context context, String str, C11978a aVar) {
        try {
            C2676a.m13028a(context);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException e) {
            C11778a.m52927a(context, str, e.getMessage(), aVar);
        }
    }

    /* renamed from: a */
    static void m53520a(String str) throws PaymentException {
        if (TextUtils.isEmpty(str)) {
            throw new PaymentException(PaymentError.m53762e("Redirect URL is null or empty."));
        } else if (!str.startsWith("http") && !str.startsWith(UriUtil.HTTPS_SCHEME)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Redirect URL is not valid: ");
            sb.append(str);
            throw new PaymentException(PaymentError.m53761d(sb.toString()));
        }
    }

    /* renamed from: a */
    private static boolean m53521a(Token token) {
        if (token == null || token.mo41008c() == null) {
            return false;
        }
        Card c = token.mo41008c();
        return CardPaymentParams.m53953c(c.mo40994b(), c.mo40995c());
    }
}
