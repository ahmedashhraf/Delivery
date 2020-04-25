package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: com.google.android.gms.dynamic.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4528k implements C4514a {

    /* renamed from: a */
    private final /* synthetic */ Activity f13789a;

    /* renamed from: b */
    private final /* synthetic */ Bundle f13790b;

    /* renamed from: c */
    private final /* synthetic */ Bundle f13791c;

    /* renamed from: d */
    private final /* synthetic */ C4513a f13792d;

    C4528k(C4513a aVar, Activity activity, Bundle bundle, Bundle bundle2) {
        this.f13792d = aVar;
        this.f13789a = activity;
        this.f13790b = bundle;
        this.f13791c = bundle2;
    }

    /* renamed from: a */
    public final void mo18594a(C4522e eVar) {
        this.f13792d.zaru.onInflate(this.f13789a, this.f13790b, this.f13791c);
    }

    public final int getState() {
        return 0;
    }
}
