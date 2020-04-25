package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.C5776q;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.b */
final class C5734b implements Runnable {

    /* renamed from: N */
    private final /* synthetic */ C5738d f16601N;

    /* renamed from: a */
    private final /* synthetic */ List f16602a;

    /* renamed from: b */
    private final /* synthetic */ C5776q f16603b;

    C5734b(C5738d dVar, List list, C5776q qVar) {
        this.f16601N = dVar;
        this.f16602a = list;
        this.f16603b = qVar;
    }

    public final void run() {
        try {
            if (this.f16601N.f16609c.mo23042a(this.f16602a)) {
                this.f16601N.m25222a(this.f16603b);
            } else {
                this.f16601N.m25227b(this.f16602a, this.f16603b);
            }
        } catch (Exception unused) {
            this.f16603b.mo23061a(-11);
        }
    }
}
