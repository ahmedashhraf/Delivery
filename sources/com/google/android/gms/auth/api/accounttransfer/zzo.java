package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import com.mrsool.utils.C11644i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Failed;

@C4392a(creator = "AccountTransferProgressCreator")
public class zzo extends zzaz {
    public static final Creator<zzo> CREATOR = new C3940r();

    /* renamed from: S */
    private static final C0635a<String, Field<?, ?>> f12468S;
    @C4394c(getter = "getRegisteredAccountTypes", mo18384id = 2)

    /* renamed from: N */
    private List<String> f12469N;
    @C4394c(getter = "getInProgressAccountTypes", mo18384id = 3)

    /* renamed from: O */
    private List<String> f12470O;
    @C4394c(getter = "getSuccessAccountTypes", mo18384id = 4)

    /* renamed from: P */
    private List<String> f12471P;
    @C4394c(getter = "getFailedAccountTypes", mo18384id = 5)

    /* renamed from: Q */
    private List<String> f12472Q;
    @C4394c(getter = "getEscrowedAccountTypes", mo18384id = 6)

    /* renamed from: R */
    private List<String> f12473R;
    @C4398g(mo18390id = 1)

    /* renamed from: b */
    private final int f12474b;

    static {
        C0635a<String, Field<?, ?>> aVar = new C0635a<>();
        f12468S = aVar;
        String str = "registered";
        aVar.put(str, Field.m19181i(str, 2));
        C0635a<String, Field<?, ?>> aVar2 = f12468S;
        String str2 = C11644i.f33334j3;
        aVar2.put(str2, Field.m19181i(str2, 3));
        String str3 = "success";
        f12468S.put(str3, Field.m19181i(str3, 4));
        C0635a<String, Field<?, ?>> aVar3 = f12468S;
        String str4 = Failed.ELEMENT;
        aVar3.put(str4, Field.m19181i(str4, 5));
        String str5 = "escrowed";
        f12468S.put(str5, Field.m19181i(str5, 6));
    }

    public zzo() {
        this.f12474b = 1;
    }

    /* renamed from: N0 */
    public Map<String, Field<?, ?>> mo17325N0() {
        return f12468S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo17326a(Field field) {
        switch (field.mo18507N()) {
            case 1:
                return Integer.valueOf(this.f12474b);
            case 2:
                return this.f12469N;
            case 3:
                return this.f12470O;
            case 4:
                return this.f12471P;
            case 5:
                return this.f12472Q;
            case 6:
                return this.f12473R;
            default:
                int N = field.mo18507N();
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(N);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo17331b(Field<?, ?> field, String str, ArrayList<String> arrayList) {
        int N = field.mo18507N();
        if (N == 2) {
            this.f12469N = arrayList;
        } else if (N == 3) {
            this.f12470O = arrayList;
        } else if (N == 4) {
            this.f12471P = arrayList;
        } else if (N == 5) {
            this.f12472Q = arrayList;
        } else if (N == 6) {
            this.f12473R = arrayList;
        } else {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(N)}));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo17329b(Field field) {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12474b);
        C4399a.m19016i(parcel, 2, this.f12469N, false);
        C4399a.m19016i(parcel, 3, this.f12470O, false);
        C4399a.m19016i(parcel, 4, this.f12471P, false);
        C4399a.m19016i(parcel, 5, this.f12472Q, false);
        C4399a.m19016i(parcel, 6, this.f12473R, false);
        C4399a.m18959a(parcel, a);
    }

    @C4393b
    zzo(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) @C0195i0 List<String> list, @C4396e(mo18387id = 3) @C0195i0 List<String> list2, @C4396e(mo18387id = 4) @C0195i0 List<String> list3, @C4396e(mo18387id = 5) @C0195i0 List<String> list4, @C4396e(mo18387id = 6) @C0195i0 List<String> list5) {
        this.f12474b = i;
        this.f12469N = list;
        this.f12470O = list2;
        this.f12471P = list3;
        this.f12472Q = list4;
        this.f12473R = list5;
    }
}
