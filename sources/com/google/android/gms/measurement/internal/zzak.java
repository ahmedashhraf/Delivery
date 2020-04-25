package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4392a(creator = "EventParcelCreator")
@C4397f({1})
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class zzak extends AbstractSafeParcelable {
    public static final Creator<zzak> CREATOR = new C5288j();
    @C4394c(mo18384id = 4)

    /* renamed from: N */
    public final String f15684N;
    @C4394c(mo18384id = 5)

    /* renamed from: O */
    public final long f15685O;
    @C4394c(mo18384id = 2)

    /* renamed from: a */
    public final String f15686a;
    @C4394c(mo18384id = 3)

    /* renamed from: b */
    public final zzaf f15687b;

    @C4393b
    public zzak(@C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) zzaf zzaf, @C4396e(mo18387id = 4) String str2, @C4396e(mo18387id = 5) long j) {
        this.f15686a = str;
        this.f15687b = zzaf;
        this.f15684N = str2;
        this.f15685O = j;
    }

    public final String toString() {
        String str = this.f15684N;
        String str2 = this.f15686a;
        String valueOf = String.valueOf(this.f15687b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 2, this.f15686a, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f15687b, i, false);
        C4399a.m18979a(parcel, 4, this.f15684N, false);
        C4399a.m18965a(parcel, 5, this.f15685O);
        C4399a.m18959a(parcel, a);
    }

    zzak(zzak zzak, long j) {
        C4300a0.m18620a(zzak);
        this.f15686a = zzak.f15686a;
        this.f15687b = zzak.f15687b;
        this.f15684N = zzak.f15684N;
        this.f15685O = j;
    }
}
