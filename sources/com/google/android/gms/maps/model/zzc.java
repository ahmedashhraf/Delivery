package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzc implements Creator<CircleOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        LatLng latLng = null;
        List list = null;
        double d = 0.0d;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.m18921a(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    d = SafeParcelReader.m18907O(parcel2, a);
                    break;
                case 4:
                    f = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 5:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 8:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 10:
                    list = SafeParcelReader.m18930c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        CircleOptions circleOptions = new CircleOptions(latLng, d, f, i, i2, f2, z, z2, list);
        return circleOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CircleOptions[i];
    }
}
