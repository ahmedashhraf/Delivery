package com.instabug.library.internal.video;

import android.net.Uri;
import android.os.Handler;
import com.instabug.library.Instabug;
import com.instabug.library.PresentationManager;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.video.C9865c.C9869c;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.p390a.C9890c;
import com.instabug.library.invocation.p390a.C9890c.C9901j;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.C10023d;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import p195e.p196a.C5923b0;
import p195e.p196a.p442e1.C12246b;
import p195e.p196a.p442e1.C12265i;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InternalScreenRecordHelper implements C9869c, C9901j {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private static InternalScreenRecordHelper INSTANCE;
    private boolean canStopRecording;
    private C9890c fab;
    private C12314c sessionDisposable;
    private final C12265i<Boolean> stopSubject = C12246b.m55135q(Boolean.valueOf(false));

    /* renamed from: com.instabug.library.internal.video.InternalScreenRecordHelper$a */
    class C9853a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26103b;

        /* renamed from: a */
        final /* synthetic */ InternalScreenRecordHelper f26104a;

        C9853a(InternalScreenRecordHelper internalScreenRecordHelper) {
            boolean[] a = m45885a();
            this.f26104a = internalScreenRecordHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45885a() {
            boolean[] zArr = f26103b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1751717005861937975L, "com/instabug/library/internal/video/InternalScreenRecordHelper$1", 5);
            f26103b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45885a();
            if (!this.f26104a.isRecording()) {
                a[1] = true;
            } else {
                a[2] = true;
                InternalScreenRecordHelper.access$000(this.f26104a).mo33453a(Boolean.valueOf(true));
                a[3] = true;
            }
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.InternalScreenRecordHelper$b */
    class C9854b implements C12331g<Boolean> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26105b;

        /* renamed from: a */
        final /* synthetic */ InternalScreenRecordHelper f26106a;

        C9854b(InternalScreenRecordHelper internalScreenRecordHelper) {
            boolean[] a = m45886a();
            this.f26106a = internalScreenRecordHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45886a() {
            boolean[] zArr = f26105b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7353202540558321971L, "com/instabug/library/internal/video/InternalScreenRecordHelper$2", 3);
            f26105b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35081a(Boolean bool) {
            boolean[] a = m45886a();
            InternalScreenRecordHelper.access$102(this.f26106a, bool.booleanValue());
            a[1] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45886a();
            mo35081a((Boolean) obj);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.InternalScreenRecordHelper$c */
    class C9855c implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26107b;

        /* renamed from: a */
        final /* synthetic */ InternalScreenRecordHelper f26108a;

        C9855c(InternalScreenRecordHelper internalScreenRecordHelper) {
            boolean[] a = m45889a();
            this.f26108a = internalScreenRecordHelper;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45889a() {
            boolean[] zArr = f26107b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5575736078406176161L, "com/instabug/library/internal/video/InternalScreenRecordHelper$3", 7);
            f26107b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35082a(SessionState sessionState) {
            boolean[] a = m45889a();
            if (sessionState != SessionState.FINISH) {
                a[1] = true;
            } else {
                a[2] = true;
                InternalScreenRecordHelper.access$000(this.f26108a).mo33453a(Boolean.valueOf(false));
                a[3] = true;
                this.f26108a.cancel();
                a[4] = true;
            }
            a[5] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45889a();
            mo35082a((SessionState) obj);
            a[6] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7763698768621447035L, "com/instabug/library/internal/video/InternalScreenRecordHelper", 68);
        $jacocoData = a;
        return a;
    }

    private InternalScreenRecordHelper() {
        boolean[] $jacocoInit = $jacocoInit();
        $jacocoInit[0] = true;
        $jacocoInit[1] = true;
    }

    static /* synthetic */ C12265i access$000(InternalScreenRecordHelper internalScreenRecordHelper) {
        boolean[] $jacocoInit = $jacocoInit();
        C12265i<Boolean> iVar = internalScreenRecordHelper.stopSubject;
        $jacocoInit[66] = true;
        return iVar;
    }

    static /* synthetic */ boolean access$102(InternalScreenRecordHelper internalScreenRecordHelper, boolean z) {
        boolean[] $jacocoInit = $jacocoInit();
        internalScreenRecordHelper.canStopRecording = z;
        $jacocoInit[67] = true;
        return z;
    }

    public static InternalScreenRecordHelper getInstance() {
        boolean[] $jacocoInit = $jacocoInit();
        if (INSTANCE != null) {
            $jacocoInit[2] = true;
        } else {
            $jacocoInit[3] = true;
            INSTANCE = new InternalScreenRecordHelper();
            $jacocoInit[4] = true;
        }
        InternalScreenRecordHelper internalScreenRecordHelper = INSTANCE;
        $jacocoInit[5] = true;
        return internalScreenRecordHelper;
    }

    private void startSnapping() {
        boolean[] $jacocoInit = $jacocoInit();
        if (C9865c.m45929d().mo35112c()) {
            $jacocoInit[38] = true;
        } else {
            $jacocoInit[39] = true;
            C9865c.m45929d().mo35108a((C9869c) this);
            $jacocoInit[40] = true;
        }
        $jacocoInit[41] = true;
    }

    private void subscribeToSessionEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.sessionDisposable;
        if (cVar == null) {
            $jacocoInit[50] = true;
        } else if (!cVar.mo41878d()) {
            $jacocoInit[51] = true;
            $jacocoInit[55] = true;
        } else {
            $jacocoInit[52] = true;
        }
        SessionStateEventBus instance = SessionStateEventBus.getInstance();
        C9855c cVar2 = new C9855c(this);
        $jacocoInit[53] = true;
        this.sessionDisposable = instance.subscribe(cVar2);
        $jacocoInit[54] = true;
        $jacocoInit[55] = true;
    }

    private void unsubscribeFromSessionEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        if (this.sessionDisposable.mo41878d()) {
            $jacocoInit[56] = true;
        } else {
            $jacocoInit[57] = true;
            this.sessionDisposable.dispose();
            $jacocoInit[58] = true;
        }
        $jacocoInit[59] = true;
    }

    public void cancel() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!isRecording()) {
            $jacocoInit[28] = true;
        } else {
            $jacocoInit[29] = true;
            C9865c.m45929d().mo35111b();
            $jacocoInit[30] = true;
            C10023d.m46637b(Instabug.getApplicationContext());
            C9890c cVar = this.fab;
            if (cVar == null) {
                $jacocoInit[31] = true;
            } else {
                $jacocoInit[32] = true;
                cVar.mo35195b();
                $jacocoInit[33] = true;
                this.fab.mo35194a();
                $jacocoInit[34] = true;
            }
            InstabugSDKLogger.m46622d(this, "Cancelling screen recording");
            $jacocoInit[35] = true;
            SettingsManager.getInstance().setVideoProcessorBusy(false);
            $jacocoInit[36] = true;
        }
        $jacocoInit[37] = true;
    }

    public C5923b0<Boolean> getIsStopableObservable() {
        boolean[] $jacocoInit = $jacocoInit();
        C5923b0 p = this.stopSubject.mo24074p();
        C9854b bVar = new C9854b(this);
        $jacocoInit[48] = true;
        C5923b0<Boolean> f = p.mo24002f((C12331g<? super T>) bVar);
        $jacocoInit[49] = true;
        return f;
    }

    public void init() {
        boolean[] $jacocoInit = $jacocoInit();
        InvocationManager.getInstance().switchOffInvocation();
        $jacocoInit[6] = true;
        PresentationManager.getInstance().setInInstabugContext(true);
        C9890c cVar = this.fab;
        if (cVar == null) {
            $jacocoInit[7] = true;
            this.fab = new C9890c(this);
            $jacocoInit[8] = true;
            this.fab.mo35194a();
            $jacocoInit[9] = true;
        } else {
            cVar.mo35194a();
            $jacocoInit[10] = true;
        }
        $jacocoInit[11] = true;
    }

    public boolean isRecording() {
        boolean z;
        boolean[] $jacocoInit = $jacocoInit();
        if (C9865c.m45929d().mo35112c()) {
            $jacocoInit[42] = true;
        } else {
            $jacocoInit[43] = true;
            if (SettingsManager.getInstance().isVideoProcessorBusy()) {
                $jacocoInit[44] = true;
            } else {
                z = false;
                $jacocoInit[46] = true;
                $jacocoInit[47] = true;
                return z;
            }
        }
        $jacocoInit[45] = true;
        z = true;
        $jacocoInit[47] = true;
        return z;
    }

    public void onFramesCapturingFinished(String str) {
        boolean[] $jacocoInit = $jacocoInit();
        File videoFile = AttachmentsUtility.getVideoFile(Instabug.getApplicationContext());
        $jacocoInit[60] = true;
        Uri fromFile = Uri.fromFile(videoFile);
        $jacocoInit[61] = true;
        ScreenRecordingEventBus instance = ScreenRecordingEventBus.getInstance();
        ScreenRecordEvent screenRecordEvent = new ScreenRecordEvent(0, fromFile);
        $jacocoInit[62] = true;
        instance.post(screenRecordEvent);
        $jacocoInit[63] = true;
        InstabugSDKLogger.m46625i(this, "Encoding...");
        $jacocoInit[64] = true;
        VideoProcessingService.m45899a(Instabug.getApplicationContext(), videoFile.getPath(), str);
        $jacocoInit[65] = true;
    }

    public void pause() {
        $jacocoInit()[15] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        C9890c cVar = this.fab;
        if (cVar == null) {
            $jacocoInit[21] = true;
        } else {
            $jacocoInit[22] = true;
            cVar.mo35195b();
            $jacocoInit[23] = true;
        }
        unsubscribeFromSessionEvents();
        $jacocoInit[24] = true;
        InvocationManager.getInstance().switchOnInvocation();
        $jacocoInit[25] = true;
        C10023d.m46637b(Instabug.getApplicationContext());
        $jacocoInit[26] = true;
        this.stopSubject.mo33453a(Boolean.valueOf(false));
        $jacocoInit[27] = true;
    }

    public void start() {
        boolean[] $jacocoInit = $jacocoInit();
        subscribeToSessionEvents();
        $jacocoInit[12] = true;
        startSnapping();
        $jacocoInit[13] = true;
        new Handler().postDelayed(new C9853a(this), 1000);
        $jacocoInit[14] = true;
    }

    public void stop() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!this.canStopRecording) {
            $jacocoInit[16] = true;
        } else {
            $jacocoInit[17] = true;
            C9865c.m45929d().mo35107a();
            $jacocoInit[18] = true;
            release();
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
    }
}
