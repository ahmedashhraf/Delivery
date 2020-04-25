package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.n0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4370n0 extends C4340i {

    /* renamed from: N */
    private final /* synthetic */ int f13514N;

    /* renamed from: a */
    private final /* synthetic */ Intent f13515a;

    /* renamed from: b */
    private final /* synthetic */ Fragment f13516b;

    C4370n0(Intent intent, Fragment fragment, int i) {
        this.f13515a = intent;
        this.f13516b = fragment;
        this.f13514N = i;
    }

    /* renamed from: a */
    public final void mo18326a() {
        Intent intent = this.f13515a;
        if (intent != null) {
            this.f13516b.startActivityForResult(intent, this.f13514N);
        }
    }
}
