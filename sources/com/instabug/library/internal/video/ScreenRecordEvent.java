package com.instabug.library.internal.video;

import android.net.Uri;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ScreenRecordEvent {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final int ENCODED = 1;
    public static final int ENCODED_FAILED = 2;
    public static final int SNAPPED_AND_ENCODING = 0;
    private int status;
    private Uri videoUri;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1225744360066550442L, "com/instabug/library/internal/video/ScreenRecordEvent", 3);
        $jacocoData = a;
        return a;
    }

    public ScreenRecordEvent(int i, Uri uri) {
        boolean[] $jacocoInit = $jacocoInit();
        this.status = i;
        this.videoUri = uri;
        $jacocoInit[0] = true;
    }

    public int getStatus() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.status;
        $jacocoInit[1] = true;
        return i;
    }

    public Uri getVideoUri() {
        boolean[] $jacocoInit = $jacocoInit();
        Uri uri = this.videoUri;
        $jacocoInit[2] = true;
        return uri;
    }
}
