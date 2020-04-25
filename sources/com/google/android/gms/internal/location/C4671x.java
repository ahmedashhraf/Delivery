package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C4167n;
import com.google.android.gms.location.C5116a1;
import com.google.android.gms.location.C5140l;

/* renamed from: com.google.android.gms.internal.location.x */
final class C4671x extends C5116a1 {

    /* renamed from: b */
    private final C4167n<C5140l> f13917b;

    C4671x(C4167n<C5140l> nVar) {
        this.f13917b = nVar;
    }

    /* renamed from: G0 */
    public final synchronized void mo18773G0() {
        this.f13917b.mo17930a();
    }

    public final synchronized void onLocationChanged(Location location) {
        this.f13917b.mo17931a(new C4673y(this, location));
    }
}
