package com.google.firebase.analytics.p313a;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0203m0;
import androidx.annotation.C0210o0;
import androidx.annotation.C0226w0;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.google.firebase.C8635b;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.C8628a;
import com.google.firebase.analytics.connector.internal.C8630c;
import com.google.firebase.analytics.connector.internal.C8631d;
import com.google.firebase.analytics.connector.internal.C8632e;
import com.google.firebase.analytics.p313a.C8617a.C8618a;
import com.google.firebase.analytics.p313a.C8617a.C8619b;
import com.google.firebase.analytics.p313a.C8617a.C8620c;
import com.google.firebase.p314i.C8671a;
import com.google.firebase.p314i.C8674d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.analytics.a.b */
/* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
public class C8621b implements C8617a {

    /* renamed from: c */
    private static volatile C8617a f22637c;
    @C4476d0

    /* renamed from: a */
    private final AppMeasurement f22638a;
    @C4476d0

    /* renamed from: b */
    final Map<String, C8628a> f22639b = new ConcurrentHashMap();

    /* renamed from: com.google.firebase.analytics.a.b$a */
    /* compiled from: com.google.android.gms:play-services-measurement-api@@17.1.0 */
    class C8622a implements C8618a {

        /* renamed from: a */
        private final /* synthetic */ String f22640a;

        C8622a(String str) {
            this.f22640a = str;
        }

        @C4056a
        /* renamed from: a */
        public void mo31975a(Set<String> set) {
            if (C8621b.this.m40567b(this.f22640a) && this.f22640a.equals("fiam") && set != null && !set.isEmpty()) {
                ((C8628a) C8621b.this.f22639b.get(this.f22640a)).mo31983a(set);
            }
        }

        /* renamed from: b */
        public void mo31976b() {
            if (C8621b.this.m40567b(this.f22640a)) {
                C8619b a = ((C8628a) C8621b.this.f22639b.get(this.f22640a)).mo31982a();
                if (a != null) {
                    a.mo31977a(0, null);
                }
                C8621b.this.f22639b.remove(this.f22640a);
            }
        }

        @C4056a
        /* renamed from: a */
        public void mo31974a() {
            if (C8621b.this.m40567b(this.f22640a) && this.f22640a.equals("fiam")) {
                ((C8628a) C8621b.this.f22639b.get(this.f22640a)).mo31984i();
            }
        }
    }

    private C8621b(AppMeasurement appMeasurement) {
        C4300a0.m18620a(appMeasurement);
        this.f22638a = appMeasurement;
    }

    @C4056a
    @C0203m0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    /* renamed from: a */
    public static C8617a m40564a(FirebaseApp firebaseApp, Context context, C8674d dVar) {
        C4300a0.m18620a(firebaseApp);
        C4300a0.m18620a(context);
        C4300a0.m18620a(dVar);
        C4300a0.m18620a(context.getApplicationContext());
        if (f22637c == null) {
            synchronized (C8621b.class) {
                if (f22637c == null) {
                    Bundle bundle = new Bundle(1);
                    if (firebaseApp.mo31958f()) {
                        dVar.mo32032a(C8635b.class, C8625e.f22643a, C8624d.f22642a);
                        bundle.putBoolean("dataCollectionDefaultEnabled", firebaseApp.isDataCollectionDefaultEnabled());
                    }
                    f22637c = new C8621b(AppMeasurement.m22441a(context, bundle));
                }
            }
        }
        return f22637c;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m40567b(@C0193h0 String str) {
        return !str.isEmpty() && this.f22639b.containsKey(str) && this.f22639b.get(str) != null;
    }

    @C4056a
    public void clearConditionalUserProperty(@C0193h0 @C0210o0(max = 24, min = 1) String str, @C0195i0 String str2, @C0195i0 Bundle bundle) {
        if (str2 == null || C8631d.m40608a(str2, bundle)) {
            this.f22638a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @C4056a
    public void logEvent(@C0193h0 String str, @C0193h0 String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (C8631d.m40607a(str) && C8631d.m40608a(str2, bundle) && C8631d.m40610a(str, str2, bundle)) {
            this.f22638a.logEventInternal(str, str2, bundle);
        }
    }

    @C4056a
    /* renamed from: a */
    public static C8617a m40562a() {
        return m40563a(FirebaseApp.getInstance());
    }

    @C4056a
    /* renamed from: a */
    public static C8617a m40563a(FirebaseApp firebaseApp) {
        return (C8617a) firebaseApp.mo31945a(C8617a.class);
    }

    @C4056a
    /* renamed from: a */
    public void mo31971a(@C0193h0 String str, @C0193h0 String str2, Object obj) {
        if (C8631d.m40607a(str) && C8631d.m40609a(str, str2)) {
            this.f22638a.mo21063a(str, str2, obj);
        }
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public Map<String, Object> mo31969a(boolean z) {
        return this.f22638a.mo21059a(z);
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public C8618a mo31967a(@C0193h0 String str, C8619b bVar) {
        C4300a0.m18620a(bVar);
        if (!C8631d.m40607a(str) || m40567b(str)) {
            return null;
        }
        AppMeasurement appMeasurement = this.f22638a;
        Object obj = "fiam".equals(str) ? new C8630c(appMeasurement, bVar) : "crash".equals(str) ? new C8632e(appMeasurement, bVar) : null;
        if (obj == null) {
            return null;
        }
        this.f22639b.put(str, obj);
        return new C8622a(str);
    }

    @C4056a
    /* renamed from: a */
    public void mo31970a(@C0193h0 C8620c cVar) {
        if (C8631d.m40606a(cVar)) {
            this.f22638a.setConditionalUserProperty(C8631d.m40611b(cVar));
        }
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public List<C8620c> mo31968a(@C0193h0 String str, @C0210o0(max = 23, min = 1) @C0195i0 String str2) {
        ArrayList arrayList = new ArrayList();
        for (ConditionalUserProperty a : this.f22638a.getConditionalUserProperties(str, str2)) {
            arrayList.add(C8631d.m40605a(a));
        }
        return arrayList;
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public int mo31966a(@C0193h0 @C0210o0(min = 1) String str) {
        return this.f22638a.getMaxUserProperties(str);
    }

    /* renamed from: a */
    static final /* synthetic */ void m40565a(C8671a aVar) {
        boolean z = ((C8635b) aVar.mo32055a()).f22662a;
        synchronized (C8621b.class) {
            ((C8621b) f22637c).f22638a.mo21068c(z);
        }
    }
}
