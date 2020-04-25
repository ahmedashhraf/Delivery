package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4237l.C4238a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4416z.C4417a;
import com.google.android.gms.common.internal.C4416z.C4418b;
import com.google.android.gms.tasks.C5562l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.common.internal.v0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4408v0 implements C4238a {

    /* renamed from: a */
    private final /* synthetic */ C4237l f13533a;

    /* renamed from: b */
    private final /* synthetic */ C5562l f13534b;

    /* renamed from: c */
    private final /* synthetic */ C4417a f13535c;

    /* renamed from: d */
    private final /* synthetic */ C4418b f13536d;

    C4408v0(C4237l lVar, C5562l lVar2, C4417a aVar, C4418b bVar) {
        this.f13533a = lVar;
        this.f13534b = lVar2;
        this.f13535c = aVar;
        this.f13536d = bVar;
    }

    /* renamed from: a */
    public final void mo17820a(Status status) {
        if (status.mo17617T()) {
            this.f13534b.mo22019a(this.f13535c.mo17498a(this.f13533a.mo17740a(0, TimeUnit.MILLISECONDS)));
            return;
        }
        this.f13534b.mo22018a((Exception) this.f13536d.mo18393a(status));
    }
}
