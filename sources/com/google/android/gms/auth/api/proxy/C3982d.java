package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.auth.api.proxy.d */
public final class C3982d implements Creator<ProxyResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m18921a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 == 3) {
                i3 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 4) {
                bundle = SafeParcelReader.m18935g(parcel, a);
            } else if (a2 == 5) {
                bArr = SafeParcelReader.m18936h(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        ProxyResponse proxyResponse = new ProxyResponse(i, i2, pendingIntent, i3, bundle, bArr);
        return proxyResponse;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ProxyResponse[i];
    }
}
