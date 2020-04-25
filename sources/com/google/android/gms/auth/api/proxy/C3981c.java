package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.c */
public final class C3981c implements Creator<ProxyRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m18898F(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 == 4) {
                bArr = SafeParcelReader.m18936h(parcel, a);
            } else if (a2 == 5) {
                bundle = SafeParcelReader.m18935g(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        ProxyRequest proxyRequest = new ProxyRequest(i, str, i2, j, bArr, bundle);
        return proxyRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyRequest[i];
    }
}
