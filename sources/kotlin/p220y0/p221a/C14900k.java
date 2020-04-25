package kotlin.p220y0.p221a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C14737p0;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import kotlin.p220y0.p221a.p222n.C6138b;
import kotlin.p220y0.p221a.p511o.p512a.C14906b;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

/* renamed from: kotlin.y0.a.k */
/* compiled from: SequenceBuilder.kt */
final class C14900k<T> extends C14899j<T> implements Iterator<T>, C14884c<C14737p0>, C14464a {

    /* renamed from: N */
    private Iterator<? extends T> f43142N;
    @C6004e

    /* renamed from: O */
    private C14884c<? super C14737p0> f43143O;

    /* renamed from: a */
    private int f43144a;

    /* renamed from: b */
    private T f43145b;

    /* renamed from: d */
    private final Throwable m66001d() {
        int i = this.f43144a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state of the iterator: ");
        sb.append(this.f43144a);
        return new IllegalStateException(sb.toString());
    }

    /* renamed from: g */
    private final T m66002g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    public final void mo46359a(@C6004e C14884c<? super C14737p0> cVar) {
        this.f43143O = cVar;
    }

    @C6003d
    /* renamed from: c */
    public C14888e mo25006c() {
        return C14895g.f43134b;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.f43144a;
            if (i != 0) {
                if (i == 1) {
                    Iterator<? extends T> it = this.f43142N;
                    if (it == null) {
                        C14445h0.m62474e();
                    }
                    if (it.hasNext()) {
                        this.f43144a = 2;
                        return true;
                    }
                    this.f43142N = null;
                } else if (i == 2 || i == 3) {
                    return true;
                } else {
                    if (i == 4) {
                        return false;
                    }
                    throw m66001d();
                }
            }
            this.f43144a = 5;
            C14884c<? super C14737p0> cVar = this.f43143O;
            if (cVar == null) {
                C14445h0.m62474e();
            }
            this.f43143O = null;
            cVar.mo25005b(C14737p0.f42983a);
        }
    }

    public T next() {
        int i = this.f43144a;
        if (i == 0 || i == 1) {
            return m66002g();
        }
        if (i == 2) {
            this.f43144a = 1;
            Iterator<? extends T> it = this.f43142N;
            if (it == null) {
                C14445h0.m62474e();
            }
            return it.next();
        } else if (i == 3) {
            this.f43144a = 0;
            T t = this.f43145b;
            this.f43145b = null;
            return t;
        } else {
            throw m66001d();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6004e
    /* renamed from: a */
    public Object mo46355a(T t, @C6003d C14884c<? super C14737p0> cVar) {
        this.f43145b = t;
        this.f43144a = 3;
        mo46359a(C14906b.m66024a(cVar));
        return C6138b.m28215c();
    }

    @C6004e
    /* renamed from: b */
    public final C14884c<C14737p0> mo46360b() {
        return this.f43143O;
    }

    @C6004e
    /* renamed from: a */
    public Object mo46356a(@C6003d Iterator<? extends T> it, @C6003d C14884c<? super C14737p0> cVar) {
        if (!it.hasNext()) {
            return C14737p0.f42983a;
        }
        this.f43142N = it;
        this.f43144a = 2;
        mo46359a(C14906b.m66024a(cVar));
        return C6138b.m28215c();
    }

    /* renamed from: a */
    public void mo25005b(@C6003d C14737p0 p0Var) {
        C14445h0.m62478f(p0Var, "value");
        this.f43144a = 4;
    }

    /* renamed from: a */
    public void mo25003a(@C6003d Throwable th) {
        C14445h0.m62478f(th, "exception");
        throw th;
    }
}
