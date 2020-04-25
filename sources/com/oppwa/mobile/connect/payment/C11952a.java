package com.oppwa.mobile.connect.payment;

import com.google.android.gms.plus.C5493f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.payment.a */
class C11952a {
    /* renamed from: a */
    private static BrandInfo m53901a(String str, JSONObject jSONObject) throws JSONException {
        BrandInfo brandInfo = new BrandInfo(str, jSONObject.getString("render"));
        String str2 = C5493f.f15781i;
        if (jSONObject.has(str2)) {
            brandInfo.mo40776a(jSONObject.getString(str2));
        }
        if (brandInfo.mo40784j()) {
            brandInfo.mo40775a(m53904b(jSONObject));
        }
        return brandInfo;
    }

    /* renamed from: a */
    private static String m53902a(String str) {
        String str2 = "";
        return str.replace("{", str2).replace("}", str2).replace("9", "#");
    }

    /* renamed from: a */
    static Map<String, BrandInfo> m53903a(JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            linkedHashMap.put(str, m53901a(str, jSONObject.getJSONObject(str)));
        }
        return linkedHashMap;
    }

    /* renamed from: b */
    private static CardBrandInfo m53904b(JSONObject jSONObject) throws JSONException {
        CVVMode cVVMode;
        CardBrandInfo cardBrandInfo = new CardBrandInfo();
        String str = "number";
        if (jSONObject.has(str)) {
            cardBrandInfo.mo40823d(m53905b(jSONObject.getString(str)));
        }
        String str2 = "detection";
        if (jSONObject.has(str2)) {
            cardBrandInfo.mo40816a(m53905b(jSONObject.getString(str2)));
        }
        String str3 = "luhn";
        if (jSONObject.has(str3)) {
            cardBrandInfo.mo40819b(jSONObject.getBoolean(str3));
        }
        String str4 = "pattern";
        if (jSONObject.has(str4)) {
            cardBrandInfo.mo40820c(m53902a(jSONObject.getString(str4)));
        }
        String str5 = "cvvLength";
        if (jSONObject.has(str5)) {
            cardBrandInfo.mo40814a(jSONObject.getInt(str5));
        }
        String str6 = "expiryDate";
        if (jSONObject.has(str6)) {
            cardBrandInfo.mo40817a(!jSONObject.getBoolean(str6));
        }
        String str7 = "noCvv";
        if (!jSONObject.has(str7) || !jSONObject.getBoolean(str7)) {
            String str8 = "optionalCvv";
            cVVMode = (!jSONObject.has(str8) || !jSONObject.getBoolean(str8)) ? CVVMode.REQUIRED : CVVMode.OPTIONAL;
        } else {
            cVVMode = CVVMode.NONE;
        }
        cardBrandInfo.mo40815a(cVVMode);
        String str9 = "mobilePhone";
        if (jSONObject.has(str9)) {
            cardBrandInfo.mo40821c(jSONObject.getBoolean(str9));
        }
        return cardBrandInfo;
    }

    /* renamed from: b */
    private static String m53905b(String str) {
        return str.replace("/", "");
    }
}
