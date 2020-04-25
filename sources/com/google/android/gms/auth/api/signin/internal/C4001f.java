package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.loader.p047b.C1499a;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.internal.C4211v;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.auth.api.signin.internal.f */
public final class C4001f extends C1499a<Void> implements C4211v {

    /* renamed from: r */
    private Semaphore f12691r = new Semaphore(0);

    /* renamed from: s */
    private Set<C4086i> f12692s;

    public C4001f(Context context, Set<C4086i> set) {
        super(context);
        this.f12692s = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final Void mo6587z() {
        int i = 0;
        for (C4086i a : this.f12692s) {
            if (a.mo17704a((C4211v) this)) {
                i++;
            }
        }
        try {
            this.f12691r.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        return null;
    }

    public final void onComplete() {
        this.f12691r.release();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo6608p() {
        this.f12691r.drainPermits();
        mo6619e();
    }
}
