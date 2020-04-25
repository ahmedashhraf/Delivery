package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4375p.C4376a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p201f.p202a.C5952h;

@C4392a(creator = "AuthAccountRequestCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C4364l0();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final Scope[] f13335N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    private Integer f13336O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    private Integer f13337P;
    @C4394c(mo18384id = 6, type = "android.accounts.Account")

    /* renamed from: Q */
    private Account f13338Q;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13339a;
    @Deprecated
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final IBinder f13340b;

    @C4393b
    AuthAccountRequest(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) IBinder iBinder, @C4396e(mo18387id = 3) Scope[] scopeArr, @C4396e(mo18387id = 4) Integer num, @C4396e(mo18387id = 5) Integer num2, @C4396e(mo18387id = 6) Account account) {
        this.f13339a = i;
        this.f13340b = iBinder;
        this.f13335N = scopeArr;
        this.f13336O = num;
        this.f13337P = num2;
        this.f13338Q = account;
    }

    @C5952h
    /* renamed from: N */
    public Integer mo18169N() {
        return this.f13336O;
    }

    @C5952h
    /* renamed from: O */
    public Integer mo18170O() {
        return this.f13337P;
    }

    /* renamed from: P */
    public Set<Scope> mo18171P() {
        return new HashSet(Arrays.asList(this.f13335N));
    }

    /* renamed from: a */
    public AuthAccountRequest mo18172a(@C5952h Integer num) {
        this.f13336O = num;
        return this;
    }

    /* renamed from: b */
    public AuthAccountRequest mo18173b(@C5952h Integer num) {
        this.f13337P = num;
        return this;
    }

    /* renamed from: e */
    public Account mo18174e() {
        Account account = this.f13338Q;
        if (account != null) {
            return account;
        }
        IBinder iBinder = this.f13340b;
        if (iBinder != null) {
            return C4299a.m18614a(C4376a.m18877a(iBinder));
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13339a);
        C4399a.m18967a(parcel, 2, this.f13340b, false);
        C4399a.m18993a(parcel, 3, (T[]) this.f13335N, i, false);
        C4399a.m18977a(parcel, 4, this.f13336O, false);
        C4399a.m18977a(parcel, 5, this.f13337P, false);
        C4399a.m18969a(parcel, 6, (Parcelable) this.f13338Q, i, false);
        C4399a.m18959a(parcel, a);
    }

    @Deprecated
    public AuthAccountRequest(C4375p pVar, Set<Scope> set) {
        this(3, pVar.asBinder(), (Scope[]) set.toArray(new Scope[set.size()]), null, null, null);
    }

    public AuthAccountRequest(Account account, Set<Scope> set) {
        this(3, null, (Scope[]) set.toArray(new Scope[set.size()]), null, null, (Account) C4300a0.m18620a(account));
    }
}
