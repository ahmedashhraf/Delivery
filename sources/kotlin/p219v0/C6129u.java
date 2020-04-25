package kotlin.p219v0;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import kotlin.C6096e0;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p214b1.p216u.C14485t;
import kotlin.p504e1.C14525k;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000v\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u001a@\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\b\u001a@\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0006\u0010\f\u001a\u00020\u00062!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u00070\u000eH\b\u001a\u001f\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u0007H\b\u001a5\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u0002H\u00070\u0015j\b\u0012\u0004\u0012\u0002H\u0007`\u0016\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010\u0019\u001a\"\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00182\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0002H\b¢\u0006\u0002\u0010\u001d\u001a4\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018\"\u0004\b\u0000\u0010\u00072\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0018H\b¢\u0006\u0002\u0010\u001f\u001a\u0012\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007H\b\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0006\u0010\"\u001a\u0002H\u0007H\u0007¢\u0006\u0002\u0010#\u001a+\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010$\u001a%\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010#\u001a3\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\b\b\u0000\u0010\u0007*\u00020\u001b2\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u00070\u0018\"\u0004\u0018\u0001H\u0007¢\u0006\u0002\u0010$\u001a\u0015\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u0007H\b\u001a+\u0010&\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0013\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018\"\u0002H\u0007¢\u0006\u0002\u0010$\u001a%\u0010'\u001a\u00020(2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0002\b+\u001a%\u0010,\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0018H\u0000¢\u0006\u0002\u0010-\u001aS\u0010.\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\u0006\u0010\"\u001a\u0002H\u00072\u001a\u0010/\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u000700j\n\u0012\u0006\b\u0000\u0012\u0002H\u0007`12\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00102\u001a>\u0010.\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u00060\u000e\u001aE\u0010.\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u000704*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\b2\b\u0010\"\u001a\u0004\u0018\u0001H\u00072\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u0006¢\u0006\u0002\u00105\u001ad\u00106\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007\"\u000e\b\u0001\u00107*\b\u0012\u0004\u0012\u0002H704*\b\u0012\u0004\u0012\u0002H\u00070\b2\b\u00108\u001a\u0004\u0018\u0001H72\b\b\u0002\u0010)\u001a\u00020\u00062\b\b\u0002\u0010*\u001a\u00020\u00062\u0016\b\u0004\u00109\u001a\u0010\u0012\u0004\u0012\u0002H\u0007\u0012\u0006\u0012\u0004\u0018\u0001H70\u000eH\b¢\u0006\u0002\u0010:\u001a,\u0010;\u001a\u00020<\"\t\b\u0000\u0010\u0007¢\u0006\u0002\b=*\b\u0012\u0004\u0012\u0002H\u00070\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001a1\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u0018\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u00182\u0006\u0010?\u001a\u00020<H\u0003¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010B\u001a\u00020<\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0002H\b\u001a\u001e\u0010C\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\bH\u0000\u001a!\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0002\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\u0002H\b\u001a!\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\n\u0012\u0004\u0012\u0002H\u0007\u0018\u00010\bH\b\u001a\u001f\u0010E\u001a\b\u0012\u0004\u0012\u0002H\u00070\b\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070FH\b\"\u0019\u0010\u0000\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"!\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006G"}, mo24990d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "lastIndex", "", "T", "", "getLastIndex", "(Ljava/util/List;)I", "List", "size", "init", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "MutableList", "", "arrayListOf", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elements", "", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "copyToArrayImpl", "", "collection", "(Ljava/util/Collection;)[Ljava/lang/Object;", "array", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "emptyList", "listOf", "element", "(Ljava/lang/Object;)Ljava/util/List;", "([Ljava/lang/Object;)Ljava/util/List;", "listOfNotNull", "mutableListOf", "rangeCheck", "", "fromIndex", "toIndex", "rangeCheck$CollectionsKt__CollectionsKt", "asCollection", "([Ljava/lang/Object;)Ljava/util/Collection;", "binarySearch", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;II)I", "comparison", "", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "binarySearchBy", "K", "key", "selector", "(Ljava/util/List;Ljava/lang/Comparable;IILkotlin/jvm/functions/Function1;)I", "containsAll", "", "Lkotlin/internal/OnlyInputTypes;", "copyToArrayOfAny", "isVarargs", "copyToArrayOfAny$CollectionsKt__CollectionsKt", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "isNotEmpty", "optimizeReadOnlyList", "orEmpty", "toList", "Ljava/util/Enumeration;", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.v0.u */
/* compiled from: Collections.kt */
class C6129u {

    /* renamed from: kotlin.v0.u$a */
    /* compiled from: Collections.kt */
    public static final class C6130a extends C14448i0 implements C6080l<T, Integer> {

        /* renamed from: a */
        final /* synthetic */ C6080l f17323a;

        /* renamed from: b */
        final /* synthetic */ Comparable f17324b;

        public C6130a(C6080l lVar, Comparable comparable) {
            this.f17323a = lVar;
            this.f17324b = comparable;
            super(1);
        }

        public final int invoke(T t) {
            return C14856b.m65860a((Comparable) this.f17323a.invoke(t), this.f17324b);
        }
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Collection<T> m28144b(@C6003d T[] tArr) {
        C14445h0.m62478f(tArr, "$receiver");
        return new C14787k(tArr, false);
    }

    @C6003d
    /* renamed from: c */
    public static <T> List<T> m28153c(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length > 0 ? C14794o.m64862c(tArr) : m28145b();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: d */
    private static final <T> List<T> m28156d() {
        return new ArrayList();
    }

    @C6003d
    /* renamed from: e */
    public static final <T> List<T> m28158e(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C14787k(tArr, true));
    }

    @C6003d
    /* renamed from: a */
    public static <T> List<T> m28137a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        C14445h0.m62453a((Object) singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }

    @C6003d
    /* renamed from: b */
    public static <T> List<T> m28145b() {
        return C14753c0.f43000a;
    }

    @C6041f
    /* renamed from: c */
    private static final <T> List<T> m28151c() {
        return m28145b();
    }

    @C6003d
    /* renamed from: d */
    public static final <T> List<T> m28157d(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return C14794o.m65294r(tArr);
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final <T> ArrayList<T> m28134a() {
        return new ArrayList<>();
    }

    @C6003d
    /* renamed from: b */
    public static final <T> List<T> m28147b(@C6004e T t) {
        return t != null ? m28137a(t) : m28145b();
    }

    @C6041f
    /* renamed from: c */
    private static final <T> boolean m28154c(@C6003d Collection<? extends T> collection) {
        return !collection.isEmpty();
    }

    @C6041f
    /* renamed from: d */
    private static final <T> Collection<T> m28155d(@C6004e Collection<? extends T> collection) {
        return collection != null ? collection : m28145b();
    }

    @C6003d
    /* renamed from: a */
    public static final <T> ArrayList<T> m28135a(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList(new C14787k(tArr, true));
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: b */
    private static final <T> List<T> m28146b(int i, C6080l<? super Integer, ? extends T> lVar) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @C6041f
    /* renamed from: c */
    private static final <T> List<T> m28152c(@C6004e List<? extends T> list) {
        return list != null ? list : m28145b();
    }

    @C6041f
    @C6096e0(version = "1.1")
    /* renamed from: a */
    private static final <T> List<T> m28136a(int i, C6080l<? super Integer, ? extends T> lVar) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> int m28125a(@C6003d List<? extends T> list) {
        C14445h0.m62478f(list, "$receiver");
        return list.size() - 1;
    }

    @C6003d
    /* renamed from: b */
    public static C14525k m28149b(@C6003d Collection<?> collection) {
        C14445h0.m62478f(collection, "$receiver");
        return new C14525k(0, collection.size() - 1);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> List<T> m28138a(@C6003d Enumeration<T> enumeration) {
        ArrayList list = Collections.list(enumeration);
        C14445h0.m62453a((Object) list, "java.util.Collections.list(this)");
        return list;
    }

    @C6003d
    /* renamed from: b */
    public static <T> List<T> m28148b(@C6003d List<? extends T> list) {
        C14445h0.m62478f(list, "$receiver");
        int size = list.size();
        if (size == 0) {
            return m28145b();
        }
        if (size != 1) {
            return list;
        }
        return m28137a((T) list.get(0));
    }

    @C6041f
    /* renamed from: a */
    private static final <T> boolean m28140a(@C6003d Collection<? extends T> collection, Collection<? extends T> collection2) {
        return collection.containsAll(collection2);
    }

    @C6041f
    /* renamed from: a */
    private static final Object[] m28141a(Collection<?> collection) {
        return C14485t.m62651a(collection);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> T[] m28142a(Collection<?> collection, T[] tArr) {
        if (tArr != null) {
            T[] a = C14485t.m62653a(collection, tArr);
            if (a != null) {
                return a;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final <T> Object[] m28150b(@C6003d T[] tArr, boolean z) {
        Class<Object[]> cls = Object[].class;
        if (!z || !C14445h0.m62463a((Object) tArr.getClass(), (Object) cls)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
            C14445h0.m62453a((Object) copyOf, "java.util.Arrays.copyOf(… Array<Any?>::class.java)");
            return copyOf;
        } else if (tArr != null) {
            return tArr;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m28129a(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m28128a(list, (T) comparable, i, i2);
    }

    /* renamed from: a */
    public static final <T extends Comparable<? super T>> int m28128a(@C6003d List<? extends T> list, @C6004e T t, int i, int i2) {
        C14445h0.m62478f(list, "$receiver");
        m28139a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int a = C14856b.m65860a((Comparable) list.get(i4), (Comparable) t);
            if (a < 0) {
                i = i4 + 1;
            } else if (a <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public static /* synthetic */ int m28133a(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return m28132a(list, (T) obj, comparator, i, i2);
    }

    /* renamed from: a */
    public static final <T> int m28132a(@C6003d List<? extends T> list, T t, @C6003d Comparator<? super T> comparator, int i, int i2) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(comparator, "comparator");
        m28139a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    public static /* synthetic */ int m28131a(List list, Comparable comparable, int i, int i2, C6080l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(lVar, "selector");
        return m28126a(list, i, i2, (C6080l<? super T, Integer>) new C6130a<Object,Integer>(lVar, comparable));
    }

    /* renamed from: a */
    public static final <T, K extends Comparable<? super K>> int m28130a(@C6003d List<? extends T> list, @C6004e K k, int i, int i2, @C6003d C6080l<? super T, ? extends K> lVar) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(lVar, "selector");
        return m28126a(list, i, i2, (C6080l<? super T, Integer>) new C6130a<Object,Integer>(lVar, k));
    }

    /* renamed from: a */
    public static /* synthetic */ int m28127a(List list, int i, int i2, C6080l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m28126a(list, i, i2, lVar);
    }

    /* renamed from: a */
    public static final <T> int m28126a(@C6003d List<? extends T> list, int i, int i2, @C6003d C6080l<? super T, Integer> lVar) {
        C14445h0.m62478f(list, "$receiver");
        C14445h0.m62478f(lVar, "comparison");
        m28139a(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = ((Number) lVar.invoke(list.get(i4))).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: a */
    private static final void m28139a(int i, int i2, int i3) {
        String str = ").";
        String str2 = "fromIndex (";
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(i2);
            sb.append(") is greater than toIndex (");
            sb.append(i3);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(i2);
            sb2.append(") is less than zero.");
            throw new IndexOutOfBoundsException(sb2.toString());
        } else if (i3 > i) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toIndex (");
            sb3.append(i3);
            sb3.append(") is greater than size (");
            sb3.append(i);
            sb3.append(str);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }
}
