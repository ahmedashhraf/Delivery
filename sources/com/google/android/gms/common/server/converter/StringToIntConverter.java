package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.C4446a;
import java.util.ArrayList;
import java.util.HashMap;

@C4392a(creator = "StringToIntConverterCreator")
@C4056a
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class StringToIntConverter extends AbstractSafeParcelable implements C4446a<String, Integer> {
    public static final Creator<StringToIntConverter> CREATOR = new C4445c();

    /* renamed from: N */
    private final SparseArray<String> f13613N;
    @C4394c(getter = "getSerializedMap", mo18384id = 2)

    /* renamed from: O */
    private final ArrayList<zaa> f13614O;
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f13615a;

    /* renamed from: b */
    private final HashMap<String, Integer> f13616b;

    @C4392a(creator = "StringToIntConverterEntryCreator")
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class zaa extends AbstractSafeParcelable {
        public static final Creator<zaa> CREATOR = new C4444b();
        @C4394c(mo18384id = 3)

        /* renamed from: N */
        final int f13617N;
        @C4398g(mo18390id = 1)

        /* renamed from: a */
        private final int f13618a;
        @C4394c(mo18384id = 2)

        /* renamed from: b */
        final String f13619b;

        @C4393b
        zaa(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) int i2) {
            this.f13618a = i;
            this.f13619b = str;
            this.f13617N = i2;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C4399a.m18958a(parcel);
            C4399a.m18964a(parcel, 1, this.f13618a);
            C4399a.m18979a(parcel, 2, this.f13619b, false);
            C4399a.m18964a(parcel, 3, this.f13617N);
            C4399a.m18959a(parcel, a);
        }

        zaa(String str, int i) {
            this.f13618a = 1;
            this.f13619b = str;
            this.f13617N = i;
        }
    }

    @C4393b
    StringToIntConverter(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ArrayList<zaa> arrayList) {
        this.f13615a = i;
        this.f13616b = new HashMap<>();
        this.f13613N = new SparseArray<>();
        this.f13614O = null;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            mo18459a(zaa2.f13619b, zaa2.f13617N);
        }
    }

    /* renamed from: K */
    public final int mo18457K() {
        return 7;
    }

    /* renamed from: L */
    public final int mo18458L() {
        return 0;
    }

    @C4056a
    /* renamed from: a */
    public final StringToIntConverter mo18459a(String str, int i) {
        this.f13616b.put(str, Integer.valueOf(i));
        this.f13613N.put(i, str);
        return this;
    }

    public final /* synthetic */ Object convert(Object obj) {
        Integer num = (Integer) this.f13616b.get((String) obj);
        return num == null ? (Integer) this.f13616b.get("gms_unknown") : num;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13615a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f13616b.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.f13616b.get(str)).intValue()));
        }
        C4399a.m19017j(parcel, 2, arrayList, false);
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo18460a(Object obj) {
        String str = (String) this.f13613N.get(((Integer) obj).intValue());
        if (str == null) {
            String str2 = "gms_unknown";
            if (this.f13616b.containsKey(str2)) {
                return str2;
            }
        }
        return str;
    }

    @C4056a
    public StringToIntConverter() {
        this.f13615a = 1;
        this.f13616b = new HashMap<>();
        this.f13613N = new SparseArray<>();
        this.f13614O = null;
    }
}
