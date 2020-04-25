package com.instabug.library.util;

import androidx.annotation.C0216r0;
import com.instabug.library.C9700R;
import com.instabug.library.InstabugColorTheme;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugThemeResolver {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5604529710282875613L, "com/instabug/library/util/InstabugThemeResolver", 3);
        $jacocoData = a;
        return a;
    }

    public InstabugThemeResolver() {
        $jacocoInit()[0] = true;
    }

    @C0216r0
    public static int resolveTheme(InstabugColorTheme instabugColorTheme) {
        boolean[] $jacocoInit = $jacocoInit();
        if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
            int i = C9700R.style.InstabugSdkTheme_Light;
            $jacocoInit[1] = true;
            return i;
        }
        int i2 = C9700R.style.InstabugSdkTheme_Dark;
        $jacocoInit[2] = true;
        return i2;
    }
}
