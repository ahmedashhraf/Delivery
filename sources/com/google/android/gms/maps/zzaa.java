package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public final class zzaa implements Creator<GoogleMapOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b2 = -1;
        byte b3 = -1;
        int i = 0;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    b2 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 3:
                    b3 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 4:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.m18921a(parcel2, a, CameraPosition.CREATOR);
                    break;
                case 6:
                    b4 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 7:
                    b5 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 8:
                    b6 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 9:
                    b7 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 10:
                    b8 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 11:
                    b9 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 12:
                    b10 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 14:
                    b11 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 15:
                    b12 = SafeParcelReader.m18905M(parcel2, a);
                    break;
                case 16:
                    f = SafeParcelReader.m18910R(parcel2, a);
                    break;
                case 17:
                    f2 = SafeParcelReader.m18910R(parcel2, a);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.m18921a(parcel2, a, LatLngBounds.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions(b2, b3, i, cameraPosition, b4, b5, b6, b7, b8, b9, b10, b11, b12, f, f2, latLngBounds);
        return googleMapOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleMapOptions[i];
    }
}
