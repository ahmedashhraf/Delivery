package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.recyclerview.widget.C1726i.C1730d;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: AsyncDifferConfig */
public final class C1682c<T> {
    @C0195i0

    /* renamed from: a */
    private final Executor f6460a;
    @C0193h0

    /* renamed from: b */
    private final Executor f6461b;
    @C0193h0

    /* renamed from: c */
    private final C1730d<T> f6462c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: AsyncDifferConfig */
    public static final class C1683a<T> {

        /* renamed from: d */
        private static final Object f6463d = new Object();

        /* renamed from: e */
        private static Executor f6464e;
        @C0195i0

        /* renamed from: a */
        private Executor f6465a;

        /* renamed from: b */
        private Executor f6466b;

        /* renamed from: c */
        private final C1730d<T> f6467c;

        public C1683a(@C0193h0 C1730d<T> dVar) {
            this.f6467c = dVar;
        }

        @C0193h0
        /* renamed from: a */
        public C1683a<T> mo7734a(Executor executor) {
            this.f6466b = executor;
            return this;
        }

        @C0193h0
        @C0207n0({C0208a.LIBRARY})
        /* renamed from: b */
        public C1683a<T> mo7736b(Executor executor) {
            this.f6465a = executor;
            return this;
        }

        @C0193h0
        /* renamed from: a */
        public C1682c<T> mo7735a() {
            if (this.f6466b == null) {
                synchronized (f6463d) {
                    if (f6464e == null) {
                        f6464e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f6466b = f6464e;
            }
            return new C1682c<>(this.f6465a, this.f6466b, this.f6467c);
        }
    }

    C1682c(@C0195i0 Executor executor, @C0193h0 Executor executor2, @C0193h0 C1730d<T> dVar) {
        this.f6460a = executor;
        this.f6461b = executor2;
        this.f6462c = dVar;
    }

    @C0193h0
    /* renamed from: a */
    public Executor mo7731a() {
        return this.f6461b;
    }

    @C0193h0
    /* renamed from: b */
    public C1730d<T> mo7732b() {
        return this.f6462c;
    }

    @C0207n0({C0208a.LIBRARY})
    @C0195i0
    /* renamed from: c */
    public Executor mo7733c() {
        return this.f6460a;
    }
}
