package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.c1 */
public final class C4310c1 implements Creator<GetServiceRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 2:
                    i2 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 3:
                    i3 = SafeParcelReader.m18912T(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m18898F(parcel2, a);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m18911S(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m18927b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m18935g(parcel2, a);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m18921a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m18927b(parcel2, a, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m18927b(parcel2, a, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m18903K(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel2, b);
        GetServiceRequest getServiceRequest = new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z);
        return getServiceRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
