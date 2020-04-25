package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.util.HashSet;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.u */
public final class C3943u implements Creator<zzt> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        HashSet hashSet = new HashSet();
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case 2:
                    str = SafeParcelReader.m18898F(parcel, a);
                    hashSet.add(Integer.valueOf(2));
                    break;
                case 3:
                    i2 = SafeParcelReader.m18912T(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case 4:
                    bArr = SafeParcelReader.m18936h(parcel, a);
                    hashSet.add(Integer.valueOf(4));
                    break;
                case 5:
                    pendingIntent = (PendingIntent) SafeParcelReader.m18921a(parcel, a, PendingIntent.CREATOR);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) SafeParcelReader.m18921a(parcel, a, DeviceMetaData.CREATOR);
                    hashSet.add(Integer.valueOf(6));
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            zzt zzt = new zzt(hashSet, i, str, i2, bArr, pendingIntent, deviceMetaData);
            return zzt;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(b);
        throw new ParseException(sb.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzt[i];
    }
}
