package com.crashlytics.android.answers;

import android.content.Context;
import android.os.Looper;
import java.io.IOException;
import p212io.fabric.sdk.android.p493p.p495b.C14277x;
import p212io.fabric.sdk.android.p493p.p496c.C14296l;
import p212io.fabric.sdk.android.p493p.p497d.C14299a;

class AnswersFilesManagerProvider {
    static final String SESSION_ANALYTICS_FILE_NAME = "session_analytics.tap";
    static final String SESSION_ANALYTICS_TO_SEND_DIR = "session_analytics_to_send";
    final Context context;
    final C14299a fileStore;

    public AnswersFilesManagerProvider(Context context2, C14299a aVar) {
        this.context = context2;
        this.fileStore = aVar;
    }

    public SessionAnalyticsFilesManager getAnalyticsFilesManager() throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return new SessionAnalyticsFilesManager(this.context, new SessionEventTransform(), new C14277x(), new C14296l(this.context, this.fileStore.mo45244c(), SESSION_ANALYTICS_FILE_NAME, SESSION_ANALYTICS_TO_SEND_DIR));
        }
        throw new IllegalStateException("AnswersFilesManagerProvider cannot be called on the main thread");
    }
}
