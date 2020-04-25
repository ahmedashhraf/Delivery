package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "LocationSettingsRequestCreator")
@C4397f({1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Creator<LocationSettingsRequest> CREATOR = new C5170z();
    @C4394c(getter = "needBle", mo18384id = 3)

    /* renamed from: N */
    private final boolean f14737N;
    @C4394c(getter = "getConfiguration", mo18384id = 5)

    /* renamed from: O */
    private zzae f14738O;
    @C4394c(getter = "getLocationRequests", mo18384id = 1)

    /* renamed from: a */
    private final List<LocationRequest> f14739a;
    @C4394c(defaultValue = "false", getter = "alwaysShow", mo18384id = 2)

    /* renamed from: b */
    private final boolean f14740b;

    /* renamed from: com.google.android.gms.location.LocationSettingsRequest$a */
    public static final class C5112a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f14741a = new ArrayList<>();

        /* renamed from: b */
        private boolean f14742b = false;

        /* renamed from: c */
        private boolean f14743c = false;

        /* renamed from: d */
        private zzae f14744d = null;

        /* renamed from: a */
        public final C5112a mo20048a(@C0193h0 LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f14741a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: a */
        public final C5112a mo20049a(Collection<LocationRequest> collection) {
            for (LocationRequest locationRequest : collection) {
                if (locationRequest != null) {
                    this.f14741a.add(locationRequest);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C5112a mo20050a(boolean z) {
            this.f14742b = z;
            return this;
        }

        /* renamed from: a */
        public final LocationSettingsRequest mo20051a() {
            return new LocationSettingsRequest(this.f14741a, this.f14742b, this.f14743c, null);
        }

        /* renamed from: b */
        public final C5112a mo20052b(boolean z) {
            this.f14743c = z;
            return this;
        }
    }

    @C4393b
    LocationSettingsRequest(@C4396e(mo18387id = 1) List<LocationRequest> list, @C4396e(mo18387id = 2) boolean z, @C4396e(mo18387id = 3) boolean z2, @C4396e(mo18387id = 5) zzae zzae) {
        this.f14739a = list;
        this.f14740b = z;
        this.f14737N = z2;
        this.f14738O = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, Collections.unmodifiableList(this.f14739a), false);
        C4399a.m18984a(parcel, 2, this.f14740b);
        C4399a.m18984a(parcel, 3, this.f14737N);
        C4399a.m18969a(parcel, 5, (Parcelable) this.f14738O, i, false);
        C4399a.m18959a(parcel, a);
    }
}
