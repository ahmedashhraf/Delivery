package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.indexing.C14094b;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;

/* renamed from: io.branch.referral.k0 */
/* compiled from: ServerRequestRegisterClose */
class C14138k0 extends C14205y {
    public C14138k0(Context context) {
        super(context, C14171c.RegisterClose.mo44768d());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            jSONObject.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                jSONObject.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            JSONObject a = C14094b.m60938a().mo44568a(context);
            if (a != null) {
                jSONObject.put(C14169a.ContentDiscovery.mo44764d(), a);
            }
            if (C14175t.m61318f() != null) {
                jSONObject.put(C14169a.AppVersion.mo44764d(), C14175t.m61318f().mo44779a());
            }
            mo44635a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44615a() {
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        this.f41890c.mo45012z("bnc_no_value");
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        return !super.mo45017a(context);
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo44622l() {
        return false;
    }

    public C14138k0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
