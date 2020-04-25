package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.dynamic.C4519d.C4520a;

@C4392a(creator = "CapCreator")
@C4397f({1})
public class Cap extends AbstractSafeParcelable {
    public static final Creator<Cap> CREATOR = new zzb();
    private static final String TAG = Cap.class.getSimpleName();
    @C0195i0
    @C4394c(getter = "getWrappedBitmapDescriptorImplBinder", mo18384id = 3, type = "android.os.IBinder")
    private final BitmapDescriptor bitmapDescriptor;
    @C4394c(getter = "getType", mo18384id = 2)
    private final int type;
    @C0195i0
    @C4394c(getter = "getBitmapRefWidth", mo18384id = 4)
    private final Float zzcm;

    protected Cap(int i) {
        this(i, (BitmapDescriptor) null, (Float) null);
    }

    @C4393b
    Cap(@C4396e(mo18387id = 2) int i, @C4396e(mo18387id = 3) @C0195i0 IBinder iBinder, @C4396e(mo18387id = 4) @C0195i0 Float f) {
        this(i, iBinder == null ? null : new BitmapDescriptor(C4520a.m19510a(iBinder)), f);
    }

    private Cap(int i, @C0195i0 BitmapDescriptor bitmapDescriptor2, @C0195i0 Float f) {
        C4300a0.m18628a(i != 3 || (bitmapDescriptor2 != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), (Object) String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), bitmapDescriptor2, f}));
        this.type = i;
        this.bitmapDescriptor = bitmapDescriptor2;
        this.zzcm = f;
    }

    protected Cap(@C0193h0 BitmapDescriptor bitmapDescriptor2, float f) {
        this(3, bitmapDescriptor2, Float.valueOf(f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.type == cap.type && C4413y.m19053a(this.bitmapDescriptor, cap.bitmapDescriptor) && C4413y.m19053a(this.zzcm, cap.zzcm);
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.type), this.bitmapDescriptor, this.zzcm);
    }

    public String toString() {
        int i = this.type;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 2, this.type);
        BitmapDescriptor bitmapDescriptor2 = this.bitmapDescriptor;
        C4399a.m18967a(parcel, 3, bitmapDescriptor2 == null ? null : bitmapDescriptor2.zza().asBinder(), false);
        C4399a.m18976a(parcel, 4, this.zzcm, false);
        C4399a.m18959a(parcel, a);
    }

    /* access modifiers changed from: 0000 */
    public final Cap zzg() {
        int i = this.type;
        if (i == 0) {
            return new ButtCap();
        }
        if (i == 1) {
            return new SquareCap();
        }
        if (i == 2) {
            return new RoundCap();
        }
        if (i == 3) {
            return new CustomCap(this.bitmapDescriptor, this.zzcm.floatValue());
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Unknown Cap type: ");
        sb.append(i);
        sb.toString();
        return this;
    }
}
