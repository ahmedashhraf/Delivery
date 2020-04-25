package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.t */
public final class C4467t implements Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m18921a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                str = SafeParcelReader.m18898F(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
