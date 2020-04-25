package com.instabug.library.p391j;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.C0193h0;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.Feature.State;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.SessionStateEventBus;
import com.instabug.library.model.Session.SessionState;
import com.instabug.library.sessionprofiler.model.timeline.C9985a;
import com.instabug.library.sessionprofiler.model.timeline.C9986b;
import com.instabug.library.sessionprofiler.model.timeline.C9987c;
import com.instabug.library.sessionprofiler.model.timeline.ConnectivityState;
import com.instabug.library.util.DeviceStateProvider;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.j.a */
/* compiled from: SessionProfiler */
public class C9922a {

    /* renamed from: e */
    private static C9922a f26373e;

    /* renamed from: f */
    private static transient /* synthetic */ boolean[] f26374f;

    /* renamed from: a */
    private Handler f26375a;

    /* renamed from: b */
    private Runnable f26376b;

    /* renamed from: c */
    private C9987c f26377c;

    /* renamed from: d */
    private long f26378d = 0;

    /* renamed from: com.instabug.library.j.a$a */
    /* compiled from: SessionProfiler */
    class C9923a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26379b;

        /* renamed from: a */
        final /* synthetic */ C9922a f26380a;

        C9923a(C9922a aVar) {
            boolean[] a = m46174a();
            this.f26380a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46174a() {
            boolean[] zArr = f26379b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2694412641860443796L, "com/instabug/library/sessionprofiler/SessionProfiler$1", 6);
            f26379b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46174a();
            try {
                C9922a.m46161a(this.f26380a, C9922a.m46159a(this.f26380a)).mo23950c(C12228b.m55094b()).mo23767F();
                a[1] = true;
            } finally {
                C9922a aVar = this.f26380a;
                C9922a.m46162b(aVar, C9922a.m46159a(aVar) + 500);
                a[3] = true;
                C9922a.m46165c(this.f26380a).postDelayed(C9922a.m46163b(this.f26380a), 500);
                a[4] = true;
            }
        }
    }

    /* renamed from: com.instabug.library.j.a$b */
    /* compiled from: SessionProfiler */
    class C9924b implements C12331g<SessionState> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26381b;

        /* renamed from: a */
        final /* synthetic */ C9922a f26382a;

        C9924b(C9922a aVar) {
            boolean[] a = m46175a();
            this.f26382a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46175a() {
            boolean[] zArr = f26381b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7677859832530489755L, "com/instabug/library/sessionprofiler/SessionProfiler$2", 8);
            f26381b = a;
            return a;
        }

        /* renamed from: a */
        public void mo35257a(SessionState sessionState) {
            boolean[] a = m46175a();
            if (sessionState == SessionState.START) {
                a[1] = true;
                this.f26382a.mo35253b();
                a[2] = true;
            } else if (sessionState != SessionState.FINISH) {
                a[3] = true;
            } else {
                a[4] = true;
                this.f26382a.mo35254c();
                a[5] = true;
            }
            a[6] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46175a();
            mo35257a((SessionState) obj);
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.j.a$c */
    /* compiled from: SessionProfiler */
    class C9925c implements Callable<Long> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26383N;

        /* renamed from: a */
        final /* synthetic */ long f26384a;

        /* renamed from: b */
        final /* synthetic */ C9922a f26385b;

        C9925c(C9922a aVar, long j) {
            boolean[] b = m46178b();
            this.f26385b = aVar;
            this.f26384a = j;
            b[0] = true;
        }

        /* renamed from: b */
        private static /* synthetic */ boolean[] m46178b() {
            boolean[] zArr = f26383N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7647333245721096687L, "com/instabug/library/sessionprofiler/SessionProfiler$3", 4);
            f26383N = a;
            return a;
        }

        /* renamed from: a */
        public Long mo35258a() {
            boolean[] b = m46178b();
            C9922a.m46166c(this.f26385b, this.f26384a);
            b[1] = true;
            Long valueOf = Long.valueOf(this.f26384a);
            b[2] = true;
            return valueOf;
        }

        public /* synthetic */ Object call() throws Exception {
            boolean[] b = m46178b();
            Long a = mo35258a();
            b[3] = true;
            return a;
        }
    }

    private C9922a() {
        boolean[] g = m46169g();
        g[4] = true;
        this.f26377c = new C9987c();
        g[5] = true;
        m46168f();
        g[6] = true;
    }

    /* renamed from: a */
    static /* synthetic */ long m46159a(C9922a aVar) {
        boolean[] g = m46169g();
        long j = aVar.f26378d;
        g[37] = true;
        return j;
    }

    /* renamed from: b */
    static /* synthetic */ long m46162b(C9922a aVar, long j) {
        boolean[] g = m46169g();
        aVar.f26378d = j;
        g[39] = true;
        return j;
    }

    /* renamed from: c */
    static /* synthetic */ Handler m46165c(C9922a aVar) {
        boolean[] g = m46169g();
        Handler handler = aVar.f26375a;
        g[41] = true;
        return handler;
    }

    /* renamed from: e */
    public static C9922a m46167e() {
        boolean[] g = m46169g();
        if (f26373e != null) {
            g[0] = true;
        } else {
            g[1] = true;
            f26373e = new C9922a();
            g[2] = true;
        }
        C9922a aVar = f26373e;
        g[3] = true;
        return aVar;
    }

    /* renamed from: f */
    private void m46168f() {
        boolean[] g = m46169g();
        SessionStateEventBus instance = SessionStateEventBus.getInstance();
        C9924b bVar = new C9924b(this);
        g[8] = true;
        instance.subscribe(bVar);
        g[9] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46169g() {
        boolean[] zArr = f26374f;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-4119111078595791527L, "com/instabug/library/sessionprofiler/SessionProfiler", 43);
        f26374f = a;
        return a;
    }

    /* renamed from: d */
    public C9987c mo35255d() {
        boolean[] g = m46169g();
        C9987c a = this.f26377c.mo35595a();
        g[36] = true;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ C5923b0 m46161a(C9922a aVar, long j) {
        boolean[] g = m46169g();
        C5923b0 a = aVar.m46160a(j);
        g[38] = true;
        return a;
    }

    /* renamed from: b */
    static /* synthetic */ Runnable m46163b(C9922a aVar) {
        boolean[] g = m46169g();
        Runnable runnable = aVar.f26376b;
        g[40] = true;
        return runnable;
    }

    /* renamed from: c */
    static /* synthetic */ void m46166c(C9922a aVar, long j) {
        boolean[] g = m46169g();
        aVar.m46164b(j);
        g[42] = true;
    }

    /* renamed from: a */
    public void mo35252a() {
        boolean[] g = m46169g();
        this.f26376b = new C9923a(this);
        g[7] = true;
    }

    /* renamed from: b */
    public void mo35253b() {
        boolean[] g = m46169g();
        if (C9780c.m45631b().mo34869b(Feature.SESSION_PROFILER) != State.ENABLED) {
            g[10] = true;
        } else {
            g[11] = true;
            HandlerThread handlerThread = new HandlerThread("SessionProfilerHandlerThread");
            g[12] = true;
            handlerThread.start();
            g[13] = true;
            this.f26375a = new Handler(handlerThread.getLooper());
            g[14] = true;
            this.f26375a.post(this.f26376b);
            g[15] = true;
        }
        g[16] = true;
    }

    /* renamed from: c */
    public void mo35254c() {
        boolean[] g = m46169g();
        Handler handler = this.f26375a;
        if (handler == null) {
            g[17] = true;
        } else {
            g[18] = true;
            handler.removeCallbacks(this.f26376b);
            g[19] = true;
        }
        g[20] = true;
    }

    @C0193h0
    /* renamed from: a */
    private C5923b0<Long> m46160a(long j) {
        boolean[] g = m46169g();
        C5923b0<Long> f = C5923b0.m26194f((Callable<? extends T>) new C9925c<Object>(this, j));
        g[21] = true;
        return f;
    }

    /* renamed from: b */
    private void m46164b(long j) {
        boolean z;
        boolean[] g = m46169g();
        Context applicationContext = Instabug.getApplicationContext();
        if (j % 2000 != 0) {
            g[22] = true;
        } else {
            g[23] = true;
            int batteryLevel = DeviceStateProvider.getBatteryLevel(applicationContext);
            g[24] = true;
            String batteryState = DeviceStateProvider.getBatteryState(applicationContext);
            g[25] = true;
            C9987c cVar = this.f26377c;
            float f = (float) batteryLevel;
            if (!"Unplugged".equals(batteryState)) {
                g[26] = true;
                z = true;
            } else {
                z = false;
                g[27] = true;
            }
            cVar.mo35596a(f, z);
            g[28] = true;
            String screenOrientation = DeviceStateProvider.getScreenOrientation(applicationContext);
            g[29] = true;
            this.f26377c.mo35599a(new C9986b(screenOrientation));
            g[30] = true;
            this.f26377c.mo35597a(ConnectivityState.getNetworkState(applicationContext));
            g[31] = true;
        }
        C9987c cVar2 = this.f26377c;
        long usedMemory = DeviceStateProvider.getUsedMemory(applicationContext);
        g[32] = true;
        C9985a aVar = new C9985a(usedMemory, DeviceStateProvider.getTotalMemory(applicationContext));
        g[33] = true;
        cVar2.mo35598a(aVar);
        g[34] = true;
        this.f26377c.mo35600b(new C9985a(DeviceStateProvider.getUsedStorage()));
        g[35] = true;
    }
}
