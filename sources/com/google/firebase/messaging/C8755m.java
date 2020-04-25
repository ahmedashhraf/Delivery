package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.m */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C8755m {
    @C0193h0

    /* renamed from: a */
    private final Bundle f22976a;

    public C8755m(@C0193h0 Bundle bundle) {
        if (bundle != null) {
            this.f22976a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    @C0195i0
    /* renamed from: g */
    private final JSONArray m41039g(String str) {
        String a = mo32264a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return new JSONArray(a);
            } catch (JSONException unused) {
                String h = m41040h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 50 + String.valueOf(a).length());
                sb.append("Malformed JSON for key ");
                sb.append(h);
                sb.append(": ");
                sb.append(a);
                sb.append(", falling back to default");
                sb.toString();
            }
        }
        return null;
    }

    /* renamed from: h */
    private static String m41040h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: i */
    private static String m41041i(String str) {
        String str2 = "gcm.n.";
        if (!str.startsWith(str2)) {
            return str;
        }
        return str.replace(str2, "gcm.notification.");
    }

    /* renamed from: a */
    public final String mo32264a(String str) {
        Bundle bundle = this.f22976a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String i = m41041i(str);
            if (this.f22976a.containsKey(i)) {
                str = i;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: b */
    public final boolean mo32266b(String str) {
        String a = mo32264a(str);
        return "1".equals(a) || Boolean.parseBoolean(a);
    }

    /* renamed from: c */
    public final Integer mo32267c(String str) {
        String a = mo32264a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return Integer.valueOf(Integer.parseInt(a));
            } catch (NumberFormatException unused) {
                String h = m41040h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
                sb.append("Couldn't parse value of ");
                sb.append(h);
                sb.append("(");
                sb.append(a);
                sb.append(") into an int");
                sb.toString();
            }
        }
        return null;
    }

    /* renamed from: d */
    public final Long mo32269d(String str) {
        String a = mo32264a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.valueOf(Long.parseLong(a));
            } catch (NumberFormatException unused) {
                String h = m41040h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
                sb.append("Couldn't parse value of ");
                sb.append(h);
                sb.append("(");
                sb.append(a);
                sb.append(") into a long");
                sb.toString();
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: e */
    public final String mo32272e(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        return mo32264a(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
    }

    @C0195i0
    /* renamed from: f */
    public final Object[] mo32274f(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        JSONArray g = m41039g(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (g == null) {
            return null;
        }
        String[] strArr = new String[g.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = g.optString(i);
        }
        return strArr;
    }

    /* renamed from: e */
    public final Bundle mo32271e() {
        Bundle bundle = new Bundle(this.f22976a);
        for (String str : this.f22976a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    @C0195i0
    /* renamed from: b */
    public final String mo32265b() {
        String a = mo32264a("gcm.n.sound2");
        return TextUtils.isEmpty(a) ? mo32264a("gcm.n.sound") : a;
    }

    @C0195i0
    /* renamed from: c */
    public final long[] mo32268c() {
        JSONArray g = m41039g("gcm.n.vibrate_timings");
        if (g == null) {
            return null;
        }
        try {
            if (g.length() > 1) {
                long[] jArr = new long[g.length()];
                for (int i = 0; i < jArr.length; i++) {
                    jArr[i] = g.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            sb.toString();
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: d */
    public final int[] mo32270d() {
        String str = ". Skipping setting LightSettings";
        String str2 = "LightSettings is invalid: ";
        JSONArray g = m41039g("gcm.n.light_settings");
        if (g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g.length() == 3) {
                int parseColor = Color.parseColor(g.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = g.optInt(1);
                    iArr[2] = g.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append(str2);
            sb.append(valueOf);
            sb.append(str);
            sb.toString();
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(g);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60 + String.valueOf(message).length());
            sb2.append(str2);
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(str);
            sb2.toString();
            return null;
        }
    }

    /* renamed from: f */
    public final Bundle mo32273f() {
        Bundle bundle = new Bundle(this.f22976a);
        for (String str : this.f22976a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals(PrivacyItem.SUBSCRIPTION_FROM))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    @C0195i0
    /* renamed from: b */
    private final String m41038b(Resources resources, String str, String str2) {
        String e = mo32272e(str2);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        String str3 = " Default value will be used.";
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String str4 = "_loc_key";
            String h = m41040h(str4.length() != 0 ? valueOf.concat(str4) : new String(valueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 49 + String.valueOf(str2).length());
            sb.append(h);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(str3);
            sb.toString();
            return null;
        }
        Object[] f = mo32274f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException unused) {
            String h2 = m41040h(str2);
            String arrays = Arrays.toString(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(h2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(h2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str3);
            sb2.toString();
            return null;
        }
    }

    @C0195i0
    /* renamed from: a */
    public final Uri mo32262a() {
        String a = mo32264a("gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = mo32264a("gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo32263a(Resources resources, String str, String str2) {
        String a = mo32264a(str2);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return m41038b(resources, str, str2);
    }

    /* renamed from: a */
    public static boolean m41037a(Bundle bundle) {
        String str = "gcm.n.e";
        String str2 = "1";
        if (!str2.equals(bundle.getString(str)) && !str2.equals(bundle.getString(m41041i(str)))) {
            String str3 = "gcm.n.icon";
            if (bundle.getString(str3) == null && bundle.getString(m41041i(str3)) == null) {
                return false;
            }
        }
        return true;
    }
}
