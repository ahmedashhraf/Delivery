package p076c.p082c.p083a;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.List;
import java.util.Queue;
import p076c.p082c.p083a.p084a0.C2216i;
import p076c.p082c.p083a.p108y.p109i.C2535c;
import p076c.p082c.p083a.p108y.p110j.C2549b;
import p076c.p082c.p083a.p108y.p110j.C2558k;
import p076c.p082c.p083a.p108y.p110j.C2561m;

/* renamed from: c.c.a.n */
/* compiled from: ListPreloader */
public class C2236n<T> implements OnScrollListener {

    /* renamed from: a */
    private final int f8855a;

    /* renamed from: b */
    private final C2242f f8856b;

    /* renamed from: c */
    private final C2239c<T> f8857c;

    /* renamed from: d */
    private final C2240d<T> f8858d;

    /* renamed from: e */
    private int f8859e;

    /* renamed from: f */
    private int f8860f;

    /* renamed from: g */
    private int f8861g;

    /* renamed from: h */
    private int f8862h;

    /* renamed from: i */
    private boolean f8863i;

    /* renamed from: c.c.a.n$a */
    /* compiled from: ListPreloader */
    class C2237a implements C2239c<T> {
        C2237a() {
        }

        /* renamed from: a */
        public List<T> mo9505a(int i) {
            return C2236n.this.mo9499a(i, i + 1);
        }

        /* renamed from: a */
        public C2226h mo9504a(T t) {
            return C2236n.this.mo9501b(t);
        }
    }

    /* renamed from: c.c.a.n$b */
    /* compiled from: ListPreloader */
    class C2238b implements C2240d<T> {
        C2238b() {
        }

        /* renamed from: a */
        public int[] mo9380a(T t, int i, int i2) {
            return C2236n.this.mo9500a(t);
        }
    }

    /* renamed from: c.c.a.n$c */
    /* compiled from: ListPreloader */
    public interface C2239c<U> {
        /* renamed from: a */
        C2226h mo9504a(U u);

        /* renamed from: a */
        List<U> mo9505a(int i);
    }

    /* renamed from: c.c.a.n$d */
    /* compiled from: ListPreloader */
    public interface C2240d<T> {
        /* renamed from: a */
        int[] mo9380a(T t, int i, int i2);
    }

    /* renamed from: c.c.a.n$e */
    /* compiled from: ListPreloader */
    private static class C2241e extends C2549b<Object> {
        /* access modifiers changed from: private */

        /* renamed from: N */
        public int f8866N;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f8867b;

        private C2241e() {
        }

        /* renamed from: a */
        public void mo9404a(Object obj, C2535c<? super Object> cVar) {
        }

        /* synthetic */ C2241e(C2237a aVar) {
            this();
        }

        /* renamed from: a */
        public void mo9506a(C2558k kVar) {
            kVar.mo9402a(this.f8866N, this.f8867b);
        }
    }

    /* renamed from: c.c.a.n$f */
    /* compiled from: ListPreloader */
    private static final class C2242f {

        /* renamed from: a */
        private final Queue<C2241e> f8868a;

        public C2242f(int i) {
            this.f8868a = C2216i.m11342a(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f8868a.offer(new C2241e(null));
            }
        }

        /* renamed from: a */
        public C2241e mo9507a(int i, int i2) {
            C2241e eVar = (C2241e) this.f8868a.poll();
            this.f8868a.offer(eVar);
            eVar.f8866N = i;
            eVar.f8867b = i2;
            return eVar;
        }
    }

    @Deprecated
    public C2236n(int i) {
        this.f8863i = true;
        this.f8857c = new C2237a();
        this.f8858d = new C2238b();
        this.f8855a = i;
        this.f8856b = new C2242f(i + 1);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public int[] mo9500a(T t) {
        throw new IllegalStateException("You must either provide a PreloadDimensionProvider or override getDimensions()");
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C2226h mo9501b(T t) {
        throw new IllegalStateException("You must either provide a PreloadModelProvider, or override getRequestBuilder()");
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.f8862h = i3;
        int i4 = this.f8861g;
        if (i > i4) {
            m11685a(i2 + i, true);
        } else if (i < i4) {
            m11685a(i, false);
        }
        this.f8861g = i;
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* renamed from: b */
    private void m11688b(int i, int i2) {
        int i3;
        int i4;
        if (i < i2) {
            i3 = Math.max(this.f8859e, i);
            i4 = i2;
        } else {
            i4 = Math.min(this.f8860f, i);
            i3 = i2;
        }
        int min = Math.min(this.f8862h, i4);
        int min2 = Math.min(this.f8862h, Math.max(0, i3));
        if (i < i2) {
            for (int i5 = min2; i5 < min; i5++) {
                m11687a(this.f8857c.mo9505a(i5), i5, true);
            }
        } else {
            for (int i6 = min - 1; i6 >= min2; i6--) {
                m11687a(this.f8857c.mo9505a(i6), i6, false);
            }
        }
        this.f8860f = min2;
        this.f8859e = min;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public List<T> mo9499a(int i, int i2) {
        throw new IllegalStateException("You must either provide a PreloadModelProvider or override getItems()");
    }

    /* renamed from: a */
    private void m11685a(int i, boolean z) {
        if (this.f8863i != z) {
            this.f8863i = z;
            m11684a();
        }
        m11688b(i, (z ? this.f8855a : -this.f8855a) + i);
    }

    public C2236n(C2239c<T> cVar, C2240d<T> dVar, int i) {
        this.f8863i = true;
        this.f8857c = cVar;
        this.f8858d = dVar;
        this.f8855a = i;
        this.f8856b = new C2242f(i + 1);
    }

    /* renamed from: a */
    private void m11687a(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                m11686a((T) list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            m11686a((T) list.get(i3), i, i3);
        }
    }

    /* renamed from: a */
    private void m11686a(T t, int i, int i2) {
        int[] a = this.f8858d.mo9380a(t, i, i2);
        if (a != null) {
            this.f8857c.mo9504a(t).mo9458b(this.f8856b.mo9507a(a[0], a[1]));
        }
    }

    /* renamed from: a */
    private void m11684a() {
        for (int i = 0; i < this.f8855a; i++) {
            C2232l.m11645a((C2561m<?>) this.f8856b.mo9507a(0, 0));
        }
    }
}
