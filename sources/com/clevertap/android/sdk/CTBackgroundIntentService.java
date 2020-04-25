package com.clevertap.android.sdk;

import android.app.IntentService;
import android.content.Intent;

public class CTBackgroundIntentService extends IntentService {

    /* renamed from: a */
    public static final String f10763a = "com.clevertap.BG_EVENT";

    public CTBackgroundIntentService() {
        super("CTBackgroundIntentService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        C3150p0.m15362u(getApplicationContext());
    }
}
