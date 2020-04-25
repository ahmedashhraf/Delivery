package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C4342i1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import p201f.p202a.C5952h;

@C4392a(creator = "GoogleCertificatesQueryCreator")
public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C4261d0();
    @C4394c(getter = "getAllowTestKeys", mo18384id = 3)

    /* renamed from: N */
    private final boolean f13777N;
    @C4394c(defaultValue = "false", getter = "getForbidTestKeys", mo18384id = 4)

    /* renamed from: O */
    private final boolean f13778O;
    @C4394c(getter = "getCallingPackage", mo18384id = 1)

    /* renamed from: a */
    private final String f13779a;
    @C5952h
    @C4394c(getter = "getCallingCertificateBinder", mo18384id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    private final C4510x f13780b;

    @C4393b
    zzk(@C4396e(mo18387id = 1) String str, @C5952h @C4396e(mo18387id = 2) IBinder iBinder, @C4396e(mo18387id = 3) boolean z, @C4396e(mo18387id = 4) boolean z2) {
        this.f13779a = str;
        this.f13780b = m19440a(iBinder);
        this.f13777N = z;
        this.f13778O = z2;
    }

    @C5952h
    /* renamed from: a */
    private static C4510x m19440a(@C5952h IBinder iBinder) {
        byte[] bArr;
        C4511y yVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C4519d i = C4342i1.m18804a(iBinder).mo18324i();
            if (i == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C4523f.m19512d(i);
            }
            if (bArr != null) {
                yVar = new C4511y(bArr);
            }
        } catch (RemoteException unused) {
        }
        return yVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, this.f13779a, false);
        C4510x xVar = this.f13780b;
        if (xVar == null) {
            iBinder = null;
        } else {
            iBinder = xVar.asBinder();
        }
        C4399a.m18967a(parcel, 2, iBinder, false);
        C4399a.m18984a(parcel, 3, this.f13777N);
        C4399a.m18984a(parcel, 4, this.f13778O);
        C4399a.m18959a(parcel, a);
    }

    zzk(String str, @C5952h C4510x xVar, boolean z, boolean z2) {
        this.f13779a = str;
        this.f13780b = xVar;
        this.f13777N = z;
        this.f13778O = z2;
    }
}
