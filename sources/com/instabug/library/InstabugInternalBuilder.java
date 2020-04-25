package com.instabug.library;

import android.content.Context;
import com.instabug.library.Instabug.Builder;
import com.instabug.library.invocation.InstabugInvocationEvent;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugInternalBuilder {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5590998637571741692L, "com/instabug/library/InstabugInternalBuilder", 3);
        $jacocoData = a;
        return a;
    }

    public InstabugInternalBuilder() {
        $jacocoInit()[0] = true;
    }

    public static Instabug buildInstabug(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Builder builder = new Builder(context, "f501f761142981d54b1fdea93963a934", InstabugInvocationEvent.FLOATING_BUTTON);
        $jacocoInit[1] = true;
        Instabug build = builder.build();
        $jacocoInit[2] = true;
        return build;
    }
}
