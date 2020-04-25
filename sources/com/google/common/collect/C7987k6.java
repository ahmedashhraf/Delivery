package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.k6 */
/* compiled from: TreeTraverser */
public abstract class C7987k6<T> {

    /* renamed from: com.google.common.collect.k6$a */
    /* compiled from: TreeTraverser */
    class C7988a extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Object f21746b;

        C7988a(Object obj) {
            this.f21746b = obj;
        }

        public C8023l6<T> iterator() {
            return C7987k6.this.mo30747e(this.f21746b);
        }
    }

    /* renamed from: com.google.common.collect.k6$b */
    /* compiled from: TreeTraverser */
    class C7989b extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Object f21748b;

        C7989b(Object obj) {
            this.f21748b = obj;
        }

        public C8023l6<T> iterator() {
            return C7987k6.this.mo30745c(this.f21748b);
        }
    }

    /* renamed from: com.google.common.collect.k6$c */
    /* compiled from: TreeTraverser */
    class C7990c extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Object f21750b;

        C7990c(Object obj) {
            this.f21750b = obj;
        }

        public C8023l6<T> iterator() {
            return new C7991d(this.f21750b);
        }
    }

    /* renamed from: com.google.common.collect.k6$d */
    /* compiled from: TreeTraverser */
    private final class C7991d extends C8023l6<T> implements C8164s4<T> {

        /* renamed from: a */
        private final Queue<T> f21751a = new LinkedList();

        C7991d(T t) {
            this.f21751a.add(t);
        }

        public boolean hasNext() {
            return !this.f21751a.isEmpty();
        }

        public T next() {
            T remove = this.f21751a.remove();
            C8145s3.m39018a((Collection<T>) this.f21751a, C7987k6.this.mo30744b(remove));
            return remove;
        }

        public T peek() {
            return this.f21751a.element();
        }
    }

    /* renamed from: com.google.common.collect.k6$e */
    /* compiled from: TreeTraverser */
    private final class C7992e extends C7603c<T> {

        /* renamed from: N */
        private final LinkedList<C7993f<T>> f21753N = new LinkedList<>();

        C7992e(T t) {
            this.f21753N.addLast(m38257a(t));
        }

        /* renamed from: a */
        private C7993f<T> m38257a(T t) {
            return new C7993f<>(t, C7987k6.this.mo30744b(t).iterator());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo29748b() {
            while (!this.f21753N.isEmpty()) {
                C7993f fVar = (C7993f) this.f21753N.getLast();
                if (fVar.f21756b.hasNext()) {
                    this.f21753N.addLast(m38257a(fVar.f21756b.next()));
                } else {
                    this.f21753N.removeLast();
                    return fVar.f21755a;
                }
            }
            return mo29793c();
        }
    }

    /* renamed from: com.google.common.collect.k6$f */
    /* compiled from: TreeTraverser */
    private static final class C7993f<T> {

        /* renamed from: a */
        final T f21755a;

        /* renamed from: b */
        final Iterator<T> f21756b;

        C7993f(T t, Iterator<T> it) {
            this.f21755a = C7397x.m35664a(t);
            this.f21756b = (Iterator) C7397x.m35664a(it);
        }
    }

    /* renamed from: com.google.common.collect.k6$g */
    /* compiled from: TreeTraverser */
    private final class C7994g extends C8023l6<T> {

        /* renamed from: a */
        private final LinkedList<Iterator<T>> f21757a = new LinkedList<>();

        C7994g(T t) {
            this.f21757a.addLast(C8178t3.m39089a(C7397x.m35664a(t)));
        }

        public boolean hasNext() {
            return !this.f21757a.isEmpty();
        }

        public T next() {
            Iterator it = (Iterator) this.f21757a.getLast();
            T a = C7397x.m35664a(it.next());
            if (!it.hasNext()) {
                this.f21757a.removeLast();
            }
            Iterator it2 = C7987k6.this.mo30744b(a).iterator();
            if (it2.hasNext()) {
                this.f21757a.addLast(it2);
            }
            return a;
        }
    }

    /* renamed from: a */
    public final C5838k1<T> mo30743a(T t) {
        C7397x.m35664a(t);
        return new C7990c(t);
    }

    /* renamed from: b */
    public abstract Iterable<T> mo30744b(T t);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8023l6<T> mo30745c(T t) {
        return new C7992e(t);
    }

    /* renamed from: d */
    public final C5838k1<T> mo30746d(T t) {
        C7397x.m35664a(t);
        return new C7989b(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8023l6<T> mo30747e(T t) {
        return new C7994g(t);
    }

    /* renamed from: f */
    public final C5838k1<T> mo30748f(T t) {
        C7397x.m35664a(t);
        return new C7988a(t);
    }
}
