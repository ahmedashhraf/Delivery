package com.google.common.collect;

import com.google.common.base.C7392u;
import com.google.common.base.C7397x;
import java.util.BitSet;
import java.util.Iterator;
import java.util.LinkedList;
import p076c.p112d.p148d.p149a.C2775a;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b(emulated = true)
@C2775a
/* renamed from: com.google.common.collect.t */
/* compiled from: BinaryTreeTraverser */
public abstract class C8166t<T> extends C7987k6<T> {

    /* renamed from: com.google.common.collect.t$a */
    /* compiled from: BinaryTreeTraverser */
    class C8167a extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Object f21981b;

        /* renamed from: com.google.common.collect.t$a$a */
        /* compiled from: BinaryTreeTraverser */
        class C8168a extends C7603c<T> {

            /* renamed from: N */
            boolean f21982N;

            /* renamed from: O */
            boolean f21983O;

            C8168a() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: b */
            public T mo29748b() {
                if (!this.f21982N) {
                    this.f21982N = true;
                    C8167a aVar = C8167a.this;
                    C7392u h = C8166t.this.mo31041h(aVar.f21981b);
                    if (h.mo29186e()) {
                        return h.mo29185d();
                    }
                }
                if (!this.f21983O) {
                    this.f21983O = true;
                    C8167a aVar2 = C8167a.this;
                    C7392u i = C8166t.this.mo31042i(aVar2.f21981b);
                    if (i.mo29186e()) {
                        return i.mo29185d();
                    }
                }
                return mo29793c();
            }
        }

        C8167a(Object obj) {
            this.f21981b = obj;
        }

        public Iterator<T> iterator() {
            return new C8168a();
        }
    }

    /* renamed from: com.google.common.collect.t$b */
    /* compiled from: BinaryTreeTraverser */
    class C8169b extends C5838k1<T> {

        /* renamed from: b */
        final /* synthetic */ Object f21986b;

        C8169b(Object obj) {
            this.f21986b = obj;
        }

        public C8023l6<T> iterator() {
            return new C8170c(this.f21986b);
        }
    }

    /* renamed from: com.google.common.collect.t$c */
    /* compiled from: BinaryTreeTraverser */
    private final class C8170c extends C7603c<T> {

        /* renamed from: N */
        private final LinkedList<T> f21987N = new LinkedList<>();

        /* renamed from: O */
        private final BitSet f21988O = new BitSet();

        C8170c(T t) {
            this.f21987N.addLast(t);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public T mo29748b() {
            while (!this.f21987N.isEmpty()) {
                T last = this.f21987N.getLast();
                if (this.f21988O.get(this.f21987N.size() - 1)) {
                    this.f21987N.removeLast();
                    this.f21988O.clear(this.f21987N.size());
                    C8166t.m39058b(this.f21987N, C8166t.this.mo31042i(last));
                    return last;
                }
                this.f21988O.set(this.f21987N.size() - 1);
                C8166t.m39058b(this.f21987N, C8166t.this.mo31041h(last));
            }
            return mo29793c();
        }
    }

    /* renamed from: com.google.common.collect.t$d */
    /* compiled from: BinaryTreeTraverser */
    private final class C8171d extends C8023l6<T> {

        /* renamed from: a */
        private final LinkedList<T> f21991a = new LinkedList<>();

        /* renamed from: b */
        private final BitSet f21992b;

        C8171d(T t) {
            this.f21991a.addLast(t);
            this.f21992b = new BitSet();
        }

        public boolean hasNext() {
            return !this.f21991a.isEmpty();
        }

        public T next() {
            while (true) {
                T last = this.f21991a.getLast();
                if (this.f21992b.get(this.f21991a.size() - 1)) {
                    this.f21991a.removeLast();
                    this.f21992b.clear(this.f21991a.size());
                    return last;
                }
                this.f21992b.set(this.f21991a.size() - 1);
                C8166t.m39058b(this.f21991a, C8166t.this.mo31042i(last));
                C8166t.m39058b(this.f21991a, C8166t.this.mo31041h(last));
            }
        }
    }

    /* renamed from: com.google.common.collect.t$e */
    /* compiled from: BinaryTreeTraverser */
    private final class C8172e extends C8023l6<T> implements C8164s4<T> {

        /* renamed from: a */
        private final LinkedList<T> f21993a = new LinkedList<>();

        C8172e(T t) {
            this.f21993a.addLast(t);
        }

        public boolean hasNext() {
            return !this.f21993a.isEmpty();
        }

        public T next() {
            T removeLast = this.f21993a.removeLast();
            C8166t.m39058b(this.f21993a, C8166t.this.mo31042i(removeLast));
            C8166t.m39058b(this.f21993a, C8166t.this.mo31041h(removeLast));
            return removeLast;
        }

        public T peek() {
            return this.f21993a.getLast();
        }
    }

    /* renamed from: b */
    public final Iterable<T> mo30744b(T t) {
        C7397x.m35664a(t);
        return new C8167a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C8023l6<T> mo30745c(T t) {
        return new C8171d(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C8023l6<T> mo30747e(T t) {
        return new C8172e(t);
    }

    /* renamed from: g */
    public final C5838k1<T> mo31040g(T t) {
        C7397x.m35664a(t);
        return new C8169b(t);
    }

    /* renamed from: h */
    public abstract C7392u<T> mo31041h(T t);

    /* renamed from: i */
    public abstract C7392u<T> mo31042i(T t);

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> void m39058b(LinkedList<T> linkedList, C7392u<T> uVar) {
        if (uVar.mo29186e()) {
            linkedList.addLast(uVar.mo29185d());
        }
    }
}
