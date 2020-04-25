package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4329f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.i1 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4142i1 implements C4213v1, C4161l3 {

    /* renamed from: N */
    private final Context f12993N;

    /* renamed from: O */
    private final C4282f f12994O;

    /* renamed from: P */
    private final C4154k1 f12995P;

    /* renamed from: Q */
    final Map<C4062c<?>, C4071f> f12996Q;

    /* renamed from: R */
    final Map<C4062c<?>, ConnectionResult> f12997R = new HashMap();

    /* renamed from: S */
    private final C4329f f12998S;

    /* renamed from: T */
    private final Map<C4059a<?>, Boolean> f12999T;

    /* renamed from: U */
    private final C4060a<? extends C2683d, C2679a> f13000U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public volatile C4124f1 f13001V;

    /* renamed from: W */
    private ConnectionResult f13002W = null;

    /* renamed from: X */
    int f13003X;

    /* renamed from: Y */
    final C4232z0 f13004Y;

    /* renamed from: Z */
    final C4218w1 f13005Z;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Lock f13006a;

    /* renamed from: b */
    private final Condition f13007b;

    public C4142i1(Context context, C4232z0 z0Var, Lock lock, Looper looper, C4282f fVar, Map<C4062c<?>, C4071f> map, C4329f fVar2, Map<C4059a<?>, Boolean> map2, C4060a<? extends C2683d, C2679a> aVar, ArrayList<C4149j3> arrayList, C4218w1 w1Var) {
        this.f12993N = context;
        this.f13006a = lock;
        this.f12994O = fVar;
        this.f12996Q = map;
        this.f12998S = fVar2;
        this.f12999T = map2;
        this.f13000U = aVar;
        this.f13004Y = z0Var;
        this.f13005Z = w1Var;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C4149j3) obj).mo17909a((C4161l3) this);
        }
        this.f12995P = new C4154k1(this, looper);
        this.f13007b = lock.newCondition();
        this.f13001V = new C4217w0(this);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17886a(@C0193h0 T t) {
        t.mo17753g();
        return this.f13001V.mo17821a(t);
    }

    /* renamed from: a */
    public final boolean mo17892a(C4211v vVar) {
        return false;
    }

    @C5966a("mLock")
    /* renamed from: b */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17893b(@C0193h0 T t) {
        t.mo17753g();
        return this.f13001V.mo17824b(t);
    }

    /* renamed from: c */
    public final void mo17895c() {
    }

    /* renamed from: d */
    public final boolean mo17896d() {
        return this.f13001V instanceof C4171n0;
    }

    @C5966a("mLock")
    /* renamed from: e */
    public final void mo17897e() {
        if (isConnected()) {
            ((C4141i0) this.f13001V).mo17883d();
        }
    }

    @C5966a("mLock")
    /* renamed from: f */
    public final ConnectionResult mo17898f() {
        mo17894b();
        while (mo17896d()) {
            try {
                this.f13007b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f12763l0;
        }
        ConnectionResult connectionResult = this.f13002W;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo17899g() {
        this.f13006a.lock();
        try {
            C4171n0 n0Var = new C4171n0(this, this.f12998S, this.f12999T, this.f12994O, this.f13000U, this.f13006a, this.f12993N);
            this.f13001V = n0Var;
            this.f13001V.mo17826c();
            this.f13007b.signalAll();
        } finally {
            this.f13006a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final void mo17900h() {
        this.f13006a.lock();
        try {
            this.f13004Y.mo18004m();
            this.f13001V = new C4141i0(this);
            this.f13001V.mo17826c();
            this.f13007b.signalAll();
        } finally {
            this.f13006a.unlock();
        }
    }

    /* renamed from: i */
    public final void mo17777i(@C0195i0 Bundle bundle) {
        this.f13006a.lock();
        try {
            this.f13001V.mo17827i(bundle);
        } finally {
            this.f13006a.unlock();
        }
    }

    public final boolean isConnected() {
        return this.f13001V instanceof C4141i0;
    }

    /* renamed from: n */
    public final void mo17778n(int i) {
        this.f13006a.lock();
        try {
            this.f13001V.mo17828n(i);
        } finally {
            this.f13006a.unlock();
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
                nanos = this.f13007b.awaitNanos(nanos);
            }
        }
        if (isConnected()) {
            return ConnectionResult.f12763l0;
        }
        ConnectionResult connectionResult = this.f13002W;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, null);
    }

    @C5966a("mLock")
    /* renamed from: b */
    public final void mo17894b() {
        this.f13001V.mo17825b();
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17887a() {
        if (this.f13001V.mo17823a()) {
            this.f12997R.clear();
        }
    }

    @C0195i0
    @C5966a("mLock")
    /* renamed from: a */
    public final ConnectionResult mo17885a(@C0193h0 C4059a<?> aVar) {
        C4062c a = aVar.mo17625a();
        if (this.f12996Q.containsKey(a)) {
            if (((C4071f) this.f12996Q.get(a)).isConnected()) {
                return ConnectionResult.f12763l0;
            }
            if (this.f12997R.containsKey(a)) {
                return (ConnectionResult) this.f12997R.get(a);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17888a(ConnectionResult connectionResult) {
        this.f13006a.lock();
        try {
            this.f13002W = connectionResult;
            this.f13001V = new C4217w0(this);
            this.f13001V.mo17826c();
            this.f13007b.signalAll();
        } finally {
            this.f13006a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo17860a(@C0193h0 ConnectionResult connectionResult, @C0193h0 C4059a<?> aVar, boolean z) {
        this.f13006a.lock();
        try {
            this.f13001V.mo17822a(connectionResult, aVar, z);
        } finally {
            this.f13006a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17889a(C4134h1 h1Var) {
        this.f12995P.sendMessage(this.f12995P.obtainMessage(1, h1Var));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17890a(RuntimeException runtimeException) {
        this.f12995P.sendMessage(this.f12995P.obtainMessage(2, runtimeException));
    }

    /* renamed from: a */
    public final void mo17891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f13001V);
        for (C4059a aVar : this.f12999T.keySet()) {
            printWriter.append(str).append(aVar.mo17626b()).println(":");
            ((C4071f) this.f12996Q.get(aVar.mo17625a())).mo17637a(concat, fileDescriptor, printWriter, strArr);
        }
    }
}
