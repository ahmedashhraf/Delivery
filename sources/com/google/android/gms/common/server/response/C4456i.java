package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4456i implements Creator<Field> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        String str2 = null;
        zab zab = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    i2 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 3:
                    z = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 4:
                    i3 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 6:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 7:
                    i4 = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 9:
                    zab = (zab) SafeParcelReader.m18921a(parcel, a, zab.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        Field field = new Field(i, i2, z, i3, z2, str, i4, str2, zab);
        return field;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }
}
