package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;

public final class zzai implements Creator<StreetViewPanoramaOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        StreetViewPanoramaCamera streetViewPanoramaCamera = null;
        String str = null;
        LatLng latLng = null;
        Integer num = null;
        StreetViewSource streetViewSource = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    streetViewPanoramaCamera = (StreetViewPanoramaCamera) SafeParcelReader.m18921a(parcel, a, StreetViewPanoramaCamera.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.m18921a(parcel, a, LatLng.CREATOR);
                    break;
                case 5:
                    num = SafeParcelReader.m18913U(parcel, a);
                    break;
                case 6:
                    b2 = SafeParcelReader.m18905M(parcel, a);
                    break;
                case 7:
                    b3 = SafeParcelReader.m18905M(parcel, a);
                    break;
                case 8:
                    b4 = SafeParcelReader.m18905M(parcel, a);
                    break;
                case 9:
                    b5 = SafeParcelReader.m18905M(parcel, a);
                    break;
                case 10:
                    b6 = SafeParcelReader.m18905M(parcel, a);
                    break;
                case 11:
                    streetViewSource = (StreetViewSource) SafeParcelReader.m18921a(parcel, a, StreetViewSource.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions(streetViewPanoramaCamera, str, latLng, num, b2, b3, b4, b5, b6, streetViewSource);
        return streetViewPanoramaOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaOptions[i];
    }
}
