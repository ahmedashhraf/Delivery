package com.instabug.library.internal.video;

import android.net.Uri;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AutoScreenRecordingFileHolder {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static final AutoScreenRecordingFileHolder INSTANCE = new AutoScreenRecordingFileHolder();
    private File autoScreenRecordingFile;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-9058038607090153272L, "com/instabug/library/internal/video/AutoScreenRecordingFileHolder", 12);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[11] = true;
    }

    public AutoScreenRecordingFileHolder() {
        $jacocoInit()[1] = true;
    }

    public static AutoScreenRecordingFileHolder getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        AutoScreenRecordingFileHolder autoScreenRecordingFileHolder = INSTANCE;
        $jacocoInit[0] = true;
        return autoScreenRecordingFileHolder;
    }

    public void clear() {
        boolean[] $jacocoInit = $jacocoInit();
        this.autoScreenRecordingFile = null;
        $jacocoInit[10] = true;
    }

    public boolean delete() {
        boolean[] $jacocoInit = $jacocoInit();
        File file = this.autoScreenRecordingFile;
        if (file == null) {
            $jacocoInit[6] = true;
            return true;
        } else if (file.delete()) {
            $jacocoInit[7] = true;
            InstabugSDKLogger.m46622d(this, "Screen recording file deleted");
            $jacocoInit[8] = true;
            return true;
        } else {
            $jacocoInit[9] = true;
            return false;
        }
    }

    public Uri getAutoScreenRecordingFileUri() {
        boolean[] $jacocoInit = $jacocoInit();
        File file = this.autoScreenRecordingFile;
        if (file != null) {
            $jacocoInit[2] = true;
            Uri fromFile = Uri.fromFile(file);
            $jacocoInit[3] = true;
            return fromFile;
        }
        $jacocoInit[4] = true;
        return null;
    }

    public void setAutoScreenRecordingFile(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        this.autoScreenRecordingFile = file;
        $jacocoInit[5] = true;
    }
}
