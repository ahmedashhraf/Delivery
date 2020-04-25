package com.instabug.survey;

import androidx.annotation.C0193h0;
import com.instabug.library.APIBuildChecker;
import com.instabug.library.Instabug;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.util.InstabugDeprecationLogger;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.C10060a.C10064d;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class Surveys {
    private static transient /* synthetic */ boolean[] $jacocoData;

    /* renamed from: com.instabug.survey.Surveys$a */
    static class C10058a implements OnShowCallback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26770b;

        /* renamed from: a */
        final /* synthetic */ Runnable f26771a;

        C10058a(Runnable runnable) {
            boolean[] a = m46768a();
            this.f26771a = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46768a() {
            boolean[] zArr = f26770b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3030097892246882951L, "com/instabug/survey/Surveys$1", 5);
            f26770b = a;
            return a;
        }

        public void onShow() {
            boolean[] a = m46768a();
            Runnable runnable = this.f26771a;
            if (runnable == null) {
                a[1] = true;
            } else {
                a[2] = true;
                runnable.run();
                a[3] = true;
            }
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.survey.Surveys$b */
    static class C10059b implements OnDismissCallback {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26772b;

        /* renamed from: a */
        final /* synthetic */ Runnable f26773a;

        C10059b(Runnable runnable) {
            boolean[] a = m46769a();
            this.f26773a = runnable;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46769a() {
            boolean[] zArr = f26772b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2248949685645872872L, "com/instabug/survey/Surveys$2", 5);
            f26772b = a;
            return a;
        }

        public void onDismiss() {
            boolean[] a = m46769a();
            Runnable runnable = this.f26773a;
            if (runnable == null) {
                a[1] = true;
            } else {
                a[2] = true;
                runnable.run();
                a[3] = true;
            }
            a[4] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(5379825434628476946L, "com/instabug/survey/Surveys", 93);
        $jacocoData = a;
        return a;
    }

    public Surveys() {
        $jacocoInit()[0] = true;
    }

    public static List<Survey> getAvailableSurveys() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[14] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[15] = true;
        List<Survey> e = C10060a.m46770a(Instabug.getApplicationContext()).mo36111e();
        $jacocoInit[16] = true;
        return e;
    }

    public static boolean hasRespondToSurvey(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        if (str == null) {
            $jacocoInit[46] = true;
            InstabugSDKLogger.m46625i(Surveys.class.getName(), "Optin survey token is NULL");
            $jacocoInit[47] = true;
            return false;
        }
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[48] = true;
        $jacocoInit[49] = true;
        Parameter type = parameter.setName("token").setType(String.class);
        $jacocoInit[50] = true;
        Parameter[] parameterArr = {type.setValue(str)};
        $jacocoInit[51] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[52] = true;
        boolean b = C10060a.m46770a(Instabug.getApplicationContext()).mo36108b(str);
        $jacocoInit[53] = true;
        return b;
    }

    @Deprecated
    public static boolean hasValidSurveys() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[64] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[65] = true;
        boolean c = C10060a.m46770a(Instabug.getApplicationContext()).mo36109c();
        $jacocoInit[66] = true;
        return c;
    }

    @Deprecated
    public static void setAfterShowingSurveyRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[73] = true;
        $jacocoInit[74] = true;
        Parameter[] parameterArr = {parameter.setName("afterShowingSurveyRunnable").setType(Runnable.class)};
        $jacocoInit[75] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[76] = true;
        C10064d.m46814a((OnDismissCallback) new C10059b(runnable));
        $jacocoInit[77] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[78] = true;
    }

    public static void setAutoShowingEnabled(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[17] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[18] = true;
        $jacocoInit[19] = true;
        Parameter type = parameter.setName("isAutoShowingEnabled").setType(Boolean.class);
        $jacocoInit[20] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[21] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[22] = true;
        C10064d.m46816a(z);
        $jacocoInit[23] = true;
    }

    public static void setOnDismissCallback(OnDismissCallback onDismissCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[30] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[31] = true;
        $jacocoInit[32] = true;
        Parameter[] parameterArr = {parameter.setName("setOnDismissCallback").setType(Runnable.class)};
        $jacocoInit[33] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[34] = true;
        C10064d.m46814a(onDismissCallback);
        $jacocoInit[35] = true;
    }

    public static void setOnShowCallback(OnShowCallback onShowCallback) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[24] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[25] = true;
        $jacocoInit[26] = true;
        Parameter[] parameterArr = {parameter.setName("setOnShowCallback").setType(Runnable.class)};
        $jacocoInit[27] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[28] = true;
        C10064d.m46815a(onShowCallback);
        $jacocoInit[29] = true;
    }

    @Deprecated
    public static void setPreShowingSurveyRunnable(Runnable runnable) throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[67] = true;
        $jacocoInit[68] = true;
        Parameter[] parameterArr = {parameter.setName("preShowingSurveyRunnable").setType(Runnable.class)};
        $jacocoInit[69] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[70] = true;
        C10064d.m46815a((OnShowCallback) new C10058a(runnable));
        $jacocoInit[71] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[72] = true;
    }

    @Deprecated
    public static void setShouldShowSurveysWelcomeScreen(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[86] = true;
        $jacocoInit[87] = true;
        Parameter type = parameter.setName("shouldShow").setType(Boolean.class);
        $jacocoInit[88] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[89] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[90] = true;
        C10064d.m46819b(z);
        $jacocoInit[91] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[92] = true;
    }

    public static void setShouldShowWelcomeScreen(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[54] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[55] = true;
        $jacocoInit[56] = true;
        Parameter type = parameter.setName("shouldShow").setType(Boolean.class);
        $jacocoInit[57] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[58] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[59] = true;
        C10064d.m46819b(z);
        $jacocoInit[60] = true;
    }

    @Deprecated
    public static void setSurveysAutoShowing(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[79] = true;
        $jacocoInit[80] = true;
        Parameter type = parameter.setName("isSurveysAutoShowing").setType(Boolean.class);
        $jacocoInit[81] = true;
        Parameter[] parameterArr = {type.setValue(Boolean.valueOf(z))};
        $jacocoInit[82] = true;
        instance.catchDeprecatedApiUsage(parameterArr);
        $jacocoInit[83] = true;
        C10064d.m46816a(z);
        $jacocoInit[84] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[85] = true;
    }

    public static void setThresholdForReshowingSurveyAfterDismiss(int i, int i2) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[4] = true;
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[5] = true;
        Parameter name = parameter.setName("sessionsCount");
        Class cls = Integer.TYPE;
        $jacocoInit[6] = true;
        Parameter type = name.setType(cls);
        $jacocoInit[7] = true;
        Parameter parameter2 = new Parameter();
        $jacocoInit[8] = true;
        Parameter name2 = parameter2.setName("daysCount");
        Class cls2 = Integer.TYPE;
        $jacocoInit[9] = true;
        Parameter type2 = name2.setType(cls2);
        $jacocoInit[10] = true;
        Parameter[] parameterArr = {type.setValue(Integer.valueOf(i)), type2.setValue(Integer.valueOf(i2))};
        $jacocoInit[11] = true;
        instance.catchApiUsage(parameterArr);
        $jacocoInit[12] = true;
        C10064d.m46812a(i, i2);
        $jacocoInit[13] = true;
    }

    public static boolean showSurvey(@C0193h0 String str) {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[36] = true;
        if (str == null) {
            $jacocoInit[37] = true;
        } else if (String.valueOf(str).equals("null")) {
            $jacocoInit[38] = true;
        } else {
            AnalyticsObserver instance = AnalyticsObserver.getInstance();
            Parameter parameter = new Parameter();
            $jacocoInit[40] = true;
            $jacocoInit[41] = true;
            Parameter type = parameter.setName("showSurvey").setType(String.class);
            $jacocoInit[42] = true;
            Parameter[] parameterArr = {type.setValue(str)};
            $jacocoInit[43] = true;
            instance.catchApiUsage(parameterArr);
            $jacocoInit[44] = true;
            boolean a = C10060a.m46770a(Instabug.getApplicationContext()).mo36106a(str);
            $jacocoInit[45] = true;
            return a;
        }
        InstabugSDKLogger.m46625i(Surveys.class.getName(), "Optin survey token is NULL");
        $jacocoInit[39] = true;
        return false;
    }

    public static boolean showSurveyIfAvailable() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        APIBuildChecker.check();
        $jacocoInit[1] = true;
        AnalyticsObserver.getInstance().catchApiUsage(new Parameter[0]);
        $jacocoInit[2] = true;
        boolean b = C10060a.m46770a(Instabug.getApplicationContext()).mo36107b();
        $jacocoInit[3] = true;
        return b;
    }

    @Deprecated
    public static boolean showValidSurvey() throws IllegalStateException {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedApiUsage(new Parameter[0]);
        $jacocoInit[61] = true;
        InstabugDeprecationLogger.getInstance().log();
        $jacocoInit[62] = true;
        boolean b = C10060a.m46770a(Instabug.getApplicationContext()).mo36107b();
        $jacocoInit[63] = true;
        return b;
    }
}
