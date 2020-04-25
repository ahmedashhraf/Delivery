package p212io.branch.referral;

import android.app.Activity;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.indexing.C14094b;
import p212io.branch.indexing.C14099c;
import p212io.branch.referral.C14153p.C6033d;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C6009d.C6023n;
import p212io.branch.referral.p492t0.C14179b;

/* renamed from: io.branch.referral.e0 */
/* compiled from: ServerRequestInitSession */
abstract class C14125e0 extends C14205y {

    /* renamed from: q */
    static final String f41539q = "open";

    /* renamed from: r */
    static final String f41540r = "install";

    /* renamed from: s */
    private static final int f41541s = 0;

    /* renamed from: t */
    private static final int f41542t = 2;

    /* renamed from: u */
    private static final int f41543u = 1;

    /* renamed from: n */
    private final Context f41544n;

    /* renamed from: o */
    private final C14099c f41545o = C14099c.m60966a(this.f41544n);

    /* renamed from: p */
    final C14161q0 f41546p;

    C14125e0(Context context, String str, C14161q0 q0Var) {
        super(context, str);
        this.f41544n = context;
        this.f41546p = q0Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo44635a(JSONObject jSONObject) throws JSONException {
        super.mo44635a(jSONObject);
        if (!this.f41546p.mo44741a().equals("bnc_no_value")) {
            jSONObject.put(C14169a.AppVersion.mo44764d(), this.f41546p.mo44741a());
        }
        jSONObject.put(C14169a.FaceBookAppLinkChecked.mo44764d(), this.f41890c.mo45004v());
        jSONObject.put(C14169a.IsReferrable.mo44764d(), this.f41890c.mo45005w());
        jSONObject.put(C14169a.Debug.mo44764d(), this.f41890c.mo44983l());
        m61076b(jSONObject);
        mo45014a(this.f41544n, jSONObject);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo44637b(C14152o0 o0Var, C6009d dVar) {
        C14099c cVar = this.f41545o;
        if (cVar != null) {
            cVar.mo44578a(o0Var.mo44721c());
            if (dVar.f17270q != null) {
                try {
                    C14094b.m60938a().mo44571b((Activity) dVar.f17270q.get(), dVar.f17274u);
                } catch (Exception unused) {
                }
            }
        }
        C14179b.m61331a(dVar.f17270q);
        dVar.mo24830x();
    }

    /* renamed from: j */
    public boolean mo44638j() {
        return true;
    }

    /* renamed from: n */
    public void mo44639n() {
        String str = "bnc_no_value";
        JSONObject f = mo45022f();
        try {
            if (!this.f41890c.mo44972f().equals(str)) {
                f.put(C14169a.AndroidAppLinkURL.mo44764d(), this.f41890c.mo44972f());
            }
            if (!this.f41890c.mo44926A().equals(str)) {
                f.put(C14169a.AndroidPushIdentifier.mo44764d(), this.f41890c.mo44926A());
            }
            if (!this.f41890c.mo44987n().equals(str)) {
                f.put(C14169a.External_Intent_URI.mo44764d(), this.f41890c.mo44987n());
            }
            if (!this.f41890c.mo44985m().equals(str)) {
                f.put(C14169a.External_Intent_Extra.mo44764d(), this.f41890c.mo44985m());
            }
            if (this.f41545o != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C14099c.f41429k, this.f41545o.mo44577a());
                jSONObject.put(C14099c.f41430l, this.f41544n.getPackageName());
                f.put(C14099c.f41438t, jSONObject);
            }
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo44640p() {
        JSONObject f = mo45022f();
        if (!f.has(C14169a.AndroidAppLinkURL.mo44764d()) && !f.has(C14169a.AndroidPushIdentifier.mo44764d()) && !f.has(C14169a.LinkIdentifier.mo44764d())) {
            return super.mo44640p();
        }
        f.remove(C14169a.DeviceFingerprintID.mo44764d());
        f.remove(C14169a.IdentityID.mo44764d());
        f.remove(C14169a.FaceBookAppLinkChecked.mo44764d());
        f.remove(C14169a.External_Intent_Extra.mo44764d());
        f.remove(C14169a.External_Intent_URI.mo44764d());
        f.remove(C14169a.FirstInstallTime.mo44764d());
        f.remove(C14169a.LastUpdateTime.mo44764d());
        f.remove(C14169a.OriginalInstallTime.mo44764d());
        f.remove(C14169a.PreviousUpdateTime.mo44764d());
        f.remove(C14169a.InstallBeginTimeStamp.mo44764d());
        f.remove(C14169a.ClickedReferrerTimeStamp.mo44764d());
        f.remove(C14169a.HardwareID.mo44764d());
        f.remove(C14169a.IsHardwareIDReal.mo44764d());
        f.remove(C14169a.LocalIP.mo44764d());
        try {
            f.put(C14169a.TrackingDisabled.mo44764d(), true);
        } catch (JSONException unused) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo44641s() {
        return true;
    }

    /* renamed from: u */
    public abstract String mo44623u();

    /* renamed from: v */
    public abstract boolean mo44624v();

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo44625w() {
        String z = this.f41890c.mo45011z();
        String str = "bnc_no_value";
        if (!z.equals(str)) {
            try {
                mo45022f().put(C14169a.LinkIdentifier.mo44764d(), z);
                mo45022f().put(C14169a.FaceBookAppLinkChecked.mo44764d(), this.f41890c.mo45004v());
            } catch (JSONException unused) {
            }
        }
        String p = this.f41890c.mo44991p();
        if (!p.equals(str)) {
            try {
                mo45022f().put(C14169a.GoogleSearchInstallReferrer.mo44764d(), p);
            } catch (JSONException unused2) {
            }
        }
        String o = this.f41890c.mo44989o();
        if (!o.equals(str)) {
            try {
                mo45022f().put(C14169a.GooglePlayInstallReferrer.mo44764d(), o);
            } catch (JSONException unused3) {
            }
        }
        if (this.f41890c.mo44937J()) {
            try {
                mo45022f().put(C14169a.AndroidAppLinkURL.mo44764d(), this.f41890c.mo44972f());
                mo45022f().put(C14169a.IsFullAppConv.mo44764d(), true);
            } catch (JSONException unused4) {
            }
        }
    }

    C14125e0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f41544n = context;
        this.f41546p = new C14161q0(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        if ((r2.lastUpdateTime - r2.firstInstallTime) >= 86400000) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m61076b(org.json.JSONObject r10) throws org.json.JSONException {
        /*
            r9 = this;
            io.branch.referral.q0 r0 = r9.f41546p
            java.lang.String r0 = r0.mo44741a()
            r1 = 0
            android.content.Context r2 = r9.f41544n     // Catch:{ NameNotFoundException -> 0x0018 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0018 }
            android.content.Context r3 = r9.f41544n     // Catch:{ NameNotFoundException -> 0x0018 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0018 }
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r1)     // Catch:{ NameNotFoundException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            io.branch.referral.x r3 = r9.f41890c
            java.lang.String r3 = r3.mo44974g()
            java.lang.String r4 = "bnc_no_value"
            boolean r3 = r4.equals(r3)
            r4 = 2
            if (r3 == 0) goto L_0x0037
            if (r2 == 0) goto L_0x0046
            long r5 = r2.lastUpdateTime
            long r7 = r2.firstInstallTime
            long r5 = r5 - r7
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0046
            goto L_0x0043
        L_0x0037:
            io.branch.referral.x r1 = r9.f41890c
            java.lang.String r1 = r1.mo44974g()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r1 = 2
            goto L_0x0046
        L_0x0045:
            r1 = 1
        L_0x0046:
            io.branch.referral.s$a r0 = p212io.branch.referral.C14168s.C14169a.Update
            java.lang.String r0 = r0.mo44764d()
            r10.put(r0, r1)
            if (r2 == 0) goto L_0x00b0
            io.branch.referral.s$a r0 = p212io.branch.referral.C14168s.C14169a.FirstInstallTime
            java.lang.String r0 = r0.mo44764d()
            long r3 = r2.firstInstallTime
            r10.put(r0, r3)
            io.branch.referral.s$a r0 = p212io.branch.referral.C14168s.C14169a.LastUpdateTime
            java.lang.String r0 = r0.mo44764d()
            long r3 = r2.lastUpdateTime
            r10.put(r0, r3)
            io.branch.referral.x r0 = r9.f41890c
            java.lang.String r1 = "bnc_original_install_time"
            long r3 = r0.mo44975h(r1)
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
            long r3 = r2.firstInstallTime
            io.branch.referral.x r0 = r9.f41890c
            r0.mo44948a(r1, r3)
        L_0x007c:
            io.branch.referral.s$a r0 = p212io.branch.referral.C14168s.C14169a.OriginalInstallTime
            java.lang.String r0 = r0.mo44764d()
            r10.put(r0, r3)
            io.branch.referral.x r0 = r9.f41890c
            java.lang.String r1 = "bnc_last_known_update_time"
            long r3 = r0.mo44975h(r1)
            long r5 = r2.lastUpdateTime
            java.lang.String r0 = "bnc_previous_update_time"
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            io.branch.referral.x r5 = r9.f41890c
            r5.mo44948a(r0, r3)
            io.branch.referral.x r3 = r9.f41890c
            long r4 = r2.lastUpdateTime
            r3.mo44948a(r1, r4)
        L_0x00a1:
            io.branch.referral.s$a r1 = p212io.branch.referral.C14168s.C14169a.PreviousUpdateTime
            java.lang.String r1 = r1.mo44764d()
            io.branch.referral.x r2 = r9.f41890c
            long r2 = r2.mo44975h(r0)
            r10.put(r1, r2)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p212io.branch.referral.C14125e0.m61076b(org.json.JSONObject):void");
    }

    /* renamed from: a */
    static boolean m61075a(String str) {
        if (str != null) {
            return str.equalsIgnoreCase("open") || str.equalsIgnoreCase(f41540r);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44636a(C14152o0 o0Var) {
        if (!(o0Var == null || o0Var.mo44721c() == null || !o0Var.mo44721c().has(C14169a.BranchViewData.mo44764d()))) {
            try {
                JSONObject jSONObject = o0Var.mo44721c().getJSONObject(C14169a.BranchViewData.mo44764d());
                String u = mo44623u();
                if (C6009d.m27463J().f17270q == null || C6009d.m27463J().f17270q.get() == null) {
                    return C14153p.m61241a().mo44726a(jSONObject, u);
                }
                Activity activity = (Activity) C6009d.m27463J().f17270q.get();
                boolean z = true;
                if (activity instanceof C6023n) {
                    z = true ^ ((C6023n) activity).mo24855a();
                }
                if (z) {
                    return C14153p.m61241a().mo44727a(jSONObject, u, (Context) activity, (C6033d) C6009d.m27463J());
                }
                return C14153p.m61241a().mo44726a(jSONObject, u);
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        String str = "bnc_no_value";
        try {
            this.f41890c.mo45006w(str);
            this.f41890c.mo44994q(str);
            this.f41890c.mo44992p(str);
            this.f41890c.mo44990o(str);
            this.f41890c.mo44988n(str);
            this.f41890c.mo44980j(str);
            this.f41890c.mo45008x(str);
            this.f41890c.mo44946a(Boolean.valueOf(false));
            this.f41890c.mo45002u(str);
            this.f41890c.mo44957b(false);
            if (o0Var.mo44721c() != null && o0Var.mo44721c().has(C14169a.Data.mo44764d())) {
                JSONObject jSONObject = new JSONObject(o0Var.mo44721c().getString(C14169a.Data.mo44764d()));
                if (jSONObject.optBoolean(C14169a.Clicked_Branch_Link.mo44764d())) {
                    new C14188u().mo44794a(this instanceof C14145l0 ? C14188u.f41742a : C14188u.f41743b, jSONObject, this.f41890c.mo44995r());
                }
            }
        } catch (JSONException unused) {
        }
        String str2 = "bnc_previous_update_time";
        if (this.f41890c.mo44975h(str2) == 0) {
            C14204x xVar = this.f41890c;
            xVar.mo44948a(str2, xVar.mo44975h("bnc_last_known_update_time"));
        }
    }
}
