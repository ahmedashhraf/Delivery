package com.instabug.bug.view.actionList.service;

import android.content.Context;
import androidx.annotation.C0224v0;
import com.instabug.bug.settings.C9291a;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONArray;
import org.json.JSONException;
import p195e.p196a.C12280i0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.view.actionList.service.a */
/* compiled from: ReportCategoriesServiceHelper */
public class C9301a {

    /* renamed from: b */
    private static C9301a f24635b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f24636c;

    /* renamed from: a */
    private NetworkManager f24637a = new NetworkManager();

    /* renamed from: com.instabug.bug.view.actionList.service.a$a */
    /* compiled from: ReportCategoriesServiceHelper */
    class C9302a extends C13787e<RequestResponse> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f24638N;

        /* renamed from: b */
        final /* synthetic */ C9301a f24639b;

        C9302a(C9301a aVar) {
            boolean[] c = m43594c();
            this.f24639b = aVar;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m43594c() {
            boolean[] zArr = f24638N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(7572792286473157735L, "com/instabug/bug/view/actionList/service/ReportCategoriesServiceHelper$1", 21);
            f24638N = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m43594c();
            mo33694a((RequestResponse) obj);
            c[20] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m43594c();
            InstabugSDKLogger.m46622d(this, "getReportCategories request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m43594c();
            InstabugSDKLogger.m46622d(this, "getReportCategories request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m43594c();
            StringBuilder sb = new StringBuilder();
            sb.append("getReportCategories request got error: ");
            c[3] = true;
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            c[4] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            c[5] = true;
        }

        /* renamed from: a */
        public void mo33694a(RequestResponse requestResponse) {
            boolean[] c = m43594c();
            StringBuilder sb = new StringBuilder();
            sb.append("getReportCategories request onNext, Response code: ");
            c[6] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[7] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[8] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[9] = true;
            C9301a.m43588a(System.currentTimeMillis());
            c[10] = true;
            String str = (String) requestResponse.getResponseBody();
            try {
                c[11] = true;
                JSONArray jSONArray = new JSONArray(str);
                c[12] = true;
                if (jSONArray.length() == 0) {
                    c[13] = true;
                    C9301a.m43589a(this.f24639b, null);
                    c[14] = true;
                } else {
                    C9301a.m43589a(this.f24639b, str);
                    c[15] = true;
                }
                c[16] = true;
            } catch (JSONException e) {
                c[17] = true;
                e.printStackTrace();
                c[18] = true;
            }
            c[19] = true;
        }
    }

    private C9301a() {
        boolean[] c = m43592c();
        c[4] = true;
        c[5] = true;
    }

    /* renamed from: a */
    static /* synthetic */ void m43589a(C9301a aVar, String str) {
        boolean[] c = m43592c();
        aVar.m43590a(str);
        c[12] = true;
    }

    /* renamed from: b */
    static long m43591b() {
        boolean[] c = m43592c();
        long q = C9291a.m43476r().mo33624q();
        c[6] = true;
        return q;
    }

    /* renamed from: c */
    private static /* synthetic */ boolean[] m43592c() {
        boolean[] zArr = f24636c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(7549749768662253181L, "com/instabug/bug/view/actionList/service/ReportCategoriesServiceHelper", 13);
        f24636c = a;
        return a;
    }

    /* renamed from: a */
    public static C9301a m43587a() {
        boolean[] c = m43592c();
        if (f24635b != null) {
            c[0] = true;
        } else {
            c[1] = true;
            f24635b = new C9301a();
            c[2] = true;
        }
        C9301a aVar = f24635b;
        c[3] = true;
        return aVar;
    }

    @C0224v0
    /* renamed from: a */
    static void m43588a(long j) {
        boolean[] c = m43592c();
        C9291a.m43476r().mo33604b(j);
        c[7] = true;
    }

    /* renamed from: a */
    public void mo33693a(Context context) throws JSONException {
        boolean[] c = m43592c();
        InstabugSDKLogger.m46622d(this, "Getting enabled features for this application");
        c[8] = true;
        Request buildRequestWithoutUUID = this.f24637a.buildRequestWithoutUUID(context, Endpoint.ReportCategories, RequestMethod.Get);
        c[9] = true;
        this.f24637a.doRequest(buildRequestWithoutUUID).mo23893a((C12280i0<? super T>) new C9302a<Object>(this));
        c[10] = true;
    }

    /* renamed from: a */
    private void m43590a(String str) {
        boolean[] c = m43592c();
        C9291a.m43476r().mo33600a(str);
        c[11] = true;
    }
}
