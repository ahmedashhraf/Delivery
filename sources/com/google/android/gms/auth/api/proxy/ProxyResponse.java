package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.C4058c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@C4392a(creator = "ProxyResponseCreator")
@C4058c
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Creator<ProxyResponse> CREATOR = new C3982d();

    /* renamed from: R */
    public static final int f12595R = -1;
    @C4394c(mo18384id = 2)

    /* renamed from: N */
    public final PendingIntent f12596N;
    @C4394c(mo18384id = 3)

    /* renamed from: O */
    public final int f12597O;
    @C4394c(mo18384id = 4)

    /* renamed from: P */
    private final Bundle f12598P;
    @C4394c(mo18384id = 5)

    /* renamed from: Q */
    public final byte[] f12599Q;
    @C4398g(mo18390id = 1000)

    /* renamed from: a */
    private final int f12600a;
    @C4394c(mo18384id = 1)

    /* renamed from: b */
    public final int f12601b;

    @C4393b
    ProxyResponse(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) int i2, @C4396e(mo18387id = 2) PendingIntent pendingIntent, @C4396e(mo18387id = 3) int i3, @C4396e(mo18387id = 4) Bundle bundle, @C4396e(mo18387id = 5) byte[] bArr) {
        this.f12600a = i;
        this.f12601b = i2;
        this.f12597O = i3;
        this.f12598P = bundle;
        this.f12599Q = bArr;
        this.f12596N = pendingIntent;
    }

    /* renamed from: a */
    public static ProxyResponse m17268a(int i, PendingIntent pendingIntent, int i2, Map<String, String> map, byte[] bArr) {
        ProxyResponse proxyResponse = new ProxyResponse(1, i, pendingIntent, i2, m17267a(map), bArr);
        return proxyResponse;
    }

    /* renamed from: N */
    public Map<String, String> mo17433N() {
        if (this.f12598P == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        for (String str : this.f12598P.keySet()) {
            hashMap.put(str, this.f12598P.getString(str));
        }
        return hashMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12601b);
        C4399a.m18969a(parcel, 2, (Parcelable) this.f12596N, i, false);
        C4399a.m18964a(parcel, 3, this.f12597O);
        C4399a.m18966a(parcel, 4, this.f12598P, false);
        C4399a.m18985a(parcel, 5, this.f12599Q, false);
        C4399a.m18964a(parcel, 1000, this.f12600a);
        C4399a.m18959a(parcel, a);
    }

    /* renamed from: a */
    private static Bundle m17267a(Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (map == null) {
            return bundle;
        }
        for (Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public ProxyResponse(int i, PendingIntent pendingIntent, int i2, Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    private ProxyResponse(int i, Bundle bundle, byte[] bArr) {
        this(1, 0, null, i, bundle, bArr);
    }

    public ProxyResponse(int i, Map<String, String> map, byte[] bArr) {
        this(i, m17267a(map), bArr);
    }
}
