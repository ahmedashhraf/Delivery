package com.instabug.library.network.p394a;

import android.content.Context;
import com.instabug.library.C9780c;
import com.instabug.library.Feature;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.SessionEntry;
import com.instabug.library.model.Session;
import com.instabug.library.model.State;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.user.C10009a;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p195e.p196a.C12280i0;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.a.d */
/* compiled from: SessionService */
public class C9967d {

    /* renamed from: b */
    private static C9967d f26509b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26510c;

    /* renamed from: a */
    private NetworkManager f26511a = new NetworkManager();

    /* renamed from: com.instabug.library.network.a.d$a */
    /* compiled from: SessionService */
    class C9968a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26512O;

        /* renamed from: N */
        final /* synthetic */ C9967d f26513N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26514b;

        C9968a(C9967d dVar, Callbacks callbacks) {
            boolean[] c = m46365c();
            this.f26513N = dVar;
            this.f26514b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46365c() {
            boolean[] zArr = f26512O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-4535353959063416194L, "com/instabug/library/network/service/SessionService$1", 15);
            f26512O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46365c();
            mo35571a((RequestResponse) obj);
            c[14] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m46365c();
            InstabugSDKLogger.m46622d(this, "sendSession request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m46365c();
            InstabugSDKLogger.m46622d(this, "sendSession request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46365c();
            StringBuilder sb = new StringBuilder();
            sb.append("sendSession request got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            c[3] = true;
            this.f26514b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo35571a(RequestResponse requestResponse) {
            boolean[] c = m46365c();
            StringBuilder sb = new StringBuilder();
            sb.append("sendSession request onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[5] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[6] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[7] = true;
            if (requestResponse.getResponseCode() != 200) {
                c[8] = true;
            } else if (requestResponse.getResponseBody() == null) {
                c[9] = true;
            } else {
                c[10] = true;
                this.f26514b.onSucceeded(Boolean.valueOf(true));
                c[11] = true;
                c[13] = true;
            }
            this.f26514b.onSucceeded(Boolean.valueOf(false));
            c[12] = true;
            c[13] = true;
        }
    }

    private C9967d() {
        boolean[] b = m46363b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9967d m46362a() {
        boolean[] b = m46363b();
        if (f26509b != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f26509b = new C9967d();
            b[2] = true;
        }
        C9967d dVar = f26509b;
        b[3] = true;
        return dVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46363b() {
        boolean[] zArr = f26510c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-925183291948143964L, "com/instabug/library/network/service/SessionService", 33);
        f26510c = a;
        return a;
    }

    /* renamed from: a */
    public void mo35570a(Context context, Session session, Callbacks<Boolean, Throwable> callbacks) throws JSONException {
        String str;
        String str2;
        boolean z;
        boolean[] b = m46363b();
        InstabugSDKLogger.m46622d(this, "Sending session");
        b[6] = true;
        Request buildRequest = this.f26511a.buildRequest(context, Endpoint.SendSession, RequestMethod.Post);
        b[7] = true;
        if (session.mo35373g() == null) {
            str = C10009a.m46593b();
            b[8] = true;
        } else {
            str = session.mo35373g();
            b[9] = true;
        }
        b[10] = true;
        if (session.mo35372f() == null) {
            str2 = C10009a.m46596c();
            b[11] = true;
        } else {
            str2 = session.mo35372f();
            b[12] = true;
        }
        b[13] = true;
        Request a = buildRequest.mo35528a(State.KEY_DEVICE, InstabugDeviceProperties.getDeviceType());
        StringBuilder sb = new StringBuilder();
        sb.append("SDK Level ");
        b[14] = true;
        sb.append(Integer.toString(InstabugDeviceProperties.getCurrentOSLevel()));
        Request a2 = a.mo35528a(State.KEY_OS, sb.toString());
        b[15] = true;
        Request a3 = a2.mo35528a(State.KEY_APP_VERSION, InstabugDeviceProperties.getAppVersion(context));
        b[16] = true;
        Request a4 = a3.mo35528a(State.KEY_APP_PACKAGE_NAME, InstabugDeviceProperties.getPackageName(context));
        b[17] = true;
        Request a5 = a4.mo35528a(State.KEY_SDK_VERSION, "8.0.11");
        b[18] = true;
        Request a6 = a5.mo35528a("email", str);
        b[19] = true;
        Request a7 = a6.mo35528a("name", str2);
        b[20] = true;
        Request a8 = a7.mo35528a(SessionEntry.COLUMN_STARTED_AT, String.valueOf(session.mo35367b()));
        b[21] = true;
        Request a9 = a8.mo35528a("duration", Long.valueOf(session.mo35368c()));
        b[22] = true;
        Request a10 = a9.mo35528a("custom_attributes", new JSONObject(session.mo35369d()));
        b[23] = true;
        Request a11 = a10.mo35528a("user_events", new JSONArray(session.mo35370e()));
        b[24] = true;
        if (C9780c.m45631b().mo34869b(Feature.CRASH_REPORTING) == Feature.State.ENABLED) {
            b[25] = true;
            z = true;
        } else {
            z = false;
            b[26] = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        b[27] = true;
        a11.mo35528a("crash_reporting_enabled", valueOf);
        b[28] = true;
        if (session.mo35366a() == -1) {
            b[29] = true;
        } else {
            b[30] = true;
            buildRequest.mo35528a("session_number", Integer.valueOf(session.mo35366a()));
            b[31] = true;
        }
        this.f26511a.doRequest(buildRequest).mo23893a((C12280i0<? super T>) new C9968a<Object>(this, callbacks));
        b[32] = true;
    }
}
