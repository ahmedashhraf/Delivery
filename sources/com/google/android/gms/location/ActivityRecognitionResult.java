package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C4399a;
import com.google.android.gms.common.internal.safeparcel.C4400b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4392a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4393b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4394c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4396e;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.C4397f;
import com.google.android.gms.common.util.C4476d0;
import java.util.Collections;
import java.util.List;

@C4392a(creator = "ActivityRecognitionResultCreator")
@C4397f({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new C5126e0();
    @C4394c(mo18384id = 3)

    /* renamed from: N */
    private long f14676N;
    @C4394c(mo18384id = 4)

    /* renamed from: O */
    private int f14677O;
    @C4394c(mo18384id = 5)

    /* renamed from: P */
    private Bundle f14678P;
    @C4394c(mo18384id = 1)

    /* renamed from: a */
    private List<DetectedActivity> f14679a;
    @C4394c(mo18384id = 2)

    /* renamed from: b */
    private long f14680b;

    @C4476d0
    public ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2) {
        this(detectedActivity, j, j2, 0, (Bundle) null);
    }

    private ActivityRecognitionResult(DetectedActivity detectedActivity, long j, long j2, int i, Bundle bundle) {
        this(Collections.singletonList(detectedActivity), j, j2, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2) {
        this(list, j, j2, 0, (Bundle) null);
    }

    @C4393b
    public ActivityRecognitionResult(@C4396e(mo18387id = 1) List<DetectedActivity> list, @C4396e(mo18387id = 2) long j, @C4396e(mo18387id = 3) long j2, @C4396e(mo18387id = 4) int i, @C4396e(mo18387id = 5) Bundle bundle) {
        boolean z = true;
        C4300a0.m18628a(list != null && list.size() > 0, (Object) "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        C4300a0.m18628a(z, (Object) "Must set times");
        this.f14679a = list;
        this.f14680b = j;
        this.f14676N = j2;
        this.f14677O = i;
        this.f14678P = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0022, code lost:
        if ((r0 instanceof com.google.android.gms.location.ActivityRecognitionResult) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult m22277a(android.content.Intent r3) {
        /*
            boolean r0 = m22279b(r3)
            r1 = 0
            if (r0 == 0) goto L_0x0025
            android.os.Bundle r0 = r3.getExtras()
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0020
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = com.google.android.gms.common.internal.safeparcel.C4400b.m19020a(r0, r2)
        L_0x001d:
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x0026
        L_0x0020:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0025
            goto L_0x001d
        L_0x0025:
            r0 = r1
        L_0x0026:
            if (r0 == 0) goto L_0x0029
            return r0
        L_0x0029:
            java.util.List r3 = m22280c(r3)
            if (r3 == 0) goto L_0x0043
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0036
            goto L_0x0043
        L_0x0036:
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0043:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.m22277a(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    /* renamed from: a */
    private static boolean m22278a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m22278a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m22279b(Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent == null ? false : intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List c = m22280c(intent);
        return c != null && !c.isEmpty();
    }

    @C0195i0
    /* renamed from: c */
    private static List<ActivityRecognitionResult> m22280c(Intent intent) {
        String str = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST";
        if (!(intent == null ? false : intent.hasExtra(str))) {
            return null;
        }
        return C4400b.m19027b(intent, str, CREATOR);
    }

    /* renamed from: N */
    public long mo19968N() {
        return this.f14676N;
    }

    /* renamed from: O */
    public DetectedActivity mo19969O() {
        return (DetectedActivity) this.f14679a.get(0);
    }

    /* renamed from: P */
    public List<DetectedActivity> mo19970P() {
        return this.f14679a;
    }

    /* renamed from: Q */
    public long mo19971Q() {
        return this.f14680b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ActivityRecognitionResult.class == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f14680b == activityRecognitionResult.f14680b && this.f14676N == activityRecognitionResult.f14676N && this.f14677O == activityRecognitionResult.f14677O && C4413y.m19053a(this.f14679a, activityRecognitionResult.f14679a) && m22278a(this.f14678P, activityRecognitionResult.f14678P);
        }
    }

    /* renamed from: g */
    public int mo19973g(int i) {
        for (DetectedActivity detectedActivity : this.f14679a) {
            if (detectedActivity.mo20003O() == i) {
                return detectedActivity.mo20002N();
            }
        }
        return 0;
    }

    public int hashCode() {
        return C4413y.m19051a(Long.valueOf(this.f14680b), Long.valueOf(this.f14676N), Integer.valueOf(this.f14677O), this.f14679a, this.f14678P);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f14679a);
        long j = this.f14680b;
        long j2 = this.f14676N;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C4399a.m18958a(parcel);
        C4399a.m19017j(parcel, 1, this.f14679a, false);
        C4399a.m18965a(parcel, 2, this.f14680b);
        C4399a.m18965a(parcel, 3, this.f14676N);
        C4399a.m18964a(parcel, 4, this.f14677O);
        C4399a.m18966a(parcel, 5, this.f14678P, false);
        C4399a.m18959a(parcel, a);
    }
}
