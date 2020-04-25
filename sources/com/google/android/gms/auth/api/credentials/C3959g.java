package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.auth.api.credentials.g */
public final class C3959g implements Creator<Credential> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        List list = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 2:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 3:
                    uri = (Uri) SafeParcelReader.m18921a(parcel, a, Uri.CREATOR);
                    break;
                case 4:
                    list = SafeParcelReader.m18930c(parcel, a, IdToken.CREATOR);
                    break;
                case 5:
                    str3 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 6:
                    str4 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 9:
                    str5 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 10:
                    str6 = SafeParcelReader.m18898F(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        Credential credential = new Credential(str, str2, uri, list, str3, str4, str5, str6);
        return credential;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Credential[i];
    }
}
