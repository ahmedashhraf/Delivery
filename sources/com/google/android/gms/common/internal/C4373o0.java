package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.o0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4373o0 extends C4340i {

    /* renamed from: N */
    private final /* synthetic */ int f13517N;

    /* renamed from: a */
    private final /* synthetic */ Intent f13518a;

    /* renamed from: b */
    private final /* synthetic */ Activity f13519b;

    C4373o0(Intent intent, Activity activity, int i) {
        this.f13518a = intent;
        this.f13519b = activity;
        this.f13517N = i;
    }

    /* renamed from: a */
    public final void mo18326a() {
        Intent intent = this.f13518a;
        if (intent != null) {
            this.f13519b.startActivityForResult(intent, this.f13517N);
        }
    }
}
