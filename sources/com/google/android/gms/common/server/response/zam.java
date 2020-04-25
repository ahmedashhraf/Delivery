package com.google.android.gms.common.server.response;

import android.os.Parcel;
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
import java.util.ArrayList;
import java.util.Map;

@C4312d0
@C4392a(creator = "FieldMappingDictionaryEntryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Creator<zam> CREATOR = new C4458k();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    final ArrayList<zal> f13667N;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13668a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    final String f13669b;

    @C4393b
    zam(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) ArrayList<zal> arrayList) {
        this.f13668a = i;
        this.f13669b = str;
        this.f13667N = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13668a);
        C4399a.m18979a(parcel, 2, this.f13669b, false);
        C4399a.m19017j(parcel, 3, this.f13667N, false);
        C4399a.m18959a(parcel, a);
    }

    zam(String str, Map<String, Field<?, ?>> map) {
        ArrayList<zal> arrayList;
        this.f13668a = 1;
        this.f13669b = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zal(str2, (Field) map.get(str2)));
            }
        }
        this.f13667N = arrayList;
    }
}
