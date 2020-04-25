package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "AccountChangeEventsRequestCreator")
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new C4039f();
    @Deprecated
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private String f12399N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    private Account f12400O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12401a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private int f12402b;

    @C4393b
    AccountChangeEventsRequest(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) Account account) {
        this.f12401a = i;
        this.f12402b = i2;
        this.f12399N = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f12400O = account;
        } else {
            this.f12400O = new Account(str, "com.google");
        }
    }

    @Deprecated
    /* renamed from: N */
    public String mo17281N() {
        return this.f12399N;
    }

    /* renamed from: O */
    public int mo17282O() {
        return this.f12402b;
    }

    /* renamed from: a */
    public AccountChangeEventsRequest mo17283a(Account account) {
        this.f12400O = account;
        return this;
    }

    @Deprecated
    /* renamed from: c */
    public AccountChangeEventsRequest mo17284c(String str) {
        this.f12399N = str;
        return this;
    }

    /* renamed from: e */
    public Account mo17285e() {
        return this.f12400O;
    }

    /* renamed from: g */
    public AccountChangeEventsRequest mo17286g(int i) {
        this.f12402b = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12401a);
        C4399a.m18964a(parcel, 2, this.f12402b);
        C4399a.m18979a(parcel, 3, this.f12399N, false);
        C4399a.m18969a(parcel, 4, (Parcelable) this.f12400O, i, false);
        C4399a.m18959a(parcel, a);
    }

    public AccountChangeEventsRequest() {
        this.f12401a = 1;
    }
}
