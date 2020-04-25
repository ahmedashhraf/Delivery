package p212io.branch.referral;

import org.json.JSONObject;
import p212io.branch.indexing.BranchUniversalObject;
import p212io.branch.referral.C6009d.C6017h;
import p212io.branch.referral.C6009d.C6019j;
import p212io.branch.referral.util.LinkProperties;

/* renamed from: io.branch.referral.m */
/* compiled from: BranchUniversalReferralInitWrapper */
class C14146m implements C6017h {

    /* renamed from: a */
    private final C6019j f41614a;

    public C14146m(C6019j jVar) {
        this.f41614a = jVar;
    }

    /* renamed from: a */
    public void mo24851a(JSONObject jSONObject, C14130h hVar) {
        C6019j jVar = this.f41614a;
        if (jVar == null) {
            return;
        }
        if (hVar != null) {
            jVar.mo24853a(null, null, hVar);
            return;
        }
        this.f41614a.mo24853a(BranchUniversalObject.m60874w(), LinkProperties.m61376n(), hVar);
    }
}
