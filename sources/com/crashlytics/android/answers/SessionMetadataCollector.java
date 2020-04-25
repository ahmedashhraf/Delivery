package com.crashlytics.android.answers;

import android.content.Context;
import java.util.Map;
import java.util.UUID;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p495b.C14265s.C14266a;

class SessionMetadataCollector {
    private final Context context;
    private final C14265s idManager;
    private final String versionCode;
    private final String versionName;

    public SessionMetadataCollector(Context context2, C14265s sVar, String str, String str2) {
        this.context = context2;
        this.idManager = sVar;
        this.versionCode = str;
        this.versionName = str2;
    }

    public SessionEventMetadata getMetadata() {
        Map h = this.idManager.mo45167h();
        SessionEventMetadata sessionEventMetadata = new SessionEventMetadata(this.idManager.mo45164e(), UUID.randomUUID().toString(), this.idManager.mo45165f(), this.idManager.mo45176q(), (String) h.get(C14266a.FONT_TOKEN), C14248i.m61847o(this.context), this.idManager.mo45172m(), this.idManager.mo45169j(), this.versionCode, this.versionName);
        return sessionEventMetadata;
    }
}
