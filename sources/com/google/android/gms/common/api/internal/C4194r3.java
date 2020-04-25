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

/* renamed from: com.google.android.gms.common.api.internal.r3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4194r3 implements C5547e<Map<C4102c<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ C4184p3 f13131a;

    private C4194r3(C4184p3 p3Var) {
        this.f13131a = p3Var;
    }

    /* renamed from: a */
    public final void mo17805a(@C0193h0 C5560k<Map<C4102c<?>, String>> kVar) {
        this.f13131a.f13105Q.lock();
        try {
            if (this.f13131a.f13113Y) {
                if (kVar.mo22013e()) {
                    this.f13131a.f13114Z = new C0635a(this.f13131a.f13115a.size());
                    for (C4189q3 b : this.f13131a.f13115a.values()) {
                        this.f13131a.f13114Z.put(b.mo17676b(), ConnectionResult.f12763l0);
                    }
                } else if (kVar.mo22002a() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) kVar.mo22002a();
                    if (this.f13131a.f13111W) {
                        this.f13131a.f13114Z = new C0635a(this.f13131a.f13115a.size());
                        for (C4189q3 q3Var : this.f13131a.f13115a.values()) {
                            C4102c b2 = q3Var.mo17676b();
                            ConnectionResult a = availabilityException.mo17597a((C4083h<? extends C4063d>) q3Var);
                            if (this.f13131a.m18133a(q3Var, a)) {
                                this.f13131a.f13114Z.put(b2, new ConnectionResult(16));
                            } else {
                                this.f13131a.f13114Z.put(b2, a);
                            }
                        }
                    } else {
                        this.f13131a.f13114Z = availabilityException.mo17596a();
                    }
                    this.f13131a.f13119c0 = this.f13131a.m18145i();
                } else {
                    kVar.mo22002a();
                    this.f13131a.f13114Z = Collections.emptyMap();
                    this.f13131a.f13119c0 = new ConnectionResult(8);
                }
                if (this.f13131a.f13116a0 != null) {
                    this.f13131a.f13114Z.putAll(this.f13131a.f13116a0);
                    this.f13131a.f13119c0 = this.f13131a.m18145i();
                }
                if (this.f13131a.f13119c0 == null) {
                    this.f13131a.m18142g();
                    this.f13131a.m18144h();
                } else {
                    this.f13131a.f13113Y = false;
                    this.f13131a.f13104P.mo17929a(this.f13131a.f13119c0);
                }
                this.f13131a.f13108T.signalAll();
                this.f13131a.f13105Q.unlock();
            }
        } finally {
            this.f13131a.f13105Q.unlock();
        }
    }
}
