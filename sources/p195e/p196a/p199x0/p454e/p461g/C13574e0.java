package p195e.p196a.p199x0.p454e.p461g;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import p195e.p196a.C5923b0;
import p195e.p196a.C5929l;
import p195e.p196a.C5930q0;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.g.e0 */
/* compiled from: SingleInternalHelper */
public final class C13574e0 {

    /* renamed from: e.a.x0.e.g.e0$a */
    /* compiled from: SingleInternalHelper */
    enum C13575a implements Callable<NoSuchElementException> {
        INSTANCE;

        public NoSuchElementException call() throws Exception {
            return new NoSuchElementException();
        }
    }

    /* renamed from: e.a.x0.e.g.e0$b */
    /* compiled from: SingleInternalHelper */
    enum C13576b implements C12339o<C5930q0, C6007b> {
        INSTANCE;

        /* renamed from: a */
        public C6007b apply(C5930q0 q0Var) {
            return new C13627q0(q0Var);
        }
    }

    /* renamed from: e.a.x0.e.g.e0$c */
    /* compiled from: SingleInternalHelper */
    static final class C13577c<T> implements Iterable<C5929l<T>> {

        /* renamed from: a */
        private final Iterable<? extends C5930q0<? extends T>> f39328a;

        C13577c(Iterable<? extends C5930q0<? extends T>> iterable) {
            this.f39328a = iterable;
        }

        public Iterator<C5929l<T>> iterator() {
            return new C13578d(this.f39328a.iterator());
        }
    }

    /* renamed from: e.a.x0.e.g.e0$d */
    /* compiled from: SingleInternalHelper */
    static final class C13578d<T> implements Iterator<C5929l<T>> {

        /* renamed from: a */
        private final Iterator<? extends C5930q0<? extends T>> f39329a;

        C13578d(Iterator<? extends C5930q0<? extends T>> it) {
            this.f39329a = it;
        }

        public boolean hasNext() {
            return this.f39329a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C5929l<T> next() {
            return new C13627q0((C5930q0) this.f39329a.next());
        }
    }

    /* renamed from: e.a.x0.e.g.e0$e */
    /* compiled from: SingleInternalHelper */
    enum C13579e implements C12339o<C5930q0, C5923b0> {
        INSTANCE;

        /* renamed from: a */
        public C5923b0 apply(C5930q0 q0Var) {
            return new C13631r0(q0Var);
        }
    }

    private C13574e0() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> Callable<NoSuchElementException> m58310a() {
        return C13575a.INSTANCE;
    }

    /* renamed from: b */
    public static <T> C12339o<C5930q0<? extends T>, C6007b<? extends T>> m58311b() {
        return C13576b.INSTANCE;
    }

    /* renamed from: c */
    public static <T> C12339o<C5930q0<? extends T>, C5923b0<? extends T>> m58312c() {
        return C13579e.INSTANCE;
    }

    /* renamed from: a */
    public static <T> Iterable<? extends C5929l<T>> m58309a(Iterable<? extends C5930q0<? extends T>> iterable) {
        return new C13577c(iterable);
    }
}
