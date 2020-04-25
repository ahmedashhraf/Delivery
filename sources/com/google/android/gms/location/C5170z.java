package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.z */
public final class C5170z implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m18930c(parcel, a, LocationRequest.CREATOR);
            } else if (a2 == 2) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 3) {
                z2 = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                zzae = (zzae) SafeParcelReader.m18921a(parcel, a, zzae.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
