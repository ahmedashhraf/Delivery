package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4395d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@C4392a(creator = "AuthenticatorAnnotatedDataCreator")
public class zzr extends zzaz {
    public static final Creator<zzr> CREATOR = new C3942t();

    /* renamed from: S */
    private static final HashMap<String, Field<?, ?>> f12475S;
    @C4398g(mo18390id = 1)

    /* renamed from: N */
    private final int f12476N;
    @C4394c(getter = "getInfo", mo18384id = 2)

    /* renamed from: O */
    private zzt f12477O;
    @C4394c(getter = "getSignature", mo18384id = 3)

    /* renamed from: P */
    private String f12478P;
    @C4394c(getter = "getPackageName", mo18384id = 4)

    /* renamed from: Q */
    private String f12479Q;
    @C4394c(getter = "getId", mo18384id = 5)

    /* renamed from: R */
    private String f12480R;
    @C4395d

    /* renamed from: b */
    private final Set<Integer> f12481b;

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f12475S = hashMap;
        String str = "authenticatorInfo";
        hashMap.put(str, Field.m19171a(str, 2, zzt.class));
        String str2 = "signature";
        f12475S.put(str2, Field.m19179g(str2, 3));
        String str3 = "package";
        f12475S.put(str3, Field.m19179g(str3, 4));
    }

    public zzr() {
        this.f12481b = new HashSet(3);
        this.f12476N = 1;
    }

    /* renamed from: N0 */
    public /* synthetic */ Map mo17325N0() {
        return f12475S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo17326a(Field field) {
        int N = field.mo18507N();
        if (N == 1) {
            return Integer.valueOf(this.f12476N);
        }
        if (N == 2) {
            return this.f12477O;
        }
        if (N == 3) {
            return this.f12478P;
        }
        if (N == 4) {
            return this.f12479Q;
        }
        int N2 = field.mo18507N();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(N2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo17329b(Field field) {
        return this.f12481b.contains(Integer.valueOf(field.mo18507N()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        Set<Integer> set = this.f12481b;
        if (set.contains(Integer.valueOf(1))) {
            C4399a.m18964a(parcel, 1, this.f12476N);
        }
        if (set.contains(Integer.valueOf(2))) {
            C4399a.m18969a(parcel, 2, (Parcelable) this.f12477O, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C4399a.m18979a(parcel, 3, this.f12478P, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C4399a.m18979a(parcel, 4, this.f12479Q, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C4399a.m18979a(parcel, 5, this.f12480R, true);
        }
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzr(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) zzt zzt, @C4396e(mo18387id = 3) String str, @C4396e(mo18387id = 4) String str2, @C4396e(mo18387id = 5) String str3) {
        this.f12481b = set;
        this.f12476N = i;
        this.f12477O = zzt;
        this.f12478P = str;
        this.f12479Q = str2;
        this.f12480R = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17333a(Field<?, ?> field, String str, String str2) {
        int N = field.mo18507N();
        if (N == 3) {
            this.f12478P = str2;
        } else if (N == 4) {
            this.f12479Q = str2;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(N)}));
        }
        this.f12481b.add(Integer.valueOf(N));
    }

    /* renamed from: a */
    public <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
        int N = field.mo18507N();
        if (N == 2) {
            this.f12477O = (zzt) t;
            this.f12481b.add(Integer.valueOf(N));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(N), t.getClass().getCanonicalName()}));
    }
}
