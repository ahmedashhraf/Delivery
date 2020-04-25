package com.instabug.library.network.p394a;

import android.content.Context;
import com.instabug.library.network.C9971d;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.network.Request.Endpoint;
import com.instabug.library.network.Request.RequestMethod;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p441d1.C12228b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p467z0.C13787e;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.library.network.a.c */
/* compiled from: MigrateUUIDService */
public class C9962c {

    /* renamed from: b */
    private static C9962c f26496b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f26497c;

    /* renamed from: a */
    private NetworkManager f26498a = new NetworkManager();

    /* renamed from: com.instabug.library.network.a.c$a */
    /* compiled from: MigrateUUIDService */
    class C9963a extends C13787e<RequestResponse> {

        /* renamed from: O */
        private static transient /* synthetic */ boolean[] f26499O;

        /* renamed from: N */
        final /* synthetic */ C9962c f26500N;

        /* renamed from: b */
        final /* synthetic */ Callbacks f26501b;

        C9963a(C9962c cVar, Callbacks callbacks) {
            boolean[] c = m46351c();
            this.f26500N = cVar;
            this.f26501b = callbacks;
            c[0] = true;
        }

        /* renamed from: c */
        private static /* synthetic */ boolean[] m46351c() {
            boolean[] zArr = f26499O;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3613404529867166855L, "com/instabug/library/network/service/MigrateUUIDService$1", 11);
            f26499O = a;
            return a;
        }

        /* renamed from: a */
        public /* synthetic */ void mo33453a(Object obj) {
            boolean[] c = m46351c();
            mo35565a((RequestResponse) obj);
            c[10] = true;
        }

        /* renamed from: b */
        public void mo33575b() {
            boolean[] c = m46351c();
            InstabugSDKLogger.m46622d(this, "migrateUUID request started");
            c[1] = true;
        }

        public void onComplete() {
            boolean[] c = m46351c();
            InstabugSDKLogger.m46622d(this, "migrateUUID request completed");
            c[2] = true;
        }

        public void onError(Throwable th) {
            boolean[] c = m46351c();
            StringBuilder sb = new StringBuilder();
            sb.append("migrateUUID request got error: ");
            sb.append(th.getMessage());
            InstabugSDKLogger.m46624e(this, sb.toString(), th);
            c[3] = true;
            this.f26501b.onFailed(th);
            c[4] = true;
        }

        /* renamed from: a */
        public void mo35565a(RequestResponse requestResponse) {
            boolean[] c = m46351c();
            StringBuilder sb = new StringBuilder();
            sb.append("migrateUUID request onNext, Response code: ");
            c[5] = true;
            sb.append(requestResponse.getResponseCode());
            sb.append(", Response body: ");
            c[6] = true;
            sb.append(requestResponse.getResponseBody());
            String sb2 = sb.toString();
            c[7] = true;
            InstabugSDKLogger.m46626v(this, sb2);
            c[8] = true;
            this.f26501b.onSucceeded((String) requestResponse.getResponseBody());
            c[9] = true;
        }
    }

    /* renamed from: com.instabug.library.network.a.c$b */
    /* compiled from: MigrateUUIDService */
    class C9964b implements C12339o<C5923b0<Throwable>, C5926g0<?>> {

        /* renamed from: N */
        private static transient /* synthetic */ boolean[] f26502N;

        /* renamed from: a */
        final /* synthetic */ Callbacks f26503a;

        /* renamed from: b */
        final /* synthetic */ C9962c f26504b;

        /* renamed from: com.instabug.library.network.a.c$b$a */
        /* compiled from: MigrateUUIDService */
        class C9965a implements C12339o<Integer, C5926g0<?>> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26505b;

            /* renamed from: a */
            final /* synthetic */ C9964b f26506a;

            C9965a(C9964b bVar) {
                boolean[] a = m46357a();
                this.f26506a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46357a() {
                boolean[] zArr = f26505b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(-8888374423543670943L, "com/instabug/library/network/service/MigrateUUIDService$2$1", 5);
                f26505b = a;
                return a;
            }

            /* renamed from: a */
            public C5926g0<?> mo35567a(Integer num) {
                boolean[] a = m46357a();
                if (SettingsManager.getInstance().shouldMakeUUIDMigrationRequest()) {
                    a[1] = true;
                    C5923b0 q = C5923b0.m26206q((long) Math.pow(2.718281828459045d, (double) num.intValue()), TimeUnit.SECONDS);
                    a[2] = true;
                    return q;
                }
                C5923b0 a2 = C5923b0.m26128a((Throwable) new C9971d());
                a[3] = true;
                return a2;
            }

            public /* synthetic */ Object apply(Object obj) throws Exception {
                boolean[] a = m46357a();
                C5926g0 a2 = mo35567a((Integer) obj);
                a[4] = true;
                return a2;
            }
        }

        /* renamed from: com.instabug.library.network.a.c$b$b */
        /* compiled from: MigrateUUIDService */
        class C9966b implements C12327c<Throwable, Integer, Integer> {

            /* renamed from: b */
            private static transient /* synthetic */ boolean[] f26507b;

            /* renamed from: a */
            final /* synthetic */ C9964b f26508a;

            C9966b(C9964b bVar) {
                boolean[] a = m46359a();
                this.f26508a = bVar;
                a[0] = true;
            }

            /* renamed from: a */
            private static /* synthetic */ boolean[] m46359a() {
                boolean[] zArr = f26507b;
                if (zArr != null) {
                    return zArr;
                }
                boolean[] a = C13938g.m59885a(6926729819052180470L, "com/instabug/library/network/service/MigrateUUIDService$2$2", 3);
                f26507b = a;
                return a;
            }

            /* renamed from: a */
            public /* synthetic */ Object mo35569a(Object obj, Object obj2) throws Exception {
                boolean[] a = m46359a();
                Integer a2 = mo35568a((Throwable) obj, (Integer) obj2);
                a[2] = true;
                return a2;
            }

            /* renamed from: a */
            public Integer mo35568a(Throwable th, Integer num) {
                boolean[] a = m46359a();
                this.f26508a.f26503a.onFailed(th);
                a[1] = true;
                return num;
            }
        }

        C9964b(C9962c cVar, Callbacks callbacks) {
            boolean[] a = m46355a();
            this.f26504b = cVar;
            this.f26503a = callbacks;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m46355a() {
            boolean[] zArr = f26502N;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(4348657741094285126L, "com/instabug/library/network/service/MigrateUUIDService$2", 4);
            f26502N = a;
            return a;
        }

        /* renamed from: a */
        public C5926g0<?> mo35566a(C5923b0<Throwable> b0Var) {
            boolean[] a = m46355a();
            C5923b0 b = b0Var.mo23907b((C5926g0<? extends U>) C5923b0.m26142b(1, 15), (C12327c<? super T, ? super U, ? extends R>) new C9966b<Object,Object,Object>(this));
            C9965a aVar = new C9965a(this);
            a[1] = true;
            C5923b0 o = b.mo24072o((C12339o<? super T, ? extends C5926g0<? extends R>>) aVar);
            a[2] = true;
            return o;
        }

        public /* synthetic */ Object apply(Object obj) throws Exception {
            boolean[] a = m46355a();
            C5926g0 a2 = mo35566a((C5923b0) obj);
            a[3] = true;
            return a2;
        }
    }

    private C9962c() {
        boolean[] b = m46349b();
        b[4] = true;
        b[5] = true;
    }

    /* renamed from: a */
    public static C9962c m46348a() {
        boolean[] b = m46349b();
        if (f26496b != null) {
            b[0] = true;
        } else {
            b[1] = true;
            f26496b = new C9962c();
            b[2] = true;
        }
        C9962c cVar = f26496b;
        b[3] = true;
        return cVar;
    }

    /* renamed from: b */
    private static /* synthetic */ boolean[] m46349b() {
        boolean[] zArr = f26497c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1649991368249138011L, "com/instabug/library/network/service/MigrateUUIDService", 17);
        f26497c = a;
        return a;
    }

    /* renamed from: a */
    public void mo35564a(Context context, String str, String str2, Callbacks<String, Throwable> callbacks) throws JSONException {
        boolean[] b = m46349b();
        NetworkManager networkManager = this.f26498a;
        Endpoint endpoint = Endpoint.MigrateUUID;
        RequestMethod requestMethod = RequestMethod.put;
        b[7] = true;
        Request buildRequest = networkManager.buildRequest(context, endpoint, requestMethod);
        b[8] = true;
        buildRequest.mo35536b("old_uuid", str);
        b[9] = true;
        buildRequest.mo35536b("new_uuid", str2);
        b[10] = true;
        buildRequest.mo35536b(NetworkManager.APP_TOKEN, SettingsManager.getInstance().getAppToken());
        b[11] = true;
        C5923b0 doRequest = this.f26498a.doRequest(buildRequest);
        b[12] = true;
        C12282j0 c = C12228b.m55095c();
        b[13] = true;
        C5923b0 c2 = doRequest.mo23950c(c);
        C9964b bVar = new C9964b(this, callbacks);
        b[14] = true;
        C5923b0 A = c2.mo23757A(bVar);
        C9963a aVar = new C9963a(this, callbacks);
        b[15] = true;
        A.mo23893a((C12280i0<? super T>) aVar);
        b[16] = true;
    }
}
