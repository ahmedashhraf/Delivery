package kotlin.p219v0;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\b\b'\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0004\u001d\u001e\u001f B\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H¦\u0002¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0016J\u001a\u0010\u0011\u001a\u00020\u00062\u000b\u0010\u0012\u001a\u00078\u0000¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00062\u000b\u0010\u0012\u001a\u00078\u0000¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006!"}, mo24990d2 = {"Lkotlin/collections/AbstractList;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "size", "", "getSize", "()I", "equals", "", "other", "", "get", "index", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "element", "Lkotlin/UnsafeVariance;", "(Ljava/lang/Object;)I", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "Companion", "IteratorImpl", "ListIteratorImpl", "SubList", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.d */
/* compiled from: AbstractList.kt */
public abstract class C14755d<E> extends C14744a<E> implements List<E>, C14464a {

    /* renamed from: a */
    public static final C14756a f43001a = new C14756a(null);

    /* renamed from: kotlin.v0.d$a */
    /* compiled from: AbstractList.kt */
    public static final class C14756a {
        private C14756a() {
        }

        /* renamed from: a */
        public final void mo46073a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        /* renamed from: b */
        public final void mo46076b(int i, int i2) {
            if (i < 0 || i > i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("index: ");
                sb.append(i);
                sb.append(", size: ");
                sb.append(i2);
                throw new IndexOutOfBoundsException(sb.toString());
            }
        }

        public /* synthetic */ C14756a(C14487u uVar) {
            this();
        }

        /* renamed from: a */
        public final void mo46074a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(i);
                sb.append(", toIndex: ");
                sb.append(i2);
                sb.append(", size: ");
                sb.append(i3);
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i > i2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append(" > toIndex: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: a */
        public final int mo46072a(@C6003d Collection<?> collection) {
            C14445h0.m62478f(collection, "c");
            int i = 1;
            for (Object next : collection) {
                i = (i * 31) + (next != null ? next.hashCode() : 0);
            }
            return i;
        }

        /* renamed from: a */
        public final boolean mo46075a(@C6003d Collection<?> collection, @C6003d Collection<?> collection2) {
            C14445h0.m62478f(collection, "c");
            C14445h0.m62478f(collection2, FacebookRequestErrorClassification.KEY_OTHER);
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            for (Object a : collection) {
                if (!C14445h0.m62463a(a, it.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: kotlin.v0.d$b */
    /* compiled from: AbstractList.kt */
    private class C14757b implements Iterator<E>, C14464a {

        /* renamed from: a */
        private int f43002a;

        public C14757b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo46077a(int i) {
            this.f43002a = i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final int mo46078b() {
            return this.f43002a;
        }

        public boolean hasNext() {
            return this.f43002a < C14755d.this.size();
        }

        public E next() {
            if (hasNext()) {
                C14755d dVar = C14755d.this;
                int i = this.f43002a;
                this.f43002a = i + 1;
                return dVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.v0.d$c */
    /* compiled from: AbstractList.kt */
    private class C14758c extends C14757b implements ListIterator<E>, C14464a {
        public C14758c(int i) {
            super();
            C14755d.f43001a.mo46076b(i, C14755d.this.size());
            mo46077a(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo46078b() > 0;
        }

        public int nextIndex() {
            return mo46078b();
        }

        public E previous() {
            if (hasPrevious()) {
                C14755d dVar = C14755d.this;
                mo46077a(mo46078b() - 1);
                return dVar.get(mo46078b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo46078b() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.v0.d$d */
    /* compiled from: AbstractList.kt */
    private static final class C14759d<E> extends C14755d<E> implements RandomAccess {

        /* renamed from: N */
        private final C14755d<E> f43005N;

        /* renamed from: O */
        private final int f43006O;

        /* renamed from: b */
        private int f43007b;

        public C14759d(@C6003d C14755d<? extends E> dVar, int i, int i2) {
            C14445h0.m62478f(dVar, "list");
            this.f43005N = dVar;
            this.f43006O = i;
            C14755d.f43001a.mo46074a(this.f43006O, i2, this.f43005N.size());
            this.f43007b = i2 - this.f43006O;
        }

        /* renamed from: b */
        public int mo45907b() {
            return this.f43007b;
        }

        public E get(int i) {
            C14755d.f43001a.mo46073a(i, this.f43007b);
            return this.f43005N.get(this.f43006O + i);
        }
    }

    protected C14755d() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public abstract int mo45907b();

    public boolean equals(@C6004e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f43001a.mo46075a((Collection<?>) this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f43001a.mo46072a(this);
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (C14445h0.m62463a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C6003d
    public Iterator<E> iterator() {
        return new C14757b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C14445h0.m62463a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @C6003d
    public ListIterator<E> listIterator() {
        return new C14758c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C6003d
    public List<E> subList(int i, int i2) {
        return new C14759d(this, i, i2);
    }

    @C6003d
    public ListIterator<E> listIterator(int i) {
        return new C14758c(i);
    }
}
