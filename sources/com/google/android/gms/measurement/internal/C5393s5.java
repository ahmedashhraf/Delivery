package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.AppMeasurement.C5177d;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;

/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class C5393s5 {

    /* renamed from: a */
    public static final String[] f15453a = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "session_number", "ga_session_number", SessionEntry.COLUMN_ID, "ga_session_id", "last_gclid"};

    /* renamed from: b */
    public static final String[] f15454b = {C5177d.f14829c, "_fot", "_fvt", "_ldl", FeatureRequestEntry.COLUMN_ID, "_fi", "_lte", "_se", "_npa", "_sno", "_sno", "_sid", "_sid", "_lgclid"};

    protected C5393s5() {
    }

    /* renamed from: a */
    public static String m23461a(String str) {
        return C5219c7.m22538a(str, f15453a, f15454b);
    }
}
