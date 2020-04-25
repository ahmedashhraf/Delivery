package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.C4446a;

@C4392a(creator = "ConverterWrapperCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zab extends AbstractSafeParcelable {
    public static final Creator<zab> CREATOR = new C4443a();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13620a;
    @C4394c(getter = "getStringToIntConverter", mo18384id = 2)

    /* renamed from: b */
    private final StringToIntConverter f13621b;

    @C4393b
    zab(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) StringToIntConverter stringToIntConverter) {
        this.f13620a = i;
        this.f13621b = stringToIntConverter;
    }

    /* renamed from: a */
    public static zab m19118a(C4446a<?, ?> aVar) {
        if (aVar instanceof StringToIntConverter) {
            return new zab((StringToIntConverter) aVar);
        }
        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    /* renamed from: N */
    public final C4446a<?, ?> mo18470N() {
        StringToIntConverter stringToIntConverter = this.f13621b;
        if (stringToIntConverter != null) {
            return stringToIntConverter;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13620a);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f13621b, i, false);
        C4399a.m18959a(parcel, a);
    }

    private zab(StringToIntConverter stringToIntConverter) {
        this.f13620a = 1;
        this.f13621b = stringToIntConverter;
    }
}
