package com.google.android.gms.common.api.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.internal.C4314e.C4317c;
import com.google.android.gms.common.internal.C4369n;
import java.util.ArrayList;
import java.util.Map;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4176o0 extends C4222x0 {

    /* renamed from: N */
    final /* synthetic */ C4171n0 f13084N;

    /* renamed from: b */
    private final Map<C4071f, C4181p0> f13085b;

    public C4176o0(C4171n0 n0Var, Map<C4071f, C4181p0> map) {
        this.f13084N = n0Var;
        super(n0Var, null);
        this.f13085b = map;
    }

    @C0226w0
    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17942a() {
        C4369n nVar = new C4369n(this.f13084N.f13061d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4071f fVar : this.f13085b.keySet()) {
            if (!fVar.mo17644k() || ((C4181p0) this.f13085b.get(fVar)).f13091c) {
                arrayList2.add(fVar);
            } else {
                arrayList.add(fVar);
            }
        }
        int i = -1;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                i = nVar.mo18367a(this.f13084N.f13060c, (C4071f) obj);
                if (i != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                i = nVar.mo18367a(this.f13084N.f13060c, (C4071f) obj2);
                if (i == 0) {
                    break;
                }
            }
        }
        if (i != 0) {
            this.f13084N.f13058a.mo17889a((C4134h1) new C4191r0(this, this.f13084N, new ConnectionResult(i, null)));
            return;
        }
        if (this.f13084N.f13070m && this.f13084N.f13068k != null) {
            this.f13084N.f13068k.mo10346b();
        }
        for (C4071f fVar2 : this.f13085b.keySet()) {
            C4317c cVar = (C4317c) this.f13085b.get(fVar2);
            if (!fVar2.mo17644k() || nVar.mo18367a(this.f13084N.f13060c, fVar2) == 0) {
                fVar2.mo17634a(cVar);
            } else {
                this.f13084N.f13058a.mo17889a((C4134h1) new C4186q0(this, this.f13084N, cVar));
            }
        }
    }
}
