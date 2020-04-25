package p212io.branch.referral;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6017h;

/* renamed from: io.branch.referral.l0 */
/* compiled from: ServerRequestRegisterInstall */
class C14145l0 extends C14125e0 {

    /* renamed from: v */
    C6017h f41613v;

    C14145l0(Context context, C6017h hVar, C14161q0 q0Var, String str) {
        super(context, C14171c.RegisterInstall.mo44768d(), q0Var);
        this.f41613v = hVar;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!str.equals("bnc_no_value")) {
                jSONObject.put(C14169a.LinkClickID.mo44764d(), str);
            }
            mo44635a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        super.mo44617a(o0Var, dVar);
        try {
            this.f41890c.mo44927A(o0Var.mo44721c().getString(C14169a.Link.mo44764d()));
            String str = "bnc_no_value";
            if (o0Var.mo44721c().has(C14169a.Data.mo44764d())) {
                JSONObject jSONObject = new JSONObject(o0Var.mo44721c().getString(C14169a.Data.mo44764d()));
                if (jSONObject.has(C14169a.Clicked_Branch_Link.mo44764d()) && jSONObject.getBoolean(C14169a.Clicked_Branch_Link.mo44764d()) && this.f41890c.mo44999t().equals(str) && this.f41890c.mo45005w() == 1) {
                    this.f41890c.mo45000t(o0Var.mo44721c().getString(C14169a.Data.mo44764d()));
                }
            }
            if (o0Var.mo44721c().has(C14169a.LinkClickID.mo44764d())) {
                this.f41890c.mo45003v(o0Var.mo44721c().getString(C14169a.LinkClickID.mo44764d()));
            } else {
                this.f41890c.mo45003v(str);
            }
            if (o0Var.mo44721c().has(C14169a.Data.mo44764d())) {
                this.f41890c.mo45012z(o0Var.mo44721c().getString(C14169a.Data.mo44764d()));
            } else {
                this.f41890c.mo45012z(str);
            }
            if (this.f41613v != null && !dVar.f17271r) {
                this.f41613v.mo24851a(dVar.mo24819m(), null);
            }
            this.f41890c.mo44982k(this.f41546p.mo44741a());
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo44637b(o0Var, dVar);
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C6017h hVar = this.f41613v;
        if (hVar != null) {
            hVar.mo24851a(null, new C14130h("Trouble initializing Branch.", C14130h.f41549d));
        }
        return true;
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* renamed from: n */
    public void mo44639n() {
        super.mo44639n();
        long h = this.f41890c.mo44975h("bnc_referrer_click_ts");
        long h2 = this.f41890c.mo44975h("bnc_install_begin_ts");
        if (h > 0) {
            try {
                mo45022f().put(C14169a.ClickedReferrerTimeStamp.mo44764d(), h);
            } catch (JSONException unused) {
                return;
            }
        }
        if (h2 > 0) {
            mo45022f().put(C14169a.InstallBeginTimeStamp.mo44764d(), h2);
        }
    }

    /* renamed from: u */
    public String mo44623u() {
        return "install";
    }

    /* renamed from: v */
    public boolean mo44624v() {
        return this.f41613v != null;
    }

    public C14145l0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo44705a(C6017h hVar) {
        if (hVar != null) {
            this.f41613v = hVar;
        }
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        if (this.f41613v != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("error_message", "Trouble reaching server. Please try again in a few minutes");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            C6017h hVar = this.f41613v;
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble initializing Branch. ");
            sb.append(str);
            hVar.mo24851a(jSONObject, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41613v = null;
    }
}
