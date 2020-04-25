package com.crashlytics.android.beta;

import java.util.Collections;
import java.util.Map;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.p493p.p495b.C14257n;
import p212io.fabric.sdk.android.p493p.p495b.C14265s.C14266a;

public class Beta extends C14225i<Boolean> implements C14257n {
    public static final String TAG = "Beta";

    public static Beta getInstance() {
        return (Beta) C14215d.m61662a(Beta.class);
    }

    public Map<C14266a, String> getDeviceIdentifiers() {
        return Collections.emptyMap();
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:beta";
    }

    public String getVersion() {
        return "1.2.10.27";
    }

    /* access modifiers changed from: protected */
    public Boolean doInBackground() {
        C14215d.m61672j().mo45042d(TAG, "Beta kit initializing...");
        return Boolean.valueOf(true);
    }
}
