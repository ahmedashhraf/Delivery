package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4398g;
import java.util.List;

@C4392a(creator = "AccountChangeEventsResponseCreator")
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new C4040g();
    @C4398g(mo18390id = 1)

    /* renamed from: a */
    private final int f12403a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private final List<AccountChangeEvent> f12404b;

    @C4393b
    AccountChangeEventsResponse(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) List<AccountChangeEvent> list) {
        this.f12403a = i;
        this.f12404b = (List) C4300a0.m18620a(list);
    }

    /* renamed from: N */
    public List<AccountChangeEvent> mo17288N() {
        return this.f12404b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f12403a);
        C4399a.m19017j(parcel, 2, this.f12404b, false);
        C4399a.m18959a(parcel, a);
    }

    public AccountChangeEventsResponse(List<AccountChangeEvent> list) {
        this.f12403a = 1;
        this.f12404b = (List) C4300a0.m18620a(list);
    }
}
