package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.C4306c0.C4307a;
import com.google.common.base.C5827t;
import com.google.common.base.C7333e0;
import com.google.common.base.C7344g0;
import com.google.common.base.C7380p;
import com.google.common.base.C7397x;
import com.google.common.base.C7398z;
import com.google.common.collect.C7707e3;
import com.google.common.collect.C7800f4;
import com.google.common.collect.C7859g3;
import com.google.common.collect.C7882h3;
import com.google.common.collect.C7882h3.C7883a;
import com.google.common.collect.C7936j4;
import com.google.common.collect.C7982k4;
import com.google.common.collect.C8022l5;
import com.google.common.collect.C8047m5;
import com.google.common.collect.C8133r4;
import com.google.common.collect.C8175t2;
import com.google.common.collect.C8257x2;
import com.google.common.collect.C8292z;
import com.google.common.collect.C8302z2;
import com.google.common.collect.C8302z2.C8303a;
import com.google.common.collect.C8309z3;
import com.google.common.util.concurrent.C8517i0.C8518a;
import com.google.common.util.concurrent.Service.C8435b;
import com.google.common.util.concurrent.Service.State;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.p203u.C5966a;

@C2775a
/* renamed from: com.google.common.util.concurrent.n0 */
/* compiled from: ServiceManager */
public final class C8551n0 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Logger f22517c = Logger.getLogger(C8551n0.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C8498a<C8555d> f22518d = new C8552a("healthy()");
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8498a<C8555d> f22519e = new C8553b("stopped()");

    /* renamed from: a */
    private final C8558g f22520a;

    /* renamed from: b */
    private final C8257x2<Service> f22521b;

    /* renamed from: com.google.common.util.concurrent.n0$a */
    /* compiled from: ServiceManager */
    static class C8552a extends C8498a<C8555d> {
        C8552a(String str) {
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8555d dVar) {
            dVar.mo31864a();
        }
    }

    /* renamed from: com.google.common.util.concurrent.n0$b */
    /* compiled from: ServiceManager */
    static class C8553b extends C8498a<C8555d> {
        C8553b(String str) {
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8555d dVar) {
            dVar.mo31866b();
        }
    }

    /* renamed from: com.google.common.util.concurrent.n0$c */
    /* compiled from: ServiceManager */
    private static final class C8554c extends Throwable {
        private C8554c() {
        }

        /* synthetic */ C8554c(C8552a aVar) {
            this();
        }
    }

    @C2775a
    /* renamed from: com.google.common.util.concurrent.n0$d */
    /* compiled from: ServiceManager */
    public static abstract class C8555d {
        /* renamed from: a */
        public void mo31864a() {
        }

        /* renamed from: a */
        public void mo31865a(Service service) {
        }

        /* renamed from: b */
        public void mo31866b() {
        }
    }

    /* renamed from: com.google.common.util.concurrent.n0$e */
    /* compiled from: ServiceManager */
    private static final class C8556e extends C8499g {
        private C8556e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo31648g() {
            mo31709i();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo31649h() {
            mo31710j();
        }

        /* synthetic */ C8556e(C8552a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.n0$f */
    /* compiled from: ServiceManager */
    private static final class C8557f extends C8435b {

        /* renamed from: a */
        final Service f22522a;

        /* renamed from: b */
        final WeakReference<C8558g> f22523b;

        C8557f(Service service, WeakReference<C8558g> weakReference) {
            this.f22522a = service;
            this.f22523b = weakReference;
        }

        /* renamed from: a */
        public void mo31608a() {
            C8558g gVar = (C8558g) this.f22523b.get();
            if (gVar != null) {
                gVar.mo31870a(this.f22522a, State.STARTING, State.RUNNING);
            }
        }

        /* renamed from: b */
        public void mo31611b() {
            C8558g gVar = (C8558g) this.f22523b.get();
            if (gVar != null) {
                gVar.mo31870a(this.f22522a, State.NEW, State.STARTING);
                if (!(this.f22522a instanceof C8556e)) {
                    C8551n0.f22517c.log(Level.FINE, "Starting {0}.", this.f22522a);
                }
            }
        }

        /* renamed from: a */
        public void mo31609a(State state) {
            C8558g gVar = (C8558g) this.f22523b.get();
            if (gVar != null) {
                gVar.mo31870a(this.f22522a, state, State.STOPPING);
            }
        }

        /* renamed from: a */
        public void mo31610a(State state, Throwable th) {
            C8558g gVar = (C8558g) this.f22523b.get();
            if (gVar != null) {
                if (!(this.f22522a instanceof C8556e)) {
                    Logger h = C8551n0.f22517c;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Service ");
                    sb.append(this.f22522a);
                    sb.append(" has failed in the ");
                    sb.append(state);
                    sb.append(" state.");
                    h.log(level, sb.toString(), th);
                }
                gVar.mo31870a(this.f22522a, state, State.FAILED);
            }
        }

        /* renamed from: b */
        public void mo31612b(State state) {
            C8558g gVar = (C8558g) this.f22523b.get();
            if (gVar != null) {
                if (!(this.f22522a instanceof C8556e)) {
                    C8551n0.f22517c.log(Level.FINE, "Service {0} has terminated. Previous state was: {1}", new Object[]{this.f22522a, state});
                }
                gVar.mo31870a(this.f22522a, state, State.TERMINATED);
            }
        }
    }

    /* renamed from: com.google.common.util.concurrent.n0$g */
    /* compiled from: ServiceManager */
    private static final class C8558g {

        /* renamed from: a */
        final C8517i0 f22524a = new C8517i0();
        @C5966a("monitor")

        /* renamed from: b */
        final C8022l5<State, Service> f22525b = C7936j4.m38010c((Map<K, Collection<V>>) new EnumMap<K,Collection<V>>(State.class), (C7344g0<? extends Set<V>>) new C8559a<Object>());
        @C5966a("monitor")

        /* renamed from: c */
        final C7982k4<State> f22526c = this.f22525b.mo29889n();
        @C5966a("monitor")

        /* renamed from: d */
        final Map<Service, C7333e0> f22527d = C7800f4.m37343d();
        @C5966a("monitor")

        /* renamed from: e */
        boolean f22528e;
        @C5966a("monitor")

        /* renamed from: f */
        boolean f22529f;

        /* renamed from: g */
        final int f22530g;

        /* renamed from: h */
        final C8518a f22531h = new C8560b(this.f22524a);

        /* renamed from: i */
        final C8518a f22532i = new C8561c(this.f22524a);
        @C5966a("monitor")

        /* renamed from: j */
        final List<C8497f0<C8555d>> f22533j = Collections.synchronizedList(new ArrayList());

        /* renamed from: com.google.common.util.concurrent.n0$g$a */
        /* compiled from: ServiceManager */
        class C8559a implements C7344g0<Set<Service>> {
            C8559a() {
            }

            public Set<Service> get() {
                return C8047m5.m38535e();
            }
        }

        /* renamed from: com.google.common.util.concurrent.n0$g$b */
        /* compiled from: ServiceManager */
        class C8560b extends C8518a {
            C8560b(C8517i0 i0Var) {
                super(i0Var);
            }

            /* renamed from: a */
            public boolean mo31716a() {
                int b = C8558g.this.f22526c.mo29708b(State.RUNNING);
                C8558g gVar = C8558g.this;
                return b == gVar.f22530g || gVar.f22526c.contains(State.STOPPING) || C8558g.this.f22526c.contains(State.TERMINATED) || C8558g.this.f22526c.contains(State.FAILED);
            }
        }

        /* renamed from: com.google.common.util.concurrent.n0$g$c */
        /* compiled from: ServiceManager */
        class C8561c extends C8518a {
            C8561c(C8517i0 i0Var) {
                super(i0Var);
            }

            /* renamed from: a */
            public boolean mo31716a() {
                return C8558g.this.f22526c.mo29708b(State.TERMINATED) + C8558g.this.f22526c.mo29708b(State.FAILED) == C8558g.this.f22530g;
            }
        }

        /* renamed from: com.google.common.util.concurrent.n0$g$d */
        /* compiled from: ServiceManager */
        class C8562d implements C7380p<Entry<Service, Long>, Long> {
            C8562d() {
            }

            /* renamed from: a */
            public Long apply(Entry<Service, Long> entry) {
                return (Long) entry.getValue();
            }
        }

        /* renamed from: com.google.common.util.concurrent.n0$g$e */
        /* compiled from: ServiceManager */
        class C8563e extends C8498a<C8555d> {

            /* renamed from: b */
            final /* synthetic */ Service f22538b;

            C8563e(String str, Service service) {
                this.f22538b = service;
                super(str);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo31707a(C8555d dVar) {
                dVar.mo31865a(this.f22538b);
            }
        }

        C8558g(C8175t2<Service> t2Var) {
            this.f22530g = t2Var.size();
            this.f22525b.mo29702b(State.NEW, t2Var);
            Iterator it = t2Var.iterator();
            while (it.hasNext()) {
                this.f22527d.put((Service) it.next(), C7333e0.m35521f());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31871a(C8555d dVar, Executor executor) {
            C7397x.m35665a(dVar, (Object) C4307a.f13384a);
            C7397x.m35665a(executor, (Object) "executor");
            this.f22524a.mo31729a();
            try {
                if (!this.f22532i.mo31716a()) {
                    this.f22533j.add(new C8497f0(dVar, executor));
                }
            } finally {
                this.f22524a.mo31754i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31872b() {
            this.f22524a.mo31742d(this.f22532i);
            this.f22524a.mo31754i();
        }

        /* access modifiers changed from: 0000 */
        @C5966a("monitor")
        /* renamed from: c */
        public void mo31874c() {
            if (this.f22526c.mo29708b(State.RUNNING) != this.f22530g) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected to be healthy after starting. The following services are not running: ");
                sb.append(C7936j4.m38002b(this.f22525b, C7398z.m35682a(C7398z.m35687a(State.RUNNING))));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo31875d() {
            C7397x.m35677b(!this.f22524a.mo31753h(), (Object) "It is incorrect to execute listeners with the monitor held.");
            for (int i = 0; i < this.f22533j.size(); i++) {
                ((C8497f0) this.f22533j.get(i)).mo31703a();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("monitor")
        /* renamed from: e */
        public void mo31876e() {
            C8551n0.f22518d.mo31706a((Iterable<C8497f0<L>>) this.f22533j);
        }

        /* access modifiers changed from: 0000 */
        @C5966a("monitor")
        /* renamed from: f */
        public void mo31877f() {
            C8551n0.f22519e.mo31706a((Iterable<C8497f0<L>>) this.f22533j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo31878g() {
            this.f22524a.mo31729a();
            try {
                if (!this.f22529f) {
                    this.f22528e = true;
                    return;
                }
                ArrayList a = C8309z3.m39648a();
                Iterator it = mo31879h().values().iterator();
                while (it.hasNext()) {
                    Service service = (Service) it.next();
                    if (service.mo31597a() != State.NEW) {
                        a.add(service);
                    }
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Services started transitioning asynchronously before the ServiceManager was constructed: ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            } finally {
                this.f22524a.mo31754i();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public C7707e3<State, Service> mo31879h() {
            C7883a r = C7882h3.m37651r();
            this.f22524a.mo31729a();
            try {
                for (Entry entry : this.f22525b.mo29704m()) {
                    if (!(entry.getValue() instanceof C8556e)) {
                        r.mo30133a(entry.getKey(), entry.getValue());
                    }
                }
                this.f22524a.mo31754i();
                return r.mo30137a();
            } catch (Throwable th) {
                this.f22524a.mo31754i();
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public C8302z2<Service, Long> mo31880i() {
            this.f22524a.mo31729a();
            try {
                ArrayList<Entry> b = C8309z3.m39664b((this.f22526c.size() - this.f22526c.mo29708b(State.NEW)) + this.f22526c.mo29708b(State.STARTING));
                for (Entry entry : this.f22527d.entrySet()) {
                    Service service = (Service) entry.getKey();
                    C7333e0 e0Var = (C7333e0) entry.getValue();
                    if (!e0Var.mo29208a() && !this.f22525b.mo29884c(State.NEW, service) && !(service instanceof C8556e)) {
                        b.add(C7800f4.m37291a(service, Long.valueOf(e0Var.mo29207a(TimeUnit.MILLISECONDS))));
                    }
                }
                this.f22524a.mo31754i();
                Collections.sort(b, C8133r4.m38943j().mo30985a((C7380p<F, ? extends T>) new C8562d<F,Object>()));
                C8303a g = C8302z2.m39628g();
                for (Entry a : b) {
                    g.mo30688a(a);
                }
                return g.mo30690a();
            } catch (Throwable th) {
                this.f22524a.mo31754i();
                throw th;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo31873b(long j, TimeUnit timeUnit) throws TimeoutException {
            this.f22524a.mo31729a();
            try {
                if (!this.f22524a.mo31749f(this.f22532i, j, timeUnit)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Timeout waiting for the services to stop. The following services have not stopped: ");
                    sb.append(C7936j4.m38002b(this.f22525b, C7398z.m35682a(C7398z.m35689a((Collection<? extends T>) C7859g3.m37500a(State.TERMINATED, State.FAILED)))));
                    throw new TimeoutException(sb.toString());
                }
            } finally {
                this.f22524a.mo31754i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31867a() {
            this.f22524a.mo31742d(this.f22531h);
            try {
                mo31874c();
            } finally {
                this.f22524a.mo31754i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31868a(long j, TimeUnit timeUnit) throws TimeoutException {
            this.f22524a.mo31729a();
            try {
                if (this.f22524a.mo31749f(this.f22531h, j, timeUnit)) {
                    mo31874c();
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Timeout waiting for the services to become healthy. The following services have not started: ");
                sb.append(C7936j4.m38002b(this.f22525b, C7398z.m35689a((Collection<? extends T>) C7859g3.m37500a(State.NEW, State.STARTING))));
                throw new TimeoutException(sb.toString());
            } finally {
                this.f22524a.mo31754i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31870a(Service service, State state, State state2) {
            C7397x.m35664a(service);
            C7397x.m35670a(state != state2);
            this.f22524a.mo31729a();
            try {
                this.f22529f = true;
                if (this.f22528e) {
                    C7397x.m35678b(this.f22525b.remove(state, service), "Service %s not at the expected location in the state map %s", service, state);
                    C7397x.m35678b(this.f22525b.put(state2, service), "Service %s in the state map unexpectedly at %s", service, state2);
                    C7333e0 e0Var = (C7333e0) this.f22527d.get(service);
                    if (state == State.NEW) {
                        e0Var.mo29210c();
                    }
                    if (state2.compareTo(State.RUNNING) >= 0 && e0Var.mo29208a()) {
                        e0Var.mo29211d();
                        if (!(service instanceof C8556e)) {
                            C8551n0.f22517c.log(Level.FINE, "Started {0} in {1}.", new Object[]{service, e0Var});
                        }
                    }
                    if (state2 == State.FAILED) {
                        mo31869a(service);
                    }
                    if (this.f22526c.mo29708b(State.RUNNING) == this.f22530g) {
                        mo31876e();
                    } else if (this.f22526c.mo29708b(State.TERMINATED) + this.f22526c.mo29708b(State.FAILED) == this.f22530g) {
                        mo31877f();
                    }
                    this.f22524a.mo31754i();
                    mo31875d();
                }
            } finally {
                this.f22524a.mo31754i();
                mo31875d();
            }
        }

        /* access modifiers changed from: 0000 */
        @C5966a("monitor")
        /* renamed from: a */
        public void mo31869a(Service service) {
            StringBuilder sb = new StringBuilder();
            sb.append("failed({service=");
            sb.append(service);
            sb.append("})");
            new C8563e(sb.toString(), service).mo31706a((Iterable<C8497f0<L>>) this.f22533j);
        }
    }

    public C8551n0(Iterable<? extends Service> iterable) {
        C8257x2<Service> a = C8257x2.m39392a(iterable);
        if (a.isEmpty()) {
            f22517c.log(Level.WARNING, "ServiceManager configured with no services.  Is your application configured properly?", new C8554c(null));
            a = C8257x2.m39393a(new C8556e(null));
        }
        this.f22520a = new C8558g(a);
        this.f22521b = a;
        WeakReference weakReference = new WeakReference(this.f22520a);
        C8511g0 c = C8520j0.m40280c();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            Service service = (Service) it.next();
            service.mo31599a((C8435b) new C8557f(service, weakReference), (Executor) c);
            C7397x.m35672a(service.mo31597a() == State.NEW, "Can only manage NEW services, %s", service);
        }
        this.f22520a.mo31878g();
    }

    /* renamed from: a */
    public void mo31853a(C8555d dVar, Executor executor) {
        this.f22520a.mo31871a(dVar, executor);
    }

    /* renamed from: b */
    public void mo31854b() {
        this.f22520a.mo31872b();
    }

    /* renamed from: c */
    public boolean mo31856c() {
        Iterator it = this.f22521b.iterator();
        while (it.hasNext()) {
            if (!((Service) it.next()).isRunning()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public C7707e3<State, Service> mo31857d() {
        return this.f22520a.mo31879h();
    }

    /* renamed from: e */
    public C8551n0 mo31858e() {
        Iterator it = this.f22521b.iterator();
        while (it.hasNext()) {
            Service service = (Service) it.next();
            State a = service.mo31597a();
            C7397x.m35678b(a == State.NEW, "Service %s is %s, cannot start it.", service, a);
        }
        Iterator it2 = this.f22521b.iterator();
        while (it2.hasNext()) {
            Service service2 = (Service) it2.next();
            try {
                service2.mo31605f();
            } catch (IllegalStateException e) {
                Logger logger = f22517c;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to start Service ");
                sb.append(service2);
                logger.log(level, sb.toString(), e);
            }
        }
        return this;
    }

    /* renamed from: f */
    public C8302z2<Service, Long> mo31859f() {
        return this.f22520a.mo31880i();
    }

    /* renamed from: g */
    public C8551n0 mo31860g() {
        Iterator it = this.f22521b.iterator();
        while (it.hasNext()) {
            ((Service) it.next()).mo31603d();
        }
        return this;
    }

    public String toString() {
        return C5827t.m25563b(C8551n0.class).mo23152a("services", (Object) C8292z.m39590a((Collection<E>) this.f22521b, C7398z.m35682a(C7398z.m35694b(C8556e.class)))).toString();
    }

    /* renamed from: a */
    public void mo31852a(C8555d dVar) {
        this.f22520a.mo31871a(dVar, (Executor) C8520j0.m40280c());
    }

    /* renamed from: b */
    public void mo31855b(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22520a.mo31873b(j, timeUnit);
    }

    /* renamed from: a */
    public void mo31850a() {
        this.f22520a.mo31867a();
    }

    /* renamed from: a */
    public void mo31851a(long j, TimeUnit timeUnit) throws TimeoutException {
        this.f22520a.mo31868a(j, timeUnit);
    }
}
