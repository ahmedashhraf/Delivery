package p195e.p196a.p199x0.p454e.p456b;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12282j0;
import p195e.p196a.C12287k;
import p195e.p196a.C5929l;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p448v0.C12322a;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12326b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12339o;
import p205i.p211e.C14062c;
import p205i.p211e.C14063d;
import p205i.p211e.C6007b;

/* renamed from: e.a.x0.e.b.s1 */
/* compiled from: FlowableInternalHelper */
public final class C12808s1 {

    /* renamed from: e.a.x0.e.b.s1$a */
    /* compiled from: FlowableInternalHelper */
    static final class C12809a<T> implements Callable<C12322a<T>> {

        /* renamed from: a */
        private final C5929l<T> f36814a;

        /* renamed from: b */
        private final int f36815b;

        C12809a(C5929l<T> lVar, int i) {
            this.f36814a = lVar;
            this.f36815b = i;
        }

        public C12322a<T> call() {
            return this.f36814a.mo24536h(this.f36815b);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$b */
    /* compiled from: FlowableInternalHelper */
    static final class C12810b<T> implements Callable<C12322a<T>> {

        /* renamed from: N */
        private final long f36816N;

        /* renamed from: O */
        private final TimeUnit f36817O;

        /* renamed from: P */
        private final C12282j0 f36818P;

        /* renamed from: a */
        private final C5929l<T> f36819a;

        /* renamed from: b */
        private final int f36820b;

        C12810b(C5929l<T> lVar, int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f36819a = lVar;
            this.f36820b = i;
            this.f36816N = j;
            this.f36817O = timeUnit;
            this.f36818P = j0Var;
        }

        public C12322a<T> call() {
            return this.f36819a.mo24388a(this.f36820b, this.f36816N, this.f36817O, this.f36818P);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$c */
    /* compiled from: FlowableInternalHelper */
    static final class C12811c<T, U> implements C12339o<T, C6007b<U>> {

        /* renamed from: a */
        private final C12339o<? super T, ? extends Iterable<? extends U>> f36821a;

        C12811c(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
            this.f36821a = oVar;
        }

        public C6007b<U> apply(T t) throws Exception {
            return new C12663j1((Iterable) C12390b.m55563a(this.f36821a.apply(t), "The mapper returned a null Iterable"));
        }
    }

    /* renamed from: e.a.x0.e.b.s1$d */
    /* compiled from: FlowableInternalHelper */
    static final class C12812d<U, R, T> implements C12339o<U, R> {

        /* renamed from: a */
        private final C12327c<? super T, ? super U, ? extends R> f36822a;

        /* renamed from: b */
        private final T f36823b;

        C12812d(C12327c<? super T, ? super U, ? extends R> cVar, T t) {
            this.f36822a = cVar;
            this.f36823b = t;
        }

        public R apply(U u) throws Exception {
            return this.f36822a.mo35569a(this.f36823b, u);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$e */
    /* compiled from: FlowableInternalHelper */
    static final class C12813e<T, R, U> implements C12339o<T, C6007b<R>> {

        /* renamed from: a */
        private final C12327c<? super T, ? super U, ? extends R> f36824a;

        /* renamed from: b */
        private final C12339o<? super T, ? extends C6007b<? extends U>> f36825b;

        C12813e(C12327c<? super T, ? super U, ? extends R> cVar, C12339o<? super T, ? extends C6007b<? extends U>> oVar) {
            this.f36824a = cVar;
            this.f36825b = oVar;
        }

        public C6007b<R> apply(T t) throws Exception {
            return new C12558d2((C6007b) C12390b.m55563a(this.f36825b.apply(t), "The mapper returned a null Publisher"), new C12812d(this.f36824a, t));
        }
    }

    /* renamed from: e.a.x0.e.b.s1$f */
    /* compiled from: FlowableInternalHelper */
    static final class C12814f<T, U> implements C12339o<T, C6007b<T>> {

        /* renamed from: a */
        final C12339o<? super T, ? extends C6007b<U>> f36826a;

        C12814f(C12339o<? super T, ? extends C6007b<U>> oVar) {
            this.f36826a = oVar;
        }

        public C6007b<T> apply(T t) throws Exception {
            return new C12589e4((C6007b) C12390b.m55563a(this.f36826a.apply(t), "The itemDelay returned a null Publisher"), 1).mo24598u(C12351a.m55518c(t)).mo24547i(t);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$g */
    /* compiled from: FlowableInternalHelper */
    static final class C12815g<T> implements Callable<C12322a<T>> {

        /* renamed from: a */
        private final C5929l<T> f36827a;

        C12815g(C5929l<T> lVar) {
            this.f36827a = lVar;
        }

        public C12322a<T> call() {
            return this.f36827a.mo24248C();
        }
    }

    /* renamed from: e.a.x0.e.b.s1$h */
    /* compiled from: FlowableInternalHelper */
    static final class C12816h<T, R> implements C12339o<C5929l<T>, C6007b<R>> {

        /* renamed from: a */
        private final C12339o<? super C5929l<T>, ? extends C6007b<R>> f36828a;

        /* renamed from: b */
        private final C12282j0 f36829b;

        C12816h(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, C12282j0 j0Var) {
            this.f36828a = oVar;
            this.f36829b = j0Var;
        }

        /* renamed from: a */
        public C6007b<R> apply(C5929l<T> lVar) throws Exception {
            return C5929l.m26913q((C6007b) C12390b.m55563a(this.f36828a.apply(lVar), "The selector returned a null Publisher")).mo24316a(this.f36829b);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$i */
    /* compiled from: FlowableInternalHelper */
    public enum C12817i implements C12331g<C14063d> {
        INSTANCE;

        /* renamed from: a */
        public void mo33410c(C14063d dVar) throws Exception {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$j */
    /* compiled from: FlowableInternalHelper */
    static final class C12818j<T, S> implements C12327c<S, C12287k<T>, S> {

        /* renamed from: a */
        final C12326b<S, C12287k<T>> f36830a;

        C12818j(C12326b<S, C12287k<T>> bVar) {
            this.f36830a = bVar;
        }

        /* renamed from: a */
        public S mo35569a(S s, C12287k<T> kVar) throws Exception {
            this.f36830a.mo42088a(s, kVar);
            return s;
        }
    }

    /* renamed from: e.a.x0.e.b.s1$k */
    /* compiled from: FlowableInternalHelper */
    static final class C12819k<T, S> implements C12327c<S, C12287k<T>, S> {

        /* renamed from: a */
        final C12331g<C12287k<T>> f36831a;

        C12819k(C12331g<C12287k<T>> gVar) {
            this.f36831a = gVar;
        }

        /* renamed from: a */
        public S mo35569a(S s, C12287k<T> kVar) throws Exception {
            this.f36831a.mo33410c(kVar);
            return s;
        }
    }

    /* renamed from: e.a.x0.e.b.s1$l */
    /* compiled from: FlowableInternalHelper */
    static final class C12820l<T> implements C12325a {

        /* renamed from: a */
        final C14062c<T> f36832a;

        C12820l(C14062c<T> cVar) {
            this.f36832a = cVar;
        }

        public void run() throws Exception {
            this.f36832a.onComplete();
        }
    }

    /* renamed from: e.a.x0.e.b.s1$m */
    /* compiled from: FlowableInternalHelper */
    static final class C12821m<T> implements C12331g<Throwable> {

        /* renamed from: a */
        final C14062c<T> f36833a;

        C12821m(C14062c<T> cVar) {
            this.f36833a = cVar;
        }

        /* renamed from: a */
        public void mo33410c(Throwable th) throws Exception {
            this.f36833a.onError(th);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$n */
    /* compiled from: FlowableInternalHelper */
    static final class C12822n<T> implements C12331g<T> {

        /* renamed from: a */
        final C14062c<T> f36834a;

        C12822n(C14062c<T> cVar) {
            this.f36834a = cVar;
        }

        /* renamed from: c */
        public void mo33410c(T t) throws Exception {
            this.f36834a.mo41789a(t);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$o */
    /* compiled from: FlowableInternalHelper */
    static final class C12823o<T> implements Callable<C12322a<T>> {

        /* renamed from: N */
        private final TimeUnit f36835N;

        /* renamed from: O */
        private final C12282j0 f36836O;

        /* renamed from: a */
        private final C5929l<T> f36837a;

        /* renamed from: b */
        private final long f36838b;

        C12823o(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
            this.f36837a = lVar;
            this.f36838b = j;
            this.f36835N = timeUnit;
            this.f36836O = j0Var;
        }

        public C12322a<T> call() {
            return this.f36837a.mo24496e(this.f36838b, this.f36835N, this.f36836O);
        }
    }

    /* renamed from: e.a.x0.e.b.s1$p */
    /* compiled from: FlowableInternalHelper */
    static final class C12824p<T, R> implements C12339o<List<C6007b<? extends T>>, C6007b<? extends R>> {

        /* renamed from: a */
        private final C12339o<? super Object[], ? extends R> f36839a;

        C12824p(C12339o<? super Object[], ? extends R> oVar) {
            this.f36839a = oVar;
        }

        /* renamed from: a */
        public C6007b<? extends R> apply(List<C6007b<? extends T>> list) {
            return C5929l.m26826a((Iterable<? extends C6007b<? extends T>>) list, this.f36839a, false, C5929l.m26793R());
        }
    }

    private C12808s1() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T, S> C12327c<S, C12287k<T>, S> m56519a(C12331g<C12287k<T>> gVar) {
        return new C12819k(gVar);
    }

    /* renamed from: b */
    public static <T, U> C12339o<T, C6007b<T>> m56528b(C12339o<? super T, ? extends C6007b<U>> oVar) {
        return new C12814f(oVar);
    }

    /* renamed from: c */
    public static <T> C12331g<T> m56529c(C14062c<T> cVar) {
        return new C12822n(cVar);
    }

    /* renamed from: a */
    public static <T, S> C12327c<S, C12287k<T>, S> m56518a(C12326b<S, C12287k<T>> bVar) {
        return new C12818j(bVar);
    }

    /* renamed from: b */
    public static <T> C12331g<Throwable> m56527b(C14062c<T> cVar) {
        return new C12821m(cVar);
    }

    /* renamed from: c */
    public static <T, R> C12339o<List<C6007b<? extends T>>, C6007b<? extends R>> m56530c(C12339o<? super Object[], ? extends R> oVar) {
        return new C12824p(oVar);
    }

    /* renamed from: a */
    public static <T> C12325a m56517a(C14062c<T> cVar) {
        return new C12820l(cVar);
    }

    /* renamed from: a */
    public static <T, U, R> C12339o<T, C6007b<R>> m56522a(C12339o<? super T, ? extends C6007b<? extends U>> oVar, C12327c<? super T, ? super U, ? extends R> cVar) {
        return new C12813e(cVar, oVar);
    }

    /* renamed from: a */
    public static <T, U> C12339o<T, C6007b<U>> m56520a(C12339o<? super T, ? extends Iterable<? extends U>> oVar) {
        return new C12811c(oVar);
    }

    /* renamed from: a */
    public static <T> Callable<C12322a<T>> m56523a(C5929l<T> lVar) {
        return new C12815g(lVar);
    }

    /* renamed from: a */
    public static <T> Callable<C12322a<T>> m56524a(C5929l<T> lVar, int i) {
        return new C12809a(lVar, i);
    }

    /* renamed from: a */
    public static <T> Callable<C12322a<T>> m56525a(C5929l<T> lVar, int i, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12810b bVar = new C12810b(lVar, i, j, timeUnit, j0Var);
        return bVar;
    }

    /* renamed from: a */
    public static <T> Callable<C12322a<T>> m56526a(C5929l<T> lVar, long j, TimeUnit timeUnit, C12282j0 j0Var) {
        C12823o oVar = new C12823o(lVar, j, timeUnit, j0Var);
        return oVar;
    }

    /* renamed from: a */
    public static <T, R> C12339o<C5929l<T>, C6007b<R>> m56521a(C12339o<? super C5929l<T>, ? extends C6007b<R>> oVar, C12282j0 j0Var) {
        return new C12816h(oVar, j0Var);
    }
}
