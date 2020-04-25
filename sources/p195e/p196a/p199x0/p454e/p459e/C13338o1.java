package p195e.p196a.p199x0.p454e.p459e;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12280i0;
import p195e.p196a.C12282j0;
import p195e.p196a.C12287k;
import p195e.p196a.C5923b0;
import p195e.p196a.C5926g0;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12326b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p466y0.C13772a;

/* renamed from: e.a.x0.e.e.o1 */
/* compiled from: ObservableInternalHelper */
public final class C13338o1 {

    /* renamed from: e.a.x0.e.e.o1$a */
    /* compiled from: ObservableInternalHelper */
    static final class C13339a<T> implements Callable<C13772a<T>> {

        /* renamed from: a */
        private final C5923b0<T> f38567a;

        /* renamed from: b */
        private final int f38568b;

        C13339a(C5923b0<T> b0Var, int i) {
            this.f38567a = b0Var;
            this.f38568b = i;
        }

        public C13772a<T> call() {
            return this.f38567a.mo23978d(this.f38568b);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$b */
    /* compiled from: ObservableInternalHelper */
    static final class C13340b<T> implements Callable<C13772a<T>> {

        /* renamed from: N */
        private final long f38569N;

        /* renamed from: O */
        private final TimeUnit f38570O;

        /* renamed from: P */
        private final C12282j0 f38571P;

        /* renamed from: a */
        private final C5923b0<T> f38572a;

        /* renamed from: b */
        private final int f38573b;

        C13340b(C5923b0<T> b0Var, int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38572a = b0Var;
            this.f38573b = i;
            this.f38569N = j;
            this.f38570O = timeUnit;
            this.f38571P = j0Var;
        }

        public C13772a<T> call() {
            return this.f38572a.mo23887a(this.f38573b, this.f38569N, this.f38570O, this.f38571P);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$c */
    /* compiled from: ObservableInternalHelper */
    static final class C13341c<T, U> implements C12339o<T, C5926g0<U>> {

        /* renamed from: a */
        private final C12339o<? super T, ? extends Iterable<? extends U>> f38574a;

        C13341c(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f38574a = oVar;
        }

        public C5926g0<U> apply(T t) throws Exception {
            return new C13202f1((Iterable) C12390b.m55563a(this.f38574a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: e.a.x0.e.e.o1$d */
    /* compiled from: ObservableInternalHelper */
    static final class C13342d<U, R, T> implements C12339o<U, R> {

        /* renamed from: a */
        private final C12327c<? super T, ? super U, ? extends R> f38575a;

        /* renamed from: b */
        private final T f38576b;

        C13342d(C12327c<? super T, ? super U, ? extends R> cVar, T t) {
            this.f38575a = cVar;
            this.f38576b = t;
        }

        public R apply(U u) throws Exception {
            return this.f38575a.mo35569a(this.f38576b, u);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$e */
    /* compiled from: ObservableInternalHelper */
    static final class C13343e<T, R, U> implements C12339o<T, C5926g0<R>> {

        /* renamed from: a */
        private final C12327c<? super T, ? super U, ? extends R> f38577a;

        /* renamed from: b */
        private final C12339o<? super T, ? extends C5926g0<? extends U>> f38578b;

        C13343e(C12327c<? super T, ? super U, ? extends R> cVar, C12339o<? super T, ? extends C5926g0<? extends U>> oVar) {
            this.f38577a = cVar;
            this.f38578b = oVar;
        }

        public C5926g0<R> apply(T t) throws Exception {
            return new C13459w1((C5926g0) C12390b.m55563a(this.f38578b.apply(t), "The mapper returned a null ObservableSource"), new C13342d(this.f38577a, t));
        }
    }

    /* renamed from: e.a.x0.e.e.o1$f */
    /* compiled from: ObservableInternalHelper */
    static final class C13344f<T, U> implements C12339o<T, C5926g0<T>> {

        /* renamed from: a */
        final C12339o<? super T, ? extends C5926g0<U>> f38579a;

        C13344f(C12339o<? super T, ? extends C5926g0<U>> oVar) {
            this.f38579a = oVar;
        }

        public C5926g0<T> apply(T t) throws Exception {
            return new C13331n3((C5926g0) C12390b.m55563a(this.f38579a.apply(t), "The itemDelay returned a null ObservableSource"), 1).mo24085u(C12351a.m55518c(t)).mo24029h(t);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$g */
    /* compiled from: ObservableInternalHelper */
    enum C13345g implements C12339o<Object, Object> {
        INSTANCE;

        public Object apply(Object obj) throws Exception {
            return Integer.valueOf(0);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$h */
    /* compiled from: ObservableInternalHelper */
    static final class C13346h<T> implements C12325a {

        /* renamed from: a */
        final C12280i0<T> f38580a;

        C13346h(C12280i0<T> i0Var) {
            this.f38580a = i0Var;
        }

        public void run() throws Exception {
            this.f38580a.onComplete();
        }
    }

    /* renamed from: e.a.x0.e.e.o1$i */
    /* compiled from: ObservableInternalHelper */
    static final class C13347i<T> implements C12331g<Throwable> {

        /* renamed from: a */
        final C12280i0<T> f38581a;

        C13347i(C12280i0<T> i0Var) {
            this.f38581a = i0Var;
        }

        /* renamed from: a */
        public void mo33410c(Throwable th) throws Exception {
            this.f38581a.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$j */
    /* compiled from: ObservableInternalHelper */
    static final class C13348j<T> implements C12331g<T> {

        /* renamed from: a */
        final C12280i0<T> f38582a;

        C13348j(C12280i0<T> i0Var) {
            this.f38582a = i0Var;
        }

        /* renamed from: c */
        public void mo33410c(T t) throws Exception {
            this.f38582a.mo33453a(t);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$k */
    /* compiled from: ObservableInternalHelper */
    static final class C13349k<T> implements Callable<C13772a<T>> {

        /* renamed from: a */
        private final C5923b0<T> f38583a;

        C13349k(C5923b0<T> b0Var) {
            this.f38583a = b0Var;
        }

        public C13772a<T> call() {
            return this.f38583a.mo24093y();
        }
    }

    /* renamed from: e.a.x0.e.e.o1$l */
    /* compiled from: ObservableInternalHelper */
    static final class C13350l<T, R> implements C12339o<C5923b0<T>, C5926g0<R>> {

        /* renamed from: a */
        private final C12339o<? super C5923b0<T>, ? extends C5926g0<R>> f38584a;

        /* renamed from: b */
        private final C12282j0 f38585b;

        C13350l(C12339o<? super C5923b0<T>, ? extends C5926g0<R>> oVar, C12282j0 j0Var) {
            this.f38584a = oVar;
            this.f38585b = j0Var;
        }

        /* renamed from: a */
        public C5926g0<R> apply(C5923b0<T> b0Var) throws Exception {
            return C5923b0.m26213v((C5926g0) C12390b.m55563a(this.f38584a.apply(b0Var), "The selector returned a null ObservableSource")).mo23825a(this.f38585b);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$m */
    /* compiled from: ObservableInternalHelper */
    static final class C13351m<T, S> implements C12327c<S, C12287k<T>, S> {

        /* renamed from: a */
        final C12326b<S, C12287k<T>> f38586a;

        C13351m(C12326b<S, C12287k<T>> bVar) {
            this.f38586a = bVar;
        }

        /* renamed from: a */
        public S mo35569a(S s, C12287k<T> kVar) throws Exception {
            this.f38586a.mo42088a(s, kVar);
            return s;
        }
    }

    /* renamed from: e.a.x0.e.e.o1$n */
    /* compiled from: ObservableInternalHelper */
    static final class C13352n<T, S> implements C12327c<S, C12287k<T>, S> {

        /* renamed from: a */
        final C12331g<C12287k<T>> f38587a;

        C13352n(C12331g<C12287k<T>> gVar) {
            this.f38587a = gVar;
        }

        /* renamed from: a */
        public S mo35569a(S s, C12287k<T> kVar) throws Exception {
            this.f38587a.mo33410c(kVar);
            return s;
        }
    }

    /* renamed from: e.a.x0.e.e.o1$o */
    /* compiled from: ObservableInternalHelper */
    static final class C13353o<T> implements Callable<C13772a<T>> {

        /* renamed from: N */
        private final TimeUnit f38588N;

        /* renamed from: O */
        private final C12282j0 f38589O;

        /* renamed from: a */
        private final C5923b0<T> f38590a;

        /* renamed from: b */
        private final long f38591b;

        C13353o(C5923b0<T> b0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f38590a = b0Var;
            this.f38591b = j;
            this.f38588N = timeUnit;
            this.f38589O = j0Var;
        }

        public C13772a<T> call() {
            return this.f38590a.mo23992e(this.f38591b, this.f38588N, this.f38589O);
        }
    }

    /* renamed from: e.a.x0.e.e.o1$p */
    /* compiled from: ObservableInternalHelper */
    static final class C13354p<T, R> implements C12339o<List<C5926g0<? extends T>>, C5926g0<? extends R>> {

        /* renamed from: a */
        private final C12339o<? super Object[], ? extends R> f38592a;

        C13354p(C12339o<? super Object[], ? extends R> oVar) {
            this.f38592a = oVar;
        }

        /* renamed from: a */
        public C5926g0<? extends R> apply(List<C5926g0<? extends T>> list) {
            return C5923b0.m26118a((Iterable<? extends C5926g0<? extends T>>) list, this.f38592a, false, C5923b0.m26088M());
        }
    }

    private C13338o1() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, S> C12327c<S, C12287k<T>, S> m57719a(C12331g<C12287k<T>> gVar) {
        return new C13352n(gVar);
    }

    /* renamed from: b */
    public static <T, U> C12339o<T, C5926g0<T>> m57728b(C12339o<? super T, ? extends C5926g0<U>> oVar) {
        return new C13344f(oVar);
    }

    /* renamed from: c */
    public static <T> C12331g<T> m57729c(C12280i0<T> i0Var) {
        return new C13348j(i0Var);
    }

    /* renamed from: a */
    public static <T, S> C12327c<S, C12287k<T>, S> m57718a(C12326b<S, C12287k<T>> bVar) {
        return new C13351m(bVar);
    }

    /* renamed from: b */
    public static <T> C12331g<Throwable> m57727b(C12280i0<T> i0Var) {
        return new C13347i(i0Var);
    }

    /* renamed from: c */
    public static <T, R> C12339o<List<C5926g0<? extends T>>, C5926g0<? extends R>> m57730c(C12339o<? super Object[], ? extends R> oVar) {
        return new C13354p(oVar);
    }

    /* renamed from: a */
    public static <T> C12325a m57717a(C12280i0<T> i0Var) {
        return new C13346h(i0Var);
    }

    /* renamed from: a */
    public static <T, U, R> C12339o<T, C5926g0<R>> m57722a(C12339o<? super T, ? extends C5926g0<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        return new C13343e(cVar, oVar);
    }

    /* renamed from: a */
    public static <T, U> C12339o<T, C5926g0<U>> m57720a(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new C13341c(oVar);
    }

    /* renamed from: a */
    public static <T> Callable<C13772a<T>> m57723a(C5923b0<T> b0Var) {
        return new C13349k(b0Var);
    }

    /* renamed from: a */
    public static <T> Callable<C13772a<T>> m57724a(C5923b0<T> b0Var, int i) {
        return new C13339a(b0Var, i);
    }

    /* renamed from: a */
    public static <T> Callable<C13772a<T>> m57725a(C5923b0<T> b0Var, int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C13340b bVar = new C13340b(b0Var, i, j, timeUnit, j0Var);
        return bVar;
    }

    /* renamed from: a */
    public static <T> Callable<C13772a<T>> m57726a(C5923b0<T> b0Var, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C13353o oVar = new C13353o(b0Var, j, timeUnit, j0Var);
        return oVar;
    }

    /* renamed from: a */
    public static <T, R> C12339o<C5923b0<T>, C5926g0<R>> m57721a(C12339o<? super C5923b0<T>, ? extends C5926g0<R>> oVar, C12282j0 j0Var) {
        return new C13350l(oVar, j0Var);
    }
}
