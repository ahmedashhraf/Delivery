package p468g;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import p201f.p202a.C5952h;

/* renamed from: g.p */
/* compiled from: Dispatcher */
public final class C13856p {

    /* renamed from: h */
    static final /* synthetic */ boolean f40183h = false;

    /* renamed from: a */
    private int f40184a = 64;

    /* renamed from: b */
    private int f40185b = 5;
    @C5952h

    /* renamed from: c */
    private Runnable f40186c;
    @C5952h

    /* renamed from: d */
    private ExecutorService f40187d;

    /* renamed from: e */
    private final Deque<C13804b> f40188e = new ArrayDeque();

    /* renamed from: f */
    private final Deque<C13804b> f40189f = new ArrayDeque();

    /* renamed from: g */
    private final Deque<C13802b0> f40190g = new ArrayDeque();

    public C13856p(ExecutorService executorService) {
        this.f40187d = executorService;
    }

    /* renamed from: i */
    private boolean m59181i() {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f40188e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C13804b bVar = (C13804b) it.next();
                if (this.f40189f.size() >= this.f40184a) {
                    break;
                } else if (m59180c(bVar) < this.f40185b) {
                    it.remove();
                    arrayList.add(bVar);
                    this.f40189f.add(bVar);
                }
            }
            z = mo43571h() > 0;
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((C13804b) arrayList.get(i)).mo43304a(mo43562b());
        }
        return z;
    }

    /* renamed from: a */
    public void mo43558a(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f40184a = i;
            }
            m59181i();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public synchronized ExecutorService mo43562b() {
        if (this.f40187d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C14910b.m66052a("OkHttp Dispatcher", false));
            this.f40187d = threadPoolExecutor;
        }
        return this.f40187d;
    }

    /* renamed from: c */
    public synchronized int mo43566c() {
        return this.f40184a;
    }

    /* renamed from: d */
    public synchronized int mo43567d() {
        return this.f40185b;
    }

    /* renamed from: e */
    public synchronized List<C13821e> mo43568e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C13804b c : this.f40188e) {
            arrayList.add(c.mo43306c());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: f */
    public synchronized int mo43569f() {
        return this.f40188e.size();
    }

    /* renamed from: g */
    public synchronized List<C13821e> mo43570g() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        arrayList.addAll(this.f40190g);
        for (C13804b c : this.f40189f) {
            arrayList.add(c.mo43306c());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    public synchronized int mo43571h() {
        return this.f40189f.size() + this.f40190g.size();
    }

    /* renamed from: c */
    private int m59180c(C13804b bVar) {
        int i = 0;
        for (C13804b bVar2 : this.f40189f) {
            if (!bVar2.mo43306c().f39873Q && bVar2.mo43307d().equals(bVar.mo43307d())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public void mo43563b(int i) {
        if (i >= 1) {
            synchronized (this) {
                this.f40185b = i;
            }
            m59181i();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("max < 1: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo43561a(@C5952h Runnable runnable) {
        this.f40186c = runnable;
    }

    public C13856p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43559a(C13804b bVar) {
        synchronized (this) {
            this.f40188e.add(bVar);
        }
        m59181i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43564b(C13804b bVar) {
        m59179a(this.f40189f, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43565b(C13802b0 b0Var) {
        m59179a(this.f40190g, b0Var);
    }

    /* renamed from: a */
    public synchronized void mo43557a() {
        for (C13804b c : this.f40188e) {
            c.mo43306c().cancel();
        }
        for (C13804b c2 : this.f40189f) {
            c2.mo43306c().cancel();
        }
        for (C13802b0 cancel : this.f40190g) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo43560a(C13802b0 b0Var) {
        this.f40190g.add(b0Var);
    }

    /* renamed from: a */
    private <T> void m59179a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t)) {
                runnable = this.f40186c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (!m59181i() && runnable != null) {
            runnable.run();
        }
    }
}
