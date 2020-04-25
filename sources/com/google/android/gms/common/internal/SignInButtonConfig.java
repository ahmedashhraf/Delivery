package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4392a(creator = "SignInButtonConfigCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Creator<SignInButtonConfig> CREATOR = new C4419z0();
    @C4394c(getter = "getColorScheme", mo18384id = 3)

    /* renamed from: N */
    private final int f13377N;
    @Deprecated
    @C4394c(getter = "getScopes", mo18384id = 4)

    /* renamed from: O */
    private final Scope[] f13378O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13379a;
    @C4394c(getter = "getButtonSize", mo18384id = 2)

    /* renamed from: b */
    private final int f13380b;

    @C4393b
    SignInButtonConfig(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) int i3, @C4396e(mo18387id = 4) Scope[] scopeArr) {
        this.f13379a = i;
        this.f13380b = i2;
        this.f13377N = i3;
        this.f13378O = scopeArr;
    }

    /* renamed from: N */
    public int mo18214N() {
        return this.f13380b;
    }

    /* renamed from: O */
    public int mo18215O() {
        return this.f13377N;
    }

    @Deprecated
    /* renamed from: P */
    public Scope[] mo18216P() {
        return this.f13378O;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13379a);
        C4399a.m18964a(parcel, 2, mo18214N());
        C4399a.m18964a(parcel, 3, mo18215O());
        C4399a.m18993a(parcel, 4, (T[]) mo18216P(), i, false);
        C4399a.m18959a(parcel, a);
    }

    public SignInButtonConfig(int i, int i2, Scope[] scopeArr) {
        this(1, i, i2, null);
    }
}
