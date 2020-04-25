package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C5547e;
import com.google.android.gms.tasks.C5562l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.t3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4205t3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f13150a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C5562l<?>, Boolean> f13151b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17971a(BasePendingResult<? extends C4246q> basePendingResult, boolean z) {
        this.f13150a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo17743a((C4238a) new C4123f0(this, basePendingResult));
    }

    /* renamed from: b */
    public final void mo17974b() {
        m18211a(false, C4137i.f12953n);
    }

    /* renamed from: c */
    public final void mo17975c() {
        m18211a(true, C4209u2.f13155d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <TResult> void mo17972a(C5562l<TResult> lVar, boolean z) {
        this.f13151b.put(lVar, Boolean.valueOf(z));
        lVar.mo22017a().mo21992a((C5547e<TResult>) new C4118e0<TResult>(this, lVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo17973a() {
        return !this.f13150a.isEmpty() || !this.f13151b.isEmpty();
    }

    /* renamed from: a */
    private final void m18211a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f13150a) {
            hashMap = new HashMap(this.f13150a);
        }
        synchronized (this.f13151b) {
            hashMap2 = new HashMap(this.f13151b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo17748c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C5562l) entry2.getKey()).mo22020b((Exception) new ApiException(status));
            }
        }
    }
}
