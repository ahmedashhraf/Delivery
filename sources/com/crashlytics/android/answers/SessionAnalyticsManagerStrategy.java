package com.crashlytics.android.answers;

import p212io.fabric.sdk.android.p493p.p496c.C14294j;
import p212io.fabric.sdk.android.p493p.p498e.C14307b;

interface SessionAnalyticsManagerStrategy extends C14294j {
    void deleteAllEvents();

    void processEvent(Builder builder);

    void sendEvents();

    void setAnalyticsSettingsData(C14307b bVar, String str);
}
