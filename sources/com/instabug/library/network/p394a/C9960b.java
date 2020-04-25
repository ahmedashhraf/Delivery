package com.instabug.library.network.p394a;

import android.content.Context;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.NetworkManager.RequestType;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import p195e.p196a.C5923b0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p444s0.p446d.C12304a;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.a.b */
/* compiled from: FilesService */
public class C9960b {

    /* renamed from: b */
    private static C9960b f26489b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26490c;

    /* renamed from: a */
    private NetworkManager f26491a = new NetworkManager();

    /* renamed from: com.instabug.library.network.a.b$a */
    /* compiled from: FilesService */
    class C9961a extends C13787e<RequestResponse> {

        /* renamed from: P */
        private static transient /* synthetic */ boolean[] f26492P;

        /* renamed from: N */
        final /* synthetic */ AssetEntity f26493N;

        /* renamed from: O */
        final /* synthetic */ C9960b f26494O;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26495b;

        C9961a(C9960b bVar, Callbacks callbacks, AssetEntity assetEntity) {
            boolean[] c = m46345c();
            this.f26494O = bVar;
            this.f26495b = callbacks;
            this.f26493N = assetEntity;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46345c() {
            boolean[] zArr = f26492P;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-6864826793254473258L, "com/instabug/library/network/service/FilesService$1", 9);
            f26492P = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46345c();
            mo35563a((RequestResponse) obj);
            c[8] = true;
        }

        public void onComplete() {
            boolean[] c = m46345c();
            InstabugSDKLogger.m46622d(this, "downloadFile request completed");
            c[3] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46345c();
            StringBuilder sb = new StringBuilder();
            sb.append("downloadFile request got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46623e(this, sb.toString());
            c[1] = true;
            this.f26495b.onFailed(th);
            c[2] = true;
        }

        /* renamed from: a */
        public void mo35563a(RequestResponse requestResponse) {
            boolean[] c = m46345c();
            StringBuilder sb = new StringBuilder();
            sb.append("downloadFile request onNext, Response code: ");
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[4] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[5] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[6] = true;
            this.f26495b.onSucceeded(this.f26493N);
            c[7] = true;
        }
    }

    private C9960b() {
        boolean[] b = m46343b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9960b m46342a() {
        boolean[] b = m46343b();
        if (f26489b != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f26489b = new C9960b();
            b[2] = true;
        }
        C9960b bVar = f26489b;
        b[3] = true;
        return bVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46343b() {
        boolean[] zArr = f26490c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(3457903550454703415L, "com/instabug/library/network/service/FilesService", 15);
        f26490c = a;
        return a;
    }

    /* renamed from: a */
    public C13787e<RequestResponse> mo35562a(Context context, AssetEntity assetEntity, Callbacks<AssetEntity, Throwable> callbacks) {
        boolean[] b = m46343b();
        InstabugSDKLogger.m46622d(this, "Downloading file request");
        Request request = null;
        try {
            b[6] = true;
            request = this.f26491a.buildRequest(context, assetEntity.getUrl(), RequestMethod.Get, RequestType.FILE_DOWNLOAD);
            b[7] = true;
            request.mo35527a(assetEntity.getFile().getPath());
            b[8] = true;
        } catch (JSONException e) {
            b[9] = true;
            StringBuilder sb = new StringBuilder();
            sb.append("create downloadFile request got error: ");
            sb.append(e.getMessage());
            InstabugSDKLogger.m46622d(this, sb.toString());
            b[10] = true;
        }
        C5923b0 doRequest = this.f26491a.doRequest(request);
        b[11] = true;
        C5923b0 c = doRequest.mo23950c(C12228b.m55095c());
        b[12] = true;
        C5923b0 a = c.mo23825a(C12304a.m55390a());
        C9961a aVar = new C9961a(this, callbacks, assetEntity);
        b[13] = true;
        C13787e<RequestResponse> eVar = (C13787e) a.mo24007f(aVar);
        b[14] = true;
        return eVar;
    }
}
