package com.amplitude.api;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.m */
/* compiled from: TrackingOptions */
public class C2891m {

    /* renamed from: b */
    private static String[] f10231b = {C2876e.f10110S, "country", C2876e.f10115X, C2876e.f10116Y, C2876e.f10119a0, C2876e.f10127e0};

    /* renamed from: c */
    public static final String f10232c = "com.amplitude.api.TrackingOptions";

    /* renamed from: a */
    Set<String> f10233a = new HashSet();

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public boolean mo11444A() {
        return m13777b("language");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public boolean mo11445B() {
        return m13777b(C2876e.f10119a0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public boolean mo11446C() {
        return m13777b(C2876e.f10121b0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public boolean mo11447D() {
        return m13777b(C2876e.f10123c0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo11448E() {
        return m13777b(C2876e.f10125d0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public boolean mo11449F() {
        return m13777b(C2876e.f10127e0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo11450G() {
        return m13777b(C2876e.f10129f0);
    }

    /* renamed from: a */
    public C2891m mo11451a() {
        m13776a(C2876e.f10108Q);
        return this;
    }

    /* renamed from: b */
    public C2891m mo11452b() {
        m13776a("carrier");
        return this;
    }

    /* renamed from: c */
    public C2891m mo11453c() {
        m13776a(C2876e.f10110S);
        return this;
    }

    /* renamed from: d */
    public C2891m mo11454d() {
        m13776a("country");
        return this;
    }

    /* renamed from: e */
    public C2891m mo11455e() {
        m13776a(C2876e.f10112U);
        return this;
    }

    /* renamed from: f */
    public C2891m mo11456f() {
        m13776a(C2876e.f10113V);
        return this;
    }

    /* renamed from: g */
    public C2891m mo11457g() {
        m13776a(C2876e.f10114W);
        return this;
    }

    /* renamed from: h */
    public C2891m mo11458h() {
        m13776a(C2876e.f10115X);
        return this;
    }

    /* renamed from: i */
    public C2891m mo11459i() {
        m13776a(C2876e.f10116Y);
        return this;
    }

    /* renamed from: j */
    public C2891m mo11460j() {
        m13776a("language");
        return this;
    }

    /* renamed from: k */
    public C2891m mo11461k() {
        m13776a(C2876e.f10119a0);
        return this;
    }

    /* renamed from: l */
    public C2891m mo11462l() {
        m13776a(C2876e.f10121b0);
        return this;
    }

    /* renamed from: m */
    public C2891m mo11463m() {
        m13776a(C2876e.f10123c0);
        return this;
    }

    /* renamed from: n */
    public C2891m mo11464n() {
        m13776a(C2876e.f10125d0);
        return this;
    }

    /* renamed from: o */
    public C2891m mo11465o() {
        m13776a(C2876e.f10127e0);
        return this;
    }

    /* renamed from: p */
    public C2891m mo11466p() {
        m13776a(C2876e.f10129f0);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public JSONObject mo11467q() {
        String[] strArr;
        JSONObject jSONObject = new JSONObject();
        if (this.f10233a.isEmpty()) {
            return jSONObject;
        }
        for (String str : f10231b) {
            if (this.f10233a.contains(str)) {
                try {
                    jSONObject.put(str, false);
                } catch (JSONException e) {
                    C2875d.m13566a().mo11292b(f10232c, e.toString());
                }
            }
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo11468r() {
        return m13777b(C2876e.f10108Q);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo11469s() {
        return m13777b("carrier");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo11470t() {
        return m13777b(C2876e.f10110S);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public boolean mo11471u() {
        return m13777b("country");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public boolean mo11472v() {
        return m13777b(C2876e.f10112U);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public boolean mo11473w() {
        return m13777b(C2876e.f10113V);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public boolean mo11474x() {
        return m13777b(C2876e.f10114W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public boolean mo11475y() {
        return m13777b(C2876e.f10115X);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: z */
    public boolean mo11476z() {
        return m13777b(C2876e.f10116Y);
    }

    /* renamed from: a */
    private void m13776a(String str) {
        this.f10233a.add(str);
    }

    /* renamed from: b */
    private boolean m13777b(String str) {
        return !this.f10233a.contains(str);
    }
}
