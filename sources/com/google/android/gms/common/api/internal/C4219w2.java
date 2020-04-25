package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import com.google.android.gms.common.api.C4253x;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.w2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4219w2 implements DeathRecipient, C4214v2 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f13171a;

    /* renamed from: b */
    private final WeakReference<C4253x> f13172b;

    /* renamed from: c */
    private final WeakReference<IBinder> f13173c;

    private C4219w2(BasePendingResult<?> basePendingResult, C4253x xVar, IBinder iBinder) {
        this.f13172b = new WeakReference<>(xVar);
        this.f13171a = new WeakReference<>(basePendingResult);
        this.f13173c = new WeakReference<>(iBinder);
    }

    /* renamed from: a */
    public final void mo17970a(BasePendingResult<?> basePendingResult) {
        m18261a();
    }

    public final void binderDied() {
        m18261a();
    }

    /* renamed from: a */
    private final void m18261a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f13171a.get();
        C4253x xVar = (C4253x) this.f13172b.get();
        if (!(xVar == null || basePendingResult == null)) {
            xVar.mo18015a(basePendingResult.mo17750d().intValue());
        }
        IBinder iBinder = (IBinder) this.f13173c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ C4219w2(BasePendingResult basePendingResult, C4253x xVar, IBinder iBinder, C4204t2 t2Var) {
        this(basePendingResult, null, iBinder);
    }
}
