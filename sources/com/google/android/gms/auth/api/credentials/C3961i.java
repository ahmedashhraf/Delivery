package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.i */
public final class C3961i implements Creator<CredentialPickerConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 2) {
                z2 = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 3) {
                z3 = SafeParcelReader.m18903K(parcel, a);
            } else if (a2 == 4) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(i, z, z2, z3, i2);
        return credentialPickerConfig;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialPickerConfig[i];
    }
}
