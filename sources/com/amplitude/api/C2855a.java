package com.amplitude.api;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.a */
/* compiled from: Amplitude */
public class C2855a {

    /* renamed from: a */
    static final Map<String, C2857c> f9987a = new HashMap();

    /* renamed from: a */
    public static synchronized C2857c m13420a(String str) {
        C2857c cVar;
        synchronized (C2855a.class) {
            String b = C2892n.m13817b(str);
            cVar = (C2857c) f9987a.get(b);
            if (cVar == null) {
                cVar = new C2857c(b);
                f9987a.put(b, cVar);
            }
        }
        return cVar;
    }

    @Deprecated
    /* renamed from: b */
    public static void m13432b() {
        m13438e().mo11239e();
    }

    @Deprecated
    /* renamed from: c */
    public static void m13435c() {
    }

    @Deprecated
    /* renamed from: c */
    public static void m13436c(String str) {
        m13438e().mo11246f(str);
    }

    @Deprecated
    /* renamed from: d */
    public static String m13437d() {
        return m13438e().mo11250g();
    }

    /* renamed from: e */
    public static C2857c m13438e() {
        return m13420a((String) null);
    }

    @Deprecated
    /* renamed from: f */
    public static void m13439f() {
    }

    @Deprecated
    /* renamed from: g */
    public static void m13440g() {
        m13438e().mo11264p();
    }

    @Deprecated
    /* renamed from: h */
    public static void m13441h() {
        m13438e().mo11265q();
    }

    @Deprecated
    /* renamed from: b */
    public static void m13434b(boolean z) {
        m13438e().mo11242e(z);
    }

    @Deprecated
    /* renamed from: b */
    public static void m13433b(String str) {
        m13438e().mo11221b(str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13424a(Context context, String str) {
        m13438e().mo11186a(context, str);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13425a(Context context, String str, String str2) {
        m13438e().mo11187a(context, str, str2);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13431a(boolean z) {
        m13438e().mo11218b(z);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13421a() {
        m13438e().mo11229c();
    }

    @Deprecated
    /* renamed from: a */
    public static void m13423a(long j) {
        m13438e().mo11256i(j);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13428a(String str, JSONObject jSONObject) {
        m13438e().mo11208a(str, jSONObject);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13422a(double d) {
        m13438e().mo11196a(d);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13426a(String str, int i, double d) {
        m13438e().mo11203a(str, i, d);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13427a(String str, int i, double d, String str2, String str3) {
        m13438e().mo11204a(str, i, d, str2, str3);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13429a(JSONObject jSONObject) {
        m13438e().mo11213a(jSONObject);
    }

    @Deprecated
    /* renamed from: a */
    public static void m13430a(JSONObject jSONObject, boolean z) {
        m13438e().mo11214a(jSONObject, z);
    }
}
