package com.instabug.bug.settings;

import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AttachmentsTypesParams implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private boolean allowAttachImageFromGallery;
    private boolean allowScreenRecording;
    private boolean allowTakeExtraScreenshot;
    private boolean shouldTakesInitialScreenshot;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3039413122308201247L, "com/instabug/bug/settings/AttachmentsTypesParams", 11);
        $jacocoData = a;
        return a;
    }

    public AttachmentsTypesParams() {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldTakesInitialScreenshot = true;
        this.allowTakeExtraScreenshot = true;
        this.allowAttachImageFromGallery = true;
        this.allowScreenRecording = true;
        $jacocoInit[0] = true;
    }

    public boolean isAllowAttachImageFromGallery() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.allowAttachImageFromGallery;
        $jacocoInit[6] = true;
        return z;
    }

    public boolean isAllowScreenRecording() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.allowScreenRecording;
        $jacocoInit[8] = true;
        return z;
    }

    public boolean isAllowTakeExtraScreenshot() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.allowTakeExtraScreenshot;
        $jacocoInit[4] = true;
        return z;
    }

    public boolean isShouldTakesInitialScreenshot() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.shouldTakesInitialScreenshot;
        $jacocoInit[2] = true;
        return z;
    }

    public AttachmentsTypesParams setAllowAttachImageFromGallery(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.allowAttachImageFromGallery = z;
        $jacocoInit[7] = true;
        return this;
    }

    public AttachmentsTypesParams setAllowScreenRecording(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.allowScreenRecording = z;
        $jacocoInit[9] = true;
        return this;
    }

    public AttachmentsTypesParams setAllowTakeExtraScreenshot(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.allowTakeExtraScreenshot = z;
        $jacocoInit[5] = true;
        return this;
    }

    public AttachmentsTypesParams setShouldTakesInitialScreenshot(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldTakesInitialScreenshot = z;
        $jacocoInit[3] = true;
        return this;
    }

    public String toString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        sb.append(this.shouldTakesInitialScreenshot);
        String str = ", ";
        sb.append(str);
        sb.append(this.allowTakeExtraScreenshot);
        sb.append(str);
        sb.append(this.allowAttachImageFromGallery);
        sb.append(str);
        sb.append(this.allowScreenRecording);
        String sb2 = sb.toString();
        $jacocoInit[10] = true;
        return sb2;
    }

    public AttachmentsTypesParams(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean[] $jacocoInit = $jacocoInit();
        this.shouldTakesInitialScreenshot = z;
        this.allowTakeExtraScreenshot = z2;
        this.allowAttachImageFromGallery = z3;
        this.allowScreenRecording = z4;
        $jacocoInit[1] = true;
    }
}
