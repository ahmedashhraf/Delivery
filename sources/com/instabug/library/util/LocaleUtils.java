package com.instabug.library.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class LocaleUtils {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3712702155083250440L, "com/instabug/library/util/LocaleUtils", 34);
        $jacocoData = a;
        return a;
    }

    public LocaleUtils() {
        $jacocoInit()[0] = true;
    }

    public static String getLocaleStringResource(Locale locale, int i, Context context) {
        String str;
        boolean[] $jacocoInit = $jacocoInit();
        if (VERSION.SDK_INT >= 17) {
            $jacocoInit[15] = true;
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            $jacocoInit[16] = true;
            configuration.setLocale(locale);
            $jacocoInit[17] = true;
            str = context.createConfigurationContext(configuration).getText(i).toString();
            $jacocoInit[18] = true;
        } else {
            Resources resources = context.getResources();
            $jacocoInit[19] = true;
            Configuration configuration2 = resources.getConfiguration();
            Locale locale2 = configuration2.locale;
            configuration2.locale = locale;
            $jacocoInit[20] = true;
            resources.updateConfiguration(configuration2, null);
            $jacocoInit[21] = true;
            String string = resources.getString(i);
            configuration2.locale = locale2;
            $jacocoInit[22] = true;
            resources.updateConfiguration(configuration2, null);
            $jacocoInit[23] = true;
            str = string;
        }
        $jacocoInit[24] = true;
        return str;
    }

    public static boolean isRTL(Locale locale) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = false;
        if (VERSION.SDK_INT >= 17) {
            $jacocoInit[25] = true;
            if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
                $jacocoInit[26] = true;
                z = true;
            } else {
                $jacocoInit[27] = true;
            }
            $jacocoInit[28] = true;
            return z;
        }
        byte directionality = Character.getDirectionality(locale.getDisplayName().charAt(0));
        if (directionality == 1) {
            $jacocoInit[29] = true;
        } else if (directionality == 2) {
            $jacocoInit[30] = true;
        } else {
            $jacocoInit[32] = true;
            $jacocoInit[33] = true;
            return z;
        }
        $jacocoInit[31] = true;
        z = true;
        $jacocoInit[33] = true;
        return z;
    }

    public static void setLocale(Activity activity, Locale locale) {
        boolean[] $jacocoInit = $jacocoInit();
        Resources resources = activity.getApplicationContext().getResources();
        $jacocoInit[1] = true;
        Configuration configuration = resources.getConfiguration();
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            $jacocoInit[2] = true;
            configuration.setLocales(new LocaleList(new Locale[]{locale}));
            $jacocoInit[3] = true;
            updateResources(activity, locale);
            $jacocoInit[4] = true;
        } else if (i >= 17) {
            $jacocoInit[5] = true;
            configuration.setLocale(locale);
            $jacocoInit[6] = true;
        } else {
            configuration.locale = locale;
            $jacocoInit[7] = true;
        }
        Resources resources2 = activity.getResources();
        $jacocoInit[8] = true;
        resources2.updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
        $jacocoInit[9] = true;
    }

    @TargetApi(24)
    private static Context updateResources(Context context, Locale locale) {
        boolean[] $jacocoInit = $jacocoInit();
        Locale.setDefault(locale);
        $jacocoInit[10] = true;
        Configuration configuration = context.getResources().getConfiguration();
        $jacocoInit[11] = true;
        configuration.setLocale(locale);
        $jacocoInit[12] = true;
        configuration.setLayoutDirection(locale);
        $jacocoInit[13] = true;
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        $jacocoInit[14] = true;
        return createConfigurationContext;
    }
}
