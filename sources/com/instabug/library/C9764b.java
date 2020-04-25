package com.instabug.library;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.instabug.library.C9780c.C9784d;
import com.instabug.library.broadcast.C9778a;
import com.instabug.library.broadcast.C9778a.C9779a;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Feature;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.C9789a;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.OnDiskCache;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.internal.storage.cache.p389db.C9842a;
import com.instabug.library.internal.storage.cache.p389db.DatabaseManager;
import com.instabug.library.internal.video.AutoScreenRecordingService.Action;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.logging.C9932b;
import com.instabug.library.logging.InstabugLog;
import com.instabug.library.migration.C9937c;
import com.instabug.library.model.C9948b;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.network.p395f.p396a.C9973a;
import com.instabug.library.network.worker.uploader.InstabugSessionUploaderService;
import com.instabug.library.p391j.C9922a;
import com.instabug.library.p397ui.onboarding.OnboardingActivity;
import com.instabug.library.p397ui.onboarding.WelcomeMessage.State;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.user.C10009a;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.OrientationUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.ref.WeakReference;
import p053b.p072g.p073b.C2128a;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: com.instabug.library.b */
/* compiled from: InstabugDelegate */
class C9764b implements C9779a {

    /* renamed from: R */
    private static transient /* synthetic */ boolean[] f25911R;

    /* renamed from: N */
    private C12314c f25912N;

    /* renamed from: O */
    private C12314c f25913O;

    /* renamed from: P */
    private final C9778a f25914P = new C9778a(this);

    /* renamed from: Q */
    private Handler f25915Q;

    /* renamed from: a */
    private WeakReference<Context> f25916a;

    /* renamed from: b */
    private C12314c f25917b;

    /* renamed from: com.instabug.library.b$a */
    /* compiled from: InstabugDelegate */
    class C9765a implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25918b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25919a;

        C9765a(C9764b bVar) {
            boolean[] a = m45601a();
            this.f25919a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45601a() {
            boolean[] zArr = f25918b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6506075393314947635L, "com/instabug/library/InstabugDelegate$9", 8);
            f25918b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34842a(SDKCoreEvent sDKCoreEvent) throws Exception {
            boolean[] a = m45601a();
            if (!sDKCoreEvent.getType().equalsIgnoreCase("features")) {
                a[1] = true;
            } else {
                a[2] = true;
                if (!sDKCoreEvent.getValue().equals(Feature.VALUE_FETCHED)) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    this.f25919a.mo34833c();
                    a[5] = true;
                }
            }
            a[6] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45601a();
            mo34842a((SDKCoreEvent) obj);
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.b$b */
    /* compiled from: InstabugDelegate */
    class C9766b implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25920b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25921a;

        C9766b(C9764b bVar) {
            boolean[] a = m45604a();
            this.f25921a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45604a() {
            boolean[] zArr = f25920b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5163676096804335032L, "com/instabug/library/InstabugDelegate$1", 11);
            f25920b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34843a(SessionState sessionState) {
            boolean[] a = m45604a();
            if (sessionState.equals(SessionState.FINISH)) {
                a[1] = true;
                C9764b.m45558a(this.f25921a);
                a[2] = true;
                C9764b.m45563b(this.f25921a);
                a[3] = true;
            } else if (!sessionState.equals(SessionState.START)) {
                a[4] = true;
            } else {
                a[5] = true;
                this.f25921a.mo34837g();
                a[6] = true;
                this.f25921a.mo34833c();
                a[7] = true;
                C9764b.m45565c(this.f25921a);
                a[8] = true;
            }
            C9764b.m45566d(this.f25921a);
            a[9] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45604a();
            mo34843a((SessionState) obj);
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.library.b$c */
    /* compiled from: InstabugDelegate */
    class C9767c implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25922N;

        /* renamed from: a */
        final /* synthetic */ State f25923a;

        /* renamed from: b */
        final /* synthetic */ C9764b f25924b;

        C9767c(C9764b bVar, State state) {
            boolean[] a = m45607a();
            this.f25924b = bVar;
            this.f25923a = state;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45607a() {
            boolean[] zArr = f25922N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5201537998871637728L, "com/instabug/library/InstabugDelegate$10", 8);
            f25922N = a;
            return a;
        }

        public void run() {
            boolean[] a = m45607a();
            Activity targetActivity = InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
            a[1] = true;
            if (targetActivity == null) {
                a[2] = true;
            } else if (targetActivity.isFinishing()) {
                a[3] = true;
            } else {
                a[4] = true;
                Intent a2 = OnboardingActivity.m46548a(targetActivity, this.f25923a);
                a[5] = true;
                targetActivity.startActivity(a2);
                a[6] = true;
            }
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.b$d */
    /* compiled from: InstabugDelegate */
    class C9768d implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25925b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25926a;

        C9768d(C9764b bVar) {
            boolean[] a = m45608a();
            this.f25926a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45608a() {
            boolean[] zArr = f25925b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-3813295568048879216L, "com/instabug/library/InstabugDelegate$2", 3);
            f25925b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45608a();
            C9932b.m46214a();
            a[1] = true;
            InstabugLog.trimLogs();
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.library.b$e */
    /* compiled from: InstabugDelegate */
    class C9769e implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25927b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25928a;

        C9769e(C9764b bVar) {
            boolean[] a = m45609a();
            this.f25928a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45609a() {
            boolean[] zArr = f25927b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6572890289988601934L, "com/instabug/library/InstabugDelegate$3", 2);
            f25927b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45609a();
            C9764b.m45567e(this.f25928a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.b$f */
    /* compiled from: InstabugDelegate */
    class C9770f implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25929b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25930a;

        C9770f(C9764b bVar) {
            boolean[] a = m45610a();
            this.f25930a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45610a() {
            boolean[] zArr = f25929b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1072097436419517889L, "com/instabug/library/InstabugDelegate$4", 9);
            f25929b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45610a();
            InstabugSDKLogger.m46622d(this, "Dumping caches");
            a[1] = true;
            UserAttributesCacheManager.saveCacheToDisk();
            a[2] = true;
            if (C9764b.m45568f(this.f25930a) == null) {
                a[3] = true;
            } else {
                a[4] = true;
                Context context = (Context) C9764b.m45568f(this.f25930a).get();
                if (context == null) {
                    a[5] = true;
                } else {
                    a[6] = true;
                    AssetsCacheManager.cleanUpCache(context);
                    a[7] = true;
                }
            }
            a[8] = true;
        }
    }

    /* renamed from: com.instabug.library.b$g */
    /* compiled from: InstabugDelegate */
    class C9771g implements C12331g<Throwable> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25931b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25932a;

        C9771g(C9764b bVar) {
            boolean[] a = m45611a();
            this.f25932a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45611a() {
            boolean[] zArr = f25931b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4722998684473461164L, "com/instabug/library/InstabugDelegate$5", 6);
            f25931b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34848a(Throwable th) {
            boolean[] a = m45611a();
            if (th.getMessage() == null) {
                a[1] = true;
            } else {
                a[2] = true;
                InstabugSDKLogger.m46623e("InstabugDelegate", th.getMessage());
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45611a();
            mo34848a((Throwable) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.b$h */
    /* compiled from: InstabugDelegate */
    class C9772h implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25933b;

        /* renamed from: a */
        final /* synthetic */ C9764b f25934a;

        C9772h(C9764b bVar) {
            boolean[] a = m45614a();
            this.f25934a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45614a() {
            boolean[] zArr = f25933b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1613143678207850876L, "com/instabug/library/InstabugDelegate$6", 11);
            f25933b = a;
            return a;
        }

        public void run() {
            boolean[] a = m45614a();
            if (SettingsManager.getInstance().getWelcomeMessageState() == State.DISABLED) {
                a[1] = true;
            } else {
                a[2] = true;
                if (InvocationManager.getInstance().getCurrentInstabugInvocationEvents().length <= 0) {
                    a[3] = true;
                } else {
                    C9764b bVar = this.f25934a;
                    a[4] = true;
                    if (!C9764b.m45569g(bVar)) {
                        a[5] = true;
                    } else {
                        a[6] = true;
                        if (!SettingsManager.getInstance().shouldAutoShowOnboarding()) {
                            a[7] = true;
                        } else {
                            a[8] = true;
                            this.f25934a.mo34830a(SettingsManager.getInstance().getWelcomeMessageState());
                            a[9] = true;
                        }
                    }
                }
            }
            a[10] = true;
        }
    }

    /* renamed from: com.instabug.library.b$i */
    /* compiled from: InstabugDelegate */
    class C9773i implements C12331g<SDKCoreEvent> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25935N;

        /* renamed from: a */
        final /* synthetic */ State f25936a;

        /* renamed from: b */
        final /* synthetic */ C9764b f25937b;

        C9773i(C9764b bVar, State state) {
            boolean[] a = m45615a();
            this.f25937b = bVar;
            this.f25936a = state;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45615a() {
            boolean[] zArr = f25935N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2911938116238181994L, "com/instabug/library/InstabugDelegate$7", 15);
            f25935N = a;
            return a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34850a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r6) {
            /*
                r5 = this;
                boolean[] r0 = m45615a()
                java.lang.String r1 = r6.getType()
                int r2 = r1.hashCode()
                r3 = 1
                r4 = 1984987798(0x76508296, float:1.0572718E33)
                if (r2 == r4) goto L_0x0015
                r0[r3] = r3
                goto L_0x0020
            L_0x0015:
                java.lang.String r2 = "session"
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0022
                r1 = 2
                r0[r1] = r3
            L_0x0020:
                r1 = -1
                goto L_0x0026
            L_0x0022:
                r1 = 0
                r2 = 3
                r0[r2] = r3
            L_0x0026:
                if (r1 == 0) goto L_0x002c
                r6 = 4
                r0[r6] = r3
                goto L_0x0073
            L_0x002c:
                java.lang.String r6 = r6.getValue()
                r1 = 5
                r0[r1] = r3
                java.lang.String r1 = "started"
                boolean r6 = r6.equalsIgnoreCase(r1)
                if (r6 != 0) goto L_0x003f
                r6 = 6
                r0[r6] = r3
                goto L_0x004c
            L_0x003f:
                r6 = 7
                r0[r6] = r3
                boolean r6 = com.instabug.library.core.InstabugCore.isForegroundBusy()
                if (r6 == 0) goto L_0x0051
                r6 = 8
                r0[r6] = r3
            L_0x004c:
                r6 = 10
                r0[r6] = r3
                return
            L_0x0051:
                r6 = 9
                r0[r6] = r3
                com.instabug.library.b r6 = r5.f25937b
                com.instabug.library.ui.onboarding.WelcomeMessage$State r1 = r5.f25936a
                com.instabug.library.C9764b.m45560a(r6, r1)
                com.instabug.library.b r6 = r5.f25937b
                e.a.u0.c r6 = com.instabug.library.C9764b.m45570h(r6)
                r6.dispose()
                r6 = 11
                r0[r6] = r3
                com.instabug.library.b r6 = r5.f25937b
                r1 = 0
                com.instabug.library.C9764b.m45557a(r6, r1)
                r6 = 12
                r0[r6] = r3
            L_0x0073:
                r6 = 13
                r0[r6] = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.C9764b.C9773i.mo34850a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent):void");
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45615a();
            mo34850a((SDKCoreEvent) obj);
            a[14] = true;
        }
    }

    /* renamed from: com.instabug.library.b$j */
    /* compiled from: InstabugDelegate */
    class C9774j implements C12331g<SDKCoreEvent> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f25938N;

        /* renamed from: a */
        final /* synthetic */ State f25939a;

        /* renamed from: b */
        final /* synthetic */ C9764b f25940b;

        /* renamed from: com.instabug.library.b$j$a */
        /* compiled from: InstabugDelegate */
        class C9775a implements Runnable {

            /* renamed from: N */
            private static transient /* synthetic */ boolean[] f25941N;

            /* renamed from: a */
            final /* synthetic */ SDKCoreEvent f25942a;

            /* renamed from: b */
            final /* synthetic */ C9774j f25943b;

            C9775a(C9774j jVar, SDKCoreEvent sDKCoreEvent) {
                boolean[] a = m45621a();
                this.f25943b = jVar;
                this.f25942a = sDKCoreEvent;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m45621a() {
                boolean[] zArr = f25941N;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8220823865569331342L, "com/instabug/library/InstabugDelegate$8$1", 3);
                f25941N = a;
                return a;
            }

            public void run() {
                boolean[] a = m45621a();
                C9774j jVar = this.f25943b;
                C9764b.m45559a(jVar.f25940b, this.f25942a, jVar.f25939a);
                a[1] = true;
                C9764b.m45571i(this.f25943b.f25940b).removeCallbacks(this);
                a[2] = true;
            }
        }

        C9774j(C9764b bVar, State state) {
            boolean[] a = m45618a();
            this.f25940b = bVar;
            this.f25939a = state;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45618a() {
            boolean[] zArr = f25938N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6070432393903303115L, "com/instabug/library/InstabugDelegate$8", 4);
            f25938N = a;
            return a;
        }

        /* renamed from: a */
        public void mo34851a(SDKCoreEvent sDKCoreEvent) {
            boolean[] a = m45618a();
            C9764b.m45556a(this.f25940b, new Handler());
            a[1] = true;
            C9764b.m45571i(this.f25940b).postDelayed(new C9775a(this, sDKCoreEvent), 1000);
            a[2] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45618a();
            mo34851a((SDKCoreEvent) obj);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.library.b$k */
    /* compiled from: InstabugUncaughtExceptionHandler */
    public class C9776k implements UncaughtExceptionHandler {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25944b;

        /* renamed from: a */
        UncaughtExceptionHandler f25945a = Thread.getDefaultUncaughtExceptionHandler();

        public C9776k() {
            boolean[] a = m45624a();
            a[0] = true;
            a[1] = true;
        }

        /* renamed from: a */
        private String m45622a(Throwable th) {
            boolean[] a = m45624a();
            StringWriter stringWriter = new StringWriter();
            a[10] = true;
            PrintWriter printWriter = new PrintWriter(stringWriter, true);
            a[11] = true;
            th.printStackTrace(printWriter);
            a[12] = true;
            String stringBuffer = stringWriter.getBuffer().toString();
            a[13] = true;
            return stringBuffer;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45624a() {
            boolean[] zArr = f25944b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8674090200317841057L, "com/instabug/library/crash/InstabugUncaughtExceptionHandler", 15);
            f25944b = a;
            return a;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            boolean[] a = m45624a();
            if (!InternalAutoScreenRecorderHelper.getInstance().isEnabled()) {
                a[2] = true;
            } else {
                a[3] = true;
                InternalAutoScreenRecorderHelper.getInstance().setCrashOccurred(true);
                a[4] = true;
            }
            C9780c.m45631b().mo34864a(Instabug.getApplicationContext());
            a[5] = true;
            if (m45623a(m45622a(th))) {
                a[6] = true;
            } else {
                a[7] = true;
                C9810g.m45766e().mo34933b();
                a[8] = true;
            }
            this.f25945a.uncaughtException(thread, th);
            a[9] = true;
        }

        /* renamed from: a */
        private boolean m45623a(String str) {
            boolean[] a = m45624a();
            boolean contains = str.contains("com.facebook.react.modules");
            a[14] = true;
            return contains;
        }
    }

    public C9764b(Context context) {
        boolean[] o = m45575o();
        o[0] = true;
        o[1] = true;
        this.f25916a = new WeakReference<>(context);
        o[2] = true;
        C9789a.m45659a(context);
        o[3] = true;
        m45579s();
        o[4] = true;
    }

    /* renamed from: A */
    private void m45552A() {
        boolean[] o = m45575o();
        C9937c.m46223a(mo34840j());
        o[102] = true;
    }

    /* renamed from: B */
    private void m45553B() {
        boolean[] o = m45575o();
        StringBuilder sb = new StringBuilder();
        sb.append("Checking if should show welcome message, firstRun ");
        o[103] = true;
        sb.append(SettingsManager.getInstance().isFirstRun());
        sb.append(", SettingsManager.getInstance().getWelcomeMessageState() ");
        o[104] = true;
        sb.append(SettingsManager.getInstance().getWelcomeMessageState());
        String sb2 = sb.toString();
        o[105] = true;
        InstabugSDKLogger.m46626v(this, sb2);
        o[106] = true;
        if (!SettingsManager.getInstance().isFirstRun()) {
            o[107] = true;
        } else {
            o[108] = true;
            InstabugSDKLogger.m46626v(this, "Showing Intro Message");
            o[109] = true;
            Handler handler = new Handler();
            o[110] = true;
            handler.postDelayed(new C9772h(this), 10000);
            o[111] = true;
        }
        o[112] = true;
    }

    /* renamed from: C */
    private boolean m45554C() {
        boolean[] o = m45575o();
        InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
        if (currentInstabugInvocationEvents.length != 1) {
            o[113] = true;
        } else if (currentInstabugInvocationEvents[0] != InstabugInvocationEvent.NONE) {
            o[114] = true;
        } else {
            o[115] = true;
            return false;
        }
        o[116] = true;
        return true;
    }

    /* renamed from: D */
    private void m45555D() {
        boolean[] o = m45575o();
        this.f25912N.dispose();
        this.f25912N = null;
        o[140] = true;
    }

    /* renamed from: a */
    static /* synthetic */ Handler m45556a(C9764b bVar, Handler handler) {
        boolean[] o = m45575o();
        bVar.f25915Q = handler;
        o[196] = true;
        return handler;
    }

    /* renamed from: b */
    static /* synthetic */ void m45563b(C9764b bVar) {
        boolean[] o = m45575o();
        bVar.m45555D();
        o[187] = true;
    }

    /* renamed from: c */
    static /* synthetic */ void m45565c(C9764b bVar) {
        boolean[] o = m45575o();
        bVar.m45577q();
        o[188] = true;
    }

    /* renamed from: d */
    static /* synthetic */ void m45566d(C9764b bVar) {
        boolean[] o = m45575o();
        bVar.m45582v();
        o[189] = true;
    }

    /* renamed from: e */
    static /* synthetic */ void m45567e(C9764b bVar) {
        boolean[] o = m45575o();
        bVar.m45581u();
        o[190] = true;
    }

    /* renamed from: f */
    static /* synthetic */ WeakReference m45568f(C9764b bVar) {
        boolean[] o = m45575o();
        WeakReference<Context> weakReference = bVar.f25916a;
        o[191] = true;
        return weakReference;
    }

    /* renamed from: g */
    static /* synthetic */ boolean m45569g(C9764b bVar) {
        boolean[] o = m45575o();
        boolean C = bVar.m45554C();
        o[192] = true;
        return C;
    }

    /* renamed from: h */
    static /* synthetic */ C12314c m45570h(C9764b bVar) {
        boolean[] o = m45575o();
        C12314c cVar = bVar.f25913O;
        o[194] = true;
        return cVar;
    }

    /* renamed from: i */
    static /* synthetic */ Handler m45571i(C9764b bVar) {
        boolean[] o = m45575o();
        Handler handler = bVar.f25915Q;
        o[198] = true;
        return handler;
    }

    /* renamed from: l */
    private void m45572l() {
        boolean[] o = m45575o();
        InstabugSDKLogger.m46622d(this, "Stopping Instabug SDK invocation listeners");
        o[172] = true;
        InvocationManager.getInstance().sleep();
        o[173] = true;
    }

    /* renamed from: m */
    private void m45573m() {
        boolean[] o = m45575o();
        InternalAutoScreenRecorderHelper.getInstance().start();
        o[184] = true;
    }

    /* renamed from: n */
    private void m45574n() {
        boolean[] o = m45575o();
        C9922a.m46167e().mo35252a();
        o[185] = true;
    }

    /* renamed from: o */
    private static /* synthetic */ boolean[] m45575o() {
        boolean[] zArr = f25911R;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-544639225471427919L, "com/instabug/library/InstabugDelegate", C13959t.f40913i3);
        f25911R = a;
        return a;
    }

    /* renamed from: p */
    private void m45576p() {
        boolean[] o = m45575o();
        SessionStateEventBus instance = SessionStateEventBus.getInstance();
        C9766b bVar = new C9766b(this);
        o[25] = true;
        this.f25917b = instance.subscribe(bVar);
        o[26] = true;
    }

    /* renamed from: q */
    private void m45577q() {
        boolean[] o = m45575o();
        HandlerThread handlerThread = new HandlerThread("trimDbTablesThread");
        o[27] = true;
        handlerThread.start();
        o[28] = true;
        Looper looper = handlerThread.getLooper();
        o[29] = true;
        Handler handler = new Handler(looper);
        o[30] = true;
        handler.post(new C9768d(this));
        o[31] = true;
    }

    /* renamed from: r */
    private void m45578r() {
        boolean[] o = m45575o();
        C12314c cVar = this.f25917b;
        if (cVar == null) {
            o[32] = true;
        } else {
            o[33] = true;
            if (cVar.mo41878d()) {
                o[34] = true;
            } else {
                o[35] = true;
                this.f25917b.dispose();
                o[36] = true;
            }
        }
        o[37] = true;
    }

    /* renamed from: s */
    private void m45579s() {
        boolean[] o = m45575o();
        HandlerThread handlerThread = new HandlerThread("prepareCachesThread");
        o[38] = true;
        handlerThread.start();
        o[39] = true;
        Looper looper = handlerThread.getLooper();
        o[40] = true;
        Handler handler = new Handler(looper);
        o[41] = true;
        handler.post(new C9769e(this));
        o[42] = true;
    }

    /* renamed from: t */
    private void m45580t() {
        boolean[] o = m45575o();
        HandlerThread handlerThread = new HandlerThread("dumpingCachesThread");
        o[43] = true;
        handlerThread.start();
        o[44] = true;
        Looper looper = handlerThread.getLooper();
        o[45] = true;
        Handler handler = new Handler(looper);
        o[46] = true;
        handler.post(new C9770f(this));
        o[47] = true;
    }

    /* renamed from: u */
    private void m45581u() {
        boolean[] o = m45575o();
        InstabugSDKLogger.m46626v(this, "Creating UserAttributes disk cache");
        o[48] = true;
        OnDiskCache onDiskCache = new OnDiskCache(mo34840j(), UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_KEY, UserAttributesCacheManager.USER_ATTRIBUTES_DISK_CACHE_FILE_NAME, C9948b.class);
        o[49] = true;
        CacheManager.getInstance().addCache(onDiskCache);
        o[50] = true;
    }

    /* renamed from: v */
    private void m45582v() {
        boolean[] o = m45575o();
        WeakReference<Context> weakReference = this.f25916a;
        if (weakReference == null) {
            o[51] = true;
        } else {
            o[52] = true;
            Context context = (Context) weakReference.get();
            if (context == null) {
                o[53] = true;
            } else {
                o[54] = true;
                C9973a.m46379a(context);
                o[55] = true;
                InstabugSessionUploaderService.m46382a(context, new Intent(context, InstabugSessionUploaderService.class));
                o[56] = true;
            }
        }
        o[57] = true;
    }

    /* renamed from: w */
    private void m45583w() {
        boolean[] o = m45575o();
        Thread.setDefaultUncaughtExceptionHandler(new C9776k());
        o[92] = true;
    }

    /* renamed from: x */
    private void m45584x() {
        boolean[] o = m45575o();
        C10009a.m46603g();
        o[97] = true;
    }

    /* renamed from: y */
    private void m45585y() {
        boolean[] o = m45575o();
        InstabugSDKLogger.m46626v(this, "initialize Instabug InvocationMode Manager");
        o[98] = true;
        InvocationManager.init();
        o[99] = true;
    }

    /* renamed from: z */
    private void m45586z() {
        boolean[] o = m45575o();
        C9842a aVar = new C9842a(mo34840j());
        o[100] = true;
        DatabaseManager.init(aVar);
        o[101] = true;
    }

    /* renamed from: j */
    public Context mo34840j() {
        boolean[] o = m45575o();
        if (this.f25916a.get() != null) {
            o[174] = true;
        } else {
            o[175] = true;
            InstabugSDKLogger.m46623e(this, "Application context instance equal null");
            o[176] = true;
        }
        Context context = (Context) this.f25916a.get();
        o[177] = true;
        return context;
    }

    /* renamed from: k */
    public void mo34841k() {
        m45575o()[178] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C12314c m45557a(C9764b bVar, C12314c cVar) {
        boolean[] o = m45575o();
        bVar.f25913O = cVar;
        o[195] = true;
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34832b() {
        boolean[] o = m45575o();
        m45576p();
        o[65] = true;
        InstabugSDKLogger.m46622d(this, "Initializing the exception handler");
        o[66] = true;
        m45583w();
        o[67] = true;
        InstabugSDKLogger.m46622d(this, "Starting Instabug SDK functionality");
        o[68] = true;
        Instabug.setState(InstabugState.ENABLED);
        o[69] = true;
        InstabugSDKLogger.m46626v(this, "show intro dialog if valid");
        o[70] = true;
        m45553B();
        o[71] = true;
        InstabugSDKLogger.m46626v(this, "Initializing Session manager");
        o[72] = true;
        mo34835e();
        o[73] = true;
        InstabugSDKLogger.m46626v(this, "Initializing Internal tracking delegate");
        o[74] = true;
        mo34834d();
        o[75] = true;
        InstabugSDKLogger.m46626v(this, "Initializing surveys manager");
        o[76] = true;
        InstabugSDKLogger.m46626v(this, "Initializing database manager");
        o[77] = true;
        m45586z();
        o[78] = true;
        InstabugSDKLogger.m46626v(this, "run valid migration");
        o[79] = true;
        m45552A();
        o[80] = true;
        InstabugSDKLogger.m46626v(this, "Registering broadcasts");
        o[81] = true;
        mo34836f();
        o[82] = true;
        InstabugSDKLogger.m46626v(this, "Preparing user state");
        o[83] = true;
        m45584x();
        o[84] = true;
        InstabugSDKLogger.m46626v(this, "Initializing auto screen recording");
        o[85] = true;
        m45573m();
        o[86] = true;
        m45574n();
        o[87] = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo34833c() {
        boolean[] o = m45575o();
        if (C9780c.m45631b().mo34869b(Feature.VP_CUSTOMIZATION) != Feature.State.ENABLED) {
            o[88] = true;
        } else {
            o[89] = true;
            C9784d.m45648a();
            o[90] = true;
        }
        o[91] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo34834d() {
        boolean[] o = m45575o();
        InstabugInternalTrackingDelegate.getInstance();
        o[93] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo34835e() {
        boolean[] o = m45575o();
        C9810g.m45764a(SettingsManager.getInstance());
        o[94] = true;
    }

    /* renamed from: f */
    public void mo34836f() {
        boolean[] o = m45575o();
        C2128a a = C2128a.m11089a(mo34840j());
        C9778a aVar = this.f25914P;
        IntentFilter intentFilter = new IntentFilter("SDK invoked");
        o[95] = true;
        a.mo9218a(aVar, intentFilter);
        o[96] = true;
    }

    /* renamed from: g */
    public void mo34837g() {
        boolean[] o = m45575o();
        if (this.f25912N != null) {
            o[136] = true;
        } else {
            o[137] = true;
            this.f25912N = SDKCoreEventSubscriber.subscribe(new C9765a(this));
            o[138] = true;
        }
        o[139] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo34838h() {
        boolean[] o = m45575o();
        InstabugSDKLogger.m46622d(this, "Stopping Instabug SDK functionality");
        o[163] = true;
        Instabug.setState(InstabugState.DISABLED);
        o[164] = true;
        InstabugSDKLogger.m46626v(this, "Un-registering broadcasts");
        o[165] = true;
        mo34839i();
        o[166] = true;
        m45578r();
        o[167] = true;
        m45572l();
        o[168] = true;
        C9789a.m45658a();
        o[169] = true;
    }

    /* renamed from: i */
    public void mo34839i() {
        boolean[] o = m45575o();
        C2128a a = C2128a.m11089a(mo34840j());
        C9778a aVar = this.f25914P;
        o[170] = true;
        a.mo9217a((BroadcastReceiver) aVar);
        o[171] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45558a(C9764b bVar) {
        boolean[] o = m45575o();
        bVar.m45580t();
        o[186] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45559a(C9764b bVar, SDKCoreEvent sDKCoreEvent, State state) {
        boolean[] o = m45575o();
        bVar.m45561a(sDKCoreEvent, state);
        o[197] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45560a(C9764b bVar, State state) {
        boolean[] o = m45575o();
        bVar.m45564b(state);
        o[193] = true;
    }

    /* renamed from: a */
    public void mo34829a(Context context) {
        boolean[] o = m45575o();
        C9780c.m45631b().mo34870b(context);
        o[5] = true;
    }

    /* renamed from: a */
    public void mo34831a(boolean z) {
        boolean[] o = m45575o();
        StringBuilder sb = new StringBuilder();
        sb.append("SDK Invoked: ");
        sb.append(z);
        InstabugSDKLogger.m46622d(this, sb.toString());
        o[6] = true;
        if (Instabug.getState() == InstabugState.TAKING_SCREENSHOT) {
            o[7] = true;
        } else if (Instabug.getState() == InstabugState.RECORDING_VIDEO) {
            o[8] = true;
        } else {
            o[9] = true;
            if (Instabug.getState() == InstabugState.TAKING_SCREENSHOT_FOR_CHAT) {
                o[10] = true;
            } else {
                o[11] = true;
                if (Instabug.getState() == InstabugState.RECORDING_VIDEO_FOR_CHAT) {
                    o[12] = true;
                } else {
                    o[13] = true;
                    if (Instabug.getState() == InstabugState.IMPORTING_IMAGE_FROM_GALLERY_FOR_CHAT) {
                        o[14] = true;
                    } else if (z) {
                        o[15] = true;
                        Instabug.setState(InstabugState.INVOKED);
                        o[16] = true;
                        m45562a(Action.STOP_TRIM_KEEP);
                        o[17] = true;
                    } else {
                        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
                        if (currentActivity == null) {
                            o[18] = true;
                        } else {
                            o[19] = true;
                            OrientationUtils.unlockOrientation(currentActivity);
                            o[20] = true;
                        }
                        if (C9780c.m45631b().mo34868a(Feature.INSTABUG)) {
                            o[21] = true;
                            Instabug.setState(InstabugState.ENABLED);
                            o[22] = true;
                        } else {
                            Instabug.setState(InstabugState.DISABLED);
                            o[23] = true;
                        }
                    }
                }
            }
        }
        o[24] = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34828a() {
        boolean[] o = m45575o();
        if (C9780c.m45631b().mo34868a(Feature.INSTABUG)) {
            o[58] = true;
            mo34832b();
            o[59] = true;
        } else {
            Instabug.setState(InstabugState.DISABLED);
            o[60] = true;
        }
        InstabugSDKLogger.m46626v(this, "Initializing invocation manager");
        o[61] = true;
        m45585y();
        o[62] = true;
        C12205a.m54884a((C12331g<? super Throwable>) new C9771g<Object>(this));
        o[63] = true;
        mo34833c();
        o[64] = true;
    }

    /* renamed from: b */
    private void m45564b(State state) {
        boolean[] o = m45575o();
        PresentationManager.getInstance().show(new C9767c(this, state));
        o[162] = true;
    }

    /* renamed from: a */
    public void mo34830a(State state) {
        boolean[] o = m45575o();
        String str = "Instabug";
        if (!Instabug.isEnabled()) {
            o[117] = true;
            InstabugSDKLogger.m46623e(str, "Cannot show intro message while SDK is Disabled");
            o[118] = true;
        } else if (state == State.DISABLED) {
            o[119] = true;
            InstabugSDKLogger.m46623e(str, "Cannot show onboarding message while WelcomeMessageState is DISABLED");
            o[120] = true;
        } else {
            if (InvocationManager.getInstance().getCurrentInstabugInvocationEvents().length == 0) {
                o[121] = true;
            } else {
                o[122] = true;
                if (!m45554C()) {
                    o[123] = true;
                } else {
                    if (!InstabugCore.isAppOnForeground()) {
                        if (this.f25913O != null) {
                            o[125] = true;
                        } else {
                            o[126] = true;
                            C9773i iVar = new C9773i(this, state);
                            o[127] = true;
                            this.f25913O = SDKCoreEventSubscriber.subscribe(iVar);
                            o[128] = true;
                        }
                    } else if (!InstabugCore.isForegroundBusy()) {
                        o[129] = true;
                        m45564b(state);
                        o[130] = true;
                    } else if (this.f25913O != null) {
                        o[131] = true;
                    } else {
                        o[132] = true;
                        C9774j jVar = new C9774j(this, state);
                        o[133] = true;
                        this.f25913O = SDKCoreEventSubscriber.subscribe(jVar);
                        o[134] = true;
                    }
                    o[135] = true;
                    return;
                }
            }
            InstabugSDKLogger.m46623e(str, "Cannot show onboarding message while invocation event in NONE");
            o[124] = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m45561a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r6, com.instabug.library.p397ui.onboarding.WelcomeMessage.State r7) {
        /*
            r5 = this;
            boolean[] r0 = m45575o()
            java.lang.String r1 = r6.getType()
            int r2 = r1.hashCode()
            r3 = 1615594094(0x604c026e, float:5.8801732E19)
            r4 = 1
            if (r2 == r3) goto L_0x002f
            r3 = 1738700944(0x67a27890, float:1.5344947E24)
            if (r2 == r3) goto L_0x001c
            r1 = 141(0x8d, float:1.98E-43)
            r0[r1] = r4
            goto L_0x003b
        L_0x001c:
            java.lang.String r2 = "invocation"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0029
            r1 = 144(0x90, float:2.02E-43)
            r0[r1] = r4
            goto L_0x003b
        L_0x0029:
            r1 = 145(0x91, float:2.03E-43)
            r0[r1] = r4
            r1 = 1
            goto L_0x0042
        L_0x002f:
            java.lang.String r2 = "foreground_status"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x003d
            r1 = 142(0x8e, float:1.99E-43)
            r0[r1] = r4
        L_0x003b:
            r1 = -1
            goto L_0x0042
        L_0x003d:
            r1 = 0
            r2 = 143(0x8f, float:2.0E-43)
            r0[r2] = r4
        L_0x0042:
            r2 = 0
            if (r1 == 0) goto L_0x0088
            if (r1 == r4) goto L_0x004d
            r6 = 146(0x92, float:2.05E-43)
            r0[r6] = r4
            goto L_0x00c2
        L_0x004d:
            java.lang.String r6 = r6.getValue()
            r1 = 154(0x9a, float:2.16E-43)
            r0[r1] = r4
            java.lang.String r1 = "dismissed"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 != 0) goto L_0x0062
            r6 = 155(0x9b, float:2.17E-43)
            r0[r6] = r4
            goto L_0x0070
        L_0x0062:
            r6 = 156(0x9c, float:2.19E-43)
            r0[r6] = r4
            boolean r6 = com.instabug.library.core.InstabugCore.isForegroundBusy()
            if (r6 == 0) goto L_0x0075
            r6 = 157(0x9d, float:2.2E-43)
            r0[r6] = r4
        L_0x0070:
            r6 = 159(0x9f, float:2.23E-43)
            r0[r6] = r4
            return
        L_0x0075:
            r6 = 158(0x9e, float:2.21E-43)
            r0[r6] = r4
            r5.m45564b(r7)
            e.a.u0.c r6 = r5.f25913O
            r6.dispose()
            r5.f25913O = r2
            r6 = 160(0xa0, float:2.24E-43)
            r0[r6] = r4
            goto L_0x00c2
        L_0x0088:
            java.lang.String r6 = r6.getValue()
            r1 = 147(0x93, float:2.06E-43)
            r0[r1] = r4
            java.lang.String r1 = "available"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 != 0) goto L_0x009d
            r6 = 148(0x94, float:2.07E-43)
            r0[r6] = r4
            goto L_0x00ab
        L_0x009d:
            r6 = 149(0x95, float:2.09E-43)
            r0[r6] = r4
            boolean r6 = com.instabug.library.core.InstabugCore.isForegroundBusy()
            if (r6 == 0) goto L_0x00b0
            r6 = 150(0x96, float:2.1E-43)
            r0[r6] = r4
        L_0x00ab:
            r6 = 152(0x98, float:2.13E-43)
            r0[r6] = r4
            return
        L_0x00b0:
            r6 = 151(0x97, float:2.12E-43)
            r0[r6] = r4
            r5.m45564b(r7)
            e.a.u0.c r6 = r5.f25913O
            r6.dispose()
            r5.f25913O = r2
            r6 = 153(0x99, float:2.14E-43)
            r0[r6] = r4
        L_0x00c2:
            r6 = 161(0xa1, float:2.26E-43)
            r0[r6] = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.C9764b.m45561a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent, com.instabug.library.ui.onboarding.WelcomeMessage$State):void");
    }

    /* renamed from: a */
    private void m45562a(Action action) {
        boolean[] o = m45575o();
        if (!SettingsManager.getInstance().autoScreenRecordingEnabled()) {
            o[179] = true;
        } else {
            o[180] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Sending auto event: ");
            sb.append(action.toString());
            InstabugSDKLogger.m46625i(this, sb.toString());
            o[181] = true;
            AutoScreenRecordingEventBus.getInstance().post(action);
            o[182] = true;
        }
        o[183] = true;
    }
}
