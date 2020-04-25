package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C4162m;

/* renamed from: com.google.android.gms.common.internal.p0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4378p0 extends C4340i {

    /* renamed from: N */
    private final /* synthetic */ int f13524N;

    /* renamed from: a */
    private final /* synthetic */ Intent f13525a;

    /* renamed from: b */
    private final /* synthetic */ C4162m f13526b;

    C4378p0(Intent intent, C4162m mVar, int i) {
        this.f13525a = intent;
        this.f13526b = mVar;
        this.f13524N = i;
    }

    /* renamed from: a */
    public final void mo18326a() {
        Intent intent = this.f13525a;
        if (intent != null) {
            this.f13526b.startActivityForResult(intent, this.f13524N);
        }
    }
}
