package com.clevertap.android.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.core.app.C0798u;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.e1 */
/* compiled from: InAppFCManager */
class C3088e1 {

    /* renamed from: f */
    private static final SimpleDateFormat f11073f = new SimpleDateFormat("ddMMyyyy", Locale.US);

    /* renamed from: a */
    private Context f11074a;

    /* renamed from: b */
    private CleverTapInstanceConfig f11075b;

    /* renamed from: c */
    private final ArrayList<String> f11076c = new ArrayList<>();

    /* renamed from: d */
    private final HashMap<String, Integer> f11077d = new HashMap<>();

    /* renamed from: e */
    private int f11078e = 0;

    C3088e1(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f11075b = cleverTapInstanceConfig;
        this.f11074a = context;
        m14812c();
    }

    /* renamed from: a */
    private String m14805a() {
        return this.f11075b.mo12093a();
    }

    /* renamed from: b */
    private C3111h1 m14808b() {
        return this.f11075b.mo12108l();
    }

    /* renamed from: c */
    private void m14812c() {
        String format = f11073f.format(new Date());
        String str = "ict_date";
        if (!format.equals(m14806a(str, "20140428"))) {
            C3217s1.m15534b(this.f11074a, m14811c(str), format);
            C3217s1.m15532b(this.f11074a, m14811c("istc_inapp"), 0);
            SharedPreferences a = C3217s1.m15526a(this.f11074a, "counts_per_inapp");
            Editor edit = a.edit();
            Map all = a.getAll();
            for (String str2 : all.keySet()) {
                Object obj = all.get(str2);
                if (!(obj instanceof String)) {
                    edit.remove(str2);
                } else {
                    String[] split = ((String) obj).split(",");
                    if (split.length != 2) {
                        edit.remove(str2);
                    } else {
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append("0,");
                            sb.append(split[1]);
                            edit.putString(str2, sb.toString());
                        } catch (Throwable th) {
                            C3111h1 b = m14808b();
                            String a2 = m14805a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to reset todayCount for inapp ");
                            sb2.append(str2);
                            b.mo12316c(a2, sb2.toString(), th);
                        }
                    }
                }
            }
            C3217s1.m15529a(edit);
        }
    }

    /* renamed from: d */
    private boolean m14813d(CTInAppNotification cTInAppNotification) {
        String c = m14810c(cTInAppNotification);
        if (c == null) {
            return false;
        }
        if (m14804a("istc_inapp", 0) >= m14804a("istmcd_inapp", 1)) {
            return true;
        }
        try {
            int B = cTInAppNotification.mo11915B();
            if (B != -1 && m14807a(c)[0] >= B) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: e */
    private boolean m14814e(CTInAppNotification cTInAppNotification) {
        String c = m14810c(cTInAppNotification);
        if (c == null || cTInAppNotification.mo11916C() == -1) {
            return false;
        }
        try {
            if (m14807a(c)[1] >= cTInAppNotification.mo11916C()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: f */
    private boolean m14815f(CTInAppNotification cTInAppNotification) {
        String c = m14810c(cTInAppNotification);
        boolean z = false;
        if (c == null) {
            return false;
        }
        if (this.f11076c.contains(c)) {
            return true;
        }
        try {
            int u = cTInAppNotification.mo11949u() >= 0 ? cTInAppNotification.mo11949u() : 1000;
            Integer num = (Integer) this.f11077d.get(c);
            if (num != null && num.intValue() >= u) {
                return true;
            }
            if (this.f11078e >= m14804a("imc", 1)) {
                z = true;
            }
            return z;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo12245a(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification == null) {
            return false;
        }
        try {
            if (m14810c(cTInAppNotification) != null && !cTInAppNotification.mo11921H()) {
                return !m14815f(cTInAppNotification) && !m14814e(cTInAppNotification) && !m14813d(cTInAppNotification);
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12247b(CTInAppNotification cTInAppNotification) {
        String r = cTInAppNotification.mo11946r();
        if (r != null) {
            this.f11076c.add(r.toString());
        }
    }

    /* renamed from: b */
    private void m14809b(String str) {
        int[] a = m14807a(str);
        a[0] = a[0] + 1;
        a[1] = a[1] + 1;
        Editor edit = C3217s1.m15526a(this.f11074a, "counts_per_inapp").edit();
        StringBuilder sb = new StringBuilder();
        sb.append(a[0]);
        sb.append(",");
        sb.append(a[1]);
        edit.putString(str, sb.toString());
        C3217s1.m15529a(edit);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12243a(Context context, CTInAppNotification cTInAppNotification) {
        String c = m14810c(cTInAppNotification);
        if (c != null) {
            this.f11078e++;
            Integer num = (Integer) this.f11077d.get(c);
            if (num == null) {
                num = Integer.valueOf(1);
            }
            this.f11077d.put(c, Integer.valueOf(num.intValue() + 1));
            m14809b(c);
            String str = "istc_inapp";
            C3217s1.m15532b(context, m14811c(str), m14804a(str, 0) + 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12246b(Context context, JSONObject jSONObject) {
        String str = "inapp_stale";
        try {
            if (jSONObject.has(str)) {
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                Editor edit = C3217s1.m15526a(context, "counts_per_inapp").edit();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    String str2 = "Purged stale in-app - ";
                    if (obj instanceof Integer) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("");
                        sb.append(obj);
                        edit.remove(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(obj);
                        C3111h1.m14930d(sb2.toString());
                    } else if (obj instanceof String) {
                        edit.remove((String) obj);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(obj);
                        C3111h1.m14930d(sb3.toString());
                    }
                }
                C3217s1.m15529a(edit);
            }
        } catch (Throwable th) {
            C3111h1.m14941f("Failed to purge out stale targets", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo12242a(Context context, int i, int i2) {
        C3217s1.m15532b(context, m14811c("istmcd_inapp"), i);
        C3217s1.m15532b(context, m14811c("imc"), i2);
    }

    /* renamed from: a */
    private int[] m14807a(String str) {
        String string = C3217s1.m15526a(this.f11074a, "counts_per_inapp").getString(str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] split = string.split(",");
            if (split.length != 2) {
                return new int[]{0, 0};
            }
            return new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    /* renamed from: c */
    private String m14810c(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification.mo11946r() != null && !cTInAppNotification.mo11946r().isEmpty()) {
            try {
                return cTInAppNotification.mo11946r();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: c */
    private String m14811c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(m14805a());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12244a(Context context, JSONObject jSONObject) {
        try {
            jSONObject.put("imp", m14804a("istc_inapp", 0));
            JSONArray jSONArray = new JSONArray();
            Map all = C3217s1.m15526a(context, "counts_per_inapp").getAll();
            for (String str : all.keySet()) {
                Object obj = all.get(str);
                if (obj instanceof String) {
                    String[] split = ((String) obj).split(",");
                    if (split.length == 2) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0, str);
                        jSONArray2.put(1, Integer.parseInt(split[0]));
                        jSONArray2.put(2, Integer.parseInt(split[1]));
                        jSONArray.put(jSONArray2);
                    }
                }
            }
            jSONObject.put("tlc", jSONArray);
        } catch (Throwable th) {
            C3111h1.m14941f("Failed to attach FC to header", th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12241a(Context context) {
        C3217s1.m15532b(context, "istc_inapp", 0);
        this.f11077d.clear();
        this.f11078e = 0;
        this.f11076c.clear();
        Editor edit = C3217s1.m15526a(context, "counts_per_inapp").edit();
        edit.clear();
        C3217s1.m15529a(edit);
    }

    /* renamed from: a */
    private String m14806a(String str, String str2) {
        if (!this.f11075b.mo12112p()) {
            return C3217s1.m15527a(this.f11074a, m14811c(str), str2);
        }
        String a = C3217s1.m15527a(this.f11074a, m14811c(str), str2);
        if (a == null) {
            a = C3217s1.m15527a(this.f11074a, str, str2);
        }
        return a;
    }

    /* renamed from: a */
    private int m14804a(String str, int i) {
        if (!this.f11075b.mo12112p()) {
            return C3217s1.m15522a(this.f11074a, m14811c(str), i);
        }
        int a = C3217s1.m15522a(this.f11074a, m14811c(str), (int) C0798u.f3805q);
        if (a == -1000) {
            a = C3217s1.m15522a(this.f11074a, str, i);
        }
        return a;
    }
}
