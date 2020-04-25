package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.internal.NativeProtocol;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import java.util.ArrayList;
import java.util.List;

public abstract class SplitInstallSessionState {
    /* renamed from: a */
    public static SplitInstallSessionState m34394a(Bundle bundle) {
        C7166f fVar = new C7166f(bundle.getInt(SessionEntry.COLUMN_ID), bundle.getInt("status"), bundle.getInt(NativeProtocol.BRIDGE_ARG_ERROR_CODE), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract List<String> mo28562a();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract List<String> mo28563b();

    public abstract long bytesDownloaded();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public abstract List<Intent> mo28565c();

    public abstract int errorCode();

    public List<String> languages() {
        return mo28563b() != null ? new ArrayList(mo28563b()) : new ArrayList();
    }

    public List<String> moduleNames() {
        return mo28562a() != null ? new ArrayList(mo28562a()) : new ArrayList();
    }

    public abstract PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();
}
