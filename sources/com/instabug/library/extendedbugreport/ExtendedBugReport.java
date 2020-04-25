package com.instabug.library.extendedbugreport;

import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ExtendedBugReport {
    private static transient /* synthetic */ boolean[] $jacocoData;

    public enum State {
        DISABLED,
        ENABLED_WITH_REQUIRED_FIELDS,
        ENABLED_WITH_OPTIONAL_FIELDS;

        static {
            boolean[] $jacocoInit;
            $jacocoInit[5] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2983111275370577563L, "com/instabug/library/extendedbugreport/ExtendedBugReport", 1);
        $jacocoData = a;
        return a;
    }

    public ExtendedBugReport() {
        $jacocoInit()[0] = true;
    }
}
