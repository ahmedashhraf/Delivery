package kotlin.p219v0;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6096e0(version = "1.1")
@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b'\u0018\u0000 \u000b*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, mo24990d2 = {"Lkotlin/collections/AbstractSet;", "E", "Lkotlin/collections/AbstractCollection;", "", "()V", "equals", "", "other", "", "hashCode", "", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.v0.j */
/* compiled from: AbstractSet.kt */
public abstract class C14784j<E> extends C14744a<E> implements Set<E>, C14464a {

    /* renamed from: a */
    public static final C14785a f43037a = new C14785a(null);

    /* renamed from: kotlin.v0.j$a */
    /* compiled from: AbstractSet.kt */
    public static final class C14785a {
        private C14785a() {
        }

        /* renamed from: a */
        public final int mo46195a(@C6003d Collection<?> collection) {
            C14445h0.m62478f(collection, "c");
            int i = 0;
            for (Object next : collection) {
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }

        public /* synthetic */ C14785a(C14487u uVar) {
            this();
        }

        /* renamed from: a */
        public final boolean mo46196a(@C6003d Set<?> set, @C6003d Set<?> set2) {
            C14445h0.m62478f(set, "c");
            C14445h0.m62478f(set2, FacebookRequestErrorClassification.KEY_OTHER);
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }
    }

    protected C14784j() {
    }

    public boolean equals(@C6004e Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f43037a.mo46196a(this, (Set) obj);
    }

    public int hashCode() {
        return f43037a.mo46195a(this);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
