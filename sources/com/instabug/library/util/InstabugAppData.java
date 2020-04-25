package com.instabug.library.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugAppData {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private ApplicationInfo applicationInfo;
    private Context context;
    private String packageName;

    /* renamed from: pm */
    private PackageManager f26666pm;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4918198391455652696L, "com/instabug/library/util/InstabugAppData", 12);
        $jacocoData = a;
        return a;
    }

    public InstabugAppData(Context context2) {
        boolean[] $jacocoInit = $jacocoInit();
        this.context = context2;
        $jacocoInit[0] = true;
        this.packageName = context2.getPackageName();
        $jacocoInit[1] = true;
        this.f26666pm = context2.getPackageManager();
        try {
            $jacocoInit[2] = true;
            this.applicationInfo = this.f26666pm.getApplicationInfo(this.packageName, 128);
            $jacocoInit[3] = true;
        } catch (NameNotFoundException e) {
            $jacocoInit[4] = true;
            e.printStackTrace();
            $jacocoInit[5] = true;
        }
        $jacocoInit[6] = true;
    }

    public int getAppIcon() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = this.applicationInfo.icon;
        $jacocoInit[10] = true;
        return i;
    }

    public String getAppName() {
        Object obj;
        boolean[] $jacocoInit = $jacocoInit();
        ApplicationInfo applicationInfo2 = this.applicationInfo;
        if (applicationInfo2 != null) {
            obj = this.f26666pm.getApplicationLabel(applicationInfo2);
            $jacocoInit[7] = true;
        } else {
            $jacocoInit[8] = true;
            obj = "(unknown)";
        }
        String str = (String) obj;
        $jacocoInit[9] = true;
        return str;
    }

    public Intent getMainIntent() {
        boolean[] $jacocoInit = $jacocoInit();
        Intent launchIntentForPackage = this.f26666pm.getLaunchIntentForPackage(this.context.getPackageName());
        $jacocoInit[11] = true;
        return launchIntentForPackage;
    }
}
