package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zza implements Creator<CameraPosition> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                f = SafeParcelReader.m18909Q(parcel, a);
            } else if (a2 == 4) {
                f2 = SafeParcelReader.m18909Q(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                f3 = SafeParcelReader.m18909Q(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
