package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6017h;

/* renamed from: io.branch.referral.d0 */
/* compiled from: ServerRequestIdentifyUserRequest */
class C14124d0 extends C14205y {

    /* renamed from: n */
    C6017h f41537n;

    /* renamed from: o */
    String f41538o = null;

    public C14124d0(Context context, C6017h hVar, String str) {
        super(context, C14171c.IdentifyUser.mo44768d());
        this.f41537n = hVar;
        this.f41538o = str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                jSONObject.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            jSONObject.put(C14169a.Identity.mo44764d(), str);
            mo44635a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        try {
            if (mo45022f() != null && mo45022f().has(C14169a.Identity.mo44764d())) {
                this.f41890c.mo44996r(mo45022f().getString(C14169a.Identity.mo44764d()));
            }
            this.f41890c.mo44998s(o0Var.mo44721c().getString(C14169a.IdentityID.mo44764d()));
            this.f41890c.mo44927A(o0Var.mo44721c().getString(C14169a.Link.mo44764d()));
            if (o0Var.mo44721c().has(C14169a.ReferringData.mo44764d())) {
                this.f41890c.mo45000t(o0Var.mo44721c().getString(C14169a.ReferringData.mo44764d()));
            }
            if (this.f41537n != null) {
                this.f41537n.mo24851a(dVar.mo24817k(), null);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (!super.mo45017a(context)) {
            C6017h hVar = this.f41537n;
            if (hVar != null) {
                hVar.mo24851a(null, new C14130h("Trouble setting the user alias.", C14130h.f41549d));
            }
            return true;
        }
        try {
            String string = mo45022f().getString(C14169a.Identity.mo44764d());
            if (!(string == null || string.length() == 0 || string.equals(this.f41890c.mo44993q()))) {
                return false;
            }
        } catch (JSONException unused) {
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* renamed from: r */
    public boolean mo44634r() {
        return true;
    }

    /* renamed from: u */
    public boolean mo44623u() {
        boolean z = false;
        try {
            String string = mo45022f().getString(C14169a.Identity.mo44764d());
            if (string != null && string.equals(this.f41890c.mo44993q())) {
                z = true;
            }
            return z;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        if (this.f41537n != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C6017h hVar = this.f41537n;
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble setting the user alias. ");
            sb.append(str);
            hVar.mo24851a(jSONObject, new C14130h(sb.toString(), i));
        }
    }

    public C14124d0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo44633a(C6009d dVar) {
        C6017h hVar = this.f41537n;
        if (hVar != null) {
            hVar.mo24851a(dVar.mo24817k(), null);
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41537n = null;
    }
}
