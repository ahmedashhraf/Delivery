package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.e */
public final class C4038e implements Creator<AccountChangeEvent> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    j = SafeParcelReader.m18914V(parcel, a);
                    break;
                case 3:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 5:
                    i3 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        AccountChangeEvent accountChangeEvent = new AccountChangeEvent(i, j, str, i2, i3, str2);
        return accountChangeEvent;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AccountChangeEvent[i];
    }
}
