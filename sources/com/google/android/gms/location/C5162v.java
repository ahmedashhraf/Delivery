package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.v */
public final class C5162v implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 3:
                    j2 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 4:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                case 5:
                    j3 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 7:
                    f = SafeParcelReader.m18909Q(parcel2, a);
                    break;
                case 8:
                    j4 = SafeParcelReader.m18914V(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        LocationRequest locationRequest = new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return locationRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
