package com.instabug.library.settings;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.C0193h0;
import androidx.annotation.C0198k;
import com.facebook.imagepipeline.producers.HttpUrlConnectionNetworkFetcher;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.OnSdkDismissedCallback;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.model.Report.OnReportCreatedListener;
import com.instabug.library.p397ui.onboarding.WelcomeMessage;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class SettingsManager {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    public static final String INSTABUG_SHARED_PREF_NAME = "instabug";
    public static final boolean VERBOSE = false;
    private static SettingsManager settingsManager;
    private boolean DEBUG = false;

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2303756814348701053L, "com/instabug/library/settings/SettingsManager", C13959t.f40819N1);
        $jacocoData = a;
        return a;
    }

    private SettingsManager() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
    }

    public static SettingsManager getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (settingsManager != null) {
            $jacocoInit[4] = true;
        } else {
            $jacocoInit[5] = true;
            settingsManager = new SettingsManager();
            $jacocoInit[6] = true;
        }
        SettingsManager settingsManager2 = settingsManager;
        $jacocoInit[7] = true;
        return settingsManager2;
    }

    public static void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        settingsManager = new SettingsManager();
        $jacocoInit[1] = true;
        C9990b.m46479a(context);
        $jacocoInit[2] = true;
        C9989a.m46430z();
        $jacocoInit[3] = true;
    }

    public void addExtraAttachmentFile(Uri uri, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35716a(uri, str);
        $jacocoInit[26] = true;
    }

    public void addTags(String... strArr) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35725a(strArr);
        $jacocoInit[62] = true;
    }

    public boolean autoScreenRecordingEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean u = C9989a.m46428A().mo35755u();
        $jacocoInit[104] = true;
        return u;
    }

    public int autoScreenRecordingMaxDuration() {
        boolean[] $jacocoInit = $jacocoInit();
        int v = C9989a.m46428A().mo35756v();
        $jacocoInit[108] = true;
        return v;
    }

    public void clearExtraAttachmentFiles() {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35735e();
        $jacocoInit[30] = true;
    }

    public String getAppToken() {
        boolean[] $jacocoInit = $jacocoInit();
        String a = C9990b.m46478A().mo35759a();
        $jacocoInit[10] = true;
        return a;
    }

    public InstabugCustomTextPlaceHolder getCustomPlaceHolders() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugCustomTextPlaceHolder k = C9989a.m46428A().mo35745k();
        $jacocoInit[81] = true;
        return k;
    }

    public String getEnteredEmail() {
        boolean[] $jacocoInit = $jacocoInit();
        String v = C9990b.m46478A().mo35802v();
        $jacocoInit[116] = true;
        return v;
    }

    public String getEnteredUsername() {
        boolean[] $jacocoInit = $jacocoInit();
        String l = C9990b.m46478A().mo35792l();
        $jacocoInit[56] = true;
        return l;
    }

    public LinkedHashMap<Uri, String> getExtraAttachmentFiles() {
        boolean[] $jacocoInit = $jacocoInit();
        LinkedHashMap<Uri, String> d = C9989a.m46428A().mo35732d();
        $jacocoInit[31] = true;
        return d;
    }

    public Date getFirstRunAt() {
        boolean[] $jacocoInit = $jacocoInit();
        Date date = new Date(C9990b.m46478A().mo35779f());
        $jacocoInit[38] = true;
        return date;
    }

    @C0193h0
    public String getIdentifiedUserEmail() {
        boolean[] $jacocoInit = $jacocoInit();
        String c = C9990b.m46478A().mo35770c();
        $jacocoInit[32] = true;
        return c;
    }

    public String getIdentifiedUsername() {
        boolean[] $jacocoInit = $jacocoInit();
        String b = C9990b.m46478A().mo35766b();
        $jacocoInit[53] = true;
        return b;
    }

    public Locale getInstabugLocale(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        Locale a = C9989a.m46428A().mo35713a(context);
        $jacocoInit[24] = true;
        return a;
    }

    @Deprecated
    public long getLastContactedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        long g = C9990b.m46478A().mo35782g();
        $jacocoInit[40] = true;
        return g;
    }

    public int getLastMigrationVersion() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9990b.m46478A().mo35788i();
        $jacocoInit[44] = true;
        return i;
    }

    public String getLastSDKVersion() {
        boolean[] $jacocoInit = $jacocoInit();
        String r = C9990b.m46478A().mo35798r();
        $jacocoInit[88] = true;
        return r;
    }

    public String getMD5Uuid() {
        boolean[] $jacocoInit = $jacocoInit();
        String n = C9990b.m46478A().mo35794n();
        $jacocoInit[59] = true;
        return n;
    }

    public OnInvokeCallback getOnInvokeCallback() {
        boolean[] $jacocoInit = $jacocoInit();
        OnInvokeCallback a = C9989a.m46428A().mo35712a();
        $jacocoInit[12] = true;
        return a;
    }

    public OnReportCreatedListener getOnReportCreatedListener() {
        boolean[] $jacocoInit = $jacocoInit();
        OnReportCreatedListener x = C9989a.m46428A().mo35758x();
        $jacocoInit[17] = true;
        return x;
    }

    public OnSdkDismissedCallback getOnSdkDismissedCallback() {
        boolean[] $jacocoInit = $jacocoInit();
        OnSdkDismissedCallback q = C9989a.m46428A().mo35751q();
        $jacocoInit[101] = true;
        return q;
    }

    public OnSdkInvokedCallback getOnSdkInvokedCallback() {
        boolean[] $jacocoInit = $jacocoInit();
        OnSdkInvokedCallback c = C9989a.m46428A().mo35729c();
        $jacocoInit[16] = true;
        return c;
    }

    @Deprecated
    public Runnable getPreReportRunnable() {
        boolean[] $jacocoInit = $jacocoInit();
        Runnable b = C9989a.m46428A().mo35726b();
        $jacocoInit[14] = true;
        return b;
    }

    public int getPrimaryColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int i = C9989a.m46428A().mo35743i();
        $jacocoInit[48] = true;
        return i;
    }

    public int getRequestedOrientation() {
        boolean[] $jacocoInit = $jacocoInit();
        int m = C9989a.m46428A().mo35747m();
        $jacocoInit[93] = true;
        return m;
    }

    public long getSessionStartedAt() {
        boolean[] $jacocoInit = $jacocoInit();
        long h = C9989a.m46428A().mo35741h();
        $jacocoInit[77] = true;
        return h;
    }

    public int getSessionsCount() {
        boolean[] $jacocoInit = $jacocoInit();
        int t = C9990b.m46478A().mo35800t();
        $jacocoInit[95] = true;
        return t;
    }

    public int getStatusBarColor() {
        boolean[] $jacocoInit = $jacocoInit();
        int l = C9989a.m46428A().mo35746l();
        $jacocoInit[90] = true;
        return l;
    }

    public ArrayList<String> getTags() {
        boolean[] $jacocoInit = $jacocoInit();
        ArrayList<String> f = C9989a.m46428A().mo35737f();
        $jacocoInit[61] = true;
        return f;
    }

    public String getTagsAsString() {
        boolean[] $jacocoInit = $jacocoInit();
        StringBuilder sb = new StringBuilder();
        $jacocoInit[64] = true;
        ArrayList f = C9989a.m46428A().mo35737f();
        $jacocoInit[65] = true;
        if (f == null) {
            $jacocoInit[66] = true;
        } else if (f.size() <= 0) {
            $jacocoInit[67] = true;
        } else {
            $jacocoInit[68] = true;
            int size = f.size();
            int i = 0;
            $jacocoInit[69] = true;
            while (i < size) {
                $jacocoInit[71] = true;
                sb.append((String) f.get(i));
                if (i == size - 1) {
                    $jacocoInit[72] = true;
                } else {
                    $jacocoInit[73] = true;
                    sb.append(", ");
                    $jacocoInit[74] = true;
                }
                i++;
                $jacocoInit[75] = true;
            }
            $jacocoInit[70] = true;
        }
        String sb2 = sb.toString();
        $jacocoInit[76] = true;
        return sb2;
    }

    public InstabugColorTheme getTheme() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugColorTheme k = C9990b.m46478A().mo35791k();
        $jacocoInit[51] = true;
        return k;
    }

    public String getUserData() {
        boolean[] $jacocoInit = $jacocoInit();
        if (C9780c.m45631b().mo34869b(Feature.USER_DATA) == State.ENABLED) {
            $jacocoInit[20] = true;
            String o = C9990b.m46478A().mo35795o();
            $jacocoInit[21] = true;
            return o;
        }
        $jacocoInit[22] = true;
        return "";
    }

    public String getUuid() {
        boolean[] $jacocoInit = $jacocoInit();
        String m = C9990b.m46478A().mo35793m();
        $jacocoInit[57] = true;
        return m;
    }

    public WelcomeMessage.State getWelcomeMessageState() {
        boolean[] $jacocoInit = $jacocoInit();
        WelcomeMessage.State valueOf = WelcomeMessage.State.valueOf(C9990b.m46478A().mo35804x());
        $jacocoInit[117] = true;
        return valueOf;
    }

    public void incrementSessionsCount() {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35801u();
        $jacocoInit[96] = true;
    }

    public boolean isAppOnForeground() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean h = C9990b.m46478A().mo35787h();
        $jacocoInit[42] = true;
        return h;
    }

    public boolean isAutoScreenRecordingDenied() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean t = C9989a.m46428A().mo35754t();
        $jacocoInit[111] = true;
        return t;
    }

    public boolean isDebugEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.DEBUG;
        $jacocoInit[8] = true;
        return z;
    }

    public boolean isDeviceRegistered() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean d = C9990b.m46478A().mo35775d();
        $jacocoInit[34] = true;
        return d;
    }

    public boolean isFirstDismiss() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean j = C9990b.m46478A().mo35790j();
        $jacocoInit[46] = true;
        return j;
    }

    public boolean isFirstRun() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean e = C9990b.m46478A().mo35778e();
        $jacocoInit[36] = true;
        return e;
    }

    public boolean isOnboardingShowing() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean w = C9989a.m46428A().mo35757w();
        $jacocoInit[122] = true;
        return w;
    }

    public boolean isPromptOptionsScreenShown() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean o = C9989a.m46428A().mo35749o();
        $jacocoInit[97] = true;
        return o;
    }

    public boolean isReproStepsScreenshotEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean r = C9989a.m46428A().mo35752r();
        $jacocoInit[114] = true;
        return r;
    }

    public boolean isRequestPermissionScreenShown() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean p = C9989a.m46428A().mo35750p();
        $jacocoInit[99] = true;
        return p;
    }

    public boolean isSDKVersionSet() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean s = C9990b.m46478A().mo35799s();
        $jacocoInit[89] = true;
        return s;
    }

    public boolean isScreenCurrentlyRecorded() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean s = C9989a.m46428A().mo35753s();
        $jacocoInit[109] = true;
        return s;
    }

    public boolean isSessionEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean w = C9990b.m46478A().mo35803w();
        $jacocoInit[120] = true;
        return w;
    }

    public boolean isUserLoggedOut() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean p = C9990b.m46478A().mo35796p();
        $jacocoInit[83] = true;
        return p;
    }

    public boolean isVideoProcessorBusy() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean j = C9989a.m46428A().mo35744j();
        $jacocoInit[79] = true;
        return j;
    }

    public void resetRequestedOrientation() {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35748n();
        $jacocoInit[94] = true;
    }

    public void resetTags() {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35739g();
        $jacocoInit[63] = true;
    }

    public void setAppToken(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35764a(str);
        $jacocoInit[11] = true;
    }

    public void setAutoScreenRecordingDenied(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35738f(z);
        $jacocoInit[112] = true;
    }

    public void setAutoScreenRecordingEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35740g(z);
        $jacocoInit[103] = true;
    }

    public void setAutoScreenRecordingMaxDuration(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a A = C9989a.m46428A();
        if (i > 30000) {
            $jacocoInit[105] = true;
            i = HttpUrlConnectionNetworkFetcher.HTTP_DEFAULT_TIMEOUT;
        } else {
            $jacocoInit[106] = true;
        }
        A.mo35733d(i);
        $jacocoInit[107] = true;
    }

    public void setCurrentSDKVersion(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35785h(str);
        $jacocoInit[87] = true;
    }

    public void setCustomPlaceHolders(InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35717a(instabugCustomTextPlaceHolder);
        $jacocoInit[82] = true;
    }

    public void setDebugEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.DEBUG = z;
        $jacocoInit[9] = true;
    }

    public void setEnteredEmail(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35789i(str);
        $jacocoInit[115] = true;
    }

    public void setEnteredUsername(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35773d(str);
        $jacocoInit[55] = true;
    }

    public void setFirstRunAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35761a(j);
        $jacocoInit[39] = true;
    }

    public void setIdentifiedUserEmail(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35771c(str);
        $jacocoInit[33] = true;
    }

    public void setIdentifiedUsername(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35768b(str);
        $jacocoInit[54] = true;
    }

    public void setInstabugLocale(Locale locale) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35723a(locale);
        $jacocoInit[25] = true;
    }

    public void setIsAppOnForeground(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35772c(z);
        $jacocoInit[43] = true;
    }

    public void setIsDeviceRegistered(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35765a(z);
        $jacocoInit[35] = true;
    }

    public void setIsFirstDismiss(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35774d(z);
        $jacocoInit[47] = true;
    }

    public void setIsFirstRun(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35769b(z);
        $jacocoInit[37] = true;
    }

    public void setIsSessionEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35784g(z);
        $jacocoInit[119] = true;
    }

    @Deprecated
    public void setLastContactedAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35767b(j);
        $jacocoInit[41] = true;
    }

    public void setLastMigrationVersion(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35760a(i);
        $jacocoInit[45] = true;
    }

    public void setMD5Uuid(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35780f(str);
        $jacocoInit[60] = true;
    }

    public void setOnInvokeCallback(OnInvokeCallback onInvokeCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35720a(onInvokeCallback);
        $jacocoInit[13] = true;
    }

    public void setOnReportCreatedListener(OnReportCreatedListener onReportCreatedListener) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35721a(onReportCreatedListener);
        $jacocoInit[18] = true;
    }

    public void setOnSdkDismissedCallback(OnSdkDismissedCallback onSdkDismissedCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35718a(onSdkDismissedCallback);
        $jacocoInit[102] = true;
    }

    public void setOnSdkInvokedCallback(OnSdkInvokedCallback onSdkInvokedCallback) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35719a(onSdkInvokedCallback);
        $jacocoInit[19] = true;
    }

    public void setOnboardingShowing(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35742h(z);
        $jacocoInit[121] = true;
    }

    @Deprecated
    public void setPreReportRunnable(Runnable runnable) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35722a(runnable);
        $jacocoInit[15] = true;
    }

    public void setPrimaryColor(@C0198k int i) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35714a(i);
        $jacocoInit[49] = true;
        InvocationManager.getInstance().notifyPrimaryColorChanged();
        $jacocoInit[50] = true;
    }

    public void setPromptOptionsScreenShown(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35728b(z);
        $jacocoInit[98] = true;
    }

    public void setReproStepsScreenshotEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35734d(z);
        $jacocoInit[113] = true;
    }

    public void setRequestPermissionScreenShown(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35731c(z);
        $jacocoInit[100] = true;
    }

    public void setRequestedOrientation(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35730c(i);
        $jacocoInit[92] = true;
    }

    public void setScreenCurrentlyRecorded(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35736e(z);
        $jacocoInit[110] = true;
    }

    public void setSessionStartedAt(long j) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35715a(j);
        $jacocoInit[78] = true;
    }

    public void setShouldAutoShowOnboarding(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35786h(z);
        $jacocoInit[123] = true;
    }

    public void setShouldMakeUUIDMigrationRequest(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35781f(z);
        $jacocoInit[86] = true;
    }

    public void setStatusBarColor(int i) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35727b(i);
        $jacocoInit[91] = true;
    }

    public void setTheme(InstabugColorTheme instabugColorTheme) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35762a(instabugColorTheme);
        $jacocoInit[52] = true;
    }

    public void setUserData(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35783g(str);
        $jacocoInit[23] = true;
    }

    public void setUserLoggedOut(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35777e(z);
        $jacocoInit[84] = true;
    }

    public void setUuid(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35776e(str);
        $jacocoInit[58] = true;
    }

    public void setVideoProcessorBusy(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a.m46428A().mo35724a(z);
        $jacocoInit[80] = true;
    }

    public void setWelcomeMessageState(WelcomeMessage.State state) {
        boolean[] $jacocoInit = $jacocoInit();
        C9990b.m46478A().mo35763a(state);
        $jacocoInit[118] = true;
    }

    public boolean shouldAutoShowOnboarding() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean y = C9990b.m46478A().mo35805y();
        $jacocoInit[124] = true;
        return y;
    }

    public boolean shouldMakeUUIDMigrationRequest() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean q = C9990b.m46478A().mo35797q();
        $jacocoInit[85] = true;
        return q;
    }

    public void addExtraAttachmentFile(byte[] bArr, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        C9989a A = C9989a.m46428A();
        $jacocoInit[27] = true;
        Uri uriFromBytes = AttachmentsUtility.getUriFromBytes(Instabug.getApplicationContext(), bArr, str);
        $jacocoInit[28] = true;
        A.mo35716a(uriFromBytes, str);
        $jacocoInit[29] = true;
    }
}
