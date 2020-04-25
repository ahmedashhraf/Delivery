package com.google.android.gms.common.internal.p167k0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.common.internal.k0.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4355i extends C4346k<C4360n> {
    public C4355i(Context context, Looper looper, C4329f fVar, C4088b bVar, C4089c cVar) {
        super(context, looper, 39, fVar, bVar, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.common.service.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (queryLocalInterface instanceof C4360n) {
            return (C4360n) queryLocalInterface;
        }
        return new C4359m(iBinder);
    }
}
