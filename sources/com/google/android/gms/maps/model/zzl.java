package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

public final class zzl implements Creator<PolylineOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        List list = null;
        Cap cap = null;
        Cap cap2 = null;
        List list2 = null;
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    list = SafeParcelReader.m18930c(parcel2, a, LatLng.CREATOR);
                    break;
                case 3:
                    f = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 4:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 5:
                    f2 = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 6:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 7:
                    z2 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 8:
                    z3 = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.m18921a(parcel2, a, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.m18921a(parcel2, a, Cap.CREATOR);
                    break;
                case 11:
                    i2 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 12:
                    list2 = SafeParcelReader.m18930c(parcel2, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        PolylineOptions polylineOptions = new PolylineOptions(list, f, i, f2, z, z2, z3, cap, cap2, i2, list2);
        return polylineOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolylineOptions[i];
    }
}
