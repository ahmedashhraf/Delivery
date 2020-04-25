package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "ResolveAccountRequestCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C4412x0();
    @C4394c(getter = "getSessionId", mo18384id = 3)

    /* renamed from: N */
    private final int f13368N;
    @C4394c(getter = "getSignInAccountHint", mo18384id = 4)

    /* renamed from: O */
    private final GoogleSignInAccount f13369O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13370a;
    @C4394c(getter = "getAccount", mo18384id = 2)

    /* renamed from: b */
    private final Account f13371b;

    @C4393b
    ResolveAccountRequest(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) Account account, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) GoogleSignInAccount googleSignInAccount) {
        this.f13370a = i;
        this.f13371b = account;
        this.f13368N = i2;
        this.f13369O = googleSignInAccount;
    }

    /* renamed from: N */
    public int mo18201N() {
        return this.f13368N;
    }

    @C0195i0
    /* renamed from: O */
    public GoogleSignInAccount mo18202O() {
        return this.f13369O;
    }

    /* renamed from: e */
    public Account mo18203e() {
        return this.f13371b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13370a);
        C4399a.m18969a(parcel, 2, (Parcelable) mo18203e(), i, false);
        C4399a.m18964a(parcel, 3, mo18201N());
        C4399a.m18969a(parcel, 4, (Parcelable) mo18202O(), i, false);
        C4399a.m18959a(parcel, a);
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
