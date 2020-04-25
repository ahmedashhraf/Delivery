package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.C0195i0;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.b1 */
class C11802b1 {

    /* renamed from: a */
    private static final String[] f34134a = {"NL", "DE", "AT", "DK", "FI", "NO", "SE"};

    @C0195i0
    /* renamed from: a */
    static C11810c1 m53071a(String str, String str2) {
        C11810c1 c1Var;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                c1Var = new C11810c1();
                c1Var.mo40425a(m53073a(jSONObject.getJSONObject("title"), str2));
                c1Var.mo40427b(m53073a(jSONObject.getJSONObject("linkTitle"), str2));
                c1Var.mo40429c(m53073a(jSONObject.getJSONObject("link"), str2));
                c1Var.mo40431d(m53073a(jSONObject.getJSONObject("terms"), str2));
            } catch (JSONException unused) {
                return null;
            }
        } else {
            c1Var = null;
        }
        return c1Var;
    }

    /* renamed from: a */
    static String m53072a(Context context) {
        String country = context.getResources().getConfiguration().locale.getCountry();
        return m53074a(country) ? country : "DE";
    }

    /* renamed from: a */
    private static String m53073a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* renamed from: a */
    static boolean m53074a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String equalsIgnoreCase : f34134a) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
