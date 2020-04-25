package com.google.android.gms.common.api.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4246q;

/* renamed from: com.google.android.gms.common.api.internal.s2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4198s2 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4246q f13138a;

    /* renamed from: b */
    private final /* synthetic */ C4183p2 f13139b;

    C4198s2(C4183p2 p2Var, C4246q qVar) {
        this.f13139b = p2Var;
        this.f13138a = qVar;
    }

    @C0226w0
    public final void run() {
        try {
            BasePendingResult.f12867p.set(Boolean.valueOf(true));
            this.f13139b.f13100h.sendMessage(this.f13139b.f13100h.obtainMessage(0, this.f13139b.f13093a.mo18013a(this.f13138a)));
            BasePendingResult.f12867p.set(Boolean.valueOf(false));
            C4183p2.m18117b(this.f13138a);
            C4086i iVar = (C4086i) this.f13139b.f13099g.get();
            if (iVar != null) {
                iVar.mo17709b(this.f13139b);
            }
        } catch (RuntimeException e) {
            this.f13139b.f13100h.sendMessage(this.f13139b.f13100h.obtainMessage(1, e));
            BasePendingResult.f12867p.set(Boolean.valueOf(false));
            C4183p2.m18117b(this.f13138a);
            C4086i iVar2 = (C4086i) this.f13139b.f13099g.get();
            if (iVar2 != null) {
                iVar2.mo17709b(this.f13139b);
            }
        } catch (Throwable th) {
            BasePendingResult.f12867p.set(Boolean.valueOf(false));
            C4183p2.m18117b(this.f13138a);
            C4086i iVar3 = (C4086i) this.f13139b.f13099g.get();
            if (iVar3 != null) {
                iVar3.mo17709b(this.f13139b);
            }
            throw th;
        }
    }
}
