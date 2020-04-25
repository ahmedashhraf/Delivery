package p212io.branch.referral.p492t0;

import android.content.Context;
import org.json.JSONObject;
import p212io.branch.referral.C14152o0;
import p212io.branch.referral.C14168s.C14171c;
import p212io.branch.referral.C14205y;
import p212io.branch.referral.C6009d;

/* renamed from: io.branch.referral.t0.d */
/* compiled from: ServerRequestGetAppConfig */
class C14186d extends C14205y {

    /* renamed from: n */
    private final C14187a f41741n;

    /* renamed from: io.branch.referral.t0.d$a */
    /* compiled from: ServerRequestGetAppConfig */
    public interface C14187a {
        /* renamed from: a */
        void mo44793a(JSONObject jSONObject);
    }

    public C14186d(Context context, C14187a aVar) {
        super(context, "");
        this.f41741n = aVar;
    }

    /* renamed from: a */
    public void mo44615a() {
    }

    /* renamed from: a */
    public void mo44617a(C14152o0 o0Var, C6009d dVar) {
        C14187a aVar = this.f41741n;
        if (aVar != null) {
            aVar.mo44793a(o0Var.mo44721c());
        }
    }

    /* renamed from: b */
    public boolean mo44620b(Context context) {
        return false;
    }

    /* renamed from: i */
    public String mo44632i() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41890c.mo44969e());
        sb.append(C14171c.GetApp.mo44768d());
        sb.append("/");
        sb.append(this.f41890c.mo44977i());
        return sb.toString();
    }

    /* renamed from: k */
    public boolean mo44621k() {
        return true;
    }

    /* renamed from: a */
    public void mo44616a(int i, String str) {
        C14187a aVar = this.f41741n;
        if (aVar != null) {
            aVar.mo44793a(null);
        }
    }
}
