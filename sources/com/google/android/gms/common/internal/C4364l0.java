package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.l0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4364l0 implements Creator<AuthAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            switch (SafeParcelReader.m18919a(a)) {
                case 1:
                    i = SafeParcelReader.m18912T(parcel, a);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m18911S(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.m18927b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num = SafeParcelReader.m18913U(parcel, a);
                    break;
                case 5:
                    num2 = SafeParcelReader.m18913U(parcel, a);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.m18921a(parcel, a, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.m18918Z(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
        return authAccountRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
