package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.fragment.app.C1376c;
import com.google.android.gms.common.C4279e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4086i.C4087a;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.C4247r;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.GmsClientEventManager.GmsClientEventState;
import com.google.android.gms.common.internal.p167k0.C4347a;
import com.google.android.gms.common.util.C4476d0;
import com.google.android.gms.common.util.C4477e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4232z0 extends C4086i implements C4218w1 {

    /* renamed from: A */
    Set<C4183p2> f13194A;

    /* renamed from: B */
    final C4209u2 f13195B;

    /* renamed from: C */
    private final GmsClientEventState f13196C;

    /* renamed from: e */
    private final Lock f13197e;

    /* renamed from: f */
    private boolean f13198f;

    /* renamed from: g */
    private final GmsClientEventManager f13199g;

    /* renamed from: h */
    private C4213v1 f13200h = null;

    /* renamed from: i */
    private final int f13201i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Context f13202j;

    /* renamed from: k */
    private final Looper f13203k;
    @C4476d0

    /* renamed from: l */
    final Queue<C4116a<?, ?>> f13204l = new LinkedList();

    /* renamed from: m */
    private volatile boolean f13205m;

    /* renamed from: n */
    private long f13206n;

    /* renamed from: o */
    private long f13207o;

    /* renamed from: p */
    private final C4105c1 f13208p;

    /* renamed from: q */
    private final C4279e f13209q;
    @C4476d0

    /* renamed from: r */
    private C4208u1 f13210r;

    /* renamed from: s */
    final Map<C4062c<?>, C4071f> f13211s;

    /* renamed from: t */
    Set<Scope> f13212t;

    /* renamed from: u */
    private final C4329f f13213u;

    /* renamed from: v */
    private final Map<C4059a<?>, Boolean> f13214v;

    /* renamed from: w */
    private final C4060a<? extends C2683d, C2679a> f13215w;

    /* renamed from: x */
    private final C4175o f13216x;

    /* renamed from: y */
    private final ArrayList<C4149j3> f13217y;

    /* renamed from: z */
    private Integer f13218z;

    public C4232z0(Context context, Lock lock, Looper looper, C4329f fVar, C4279e eVar, C4060a<? extends C2683d, C2679a> aVar, Map<C4059a<?>, Boolean> map, List<C4088b> list, List<C4089c> list2, Map<C4062c<?>, C4071f> map2, int i, int i2, ArrayList<C4149j3> arrayList, boolean z) {
        Looper looper2 = looper;
        this.f13206n = C4477e.m19325a() ? 10000 : 120000;
        this.f13207o = 5000;
        this.f13212t = new HashSet();
        this.f13216x = new C4175o();
        this.f13218z = null;
        this.f13194A = null;
        this.f13196C = new C4227y0(this);
        this.f13202j = context;
        this.f13197e = lock;
        this.f13198f = false;
        this.f13199g = new GmsClientEventManager(looper, this.f13196C);
        this.f13203k = looper2;
        this.f13208p = new C4105c1(this, looper);
        this.f13209q = eVar;
        this.f13201i = i;
        if (this.f13201i >= 0) {
            this.f13218z = Integer.valueOf(i2);
        }
        this.f13214v = map;
        this.f13211s = map2;
        this.f13217y = arrayList;
        this.f13195B = new C4209u2(this.f13211s);
        for (C4088b b : list) {
            this.f13199g.mo18194b(b);
        }
        for (C4089c b2 : list2) {
            this.f13199g.mo18195b(b2);
        }
        this.f13213u = fVar;
        this.f13215w = aVar;
    }

    /* renamed from: c */
    private static String m18305c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m18306p() {
        this.f13197e.lock();
        try {
            if (this.f13205m) {
                m18307q();
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    @C5966a("mLock")
    /* renamed from: q */
    private final void m18307q() {
        this.f13199g.mo18196c();
        this.f13200h.mo17894b();
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final void m18308r() {
        this.f13197e.lock();
        try {
            if (mo18004m()) {
                m18307q();
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: a */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17696a(@C0193h0 T t) {
        C4300a0.m18628a(t.mo17814i() != null, (Object) "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f13211s.containsKey(t.mo17814i());
        String b = t.mo17813h() != null ? t.mo17813h().mo17626b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C4300a0.m18628a(containsKey, (Object) sb.toString());
        this.f13197e.lock();
        try {
            if (this.f13200h == null) {
                this.f13204l.add(t);
                return t;
            }
            T b2 = this.f13200h.mo17893b(t);
            this.f13197e.unlock();
            return b2;
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: b */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17705b(@C0193h0 T t) {
        C4300a0.m18628a(t.mo17814i() != null, (Object) "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f13211s.containsKey(t.mo17814i());
        String b = t.mo17813h() != null ? t.mo17813h().mo17626b() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(b);
        sb.append(" required for this call.");
        C4300a0.m18628a(containsKey, (Object) sb.toString());
        this.f13197e.lock();
        try {
            if (this.f13200h == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.f13205m) {
                this.f13204l.add(t);
                while (!this.f13204l.isEmpty()) {
                    C4116a aVar = (C4116a) this.f13204l.remove();
                    this.f13195B.mo17980a(aVar);
                    aVar.mo17809a(Status.f12782R);
                }
                return t;
            } else {
                T a = this.f13200h.mo17886a(t);
                this.f13197e.unlock();
                return a;
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: c */
    public final boolean mo17714c(@C0193h0 C4059a<?> aVar) {
        if (!mo17718g()) {
            return false;
        }
        C4071f fVar = (C4071f) this.f13211s.get(aVar.mo17625a());
        if (fVar == null || !fVar.isConnected()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo17715d() {
        this.f13197e.lock();
        try {
            this.f13195B.mo17979a();
            if (this.f13200h != null) {
                this.f13200h.mo17887a();
            }
            this.f13216x.mo17941a();
            for (C4116a aVar : this.f13204l) {
                aVar.mo17742a((C4214v2) null);
                aVar.mo17653b();
            }
            this.f13204l.clear();
            if (this.f13200h != null) {
                mo18004m();
                this.f13199g.mo18193b();
                this.f13197e.unlock();
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: e */
    public final Context mo17716e() {
        return this.f13202j;
    }

    /* renamed from: f */
    public final Looper mo17717f() {
        return this.f13203k;
    }

    /* renamed from: g */
    public final boolean mo17718g() {
        C4213v1 v1Var = this.f13200h;
        return v1Var != null && v1Var.isConnected();
    }

    /* renamed from: h */
    public final boolean mo17719h() {
        C4213v1 v1Var = this.f13200h;
        return v1Var != null && v1Var.mo17896d();
    }

    /* renamed from: i */
    public final void mo17720i() {
        C4213v1 v1Var = this.f13200h;
        if (v1Var != null) {
            v1Var.mo17895c();
        }
    }

    /* renamed from: j */
    public final void mo17721j() {
        mo17715d();
        mo17711c();
    }

    /* access modifiers changed from: 0000 */
    @C5966a("mLock")
    /* renamed from: m */
    public final boolean mo18004m() {
        if (!this.f13205m) {
            return false;
        }
        this.f13205m = false;
        this.f13208p.removeMessages(2);
        this.f13208p.removeMessages(1);
        C4208u1 u1Var = this.f13210r;
        if (u1Var != null) {
            u1Var.mo17976a();
            this.f13210r = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final boolean mo18005n() {
        this.f13197e.lock();
        try {
            if (this.f13194A == null) {
                this.f13197e.unlock();
                return false;
            }
            boolean z = !this.f13194A.isEmpty();
            this.f13197e.unlock();
            return z;
        } catch (Throwable th) {
            this.f13197e.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final String mo18006o() {
        StringWriter stringWriter = new StringWriter();
        mo17701a("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        return stringWriter.toString();
    }

    /* renamed from: c */
    public final void mo17711c() {
        this.f13197e.lock();
        try {
            boolean z = false;
            if (this.f13201i >= 0) {
                if (this.f13218z != null) {
                    z = true;
                }
                C4300a0.m18632b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f13218z == null) {
                this.f13218z = Integer.valueOf(m18298a((Iterable<C4071f>) this.f13211s.values(), false));
            } else if (this.f13218z.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo17698a(this.f13218z.intValue());
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: a */
    public final <L> C4167n<L> mo17697a(@C0193h0 L l) {
        this.f13197e.lock();
        try {
            return this.f13216x.mo17940a(l, this.f13203k, "NO_TYPE");
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: c */
    public final void mo17712c(@C0193h0 C4088b bVar) {
        this.f13199g.mo18197c(bVar);
    }

    /* renamed from: c */
    public final void mo17713c(@C0193h0 C4089c cVar) {
        this.f13199g.mo18198c(cVar);
    }

    @C0193h0
    /* renamed from: a */
    public final <C extends C4071f> C mo17695a(@C0193h0 C4062c<C> cVar) {
        C c = (C4071f) this.f13211s.get(cVar);
        C4300a0.m18621a(c, (Object) "Appropriate Api was not requested.");
        return c;
    }

    /* renamed from: b */
    public final boolean mo17710b(@C0193h0 C4059a<?> aVar) {
        return this.f13211s.containsKey(aVar.mo17625a());
    }

    @C0193h0
    /* renamed from: a */
    public final ConnectionResult mo17694a(@C0193h0 C4059a<?> aVar) {
        this.f13197e.lock();
        try {
            if (!mo17718g()) {
                if (!this.f13205m) {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }
            if (this.f13211s.containsKey(aVar.mo17625a())) {
                ConnectionResult a = this.f13200h.mo17885a(aVar);
                if (a != null) {
                    this.f13197e.unlock();
                    return a;
                } else if (this.f13205m) {
                    return ConnectionResult.f12763l0;
                } else {
                    mo18006o();
                    String.valueOf(aVar.mo17626b()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map");
                    new Exception();
                    ConnectionResult connectionResult = new ConnectionResult(8, null);
                    this.f13197e.unlock();
                    return connectionResult;
                }
            } else {
                throw new IllegalArgumentException(String.valueOf(aVar.mo17626b()).concat(" was never registered with GoogleApiClient"));
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: b */
    public final C4237l<Status> mo17706b() {
        C4300a0.m18632b(mo17718g(), "GoogleApiClient is not connected yet.");
        C4300a0.m18632b(this.f13218z.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C4226y yVar = new C4226y((C4086i) this);
        if (this.f13211s.containsKey(C4347a.f13497a)) {
            m18299a(this, yVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C4086i a = new C4087a(this.f13202j).mo17728a(C4347a.f13499c).mo17732a((C4088b) new C4099b1(this, atomicReference, yVar)).mo17733a((C4089c) new C4094a1(this, yVar)).mo17723a((Handler) this.f13208p).mo17736a();
            atomicReference.set(a);
            a.mo17711c();
        }
        return yVar;
    }

    /* renamed from: a */
    public final void mo17698a(int i) {
        this.f13197e.lock();
        boolean z = true;
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            C4300a0.m18628a(z, (Object) sb.toString());
            m18302b(i);
            m18307q();
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: b */
    private final void m18302b(int i) {
        Integer num = this.f13218z;
        if (num == null) {
            this.f13218z = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String c = m18305c(i);
            String c2 = m18305c(this.f13218z.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 51 + String.valueOf(c2).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c);
            sb.append(". Mode was already set to ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f13200h == null) {
            boolean z = false;
            boolean z2 = false;
            for (C4071f fVar : this.f13211s.values()) {
                if (fVar.mo17646o()) {
                    z = true;
                }
                if (fVar.mo17533f()) {
                    z2 = true;
                }
            }
            int intValue = this.f13218z.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z) {
                        if (this.f13198f) {
                            C4184p3 p3Var = new C4184p3(this.f13202j, this.f13197e, this.f13203k, this.f13209q, this.f13211s, this.f13213u, this.f13214v, this.f13215w, this.f13217y, this, true);
                            this.f13200h = p3Var;
                            return;
                        }
                        this.f13200h = C4156k3.m18003a(this.f13202j, this, this.f13197e, this.f13203k, this.f13209q, this.f13211s, this.f13213u, this.f13214v, this.f13215w, this.f13217y);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            if (!this.f13198f || z2) {
                C4142i1 i1Var = new C4142i1(this.f13202j, this, this.f13197e, this.f13203k, this.f13209q, this.f13211s, this.f13213u, this.f13214v, this.f13215w, this.f13217y, this);
                this.f13200h = i1Var;
                return;
            }
            C4184p3 p3Var2 = new C4184p3(this.f13202j, this.f13197e, this.f13203k, this.f13209q, this.f13211s, this.f13213u, this.f13214v, this.f13215w, this.f13217y, this, false);
            this.f13200h = p3Var2;
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo17692a() {
        boolean z = true;
        C4300a0.m18632b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f13197e.lock();
        try {
            if (this.f13201i >= 0) {
                if (this.f13218z == null) {
                    z = false;
                }
                C4300a0.m18632b(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f13218z == null) {
                this.f13218z = Integer.valueOf(m18298a((Iterable<C4071f>) this.f13211s.values(), false));
            } else if (this.f13218z.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m18302b(this.f13218z.intValue());
            this.f13199g.mo18196c();
            return this.f13200h.mo17898f();
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: a */
    public final ConnectionResult mo17693a(long j, @C0193h0 TimeUnit timeUnit) {
        C4300a0.m18632b(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        C4300a0.m18621a(timeUnit, (Object) "TimeUnit must not be null");
        this.f13197e.lock();
        try {
            if (this.f13218z == null) {
                this.f13218z = Integer.valueOf(m18298a((Iterable<C4071f>) this.f13211s.values(), false));
            } else if (this.f13218z.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m18302b(this.f13218z.intValue());
            this.f13199g.mo18196c();
            return this.f13200h.mo17884a(j, timeUnit);
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: b */
    public final void mo17707b(@C0193h0 C4088b bVar) {
        this.f13199g.mo18194b(bVar);
    }

    /* renamed from: b */
    public final void mo17708b(@C0193h0 C4089c cVar) {
        this.f13199g.mo18195b(cVar);
    }

    /* renamed from: b */
    public final void mo17709b(C4183p2 p2Var) {
        this.f13197e.lock();
        try {
            if (this.f13194A == null) {
                new Exception();
            } else if (!this.f13194A.remove(p2Var)) {
                new Exception();
            } else if (!mo18005n()) {
                this.f13200h.mo17897e();
            }
        } finally {
            this.f13197e.unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18299a(C4086i iVar, C4226y yVar, boolean z) {
        C4347a.f13500d.mo18331a(iVar).mo17745a((C4247r<? super R>) new C4119e1<Object>(this, yVar, z, iVar));
    }

    /* renamed from: a */
    public final void mo17699a(@C0193h0 C1376c cVar) {
        C4157l lVar = new C4157l((Activity) cVar);
        if (this.f13201i >= 0) {
            C4107c3.m17745b(lVar).mo17786a(this.f13201i);
            return;
        }
        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    /* renamed from: a */
    public final boolean mo17702a(@C0193h0 C4088b bVar) {
        return this.f13199g.mo18191a(bVar);
    }

    /* renamed from: a */
    public final boolean mo17703a(@C0193h0 C4089c cVar) {
        return this.f13199g.mo18192a(cVar);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17928a(Bundle bundle) {
        while (!this.f13204l.isEmpty()) {
            mo17705b((T) (C4116a) this.f13204l.remove());
        }
        this.f13199g.mo18188a(bundle);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17929a(ConnectionResult connectionResult) {
        if (!this.f13209q.mo18124b(this.f13202j, connectionResult.mo17576N())) {
            mo18004m();
        }
        if (!this.f13205m) {
            this.f13199g.mo18189a(connectionResult);
            this.f13199g.mo18193b();
        }
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17927a(int i, boolean z) {
        if (i == 1 && !z && !this.f13205m) {
            this.f13205m = true;
            if (this.f13210r == null && !C4477e.m19325a()) {
                try {
                    this.f13210r = this.f13209q.mo18100a(this.f13202j.getApplicationContext(), (C4203t1) new C4129g1(this));
                } catch (SecurityException unused) {
                }
            }
            C4105c1 c1Var = this.f13208p;
            c1Var.sendMessageDelayed(c1Var.obtainMessage(1), this.f13206n);
            C4105c1 c1Var2 = this.f13208p;
            c1Var2.sendMessageDelayed(c1Var2.obtainMessage(2), this.f13207o);
        }
        this.f13195B.mo17981b();
        this.f13199g.mo18187a(i);
        this.f13199g.mo18193b();
        if (i == 2) {
            m18307q();
        }
    }

    /* renamed from: a */
    public final boolean mo17704a(C4211v vVar) {
        C4213v1 v1Var = this.f13200h;
        return v1Var != null && v1Var.mo17892a(vVar);
    }

    /* renamed from: a */
    public final void mo17700a(C4183p2 p2Var) {
        this.f13197e.lock();
        try {
            if (this.f13194A == null) {
                this.f13194A = new HashSet();
            }
            this.f13194A.add(p2Var);
        } finally {
            this.f13197e.unlock();
        }
    }

    /* renamed from: a */
    public final void mo17701a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f13202j);
        printWriter.append(str).append("mResuming=").print(this.f13205m);
        printWriter.append(" mWorkQueue.size()=").print(this.f13204l.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f13195B.f13157a.size());
        C4213v1 v1Var = this.f13200h;
        if (v1Var != null) {
            v1Var.mo17891a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public static int m18298a(Iterable<C4071f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (C4071f fVar : iterable) {
            if (fVar.mo17646o()) {
                z2 = true;
            }
            if (fVar.mo17533f()) {
                z3 = true;
            }
        }
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }
}
