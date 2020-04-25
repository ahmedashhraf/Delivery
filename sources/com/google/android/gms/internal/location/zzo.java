package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.location.C5159t0;
import com.google.android.gms.location.C5161u0;

@C4392a(creator = "DeviceOrientationRequestUpdateDataCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C4670w0();
    @C4394c(defaultValueUnchecked = "null", getter = "getDeviceOrientationListenerBinder", mo18384id = 3, type = "android.os.IBinder")

    /* renamed from: N */
    private C5159t0 f13954N;
    @C4394c(defaultValueUnchecked = "null", getter = "getFusedLocationProviderCallbackBinder", mo18384id = 4, type = "android.os.IBinder")

    /* renamed from: O */
    private C4643j f13955O;
    @C4394c(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", mo18384id = 1)

    /* renamed from: a */
    private int f13956a;
    @C4394c(defaultValueUnchecked = "null", mo18384id = 2)

    /* renamed from: b */
    private zzm f13957b;

    @C4393b
    zzo(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) zzm zzm, @C4396e(mo18387id = 3) IBinder iBinder, @C4396e(mo18387id = 4) IBinder iBinder2) {
        this.f13956a = i;
        this.f13957b = zzm;
        C4643j jVar = null;
        this.f13954N = iBinder == null ? null : C5161u0.m22431a(iBinder);
        if (!(iBinder2 == null || iBinder2 == null)) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            jVar = queryLocalInterface instanceof C4643j ? (C4643j) queryLocalInterface : new C4647l(iBinder2);
        }
        this.f13955O = jVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13956a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f13957b, i, false);
        C5159t0 t0Var = this.f13954N;
        IBinder iBinder = null;
        C4399a.m18967a(parcel, 3, t0Var == null ? null : t0Var.asBinder(), false);
        C4643j jVar = this.f13955O;
        if (jVar != null) {
            iBinder = jVar.asBinder();
        }
        C4399a.m18967a(parcel, 4, iBinder, false);
        C4399a.m18959a(parcel, a);
    }
}
