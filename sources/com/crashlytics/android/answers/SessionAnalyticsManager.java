package com.crashlytics.android.answers;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.crashlytics.android.answers.BackgroundManager.Listener;
import java.util.concurrent.ScheduledExecutorService;
import p212io.fabric.sdk.android.C14209a;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14258o;
import p212io.fabric.sdk.android.p493p.p495b.C14265s;
import p212io.fabric.sdk.android.p493p.p497d.C14300b;
import p212io.fabric.sdk.android.p493p.p498e.C14307b;
import p212io.fabric.sdk.android.services.network.C14385b;

class SessionAnalyticsManager implements Listener {
    static final String EXECUTOR_SERVICE = "Answers Events Handler";
    static final String ON_CRASH_ERROR_MSG = "onCrash called from main thread!!!";
    final BackgroundManager backgroundManager;
    final AnswersEventsHandler eventsHandler;
    private final long installedAt;
    final C14209a lifecycleManager;
    final AnswersPreferenceManager preferenceManager;

    SessionAnalyticsManager(AnswersEventsHandler answersEventsHandler, C14209a aVar, BackgroundManager backgroundManager2, AnswersPreferenceManager answersPreferenceManager, long j) {
        this.eventsHandler = answersEventsHandler;
        this.lifecycleManager = aVar;
        this.backgroundManager = backgroundManager2;
        this.preferenceManager = answersPreferenceManager;
        this.installedAt = j;
    }

    public static SessionAnalyticsManager build(C14225i iVar, Context context, C14265s sVar, String str, String str2, long j) {
        Context context2 = context;
        C14265s sVar2 = sVar;
        SessionMetadataCollector sessionMetadataCollector = new SessionMetadataCollector(context, sVar, str, str2);
        C14225i iVar2 = iVar;
        AnswersFilesManagerProvider answersFilesManagerProvider = new AnswersFilesManagerProvider(context, new C14300b(iVar));
        C14385b bVar = new C14385b(C14215d.m61672j());
        C14209a aVar = new C14209a(context);
        ScheduledExecutorService b = C14258o.m61865b(EXECUTOR_SERVICE);
        BackgroundManager backgroundManager2 = new BackgroundManager(b);
        AnswersEventsHandler answersEventsHandler = new AnswersEventsHandler(iVar2, context, answersFilesManagerProvider, sessionMetadataCollector, bVar, b, new FirebaseAnalyticsApiAdapter(context));
        SessionAnalyticsManager sessionAnalyticsManager = new SessionAnalyticsManager(answersEventsHandler, aVar, backgroundManager2, AnswersPreferenceManager.build(context), j);
        return sessionAnalyticsManager;
    }

    public void disable() {
        this.lifecycleManager.mo45029a();
        this.eventsHandler.disable();
    }

    public void enable() {
        this.eventsHandler.enable();
        this.lifecycleManager.mo45030a(new AnswersLifecycleCallbacks(this, this.backgroundManager));
        this.backgroundManager.registerListener(this);
        if (isFirstLaunch()) {
            onInstall(this.installedAt);
            this.preferenceManager.setAnalyticsLaunched();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean isFirstLaunch() {
        return !this.preferenceManager.hasAnalyticsLaunched();
    }

    public void onBackground() {
        C14215d.m61672j().mo45042d(Answers.TAG, "Flush events when app is backgrounded");
        this.eventsHandler.flushEvents();
    }

    public void onCrash(String str, String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C14215d.m61672j().mo45042d(Answers.TAG, "Logged crash");
            this.eventsHandler.processEventSync(SessionEvent.crashEventBuilder(str, str2));
            return;
        }
        throw new IllegalStateException(ON_CRASH_ERROR_MSG);
    }

    public void onCustom(CustomEvent customEvent) {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged custom event: ");
        sb.append(customEvent);
        j.mo45042d(Answers.TAG, sb.toString());
        this.eventsHandler.processEventAsync(SessionEvent.customEventBuilder(customEvent));
    }

    public void onError(String str) {
    }

    public void onInstall(long j) {
        C14215d.m61672j().mo45042d(Answers.TAG, "Logged install");
        this.eventsHandler.processEventAsyncAndFlush(SessionEvent.installEventBuilder(j));
    }

    public void onLifecycle(Activity activity, Type type) {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged lifecycle event: ");
        sb.append(type.name());
        j.mo45042d(Answers.TAG, sb.toString());
        this.eventsHandler.processEventAsync(SessionEvent.lifecycleEventBuilder(type, activity));
    }

    public void onPredefined(PredefinedEvent predefinedEvent) {
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Logged predefined event: ");
        sb.append(predefinedEvent);
        j.mo45042d(Answers.TAG, sb.toString());
        this.eventsHandler.processEventAsync(SessionEvent.predefinedEventBuilder(predefinedEvent));
    }

    public void setAnalyticsSettingsData(C14307b bVar, String str) {
        this.backgroundManager.setFlushOnBackground(bVar.f42189j);
        this.eventsHandler.setAnalyticsSettingsData(bVar, str);
    }
}
