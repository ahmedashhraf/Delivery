package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.collection.C0635a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.dynamic.C4523f;
import com.google.android.gms.internal.measurement.C4690ac;
import com.google.android.gms.internal.measurement.C4704bc;
import com.google.android.gms.internal.measurement.C4794ha;
import com.google.android.gms.internal.measurement.C5027vb;
import com.google.android.gms.internal.measurement.zzv;
import com.instabug.library.internal.storage.cache.p389db.InstabugDbContract.FeatureRequestEntry;
import java.util.Map;
import org.jivesoftware.smack.p557sm.packet.StreamManagement.AckRequest;
import p212io.fabric.sdk.android.p493p.p498e.C14330v;

@DynamiteApi
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
public class AppMeasurementDynamiteService extends C4794ha {

    /* renamed from: N */
    private Map<Integer, C5415u5> f14850N = new C0635a();
    @C4476d0

    /* renamed from: b */
    C5359p4 f14851b = null;

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$a */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
    class C5187a implements C5426v5 {

        /* renamed from: a */
        private C4690ac f14852a;

        C5187a(C4690ac acVar) {
            this.f14852a = acVar;
        }

        /* renamed from: a */
        public final void mo21089a(String str, String str2, Bundle bundle, long j) {
            try {
                this.f14852a.mo18859a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f14851b.mo21205d().mo21536w().mo21550a("Event interceptor threw exception", e);
            }
        }
    }

    /* renamed from: com.google.android.gms.measurement.internal.AppMeasurementDynamiteService$b */
    /* compiled from: com.google.android.gms:play-services-measurement-sdk@@17.1.0 */
    class C5188b implements C5415u5 {

        /* renamed from: a */
        private C4690ac f14854a;

        C5188b(C4690ac acVar) {
            this.f14854a = acVar;
        }

        public final void onEvent(String str, String str2, Bundle bundle, long j) {
            try {
                this.f14854a.mo18859a(str, str2, bundle, j);
            } catch (RemoteException e) {
                AppMeasurementDynamiteService.this.f14851b.mo21205d().mo21536w().mo21550a("Event listener threw exception", e);
            }
        }
    }

    /* renamed from: a */
    private final void m22497a() {
        if (this.f14851b == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21586H().mo21867a(str, j);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21779c(str, str2, bundle);
    }

    public void endAdUnitExposure(String str, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21586H().mo21868b(str, j);
    }

    public void generateEventId(C5027vb vbVar) throws RemoteException {
        m22497a();
        this.f14851b.mo21607u().mo21370a(vbVar, this.f14851b.mo21607u().mo21389t());
    }

    public void getAppInstanceId(C5027vb vbVar) throws RemoteException {
        m22497a();
        this.f14851b.mo21203c().mo21555a((Runnable) new C5263g7(this, vbVar));
    }

    public void getCachedAppInstanceId(C5027vb vbVar) throws RemoteException {
        m22497a();
        m22498a(vbVar, this.f14851b.mo21606t().mo21748H());
    }

    public void getConditionalUserProperties(String str, String str2, C5027vb vbVar) throws RemoteException {
        m22497a();
        this.f14851b.mo21203c().mo21555a((Runnable) new C5275h8(this, vbVar, str, str2));
    }

    public void getCurrentScreenClass(C5027vb vbVar) throws RemoteException {
        m22497a();
        m22498a(vbVar, this.f14851b.mo21606t().mo21751K());
    }

    public void getCurrentScreenName(C5027vb vbVar) throws RemoteException {
        m22497a();
        m22498a(vbVar, this.f14851b.mo21606t().mo21750J());
    }

    public void getGmpAppId(C5027vb vbVar) throws RemoteException {
        m22497a();
        m22498a(vbVar, this.f14851b.mo21606t().mo21752L());
    }

    public void getMaxUserProperties(String str, C5027vb vbVar) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t();
        C4300a0.m18630b(str);
        this.f14851b.mo21607u().mo21369a(vbVar, 25);
    }

    public void getTestFlag(C5027vb vbVar, int i) throws RemoteException {
        m22497a();
        if (i == 0) {
            this.f14851b.mo21607u().mo21372a(vbVar, this.f14851b.mo21606t().mo21744D());
        } else if (i == 1) {
            this.f14851b.mo21607u().mo21370a(vbVar, this.f14851b.mo21606t().mo21745E().longValue());
        } else if (i == 2) {
            C5254f9 u = this.f14851b.mo21607u();
            double doubleValue = this.f14851b.mo21606t().mo21747G().doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble(AckRequest.ELEMENT, doubleValue);
            try {
                vbVar.mo19016c(bundle);
            } catch (RemoteException e) {
                u.f15309a.mo21205d().mo21536w().mo21550a("Error returning double value to wrapper", e);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.f14851b.mo21607u().mo21374a(vbVar, this.f14851b.mo21606t().mo21743C().booleanValue());
            }
        } else {
            this.f14851b.mo21607u().mo21369a(vbVar, this.f14851b.mo21606t().mo21746F().intValue());
        }
    }

    public void getUserProperties(String str, String str2, boolean z, C5027vb vbVar) throws RemoteException {
        m22497a();
        C5326m4 c = this.f14851b.mo21203c();
        C5276h9 h9Var = new C5276h9(this, vbVar, str, str2, z);
        c.mo21555a((Runnable) h9Var);
    }

    public void initForTests(Map map) throws RemoteException {
        m22497a();
    }

    public void initialize(C4519d dVar, zzv zzv, long j) throws RemoteException {
        Context context = (Context) C4523f.m19512d(dVar);
        C5359p4 p4Var = this.f14851b;
        if (p4Var == null) {
            this.f14851b = C5359p4.m23334a(context, zzv);
        } else {
            p4Var.mo21205d().mo21536w().mo21549a("Attempting to initialize multiple times");
        }
    }

    public void isDataCollectionEnabled(C5027vb vbVar) throws RemoteException {
        m22497a();
        this.f14851b.mo21203c().mo21555a((Runnable) new C5309k9(this, vbVar));
    }

    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21766a(str, str2, bundle, z, z2, j);
    }

    public void logEventAndBundle(String str, String str2, Bundle bundle, C5027vb vbVar, long j) throws RemoteException {
        Bundle bundle2;
        m22497a();
        C4300a0.m18630b(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        String str3 = C14330v.f42313b;
        bundle2.putString("_o", str3);
        zzak zzak = new zzak(str2, new zzaf(bundle), str3, j);
        this.f14851b.mo21203c().mo21555a((Runnable) new C5251f6(this, vbVar, zzak, str));
    }

    public void logHealthData(int i, String str, C4519d dVar, C4519d dVar2, C4519d dVar3) throws RemoteException {
        Object obj;
        Object obj2;
        m22497a();
        Object obj3 = null;
        if (dVar == null) {
            obj = null;
        } else {
            obj = C4523f.m19512d(dVar);
        }
        if (dVar2 == null) {
            obj2 = null;
        } else {
            obj2 = C4523f.m19512d(dVar2);
        }
        if (dVar3 != null) {
            obj3 = C4523f.m19512d(dVar3);
        }
        this.f14851b.mo21205d().mo21531a(i, true, false, str, obj, obj2, obj3);
    }

    public void onActivityCreated(C4519d dVar, Bundle bundle, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityCreated((Activity) C4523f.m19512d(dVar), bundle);
        }
    }

    public void onActivityDestroyed(C4519d dVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityDestroyed((Activity) C4523f.m19512d(dVar));
        }
    }

    public void onActivityPaused(C4519d dVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityPaused((Activity) C4523f.m19512d(dVar));
        }
    }

    public void onActivityResumed(C4519d dVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityResumed((Activity) C4523f.m19512d(dVar));
        }
    }

    public void onActivitySaveInstanceState(C4519d dVar, C5027vb vbVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        Bundle bundle = new Bundle();
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivitySaveInstanceState((Activity) C4523f.m19512d(dVar), bundle);
        }
        try {
            vbVar.mo19016c(bundle);
        } catch (RemoteException e) {
            this.f14851b.mo21205d().mo21536w().mo21550a("Error returning bundle value to wrapper", e);
        }
    }

    public void onActivityStarted(C4519d dVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityStarted((Activity) C4523f.m19512d(dVar));
        }
    }

    public void onActivityStopped(C4519d dVar, long j) throws RemoteException {
        m22497a();
        C5416u6 u6Var = this.f14851b.mo21606t().f15548c;
        if (u6Var != null) {
            this.f14851b.mo21606t().mo21742A();
            u6Var.onActivityStopped((Activity) C4523f.m19512d(dVar));
        }
    }

    public void performAction(Bundle bundle, C5027vb vbVar, long j) throws RemoteException {
        m22497a();
        vbVar.mo19016c(null);
    }

    public void registerOnMeasurementEventListener(C4690ac acVar) throws RemoteException {
        m22497a();
        C5415u5 u5Var = (C5415u5) this.f14850N.get(Integer.valueOf(acVar.mo18858a()));
        if (u5Var == null) {
            u5Var = new C5188b(acVar);
            this.f14850N.put(Integer.valueOf(acVar.mo18858a()), u5Var);
        }
        this.f14851b.mo21606t().mo21760a(u5Var);
    }

    public void resetAnalyticsData(long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21780d(j);
    }

    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        m22497a();
        if (bundle == null) {
            this.f14851b.mo21205d().mo21533t().mo21549a("Conditional user property must not be null");
        } else {
            this.f14851b.mo21606t().mo21759a(bundle, j);
        }
    }

    public void setCurrentScreen(C4519d dVar, String str, String str2, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21582D().mo21309a((Activity) C4523f.m19512d(dVar), str, str2);
    }

    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21776b(z);
    }

    public void setEventInterceptor(C4690ac acVar) throws RemoteException {
        m22497a();
        C5437w5 t = this.f14851b.mo21606t();
        C5187a aVar = new C5187a(acVar);
        t.mo21201b();
        t.mo21180w();
        t.mo21203c().mo21555a((Runnable) new C5240e6(t, aVar));
    }

    public void setInstanceIdProvider(C4704bc bcVar) throws RemoteException {
        m22497a();
    }

    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21771a(z);
    }

    public void setMinimumSessionDuration(long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21757a(j);
    }

    public void setSessionTimeoutDuration(long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21772b(j);
    }

    public void setUserId(String str, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21769a(null, FeatureRequestEntry.COLUMN_ID, str, true, j);
    }

    public void setUserProperty(String str, String str2, C4519d dVar, boolean z, long j) throws RemoteException {
        m22497a();
        this.f14851b.mo21606t().mo21769a(str, str2, C4523f.m19512d(dVar), z, j);
    }

    public void unregisterOnMeasurementEventListener(C4690ac acVar) throws RemoteException {
        m22497a();
        C5415u5 u5Var = (C5415u5) this.f14850N.remove(Integer.valueOf(acVar.mo18858a()));
        if (u5Var == null) {
            u5Var = new C5188b(acVar);
        }
        this.f14851b.mo21606t().mo21774b(u5Var);
    }

    /* renamed from: a */
    private final void m22498a(C5027vb vbVar, String str) {
        this.f14851b.mo21607u().mo21372a(vbVar, str);
    }
}
