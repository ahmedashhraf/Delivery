package com.instabug.library.analytics.util;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class ViewResourcesUtil {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1614849217290451655L, "com/instabug/library/analytics/util/ViewResourcesUtil", 10);
        $jacocoData = a;
        return a;
    }

    public ViewResourcesUtil() {
        $jacocoInit()[0] = true;
    }

    public static String getViewResourceIdAsString(Context context, int i) {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        if (context == null) {
            try {
                $jacocoInit[1] = true;
            } catch (NotFoundException unused) {
                $jacocoInit[8] = true;
                String valueOf = String.valueOf(i);
                $jacocoInit[9] = true;
                return valueOf;
            }
        } else if (context.getResources() == null) {
            $jacocoInit[2] = true;
        } else if (context.getResources().getResourceEntryName(i) == null) {
            $jacocoInit[3] = true;
        } else {
            $jacocoInit[4] = true;
            str = context.getResources().getResourceEntryName(i);
            $jacocoInit[5] = true;
            $jacocoInit[7] = true;
            return str;
        }
        str = String.valueOf(i);
        $jacocoInit[6] = true;
        $jacocoInit[7] = true;
        return str;
    }
}
