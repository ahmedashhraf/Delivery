package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.collection.C0637b;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4395d;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@C4392a(creator = "AuthenticatorTransferInfoCreator")
public class zzt extends zzaz {
    public static final Creator<zzt> CREATOR = new C3943u();

    /* renamed from: T */
    private static final HashMap<String, Field<?, ?>> f12482T;
    @C4398g(mo18390id = 1)

    /* renamed from: N */
    private final int f12483N;
    @C4394c(getter = "getAccountType", mo18384id = 2)

    /* renamed from: O */
    private String f12484O;
    @C4394c(getter = "getStatus", mo18384id = 3)

    /* renamed from: P */
    private int f12485P;
    @C4394c(getter = "getTransferBytes", mo18384id = 4)

    /* renamed from: Q */
    private byte[] f12486Q;
    @C4394c(getter = "getPendingIntent", mo18384id = 5)

    /* renamed from: R */
    private PendingIntent f12487R;
    @C4394c(getter = "getDeviceMetaData", mo18384id = 6)

    /* renamed from: S */
    private DeviceMetaData f12488S;
    @C4395d

    /* renamed from: b */
    private final Set<Integer> f12489b;

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f12482T = hashMap;
        String str = "accountType";
        hashMap.put(str, Field.m19179g(str, 2));
        String str2 = "status";
        f12482T.put(str2, Field.m19177e(str2, 3));
        String str3 = "transferBytes";
        f12482T.put(str3, Field.m19169a(str3, 4));
    }

    @C4393b
    zzt(@C4395d Set<Integer> set, @C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) String str, @C4396e(mo18387id = 3) int i2, @C4396e(mo18387id = 4) byte[] bArr, @C4396e(mo18387id = 5) PendingIntent pendingIntent, @C4396e(mo18387id = 6) DeviceMetaData deviceMetaData) {
        this.f12489b = set;
        this.f12483N = i;
        this.f12484O = str;
        this.f12485P = i2;
        this.f12486Q = bArr;
        this.f12487R = pendingIntent;
        this.f12488S = deviceMetaData;
    }

    /* renamed from: N0 */
    public /* synthetic */ Map mo17325N0() {
        return f12482T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo17326a(Field field) {
        int N = field.mo18507N();
        if (N == 1) {
            return Integer.valueOf(this.f12483N);
        }
        if (N == 2) {
            return this.f12484O;
        }
        if (N == 3) {
            return Integer.valueOf(this.f12485P);
        }
        if (N == 4) {
            return this.f12486Q;
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
        return this.f12489b.contains(Integer.valueOf(field.mo18507N()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        Set<Integer> set = this.f12489b;
        if (set.contains(Integer.valueOf(1))) {
            C4399a.m18964a(parcel, 1, this.f12483N);
        }
        if (set.contains(Integer.valueOf(2))) {
            C4399a.m18979a(parcel, 2, this.f12484O, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C4399a.m18964a(parcel, 3, this.f12485P);
        }
        if (set.contains(Integer.valueOf(4))) {
            C4399a.m18985a(parcel, 4, this.f12486Q, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C4399a.m18969a(parcel, 5, (Parcelable) this.f12487R, i, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C4399a.m18969a(parcel, 6, (Parcelable) this.f12488S, i, true);
        }
        C4399a.m18959a(parcel, a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17333a(Field<?, ?> field, String str, String str2) {
        int N = field.mo18507N();
        if (N == 2) {
            this.f12484O = str2;
            this.f12489b.add(Integer.valueOf(N));
            return;
        }
        throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(N)}));
    }

    public zzt() {
        this.f12489b = new C0637b(3);
        this.f12483N = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17335a(Field<?, ?> field, String str, int i) {
        int N = field.mo18507N();
        if (N == 3) {
            this.f12485P = i;
            this.f12489b.add(Integer.valueOf(N));
            return;
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("Field with id=");
        sb.append(N);
        sb.append(" is not known to be an int.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17336a(Field<?, ?> field, String str, byte[] bArr) {
        int N = field.mo18507N();
        if (N == 4) {
            this.f12486Q = bArr;
            this.f12489b.add(Integer.valueOf(N));
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("Field with id=");
        sb.append(N);
        sb.append(" is not known to be an byte array.");
        throw new IllegalArgumentException(sb.toString());
    }
}
