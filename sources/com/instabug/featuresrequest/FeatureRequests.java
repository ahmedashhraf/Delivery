package com.instabug.featuresrequest;

import android.app.Activity;
import android.content.Intent;
import com.instabug.featuresrequest.p369b.C9535a;
import com.instabug.featuresrequest.p370c.C9541d;
import com.instabug.featuresrequest.p373ui.FeaturesRequestActivity;
import com.instabug.library.APIBuildChecker;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugDeprecationLogger;
import java.util.Arrays;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeatureRequests {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-833290163918245335L, "com/instabug/featuresrequest/FeatureRequests", 52);
        $jacocoData = a;
        return a;
    }

    public FeatureRequests() {
        $jacocoInit()[0] = true;
    }

    @Deprecated
    public static void setCommenterEmailFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[49] = true;
        C9535a.m44611c().mo34221b(z);
        $jacocoInit[50] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[51] = true;
    }

    public static void setEmailFieldRequired(boolean z, int... iArr) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[14] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[15] = true;
        Parameter name = parameter.setName("isEmailFieldRequired");
        Class cls = Boolean.TYPE;
        $jacocoInit[16] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[17] = true;
        Parameter value = type.setValue(Boolean.valueOf(z));
        int i = 0;
        Parameter parameter2 = new Parameter();
        $jacocoInit[18] = true;
        $jacocoInit[19] = true;
        Parameter value2 = parameter2.setName("actions").setValue(String.class);
        $jacocoInit[20] = true;
        Parameter[] parameterArr = {value, value2.setValue(Arrays.toString(iArr))};
        $jacocoInit[21] = true;
        instance.catchApiUsage(parameterArr);
        if (iArr == null) {
            $jacocoInit[22] = true;
        } else if (iArr.length == 0) {
            $jacocoInit[23] = true;
        } else {
            int length = iArr.length;
            $jacocoInit[26] = true;
            while (i < length) {
                int i2 = iArr[i];
                if (i2 == 2) {
                    C9535a.m44611c().mo34219a(z);
                    $jacocoInit[29] = true;
                } else if (i2 != 4) {
                    $jacocoInit[28] = true;
                } else {
                    C9535a.m44611c().mo34221b(z);
                    $jacocoInit[30] = true;
                }
                i++;
                $jacocoInit[31] = true;
            }
            $jacocoInit[27] = true;
            $jacocoInit[32] = true;
        }
        C9535a.m44611c().mo34219a(z);
        $jacocoInit[24] = true;
        C9535a.m44611c().mo34221b(z);
        $jacocoInit[25] = true;
        $jacocoInit[32] = true;
    }

    @Deprecated
    public static void setNewFeatureEmailFieldRequired(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[46] = true;
        C9535a.m44611c().mo34219a(z);
        $jacocoInit[47] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[48] = true;
    }

    public static void show() {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[1] = true;
        if (!C9541d.m44637b()) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            if (!C9541d.m44636a()) {
                $jacocoInit[4] = true;
            } else {
                $jacocoInit[5] = true;
                if (!Instabug.isAppOnForeground()) {
                    $jacocoInit[6] = true;
                } else if (InstabugCore.isForegroundBusy()) {
                    $jacocoInit[7] = true;
                } else {
                    $jacocoInit[8] = true;
                    InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
                    $jacocoInit[9] = true;
                    Activity currentActivity = instance.getCurrentActivity();
                    if (currentActivity == null) {
                        $jacocoInit[10] = true;
                    } else {
                        $jacocoInit[11] = true;
                        currentActivity.startActivity(new Intent(currentActivity, FeaturesRequestActivity.class));
                        $jacocoInit[12] = true;
                    }
                }
            }
        }
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[13] = true;
    }

    @Deprecated
    public static void showFeatureRequests() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[33] = true;
        if (!C9541d.m44637b()) {
            $jacocoInit[34] = true;
        } else {
            $jacocoInit[35] = true;
            if (!C9541d.m44636a()) {
                $jacocoInit[36] = true;
            } else {
                $jacocoInit[37] = true;
                if (!Instabug.isAppOnForeground()) {
                    $jacocoInit[38] = true;
                } else if (InstabugCore.isForegroundBusy()) {
                    $jacocoInit[39] = true;
                } else {
                    $jacocoInit[40] = true;
                    InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
                    $jacocoInit[41] = true;
                    Activity currentActivity = instance.getCurrentActivity();
                    if (currentActivity == null) {
                        $jacocoInit[42] = true;
                    } else {
                        $jacocoInit[43] = true;
                        currentActivity.startActivity(new Intent(currentActivity, FeaturesRequestActivity.class));
                        $jacocoInit[44] = true;
                    }
                }
            }
        }
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[45] = true;
    }
}
