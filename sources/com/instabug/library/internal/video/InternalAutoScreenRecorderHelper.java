package com.instabug.library.internal.video;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugState;
import com.instabug.library._InstabugActivity;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.internal.video.AutoScreenRecordingService.Action;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import java.io.File;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InternalAutoScreenRecorderHelper implements AutoScreenRecordingContract {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InternalAutoScreenRecorderHelper INSTANCE;
    private C12314c activityLifeCycleDisposable;
    private AutoScreenRecordingFileHolder fileHolder;
    private boolean isCrashOccurred = false;
    private C12314c sessionDisposable;

    /* renamed from: com.instabug.library.internal.video.InternalAutoScreenRecorderHelper$a */
    class C9850a implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26097b;

        /* renamed from: a */
        final /* synthetic */ InternalAutoScreenRecorderHelper f26098a;

        C9850a(InternalAutoScreenRecorderHelper internalAutoScreenRecorderHelper) {
            boolean[] a = m45878a();
            this.f26098a = internalAutoScreenRecorderHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45878a() {
            boolean[] zArr = f26097b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-430644279001728076L, "com/instabug/library/internal/video/InternalAutoScreenRecorderHelper$1", 10);
            f26097b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35068a(SessionState sessionState) {
            boolean[] a = m45878a();
            if (sessionState != SessionState.FINISH) {
                a[1] = true;
            } else if (this.f26098a.isCrashOccurred()) {
                a[2] = true;
            } else {
                a[3] = true;
                AutoScreenRecordingEventBus instance = AutoScreenRecordingEventBus.getInstance();
                Action action = Action.STOP_DELETE;
                a[4] = true;
                instance.post(action);
                a[5] = true;
                SettingsManager.getInstance().setAutoScreenRecordingDenied(false);
                a[6] = true;
                InternalAutoScreenRecorderHelper.access$000(this.f26098a);
                a[7] = true;
            }
            a[8] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45878a();
            mo35068a((SessionState) obj);
            a[9] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.InternalAutoScreenRecorderHelper$b */
    class C9851b implements C12331g<ActivityLifeCycleEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26099b;

        /* renamed from: a */
        final /* synthetic */ InternalAutoScreenRecorderHelper f26100a;

        /* renamed from: com.instabug.library.internal.video.InternalAutoScreenRecorderHelper$b$a */
        class C9852a implements Runnable {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26101b;

            /* renamed from: a */
            final /* synthetic */ C9851b f26102a;

            C9852a(C9851b bVar) {
                boolean[] a = m45884a();
                this.f26102a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45884a() {
                boolean[] zArr = f26101b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-7943599138111111280L, "com/instabug/library/internal/video/InternalAutoScreenRecorderHelper$2$1", 2);
                f26101b = a;
                return a;
            }

            public void run() {
                boolean[] a = m45884a();
                InternalAutoScreenRecorderHelper.getInstance().start();
                a[1] = true;
            }
        }

        C9851b(InternalAutoScreenRecorderHelper internalAutoScreenRecorderHelper) {
            boolean[] a = m45881a();
            this.f26100a = internalAutoScreenRecorderHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45881a() {
            boolean[] zArr = f26099b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4674135610899229515L, "com/instabug/library/internal/video/InternalAutoScreenRecorderHelper$2", 8);
            f26099b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35069a(ActivityLifeCycleEvent activityLifeCycleEvent) {
            boolean[] a = m45881a();
            if (activityLifeCycleEvent != ActivityLifeCycleEvent.RESUMED) {
                a[1] = true;
            } else {
                a[2] = true;
                InternalAutoScreenRecorderHelper.access$100(this.f26100a);
                a[3] = true;
                Handler handler = new Handler();
                a[4] = true;
                handler.postDelayed(new C9852a(this), 700);
                a[5] = true;
            }
            a[6] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45881a();
            mo35069a((ActivityLifeCycleEvent) obj);
            a[7] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1646418367334517198L, "com/instabug/library/internal/video/InternalAutoScreenRecorderHelper", 55);
        $jacocoData = a;
        return a;
    }

    public InternalAutoScreenRecorderHelper() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[4] = true;
        this.fileHolder = new AutoScreenRecordingFileHolder();
        $jacocoInit[5] = true;
        subscribeToSessionEvents();
        $jacocoInit[6] = true;
        subscribeToActivityLifeCycleEvents();
        $jacocoInit[7] = true;
    }

    static /* synthetic */ void access$000(InternalAutoScreenRecorderHelper internalAutoScreenRecorderHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        internalAutoScreenRecorderHelper.unsubscribeFromSessionEvents();
        $jacocoInit[53] = true;
    }

    static /* synthetic */ void access$100(InternalAutoScreenRecorderHelper internalAutoScreenRecorderHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        internalAutoScreenRecorderHelper.subscribeToSessionEvents();
        $jacocoInit[54] = true;
    }

    public static InternalAutoScreenRecorderHelper getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[0] = true;
        } else {
            $jacocoInit[1] = true;
            INSTANCE = new InternalAutoScreenRecorderHelper();
            $jacocoInit[2] = true;
        }
        InternalAutoScreenRecorderHelper internalAutoScreenRecorderHelper = INSTANCE;
        $jacocoInit[3] = true;
        return internalAutoScreenRecorderHelper;
    }

    private void subscribeToActivityLifeCycleEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.activityLifeCycleDisposable;
        if (cVar == null) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            if (!cVar.mo41878d()) {
                $jacocoInit[23] = true;
                $jacocoInit[27] = true;
            }
            $jacocoInit[24] = true;
        }
        CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
        C9851b bVar = new C9851b(this);
        $jacocoInit[25] = true;
        this.activityLifeCycleDisposable = instance.subscribe(bVar);
        $jacocoInit[26] = true;
        $jacocoInit[27] = true;
    }

    private void subscribeToSessionEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.sessionDisposable;
        if (cVar == null) {
            $jacocoInit[15] = true;
        } else if (!cVar.mo41878d()) {
            $jacocoInit[16] = true;
            $jacocoInit[20] = true;
        } else {
            $jacocoInit[17] = true;
        }
        SessionStateEventBus instance = SessionStateEventBus.getInstance();
        C9850a aVar = new C9850a(this);
        $jacocoInit[18] = true;
        this.sessionDisposable = instance.subscribe(aVar);
        $jacocoInit[19] = true;
        $jacocoInit[20] = true;
    }

    private void unsubscribeFromSessionEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.sessionDisposable.mo41878d()) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            this.sessionDisposable.dispose();
            $jacocoInit[30] = true;
        }
        $jacocoInit[31] = true;
    }

    public void clear() {
        boolean[] $jacocoInit = $jacocoInit();
        this.fileHolder.clear();
        $jacocoInit[11] = true;
    }

    public void delete() {
        boolean[] $jacocoInit = $jacocoInit();
        this.fileHolder.delete();
        $jacocoInit[10] = true;
    }

    public Uri getAutoScreenRecordingFileUri() {
        boolean[] $jacocoInit = $jacocoInit();
        Uri autoScreenRecordingFileUri = this.fileHolder.getAutoScreenRecordingFileUri();
        $jacocoInit[8] = true;
        return autoScreenRecordingFileUri;
    }

    public boolean isCrashOccurred() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean z = this.isCrashOccurred;
        $jacocoInit[13] = true;
        return z;
    }

    public boolean isEnabled() {
        boolean[] $jacocoInit = $jacocoInit();
        boolean autoScreenRecordingEnabled = SettingsManager.getInstance().autoScreenRecordingEnabled();
        $jacocoInit[12] = true;
        return autoScreenRecordingEnabled;
    }

    public void setAutoScreenRecordingFile(File file) {
        boolean[] $jacocoInit = $jacocoInit();
        this.fileHolder.setAutoScreenRecordingFile(file);
        $jacocoInit[9] = true;
    }

    public void setCrashOccurred(boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        this.isCrashOccurred = z;
        $jacocoInit[14] = true;
    }

    public void start() {
        boolean[] $jacocoInit = $jacocoInit();
        if (VERSION.SDK_INT < 21) {
            $jacocoInit[32] = true;
            return;
        }
        if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
            $jacocoInit[33] = true;
        } else {
            $jacocoInit[34] = true;
            if (SettingsManager.getInstance().isAutoScreenRecordingDenied()) {
                $jacocoInit[35] = true;
            } else {
                $jacocoInit[36] = true;
                if (!isEnabled()) {
                    $jacocoInit[37] = true;
                } else {
                    InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
                    $jacocoInit[39] = true;
                    Activity targetActivity = instance.getTargetActivity();
                    if (targetActivity == null) {
                        $jacocoInit[40] = true;
                    } else if (targetActivity instanceof _InstabugActivity) {
                        $jacocoInit[41] = true;
                    } else {
                        $jacocoInit[42] = true;
                        if (!SettingsManager.getInstance().isAppOnForeground()) {
                            $jacocoInit[43] = true;
                        } else {
                            $jacocoInit[44] = true;
                            if (Instabug.getState() != InstabugState.ENABLED) {
                                $jacocoInit[45] = true;
                            } else {
                                $jacocoInit[46] = true;
                                if (InstabugCore.isForegroundBusy()) {
                                    $jacocoInit[47] = true;
                                } else {
                                    $jacocoInit[48] = true;
                                    Intent intent = new Intent(targetActivity, RequestPermissionActivity.class);
                                    $jacocoInit[49] = true;
                                    targetActivity.startActivity(intent);
                                    $jacocoInit[50] = true;
                                    targetActivity.overridePendingTransition(0, 0);
                                    $jacocoInit[51] = true;
                                }
                            }
                        }
                    }
                    $jacocoInit[52] = true;
                    return;
                }
            }
        }
        $jacocoInit[38] = true;
    }
}
