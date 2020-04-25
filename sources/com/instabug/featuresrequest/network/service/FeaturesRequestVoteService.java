package com.instabug.featuresrequest.network.service;

import android.content.Context;
import android.content.Intent;
import com.instabug.featuresrequest.cache.C9561a;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.featuresrequest.models.C9567a.C9569b;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class FeaturesRequestVoteService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25330a;

    /* renamed from: com.instabug.featuresrequest.network.service.FeaturesRequestVoteService$a */
    class C9576a implements Callbacks<JSONObject, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25331c;

        /* renamed from: a */
        final /* synthetic */ C9567a f25332a;

        /* renamed from: b */
        final /* synthetic */ FeaturesRequestVoteService f25333b;

        C9576a(FeaturesRequestVoteService featuresRequestVoteService, C9567a aVar) {
            boolean[] a = m44772a();
            this.f25333b = featuresRequestVoteService;
            this.f25332a = aVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44772a() {
            boolean[] zArr = f25331c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7169626247149627346L, "com/instabug/featuresrequest/network/service/FeaturesRequestVoteService$1", 5);
            f25331c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34318a(JSONObject jSONObject) {
            boolean[] a = m44772a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25332a.mo34271h());
            sb.append("");
            C9561a.m44676a(sb.toString());
            a[1] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44772a();
            mo34317a((Throwable) obj);
            a[3] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44772a();
            mo34318a((JSONObject) obj);
            a[4] = true;
        }

        /* renamed from: a */
        public void mo34317a(Throwable th) {
            boolean[] a = m44772a();
            InstabugSDKLogger.m46624e(this, th.getMessage(), th);
            a[2] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.network.service.FeaturesRequestVoteService$b */
    static /* synthetic */ class C9577b {

        /* renamed from: a */
        static final /* synthetic */ int[] f25334a = new int[C9569b.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25335b;

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
                boolean[] r0 = m44775a()
                com.instabug.featuresrequest.models.a$b[] r1 = com.instabug.featuresrequest.models.C9567a.C9569b.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f25334a = r1
                r1 = 0
                r2 = 2
                r3 = 1
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                int[] r1 = f25334a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.instabug.featuresrequest.models.a$b r4 = com.instabug.featuresrequest.models.C9567a.C9569b.USER_VOTED_UP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r1[r4] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
                r0[r3] = r3
                goto L_0x0021
            L_0x001f:
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0021:
                int[] r1 = f25334a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.featuresrequest.models.a$b r4 = com.instabug.featuresrequest.models.C9567a.C9569b.USER_UN_VOTED     // Catch:{ NoSuchFieldError -> 0x002f }
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
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.network.service.FeaturesRequestVoteService.C9577b.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44775a() {
            boolean[] zArr = f25335b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(550319315722194302L, "com/instabug/featuresrequest/network/service/FeaturesRequestVoteService$2", 6);
            f25335b = a;
            return a;
        }
    }

    public FeaturesRequestVoteService() {
        m44771b()[0] = true;
    }

    /* renamed from: a */
    public static void m44769a(Context context, Intent intent) {
        boolean[] b = m44771b();
        C9969b.enqueueInstabugWork(context, FeaturesRequestVoteService.class, 2584, intent);
        b[1] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44771b() {
        boolean[] zArr = f25330a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3174143998115556609L, "com/instabug/featuresrequest/network/service/FeaturesRequestVoteService", 16);
        f25330a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] b = m44771b();
        InstabugSDKLogger.m46622d(this, "runBackgroundTask started");
        b[2] = true;
        m44768a();
        b[3] = true;
    }

    /* renamed from: a */
    private void m44768a() throws JSONException {
        boolean[] b = m44771b();
        InstabugSDKLogger.m46622d(this, "submitVotes started");
        b[4] = true;
        List<C9567a> a = C9561a.m44675a();
        b[5] = true;
        b[6] = true;
        for (C9567a aVar : a) {
            b[7] = true;
            int i = C9577b.f25334a[aVar.mo34276m().ordinal()];
            if (i == 1) {
                m44770a(aVar, RequestMethod.Post);
                b[9] = true;
            } else if (i != 2) {
                b[8] = true;
            } else {
                m44770a(aVar, RequestMethod.Delete);
                b[10] = true;
            }
            b[11] = true;
        }
        b[12] = true;
    }

    /* renamed from: a */
    private void m44770a(C9567a aVar, RequestMethod requestMethod) throws JSONException {
        boolean[] b = m44771b();
        C9580b a = C9580b.m44783a();
        b[13] = true;
        long h = aVar.mo34271h();
        C9576a aVar2 = new C9576a(this, aVar);
        b[14] = true;
        a.mo34323a(this, h, requestMethod, aVar2);
        b[15] = true;
    }
}
