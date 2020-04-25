package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.e */
public final class C4630e implements Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            if (SafeParcelReader.m18919a(a) != 1) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                status = (Status) SafeParcelReader.m18921a(parcel, a, Status.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
