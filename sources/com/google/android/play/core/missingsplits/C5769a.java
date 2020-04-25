package com.google.android.play.core.missingsplits;

import android.app.Application;

/* renamed from: com.google.android.play.core.missingsplits.a */
public class C5769a extends Application {

    /* renamed from: a */
    private boolean f16623a = false;

    /* renamed from: a */
    public void mo23055a() {
    }

    public final void onCreate() {
        if (!this.f16623a) {
            this.f16623a = true;
            if (!C5771c.m25322a(this).mo23058b()) {
                super.onCreate();
                mo23055a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
