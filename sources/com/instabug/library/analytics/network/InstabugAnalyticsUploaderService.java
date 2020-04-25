package com.instabug.library.analytics.network;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.analytics.AnalyticsObserver;
import com.instabug.library.analytics.util.C9712a;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugAnalyticsUploaderService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25713a;

    /* renamed from: com.instabug.library.analytics.network.InstabugAnalyticsUploaderService$a */
    class C9709a implements Callbacks<Boolean, Throwable> {

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f25714b;

        /* renamed from: a */
        final /* synthetic */ InstabugAnalyticsUploaderService f25715a;

        C9709a(InstabugAnalyticsUploaderService instabugAnalyticsUploaderService) {
            boolean[] a = m45299a();
            this.f25715a = instabugAnalyticsUploaderService;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m45299a() {
            boolean[] zArr = f25714b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-1926544188706901261L, "com/instabug/library/analytics/network/InstabugAnalyticsUploaderService$1", 11);
            f25714b = a;
            return a;
        }

        /* renamed from: a */
        public void mo34689a(Boolean bool) {
            boolean[] a = m45299a();
            AnalyticsObserver.setLastUploadedAt(System.currentTimeMillis(), this.f25715a);
            try {
                a[1] = true;
                C9712a.m45309a();
                a[2] = true;
                C9712a.m45312c();
                a[3] = true;
            } catch (JSONException e) {
                a[4] = true;
                InstabugSDKLogger.m46624e(InstabugAnalyticsUploaderService.class, e.getMessage(), e);
                a[5] = true;
            }
            a[6] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m45299a();
            mo34690a((Throwable) obj);
            a[9] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m45299a();
            mo34689a((Boolean) obj);
            a[10] = true;
        }

        /* renamed from: a */
        public void mo34690a(Throwable th) {
            boolean[] a = m45299a();
            a[7] = true;
            InstabugSDKLogger.m46624e(InstabugAnalyticsUploaderService.class, th.getMessage(), th);
            a[8] = true;
        }
    }

    public InstabugAnalyticsUploaderService() {
        m45298b()[0] = true;
    }

    /* renamed from: a */
    public static void m45297a(Context context, Intent intent) {
        boolean[] b = m45298b();
        C9969b.enqueueInstabugWork(context, InstabugAnalyticsUploaderService.class, 2592, intent);
        b[1] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45298b() {
        boolean[] zArr = f25713a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4000748423949163679L, "com/instabug/library/analytics/network/InstabugAnalyticsUploaderService", 12);
        f25713a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws Exception {
        boolean[] b = m45298b();
        if (System.currentTimeMillis() - AnalyticsObserver.getLastUploadedAt(this) <= 86400000) {
            b[2] = true;
        } else {
            b[3] = true;
            m45296a();
            b[4] = true;
        }
        b[5] = true;
    }

    /* renamed from: a */
    private void m45296a() throws IOException, JSONException {
        boolean[] b = m45298b();
        ArrayList b2 = C9712a.m45311b();
        b[6] = true;
        if (b2 == null) {
            b[7] = true;
        } else if (b2.size() <= 0) {
            b[8] = true;
        } else {
            b[9] = true;
            C9710a.m45302a().mo34691a(this, b2, new C9709a(this));
            b[10] = true;
        }
        b[11] = true;
    }
}
