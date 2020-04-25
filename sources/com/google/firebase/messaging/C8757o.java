package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.messaging.o */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C8757o implements Creator<RemoteMessage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            if (SafeParcelReader.m18919a(a) != 2) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                bundle = SafeParcelReader.m18935g(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        return new RemoteMessage(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
