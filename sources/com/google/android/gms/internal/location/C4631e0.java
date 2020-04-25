package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: com.google.android.gms.internal.location.e0 */
public final class C4631e0 implements Creator<zzbd> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        List<ClientIdentity> list = zzbd.f13925T;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 != 1) {
                switch (a2) {
                    case 5:
                        list = SafeParcelReader.m18930c(parcel, a, ClientIdentity.CREATOR);
                        break;
                    case 6:
                        str = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 7:
                        z = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 8:
                        z2 = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 9:
                        z3 = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 10:
                        str2 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    default:
                        SafeParcelReader.m18918Z(parcel, a);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.m18921a(parcel, a, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzbd zzbd = new zzbd(locationRequest, list, str, z, z2, z3, str2);
        return zzbd;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbd[i];
    }
}
