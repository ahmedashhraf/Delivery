package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6018i;

/* renamed from: io.branch.referral.j0 */
/* compiled from: ServerRequestRedeemRewards */
class C14136j0 extends C14205y {

    /* renamed from: n */
    C6018i f41585n;

    /* renamed from: o */
    int f41586o = 0;

    public C14136j0(Context context, String str, int i, C6018i iVar) {
        super(context, C14171c.RedeemRewards.mo44768d());
        this.f41585n = iVar;
        int e = this.f41890c.mo44968e(str);
        this.f41586o = i;
        if (i > e) {
            this.f41586o = e;
        }
        if (this.f41586o > 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
                jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
                jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
                if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                    jSONObject.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
                }
                jSONObject.put(C14169a.Bucket.mo44764d(), str);
                jSONObject.put(C14169a.Amount.mo44764d(), this.f41586o);
                mo44635a(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
                this.f41897j = true;
            }
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        C14130h hVar;
        JSONObject f = mo45022f();
        boolean z = false;
        if (f != null && f.has(C14169a.Bucket.mo44764d()) && f.has(C14169a.Amount.mo44764d())) {
            try {
                int i = f.getInt(C14169a.Amount.mo44764d());
                String string = f.getString(C14169a.Bucket.mo44764d());
                if (i > 0) {
                    z = true;
                }
                this.f41890c.mo44967d(string, this.f41890c.mo44968e(string) - i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (this.f41585n != null) {
            if (z) {
                hVar = null;
            } else {
                hVar = new C14130h("Trouble redeeming rewards.", C14130h.f41554i);
            }
            this.f41585n.mo24852a(z, hVar);
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        String str = "Trouble redeeming rewards.";
        if (!super.mo45017a(context)) {
            C6018i iVar = this.f41585n;
            if (iVar != null) {
                iVar.mo24852a(false, new C14130h(str, C14130h.f41549d));
            }
            return true;
        } else if (this.f41586o > 0) {
            return false;
        } else {
            C6018i iVar2 = this.f41585n;
            if (iVar2 != null) {
                iVar2.mo24852a(false, new C14130h(str, C14130h.f41554i));
            }
            return true;
        }
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C6018i iVar = this.f41585n;
        if (iVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble redeeming rewards. ");
            sb.append(str);
            iVar.mo24852a(false, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41585n = null;
    }

    public C14136j0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }
}
