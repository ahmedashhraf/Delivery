package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.C0193h0;
import com.google.android.gms.common.api.C4086i;
import com.google.android.gms.common.api.C4237l;
import com.google.android.gms.common.api.C4243n;
import com.google.android.gms.common.api.C4246q;
import com.google.android.gms.common.api.C4247r;
import com.google.android.gms.common.api.C4248s;
import com.google.android.gms.common.api.C4249t;
import com.google.android.gms.common.api.C4250u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4300a0;
import java.lang.ref.WeakReference;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.common.api.internal.p2 */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4183p2<R extends C4246q> extends C4250u<R> implements C4247r<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C4249t<? super R, ? extends C4246q> f13093a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4183p2<? extends C4246q> f13094b = null;

    /* renamed from: c */
    private volatile C4248s<? super R> f13095c = null;

    /* renamed from: d */
    private C4237l<R> f13096d = null;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f13097e = new Object();

    /* renamed from: f */
    private Status f13098f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<C4086i> f13099g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C4193r2 f13100h;

    /* renamed from: i */
    private boolean f13101i = false;

    public C4183p2(WeakReference<C4086i> weakReference) {
        C4300a0.m18621a(weakReference, (Object) "GoogleApiClient reference must not be null");
        this.f13099g = weakReference;
        C4086i iVar = (C4086i) this.f13099g.get();
        this.f13100h = new C4193r2(this, iVar != null ? iVar.mo17717f() : Looper.getMainLooper());
    }

    @C5966a("mSyncToken")
    /* renamed from: b */
    private final void m18115b() {
        if (this.f13093a != null || this.f13095c != null) {
            C4086i iVar = (C4086i) this.f13099g.get();
            if (!(this.f13101i || this.f13093a == null || iVar == null)) {
                iVar.mo17700a(this);
                this.f13101i = true;
            }
            Status status = this.f13098f;
            if (status != null) {
                m18116b(status);
                return;
            }
            C4237l<R> lVar = this.f13096d;
            if (lVar != null) {
                lVar.mo17745a((C4247r<? super R>) this);
            }
        }
    }

    @C5966a("mSyncToken")
    /* renamed from: c */
    private final boolean m18119c() {
        return (this.f13095c == null || ((C4086i) this.f13099g.get()) == null) ? false : true;
    }

    @C0193h0
    /* renamed from: a */
    public final <S extends C4246q> C4250u<S> mo17945a(@C0193h0 C4249t<? super R, ? extends S> tVar) {
        C4183p2<? extends C4246q> p2Var;
        synchronized (this.f13097e) {
            boolean z = true;
            C4300a0.m18632b(this.f13093a == null, "Cannot call then() twice.");
            if (this.f13095c != null) {
                z = false;
            }
            C4300a0.m18632b(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f13093a = tVar;
            p2Var = new C4183p2<>(this.f13099g);
            this.f13094b = p2Var;
            m18115b();
        }
        return p2Var;
    }

    /* renamed from: b */
    private final void m18116b(Status status) {
        synchronized (this.f13097e) {
            if (this.f13093a != null) {
                Status b = this.f13093a.mo18014b(status);
                C4300a0.m18621a(b, (Object) "onFailure must not return null");
                this.f13094b.m18111a(b);
            } else if (m18119c()) {
                this.f13095c.mo18007a(status);
            }
        }
    }

    /* renamed from: a */
    public final void mo17948a(@C0193h0 C4248s<? super R> sVar) {
        synchronized (this.f13097e) {
            boolean z = true;
            C4300a0.m18632b(this.f13095c == null, "Cannot call andFinally() twice.");
            if (this.f13093a != null) {
                z = false;
            }
            C4300a0.m18632b(z, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.f13095c = sVar;
            m18115b();
        }
    }

    /* renamed from: a */
    public final void mo17815a(R r) {
        synchronized (this.f13097e) {
            if (!r.mo17504f().mo17617T()) {
                m18111a(r.mo17504f());
                m18117b((C4246q) r);
            } else if (this.f13093a != null) {
                C4130g2.m17821a().submit(new C4198s2(this, r));
            } else if (m18119c()) {
                this.f13095c.mo18009b(r);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m18117b(C4246q qVar) {
        if (qVar instanceof C4243n) {
            try {
                ((C4243n) qVar).release();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(qVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                sb.toString();
            }
        }
    }

    /* renamed from: a */
    public final void mo17947a(C4237l<?> lVar) {
        synchronized (this.f13097e) {
            this.f13096d = lVar;
            m18115b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m18111a(Status status) {
        synchronized (this.f13097e) {
            this.f13098f = status;
            m18116b(this.f13098f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo17946a() {
        this.f13095c = null;
    }
}
