package com.google.android.play.core.splitinstall;

import com.google.android.play.core.internal.C5732a0;

/* renamed from: com.google.android.play.core.splitinstall.d0 */
final class C7163d0 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C7161d f20276a;

    /* renamed from: b */
    private final /* synthetic */ C7165e0 f20277b;

    C7163d0(C7165e0 e0Var, C7161d dVar) {
        this.f20277b = e0Var;
        this.f20276a = dVar;
    }

    public final void run() {
        this.f20277b.f20279b.mo10355a(SplitInstallSessionState.m34394a(C5732a0.m25194a(this.f20276a.mo28588b(), C7165e0.m34425f(this.f20276a.mo28587a()))));
    }
}
