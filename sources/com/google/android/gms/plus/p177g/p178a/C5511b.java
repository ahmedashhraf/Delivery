package com.google.android.gms.plus.p177g.p178a;

import com.google.android.gms.common.data.C4263a;
import com.google.android.gms.common.data.C4270g;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.internal.plus.C5086d;
import com.google.android.gms.internal.plus.zzr;

@Deprecated
@C4476d0
/* renamed from: com.google.android.gms.plus.g.a.b */
public final class C5511b extends C4263a<C5495a> {

    /* renamed from: b */
    private final C4270g<zzr> f15811b;

    public C5511b(DataHolder dataHolder) {
        super(dataHolder);
        if (dataHolder.mo18051j() == null || !dataHolder.mo18051j().getBoolean("com.google.android.gms.plus.IsSafeParcelable", false)) {
            this.f15811b = null;
        } else {
            this.f15811b = new C4270g<>(dataHolder, zzr.CREATOR);
        }
    }

    @Deprecated
    public final C5495a get(int i) {
        C4270g<zzr> gVar = this.f15811b;
        return gVar != null ? (C5495a) gVar.get(i) : new C5086d(this.f13259a, i);
    }
}
