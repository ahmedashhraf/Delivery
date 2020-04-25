package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzv implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                latLng2 = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 4) {
                latLng3 = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 5) {
                latLng4 = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
            } else if (a2 != 6) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.m18921a(parcel, a, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        VisibleRegion visibleRegion = new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
        return visibleRegion;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
