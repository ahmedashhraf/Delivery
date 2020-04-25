package p195e.p196a.p199x0.p200j;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.x0.j.k */
/* compiled from: ExceptionHelper */
public final class C13754k {

    /* renamed from: a */
    public static final Throwable f39801a = new C13755a();

    /* renamed from: e.a.x0.j.k$a */
    /* compiled from: ExceptionHelper */
    static final class C13755a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        C13755a() {
            super("No further exceptions");
        }

        public Throwable fillInStackTrace() {
            return this;
        }
    }

    private C13754k() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T> boolean m58722a(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = (Throwable) atomicReference.get();
            if (th2 == f39801a) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m58723b(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: c */
    public static RuntimeException m58724c(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public static <T> Throwable m58720a(AtomicReference<Throwable> atomicReference) {
        Throwable th = (Throwable) atomicReference.get();
        Throwable th2 = f39801a;
        return th != th2 ? (Throwable) atomicReference.getAndSet(th2) : th;
    }

    /* renamed from: a */
    public static List<Throwable> m58721a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.offer(th);
        while (!arrayDeque.isEmpty()) {
            Throwable th2 = (Throwable) arrayDeque.removeFirst();
            if (th2 instanceof CompositeException) {
                List a = ((CompositeException) th2).mo45510a();
                for (int size = a.size() - 1; size >= 0; size--) {
                    arrayDeque.offerFirst(a.get(size));
                }
            } else {
                arrayList.add(th2);
            }
        }
        return arrayList;
    }
}
