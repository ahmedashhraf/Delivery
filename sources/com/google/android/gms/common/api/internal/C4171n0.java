package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C4282f;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4060a;
import com.google.android.gms.common.api.C4059a.C4061b;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4071f;
import com.google.android.gms.common.api.C4086i.C4088b;
import com.google.android.gms.common.api.C4086i.C4089c;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.C4115e.C4116a;
import com.google.android.gms.common.internal.C4329f;
import com.google.android.gms.common.internal.C4329f.C4331b;
import com.google.android.gms.common.internal.C4375p;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zak;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import p076c.p112d.p113a.p114a.p128h.C2679a;
import p076c.p112d.p113a.p114a.p128h.C2683d;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.n0 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4171n0 implements C4124f1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4142i1 f13058a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Lock f13059b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f13060c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C4282f f13061d;

    /* renamed from: e */
    private ConnectionResult f13062e;

    /* renamed from: f */
    private int f13063f;

    /* renamed from: g */
    private int f13064g = 0;

    /* renamed from: h */
    private int f13065h;

    /* renamed from: i */
    private final Bundle f13066i = new Bundle();

    /* renamed from: j */
    private final Set<C4062c> f13067j = new HashSet();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C2683d f13068k;

    /* renamed from: l */
    private boolean f13069l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f13070m;

    /* renamed from: n */
    private boolean f13071n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C4375p f13072o;

    /* renamed from: p */
    private boolean f13073p;

    /* renamed from: q */
    private boolean f13074q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C4329f f13075r;

    /* renamed from: s */
    private final Map<C4059a<?>, Boolean> f13076s;

    /* renamed from: t */
    private final C4060a<? extends C2683d, C2679a> f13077t;

    /* renamed from: u */
    private ArrayList<Future<?>> f13078u = new ArrayList<>();

    public C4171n0(C4142i1 i1Var, C4329f fVar, Map<C4059a<?>, Boolean> map, C4282f fVar2, C4060a<? extends C2683d, C2679a> aVar, Lock lock, Context context) {
        this.f13058a = i1Var;
        this.f13075r = fVar;
        this.f13076s = map;
        this.f13061d = fVar2;
        this.f13077t = aVar;
        this.f13059b = lock;
        this.f13060c = context;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: a */
    public final void m18063a(zak zak) {
        if (m18065a(0)) {
            ConnectionResult N = zak.mo21968N();
            if (N.mo17580R()) {
                ResolveAccountResponse O = zak.mo21969O();
                ConnectionResult O2 = O.mo18206O();
                if (!O2.mo17580R()) {
                    String valueOf = String.valueOf(O2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Sign-in succeeded with resolve account failure: ");
                    sb.append(valueOf);
                    sb.toString();
                    new Exception();
                    m18070b(O2);
                    return;
                }
                this.f13071n = true;
                this.f13072o = O.mo18205N();
                this.f13073p = O.mo18207P();
                this.f13074q = O.mo18208Q();
                m18076e();
            } else if (m18066a(N)) {
                m18081g();
                m18076e();
            } else {
                m18070b(N);
            }
        }
    }

    /* renamed from: b */
    private static String m18069b(int i) {
        return i != 0 ? i != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: d */
    public final boolean m18075d() {
        this.f13065h--;
        int i = this.f13065h;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.f13058a.f13004Y.mo18006o();
            new Exception();
            m18070b(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f13062e;
        if (connectionResult == null) {
            return true;
        }
        this.f13058a.f13003X = this.f13063f;
        m18070b(connectionResult);
        return false;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: e */
    public final void m18076e() {
        if (this.f13065h == 0) {
            if (!this.f13070m || this.f13071n) {
                ArrayList arrayList = new ArrayList();
                this.f13064g = 1;
                this.f13065h = this.f13058a.f12996Q.size();
                for (C4062c cVar : this.f13058a.f12996Q.keySet()) {
                    if (!this.f13058a.f12997R.containsKey(cVar)) {
                        arrayList.add((C4071f) this.f13058a.f12996Q.get(cVar));
                    } else if (m18075d()) {
                        m18079f();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f13078u.add(C4147j1.m17979a().submit(new C4202t0(this, arrayList)));
                }
            }
        }
    }

    @C5966a("mLock")
    /* renamed from: f */
    private final void m18079f() {
        this.f13058a.mo17900h();
        C4147j1.m17979a().execute(new C4163m0(this));
        C2683d dVar = this.f13068k;
        if (dVar != null) {
            if (this.f13073p) {
                dVar.mo10344a(this.f13072o, this.f13074q);
            }
            m18064a(false);
        }
        for (C4062c cVar : this.f13058a.f12997R.keySet()) {
            ((C4071f) this.f13058a.f12996Q.get(cVar)).mo17633a();
        }
        this.f13058a.f13005Z.mo17928a(this.f13066i.isEmpty() ? null : this.f13066i);
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: g */
    public final void m18081g() {
        this.f13070m = false;
        this.f13058a.f13004Y.f13212t = Collections.emptySet();
        for (C4062c cVar : this.f13067j) {
            if (!this.f13058a.f12997R.containsKey(cVar)) {
                this.f13058a.f12997R.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    /* renamed from: h */
    private final void m18083h() {
        ArrayList<Future<?>> arrayList = this.f13078u;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f13078u.clear();
    }

    /* renamed from: b */
    public final <A extends C4061b, R extends C4246q, T extends C4116a<R, A>> T mo17824b(T t) {
        this.f13058a.f13004Y.f13204l.add(t);
        return t;
    }

    /* renamed from: b */
    public final void mo17825b() {
    }

    @C5966a("mLock")
    /* renamed from: c */
    public final void mo17826c() {
        this.f13058a.f12997R.clear();
        this.f13070m = false;
        this.f13062e = null;
        this.f13064g = 0;
        this.f13069l = true;
        this.f13071n = false;
        this.f13073p = false;
        HashMap hashMap = new HashMap();
        boolean z = false;
        for (C4059a aVar : this.f13076s.keySet()) {
            C4071f fVar = (C4071f) this.f13058a.f12996Q.get(aVar.mo17625a());
            z |= aVar.mo17627c().mo17632a() == 1;
            boolean booleanValue = ((Boolean) this.f13076s.get(aVar)).booleanValue();
            if (fVar.mo17646o()) {
                this.f13070m = true;
                if (booleanValue) {
                    this.f13067j.add(aVar.mo17625a());
                } else {
                    this.f13069l = false;
                }
            }
            hashMap.put(fVar, new C4181p0(this, aVar, booleanValue));
        }
        if (z) {
            this.f13070m = false;
        }
        if (this.f13070m) {
            this.f13075r.mo18294a(Integer.valueOf(System.identityHashCode(this.f13058a.f13004Y)));
            C4207u0 u0Var = new C4207u0(this, null);
            C4060a<? extends C2683d, C2679a> aVar2 = this.f13077t;
            Context context = this.f13060c;
            Looper f = this.f13058a.f13004Y.mo17717f();
            C4329f fVar2 = this.f13075r;
            this.f13068k = (C2683d) aVar2.mo10343a(context, f, fVar2, fVar2.mo18304k(), (C4088b) u0Var, (C4089c) u0Var);
        }
        this.f13065h = this.f13058a.f12996Q.size();
        this.f13078u.add(C4147j1.m17979a().submit(new C4176o0(this, hashMap)));
    }

    @C5966a("mLock")
    /* renamed from: i */
    public final void mo17827i(Bundle bundle) {
        if (m18065a(1)) {
            if (bundle != null) {
                this.f13066i.putAll(bundle);
            }
            if (m18075d()) {
                m18079f();
            }
        }
    }

    @C5966a("mLock")
    /* renamed from: n */
    public final void mo17828n(int i) {
        m18070b(new ConnectionResult(8, null));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r7 != false) goto L_0x0024;
     */
    @p201f.p202a.p203u.C5966a("mLock")
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m18071b(com.google.android.gms.common.ConnectionResult r5, com.google.android.gms.common.api.C4059a<?> r6, boolean r7) {
        /*
            r4 = this;
            com.google.android.gms.common.api.a$e r0 = r6.mo17627c()
            int r0 = r0.mo17632a()
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x0024
            boolean r7 = r5.mo17579Q()
            if (r7 == 0) goto L_0x0014
        L_0x0012:
            r7 = 1
            goto L_0x0022
        L_0x0014:
            com.google.android.gms.common.f r7 = r4.f13061d
            int r3 = r5.mo17576N()
            android.content.Intent r7 = r7.mo18120a(r3)
            if (r7 == 0) goto L_0x0021
            goto L_0x0012
        L_0x0021:
            r7 = 0
        L_0x0022:
            if (r7 == 0) goto L_0x002d
        L_0x0024:
            com.google.android.gms.common.ConnectionResult r7 = r4.f13062e
            if (r7 == 0) goto L_0x002c
            int r7 = r4.f13063f
            if (r0 >= r7) goto L_0x002d
        L_0x002c:
            r1 = 1
        L_0x002d:
            if (r1 == 0) goto L_0x0033
            r4.f13062e = r5
            r4.f13063f = r0
        L_0x0033:
            com.google.android.gms.common.api.internal.i1 r7 = r4.f13058a
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.ConnectionResult> r7 = r7.f12997R
            com.google.android.gms.common.api.a$c r6 = r6.mo17625a()
            r7.put(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C4171n0.m18071b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final Set<Scope> m18085i() {
        C4329f fVar = this.f13075r;
        if (fVar == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(fVar.mo18303j());
        Map g = this.f13075r.mo18300g();
        for (C4059a aVar : g.keySet()) {
            if (!this.f13058a.f12997R.containsKey(aVar.mo17625a())) {
                hashSet.addAll(((C4331b) g.get(aVar)).f13474a);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: b */
    public final void m18070b(ConnectionResult connectionResult) {
        m18083h();
        m18064a(!connectionResult.mo17579Q());
        this.f13058a.mo17888a(connectionResult);
        this.f13058a.f13005Z.mo17929a(connectionResult);
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final void mo17822a(ConnectionResult connectionResult, C4059a<?> aVar, boolean z) {
        if (m18065a(1)) {
            m18071b(connectionResult, aVar, z);
            if (m18075d()) {
                m18079f();
            }
        }
    }

    /* renamed from: a */
    public final <A extends C4061b, T extends C4116a<? extends C4246q, A>> T mo17821a(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @C5966a("mLock")
    /* renamed from: a */
    public final boolean mo17823a() {
        m18083h();
        m18064a(true);
        this.f13058a.mo17888a((ConnectionResult) null);
        return true;
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: a */
    public final boolean m18066a(ConnectionResult connectionResult) {
        return this.f13069l && !connectionResult.mo17579Q();
    }

    @C5966a("mLock")
    /* renamed from: a */
    private final void m18064a(boolean z) {
        C2683d dVar = this.f13068k;
        if (dVar != null) {
            if (dVar.isConnected() && z) {
                this.f13068k.mo10347i();
            }
            this.f13068k.mo17633a();
            if (this.f13075r.mo18306m()) {
                this.f13068k = null;
            }
            this.f13072o = null;
        }
    }

    /* access modifiers changed from: private */
    @C5966a("mLock")
    /* renamed from: a */
    public final boolean m18065a(int i) {
        if (this.f13064g == i) {
            return true;
        }
        this.f13058a.f13004Y.mo18006o();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        sb.toString();
        int i2 = this.f13065h;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        sb2.toString();
        String b = m18069b(this.f13064g);
        String b2 = m18069b(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(b).length() + 70 + String.valueOf(b2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(b);
        sb3.append(" but received callback for step ");
        sb3.append(b2);
        sb3.toString();
        new Exception();
        m18070b(new ConnectionResult(8, null));
        return false;
    }
}
