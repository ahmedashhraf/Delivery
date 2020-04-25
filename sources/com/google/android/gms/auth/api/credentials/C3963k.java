package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.k */
public final class C3963k implements Creator<CredentialRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String[] strArr = null;
        CredentialPickerConfig credentialPickerConfig = null;
        CredentialPickerConfig credentialPickerConfig2 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 != 1000) {
                switch (a2) {
                    case 1:
                        z = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 2:
                        strArr = SafeParcelReader.m18899G(parcel, a);
                        break;
                    case 3:
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m18921a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 4:
                        credentialPickerConfig2 = (CredentialPickerConfig) SafeParcelReader.m18921a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 5:
                        z2 = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 6:
                        str = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 8:
                        z3 = SafeParcelReader.m18903K(parcel, a);
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
        CredentialRequest credentialRequest = new CredentialRequest(i, z, strArr, credentialPickerConfig, credentialPickerConfig2, z2, str, str2, z3);
        return credentialRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CredentialRequest[i];
    }
}
