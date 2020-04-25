package com.google.android.gms.plus.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.plus.internal.n */
public final class C5527n implements Creator<zzn> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        PlusCommonExtras plusCommonExtras = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        str = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 2:
                        strArr = SafeParcelReader.m18899G(parcel, a);
                        break;
                    case 3:
                        strArr2 = SafeParcelReader.m18899G(parcel, a);
                        break;
                    case 4:
                        strArr3 = SafeParcelReader.m18899G(parcel, a);
                        break;
                    case 5:
                        str2 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 6:
                        str3 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 7:
                        str4 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 8:
                        str5 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 9:
                        plusCommonExtras = (PlusCommonExtras) SafeParcelReader.m18921a(parcel, a, PlusCommonExtras.CREATOR);
                        break;
                    default:
                        SafeParcelReader.m18918Z(parcel, a);
                        break;
                }
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzn zzn = new zzn(i, str, strArr, strArr2, strArr3, str2, str3, str4, str5, plusCommonExtras);
        return zzn;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzn[i];
    }
}
