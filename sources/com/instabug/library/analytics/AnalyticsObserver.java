package com.instabug.library.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.analytics.model.Api.Parameter;
import com.instabug.library.analytics.util.C9712a;
import com.instabug.library.analytics.util.C9713b;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.settings.SettingsManager;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"URF_UNREAD_FIELD", "DLS_DEAD_LOCAL_STORE", "DLS_DEAD_LOCAL_STORE"})
public class AnalyticsObserver {
    private static transient /* synthetic */ boolean[] $jacocoData = null;
    private static String HAVE_BEEN_CLEANED = "have_been_cleaned";
    private static AnalyticsObserver INSTANCE = null;
    private static final String LAST_UPLOADED_AT = "analytics_last_uploaded";
    private LinkedHashMap<String, Api> loggingApisLinkedHashMap = new LinkedHashMap<>();
    private List<Api> sdkApisArrayList;

    /* renamed from: com.instabug.library.analytics.AnalyticsObserver$a */
    class C9707a implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25708b;

        /* renamed from: a */
        final /* synthetic */ AnalyticsObserver f25709a;

        /* renamed from: com.instabug.library.analytics.AnalyticsObserver$a$a */
        class C9708a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25710N;

            /* renamed from: a */
            final /* synthetic */ SessionState f25711a;

            /* renamed from: b */
            final /* synthetic */ C9707a f25712b;

            C9708a(C9707a aVar, SessionState sessionState) {
                boolean[] a = m45295a();
                this.f25712b = aVar;
                this.f25711a = sessionState;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45295a() {
                boolean[] zArr = f25710N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(2846305900282503236L, "com/instabug/library/analytics/AnalyticsObserver$1$1", 3);
                f25710N = a;
                return a;
            }

            public void run() {
                boolean[] a = m45295a();
                AnalyticsObserver.access$000(this.f25712b.f25709a, this.f25711a);
                a[1] = true;
                C9713b.m45314a();
                a[2] = true;
            }
        }

        C9707a(AnalyticsObserver analyticsObserver) {
            boolean[] a = m45292a();
            this.f25709a = analyticsObserver;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45292a() {
            boolean[] zArr = f25708b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-802710751238152301L, "com/instabug/library/analytics/AnalyticsObserver$1", 7);
            f25708b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34656a(SessionState sessionState) {
            boolean[] a = m45292a();
            HandlerThread handlerThread = new HandlerThread("AnalyticsObserver");
            a[1] = true;
            handlerThread.start();
            a[2] = true;
            Looper looper = handlerThread.getLooper();
            a[3] = true;
            Handler handler = new Handler(looper);
            a[4] = true;
            handler.post(new C9708a(this, sessionState));
            a[5] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45292a();
            mo34656a((SessionState) obj);
            a[6] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(6121865160207262198L, "com/instabug/library/analytics/AnalyticsObserver", 51);
        $jacocoData = a;
        return a;
    }

    static {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[50] = true;
    }

    private AnalyticsObserver() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[4] = true;
        $jacocoInit[5] = true;
        this.sdkApisArrayList = Collections.synchronizedList(new ArrayList());
        $jacocoInit[6] = true;
        C9707a aVar = new C9707a(this);
        $jacocoInit[7] = true;
        SessionStateEventBus.getInstance().subscribe(aVar);
        $jacocoInit[8] = true;
    }

    static /* synthetic */ void access$000(AnalyticsObserver analyticsObserver, SessionState sessionState) {
        boolean[] $jacocoInit = $jacocoInit();
        analyticsObserver.handleAPIsUsageWithSessionStateChanged(sessionState);
        $jacocoInit[49] = true;
    }

    private Api createApiUsageInfo(String str, boolean z, Parameter... parameterArr) {
        ArrayList arrayList;
        boolean[] $jacocoInit = $jacocoInit();
        Api api = new Api();
        $jacocoInit[24] = true;
        api.setApiName(str);
        $jacocoInit[25] = true;
        api.setDeprecated(z);
        if (parameterArr != null) {
            $jacocoInit[26] = true;
            arrayList = new ArrayList(Arrays.asList(parameterArr));
            $jacocoInit[27] = true;
        } else {
            arrayList = new ArrayList();
            $jacocoInit[28] = true;
        }
        api.setParameters(arrayList);
        $jacocoInit[29] = true;
        return api;
    }

    private String getCallerMethodName() {
        boolean[] $jacocoInit = $jacocoInit();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        $jacocoInit[30] = true;
        String methodName = stackTrace[4].getMethodName();
        $jacocoInit[31] = true;
        return methodName;
    }

    public static AnalyticsObserver getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[0] = true;
        } else {
            $jacocoInit[1] = true;
            INSTANCE = new AnalyticsObserver();
            $jacocoInit[2] = true;
        }
        AnalyticsObserver analyticsObserver = INSTANCE;
        $jacocoInit[3] = true;
        return analyticsObserver;
    }

    public static long getLastUploadedAt(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        $jacocoInit[41] = true;
        long j = sharedPreferences.getLong(LAST_UPLOADED_AT, 0);
        $jacocoInit[42] = true;
        return j;
    }

    private void handleAPIsUsageWithSessionStateChanged(SessionState sessionState) {
        boolean[] $jacocoInit = $jacocoInit();
        long sessionStartedAt = SettingsManager.getInstance().getSessionStartedAt();
        if (sessionState != SessionState.FINISH) {
            $jacocoInit[32] = true;
        } else {
            $jacocoInit[33] = true;
            ArrayList arrayList = new ArrayList();
            $jacocoInit[34] = true;
            arrayList.addAll(this.sdkApisArrayList);
            $jacocoInit[35] = true;
            C9712a.m45310a(arrayList, sessionStartedAt);
            $jacocoInit[36] = true;
            C9712a.m45310a(this.loggingApisLinkedHashMap.values(), sessionStartedAt);
            $jacocoInit[37] = true;
            this.sdkApisArrayList.clear();
            $jacocoInit[38] = true;
            this.loggingApisLinkedHashMap.clear();
            $jacocoInit[39] = true;
        }
        $jacocoInit[40] = true;
    }

    public static boolean haveBeenCleanedBefore(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        $jacocoInit[45] = true;
        boolean z = sharedPreferences.getBoolean(HAVE_BEEN_CLEANED, false);
        $jacocoInit[46] = true;
        return z;
    }

    public static void setBeingCleaned(boolean z, Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        $jacocoInit[47] = true;
        sharedPreferences.edit().putBoolean(HAVE_BEEN_CLEANED, z).apply();
        $jacocoInit[48] = true;
    }

    public static void setLastUploadedAt(long j, Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        SharedPreferences sharedPreferences = context.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0);
        $jacocoInit[43] = true;
        sharedPreferences.edit().putLong(LAST_UPLOADED_AT, j).apply();
        $jacocoInit[44] = true;
    }

    public void catchApiUsage(Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        String callerMethodName = getCallerMethodName();
        $jacocoInit[9] = true;
        catchApiUsage(callerMethodName, false, parameterArr);
        $jacocoInit[10] = true;
    }

    public void catchDeprecatedApiUsage(Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        String callerMethodName = getCallerMethodName();
        $jacocoInit[11] = true;
        catchApiUsage(callerMethodName, true, parameterArr);
        $jacocoInit[12] = true;
    }

    public void catchDeprecatedLoggingApiUsage(Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        String callerMethodName = getCallerMethodName();
        $jacocoInit[15] = true;
        catchLoggingApiUsage(callerMethodName, true, parameterArr);
        $jacocoInit[16] = true;
    }

    public void catchLoggingApiUsage(Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        String callerMethodName = getCallerMethodName();
        $jacocoInit[13] = true;
        catchLoggingApiUsage(callerMethodName, false, parameterArr);
        $jacocoInit[14] = true;
    }

    private void catchApiUsage(String str, boolean z, Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        this.sdkApisArrayList.add(createApiUsageInfo(str, z, parameterArr));
        $jacocoInit[17] = true;
    }

    private void catchLoggingApiUsage(String str, boolean z, Parameter... parameterArr) {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.loggingApisLinkedHashMap.containsKey(str)) {
            $jacocoInit[18] = true;
            Api api = (Api) this.loggingApisLinkedHashMap.get(str);
            $jacocoInit[19] = true;
            api.incrementCount();
            $jacocoInit[20] = true;
            this.loggingApisLinkedHashMap.put(str, api);
            $jacocoInit[21] = true;
        } else {
            this.loggingApisLinkedHashMap.put(str, createApiUsageInfo(str, z, parameterArr));
            $jacocoInit[22] = true;
        }
        $jacocoInit[23] = true;
    }
}
