package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.C4167n.C4169b;
import com.google.android.gms.location.C5140l;

/* renamed from: com.google.android.gms.internal.location.y */
final class C4673y implements C4169b<C5140l> {

    /* renamed from: a */
    private final /* synthetic */ Location f13918a;

    C4673y(C4671x xVar, Location location) {
        this.f13918a = location;
    }

    /* renamed from: a */
    public final void mo17831a() {
    }

    /* renamed from: a */
    public final /* synthetic */ void mo17832a(Object obj) {
        ((C5140l) obj).onLocationChanged(this.f13918a);
    }
}
