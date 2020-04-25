package com.crashlytics.android.core;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import p212io.fabric.sdk.android.p493p.p497d.C14302d;
import p212io.fabric.sdk.android.p493p.p497d.C14303e;

@SuppressLint({"CommitPrefEdits"})
class PreferenceManager {
    static final String PREF_ALWAYS_SEND_REPORTS_KEY = "always_send_reports_opt_in";
    private static final String PREF_MIGRATION_COMPLETE = "preferences_migration_complete";
    private static final boolean SHOULD_ALWAYS_SEND_REPORTS_DEFAULT = false;
    private final CrashlyticsCore kit;
    private final C14302d preferenceStore;

    public PreferenceManager(C14302d dVar, CrashlyticsCore crashlyticsCore) {
        this.preferenceStore = dVar;
        this.kit = crashlyticsCore;
    }

    public static PreferenceManager create(C14302d dVar, CrashlyticsCore crashlyticsCore) {
        return new PreferenceManager(dVar, crashlyticsCore);
    }

    /* access modifiers changed from: 0000 */
    public void setShouldAlwaysSendReports(boolean z) {
        C14302d dVar = this.preferenceStore;
        dVar.mo45252a(dVar.mo45251a().putBoolean(PREF_ALWAYS_SEND_REPORTS_KEY, z));
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldAlwaysSendReports() {
        SharedPreferences sharedPreferences = this.preferenceStore.get();
        String str = PREF_MIGRATION_COMPLETE;
        boolean contains = sharedPreferences.contains(str);
        String str2 = PREF_ALWAYS_SEND_REPORTS_KEY;
        if (!contains) {
            C14303e eVar = new C14303e(this.kit);
            if (!this.preferenceStore.get().contains(str2) && eVar.get().contains(str2)) {
                boolean z = eVar.get().getBoolean(str2, false);
                C14302d dVar = this.preferenceStore;
                dVar.mo45252a(dVar.mo45251a().putBoolean(str2, z));
            }
            C14302d dVar2 = this.preferenceStore;
            dVar2.mo45252a(dVar2.mo45251a().putBoolean(str, true));
        }
        return this.preferenceStore.get().getBoolean(str2, false);
    }
}
