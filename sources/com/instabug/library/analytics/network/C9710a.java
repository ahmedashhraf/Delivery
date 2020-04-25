package com.instabug.library.analytics.network;

import android.content.Context;
import com.amplitude.api.C2876e;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import p195e.p196a.C12280i0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.analytics.network.a */
/* compiled from: AnalyticsService */
class C9710a {

    /* renamed from: b */
    private static C9710a f25716b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25717c;

    /* renamed from: a */
    private NetworkManager f25718a = new NetworkManager();

    /* renamed from: com.instabug.library.analytics.network.a$a */
    /* compiled from: AnalyticsService */
    class C9711a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25719O;

        /* renamed from: N */
        final /* synthetic */ C9710a f25720N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25721b;

        C9711a(C9710a aVar, Callbacks callbacks) {
            boolean[] c = m45305c();
            this.f25720N = aVar;
            this.f25721b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m45305c() {
            boolean[] zArr = f25719O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(8904764527803630904L, "com/instabug/library/analytics/network/AnalyticsService$1", 10);
            f25719O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m45305c();
            mo34692a((RequestResponse) obj);
            c[9] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m45305c();
            InstabugSDKLogger.m46626v(this, "analyticsRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m45305c();
            InstabugSDKLogger.m46626v(this, "analyticsRequest completed");
            c[3] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m45305c();
            this.f25721b.onFailed(th);
            c[2] = true;
        }

        /* renamed from: a */
        public void mo34692a(RequestResponse requestResponse) {
            boolean[] c = m45305c();
            StringBuilder sb = new StringBuilder();
            sb.append("analyticsRequest onNext, Response code: ");
            c[4] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[7] = true;
            this.f25721b.onSucceeded(Boolean.valueOf(true));
            c[8] = true;
        }
    }

    private C9710a() {
        boolean[] b = m45303b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9710a m45302a() {
        boolean[] b = m45303b();
        if (f25716b != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f25716b = new C9710a();
            b[2] = true;
        }
        C9710a aVar = f25716b;
        b[3] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m45303b() {
        boolean[] zArr = f25717c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-673661066753025147L, "com/instabug/library/analytics/network/AnalyticsService", 12);
        f25717c = a;
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34691a(Context context, ArrayList<Api> arrayList, Callbacks<Boolean, Throwable> callbacks) throws JSONException, IOException {
        boolean[] b = m45303b();
        InstabugSDKLogger.m46622d(this, "starting upload SDK analytics");
        b[6] = true;
        Request buildRequest = this.f25718a.buildRequest(context, Endpoint.Analytics, RequestMethod.Post);
        b[7] = true;
        buildRequest.mo35528a(State.KEY_SDK_VERSION, "8.0.11");
        b[8] = true;
        buildRequest.mo35528a(C2876e.f10125d0, "android");
        b[9] = true;
        buildRequest.mo35528a("method_logs", Api.toJson(arrayList));
        b[10] = true;
        this.f25718a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9711a<Object>(this, callbacks));
        b[11] = true;
    }
}
