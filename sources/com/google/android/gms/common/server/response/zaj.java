package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
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
import java.util.HashMap;
import java.util.Map;

@C4312d0
@C4392a(creator = "FieldMappingDictionaryCreator")
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class zaj extends AbstractSafeParcelable {
    public static final Creator<zaj> CREATOR = new C4459l();
    @C4394c(getter = "getSerializedDictionary", mo18384id = 2)

    /* renamed from: N */
    private final ArrayList<zam> f13660N;
    @C4394c(getter = "getRootClassName", mo18384id = 3)

    /* renamed from: O */
    private final String f13661O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13662a;

    /* renamed from: b */
    private final HashMap<String, Map<String, Field<?, ?>>> f13663b;

    @C4393b
    zaj(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ArrayList<zam> arrayList, @C4396e(mo18387id = 3) String str) {
        this.f13662a = i;
        this.f13660N = null;
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zam zam = (zam) arrayList.get(i2);
            String str2 = zam.f13669b;
            HashMap hashMap2 = new HashMap();
            int size2 = zam.f13667N.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zal zal = (zal) zam.f13667N.get(i3);
                hashMap2.put(zal.f13666b, zal.f13664N);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f13663b = hashMap;
        this.f13661O = (String) C4300a0.m18620a(str);
        mo18534N();
    }

    /* renamed from: N */
    public final void mo18534N() {
        for (String str : this.f13663b.keySet()) {
            Map map = (Map) this.f13663b.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).mo18513a(this);
            }
        }
    }

    /* renamed from: O */
    public final void mo18535O() {
        for (String str : this.f13663b.keySet()) {
            Map map = (Map) this.f13663b.get(str);
            HashMap hashMap = new HashMap();
            for (String str2 : map.keySet()) {
                hashMap.put(str2, ((Field) map.get(str2)).mo18508O());
            }
            this.f13663b.put(str, hashMap);
        }
    }

    /* renamed from: P */
    public final String mo18536P() {
        return this.f13661O;
    }

    /* renamed from: a */
    public final void mo18537a(Class<? extends FastJsonResponse> cls, Map<String, Field<?, ?>> map) {
        this.f13663b.put(cls.getCanonicalName(), map);
    }

    /* renamed from: c */
    public final Map<String, Field<?, ?>> mo18539c(String str) {
        return (Map) this.f13663b.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f13663b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f13663b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13662a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f13663b.keySet()) {
            arrayList.add(new zam(str, (Map) this.f13663b.get(str)));
        }
        C4399a.m19017j(parcel, 2, arrayList, false);
        C4399a.m18979a(parcel, 3, this.f13661O, false);
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo18538a(Class<? extends FastJsonResponse> cls) {
        return this.f13663b.containsKey(cls.getCanonicalName());
    }

    public zaj(Class<? extends FastJsonResponse> cls) {
        this.f13662a = 1;
        this.f13660N = null;
        this.f13663b = new HashMap<>();
        this.f13661O = cls.getCanonicalName();
    }
}
