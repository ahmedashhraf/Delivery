package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.plus.C5478b.C5479a;
import com.google.android.gms.plus.p177g.p178a.C5511b;

@C4476d0
/* renamed from: com.google.android.gms.plus.internal.i */
final class C5522i implements C5479a {

    /* renamed from: N */
    private final C5511b f15817N;

    /* renamed from: a */
    private final Status f15818a;

    /* renamed from: b */
    private final String f15819b;

    public C5522i(Status status, DataHolder dataHolder, String str) {
        this.f15818a = status;
        this.f15819b = str;
        this.f15817N = dataHolder != null ? new C5511b(dataHolder) : null;
    }

    /* renamed from: F */
    public final C5511b mo19882F() {
        return this.f15817N;
    }

    /* renamed from: G */
    public final String mo19883G() {
        return this.f15819b;
    }

    /* renamed from: f */
    public final Status mo17504f() {
        return this.f15818a;
    }

    public final void release() {
        C5511b bVar = this.f15817N;
        if (bVar != null) {
            bVar.release();
        }
    }
}
