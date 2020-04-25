package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzd implements Creator<GroundOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        IBinder iBinder = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    iBinder = SafeParcelReader.m18911S(parcel2, a);
                    break;
                case 3:
                    latLng = (LatLng) SafeParcelReader.m18921a(parcel2, a, LatLng.CREATOR);
                    break;
                case 4:
                    f = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 5:
                    f2 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m18921a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                case 7:
                    f3 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 8:
                    f4 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 9:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 10:
                    f5 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 11:
                    f6 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 12:
                    f7 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 13:
                    z2 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions(iBinder, latLng, f, f2, latLngBounds, f3, f4, z, f5, f6, f7, z2);
        return groundOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GroundOverlayOptions[i];
    }
}
