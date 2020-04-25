package com.instabug.library.model;

import androidx.annotation.C0195i0;
import java.io.Serializable;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public abstract class BaseReport implements Serializable {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private boolean hasVideo = false;

    /* renamed from: id */
    protected String f26431id;
    private boolean isVideoEncoded = false;
    @C0195i0
    protected State state;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2117336569369466243L, "com/instabug/library/model/BaseReport", 9);
        $jacocoData = a;
        return a;
    }

    public BaseReport() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    public String getId() {
        boolean[] $jacocoInit = $jacocoInit();
        String str = this.f26431id;
        $jacocoInit[1] = true;
        return str;
    }

    @C0195i0
    public State getState() {
        boolean[] $jacocoInit = $jacocoInit();
        State state2 = this.state;
        $jacocoInit[3] = true;
        return state2;
    }

    public boolean hasVideo() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.hasVideo;
        $jacocoInit[5] = true;
        return z;
    }

    public boolean isVideoEncoded() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isVideoEncoded;
        $jacocoInit[7] = true;
        return z;
    }

    public BaseReport setHasVideo(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.hasVideo = z;
        $jacocoInit[6] = true;
        return this;
    }

    public BaseReport setId(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        this.f26431id = str;
        $jacocoInit[2] = true;
        return this;
    }

    public BaseReport setState(@C0195i0 State state2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.state = state2;
        $jacocoInit[4] = true;
        return this;
    }

    public BaseReport setVideoEncoded(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isVideoEncoded = z;
        $jacocoInit[8] = true;
        return this;
    }
}
