package com.instabug.library;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class APIBuildChecker {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-8201775188911526563L, "com/instabug/library/APIBuildChecker", 4);
        $jacocoData = a;
        return a;
    }

    public APIBuildChecker() {
        $jacocoInit()[0] = true;
    }

    public static void check() {
        boolean[] $jacocoInit = $jacocoInit();
        if (Instabug.isBuilt()) {
            $jacocoInit[3] = true;
            return;
        }
        $jacocoInit[1] = true;
        IllegalStateException illegalStateException = new IllegalStateException("Instabug API called before Instabug.Builder().build() was called");
        $jacocoInit[2] = true;
        throw illegalStateException;
    }
}
