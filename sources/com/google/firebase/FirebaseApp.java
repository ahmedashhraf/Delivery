package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.collection.C0635a;
import androidx.core.p038os.C1073o;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.internal.C4109d;
import com.google.android.gms.common.api.internal.C4109d.C4110a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.util.C4473c;
import com.google.android.gms.common.util.C4503v;
import com.google.android.gms.common.util.C4505x;
import com.google.firebase.components.C8641e;
import com.google.firebase.components.C8645g;
import com.google.firebase.components.C8654m;
import com.google.firebase.components.C8662r;
import com.google.firebase.p192p.C8761c;
import com.google.firebase.p192p.C8763f;
import com.google.firebase.p314i.C8673c;
import com.google.firebase.p318m.C8739a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p201f.p202a.p203u.C5966a;
import p205i.p489f.C14069f;

/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class FirebaseApp {

    /* renamed from: j */
    private static final String f22596j = "FirebaseApp";
    @C0193h0

    /* renamed from: k */
    public static final String f22597k = "[DEFAULT]";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Object f22598l = new Object();

    /* renamed from: m */
    private static final Executor f22599m = new C8610d();
    @C5966a("LOCK")

    /* renamed from: n */
    static final Map<String, FirebaseApp> f22600n = new C0635a();

    /* renamed from: o */
    private static final String f22601o = "fire-android";

    /* renamed from: p */
    private static final String f22602p = "fire-core";

    /* renamed from: a */
    private final Context f22603a;

    /* renamed from: b */
    private final String f22604b;

    /* renamed from: c */
    private final C8668g f22605c;

    /* renamed from: d */
    private final C8654m f22606d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final AtomicBoolean f22607e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f22608f = new AtomicBoolean();

    /* renamed from: g */
    private final C8662r<C8739a> f22609g;

    /* renamed from: h */
    private final List<C8608b> f22610h = new CopyOnWriteArrayList();

    /* renamed from: i */
    private final List<C8665d> f22611i = new CopyOnWriteArrayList();

    @C4056a
    /* renamed from: com.google.firebase.FirebaseApp$b */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    public interface C8608b {
        @C4056a
        /* renamed from: a */
        void mo31962a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.FirebaseApp$c */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8609c implements C4110a {

        /* renamed from: a */
        private static AtomicReference<C8609c> f22612a = new AtomicReference<>();

        private C8609c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m40547b(Context context) {
            if (C4503v.m19409c() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f22612a.get() == null) {
                    C8609c cVar = new C8609c();
                    if (f22612a.compareAndSet(null, cVar)) {
                        C4109d.m17754a(application);
                        C4109d.m17755b().mo17790a((C4110a) cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo17803a(boolean z) {
            synchronized (FirebaseApp.f22598l) {
                Iterator it = new ArrayList(FirebaseApp.f22600n.values()).iterator();
                while (it.hasNext()) {
                    FirebaseApp firebaseApp = (FirebaseApp) it.next();
                    if (firebaseApp.f22607e.get()) {
                        firebaseApp.m40525c(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.FirebaseApp$d */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8610d implements Executor {

        /* renamed from: a */
        private static final Handler f22613a = new Handler(Looper.getMainLooper());

        private C8610d() {
        }

        public void execute(@C0193h0 Runnable runnable) {
            f22613a.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.FirebaseApp$e */
    /* compiled from: com.google.firebase:firebase-common@@19.0.0 */
    private static class C8611e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C8611e> f22614b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f22615a;

        public C8611e(Context context) {
            this.f22615a = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m40550b(Context context) {
            if (f22614b.get() == null) {
                C8611e eVar = new C8611e(context);
                if (f22614b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f22598l) {
                for (FirebaseApp a : FirebaseApp.f22600n.values()) {
                    a.m40530k();
                }
            }
            mo31964a();
        }

        /* renamed from: a */
        public void mo31964a() {
            this.f22615a.unregisterReceiver(this);
        }
    }

    protected FirebaseApp(Context context, String str, C8668g gVar) {
        this.f22603a = (Context) C4300a0.m18620a(context);
        this.f22604b = C4300a0.m18630b(str);
        this.f22605c = (C8668g) C4300a0.m18620a(gVar);
        List a = C8645g.m40662a(context).mo32008a();
        this.f22606d = new C8654m(f22599m, a, C8641e.m40635a(context, Context.class, new Class[0]), C8641e.m40635a(this, FirebaseApp.class, new Class[0]), C8641e.m40635a(gVar, C8668g.class, new Class[0]), C8763f.m41064a(f22601o, ""), C8763f.m41064a(f22602p, C8616a.f22621f), C8761c.m41059b());
        this.f22609g = new C8662r<>(C8636c.m40621a(this, context));
    }

    @C0193h0
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (f22598l) {
            firebaseApp = (FirebaseApp) f22600n.get(f22597k);
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(C4505x.m19424a());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* renamed from: h */
    private void m40527h() {
        C4300a0.m18632b(!this.f22608f.get(), "FirebaseApp was deleted");
    }

    @C0224v0
    /* renamed from: i */
    public static void m40528i() {
        synchronized (f22598l) {
            f22600n.clear();
        }
    }

    /* renamed from: j */
    private static List<String> m40529j() {
        ArrayList arrayList = new ArrayList();
        synchronized (f22598l) {
            for (FirebaseApp c : f22600n.values()) {
                arrayList.add(c.mo31954c());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m40530k() {
        if (!C1073o.m6200a(this.f22603a)) {
            C8611e.m40550b(this.f22603a);
        } else {
            this.f22606d.mo32011a(mo31958f());
        }
    }

    /* renamed from: l */
    private void m40531l() {
        for (C8665d a : this.f22611i) {
            a.mo32035a(this.f22604b, this.f22605c);
        }
    }

    @C0193h0
    /* renamed from: c */
    public String mo31954c() {
        m40527h();
        return this.f22604b;
    }

    @C0193h0
    /* renamed from: d */
    public C8668g mo31955d() {
        m40527h();
        return this.f22605c;
    }

    @C4056a
    /* renamed from: e */
    public String mo31956e() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4473c.m19319c(mo31954c().getBytes(Charset.defaultCharset())));
        sb.append(C14069f.f41344H);
        sb.append(C4473c.m19319c(mo31955d().mo32038b().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        return this.f22604b.equals(((FirebaseApp) obj).mo31954c());
    }

    @C4056a
    @C0224v0
    /* renamed from: f */
    public boolean mo31958f() {
        return f22597k.equals(mo31954c());
    }

    public int hashCode() {
        return this.f22604b.hashCode();
    }

    @C4056a
    public boolean isDataCollectionDefaultEnabled() {
        m40527h();
        return ((C8739a) this.f22609g.get()).mo32188a();
    }

    public String toString() {
        return C4413y.m19052a((Object) this).mo18403a("name", this.f22604b).mo18403a("options", this.f22605c).toString();
    }

    @C0193h0
    /* renamed from: b */
    public Context mo31950b() {
        m40527h();
        return this.f22603a;
    }

    @C0193h0
    /* renamed from: a */
    public static List<FirebaseApp> m40519a(@C0193h0 Context context) {
        ArrayList arrayList;
        synchronized (f22598l) {
            arrayList = new ArrayList(f22600n.values());
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m40525c(boolean z) {
        for (C8608b a : this.f22610h) {
            a.mo31962a(z);
        }
    }

    @C0195i0
    /* renamed from: b */
    public static FirebaseApp m40522b(@C0193h0 Context context) {
        synchronized (f22598l) {
            if (f22600n.containsKey(f22597k)) {
                FirebaseApp instance = getInstance();
                return instance;
            }
            C8668g a = C8668g.m40721a(context);
            if (a == null) {
                return null;
            }
            FirebaseApp a2 = m40514a(context, a);
            return a2;
        }
    }

    @C0193h0
    /* renamed from: a */
    public static FirebaseApp m40516a(@C0193h0 String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (f22598l) {
            firebaseApp = (FirebaseApp) f22600n.get(m40523b(str));
            if (firebaseApp == null) {
                List j = m40529j();
                if (j.isEmpty()) {
                    str2 = "";
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Available app names: ");
                    sb.append(TextUtils.join(", ", j));
                    str2 = sb.toString();
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return firebaseApp;
    }

    @C4056a
    /* renamed from: b */
    public void mo31953b(boolean z) {
        m40527h();
        ((C8739a) this.f22609g.get()).mo32187a(z);
    }

    @C4056a
    /* renamed from: b */
    public void mo31951b(C8608b bVar) {
        m40527h();
        this.f22610h.remove(bVar);
    }

    @C4056a
    /* renamed from: b */
    public void mo31952b(@C0193h0 C8665d dVar) {
        m40527h();
        C4300a0.m18620a(dVar);
        this.f22611i.remove(dVar);
    }

    @C0193h0
    /* renamed from: a */
    public static FirebaseApp m40514a(@C0193h0 Context context, @C0193h0 C8668g gVar) {
        return m40515a(context, gVar, f22597k);
    }

    @C0193h0
    /* renamed from: a */
    public static FirebaseApp m40515a(@C0193h0 Context context, @C0193h0 C8668g gVar, @C0193h0 String str) {
        FirebaseApp firebaseApp;
        C8609c.m40547b(context);
        String b = m40523b(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f22598l) {
            boolean z = !f22600n.containsKey(b);
            StringBuilder sb = new StringBuilder();
            sb.append("FirebaseApp name ");
            sb.append(b);
            sb.append(" already exists!");
            C4300a0.m18632b(z, sb.toString());
            C4300a0.m18621a(context, (Object) "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, b, gVar);
            f22600n.put(b, firebaseApp);
        }
        firebaseApp.m40530k();
        return firebaseApp;
    }

    /* renamed from: b */
    private static String m40523b(@C0193h0 String str) {
        return str.trim();
    }

    /* renamed from: a */
    public void mo31946a() {
        if (this.f22608f.compareAndSet(false, true)) {
            synchronized (f22598l) {
                f22600n.remove(this.f22604b);
            }
            m40531l();
        }
    }

    @C4056a
    /* renamed from: a */
    public <T> T mo31945a(Class<T> cls) {
        m40527h();
        return this.f22606d.mo31989a((Class) cls);
    }

    /* renamed from: a */
    public void mo31949a(boolean z) {
        m40527h();
        if (this.f22607e.compareAndSet(!z, z)) {
            boolean a = C4109d.m17755b().mo17791a();
            if (z && a) {
                m40525c(true);
            } else if (!z && a) {
                m40525c(false);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ C8739a m40517a(FirebaseApp firebaseApp, Context context) {
        return new C8739a(context, firebaseApp.mo31956e(), (C8673c) firebaseApp.f22606d.mo31989a(C8673c.class));
    }

    @C4056a
    /* renamed from: a */
    public void mo31947a(C8608b bVar) {
        m40527h();
        if (this.f22607e.get() && C4109d.m17755b().mo17791a()) {
            bVar.mo31962a(true);
        }
        this.f22610h.add(bVar);
    }

    @C4056a
    /* renamed from: a */
    public void mo31948a(@C0193h0 C8665d dVar) {
        m40527h();
        C4300a0.m18620a(dVar);
        this.f22611i.add(dVar);
    }

    @C4056a
    /* renamed from: a */
    public static String m40518a(String str, C8668g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(C4473c.m19319c(str.getBytes(Charset.defaultCharset())));
        sb.append(C14069f.f41344H);
        sb.append(C4473c.m19319c(gVar.mo32038b().getBytes(Charset.defaultCharset())));
        return sb.toString();
    }
}
