package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.collection.C0635a;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4235j;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4329f.C4331b;
import com.google.android.gms.common.util.p173f0.C4480a;
import com.google.android.gms.tasks.C5547e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.p3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4184p3 implements C4213v1 {

    /* renamed from: N */
    private final Map<C4059a<?>, Boolean> f13102N;

    /* renamed from: O */
    private final C4137i f13103O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C4232z0 f13104P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final Lock f13105Q;

    /* renamed from: R */
    private final Looper f13106R;

    /* renamed from: S */
    private final C4282f f13107S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final Condition f13108T;

    /* renamed from: U */
    private final C4329f f13109U;

    /* renamed from: V */
    private final boolean f13110V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final boolean f13111W;

    /* renamed from: X */
    private final Queue<C4116a<?, ?>> f13112X = new LinkedList();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: Y */
    public boolean f13113Y;
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: Z */
    public Map<C4102c<?>, ConnectionResult> f13114Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<C4062c<?>, C4189q3<?>> f13115a = new HashMap();
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: a0 */
    public Map<C4102c<?>, ConnectionResult> f13116a0;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Map<C4062c<?>, C4189q3<?>> f13117b = new HashMap();
    @C5966a("mLock")

    /* renamed from: b0 */
    private C4111d0 f13118b0;
    /* access modifiers changed from: private */
    @C5966a("mLock")

    /* renamed from: c0 */
    public ConnectionResult f13119c0;

    public C4184p3(Context context, Lock lock, Looper looper, C4282f fVar, Map<C4062c<?>, C4071f> map, C4329f fVar2, Map<C4059a<?>, Boolean> map2, C4060a<? extends C2683d, C2679a> aVar, ArrayList<C4149j3> arrayList, C4232z0 z0Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        this.f13105Q = lock;
        this.f13106R = looper;
        this.f13108T = lock.newCondition();
        this.f13107S = fVar;
        this.f13104P = z0Var;
        this.f13102N = map2;
        this.f13109U = fVar2;
        this.f13110V = z;
        HashMap hashMap = new HashMap();
        for (C4059a aVar2 : map2.keySet()) {
            hashMap.put(aVar2.mo17625a(), aVar2);
        }
        HashMap hashMap2 = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C4149j3 j3Var = (C4149j3) obj;
            hashMap2.put(j3Var.f13026a, j3Var);
        }
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        for (Entry entry : map.entrySet()) {
            C4059a aVar3 = (C4059a) hashMap.get(entry.getKey());
            C4071f fVar3 = (C4071f) entry.getValue();
            if (fVar3.mo17644k()) {
                z3 = z7;
                z4 = !((Boolean) this.f13102N.get(aVar3)).booleanValue() ? true : z8;
                z2 = true;
            } else {
                z2 = z6;
                z4 = z8;
                z3 = false;
            }
            C4189q3 q3Var = r1;
            C4189q3 q3Var2 = new C4189q3(context, aVar3, looper, fVar3, (C4149j3) hashMap2.get(aVar3), fVar2, aVar);
            this.f13115a.put((C4062c) entry.getKey(), q3Var);
            if (fVar3.mo17646o()) {
                this.f13117b.put((C4062c) entry.getKey(), q3Var);
            }
            z8 = z4;
            z7 = z3;
            z6 = z2;
        }
        if (!z6 || z7 || z8) {
            z5 = false;
        }
        this.f13111W = z5;
        this.f13103O = C4137i.m17847e();
    }

    /* renamed from: c */
    private final <T extends C4116a<? extends C4246q, ? extends C4061b>> boolean m18137c(@C0193h0 T t) {
        C4062c i = t.mo17814i();
        ConnectionResult a = m18127a(i);
        if (a == null || a.mo17576N() != 4) {
            return false;
        }
        t.mo17809a(new Status(4, null, this.f13103O.mo17843a(((C4189q3) this.f13115a.get(i)).mo17676b(), System.identityHashCode(this.f13104P))));
        return true;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: g */
    public final void m18142g() {
        C4329f fVar = this.f13109U;
        if (fVar == null) {
            this.f13104P.f13212t = Collections.emptySet();
            return;
        }
        HashSet hashSet = new HashSet(fVar.mo18303j());
        Map g = this.f13109U.mo18300g();
        for (C4059a aVar : g.keySet()) {
            ConnectionResult a = mo17885a(aVar);
            if (a != null && a.mo17580R()) {
                hashSet.addAll(((C4331b) g.get(aVar)).f13474a);
            }
        }
        this.f13104P.f13212t = hashSet;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: h */
    public final void m18144h() {
        while (!this.f13112X.isEmpty()) {
            mo17886a((T) (C4116a) this.f13112X.remove());
        }
        this.f13104P.mo17928a((Bundle) null);
    }

    /* access modifiers changed from: private */
    @C0195i0
    @C5966a("mLock")
    /* renamed from: i */
    public final ConnectionResult m18145i() {
        ConnectionResult connectionResult = null;
        ConnectionResult connectionResult2 = null;
        int i = 0;
        int i2 = 0;
        for (C4189q3 q3Var : this.f13115a.values()) {
            C4059a f = q3Var.mo17684f();
            ConnectionResult connectionResult3 = (ConnectionResult) this.f13114Z.get(q3Var.mo17676b());
            if (!connectionResult3.mo17580R() && (!((Boolean) this.f13102N.get(f)).booleanValue() || connectionResult3.mo17579Q() || this.f13107S.mo18112c(connectionResult3.mo17576N()))) {
                if (connectionResult3.mo17576N() != 4 || !this.f13110V) {
                    int a = f.mo17627c().mo17632a();
                    if (connectionResult == null || i > a) {
                        connectionResult = connectionResult3;
                        i = a;
                    }
                } else {
                    int a2 = f.mo17627c().mo17632a();
                    if (connectionResult2 == null || i2 > a2) {
                        connectionResult2 = connectionResult3;
                        i2 = a2;
                    }
                }
            }
        }
        return (connectionResult == null || connectionResult2 == null || i <= i2) ? connectionResult : connectionResult2;
    }

    /* renamed from: j */
    private final boolean m18148j() {
        this.f13105Q.lock();
        try {
            if (this.f13113Y) {
                if (this.f13110V) {
                    for (C4062c a : this.f13117b.keySet()) {
                        ConnectionResult a2 = m18127a(a);
                        if (a2 != null) {
                            if (!a2.mo17580R()) {
                            }
                        }
                        this.f13105Q.unlock();
                        return false;
                    }
                    this.f13105Q.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.f13105Q.unlock();
        }
    }

    /* renamed from: a */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17886a(@C0193h0 T t) {
        C4062c i = t.mo17814i();
        if (this.f13110V && m18137c(t)) {
            return t;
        }
        this.f13104P.f13195B.mo17980a(t);
        return ((C4189q3) this.f13115a.get(i)).mo17680c(t);
    }

    /* renamed from: a */
    public final void mo17891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17893b(@C0193h0 T t) {
        if (this.f13110V && m18137c(t)) {
            return t;
        }
        if (!isConnected()) {
            this.f13112X.add(t);
            return t;
        }
        this.f13104P.f13195B.mo17980a(t);
        return ((C4189q3) this.f13115a.get(t.mo17814i())).mo17677b(t);
    }

    /* renamed from: d */
    public final boolean mo17896d() {
        this.f13105Q.lock();
        try {
            return this.f13114Z == null && this.f13113Y;
        } finally {
            this.f13105Q.unlock();
        }
    }

    /* renamed from: e */
    public final void mo17897e() {
    }

    @C5966a("mLock")
    /* renamed from: f */
    public final ConnectionResult mo17898f() {
        mo17894b();
        while (mo17896d()) {
            try {
                this.f13108T.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f12763l0;
        }
        ConnectionResult connectionResult = this.f13119c0;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    public final boolean isConnected() {
        this.f13105Q.lock();
        try {
            return this.f13114Z != null && this.f13119c0 == null;
        } finally {
            this.f13105Q.unlock();
        }
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final ConnectionResult mo17884a(long j, TimeUnit timeUnit) {
        mo17894b();
        long nanos = timeUnit.toNanos(j);
        while (mo17896d()) {
            if (nanos <= 0) {
                try {
                    mo17887a();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            } else {
                nanos = this.f13108T.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f12763l0;
        }
        ConnectionResult connectionResult = this.f13119c0;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    /* renamed from: b */
    public final void mo17894b() {
        this.f13105Q.lock();
        try {
            if (!this.f13113Y) {
                this.f13113Y = true;
                this.f13114Z = null;
                this.f13116a0 = null;
                this.f13118b0 = null;
                this.f13119c0 = null;
                this.f13103O.mo17857c();
                this.f13103O.mo17846a((Iterable<? extends C4235j<?>>) this.f13115a.values()).mo21998a((Executor) new C4480a(this.f13106R), (C5547e<TResult>) new C4194r3<TResult>(this));
                this.f13105Q.unlock();
            }
        } finally {
            this.f13105Q.unlock();
        }
    }

    /* renamed from: c */
    public final void mo17895c() {
        this.f13105Q.lock();
        try {
            this.f13103O.mo17847a();
            if (this.f13118b0 != null) {
                this.f13118b0.mo17804a();
                this.f13118b0 = null;
            }
            if (this.f13116a0 == null) {
                this.f13116a0 = new C0635a(this.f13117b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C4189q3 b : this.f13117b.values()) {
                this.f13116a0.put(b.mo17676b(), connectionResult);
            }
            if (this.f13114Z != null) {
                this.f13114Z.putAll(this.f13116a0);
            }
        } finally {
            this.f13105Q.unlock();
        }
    }

    /* renamed from: a */
    public final void mo17887a() {
        this.f13105Q.lock();
        try {
            this.f13113Y = false;
            this.f13114Z = null;
            this.f13116a0 = null;
            if (this.f13118b0 != null) {
                this.f13118b0.mo17804a();
                this.f13118b0 = null;
            }
            this.f13119c0 = null;
            while (!this.f13112X.isEmpty()) {
                C4116a aVar = (C4116a) this.f13112X.remove();
                aVar.mo17742a((C4214v2) null);
                aVar.mo17653b();
            }
            this.f13108T.signalAll();
        } finally {
            this.f13105Q.unlock();
        }
    }

    @C0195i0
    /* renamed from: a */
    public final ConnectionResult mo17885a(@C0193h0 C4059a<?> aVar) {
        return m18127a(aVar.mo17625a());
    }

    @C0195i0
    /* renamed from: a */
    private final ConnectionResult m18127a(@C0193h0 C4062c<?> cVar) {
        this.f13105Q.lock();
        try {
            C4189q3 q3Var = (C4189q3) this.f13115a.get(cVar);
            if (this.f13114Z != null && q3Var != null) {
                return (ConnectionResult) this.f13114Z.get(q3Var.mo17676b());
            }
            this.f13105Q.unlock();
            return null;
        } finally {
            this.f13105Q.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final boolean mo17892a(C4211v vVar) {
        this.f13105Q.lock();
        try {
            if (!this.f13113Y || m18148j()) {
                this.f13105Q.unlock();
                return false;
            }
            this.f13103O.mo17857c();
            this.f13118b0 = new C4111d0(this, vVar);
            this.f13103O.mo17846a((Iterable<? extends C4235j<?>>) this.f13117b.values()).mo21998a((Executor) new C4480a(this.f13106R), (C5547e<TResult>) this.f13118b0);
            this.f13105Q.unlock();
            return true;
        } catch (Throwable th) {
            this.f13105Q.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m18133a(C4189q3<?> q3Var, ConnectionResult connectionResult) {
        return !connectionResult.mo17580R() && !connectionResult.mo17579Q() && ((Boolean) this.f13102N.get(q3Var.mo17684f())).booleanValue() && q3Var.mo17953k().mo17644k() && this.f13107S.mo18112c(connectionResult.mo17576N());
    }
}
