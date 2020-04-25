package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Patterns;
import com.google.android.gms.common.annotation.C4058c;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

@C4392a(creator = "ProxyRequestCreator")
@C4058c
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyRequest> CREATOR = new C3981c();

    /* renamed from: R */
    public static final int f12574R = 2;

    /* renamed from: S */
    public static final int f12575S = 0;

    /* renamed from: T */
    public static final int f12576T = 1;

    /* renamed from: U */
    public static final int f12577U = 2;

    /* renamed from: V */
    public static final int f12578V = 3;

    /* renamed from: W */
    public static final int f12579W = 4;

    /* renamed from: X */
    public static final int f12580X = 5;

    /* renamed from: Y */
    public static final int f12581Y = 6;

    /* renamed from: Z */
    public static final int f12582Z = 7;

    /* renamed from: a0 */
    public static final int f12583a0 = 7;
    @C4394c(mo18384id = 2)

    /* renamed from: N */
    public final int f12584N;
    @C4394c(mo18384id = 3)

    /* renamed from: O */
    public final long f12585O;
    @C4394c(mo18384id = 4)

    /* renamed from: P */
    public final byte[] f12586P;
    @C4394c(mo18384id = 5)

    /* renamed from: Q */
    private Bundle f12587Q;
    @C4398g(mo18390id = 1000)

    /* renamed from: a */
    private final int f12588a;
    @C4394c(mo18384id = 1)

    /* renamed from: b */
    public final String f12589b;

    @C4058c
    /* renamed from: com.google.android.gms.auth.api.proxy.ProxyRequest$a */
    public static class C3976a {

        /* renamed from: a */
        private String f12590a;

        /* renamed from: b */
        private int f12591b = ProxyRequest.f12575S;

        /* renamed from: c */
        private long f12592c = 3000;

        /* renamed from: d */
        private byte[] f12593d = null;

        /* renamed from: e */
        private Bundle f12594e = new Bundle();

        public C3976a(String str) {
            C4300a0.m18630b(str);
            if (Patterns.WEB_URL.matcher(str).matches()) {
                this.f12590a = str;
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
            sb.append("The supplied url [ ");
            sb.append(str);
            sb.append("] is not match Patterns.WEB_URL!");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public C3976a mo17428a(int i) {
            C4300a0.m18628a(i >= 0 && i <= ProxyRequest.f12583a0, (Object) "Unrecognized http method code.");
            this.f12591b = i;
            return this;
        }

        /* renamed from: a */
        public C3976a mo17429a(long j) {
            C4300a0.m18628a(j >= 0, (Object) "The specified timeout must be non-negative.");
            this.f12592c = j;
            return this;
        }

        /* renamed from: a */
        public C3976a mo17430a(String str, String str2) {
            C4300a0.m18622a(str, (Object) "Header name cannot be null or empty!");
            Bundle bundle = this.f12594e;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public C3976a mo17431a(byte[] bArr) {
            this.f12593d = bArr;
            return this;
        }

        /* renamed from: a */
        public ProxyRequest mo17432a() {
            if (this.f12593d == null) {
                this.f12593d = new byte[0];
            }
            ProxyRequest proxyRequest = new ProxyRequest(2, this.f12590a, this.f12591b, this.f12592c, this.f12593d, this.f12594e);
            return proxyRequest;
        }
    }

    @C4393b
    ProxyRequest(@C4396e(mo18387id = 1000) int i, @C4396e(mo18387id = 1) String str, @C4396e(mo18387id = 2) int i2, @C4396e(mo18387id = 3) long j, @C4396e(mo18387id = 4) byte[] bArr, @C4396e(mo18387id = 5) Bundle bundle) {
        this.f12588a = i;
        this.f12589b = str;
        this.f12584N = i2;
        this.f12585O = j;
        this.f12586P = bArr;
        this.f12587Q = bundle;
    }

    /* renamed from: N */
    public Map<String, String> mo17425N() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.f12587Q.size());
        for (String str : this.f12587Q.keySet()) {
            linkedHashMap.put(str, this.f12587Q.getString(str));
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public String toString() {
        String str = this.f12589b;
        int i = this.f12584N;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18979a(parcel, 1, this.f12589b, false);
        C4399a.m18964a(parcel, 2, this.f12584N);
        C4399a.m18965a(parcel, 3, this.f12585O);
        C4399a.m18985a(parcel, 4, this.f12586P, false);
        C4399a.m18966a(parcel, 5, this.f12587Q, false);
        C4399a.m18964a(parcel, 1000, this.f12588a);
        C4399a.m18959a(parcel, a);
    }
}
