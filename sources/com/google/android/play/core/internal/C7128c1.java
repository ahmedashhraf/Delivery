package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder.DeathRecipient;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.tasks.C7205o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.internal.c1 */
public final class C7128c1<T extends IInterface> {

    /* renamed from: l */
    private static final Map<String, Handler> f20224l = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f20225a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5742h f20226b;

    /* renamed from: c */
    private final String f20227c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C7130d1> f20228d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f20229e;

    /* renamed from: f */
    private final Intent f20230f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7141j1<T> f20231g;

    /* renamed from: h */
    private final WeakReference<C7136g1> f20232h;

    /* renamed from: i */
    private final DeathRecipient f20233i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public ServiceConnection f20234j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public T f20235k;

    public C7128c1(Context context, C5742h hVar, String str, Intent intent, C7141j1<T> j1Var) {
        this(context, hVar, str, intent, j1Var, null);
    }

    private C7128c1(Context context, C5742h hVar, String str, Intent intent, C7141j1<T> j1Var, C7136g1 g1Var) {
        this.f20228d = new ArrayList();
        this.f20233i = new C7134f1(this);
        this.f20225a = context;
        this.f20226b = hVar;
        this.f20227c = str;
        this.f20230f = intent;
        this.f20231g = j1Var;
        this.f20232h = new WeakReference<>(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m34311b(C7130d1 d1Var) {
        if (this.f20235k == null && !this.f20229e) {
            this.f20226b.mo23043a("Initiate binding to the service.", new Object[0]);
            this.f20228d.add(d1Var);
            this.f20234j = new C7139i1(this, 0);
            this.f20229e = true;
            if (!this.f20225a.bindService(this.f20230f, this.f20234j, 1)) {
                this.f20226b.mo23043a("Failed to bind to the service.", new Object[0]);
                this.f20229e = false;
                for (C7130d1 b : this.f20228d) {
                    C7205o b2 = b.mo28499b();
                    if (b2 != null) {
                        b2.mo28633a((Exception) new C5733aa());
                    }
                }
                this.f20228d.clear();
            }
        } else if (this.f20229e) {
            this.f20226b.mo23043a("Waiting to bind to the service.", new Object[0]);
            this.f20228d.add(d1Var);
        } else {
            d1Var.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m34313c(C7130d1 d1Var) {
        m34315d().post(d1Var);
    }

    /* renamed from: d */
    private final Handler m34315d() {
        Handler handler;
        synchronized (f20224l) {
            if (!f20224l.containsKey(this.f20227c)) {
                HandlerThread handlerThread = new HandlerThread(this.f20227c, 10);
                handlerThread.start();
                f20224l.put(this.f20227c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) f20224l.get(this.f20227c);
        }
        return handler;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m34317e() {
        this.f20226b.mo23043a("linkToDeath", new Object[0]);
        try {
            this.f20235k.asBinder().linkToDeath(this.f20233i, 0);
        } catch (RemoteException e) {
            this.f20226b.mo23044a((Throwable) e, "linkToDeath failed", new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m34318f() {
        this.f20226b.mo23043a("unlinkToDeath", new Object[0]);
        this.f20235k.asBinder().unlinkToDeath(this.f20233i, 0);
    }

    /* renamed from: a */
    public final void mo28495a() {
        m34313c((C7130d1) new C7138h1(this));
    }

    /* renamed from: a */
    public final void mo28496a(C7130d1 d1Var) {
        m34313c((C7130d1) new C7132e1(this, d1Var.mo28499b(), d1Var));
    }

    /* renamed from: b */
    public final T mo28497b() {
        return this.f20235k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo28498c() {
        this.f20226b.mo23043a("reportBinderDeath", new Object[0]);
        C7136g1 g1Var = (C7136g1) this.f20232h.get();
        if (g1Var != null) {
            this.f20226b.mo23043a("calling onBinderDied", new Object[0]);
            g1Var.mo28522d();
            return;
        }
        this.f20226b.mo23043a("%s : Binder has died.", this.f20227c);
        for (C7130d1 b : this.f20228d) {
            C7205o b2 = b.mo28499b();
            if (b2 != null) {
                b2.mo28633a((Exception) VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f20227c).concat(" : Binder has died.")));
            }
        }
        this.f20228d.clear();
    }
}
