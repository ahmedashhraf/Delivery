package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

public final class zzk implements Creator<PolygonOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = null;
        List list = null;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 2:
                    arrayList2 = SafeParcelReader.m18930c(parcel, a, LatLng.CREATOR);
                    break;
                case 3:
                    SafeParcelReader.m18925a(parcel, a, (List) arrayList, zzk.class.getClassLoader());
                    break;
                case 4:
                    f = SafeParcelReader.m18909Q(parcel, a);
                    break;
                case 5:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 7:
                    f2 = SafeParcelReader.m18909Q(parcel, a);
                    break;
                case 8:
                    z = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 10:
                    z3 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 11:
                    i3 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 12:
                    list = SafeParcelReader.m18930c(parcel, a, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        PolygonOptions polygonOptions = new PolygonOptions(arrayList2, arrayList, f, i, i2, f2, z, z2, z3, i3, list);
        return polygonOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PolygonOptions[i];
    }
}
