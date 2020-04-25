package com.google.android.gms.common.api.internal;

import androidx.annotation.C0193h0;
import androidx.collection.C0635a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.tasks.C5547e;
import com.google.android.gms.tasks.C5560k;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4111d0 implements C5547e<Map<C4102c<?>, String>> {

    /* renamed from: a */
    private C4211v f12912a;

    /* renamed from: b */
    private final /* synthetic */ C4184p3 f12913b;

    C4111d0(C4184p3 p3Var, C4211v vVar) {
        this.f12913b = p3Var;
        this.f12912a = vVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17804a() {
        this.f12912a.onComplete();
    }

    /* renamed from: a */
    public final void mo17805a(@C0193h0 C5560k<Map<C4102c<?>, String>> kVar) {
        this.f12913b.f13105Q.lock();
        try {
            if (!this.f12913b.f13113Y) {
                this.f12912a.onComplete();
                return;
            }
            if (kVar.mo22013e()) {
                this.f12913b.f13116a0 = new C0635a(this.f12913b.f13117b.size());
                for (C4189q3 b : this.f12913b.f13117b.values()) {
                    this.f12913b.f13116a0.put(b.mo17676b(), ConnectionResult.f12763l0);
                }
            } else if (kVar.mo22002a() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) kVar.mo22002a();
                if (this.f12913b.f13111W) {
                    this.f12913b.f13116a0 = new C0635a(this.f12913b.f13117b.size());
                    for (C4189q3 q3Var : this.f12913b.f13117b.values()) {
                        C4102c b2 = q3Var.mo17676b();
                        ConnectionResult a = availabilityException.mo17597a((C4083h<? extends C4063d>) q3Var);
                        if (this.f12913b.m18133a(q3Var, a)) {
                            this.f12913b.f13116a0.put(b2, new ConnectionResult(16));
                        } else {
                            this.f12913b.f13116a0.put(b2, a);
                        }
                    }
                } else {
                    this.f12913b.f13116a0 = availabilityException.mo17596a();
                }
            } else {
                kVar.mo22002a();
                this.f12913b.f13116a0 = Collections.emptyMap();
            }
            if (this.f12913b.isConnected()) {
                this.f12913b.f13114Z.putAll(this.f12913b.f13116a0);
                if (this.f12913b.m18145i() == null) {
                    this.f12913b.m18142g();
                    this.f12913b.m18144h();
                    this.f12913b.f13108T.signalAll();
                }
            }
            this.f12912a.onComplete();
            this.f12913b.f13105Q.unlock();
        } finally {
            this.f12913b.f13105Q.unlock();
        }
    }
}
