package com.instabug.featuresrequest.network.service;

import android.content.Context;
import com.instabug.featuresrequest.models.C9567a;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.network.service.a */
/* compiled from: AddNewFeatureService */
public class C9578a {

    /* renamed from: b */
    private static volatile C9578a f25336b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25337c;

    /* renamed from: a */
    private NetworkManager f25338a;

    /* renamed from: com.instabug.featuresrequest.network.service.a$a */
    /* compiled from: AddNewFeatureService */
    class C9579a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25339O;

        /* renamed from: N */
        final /* synthetic */ C9578a f25340N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25341b;

        C9579a(C9578a aVar, Callbacks callbacks) {
            boolean[] c = m44779c();
            this.f25340N = aVar;
            this.f25341b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44779c() {
            boolean[] zArr = f25339O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-8478124205425649807L, "com/instabug/featuresrequest/network/service/AddNewFeatureService$1", 19);
            f25339O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44779c();
            mo34320a((RequestResponse) obj);
            c[18] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44779c();
            InstabugSDKLogger.m46622d(this, "sendFeatureRequest request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44779c();
            InstabugSDKLogger.m46622d(this, "sendFeatureRequest request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44779c();
            StringBuilder sb = new StringBuilder();
            sb.append("sendFeatureRequest request got error: ");
            c[3] = true;
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            c[4] = true;
            InstabugSDKLogger.m46622d(this, sb2);
            c[5] = true;
            this.f25341b.onFailed(th);
            c[6] = true;
        }

        /* renamed from: a */
        public void mo34320a(RequestResponse requestResponse) {
            boolean[] c = m44779c();
            StringBuilder sb = new StringBuilder();
            sb.append("sendFeatureRequest request onNext, Response code: ");
            c[7] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[8] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[9] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[10] = true;
            if (requestResponse.getResponseCode() != 200) {
                c[11] = true;
            } else {
                c[12] = true;
                if (requestResponse.getResponseBody() == null) {
                    c[13] = true;
                } else {
                    c[14] = true;
                    this.f25341b.onSucceeded(Boolean.valueOf(true));
                    c[15] = true;
                    c[17] = true;
                }
            }
            this.f25341b.onSucceeded(Boolean.valueOf(false));
            c[16] = true;
            c[17] = true;
        }
    }

    private C9578a() {
        boolean[] b = m44777b();
        if (f25336b == null) {
            this.f25338a = new NetworkManager();
            b[2] = true;
            return;
        }
        b[0] = true;
        RuntimeException runtimeException = new RuntimeException("Use getInstance() method to get the single instance of this class");
        b[1] = true;
        throw runtimeException;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C9578a m44776a() {
        boolean[] b = m44777b();
        if (f25336b != null) {
            b[3] = true;
        } else {
            synchronized (C9578a.class) {
                try {
                    b[4] = true;
                    if (f25336b != null) {
                        b[5] = true;
                    } else {
                        b[6] = true;
                        f25336b = new C9578a();
                        b[7] = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        b[9] = true;
                        throw th;
                    }
                }
            }
            b[8] = true;
        }
        C9578a aVar = f25336b;
        b[10] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44777b() {
        boolean[] zArr = f25337c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(4478942563008726699L, "com/instabug/featuresrequest/network/service/AddNewFeatureService", 20);
        f25337c = a;
        return a;
    }

    /* renamed from: a */
    public void mo34319a(Context context, C9567a aVar, Callbacks<Boolean, Throwable> callbacks) throws JSONException {
        boolean[] b = m44777b();
        InstabugSDKLogger.m46622d(this, "Sending new feature");
        b[11] = true;
        Request buildRequest = this.f25338a.buildRequest(context, Endpoint.ADD_NEW_FEATURE, RequestMethod.Post);
        b[12] = true;
        buildRequest.mo35536b("email", InstabugCore.getEnteredEmail());
        b[13] = true;
        buildRequest.mo35536b("name", InstabugCore.getEnteredUsername());
        b[14] = true;
        JSONObject i = aVar.mo34272i();
        b[15] = true;
        buildRequest.mo35536b("feature_request", i);
        b[16] = true;
        C5923b0 c = this.f25338a.doRequest(buildRequest).mo23950c(C12228b.m55095c());
        b[17] = true;
        C5923b0 a = c.mo23825a(C12304a.m55390a());
        C9579a aVar2 = new C9579a(this, callbacks);
        b[18] = true;
        a.mo23893a((C12280i0<? super T>) aVar2);
        b[19] = true;
    }
}
