package com.instabug.library.logging;

import android.content.Context;
import com.bogdwellers.pinchtozoom.C2945d;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.InstabugLogEntry;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import com.mrsool.utils.webservice.C11687c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugLog {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static final String INSTABUG_LOG_TAG = "INSTABUG_LOG_TAG";
    public static final String LOG_MESSAGE_DATE_FORMAT = "MM-dd HH:mm:ss.SSS";

    /* renamed from: com.instabug.library.logging.InstabugLog$a */
    enum C9927a {
        V(C11687c.f33838t0),
        D(C2945d.f10439h),
        I("i"),
        E("e"),
        W("w"),
        WTF("wtf");
        
        private final String level;

        static {
            boolean[] d;
            d[4] = true;
        }

        private C9927a(String str) {
            boolean[] d = m46189d();
            this.level = str;
            d[2] = true;
        }

        public String toString() {
            boolean[] d = m46189d();
            String str = this.level;
            d[3] = true;
            return str;
        }
    }

    /* renamed from: com.instabug.library.logging.InstabugLog$b */
    static class C9928b {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f26393d;

        /* renamed from: a */
        private String f26394a;

        /* renamed from: b */
        private C9927a f26395b;

        /* renamed from: c */
        private long f26396c;

        C9928b() {
            m46190e()[0] = true;
        }

        /* renamed from: e */
        private static /* synthetic */ boolean[] m46190e() {
            boolean[] zArr = f26393d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1805309450401952488L, "com/instabug/library/logging/InstabugLog$LogMessage", 14);
            f26393d = a;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo35265a() {
            boolean[] e = m46190e();
            String str = this.f26394a;
            e[1] = true;
            return str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C9927a mo35266b() {
            boolean[] e = m46190e();
            C9927a aVar = this.f26395b;
            e[3] = true;
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo35267c() {
            boolean[] e = m46190e();
            long j = this.f26396c;
            e[5] = true;
            return j;
        }

        /* renamed from: d */
        public JSONObject mo35268d() {
            boolean[] e = m46190e();
            JSONObject jSONObject = new JSONObject();
            try {
                e[7] = true;
                jSONObject.put(InstabugLogEntry.COLUMN_LOG_MESSAGE, mo35265a());
                e[8] = true;
                jSONObject.put("log_message_level", mo35266b().toString());
                e[9] = true;
                jSONObject.put("log_message_date", mo35267c());
                e[10] = true;
            } catch (JSONException e2) {
                e[11] = true;
                InstabugSDKLogger.m46624e(InstabugLog.class.getSimpleName(), e2.getMessage(), e2);
                e[12] = true;
            }
            e[13] = true;
            return jSONObject;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9928b mo35264a(String str) {
            boolean[] e = m46190e();
            this.f26394a = str;
            e[2] = true;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9928b mo35263a(C9927a aVar) {
            boolean[] e = m46190e();
            this.f26395b = aVar;
            e[4] = true;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C9928b mo35262a(long j) {
            boolean[] e = m46190e();
            this.f26396c = j;
            e[6] = true;
            return this;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1469973148076717203L, "com/instabug/library/logging/InstabugLog", 80);
        $jacocoData = a;
        return a;
    }

    public InstabugLog() {
        $jacocoInit()[0] = true;
    }

    private static synchronized void addLog(C9928b bVar) {
        synchronized (InstabugLog.class) {
            boolean[] $jacocoInit = $jacocoInit();
            C9930a.m46200a(bVar);
            $jacocoInit[68] = true;
        }
    }

    private static void clearLogMessages() {
        boolean[] $jacocoInit = $jacocoInit();
        C9930a.m46202b();
        $jacocoInit[69] = true;
    }

    public static void clearLogs() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchLoggingApiUsage(new Parameter[0]);
        $jacocoInit[61] = true;
        clearLogMessages();
        $jacocoInit[62] = true;
    }

    /* renamed from: d */
    public static void m46184d(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[11] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[12] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[13] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[14] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[15] = true;
        printInstabugLogs(3, trimString);
        $jacocoInit[16] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.D;
        $jacocoInit[17] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[18] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[19] = true;
        addLog(a3);
        $jacocoInit[20] = true;
    }

    /* renamed from: e */
    public static void m46185e(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[31] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[32] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[33] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[34] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[35] = true;
        printInstabugLogs(6, trimString);
        $jacocoInit[36] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.E;
        $jacocoInit[37] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[38] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[39] = true;
        addLog(a3);
        $jacocoInit[40] = true;
    }

    private static long getDate() {
        boolean[] $jacocoInit = $jacocoInit();
        long currentUTCTimeStampInMiliSeconds = InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds();
        $jacocoInit[72] = true;
        return currentUTCTimeStampInMiliSeconds;
    }

    private static String getLogMessages() {
        boolean[] $jacocoInit = $jacocoInit();
        JSONArray a = C9930a.m46199a();
        $jacocoInit[70] = true;
        String jSONArray = a.toString();
        $jacocoInit[71] = true;
        return jSONArray;
    }

    @Deprecated
    public static String getLogs(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchDeprecatedLoggingApiUsage(new Parameter[0]);
        $jacocoInit[64] = true;
        String logs = getLogs();
        $jacocoInit[65] = true;
        return logs;
    }

    /* renamed from: i */
    public static void m46186i(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[21] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[22] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[23] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[24] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[25] = true;
        printInstabugLogs(4, trimString);
        $jacocoInit[26] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.I;
        $jacocoInit[27] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[28] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[29] = true;
        addLog(a3);
        $jacocoInit[30] = true;
    }

    private static boolean isInstabugLogsDisabled() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (C9780c.m45631b().mo34869b(Feature.INSTABUG_LOGS) == State.DISABLED) {
            $jacocoInit[77] = true;
            z = true;
        } else {
            z = false;
            $jacocoInit[78] = true;
        }
        $jacocoInit[79] = true;
        return z;
    }

    private static void printInstabugLogs(int i, String str) {
        boolean[] $jacocoInit = $jacocoInit();
        if (!SettingsManager.getInstance().isDebugEnabled()) {
            $jacocoInit[73] = true;
        } else {
            $jacocoInit[74] = true;
            $jacocoInit[75] = true;
        }
        $jacocoInit[76] = true;
    }

    public static void trimLogs() {
        boolean[] $jacocoInit = $jacocoInit();
        C9930a.m46204c();
        $jacocoInit[63] = true;
    }

    /* renamed from: v */
    public static void m46187v(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[1] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[2] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[3] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[4] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[5] = true;
        printInstabugLogs(2, trimString);
        $jacocoInit[6] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.V;
        $jacocoInit[7] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[8] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[9] = true;
        addLog(a3);
        $jacocoInit[10] = true;
    }

    /* renamed from: w */
    public static void m46188w(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[41] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[42] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[43] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[44] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[45] = true;
        printInstabugLogs(5, trimString);
        $jacocoInit[46] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.W;
        $jacocoInit[47] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[48] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[49] = true;
        addLog(a3);
        $jacocoInit[50] = true;
    }

    public static void wtf(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver instance = AnalyticsObserver.getInstance();
        Parameter parameter = new Parameter();
        $jacocoInit[51] = true;
        Parameter[] parameterArr = {parameter.setName("logMessage").setType(String.class)};
        $jacocoInit[52] = true;
        instance.catchLoggingApiUsage(parameterArr);
        $jacocoInit[53] = true;
        if (isInstabugLogsDisabled()) {
            $jacocoInit[54] = true;
            return;
        }
        String trimString = StringUtility.trimString(str);
        $jacocoInit[55] = true;
        printInstabugLogs(5, trimString);
        $jacocoInit[56] = true;
        C9928b a = new C9928b().mo35264a(trimString);
        C9927a aVar = C9927a.WTF;
        $jacocoInit[57] = true;
        C9928b a2 = a.mo35263a(aVar);
        $jacocoInit[58] = true;
        C9928b a3 = a2.mo35262a(getDate());
        $jacocoInit[59] = true;
        addLog(a3);
        $jacocoInit[60] = true;
    }

    public static String getLogs() {
        boolean[] $jacocoInit = $jacocoInit();
        AnalyticsObserver.getInstance().catchLoggingApiUsage(new Parameter[0]);
        $jacocoInit[66] = true;
        String logMessages = getLogMessages();
        $jacocoInit[67] = true;
        return logMessages;
    }
}
