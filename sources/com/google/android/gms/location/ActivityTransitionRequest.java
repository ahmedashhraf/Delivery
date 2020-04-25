package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

@C4392a(creator = "ActivityTransitionRequestCreator")
@C4397f({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionRequest> CREATOR = new C5135i0();

    /* renamed from: O */
    public static final Comparator<ActivityTransition> f14690O = new C5133h0();
    @C4394c(getter = "getClients", mo18384id = 3)

    /* renamed from: N */
    private final List<ClientIdentity> f14691N;
    @C4394c(getter = "getActivityTransitions", mo18384id = 1)

    /* renamed from: a */
    private final List<ActivityTransition> f14692a;
    @C0195i0
    @C4394c(getter = "getTag", mo18384id = 2)

    /* renamed from: b */
    private final String f14693b;

    public ActivityTransitionRequest(List<ActivityTransition> list) {
        this(list, null, null);
    }

    @C4393b
    public ActivityTransitionRequest(@C4396e(mo18387id = 1) List<ActivityTransition> list, @C4396e(mo18387id = 2) @C0195i0 String str, @C4396e(mo18387id = 3) @C0195i0 List<ClientIdentity> list2) {
        C4300a0.m18621a(list, (Object) "transitions can't be null");
        C4300a0.m18628a(list.size() > 0, (Object) "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f14690O);
        for (ActivityTransition activityTransition : list) {
            C4300a0.m18628a(treeSet.add(activityTransition), (Object) String.format("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f14692a = Collections.unmodifiableList(list);
        this.f14693b = str;
        this.f14691N = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public void mo19993a(Intent intent) {
        C4400b.m19022a(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityTransitionRequest.class == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C4413y.m19053a(this.f14692a, activityTransitionRequest.f14692a) && C4413y.m19053a(this.f14693b, activityTransitionRequest.f14693b) && C4413y.m19053a(this.f14691N, activityTransitionRequest.f14691N);
        }
    }

    public int hashCode() {
        int hashCode = this.f14692a.hashCode() * 31;
        String str = this.f14693b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<ClientIdentity> list = this.f14691N;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f14692a);
        String str = this.f14693b;
        String valueOf2 = String.valueOf(this.f14691N);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, this.f14692a, false);
        C4399a.m18979a(parcel, 2, this.f14693b, false);
        C4399a.m19017j(parcel, 3, this.f14691N, false);
        C4399a.m18959a(parcel, a);
    }
}
