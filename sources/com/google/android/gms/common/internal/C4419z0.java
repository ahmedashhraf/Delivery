package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.z0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4419z0 implements Creator<SignInButtonConfig> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        int i = 0;
        Scope[] scopeArr = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 3) {
                i3 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                scopeArr = (Scope[]) SafeParcelReader.m18927b(parcel, a, Scope.CREATOR);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new SignInButtonConfig(i, i2, i3, scopeArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInButtonConfig[i];
    }
}
