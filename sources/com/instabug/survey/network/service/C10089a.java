package com.instabug.survey.network.service;

import android.content.Context;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.Request.RequestParameter;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.survey.models.Survey;
import com.instabug.survey.p399c.C10077a.C10080c;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.survey.network.service.a */
/* compiled from: SurveysService */
public class C10089a {

    /* renamed from: b */
    private static C10089a f26837b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26838c;

    /* renamed from: a */
    private NetworkManager f26839a = new NetworkManager();

    /* renamed from: com.instabug.survey.network.service.a$a */
    /* compiled from: SurveysService */
    class C10090a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26840O;

        /* renamed from: N */
        final /* synthetic */ C10089a f26841N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26842b;

        C10090a(C10089a aVar, Callbacks callbacks) {
            boolean[] c = m46942c();
            this.f26841N = aVar;
            this.f26842b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46942c() {
            boolean[] zArr = f26840O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-729947020374454093L, "com/instabug/survey/network/service/SurveysService$1", 16);
            f26840O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46942c();
            mo36232a((RequestResponse) obj);
            c[15] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m46942c();
            InstabugSDKLogger.m46626v(C10089a.class.getSimpleName(), "fetchingSurveysRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m46942c();
            InstabugSDKLogger.m46626v(C10089a.class.getSimpleName(), "fetchingSurveysRequest completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46942c();
            String simpleName = C10089a.class.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("fetchingSurveysRequest got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(simpleName, sb.toString(), th);
            c[3] = true;
            this.f26842b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo36232a(RequestResponse requestResponse) {
            Class<C10089a> cls = C10089a.class;
            boolean[] c = m46942c();
            String simpleName = cls.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("fetchingSurveysRequest onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(simpleName, sb2);
            c[7] = true;
            if (requestResponse.getResponseCode() == 200) {
                try {
                    c[8] = true;
                    this.f26842b.onSucceeded(new JSONObject((String) requestResponse.getResponseBody()));
                    c[9] = true;
                } catch (JSONException e) {
                    c[10] = true;
                    String simpleName2 = cls.getSimpleName();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("submittingSurveyRequest got JSONException: ");
                    sb3.append(e.getMessage());
                    InstabugSDKLogger.m46624e(simpleName2, sb3.toString(), e);
                    c[11] = true;
                    this.f26842b.onFailed(e);
                    c[12] = true;
                }
            } else {
                Callbacks callbacks = this.f26842b;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Fetching Surveys got error with response code:");
                sb4.append(requestResponse.getResponseCode());
                callbacks.onFailed(new Throwable(sb4.toString()));
                c[13] = true;
            }
            c[14] = true;
        }
    }

    /* renamed from: com.instabug.survey.network.service.a$b */
    /* compiled from: SurveysService */
    class C10091b extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26843O;

        /* renamed from: N */
        final /* synthetic */ C10089a f26844N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26845b;

        C10091b(C10089a aVar, Callbacks callbacks) {
            boolean[] c = m46946c();
            this.f26844N = aVar;
            this.f26845b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46946c() {
            boolean[] zArr = f26843O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(2647817144933699824L, "com/instabug/survey/network/service/SurveysService$2", 14);
            f26843O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46946c();
            mo36233a((RequestResponse) obj);
            c[13] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m46946c();
            InstabugSDKLogger.m46626v(this, "submittingSurveyRequest started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m46946c();
            InstabugSDKLogger.m46626v(C10089a.class.getSimpleName(), "submittingSurveyRequest completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46946c();
            String simpleName = C10089a.class.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("submittingSurveyRequest got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(simpleName, sb.toString(), th);
            c[3] = true;
            this.f26845b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo36233a(RequestResponse requestResponse) {
            boolean[] c = m46946c();
            String simpleName = C10089a.class.getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append("submittingSurveyRequest onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append("Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(simpleName, sb2);
            c[7] = true;
            if (requestResponse.getResponseCode() == 200) {
                c[8] = true;
                this.f26845b.onSucceeded(Boolean.valueOf(true));
                c[9] = true;
            } else {
                this.f26845b.onSucceeded(Boolean.valueOf(false));
                c[10] = true;
                Callbacks callbacks = this.f26845b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("submittingSurveyRequest got error with response code:");
                sb3.append(requestResponse.getResponseCode());
                callbacks.onFailed(new Throwable(sb3.toString()));
                c[11] = true;
            }
            c[12] = true;
        }
    }

    private C10089a() {
        boolean[] b = m46939b();
        b[0] = true;
        b[1] = true;
    }

    /* renamed from: a */
    public static C10089a m46938a() {
        boolean[] b = m46939b();
        if (f26837b != null) {
            b[2] = true;
        } else {
            b[3] = true;
            f26837b = new C10089a();
            b[4] = true;
        }
        C10089a aVar = f26837b;
        b[5] = true;
        return aVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46939b() {
        boolean[] zArr = f26838c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(2997609266023735392L, "com/instabug/survey/network/service/SurveysService", 18);
        f26838c = a;
        return a;
    }

    /* renamed from: a */
    public void mo36230a(Context context, Callbacks<JSONObject, Throwable> callbacks) throws JSONException {
        boolean[] b = m46939b();
        InstabugSDKLogger.m46626v(this, "fetch surveys");
        b[7] = true;
        Request buildRequest = this.f26839a.buildRequest(context, Endpoint.GetSurveys, RequestMethod.Get);
        b[8] = true;
        buildRequest.mo35532a(new RequestParameter("Accept", "application/vnd.instabug.v2"));
        b[9] = true;
        buildRequest.mo35532a(new RequestParameter("version", "2"));
        b[10] = true;
        C5923b0 c = this.f26839a.doRequest(buildRequest).mo23950c(C12228b.m55095c());
        C10090a aVar = new C10090a(this, callbacks);
        b[11] = true;
        c.mo23893a((C12280i0<? super T>) aVar);
        b[12] = true;
    }

    /* renamed from: a */
    public void mo36231a(Context context, Survey survey, Callbacks<Boolean, Throwable> callbacks) throws JSONException {
        boolean[] b = m46939b();
        InstabugSDKLogger.m46626v(this, "submitting survey");
        b[13] = true;
        Request buildRequest = this.f26839a.buildRequest(context, Endpoint.SubmitSurvey, RequestMethod.Post);
        b[14] = true;
        buildRequest.mo35535b(buildRequest.mo35539d().replaceAll(":survey_id", String.valueOf(survey.getId())));
        b[15] = true;
        C10080c.m46889a(buildRequest, survey);
        b[16] = true;
        this.f26839a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C10091b<Object>(this, callbacks));
        b[17] = true;
    }
}
