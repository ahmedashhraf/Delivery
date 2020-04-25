package com.instabug.library.util;

import android.content.Context;
import com.instabug.library.Instabug;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugDeprecationLogger {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InstabugDeprecationLogger INSTANCE;
    private long lastCalled;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-2418847321400576769L, "com/instabug/library/util/InstabugDeprecationLogger", 18);
        $jacocoData = a;
        return a;
    }

    private InstabugDeprecationLogger() {
        $jacocoInit()[0] = true;
    }

    public static InstabugDeprecationLogger getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[1] = true;
        } else {
            $jacocoInit[2] = true;
            INSTANCE = new InstabugDeprecationLogger();
            $jacocoInit[3] = true;
        }
        InstabugDeprecationLogger instabugDeprecationLogger = INSTANCE;
        $jacocoInit[4] = true;
        return instabugDeprecationLogger;
    }

    public void log() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (!Instabug.isBuilt()) {
            $jacocoInit[5] = true;
        } else {
            $jacocoInit[6] = true;
            Context applicationContext = Instabug.getApplicationContext();
            if (applicationContext == null) {
                $jacocoInit[7] = true;
            } else {
                $jacocoInit[8] = true;
                if ((applicationContext.getApplicationInfo().flags & 2) != 0) {
                    $jacocoInit[9] = true;
                    z = true;
                } else {
                    z = false;
                    $jacocoInit[10] = true;
                }
                if (!z) {
                    $jacocoInit[11] = true;
                } else {
                    $jacocoInit[12] = true;
                    if (System.currentTimeMillis() - this.lastCalled <= 20000) {
                        $jacocoInit[13] = true;
                    } else {
                        $jacocoInit[14] = true;
                        this.lastCalled = System.currentTimeMillis();
                        $jacocoInit[15] = true;
                        $jacocoInit[16] = true;
                    }
                }
            }
        }
        $jacocoInit[17] = true;
    }
}
