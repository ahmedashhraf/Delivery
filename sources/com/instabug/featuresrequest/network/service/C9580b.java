package com.instabug.featuresrequest.network.service;

import android.content.Context;
import com.facebook.internal.ServerProtocol;
import com.instabug.featuresrequest.models.C9571c;
import com.instabug.featuresrequest.p371d.C9566b;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.Request.RequestParameter;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import com.mrsool.utils.webservice.C11687c;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5923b0;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p444s0.p445c.C12303a;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.network.service.b */
/* compiled from: FeaturesRequestService */
public class C9580b {

    /* renamed from: c */
    private static C9580b f25342c;

    /* renamed from: d */
    private static transient /* synthetic */ boolean[] f25343d;

    /* renamed from: a */
    private final String f25344a = C9580b.class.getSimpleName();

    /* renamed from: b */
    private NetworkManager f25345b;

    /* renamed from: com.instabug.featuresrequest.network.service.b$a */
    /* compiled from: FeaturesRequestService */
    class C9581a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25346O;

        /* renamed from: N */
        final /* synthetic */ C9580b f25347N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25348b;

        C9581a(C9580b bVar, Callbacks callbacks) {
            boolean[] c = m44790c();
            this.f25347N = bVar;
            this.f25348b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44790c() {
            boolean[] zArr = f25346O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4462559654161038456L, "com/instabug/featuresrequest/network/service/FeaturesRequestService$1", 25);
            f25346O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44790c();
            mo34325a((RequestResponse) obj);
            c[24] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44790c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25347N), "FeaturesRequests request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44790c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25347N), "FeaturesRequests request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44790c();
            String a = C9580b.m44784a(this.f25347N);
            StringBuilder sb = new StringBuilder();
            sb.append("FeaturesRequests request got error: ");
            c[3] = true;
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            c[4] = true;
            InstabugSDKLogger.m46624e(a, sb2, th);
            c[5] = true;
            this.f25348b.onFailed(th);
            c[6] = true;
        }

        /* renamed from: a */
        public void mo34325a(RequestResponse requestResponse) {
            boolean[] c = m44790c();
            String a = C9580b.m44784a(this.f25347N);
            StringBuilder sb = new StringBuilder();
            sb.append("FeaturesRequests request onNext, Response code: ");
            c[7] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[8] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[9] = true;
            InstabugSDKLogger.m46626v(a, sb2);
            c[10] = true;
            if (requestResponse.getResponseCode() == 200) {
                try {
                    c[11] = true;
                    Callbacks callbacks = this.f25348b;
                    c[12] = true;
                    JSONObject jSONObject = new JSONObject((String) requestResponse.getResponseBody());
                    c[13] = true;
                    callbacks.onSucceeded(jSONObject);
                    c[14] = true;
                } catch (JSONException e) {
                    c[15] = true;
                    String a2 = C9580b.m44784a(this.f25347N);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("FeaturesRequests request got JSONException: ");
                    c[16] = true;
                    sb3.append(e.getMessage());
                    String sb4 = sb3.toString();
                    c[17] = true;
                    InstabugSDKLogger.m46624e(a2, sb4, e);
                    c[18] = true;
                    this.f25348b.onFailed(e);
                    c[19] = true;
                }
            } else {
                Callbacks callbacks2 = this.f25348b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Fetching FeaturesRequests request got error with response code:");
                c[20] = true;
                sb5.append(requestResponse.getResponseCode());
                Throwable th = new Throwable(sb5.toString());
                c[21] = true;
                callbacks2.onFailed(th);
                c[22] = true;
            }
            c[23] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.network.service.b$b */
    /* compiled from: FeaturesRequestService */
    class C9582b extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25349O;

        /* renamed from: N */
        final /* synthetic */ C9580b f25350N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25351b;

        C9582b(C9580b bVar, Callbacks callbacks) {
            boolean[] c = m44794c();
            this.f25350N = bVar;
            this.f25351b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44794c() {
            boolean[] zArr = f25349O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(6283367458869891070L, "com/instabug/featuresrequest/network/service/FeaturesRequestService$2", 23);
            f25349O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44794c();
            mo34326a((RequestResponse) obj);
            c[22] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44794c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25350N), "voting started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44794c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25350N), "voting completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44794c();
            String a = C9580b.m44784a(this.f25350N);
            StringBuilder sb = new StringBuilder();
            sb.append("voting got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(a, sb.toString(), th);
            c[3] = true;
            this.f25351b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo34326a(RequestResponse requestResponse) {
            boolean[] c = m44794c();
            String a = C9580b.m44784a(this.f25350N);
            StringBuilder sb = new StringBuilder();
            sb.append("voting onNext, Response code: ");
            c[5] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[6] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[7] = true;
            InstabugSDKLogger.m46626v(a, sb2);
            c[8] = true;
            if (requestResponse.getResponseCode() == 200) {
                try {
                    c[9] = true;
                    Callbacks callbacks = this.f25351b;
                    c[10] = true;
                    JSONObject jSONObject = new JSONObject((String) requestResponse.getResponseBody());
                    c[11] = true;
                    callbacks.onSucceeded(jSONObject);
                    c[12] = true;
                } catch (JSONException e) {
                    c[13] = true;
                    String a2 = C9580b.m44784a(this.f25350N);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("voting got JSONException: ");
                    c[14] = true;
                    sb3.append(e.getMessage());
                    String sb4 = sb3.toString();
                    c[15] = true;
                    InstabugSDKLogger.m46624e(a2, sb4, e);
                    c[16] = true;
                    this.f25351b.onFailed(e);
                    c[17] = true;
                }
            } else {
                Callbacks callbacks2 = this.f25351b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("vote request got error with response code:");
                c[18] = true;
                sb5.append(requestResponse.getResponseCode());
                Throwable th = new Throwable(sb5.toString());
                c[19] = true;
                callbacks2.onFailed(th);
                c[20] = true;
            }
            c[21] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.network.service.b$c */
    /* compiled from: FeaturesRequestService */
    class C9583c extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25352O;

        /* renamed from: N */
        final /* synthetic */ C9580b f25353N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25354b;

        C9583c(C9580b bVar, Callbacks callbacks) {
            boolean[] c = m44798c();
            this.f25353N = bVar;
            this.f25354b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44798c() {
            boolean[] zArr = f25352O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5242988860927786375L, "com/instabug/featuresrequest/network/service/FeaturesRequestService$4", 25);
            f25352O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44798c();
            mo34327a((RequestResponse) obj);
            c[24] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44798c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25353N), "start getting feature-request details");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44798c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25353N), "done getting feature-request details");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44798c();
            String a = C9580b.m44784a(this.f25353N);
            StringBuilder sb = new StringBuilder();
            sb.append("getting feature-request details got error: ");
            c[3] = true;
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            c[4] = true;
            InstabugSDKLogger.m46624e(a, sb2, th);
            c[5] = true;
            this.f25354b.onFailed(th);
            c[6] = true;
        }

        /* renamed from: a */
        public void mo34327a(RequestResponse requestResponse) {
            boolean[] c = m44798c();
            String a = C9580b.m44784a(this.f25353N);
            StringBuilder sb = new StringBuilder();
            sb.append("getting feature-request details onNext, Response code: ");
            c[7] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[8] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[9] = true;
            InstabugSDKLogger.m46626v(a, sb2);
            c[10] = true;
            if (requestResponse.getResponseCode() == 200) {
                try {
                    c[11] = true;
                    Callbacks callbacks = this.f25354b;
                    c[12] = true;
                    JSONObject jSONObject = new JSONObject((String) requestResponse.getResponseBody());
                    c[13] = true;
                    callbacks.onSucceeded(jSONObject);
                    c[14] = true;
                } catch (JSONException e) {
                    c[15] = true;
                    String a2 = C9580b.m44784a(this.f25353N);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("getting feature-request details got JSONException: ");
                    c[16] = true;
                    sb3.append(e.getMessage());
                    String sb4 = sb3.toString();
                    c[17] = true;
                    InstabugSDKLogger.m46624e(a2, sb4, e);
                    c[18] = true;
                    this.f25354b.onFailed(e);
                    c[19] = true;
                }
            } else {
                Callbacks callbacks2 = this.f25354b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("getting feature-request details request got error with response code:");
                c[20] = true;
                sb5.append(requestResponse.getResponseCode());
                Throwable th = new Throwable(sb5.toString());
                c[21] = true;
                callbacks2.onFailed(th);
                c[22] = true;
            }
            c[23] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.network.service.b$d */
    /* compiled from: FeaturesRequestService */
    class C9584d extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f25355O;

        /* renamed from: N */
        final /* synthetic */ C9580b f25356N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f25357b;

        C9584d(C9580b bVar, Callbacks callbacks) {
            boolean[] c = m44802c();
            this.f25356N = bVar;
            this.f25357b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m44802c() {
            boolean[] zArr = f25355O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4557309963922684506L, "com/instabug/featuresrequest/network/service/FeaturesRequestService$5", 23);
            f25355O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m44802c();
            mo34328a((RequestResponse) obj);
            c[22] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m44802c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25356N), "start adding comment ");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m44802c();
            InstabugSDKLogger.m46626v(C9580b.m44784a(this.f25356N), "done adding comment");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m44802c();
            String a = C9580b.m44784a(this.f25356N);
            StringBuilder sb = new StringBuilder();
            sb.append("adding comment got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(a, sb.toString(), th);
            c[3] = true;
            this.f25357b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo34328a(RequestResponse requestResponse) {
            boolean[] c = m44802c();
            String a = C9580b.m44784a(this.f25356N);
            StringBuilder sb = new StringBuilder();
            sb.append("adding comment onNext, Response code: ");
            c[5] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[6] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[7] = true;
            InstabugSDKLogger.m46626v(a, sb2);
            c[8] = true;
            if (requestResponse.getResponseCode() == 200) {
                try {
                    c[9] = true;
                    Callbacks callbacks = this.f25357b;
                    c[10] = true;
                    JSONObject jSONObject = new JSONObject((String) requestResponse.getResponseBody());
                    c[11] = true;
                    callbacks.onSucceeded(jSONObject);
                    c[12] = true;
                } catch (JSONException e) {
                    c[13] = true;
                    String a2 = C9580b.m44784a(this.f25356N);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("adding comment got JSONException: ");
                    c[14] = true;
                    sb3.append(e.getMessage());
                    String sb4 = sb3.toString();
                    c[15] = true;
                    InstabugSDKLogger.m46624e(a2, sb4, e);
                    c[16] = true;
                    this.f25357b.onFailed(e);
                    c[17] = true;
                }
            } else {
                Callbacks callbacks2 = this.f25357b;
                StringBuilder sb5 = new StringBuilder();
                sb5.append("adding comment request got error with response code:");
                c[18] = true;
                sb5.append(requestResponse.getResponseCode());
                Throwable th = new Throwable(sb5.toString());
                c[19] = true;
                callbacks2.onFailed(th);
                c[20] = true;
            }
            c[21] = true;
        }
    }

    private C9580b() {
        boolean[] b = m44785b();
        b[0] = true;
        b[1] = true;
        this.f25345b = new NetworkManager();
        b[2] = true;
    }

    /* renamed from: a */
    static /* synthetic */ String m44784a(C9580b bVar) {
        boolean[] b = m44785b();
        String str = bVar.f25344a;
        b[67] = true;
        return str;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m44785b() {
        boolean[] zArr = f25343d;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3327661625499681679L, "com/instabug/featuresrequest/network/service/FeaturesRequestService", 68);
        f25343d = a;
        return a;
    }

    /* renamed from: a */
    public static C9580b m44783a() {
        boolean[] b = m44785b();
        if (f25342c != null) {
            b[3] = true;
        } else {
            b[4] = true;
            f25342c = new C9580b();
            b[5] = true;
        }
        C9580b bVar = f25342c;
        b[6] = true;
        return bVar;
    }

    /* renamed from: a */
    public void mo34321a(Context context, int i, boolean z, boolean z2, boolean z3, Callbacks<JSONObject, Throwable> callbacks) {
        boolean[] b = m44785b();
        InstabugSDKLogger.m46626v(this, "fetch Features Requests");
        try {
            b[7] = true;
            Request buildRequest = this.f25345b.buildRequest(context, Endpoint.GetFeaturesRequest, RequestMethod.Get);
            b[8] = true;
            buildRequest.mo35528a("page", Integer.valueOf(i));
            b[9] = true;
            buildRequest.mo35528a("completed", Boolean.valueOf(z));
            b[10] = true;
            buildRequest.mo35528a("sort_top_votes", Boolean.valueOf(z2));
            b[11] = true;
            buildRequest.mo35528a("my_posts", Boolean.valueOf(z3));
            buildRequest.mo35532a(new RequestParameter("Accept", "application/vnd.instabug.v1"));
            b[14] = true;
            buildRequest.mo35532a(new RequestParameter("version", "1"));
            b[15] = true;
            C5923b0 c = this.f25345b.doRequest(buildRequest).mo23950c(C12228b.m55095c());
            b[16] = true;
            C5923b0 a = c.mo23825a(C12304a.m55390a());
            C9581a aVar = new C9581a(this, callbacks);
            b[17] = true;
            a.mo23893a((C12280i0<? super T>) aVar);
            b[18] = true;
        } catch (JSONException e) {
            b[12] = true;
            callbacks.onFailed(e);
            b[13] = true;
        }
    }

    /* renamed from: a */
    public void mo34323a(Context context, long j, RequestMethod requestMethod, Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        boolean[] b = m44785b();
        StringBuilder sb = new StringBuilder();
        sb.append("voting request for feature with id : ");
        sb.append(j);
        InstabugSDKLogger.m46626v(this, sb.toString());
        b[19] = true;
        Request buildRequest = this.f25345b.buildRequest(context, Endpoint.VoteFeature, requestMethod);
        b[20] = true;
        String d = buildRequest.mo35539d();
        b[21] = true;
        String replaceAll = d.replaceAll(":feature_req_id", String.valueOf(j));
        b[22] = true;
        buildRequest.mo35535b(replaceAll);
        try {
            b[23] = true;
            C5923b0 c = this.f25345b.doRequest(buildRequest).mo23950c(C12228b.m55095c());
            C9582b bVar = new C9582b(this, callbacks);
            b[24] = true;
            c.mo23893a((C12280i0<? super T>) bVar);
            b[25] = true;
        } catch (Exception e) {
            b[26] = true;
            C12303a.m55389c();
            b[27] = true;
            C12205a.m54894b((Throwable) e);
            b[28] = true;
        }
        b[29] = true;
    }

    /* renamed from: a */
    public void mo34322a(Context context, long j, Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        boolean[] b = m44785b();
        StringBuilder sb = new StringBuilder();
        sb.append("Getting feature-request with id ");
        sb.append(j);
        InstabugSDKLogger.m46626v(this, sb.toString());
        NetworkManager networkManager = this.f25345b;
        Endpoint endpoint = Endpoint.GetFeatureTimeline;
        b[40] = true;
        String endpoint2 = endpoint.toString();
        RequestMethod requestMethod = RequestMethod.Get;
        b[41] = true;
        Request buildRequest = networkManager.buildRequest(context, endpoint2, requestMethod);
        b[42] = true;
        String endpoint3 = Endpoint.GetFeatureTimeline.toString();
        b[43] = true;
        String replaceAll = endpoint3.replaceAll(":feature_req_id", String.valueOf(j));
        b[44] = true;
        buildRequest.mo35535b(replaceAll);
        b[45] = true;
        buildRequest.mo35532a(new RequestParameter("Accept", "application/vnd.instabug.v1"));
        b[46] = true;
        buildRequest.mo35532a(new RequestParameter("version", "1"));
        b[47] = true;
        buildRequest.mo35538c(C11687c.f33836s2, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        b[48] = true;
        C5923b0 c = this.f25345b.doRequest(buildRequest).mo23950c(C12228b.m55095c());
        b[49] = true;
        C5923b0 a = c.mo23825a(C12304a.m55390a());
        C9583c cVar = new C9583c(this, callbacks);
        b[50] = true;
        a.mo23893a((C12280i0<? super T>) cVar);
        b[51] = true;
    }

    /* renamed from: a */
    public void mo34324a(Context context, C9571c cVar, Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        boolean[] b = m44785b();
        InstabugSDKLogger.m46626v(this, "Adding comment...");
        b[52] = true;
        Request buildRequest = this.f25345b.buildRequest(context, Endpoint.AddComment, RequestMethod.Post);
        b[53] = true;
        String d = buildRequest.mo35539d();
        b[54] = true;
        String valueOf = String.valueOf(cVar.mo34299m());
        b[55] = true;
        String replaceAll = d.replaceAll(":feature_req_id", valueOf);
        b[56] = true;
        buildRequest.mo35535b(replaceAll);
        b[57] = true;
        C9566b.m44690a(buildRequest, cVar);
        b[58] = true;
        buildRequest.mo35532a(new RequestParameter("Accept", "application/vnd.instabug.v1"));
        b[59] = true;
        buildRequest.mo35532a(new RequestParameter("version", "1"));
        b[60] = true;
        buildRequest.mo35538c(C11687c.f33836s2, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        b[61] = true;
        C5923b0 doRequest = this.f25345b.doRequest(buildRequest);
        b[62] = true;
        C12282j0 c = C12228b.m55095c();
        b[63] = true;
        C5923b0 c2 = doRequest.mo23950c(c);
        b[64] = true;
        C5923b0 a = c2.mo23825a(C12304a.m55390a());
        C9584d dVar = new C9584d(this, callbacks);
        b[65] = true;
        a.mo23893a((C12280i0<? super T>) dVar);
        b[66] = true;
    }
}
