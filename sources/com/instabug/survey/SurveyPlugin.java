package com.instabug.survey;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventSubscriber;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.OnDiskCache;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.C10060a.C10062b;
import com.instabug.survey.C10060a.C10063c;
import com.instabug.survey.cache.SurveysCacheManager;
import com.instabug.survey.models.Survey;
import com.instabug.survey.network.service.InstabugSurveysSubmitterService;
import com.instabug.survey.p398b.C10070f;
import java.lang.ref.WeakReference;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12331g;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class SurveyPlugin extends Plugin {
    private static transient /* synthetic */ boolean[] $jacocoData;
    private C12314c subscribe;

    /* renamed from: com.instabug.survey.SurveyPlugin$a */
    class C10055a implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26764b;

        /* renamed from: a */
        final /* synthetic */ SurveyPlugin f26765a;

        C10055a(SurveyPlugin surveyPlugin) {
            boolean[] a = m46763a();
            this.f26765a = surveyPlugin;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46763a() {
            boolean[] zArr = f26764b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-2499028066150177906L, "com/instabug/survey/SurveyPlugin$1", 2);
            f26764b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46763a();
            SurveyPlugin.access$000(this.f26765a);
            a[1] = true;
        }
    }

    /* renamed from: com.instabug.survey.SurveyPlugin$b */
    class C10056b implements C12331g<SDKCoreEvent> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26766b;

        /* renamed from: a */
        final /* synthetic */ SurveyPlugin f26767a;

        C10056b(SurveyPlugin surveyPlugin) {
            boolean[] a = m46764a();
            this.f26767a = surveyPlugin;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46764a() {
            boolean[] zArr = f26766b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5146801353723120392L, "com/instabug/survey/SurveyPlugin$2", 29);
            f26766b = a;
            return a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
            r3 = 65535;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
            if (r3 == 0) goto L_0x00f2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
            if (r3 == 1) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
            if (r3 == 2) goto L_0x009a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
            if (r3 == 3) goto L_0x0079;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            r0[12] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
            if (r8.getValue().equals("activated") != false) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0085, code lost:
            r0[24] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008b, code lost:
            r0[25] = true;
            com.instabug.survey.SurveyPlugin.access$300(r7.f26767a);
            r0[26] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
            if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Feature.VALUE_FETCHED) != false) goto L_0x00ab;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
            r0[21] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
            r0[22] = true;
            com.instabug.survey.SurveyPlugin.access$200(r7.f26767a);
            r0[23] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
            if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.Session.VALUE_STARTED) != false) goto L_0x00ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
            r0[16] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
            r0[17] = true;
            com.instabug.survey.C10060a.m46770a(r7.f26767a.getAppContext()).mo36110d();
            r0[18] = true;
            com.instabug.survey.SurveyPlugin.access$200(r7.f26767a);
            r0[19] = true;
            com.instabug.survey.SurveyPlugin.access$300(r7.f26767a);
            r0[20] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
            if (r8.getValue().equals(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent.User.VALUE_LOGGED_OUT) != false) goto L_0x0103;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
            r0[13] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0103, code lost:
            r0[14] = true;
            com.instabug.survey.SurveyPlugin.access$100();
            r0[15] = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36100a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent r8) {
            /*
                r7 = this;
                boolean[] r0 = m46764a()
                boolean r1 = com.instabug.survey.p398b.C10070f.m46838b()
                r2 = 1
                if (r1 != 0) goto L_0x000f
                r0[r2] = r2
                goto L_0x010e
            L_0x000f:
                r1 = 2
                r0[r1] = r2
                java.lang.String r3 = r8.getType()
                r4 = -1
                int r5 = r3.hashCode()
                r6 = 3
                switch(r5) {
                    case -290659267: goto L_0x0057;
                    case 3599307: goto L_0x0046;
                    case 1843485230: goto L_0x0033;
                    case 1984987798: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                r0[r6] = r2
                goto L_0x006a
            L_0x0022:
                java.lang.String r5 = "session"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x002e
                r3 = 6
                r0[r3] = r2
                goto L_0x006a
            L_0x002e:
                r3 = 7
                r0[r3] = r2
                r3 = 1
                goto L_0x006b
            L_0x0033:
                java.lang.String r5 = "network"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x0040
                r3 = 10
                r0[r3] = r2
                goto L_0x006a
            L_0x0040:
                r3 = 11
                r0[r3] = r2
                r3 = 3
                goto L_0x006b
            L_0x0046:
                java.lang.String r5 = "user"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x0052
                r3 = 4
                r0[r3] = r2
                goto L_0x006a
            L_0x0052:
                r3 = 0
                r4 = 5
                r0[r4] = r2
                goto L_0x006b
            L_0x0057:
                java.lang.String r5 = "features"
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L_0x0064
                r3 = 8
                r0[r3] = r2
                goto L_0x006a
            L_0x0064:
                r3 = 9
                r0[r3] = r2
                r3 = 2
                goto L_0x006b
            L_0x006a:
                r3 = -1
            L_0x006b:
                if (r3 == 0) goto L_0x00f2
                if (r3 == r2) goto L_0x00b9
                if (r3 == r1) goto L_0x009a
                if (r3 == r6) goto L_0x0079
                r8 = 12
                r0[r8] = r2
                goto L_0x010e
            L_0x0079:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "activated"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x008b
                r8 = 24
                r0[r8] = r2
                goto L_0x010e
            L_0x008b:
                r8 = 25
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin r8 = r7.f26767a
                com.instabug.survey.SurveyPlugin.access$300(r8)
                r8 = 26
                r0[r8] = r2
                goto L_0x010e
            L_0x009a:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "fetched"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x00ab
                r8 = 21
                r0[r8] = r2
                goto L_0x010e
            L_0x00ab:
                r8 = 22
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin r8 = r7.f26767a
                com.instabug.survey.SurveyPlugin.access$200(r8)
                r8 = 23
                r0[r8] = r2
                goto L_0x010e
            L_0x00b9:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "started"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x00ca
                r8 = 16
                r0[r8] = r2
                goto L_0x010e
            L_0x00ca:
                r8 = 17
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin r8 = r7.f26767a
                android.content.Context r8 = r8.getAppContext()
                com.instabug.survey.a r8 = com.instabug.survey.C10060a.m46770a(r8)
                r8.mo36110d()
                r8 = 18
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin r8 = r7.f26767a
                com.instabug.survey.SurveyPlugin.access$200(r8)
                r8 = 19
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin r8 = r7.f26767a
                com.instabug.survey.SurveyPlugin.access$300(r8)
                r8 = 20
                r0[r8] = r2
                goto L_0x010e
            L_0x00f2:
                java.lang.String r8 = r8.getValue()
                java.lang.String r1 = "logged_out"
                boolean r8 = r8.equals(r1)
                if (r8 != 0) goto L_0x0103
                r8 = 13
                r0[r8] = r2
                goto L_0x010e
            L_0x0103:
                r8 = 14
                r0[r8] = r2
                com.instabug.survey.SurveyPlugin.access$100()
                r8 = 15
                r0[r8] = r2
            L_0x010e:
                r8 = 27
                r0[r8] = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.SurveyPlugin.C10056b.mo36100a(com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent):void");
        }

        /* renamed from: c */
        public /* synthetic */ void mo33410c(Object obj) throws Exception {
            boolean[] a = m46764a();
            mo36100a((SDKCoreEvent) obj);
            a[28] = true;
        }
    }

    /* renamed from: com.instabug.survey.SurveyPlugin$c */
    class C10057c implements Runnable {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f26768b;

        /* renamed from: a */
        final /* synthetic */ SurveyPlugin f26769a;

        C10057c(SurveyPlugin surveyPlugin) {
            boolean[] a = m46767a();
            this.f26769a = surveyPlugin;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46767a() {
            boolean[] zArr = f26768b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(127623749823203967L, "com/instabug/survey/SurveyPlugin$3", 7);
            f26768b = a;
            return a;
        }

        public void run() {
            boolean[] a = m46767a();
            if (SurveyPlugin.access$400(this.f26769a) == null) {
                a[1] = true;
            } else {
                a[2] = true;
                Context context = (Context) SurveyPlugin.access$500(this.f26769a).get();
                if (context == null) {
                    a[3] = true;
                } else {
                    a[4] = true;
                    InstabugSurveysSubmitterService.m46933a(context, new Intent(context, InstabugSurveysSubmitterService.class));
                    a[5] = true;
                }
            }
            a[6] = true;
        }
    }

    private static /* synthetic */ boolean[] $jacocoInit() {
        boolean[] zArr = $jacocoData;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7573610832285345405L, "com/instabug/survey/SurveyPlugin", 43);
        $jacocoData = a;
        return a;
    }

    public SurveyPlugin() {
        $jacocoInit()[0] = true;
    }

    static /* synthetic */ void access$000(SurveyPlugin surveyPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        surveyPlugin.prepareSurveysCache();
        $jacocoInit[37] = true;
    }

    static /* synthetic */ void access$100() {
        boolean[] $jacocoInit = $jacocoInit();
        clearUserActivities();
        $jacocoInit[38] = true;
    }

    static /* synthetic */ void access$200(SurveyPlugin surveyPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        surveyPlugin.startFetchingSurveys();
        $jacocoInit[39] = true;
    }

    static /* synthetic */ void access$300(SurveyPlugin surveyPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        surveyPlugin.startSubmittingPendingSurveys();
        $jacocoInit[40] = true;
    }

    static /* synthetic */ WeakReference access$400(SurveyPlugin surveyPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = surveyPlugin.contextWeakReference;
        $jacocoInit[41] = true;
        return weakReference;
    }

    static /* synthetic */ WeakReference access$500(SurveyPlugin surveyPlugin) {
        boolean[] $jacocoInit = $jacocoInit();
        WeakReference<Context> weakReference = surveyPlugin.contextWeakReference;
        $jacocoInit[42] = true;
        return weakReference;
    }

    private static void clearUserActivities() {
        boolean[] $jacocoInit = $jacocoInit();
        C10063c.m46803e().mo36123a(0);
        $jacocoInit[21] = true;
    }

    private void prepareSurveysCache() {
        boolean[] $jacocoInit = $jacocoInit();
        InstabugSDKLogger.m46626v(this, "Creating Surveys disk cache");
        $jacocoInit[22] = true;
        WeakReference<Context> weakReference = this.contextWeakReference;
        if (weakReference == null) {
            $jacocoInit[23] = true;
        } else if (weakReference.get() == null) {
            $jacocoInit[24] = true;
        } else {
            $jacocoInit[25] = true;
            OnDiskCache onDiskCache = new OnDiskCache((Context) this.contextWeakReference.get(), SurveysCacheManager.SURVEYS_DISK_CACHE_KEY, SurveysCacheManager.SURVEYS_DISK_CACHE_FILE_NAME, Survey.class);
            $jacocoInit[26] = true;
            CacheManager.getInstance().addCache(onDiskCache);
            $jacocoInit[27] = true;
        }
        $jacocoInit[28] = true;
    }

    private void startFetchingSurveys() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!C10070f.m46838b()) {
            $jacocoInit[29] = true;
        } else {
            $jacocoInit[30] = true;
            WeakReference<Context> weakReference = this.contextWeakReference;
            if (weakReference == null) {
                $jacocoInit[31] = true;
            } else if (weakReference.get() == null) {
                $jacocoInit[32] = true;
            } else {
                $jacocoInit[33] = true;
                InstabugSDKLogger.m46626v(this, "initialize Instabug Surveys Manager");
                $jacocoInit[34] = true;
                C10060a.m46770a((Context) this.contextWeakReference.get()).mo36102a();
                $jacocoInit[35] = true;
            }
        }
        $jacocoInit[36] = true;
    }

    private void startSubmittingPendingSurveys() {
        boolean[] $jacocoInit = $jacocoInit();
        if (!C10070f.m46837a()) {
            $jacocoInit[12] = true;
        } else if (!C10070f.m46838b()) {
            $jacocoInit[13] = true;
        } else {
            $jacocoInit[14] = true;
            HandlerThread handlerThread = new HandlerThread("submit-surveys-handler");
            $jacocoInit[15] = true;
            handlerThread.start();
            $jacocoInit[16] = true;
            Looper looper = handlerThread.getLooper();
            $jacocoInit[17] = true;
            Handler handler = new Handler(looper);
            $jacocoInit[18] = true;
            handler.post(new C10057c(this));
            $jacocoInit[19] = true;
        }
        $jacocoInit[20] = true;
    }

    private void subscribeOnSDKEvents() {
        boolean[] $jacocoInit = $jacocoInit();
        this.subscribe = SDKCoreEventSubscriber.subscribe(new C10056b(this));
        $jacocoInit[11] = true;
    }

    public long getLastActivityTime() {
        boolean[] $jacocoInit = $jacocoInit();
        long a = C10063c.m46803e().mo36121a();
        $jacocoInit[10] = true;
        return a;
    }

    public void init(Context context) {
        boolean[] $jacocoInit = $jacocoInit();
        super.init(context);
        $jacocoInit[1] = true;
        C10063c.m46802a(context);
        $jacocoInit[2] = true;
        C10062b.m46791e();
        $jacocoInit[3] = true;
        PoolProvider.postIOTask(new C10055a(this));
        $jacocoInit[4] = true;
        subscribeOnSDKEvents();
        $jacocoInit[5] = true;
    }

    public void release() {
        boolean[] $jacocoInit = $jacocoInit();
        C12314c cVar = this.subscribe;
        if (cVar == null) {
            $jacocoInit[6] = true;
        } else {
            $jacocoInit[7] = true;
            cVar.dispose();
            $jacocoInit[8] = true;
        }
        $jacocoInit[9] = true;
    }
}
