package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
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
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4300a0;
import com.google.android.gms.common.internal.C4329f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import org.jcodec.codecs.common.biari.MQEncoder;
import p076c.p112d.p113a.p114a.p118d.p121c.C2612r;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.k3 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
final class C4156k3 implements C4213v1 {

    /* renamed from: N */
    private final Looper f13030N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public final C4142i1 f13031O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public final C4142i1 f13032P;

    /* renamed from: Q */
    private final Map<C4062c<?>, C4142i1> f13033Q;

    /* renamed from: R */
    private final Set<C4211v> f13034R = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: S */
    private final C4071f f13035S;

    /* renamed from: T */
    private Bundle f13036T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public ConnectionResult f13037U = null;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public ConnectionResult f13038V = null;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f13039W = false;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public final Lock f13040X;
    @C5966a("mLock")

    /* renamed from: Y */
    private int f13041Y = 0;

    /* renamed from: a */
    private final Context f13042a;

    /* renamed from: b */
    private final C4232z0 f13043b;

    private C4156k3(Context context, C4232z0 z0Var, Lock lock, Looper looper, C4282f fVar, Map<C4062c<?>, C4071f> map, Map<C4062c<?>, C4071f> map2, C4329f fVar2, C4060a<? extends C2683d, C2679a> aVar, C4071f fVar3, ArrayList<C4149j3> arrayList, ArrayList<C4149j3> arrayList2, Map<C4059a<?>, Boolean> map3, Map<C4059a<?>, Boolean> map4) {
        this.f13042a = context;
        this.f13043b = z0Var;
        this.f13040X = lock;
        this.f13030N = looper;
        this.f13035S = fVar3;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        C4282f fVar4 = fVar;
        C4142i1 i1Var = r3;
        C4142i1 i1Var2 = new C4142i1(context2, this.f13043b, lock2, looper2, fVar4, map2, null, map4, null, arrayList2, new C4166m3(this, null));
        this.f13031O = i1Var;
        C4142i1 i1Var3 = new C4142i1(context2, this.f13043b, lock2, looper2, fVar4, map, fVar2, map3, aVar, arrayList, new C4179o3(this, null));
        this.f13032P = i1Var3;
        C0635a aVar2 = new C0635a();
        for (C4062c put : map2.keySet()) {
            aVar2.put(put, this.f13031O);
        }
        for (C4062c put2 : map.keySet()) {
            aVar2.put(put2, this.f13032P);
        }
        this.f13033Q = Collections.unmodifiableMap(aVar2);
    }

    /* renamed from: a */
    public static C4156k3 m18003a(Context context, C4232z0 z0Var, Lock lock, Looper looper, C4282f fVar, Map<C4062c<?>, C4071f> map, C4329f fVar2, Map<C4059a<?>, Boolean> map2, C4060a<? extends C2683d, C2679a> aVar, ArrayList<C4149j3> arrayList) {
        Map<C4059a<?>, Boolean> map3 = map2;
        C0635a aVar2 = new C0635a();
        C0635a aVar3 = new C0635a();
        C4071f fVar3 = null;
        for (Entry entry : map.entrySet()) {
            C4071f fVar4 = (C4071f) entry.getValue();
            if (fVar4.mo17533f()) {
                fVar3 = fVar4;
            }
            if (fVar4.mo17646o()) {
                aVar2.put((C4062c) entry.getKey(), fVar4);
            } else {
                aVar3.put((C4062c) entry.getKey(), fVar4);
            }
        }
        C4300a0.m18632b(!aVar2.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        C0635a aVar4 = new C0635a();
        C0635a aVar5 = new C0635a();
        for (C4059a aVar6 : map2.keySet()) {
            C4062c a = aVar6.mo17625a();
            if (aVar2.containsKey(a)) {
                aVar4.put(aVar6, (Boolean) map3.get(aVar6));
            } else if (aVar3.containsKey(a)) {
                aVar5.put(aVar6, (Boolean) map3.get(aVar6));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C4149j3 j3Var = (C4149j3) obj;
            if (aVar4.containsKey(j3Var.f13026a)) {
                arrayList2.add(j3Var);
            } else if (aVar5.containsKey(j3Var.f13026a)) {
                arrayList3.add(j3Var);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        C4156k3 k3Var = new C4156k3(context, z0Var, lock, looper, fVar, aVar2, aVar3, fVar2, aVar, fVar3, arrayList2, arrayList3, aVar4, aVar5);
        return k3Var;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: g */
    public final void m18019g() {
        if (m18013b(this.f13037U)) {
            if (m18013b(this.f13038V) || m18021i()) {
                int i = this.f13041Y;
                if (i != 1) {
                    if (i != 2) {
                        new AssertionError();
                        this.f13041Y = 0;
                        return;
                    }
                    this.f13043b.mo17928a(this.f13036T);
                }
                m18020h();
                this.f13041Y = 0;
                return;
            }
            ConnectionResult connectionResult = this.f13038V;
            if (connectionResult != null) {
                if (this.f13041Y == 1) {
                    m18020h();
                    return;
                }
                m18007a(connectionResult);
                this.f13031O.mo17887a();
            }
        } else if (this.f13037U == null || !m18013b(this.f13038V)) {
            ConnectionResult connectionResult2 = this.f13037U;
            if (connectionResult2 != null) {
                ConnectionResult connectionResult3 = this.f13038V;
                if (connectionResult3 != null) {
                    if (this.f13032P.f13003X < this.f13031O.f13003X) {
                        connectionResult2 = connectionResult3;
                    }
                    m18007a(connectionResult2);
                }
            }
        } else {
            this.f13032P.mo17887a();
            m18007a(this.f13037U);
        }
    }

    @C5966a("mLock")
    /* renamed from: h */
    private final void m18020h() {
        for (C4211v onComplete : this.f13034R) {
            onComplete.onComplete();
        }
        this.f13034R.clear();
    }

    @C5966a("mLock")
    /* renamed from: i */
    private final boolean m18021i() {
        ConnectionResult connectionResult = this.f13038V;
        return connectionResult != null && connectionResult.mo17576N() == 4;
    }

    @C0195i0
    /* renamed from: j */
    private final PendingIntent m18022j() {
        if (this.f13035S == null) {
            return null;
        }
        return PendingIntent.getActivity(this.f13042a, System.identityHashCode(this.f13043b), this.f13035S.mo17534n(), MQEncoder.CARRY_MASK);
    }

    @C5966a("mLock")
    /* renamed from: b */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17893b(@C0193h0 T t) {
        if (!m18014c((C4116a<? extends C4246q, ? extends C4061b>) t)) {
            return this.f13031O.mo17893b(t);
        }
        if (!m18021i()) {
            return this.f13032P.mo17893b(t);
        }
        t.mo17809a(new Status(4, null, m18022j()));
        return t;
    }

    /* renamed from: c */
    public final void mo17895c() {
        this.f13040X.lock();
        try {
            boolean d = mo17896d();
            this.f13032P.mo17887a();
            this.f13038V = new ConnectionResult(4);
            if (d) {
                new C2612r(this.f13030N).post(new C4174n3(this));
            } else {
                m18020h();
            }
        } finally {
            this.f13040X.unlock();
        }
    }

    /* renamed from: d */
    public final boolean mo17896d() {
        this.f13040X.lock();
        try {
            return this.f13041Y == 2;
        } finally {
            this.f13040X.unlock();
        }
    }

    @C5966a("mLock")
    /* renamed from: e */
    public final void mo17897e() {
        this.f13031O.mo17897e();
        this.f13032P.mo17897e();
    }

    @C5966a("mLock")
    /* renamed from: f */
    public final ConnectionResult mo17898f() {
        throw new UnsupportedOperationException();
    }

    public final boolean isConnected() {
        this.f13040X.lock();
        try {
            boolean z = true;
            if (!this.f13031O.isConnected() || (!this.f13032P.isConnected() && !m18021i() && this.f13041Y != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f13040X.unlock();
        }
    }

    @C5966a("mLock")
    /* renamed from: b */
    public final void mo17894b() {
        this.f13041Y = 2;
        this.f13039W = false;
        this.f13038V = null;
        this.f13037U = null;
        this.f13031O.mo17894b();
        this.f13032P.mo17894b();
    }

    /* renamed from: c */
    private final boolean m18014c(C4116a<? extends C4246q, ? extends C4061b> aVar) {
        C4062c i = aVar.mo17814i();
        C4300a0.m18628a(this.f13033Q.containsKey(i), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((C4142i1) this.f13033Q.get(i)).equals(this.f13032P);
    }

    /* renamed from: b */
    private static boolean m18013b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo17580R();
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17886a(@C0193h0 T t) {
        if (!m18014c((C4116a<? extends C4246q, ? extends C4061b>) t)) {
            return this.f13031O.mo17886a(t);
        }
        if (!m18021i()) {
            return this.f13032P.mo17886a(t);
        }
        t.mo17809a(new Status(4, null, m18022j()));
        return t;
    }

    @C0195i0
    @C5966a("mLock")
    /* renamed from: a */
    public final ConnectionResult mo17885a(@C0193h0 C4059a<?> aVar) {
        if (!((C4142i1) this.f13033Q.get(aVar.mo17625a())).equals(this.f13032P)) {
            return this.f13031O.mo17885a(aVar);
        }
        if (m18021i()) {
            return new ConnectionResult(4, m18022j());
        }
        return this.f13032P.mo17885a(aVar);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final ConnectionResult mo17884a(long j, @C0193h0 TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17887a() {
        this.f13038V = null;
        this.f13037U = null;
        this.f13041Y = 0;
        this.f13031O.mo17887a();
        this.f13032P.mo17887a();
        m18020h();
    }

    /* renamed from: a */
    public final boolean mo17892a(C4211v vVar) {
        this.f13040X.lock();
        try {
            if ((mo17896d() || isConnected()) && !this.f13032P.isConnected()) {
                this.f13034R.add(vVar);
                if (this.f13041Y == 0) {
                    this.f13041Y = 1;
                }
                this.f13038V = null;
                this.f13032P.mo17894b();
                return true;
            }
            this.f13040X.unlock();
            return false;
        } finally {
            this.f13040X.unlock();
        }
    }

    @C5966a("mLock")
    /* renamed from: a */
    private final void m18007a(ConnectionResult connectionResult) {
        int i = this.f13041Y;
        if (i != 1) {
            if (i != 2) {
                new Exception();
                this.f13041Y = 0;
            }
            this.f13043b.mo17929a(connectionResult);
        }
        m18020h();
        this.f13041Y = 0;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: a */
    public final void m18005a(int i, boolean z) {
        this.f13043b.mo17927a(i, z);
        this.f13038V = null;
        this.f13037U = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18006a(Bundle bundle) {
        Bundle bundle2 = this.f13036T;
        if (bundle2 == null) {
            this.f13036T = bundle;
            return;
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    /* renamed from: a */
    public final void mo17891a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.f13032P.mo17891a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.f13031O.mo17891a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }
}
