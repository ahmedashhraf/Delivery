package com.instabug.library.core;

import android.app.Activity;
import android.net.Uri;
import com.instabug.library.C9780c;
import com.instabug.library.C9794d.C9796b;
import com.instabug.library.C9810g;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.core.plugin.C9789a;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.user.C10009a;
import java.util.LinkedHashMap;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugCore {
    private static transient /* synthetic */ boolean[] $jacocoData;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5075339415218164214L, "com/instabug/library/core/InstabugCore", 29);
        $jacocoData = a;
        return a;
    }

    public InstabugCore() {
        $jacocoInit()[0] = true;
    }

    public static String getEnteredEmail() {
        boolean[] $jacocoInit = $jacocoInit();
        String e = C10009a.m46600e();
        $jacocoInit[10] = true;
        return e;
    }

    public static String getEnteredUsername() {
        boolean[] $jacocoInit = $jacocoInit();
        String d = C10009a.m46598d();
        $jacocoInit[16] = true;
        return d;
    }

    public static LinkedHashMap<Uri, String> getExtraAttachmentFiles() {
        boolean[] $jacocoInit = $jacocoInit();
        LinkedHashMap<Uri, String> extraAttachmentFiles = SettingsManager.getInstance().getExtraAttachmentFiles();
        $jacocoInit[4] = true;
        return extraAttachmentFiles;
    }

    public static State getFeatureState(Feature feature) {
        boolean[] $jacocoInit = $jacocoInit();
        State b = C9780c.m45631b().mo34869b(feature);
        $jacocoInit[2] = true;
        return b;
    }

    public static long getFirstRunAt() {
        boolean[] $jacocoInit = $jacocoInit();
        long time = SettingsManager.getInstance().getFirstRunAt().getTime();
        $jacocoInit[24] = true;
        return time;
    }

    public static String getIdentifiedUserEmail() {
        boolean[] $jacocoInit = $jacocoInit();
        String b = C10009a.m46593b();
        $jacocoInit[9] = true;
        return b;
    }

    public static String getIdentifiedUsername() {
        boolean[] $jacocoInit = $jacocoInit();
        String c = C10009a.m46596c();
        $jacocoInit[12] = true;
        return c;
    }

    public static OnSdkInvokedCallback getOnSdkInvokedCallback() {
        boolean[] $jacocoInit = $jacocoInit();
        OnSdkInvokedCallback onSdkInvokedCallback = SettingsManager.getInstance().getOnSdkInvokedCallback();
        $jacocoInit[17] = true;
        return onSdkInvokedCallback;
    }

    public static Runnable getPreReportRunnable() {
        boolean[] $jacocoInit = $jacocoInit();
        Runnable a = C9796b.m45678a();
        $jacocoInit[5] = true;
        return a;
    }

    public static int getPrimaryColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int primaryColor = SettingsManager.getInstance().getPrimaryColor();
        $jacocoInit[8] = true;
        return primaryColor;
    }

    public static String getSDKVersion() {
        $jacocoInit()[6] = true;
        return "8.0.11";
    }

    public static int getSessionCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int sessionsCount = SettingsManager.getInstance().getSessionsCount();
        $jacocoInit[23] = true;
        return sessionsCount;
    }

    public static int getStartedActivitiesCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int d = C9810g.m45766e().mo34935d();
        $jacocoInit[7] = true;
        return d;
    }

    public static String getTagsAsString() {
        boolean[] $jacocoInit = $jacocoInit();
        String tagsAsString = SettingsManager.getInstance().getTagsAsString();
        $jacocoInit[18] = true;
        return tagsAsString;
    }

    public static Activity getTargetActivity() {
        boolean[] $jacocoInit = $jacocoInit();
        Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
        $jacocoInit[28] = true;
        return targetActivity;
    }

    public static String getUserData() {
        boolean[] $jacocoInit = $jacocoInit();
        String userData = SettingsManager.getInstance().getUserData();
        $jacocoInit[13] = true;
        return userData;
    }

    public static Plugin getXPlugin(Class cls) {
        boolean[] $jacocoInit = $jacocoInit();
        Plugin a = C9789a.m45657a(cls);
        $jacocoInit[25] = true;
        return a;
    }

    public static boolean isAppOnForeground() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean isAppOnForeground = SettingsManager.getInstance().isAppOnForeground();
        $jacocoInit[27] = true;
        return isAppOnForeground;
    }

    public static boolean isFeatureAvailable(Feature feature) {
        boolean[] $jacocoInit = $jacocoInit();
        boolean a = C9780c.m45631b().mo34868a(feature);
        $jacocoInit[3] = true;
        return a;
    }

    public static boolean isFeaturesFetchedBefore() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean a = C9780c.m45631b().mo34867a();
        $jacocoInit[1] = true;
        return a;
    }

    public static boolean isForegroundBusy() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean d = C9789a.m45663d();
        $jacocoInit[21] = true;
        return d;
    }

    public static boolean isReproStepsScreenshotEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean isReproStepsScreenshotEnabled = SettingsManager.getInstance().isReproStepsScreenshotEnabled();
        $jacocoInit[26] = true;
        return isReproStepsScreenshotEnabled;
    }

    public static boolean isUserLoggedOut() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean isUserLoggedOut = SettingsManager.getInstance().isUserLoggedOut();
        $jacocoInit[20] = true;
        return isUserLoggedOut;
    }

    public static void setEnteredEmail(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C10009a.m46597c(str);
        $jacocoInit[11] = true;
    }

    public static void setEnteredUsername(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C10009a.m46594b(str);
        $jacocoInit[15] = true;
    }

    public static void setFeatureState(Feature feature, State state) {
        boolean[] $jacocoInit = $jacocoInit();
        C9780c.m45631b().mo34865a(feature, state);
        $jacocoInit[22] = true;
    }

    public static void setIdentifiedUserEmail(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C10009a.m46599d(str);
        $jacocoInit[14] = true;
    }

    public static void setLastContactedAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        SettingsManager.getInstance().setLastContactedAt(j);
        $jacocoInit[19] = true;
    }
}
