package com.instabug.chat.settings;

import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AttachmentTypesState implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private boolean imageFromGalleryEnabled;
    private boolean screenRecordingEnabled;
    private boolean screenshotEnabled;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1291612407953702507L, "com/instabug/chat/settings/AttachmentTypesState", 9);
        $jacocoData = a;
        return a;
    }

    public AttachmentTypesState() {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenshotEnabled = true;
        this.imageFromGalleryEnabled = true;
        this.screenRecordingEnabled = true;
        $jacocoInit[0] = true;
    }

    public boolean isImageFromGalleryEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.imageFromGalleryEnabled;
        $jacocoInit[4] = true;
        return z;
    }

    public boolean isScreenRecordingEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.screenRecordingEnabled;
        $jacocoInit[6] = true;
        return z;
    }

    public boolean isScreenshotEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.screenshotEnabled;
        $jacocoInit[2] = true;
        return z;
    }

    public AttachmentTypesState setImageFromGalleryEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.imageFromGalleryEnabled = z;
        $jacocoInit[5] = true;
        return this;
    }

    public AttachmentTypesState setScreenRecordingEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenRecordingEnabled = z;
        $jacocoInit[7] = true;
        return this;
    }

    public AttachmentTypesState setScreenshotEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenshotEnabled = z;
        $jacocoInit[3] = true;
        return this;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(this.screenshotEnabled);
        String str = ", ";
        sb.append(str);
        sb.append(this.imageFromGalleryEnabled);
        sb.append(str);
        sb.append(this.screenRecordingEnabled);
        String sb2 = sb.toString();
        $jacocoInit[8] = true;
        return sb2;
    }

    public AttachmentTypesState(boolean z, boolean z2, boolean z3) {
        boolean[] $jacocoInit = $jacocoInit();
        this.screenshotEnabled = z;
        this.imageFromGalleryEnabled = z2;
        this.screenRecordingEnabled = z3;
        $jacocoInit[1] = true;
    }
}
