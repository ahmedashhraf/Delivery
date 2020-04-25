package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p313a.C8617a.C8619b;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.e */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public final class C8632e implements C8628a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8619b f22657a;

    /* renamed from: b */
    private AppMeasurement f22658b;

    /* renamed from: c */
    private C8634g f22659c = new C8634g(this);

    public C8632e(AppMeasurement appMeasurement, C8619b bVar) {
        this.f22657a = bVar;
        this.f22658b = appMeasurement;
        this.f22658b.registerOnMeasurementEventListener(this.f22659c);
    }

    /* renamed from: a */
    public final C8619b mo31982a() {
        return this.f22657a;
    }

    /* renamed from: a */
    public final void mo31983a(Set<String> set) {
    }

    /* renamed from: i */
    public final void mo31984i() {
    }
}
