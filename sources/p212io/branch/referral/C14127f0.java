package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6026q;

/* renamed from: io.branch.referral.f0 */
/* compiled from: ServerRequestLogout */
class C14127f0 extends C14205y {

    /* renamed from: n */
    private C6026q f41547n;

    public C14127f0(Context context, C6026q qVar) {
        super(context, C14171c.Logout.mo44768d());
        this.f41547n = qVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                jSONObject.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            mo44635a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        C6026q qVar;
        String str = "bnc_no_value";
        try {
            this.f41890c.mo45010y(o0Var.mo44721c().getString(C14169a.SessionID.mo44764d()));
            this.f41890c.mo44998s(o0Var.mo44721c().getString(C14169a.IdentityID.mo44764d()));
            this.f41890c.mo44927A(o0Var.mo44721c().getString(C14169a.Link.mo44764d()));
            this.f41890c.mo45000t(str);
            this.f41890c.mo45012z(str);
            this.f41890c.mo44996r(str);
            this.f41890c.mo44965d();
            qVar = this.f41547n;
            if (qVar == null) {
                return;
            }
        } catch (JSONException e) {
            e.printStackTrace();
            qVar = this.f41547n;
            if (qVar == null) {
                return;
            }
        } catch (Throwable th) {
            C6026q qVar2 = this.f41547n;
            if (qVar2 != null) {
                qVar2.mo24858a(true, null);
            }
            throw th;
        }
        qVar.mo24858a(true, null);
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C6026q qVar = this.f41547n;
        if (qVar != null) {
            qVar.mo24858a(false, new C14130h("Logout failed", C14130h.f41549d));
        }
        return true;
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

    public C14127f0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C6026q qVar = this.f41547n;
        if (qVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Logout error. ");
            sb.append(str);
            qVar.mo24858a(false, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41547n = null;
    }
}
