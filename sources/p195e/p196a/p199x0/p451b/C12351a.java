package p195e.p196a.p199x0.p451b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12200a0;
import p195e.p196a.C12282j0;
import p195e.p196a.p439b1.C12205a;
import p195e.p196a.p441d1.C12241d;
import p195e.p196a.p449w0.C12325a;
import p195e.p196a.p449w0.C12326b;
import p195e.p196a.p449w0.C12327c;
import p195e.p196a.p449w0.C12329e;
import p195e.p196a.p449w0.C12331g;
import p195e.p196a.p449w0.C12332h;
import p195e.p196a.p449w0.C12333i;
import p195e.p196a.p449w0.C12334j;
import p195e.p196a.p449w0.C12335k;
import p195e.p196a.p449w0.C12336l;
import p195e.p196a.p449w0.C12337m;
import p195e.p196a.p449w0.C12338n;
import p195e.p196a.p449w0.C12339o;
import p195e.p196a.p449w0.C12341q;
import p195e.p196a.p449w0.C12342r;
import p205i.p211e.C14063d;
import p212io.reactivex.exceptions.OnErrorNotImplementedException;

/* renamed from: e.a.x0.b.a */
/* compiled from: Functions */
public final class C12351a {

    /* renamed from: a */
    static final C12339o<Object, Object> f35501a = new C12386w();

    /* renamed from: b */
    public static final Runnable f35502b = new C12380q();

    /* renamed from: c */
    public static final C12325a f35503c = new C12377n();

    /* renamed from: d */
    static final C12331g<Object> f35504d = new C12378o();

    /* renamed from: e */
    public static final C12331g<Throwable> f35505e = new C12382s();

    /* renamed from: f */
    public static final C12331g<Throwable> f35506f = new C12365g0();

    /* renamed from: g */
    public static final C12341q f35507g = new C12379p();

    /* renamed from: h */
    static final C12342r<Object> f35508h = new C12375l0();

    /* renamed from: i */
    static final C12342r<Object> f35509i = new C12383t();

    /* renamed from: j */
    static final Callable<Object> f35510j = new C12363f0();

    /* renamed from: k */
    static final Comparator<Object> f35511k = new C12355b0();

    /* renamed from: l */
    public static final C12331g<C14063d> f35512l = new C12389z();

    /* renamed from: e.a.x0.b.a$a */
    /* compiled from: Functions */
    static final class C12352a<T> implements C12331g<T> {

        /* renamed from: a */
        final C12325a f35513a;

        C12352a(C12325a aVar) {
            this.f35513a = aVar;
        }

        /* renamed from: c */
        public void mo33410c(T t) throws Exception {
            this.f35513a.run();
        }
    }

    /* renamed from: e.a.x0.b.a$a0 */
    /* compiled from: Functions */
    enum C12353a0 implements Comparator<Object> {
        INSTANCE;

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: e.a.x0.b.a$b */
    /* compiled from: Functions */
    static final class C12354b<T1, T2, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12327c<? super T1, ? super T2, ? extends R> f35514a;

        C12354b(C12327c<? super T1, ? super T2, ? extends R> cVar) {
            this.f35514a = cVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 2) {
                return this.f35514a.mo35569a(objArr[0], objArr[1]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 2 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$b0 */
    /* compiled from: Functions */
    static final class C12355b0 implements Comparator<Object> {
        C12355b0() {
        }

        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    /* renamed from: e.a.x0.b.a$c */
    /* compiled from: Functions */
    static final class C12356c<T1, T2, T3, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12332h<T1, T2, T3, R> f35515a;

        C12356c(C12332h<T1, T2, T3, R> hVar) {
            this.f35515a = hVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 3) {
                return this.f35515a.mo42092a(objArr[0], objArr[1], objArr[2]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 3 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$c0 */
    /* compiled from: Functions */
    static final class C12357c0<T> implements C12325a {

        /* renamed from: a */
        final C12331g<? super C12200a0<T>> f35516a;

        C12357c0(C12331g<? super C12200a0<T>> gVar) {
            this.f35516a = gVar;
        }

        public void run() throws Exception {
            this.f35516a.mo33410c(C12200a0.m54847f());
        }
    }

    /* renamed from: e.a.x0.b.a$d */
    /* compiled from: Functions */
    static final class C12358d<T1, T2, T3, T4, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12333i<T1, T2, T3, T4, R> f35517a;

        C12358d(C12333i<T1, T2, T3, T4, R> iVar) {
            this.f35517a = iVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 4) {
                return this.f35517a.mo42093a(objArr[0], objArr[1], objArr[2], objArr[3]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 4 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$d0 */
    /* compiled from: Functions */
    static final class C12359d0<T> implements C12331g<Throwable> {

        /* renamed from: a */
        final C12331g<? super C12200a0<T>> f35518a;

        C12359d0(C12331g<? super C12200a0<T>> gVar) {
            this.f35518a = gVar;
        }

        /* renamed from: a */
        public void mo33410c(Throwable th) throws Exception {
            this.f35518a.mo33410c(C12200a0.m54846a(th));
        }
    }

    /* renamed from: e.a.x0.b.a$e */
    /* compiled from: Functions */
    static final class C12360e<T1, T2, T3, T4, T5, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        private final C12334j<T1, T2, T3, T4, T5, R> f35519a;

        C12360e(C12334j<T1, T2, T3, T4, T5, R> jVar) {
            this.f35519a = jVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 5) {
                return this.f35519a.mo42094a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 5 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$e0 */
    /* compiled from: Functions */
    static final class C12361e0<T> implements C12331g<T> {

        /* renamed from: a */
        final C12331g<? super C12200a0<T>> f35520a;

        C12361e0(C12331g<? super C12200a0<T>> gVar) {
            this.f35520a = gVar;
        }

        /* renamed from: c */
        public void mo33410c(T t) throws Exception {
            this.f35520a.mo33410c(C12200a0.m54845a(t));
        }
    }

    /* renamed from: e.a.x0.b.a$f */
    /* compiled from: Functions */
    static final class C12362f<T1, T2, T3, T4, T5, T6, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12335k<T1, T2, T3, T4, T5, T6, R> f35521a;

        C12362f(C12335k<T1, T2, T3, T4, T5, T6, R> kVar) {
            this.f35521a = kVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 6) {
                return this.f35521a.mo42095a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 6 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$f0 */
    /* compiled from: Functions */
    static final class C12363f0 implements Callable<Object> {
        C12363f0() {
        }

        public Object call() {
            return null;
        }
    }

    /* renamed from: e.a.x0.b.a$g */
    /* compiled from: Functions */
    static final class C12364g<T1, T2, T3, T4, T5, T6, T7, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12336l<T1, T2, T3, T4, T5, T6, T7, R> f35522a;

        C12364g(C12336l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
            this.f35522a = lVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 7) {
                return this.f35522a.mo42096a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 7 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$g0 */
    /* compiled from: Functions */
    static final class C12365g0 implements C12331g<Throwable> {
        C12365g0() {
        }

        /* renamed from: a */
        public void mo33410c(Throwable th) {
            C12205a.m54894b((Throwable) new OnErrorNotImplementedException(th));
        }
    }

    /* renamed from: e.a.x0.b.a$h */
    /* compiled from: Functions */
    static final class C12366h<T1, T2, T3, T4, T5, T6, T7, T8, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12337m<T1, T2, T3, T4, T5, T6, T7, T8, R> f35523a;

        C12366h(C12337m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
            this.f35523a = mVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 8) {
                return this.f35523a.mo42097a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 8 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$h0 */
    /* compiled from: Functions */
    static final class C12367h0<T> implements C12339o<T, C12241d<T>> {

        /* renamed from: a */
        final TimeUnit f35524a;

        /* renamed from: b */
        final C12282j0 f35525b;

        C12367h0(TimeUnit timeUnit, C12282j0 j0Var) {
            this.f35524a = timeUnit;
            this.f35525b = j0Var;
        }

        public C12241d<T> apply(T t) throws Exception {
            return new C12241d<>(t, this.f35525b.mo41870a(this.f35524a), this.f35524a);
        }
    }

    /* renamed from: e.a.x0.b.a$i */
    /* compiled from: Functions */
    static final class C12368i<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements C12339o<Object[], R> {

        /* renamed from: a */
        final C12338n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> f35526a;

        C12368i(C12338n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
            this.f35526a = nVar;
        }

        /* renamed from: a */
        public R apply(Object[] objArr) throws Exception {
            if (objArr.length == 9) {
                return this.f35526a.mo42098a(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Array of size 9 expected but got ");
            sb.append(objArr.length);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: e.a.x0.b.a$i0 */
    /* compiled from: Functions */
    static final class C12369i0<K, T> implements C12326b<Map<K, T>, T> {

        /* renamed from: a */
        private final C12339o<? super T, ? extends K> f35527a;

        C12369i0(C12339o<? super T, ? extends K> oVar) {
            this.f35527a = oVar;
        }

        /* renamed from: a */
        public void mo42088a(Map<K, T> map, T t) throws Exception {
            map.put(this.f35527a.apply(t), t);
        }
    }

    /* renamed from: e.a.x0.b.a$j */
    /* compiled from: Functions */
    static final class C12370j<T> implements Callable<List<T>> {

        /* renamed from: a */
        final int f35528a;

        C12370j(int i) {
            this.f35528a = i;
        }

        public List<T> call() throws Exception {
            return new ArrayList(this.f35528a);
        }
    }

    /* renamed from: e.a.x0.b.a$j0 */
    /* compiled from: Functions */
    static final class C12371j0<K, V, T> implements C12326b<Map<K, V>, T> {

        /* renamed from: a */
        private final C12339o<? super T, ? extends V> f35529a;

        /* renamed from: b */
        private final C12339o<? super T, ? extends K> f35530b;

        C12371j0(C12339o<? super T, ? extends V> oVar, C12339o<? super T, ? extends K> oVar2) {
            this.f35529a = oVar;
            this.f35530b = oVar2;
        }

        /* renamed from: a */
        public void mo42088a(Map<K, V> map, T t) throws Exception {
            map.put(this.f35530b.apply(t), this.f35529a.apply(t));
        }
    }

    /* renamed from: e.a.x0.b.a$k */
    /* compiled from: Functions */
    static final class C12372k<T> implements C12342r<T> {

        /* renamed from: a */
        final C12329e f35531a;

        C12372k(C12329e eVar) {
            this.f35531a = eVar;
        }

        /* renamed from: b */
        public boolean mo41812b(T t) throws Exception {
            return !this.f35531a.mo42090a();
        }
    }

    /* renamed from: e.a.x0.b.a$k0 */
    /* compiled from: Functions */
    static final class C12373k0<K, V, T> implements C12326b<Map<K, Collection<V>>, T> {

        /* renamed from: a */
        private final C12339o<? super K, ? extends Collection<? super V>> f35532a;

        /* renamed from: b */
        private final C12339o<? super T, ? extends V> f35533b;

        /* renamed from: c */
        private final C12339o<? super T, ? extends K> f35534c;

        C12373k0(C12339o<? super K, ? extends Collection<? super V>> oVar, C12339o<? super T, ? extends V> oVar2, C12339o<? super T, ? extends K> oVar3) {
            this.f35532a = oVar;
            this.f35533b = oVar2;
            this.f35534c = oVar3;
        }

        /* renamed from: a */
        public void mo42088a(Map<K, Collection<V>> map, T t) throws Exception {
            Object apply = this.f35534c.apply(t);
            Collection collection = (Collection) map.get(apply);
            if (collection == null) {
                collection = (Collection) this.f35532a.apply(apply);
                map.put(apply, collection);
            }
            collection.add(this.f35533b.apply(t));
        }
    }

    /* renamed from: e.a.x0.b.a$l */
    /* compiled from: Functions */
    static final class C12374l<T, U> implements C12339o<T, U> {

        /* renamed from: a */
        final Class<U> f35535a;

        C12374l(Class<U> cls) {
            this.f35535a = cls;
        }

        public U apply(T t) throws Exception {
            return this.f35535a.cast(t);
        }
    }

    /* renamed from: e.a.x0.b.a$l0 */
    /* compiled from: Functions */
    static final class C12375l0 implements C12342r<Object> {
        C12375l0() {
        }

        /* renamed from: b */
        public boolean mo41812b(Object obj) {
            return true;
        }
    }

    /* renamed from: e.a.x0.b.a$m */
    /* compiled from: Functions */
    static final class C12376m<T, U> implements C12342r<T> {

        /* renamed from: a */
        final Class<U> f35536a;

        C12376m(Class<U> cls) {
            this.f35536a = cls;
        }

        /* renamed from: b */
        public boolean mo41812b(T t) throws Exception {
            return this.f35536a.isInstance(t);
        }
    }

    /* renamed from: e.a.x0.b.a$n */
    /* compiled from: Functions */
    static final class C12377n implements C12325a {
        C12377n() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    /* renamed from: e.a.x0.b.a$o */
    /* compiled from: Functions */
    static final class C12378o implements C12331g<Object> {
        C12378o() {
        }

        /* renamed from: c */
        public void mo33410c(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    /* renamed from: e.a.x0.b.a$p */
    /* compiled from: Functions */
    static final class C12379p implements C12341q {
        C12379p() {
        }

        /* renamed from: a */
        public void mo42100a(long j) {
        }
    }

    /* renamed from: e.a.x0.b.a$q */
    /* compiled from: Functions */
    static final class C12380q implements Runnable {
        C12380q() {
        }

        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    /* renamed from: e.a.x0.b.a$r */
    /* compiled from: Functions */
    static final class C12381r<T> implements C12342r<T> {

        /* renamed from: a */
        final T f35537a;

        C12381r(T t) {
            this.f35537a = t;
        }

        /* renamed from: b */
        public boolean mo41812b(T t) throws Exception {
            return C12390b.m55564a((Object) t, (Object) this.f35537a);
        }
    }

    /* renamed from: e.a.x0.b.a$s */
    /* compiled from: Functions */
    static final class C12382s implements C12331g<Throwable> {
        C12382s() {
        }

        /* renamed from: a */
        public void mo33410c(Throwable th) {
            C12205a.m54894b(th);
        }
    }

    /* renamed from: e.a.x0.b.a$t */
    /* compiled from: Functions */
    static final class C12383t implements C12342r<Object> {
        C12383t() {
        }

        /* renamed from: b */
        public boolean mo41812b(Object obj) {
            return false;
        }
    }

    /* renamed from: e.a.x0.b.a$u */
    /* compiled from: Functions */
    static final class C12384u implements C12325a {

        /* renamed from: a */
        final Future<?> f35538a;

        C12384u(Future<?> future) {
            this.f35538a = future;
        }

        public void run() throws Exception {
            this.f35538a.get();
        }
    }

    /* renamed from: e.a.x0.b.a$v */
    /* compiled from: Functions */
    enum C12385v implements Callable<Set<Object>> {
        INSTANCE;

        public Set<Object> call() throws Exception {
            return new HashSet();
        }
    }

    /* renamed from: e.a.x0.b.a$w */
    /* compiled from: Functions */
    static final class C12386w implements C12339o<Object, Object> {
        C12386w() {
        }

        public Object apply(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    /* renamed from: e.a.x0.b.a$x */
    /* compiled from: Functions */
    static final class C12387x<T, U> implements Callable<U>, C12339o<T, U> {

        /* renamed from: a */
        final U f35539a;

        C12387x(U u) {
            this.f35539a = u;
        }

        public U apply(T t) throws Exception {
            return this.f35539a;
        }

        public U call() throws Exception {
            return this.f35539a;
        }
    }

    /* renamed from: e.a.x0.b.a$y */
    /* compiled from: Functions */
    static final class C12388y<T> implements C12339o<List<T>, List<T>> {

        /* renamed from: a */
        final Comparator<? super T> f35540a;

        C12388y(Comparator<? super T> comparator) {
            this.f35540a = comparator;
        }

        /* renamed from: a */
        public List<T> apply(List<T> list) {
            Collections.sort(list, this.f35540a);
            return list;
        }
    }

    /* renamed from: e.a.x0.b.a$z */
    /* compiled from: Functions */
    static final class C12389z implements C12331g<C14063d> {
        C12389z() {
        }

        /* renamed from: a */
        public void mo33410c(C14063d dVar) throws Exception {
            dVar.mo41813c(Long.MAX_VALUE);
        }
    }

    private C12351a() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: a */
    public static <T1, T2, R> C12339o<Object[], R> m55498a(C12327c<? super T1, ? super T2, ? extends R> cVar) {
        C12390b.m55563a(cVar, "f is null");
        return new C12354b(cVar);
    }

    /* renamed from: b */
    public static <T> C12342r<T> m55514b() {
        return f35508h;
    }

    /* renamed from: c */
    public static <T, U> C12339o<T, U> m55518c(U u) {
        return new C12387x(u);
    }

    /* renamed from: d */
    public static <T> C12331g<T> m55520d() {
        return f35504d;
    }

    /* renamed from: e */
    public static <T> C12339o<T, T> m55521e() {
        return f35501a;
    }

    /* renamed from: f */
    public static <T> Comparator<T> m55522f() {
        return C12353a0.INSTANCE;
    }

    /* renamed from: g */
    public static <T> Comparator<T> m55523g() {
        return f35511k;
    }

    /* renamed from: h */
    public static <T> Callable<T> m55524h() {
        return f35510j;
    }

    /* renamed from: b */
    public static <T> Callable<T> m55516b(T t) {
        return new C12387x(t);
    }

    /* renamed from: c */
    public static <T> Callable<Set<T>> m55519c() {
        return C12385v.INSTANCE;
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> C12339o<Object[], R> m55499a(C12332h<T1, T2, T3, R> hVar) {
        C12390b.m55563a(hVar, "f is null");
        return new C12356c(hVar);
    }

    /* renamed from: b */
    public static <T> C12331g<Throwable> m55513b(C12331g<? super C12200a0<T>> gVar) {
        return new C12359d0(gVar);
    }

    /* renamed from: c */
    public static <T> C12331g<T> m55517c(C12331g<? super C12200a0<T>> gVar) {
        return new C12361e0(gVar);
    }

    /* renamed from: b */
    public static <T, U> C12342r<T> m55515b(Class<U> cls) {
        return new C12376m(cls);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> C12339o<Object[], R> m55500a(C12333i<T1, T2, T3, T4, R> iVar) {
        C12390b.m55563a(iVar, "f is null");
        return new C12358d(iVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, R> C12339o<Object[], R> m55501a(C12334j<T1, T2, T3, T4, T5, R> jVar) {
        C12390b.m55563a(jVar, "f is null");
        return new C12360e(jVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, R> C12339o<Object[], R> m55502a(C12335k<T1, T2, T3, T4, T5, T6, R> kVar) {
        C12390b.m55563a(kVar, "f is null");
        return new C12362f(kVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, R> C12339o<Object[], R> m55503a(C12336l<T1, T2, T3, T4, T5, T6, T7, R> lVar) {
        C12390b.m55563a(lVar, "f is null");
        return new C12364g(lVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> C12339o<Object[], R> m55504a(C12337m<T1, T2, T3, T4, T5, T6, T7, T8, R> mVar) {
        C12390b.m55563a(mVar, "f is null");
        return new C12366h(mVar);
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C12339o<Object[], R> m55505a(C12338n<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> nVar) {
        C12390b.m55563a(nVar, "f is null");
        return new C12368i(nVar);
    }

    /* renamed from: a */
    public static <T> C12342r<T> m55509a() {
        return f35509i;
    }

    /* renamed from: a */
    public static C12325a m55493a(Future<?> future) {
        return new C12384u(future);
    }

    /* renamed from: a */
    public static <T, U> C12339o<T, U> m55506a(Class<U> cls) {
        return new C12374l(cls);
    }

    /* renamed from: a */
    public static <T> Callable<List<T>> m55512a(int i) {
        return new C12370j(i);
    }

    /* renamed from: a */
    public static <T> C12342r<T> m55511a(T t) {
        return new C12381r(t);
    }

    /* renamed from: a */
    public static <T> C12325a m55492a(C12331g<? super C12200a0<T>> gVar) {
        return new C12357c0(gVar);
    }

    /* renamed from: a */
    public static <T> C12331g<T> m55497a(C12325a aVar) {
        return new C12352a(aVar);
    }

    /* renamed from: a */
    public static <T> C12342r<T> m55510a(C12329e eVar) {
        return new C12372k(eVar);
    }

    /* renamed from: a */
    public static <T> C12339o<T, C12241d<T>> m55508a(TimeUnit timeUnit, C12282j0 j0Var) {
        return new C12367h0(timeUnit, j0Var);
    }

    /* renamed from: a */
    public static <T, K> C12326b<Map<K, T>, T> m55494a(C12339o<? super T, ? extends K> oVar) {
        return new C12369i0(oVar);
    }

    /* renamed from: a */
    public static <T, K, V> C12326b<Map<K, V>, T> m55495a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2) {
        return new C12371j0(oVar2, oVar);
    }

    /* renamed from: a */
    public static <T, K, V> C12326b<Map<K, Collection<V>>, T> m55496a(C12339o<? super T, ? extends K> oVar, C12339o<? super T, ? extends V> oVar2, C12339o<? super K, ? extends Collection<? super V>> oVar3) {
        return new C12373k0(oVar3, oVar2, oVar);
    }

    /* renamed from: a */
    public static <T> C12339o<List<T>, List<T>> m55507a(Comparator<? super T> comparator) {
        return new C12388y(comparator);
    }
}
