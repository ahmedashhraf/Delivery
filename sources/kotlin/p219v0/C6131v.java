package kotlin.p219v0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.C14731m0;
import kotlin.C14854w;
import kotlin.C6050b0;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.p500n1.C14464a;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000:\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a \u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0001\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a,\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0000\u001a\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a\u001d\u0010\u0011\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\fH\u0002¢\u0006\u0002\b\u0013\u001a@\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00100\u0015\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u00150\u0001¨\u0006\u0017"}, mo24990d2 = {"Iterable", "", "T", "iterator", "Lkotlin/Function0;", "", "collectionSizeOrDefault", "", "default", "collectionSizeOrNull", "(Ljava/lang/Iterable;)Ljava/lang/Integer;", "convertToSetForSetOperation", "", "convertToSetForSetOperationWith", "source", "flatten", "", "safeToConvertToSet", "", "safeToConvertToSet$CollectionsKt__IterablesKt", "unzip", "Lkotlin/Pair;", "R", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.v0.v */
/* compiled from: Iterables.kt */
class C6131v extends C6129u {

    /* renamed from: kotlin.v0.v$a */
    /* compiled from: Iterables.kt */
    public static final class C6132a implements Iterable<T>, C14464a {

        /* renamed from: a */
        final /* synthetic */ C6069a f17325a;

        public C6132a(C6069a aVar) {
            this.f17325a = aVar;
        }

        @C6003d
        public Iterator<T> iterator() {
            return (Iterator) this.f17325a.mo24947p();
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <T> Iterable<T> m28161a(C6069a<? extends Iterator<? extends T>> aVar) {
        return new C6132a(aVar);
    }

    @C6003d
    /* renamed from: b */
    public static <T> Collection<T> m28164b(@C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(iterable, "$receiver");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C14848z.m65668L(iterable);
        }
        Collection collection = (Collection) iterable;
        return m28163a(collection) ? C14848z.m65668L(iterable) : collection;
    }

    @C6003d
    /* renamed from: c */
    public static final <T> List<T> m28165c(@C6003d Iterable<? extends Iterable<? extends T>> iterable) {
        C14445h0.m62478f(iterable, "$receiver");
        ArrayList arrayList = new ArrayList();
        for (Iterable a : iterable) {
            C6135x.m28181a((Collection<? super T>) arrayList, a);
        }
        return arrayList;
    }

    @C6003d
    /* renamed from: d */
    public static final <T, R> C14854w<List<T>, List<R>> m28166d(@C6003d Iterable<? extends C14854w<? extends T, ? extends R>> iterable) {
        C14445h0.m62478f(iterable, "$receiver");
        int a = m28159a(iterable, 10);
        ArrayList arrayList = new ArrayList(a);
        ArrayList arrayList2 = new ArrayList(a);
        for (C14854w wVar : iterable) {
            arrayList.add(wVar.mo46307e());
            arrayList2.add(wVar.mo46309f());
        }
        return C14731m0.m63872a(arrayList, arrayList2);
    }

    @C6004e
    @C6050b0
    /* renamed from: a */
    public static final <T> Integer m28160a(@C6003d Iterable<? extends T> iterable) {
        C14445h0.m62478f(iterable, "$receiver");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @C6050b0
    /* renamed from: a */
    public static <T> int m28159a(@C6003d Iterable<? extends T> iterable, int i) {
        C14445h0.m62478f(iterable, "$receiver");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* renamed from: a */
    private static final <T> boolean m28163a(@C6003d Collection<? extends T> collection) {
        return collection.size() > 2 && (collection instanceof ArrayList);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Collection<T> m28162a(@C6003d Iterable<? extends T> iterable, @C6003d Iterable<? extends T> iterable2) {
        C14445h0.m62478f(iterable, "$receiver");
        C14445h0.m62478f(iterable2, "source");
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return C14848z.m65668L(iterable);
        }
        if ((iterable2 instanceof Collection) && ((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection collection = (Collection) iterable;
        return m28163a(collection) ? C14848z.m65668L(iterable) : collection;
    }
}
