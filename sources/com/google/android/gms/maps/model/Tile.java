package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "TileCreator")
@C4397f({1})
public final class Tile extends AbstractSafeParcelable {
    public static final Creator<Tile> CREATOR = new zzr();
    @C4394c(mo18384id = 4)
    public final byte[] data;
    @C4394c(mo18384id = 3)
    public final int height;
    @C4394c(mo18384id = 2)
    public final int width;

    @C4393b
    public Tile(@C4396e(mo18387id = 2) int i, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) byte[] bArr) {
        this.width = i;
        this.height = i2;
        this.data = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 2, this.width);
        C4399a.m18964a(parcel, 3, this.height);
        C4399a.m18985a(parcel, 4, this.data, false);
        C4399a.m18959a(parcel, a);
    }
}
