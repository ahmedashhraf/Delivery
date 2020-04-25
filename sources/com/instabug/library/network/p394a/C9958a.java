package com.instabug.library.network.p394a;

import android.content.Context;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import p195e.p196a.C12280i0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.a.a */
/* compiled from: FeaturesService */
public class C9958a {

    /* renamed from: b */
    private static C9958a f26483b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26484c;

    /* renamed from: a */
    private NetworkManager f26485a = new NetworkManager();

    /* renamed from: com.instabug.library.network.a.a$a */
    /* compiled from: FeaturesService */
    class C9959a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26486O;

        /* renamed from: N */
        final /* synthetic */ C9958a f26487N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26488b;

        C9959a(C9958a aVar, Callbacks callbacks) {
            boolean[] c = m46338c();
            this.f26487N = aVar;
            this.f26488b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46338c() {
            boolean[] zArr = f26486O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6600793300703689426L, "com/instabug/library/network/service/FeaturesService$1", 10);
            f26486O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46338c();
            mo35561a((RequestResponse) obj);
            c[9] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m46338c();
            InstabugSDKLogger.m46622d(this, "getAppFeatures request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m46338c();
            InstabugSDKLogger.m46622d(this, "getAppFeatures request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46338c();
            StringBuilder sb = new StringBuilder();
            sb.append("getAppFeatures request got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[3] = true;
            this.f26488b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo35561a(RequestResponse requestResponse) {
            boolean[] c = m46338c();
            StringBuilder sb = new StringBuilder();
            sb.append("getAppFeatures request onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[7] = true;
            this.f26488b.onSucceeded((String) requestResponse.getResponseBody());
            c[8] = true;
        }
    }

    private C9958a() {
        boolean[] b = m46336b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9958a m46335a() {
        boolean[] b = m46336b();
        if (f26483b != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f26483b = new C9958a();
            b[2] = true;
        }
        C9958a aVar = f26483b;
        b[3] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46336b() {
        boolean[] zArr = f26484c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-5434680116635227307L, "com/instabug/library/network/service/FeaturesService", 9);
        f26484c = a;
        return a;
    }

    /* renamed from: a */
    public void mo35560a(Context context, Callbacks<String, Throwable> callbacks) throws JSONException {
        boolean[] b = m46336b();
        InstabugSDKLogger.m46622d(this, "Getting enabled features for this application");
        b[6] = true;
        Request buildRequest = this.f26485a.buildRequest(context, Endpoint.AppSettings, RequestMethod.Get);
        b[7] = true;
        this.f26485a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9959a<Object>(this, callbacks));
        b[8] = true;
    }
}
