package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C5538i implements Creator<zak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m18921a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) SafeParcelReader.m18921a(parcel, a, ResolveAccountResponse.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zak(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
