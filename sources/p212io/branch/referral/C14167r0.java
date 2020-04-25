package p212io.branch.referral;

import android.content.Context;

/* renamed from: io.branch.referral.r0 */
/* compiled from: TrackingController */
class C14167r0 {

    /* renamed from: a */
    private boolean f41691a = true;

    C14167r0(Context context) {
        mo44761a(context);
    }

    /* renamed from: b */
    private void m61298b(Context context) {
        C6009d.m27463J().mo24799c();
        C14204x a = C14204x.m61505a(context);
        a.mo44943a();
        String str = "bnc_no_value";
        a.mo45010y(str);
        a.mo45003v(str);
        a.mo45006w(str);
        a.mo44980j(str);
        a.mo45002u(str);
        a.mo44992p(str);
        a.mo44994q(str);
        a.mo44990o(str);
        a.mo44988n(str);
        a.mo45012z(str);
        a.mo44945a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44762a(Context context, boolean z) {
        if (this.f41691a != z) {
            this.f41691a = z;
            if (z) {
                m61298b(context);
            } else {
                m61297b();
            }
            C14204x.m61505a(context).mo44949a("bnc_tracking_state", Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44763a() {
        return this.f41691a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44761a(Context context) {
        this.f41691a = C14204x.m61505a(context).mo44963c("bnc_tracking_state");
    }

    /* renamed from: b */
    private void m61297b() {
        if (C6009d.m27463J() != null) {
            C6009d.m27463J().mo24827u();
        }
    }
}
