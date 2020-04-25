package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "PointOfInterestCreator")
@C4397f({1})
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Creator<PointOfInterest> CREATOR = new zzj();
    @C4394c(mo18384id = 2)
    public final LatLng latLng;
    @C4394c(mo18384id = 4)
    public final String name;
    @C4394c(mo18384id = 3)
    public final String placeId;

    @C4393b
    public PointOfInterest(@C4396e(mo18387id = 2) LatLng latLng2, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) String str2) {
        this.latLng = latLng2;
        this.placeId = str;
        this.name = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18969a(parcel, 2, (Parcelable) this.latLng, i, false);
        C4399a.m18979a(parcel, 3, this.placeId, false);
        C4399a.m18979a(parcel, 4, this.name, false);
        C4399a.m18959a(parcel, a);
    }
}
