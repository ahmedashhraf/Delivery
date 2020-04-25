package com.google.android.gms.measurement.internal;

import android.net.Uri;

/* renamed from: com.google.android.gms.measurement.internal.t6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5405t6 implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ String f15489N;

    /* renamed from: O */
    private final /* synthetic */ String f15490O;

    /* renamed from: P */
    private final /* synthetic */ C5416u6 f15491P;

    /* renamed from: a */
    private final /* synthetic */ boolean f15492a;

    /* renamed from: b */
    private final /* synthetic */ Uri f15493b;

    C5405t6(C5416u6 u6Var, boolean z, Uri uri, String str, String str2) {
        this.f15491P = u6Var;
        this.f15492a = z;
        this.f15493b = uri;
        this.f15489N = str;
        this.f15490O = str2;
    }

    public final void run() {
        this.f15491P.m23558a(this.f15492a, this.f15493b, this.f15489N, this.f15490O);
    }
}
