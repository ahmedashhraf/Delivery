package com.google.common.collect;

import com.google.common.base.C7359j;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import java.util.concurrent.ConcurrentMap;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2777c;

@C2775a
/* renamed from: com.google.common.collect.r3 */
/* compiled from: Interners */
public final class C8128r3 {

    /* renamed from: com.google.common.collect.r3$a */
    /* compiled from: Interners */
    static class C8129a implements C8108q3<E> {

        /* renamed from: a */
        final /* synthetic */ ConcurrentMap f21940a;

        C8129a(ConcurrentMap concurrentMap) {
            this.f21940a = concurrentMap;
        }

        /* renamed from: a */
        public E mo30957a(E e) {
            Object putIfAbsent = this.f21940a.putIfAbsent(C7397x.m35664a(e), e);
            return putIfAbsent == null ? e : putIfAbsent;
        }
    }

    /* renamed from: com.google.common.collect.r3$b */
    /* compiled from: Interners */
    private static class C8130b<E> implements C7380p<E, E> {

        /* renamed from: a */
        private final C8108q3<E> f21941a;

        public C8130b(C8108q3<E> q3Var) {
            this.f21941a = q3Var;
        }

        public E apply(E e) {
            return this.f21941a.mo30957a(e);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8130b)) {
                return false;
            }
            return this.f21941a.equals(((C8130b) obj).f21941a);
        }

        public int hashCode() {
            return this.f21941a.hashCode();
        }
    }

    /* renamed from: com.google.common.collect.r3$c */
    /* compiled from: Interners */
    private static class C8131c<E> implements C8108q3<E> {

        /* renamed from: a */
        private final C7717e4<E, C8132a> f21942a;

        /* renamed from: com.google.common.collect.r3$c$a */
        /* compiled from: Interners */
        private enum C8132a {
            VALUE
        }

        private C8131c() {
            this.f21942a = new C7660d4().m36631e().m36616a(C7359j.m35591d()).mo29952b();
        }

        /* renamed from: a */
        public E mo30957a(E e) {
            do {
                C7755o b = this.f21942a.mo30152b((Object) e);
                if (b != null) {
                    E key = b.getKey();
                    if (key != null) {
                        return key;
                    }
                }
            } while (((C8132a) this.f21942a.putIfAbsent(e, C8132a.VALUE)) != null);
            return e;
        }

        /* synthetic */ C8131c(C8129a aVar) {
            this();
        }
    }

    private C8128r3() {
    }

    /* renamed from: a */
    public static <E> C8108q3<E> m38931a() {
        return new C8129a(new C7660d4().mo29954c());
    }

    @C2777c("java.lang.ref.WeakReference")
    /* renamed from: b */
    public static <E> C8108q3<E> m38932b() {
        return new C8131c(null);
    }

    /* renamed from: a */
    public static <E> C7380p<E, E> m38930a(C8108q3<E> q3Var) {
        return new C8130b((C8108q3) C7397x.m35664a(q3Var));
    }
}
