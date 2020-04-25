package bolts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bolts.n */
/* compiled from: Task */
public class C2177n<TResult> {

    /* renamed from: i */
    public static final ExecutorService f8642i = C2167g.m11197a();

    /* renamed from: j */
    private static final Executor f8643j = C2167g.m11198b();

    /* renamed from: k */
    public static final Executor f8644k = C2156a.m11165b();

    /* renamed from: l */
    private static volatile C2195q f8645l;

    /* renamed from: m */
    private static C2177n<?> f8646m = new C2177n<>((TResult) null);

    /* renamed from: n */
    private static C2177n<Boolean> f8647n = new C2177n<>((TResult) Boolean.valueOf(true));

    /* renamed from: o */
    private static C2177n<Boolean> f8648o = new C2177n<>((TResult) Boolean.valueOf(false));

    /* renamed from: p */
    private static C2177n<?> f8649p = new C2177n<>(true);

    /* renamed from: a */
    private final Object f8650a = new Object();

    /* renamed from: b */
    private boolean f8651b;

    /* renamed from: c */
    private boolean f8652c;

    /* renamed from: d */
    private TResult f8653d;

    /* renamed from: e */
    private Exception f8654e;

    /* renamed from: f */
    private boolean f8655f;

    /* renamed from: g */
    private C2197p f8656g;

    /* renamed from: h */
    private List<C2175l<TResult, Void>> f8657h = new ArrayList();

    /* renamed from: bolts.n$a */
    /* compiled from: Task */
    class C2178a implements C2175l<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C2196o f8658a;

        /* renamed from: b */
        final /* synthetic */ C2175l f8659b;

        /* renamed from: c */
        final /* synthetic */ Executor f8660c;

        /* renamed from: d */
        final /* synthetic */ C2170h f8661d;

        C2178a(C2196o oVar, C2175l lVar, Executor executor, C2170h hVar) {
            this.f8658a = oVar;
            this.f8659b = lVar;
            this.f8660c = executor;
            this.f8661d = hVar;
        }

        public Void then(C2177n<TResult> nVar) {
            C2177n.m11246d(this.f8658a, this.f8659b, nVar, this.f8660c, this.f8661d);
            return null;
        }
    }

    /* renamed from: bolts.n$b */
    /* compiled from: Task */
    class C2179b implements C2175l<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ C2196o f8663a;

        /* renamed from: b */
        final /* synthetic */ C2175l f8664b;

        /* renamed from: c */
        final /* synthetic */ Executor f8665c;

        /* renamed from: d */
        final /* synthetic */ C2170h f8666d;

        C2179b(C2196o oVar, C2175l lVar, Executor executor, C2170h hVar) {
            this.f8663a = oVar;
            this.f8664b = lVar;
            this.f8665c = executor;
            this.f8666d = hVar;
        }

        public Void then(C2177n<TResult> nVar) {
            C2177n.m11244c(this.f8663a, this.f8664b, nVar, this.f8665c, this.f8666d);
            return null;
        }
    }

    /* renamed from: bolts.n$c */
    /* compiled from: Task */
    class C2180c implements C2175l<TResult, C2177n<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ C2170h f8668a;

        /* renamed from: b */
        final /* synthetic */ C2175l f8669b;

        C2180c(C2170h hVar, C2175l lVar) {
            this.f8668a = hVar;
            this.f8669b = lVar;
        }

        public C2177n<TContinuationResult> then(C2177n<TResult> nVar) {
            C2170h hVar = this.f8668a;
            if (hVar != null && hVar.mo9283a()) {
                return C2177n.m11247j();
            }
            if (nVar.mo9328f()) {
                return C2177n.m11237b(nVar.mo9316b());
            }
            if (nVar.mo9326d()) {
                return C2177n.m11247j();
            }
            return nVar.mo9301a(this.f8669b);
        }
    }

    /* renamed from: bolts.n$d */
    /* compiled from: Task */
    class C2181d implements C2175l<TResult, C2177n<TContinuationResult>> {

        /* renamed from: a */
        final /* synthetic */ C2170h f8671a;

        /* renamed from: b */
        final /* synthetic */ C2175l f8672b;

        C2181d(C2170h hVar, C2175l lVar) {
            this.f8671a = hVar;
            this.f8672b = lVar;
        }

        public C2177n<TContinuationResult> then(C2177n<TResult> nVar) {
            C2170h hVar = this.f8671a;
            if (hVar != null && hVar.mo9283a()) {
                return C2177n.m11247j();
            }
            if (nVar.mo9328f()) {
                return C2177n.m11237b(nVar.mo9316b());
            }
            if (nVar.mo9326d()) {
                return C2177n.m11247j();
            }
            return nVar.mo9312b(this.f8672b);
        }
    }

    /* renamed from: bolts.n$e */
    /* compiled from: Task */
    static class C2182e implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C2175l f8674N;

        /* renamed from: O */
        final /* synthetic */ C2177n f8675O;

        /* renamed from: a */
        final /* synthetic */ C2170h f8676a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8677b;

        C2182e(C2170h hVar, C2196o oVar, C2175l lVar, C2177n nVar) {
            this.f8676a = hVar;
            this.f8677b = oVar;
            this.f8674N = lVar;
            this.f8675O = nVar;
        }

        public void run() {
            C2170h hVar = this.f8676a;
            if (hVar == null || !hVar.mo9283a()) {
                try {
                    this.f8677b.mo9340a(this.f8674N.then(this.f8675O));
                } catch (CancellationException unused) {
                    this.f8677b.mo9341b();
                } catch (Exception e) {
                    this.f8677b.mo9339a(e);
                }
                return;
            }
            this.f8677b.mo9341b();
        }
    }

    /* renamed from: bolts.n$f */
    /* compiled from: Task */
    static class C2183f implements Runnable {

        /* renamed from: N */
        final /* synthetic */ C2175l f8678N;

        /* renamed from: O */
        final /* synthetic */ C2177n f8679O;

        /* renamed from: a */
        final /* synthetic */ C2170h f8680a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8681b;

        /* renamed from: bolts.n$f$a */
        /* compiled from: Task */
        class C2184a implements C2175l<TContinuationResult, Void> {
            C2184a() {
            }

            public Void then(C2177n<TContinuationResult> nVar) {
                C2170h hVar = C2183f.this.f8680a;
                if (hVar == null || !hVar.mo9283a()) {
                    if (nVar.mo9326d()) {
                        C2183f.this.f8681b.mo9341b();
                    } else if (nVar.mo9328f()) {
                        C2183f.this.f8681b.mo9339a(nVar.mo9316b());
                    } else {
                        C2183f.this.f8681b.mo9340a(nVar.mo9321c());
                    }
                    return null;
                }
                C2183f.this.f8681b.mo9341b();
                return null;
            }
        }

        C2183f(C2170h hVar, C2196o oVar, C2175l lVar, C2177n nVar) {
            this.f8680a = hVar;
            this.f8681b = oVar;
            this.f8678N = lVar;
            this.f8679O = nVar;
        }

        public void run() {
            C2170h hVar = this.f8680a;
            if (hVar == null || !hVar.mo9283a()) {
                try {
                    C2177n nVar = (C2177n) this.f8678N.then(this.f8679O);
                    if (nVar == null) {
                        this.f8681b.mo9340a(null);
                    } else {
                        nVar.mo9301a((C2175l<TResult, TContinuationResult>) new C2184a<TResult,TContinuationResult>());
                    }
                } catch (CancellationException unused) {
                    this.f8681b.mo9341b();
                } catch (Exception e) {
                    this.f8681b.mo9339a(e);
                }
                return;
            }
            this.f8681b.mo9341b();
        }
    }

    /* renamed from: bolts.n$g */
    /* compiled from: Task */
    static class C2185g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2196o f8683a;

        C2185g(C2196o oVar) {
            this.f8683a = oVar;
        }

        public void run() {
            this.f8683a.mo9343b(null);
        }
    }

    /* renamed from: bolts.n$h */
    /* compiled from: Task */
    static class C2186h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ScheduledFuture f8684a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8685b;

        C2186h(ScheduledFuture scheduledFuture, C2196o oVar) {
            this.f8684a = scheduledFuture;
            this.f8685b = oVar;
        }

        public void run() {
            this.f8684a.cancel(true);
            this.f8685b.mo9344c();
        }
    }

    /* renamed from: bolts.n$i */
    /* compiled from: Task */
    class C2187i implements C2175l<TResult, C2177n<Void>> {
        C2187i() {
        }

        public C2177n<Void> then(C2177n<TResult> nVar) throws Exception {
            if (nVar.mo9326d()) {
                return C2177n.m11247j();
            }
            if (nVar.mo9328f()) {
                return C2177n.m11237b(nVar.mo9316b());
            }
            return C2177n.m11238b(null);
        }
    }

    /* renamed from: bolts.n$j */
    /* compiled from: Task */
    static class C2188j implements Runnable {

        /* renamed from: N */
        final /* synthetic */ Callable f8687N;

        /* renamed from: a */
        final /* synthetic */ C2170h f8688a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8689b;

        C2188j(C2170h hVar, C2196o oVar, Callable callable) {
            this.f8688a = hVar;
            this.f8689b = oVar;
            this.f8687N = callable;
        }

        public void run() {
            C2170h hVar = this.f8688a;
            if (hVar == null || !hVar.mo9283a()) {
                try {
                    this.f8689b.mo9340a(this.f8687N.call());
                } catch (CancellationException unused) {
                    this.f8689b.mo9341b();
                } catch (Exception e) {
                    this.f8689b.mo9339a(e);
                }
                return;
            }
            this.f8689b.mo9341b();
        }
    }

    /* renamed from: bolts.n$k */
    /* compiled from: Task */
    static class C2189k implements C2175l<TResult, Void> {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f8690a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8691b;

        C2189k(AtomicBoolean atomicBoolean, C2196o oVar) {
            this.f8690a = atomicBoolean;
            this.f8691b = oVar;
        }

        public Void then(C2177n<TResult> nVar) {
            if (this.f8690a.compareAndSet(false, true)) {
                this.f8691b.mo9340a(nVar);
            } else {
                nVar.mo9316b();
            }
            return null;
        }
    }

    /* renamed from: bolts.n$l */
    /* compiled from: Task */
    static class C2190l implements C2175l<Object, Void> {

        /* renamed from: a */
        final /* synthetic */ AtomicBoolean f8692a;

        /* renamed from: b */
        final /* synthetic */ C2196o f8693b;

        C2190l(AtomicBoolean atomicBoolean, C2196o oVar) {
            this.f8692a = atomicBoolean;
            this.f8693b = oVar;
        }

        public Void then(C2177n<Object> nVar) {
            if (this.f8692a.compareAndSet(false, true)) {
                this.f8693b.mo9340a(nVar);
            } else {
                nVar.mo9316b();
            }
            return null;
        }
    }

    /* renamed from: bolts.n$m */
    /* compiled from: Task */
    static class C2191m implements C2175l<Void, List<TResult>> {

        /* renamed from: a */
        final /* synthetic */ Collection f8694a;

        C2191m(Collection collection) {
            this.f8694a = collection;
        }

        public List<TResult> then(C2177n<Void> nVar) throws Exception {
            if (this.f8694a.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (C2177n c : this.f8694a) {
                arrayList.add(c.mo9321c());
            }
            return arrayList;
        }
    }

    /* renamed from: bolts.n$n */
    /* compiled from: Task */
    static class C2192n implements C2175l<Object, Void> {

        /* renamed from: a */
        final /* synthetic */ Object f8695a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f8696b;

        /* renamed from: c */
        final /* synthetic */ AtomicBoolean f8697c;

        /* renamed from: d */
        final /* synthetic */ AtomicInteger f8698d;

        /* renamed from: e */
        final /* synthetic */ C2196o f8699e;

        C2192n(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, C2196o oVar) {
            this.f8695a = obj;
            this.f8696b = arrayList;
            this.f8697c = atomicBoolean;
            this.f8698d = atomicInteger;
            this.f8699e = oVar;
        }

        public Void then(C2177n<Object> nVar) {
            if (nVar.mo9328f()) {
                synchronized (this.f8695a) {
                    this.f8696b.add(nVar.mo9316b());
                }
            }
            if (nVar.mo9326d()) {
                this.f8697c.set(true);
            }
            if (this.f8698d.decrementAndGet() == 0) {
                if (this.f8696b.size() != 0) {
                    if (this.f8696b.size() == 1) {
                        this.f8699e.mo9339a((Exception) this.f8696b.get(0));
                    } else {
                        this.f8699e.mo9339a((Exception) new AggregateException(String.format("There were %d exceptions.", new Object[]{Integer.valueOf(this.f8696b.size())}), (List<? extends Throwable>) this.f8696b));
                    }
                } else if (this.f8697c.get()) {
                    this.f8699e.mo9341b();
                } else {
                    this.f8699e.mo9340a(null);
                }
            }
            return null;
        }
    }

    /* renamed from: bolts.n$o */
    /* compiled from: Task */
    class C2193o implements C2175l<Void, C2177n<Void>> {

        /* renamed from: a */
        final /* synthetic */ C2170h f8700a;

        /* renamed from: b */
        final /* synthetic */ Callable f8701b;

        /* renamed from: c */
        final /* synthetic */ C2175l f8702c;

        /* renamed from: d */
        final /* synthetic */ Executor f8703d;

        /* renamed from: e */
        final /* synthetic */ C2174k f8704e;

        C2193o(C2170h hVar, Callable callable, C2175l lVar, Executor executor, C2174k kVar) {
            this.f8700a = hVar;
            this.f8701b = callable;
            this.f8702c = lVar;
            this.f8703d = executor;
            this.f8704e = kVar;
        }

        public C2177n<Void> then(C2177n<Void> nVar) throws Exception {
            C2170h hVar = this.f8700a;
            if (hVar != null && hVar.mo9283a()) {
                return C2177n.m11247j();
            }
            if (((Boolean) this.f8701b.call()).booleanValue()) {
                return C2177n.m11238b(null).mo9324d(this.f8702c, this.f8703d).mo9324d((C2175l) this.f8704e.mo9298a(), this.f8703d);
            }
            return C2177n.m11238b(null);
        }
    }

    /* renamed from: bolts.n$p */
    /* compiled from: Task */
    public class C2194p extends C2196o<TResult> {
        C2194p() {
        }
    }

    /* renamed from: bolts.n$q */
    /* compiled from: Task */
    public interface C2195q {
        /* renamed from: a */
        void mo9337a(C2177n<?> nVar, UnobservedTaskException unobservedTaskException);
    }

    C2177n() {
    }

    /* renamed from: j */
    public static <TResult> C2177n<TResult> m11247j() {
        return f8649p;
    }

    /* renamed from: k */
    public static <TResult> C2194p m11248k() {
        return new C2194p<>();
    }

    /* renamed from: l */
    public static C2195q m11249l() {
        return f8645l;
    }

    /* renamed from: m */
    private void m11250m() {
        synchronized (this.f8650a) {
            for (C2175l then : this.f8657h) {
                try {
                    then.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f8657h = null;
        }
    }

    /* renamed from: a */
    public <TOut> C2177n<TOut> mo9300a() {
        return this;
    }

    /* renamed from: c */
    public TResult mo9321c() {
        TResult tresult;
        synchronized (this.f8650a) {
            tresult = this.f8653d;
        }
        return tresult;
    }

    /* renamed from: d */
    public boolean mo9326d() {
        boolean z;
        synchronized (this.f8650a) {
            z = this.f8652c;
        }
        return z;
    }

    /* renamed from: e */
    public boolean mo9327e() {
        boolean z;
        synchronized (this.f8650a) {
            z = this.f8651b;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo9328f() {
        boolean z;
        synchronized (this.f8650a) {
            z = mo9316b() != null;
        }
        return z;
    }

    /* renamed from: g */
    public C2177n<Void> mo9329g() {
        return mo9312b((C2175l<TResult, C2177n<TContinuationResult>>) new C2187i<TResult,C2177n<TContinuationResult>>());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo9330h() {
        synchronized (this.f8650a) {
            if (this.f8651b) {
                return false;
            }
            this.f8651b = true;
            this.f8652c = true;
            this.f8650a.notifyAll();
            m11250m();
            return true;
        }
    }

    /* renamed from: i */
    public void mo9331i() throws InterruptedException {
        synchronized (this.f8650a) {
            if (!mo9327e()) {
                this.f8650a.wait();
            }
        }
    }

    /* renamed from: a */
    public static void m11235a(C2195q qVar) {
        f8645l = qVar;
    }

    /* renamed from: b */
    public Exception mo9316b() {
        Exception exc;
        synchronized (this.f8650a) {
            if (this.f8654e != null) {
                this.f8655f = true;
                if (this.f8656g != null) {
                    this.f8656g.mo9345a();
                    this.f8656g = null;
                }
            }
            exc = this.f8654e;
        }
        return exc;
    }

    /* renamed from: a */
    public boolean mo9309a(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean e;
        synchronized (this.f8650a) {
            if (!mo9327e()) {
                this.f8650a.wait(timeUnit.toMillis(j));
            }
            e = mo9327e();
        }
        return e;
    }

    private C2177n(TResult tresult) {
        mo9311a(tresult);
    }

    /* renamed from: c */
    public static C2177n<C2177n<?>> m11243c(Collection<? extends C2177n<?>> collection) {
        if (collection.size() == 0) {
            return m11238b((TResult) null);
        }
        C2196o oVar = new C2196o();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C2177n a : collection) {
            a.mo9301a((C2175l<TResult, TContinuationResult>) new C2190l<TResult,TContinuationResult>(atomicBoolean, oVar));
        }
        return oVar.mo9338a();
    }

    /* renamed from: d */
    public static <TResult> C2177n<C2177n<TResult>> m11245d(Collection<? extends C2177n<TResult>> collection) {
        if (collection.size() == 0) {
            return m11238b((TResult) null);
        }
        C2196o oVar = new C2196o();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C2177n a : collection) {
            a.mo9301a((C2175l<TResult, TContinuationResult>) new C2189k<TResult,TContinuationResult>(atomicBoolean, oVar));
        }
        return oVar.mo9338a();
    }

    private C2177n(boolean z) {
        if (z) {
            mo9330h();
        } else {
            mo9311a((TResult) null);
        }
    }

    /* renamed from: a */
    public static C2177n<Void> m11227a(long j) {
        return m11229a(j, C2167g.m11200d(), (C2170h) null);
    }

    /* renamed from: a */
    public static C2177n<Void> m11228a(long j, C2170h hVar) {
        return m11229a(j, C2167g.m11200d(), hVar);
    }

    /* renamed from: a */
    static C2177n<Void> m11229a(long j, ScheduledExecutorService scheduledExecutorService, C2170h hVar) {
        if (hVar != null && hVar.mo9283a()) {
            return m11247j();
        }
        if (j <= 0) {
            return m11238b((TResult) null);
        }
        C2196o oVar = new C2196o();
        ScheduledFuture schedule = scheduledExecutorService.schedule(new C2185g(oVar), j, TimeUnit.MILLISECONDS);
        if (hVar != null) {
            hVar.mo9282a(new C2186h(schedule, oVar));
        }
        return oVar.mo9338a();
    }

    /* renamed from: b */
    public static <TResult> C2177n<TResult> m11238b(TResult tresult) {
        if (tresult == null) {
            return f8646m;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? f8647n : f8648o;
        }
        C2196o oVar = new C2196o();
        oVar.mo9340a(tresult);
        return oVar.mo9338a();
    }

    /* renamed from: c */
    public <TContinuationResult> C2177n<TContinuationResult> mo9319c(C2175l<TResult, TContinuationResult> lVar, Executor executor) {
        return mo9320c(lVar, executor, null);
    }

    /* renamed from: d */
    public <TContinuationResult> C2177n<TContinuationResult> mo9324d(C2175l<TResult, C2177n<TContinuationResult>> lVar, Executor executor) {
        return mo9325d(lVar, executor, null);
    }

    /* renamed from: c */
    public <TContinuationResult> C2177n<TContinuationResult> mo9320c(C2175l<TResult, TContinuationResult> lVar, Executor executor, C2170h hVar) {
        return mo9314b((C2175l<TResult, C2177n<TContinuationResult>>) new C2180c<TResult,C2177n<TContinuationResult>>(hVar, lVar), executor);
    }

    /* renamed from: d */
    public <TContinuationResult> C2177n<TContinuationResult> mo9325d(C2175l<TResult, C2177n<TContinuationResult>> lVar, Executor executor, C2170h hVar) {
        return mo9314b((C2175l<TResult, C2177n<TContinuationResult>>) new C2181d<TResult,C2177n<TContinuationResult>>(hVar, lVar), executor);
    }

    /* renamed from: c */
    public <TContinuationResult> C2177n<TContinuationResult> mo9317c(C2175l<TResult, TContinuationResult> lVar) {
        return mo9320c(lVar, f8643j, null);
    }

    /* renamed from: d */
    public <TContinuationResult> C2177n<TContinuationResult> mo9322d(C2175l<TResult, C2177n<TContinuationResult>> lVar) {
        return mo9324d(lVar, f8643j);
    }

    /* renamed from: c */
    public <TContinuationResult> C2177n<TContinuationResult> mo9318c(C2175l<TResult, TContinuationResult> lVar, C2170h hVar) {
        return mo9320c(lVar, f8643j, hVar);
    }

    /* renamed from: d */
    public <TContinuationResult> C2177n<TContinuationResult> mo9323d(C2175l<TResult, C2177n<TContinuationResult>> lVar, C2170h hVar) {
        return mo9325d(lVar, f8643j, hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static <TContinuationResult, TResult> void m11244c(C2196o<TContinuationResult> oVar, C2175l<TResult, C2177n<TContinuationResult>> lVar, C2177n<TResult> nVar, Executor executor, C2170h hVar) {
        try {
            executor.execute(new C2183f(hVar, oVar, lVar, nVar));
        } catch (Exception e) {
            oVar.mo9339a((Exception) new ExecutorException(e));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static <TContinuationResult, TResult> void m11246d(C2196o<TContinuationResult> oVar, C2175l<TResult, TContinuationResult> lVar, C2177n<TResult> nVar, Executor executor, C2170h hVar) {
        try {
            executor.execute(new C2182e(hVar, oVar, lVar, nVar));
        } catch (Exception e) {
            oVar.mo9339a((Exception) new ExecutorException(e));
        }
    }

    /* renamed from: b */
    public static <TResult> C2177n<TResult> m11237b(Exception exc) {
        C2196o oVar = new C2196o();
        oVar.mo9339a(exc);
        return oVar.mo9338a();
    }

    /* renamed from: a */
    public static <TResult> C2177n<TResult> m11233a(Callable<TResult> callable, Executor executor) {
        return m11234a(callable, executor, (C2170h) null);
    }

    /* renamed from: a */
    public static <TResult> C2177n<TResult> m11234a(Callable<TResult> callable, Executor executor, C2170h hVar) {
        C2196o oVar = new C2196o();
        try {
            executor.execute(new C2188j(hVar, oVar, callable));
        } catch (Exception e) {
            oVar.mo9339a((Exception) new ExecutorException(e));
        }
        return oVar.mo9338a();
    }

    /* renamed from: b */
    public static <TResult> C2177n<TResult> m11240b(Callable<TResult> callable) {
        return m11234a(callable, (Executor) f8642i, (C2170h) null);
    }

    /* renamed from: b */
    public static <TResult> C2177n<TResult> m11241b(Callable<TResult> callable, C2170h hVar) {
        return m11234a(callable, (Executor) f8642i, hVar);
    }

    /* renamed from: b */
    public static <TResult> C2177n<List<TResult>> m11239b(Collection<? extends C2177n<TResult>> collection) {
        return m11230a(collection).mo9317c((C2175l<TResult, TContinuationResult>) new C2191m<TResult,TContinuationResult>(collection));
    }

    /* renamed from: a */
    public static <TResult> C2177n<TResult> m11231a(Callable<TResult> callable) {
        return m11234a(callable, f8643j, (C2170h) null);
    }

    /* renamed from: b */
    public <TContinuationResult> C2177n<TContinuationResult> mo9314b(C2175l<TResult, C2177n<TContinuationResult>> lVar, Executor executor) {
        return mo9315b(lVar, executor, null);
    }

    /* renamed from: a */
    public static <TResult> C2177n<TResult> m11232a(Callable<TResult> callable, C2170h hVar) {
        return m11234a(callable, f8643j, hVar);
    }

    /* renamed from: b */
    public <TContinuationResult> C2177n<TContinuationResult> mo9315b(C2175l<TResult, C2177n<TContinuationResult>> lVar, Executor executor, C2170h hVar) {
        boolean e;
        C2196o oVar = new C2196o();
        synchronized (this.f8650a) {
            e = mo9327e();
            if (!e) {
                List<C2175l<TResult, Void>> list = this.f8657h;
                C2179b bVar = new C2179b(oVar, lVar, executor, hVar);
                list.add(bVar);
            }
        }
        if (e) {
            m11244c(oVar, lVar, this, executor, hVar);
        }
        return oVar.mo9338a();
    }

    /* renamed from: a */
    public static C2177n<Void> m11230a(Collection<? extends C2177n<?>> collection) {
        if (collection.size() == 0) {
            return m11238b((TResult) null);
        }
        C2196o oVar = new C2196o();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (C2177n nVar : collection) {
            C2192n nVar2 = new C2192n(obj, arrayList, atomicBoolean, atomicInteger, oVar);
            nVar.mo9301a((C2175l<TResult, TContinuationResult>) nVar2);
        }
        return oVar.mo9338a();
    }

    /* renamed from: b */
    public <TContinuationResult> C2177n<TContinuationResult> mo9312b(C2175l<TResult, C2177n<TContinuationResult>> lVar) {
        return mo9315b(lVar, f8643j, null);
    }

    /* renamed from: b */
    public <TContinuationResult> C2177n<TContinuationResult> mo9313b(C2175l<TResult, C2177n<TContinuationResult>> lVar, C2170h hVar) {
        return mo9315b(lVar, f8643j, hVar);
    }

    /* renamed from: a */
    public C2177n<Void> mo9305a(Callable<Boolean> callable, C2175l<Void, C2177n<Void>> lVar) {
        return mo9308a(callable, lVar, f8643j, null);
    }

    /* renamed from: a */
    public C2177n<Void> mo9306a(Callable<Boolean> callable, C2175l<Void, C2177n<Void>> lVar, C2170h hVar) {
        return mo9308a(callable, lVar, f8643j, hVar);
    }

    /* renamed from: a */
    public C2177n<Void> mo9307a(Callable<Boolean> callable, C2175l<Void, C2177n<Void>> lVar, Executor executor) {
        return mo9308a(callable, lVar, executor, null);
    }

    /* renamed from: a */
    public C2177n<Void> mo9308a(Callable<Boolean> callable, C2175l<Void, C2177n<Void>> lVar, Executor executor, C2170h hVar) {
        C2174k kVar = new C2174k();
        C2193o oVar = new C2193o(hVar, callable, lVar, executor, kVar);
        kVar.mo9299a(oVar);
        return mo9329g().mo9314b((C2175l) kVar.mo9298a(), executor);
    }

    /* renamed from: a */
    public <TContinuationResult> C2177n<TContinuationResult> mo9303a(C2175l<TResult, TContinuationResult> lVar, Executor executor) {
        return mo9304a(lVar, executor, (C2170h) null);
    }

    /* renamed from: a */
    public <TContinuationResult> C2177n<TContinuationResult> mo9304a(C2175l<TResult, TContinuationResult> lVar, Executor executor, C2170h hVar) {
        boolean e;
        C2196o oVar = new C2196o();
        synchronized (this.f8650a) {
            e = mo9327e();
            if (!e) {
                List<C2175l<TResult, Void>> list = this.f8657h;
                C2178a aVar = new C2178a(oVar, lVar, executor, hVar);
                list.add(aVar);
            }
        }
        if (e) {
            m11246d(oVar, lVar, this, executor, hVar);
        }
        return oVar.mo9338a();
    }

    /* renamed from: a */
    public <TContinuationResult> C2177n<TContinuationResult> mo9301a(C2175l<TResult, TContinuationResult> lVar) {
        return mo9304a(lVar, f8643j, (C2170h) null);
    }

    /* renamed from: a */
    public <TContinuationResult> C2177n<TContinuationResult> mo9302a(C2175l<TResult, TContinuationResult> lVar, C2170h hVar) {
        return mo9304a(lVar, f8643j, hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9311a(TResult tresult) {
        synchronized (this.f8650a) {
            if (this.f8651b) {
                return false;
            }
            this.f8651b = true;
            this.f8653d = tresult;
            this.f8650a.notifyAll();
            m11250m();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo9310a(java.lang.Exception r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f8650a
            monitor-enter(r0)
            boolean r1 = r3.f8651b     // Catch:{ all -> 0x002c }
            r2 = 0
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r2
        L_0x000a:
            r1 = 1
            r3.f8651b = r1     // Catch:{ all -> 0x002c }
            r3.f8654e = r4     // Catch:{ all -> 0x002c }
            r3.f8655f = r2     // Catch:{ all -> 0x002c }
            java.lang.Object r4 = r3.f8650a     // Catch:{ all -> 0x002c }
            r4.notifyAll()     // Catch:{ all -> 0x002c }
            r3.m11250m()     // Catch:{ all -> 0x002c }
            boolean r4 = r3.f8655f     // Catch:{ all -> 0x002c }
            if (r4 != 0) goto L_0x002a
            bolts.n$q r4 = m11249l()     // Catch:{ all -> 0x002c }
            if (r4 == 0) goto L_0x002a
            bolts.p r4 = new bolts.p     // Catch:{ all -> 0x002c }
            r4.<init>(r3)     // Catch:{ all -> 0x002c }
            r3.f8656g = r4     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r1
        L_0x002c:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bolts.C2177n.mo9310a(java.lang.Exception):boolean");
    }
}
