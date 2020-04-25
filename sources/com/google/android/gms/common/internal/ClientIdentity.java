package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;

@C4056a
@C4392a(creator = "ClientIdentityCreator")
@C4397f({1000})
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class ClientIdentity extends AbstractSafeParcelable {
    @C4056a
    public static final Creator<ClientIdentity> CREATOR = new C4367m0();
    @C4394c(defaultValueUnchecked = "0", mo18384id = 1)

    /* renamed from: a */
    private final int f13342a;
    @C0195i0
    @C4394c(defaultValueUnchecked = "null", mo18384id = 2)

    /* renamed from: b */
    private final String f13343b;

    @C4393b
    public ClientIdentity(@C4396e(mo18387id = 1) int i, @C4396e(mo18387id = 2) @C0195i0 String str) {
        this.f13342a = i;
        this.f13343b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof ClientIdentity)) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            return clientIdentity.f13342a == this.f13342a && C4413y.m19053a(clientIdentity.f13343b, this.f13343b);
        }
    }

    public int hashCode() {
        return this.f13342a;
    }

    public String toString() {
        int i = this.f13342a;
        String str = this.f13343b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m18964a(parcel, 1, this.f13342a);
        C4399a.m18979a(parcel, 2, this.f13343b, false);
        C4399a.m18959a(parcel, a);
    }
}
