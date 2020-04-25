package p212io.branch.referral;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C6009d.C6018i;

/* renamed from: io.branch.referral.c0 */
/* compiled from: ServerRequestGetRewards */
class C14123c0 extends C14205y {

    /* renamed from: n */
    C6018i f41536n;

    public C14123c0(Context context, C6018i iVar) {
        super(context, C14171c.GetCredits.mo44768d());
        this.f41536n = iVar;
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        Iterator keys = o0Var.mo44721c().keys();
        boolean z = false;
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                int i = o0Var.mo44721c().getInt(str);
                if (i != this.f41890c.mo44968e(str)) {
                    z = true;
                }
                this.f41890c.mo44967d(str, i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        C6018i iVar = this.f41536n;
        if (iVar != null) {
            iVar.mo24852a(z, null);
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        if (super.mo45017a(context)) {
            return false;
        }
        C6018i iVar = this.f41536n;
        if (iVar != null) {
            iVar.mo24852a(false, new C14130h("Trouble retrieving user credits.", C14130h.f41549d));
        }
        return true;
    }

    /* renamed from: i */
    public String mo44632i() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo44632i());
        sb.append(this.f41890c.mo44995r());
        return sb.toString();
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return true;
    }

    public C14123c0(String str, JSONObject jSONObject, Context context) {
        super(str, jSONObject, context);
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C6018i iVar = this.f41536n;
        if (iVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trouble retrieving user credits. ");
            sb.append(str);
            iVar.mo24852a(false, new C14130h(sb.toString(), i));
        }
    }

    /* renamed from: a */
    public void mo44615a() {
        this.f41536n = null;
    }
}
