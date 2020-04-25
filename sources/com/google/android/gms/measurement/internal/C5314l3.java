package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.C4284g;
import com.google.android.gms.common.internal.C4314e;
import com.google.android.gms.common.internal.C4314e.C4315a;
import com.google.android.gms.common.internal.C4314e.C4316b;

/* renamed from: com.google.android.gms.measurement.internal.l3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5314l3 extends C4314e<C5204b3> {
    public C5314l3(Context context, Looper looper, C4315a aVar, C4316b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: A */
    public final String mo10082A() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    /* access modifiers changed from: protected */
    @C0193h0
    /* renamed from: B */
    public final String mo10083B() {
        return "com.google.android.gms.measurement.START";
    }

    /* renamed from: a */
    public final /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof C5204b3) {
            return (C5204b3) queryLocalInterface;
        }
        return new C5237e3(iBinder);
    }

    /* renamed from: l */
    public final int mo10085l() {
        return C4284g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
