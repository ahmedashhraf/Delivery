package p212io.branch.referral;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.indexing.BranchUniversalObject;
import p212io.branch.indexing.BranchUniversalObject.C14090d;
import p212io.branch.referral.C14168s.C14169a;
import p212io.branch.referral.C14168s.C14171c;

/* renamed from: io.branch.referral.n0 */
/* compiled from: ServerRequestRegisterView */
class C14149n0 extends C14205y {

    /* renamed from: n */
    C14090d f41628n;

    public C14149n0(Context context, BranchUniversalObject branchUniversalObject, C14161q0 q0Var, C14090d dVar) {
        super(context, C14171c.RegisterView.mo44768d());
        this.f41628n = dVar;
        try {
            mo44635a(m61211a(branchUniversalObject, q0Var));
        } catch (JSONException e) {
            e.printStackTrace();
            this.f41897j = true;
        }
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        C14090d dVar2 = this.f41628n;
        if (dVar2 != null) {
            dVar2.mo44565a(true, null);
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C14090d dVar = this.f41628n;
        if (dVar != null) {
            dVar.mo44565a(false, new C14130h("Unable to register content view", C14130h.f41549d));
        }
        return true;
    }

    /* renamed from: j */
    public boolean mo44638j() {
        return true;
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return false;
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C14090d dVar = this.f41628n;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to register content view. ");
            sb.append(str);
            dVar.mo44565a(false, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41628n = null;
    }

    /* renamed from: a */
    private JSONObject m61211a(BranchUniversalObject branchUniversalObject, C14161q0 q0Var) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append("Android ");
        sb.append(VERSION.SDK_INT);
        sb.toString();
        jSONObject.put(C14169a.SessionID.mo44764d(), this.f41890c.mo44932E());
        jSONObject.put(C14169a.DeviceFingerprintID.mo44764d(), this.f41890c.mo44981k());
        if (C14175t.m61318f() != null) {
            str = C14175t.m61318f().mo44782b();
        } else {
            str = q0Var.mo44742a(this.f41890c.mo44983l());
        }
        String str2 = "bnc_no_value";
        if (!str.equals(str2) && q0Var.mo44754l()) {
            jSONObject.put(C14169a.HardwareID.mo44764d(), str);
        }
        String a = q0Var.mo44741a();
        if (!a.equals(str2)) {
            jSONObject.put(C14169a.AppVersion.mo44764d(), a);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(C14169a.ContentKeyWords.mo44764d(), branchUniversalObject.mo44554o());
        jSONObject2.put(C14169a.PublicallyIndexable.mo44764d(), branchUniversalObject.mo44560u());
        if (branchUniversalObject.mo44556q() > 0.0d) {
            jSONObject2.put(C14169a.Price.mo44764d(), branchUniversalObject.mo44556q());
        }
        String b = branchUniversalObject.mo44534b();
        if (b != null && b.trim().length() > 0) {
            jSONObject2.put(C14169a.CanonicalIdentifier.mo44764d(), b);
        }
        String c = branchUniversalObject.mo44537c();
        if (c != null && c.trim().length() > 0) {
            jSONObject2.put(C14169a.CanonicalUrl.mo44764d(), c);
        }
        String r = branchUniversalObject.mo44557r();
        if (r != null && r.trim().length() > 0) {
            jSONObject2.put(C14169a.ContentTitle.mo44764d(), branchUniversalObject.mo44557r());
        }
        String k = branchUniversalObject.mo44550k();
        if (k != null && k.trim().length() > 0) {
            jSONObject2.put(C14169a.ContentDesc.mo44764d(), k);
        }
        String m = branchUniversalObject.mo44552m();
        if (m != null && m.trim().length() > 0) {
            jSONObject2.put(C14169a.ContentImgUrl.mo44764d(), m);
        }
        String s = branchUniversalObject.mo44558s();
        if (s != null && s.trim().length() > 0) {
            jSONObject2.put(C14169a.ContentType.mo44764d(), s);
        }
        if (branchUniversalObject.mo44551l() > 0) {
            jSONObject2.put(C14169a.ContentExpiryTime.mo44764d(), branchUniversalObject.mo44551l());
        }
        jSONObject.put(C14169a.Params.mo44764d(), jSONObject2);
        HashMap p = branchUniversalObject.mo44555p();
        Set keySet = p.keySet();
        JSONObject jSONObject3 = new JSONObject();
        for (Object next : keySet) {
            jSONObject3.put((String) next, p.get(next));
        }
        jSONObject.put(C14169a.Metadata.mo44764d(), jSONObject3);
        return jSONObject;
    }
}
