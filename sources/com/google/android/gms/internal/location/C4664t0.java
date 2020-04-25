package com.google.android.gms.internal.location;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4346k;

/* renamed from: com.google.android.gms.internal.location.t0 */
public class C4664t0 extends C4346k<C4653o> {

    /* renamed from: L */
    private final String f13912L;

    /* renamed from: M */
    protected final C4640h0<C4653o> f13913M = new C4666u0(this);

    public C4664t0(Context context, Looper looper, C4088b bVar, C4089c cVar, String str, C4329f fVar) {
        super(context, looper, 23, fVar, bVar, cVar);
        this.f13912L = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public String mo10082A() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public String mo10083B() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public /* synthetic */ IInterface mo10084a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C4653o ? (C4653o) queryLocalInterface : new C4655p(iBinder);
    }

    /* renamed from: l */
    public int mo10085l() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Bundle mo18258v() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.f13912L);
        return bundle;
    }
}
