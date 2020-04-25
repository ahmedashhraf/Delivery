package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

public final class zzu implements Creator<TileOverlayOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        IBinder iBinder = null;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        float f2 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 2) {
                iBinder = SafeParcelReader.m18911S(parcel, a);
            } else if (a2 == 3) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 4) {
                f = SafeParcelReader.m18909Q(parcel, a);
            } else if (a2 == 5) {
                z2 = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 != 6) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                f2 = SafeParcelReader.m18909Q(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions(iBinder, z, f, z2, f2);
        return tileOverlayOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TileOverlayOptions[i];
    }
}
