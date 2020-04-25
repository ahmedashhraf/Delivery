package com.crashlytics.android.core;

import android.content.Context;
import com.crashlytics.android.answers.AppMeasurementEventLogger;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14246g;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p495b.C14255l;
import p212io.fabric.sdk.android.p493p.p495b.C14258o;
import p212io.fabric.sdk.android.p493p.p495b.C14264r;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p497d.C14300b;
import p212io.fabric.sdk.android.p493p.p497d.C14303e;
import p212io.fabric.sdk.android.p493p.p498e.C14323r;
import p212io.fabric.sdk.android.p493p.p498e.C14329u;
import p212io.fabric.sdk.android.services.concurrency.C14349f;
import p212io.fabric.sdk.android.services.concurrency.C14353h;
import p212io.fabric.sdk.android.services.concurrency.C14368n;
import p212io.fabric.sdk.android.services.concurrency.C6035e;
import p212io.fabric.sdk.android.services.concurrency.UnmetDependencyException;
import p212io.fabric.sdk.android.services.network.C14385b;
import p212io.fabric.sdk.android.services.network.C14387c;
import p212io.fabric.sdk.android.services.network.C14388d;
import p212io.fabric.sdk.android.services.network.C14390f;
import p212io.fabric.sdk.android.services.network.HttpRequest;

@C6035e({CrashlyticsNdkDataProvider.class})
public class CrashlyticsCore extends C14225i<Void> {
    static final float CLS_DEFAULT_PROCESS_DELAY = 1.0f;
    static final String CRASHLYTICS_REQUIRE_BUILD_ID = "com.crashlytics.RequireBuildId";
    static final boolean CRASHLYTICS_REQUIRE_BUILD_ID_DEFAULT = true;
    static final String CRASH_MARKER_FILE_NAME = "crash_marker";
    static final int DEFAULT_MAIN_HANDLER_TIMEOUT_SEC = 4;
    private static final String INITIALIZATION_MARKER_FILE_NAME = "initialization_marker";
    static final int MAX_ATTRIBUTES = 64;
    static final int MAX_ATTRIBUTE_SIZE = 1024;
    private static final String MISSING_BUILD_ID_MSG = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.";
    private static final String PREFERENCE_STORE_NAME = "com.crashlytics.android.core.CrashlyticsCore";
    public static final String TAG = "CrashlyticsCore";
    private final ConcurrentHashMap<String, String> attributes;
    private CrashlyticsBackgroundWorker backgroundWorker;
    private CrashlyticsController controller;
    private CrashlyticsFileMarker crashMarker;
    private CrashlyticsNdkDataProvider crashlyticsNdkDataProvider;
    private float delay;
    private boolean disabled;
    private C14388d httpRequestFactory;
    /* access modifiers changed from: private */
    public CrashlyticsFileMarker initializationMarker;
    private CrashlyticsListener listener;
    private final PinningInfoProvider pinningInfo;
    private final long startTime;
    private String userEmail;
    private String userId;
    private String userName;

    public static class Builder {
        private float delay = -1.0f;
        private boolean disabled = false;
        private CrashlyticsListener listener;
        private PinningInfoProvider pinningInfoProvider;

        public CrashlyticsCore build() {
            if (this.delay < 0.0f) {
                this.delay = 1.0f;
            }
            return new CrashlyticsCore(this.delay, this.listener, this.pinningInfoProvider, this.disabled);
        }

        public Builder delay(float f) {
            if (f <= 0.0f) {
                throw new IllegalArgumentException("delay must be greater than 0");
            } else if (this.delay <= 0.0f) {
                this.delay = f;
                return this;
            } else {
                throw new IllegalStateException("delay already set.");
            }
        }

        public Builder disabled(boolean z) {
            this.disabled = z;
            return this;
        }

        public Builder listener(CrashlyticsListener crashlyticsListener) {
            if (crashlyticsListener == null) {
                throw new IllegalArgumentException("listener must not be null.");
            } else if (this.listener == null) {
                this.listener = crashlyticsListener;
                return this;
            } else {
                throw new IllegalStateException("listener already set.");
            }
        }

        @Deprecated
        public Builder pinningInfo(PinningInfoProvider pinningInfoProvider2) {
            if (pinningInfoProvider2 == null) {
                throw new IllegalArgumentException("pinningInfoProvider must not be null.");
            } else if (this.pinningInfoProvider == null) {
                this.pinningInfoProvider = pinningInfoProvider2;
                return this;
            } else {
                throw new IllegalStateException("pinningInfoProvider already set.");
            }
        }
    }

    private static final class CrashMarkerCheck implements Callable<Boolean> {
        private final CrashlyticsFileMarker crashMarker;

        public CrashMarkerCheck(CrashlyticsFileMarker crashlyticsFileMarker) {
            this.crashMarker = crashlyticsFileMarker;
        }

        public Boolean call() throws Exception {
            if (!this.crashMarker.isPresent()) {
                return Boolean.FALSE;
            }
            C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Found previous crash marker.");
            this.crashMarker.remove();
            return Boolean.TRUE;
        }
    }

    private static final class NoOpListener implements CrashlyticsListener {
        private NoOpListener() {
        }

        public void crashlyticsDidDetectCrashDuringPreviousExecution() {
        }
    }

    public CrashlyticsCore() {
        this(1.0f, null, null, false);
    }

    private void checkForPreviousCrash() {
        if (Boolean.TRUE.equals((Boolean) this.backgroundWorker.submitAndWait(new CrashMarkerCheck(this.crashMarker)))) {
            try {
                this.listener.crashlyticsDidDetectCrashDuringPreviousExecution();
            } catch (Exception e) {
                C14215d.m61672j().mo45045e(TAG, "Exception thrown by CrashlyticsListener while notifying of previous crash.", e);
            }
        }
    }

    private void doLog(int i, String str, String str2) {
        if (!this.disabled && ensureFabricWithCalled("prior to logging messages.")) {
            this.controller.writeToLog(System.currentTimeMillis() - this.startTime, formatLogMessage(i, str, str2));
        }
    }

    private static boolean ensureFabricWithCalled(String str) {
        CrashlyticsCore instance = getInstance();
        if (instance != null && instance.controller != null) {
            return true;
        }
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Crashlytics must be initialized by calling Fabric.with(Context) ");
        sb.append(str);
        j.mo45045e(TAG, sb.toString(), null);
        return false;
    }

    private void finishInitSynchronously() {
        C33121 r0 = new C14353h<Void>() {
            public C14349f getPriority() {
                return C14349f.IMMEDIATE;
            }

            public Void call() throws Exception {
                return CrashlyticsCore.this.doInBackground();
            }
        };
        for (C14368n addDependency : getDependencies()) {
            r0.addDependency(addDependency);
        }
        Future submit = getFabric().mo45062e().submit(r0);
        C14228l j = C14215d.m61672j();
        String str = TAG;
        j.mo45042d(str, "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            C14215d.m61672j().mo45045e(str, "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            C14215d.m61672j().mo45045e(str, "Problem encountered during Crashlytics initialization.", e2);
        } catch (TimeoutException e3) {
            C14215d.m61672j().mo45045e(str, "Crashlytics timed out during initialization.", e3);
        }
    }

    private static String formatLogMessage(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(C14248i.m61800a(i));
        sb.append("/");
        sb.append(str);
        sb.append(C3868i.f12248b);
        sb.append(str2);
        return sb.toString();
    }

    public static CrashlyticsCore getInstance() {
        return (CrashlyticsCore) C14215d.m61662a(CrashlyticsCore.class);
    }

    static boolean isBuildIdValid(String str, boolean z) {
        if (!z) {
            C14215d.m61672j().mo45042d(TAG, "Configured not to require a build ID.");
            return true;
        } else if (!C14248i.m61832c(str)) {
            return true;
        } else {
            return false;
        }
    }

    private static String sanitizeAttribute(String str) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    public void crash() {
        new CrashTest().indexOutOfBounds();
    }

    /* access modifiers changed from: 0000 */
    public void createCrashMarker() {
        this.crashMarker.create();
    }

    /* access modifiers changed from: 0000 */
    public boolean didPreviousInitializationFail() {
        return this.initializationMarker.isPresent();
    }

    /* access modifiers changed from: 0000 */
    public Map<String, String> getAttributes() {
        return Collections.unmodifiableMap(this.attributes);
    }

    /* access modifiers changed from: 0000 */
    public CrashlyticsController getController() {
        return this.controller;
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    /* access modifiers changed from: 0000 */
    public CrashlyticsNdkData getNativeCrashData() {
        CrashlyticsNdkDataProvider crashlyticsNdkDataProvider2 = this.crashlyticsNdkDataProvider;
        if (crashlyticsNdkDataProvider2 != null) {
            return crashlyticsNdkDataProvider2.getCrashlyticsNdkData();
        }
        return null;
    }

    public PinningInfoProvider getPinningInfoProvider() {
        if (!this.disabled) {
            return this.pinningInfo;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String getUserEmail() {
        if (getIdManager().mo45160a()) {
            return this.userEmail;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String getUserIdentifier() {
        if (getIdManager().mo45160a()) {
            return this.userId;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public String getUserName() {
        if (getIdManager().mo45160a()) {
            return this.userName;
        }
        return null;
    }

    public String getVersion() {
        return "2.7.0.33";
    }

    /* access modifiers changed from: 0000 */
    public boolean internalVerifyPinning(URL url) {
        if (getPinningInfoProvider() == null) {
            return false;
        }
        HttpRequest a = this.httpRequestFactory.mo45500a(C14387c.GET, url.toString());
        ((HttpsURLConnection) a.mo45487w()).setInstanceFollowRedirects(false);
        a.mo45471n();
        return true;
    }

    public void log(String str) {
        doLog(3, TAG, str);
    }

    public void logException(Throwable th) {
        if (this.disabled || !ensureFabricWithCalled("prior to logging exceptions.")) {
            return;
        }
        if (th == null) {
            C14215d.m61672j().log(5, TAG, "Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.controller.writeNonFatalException(Thread.currentThread(), th);
        }
    }

    /* access modifiers changed from: 0000 */
    public void markInitializationComplete() {
        this.backgroundWorker.submit((Callable<T>) new Callable<Boolean>() {
            public Boolean call() throws Exception {
                String str = CrashlyticsCore.TAG;
                try {
                    boolean remove = CrashlyticsCore.this.initializationMarker.remove();
                    C14228l j = C14215d.m61672j();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Initialization marker file removed: ");
                    sb.append(remove);
                    j.mo45042d(str, sb.toString());
                    return Boolean.valueOf(remove);
                } catch (Exception e) {
                    C14215d.m61672j().mo45045e(str, "Problem encountered deleting Crashlytics initialization marker.", e);
                    return Boolean.valueOf(false);
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    public void markInitializationStarted() {
        this.backgroundWorker.submitAndWait(new Callable<Void>() {
            public Void call() throws Exception {
                CrashlyticsCore.this.initializationMarker.create();
                C14215d.m61672j().mo45042d(CrashlyticsCore.TAG, "Initialization marker file created.");
                return null;
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean onPreExecute() {
        return onPreExecute(super.getContext());
    }

    public void setBool(String str, boolean z) {
        setString(str, Boolean.toString(z));
    }

    /* access modifiers changed from: 0000 */
    public void setCrashlyticsNdkDataProvider(CrashlyticsNdkDataProvider crashlyticsNdkDataProvider2) {
        this.crashlyticsNdkDataProvider = crashlyticsNdkDataProvider2;
    }

    public void setDouble(String str, double d) {
        setString(str, Double.toString(d));
    }

    public void setFloat(String str, float f) {
        setString(str, Float.toString(f));
    }

    public void setInt(String str, int i) {
        setString(str, Integer.toString(i));
    }

    @Deprecated
    public synchronized void setListener(CrashlyticsListener crashlyticsListener) {
        C14215d.m61672j().mo45051w(TAG, "Use of setListener is deprecated.");
        if (crashlyticsListener != null) {
            this.listener = crashlyticsListener;
        } else {
            throw new IllegalArgumentException("listener must not be null.");
        }
    }

    public void setLong(String str, long j) {
        setString(str, Long.toString(j));
    }

    public void setString(String str, String str2) {
        String str3;
        if (!this.disabled && ensureFabricWithCalled("prior to setting keys.")) {
            String str4 = TAG;
            if (str == null) {
                Context context = getContext();
                if (context == null || !C14248i.m61842j(context)) {
                    C14215d.m61672j().mo45045e(str4, "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
            String sanitizeAttribute = sanitizeAttribute(str);
            if (this.attributes.size() < 64 || this.attributes.containsKey(sanitizeAttribute)) {
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = sanitizeAttribute(str2);
                }
                this.attributes.put(sanitizeAttribute, str3);
                this.controller.cacheKeyData(this.attributes);
                return;
            }
            C14215d.m61672j().mo45042d(str4, "Exceeded maximum number of custom attributes (64)");
        }
    }

    public void setUserEmail(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userEmail = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserIdentifier(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userId = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public void setUserName(String str) {
        if (!this.disabled && ensureFabricWithCalled("prior to setting user data.")) {
            this.userName = sanitizeAttribute(str);
            this.controller.cacheUserData(this.userId, this.userName, this.userEmail);
        }
    }

    public boolean verifyPinning(URL url) {
        try {
            return internalVerifyPinning(url);
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(TAG, "Could not verify SSL pinning", e);
            return false;
        }
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z) {
        this(f, crashlyticsListener, pinningInfoProvider, z, C14258o.m61862a("Crashlytics Exception Handler"));
    }

    /* access modifiers changed from: protected */
    public Void doInBackground() {
        String str = TAG;
        markInitializationStarted();
        this.controller.cleanInvalidTempFiles();
        try {
            this.controller.registerDevicePowerStateListener();
            C14329u a = C14323r.m62045e().mo45273a();
            if (a == null) {
                C14215d.m61672j().mo45051w(str, "Received null settings, skipping report submission!");
                markInitializationComplete();
                return null;
            }
            this.controller.registerAnalyticsEventListener(a);
            if (!a.f42270d.f42239c) {
                C14215d.m61672j().mo45042d(str, "Collection of crash reports disabled in Crashlytics settings.");
                markInitializationComplete();
                return null;
            } else if (!C14255l.m61854a(getContext()).mo45147a()) {
                C14215d.m61672j().mo45042d(str, "Automatic collection of crash reports disabled by Firebase settings.");
                markInitializationComplete();
                return null;
            } else {
                CrashlyticsNdkData nativeCrashData = getNativeCrashData();
                if (nativeCrashData != null && !this.controller.finalizeNativeReport(nativeCrashData)) {
                    C14215d.m61672j().mo45042d(str, "Could not finalize previous NDK sessions.");
                }
                if (!this.controller.finalizeSessions(a.f42268b)) {
                    C14215d.m61672j().mo45042d(str, "Could not finalize previous sessions.");
                }
                this.controller.submitAllReports(this.delay, a);
                markInitializationComplete();
                return null;
            }
        } catch (Exception e) {
            C14215d.m61672j().mo45045e(str, "Crashlytics encountered a problem during asynchronous initialization.", e);
        } catch (Throwable th) {
            markInitializationComplete();
            throw th;
        }
    }

    public void log(int i, String str, String str2) {
        doLog(i, str, str2);
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(str2);
        j.mo45040a(i, sb2, sb3.toString(), true);
    }

    /* access modifiers changed from: 0000 */
    public boolean onPreExecute(Context context) {
        Context context2 = context;
        boolean a = C14255l.m61854a(context).mo45147a();
        String str = TAG;
        if (!a) {
            C14215d.m61672j().mo45042d(str, "Crashlytics is disabled, because data collection is disabled by Firebase.");
            this.disabled = true;
        }
        if (this.disabled) {
            return false;
        }
        String d = new C14246g().mo45138d(context2);
        if (d == null) {
            return false;
        }
        String o = C14248i.m61847o(context);
        if (isBuildIdValid(o, C14248i.m61819a(context2, CRASHLYTICS_REQUIRE_BUILD_ID, true))) {
            try {
                C14228l j = C14215d.m61672j();
                StringBuilder sb = new StringBuilder();
                sb.append("Initializing Crashlytics Core ");
                sb.append(getVersion());
                j.mo45046i(str, sb.toString());
                C14300b bVar = new C14300b(this);
                this.crashMarker = new CrashlyticsFileMarker(CRASH_MARKER_FILE_NAME, bVar);
                this.initializationMarker = new CrashlyticsFileMarker(INITIALIZATION_MARKER_FILE_NAME, bVar);
                PreferenceManager create = PreferenceManager.create(new C14303e(getContext(), PREFERENCE_STORE_NAME), this);
                C14390f crashlyticsPinningInfoProvider = this.pinningInfo != null ? new CrashlyticsPinningInfoProvider(this.pinningInfo) : null;
                this.httpRequestFactory = new C14385b(C14215d.m61672j());
                this.httpRequestFactory.mo45503a(crashlyticsPinningInfoProvider);
                C14265s idManager = getIdManager();
                AppData create2 = AppData.create(context2, idManager, d, o);
                CrashlyticsController crashlyticsController = r1;
                CrashlyticsController crashlyticsController2 = new CrashlyticsController(this, this.backgroundWorker, this.httpRequestFactory, idManager, create, bVar, create2, new ResourceUnityVersionProvider(context2, new ManifestUnityVersionProvider(context2, create2.packageName)), new DefaultAppMeasurementEventListenerRegistrar(this), AppMeasurementEventLogger.getEventLogger(context));
                this.controller = crashlyticsController;
                boolean didPreviousInitializationFail = didPreviousInitializationFail();
                checkForPreviousCrash();
                this.controller.enableExceptionHandling(Thread.getDefaultUncaughtExceptionHandler(), new C14264r().mo45158e(context2));
                if (!didPreviousInitializationFail || !C14248i.m61826b(context)) {
                    C14215d.m61672j().mo45042d(str, "Exception handling initialization successful");
                    return true;
                }
                C14215d.m61672j().mo45042d(str, "Crashlytics did not finish previous background initialization. Initializing synchronously.");
                finishInitSynchronously();
                return false;
            } catch (Exception e) {
                C14215d.m61672j().mo45045e(str, "Crashlytics was not started due to an exception during initialization", e);
                this.controller = null;
                return false;
            }
        } else {
            throw new UnmetDependencyException(MISSING_BUILD_ID_MSG);
        }
    }

    CrashlyticsCore(float f, CrashlyticsListener crashlyticsListener, PinningInfoProvider pinningInfoProvider, boolean z, ExecutorService executorService) {
        this.userId = null;
        this.userEmail = null;
        this.userName = null;
        this.delay = f;
        if (crashlyticsListener == null) {
            crashlyticsListener = new NoOpListener();
        }
        this.listener = crashlyticsListener;
        this.pinningInfo = pinningInfoProvider;
        this.disabled = z;
        this.backgroundWorker = new CrashlyticsBackgroundWorker(executorService);
        this.attributes = new ConcurrentHashMap<>();
        this.startTime = System.currentTimeMillis();
    }
}
