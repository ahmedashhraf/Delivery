package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;

class AppData {
    public final String apiKey;
    public final String buildId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    AppData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apiKey = str;
        this.buildId = str2;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
    }

    public static AppData create(Context context, C14265s sVar, String str, String str2) throws NameNotFoundException {
        String packageName2 = context.getPackageName();
        String i = sVar.mo45168i();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = C14265s.f42076o;
        }
        AppData appData = new AppData(str, str2, i, packageName2, num, str3);
        return appData;
    }
}
