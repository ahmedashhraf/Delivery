package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.n3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4174n3 implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C4156k3 f13082a;

    C4174n3(C4156k3 k3Var) {
        this.f13082a = k3Var;
    }

    public final void run() {
        this.f13082a.f13040X.lock();
        try {
            this.f13082a.m18019g();
        } finally {
            this.f13082a.f13040X.unlock();
        }
    }
}
