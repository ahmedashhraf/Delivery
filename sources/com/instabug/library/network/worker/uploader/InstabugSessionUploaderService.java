package com.instabug.library.network.worker.uploader;

import android.content.Context;
import android.content.Intent;
import com.instabug.library.internal.storage.cache.C9841c;
import com.instabug.library.model.Session;
import com.instabug.library.network.C9969b;
import com.instabug.library.network.InstabugNetworkBasedBackgroundService;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.p394a.C9967d;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import p205i.p471b.p472a.p473a.p474c.C13938g;

public class InstabugSessionUploaderService extends InstabugNetworkBasedBackgroundService {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26523a;

    /* renamed from: com.instabug.library.network.worker.uploader.InstabugSessionUploaderService$a */
    class C9974a implements Callbacks<Boolean, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f26524c;

        /* renamed from: a */
        final /* synthetic */ Session f26525a;

        /* renamed from: b */
        final /* synthetic */ InstabugSessionUploaderService f26526b;

        C9974a(InstabugSessionUploaderService instabugSessionUploaderService, Session session) {
            boolean[] a = m46384a();
            this.f26526b = instabugSessionUploaderService;
            this.f26525a = session;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46384a() {
            boolean[] zArr = f26524c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7142293450812535660L, "com/instabug/library/network/worker/uploader/InstabugSessionUploaderService$1", 7);
            f26524c = a;
            return a;
        }

        /* renamed from: a */
        public void mo35579a(Boolean bool) {
            boolean[] a = m46384a();
            InstabugSessionUploaderService instabugSessionUploaderService = this.f26526b;
            StringBuilder sb = new StringBuilder();
            sb.append("Session ");
            sb.append(this.f26525a);
            sb.append(" synced successfully");
            InstabugSDKLogger.m46622d(instabugSessionUploaderService, sb.toString());
            a[1] = true;
            C9841c.m45855a((long) this.f26525a.mo35366a());
            a[2] = true;
            InstabugSessionUploaderService instabugSessionUploaderService2 = this.f26526b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Session deleted: ");
            sb2.append(this.f26525a);
            InstabugSDKLogger.m46622d(instabugSessionUploaderService2, sb2.toString());
            a[3] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m46384a();
            mo35580a((Throwable) obj);
            a[5] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m46384a();
            mo35579a((Boolean) obj);
            a[6] = true;
        }

        /* renamed from: a */
        public void mo35580a(Throwable th) {
            boolean[] a = m46384a();
            InstabugSessionUploaderService instabugSessionUploaderService = this.f26526b;
            StringBuilder sb = new StringBuilder();
            sb.append("Something went wrong while sending session: ");
            sb.append(this.f26525a);
            InstabugSDKLogger.m46622d(instabugSessionUploaderService, sb.toString());
            a[4] = true;
        }
    }

    public InstabugSessionUploaderService() {
        m46383b()[0] = true;
    }

    /* renamed from: a */
    public static void m46382a(Context context, Intent intent) {
        boolean[] b = m46383b();
        C9969b.enqueueInstabugWork(context, InstabugSessionUploaderService.class, 2579, intent);
        b[2] = true;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46383b() {
        boolean[] zArr = f26523a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(1289044148700840873L, "com/instabug/library/network/worker/uploader/InstabugSessionUploaderService", 10);
        f26523a = a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void runBackgroundTask() throws IOException, JSONException {
        boolean[] b = m46383b();
        m46381a();
        b[1] = true;
    }

    /* renamed from: a */
    private void m46381a() throws JSONException, IOException {
        boolean[] b = m46383b();
        List<Session> a = C9841c.m45854a();
        b[3] = true;
        StringBuilder sb = new StringBuilder();
        sb.append("Found ");
        sb.append(a.size());
        sb.append(" sessions in cache");
        InstabugSDKLogger.m46622d(this, sb.toString());
        b[4] = true;
        b[5] = true;
        for (Session session : a) {
            b[6] = true;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Syncing session ");
            sb2.append(session);
            InstabugSDKLogger.m46622d(this, sb2.toString());
            b[7] = true;
            C9967d.m46362a().mo35570a(this, session, new C9974a(this, session));
            b[8] = true;
        }
        b[9] = true;
    }
}
