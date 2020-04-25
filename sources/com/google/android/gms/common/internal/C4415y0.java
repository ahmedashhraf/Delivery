package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.y0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4415y0 implements Creator<ResolveAccountResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                iBinder = SafeParcelReader.m18911S(parcel, a);
            } else if (a2 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m18921a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 == 4) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                z2 = SafeParcelReader.m18903K(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        ResolveAccountResponse resolveAccountResponse = new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
        return resolveAccountResponse;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
