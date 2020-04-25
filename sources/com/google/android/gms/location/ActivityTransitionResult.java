package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "ActivityTransitionResultCreator")
@C4397f({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionResult> CREATOR = new C5137j0();
    @C4394c(getter = "getTransitionEvents", mo18384id = 1)

    /* renamed from: a */
    private final List<ActivityTransitionEvent> f14694a;

    @C4393b
    public ActivityTransitionResult(@C4396e(mo18387id = 1) List<ActivityTransitionEvent> list) {
        C4300a0.m18621a(list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C4300a0.m18627a(((ActivityTransitionEvent) list.get(i)).mo19987O() >= ((ActivityTransitionEvent) list.get(i + -1)).mo19987O());
            }
        }
        this.f14694a = Collections.unmodifiableList(list);
    }

    @C0195i0
    /* renamed from: a */
    public static ActivityTransitionResult m22296a(Intent intent) {
        if (!m22297b(intent)) {
            return null;
        }
        return (ActivityTransitionResult) C4400b.m19018a(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    /* renamed from: b */
    public static boolean m22297b(@C0195i0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    /* renamed from: N */
    public List<ActivityTransitionEvent> mo19998N() {
        return this.f14694a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ActivityTransitionResult.class != obj.getClass()) {
            return false;
        }
        return this.f14694a.equals(((ActivityTransitionResult) obj).f14694a);
    }

    public int hashCode() {
        return this.f14694a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, mo19998N(), false);
        C4399a.m18959a(parcel, a);
    }
}
