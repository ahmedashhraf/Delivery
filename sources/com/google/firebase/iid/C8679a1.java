package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.C0224v0;
import com.google.android.gms.common.util.p173f0.C4481b;
import com.google.android.gms.tasks.C5560k;
import java.util.concurrent.ScheduledExecutorService;
import p076c.p112d.p113a.p114a.p118d.p123e.C2620a;
import p076c.p112d.p113a.p114a.p118d.p123e.C2625f;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.a1 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C8679a1 {
    @C5966a("MessengerIpcClient.class")

    /* renamed from: e */
    private static C8679a1 f22789e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f22790a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ScheduledExecutorService f22791b;
    @C5966a("this")

    /* renamed from: c */
    private C8682b1 f22792c = new C8682b1(this);
    @C5966a("this")

    /* renamed from: d */
    private int f22793d = 1;

    @C0224v0
    private C8679a1(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f22791b = scheduledExecutorService;
        this.f22790a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static synchronized C8679a1 m40806a(Context context) {
        C8679a1 a1Var;
        synchronized (C8679a1.class) {
            if (f22789e == null) {
                f22789e = new C8679a1(context, C2620a.m12731a().mo10137a(1, new C4481b("MessengerIpcClient"), C2625f.f9736b));
            }
            a1Var = f22789e;
        }
        return a1Var;
    }

    /* renamed from: b */
    public final C5560k<Bundle> mo32094b(int i, Bundle bundle) {
        return m40805a((C8703k<T>) new C8707m<T>(m40803a(), 1, bundle));
    }

    /* renamed from: a */
    public final C5560k<Void> mo32093a(int i, Bundle bundle) {
        return m40805a((C8703k<T>) new C8698i<T>(m40803a(), 2, bundle));
    }

    /* renamed from: a */
    private final synchronized <T> C5560k<T> m40805a(C8703k<T> kVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(kVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            sb.toString();
        }
        if (!this.f22792c.mo32109a(kVar)) {
            this.f22792c = new C8682b1(this);
            this.f22792c.mo32109a(kVar);
        }
        return kVar.f22828b.mo22017a();
    }

    /* renamed from: a */
    private final synchronized int m40803a() {
        int i;
        i = this.f22793d;
        this.f22793d = i + 1;
        return i;
    }
}
