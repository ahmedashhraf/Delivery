package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.o */
public final class C4048o implements Creator<TokenData> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        Long l = null;
        List list = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 3:
                    l = SafeParcelReader.m18915W(parcel, a);
                    break;
                case 4:
                    z = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 6:
                    list = SafeParcelReader.m18900H(parcel, a);
                    break;
                case 7:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        TokenData tokenData = new TokenData(i, str, l, z, z2, list, str2);
        return tokenData;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenData[i];
    }
}
