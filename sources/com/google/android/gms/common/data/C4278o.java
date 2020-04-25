package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.o */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4278o implements Creator<DataHolder> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                strArr = SafeParcelReader.m18899G(parcel, a);
            } else if (a2 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m18927b(parcel, a, CursorWindow.CREATOR);
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 == 4) {
                bundle = SafeParcelReader.m18935g(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                i = SafeParcelReader.m18912T(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo18035O();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
