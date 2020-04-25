package com.oppwa.mobile.connect.provider;

import com.google.firebase.analytics.FirebaseAnalytics.C5854b;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SDKApiEntry;
import java.net.URLEncoder;
import java.util.TreeSet;
import kotlin.p217i1.C14662d0;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.provider.e */
final class C11986e {
    /* renamed from: a */
    static String m54094a(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = jSONObject.getJSONObject("redirect").getJSONArray(SDKApiEntry.COLUMN_PARAMETERS);
        TreeSet<String> treeSet = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        String str = null;
        String str2 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            String string = jSONObject2.getString("name");
            String string2 = jSONObject2.getString("value");
            String str3 = "\"";
            String str4 = "=\"";
            if (m54095a(string)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(str4);
                sb2.append(string2);
                sb2.append(str3);
                treeSet.add(sb2.toString());
            } else {
                if (string.equals("sign")) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(string);
                    sb3.append(str4);
                    sb3.append(URLEncoder.encode(string2, "UTF-8"));
                    sb3.append(str3);
                    str = sb3.toString();
                }
                if (string.equals("sign_type")) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(string);
                    sb4.append(str4);
                    sb4.append(string2);
                    sb4.append(str3);
                    str2 = sb4.toString();
                }
            }
        }
        for (String str5 : treeSet) {
            if (sb.length() > 0) {
                sb.append(C14662d0.f42852c);
            }
            sb.append(str5);
        }
        sb.append(C14662d0.f42852c);
        sb.append(str);
        sb.append(C14662d0.f42852c);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m54095a(String str) {
        return str.equals("_input_charset") || str.equals("auth_token") || str.equals("body") || str.equals(C5854b.f16923e) || str.equals("forex_biz") || str.equals("gmt_return") || str.equals("notify_id") || str.equals("notify_url") || str.equals("order_gmt_create") || str.equals("order_valid_time") || str.equals("out_return_no") || str.equals("out_trade_no") || str.equals("partner") || str.equals("payment_type") || str.equals("product_code") || str.equals("reason") || str.equals("return_amount") || str.equals("return_rmb_amount") || str.equals("return_url") || str.equals("rmb_fee") || str.equals("secondary_merchant_id") || str.equals("secondary_merchant_industry") || str.equals("secondary_merchant_name") || str.equals("seller_id") || str.equals("seller_industry") || str.equals("seller_name") || str.equals("service") || str.equals("specified_pay_channel") || str.equals("subject") || str.equals("supplier") || str.equals("timeout_rule") || str.equals("total_fee");
    }
}
