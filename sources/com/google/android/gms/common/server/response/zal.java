package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4312d0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

@C4312d0
@C4392a(creator = "FieldMapPairCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zal extends AbstractSafeParcelable {
    public static final Creator<zal> CREATOR = new C4457j();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    final Field<?, ?> f13664N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13665a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    final String f13666b;

    @C4393b
    zal(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) Field<?, ?> field) {
        this.f13665a = i;
        this.f13666b = str;
        this.f13664N = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13665a);
        C4399a.m18979a(parcel, 2, this.f13666b, false);
        C4399a.m18969a(parcel, 3, (Parcelable) this.f13664N, i, false);
        C4399a.m18959a(parcel, a);
    }

    zal(String str, Field<?, ?> field) {
        this.f13665a = 1;
        this.f13666b = str;
        this.f13664N = field;
    }
}
