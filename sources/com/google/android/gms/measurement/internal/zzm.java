package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.List;

@C4392a(creator = "AppMetadataCreator")
@C4397f({1, 20})
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class zzm extends AbstractSafeParcelable {
    public static final Creator<zzm> CREATOR = new C5331m9();
    @C4394c(mo18384id = 4)

    /* renamed from: N */
    public final String f15696N;
    @C4394c(mo18384id = 5)

    /* renamed from: O */
    public final String f15697O;
    @C4394c(mo18384id = 6)

    /* renamed from: P */
    public final long f15698P;
    @C4394c(mo18384id = 7)

    /* renamed from: Q */
    public final long f15699Q;
    @C4394c(mo18384id = 8)

    /* renamed from: R */
    public final String f15700R;
    @C4394c(defaultValue = "true", mo18384id = 9)

    /* renamed from: S */
    public final boolean f15701S;
    @C4394c(mo18384id = 10)

    /* renamed from: T */
    public final boolean f15702T;
    @C4394c(defaultValueUnchecked = "Integer.MIN_VALUE", mo18384id = 11)

    /* renamed from: U */
    public final long f15703U;
    @C4394c(mo18384id = 12)

    /* renamed from: V */
    public final String f15704V;
    @C4394c(mo18384id = 13)

    /* renamed from: W */
    public final long f15705W;
    @C4394c(mo18384id = 14)

    /* renamed from: X */
    public final long f15706X;
    @C4394c(mo18384id = 15)

    /* renamed from: Y */
    public final int f15707Y;
    @C4394c(defaultValue = "true", mo18384id = 16)

    /* renamed from: Z */
    public final boolean f15708Z;
    @C4394c(mo18384id = 2)

    /* renamed from: a */
    public final String f15709a;
    @C4394c(defaultValue = "true", mo18384id = 17)

    /* renamed from: a0 */
    public final boolean f15710a0;
    @C4394c(mo18384id = 3)

    /* renamed from: b */
    public final String f15711b;
    @C4394c(mo18384id = 18)

    /* renamed from: b0 */
    public final boolean f15712b0;
    @C4394c(mo18384id = 19)

    /* renamed from: c0 */
    public final String f15713c0;
    @C4394c(mo18384id = 21)

    /* renamed from: d0 */
    public final Boolean f15714d0;
    @C4394c(mo18384id = 22)

    /* renamed from: e0 */
    public final long f15715e0;
    @C4394c(mo18384id = 23)

    /* renamed from: f0 */
    public final List<String> f15716f0;

    zzm(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list) {
        C4300a0.m18630b(str);
        this.f15709a = str;
        this.f15711b = TextUtils.isEmpty(str2) ? null : str2;
        this.f15696N = str3;
        this.f15703U = j;
        this.f15697O = str4;
        this.f15698P = j2;
        this.f15699Q = j3;
        this.f15700R = str5;
        this.f15701S = z;
        this.f15702T = z2;
        this.f15704V = str6;
        this.f15705W = j4;
        this.f15706X = j5;
        this.f15707Y = i;
        this.f15708Z = z3;
        this.f15710a0 = z4;
        this.f15712b0 = z5;
        this.f15713c0 = str7;
        this.f15714d0 = bool;
        this.f15715e0 = j6;
        this.f15716f0 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 2, this.f15709a, false);
        C4399a.m18979a(parcel, 3, this.f15711b, false);
        C4399a.m18979a(parcel, 4, this.f15696N, false);
        C4399a.m18979a(parcel, 5, this.f15697O, false);
        C4399a.m18965a(parcel, 6, this.f15698P);
        C4399a.m18965a(parcel, 7, this.f15699Q);
        C4399a.m18979a(parcel, 8, this.f15700R, false);
        C4399a.m18984a(parcel, 9, this.f15701S);
        C4399a.m18984a(parcel, 10, this.f15702T);
        C4399a.m18965a(parcel, 11, this.f15703U);
        C4399a.m18979a(parcel, 12, this.f15704V, false);
        C4399a.m18965a(parcel, 13, this.f15705W);
        C4399a.m18965a(parcel, 14, this.f15706X);
        C4399a.m18964a(parcel, 15, this.f15707Y);
        C4399a.m18984a(parcel, 16, this.f15708Z);
        C4399a.m18984a(parcel, 17, this.f15710a0);
        C4399a.m18984a(parcel, 18, this.f15712b0);
        C4399a.m18979a(parcel, 19, this.f15713c0, false);
        C4399a.m18974a(parcel, 21, this.f15714d0, false);
        C4399a.m18965a(parcel, 22, this.f15715e0);
        C4399a.m19016i(parcel, 23, this.f15716f0, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzm(@C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) String str2, @C4396e(mo18387id = 4) String str3, @C4396e(mo18387id = 5) String str4, @C4396e(mo18387id = 6) long j, @C4396e(mo18387id = 7) long j2, @C4396e(mo18387id = 8) String str5, @C4396e(mo18387id = 9) boolean z, @C4396e(mo18387id = 10) boolean z2, @C4396e(mo18387id = 11) long j3, @C4396e(mo18387id = 12) String str6, @C4396e(mo18387id = 13) long j4, @C4396e(mo18387id = 14) long j5, @C4396e(mo18387id = 15) int i, @C4396e(mo18387id = 16) boolean z3, @C4396e(mo18387id = 17) boolean z4, @C4396e(mo18387id = 18) boolean z5, @C4396e(mo18387id = 19) String str7, @C4396e(mo18387id = 21) Boolean bool, @C4396e(mo18387id = 22) long j6, @C4396e(mo18387id = 23) List<String> list) {
        this.f15709a = str;
        this.f15711b = str2;
        this.f15696N = str3;
        this.f15703U = j3;
        this.f15697O = str4;
        this.f15698P = j;
        this.f15699Q = j2;
        this.f15700R = str5;
        this.f15701S = z;
        this.f15702T = z2;
        this.f15704V = str6;
        this.f15705W = j4;
        this.f15706X = j5;
        this.f15707Y = i;
        this.f15708Z = z3;
        this.f15710a0 = z4;
        this.f15712b0 = z5;
        this.f15713c0 = str7;
        this.f15714d0 = bool;
        this.f15715e0 = j6;
        this.f15716f0 = list;
    }
}
