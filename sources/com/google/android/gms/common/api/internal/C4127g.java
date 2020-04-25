package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.internal.C4167n.C4169b;
import com.google.android.gms.common.data.DataHolder;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.g */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class C4127g<L> implements C4169b<L> {

    /* renamed from: a */
    private final DataHolder f12938a;

    @C4056a
    protected C4127g(DataHolder dataHolder) {
        this.f12938a = dataHolder;
    }

    @C4056a
    /* renamed from: a */
    public final void mo17832a(L l) {
        mo17833a(l, this.f12938a);
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public abstract void mo17833a(L l, DataHolder dataHolder);

    @C4056a
    /* renamed from: a */
    public void mo17831a() {
        DataHolder dataHolder = this.f12938a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
