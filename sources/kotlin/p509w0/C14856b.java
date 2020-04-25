package kotlin.p509w0;

import java.util.Comparator;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aY\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\t\u001aW\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a;\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001aW\u0010\f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001a-\u0010\r\u001a\u00020\u000e\"\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u000f\u001a\u0004\u0018\u0001H\u00022\b\u0010\u0010\u001a\u0004\u0018\u0001H\u0002¢\u0006\u0002\u0010\u0011\u001a>\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b¢\u0006\u0002\u0010\u0013\u001aY\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u000226\u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\b\"\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0014\u001aZ\u0010\u0012\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n2\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b¢\u0006\u0002\u0010\u0015\u001aG\u0010\u0016\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u000f\u001a\u0002H\u00022\u0006\u0010\u0010\u001a\u0002H\u00022 \u0010\u0007\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u00050\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0014\u001a&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a-\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u0019\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a-\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006H\b\u001a@\u0010\u001b\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001j\n\u0012\u0006\u0012\u0004\u0018\u0001H\u0002`\u0003\"\b\b\u0000\u0010\u0002*\u00020\u001a2\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003\u001a&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a0\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\u001aO\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004\u001aO\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001aO\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00060\u0005H\b\u001ak\u0010 \u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\n0\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\n`\u00032\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0005H\b\u001am\u0010!\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u000328\b\u0004\u0010\"\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u000e0#H\b\u001aO\u0010&\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u0003\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u00020\u0001j\b\u0012\u0004\u0012\u0002H\u0002`\u00032\u001a\u0010\u000b\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0001j\n\u0012\u0006\b\u0000\u0012\u0002H\u0002`\u0003H\u0004¨\u0006'"}, mo24990d2 = {"compareBy", "Ljava/util/Comparator;", "T", "Lkotlin/Comparator;", "selector", "Lkotlin/Function1;", "", "selectors", "", "([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;", "K", "comparator", "compareByDescending", "compareValues", "", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "compareValuesBy", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;[Lkotlin/jvm/functions/Function1;)I", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;Lkotlin/jvm/functions/Function1;)I", "compareValuesByImpl", "compareValuesByImpl$ComparisonsKt__ComparisonsKt", "naturalOrder", "nullsFirst", "", "nullsLast", "reverseOrder", "reversed", "then", "thenBy", "thenByDescending", "thenComparator", "comparison", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "thenDescending", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: kotlin.w0.b */
/* compiled from: Comparisons.kt */
class C14856b {

    /* renamed from: kotlin.w0.b$a */
    /* compiled from: Comparisons.kt */
    static final class C14857a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C6080l[] f43097a;

        C14857a(C6080l[] lVarArr) {
            this.f43097a = lVarArr;
        }

        public final int compare(T t, T t2) {
            return C14856b.m65879c(t, t2, this.f43097a);
        }
    }

    /* renamed from: kotlin.w0.b$b */
    /* compiled from: Comparisons.kt */
    public static final class C14858b<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C6080l f43098a;

        public C14858b(C6080l lVar) {
            this.f43098a = lVar;
        }

        public final int compare(T t, T t2) {
            return C14856b.m65860a((Comparable) this.f43098a.invoke(t), (Comparable) this.f43098a.invoke(t2));
        }
    }

    /* renamed from: kotlin.w0.b$c */
    /* compiled from: Comparisons.kt */
    public static final class C14859c<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43099a;

        /* renamed from: b */
        final /* synthetic */ C6080l f43100b;

        public C14859c(Comparator comparator, C6080l lVar) {
            this.f43099a = comparator;
            this.f43100b = lVar;
        }

        public final int compare(T t, T t2) {
            return this.f43099a.compare(this.f43100b.invoke(t), this.f43100b.invoke(t2));
        }
    }

    /* renamed from: kotlin.w0.b$d */
    /* compiled from: Comparisons.kt */
    public static final class C14860d<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C6080l f43101a;

        public C14860d(C6080l lVar) {
            this.f43101a = lVar;
        }

        public final int compare(T t, T t2) {
            return C14856b.m65860a((Comparable) this.f43101a.invoke(t2), (Comparable) this.f43101a.invoke(t));
        }
    }

    /* renamed from: kotlin.w0.b$e */
    /* compiled from: Comparisons.kt */
    public static final class C14861e<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43102a;

        /* renamed from: b */
        final /* synthetic */ C6080l f43103b;

        public C14861e(Comparator comparator, C6080l lVar) {
            this.f43102a = comparator;
            this.f43103b = lVar;
        }

        public final int compare(T t, T t2) {
            return this.f43102a.compare(this.f43103b.invoke(t2), this.f43103b.invoke(t));
        }
    }

    /* renamed from: kotlin.w0.b$f */
    /* compiled from: Comparisons.kt */
    static final class C14862f<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43104a;

        C14862f(Comparator comparator) {
            this.f43104a = comparator;
        }

        public final int compare(@C6004e T t, @C6004e T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return -1;
            }
            if (t2 == null) {
                return 1;
            }
            return this.f43104a.compare(t, t2);
        }
    }

    /* renamed from: kotlin.w0.b$g */
    /* compiled from: Comparisons.kt */
    static final class C14863g<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43105a;

        C14863g(Comparator comparator) {
            this.f43105a = comparator;
        }

        public final int compare(@C6004e T t, @C6004e T t2) {
            if (t == t2) {
                return 0;
            }
            if (t == null) {
                return 1;
            }
            if (t2 == null) {
                return -1;
            }
            return this.f43105a.compare(t, t2);
        }
    }

    /* renamed from: kotlin.w0.b$h */
    /* compiled from: Comparisons.kt */
    static final class C14864h<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43106a;

        /* renamed from: b */
        final /* synthetic */ Comparator f43107b;

        C14864h(Comparator comparator, Comparator comparator2) {
            this.f43106a = comparator;
            this.f43107b = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43106a.compare(t, t2);
            return compare != 0 ? compare : this.f43107b.compare(t, t2);
        }
    }

    /* renamed from: kotlin.w0.b$i */
    /* compiled from: Comparisons.kt */
    public static final class C14865i<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43108a;

        /* renamed from: b */
        final /* synthetic */ C6080l f43109b;

        public C14865i(Comparator comparator, C6080l lVar) {
            this.f43108a = comparator;
            this.f43109b = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43108a.compare(t, t2);
            return compare != 0 ? compare : C14856b.m65860a((Comparable) this.f43109b.invoke(t), (Comparable) this.f43109b.invoke(t2));
        }
    }

    /* renamed from: kotlin.w0.b$j */
    /* compiled from: Comparisons.kt */
    public static final class C14866j<T> implements Comparator<T> {

        /* renamed from: N */
        final /* synthetic */ C6080l f43110N;

        /* renamed from: a */
        final /* synthetic */ Comparator f43111a;

        /* renamed from: b */
        final /* synthetic */ Comparator f43112b;

        public C14866j(Comparator comparator, Comparator comparator2, C6080l lVar) {
            this.f43111a = comparator;
            this.f43112b = comparator2;
            this.f43110N = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43111a.compare(t, t2);
            return compare != 0 ? compare : this.f43112b.compare(this.f43110N.invoke(t), this.f43110N.invoke(t2));
        }
    }

    /* renamed from: kotlin.w0.b$k */
    /* compiled from: Comparisons.kt */
    public static final class C14867k<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43113a;

        /* renamed from: b */
        final /* synthetic */ C6080l f43114b;

        public C14867k(Comparator comparator, C6080l lVar) {
            this.f43113a = comparator;
            this.f43114b = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43113a.compare(t, t2);
            return compare != 0 ? compare : C14856b.m65860a((Comparable) this.f43114b.invoke(t2), (Comparable) this.f43114b.invoke(t));
        }
    }

    /* renamed from: kotlin.w0.b$l */
    /* compiled from: Comparisons.kt */
    public static final class C14868l<T> implements Comparator<T> {

        /* renamed from: N */
        final /* synthetic */ C6080l f43115N;

        /* renamed from: a */
        final /* synthetic */ Comparator f43116a;

        /* renamed from: b */
        final /* synthetic */ Comparator f43117b;

        public C14868l(Comparator comparator, Comparator comparator2, C6080l lVar) {
            this.f43116a = comparator;
            this.f43117b = comparator2;
            this.f43115N = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43116a.compare(t, t2);
            return compare != 0 ? compare : this.f43117b.compare(this.f43115N.invoke(t2), this.f43115N.invoke(t));
        }
    }

    /* renamed from: kotlin.w0.b$m */
    /* compiled from: Comparisons.kt */
    public static final class C14869m<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43118a;

        /* renamed from: b */
        final /* synthetic */ C6084p f43119b;

        public C14869m(Comparator comparator, C6084p pVar) {
            this.f43118a = comparator;
            this.f43119b = pVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43118a.compare(t, t2);
            return compare != 0 ? compare : ((Number) this.f43119b.mo24962d(t, t2)).intValue();
        }
    }

    /* renamed from: kotlin.w0.b$n */
    /* compiled from: Comparisons.kt */
    static final class C14870n<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ Comparator f43120a;

        /* renamed from: b */
        final /* synthetic */ Comparator f43121b;

        C14870n(Comparator comparator, Comparator comparator2) {
            this.f43120a = comparator;
            this.f43121b = comparator2;
        }

        public final int compare(T t, T t2) {
            int compare = this.f43120a.compare(t, t2);
            return compare != 0 ? compare : this.f43121b.compare(t2, t);
        }
    }

    /* renamed from: b */
    public static final <T> int m65872b(T t, T t2, @C6003d C6080l<? super T, ? extends Comparable<?>>... lVarArr) {
        C14445h0.m62478f(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return m65879c(t, t2, lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final <T> int m65879c(T t, T t2, C6080l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (C6080l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int a = m65860a((T) (Comparable) lVar.invoke(t), (T) (Comparable) lVar.invoke(t2));
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    @C6041f
    /* renamed from: d */
    private static final <T> Comparator<T> m65884d(@C6003d Comparator<T> comparator, C6080l<? super T, ? extends Comparable<?>> lVar) {
        return new C14867k(comparator, lVar);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> int m65862a(T t, T t2, C6080l<? super T, ? extends Comparable<?>> lVar) {
        return m65860a((T) (Comparable) lVar.invoke(t), (T) (Comparable) lVar.invoke(t2));
    }

    @C6003d
    /* renamed from: d */
    public static <T extends Comparable<? super T>> Comparator<T> m65883d() {
        C14873e eVar = C14873e.f43123a;
        if (eVar != null) {
            return eVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }

    @C6041f
    /* renamed from: a */
    private static final <T, K> int m65861a(T t, T t2, Comparator<? super K> comparator, C6080l<? super T, ? extends K> lVar) {
        return comparator.compare(lVar.invoke(t), lVar.invoke(t2));
    }

    /* renamed from: a */
    public static <T extends Comparable<?>> int m65860a(@C6004e T t, @C6004e T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @C6041f
    /* renamed from: b */
    private static final <T> Comparator<T> m65878b(C6080l<? super T, ? extends Comparable<?>> lVar) {
        return new C14860d(lVar);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Comparator<T> m65871a(@C6003d C6080l<? super T, ? extends Comparable<?>>... lVarArr) {
        C14445h0.m62478f(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new C14857a(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @C6041f
    /* renamed from: b */
    private static final <T, K> Comparator<T> m65877b(Comparator<? super K> comparator, C6080l<? super T, ? extends K> lVar) {
        return new C14861e(comparator, lVar);
    }

    @C6041f
    /* renamed from: c */
    private static final <T> Comparator<T> m65882c(@C6003d Comparator<T> comparator, C6080l<? super T, ? extends Comparable<?>> lVar) {
        return new C14865i(comparator, lVar);
    }

    @C6041f
    /* renamed from: b */
    private static final <T, K> Comparator<T> m65876b(@C6003d Comparator<T> comparator, Comparator<? super K> comparator2, C6080l<? super T, ? extends K> lVar) {
        return new C14868l(comparator, comparator2, lVar);
    }

    @C6041f
    /* renamed from: c */
    private static final <T extends Comparable<? super T>> Comparator<T> m65880c() {
        return m65874b(m65864a());
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Comparator<T> m65875b(@C6003d Comparator<T> comparator, @C6003d Comparator<? super T> comparator2) {
        C14445h0.m62478f(comparator, "$receiver");
        C14445h0.m62478f(comparator2, "comparator");
        return new C14870n(comparator, comparator2);
    }

    @C6003d
    /* renamed from: c */
    public static final <T> Comparator<T> m65881c(@C6003d Comparator<T> comparator) {
        C14445h0.m62478f(comparator, "$receiver");
        if (comparator instanceof C14874f) {
            return ((C14874f) comparator).mo46332a();
        }
        String str = "null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */";
        if (C14445h0.m62463a((Object) comparator, (Object) C14872d.f43122a)) {
            C14873e eVar = C14873e.f43123a;
            if (eVar != null) {
                return eVar;
            }
            throw new TypeCastException(str);
        } else if (!C14445h0.m62463a((Object) comparator, (Object) C14873e.f43123a)) {
            return new C14874f(comparator);
        } else {
            C14872d dVar = C14872d.f43122a;
            if (dVar != null) {
                return dVar;
            }
            throw new TypeCastException(str);
        }
    }

    @C6041f
    /* renamed from: a */
    private static final <T> Comparator<T> m65870a(C6080l<? super T, ? extends Comparable<?>> lVar) {
        return new C14858b(lVar);
    }

    @C6041f
    /* renamed from: b */
    private static final <T extends Comparable<? super T>> Comparator<T> m65873b() {
        return m65865a(m65864a());
    }

    @C6041f
    /* renamed from: a */
    private static final <T, K> Comparator<T> m65868a(Comparator<? super K> comparator, C6080l<? super T, ? extends K> lVar) {
        return new C14859c(comparator, lVar);
    }

    @C6003d
    /* renamed from: b */
    public static final <T> Comparator<T> m65874b(@C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return new C14863g(comparator);
    }

    @C6041f
    /* renamed from: a */
    private static final <T, K> Comparator<T> m65867a(@C6003d Comparator<T> comparator, Comparator<? super K> comparator2, C6080l<? super T, ? extends K> lVar) {
        return new C14866j(comparator, comparator2, lVar);
    }

    @C6041f
    /* renamed from: a */
    private static final <T> Comparator<T> m65869a(@C6003d Comparator<T> comparator, C6084p<? super T, ? super T, Integer> pVar) {
        return new C14869m(comparator, pVar);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Comparator<T> m65866a(@C6003d Comparator<T> comparator, @C6003d Comparator<? super T> comparator2) {
        C14445h0.m62478f(comparator, "$receiver");
        C14445h0.m62478f(comparator2, "comparator");
        return new C14864h(comparator, comparator2);
    }

    @C6003d
    /* renamed from: a */
    public static final <T> Comparator<T> m65865a(@C6003d Comparator<? super T> comparator) {
        C14445h0.m62478f(comparator, "comparator");
        return new C14862f(comparator);
    }

    @C6003d
    /* renamed from: a */
    public static final <T extends Comparable<? super T>> Comparator<T> m65864a() {
        C14872d dVar = C14872d.f43122a;
        if (dVar != null) {
            return dVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Comparator<T> /* = java.util.Comparator<T> */");
    }
}
