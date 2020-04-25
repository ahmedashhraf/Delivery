package com.google.android.gms.common.api.internal;

import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.C4235j;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.d3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4114d3 {

    /* renamed from: a */
    private final C0635a<C4102c<?>, ConnectionResult> f12915a = new C0635a<>();

    /* renamed from: b */
    private final C0635a<C4102c<?>, String> f12916b = new C0635a<>();

    /* renamed from: c */
    private final C5562l<Map<C4102c<?>, String>> f12917c = new C5562l<>();

    /* renamed from: d */
    private int f12918d;

    /* renamed from: e */
    private boolean f12919e = false;

    public C4114d3(Iterable<? extends C4235j<?>> iterable) {
        for (C4235j b : iterable) {
            this.f12915a.put(b.mo17676b(), null);
        }
        this.f12918d = this.f12915a.keySet().size();
    }

    /* renamed from: a */
    public final C5560k<Map<C4102c<?>, String>> mo17806a() {
        return this.f12917c.mo22017a();
    }

    /* renamed from: b */
    public final Set<C4102c<?>> mo17808b() {
        return this.f12915a.keySet();
    }

    /* renamed from: a */
    public final void mo17807a(C4102c<?> cVar, ConnectionResult connectionResult, @C0195i0 String str) {
        this.f12915a.put(cVar, connectionResult);
        this.f12916b.put(cVar, str);
        this.f12918d--;
        if (!connectionResult.mo17580R()) {
            this.f12919e = true;
        }
        if (this.f12918d == 0) {
            if (this.f12919e) {
                this.f12917c.mo22018a((Exception) new AvailabilityException(this.f12915a));
                return;
            }
            this.f12917c.mo22019a(this.f12916b);
        }
    }
}
