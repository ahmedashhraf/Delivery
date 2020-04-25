package com.instabug.library.internal.video;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.instabug.library.core.eventbus.AutoScreenRecordingEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.settings.SettingsManager;
import p195e.p196a.p447u0.C12313b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class AutoScreenRecordingService extends Service {

    /* renamed from: O */
    private static transient /* synthetic */ boolean[] f26085O;

    /* renamed from: N */
    private C12313b f26086N;

    /* renamed from: a */
    private final C9863c f26087a = new C9846a(this);

    /* renamed from: b */
    private C9860b f26088b;

    public enum Action {
        STOP_DELETE,
        STOP_KEEP,
        STOP_TRIM_KEEP;

        static {
            boolean[] d;
            d[3] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.AutoScreenRecordingService$a */
    class C9846a implements C9863c {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26089b;

        /* renamed from: a */
        final /* synthetic */ AutoScreenRecordingService f26090a;

        C9846a(AutoScreenRecordingService autoScreenRecordingService) {
            boolean[] a = m45868a();
            this.f26090a = autoScreenRecordingService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45868a() {
            boolean[] zArr = f26089b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6395639754434950258L, "com/instabug/library/internal/video/AutoScreenRecordingService$1", 4);
            f26089b = a;
            return a;
        }

        /* renamed from: c */
        public void mo35059c() {
            m45868a()[2] = true;
        }

        /* renamed from: d */
        public void mo35060d() {
            m45868a()[1] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.AutoScreenRecordingService$b */
    class C9847b implements C12331g<Action> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26091b;

        /* renamed from: a */
        final /* synthetic */ AutoScreenRecordingService f26092a;

        C9847b(AutoScreenRecordingService autoScreenRecordingService) {
            boolean[] a = m45871a();
            this.f26092a = autoScreenRecordingService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45871a() {
            boolean[] zArr = f26091b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2656992071038478784L, "com/instabug/library/internal/video/AutoScreenRecordingService$2", 21);
            f26091b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35061a(Action action) {
            boolean[] a = m45871a();
            int i = C9849d.f26095a[action.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        a[1] = true;
                    } else if (!SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                        a[12] = true;
                    } else {
                        a[13] = true;
                        SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
                        a[14] = true;
                        AutoScreenRecordingService.m45864a(this.f26092a).mo35101a();
                        a[15] = true;
                        C9860b a2 = AutoScreenRecordingService.m45864a(this.f26092a);
                        SettingsManager instance = SettingsManager.getInstance();
                        a[16] = true;
                        int autoScreenRecordingMaxDuration = instance.autoScreenRecordingMaxDuration();
                        a[17] = true;
                        a2.mo35102a(autoScreenRecordingMaxDuration);
                        a[18] = true;
                    }
                } else if (!SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                    a[7] = true;
                } else {
                    a[8] = true;
                    SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
                    a[9] = true;
                    AutoScreenRecordingService.m45864a(this.f26092a).mo35101a();
                    a[10] = true;
                    AutoScreenRecordingService.m45864a(this.f26092a).mo35104c();
                    a[11] = true;
                }
            } else if (!SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                a[2] = true;
            } else {
                a[3] = true;
                SettingsManager.getInstance().setScreenCurrentlyRecorded(false);
                a[4] = true;
                AutoScreenRecordingService.m45864a(this.f26092a).mo35101a();
                a[5] = true;
                AutoScreenRecordingService.m45864a(this.f26092a).mo35103b();
                a[6] = true;
            }
            a[19] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45871a();
            mo35061a((Action) obj);
            a[20] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.AutoScreenRecordingService$c */
    class C9848c implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26093b;

        /* renamed from: a */
        final /* synthetic */ AutoScreenRecordingService f26094a;

        C9848c(AutoScreenRecordingService autoScreenRecordingService) {
            boolean[] a = m45874a();
            this.f26094a = autoScreenRecordingService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45874a() {
            boolean[] zArr = f26093b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(754019548266415808L, "com/instabug/library/internal/video/AutoScreenRecordingService$3", 6);
            f26093b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35062a(SessionState sessionState) {
            boolean[] a = m45874a();
            if (sessionState != SessionState.FINISH) {
                a[1] = true;
            } else {
                a[2] = true;
                AutoScreenRecordingService.m45864a(this.f26094a).mo35101a();
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45874a();
            mo35062a((SessionState) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.internal.video.AutoScreenRecordingService$d */
    static /* synthetic */ class C9849d {

        /* renamed from: a */
        static final /* synthetic */ int[] f26095a = new int[Action.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26096b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m45877a()
                com.instabug.library.internal.video.AutoScreenRecordingService$Action[] r1 = com.instabug.library.internal.video.AutoScreenRecordingService.Action.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26095a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f26095a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.library.internal.video.AutoScreenRecordingService$Action r5 = com.instabug.library.internal.video.AutoScreenRecordingService.Action.STOP_DELETE     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f26095a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.internal.video.AutoScreenRecordingService$Action r5 = com.instabug.library.internal.video.AutoScreenRecordingService.Action.STOP_KEEP     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f26095a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.internal.video.AutoScreenRecordingService$Action r3 = com.instabug.library.internal.video.AutoScreenRecordingService.Action.STOP_TRIM_KEEP     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.video.AutoScreenRecordingService.C9849d.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45877a() {
            boolean[] zArr = f26096b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5887695447482522380L, "com/instabug/library/internal/video/AutoScreenRecordingService$4", 8);
            f26096b = a;
            return a;
        }
    }

    public AutoScreenRecordingService() {
        boolean[] b = m45866b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    static /* synthetic */ C9860b m45864a(AutoScreenRecordingService autoScreenRecordingService) {
        boolean[] b = m45866b();
        C9860b bVar = autoScreenRecordingService.f26088b;
        b[27] = true;
        return bVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45866b() {
        boolean[] zArr = f26085O;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7010185004004942283L, "com/instabug/library/internal/video/AutoScreenRecordingService", 28);
        f26085O = a;
        return a;
    }

    public IBinder onBind(Intent intent) {
        boolean[] b = m45866b();
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Not yet implemented");
        b[22] = true;
        throw unsupportedOperationException;
    }

    public void onDestroy() {
        boolean[] b = m45866b();
        super.onDestroy();
        C12313b bVar = this.f26086N;
        if (bVar == null) {
            b[23] = true;
        } else {
            b[24] = true;
            bVar.mo42067a();
            b[25] = true;
        }
        b[26] = true;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        boolean[] b = m45866b();
        if (intent == null) {
            b[5] = true;
            stopSelf();
            b[6] = true;
        } else {
            this.f26086N = new C12313b();
            b[7] = true;
            m45865a();
            b[8] = true;
            int intExtra = intent.getIntExtra("result-code", 0);
            b[9] = true;
            Intent intent2 = (Intent) intent.getParcelableExtra("data");
            if (intExtra == 0) {
                b[10] = true;
            } else if (intent2 == null) {
                b[11] = true;
            } else if (SettingsManager.getInstance().isScreenCurrentlyRecorded()) {
                b[13] = true;
            } else {
                b[14] = true;
                this.f26088b = new C9860b(this, this.f26087a, intExtra, intent2);
                b[15] = true;
                SettingsManager.getInstance().setScreenCurrentlyRecorded(true);
                b[16] = true;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Result code or data missing.");
            b[12] = true;
            throw illegalStateException;
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        b[17] = true;
        return onStartCommand;
    }

    /* renamed from: a */
    static Intent m45863a(Context context, int i, Intent intent) {
        boolean[] b = m45866b();
        Intent intent2 = new Intent(context, AutoScreenRecordingService.class);
        b[2] = true;
        intent2.putExtra("result-code", i);
        b[3] = true;
        intent2.putExtra("data", intent);
        b[4] = true;
        return intent2;
    }

    /* renamed from: a */
    private void m45865a() {
        boolean[] b = m45866b();
        C12314c subscribe = AutoScreenRecordingEventBus.getInstance().subscribe(new C9847b(this));
        b[18] = true;
        this.f26086N.mo42072b(subscribe);
        b[19] = true;
        C12314c subscribe2 = SessionStateEventBus.getInstance().subscribe(new C9848c(this));
        b[20] = true;
        this.f26086N.mo42072b(subscribe2);
        b[21] = true;
    }
}
