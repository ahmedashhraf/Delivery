package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import androidx.collection.C0637b;
import com.amplitude.api.C2876e;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4083h;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.C4235j;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.C4109d.C4110a;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.api.internal.C4167n.C4168a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4314e.C4317c;
import com.google.android.gms.common.internal.C4314e.C4319e;
import com.google.android.gms.common.internal.C4335g0;
import com.google.android.gms.common.internal.C4369n;
import com.google.android.gms.common.internal.C4375p;
import com.google.android.gms.common.internal.C4413y;
import com.google.android.gms.common.util.C4471b;
import com.google.android.gms.common.util.C4503v;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.jcodec.codecs.common.biari.MQEncoder;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

@C4056a
/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class C4137i implements Callback {

    /* renamed from: n */
    public static final Status f12953n = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final Status f12954o = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: p */
    public static final Object f12955p = new Object();
    @C5966a("lock")

    /* renamed from: q */
    private static C4137i f12956q;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public long f12957a = 5000;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public long f12958b = 120000;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public long f12959c = 10000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f12960d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4279e f12961e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4369n f12962f;

    /* renamed from: g */
    private final AtomicInteger f12963g = new AtomicInteger(1);

    /* renamed from: h */
    private final AtomicInteger f12964h = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Map<C4102c<?>, C4138a<?>> f12965i = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */
    @C5966a("lock")

    /* renamed from: j */
    public C4128g0 f12966j = null;
    /* access modifiers changed from: private */
    @C5966a("lock")

    /* renamed from: k */
    public final Set<C4102c<?>> f12967k = new C0637b();

    /* renamed from: l */
    private final Set<C4102c<?>> f12968l = new C0637b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Handler f12969m;

    /* renamed from: com.google.android.gms.common.api.internal.i$a */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class C4138a<O extends C4063d> implements C4088b, C4089c, C4161l3 {

        /* renamed from: N */
        private final C4061b f12970N;

        /* renamed from: O */
        private final C4102c<O> f12971O;

        /* renamed from: P */
        private final C4205t3 f12972P;

        /* renamed from: Q */
        private final Set<C4114d3> f12973Q = new HashSet();

        /* renamed from: R */
        private final Map<C4168a<?>, C4233z1> f12974R = new HashMap();

        /* renamed from: S */
        private final int f12975S;

        /* renamed from: T */
        private final C4148j2 f12976T;

        /* renamed from: U */
        private boolean f12977U;

        /* renamed from: V */
        private final List<C4140c> f12978V = new ArrayList();

        /* renamed from: W */
        private ConnectionResult f12979W = null;

        /* renamed from: a */
        private final Queue<C4120e2> f12981a = new LinkedList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4071f f12982b;

        @C0226w0
        public C4138a(C4083h<O> hVar) {
            this.f12982b = hVar.mo17668a(C4137i.this.f12969m.getLooper(), this);
            C4071f fVar = this.f12982b;
            if (fVar instanceof C4335g0) {
                this.f12970N = ((C4335g0) fVar).mo17532E();
            } else {
                this.f12970N = fVar;
            }
            this.f12971O = hVar.mo17676b();
            this.f12972P = new C4205t3();
            this.f12975S = hVar.mo17687i();
            if (this.f12982b.mo17646o()) {
                this.f12976T = hVar.mo17670a(C4137i.this.f12960d, C4137i.this.f12969m);
            } else {
                this.f12976T = null;
            }
        }

        @C0226w0
        /* renamed from: c */
        private final boolean m17883c(@C0193h0 ConnectionResult connectionResult) {
            synchronized (C4137i.f12955p) {
                if (C4137i.this.f12966j == null || !C4137i.this.f12967k.contains(this.f12971O)) {
                    return false;
                }
                C4137i.this.f12966j.mo17817b(connectionResult, this.f12975S);
                return true;
            }
        }

        @C0226w0
        /* renamed from: d */
        private final void m17884d(ConnectionResult connectionResult) {
            for (C4114d3 d3Var : this.f12973Q) {
                String str = null;
                if (C4413y.m19053a(connectionResult, ConnectionResult.f12763l0)) {
                    str = this.f12982b.mo17641h();
                }
                d3Var.mo17807a(this.f12971O, connectionResult, str);
            }
            this.f12973Q.clear();
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: n */
        public final void m17885n() {
            mo17873j();
            m17884d(ConnectionResult.f12763l0);
            m17888q();
            Iterator it = this.f12974R.values().iterator();
            while (it.hasNext()) {
                C4233z1 z1Var = (C4233z1) it.next();
                if (m17871a(z1Var.f13219a.mo17957c()) != null) {
                    it.remove();
                } else {
                    try {
                        z1Var.f13219a.mo17829a(this.f12970N, new C5562l());
                    } catch (DeadObjectException unused) {
                        mo17778n(1);
                        this.f12982b.mo17633a();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            m17887p();
            m17889r();
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: o */
        public final void m17886o() {
            mo17873j();
            this.f12977U = true;
            this.f12972P.mo17975c();
            C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 9, this.f12971O), C4137i.this.f12957a);
            C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 11, this.f12971O), C4137i.this.f12958b);
            C4137i.this.f12962f.mo18368a();
        }

        @C0226w0
        /* renamed from: p */
        private final void m17887p() {
            ArrayList arrayList = new ArrayList(this.f12981a);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C4120e2 e2Var = (C4120e2) obj;
                if (!this.f12982b.isConnected()) {
                    return;
                }
                if (m17880b(e2Var)) {
                    this.f12981a.remove(e2Var);
                }
            }
        }

        @C0226w0
        /* renamed from: q */
        private final void m17888q() {
            if (this.f12977U) {
                C4137i.this.f12969m.removeMessages(11, this.f12971O);
                C4137i.this.f12969m.removeMessages(9, this.f12971O);
                this.f12977U = false;
            }
        }

        /* renamed from: r */
        private final void m17889r() {
            C4137i.this.f12969m.removeMessages(12, this.f12971O);
            C4137i.this.f12969m.sendMessageDelayed(C4137i.this.f12969m.obtainMessage(12, this.f12971O), C4137i.this.f12959c);
        }

        /* renamed from: a */
        public final void mo17860a(ConnectionResult connectionResult, C4059a<?> aVar, boolean z) {
            if (Looper.myLooper() == C4137i.this.f12969m.getLooper()) {
                mo17767a(connectionResult);
            } else {
                C4137i.this.f12969m.post(new C4172n1(this, connectionResult));
            }
        }

        @C0226w0
        /* renamed from: b */
        public final void mo17865b(@C0193h0 ConnectionResult connectionResult) {
            C4300a0.m18624a(C4137i.this.f12969m);
            this.f12982b.mo17633a();
            mo17767a(connectionResult);
        }

        @C0226w0
        /* renamed from: e */
        public final void mo17868e() {
            C4300a0.m18624a(C4137i.this.f12969m);
            if (this.f12977U) {
                mo17859a();
            }
        }

        /* renamed from: f */
        public final C4071f mo17869f() {
            return this.f12982b;
        }

        @C0226w0
        /* renamed from: g */
        public final void mo17870g() {
            Status status;
            C4300a0.m18624a(C4137i.this.f12969m);
            if (this.f12977U) {
                m17888q();
                if (C4137i.this.f12961e.mo18113d(C4137i.this.f12960d) == 18) {
                    status = new Status(8, "Connection timed out while waiting for Google Play services update to complete.");
                } else {
                    status = new Status(8, "API failed to connect while resuming due to an unknown error.");
                }
                mo17861a(status);
                this.f12982b.mo17633a();
            }
        }

        @C0226w0
        /* renamed from: h */
        public final void mo17871h() {
            C4300a0.m18624a(C4137i.this.f12969m);
            mo17861a(C4137i.f12953n);
            this.f12972P.mo17974b();
            for (C4168a b3Var : (C4168a[]) this.f12974R.keySet().toArray(new C4168a[this.f12974R.size()])) {
                mo17863a((C4120e2) new C4101b3(b3Var, new C5562l()));
            }
            m17884d(new ConnectionResult(4));
            if (this.f12982b.isConnected()) {
                this.f12982b.mo17635a((C4319e) new C4187q1(this));
            }
        }

        /* renamed from: i */
        public final void mo17777i(@C0195i0 Bundle bundle) {
            if (Looper.myLooper() == C4137i.this.f12969m.getLooper()) {
                m17885n();
            } else {
                C4137i.this.f12969m.post(new C4164m1(this));
            }
        }

        @C0226w0
        /* renamed from: j */
        public final void mo17873j() {
            C4300a0.m18624a(C4137i.this.f12969m);
            this.f12979W = null;
        }

        @C0226w0
        /* renamed from: k */
        public final ConnectionResult mo17874k() {
            C4300a0.m18624a(C4137i.this.f12969m);
            return this.f12979W;
        }

        @C0226w0
        /* renamed from: l */
        public final boolean mo17875l() {
            return m17876a(true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public final C2683d mo17876m() {
            C4148j2 j2Var = this.f12976T;
            if (j2Var == null) {
                return null;
            }
            return j2Var.mo17905G0();
        }

        @C0226w0
        /* renamed from: b */
        private final boolean m17880b(C4120e2 e2Var) {
            if (!(e2Var instanceof C4112d1)) {
                m17882c(e2Var);
                return true;
            }
            C4112d1 d1Var = (C4112d1) e2Var;
            Feature a = m17871a(d1Var.mo17771b(this));
            if (a == null) {
                m17882c(e2Var);
                return true;
            }
            if (d1Var.mo17772c(this)) {
                C4140c cVar = new C4140c(this.f12971O, a, null);
                int indexOf = this.f12978V.indexOf(cVar);
                if (indexOf >= 0) {
                    C4140c cVar2 = (C4140c) this.f12978V.get(indexOf);
                    C4137i.this.f12969m.removeMessages(15, cVar2);
                    C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 15, cVar2), C4137i.this.f12957a);
                } else {
                    this.f12978V.add(cVar);
                    C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 15, cVar), C4137i.this.f12957a);
                    C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 16, cVar), C4137i.this.f12958b);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!m17883c(connectionResult)) {
                        C4137i.this.mo17856b(connectionResult, this.f12975S);
                    }
                }
            } else {
                d1Var.mo17770a((RuntimeException) new UnsupportedApiCallException(a));
            }
            return false;
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17767a(@C0193h0 ConnectionResult connectionResult) {
            C4300a0.m18624a(C4137i.this.f12969m);
            C4148j2 j2Var = this.f12976T;
            if (j2Var != null) {
                j2Var.mo17906H0();
            }
            mo17873j();
            C4137i.this.f12962f.mo18368a();
            m17884d(connectionResult);
            if (connectionResult.mo17576N() == 4) {
                mo17861a(C4137i.f12954o);
            } else if (this.f12981a.isEmpty()) {
                this.f12979W = connectionResult;
            } else {
                if (!m17883c(connectionResult) && !C4137i.this.mo17856b(connectionResult, this.f12975S)) {
                    if (connectionResult.mo17576N() == 18) {
                        this.f12977U = true;
                    }
                    if (this.f12977U) {
                        C4137i.this.f12969m.sendMessageDelayed(Message.obtain(C4137i.this.f12969m, 9, this.f12971O), C4137i.this.f12957a);
                        return;
                    }
                    String a = this.f12971O.mo17780a();
                    String valueOf = String.valueOf(connectionResult);
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 63 + String.valueOf(valueOf).length());
                    sb.append("API: ");
                    sb.append(a);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    mo17861a(new Status(17, sb.toString()));
                }
            }
        }

        /* renamed from: i */
        public final Map<C4168a<?>, C4233z1> mo17872i() {
            return this.f12974R;
        }

        /* renamed from: d */
        public final boolean mo17867d() {
            return this.f12982b.mo17646o();
        }

        @C0226w0
        /* renamed from: c */
        private final void m17882c(C4120e2 e2Var) {
            e2Var.mo17769a(this.f12972P, mo17867d());
            try {
                e2Var.mo17816a(this);
            } catch (DeadObjectException unused) {
                mo17778n(1);
                this.f12982b.mo17633a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo17866c() {
            return this.f12982b.isConnected();
        }

        /* renamed from: n */
        public final void mo17778n(int i) {
            if (Looper.myLooper() == C4137i.this.f12969m.getLooper()) {
                m17886o();
            } else {
                C4137i.this.f12969m.post(new C4177o1(this));
            }
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17863a(C4120e2 e2Var) {
            C4300a0.m18624a(C4137i.this.f12969m);
            if (!this.f12982b.isConnected()) {
                this.f12981a.add(e2Var);
                ConnectionResult connectionResult = this.f12979W;
                if (connectionResult == null || !connectionResult.mo17579Q()) {
                    mo17859a();
                } else {
                    mo17767a(this.f12979W);
                }
            } else if (m17880b(e2Var)) {
                m17889r();
            } else {
                this.f12981a.add(e2Var);
            }
        }

        /* renamed from: b */
        public final int mo17864b() {
            return this.f12975S;
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: b */
        public final void m17879b(C4140c cVar) {
            if (this.f12978V.remove(cVar)) {
                C4137i.this.f12969m.removeMessages(15, cVar);
                C4137i.this.f12969m.removeMessages(16, cVar);
                Feature b = cVar.f12990b;
                ArrayList arrayList = new ArrayList(this.f12981a.size());
                for (C4120e2 e2Var : this.f12981a) {
                    if (e2Var instanceof C4112d1) {
                        Feature[] b2 = ((C4112d1) e2Var).mo17771b(this);
                        if (b2 != null && C4471b.m19312b(b2, b)) {
                            arrayList.add(e2Var);
                        }
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C4120e2 e2Var2 = (C4120e2) obj;
                    this.f12981a.remove(e2Var2);
                    e2Var2.mo17770a((RuntimeException) new UnsupportedApiCallException(b));
                }
            }
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17861a(Status status) {
            C4300a0.m18624a(C4137i.this.f12969m);
            for (C4120e2 a : this.f12981a) {
                a.mo17768a(status);
            }
            this.f12981a.clear();
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: a */
        public final boolean m17876a(boolean z) {
            C4300a0.m18624a(C4137i.this.f12969m);
            if (!this.f12982b.isConnected() || this.f12974R.size() != 0) {
                return false;
            }
            if (this.f12972P.mo17973a()) {
                if (z) {
                    m17889r();
                }
                return false;
            }
            this.f12982b.mo17633a();
            return true;
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17859a() {
            C4300a0.m18624a(C4137i.this.f12969m);
            if (!this.f12982b.isConnected() && !this.f12982b.mo17638d()) {
                int a = C4137i.this.f12962f.mo18367a(C4137i.this.f12960d, this.f12982b);
                if (a != 0) {
                    mo17767a(new ConnectionResult(a, null));
                    return;
                }
                C4139b bVar = new C4139b(this.f12982b, this.f12971O);
                if (this.f12982b.mo17646o()) {
                    this.f12976T.mo17907a((C4155k2) bVar);
                }
                this.f12982b.mo17634a((C4317c) bVar);
            }
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17862a(C4114d3 d3Var) {
            C4300a0.m18624a(C4137i.this.f12969m);
            this.f12973Q.add(d3Var);
        }

        @C0226w0
        @C0195i0
        /* renamed from: a */
        private final Feature m17871a(@C0195i0 Feature[] featureArr) {
            if (!(featureArr == null || featureArr.length == 0)) {
                Feature[] m = this.f12982b.mo17645m();
                if (m == null) {
                    m = new Feature[0];
                }
                C0635a aVar = new C0635a(m.length);
                for (Feature feature : m) {
                    aVar.put(feature.mo17586N(), Long.valueOf(feature.mo17587O()));
                }
                for (Feature feature2 : featureArr) {
                    if (!aVar.containsKey(feature2.mo17586N()) || ((Long) aVar.get(feature2.mo17586N())).longValue() < feature2.mo17587O()) {
                        return feature2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: a */
        public final void m17874a(C4140c cVar) {
            if (this.f12978V.contains(cVar) && !this.f12977U) {
                if (!this.f12982b.isConnected()) {
                    mo17859a();
                    return;
                }
                m17887p();
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.i$b */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private class C4139b implements C4155k2, C4317c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4071f f12983a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C4102c<?> f12984b;

        /* renamed from: c */
        private C4375p f12985c = null;

        /* renamed from: d */
        private Set<Scope> f12986d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f12987e = false;

        public C4139b(C4071f fVar, C4102c<?> cVar) {
            this.f12983a = fVar;
            this.f12984b = cVar;
        }

        /* renamed from: a */
        public final void mo17877a(@C0193h0 ConnectionResult connectionResult) {
            C4137i.this.f12969m.post(new C4197s1(this, connectionResult));
        }

        @C0226w0
        /* renamed from: b */
        public final void mo17879b(ConnectionResult connectionResult) {
            ((C4138a) C4137i.this.f12965i.get(this.f12984b)).mo17865b(connectionResult);
        }

        @C0226w0
        /* renamed from: a */
        public final void mo17878a(C4375p pVar, Set<Scope> set) {
            if (pVar == null || set == null) {
                new Exception();
                mo17879b(new ConnectionResult(4));
                return;
            }
            this.f12985c = pVar;
            this.f12986d = set;
            m17912a();
        }

        /* access modifiers changed from: private */
        @C0226w0
        /* renamed from: a */
        public final void m17912a() {
            if (this.f12987e) {
                C4375p pVar = this.f12985c;
                if (pVar != null) {
                    this.f12983a.mo17636a(pVar, this.f12986d);
                }
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.i$c */
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    private static class C4140c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C4102c<?> f12989a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final Feature f12990b;

        private C4140c(C4102c<?> cVar, Feature feature) {
            this.f12989a = cVar;
            this.f12990b = feature;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof C4140c)) {
                C4140c cVar = (C4140c) obj;
                if (C4413y.m19053a(this.f12989a, cVar.f12989a) && C4413y.m19053a(this.f12990b, cVar.f12990b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return C4413y.m19051a(this.f12989a, this.f12990b);
        }

        public final String toString() {
            return C4413y.m19052a((Object) this).mo18403a("key", this.f12989a).mo18403a("feature", this.f12990b).toString();
        }

        /* synthetic */ C4140c(C4102c cVar, Feature feature, C4159l1 l1Var) {
            this(cVar, feature);
        }
    }

    @C4056a
    private C4137i(Context context, Looper looper, C4279e eVar) {
        this.f12960d = context;
        this.f12969m = new C2612r(looper, this);
        this.f12961e = eVar;
        this.f12962f = new C4369n(eVar);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: a */
    public static C4137i m17841a(Context context) {
        C4137i iVar;
        synchronized (f12955p) {
            if (f12956q == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f12956q = new C4137i(context.getApplicationContext(), handlerThread.getLooper(), C4279e.m18476a());
            }
            iVar = f12956q;
        }
        return iVar;
    }

    @C0226w0
    /* renamed from: c */
    private final void m17844c(C4083h<?> hVar) {
        C4102c b = hVar.mo17676b();
        C4138a aVar = (C4138a) this.f12965i.get(b);
        if (aVar == null) {
            aVar = new C4138a(hVar);
            this.f12965i.put(b, aVar);
        }
        if (aVar.mo17867d()) {
            this.f12968l.add(b);
        }
        aVar.mo17859a();
    }

    @C4056a
    /* renamed from: d */
    public static void m17846d() {
        synchronized (f12955p) {
            if (f12956q != null) {
                C4137i iVar = f12956q;
                iVar.f12964h.incrementAndGet();
                iVar.f12969m.sendMessageAtFrontOfQueue(iVar.f12969m.obtainMessage(10));
            }
        }
    }

    /* renamed from: e */
    public static C4137i m17847e() {
        C4137i iVar;
        synchronized (f12955p) {
            C4300a0.m18621a(f12956q, (Object) "Must guarantee manager is non-null before using getInstance");
            iVar = f12956q;
        }
        return iVar;
    }

    /* renamed from: b */
    public final int mo17853b() {
        return this.f12963g.getAndIncrement();
    }

    @C0226w0
    public boolean handleMessage(Message message) {
        C4138a aVar;
        int i = message.what;
        long j = C2876e.f10138o;
        switch (i) {
            case 1:
                if (((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f12959c = j;
                this.f12969m.removeMessages(12);
                for (C4102c cVar : this.f12965i.keySet()) {
                    Handler handler = this.f12969m;
                    handler.sendMessageDelayed(handler.obtainMessage(12, cVar), this.f12959c);
                }
                break;
            case 2:
                C4114d3 d3Var = (C4114d3) message.obj;
                Iterator it = d3Var.mo17808b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C4102c cVar2 = (C4102c) it.next();
                        C4138a aVar2 = (C4138a) this.f12965i.get(cVar2);
                        if (aVar2 == null) {
                            d3Var.mo17807a(cVar2, new ConnectionResult(13), null);
                            break;
                        } else if (aVar2.mo17866c()) {
                            d3Var.mo17807a(cVar2, ConnectionResult.f12763l0, aVar2.mo17869f().mo17641h());
                        } else if (aVar2.mo17874k() != null) {
                            d3Var.mo17807a(cVar2, aVar2.mo17874k(), null);
                        } else {
                            aVar2.mo17862a(d3Var);
                            aVar2.mo17859a();
                        }
                    }
                }
            case 3:
                for (C4138a aVar3 : this.f12965i.values()) {
                    aVar3.mo17873j();
                    aVar3.mo17859a();
                }
                break;
            case 4:
            case 8:
            case 13:
                C4228y1 y1Var = (C4228y1) message.obj;
                C4138a aVar4 = (C4138a) this.f12965i.get(y1Var.f13187c.mo17676b());
                if (aVar4 == null) {
                    m17844c(y1Var.f13187c);
                    aVar4 = (C4138a) this.f12965i.get(y1Var.f13187c.mo17676b());
                }
                if (aVar4.mo17867d() && this.f12964h.get() != y1Var.f13186b) {
                    y1Var.f13185a.mo17768a(f12953n);
                    aVar4.mo17871h();
                    break;
                } else {
                    aVar4.mo17863a(y1Var.f13185a);
                    break;
                }
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator it2 = this.f12965i.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        aVar = (C4138a) it2.next();
                        if (aVar.mo17864b() == i2) {
                        }
                    } else {
                        aVar = null;
                    }
                }
                if (aVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i2);
                    sb.append(" while trying to fail enqueued calls.");
                    sb.toString();
                    new Exception();
                    break;
                } else {
                    String b = this.f12961e.mo18106b(connectionResult.mo17576N());
                    String O = connectionResult.mo17577O();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b).length() + 69 + String.valueOf(O).length());
                    sb2.append("Error resolution was canceled by the user, original error message: ");
                    sb2.append(b);
                    sb2.append(": ");
                    sb2.append(O);
                    aVar.mo17861a(new Status(17, sb2.toString()));
                    break;
                }
            case 6:
                if (C4503v.m19409c() && (this.f12960d.getApplicationContext() instanceof Application)) {
                    C4109d.m17754a((Application) this.f12960d.getApplicationContext());
                    C4109d.m17755b().mo17790a((C4110a) new C4159l1(this));
                    if (!C4109d.m17755b().mo17792a(true)) {
                        this.f12959c = C2876e.f10138o;
                        break;
                    }
                }
                break;
            case 7:
                m17844c((C4083h) message.obj);
                break;
            case 9:
                if (this.f12965i.containsKey(message.obj)) {
                    ((C4138a) this.f12965i.get(message.obj)).mo17868e();
                    break;
                }
                break;
            case 10:
                for (C4102c remove : this.f12968l) {
                    ((C4138a) this.f12965i.remove(remove)).mo17871h();
                }
                this.f12968l.clear();
                break;
            case 11:
                if (this.f12965i.containsKey(message.obj)) {
                    ((C4138a) this.f12965i.get(message.obj)).mo17870g();
                    break;
                }
                break;
            case 12:
                if (this.f12965i.containsKey(message.obj)) {
                    ((C4138a) this.f12965i.get(message.obj)).mo17875l();
                    break;
                }
                break;
            case 14:
                C4133h0 h0Var = (C4133h0) message.obj;
                C4102c a = h0Var.mo17838a();
                if (this.f12965i.containsKey(a)) {
                    h0Var.mo17839b().mo22019a(Boolean.valueOf(((C4138a) this.f12965i.get(a)).m17876a(false)));
                    break;
                } else {
                    h0Var.mo17839b().mo22019a(Boolean.valueOf(false));
                    break;
                }
            case 15:
                C4140c cVar3 = (C4140c) message.obj;
                if (this.f12965i.containsKey(cVar3.f12989a)) {
                    ((C4138a) this.f12965i.get(cVar3.f12989a)).m17874a(cVar3);
                    break;
                }
                break;
            case 16:
                C4140c cVar4 = (C4140c) message.obj;
                if (this.f12965i.containsKey(cVar4.f12989a)) {
                    ((C4138a) this.f12965i.get(cVar4.f12989a)).m17879b(cVar4);
                    break;
                }
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                sb3.toString();
                return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo17855b(@C0193h0 C4128g0 g0Var) {
        synchronized (f12955p) {
            if (this.f12966j == g0Var) {
                this.f12966j = null;
                this.f12967k.clear();
            }
        }
    }

    /* renamed from: b */
    public final C5560k<Boolean> mo17854b(C4083h<?> hVar) {
        C4133h0 h0Var = new C4133h0(hVar.mo17676b());
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(14, h0Var));
        return h0Var.mo17839b().mo22017a();
    }

    /* renamed from: c */
    public final void mo17857c() {
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: a */
    public final void mo17849a(C4083h<?> hVar) {
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(7, hVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo17856b(ConnectionResult connectionResult, int i) {
        return this.f12961e.mo18105a(this.f12960d, connectionResult, i);
    }

    /* renamed from: a */
    public final void mo17852a(@C0193h0 C4128g0 g0Var) {
        synchronized (f12955p) {
            if (this.f12966j != g0Var) {
                this.f12966j = g0Var;
                this.f12967k.clear();
            }
            this.f12967k.addAll(g0Var.mo17834h());
        }
    }

    /* renamed from: a */
    public final C5560k<Map<C4102c<?>, String>> mo17846a(Iterable<? extends C4235j<?>> iterable) {
        C4114d3 d3Var = new C4114d3(iterable);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(2, d3Var));
        return d3Var.mo17806a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17847a() {
        this.f12964h.incrementAndGet();
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(10));
    }

    /* renamed from: a */
    public final <O extends C4063d> void mo17850a(C4083h<O> hVar, int i, C4116a<? extends C4246q, C4061b> aVar) {
        C4224x2 x2Var = new C4224x2(i, aVar);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(4, new C4228y1(x2Var, this.f12964h.get(), hVar)));
    }

    /* renamed from: a */
    public final <O extends C4063d, ResultT> void mo17851a(C4083h<O> hVar, int i, C4230z<C4061b, ResultT> zVar, C5562l<ResultT> lVar, C4221x xVar) {
        C4234z2 z2Var = new C4234z2(i, zVar, lVar, xVar);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(4, new C4228y1(z2Var, this.f12964h.get(), hVar)));
    }

    /* renamed from: a */
    public final <O extends C4063d> C5560k<Void> mo17845a(@C0193h0 C4083h<O> hVar, @C0193h0 C4195s<C4061b, ?> sVar, @C0193h0 C4098b0<C4061b, ?> b0Var) {
        C5562l lVar = new C5562l();
        C4096a3 a3Var = new C4096a3(new C4233z1(sVar, b0Var), lVar);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(8, new C4228y1(a3Var, this.f12964h.get(), hVar)));
        return lVar.mo22017a();
    }

    /* renamed from: a */
    public final <O extends C4063d> C5560k<Boolean> mo17844a(@C0193h0 C4083h<O> hVar, @C0193h0 C4168a<?> aVar) {
        C5562l lVar = new C5562l();
        C4101b3 b3Var = new C4101b3(aVar, lVar);
        Handler handler = this.f12969m;
        handler.sendMessage(handler.obtainMessage(13, new C4228y1(b3Var, this.f12964h.get(), hVar)));
        return lVar.mo22017a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PendingIntent mo17843a(C4102c<?> cVar, int i) {
        C4138a aVar = (C4138a) this.f12965i.get(cVar);
        if (aVar == null) {
            return null;
        }
        C2683d m = aVar.mo17876m();
        if (m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f12960d, i, m.mo17534n(), MQEncoder.CARRY_MASK);
    }

    /* renamed from: a */
    public final void mo17848a(ConnectionResult connectionResult, int i) {
        if (!mo17856b(connectionResult, i)) {
            Handler handler = this.f12969m;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }
}
