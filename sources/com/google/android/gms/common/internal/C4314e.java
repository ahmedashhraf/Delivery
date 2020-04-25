package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.C0190g;
import androidx.annotation.C0193h0;
import androidx.annotation.C0194i;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import com.fasterxml.jackson.core.p162w.C3868i;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4081f;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4385r.C4386a;
import com.google.android.gms.common.util.C4476d0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p112d.p113a.p114a.p118d.p122d.C2617e;
import p201f.p202a.p203u.C5966a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

@C4056a
/* renamed from: com.google.android.gms.common.internal.e */
public abstract class C4314e<T extends IInterface> {
    @C4056a

    /* renamed from: B */
    public static final int f13396B = 1;
    @C4056a

    /* renamed from: C */
    public static final int f13397C = 4;
    @C4056a

    /* renamed from: D */
    public static final int f13398D = 5;

    /* renamed from: E */
    private static final Feature[] f13399E = new Feature[0];
    @C4056a

    /* renamed from: F */
    public static final String f13400F = "pendingIntent";
    @C4056a

    /* renamed from: G */
    public static final String f13401G = "<<default account>>";
    @C4056a

    /* renamed from: H */
    public static final String[] f13402H = {"service_esmobile", "service_googleme"};
    @C4476d0

    /* renamed from: A */
    protected AtomicInteger f13403A;

    /* renamed from: a */
    private int f13404a;

    /* renamed from: b */
    private long f13405b;

    /* renamed from: c */
    private long f13406c;

    /* renamed from: d */
    private int f13407d;

    /* renamed from: e */
    private long f13408e;
    @C4476d0

    /* renamed from: f */
    private C4336g1 f13409f;

    /* renamed from: g */
    private final Context f13410g;

    /* renamed from: h */
    private final Looper f13411h;

    /* renamed from: i */
    private final C4362l f13412i;

    /* renamed from: j */
    private final C4282f f13413j;

    /* renamed from: k */
    final Handler f13414k;

    /* renamed from: l */
    private final Object f13415l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Object f13416m;
    /* access modifiers changed from: private */
    @C5966a("mServiceBrokerLock")

    /* renamed from: n */
    public C4388s f13417n;
    @C4476d0

    /* renamed from: o */
    protected C4317c f13418o;
    @C5966a("mLock")

    /* renamed from: p */
    private T f13419p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final ArrayList<C4322h<?>> f13420q;
    @C5966a("mLock")

    /* renamed from: r */
    private C4324j f13421r;
    @C5966a("mLock")

    /* renamed from: s */
    private int f13422s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C4315a f13423t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C4316b f13424u;

    /* renamed from: v */
    private final int f13425v;

    /* renamed from: w */
    private final String f13426w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public ConnectionResult f13427x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f13428y;

    /* renamed from: z */
    private volatile zzb f13429z;

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.e$a */
    public interface C4315a {
        @C4056a
        /* renamed from: i */
        void mo18263i(@C0195i0 Bundle bundle);

        @C4056a
        /* renamed from: n */
        void mo18264n(int i);
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.e$b */
    public interface C4316b {
        /* renamed from: a */
        void mo18265a(@C0193h0 ConnectionResult connectionResult);
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.e$c */
    public interface C4317c {
        @C4056a
        /* renamed from: a */
        void mo17877a(@C0193h0 ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.e$d */
    protected class C4318d implements C4317c {
        @C4056a
        public C4318d() {
        }

        /* renamed from: a */
        public void mo17877a(@C0193h0 ConnectionResult connectionResult) {
            if (connectionResult.mo17580R()) {
                C4314e eVar = C4314e.this;
                eVar.mo18240a((C4375p) null, eVar.mo18261y());
                return;
            }
            if (C4314e.this.f13424u != null) {
                C4314e.this.f13424u.mo18265a(connectionResult);
            }
        }
    }

    @C4056a
    /* renamed from: com.google.android.gms.common.internal.e$e */
    public interface C4319e {
        @C4056a
        /* renamed from: a */
        void mo17951a();
    }

    /* renamed from: com.google.android.gms.common.internal.e$f */
    private abstract class C4320f extends C4322h<Boolean> {

        /* renamed from: d */
        private final int f13431d;

        /* renamed from: e */
        private final Bundle f13432e;

        @C0190g
        protected C4320f(int i, Bundle bundle) {
            super(Boolean.valueOf(true));
            this.f13431d = i;
            this.f13432e = bundle;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo18266a(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ void mo18267a(Object obj) {
            PendingIntent pendingIntent = null;
            if (((Boolean) obj) == null) {
                C4314e.this.m18662b(1, null);
                return;
            }
            int i = this.f13431d;
            if (i != 0) {
                if (i != 10) {
                    C4314e.this.m18662b(1, null);
                    Bundle bundle = this.f13432e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable(C4314e.f13400F);
                    }
                    mo18266a(new ConnectionResult(this.f13431d, pendingIntent));
                } else {
                    C4314e.this.m18662b(1, null);
                    throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[]{getClass().getSimpleName(), C4314e.this.mo10083B(), C4314e.this.mo10082A()}));
                }
            } else if (!mo18269e()) {
                C4314e.this.m18662b(1, null);
                mo18266a(new ConnectionResult(8, null));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo18268c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract boolean mo18269e();
    }

    /* renamed from: com.google.android.gms.common.internal.e$g */
    final class C4321g extends C2617e {
        public C4321g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m18718a(Message message) {
            C4322h hVar = (C4322h) message.obj;
            hVar.mo18268c();
            hVar.mo18272b();
        }

        /* renamed from: b */
        private static boolean m18719b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        public final void handleMessage(Message message) {
            ConnectionResult connectionResult;
            ConnectionResult connectionResult2;
            if (C4314e.this.f13403A.get() != message.arg1) {
                if (m18719b(message)) {
                    m18718a(message);
                }
                return;
            }
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !C4314e.this.mo18254r()) || message.what == 5)) && !C4314e.this.mo18244d()) {
                m18718a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                C4314e.this.f13427x = new ConnectionResult(message.arg2);
                if (!C4314e.this.mo18787F() || C4314e.this.f13428y) {
                    if (C4314e.this.f13427x != null) {
                        connectionResult2 = C4314e.this.f13427x;
                    } else {
                        connectionResult2 = new ConnectionResult(8);
                    }
                    C4314e.this.f13418o.mo17877a(connectionResult2);
                    C4314e.this.mo18236a(connectionResult2);
                    return;
                }
                C4314e.this.m18662b(3, null);
            } else if (i2 == 5) {
                if (C4314e.this.f13427x != null) {
                    connectionResult = C4314e.this.f13427x;
                } else {
                    connectionResult = new ConnectionResult(8);
                }
                C4314e.this.f13418o.mo17877a(connectionResult);
                C4314e.this.mo18236a(connectionResult);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, pendingIntent);
                C4314e.this.f13418o.mo17877a(connectionResult3);
                C4314e.this.mo18236a(connectionResult3);
            } else if (i2 == 6) {
                C4314e.this.m18662b(5, null);
                if (C4314e.this.f13423t != null) {
                    C4314e.this.f13423t.mo18264n(message.arg2);
                }
                C4314e.this.mo18231a(message.arg2);
                C4314e.this.m18660a(5, 1, null);
            } else if (i2 == 2 && !C4314e.this.isConnected()) {
                m18718a(message);
            } else if (m18719b(message)) {
                ((C4322h) message.obj).mo18273d();
            } else {
                int i3 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i3);
                sb.toString();
                new Exception();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$h */
    protected abstract class C4322h<TListener> {

        /* renamed from: a */
        private TListener f13435a;

        /* renamed from: b */
        private boolean f13436b = false;

        public C4322h(TListener tlistener) {
            this.f13435a = tlistener;
        }

        /* renamed from: a */
        public final void mo18271a() {
            synchronized (this) {
                this.f13435a = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo18267a(TListener tlistener);

        /* renamed from: b */
        public final void mo18272b() {
            mo18271a();
            synchronized (C4314e.this.f13420q) {
                C4314e.this.f13420q.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo18268c();

        /* renamed from: d */
        public final void mo18273d() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f13435a;
                if (this.f13436b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    sb.toString();
                }
            }
            if (tlistener != null) {
                try {
                    mo18267a(tlistener);
                } catch (RuntimeException e) {
                    mo18268c();
                    throw e;
                }
            } else {
                mo18268c();
            }
            synchronized (this) {
                this.f13436b = true;
            }
            mo18272b();
        }
    }

    @C4476d0
    /* renamed from: com.google.android.gms.common.internal.e$i */
    public static final class C4323i extends C4386a {

        /* renamed from: N */
        private final int f13438N;

        /* renamed from: b */
        private C4314e f13439b;

        public C4323i(@C0193h0 C4314e eVar, int i) {
            this.f13439b = eVar;
            this.f13438N = i;
        }

        @C0190g
        /* renamed from: a */
        public final void mo18274a(int i, @C0193h0 IBinder iBinder, @C0195i0 Bundle bundle) {
            C4300a0.m18621a(this.f13439b, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
            this.f13439b.mo18233a(i, iBinder, bundle, this.f13438N);
            this.f13439b = null;
        }

        @C0190g
        /* renamed from: c */
        public final void mo18276c(int i, @C0195i0 Bundle bundle) {
            new Exception();
        }

        @C0190g
        /* renamed from: a */
        public final void mo18275a(int i, @C0193h0 IBinder iBinder, @C0193h0 zzb zzb) {
            C4300a0.m18621a(this.f13439b, (Object) "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C4300a0.m18620a(zzb);
            this.f13439b.m18659a(zzb);
            mo18274a(i, iBinder, zzb.f13544a);
        }
    }

    @C4476d0
    /* renamed from: com.google.android.gms.common.internal.e$j */
    public final class C4324j implements ServiceConnection {

        /* renamed from: a */
        private final int f13440a;

        public C4324j(int i) {
            this.f13440a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C4388s sVar;
            if (iBinder == null) {
                C4314e.this.m18664c(16);
                return;
            }
            synchronized (C4314e.this.f13416m) {
                C4314e eVar = C4314e.this;
                if (iBinder == null) {
                    sVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof C4388s)) {
                        sVar = new C4390a(iBinder);
                    } else {
                        sVar = (C4388s) queryLocalInterface;
                    }
                }
                eVar.f13417n = sVar;
            }
            C4314e.this.mo18232a(0, (Bundle) null, this.f13440a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C4314e.this.f13416m) {
                C4314e.this.f13417n = null;
            }
            Handler handler = C4314e.this.f13414k;
            handler.sendMessage(handler.obtainMessage(6, this.f13440a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$k */
    protected final class C4325k extends C4320f {

        /* renamed from: g */
        private final IBinder f13442g;

        @C0190g
        public C4325k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f13442g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo18266a(ConnectionResult connectionResult) {
            if (C4314e.this.f13424u != null) {
                C4314e.this.f13424u.mo18265a(connectionResult);
            }
            C4314e.this.mo18236a(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo18269e() {
            boolean z = false;
            try {
                String interfaceDescriptor = this.f13442g.getInterfaceDescriptor();
                if (!C4314e.this.mo10082A().equals(interfaceDescriptor)) {
                    String A = C4314e.this.mo10082A();
                    StringBuilder sb = new StringBuilder(String.valueOf(A).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(A);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    sb.toString();
                    return false;
                }
                IInterface a = C4314e.this.mo10084a(this.f13442g);
                if (a != null && (C4314e.this.m18660a(2, 4, a) || C4314e.this.m18660a(3, 4, a))) {
                    C4314e.this.f13427x = null;
                    Bundle connectionHint = C4314e.this.getConnectionHint();
                    if (C4314e.this.f13423t != null) {
                        C4314e.this.f13423t.mo18263i(connectionHint);
                    }
                    z = true;
                }
                return z;
            } catch (RemoteException unused) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.e$l */
    protected final class C4326l extends C4320f {
        @C0190g
        public C4326l(int i, @C0195i0 Bundle bundle) {
            super(i, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo18266a(ConnectionResult connectionResult) {
            if (!C4314e.this.mo18254r() || !C4314e.this.mo18787F()) {
                C4314e.this.f13418o.mo17877a(connectionResult);
                C4314e.this.mo18236a(connectionResult);
                return;
            }
            C4314e.this.m18664c(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public final boolean mo18269e() {
            C4314e.this.f13418o.mo17877a(ConnectionResult.f12763l0);
            return true;
        }
    }

    @C4056a
    protected C4314e(Context context, Looper looper, int i, C4315a aVar, C4316b bVar, String str) {
        this(context, looper, C4362l.m18835a(context), C4282f.m18511a(), i, (C4315a) C4300a0.m18620a(aVar), (C4316b) C4300a0.m18620a(bVar), str);
    }

    @C0195i0
    /* renamed from: D */
    private final String mo18328D() {
        String str = this.f13426w;
        return str == null ? this.f13410g.getClass().getName() : str;
    }

    /* renamed from: E */
    private final boolean mo17532E() {
        boolean z;
        synchronized (this.f13415l) {
            z = this.f13422s == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public final boolean mo18787F() {
        if (this.f13428y || TextUtils.isEmpty(mo10082A()) || TextUtils.isEmpty(mo18259w())) {
            return false;
        }
        try {
            Class.forName(mo10082A());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18659a(zzb zzb) {
        this.f13429z = zzb;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m18662b(int i, T t) {
        C4336g1 g1Var;
        C4300a0.m18627a((i == 4) == (t != null));
        synchronized (this.f13415l) {
            this.f13422s = i;
            this.f13419p = t;
            mo18234a(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f13421r == null || this.f13409f == null)) {
                        String c = this.f13409f.mo18322c();
                        String a = this.f13409f.mo18320a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(a);
                        sb.toString();
                        this.f13412i.mo18333a(this.f13409f.mo18322c(), this.f13409f.mo18320a(), this.f13409f.mo18321b(), this.f13421r, mo18328D());
                        this.f13403A.incrementAndGet();
                    }
                    this.f13421r = new C4324j(this.f13403A.get());
                    if (this.f13422s != 3 || mo18259w() == null) {
                        g1Var = new C4336g1(mo18229C(), mo10083B(), false, C13959t.f40835R1);
                    } else {
                        g1Var = new C4336g1(mo18257u().getPackageName(), mo18259w(), true, C13959t.f40835R1);
                    }
                    this.f13409f = g1Var;
                    if (!this.f13412i.mo18226a(new C4363a(this.f13409f.mo18322c(), this.f13409f.mo18320a(), this.f13409f.mo18321b()), (ServiceConnection) this.f13421r, mo18328D())) {
                        String c2 = this.f13409f.mo18322c();
                        String a2 = this.f13409f.mo18320a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        sb2.toString();
                        mo18232a(16, (Bundle) null, this.f13403A.get());
                    }
                } else if (i == 4) {
                    mo18235a(t);
                }
            } else if (this.f13421r != null) {
                this.f13412i.mo18333a(this.f13409f.mo18322c(), this.f13409f.mo18320a(), this.f13409f.mo18321b(), this.f13421r, mo18328D());
                this.f13421r = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    @C0193h0
    @C4056a
    /* renamed from: A */
    public abstract String mo10082A();

    /* access modifiers changed from: protected */
    @C0193h0
    @C4056a
    /* renamed from: B */
    public abstract String mo10083B();

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: C */
    public String mo18229C() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C0195i0
    /* renamed from: a */
    public abstract T mo10084a(IBinder iBinder);

    /* access modifiers changed from: 0000 */
    @C4056a
    /* renamed from: a */
    public void mo18234a(int i, T t) {
    }

    @C4056a
    /* renamed from: c */
    public void mo18243c() {
        int a = this.f13413j.mo18094a(this.f13410g, mo10085l());
        if (a != 0) {
            m18662b(1, null);
            mo18238a((C4317c) new C4318d(), a, (PendingIntent) null);
            return;
        }
        mo18237a((C4317c) new C4318d());
    }

    @C4056a
    /* renamed from: d */
    public boolean mo18244d() {
        boolean z;
        synchronized (this.f13415l) {
            if (this.f13422s != 2) {
                if (this.f13422s != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @C4056a
    /* renamed from: e */
    public boolean mo18245e() {
        return false;
    }

    @C4056a
    /* renamed from: f */
    public boolean mo17533f() {
        return false;
    }

    @C4056a
    public Bundle getConnectionHint() {
        return null;
    }

    @C4056a
    /* renamed from: h */
    public String mo18247h() {
        if (isConnected()) {
            C4336g1 g1Var = this.f13409f;
            if (g1Var != null) {
                return g1Var.mo18320a();
            }
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @C4056a
    public boolean isConnected() {
        boolean z;
        synchronized (this.f13415l) {
            z = this.f13422s == 4;
        }
        return z;
    }

    @C4056a
    /* renamed from: k */
    public boolean mo18249k() {
        return true;
    }

    @C4056a
    /* renamed from: l */
    public int mo10085l() {
        return C4282f.f13284a;
    }

    @C4056a
    @C0195i0
    /* renamed from: m */
    public final Feature[] mo18250m() {
        zzb zzb = this.f13429z;
        if (zzb == null) {
            return null;
        }
        return zzb.f13545b;
    }

    @C4056a
    /* renamed from: n */
    public Intent mo17534n() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @C4056a
    /* renamed from: o */
    public boolean mo18251o() {
        return false;
    }

    @C4056a
    @C0195i0
    /* renamed from: p */
    public IBinder mo18252p() {
        synchronized (this.f13416m) {
            if (this.f13417n == null) {
                return null;
            }
            IBinder asBinder = this.f13417n.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: q */
    public final void mo18253q() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: r */
    public boolean mo18254r() {
        return false;
    }

    @C4056a
    /* renamed from: s */
    public Account mo18255s() {
        return null;
    }

    @C4056a
    /* renamed from: t */
    public Feature[] mo18256t() {
        return f13399E;
    }

    @C4056a
    /* renamed from: u */
    public final Context mo18257u() {
        return this.f13410g;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: v */
    public Bundle mo18258v() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C0195i0
    /* renamed from: w */
    public String mo18259w() {
        return null;
    }

    @C4056a
    /* renamed from: x */
    public final Looper mo18260x() {
        return this.f13411h;
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: y */
    public Set<Scope> mo18261y() {
        return Collections.EMPTY_SET;
    }

    @C4056a
    /* renamed from: z */
    public final T mo18262z() throws DeadObjectException {
        T t;
        synchronized (this.f13415l) {
            if (this.f13422s != 5) {
                mo18253q();
                C4300a0.m18632b(this.f13419p != null, "Client is connected but service is null");
                t = this.f13419p;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C0194i
    /* renamed from: a */
    public void mo18235a(@C0193h0 T t) {
        this.f13406c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C0194i
    /* renamed from: a */
    public void mo18231a(int i) {
        this.f13404a = i;
        this.f13405b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C0194i
    /* renamed from: a */
    public void mo18236a(ConnectionResult connectionResult) {
        this.f13407d = connectionResult.mo17576N();
        this.f13408e = System.currentTimeMillis();
    }

    @C4056a
    @C4476d0
    protected C4314e(Context context, Looper looper, C4362l lVar, C4282f fVar, int i, C4315a aVar, C4316b bVar, String str) {
        this.f13415l = new Object();
        this.f13416m = new Object();
        this.f13420q = new ArrayList<>();
        this.f13422s = 1;
        this.f13427x = null;
        this.f13428y = false;
        this.f13429z = null;
        this.f13403A = new AtomicInteger(0);
        this.f13410g = (Context) C4300a0.m18621a(context, (Object) "Context must not be null");
        this.f13411h = (Looper) C4300a0.m18621a(looper, (Object) "Looper must not be null");
        this.f13412i = (C4362l) C4300a0.m18621a(lVar, (Object) "Supervisor must not be null");
        this.f13413j = (C4282f) C4300a0.m18621a(fVar, (Object) "API availability must not be null");
        this.f13414k = new C4321g(looper);
        this.f13425v = i;
        this.f13423t = aVar;
        this.f13424u = bVar;
        this.f13426w = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m18664c(int i) {
        int i2;
        if (mo17532E()) {
            i2 = 5;
            this.f13428y = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f13414k;
        handler.sendMessage(handler.obtainMessage(i2, this.f13403A.get(), 16));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m18660a(int i, int i2, T t) {
        synchronized (this.f13415l) {
            if (this.f13422s != i) {
                return false;
            }
            m18662b(i2, t);
            return true;
        }
    }

    @C4056a
    /* renamed from: a */
    public void mo18237a(@C0193h0 C4317c cVar) {
        this.f13418o = (C4317c) C4300a0.m18621a(cVar, (Object) "Connection progress callbacks cannot be null.");
        m18662b(2, null);
    }

    @C4056a
    /* renamed from: a */
    public void mo18230a() {
        this.f13403A.incrementAndGet();
        synchronized (this.f13420q) {
            int size = this.f13420q.size();
            for (int i = 0; i < size; i++) {
                ((C4322h) this.f13420q.get(i)).mo18271a();
            }
            this.f13420q.clear();
        }
        synchronized (this.f13416m) {
            this.f13417n = null;
        }
        m18662b(1, null);
    }

    @C4056a
    @C4476d0
    protected C4314e(Context context, Handler handler, C4362l lVar, C4282f fVar, int i, C4315a aVar, C4316b bVar) {
        this.f13415l = new Object();
        this.f13416m = new Object();
        this.f13420q = new ArrayList<>();
        this.f13422s = 1;
        this.f13427x = null;
        this.f13428y = false;
        this.f13429z = null;
        this.f13403A = new AtomicInteger(0);
        this.f13410g = (Context) C4300a0.m18621a(context, (Object) "Context must not be null");
        this.f13414k = (Handler) C4300a0.m18621a(handler, (Object) "Handler must not be null");
        this.f13411h = handler.getLooper();
        this.f13412i = (C4362l) C4300a0.m18621a(lVar, (Object) "Supervisor must not be null");
        this.f13413j = (C4282f) C4300a0.m18621a(fVar, (Object) "API availability must not be null");
        this.f13425v = i;
        this.f13423t = aVar;
        this.f13424u = bVar;
        this.f13426w = null;
    }

    /* access modifiers changed from: protected */
    @C4056a
    @C4476d0
    /* renamed from: a */
    public void mo18238a(@C0193h0 C4317c cVar, int i, @C0195i0 PendingIntent pendingIntent) {
        this.f13418o = (C4317c) C4300a0.m18621a(cVar, (Object) "Connection progress callbacks cannot be null.");
        Handler handler = this.f13414k;
        handler.sendMessage(handler.obtainMessage(3, this.f13403A.get(), i, pendingIntent));
    }

    /* access modifiers changed from: protected */
    @C4056a
    /* renamed from: a */
    public void mo18233a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f13414k;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C4325k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18232a(int i, @C0195i0 Bundle bundle, int i2) {
        Handler handler = this.f13414k;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C4326l(i, null)));
    }

    @C4056a
    @C0226w0
    /* renamed from: a */
    public void mo18240a(C4375p pVar, Set<Scope> set) {
        Bundle v = mo18258v();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f13425v);
        getServiceRequest.f13349O = this.f13410g.getPackageName();
        getServiceRequest.f13352R = v;
        if (set != null) {
            getServiceRequest.f13351Q = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo18251o()) {
            getServiceRequest.f13353S = mo18255s() != null ? mo18255s() : new Account("<<default account>>", "com.google");
            if (pVar != null) {
                getServiceRequest.f13350P = pVar.asBinder();
            }
        } else if (mo18245e()) {
            getServiceRequest.f13353S = mo18255s();
        }
        getServiceRequest.f13354T = f13399E;
        getServiceRequest.f13355U = mo18256t();
        try {
            synchronized (this.f13416m) {
                if (this.f13417n != null) {
                    this.f13417n.mo18372a(new C4323i(this, this.f13403A.get()), getServiceRequest);
                }
            }
        } catch (DeadObjectException unused) {
            mo18242b(1);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo18233a(8, (IBinder) null, (Bundle) null, this.f13403A.get());
        }
    }

    @C4056a
    /* renamed from: b */
    public void mo18242b(int i) {
        Handler handler = this.f13414k;
        handler.sendMessage(handler.obtainMessage(6, this.f13403A.get(), i));
    }

    @C4056a
    /* renamed from: a */
    public void mo18239a(@C0193h0 C4319e eVar) {
        eVar.mo17951a();
    }

    @C4056a
    /* renamed from: a */
    public void mo18241a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C4388s sVar;
        synchronized (this.f13415l) {
            i = this.f13422s;
            t = this.f13419p;
        }
        synchronized (this.f13416m) {
            sVar = this.f13417n;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo10082A()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (sVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(sVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f13406c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f13406c;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(C3868i.f12248b);
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f13405b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f13404a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 != 2) {
                printWriter.append(String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_NETWORK_LOST");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f13405b;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(C3868i.f12248b);
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f13408e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C4081f.m17592a(this.f13407d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f13408e;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(C3868i.f12248b);
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }
}
