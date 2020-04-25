package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.annotation.C0195i0;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.v */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8725v {

    /* renamed from: d */
    private static final long f22878d = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    final String f22879a;

    /* renamed from: b */
    private final String f22880b;

    /* renamed from: c */
    private final long f22881c;

    private C8725v(String str, String str2, long j) {
        this.f22879a = str;
        this.f22880b = str2;
        this.f22881c = j;
    }

    /* renamed from: a */
    static String m40896a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* renamed from: b */
    static C8725v m40897b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C8725v(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C8725v(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            sb.toString();
            return null;
        }
    }

    /* renamed from: a */
    static String m40895a(@C0195i0 C8725v vVar) {
        if (vVar == null) {
            return null;
        }
        return vVar.f22879a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32159a(String str) {
        return System.currentTimeMillis() > this.f22881c + f22878d || !str.equals(this.f22880b);
    }
}
