package p212io.branch.referral;

import android.app.Activity;
import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14153p.C6033d;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;

/* renamed from: io.branch.referral.z */
/* compiled from: ServerRequestActionCompleted */
class C14208z extends C14205y {

    /* renamed from: n */
    private final C6033d f41901n;

    public C14208z(Context context, String str, JSONObject jSONObject, C6033d dVar) {
        super(context, C14171c.CompletedAction.mo44768d());
        this.f41901n = dVar;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(C14169a.IdentityID.mo44764d(), this.f41890c.mo44995r());
            jSONObject2.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
            jSONObject2.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
            if (!this.f41890c.mo45009y().equals("bnc_no_value")) {
                jSONObject2.put(C14169a.LinkClickID.mo44764d(), this.f41890c.mo45009y());
            }
            jSONObject2.put(C14169a.Event.mo44764d(), str);
            if (jSONObject != null) {
                jSONObject2.put(C14169a.Metadata.mo44764d(), jSONObject);
            }
            mo45014a(context, jSONObject2);
            mo44635a(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
        if (str != null) {
            boolean equalsIgnoreCase = str.equalsIgnoreCase("purchase");
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
        if (o0Var.mo44721c() != null && o0Var.mo44721c().has(C14169a.BranchViewData.mo44764d()) && C6009d.m27463J().f17270q != null && C6009d.m27463J().f17270q.get() != null) {
            String str = "";
            try {
                JSONObject f = mo45022f();
                if (f != null && f.has(C14169a.Event.mo44764d())) {
                    str = f.getString(C14169a.Event.mo44764d());
                }
                if (C6009d.m27463J().f17270q != null) {
                    Activity activity = (Activity) C6009d.m27463J().f17270q.get();
                    C14153p.m61241a().mo44727a(o0Var.mo44721c().getJSONObject(C14169a.BranchViewData.mo44764d()), str, (Context) activity, this.f41901n);
                }
            } catch (JSONException unused) {
                C6033d dVar2 = this.f41901n;
                if (dVar2 != null) {
                    dVar2.mo24750a(C14153p.f41643m, "Unable to show branch view. Branch view received is invalid ", str);
                }
            }
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        return !super.mo45017a(context);
    }

    /* renamed from: j */
    public boolean mo44638j() {
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

    public C14208z(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
        this.f41901n = null;
    }
}
