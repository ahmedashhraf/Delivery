package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.k */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4458k implements Creator<zam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                arrayList = SafeParcelReader.m18930c(parcel, a, zal.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zam(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
