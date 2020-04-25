package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import p212io.fabric.sdk.android.p493p.p497d.C14302d;
import p212io.fabric.sdk.android.p493p.p497d.C14303e;

class AnswersPreferenceManager {
    static final String PREFKEY_ANALYTICS_LAUNCHED = "analytics_launched";
    static final String PREF_STORE_NAME = "settings";
    private final C14302d prefStore;

    AnswersPreferenceManager(C14302d dVar) {
        this.prefStore = dVar;
    }

    public static AnswersPreferenceManager build(Context context) {
        return new AnswersPreferenceManager(new C14303e(context, PREF_STORE_NAME));
    }

    @SuppressLint({"CommitPrefEdits"})
    public boolean hasAnalyticsLaunched() {
        return this.prefStore.get().getBoolean(PREFKEY_ANALYTICS_LAUNCHED, false);
    }

    @SuppressLint({"CommitPrefEdits"})
    public void setAnalyticsLaunched() {
        C14302d dVar = this.prefStore;
        dVar.mo45252a(dVar.mo45251a().putBoolean(PREFKEY_ANALYTICS_LAUNCHED, true));
    }
}
