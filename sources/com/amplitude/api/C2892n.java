package com.amplitude.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.n */
/* compiled from: Utils */
public class C2892n {

    /* renamed from: a */
    public static final String f10234a = "com.amplitude.api.Utils";

    /* renamed from: b */
    private static C2875d f10235b = C2875d.m13566a();

    /* renamed from: c */
    static final /* synthetic */ boolean f10236c = false;

    /* renamed from: a */
    static JSONObject m13813a(JSONObject jSONObject) {
        JSONArray jSONArray;
        String str = f10234a;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            f10235b.mo11292b(str, e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            f10235b.mo11292b(str, e2.toString());
            return null;
        }
    }

    /* renamed from: b */
    static String m13817b(String str) {
        if (m13815a(str)) {
            str = C2876e.f10132i;
        }
        return str.toLowerCase();
    }

    /* renamed from: a */
    static boolean m13816a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == jSONObject2) {
            return true;
        }
        if ((jSONObject != null && jSONObject2 == null) || (jSONObject == null && jSONObject2 != null)) {
            return false;
        }
        try {
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (!jSONObject2.has(str)) {
                    return false;
                }
                Object obj = jSONObject.get(str);
                Object obj2 = jSONObject2.get(str);
                if (!obj.getClass().equals(obj2.getClass())) {
                    return false;
                }
                if (obj.getClass() == JSONObject.class) {
                    if (!m13816a((JSONObject) obj, (JSONObject) obj2)) {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m13815a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: a */
    static SharedPreferences m13811a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.amplitude.api.");
        sb.append(str);
        sb.append(".");
        sb.append(context.getPackageName());
        return context.getSharedPreferences(sb.toString(), 4);
    }

    /* renamed from: a */
    static void m13814a(Context context, String str, String str2, String str3) {
        Editor edit = m13811a(context, str).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    /* renamed from: a */
    static String m13812a(Context context, String str, String str2) {
        return m13811a(context, str).getString(str2, null);
    }
}
