package com.crashlytics.android;

import android.content.Context;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;

class ManifestEnabledCheckStrategy implements EnabledCheckStrategy {
    ManifestEnabledCheckStrategy() {
    }

    public boolean isCrashlyticsEnabled(Context context) {
        return C14255l.m61854a(context).mo45148b();
    }
}
