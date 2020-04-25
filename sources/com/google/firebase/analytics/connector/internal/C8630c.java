package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.p313a.C8617a.C8619b;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.firebase.analytics.connector.internal.c */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public final class C8630c implements C8628a {

    /* renamed from: a */
    Set<String> f22647a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8619b f22648b;

    /* renamed from: c */
    private AppMeasurement f22649c;

    /* renamed from: d */
    private C8633f f22650d = new C8633f(this);

    public C8630c(AppMeasurement appMeasurement, C8619b bVar) {
        this.f22648b = bVar;
        this.f22649c = appMeasurement;
        this.f22649c.registerOnMeasurementEventListener(this.f22650d);
        this.f22647a = new HashSet();
    }

    /* renamed from: a */
    public final C8619b mo31982a() {
        return this.f22648b;
    }

    /* renamed from: i */
    public final void mo31984i() {
        this.f22647a.clear();
    }

    /* renamed from: a */
    public final void mo31983a(Set<String> set) {
        this.f22647a.clear();
        Set<String> set2 = this.f22647a;
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (hashSet.size() >= 50) {
                break;
            } else if (C8631d.m40614d(str) && C8631d.m40613c(str)) {
                hashSet.add(C8631d.m40616f(str));
            }
        }
        set2.addAll(hashSet);
    }
}
