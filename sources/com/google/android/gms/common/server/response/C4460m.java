package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.m */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4460m implements Creator<SafeParcelResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zaj zaj = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                parcel2 = SafeParcelReader.m18953y(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                zaj = (zaj) SafeParcelReader.m18921a(parcel, a, zaj.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new SafeParcelResponse(i, parcel2, zaj);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
