package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.l */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4459l implements Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                arrayList = SafeParcelReader.m18930c(parcel, a, zam.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                str = SafeParcelReader.m18898F(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zaj(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
