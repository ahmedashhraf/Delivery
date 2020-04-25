package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4375p.C4376a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4056a
@C4392a(creator = "GetServiceRequestCreator")
@C4397f({9})
public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C4310c1();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private int f13348N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    String f13349O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    IBinder f13350P;
    @C4394c(mo18384id = 6)

    /* renamed from: Q */
    Scope[] f13351Q;
    @C4394c(mo18384id = 7)

    /* renamed from: R */
    Bundle f13352R;
    @C4394c(mo18384id = 8)

    /* renamed from: S */
    Account f13353S;
    @C4394c(mo18384id = 10)

    /* renamed from: T */
    Feature[] f13354T;
    @C4394c(mo18384id = 11)

    /* renamed from: U */
    Feature[] f13355U;
    @C4394c(mo18384id = 12)

    /* renamed from: V */
    private boolean f13356V;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13357a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final int f13358b;

    public GetServiceRequest(int i) {
        this.f13357a = 4;
        this.f13348N = C4282f.f13284a;
        this.f13358b = i;
        this.f13356V = true;
    }

    @C4056a
    /* renamed from: N */
    public Bundle mo18185N() {
        return this.f13352R;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13357a);
        C4399a.m18964a(parcel, 2, this.f13358b);
        C4399a.m18964a(parcel, 3, this.f13348N);
        C4399a.m18979a(parcel, 4, this.f13349O, false);
        C4399a.m18967a(parcel, 5, this.f13350P, false);
        C4399a.m18993a(parcel, 6, (T[]) this.f13351Q, i, false);
        C4399a.m18966a(parcel, 7, this.f13352R, false);
        C4399a.m18969a(parcel, 8, (Parcelable) this.f13353S, i, false);
        C4399a.m18993a(parcel, 10, (T[]) this.f13354T, i, false);
        C4399a.m18993a(parcel, 11, (T[]) this.f13355U, i, false);
        C4399a.m18984a(parcel, 12, this.f13356V);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    GetServiceRequest(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) int i3, @C4396e(mo18387id = 4) String str, @C4396e(mo18387id = 5) IBinder iBinder, @C4396e(mo18387id = 6) Scope[] scopeArr, @C4396e(mo18387id = 7) Bundle bundle, @C4396e(mo18387id = 8) Account account, @C4396e(mo18387id = 10) Feature[] featureArr, @C4396e(mo18387id = 11) Feature[] featureArr2, @C4396e(mo18387id = 12) boolean z) {
        this.f13357a = i;
        this.f13358b = i2;
        this.f13348N = i3;
        String str2 = "com.google.android.gms";
        if (str2.equals(str)) {
            this.f13349O = str2;
        } else {
            this.f13349O = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C4299a.m18614a(C4376a.m18877a(iBinder));
            }
            this.f13353S = account2;
        } else {
            this.f13350P = iBinder;
            this.f13353S = account;
        }
        this.f13351Q = scopeArr;
        this.f13352R = bundle;
        this.f13354T = featureArr;
        this.f13355U = featureArr2;
        this.f13356V = z;
    }
}
