package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.core.app.C0770p;
import androidx.core.app.C0798u;
import com.google.android.gms.common.C4420j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.clevertap.android.sdk.g1 */
/* compiled from: LocalDataStore */
class C3103g1 {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static long f11129h;

    /* renamed from: a */
    private Context f11130a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CleverTapInstanceConfig f11131b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3211r0 f11132c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final HashMap<String, Object> f11133d = new HashMap<>();

    /* renamed from: e */
    private final String f11134e = "local_events";

    /* renamed from: f */
    private ExecutorService f11135f;

    /* renamed from: g */
    private final HashMap<String, Integer> f11136g = new HashMap<>();

    /* renamed from: com.clevertap.android.sdk.g1$a */
    /* compiled from: LocalDataStore */
    class C3104a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11138a;

        /* renamed from: b */
        final /* synthetic */ Runnable f11139b;

        C3104a(String str, Runnable runnable) {
            this.f11138a = str;
            this.f11139b = runnable;
        }

        public void run() {
            C3103g1.f11129h = Thread.currentThread().getId();
            try {
                C3111h1 b = C3103g1.this.m14889d();
                String a = C3103g1.this.m14885c();
                StringBuilder sb = new StringBuilder();
                sb.append("Local Data Store Executor service: Starting task - ");
                sb.append(this.f11138a);
                b.mo12315c(a, sb.toString());
                this.f11139b.run();
            } catch (Throwable th) {
                C3103g1.this.m14889d().mo12316c(C3103g1.this.m14885c(), "Executor service: Failed to complete the scheduled task", th);
            }
        }
    }

    /* renamed from: com.clevertap.android.sdk.g1$b */
    /* compiled from: LocalDataStore */
    class C3105b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f11141a;

        /* renamed from: b */
        final /* synthetic */ String f11142b;

        C3105b(Context context, String str) {
            this.f11141a = context;
            this.f11142b = str;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:11|12|(5:16|17|(2:19|33)(2:20|(2:22|34)(2:23|35))|32|13)|24|25|26|27|28) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                com.clevertap.android.sdk.g1 r0 = com.clevertap.android.sdk.C3103g1.this
                com.clevertap.android.sdk.r0 r0 = r0.f11132c
                if (r0 != 0) goto L_0x0018
                com.clevertap.android.sdk.g1 r0 = com.clevertap.android.sdk.C3103g1.this
                com.clevertap.android.sdk.r0 r1 = new com.clevertap.android.sdk.r0
                android.content.Context r2 = r6.f11141a
                com.clevertap.android.sdk.CleverTapInstanceConfig r3 = r0.f11131b
                r1.<init>(r2, r3)
                r0.f11132c = r1
            L_0x0018:
                com.clevertap.android.sdk.g1 r0 = com.clevertap.android.sdk.C3103g1.this
                java.util.HashMap r0 = r0.f11133d
                monitor-enter(r0)
                com.clevertap.android.sdk.g1 r1 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ all -> 0x009b }
                com.clevertap.android.sdk.r0 r1 = r1.f11132c     // Catch:{ all -> 0x009b }
                java.lang.String r2 = r6.f11142b     // Catch:{ all -> 0x009b }
                org.json.JSONObject r1 = r1.mo12568b(r2)     // Catch:{ all -> 0x009b }
                if (r1 != 0) goto L_0x002f
                monitor-exit(r0)     // Catch:{ all -> 0x009d }
                return
            L_0x002f:
                java.util.Iterator r2 = r1.keys()     // Catch:{ all -> 0x009b }
            L_0x0033:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x009b }
                if (r3 == 0) goto L_0x0071
                java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x0033 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x0033 }
                java.lang.Object r4 = r1.get(r3)     // Catch:{ JSONException -> 0x0033 }
                boolean r5 = r4 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0033 }
                if (r5 == 0) goto L_0x0055
                org.json.JSONObject r4 = r1.getJSONObject(r3)     // Catch:{ JSONException -> 0x0033 }
                com.clevertap.android.sdk.g1 r5 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ JSONException -> 0x0033 }
                java.util.HashMap r5 = r5.f11133d     // Catch:{ JSONException -> 0x0033 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0033 }
                goto L_0x0033
            L_0x0055:
                boolean r5 = r4 instanceof org.json.JSONArray     // Catch:{ JSONException -> 0x0033 }
                if (r5 == 0) goto L_0x0067
                org.json.JSONArray r4 = r1.getJSONArray(r3)     // Catch:{ JSONException -> 0x0033 }
                com.clevertap.android.sdk.g1 r5 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ JSONException -> 0x0033 }
                java.util.HashMap r5 = r5.f11133d     // Catch:{ JSONException -> 0x0033 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0033 }
                goto L_0x0033
            L_0x0067:
                com.clevertap.android.sdk.g1 r5 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ JSONException -> 0x0033 }
                java.util.HashMap r5 = r5.f11133d     // Catch:{ JSONException -> 0x0033 }
                r5.put(r3, r4)     // Catch:{ JSONException -> 0x0033 }
                goto L_0x0033
            L_0x0071:
                com.clevertap.android.sdk.g1 r1 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ all -> 0x009b }
                com.clevertap.android.sdk.h1 r1 = r1.m14889d()     // Catch:{ all -> 0x009b }
                com.clevertap.android.sdk.g1 r2 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ all -> 0x009b }
                java.lang.String r2 = r2.m14885c()     // Catch:{ all -> 0x009b }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
                r3.<init>()     // Catch:{ all -> 0x009b }
                java.lang.String r4 = "Local Data Store - Inflated local profile "
                r3.append(r4)     // Catch:{ all -> 0x009b }
                com.clevertap.android.sdk.g1 r4 = com.clevertap.android.sdk.C3103g1.this     // Catch:{ all -> 0x009b }
                java.util.HashMap r4 = r4.f11133d     // Catch:{ all -> 0x009b }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x009b }
                r3.append(r4)     // Catch:{ all -> 0x009b }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009b }
                r1.mo12315c(r2, r3)     // Catch:{ all -> 0x009b }
            L_0x009b:
                monitor-exit(r0)     // Catch:{ all -> 0x009d }
                return
            L_0x009d:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x009d }
                goto L_0x00a1
            L_0x00a0:
                throw r1
            L_0x00a1:
                goto L_0x00a0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3103g1.C3105b.run():void");
        }
    }

    /* renamed from: com.clevertap.android.sdk.g1$c */
    /* compiled from: LocalDataStore */
    class C3106c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f11143a;

        C3106c(String str) {
            this.f11143a = str;
        }

        public void run() {
            synchronized (C3103g1.this.f11133d) {
                long a = C3103g1.this.f11132c.mo12558a(this.f11143a, new JSONObject(C3103g1.this.f11133d));
                C3111h1 b = C3103g1.this.m14889d();
                String a2 = C3103g1.this.m14885c();
                StringBuilder sb = new StringBuilder();
                sb.append("Persist Local Profile complete with status ");
                sb.append(a);
                sb.append(" for id ");
                sb.append(this.f11143a);
                b.mo12315c(a2, sb.toString());
            }
        }
    }

    C3103g1(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f11130a = context;
        this.f11131b = cleverTapInstanceConfig;
        this.f11135f = Executors.newFixedThreadPool(1);
        m14881b(context);
    }

    /* renamed from: f */
    private void m14893f(String str) {
        if (str != null) {
            synchronized (this.f11133d) {
                try {
                    this.f11133d.remove(str);
                } catch (Throwable th) {
                    C3111h1 d = m14889d();
                    String c = m14885c();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to remove local profile value for key ");
                    sb.append(str);
                    d.mo12316c(c, sb.toString(), th);
                }
            }
        }
    }

    /* renamed from: g */
    private Integer m14895g(String str) {
        Integer num;
        if (str == null) {
            return Integer.valueOf(0);
        }
        synchronized (this.f11136g) {
            num = (Integer) this.f11136g.get(str);
        }
        return num;
    }

    /* renamed from: h */
    private void m14898h(String str) {
        if (str != null) {
            synchronized (this.f11136g) {
                this.f11136g.remove(str);
            }
        }
    }

    /* renamed from: i */
    private String m14899i(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(this.f11131b.mo12093a());
        return sb.toString();
    }

    /* renamed from: j */
    private void m14900j(String str) {
        if (str != null) {
            synchronized (this.f11136g) {
                this.f11136g.put(str, Integer.valueOf(m14876b()));
            }
        }
    }

    /* renamed from: b */
    private void m14881b(Context context) {
        m14873a("LocalDataStore#inflateLocalProfileAsync", (Runnable) new C3105b(context, this.f11131b.mo12093a()));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public String m14885c() {
        return this.f11131b.mo12093a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C3111h1 m14889d() {
        return this.f11131b.mo12108l();
    }

    /* renamed from: e */
    private Object m14890e(String str) {
        Object obj;
        if (str == null) {
            return null;
        }
        synchronized (this.f11133d) {
            try {
                obj = this.f11133d.get(str);
            } catch (Throwable th) {
                m14889d().mo12316c(m14885c(), "Failed to retrieve local profile property", th);
                return null;
            }
        }
        return obj;
    }

    /* renamed from: c */
    private JSONObject m14887c(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject == null || jSONObject.length() <= 0) {
            return jSONObject2;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String obj = keys.next().toString();
                    if (m14879b(obj, currentTimeMillis).booleanValue()) {
                        C3111h1 d = m14889d();
                        String c = m14885c();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Rejecting upstream value for key ");
                        sb.append(obj);
                        sb.append(" because our local cache prohibits it");
                        d.mo12315c(c, sb.toString());
                    } else {
                        Object c2 = mo12286c(obj);
                        Object obj2 = jSONObject.get(obj);
                        if (m14865a(obj2).booleanValue()) {
                            obj2 = null;
                        }
                        if (!m14878b(obj2, c2).booleanValue()) {
                            if (obj2 != null) {
                                jSONObject3.put(obj, obj2);
                            } else {
                                m14871a(obj, Boolean.valueOf(true), true);
                            }
                            JSONObject a = m14869a(c2, obj2);
                            if (a != null) {
                                jSONObject2.put(obj, a);
                            }
                        }
                    }
                } catch (Throwable th) {
                    m14889d().mo12316c(m14885c(), "Failed to update profile field", th);
                }
            }
            if (jSONObject3.length() > 0) {
                m14875a(jSONObject3, Boolean.valueOf(true));
            }
            return jSONObject2;
        } catch (Throwable th2) {
            m14889d().mo12316c(m14885c(), "Failed to sync remote profile", th2);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo12287d(String str) {
        m14871a(str, Boolean.valueOf(false), true);
    }

    /* renamed from: a */
    private void m14873a(String str, Runnable runnable) {
        try {
            if (Thread.currentThread().getId() == f11129h) {
                runnable.run();
            } else {
                this.f11135f.submit(new C3104a(str, runnable));
            }
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Failed to submit task to the executor service", th);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private void m14882b(Context context, JSONObject jSONObject) {
        String str;
        try {
            String string = jSONObject.getString("evtName");
            if (string != null) {
                if (!this.f11131b.mo12112p()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("local_events:");
                    sb.append(this.f11131b.mo12093a());
                    str = sb.toString();
                } else {
                    str = "local_events";
                }
                SharedPreferences a = C3217s1.m15526a(context, str);
                int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                C3227u0 a2 = m14864a(string, m14868a(string, m14866a(currentTimeMillis, currentTimeMillis, 0), str));
                String a3 = m14866a(a2.mo12622b(), currentTimeMillis, a2.mo12621a() + 1);
                Editor edit = a.edit();
                edit.putString(m14899i(string), a3);
                C3217s1.m15529a(edit);
            }
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Failed to persist event locally", th);
        }
    }

    /* renamed from: h */
    private void m14897h() {
        synchronized (this.f11136g) {
            this.f11136g.clear();
        }
        synchronized (this.f11133d) {
            this.f11133d.clear();
        }
        this.f11132c.mo12575d(m14891e());
    }

    /* renamed from: f */
    private boolean m14894f() {
        return this.f11131b.mo12114r();
    }

    /* renamed from: g */
    private void m14896g() {
        m14873a("LocalDataStore#persistLocalProfileAsync", (Runnable) new C3106c(this.f11131b.mo12093a()));
    }

    /* renamed from: e */
    private String m14891e() {
        return this.f11131b.mo12093a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12283a(JSONObject jSONObject) {
        try {
            String str = "dsync";
            if (!this.f11131b.mo12114r()) {
                jSONObject.put(str, false);
                return;
            }
            String string = jSONObject.getString("type");
            if (C0770p.f3524g0.equals(string)) {
                if ("App Launched".equals(jSONObject.getString("evtName"))) {
                    m14889d().mo12315c(m14885c(), "Local cache needs to be updated (triggered by App Launched)");
                    jSONObject.put(str, true);
                    return;
                }
            }
            if (C4420j.f13552a.equals(string)) {
                jSONObject.put(str, true);
                m14889d().mo12315c(m14885c(), "Local cache needs to be updated (profile event)");
                return;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            if (m14861a("local_cache_last_update", currentTimeMillis) + m14860a(1200) < currentTimeMillis) {
                jSONObject.put(str, true);
                m14889d().mo12315c(m14885c(), "Local cache needs to be updated");
            } else {
                jSONObject.put(str, false);
                m14889d().mo12315c(m14885c(), "Local cache doesn't need to be updated");
            }
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Failed to sync with upstream", th);
        }
    }

    /* renamed from: b */
    private Boolean m14879b(String str, int i) {
        if (i <= 0) {
            i = (int) (System.currentTimeMillis() / 1000);
        }
        Integer g = m14895g(str);
        return Boolean.valueOf(g != null && g.intValue() > i);
    }

    /* renamed from: b */
    private Boolean m14878b(Object obj, Object obj2) {
        return Boolean.valueOf(m14880b(obj).equals(m14880b(obj2)));
    }

    /* renamed from: b */
    private String m14880b(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    /* renamed from: b */
    private int m14876b() {
        return ((int) (System.currentTimeMillis() / 1000)) + m14860a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo12285b(JSONObject jSONObject) {
        m14875a(jSONObject, Boolean.valueOf(false));
    }

    /* renamed from: b */
    private void m14883b(String str, Object obj) {
        if (str != null && obj != null) {
            synchronized (this.f11133d) {
                this.f11133d.put(str, obj);
            }
        }
    }

    /* renamed from: c */
    private JSONObject m14886c(Context context, JSONObject jSONObject) {
        String str;
        C3103g1 g1Var = this;
        String str2 = "newValue";
        String str3 = "oldValue";
        try {
            if (!g1Var.f11131b.mo12112p()) {
                StringBuilder sb = new StringBuilder();
                sb.append("local_events:");
                sb.append(g1Var.f11131b.mo12093a());
                str = sb.toString();
            } else {
                str = "local_events";
            }
            String str4 = str;
            SharedPreferences a = C3217s1.m15526a(context, str4);
            Iterator keys = jSONObject.keys();
            Editor edit = a.edit();
            JSONObject jSONObject2 = null;
            while (keys.hasNext()) {
                String obj = keys.next().toString();
                C3227u0 a2 = g1Var.m14864a(obj, g1Var.m14868a(obj, g1Var.m14866a(0, 0, 0), str4));
                JSONArray jSONArray = jSONObject.getJSONArray(obj);
                if (jSONArray == null || jSONArray.length() < 3) {
                    m14889d().mo12315c(m14885c(), "Corrupted upstream event detail");
                } else {
                    try {
                        int i = jSONArray.getInt(0);
                        int i2 = jSONArray.getInt(1);
                        int i3 = jSONArray.getInt(2);
                        String str5 = " from upstream";
                        if (i > a2.mo12621a()) {
                            edit.putString(g1Var.m14899i(obj), g1Var.m14866a(i2, i3, i));
                            C3111h1 d = m14889d();
                            String c = m14885c();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Accepted update for event ");
                            sb2.append(obj);
                            sb2.append(str5);
                            d.mo12315c(c, sb2.toString());
                            if (jSONObject2 == null) {
                                jSONObject2 = new JSONObject();
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(str3, a2.mo12621a());
                            jSONObject4.put(str2, i);
                            jSONObject3.put("count", jSONObject4);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put(str3, a2.mo12622b());
                            jSONObject5.put(str2, jSONArray.getInt(1));
                            jSONObject3.put("firstTime", jSONObject5);
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put(str3, a2.mo12623c());
                            jSONObject6.put(str2, jSONArray.getInt(2));
                            jSONObject3.put("lastTime", jSONObject6);
                            jSONObject2.put(obj, jSONObject3);
                        } else {
                            C3111h1 d2 = m14889d();
                            String c2 = m14885c();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Rejected update for event ");
                            sb3.append(obj);
                            sb3.append(str5);
                            d2.mo12315c(c2, sb3.toString());
                        }
                    } catch (Throwable unused) {
                        C3111h1 d3 = m14889d();
                        String c3 = m14885c();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Failed to parse upstream event message: ");
                        sb4.append(jSONArray.toString());
                        d3.mo12315c(c3, sb4.toString());
                    }
                }
                g1Var = this;
            }
            C3217s1.m15529a(edit);
            return jSONObject2;
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Couldn't sync events from upstream", th);
            return null;
        }
    }

    /* renamed from: a */
    private int m14860a(int i) {
        return m14861a("local_cache_expires_in", i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Object mo12284b(String str) {
        return mo12286c(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12280a(Context context, JSONObject jSONObject, int i) {
        if (jSONObject != null && i == 4) {
            try {
                m14882b(context, jSONObject);
            } catch (Throwable th) {
                m14889d().mo12316c(m14885c(), "Failed to sync with upstream", th);
            }
        }
    }

    /* renamed from: a */
    private String m14866a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        sb.append(i3);
        String str = "|";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    private C3227u0 m14864a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] split = str2.split("\\|");
        return new C3227u0(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), str);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r8 = r6.get(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r8 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12279a(android.content.Context r11, org.json.JSONObject r12) {
        /*
            r10 = this;
            java.lang.String r0 = "expires_in"
            java.lang.String r1 = "evpr"
            java.lang.String r2 = "_custom"
            java.lang.String r3 = "events"
            java.lang.String r4 = "profile"
            boolean r5 = r12.has(r1)     // Catch:{ all -> 0x00e8 }
            if (r5 != 0) goto L_0x0011
            return
        L_0x0011:
            org.json.JSONObject r12 = r12.getJSONObject(r1)     // Catch:{ all -> 0x00e8 }
            boolean r1 = r12.has(r4)     // Catch:{ all -> 0x00e8 }
            r5 = 0
            if (r1 == 0) goto L_0x0055
            org.json.JSONObject r1 = r12.getJSONObject(r4)     // Catch:{ all -> 0x00e8 }
            boolean r6 = r1.has(r2)     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x0050
            org.json.JSONObject r6 = r1.getJSONObject(r2)     // Catch:{ all -> 0x00e8 }
            r1.remove(r2)     // Catch:{ all -> 0x00e8 }
            java.util.Iterator r2 = r6.keys()     // Catch:{ all -> 0x00e8 }
        L_0x0031:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r7 == 0) goto L_0x0050
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x00e8 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00e8 }
            org.json.JSONArray r8 = r6.getJSONArray(r7)     // Catch:{ all -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            java.lang.Object r8 = r6.get(r7)     // Catch:{ JSONException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
            r8 = r5
        L_0x004a:
            if (r8 == 0) goto L_0x0031
            r1.put(r7, r8)     // Catch:{ all -> 0x00e8 }
            goto L_0x0031
        L_0x0050:
            org.json.JSONObject r1 = r10.m14887c(r1)     // Catch:{ all -> 0x00e8 }
            goto L_0x0056
        L_0x0055:
            r1 = r5
        L_0x0056:
            boolean r2 = r12.has(r3)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x0065
            org.json.JSONObject r2 = r12.getJSONObject(r3)     // Catch:{ all -> 0x00e8 }
            org.json.JSONObject r2 = r10.m14886c(r11, r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x0066
        L_0x0065:
            r2 = r5
        L_0x0066:
            boolean r6 = r12.has(r0)     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x0073
            int r12 = r12.getInt(r0)     // Catch:{ all -> 0x00e8 }
            r10.m14870a(r11, r12)     // Catch:{ all -> 0x00e8 }
        L_0x0073:
            java.lang.String r12 = "local_cache_last_update"
            java.lang.String r12 = r10.m14899i(r12)     // Catch:{ all -> 0x00e8 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e8 }
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r0 = (int) r6     // Catch:{ all -> 0x00e8 }
            com.clevertap.android.sdk.C3217s1.m15532b(r11, r12, r0)     // Catch:{ all -> 0x00e8 }
            r12 = 1
            r0 = 0
            if (r1 == 0) goto L_0x0090
            int r6 = r1.length()     // Catch:{ all -> 0x00e8 }
            if (r6 <= 0) goto L_0x0090
            r6 = 1
            goto L_0x0091
        L_0x0090:
            r6 = 0
        L_0x0091:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x009e
            int r7 = r2.length()     // Catch:{ all -> 0x00e8 }
            if (r7 <= 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r12 = 0
        L_0x009f:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x00e8 }
            boolean r0 = r6.booleanValue()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00af
            boolean r0 = r12.booleanValue()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00f6
        L_0x00af:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x00e8 }
            r0.<init>()     // Catch:{ all -> 0x00e8 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x00bd
            r0.put(r4, r1)     // Catch:{ all -> 0x00e8 }
        L_0x00bd:
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x00e8 }
            if (r12 == 0) goto L_0x00c6
            r0.put(r3, r2)     // Catch:{ all -> 0x00e8 }
        L_0x00c6:
            com.clevertap.android.sdk.p0 r11 = com.clevertap.android.sdk.C3150p0.m15330m(r11)     // Catch:{ all -> 0x00d2 }
            if (r11 == 0) goto L_0x00d3
            com.clevertap.android.sdk.t1 r11 = r11.mo12491p()     // Catch:{ all -> 0x00d2 }
            r5 = r11
            goto L_0x00d3
        L_0x00d2:
        L_0x00d3:
            if (r5 == 0) goto L_0x00f6
            r5.mo12618a(r0)     // Catch:{ all -> 0x00d9 }
            goto L_0x00f6
        L_0x00d9:
            r11 = move-exception
            com.clevertap.android.sdk.h1 r12 = r10.m14889d()     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r10.m14885c()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "Execution of sync listener failed"
            r12.mo12316c(r0, r1, r11)     // Catch:{ all -> 0x00e8 }
            goto L_0x00f6
        L_0x00e8:
            r11 = move-exception
            com.clevertap.android.sdk.h1 r12 = r10.m14889d()
            java.lang.String r0 = r10.m14885c()
            java.lang.String r1 = "Failed to sync with upstream"
            r12.mo12316c(r0, r1, r11)
        L_0x00f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clevertap.android.sdk.C3103g1.mo12279a(android.content.Context, org.json.JSONObject):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Object mo12286c(String str) {
        return m14890e(str);
    }

    /* renamed from: a */
    private void m14870a(Context context, int i) {
        C3217s1.m15532b(context, m14899i("local_cache_expires_in"), i);
    }

    /* renamed from: a */
    private Boolean m14865a(Object obj) {
        boolean z = true;
        if (obj == null) {
            return Boolean.valueOf(true);
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (obj instanceof String) {
            valueOf = Boolean.valueOf(((String) obj).trim().length() == 0);
        }
        if (obj instanceof JSONArray) {
            if (((JSONArray) obj).length() > 0) {
                z = false;
            }
            valueOf = Boolean.valueOf(z);
        }
        return valueOf;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12282a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            m14874a(arrayList, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    private void m14874a(ArrayList<String> arrayList, Boolean bool) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m14871a((String) it.next(), bool, false);
            }
            m14896g();
        }
    }

    /* renamed from: a */
    private void m14871a(String str, Boolean bool, boolean z) {
        if (str != null) {
            try {
                m14893f(str);
                if (!bool.booleanValue()) {
                    m14900j(str);
                }
            } catch (Throwable unused) {
            }
            if (z) {
                m14896g();
            }
        }
    }

    /* renamed from: a */
    private JSONObject m14869a(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        if (obj2 == null) {
            try {
                obj2 = Integer.valueOf(-1);
            } catch (Throwable th) {
                m14889d().mo12316c(m14885c(), "Failed to create profile changed values object", th);
                return null;
            }
        }
        jSONObject.put("newValue", obj2);
        if (obj != null) {
            jSONObject.put("oldValue", obj);
        }
        return jSONObject;
    }

    /* renamed from: a */
    private void m14875a(JSONObject jSONObject, Boolean bool) {
        if (jSONObject != null) {
            try {
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String obj = keys.next().toString();
                    m14872a(obj, jSONObject.get(obj), bool, false);
                }
                m14896g();
            } catch (Throwable th) {
                m14889d().mo12316c(m14885c(), "Failed to set profile fields", th);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12281a(String str, Object obj) {
        m14872a(str, obj, Boolean.valueOf(false), true);
    }

    /* renamed from: a */
    private void m14872a(String str, Object obj, Boolean bool, boolean z) {
        if (str != null && obj != null) {
            try {
                m14883b(str, obj);
                if (!bool.booleanValue()) {
                    m14900j(str);
                }
            } catch (Throwable unused) {
            }
            if (z) {
                m14896g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3227u0 mo12276a(String str) {
        String str2;
        try {
            if (!m14894f()) {
                return null;
            }
            if (!this.f11131b.mo12112p()) {
                StringBuilder sb = new StringBuilder();
                sb.append("local_events:");
                sb.append(this.f11131b.mo12093a());
                str2 = sb.toString();
            } else {
                str2 = "local_events";
            }
            return m14864a(str, m14868a(str, (String) null, str2));
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Failed to retrieve local event detail", th);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Map<String, C3227u0> mo12277a(Context context) {
        String str;
        try {
            if (!this.f11131b.mo12112p()) {
                StringBuilder sb = new StringBuilder();
                sb.append("local_events:");
                sb.append(this.f11131b.mo12093a());
                str = sb.toString();
            } else {
                str = "local_events";
            }
            Map all = C3217s1.m15526a(context, str).getAll();
            HashMap hashMap = new HashMap();
            for (String str2 : all.keySet()) {
                hashMap.put(str2, m14864a(str2, all.get(str2).toString()));
            }
            return hashMap;
        } catch (Throwable th) {
            m14889d().mo12316c(m14885c(), "Failed to retrieve local event history", th);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12278a() {
        m14897h();
    }

    /* renamed from: a */
    private String m14868a(String str, String str2, String str3) {
        if (!this.f11131b.mo12112p()) {
            return C3217s1.m15528a(this.f11130a, str3, m14899i(str), str2);
        }
        String a = C3217s1.m15528a(this.f11130a, str3, m14899i(str), str2);
        if (a == null) {
            a = C3217s1.m15528a(this.f11130a, str3, str, str2);
        }
        return a;
    }

    /* renamed from: a */
    private int m14861a(String str, int i) {
        if (!this.f11131b.mo12112p()) {
            return C3217s1.m15522a(this.f11130a, m14899i(str), i);
        }
        int a = C3217s1.m15522a(this.f11130a, m14899i(str), (int) C0798u.f3805q);
        if (a == -1000) {
            a = C3217s1.m15522a(this.f11130a, str, i);
        }
        return a;
    }
}
