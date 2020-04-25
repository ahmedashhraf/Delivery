package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzj implements Creator<PointOfInterest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                str2 = SafeParcelReader.m18898F(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new PointOfInterest(latLng, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
