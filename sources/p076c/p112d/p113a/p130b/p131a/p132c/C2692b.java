package p076c.p112d.p113a.p130b.p131a.p132c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.play.core.internal.C5742h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: c.d.a.b.a.c.b */
public abstract class C2692b<StateT> {

    /* renamed from: a */
    protected final C5742h f9806a;

    /* renamed from: b */
    private final IntentFilter f9807b;

    /* renamed from: c */
    private final Context f9808c;

    /* renamed from: d */
    private final Set<C6162a<StateT>> f9809d = new HashSet();

    /* renamed from: e */
    private C6163c f9810e = null;

    /* renamed from: f */
    private volatile boolean f9811f = false;

    protected C2692b(C5742h hVar, IntentFilter intentFilter, Context context) {
        this.f9806a = hVar;
        this.f9807b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f9808c = applicationContext;
    }

    /* renamed from: a */
    private final void m13060a() {
        if ((this.f9811f || !this.f9809d.isEmpty()) && this.f9810e == null) {
            this.f9810e = new C6163c(this, 0);
            this.f9808c.registerReceiver(this.f9810e, this.f9807b);
        }
        if (!this.f9811f && this.f9809d.isEmpty()) {
            C6163c cVar = this.f9810e;
            if (cVar != null) {
                this.f9808c.unregisterReceiver(cVar);
                this.f9810e = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo10353a(Context context, Intent intent);

    /* renamed from: a */
    public final synchronized void mo10354a(C6162a<StateT> aVar) {
        this.f9806a.mo23043a("registerListener", new Object[0]);
        this.f9809d.add(aVar);
        m13060a();
    }

    /* renamed from: a */
    public final synchronized void mo10355a(StateT statet) {
        Iterator it = new HashSet(this.f9809d).iterator();
        while (it.hasNext()) {
            ((C6162a) it.next()).mo25073a(statet);
        }
    }

    /* renamed from: a */
    public final synchronized void mo10356a(boolean z) {
        this.f9811f = true;
        m13060a();
    }

    /* renamed from: b */
    public final synchronized void mo10357b(C6162a<StateT> aVar) {
        this.f9806a.mo23043a("unregisterListener", new Object[0]);
        this.f9809d.remove(aVar);
        m13060a();
    }
}
