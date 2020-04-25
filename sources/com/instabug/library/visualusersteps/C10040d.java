package com.instabug.library.visualusersteps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.instabug.library.Instabug;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Session;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.model.C9953d.C9954a;
import com.instabug.library.screenshot.C9980a;
import com.instabug.library.screenshot.C9980a.C9984c;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.BitmapUtils.OnSaveBitmapCallback;
import com.instabug.library.util.DiskUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.visualusersteps.C10032a.C10033a;
import com.instabug.library.visualusersteps.C10034b.C10036b;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p195e.p196a.C5923b0;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.visualusersteps.d */
/* compiled from: VisualUserStepsProvider */
public class C10040d {

    /* renamed from: b */
    private static int f26734b = 0;

    /* renamed from: c */
    private static C10040d f26735c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f26736d;

    /* renamed from: a */
    private C10037c f26737a = new C10037c();

    /* renamed from: com.instabug.library.visualusersteps.d$a */
    /* compiled from: VisualUserStepsProvider */
    class C10041a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26738b;

        /* renamed from: a */
        final /* synthetic */ C10040d f26739a;

        /* renamed from: com.instabug.library.visualusersteps.d$a$a */
        /* compiled from: VisualUserStepsProvider */
        class C10042a implements C12331g<List<File>> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26740b;

            /* renamed from: a */
            final /* synthetic */ C10041a f26741a;

            C10042a(C10041a aVar) {
                boolean[] a = m46750a();
                this.f26741a = aVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46750a() {
                boolean[] zArr = f26740b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(8573215872235600768L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$1$1", 7);
                f26740b = a;
                return a;
            }

            /* renamed from: a */
            public void mo36090a(List<File> list) {
                boolean[] a = m46750a();
                if (list == null) {
                    a[1] = true;
                } else if (list.isEmpty()) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    InstabugSDKLogger.m46627w(C10040d.class, "Can't clean visual user steps directory");
                    a[4] = true;
                }
                a[5] = true;
            }

            /* renamed from: c */
            public /* synthetic */ void mo33410c(Object obj) throws Exception {
                boolean[] a = m46750a();
                mo36090a((List) obj);
                a[6] = true;
            }
        }

        C10041a(C10040d dVar) {
            boolean[] a = m46749a();
            this.f26739a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46749a() {
            boolean[] zArr = f26738b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(9080912584487004509L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$1", 4);
            f26738b = a;
            return a;
        }

        @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED"})
        public void run() {
            boolean[] a = m46749a();
            File visualUserStepsDirectory = VisualUserStepsHelper.getVisualUserStepsDirectory(Instabug.getApplicationContext());
            a[1] = true;
            C5923b0 cleanDirectoryObservable = DiskUtils.getCleanDirectoryObservable(visualUserStepsDirectory);
            C10042a aVar = new C10042a(this);
            a[2] = true;
            cleanDirectoryObservable.mo24041i((C12331g<? super T>) aVar);
            a[3] = true;
        }
    }

    /* renamed from: com.instabug.library.visualusersteps.d$b */
    /* compiled from: VisualUserStepsProvider */
    class C10043b implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26742b;

        /* renamed from: a */
        final /* synthetic */ C10040d f26743a;

        C10043b(C10040d dVar) {
            boolean[] a = m46753a();
            this.f26743a = dVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46753a() {
            boolean[] zArr = f26742b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(805824513305906499L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$2", 8);
            f26742b = a;
            return a;
        }

        /* renamed from: a */
        public void mo36091a(SDKCoreEvent sDKCoreEvent) {
            boolean[] a = m46753a();
            if (!sDKCoreEvent.getType().equals("session")) {
                a[1] = true;
            } else {
                a[2] = true;
                if (!sDKCoreEvent.getValue().equals(Session.VALUE_FINISHED)) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    C10040d.m46735a(this.f26743a);
                    a[5] = true;
                }
            }
            a[6] = true;
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46753a();
            mo36091a((SDKCoreEvent) obj);
            a[7] = true;
        }
    }

    /* renamed from: com.instabug.library.visualusersteps.d$c */
    /* compiled from: VisualUserStepsProvider */
    class C10044c implements Runnable {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26744N;

        /* renamed from: a */
        final /* synthetic */ Activity f26745a;

        /* renamed from: b */
        final /* synthetic */ C10040d f26746b;

        /* renamed from: com.instabug.library.visualusersteps.d$c$a */
        /* compiled from: VisualUserStepsProvider */
        class C10045a implements C9984c {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26747b;

            /* renamed from: a */
            final /* synthetic */ C10044c f26748a;

            C10045a(C10044c cVar) {
                boolean[] a = m46757a();
                this.f26748a = cVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46757a() {
                boolean[] zArr = f26747b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8849006515466643945L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$3$1", 6);
                f26747b = a;
                return a;
            }

            /* renamed from: a */
            public void mo34877a(Bitmap bitmap) {
                boolean[] a = m46757a();
                C10044c cVar = this.f26748a;
                C10040d.m46736a(cVar.f26746b, cVar.f26745a, bitmap);
                a[1] = true;
            }

            /* renamed from: a */
            public void mo34878a(Throwable th) {
                boolean[] a = m46757a();
                StringBuilder sb = new StringBuilder();
                sb.append("capturing VisualUserStep failed error: ");
                a[2] = true;
                sb.append(th.getMessage());
                sb.append(", time in MS: ");
                a[3] = true;
                sb.append(System.currentTimeMillis());
                String sb2 = sb.toString();
                a[4] = true;
                InstabugSDKLogger.m46624e(C10040d.class, sb2, th);
                a[5] = true;
            }
        }

        C10044c(C10040d dVar, Activity activity) {
            boolean[] a = m46756a();
            this.f26746b = dVar;
            this.f26745a = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46756a() {
            boolean[] zArr = f26744N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6784202634229441255L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$3", 2);
            f26744N = a;
            return a;
        }

        public void run() {
            boolean[] a = m46756a();
            C9980a.m46396a(this.f26745a, (C9984c) new C10045a(this));
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.library.visualusersteps.d$d */
    /* compiled from: VisualUserStepsProvider */
    class C10046d implements Runnable {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26749O;

        /* renamed from: N */
        final /* synthetic */ C10040d f26750N;

        /* renamed from: a */
        final /* synthetic */ Bitmap f26751a;

        /* renamed from: b */
        final /* synthetic */ Activity f26752b;

        /* renamed from: com.instabug.library.visualusersteps.d$d$a */
        /* compiled from: VisualUserStepsProvider */
        class C10047a implements OnSaveBitmapCallback {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26753b;

            /* renamed from: a */
            final /* synthetic */ C10046d f26754a;

            C10047a(C10046d dVar) {
                boolean[] a = m46761a();
                this.f26754a = dVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46761a() {
                boolean[] zArr = f26753b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-3715777616772211642L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$4$1", 13);
                f26753b = a;
                return a;
            }

            public void onError(Throwable th) {
                boolean[] a = m46761a();
                StringBuilder sb = new StringBuilder();
                sb.append("capturing VisualUserStep failed error: ");
                a[9] = true;
                sb.append(th.getMessage());
                sb.append(", time in MS: ");
                a[10] = true;
                sb.append(System.currentTimeMillis());
                String sb2 = sb.toString();
                a[11] = true;
                InstabugSDKLogger.m46624e(C10040d.class, sb2, th);
                a[12] = true;
            }

            public void onSuccess(Uri uri) {
                boolean[] a = m46761a();
                a[1] = true;
                C10033a aVar = new C10033a(uri.getLastPathSegment());
                Activity activity = this.f26754a.f26752b;
                if (activity == null) {
                    a[2] = true;
                } else {
                    a[3] = true;
                    if (activity.getResources().getConfiguration().orientation != 2) {
                        a[4] = true;
                    } else {
                        a[5] = true;
                        aVar.mo36050a("landscape");
                        a[6] = true;
                        C10040d.m46737a(this.f26754a.f26750N, aVar);
                        a[8] = true;
                    }
                }
                aVar.mo36050a("portrait");
                a[7] = true;
                C10040d.m46737a(this.f26754a.f26750N, aVar);
                a[8] = true;
            }
        }

        C10046d(C10040d dVar, Bitmap bitmap, Activity activity) {
            boolean[] a = m46760a();
            this.f26750N = dVar;
            this.f26751a = bitmap;
            this.f26752b = activity;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46760a() {
            boolean[] zArr = f26749O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(5821984971811895362L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$4", 5);
            f26749O = a;
            return a;
        }

        public void run() {
            boolean[] a = m46760a();
            Bitmap bitmap = this.f26751a;
            Activity activity = this.f26752b;
            a[1] = true;
            File visualUserStepsDirectory = VisualUserStepsHelper.getVisualUserStepsDirectory(activity);
            StringBuilder sb = new StringBuilder();
            sb.append("step");
            C10040d dVar = this.f26750N;
            a[2] = true;
            sb.append(C10040d.m46739b(dVar).mo36080b().mo36046e());
            String sb2 = sb.toString();
            C10047a aVar = new C10047a(this);
            a[3] = true;
            BitmapUtils.saveBitmapAsPNG(bitmap, 70, visualUserStepsDirectory, sb2, aVar);
            a[4] = true;
        }
    }

    /* renamed from: com.instabug.library.visualusersteps.d$e */
    /* compiled from: VisualUserStepsProvider */
    static /* synthetic */ class C10048e {

        /* renamed from: a */
        static final /* synthetic */ int[] f26755a = new int[C9954a.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26756b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
            r0[8] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        static {
            /*
                boolean[] r0 = m46762a()
                com.instabug.library.model.d$a[] r1 = com.instabug.library.model.C9953d.C9954a.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f26755a = r1
                r1 = 0
                r2 = 3
                r3 = 4
                r4 = 2
                r5 = 1
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                int[] r1 = f26755a     // Catch:{ NoSuchFieldError -> 0x0021 }
                com.instabug.library.model.d$a r6 = com.instabug.library.model.C9953d.C9954a.ACTIVITY_CREATED     // Catch:{ NoSuchFieldError -> 0x0021 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0021 }
                r1[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0021 }
                r0[r5] = r5
                goto L_0x0023
            L_0x0021:
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0030 }
            L_0x0023:
                int[] r1 = f26755a     // Catch:{ NoSuchFieldError -> 0x0030 }
                com.instabug.library.model.d$a r6 = com.instabug.library.model.C9953d.C9954a.FRAGMENT_ATTACHED     // Catch:{ NoSuchFieldError -> 0x0030 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
                r1[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0030 }
                r0[r2] = r5
                goto L_0x0032
            L_0x0030:
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f26755a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.library.model.d$a r4 = com.instabug.library.model.C9953d.C9954a.ACTIVITY_RESUMED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r5
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0051 }
            L_0x0043:
                int[] r1 = f26755a     // Catch:{ NoSuchFieldError -> 0x0051 }
                com.instabug.library.model.d$a r2 = com.instabug.library.model.C9953d.C9954a.FRAGMENT_RESUMED     // Catch:{ NoSuchFieldError -> 0x0051 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0051 }
                r1 = 7
                r0[r1] = r5
                goto L_0x0055
            L_0x0051:
                r1 = 8
                r0[r1] = r5
            L_0x0055:
                r1 = 9
                r0[r1] = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.visualusersteps.C10040d.C10048e.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46762a() {
            boolean[] zArr = f26756b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6269525218413368247L, "com/instabug/library/visualusersteps/VisualUserStepsProvider$5", 10);
            f26756b = a;
            return a;
        }
    }

    static {
        boolean[] g = m46746g();
        g[71] = true;
    }

    @SuppressLint({"CheckResult"})
    private C10040d() {
        boolean[] g = m46746g();
        g[0] = true;
        g[1] = true;
        PoolProvider.postIOTask(new C10041a(this));
        g[2] = true;
        SDKCoreEventSubscriber.subscribe(new C10043b(this));
        g[3] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m46735a(C10040d dVar) {
        boolean[] g = m46746g();
        dVar.m46743d();
        g[67] = true;
    }

    /* renamed from: b */
    static /* synthetic */ C10037c m46739b(C10040d dVar) {
        boolean[] g = m46746g();
        C10037c cVar = dVar.f26737a;
        g[69] = true;
        return cVar;
    }

    /* renamed from: c */
    private void m46742c() {
        boolean[] g = m46746g();
        InstabugInternalTrackingDelegate instance = InstabugInternalTrackingDelegate.getInstance();
        g[35] = true;
        Activity targetActivity = instance.getTargetActivity();
        g[36] = true;
        new Handler().postDelayed(new C10044c(this, targetActivity), 500);
        g[37] = true;
    }

    /* renamed from: d */
    private void m46743d() {
        boolean[] g = m46746g();
        if (!SettingsManager.getInstance().isReproStepsScreenshotEnabled()) {
            g[55] = true;
        } else {
            g[56] = true;
            m46744e();
            g[57] = true;
        }
        m46745f();
        g[58] = true;
    }

    /* renamed from: e */
    private void m46744e() {
        boolean[] g = m46746g();
        if (this.f26737a.mo36083e() <= 20) {
            g[59] = true;
        } else {
            g[60] = true;
            int e = this.f26737a.mo36083e() - 20;
            g[61] = true;
            this.f26737a.mo36077a(e);
            g[62] = true;
        }
        g[63] = true;
    }

    /* renamed from: f */
    private void m46745f() {
        boolean[] g = m46746g();
        while (this.f26737a.mo36082d() > 100) {
            g[64] = true;
            this.f26737a.mo36081c();
            g[65] = true;
        }
        g[66] = true;
    }

    /* renamed from: g */
    private static /* synthetic */ boolean[] m46746g() {
        boolean[] zArr = f26736d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5334821578775426879L, "com/instabug/library/visualusersteps/VisualUserStepsProvider", 72);
        f26736d = a;
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ void m46736a(C10040d dVar, Activity activity, Bitmap bitmap) {
        boolean[] g = m46746g();
        dVar.m46733a(activity, bitmap);
        g[68] = true;
    }

    /* renamed from: b */
    public static C10040d m46740b() {
        boolean[] g = m46746g();
        if (f26735c != null) {
            g[4] = true;
        } else {
            g[5] = true;
            f26735c = new C10040d();
            g[6] = true;
        }
        C10040d dVar = f26735c;
        g[7] = true;
        return dVar;
    }

    /* renamed from: a */
    static /* synthetic */ void m46737a(C10040d dVar, C10033a aVar) {
        boolean[] g = m46746g();
        dVar.m46734a(aVar);
        g[70] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36088a(com.instabug.library.model.C9953d.C9954a r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean[] r0 = m46746g()
            boolean r1 = com.instabug.library.core.InstabugCore.isForegroundBusy()
            r2 = 1
            if (r1 == 0) goto L_0x0010
            r5 = 8
            r0[r5] = r2
            return
        L_0x0010:
            int[] r1 = com.instabug.library.visualusersteps.C10040d.C10048e.f26755a
            int r3 = r5.ordinal()
            r1 = r1[r3]
            if (r1 == r2) goto L_0x0076
            r3 = 2
            if (r1 == r3) goto L_0x0076
            r3 = 3
            if (r1 == r3) goto L_0x002b
            r3 = 4
            if (r1 == r3) goto L_0x002b
            r4.m46741b(r5, r6, r7)
            r5 = 19
            r0[r5] = r2
            goto L_0x0084
        L_0x002b:
            com.instabug.library.visualusersteps.c r1 = r4.f26737a
            com.instabug.library.visualusersteps.a r1 = r1.mo36080b()
            if (r1 != 0) goto L_0x0038
            r1 = 11
            r0[r1] = r2
            goto L_0x004d
        L_0x0038:
            com.instabug.library.visualusersteps.c r1 = r4.f26737a
            com.instabug.library.visualusersteps.a r1 = r1.mo36080b()
            boolean r1 = r1.mo36048g()
            if (r1 != 0) goto L_0x0049
            r1 = 12
            r0[r1] = r2
            goto L_0x0054
        L_0x0049:
            r1 = 13
            r0[r1] = r2
        L_0x004d:
            r4.m46738a(r6)
            r1 = 14
            r0[r1] = r2
        L_0x0054:
            com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()
            boolean r1 = r1.isReproStepsScreenshotEnabled()
            if (r1 != 0) goto L_0x0063
            r1 = 15
            r0[r1] = r2
            goto L_0x006e
        L_0x0063:
            r1 = 16
            r0[r1] = r2
            r4.m46742c()
            r1 = 17
            r0[r1] = r2
        L_0x006e:
            r4.m46741b(r5, r6, r7)
            r5 = 18
            r0[r5] = r2
            goto L_0x0084
        L_0x0076:
            r4.m46738a(r6)
            r1 = 9
            r0[r1] = r2
            r4.m46741b(r5, r6, r7)
            r5 = 10
            r0[r5] = r2
        L_0x0084:
            r5 = 20
            r0[r5] = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.visualusersteps.C10040d.mo36088a(com.instabug.library.model.d$a, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    private void m46741b(C9954a aVar, String str, String str2) {
        boolean[] g = m46746g();
        if (this.f26737a.mo36080b() != null) {
            g[22] = true;
        } else {
            g[23] = true;
            m46738a(str);
            g[24] = true;
        }
        C10037c cVar = this.f26737a;
        C10036b a = C10034b.m46674a(aVar);
        g[25] = true;
        C10036b b = a.mo36071b(str);
        C10037c cVar2 = this.f26737a;
        g[26] = true;
        C10036b a2 = b.mo36069a(cVar2.mo36080b().mo36046e());
        g[27] = true;
        C10036b e = a2.mo36074e(str2);
        g[28] = true;
        C10034b a3 = e.mo36070a();
        g[29] = true;
        cVar.mo36079a(a3);
        g[30] = true;
    }

    /* renamed from: a */
    private void m46738a(String str) {
        boolean[] g = m46746g();
        C10037c cVar = this.f26737a;
        int i = f26734b + 1;
        f26734b = i;
        cVar.mo36078a(new C10032a(String.valueOf(i), str));
        g[21] = true;
    }

    /* renamed from: a */
    private void m46734a(C10033a aVar) {
        boolean[] g = m46746g();
        if (this.f26737a.mo36080b() == null) {
            g[31] = true;
        } else {
            g[32] = true;
            this.f26737a.mo36080b().mo36041a(aVar);
            g[33] = true;
        }
        g[34] = true;
    }

    /* renamed from: a */
    private void m46733a(Activity activity, Bitmap bitmap) {
        boolean[] g = m46746g();
        PoolProvider.postIOTask(new C10046d(this, bitmap, activity));
        g[38] = true;
    }

    /* renamed from: a */
    public ArrayList<C10034b> mo36087a() {
        boolean[] g = m46746g();
        m46743d();
        g[39] = true;
        ArrayList<C10034b> arrayList = new ArrayList<>();
        g[40] = true;
        Iterator it = this.f26737a.mo36076a().iterator();
        g[41] = true;
        while (it.hasNext()) {
            C10032a aVar = (C10032a) it.next();
            g[42] = true;
            C10036b a = C10034b.m46674a((C9954a) null);
            g[43] = true;
            String a2 = aVar.mo36040a();
            g[44] = true;
            C10036b b = a.mo36071b(a2);
            g[45] = true;
            C10036b a3 = b.mo36069a((String) null);
            g[46] = true;
            C10036b d = a3.mo36073d(aVar.mo36046e());
            g[47] = true;
            if (aVar.mo36047f() == null) {
                g[48] = true;
            } else {
                g[49] = true;
                C10036b c = d.mo36072c(aVar.mo36047f().mo36049a());
                g[50] = true;
                c.mo36075f(aVar.mo36047f().mo36051b());
                g[51] = true;
            }
            arrayList.add(d.mo36070a());
            g[52] = true;
            arrayList.addAll(aVar.mo36043b());
            g[53] = true;
        }
        g[54] = true;
        return arrayList;
    }
}
