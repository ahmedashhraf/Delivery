package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;
import java.util.List;

@C4392a(creator = "GeofencingRequestCreator")
@C4397f({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Creator<GeofencingRequest> CREATOR = new C5157s0();

    /* renamed from: O */
    public static final int f14709O = 1;

    /* renamed from: P */
    public static final int f14710P = 2;

    /* renamed from: Q */
    public static final int f14711Q = 4;
    @C4394c(defaultValue = "", getter = "getTag", mo18384id = 3)

    /* renamed from: N */
    private final String f14712N;
    @C4394c(getter = "getParcelableGeofences", mo18384id = 1)

    /* renamed from: a */
    private final List<zzbh> f14713a;
    @C4394c(getter = "getInitialTrigger", mo18384id = 2)

    /* renamed from: b */
    private final int f14714b;

    /* renamed from: com.google.android.gms.location.GeofencingRequest$a */
    public static final class C5111a {

        /* renamed from: a */
        private final List<zzbh> f14715a = new ArrayList();

        /* renamed from: b */
        private int f14716b = 5;

        /* renamed from: c */
        private String f14717c = "";

        /* renamed from: a */
        public final C5111a mo20012a(int i) {
            this.f14716b = i & 7;
            return this;
        }

        /* renamed from: a */
        public final C5111a mo20013a(C5127f fVar) {
            C4300a0.m18621a(fVar, (Object) "geofence can't be null.");
            C4300a0.m18628a(fVar instanceof zzbh, (Object) "Geofence must be created using Geofence.Builder.");
            this.f14715a.add((zzbh) fVar);
            return this;
        }

        /* renamed from: a */
        public final C5111a mo20014a(List<C5127f> list) {
            if (list != null && !list.isEmpty()) {
                for (C5127f fVar : list) {
                    if (fVar != null) {
                        mo20013a(fVar);
                    }
                }
            }
            return this;
        }

        /* renamed from: a */
        public final GeofencingRequest mo20015a() {
            C4300a0.m18628a(!this.f14715a.isEmpty(), (Object) "No geofence has been added to this request.");
            return new GeofencingRequest(this.f14715a, this.f14716b, this.f14717c);
        }
    }

    @C4393b
    GeofencingRequest(@C4396e(mo18387id = 1) List<zzbh> list, @C4396e(mo18387id = 2) int i, @C4396e(mo18387id = 3) String str) {
        this.f14713a = list;
        this.f14714b = i;
        this.f14712N = str;
    }

    /* renamed from: N */
    public List<C5127f> mo20008N() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f14713a);
        return arrayList;
    }

    /* renamed from: O */
    public int mo20009O() {
        return this.f14714b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.f14713a);
        int i = this.f14714b;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.f14712N);
        String str = "tag=";
        sb.append(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, this.f14713a, false);
        C4399a.m18964a(parcel, 2, mo20009O());
        C4399a.m18979a(parcel, 3, this.f14712N, false);
        C4399a.m18959a(parcel, a);
    }
}
