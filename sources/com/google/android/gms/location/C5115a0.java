package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.a0 */
public final class C5115a0 implements Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                status = (Status) SafeParcelReader.m18921a(parcel, a, Status.CREATOR);
            } else if (a2 != 2) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m18921a(parcel, a, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
