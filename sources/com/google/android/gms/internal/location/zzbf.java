package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.location.C5116a1;
import com.google.android.gms.location.C5165w0;
import com.google.android.gms.location.C5167x0;
import com.google.android.gms.location.C5171z0;

@C4392a(creator = "LocationRequestUpdateDataCreator")
@C4397f({1000})
public final class zzbf extends AbstractSafeParcelable {
    public static final Creator<zzbf> CREATOR = new C4634f0();
    @C4394c(defaultValueUnchecked = "null", getter = "getLocationListenerBinder", mo18384id = 3, type = "android.os.IBinder")

    /* renamed from: N */
    private C5171z0 f13934N;
    @C4394c(defaultValueUnchecked = "null", mo18384id = 4)

    /* renamed from: O */
    private PendingIntent f13935O;
    @C4394c(defaultValueUnchecked = "null", getter = "getLocationCallbackBinder", mo18384id = 5, type = "android.os.IBinder")

    /* renamed from: P */
    private C5165w0 f13936P;
    @C4394c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", mo18384id = 6, type = "android.os.IBinder")

    /* renamed from: Q */
    private C4643j f13937Q;
    @C4394c(defaultValueUnchecked = "LocationRequestUpdateData.OPERATION_ADD", mo18384id = 1)

    /* renamed from: a */
    private int f13938a;
    @C4394c(defaultValueUnchecked = "null", mo18384id = 2)

    /* renamed from: b */
    private zzbd f13939b;

    @C4393b
    zzbf(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) zzbd zzbd, @C4396e(mo18387id = 3) IBinder iBinder, @C4396e(mo18387id = 4) PendingIntent pendingIntent, @C4396e(mo18387id = 5) IBinder iBinder2, @C4396e(mo18387id = 6) IBinder iBinder3) {
        this.f13938a = i;
        this.f13939b = zzbd;
        C4643j jVar = null;
        this.f13934N = iBinder == null ? null : C5116a1.m22352a(iBinder);
        this.f13935O = pendingIntent;
        this.f13936P = iBinder2 == null ? null : C5167x0.m22436a(iBinder2);
        if (!(iBinder3 == null || iBinder3 == null)) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            jVar = queryLocalInterface instanceof C4643j ? (C4643j) queryLocalInterface : new C4647l(iBinder3);
        }
        this.f13937Q = jVar;
    }

    /* renamed from: a */
    public static zzbf m19892a(C5165w0 w0Var, @C0195i0 C4643j jVar) {
        zzbf zzbf = new zzbf(2, null, null, null, w0Var.asBinder(), jVar != null ? jVar.asBinder() : null);
        return zzbf;
    }

    /* renamed from: a */
    public static zzbf m19893a(C5171z0 z0Var, @C0195i0 C4643j jVar) {
        zzbf zzbf = new zzbf(2, null, z0Var.asBinder(), null, null, jVar != null ? jVar.asBinder() : null);
        return zzbf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13938a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f13939b, i, false);
        C5171z0 z0Var = this.f13934N;
        IBinder iBinder = null;
        C4399a.m18967a(parcel, 3, z0Var == null ? null : z0Var.asBinder(), false);
        C4399a.m18969a(parcel, 4, (Parcelable) this.f13935O, i, false);
        C5165w0 w0Var = this.f13936P;
        C4399a.m18967a(parcel, 5, w0Var == null ? null : w0Var.asBinder(), false);
        C4643j jVar = this.f13937Q;
        if (jVar != null) {
            iBinder = jVar.asBinder();
        }
        C4399a.m18967a(parcel, 6, iBinder, false);
        C4399a.m18959a(parcel, a);
    }
}
