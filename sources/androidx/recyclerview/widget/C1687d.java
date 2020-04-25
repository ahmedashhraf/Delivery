package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.recyclerview.widget.C1682c.C1683a;
import androidx.recyclerview.widget.C1726i.C1728b;
import androidx.recyclerview.widget.C1726i.C1729c;
import androidx.recyclerview.widget.C1726i.C1730d;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
/* compiled from: AsyncListDiffer */
public class C1687d<T> {

    /* renamed from: h */
    private static final Executor f6485h = new C1692c();

    /* renamed from: a */
    private final C1765t f6486a;

    /* renamed from: b */
    final C1682c<T> f6487b;

    /* renamed from: c */
    Executor f6488c;

    /* renamed from: d */
    private final List<C1691b<T>> f6489d;
    @C0195i0

    /* renamed from: e */
    private List<T> f6490e;
    @C0193h0

    /* renamed from: f */
    private List<T> f6491f;

    /* renamed from: g */
    int f6492g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* compiled from: AsyncListDiffer */
    class C1688a implements Runnable {

        /* renamed from: N */
        final /* synthetic */ int f6493N;

        /* renamed from: O */
        final /* synthetic */ Runnable f6494O;

        /* renamed from: a */
        final /* synthetic */ List f6496a;

        /* renamed from: b */
        final /* synthetic */ List f6497b;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        /* compiled from: AsyncListDiffer */
        class C1689a extends C1728b {
            C1689a() {
            }

            /* renamed from: a */
            public int mo7767a() {
                return C1688a.this.f6497b.size();
            }

            /* renamed from: b */
            public int mo7769b() {
                return C1688a.this.f6496a.size();
            }

            @C0195i0
            /* renamed from: c */
            public Object mo7771c(int i, int i2) {
                Object obj = C1688a.this.f6496a.get(i);
                Object obj2 = C1688a.this.f6497b.get(i2);
                if (obj != null && obj2 != null) {
                    return C1687d.this.f6487b.mo7732b().mo7886c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: a */
            public boolean mo7768a(int i, int i2) {
                Object obj = C1688a.this.f6496a.get(i);
                Object obj2 = C1688a.this.f6497b.get(i2);
                if (obj != null && obj2 != null) {
                    return C1687d.this.f6487b.mo7732b().mo7884a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public boolean mo7770b(int i, int i2) {
                Object obj = C1688a.this.f6496a.get(i);
                Object obj2 = C1688a.this.f6497b.get(i2);
                if (obj != null && obj2 != null) {
                    return C1687d.this.f6487b.mo7732b().mo7885b(obj, obj2);
                }
                return obj == null && obj2 == null;
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        /* compiled from: AsyncListDiffer */
        class C1690b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C1729c f6499a;

            C1690b(C1729c cVar) {
                this.f6499a = cVar;
            }

            public void run() {
                C1688a aVar = C1688a.this;
                C1687d dVar = C1687d.this;
                if (dVar.f6492g == aVar.f6493N) {
                    dVar.mo7763a(aVar.f6497b, this.f6499a, aVar.f6494O);
                }
            }
        }

        C1688a(List list, List list2, int i, Runnable runnable) {
            this.f6496a = list;
            this.f6497b = list2;
            this.f6493N = i;
            this.f6494O = runnable;
        }

        public void run() {
            C1687d.this.f6488c.execute(new C1690b(C1726i.m9323a(new C1689a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* compiled from: AsyncListDiffer */
    public interface C1691b<T> {
        /* renamed from: a */
        void mo7773a(@C0193h0 List<T> list, @C0193h0 List<T> list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* compiled from: AsyncListDiffer */
    private static class C1692c implements Executor {

        /* renamed from: a */
        final Handler f6501a = new Handler(Looper.getMainLooper());

        C1692c() {
        }

        public void execute(@C0193h0 Runnable runnable) {
            this.f6501a.post(runnable);
        }
    }

    public C1687d(@C0193h0 C1638g gVar, @C0193h0 C1730d<T> dVar) {
        this((C1765t) new C1678b(gVar), new C1683a(dVar).mo7735a());
    }

    /* renamed from: b */
    private void m9157b(@C0193h0 List<T> list, @C0195i0 Runnable runnable) {
        for (C1691b a : this.f6489d) {
            a.mo7773a(list, this.f6491f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @C0193h0
    /* renamed from: a */
    public List<T> mo7760a() {
        return this.f6491f;
    }

    /* renamed from: a */
    public void mo7762a(@C0195i0 List<T> list) {
        mo7764a(list, null);
    }

    /* renamed from: a */
    public void mo7764a(@C0195i0 List<T> list, @C0195i0 Runnable runnable) {
        int i = this.f6492g + 1;
        this.f6492g = i;
        List<T> list2 = this.f6490e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
            }
            return;
        }
        List<T> list3 = this.f6491f;
        if (list == null) {
            int size = list2.size();
            this.f6490e = null;
            this.f6491f = Collections.emptyList();
            this.f6486a.mo7721c(0, size);
            m9157b(list3, runnable);
        } else if (list2 == null) {
            this.f6490e = list;
            this.f6491f = Collections.unmodifiableList(list);
            this.f6486a.mo7720b(0, list.size());
            m9157b(list3, runnable);
        } else {
            Executor a = this.f6487b.mo7731a();
            C1688a aVar = new C1688a(list2, list, i, runnable);
            a.execute(aVar);
        }
    }

    public C1687d(@C0193h0 C1765t tVar, @C0193h0 C1682c<T> cVar) {
        this.f6489d = new CopyOnWriteArrayList();
        this.f6491f = Collections.emptyList();
        this.f6486a = tVar;
        this.f6487b = cVar;
        if (cVar.mo7733c() != null) {
            this.f6488c = cVar.mo7733c();
        } else {
            this.f6488c = f6485h;
        }
    }

    /* renamed from: b */
    public void mo7765b(@C0193h0 C1691b<T> bVar) {
        this.f6489d.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7763a(@C0193h0 List<T> list, @C0193h0 C1729c cVar, @C0195i0 Runnable runnable) {
        List<T> list2 = this.f6491f;
        this.f6490e = list;
        this.f6491f = Collections.unmodifiableList(list);
        cVar.mo7882a(this.f6486a);
        m9157b(list2, runnable);
    }

    /* renamed from: a */
    public void mo7761a(@C0193h0 C1691b<T> bVar) {
        this.f6489d.add(bVar);
    }
}
