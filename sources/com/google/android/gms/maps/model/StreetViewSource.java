package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "StreetViewSourceCreator")
@C4397f({1})
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Creator<StreetViewSource> CREATOR = new zzq();
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    private static final String TAG = StreetViewSource.class.getSimpleName();
    @C4394c(getter = "getType", mo18384id = 2)
    private final int type;

    @C4393b
    public StreetViewSource(@C4396e(mo18387id = 2) int i) {
        this.type = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewSource)) {
            return false;
        }
        return this.type == ((StreetViewSource) obj).type;
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.type));
    }

    public final String toString() {
        String str;
        int i = this.type;
        if (i == 0) {
            str = MessengerShareContentUtility.PREVIEW_DEFAULT;
        } else if (i != 1) {
            str = String.format("UNKNOWN(%s)", new Object[]{Integer.valueOf(i)});
        } else {
            str = "OUTDOOR";
        }
        return String.format("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 2, this.type);
        C4399a.m18959a(parcel, a);
    }
}
