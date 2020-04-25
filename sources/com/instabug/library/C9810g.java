package com.instabug.library;

import android.content.IntentFilter;
import com.instabug.library.Feature.State;
import com.instabug.library.core.eventbus.CurrentActivityLifeCycleEventBus;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.internal.storage.cache.C9841c;
import com.instabug.library.internal.storage.cache.UserAttributesCacheManager;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.C9948b;
import com.instabug.library.model.Session;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.network.C9970c;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.ActivityLifeCycleEvent;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.InstabugSDKLogger;
import com.mrsool.utils.C11644i;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.g */
/* compiled from: SessionManager */
public class C9810g {

    /* renamed from: e */
    private static C9810g f26007e;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f26008f;

    /* renamed from: a */
    private SettingsManager f26009a;

    /* renamed from: b */
    private int f26010b;

    /* renamed from: c */
    private C9970c f26011c = new C9970c();

    /* renamed from: d */
    private C12314c f26012d;

    /* renamed from: com.instabug.library.g$a */
    /* compiled from: SessionManager */
    class C9811a implements C12331g<ActivityLifeCycleEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26013b;

        /* renamed from: a */
        final /* synthetic */ C9810g f26014a;

        C9811a(C9810g gVar) {
            boolean[] a = m45783a();
            this.f26014a = gVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45783a() {
            boolean[] zArr = f26013b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8911238463043213857L, "com/instabug/library/SessionManager$1", 6);
            f26013b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34936a(ActivityLifeCycleEvent activityLifeCycleEvent) {
            boolean[] a = m45783a();
            int i = C9812b.f26015a[activityLifeCycleEvent.ordinal()];
            if (i == 1) {
                C9810g.m45762a(this.f26014a);
                a[2] = true;
            } else if (i != 2) {
                a[1] = true;
            } else {
                C9810g.m45765b(this.f26014a);
                a[3] = true;
            }
            a[4] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m45783a();
            mo34936a((ActivityLifeCycleEvent) obj);
            a[5] = true;
        }
    }

    /* renamed from: com.instabug.library.g$b */
    /* compiled from: SessionManager */
    static /* synthetic */ class C9812b {

        /* renamed from: a */
        static final /* synthetic */ int[] f26015a = new int[ActivityLifeCycleEvent.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26016b;

        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001f */
        static {
            /*
                boolean[] r0 = m45786a()
                com.instabug.library.tracking.ActivityLifeCycleEvent[] r1 = com.instabug.library.tracking.ActivityLifeCycleEvent.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26015a = r1
                r1 = 0
                r2 = 2
                r3 = 1
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                int[] r1 = f26015a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.STARTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                r0[r3] = r3
                goto L_0x0021
            L_0x001f:
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0021:
                int[] r1 = f26015a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.library.tracking.ActivityLifeCycleEvent r4 = com.instabug.library.tracking.ActivityLifeCycleEvent.STOPPED     // Catch:{ NoSuchFieldError -> 0x002f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002f }
                r1 = 3
                r0[r1] = r3
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r3
            L_0x0032:
                r1 = 5
                r0[r1] = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.C9810g.C9812b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45786a() {
            boolean[] zArr = f26016b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8559612127522508725L, "com/instabug/library/SessionManager$2", 6);
            f26016b = a;
            return a;
        }
    }

    private C9810g(SettingsManager settingsManager) {
        boolean[] q = m45778q();
        this.f26009a = settingsManager;
        q[0] = true;
        m45777p();
        q[1] = true;
        q[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m45762a(C9810g gVar) {
        boolean[] q = m45778q();
        gVar.m45767f();
        q[94] = true;
    }

    /* renamed from: b */
    static /* synthetic */ void m45765b(C9810g gVar) {
        boolean[] q = m45778q();
        gVar.m45768g();
        q[95] = true;
    }

    /* renamed from: e */
    public static C9810g m45766e() {
        boolean[] q = m45778q();
        C9810g gVar = f26007e;
        if (gVar != null) {
            q[3] = true;
        } else {
            gVar = new C9810g(SettingsManager.getInstance());
            f26007e = gVar;
            q[4] = true;
        }
        q[5] = true;
        return gVar;
    }

    /* renamed from: f */
    private void m45767f() {
        boolean[] q = m45778q();
        this.f26010b++;
        q[22] = true;
    }

    /* renamed from: g */
    private void m45768g() {
        boolean[] q = m45778q();
        C9780c.m45631b().mo34864a(Instabug.getApplicationContext());
        this.f26010b--;
        q[31] = true;
    }

    /* renamed from: h */
    private void m45769h() {
        boolean[] q = m45778q();
        if (this.f26009a.getSessionStartedAt() != 0) {
            q[32] = true;
            m45770i();
            q[33] = true;
            m45776o();
            q[34] = true;
            m45763a(SessionState.FINISH);
            q[35] = true;
        } else {
            InstabugSDKLogger.m46622d(this, "Instabug is enabled after session started, Session ignored");
            q[36] = true;
        }
        C9970c cVar = this.f26011c;
        if (cVar == null) {
            q[37] = true;
        } else {
            try {
                q[38] = true;
                cVar.mo35572a(Instabug.getApplicationContext());
                q[39] = true;
            } catch (IllegalArgumentException unused) {
                q[40] = true;
                InstabugSDKLogger.m46622d(this, "This app is not registered");
                q[41] = true;
            }
        }
        q[42] = true;
    }

    /* renamed from: i */
    private void m45770i() {
        boolean[] q = m45778q();
        if (!SettingsManager.getInstance().isSessionEnabled()) {
            q[43] = true;
        } else {
            q[44] = true;
            Session j = m45771j();
            q[45] = true;
            C9841c.m45853a(j);
            q[46] = true;
        }
        q[47] = true;
    }

    /* renamed from: j */
    private Session m45771j() {
        boolean[] q = m45778q();
        int k = m45772k();
        long sessionStartedAt = this.f26009a.getSessionStartedAt();
        q[48] = true;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.f26009a.getSessionStartedAt();
        q[49] = true;
        Session session = new Session(k, sessionStartedAt, currentTimeMillis, m45773l(), m45774m());
        q[50] = true;
        return session;
    }

    /* renamed from: k */
    private int m45772k() {
        int i;
        boolean[] q = m45778q();
        q[51] = true;
        if (!SettingsManager.getInstance().isFirstDismiss()) {
            q[52] = true;
            i = -1;
        } else {
            q[53] = true;
            i = 1;
        }
        q[54] = true;
        return i;
    }

    /* renamed from: l */
    private String m45773l() {
        String str;
        boolean[] q = m45778q();
        q[55] = true;
        HashMap all = UserAttributesCacheManager.getAll();
        q[56] = true;
        if (all == null) {
            q[57] = true;
        } else if (all.size() == 0) {
            q[58] = true;
        } else {
            q[59] = true;
            C9948b bVar = new C9948b();
            q[60] = true;
            bVar.mo35472a(all);
            try {
                q[61] = true;
                str = bVar.toJson();
                q[62] = true;
            } catch (JSONException e) {
                q[63] = true;
                StringBuilder sb = new StringBuilder();
                sb.append("parsing user attributes got error: ");
                sb.append(e.getMessage());
                InstabugSDKLogger.m46624e(this, sb.toString(), e);
                q[64] = true;
            }
            q[65] = true;
            return str;
        }
        str = "{}";
        q[65] = true;
        return str;
    }

    /* renamed from: m */
    private String m45774m() {
        String str;
        boolean[] q = m45778q();
        try {
            q[66] = true;
            ArrayList arrayList = new ArrayList();
            q[67] = true;
            arrayList.addAll(InstabugUserEventLogger.getInstance().getUserEvents());
            q[68] = true;
            str = UserEvent.toJson(arrayList).toString();
            q[69] = true;
        } catch (JSONException e) {
            q[70] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("parsing user events got error: ");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46624e(this, sb.toString(), e);
            q[71] = true;
            str = "[]";
        }
        q[72] = true;
        return str;
    }

    /* renamed from: n */
    private void m45775n() {
        boolean[] q = m45778q();
        this.f26009a.setSessionStartedAt(System.currentTimeMillis() / 1000);
        q[73] = true;
        if (!SettingsManager.getInstance().isFirstRun()) {
            q[74] = true;
        } else {
            q[75] = true;
            this.f26009a.setIsFirstRun(false);
            q[76] = true;
        }
        if (SettingsManager.getInstance().getFirstRunAt().getTime() != 0) {
            q[77] = true;
        } else {
            q[78] = true;
            this.f26009a.setFirstRunAt(System.currentTimeMillis());
            q[79] = true;
        }
        this.f26009a.incrementSessionsCount();
        q[80] = true;
    }

    /* renamed from: o */
    private void m45776o() {
        boolean[] q = m45778q();
        if (!SettingsManager.getInstance().isFirstDismiss()) {
            q[81] = true;
        } else {
            q[82] = true;
            SettingsManager.getInstance().setIsFirstDismiss(false);
            q[83] = true;
        }
        q[84] = true;
    }

    /* renamed from: p */
    private void m45777p() {
        boolean[] q = m45778q();
        CurrentActivityLifeCycleEventBus instance = CurrentActivityLifeCycleEventBus.getInstance();
        C9811a aVar = new C9811a(this);
        q[91] = true;
        this.f26012d = instance.subscribe(aVar);
        q[92] = true;
    }

    /* renamed from: q */
    private static /* synthetic */ boolean[] m45778q() {
        boolean[] zArr = f26008f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2247975415138020169L, "com/instabug/library/SessionManager", 96);
        f26008f = a;
        return a;
    }

    /* renamed from: c */
    public void mo34934c() {
        boolean[] q = m45778q();
        m45775n();
        q[23] = true;
        m45763a(SessionState.START);
        if (this.f26011c == null) {
            q[24] = true;
        } else {
            q[25] = true;
            IntentFilter intentFilter = new IntentFilter(C11644i.f33356l7);
            q[26] = true;
            if (this.f26011c.mo35574a()) {
                q[27] = true;
            } else {
                q[28] = true;
                this.f26011c.mo35573a(Instabug.getApplicationContext(), intentFilter);
                q[29] = true;
            }
        }
        q[30] = true;
    }

    /* renamed from: d */
    public int mo34935d() {
        boolean[] q = m45778q();
        int i = this.f26010b;
        q[93] = true;
        return i;
    }

    /* renamed from: a */
    public static void m45764a(SettingsManager settingsManager) {
        boolean[] q = m45778q();
        if (f26007e != null) {
            q[6] = true;
        } else {
            q[7] = true;
            f26007e = new C9810g(settingsManager);
            q[8] = true;
        }
        q[9] = true;
    }

    /* renamed from: b */
    public void mo34933b() {
        boolean[] q = m45778q();
        if (C9780c.m45631b().mo34869b(Feature.INSTABUG) != State.ENABLED) {
            q[18] = true;
        } else {
            q[19] = true;
            m45769h();
            q[20] = true;
        }
        q[21] = true;
    }

    /* renamed from: a */
    public long mo34932a() {
        boolean[] q = m45778q();
        if (this.f26009a.getSessionStartedAt() == 0) {
            q[16] = true;
            return 0;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - this.f26009a.getSessionStartedAt();
        q[17] = true;
        return currentTimeMillis;
    }

    /* renamed from: a */
    private void m45763a(SessionState sessionState) {
        boolean[] q = m45778q();
        String str = "session";
        if (sessionState.equals(SessionState.FINISH)) {
            q[85] = true;
            SettingsManager.getInstance().setIsAppOnForeground(false);
            q[86] = true;
            SDKCoreEventPublisher.post(new SDKCoreEvent(str, SDKCoreEvent.Session.VALUE_FINISHED));
            q[87] = true;
        } else {
            SettingsManager.getInstance().setIsAppOnForeground(true);
            q[88] = true;
            SDKCoreEventPublisher.post(new SDKCoreEvent(str, SDKCoreEvent.Session.VALUE_STARTED));
            q[89] = true;
        }
        SessionStateEventBus.getInstance().post(sessionState);
        q[90] = true;
    }
}
