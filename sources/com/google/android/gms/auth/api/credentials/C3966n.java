package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.credentials.n */
public final class C3966n implements Creator<HintRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        CredentialPickerConfig credentialPickerConfig = null;
        String[] strArr = null;
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
                        credentialPickerConfig = (CredentialPickerConfig) SafeParcelReader.m18921a(parcel, a, CredentialPickerConfig.CREATOR);
                        break;
                    case 2:
                        z = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 3:
                        z2 = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 4:
                        strArr = SafeParcelReader.m18899G(parcel, a);
                        break;
                    case 5:
                        z3 = SafeParcelReader.m18903K(parcel, a);
                        break;
                    case 6:
                        str = SafeParcelReader.m18898F(parcel, a);
                        break;
                    case 7:
                        str2 = SafeParcelReader.m18898F(parcel, a);
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
        HintRequest hintRequest = new HintRequest(i, credentialPickerConfig, z, z2, strArr, z3, str, str2);
        return hintRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new HintRequest[i];
    }
}
