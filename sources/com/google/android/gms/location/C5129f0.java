package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.f0 */
public final class C5129f0 implements Creator<ActivityTransition> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i2 = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new ActivityTransition(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransition[i];
    }
}
