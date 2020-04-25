package p212io.branch.referral;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;

/* renamed from: io.branch.referral.y */
/* compiled from: ServerRequest */
public abstract class C14205y {

    /* renamed from: l */
    private static final String f41886l = "REQ_POST";

    /* renamed from: m */
    private static final String f41887m = "REQ_POST_PATH";

    /* renamed from: a */
    private JSONObject f41888a;

    /* renamed from: b */
    protected String f41889b;

    /* renamed from: c */
    protected final C14204x f41890c;

    /* renamed from: d */
    private final C14161q0 f41891d;

    /* renamed from: e */
    long f41892e = 0;

    /* renamed from: f */
    private boolean f41893f;

    /* renamed from: g */
    private int f41894g = 0;

    /* renamed from: h */
    private final Context f41895h;

    /* renamed from: i */
    final Set<C14207b> f41896i;

    /* renamed from: j */
    public boolean f41897j = false;

    /* renamed from: k */
    boolean f41898k = false;

    /* renamed from: io.branch.referral.y$a */
    /* compiled from: ServerRequest */
    public enum C14206a {
        V1,
        V2
    }

    /* renamed from: io.branch.referral.y$b */
    /* compiled from: ServerRequest */
    enum C14207b {
        FB_APP_LINK_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        STRONG_MATCH_PENDING_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK
    }

    public C14205y(Context context, String str) {
        this.f41895h = context;
        this.f41889b = str;
        this.f41890c = C14204x.m61505a(context);
        this.f41891d = new C14161q0(context);
        this.f41888a = new JSONObject();
        this.f41893f = C6009d.m27467N();
        this.f41896i = new HashSet();
    }

    /* renamed from: u */
    private void mo44623u() {
        if (mo44851d() == C14206a.V2) {
            JSONObject optJSONObject = this.f41888a.optJSONObject(C14169a.UserData.mo44764d());
            if (optJSONObject != null) {
                try {
                    optJSONObject.put(C14169a.DeveloperIdentity.mo44764d(), this.f41890c.mo44993q());
                    optJSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: v */
    private void mo44624v() {
        C14206a d = mo44851d();
        if (!TextUtils.isEmpty(C14161q0.f41680f)) {
            try {
                if (d == C14206a.V2) {
                    JSONObject optJSONObject = this.f41888a.optJSONObject(C14169a.UserData.mo44764d());
                    if (optJSONObject != null) {
                        optJSONObject.put(C14169a.AAID.mo44764d(), C14161q0.f41680f);
                        optJSONObject.put(C14169a.LimitedAdTracking.mo44764d(), this.f41891d.f41681a);
                        optJSONObject.remove(C14169a.UnidentifiedDevice.mo44764d());
                        return;
                    }
                    return;
                }
                this.f41888a.put(C14169a.GoogleAdvertisingID.mo44764d(), C14161q0.f41680f);
                this.f41888a.put(C14169a.LATVal.mo44764d(), this.f41891d.f41681a);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else {
            C14206a aVar = C14206a.V2;
            if (d == aVar && d == aVar) {
                try {
                    JSONObject optJSONObject2 = this.f41888a.optJSONObject(C14169a.UserData.mo44764d());
                    if (optJSONObject2 != null && !optJSONObject2.has(C14169a.AndroidID.mo44764d())) {
                        optJSONObject2.put(C14169a.UnidentifiedDevice.mo44764d(), true);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: w */
    private void mo44625w() {
        JSONObject optJSONObject = mo44851d() == C14206a.V1 ? this.f41888a : this.f41888a.optJSONObject(C14169a.UserData.mo44764d());
        if (optJSONObject != null) {
            boolean I = this.f41890c.mo44936I();
            if (I) {
                try {
                    optJSONObject.putOpt(C14169a.limitFacebookTracking.mo44764d(), Boolean.valueOf(I));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: x */
    private void mo44626x() {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator keys = this.f41890c.mo44928B().keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                jSONObject.put(str, this.f41890c.mo44928B().get(str));
            }
            JSONObject optJSONObject = this.f41888a.optJSONObject(C14169a.Metadata.mo44764d());
            if (optJSONObject != null) {
                Iterator keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String str2 = (String) keys2.next();
                    jSONObject.put(str2, optJSONObject.get(str2));
                }
            }
            if ((this instanceof C14145l0) && this.f41890c.mo44997s().length() > 0) {
                this.f41888a.putOpt(C14169a.InstallMetadata.mo44764d(), this.f41890c.mo44997s());
            }
            this.f41888a.put(C14169a.Metadata.mo44764d(), jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    public abstract void mo44615a();

    /* renamed from: a */
    public abstract void mo44616a(int i, String str);

    /* renamed from: a */
    public abstract void mo44617a(C14152o0 o0Var, C6009d dVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44635a(JSONObject jSONObject) throws JSONException {
        this.f41888a = jSONObject;
        if (mo44851d() == C14206a.V2) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                this.f41888a.put(C14169a.UserData.mo44764d(), jSONObject2);
                C14175t.m61316a(this.f41890c.mo44983l(), this.f41891d, this.f41893f).mo44780a(this.f41895h, this.f41890c, jSONObject2);
            } catch (JSONException unused) {
            }
        } else {
            C14175t.m61316a(this.f41890c.mo44983l(), this.f41891d, this.f41893f).mo44781a(this.f41888a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo45018b() {
        if (this instanceof C14125e0) {
            ((C14125e0) this).mo44625w();
        }
        mo44623u();
        if (mo44638j() && !C6031o.m27714c(this.f41895h)) {
            mo44624v();
        }
    }

    /* renamed from: b */
    public abstract boolean mo44620b(Context context);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo45020c() {
        mo44626x();
        if (mo44641s()) {
            mo44625w();
        }
    }

    /* renamed from: d */
    public C14206a mo44851d() {
        return C14206a.V1;
    }

    /* renamed from: e */
    public JSONObject mo45021e() {
        return this.f41888a;
    }

    /* renamed from: f */
    public JSONObject mo45022f() {
        return this.f41888a;
    }

    /* renamed from: g */
    public long mo45023g() {
        if (this.f41892e > 0) {
            return System.currentTimeMillis() - this.f41892e;
        }
        return 0;
    }

    /* renamed from: h */
    public final String mo45024h() {
        return this.f41889b;
    }

    /* renamed from: i */
    public String mo44632i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41890c.mo44969e());
        sb.append(this.f41889b);
        return sb.toString();
    }

    /* renamed from: j */
    public boolean mo44638j() {
        return false;
    }

    /* renamed from: k */
    public abstract boolean mo44621k();

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo44622l() {
        return true;
    }

    /* renamed from: m */
    public boolean mo45025m() {
        return this.f41896i.size() > 0;
    }

    /* renamed from: n */
    public void mo44639n() {
    }

    /* renamed from: o */
    public void mo45026o() {
        this.f41892e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo44640p() {
        return false;
    }

    /* renamed from: q */
    public void mo45027q() {
        StringBuilder sb = new StringBuilder();
        sb.append("Requested operation cannot be completed since tracking is disabled [");
        sb.append(this.f41889b);
        sb.append("]");
        C14204x.m61509d("BranchSDK", sb.toString());
        mo44616a((int) C14130h.f41564s, "");
    }

    /* renamed from: r */
    public boolean mo44634r() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo44641s() {
        return false;
    }

    /* renamed from: t */
    public JSONObject mo45028t() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f41886l, this.f41888a);
            jSONObject.put(f41887m, this.f41889b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m61599c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(context.getPackageName());
        boolean z = false;
        if (launchIntentForPackage == null) {
            return false;
        }
        List queryIntentActivities = packageManager.queryIntentActivities(launchIntentForPackage, 65536);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    public void mo45019b(C14207b bVar) {
        this.f41896i.remove(bVar);
    }

    /* renamed from: a */
    public JSONObject mo45013a(ConcurrentHashMap<String, String> concurrentHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f41888a != null) {
                JSONObject jSONObject2 = new JSONObject(this.f41888a.toString());
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                }
            }
            if (concurrentHashMap.size() <= 0) {
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            for (String str2 : concurrentHashMap.keySet()) {
                jSONObject3.put(str2, concurrentHashMap.get(str2));
                concurrentHashMap.remove(str2);
            }
            jSONObject.put(C14169a.Branch_Instrumentation.mo44764d(), jSONObject3);
            return jSONObject;
        } catch (JSONException unused) {
            return jSONObject;
        } catch (ConcurrentModificationException unused2) {
            return this.f41888a;
        }
    }

    protected C14205y(String str, JSONObject jSONObject, Context context) {
        this.f41895h = context;
        this.f41889b = str;
        this.f41888a = jSONObject;
        this.f41890c = C14204x.m61505a(context);
        this.f41891d = new C14161q0(context);
        this.f41893f = C6009d.m27467N();
        this.f41896i = new HashSet();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45016a(String str, String str2) {
        try {
            this.f41888a.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ JSONException -> 0x001f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p212io.branch.referral.C14205y m61598a(org.json.JSONObject r5, android.content.Context r6) {
        /*
            java.lang.String r0 = "REQ_POST_PATH"
            java.lang.String r1 = "REQ_POST"
            java.lang.String r2 = ""
            r3 = 0
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x0012 }
            if (r4 == 0) goto L_0x0012
            org.json.JSONObject r1 = r5.getJSONObject(r1)     // Catch:{ JSONException -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x001f }
            if (r4 == 0) goto L_0x0020
            java.lang.String r5 = r5.getString(r0)     // Catch:{ JSONException -> 0x001f }
            r2 = r5
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r2 == 0) goto L_0x002d
            int r5 = r2.length()
            if (r5 <= 0) goto L_0x002d
            io.branch.referral.y r5 = m61597a(r2, r1, r6)
            return r5
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14205y.m61598a(org.json.JSONObject, android.content.Context):io.branch.referral.y");
    }

    /* renamed from: a */
    private static C14205y m61597a(String str, JSONObject jSONObject, Context context) {
        if (str.equalsIgnoreCase(C14171c.CompletedAction.mo44768d())) {
            return new C14208z(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.GetURL.mo44768d())) {
            return new C14116a0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.GetCreditHistory.mo44768d())) {
            return new C14118b0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.GetCredits.mo44768d())) {
            return new C14123c0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.IdentifyUser.mo44768d())) {
            return new C14124d0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.Logout.mo44768d())) {
            return new C14127f0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.RedeemRewards.mo44768d())) {
            return new C14136j0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.RegisterClose.mo44768d())) {
            return new C14138k0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.RegisterInstall.mo44768d())) {
            return new C14145l0(str, jSONObject, context);
        }
        if (str.equalsIgnoreCase(C14171c.RegisterOpen.mo44768d())) {
            return new C14147m0(str, jSONObject, context);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo45017a(Context context) {
        return context.checkCallingOrSelfPermission("android.permission.INTERNET") == 0;
    }

    /* renamed from: a */
    public void mo45015a(C14207b bVar) {
        if (bVar != null) {
            this.f41896i.add(bVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo45014a(Context context, JSONObject jSONObject) {
        try {
            String d = (m61599c(context) ? C14169a.NativeApp : C14169a.InstantApp).mo44764d();
            if (mo44851d() == C14206a.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(C14169a.UserData.mo44764d());
                if (optJSONObject != null) {
                    optJSONObject.put(C14169a.Environment.mo44764d(), d);
                    return;
                }
                return;
            }
            jSONObject.put(C14169a.Environment.mo44764d(), d);
        } catch (Exception unused) {
        }
    }
}
