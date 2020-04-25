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

@C4392a(creator = "ConditionalUserPropertyParcelCreator")
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class zzs extends AbstractSafeParcelable {
    public static final Creator<zzs> CREATOR = new C5364p9();
    @C4394c(mo18384id = 4)

    /* renamed from: N */
    public zzjx f15717N;
    @C4394c(mo18384id = 5)

    /* renamed from: O */
    public long f15718O;
    @C4394c(mo18384id = 6)

    /* renamed from: P */
    public boolean f15719P;
    @C4394c(mo18384id = 7)

    /* renamed from: Q */
    public String f15720Q;
    @C4394c(mo18384id = 8)

    /* renamed from: R */
    public zzak f15721R;
    @C4394c(mo18384id = 9)

    /* renamed from: S */
    public long f15722S;
    @C4394c(mo18384id = 10)

    /* renamed from: T */
    public zzak f15723T;
    @C4394c(mo18384id = 11)

    /* renamed from: U */
    public long f15724U;
    @C4394c(mo18384id = 12)

    /* renamed from: V */
    public zzak f15725V;
    @C4394c(mo18384id = 2)

    /* renamed from: a */
    public String f15726a;
    @C4394c(mo18384id = 3)

    /* renamed from: b */
    public String f15727b;

    zzs(zzs zzs) {
        C4300a0.m18620a(zzs);
        this.f15726a = zzs.f15726a;
        this.f15727b = zzs.f15727b;
        this.f15717N = zzs.f15717N;
        this.f15718O = zzs.f15718O;
        this.f15719P = zzs.f15719P;
        this.f15720Q = zzs.f15720Q;
        this.f15721R = zzs.f15721R;
        this.f15722S = zzs.f15722S;
        this.f15723T = zzs.f15723T;
        this.f15724U = zzs.f15724U;
        this.f15725V = zzs.f15725V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 2, this.f15726a, false);
        C4399a.m18979a(parcel, 3, this.f15727b, false);
        C4399a.m18969a(parcel, 4, (Parcelable) this.f15717N, i, false);
        C4399a.m18965a(parcel, 5, this.f15718O);
        C4399a.m18984a(parcel, 6, this.f15719P);
        C4399a.m18979a(parcel, 7, this.f15720Q, false);
        C4399a.m18969a(parcel, 8, (Parcelable) this.f15721R, i, false);
        C4399a.m18965a(parcel, 9, this.f15722S);
        C4399a.m18969a(parcel, 10, (Parcelable) this.f15723T, i, false);
        C4399a.m18965a(parcel, 11, this.f15724U);
        C4399a.m18969a(parcel, 12, (Parcelable) this.f15725V, i, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzs(@C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) zzjx zzjx, @C4396e(mo18387id = 5) long j, @C4396e(mo18387id = 6) boolean z, @C4396e(mo18387id = 7) String str3, @C4396e(mo18387id = 8) zzak zzak, @C4396e(mo18387id = 9) long j2, @C4396e(mo18387id = 10) zzak zzak2, @C4396e(mo18387id = 11) long j3, @C4396e(mo18387id = 12) zzak zzak3) {
        this.f15726a = str;
        this.f15727b = str2;
        this.f15717N = zzjx;
        this.f15718O = j;
        this.f15719P = z;
        this.f15720Q = str3;
        this.f15721R = zzak;
        this.f15722S = j2;
        this.f15723T = zzak2;
        this.f15724U = j3;
        this.f15725V = zzak3;
    }
}
