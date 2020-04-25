package com.clevertap.android.sdk;

import androidx.core.app.C0753l;
import androidx.core.p034l.C0986h;
import com.amplitude.api.C2876e;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.y1 */
/* compiled from: Validator */
final class C3248y1 {

    /* renamed from: a */
    private static final String[] f11725a;

    /* renamed from: b */
    private static final String[] f11726b;

    /* renamed from: c */
    private static final String[] f11727c;

    /* renamed from: d */
    private static final String[] f11728d = {"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced"};

    /* renamed from: e */
    static final String f11729e = "multiValuePropertyAddValues";

    /* renamed from: f */
    static final String f11730f = "multiValuePropertyRemoveValues";

    /* renamed from: com.clevertap.android.sdk.y1$a */
    /* compiled from: Validator */
    private enum C3249a {
        Name,
        Email,
        Education,
        Married,
        DOB,
        Gender,
        Phone,
        Age,
        FBID,
        GPID,
        Birthday
    }

    /* renamed from: com.clevertap.android.sdk.y1$b */
    /* compiled from: Validator */
    enum C3250b {
        Profile,
        Event
    }

    static {
        String str = ".";
        String str2 = ":";
        String str3 = "$";
        String str4 = "'";
        String str5 = "\"";
        String str6 = "\\";
        f11725a = new String[]{str, str2, str3, str4, str5, str6};
        f11726b = new String[]{str, str2, str3, str4, str5, str6};
        f11727c = new String[]{str4, str5, str6};
    }

    C3248y1() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3244x1 mo12665a(String str) {
        C3244x1 x1Var = new C3244x1();
        String trim = str.trim();
        String str2 = trim;
        for (String replace : f11725a) {
            str2 = str2.replace(replace, "");
        }
        if (str2.length() > 512) {
            str2 = str2.substring(0, C0753l.f3451u);
            StringBuilder sb = new StringBuilder();
            sb.append(str2.trim());
            sb.append("... exceeds the limit of ");
            sb.append(512);
            sb.append(" characters. Trimmed");
            x1Var.mo12658a(sb.toString());
            x1Var.mo12656a(510);
        }
        x1Var.mo12657a((Object) str2.trim());
        return x1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3244x1 mo12667b(String str) {
        C3244x1 d = mo12669d(str);
        String str2 = (String) d.mo12660c();
        try {
            if (C3249a.valueOf(str2) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("... is a restricted key for multi-value properties. Operation aborted.");
                d.mo12658a(sb.toString());
                d.mo12656a(523);
                d.mo12657a((Object) null);
            }
        } catch (Throwable unused) {
        }
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C3244x1 mo12668c(String str) {
        C3244x1 x1Var = new C3244x1();
        String lowerCase = str.trim().toLowerCase();
        String str2 = lowerCase;
        for (String replace : f11727c) {
            str2 = str2.replace(replace, "");
        }
        try {
            if (str2.length() > 512) {
                str2 = str2.substring(0, C0753l.f3451u);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("... exceeds the limit of ");
                sb.append(512);
                sb.append(" chars. Trimmed");
                x1Var.mo12658a(sb.toString());
                x1Var.mo12656a(521);
            }
        } catch (Exception unused) {
        }
        x1Var.mo12657a((Object) str2);
        return x1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C3244x1 mo12669d(String str) {
        C3244x1 x1Var = new C3244x1();
        String trim = str.trim();
        String str2 = trim;
        for (String replace : f11726b) {
            str2 = str2.replace(replace, "");
        }
        if (str2.length() > 120) {
            str2 = str2.substring(0, 119);
            StringBuilder sb = new StringBuilder();
            sb.append(str2.trim());
            sb.append("... exceeds the limit of ");
            sb.append(120);
            sb.append(" characters. Trimmed");
            x1Var.mo12658a(sb.toString());
            x1Var.mo12656a(520);
        }
        x1Var.mo12657a((Object) str2.trim());
        return x1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C3244x1 mo12670e(String str) {
        C3244x1 x1Var = new C3244x1();
        if (str == null) {
            x1Var.mo12656a(510);
            x1Var.mo12658a("Event Name is null");
            return x1Var;
        }
        for (String equalsIgnoreCase : f11728d) {
            if (str.equalsIgnoreCase(equalsIgnoreCase)) {
                x1Var.mo12656a((int) C0986h.f4408j);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" is a restricted event name. Last event aborted.");
                x1Var.mo12658a(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" is a restricted system event name. Last event aborted.");
                C3111h1.m14938f(sb2.toString());
                return x1Var;
            }
        }
        return x1Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3244x1 mo12666a(JSONArray jSONArray, JSONArray jSONArray2, String str, String str2) {
        return m15679a(str2, jSONArray, jSONArray2, Boolean.valueOf(f11730f.equals(str)).booleanValue(), new C3244x1());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3244x1 mo12664a(Object obj, C3250b bVar) throws IllegalArgumentException {
        String str;
        C3244x1 x1Var = new C3244x1();
        if ((obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Long)) {
            x1Var.mo12657a(obj);
            return x1Var;
        }
        if ((obj instanceof String) || (obj instanceof Character)) {
            if (obj instanceof Character) {
                str = String.valueOf(obj);
            } else {
                str = (String) obj;
            }
            String trim = str.trim();
            for (String replace : f11727c) {
                trim = trim.replace(replace, "");
            }
            try {
                if (trim.length() > 512) {
                    trim = trim.substring(0, C0753l.f3451u);
                    StringBuilder sb = new StringBuilder();
                    sb.append(trim.trim());
                    sb.append("... exceeds the limit of ");
                    sb.append(512);
                    sb.append(" chars. Trimmed");
                    x1Var.mo12658a(sb.toString());
                    x1Var.mo12656a(521);
                }
            } catch (Exception unused) {
            }
            x1Var.mo12657a((Object) trim.trim());
            return x1Var;
        } else if (obj instanceof Date) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("$D_");
            sb2.append(((Date) obj).getTime() / 1000);
            x1Var.mo12657a((Object) sb2.toString());
            return x1Var;
        } else {
            boolean z = obj instanceof String[];
            if ((z || (obj instanceof ArrayList)) && bVar.equals(C3250b.Profile)) {
                String[] strArr = null;
                ArrayList arrayList = obj instanceof ArrayList ? (ArrayList) obj : null;
                if (z) {
                    strArr = (String[]) obj;
                }
                ArrayList arrayList2 = new ArrayList();
                if (strArr != null) {
                    for (String add : strArr) {
                        try {
                            arrayList2.add(add);
                        } catch (Exception unused2) {
                        }
                    }
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList2.add((String) it.next());
                        } catch (Exception unused3) {
                        }
                    }
                }
                String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                if (strArr2.length <= 0 || strArr2.length > 100) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid user profile property array count - ");
                    sb3.append(strArr2.length);
                    sb3.append(" max is - ");
                    sb3.append(100);
                    x1Var.mo12658a(sb3.toString());
                    x1Var.mo12656a(521);
                } else {
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    for (String put : strArr2) {
                        jSONArray.put(put);
                    }
                    try {
                        jSONObject.put(C2876e.f10098G, jSONArray);
                    } catch (JSONException unused4) {
                    }
                    x1Var.mo12657a((Object) jSONObject);
                }
                return x1Var;
            }
            throw new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
        }
    }

    /* renamed from: a */
    private C3244x1 m15679a(String str, JSONArray jSONArray, JSONArray jSONArray2, boolean z, C3244x1 x1Var) {
        JSONArray jSONArray3 = jSONArray;
        JSONArray jSONArray4 = jSONArray2;
        C3244x1 x1Var2 = x1Var;
        BitSet bitSet = null;
        if (jSONArray3 == null) {
            x1Var2.mo12657a((Object) null);
            return x1Var2;
        } else if (jSONArray4 == null) {
            x1Var2.mo12657a((Object) jSONArray3);
            return x1Var2;
        } else {
            JSONArray jSONArray5 = new JSONArray();
            HashSet hashSet = new HashSet();
            int length = jSONArray.length();
            int length2 = jSONArray2.length();
            if (!z) {
                bitSet = new BitSet(length + length2);
            }
            int a = m15678a(jSONArray4, (Set<String>) hashSet, bitSet, length);
            int i = 0;
            if (!z && hashSet.size() < 100) {
                i = m15678a(jSONArray3, (Set<String>) hashSet, bitSet, 0);
            }
            for (int i2 = i; i2 < length; i2++) {
                if (z) {
                    try {
                        String str2 = (String) jSONArray3.get(i2);
                        if (!hashSet.contains(str2)) {
                            jSONArray5.put(str2);
                        }
                    } catch (Throwable unused) {
                    }
                } else if (!bitSet.get(i2)) {
                    jSONArray5.put(jSONArray3.get(i2));
                }
            }
            if (!z && jSONArray5.length() < 100) {
                for (int i3 = a; i3 < length2; i3++) {
                    try {
                        if (!bitSet.get(i3 + length)) {
                            jSONArray5.put(jSONArray4.get(i3));
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
            if (a > 0 || i > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Multi value property for key ");
                sb.append(str);
                sb.append(" exceeds the limit of ");
                sb.append(100);
                sb.append(" items. Trimmed");
                x1Var2.mo12658a(sb.toString());
                x1Var2.mo12656a(521);
            }
            x1Var2.mo12657a((Object) jSONArray5);
            return x1Var2;
        }
    }

    /* renamed from: a */
    private int m15678a(JSONArray jSONArray, Set<String> set, BitSet bitSet, int i) {
        if (jSONArray != null) {
            for (int length = jSONArray.length() - 1; length >= 0; length--) {
                try {
                    Object obj = jSONArray.get(length);
                    String obj2 = obj != null ? obj.toString() : null;
                    if (bitSet != null) {
                        if (obj2 != null) {
                            if (!set.contains(obj2)) {
                                set.add(obj2);
                                if (set.size() == 100) {
                                    return length;
                                }
                            }
                        }
                        bitSet.set(length + i, true);
                    } else if (obj2 != null) {
                        set.add(obj2);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }
}
