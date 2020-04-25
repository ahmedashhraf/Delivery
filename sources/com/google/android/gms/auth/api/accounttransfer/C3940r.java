package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.accounttransfer.r */
public final class C3940r implements Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    list = SafeParcelReader.m18900H(parcel, a);
                    break;
                case 3:
                    list2 = SafeParcelReader.m18900H(parcel, a);
                    break;
                case 4:
                    list3 = SafeParcelReader.m18900H(parcel, a);
                    break;
                case 5:
                    list4 = SafeParcelReader.m18900H(parcel, a);
                    break;
                case 6:
                    list5 = SafeParcelReader.m18900H(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzo zzo = new zzo(i, list, list2, list3, list4, list5);
        return zzo;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
