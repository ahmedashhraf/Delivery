package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6015f;
import p212io.branch.referral.C6009d.C6021l;

/* renamed from: io.branch.referral.b0 */
/* compiled from: ServerRequestGetRewardHistory */
class C14118b0 extends C14205y {

    /* renamed from: n */
    C6015f f41510n;

    public C14118b0(Context context, String str, String str2, int i, C6021l lVar, C6015f fVar) {
        super(context, C14171c.GetCreditHistory.mo44768d());
        this.f41510n = fVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                jSONObject.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            jSONObject.put(C14169a.Length.mo44764d(), i);
            jSONObject.put(C14169a.Direction.mo44764d(), lVar.ordinal());
            if (str != null) {
                jSONObject.put(C14169a.Bucket.mo44764d(), str);
            }
            if (str2 != null) {
                jSONObject.put(C14169a.BeginAfterID.mo44764d(), str2);
            }
            mo44635a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        C6015f fVar = this.f41510n;
        if (fVar != null) {
            fVar.mo24845a(o0Var.mo44718a(), null);
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C6015f fVar = this.f41510n;
        if (fVar != null) {
            fVar.mo24845a(null, new C14130h("Trouble retrieving user credit history.", C14130h.f41549d));
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C6015f fVar = this.f41510n;
        if (fVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble retrieving user credit history. ");
            sb.append(str);
            fVar.mo24845a(null, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41510n = null;
    }

    public C14118b0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
