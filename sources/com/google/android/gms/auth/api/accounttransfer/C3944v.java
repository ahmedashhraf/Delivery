package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.v */
public final class C3944v implements Creator<DeviceMetaData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                z2 = SafeParcelReader.m18903K(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        DeviceMetaData deviceMetaData = new DeviceMetaData(i, z, j, z2);
        return deviceMetaData;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceMetaData[i];
    }
}
