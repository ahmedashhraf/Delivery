package kotlin.p506g1;

import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.C14731m0;
import kotlin.C14854w;
import kotlin.C6121u;
import kotlin.p213a1.C6041f;
import kotlin.p213a1.C6042g;
import kotlin.p214b1.C6055e;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0013H\b\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u00050\u000bH\u0002¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00180\u0001H\u0007¢\u0006\u0002\b\u0019\u001a\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a@\u0010\u001a\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001c0\u001b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0016*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00160\u001b0\u0001¨\u0006\u001d"}, mo24990d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "Ljava/util/Enumeration;", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/sequences/SequencesKt")
/* renamed from: kotlin.g1.o */
/* compiled from: Sequences.kt */
class C14596o {

    /* renamed from: kotlin.g1.o$a */
    /* compiled from: Sequences.kt */
    public static final class C14597a implements C14594m<T> {

        /* renamed from: a */
        final /* synthetic */ C6069a f42748a;

        public C14597a(C6069a aVar) {
            this.f42748a = aVar;
        }

        @C6003d
        public Iterator<T> iterator() {
            return (Iterator) this.f42748a.mo24947p();
        }
    }

    /* renamed from: kotlin.g1.o$b */
    /* compiled from: Sequences.kt */
    public static final class C14598b implements C14594m<T> {

        /* renamed from: a */
        final /* synthetic */ Iterator f42749a;

        public C14598b(Iterator it) {
            this.f42749a = it;
        }

        @C6003d
        public Iterator<T> iterator() {
            return this.f42749a;
        }
    }

    /* renamed from: kotlin.g1.o$c */
    /* compiled from: Sequences.kt */
    static final class C14599c extends C14448i0 implements C6080l<C14594m<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C14599c f42750a = new C14599c();

        C14599c() {
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final Iterator<T> invoke(@C6003d C14594m<? extends T> mVar) {
            C14445h0.m62478f(mVar, "it");
            return mVar.iterator();
        }
    }

    /* renamed from: kotlin.g1.o$d */
    /* compiled from: Sequences.kt */
    static final class C14600d extends C14448i0 implements C6080l<Iterable<? extends T>, Iterator<? extends T>> {

        /* renamed from: a */
        public static final C14600d f42751a = new C14600d();

        C14600d() {
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final Iterator<T> invoke(@C6003d Iterable<? extends T> iterable) {
            C14445h0.m62478f(iterable, "it");
            return iterable.iterator();
        }
    }

    /* renamed from: kotlin.g1.o$e */
    /* compiled from: Sequences.kt */
    static final class C14601e extends C14448i0 implements C6080l<T, T> {

        /* renamed from: a */
        public static final C14601e f42752a = new C14601e();

        C14601e() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    /* renamed from: kotlin.g1.o$f */
    /* compiled from: Sequences.kt */
    static final class C14602f extends C14448i0 implements C6080l<T, T> {

        /* renamed from: a */
        final /* synthetic */ C6069a f42753a;

        C14602f(C6069a aVar) {
            this.f42753a = aVar;
            super(1);
        }

        @C6004e
        public final T invoke(@C6003d T t) {
            C14445h0.m62478f(t, "it");
            return this.f42753a.mo24947p();
        }
    }

    /* renamed from: kotlin.g1.o$g */
    /* compiled from: Sequences.kt */
    static final class C14603g extends C14448i0 implements C6069a<T> {

        /* renamed from: a */
        final /* synthetic */ Object f42754a;

        C14603g(Object obj) {
            this.f42754a = obj;
            super(0);
        }

        @C6004e
        /* renamed from: p */
        public final T mo24947p() {
            return this.f42754a;
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <T> C14594m<T> m63179a(C6069a<? extends Iterator<? extends T>> aVar) {
        return new C14597a(aVar);
    }

    @C6003d
    /* renamed from: b */
    public static final <T> C14594m<T> m63185b(@C6003d C14594m<? extends C14594m<? extends T>> mVar) {
        C14445h0.m62478f(mVar, "$receiver");
        return m63182a(mVar, (C6080l<? super T, ? extends Iterator<? extends R>>) C14599c.f42750a);
    }

    @C6003d
    @C6055e(name = "flattenSequenceOfIterable")
    /* renamed from: c */
    public static final <T> C14594m<T> m63186c(@C6003d C14594m<? extends Iterable<? extends T>> mVar) {
        C14445h0.m62478f(mVar, "$receiver");
        return m63182a(mVar, (C6080l<? super T, ? extends Iterator<? extends R>>) C14600d.f42751a);
    }

    @C6003d
    /* renamed from: d */
    public static final <T, R> C14854w<List<T>, List<R>> m63187d(@C6003d C14594m<? extends C14854w<? extends T, ? extends R>> mVar) {
        C14445h0.m62478f(mVar, "$receiver");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C14854w wVar : mVar) {
            arrayList.add(wVar.mo46307e());
            arrayList2.add(wVar.mo46309f());
        }
        return C14731m0.m63872a(arrayList, arrayList2);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14594m<T> m63178a(@C6003d Iterator<? extends T> it) {
        C14445h0.m62478f(it, "$receiver");
        return m63181a((C14594m<? extends T>) new C14598b<Object>(it));
    }

    @C6003d
    /* renamed from: b */
    public static final <T> C14594m<T> m63184b(@C6003d C6069a<? extends T> aVar) {
        C14445h0.m62478f(aVar, "nextFunction");
        return m63181a((C14594m<? extends T>) new C14588j<Object>(aVar, new C14602f(aVar)));
    }

    @C6041f
    /* renamed from: a */
    private static final <T> C14594m<T> m63177a(@C6003d Enumeration<T> enumeration) {
        return m63178a(C6133w.m28167a(enumeration));
    }

    @C6003d
    /* renamed from: a */
    public static final <T> C14594m<T> m63183a(@C6003d T... tArr) {
        C14445h0.m62478f(tArr, MessengerShareContentUtility.ELEMENTS);
        return tArr.length == 0 ? m63175a() : C14794o.m64960d(tArr);
    }

    @C6003d
    /* renamed from: a */
    public static <T> C14594m<T> m63175a() {
        return C14583g.f42719a;
    }

    /* renamed from: a */
    private static final <T, R> C14594m<R> m63182a(@C6003d C14594m<? extends T> mVar, C6080l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (mVar instanceof C14638u) {
            return ((C14638u) mVar).mo45853a(lVar);
        }
        return new C14586i(mVar, C14601e.f42752a, lVar);
    }

    @C6003d
    /* renamed from: a */
    public static <T> C14594m<T> m63181a(@C6003d C14594m<? extends T> mVar) {
        C14445h0.m62478f(mVar, "$receiver");
        return mVar instanceof C14575a ? mVar : new C14575a(mVar);
    }

    @C6003d
    @C6042g
    /* renamed from: a */
    public static final <T> C14594m<T> m63176a(@C6004e T t, @C6003d C6080l<? super T, ? extends T> lVar) {
        C14445h0.m62478f(lVar, "nextFunction");
        if (t == null) {
            return C14583g.f42719a;
        }
        return new C14588j(new C14603g(t), lVar);
    }

    @C6003d
    /* renamed from: a */
    public static <T> C14594m<T> m63180a(@C6003d C6069a<? extends T> aVar, @C6003d C6080l<? super T, ? extends T> lVar) {
        C14445h0.m62478f(aVar, "seedFunction");
        C14445h0.m62478f(lVar, "nextFunction");
        return new C14588j(aVar, lVar);
    }
}
