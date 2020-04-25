package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.j */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4022j implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m18930c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m18921a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 6:
                    z3 = SafeParcelReader.m18903K(parcel, a);
                    break;
                case 7:
                    str = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m18898F(parcel, a);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m18930c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m18898F(parcel, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
