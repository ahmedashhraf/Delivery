package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import java.io.File;
import java.util.Map;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14228l;

class NativeSessionReport implements Report {
    private final File reportDirectory;

    public NativeSessionReport(File file) {
        this.reportDirectory = file;
    }

    public Map<String, String> getCustomHeaders() {
        return null;
    }

    public File getFile() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public File[] getFiles() {
        return this.reportDirectory.listFiles();
    }

    public String getIdentifier() {
        return this.reportDirectory.getName();
    }

    public Type getType() {
        return Type.NATIVE;
    }

    public void remove() {
        File[] files = getFiles();
        int length = files.length;
        int i = 0;
        while (true) {
            String str = CrashlyticsCore.TAG;
            if (i < length) {
                File file = files[i];
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Removing native report file at ");
                sb.append(file.getPath());
                j.mo45042d(str, sb.toString());
                file.delete();
                i++;
            } else {
                C14228l j2 = C14215d.m61672j();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Removing native report directory at ");
                sb2.append(this.reportDirectory);
                j2.mo45042d(str, sb2.toString());
                this.reportDirectory.delete();
                return;
            }
        }
    }
}
