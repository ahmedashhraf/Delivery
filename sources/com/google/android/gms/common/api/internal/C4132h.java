package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4243n;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.h */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4132h implements C4243n, C4246q {
    @C4056a

    /* renamed from: a */
    protected final Status f12945a;
    @C4056a

    /* renamed from: b */
    protected final DataHolder f12946b;

    @C4056a
    protected C4132h(DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.mo18034N()));
    }

    @C4056a
    /* renamed from: f */
    public Status mo17504f() {
        return this.f12945a;
    }

    @C4056a
    public void release() {
        DataHolder dataHolder = this.f12946b;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @C4056a
    protected C4132h(DataHolder dataHolder, Status status) {
        this.f12945a = status;
        this.f12946b = dataHolder;
    }
}
