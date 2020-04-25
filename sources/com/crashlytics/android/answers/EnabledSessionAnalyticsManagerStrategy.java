package com.crashlytics.android.answers;

import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.Enabled;
import p212io.fabric.sdk.android.C14215d;
import p212io.fabric.sdk.android.C14225i;
import p212io.fabric.sdk.android.C14228l;
import p212io.fabric.sdk.android.p493p.p495b.C14246g;
import p212io.fabric.sdk.android.p493p.p495b.C14248i;
import p212io.fabric.sdk.android.p493p.p496c.C14295k;
import p212io.fabric.sdk.android.p493p.p496c.C14298n;
import p212io.fabric.sdk.android.p493p.p498e.C14307b;
import p212io.fabric.sdk.android.services.network.C14388d;

class EnabledSessionAnalyticsManagerStrategy implements SessionAnalyticsManagerStrategy {
    static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    C14246g apiKey = new C14246g();
    private final Context context;
    boolean customEventsEnabled = true;
    EventFilter eventFilter = new KeepAllEventFilter();
    private final ScheduledExecutorService executorService;
    private final SessionAnalyticsFilesManager filesManager;
    C14295k filesSender;
    private final FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter;
    boolean forwardToFirebaseAnalyticsEnabled = false;
    private final C14388d httpRequestFactory;
    boolean includePurchaseEventsInForwardedEvents = false;
    private final C14225i kit;
    final SessionEventMetadata metadata;
    boolean predefinedEventsEnabled = true;
    private final AtomicReference<ScheduledFuture<?>> rolloverFutureRef = new AtomicReference<>();
    volatile int rolloverIntervalSeconds = -1;

    public EnabledSessionAnalyticsManagerStrategy(C14225i iVar, Context context2, ScheduledExecutorService scheduledExecutorService, SessionAnalyticsFilesManager sessionAnalyticsFilesManager, C14388d dVar, SessionEventMetadata sessionEventMetadata, FirebaseAnalyticsApiAdapter firebaseAnalyticsApiAdapter2) {
        this.kit = iVar;
        this.context = context2;
        this.executorService = scheduledExecutorService;
        this.filesManager = sessionAnalyticsFilesManager;
        this.httpRequestFactory = dVar;
        this.metadata = sessionEventMetadata;
        this.firebaseAnalyticsApiAdapter = firebaseAnalyticsApiAdapter2;
    }

    public void cancelTimeBasedFileRollOver() {
        if (this.rolloverFutureRef.get() != null) {
            C14248i.m61829c(this.context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture) this.rolloverFutureRef.get()).cancel(false);
            this.rolloverFutureRef.set(null);
        }
    }

    public void deleteAllEvents() {
        this.filesManager.deleteAllEventsFiles();
    }

    public void processEvent(Builder builder) {
        SessionEvent build = builder.build(this.metadata);
        boolean z = this.customEventsEnabled;
        String str = Answers.TAG;
        if (!z && Type.CUSTOM.equals(build.type)) {
            C14228l j = C14215d.m61672j();
            StringBuilder sb = new StringBuilder();
            sb.append("Custom events tracking disabled - skipping event: ");
            sb.append(build);
            j.mo45042d(str, sb.toString());
        } else if (!this.predefinedEventsEnabled && Type.PREDEFINED.equals(build.type)) {
            C14228l j2 = C14215d.m61672j();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Predefined events tracking disabled - skipping event: ");
            sb2.append(build);
            j2.mo45042d(str, sb2.toString());
        } else if (this.eventFilter.skipEvent(build)) {
            C14228l j3 = C14215d.m61672j();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipping filtered event: ");
            sb3.append(build);
            j3.mo45042d(str, sb3.toString());
        } else {
            try {
                this.filesManager.writeEvent(build);
            } catch (IOException e) {
                C14228l j4 = C14215d.m61672j();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Failed to write event: ");
                sb4.append(build);
                j4.mo45045e(str, sb4.toString(), e);
            }
            scheduleTimeBasedRollOverIfNeeded();
            boolean z2 = Type.CUSTOM.equals(build.type) || Type.PREDEFINED.equals(build.type);
            boolean equals = "purchase".equals(build.predefinedType);
            if (this.forwardToFirebaseAnalyticsEnabled && z2 && (!equals || this.includePurchaseEventsInForwardedEvents)) {
                try {
                    this.firebaseAnalyticsApiAdapter.processEvent(build);
                } catch (Exception e2) {
                    C14228l j5 = C14215d.m61672j();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Failed to map event to Firebase: ");
                    sb5.append(build);
                    j5.mo45045e(str, sb5.toString(), e2);
                }
            }
        }
    }

    public boolean rollFileOver() {
        try {
            return this.filesManager.rollFileOver();
        } catch (IOException e) {
            C14248i.m61813a(this.context, "Failed to roll file over.", (Throwable) e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void scheduleTimeBasedFileRollOver(long j, long j2) {
        if (this.rolloverFutureRef.get() == null) {
            C14298n nVar = new C14298n(this.context, this);
            Context context2 = this.context;
            StringBuilder sb = new StringBuilder();
            sb.append("Scheduling time based file roll over every ");
            sb.append(j2);
            sb.append(" seconds");
            C14248i.m61829c(context2, sb.toString());
            try {
                this.rolloverFutureRef.set(this.executorService.scheduleAtFixedRate(nVar, j, j2, TimeUnit.SECONDS));
            } catch (RejectedExecutionException e) {
                C14248i.m61813a(this.context, "Failed to schedule time based file roll over", (Throwable) e);
            }
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded() {
        if (this.rolloverIntervalSeconds != -1) {
            scheduleTimeBasedFileRollOver((long) this.rolloverIntervalSeconds, (long) this.rolloverIntervalSeconds);
        }
    }

    public void sendEvents() {
        if (this.filesSender == null) {
            C14248i.m61829c(this.context, "skipping files send because we don't yet know the target endpoint");
            return;
        }
        C14248i.m61829c(this.context, "Sending all files");
        List batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
        int i = 0;
        while (true) {
            try {
                if (batchOfFilesToSend.size() <= 0) {
                    break;
                }
                C14248i.m61829c(this.context, String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(batchOfFilesToSend.size())}));
                boolean send = this.filesSender.send(batchOfFilesToSend);
                if (send) {
                    i += batchOfFilesToSend.size();
                    this.filesManager.deleteSentFiles(batchOfFilesToSend);
                }
                if (!send) {
                    break;
                }
                batchOfFilesToSend = this.filesManager.getBatchOfFilesToSend();
            } catch (Exception e) {
                Context context2 = this.context;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to send batch of analytics files to server: ");
                sb.append(e.getMessage());
                C14248i.m61813a(context2, sb.toString(), (Throwable) e);
            }
        }
        if (i == 0) {
            this.filesManager.deleteOldestInRollOverIfOverMax();
        }
    }

    public void setAnalyticsSettingsData(C14307b bVar, String str) {
        SessionAnalyticsFilesSender sessionAnalyticsFilesSender = new SessionAnalyticsFilesSender(this.kit, str, bVar.f42180a, this.httpRequestFactory, this.apiKey.mo45138d(this.context));
        this.filesSender = AnswersRetryFilesSender.build(sessionAnalyticsFilesSender);
        this.filesManager.setAnalyticsSettingsData(bVar);
        this.forwardToFirebaseAnalyticsEnabled = bVar.f42185f;
        this.includePurchaseEventsInForwardedEvents = bVar.f42186g;
        C14228l j = C14215d.m61672j();
        StringBuilder sb = new StringBuilder();
        sb.append("Firebase analytics forwarding ");
        boolean z = this.forwardToFirebaseAnalyticsEnabled;
        String str2 = Enabled.ELEMENT;
        String str3 = "disabled";
        sb.append(z ? str2 : str3);
        String sb2 = sb.toString();
        String str4 = Answers.TAG;
        j.mo45042d(str4, sb2);
        C14228l j2 = C14215d.m61672j();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Firebase analytics including purchase events ");
        sb3.append(this.includePurchaseEventsInForwardedEvents ? str2 : str3);
        j2.mo45042d(str4, sb3.toString());
        this.customEventsEnabled = bVar.f42187h;
        C14228l j3 = C14215d.m61672j();
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Custom event tracking ");
        sb4.append(this.customEventsEnabled ? str2 : str3);
        j3.mo45042d(str4, sb4.toString());
        this.predefinedEventsEnabled = bVar.f42188i;
        C14228l j4 = C14215d.m61672j();
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Predefined event tracking ");
        if (!this.predefinedEventsEnabled) {
            str2 = str3;
        }
        sb5.append(str2);
        j4.mo45042d(str4, sb5.toString());
        if (bVar.f42190k > 1) {
            C14215d.m61672j().mo45042d(str4, "Event sampling enabled");
            this.eventFilter = new SamplingEventFilter(bVar.f42190k);
        }
        this.rolloverIntervalSeconds = bVar.f42181b;
        scheduleTimeBasedFileRollOver(0, (long) this.rolloverIntervalSeconds);
    }
}
