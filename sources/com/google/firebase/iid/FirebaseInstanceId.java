package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.annotation.Keep;
import com.amplitude.api.C2876e;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.p173f0.C4481b;
import com.google.android.gms.tasks.C5558j;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5566n;
import com.google.firebase.C8635b;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p192p.C8764g;
import com.google.firebase.p314i.C8672b;
import com.google.firebase.p314i.C8674d;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p201f.p202a.p203u.C5966a;
import p205i.p489f.C14069f;

/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public class FirebaseInstanceId {

    /* renamed from: i */
    private static final long f22767i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j */
    private static C8727w f22768j;
    @C4476d0
    @C5966a("FirebaseInstanceId.class")

    /* renamed from: k */
    private static ScheduledExecutorService f22769k;
    @C4476d0

    /* renamed from: a */
    private final Executor f22770a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FirebaseApp f22771b;

    /* renamed from: c */
    private final C8705l f22772c;

    /* renamed from: d */
    private final C8716q0 f22773d;

    /* renamed from: e */
    private final C8715q f22774e;

    /* renamed from: f */
    private final C8678a0 f22775f;
    @C5966a("this")

    /* renamed from: g */
    private boolean f22776g;

    /* renamed from: h */
    private final C8675a f22777h;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    /* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
    private class C8675a {

        /* renamed from: a */
        private boolean f22778a;

        /* renamed from: b */
        private final C8674d f22779b;
        @C5966a("this")

        /* renamed from: c */
        private boolean f22780c;
        @C0195i0
        @C5966a("this")

        /* renamed from: d */
        private C8672b<C8635b> f22781d;
        @C0195i0
        @C5966a("this")

        /* renamed from: e */
        private Boolean f22782e;

        C8675a(C8674d dVar) {
            this.f22779b = dVar;
        }

        /* renamed from: b */
        private final synchronized void m40788b() {
            if (!this.f22780c) {
                this.f22778a = m40790d();
                this.f22782e = m40789c();
                if (this.f22782e == null && this.f22778a) {
                    this.f22781d = new C8714p0(this);
                    this.f22779b.mo32031a(C8635b.class, this.f22781d);
                }
                this.f22780c = true;
            }
        }

        @C0195i0
        /* renamed from: c */
        private final Boolean m40789c() {
            String str = "firebase_messaging_auto_init_enabled";
            Context b = FirebaseInstanceId.this.f22771b.mo31950b();
            SharedPreferences sharedPreferences = b.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = b.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(b.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: d */
        private final boolean m40790d() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context b = FirebaseInstanceId.this.f22771b.mo31950b();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(b.getPackageName());
                ResolveInfo resolveService = b.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo32084a() {
            m40788b();
            if (this.f22782e == null) {
                return this.f22778a && FirebaseInstanceId.this.f22771b.isDataCollectionDefaultEnabled();
            }
            return this.f22782e.booleanValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized void mo32083a(boolean z) {
            m40788b();
            if (this.f22781d != null) {
                this.f22779b.mo32033b(C8635b.class, this.f22781d);
                this.f22781d = null;
            }
            Editor edit = FirebaseInstanceId.this.f22771b.mo31950b().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseInstanceId.this.m40760p();
            }
            this.f22782e = Boolean.valueOf(z);
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, C8674d dVar, C8764g gVar) {
        this(firebaseApp, new C8705l(firebaseApp.mo31950b()), C8686d.m40831b(), C8686d.m40831b(), dVar, gVar);
    }

    @C0193h0
    @Keep
    public static FirebaseInstanceId getInstance(@C0193h0 FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.mo31945a(FirebaseInstanceId.class);
    }

    @C0193h0
    /* renamed from: n */
    public static FirebaseInstanceId m40758n() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: o */
    static boolean m40759o() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m40760p() {
        if (mo32066a(mo32076g()) || this.f22775f.mo32091a()) {
            m40761q();
        }
    }

    /* renamed from: q */
    private final synchronized void m40761q() {
        if (!this.f22776g) {
            mo32063a(0);
        }
    }

    /* renamed from: r */
    private static String m40762r() {
        return f22768j.mo32166b("").mo32173a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32065a(boolean z) {
        this.f22776g = z;
    }

    /* renamed from: b */
    public long mo32067b() {
        return f22768j.mo32166b("").mo32174b();
    }

    @C0193h0
    @C0226w0
    /* renamed from: c */
    public String mo32071c() {
        m40760p();
        return m40762r();
    }

    @C0193h0
    /* renamed from: d */
    public C5560k<C8677a> mo32073d() {
        return m40755c(C8705l.m40847a(this.f22771b), C14069f.f41343G);
    }

    @Deprecated
    @C0195i0
    /* renamed from: e */
    public String mo32074e() {
        C8725v g = mo32076g();
        if (mo32066a(g)) {
            m40761q();
        }
        return C8725v.m40895a(g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final FirebaseApp mo32075f() {
        return this.f22771b;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: g */
    public final C8725v mo32076g() {
        return m40756d(C8705l.m40847a(this.f22771b), C14069f.f41343G);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo32077h() throws IOException {
        return mo32068b(C8705l.m40847a(this.f22771b), C14069f.f41343G);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final synchronized void mo32078i() {
        f22768j.mo32167b();
        if (this.f22777h.mo32084a()) {
            m40761q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final boolean mo32079j() {
        return this.f22772c.mo32137a() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final void mo32080k() {
        f22768j.mo32169c("");
        m40761q();
    }

    @C4476d0
    /* renamed from: l */
    public final boolean mo32081l() {
        return this.f22777h.mo32084a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo32082m() {
        if (this.f22777h.mo32084a()) {
            m40760p();
        }
    }

    @C0195i0
    @C4476d0
    /* renamed from: d */
    private static C8725v m40756d(String str, String str2) {
        return f22768j.mo32162a("", str, str2);
    }

    @C0226w0
    @C0195i0
    /* renamed from: b */
    public String mo32068b(@C0193h0 String str, @C0193h0 String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((C8677a) m40752a(m40755c(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: c */
    private final C5560k<C8677a> m40755c(String str, String str2) {
        return C5566n.m24211a(null).mo22007b(this.f22770a, new C8706l0(this, str, m40757d(str2)));
    }

    /* renamed from: d */
    private static String m40757d(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? C14069f.f41343G : str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo32063a(long j) {
        C8731y yVar = new C8731y(this, this.f22772c, this.f22775f, Math.min(Math.max(30, j << 1), f22767i));
        m40753a((Runnable) yVar, j);
        this.f22776g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo32069b(String str) throws IOException {
        C8725v g = mo32076g();
        if (!mo32066a(g)) {
            m40752a(this.f22773d.mo32149c(m40762r(), g.f22879a, str));
            return;
        }
        throw new IOException("token not available");
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, C8705l lVar, Executor executor, Executor executor2, C8674d dVar, C8764g gVar) {
        this.f22776g = false;
        if (C8705l.m40847a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f22768j == null) {
                    f22768j = new C8727w(firebaseApp.mo31950b());
                }
            }
            this.f22771b = firebaseApp;
            this.f22772c = lVar;
            this.f22773d = new C8716q0(firebaseApp, lVar, executor, gVar);
            this.f22770a = executor2;
            this.f22775f = new C8678a0(f22768j);
            this.f22777h = new C8675a(dVar);
            this.f22774e = new C8715q(executor);
            executor2.execute(new C8708m0(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo32072c(String str) throws IOException {
        C8725v g = mo32076g();
        if (!mo32066a(g)) {
            m40752a(this.f22773d.mo32150d(m40762r(), g.f22879a, str));
            return;
        }
        throw new IOException("token not available");
    }

    /* renamed from: a */
    static void m40753a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f22769k == null) {
                f22769k = new ScheduledThreadPoolExecutor(1, new C4481b("FirebaseInstanceId"));
            }
            f22769k.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    @C4476d0
    /* renamed from: b */
    public final void mo32070b(boolean z) {
        this.f22777h.mo32083a(z);
    }

    @C0226w0
    /* renamed from: a */
    public void mo32062a() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            m40752a(this.f22773d.mo32145a(m40762r()));
            mo32078i();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    private final <T> T m40752a(C5560k<T> kVar) throws IOException {
        try {
            return C5566n.m24217a(kVar, C2876e.f10137n, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo32078i();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    @C0226w0
    /* renamed from: a */
    public void mo32064a(@C0193h0 String str, @C0193h0 String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String d = m40757d(str2);
            m40752a(this.f22773d.mo32148b(m40762r(), str, d));
            f22768j.mo32168b("", str, d);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: a */
    public final synchronized C5560k<Void> mo32058a(String str) {
        C5560k<Void> a;
        a = this.f22775f.mo32090a(str);
        m40761q();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo32066a(@C0195i0 C8725v vVar) {
        return vVar == null || vVar.mo32159a(this.f22772c.mo32138b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C5560k mo32059a(String str, String str2, C5560k kVar) throws Exception {
        String r = m40762r();
        C8725v d = m40756d(str, str2);
        if (!mo32066a(d)) {
            return C5566n.m24211a(new C8734z0(r, d.f22879a));
        }
        return this.f22774e.mo32144a(str, str2, new C8712o0(this, r, str, str2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C5560k mo32060a(String str, String str2, String str3) {
        return this.f22773d.mo32146a(str, str2, str3).mo22001a(this.f22770a, (C5558j<TResult, TContinuationResult>) new C8710n0<TResult,TContinuationResult>(this, str2, str3, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C5560k mo32061a(String str, String str2, String str3, String str4) throws Exception {
        f22768j.mo32165a("", str, str2, str4, this.f22772c.mo32138b());
        return C5566n.m24211a(new C8734z0(str3, str4));
    }
}
