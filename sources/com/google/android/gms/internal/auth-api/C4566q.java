package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.auth-api.q */
public final class C4566q implements Creator<zzs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            if (SafeParcelReader.m18919a(a) != 1) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                credential = (Credential) SafeParcelReader.m18921a(parcel, a, Credential.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new zzs(credential);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
