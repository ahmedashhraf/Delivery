package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;

@C4056a
@C4392a(creator = "FavaDiagnosticsEntityCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @C4056a
    public static final Creator<FavaDiagnosticsEntity> CREATOR = new C4442a();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private final int f13610N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13611a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final String f13612b;

    @C4393b
    public FavaDiagnosticsEntity(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) int i2) {
        this.f13611a = i;
        this.f13612b = str;
        this.f13610N = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13611a);
        C4399a.m18979a(parcel, 2, this.f13612b, false);
        C4399a.m18964a(parcel, 3, this.f13610N);
        C4399a.m18959a(parcel, a);
    }

    @C4056a
    public FavaDiagnosticsEntity(String str, int i) {
        this.f13611a = 1;
        this.f13612b = str;
        this.f13610N = i;
    }
}
