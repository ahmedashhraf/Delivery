package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.location.C5138k;
import com.google.android.gms.location.C5167x0;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: com.google.android.gms.internal.location.t */
final class C4663t extends C5167x0 {

    /* renamed from: b */
    private final C4167n<C5138k> f13911b;

    C4663t(C4167n<C5138k> nVar) {
        this.f13911b = nVar;
    }

    /* renamed from: G0 */
    public final synchronized void mo18766G0() {
        this.f13911b.mo17930a();
    }

    /* renamed from: a */
    public final void mo18767a(LocationAvailability locationAvailability) {
        this.f13911b.mo17931a(new C4667v(this, locationAvailability));
    }

    /* renamed from: a */
    public final void mo18768a(LocationResult locationResult) {
        this.f13911b.mo17931a(new C4665u(this, locationResult));
    }
}
