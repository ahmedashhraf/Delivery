package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.f0 */
public final class C4634f0 implements Creator<zzbf> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        zzbd zzbd = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    zzbd = (zzbd) SafeParcelReader.m18921a(parcel, a, zzbd.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.m18911S(parcel, a);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) SafeParcelReader.m18921a(parcel, a, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = SafeParcelReader.m18911S(parcel, a);
                    break;
                case 6:
                    iBinder3 = SafeParcelReader.m18911S(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        zzbf zzbf = new zzbf(i, zzbd, iBinder, pendingIntent, iBinder2, iBinder3);
        return zzbf;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbf[i];
    }
}
