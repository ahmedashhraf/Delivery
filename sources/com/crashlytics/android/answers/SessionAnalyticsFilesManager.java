package com.crashlytics.android.answers;

import android.content.Context;
import java.io.IOException;
import java.util.UUID;
import p212io.fabric.sdk.android.p493p.p495b.C14254k;
import p212io.fabric.sdk.android.p493p.p496c.C14282d;
import p212io.fabric.sdk.android.p493p.p496c.C14291g;
import p212io.fabric.sdk.android.p493p.p498e.C14307b;

class SessionAnalyticsFilesManager extends C14282d<SessionEvent> {
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION = ".tap";
    private static final String SESSION_ANALYTICS_TO_SEND_FILE_PREFIX = "sa";
    private C14307b analyticsSettingsData;

    SessionAnalyticsFilesManager(Context context, SessionEventTransform sessionEventTransform, C14254k kVar, C14291g gVar) throws IOException {
        super(context, sessionEventTransform, kVar, gVar, 100);
    }

    /* access modifiers changed from: protected */
    public String generateUniqueRollOverFileName() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(SESSION_ANALYTICS_TO_SEND_FILE_PREFIX);
        String str = C14282d.ROLL_OVER_FILE_NAME_SEPARATOR;
        sb.append(str);
        sb.append(randomUUID.toString());
        sb.append(str);
        sb.append(this.currentTimeProvider.mo45145a());
        sb.append(SESSION_ANALYTICS_TO_SEND_FILE_EXTENSION);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public int getMaxByteSizePerFile() {
        C14307b bVar = this.analyticsSettingsData;
        return bVar == null ? super.getMaxByteSizePerFile() : bVar.f42182c;
    }

    /* access modifiers changed from: protected */
    public int getMaxFilesToKeep() {
        C14307b bVar = this.analyticsSettingsData;
        return bVar == null ? super.getMaxFilesToKeep() : bVar.f42184e;
    }

    /* access modifiers changed from: 0000 */
    public void setAnalyticsSettingsData(C14307b bVar) {
        this.analyticsSettingsData = bVar;
    }
}
