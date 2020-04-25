package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "AccountChangeEventCreator")
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEvent> CREATOR = new C4038e();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final String f12393N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    private final int f12394O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    private final int f12395P;
    @C4394c(mo18384id = 6)

    /* renamed from: Q */
    private final String f12396Q;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12397a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final long f12398b;

    @C4393b
    AccountChangeEvent(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) int i2, @C4396e(mo18387id = 5) int i3, @C4396e(mo18387id = 6) String str2) {
        this.f12397a = i;
        this.f12398b = j;
        this.f12393N = (String) C4300a0.m18620a(str);
        this.f12394O = i2;
        this.f12395P = i3;
        this.f12396Q = str2;
    }

    /* renamed from: N */
    public String mo17273N() {
        return this.f12393N;
    }

    /* renamed from: O */
    public String mo17274O() {
        return this.f12396Q;
    }

    /* renamed from: P */
    public int mo17275P() {
        return this.f12394O;
    }

    /* renamed from: Q */
    public int mo17276Q() {
        return this.f12395P;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AccountChangeEvent) {
            AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
            return this.f12397a == accountChangeEvent.f12397a && this.f12398b == accountChangeEvent.f12398b && C4413y.m19053a(this.f12393N, accountChangeEvent.f12393N) && this.f12394O == accountChangeEvent.f12394O && this.f12395P == accountChangeEvent.f12395P && C4413y.m19053a(this.f12396Q, accountChangeEvent.f12396Q);
        }
    }

    public int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f12397a), Long.valueOf(this.f12398b), this.f12393N, Integer.valueOf(this.f12394O), Integer.valueOf(this.f12395P), this.f12396Q);
    }

    public String toString() {
        int i = this.f12394O;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        String str2 = this.f12393N;
        String str3 = this.f12396Q;
        int i2 = this.f12395P;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12397a);
        C4399a.m18965a(parcel, 2, this.f12398b);
        C4399a.m18979a(parcel, 3, this.f12393N, false);
        C4399a.m18964a(parcel, 4, this.f12394O);
        C4399a.m18964a(parcel, 5, this.f12395P);
        C4399a.m18979a(parcel, 6, this.f12396Q, false);
        C4399a.m18959a(parcel, a);
    }

    public AccountChangeEvent(long j, String str, int i, int i2, String str2) {
        this.f12397a = 1;
        this.f12398b = j;
        this.f12393N = (String) C4300a0.m18620a(str);
        this.f12394O = i;
        this.f12395P = i2;
        this.f12396Q = str2;
    }
}
