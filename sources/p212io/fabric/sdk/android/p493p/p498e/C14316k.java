package p212io.fabric.sdk.android.p493p.p498e;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14254k;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p497d.C14302d;
import p212io.fabric.sdk.android.p493p.p497d.C14303e;

/* renamed from: io.fabric.sdk.android.p.e.k */
/* compiled from: DefaultSettingsController */
class C14316k implements C14328t {

    /* renamed from: i */
    private static final String f42218i = "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.";

    /* renamed from: j */
    private static final String f42219j = "existing_instance_identifier";

    /* renamed from: a */
    private final C14332x f42220a;

    /* renamed from: b */
    private final C14331w f42221b;

    /* renamed from: c */
    private final C14254k f42222c;

    /* renamed from: d */
    private final C14313h f42223d;

    /* renamed from: e */
    private final C14333y f42224e;

    /* renamed from: f */
    private final C14225i f42225f;

    /* renamed from: g */
    private final C14302d f42226g = new C14303e(this.f42225f);

    /* renamed from: h */
    private final C14255l f42227h;

    public C14316k(C14225i iVar, C14332x xVar, C14254k kVar, C14331w wVar, C14313h hVar, C14333y yVar, C14255l lVar) {
        this.f42225f = iVar;
        this.f42220a = xVar;
        this.f42222c = kVar;
        this.f42221b = wVar;
        this.f42223d = hVar;
        this.f42224e = yVar;
        this.f42227h = lVar;
    }

    /* renamed from: b */
    private C14329u m62012b(C14327s sVar) {
        String str = C14215d.f41919m;
        C14329u uVar = null;
        try {
            if (C14327s.SKIP_CACHE_LOOKUP.equals(sVar)) {
                return null;
            }
            JSONObject a = this.f42223d.mo45259a();
            if (a != null) {
                C14329u a2 = this.f42221b.mo45267a(this.f42222c, a);
                if (a2 != null) {
                    m62011a(a, "Loaded cached settings: ");
                    long a3 = this.f42222c.mo45145a();
                    if (!C14327s.IGNORE_CACHE_EXPIRATION.equals(sVar)) {
                        if (a2.mo45280a(a3)) {
                            C14215d.m61672j().mo45042d(str, "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C14215d.m61672j().mo45042d(str, "Returning cached settings.");
                        return a2;
                    } catch (Exception e) {
                        e = e;
                        uVar = a2;
                        C14215d.m61672j().mo45045e(str, "Failed to get cached settings", e);
                        return uVar;
                    }
                } else {
                    C14215d.m61672j().mo45045e(str, "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                C14215d.m61672j().mo45042d(str, "No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C14215d.m61672j().mo45045e(str, "Failed to get cached settings", e);
            return uVar;
        }
    }

    /* renamed from: a */
    public C14329u mo45261a() {
        return mo45262a(C14327s.USE_CACHE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo45265c() {
        return C14248i.m61807a(C14248i.m61847o(this.f42225f.getContext()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo45266d() {
        return this.f42226g.get().getString(f42219j, "");
    }

    /* renamed from: a */
    public C14329u mo45262a(C14327s sVar) {
        boolean a = this.f42227h.mo45147a();
        String str = C14215d.f41919m;
        C14329u uVar = null;
        if (!a) {
            C14215d.m61672j().mo45042d(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C14215d.m61674l() && !mo45264b()) {
                uVar = m62012b(sVar);
            }
            if (uVar == null) {
                JSONObject a2 = this.f42224e.mo45269a(this.f42220a);
                if (a2 != null) {
                    uVar = this.f42221b.mo45267a(this.f42222c, a2);
                    this.f42223d.mo45260a(uVar.f42273g, a2);
                    m62011a(a2, "Loaded settings: ");
                    mo45263a(mo45265c());
                }
            }
            if (uVar == null) {
                uVar = m62012b(C14327s.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(str, f42218i, e);
        }
        return uVar;
    }

    /* renamed from: a */
    private void m62011a(JSONObject jSONObject, String str) throws JSONException {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        j.mo45042d(C14215d.f41919m, sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo45264b() {
        return !mo45266d().equals(mo45265c());
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo45263a(String str) {
        Editor a = this.f42226g.mo45251a();
        a.putString(f42219j, str);
        return this.f42226g.mo45252a(a);
    }
}
