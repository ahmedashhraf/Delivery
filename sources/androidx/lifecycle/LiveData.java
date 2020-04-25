package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import java.util.Iterator;
import java.util.Map.Entry;
import p053b.p054a.p055a.p056b.C2076a;
import p053b.p054a.p055a.p057c.C2083b;

public abstract class LiveData<T> {

    /* renamed from: j */
    static final int f5668j = -1;

    /* renamed from: k */
    static final Object f5669k = new Object();

    /* renamed from: a */
    final Object f5670a = new Object();

    /* renamed from: b */
    private C2083b<C1468o<? super T>, C1445c> f5671b = new C2083b<>();

    /* renamed from: c */
    int f5672c = 0;

    /* renamed from: d */
    private volatile Object f5673d;

    /* renamed from: e */
    volatile Object f5674e;

    /* renamed from: f */
    private int f5675f;

    /* renamed from: g */
    private boolean f5676g;

    /* renamed from: h */
    private boolean f5677h;

    /* renamed from: i */
    private final Runnable f5678i;

    class LifecycleBoundObserver extends C1445c implements C1456f {
        @C0193h0

        /* renamed from: e */
        final C1459i f5679e;

        LifecycleBoundObserver(@C0193h0 C1459i iVar, C1468o<? super T> oVar) {
            super(oVar);
            this.f5679e = iVar;
        }

        /* renamed from: a */
        public void mo632a(C1459i iVar, C1441a aVar) {
            if (this.f5679e.getLifecycle().mo6471a() == State.DESTROYED) {
                LiveData.this.mo6482b(this.f5683a);
            } else {
                mo6492a(mo6490b());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo6490b() {
            return this.f5679e.getLifecycle().mo6471a().isAtLeast(State.STARTED);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6489a(C1459i iVar) {
            return this.f5679e == iVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6488a() {
            this.f5679e.getLifecycle().mo6473b(this);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1443a implements Runnable {
        C1443a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f5670a) {
                obj = LiveData.this.f5674e;
                LiveData.this.f5674e = LiveData.f5669k;
            }
            LiveData.this.mo6483b(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1444b extends C1445c {
        C1444b(C1468o<? super T> oVar) {
            super(oVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo6490b() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1445c {

        /* renamed from: a */
        final C1468o<? super T> f5683a;

        /* renamed from: b */
        boolean f5684b;

        /* renamed from: c */
        int f5685c = -1;

        C1445c(C1468o<? super T> oVar) {
            this.f5683a = oVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6488a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6492a(boolean z) {
            if (z != this.f5684b) {
                this.f5684b = z;
                int i = 1;
                boolean z2 = LiveData.this.f5672c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.f5672c;
                if (!this.f5684b) {
                    i = -1;
                }
                liveData.f5672c = i2 + i;
                if (z2 && this.f5684b) {
                    LiveData.this.mo6486e();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.f5672c == 0 && !this.f5684b) {
                    liveData2.mo6487f();
                }
                if (this.f5684b) {
                    LiveData.this.mo6476a(this);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo6489a(C1459i iVar) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract boolean mo6490b();
    }

    public LiveData() {
        Object obj = f5669k;
        this.f5673d = obj;
        this.f5674e = obj;
        this.f5675f = -1;
        this.f5678i = new C1443a();
    }

    /* renamed from: b */
    private void m7648b(C1445c cVar) {
        if (cVar.f5684b) {
            if (!cVar.mo6490b()) {
                cVar.mo6492a(false);
                return;
            }
            int i = cVar.f5685c;
            int i2 = this.f5675f;
            if (i < i2) {
                cVar.f5685c = i2;
                cVar.f5683a.mo5554a(this.f5673d);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6476a(@C0195i0 C1445c cVar) {
        if (this.f5676g) {
            this.f5677h = true;
            return;
        }
        this.f5676g = true;
        do {
            this.f5677h = false;
            if (cVar == null) {
                C2087d c = this.f5671b.mo9061c();
                while (c.hasNext()) {
                    m7648b((C1445c) ((Entry) c.next()).getValue());
                    if (this.f5677h) {
                        break;
                    }
                }
            } else {
                m7648b(cVar);
                cVar = null;
            }
        } while (this.f5677h);
        this.f5676g = false;
    }

    /* renamed from: c */
    public boolean mo6484c() {
        return this.f5672c > 0;
    }

    /* renamed from: d */
    public boolean mo6485d() {
        return this.f5671b.size() > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo6486e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo6487f() {
    }

    @C0187e0
    /* renamed from: b */
    public void mo6482b(@C0193h0 C1468o<? super T> oVar) {
        m7647a("removeObserver");
        C1445c cVar = (C1445c) this.f5671b.remove(oVar);
        if (cVar != null) {
            cVar.mo6488a();
            cVar.mo6492a(false);
        }
    }

    /* access modifiers changed from: protected */
    @C0187e0
    /* renamed from: b */
    public void mo6483b(T t) {
        m7647a("setValue");
        this.f5675f++;
        this.f5673d = t;
        mo6476a(null);
    }

    @C0187e0
    /* renamed from: a */
    public void mo6478a(@C0193h0 C1459i iVar, @C0193h0 C1468o<? super T> oVar) {
        m7647a("observe");
        if (iVar.getLifecycle().mo6471a() != State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(iVar, oVar);
            C1445c cVar = (C1445c) this.f5671b.mo9055b(oVar, lifecycleBoundObserver);
            if (cVar != null && !cVar.mo6489a(iVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar == null) {
                iVar.getLifecycle().mo6472a(lifecycleBoundObserver);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo6481b() {
        return this.f5675f;
    }

    @C0187e0
    /* renamed from: a */
    public void mo6479a(@C0193h0 C1468o<? super T> oVar) {
        m7647a("observeForever");
        C1444b bVar = new C1444b(oVar);
        C1445c cVar = (C1445c) this.f5671b.mo9055b(oVar, bVar);
        if (cVar != null && (cVar instanceof LifecycleBoundObserver)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar == null) {
            bVar.mo6492a(true);
        }
    }

    @C0187e0
    /* renamed from: a */
    public void mo6477a(@C0193h0 C1459i iVar) {
        m7647a("removeObservers");
        Iterator it = this.f5671b.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((C1445c) entry.getValue()).mo6489a(iVar)) {
                mo6482b((C1468o) entry.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6480a(T t) {
        boolean z;
        synchronized (this.f5670a) {
            z = this.f5674e == f5669k;
            this.f5674e = t;
        }
        if (z) {
            C2076a.m10816c().mo9049c(this.f5678i);
        }
    }

    @C0195i0
    /* renamed from: a */
    public T mo6475a() {
        T t = this.f5673d;
        if (t != f5669k) {
            return t;
        }
        return null;
    }

    /* renamed from: a */
    private static void m7647a(String str) {
        if (!C2076a.m10816c().mo9048a()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot invoke ");
            sb.append(str);
            sb.append(" on a background");
            sb.append(" thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
