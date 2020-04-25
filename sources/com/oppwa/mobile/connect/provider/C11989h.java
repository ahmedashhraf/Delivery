package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKApiEntry;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.p427b.C11778a;
import com.oppwa.mobile.connect.p427b.C11779b;
import com.oppwa.mobile.connect.payment.BrandsValidation;
import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.ImagesRequest;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.provider.C11977a.C11978a;
import java.io.InputStream;
import java.net.URLEncoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.provider.h */
class C11989h {
    /* renamed from: a */
    static BrandsValidation m54099a(Context context, C11978a aVar, String str, String[] strArr) throws PaymentException {
        StringBuilder sb = new StringBuilder();
        sb.append(m54102a(aVar));
        sb.append(String.format("/v1/checkouts/%1$s/brand?names=", new Object[]{str}));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(m54105a(strArr));
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("GET ");
        sb5.append(sb4);
        C11778a.m52935b(context, str, sb5.toString(), aVar);
        try {
            String a = C11779b.m52946a(C11987f.m54096a(context, str, sb4, null, aVar));
            C11778a.m52935b(context, str, a, aVar);
            return BrandsValidation.m53799a(new JSONObject(a));
        } catch (Exception e) {
            C11778a.m52927a(context, str, e.getMessage(), aVar);
            throw new PaymentException(PaymentError.m53761d(e.getMessage()));
        }
    }

    /* renamed from: a */
    static CheckoutInfo m54100a(Context context, C11978a aVar, String str) throws PaymentException {
        StringBuilder sb = new StringBuilder();
        sb.append(m54102a(aVar));
        sb.append(String.format("/v1/checkouts/%1$s", new Object[]{str}));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("GET ");
        sb3.append(sb2);
        C11778a.m52935b(context, str, sb3.toString(), aVar);
        try {
            String a = C11779b.m52946a(C11987f.m54096a(context, str, sb2, null, aVar));
            C11778a.m52935b(context, str, a, aVar);
            return CheckoutInfo.m53835a(new JSONObject(a));
        } catch (Exception e) {
            C11778a.m52927a(context, str, e.getMessage(), aVar);
            throw new PaymentException(PaymentError.m53761d(e.getMessage()));
        }
    }

    /* renamed from: a */
    static ImagesRequest m54101a(C11978a aVar, String[] strArr) throws PaymentException {
        StringBuilder sb = new StringBuilder();
        sb.append(m54102a(aVar));
        sb.append(String.format("/v1/images?brands=", new Object[0]));
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(m54105a(strArr));
        try {
            return ImagesRequest.m53868a(C11988g.m54098a(C11987f.m54096a(null, null, sb3.toString(), null, aVar)));
        } catch (Exception e) {
            throw new PaymentException(PaymentError.m53761d(e.getMessage()));
        }
    }

    /* renamed from: a */
    private static String m54102a(C11978a aVar) {
        return aVar == C11978a.LIVE ? "https://oppwa.com:443" : "https://test.oppwa.com:443";
    }

    /* renamed from: a */
    private static String m54103a(JSONArray jSONArray) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("name");
            String string2 = jSONObject.getString("value");
            sb.append(string);
            sb.append('=');
            sb.append(URLEncoder.encode(string2, "UTF-8"));
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m54104a(JSONObject jSONObject, String str) throws Exception {
        JSONObject jSONObject2 = jSONObject.getJSONObject("redirect");
        if (!str.equals("BOLETO") && !str.equals("MASTERPASS")) {
            return jSONObject2.getString("shortUrl");
        }
        String string = jSONObject2.getString("url");
        String a = m54103a(jSONObject2.getJSONArray(SDKApiEntry.COLUMN_PARAMETERS));
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("?");
        sb.append(a);
        return sb.toString();
    }

    /* renamed from: a */
    private static String m54105a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    static void m54106a(Context context, C11978a aVar, PaymentParams paymentParams, String str) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("POST ");
        sb.append(str);
        String str2 = "\n";
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        paymentParams.mo40901l();
        StringBuilder a = C11987f.m54097a(paymentParams.mo40898i());
        C11779b.m52950a(a, "&", str2);
        String b = paymentParams.mo40889b();
        sb2.append(a);
        C11778a.m52935b(context, b, sb2.toString(), aVar);
        C11778a.m52945e(context);
        C11779b.m52954b(sb2);
        C11779b.m52954b(a);
    }

    /* renamed from: a */
    static void m54107a(Context context, C11978a aVar, String str, Transaction transaction) throws PaymentException {
        PaymentParams b = transaction.mo41027b();
        StringBuilder sb = new StringBuilder();
        sb.append(m54102a(aVar));
        sb.append(String.format("/v1/checkouts/%s%s", new Object[]{b.mo40889b(), str}));
        String sb2 = sb.toString();
        try {
            StringBuilder a = C11987f.m54097a(b.mo40898i());
            m54106a(context, aVar, b, sb2);
            InputStream a2 = C11987f.m54096a(context, b.mo40889b(), sb2, a, aVar);
            C11779b.m52954b(a);
            String a3 = C11779b.m52946a(a2);
            C11778a.m52935b(context, b.mo40889b(), a3, aVar);
            JSONObject jSONObject = new JSONObject(a3);
            if (b.mo40899j().equals("ALIPAY")) {
                transaction.mo41029c(C11986e.m54094a(jSONObject));
            }
            if ("ASYNC".equals(jSONObject.getString("workflow"))) {
                transaction.mo41025a(TransactionType.ASYNC);
                transaction.mo41026a(m54104a(jSONObject, b.mo40899j()));
                return;
            }
            transaction.mo41025a(TransactionType.SYNC);
        } catch (Exception e) {
            C11778a.m52927a(context, b.mo40889b(), e.getMessage(), aVar);
            throw new PaymentException(PaymentError.m53761d(e.getMessage()));
        }
    }
}
