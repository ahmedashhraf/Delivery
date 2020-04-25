package com.google.android.gms.location;

import java.util.Comparator;

/* renamed from: com.google.android.gms.location.k0 */
final class C5139k0 implements Comparator<DetectedActivity> {
    C5139k0() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        int compareTo = Integer.valueOf(detectedActivity2.mo20002N()).compareTo(Integer.valueOf(detectedActivity.mo20002N()));
        return compareTo == 0 ? Integer.valueOf(detectedActivity.mo20003O()).compareTo(Integer.valueOf(detectedActivity2.mo20003O())) : compareTo;
    }
}
