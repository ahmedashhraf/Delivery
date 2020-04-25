package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.core.app.C0770p;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@C4392a(creator = "AccountTransferMsgCreator")
public final class zzl extends zzaz {
    public static final Creator<zzl> CREATOR = new C3938p();

    /* renamed from: R */
    private static final HashMap<String, Field<?, ?>> f12462R;
    @C4398g(mo18390id = 1)

    /* renamed from: N */
    private final int f12463N;
    @C4394c(getter = "getAuthenticatorDatas", mo18384id = 2)

    /* renamed from: O */
    private ArrayList<zzr> f12464O;
    @C4394c(getter = "getRequestType", mo18384id = 3)

    /* renamed from: P */
    private int f12465P;
    @C4394c(getter = "getProgress", mo18384id = 4)

    /* renamed from: Q */
    private zzo f12466Q;
    @C4395d

    /* renamed from: b */
    private final Set<Integer> f12467b;

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f12462R = hashMap;
        String str = "authenticatorData";
        hashMap.put(str, Field.m19174b(str, 2, zzr.class));
        HashMap<String, Field<?, ?>> hashMap2 = f12462R;
        String str2 = C0770p.f3530j0;
        hashMap2.put(str2, Field.m19171a(str2, 4, zzo.class));
    }

    @C4393b
    zzl(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) ArrayList<zzr> arrayList, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) zzo zzo) {
        this.f12467b = set;
        this.f12463N = i;
        this.f12464O = arrayList;
        this.f12465P = i2;
        this.f12466Q = zzo;
    }

    /* renamed from: N0 */
    public final /* synthetic */ Map mo17325N0() {
        return f12462R;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo17326a(Field field) {
        int N = field.mo18507N();
        if (N == 1) {
            return Integer.valueOf(this.f12463N);
        }
        if (N == 2) {
            return this.f12464O;
        }
        if (N == 4) {
            return this.f12466Q;
        }
        int N2 = field.mo18507N();
        StringBuilder sb = new StringBuilder(37);
        sb.append("Unknown SafeParcelable id=");
        sb.append(N2);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo17329b(Field field) {
        return this.f12467b.contains(Integer.valueOf(field.mo18507N()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        Set<Integer> set = this.f12467b;
        if (set.contains(Integer.valueOf(1))) {
            C4399a.m18964a(parcel, 1, this.f12463N);
        }
        if (set.contains(Integer.valueOf(2))) {
            C4399a.m19017j(parcel, 2, this.f12464O, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C4399a.m18964a(parcel, 3, this.f12465P);
        }
        if (set.contains(Integer.valueOf(4))) {
            C4399a.m18969a(parcel, 4, (Parcelable) this.f12466Q, i, true);
        }
        C4399a.m18959a(parcel, a);
    }

    public zzl() {
        this.f12467b = new HashSet(1);
        this.f12463N = 1;
    }

    /* renamed from: a */
    public final <T extends FastJsonResponse> void mo17328a(Field<?, ?> field, String str, ArrayList<T> arrayList) {
        int N = field.mo18507N();
        if (N == 2) {
            this.f12464O = arrayList;
            this.f12467b.add(Integer.valueOf(N));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(N), arrayList.getClass().getCanonicalName()}));
    }

    /* renamed from: a */
    public final <T extends FastJsonResponse> void mo17327a(Field<?, ?> field, String str, T t) {
        int N = field.mo18507N();
        if (N == 4) {
            this.f12466Q = (zzo) t;
            this.f12467b.add(Integer.valueOf(N));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(N), t.getClass().getCanonicalName()}));
    }
}
