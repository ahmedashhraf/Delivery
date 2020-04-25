package com.instabug.featuresrequest.p371d.p372a;

import android.content.Context;
import com.instabug.featuresrequest.models.C9571c;
import com.instabug.featuresrequest.models.C9575f;
import com.instabug.featuresrequest.network.service.C9580b;
import com.instabug.library.network.Request.Callbacks;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;
import org.json.JSONObject;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.featuresrequest.d.a.a */
/* compiled from: FeatureRequestsRepository */
public class C9562a {

    /* renamed from: b */
    private static C9562a f25273b;

    /* renamed from: c */
    private static transient /* synthetic */ boolean[] f25274c;

    /* renamed from: a */
    private Context f25275a;

    /* renamed from: com.instabug.featuresrequest.d.a.a$a */
    /* compiled from: FeatureRequestsRepository */
    class C9563a implements Callbacks<JSONObject, Throwable> {

        /* renamed from: d */
        private static transient /* synthetic */ boolean[] f25276d;

        /* renamed from: a */
        final /* synthetic */ long f25277a;

        /* renamed from: b */
        final /* synthetic */ C9565b f25278b;

        /* renamed from: c */
        final /* synthetic */ C9562a f25279c;

        C9563a(C9562a aVar, long j, C9565b bVar) {
            boolean[] a = m44682a();
            this.f25279c = aVar;
            this.f25277a = j;
            this.f25278b = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44682a() {
            boolean[] zArr = f25276d;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(1655043915748970820L, "com/instabug/featuresrequest/network/timelinerepository/FeatureRequestsRepository$1", 11);
            f25276d = a;
            return a;
        }

        /* renamed from: a */
        public void mo34243a(JSONObject jSONObject) {
            boolean[] a = m44682a();
            try {
                C9575f a2 = C9575f.m44762a(jSONObject);
                a[1] = true;
                a2.mo34314a(this.f25277a);
                a[2] = true;
                this.f25278b.mo34246a(a2);
                a[3] = true;
            } catch (JSONException e) {
                a[4] = true;
                e.printStackTrace();
                a[5] = true;
            }
            a[6] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44682a();
            mo34242a((Throwable) obj);
            a[9] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44682a();
            mo34243a((JSONObject) obj);
            a[10] = true;
        }

        /* renamed from: a */
        public void mo34242a(Throwable th) {
            boolean[] a = m44682a();
            InstabugSDKLogger.m46624e(this, th.getMessage(), th);
            a[7] = true;
            this.f25278b.mo34247a(th);
            a[8] = true;
        }
    }

    /* renamed from: com.instabug.featuresrequest.d.a.a$b */
    /* compiled from: FeatureRequestsRepository */
    class C9564b implements Callbacks<JSONObject, Throwable> {

        /* renamed from: c */
        private static transient /* synthetic */ boolean[] f25280c;

        /* renamed from: a */
        final /* synthetic */ C9565b f25281a;

        /* renamed from: b */
        final /* synthetic */ C9562a f25282b;

        C9564b(C9562a aVar, C9565b bVar) {
            boolean[] a = m44685a();
            this.f25282b = aVar;
            this.f25281a = bVar;
            a[0] = true;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m44685a() {
            boolean[] zArr = f25280c;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(3438095015114702826L, "com/instabug/featuresrequest/network/timelinerepository/FeatureRequestsRepository$2", 6);
            f25280c = a;
            return a;
        }

        /* renamed from: a */
        public void mo34245a(JSONObject jSONObject) {
            boolean[] a = m44685a();
            this.f25281a.mo34246a(jSONObject);
            a[1] = true;
        }

        public /* synthetic */ void onFailed(Object obj) {
            boolean[] a = m44685a();
            mo34244a((Throwable) obj);
            a[4] = true;
        }

        public /* synthetic */ void onSucceeded(Object obj) {
            boolean[] a = m44685a();
            mo34245a((JSONObject) obj);
            a[5] = true;
        }

        /* renamed from: a */
        public void mo34244a(Throwable th) {
            boolean[] a = m44685a();
            InstabugSDKLogger.m46624e(this, th.getMessage(), th);
            a[2] = true;
            this.f25281a.mo34247a(th);
            a[3] = true;
        }
    }

    public C9562a(Context context) {
        boolean[] a = m44679a();
        this.f25275a = context;
        a[3] = true;
    }

    /* renamed from: a */
    public static C9562a m44678a(Context context) {
        boolean[] a = m44679a();
        C9562a aVar = f25273b;
        if (aVar != null) {
            a[0] = true;
        } else {
            aVar = new C9562a(context);
            f25273b = aVar;
            a[1] = true;
        }
        a[2] = true;
        return aVar;
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44679a() {
        boolean[] zArr = f25274c;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-774031504309535266L, "com/instabug/featuresrequest/network/timelinerepository/FeatureRequestsRepository", 12);
        f25274c = a;
        return a;
    }

    /* renamed from: a */
    public void mo34240a(long j, C9565b<C9575f> bVar) {
        boolean[] a = m44679a();
        try {
            C9580b.m44783a().mo34322a(this.f25275a, j, (Callbacks<JSONObject, Throwable>) new C9563a<JSONObject,Throwable>(this, j, bVar));
            a[4] = true;
        } catch (JSONException e) {
            a[5] = true;
            InstabugSDKLogger.m46624e(this, e.getMessage(), e);
            a[6] = true;
        }
        a[7] = true;
    }

    /* renamed from: a */
    public void mo34241a(C9571c cVar, C9565b<JSONObject> bVar) {
        boolean[] a = m44679a();
        try {
            C9580b.m44783a().mo34324a(this.f25275a, cVar, (Callbacks<JSONObject, Throwable>) new C9564b<JSONObject,Throwable>(this, bVar));
            a[8] = true;
        } catch (JSONException e) {
            a[9] = true;
            InstabugSDKLogger.m46624e(this, e.getMessage(), e);
            a[10] = true;
        }
        a[11] = true;
    }
}
