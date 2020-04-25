package com.crashlytics.android.core;

import java.io.File;
import java.io.IOException;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p497d.C14299a;

class CrashlyticsFileMarker {
    private final C14299a fileStore;
    private final String markerName;

    public CrashlyticsFileMarker(String str, C14299a aVar) {
        this.markerName = str;
        this.fileStore = aVar;
    }

    private File getMarkerFile() {
        return new File(this.fileStore.mo45244c(), this.markerName);
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException e) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Error creating marker: ");
            sb.append(this.markerName);
            j.mo45045e(CrashlyticsCore.TAG, sb.toString(), e);
            return false;
        }
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }
}
