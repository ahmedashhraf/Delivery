package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender.SendIntentException;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.util.C4476d0;

@C4056a
@C4392a(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements C4246q, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C4255z();
    @C4056a
    @C4476d0

    /* renamed from: P */
    public static final Status f12780P = new Status(0);
    @C4056a

    /* renamed from: Q */
    public static final Status f12781Q = new Status(14);
    @C4056a

    /* renamed from: R */
    public static final Status f12782R = new Status(8);
    @C4056a

    /* renamed from: S */
    public static final Status f12783S = new Status(15);
    @C4056a

    /* renamed from: T */
    public static final Status f12784T = new Status(16);

    /* renamed from: U */
    private static final Status f12785U = new Status(17);
    @C4056a

    /* renamed from: V */
    public static final Status f12786V = new Status(18);
    @C0195i0
    @C4394c(getter = "getStatusMessage", mo18384id = 2)

    /* renamed from: N */
    private final String f12787N;
    @C0195i0
    @C4394c(getter = "getPendingIntent", mo18384id = 3)

    /* renamed from: O */
    private final PendingIntent f12788O;
    @C4398g(mo18390id = 1000)

    /* renamed from: a */
    private final int f12789a;
    @C4394c(getter = "getStatusCode", mo18384id = 1)

    /* renamed from: b */
    private final int f12790b;

    @C4056a
    @C4393b
    Status(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) int i2, @C4396e(mo18387id = 2) @C0195i0 String str, @C4396e(mo18387id = 3) @C0195i0 PendingIntent pendingIntent) {
        this.f12789a = i;
        this.f12790b = i2;
        this.f12787N = str;
        this.f12788O = pendingIntent;
    }

    /* renamed from: N */
    public final PendingIntent mo17611N() {
        return this.f12788O;
    }

    /* renamed from: O */
    public final int mo17612O() {
        return this.f12790b;
    }

    @C0195i0
    /* renamed from: P */
    public final String mo17613P() {
        return this.f12787N;
    }

    @C4476d0
    /* renamed from: Q */
    public final boolean mo17614Q() {
        return this.f12788O != null;
    }

    /* renamed from: R */
    public final boolean mo17615R() {
        return this.f12790b == 16;
    }

    /* renamed from: S */
    public final boolean mo17616S() {
        return this.f12790b == 14;
    }

    /* renamed from: T */
    public final boolean mo17617T() {
        return this.f12790b <= 0;
    }

    /* renamed from: a */
    public final void mo17618a(Activity activity, int i) throws SendIntentException {
        if (mo17614Q()) {
            activity.startIntentSenderForResult(this.f12788O.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f12789a != status.f12789a || this.f12790b != status.f12790b || !C4413y.m19053a(this.f12787N, status.f12787N) || !C4413y.m19053a(this.f12788O, status.f12788O)) {
            return false;
        }
        return true;
    }

    @C4056a
    /* renamed from: f */
    public final Status mo17504f() {
        return this;
    }

    public final int hashCode() {
        return C4413y.m19051a(Integer.valueOf(this.f12789a), Integer.valueOf(this.f12790b), this.f12787N, this.f12788O);
    }

    public final String toString() {
        return C4413y.m19052a((Object) this).mo18403a("statusCode", zzg()).mo18403a("resolution", this.f12788O).toString();
    }

    @C4056a
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, mo17612O());
        C4399a.m18979a(parcel, 2, mo17613P(), false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f12788O, i, false);
        C4399a.m18964a(parcel, 1000, this.f12789a);
        C4399a.m18959a(parcel, a);
    }

    public final String zzg() {
        String str = this.f12787N;
        if (str != null) {
            return str;
        }
        return C4081f.m17592a(this.f12790b);
    }

    @C4056a
    public Status(int i) {
        this(i, null);
    }

    @C4056a
    public Status(int i, @C0195i0 String str) {
        this(1, i, str, null);
    }

    @C4056a
    public Status(int i, @C0195i0 String str, @C0195i0 PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }
}
