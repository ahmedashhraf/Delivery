package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.e0 */
public final class C5126e0 implements Creator<ActivityRecognitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m18926b(parcel);
        long j = 0;
        long j2 = 0;
        List list = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m18920a(parcel);
            int a2 = SafeParcelReader.m18919a(a);
            if (a2 == 1) {
                list = SafeParcelReader.m18930c(parcel, a, DetectedActivity.CREATOR);
            } else if (a2 == 2) {
                j = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 == 3) {
                j2 = SafeParcelReader.m18914V(parcel, a);
            } else if (a2 == 4) {
                i = SafeParcelReader.m18912T(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m18918Z(parcel, a);
            } else {
                bundle = SafeParcelReader.m18935g(parcel, a);
            }
        }
        SafeParcelReader.m18902J(parcel, b);
        ActivityRecognitionResult activityRecognitionResult = new ActivityRecognitionResult(list, j, j2, i, bundle);
        return activityRecognitionResult;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
