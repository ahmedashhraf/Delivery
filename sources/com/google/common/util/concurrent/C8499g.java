package com.google.common.util.concurrent;

import com.google.android.gms.common.internal.C4306c0.C4307a;
import com.google.common.base.C7397x;
import com.google.common.util.concurrent.C8517i0.C8518a;
import com.google.common.util.concurrent.Service.C8435b;
import com.google.common.util.concurrent.Service.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;
import p201f.p202a.p203u.C5966a;
import p201f.p202a.p203u.C5967b;

@C2775a
/* renamed from: com.google.common.util.concurrent.g */
/* compiled from: AbstractService */
public abstract class C8499g implements Service {

    /* renamed from: h */
    private static final C8498a<C8435b> f22431h = new C8501b("starting()");

    /* renamed from: i */
    private static final C8498a<C8435b> f22432i = new C8502c("running()");

    /* renamed from: j */
    private static final C8498a<C8435b> f22433j = m40173c(State.STARTING);

    /* renamed from: k */
    private static final C8498a<C8435b> f22434k = m40173c(State.RUNNING);

    /* renamed from: l */
    private static final C8498a<C8435b> f22435l = m40175e(State.NEW);

    /* renamed from: m */
    private static final C8498a<C8435b> f22436m = m40175e(State.RUNNING);

    /* renamed from: n */
    private static final C8498a<C8435b> f22437n = m40175e(State.STOPPING);

    /* renamed from: a */
    private final C8517i0 f22438a = new C8517i0();

    /* renamed from: b */
    private final C8518a f22439b = new C8505f(this.f22438a);

    /* renamed from: c */
    private final C8518a f22440c = new C8506g(this.f22438a);

    /* renamed from: d */
    private final C8518a f22441d = new C8507h(this.f22438a);

    /* renamed from: e */
    private final C8518a f22442e = new C8508i(this.f22438a);
    @C5966a("monitor")

    /* renamed from: f */
    private final List<C8497f0<C8435b>> f22443f = Collections.synchronizedList(new ArrayList());
    @C5966a("monitor")

    /* renamed from: g */
    private volatile C8510k f22444g = new C8510k(State.NEW);

    /* renamed from: com.google.common.util.concurrent.g$a */
    /* compiled from: AbstractService */
    static /* synthetic */ class C8500a {

        /* renamed from: a */
        static final /* synthetic */ int[] f22445a = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|(3:11|12|14)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.google.common.util.concurrent.Service$State[] r0 = com.google.common.util.concurrent.Service.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22445a = r0
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.NEW     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STARTING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.RUNNING     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.STOPPING     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f22445a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.google.common.util.concurrent.Service$State r1 = com.google.common.util.concurrent.Service.State.FAILED     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8499g.C8500a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$b */
    /* compiled from: AbstractService */
    static class C8501b extends C8498a<C8435b> {
        C8501b(String str) {
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8435b bVar) {
            bVar.mo31611b();
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$c */
    /* compiled from: AbstractService */
    static class C8502c extends C8498a<C8435b> {
        C8502c(String str) {
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8435b bVar) {
            bVar.mo31608a();
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$d */
    /* compiled from: AbstractService */
    static class C8503d extends C8498a<C8435b> {

        /* renamed from: b */
        final /* synthetic */ State f22446b;

        C8503d(String str, State state) {
            this.f22446b = state;
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8435b bVar) {
            bVar.mo31612b(this.f22446b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$e */
    /* compiled from: AbstractService */
    static class C8504e extends C8498a<C8435b> {

        /* renamed from: b */
        final /* synthetic */ State f22447b;

        C8504e(String str, State state) {
            this.f22447b = state;
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8435b bVar) {
            bVar.mo31609a(this.f22447b);
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$f */
    /* compiled from: AbstractService */
    class C8505f extends C8518a {
        C8505f(C8517i0 i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public boolean mo31716a() {
            return C8499g.this.mo31597a() == State.NEW;
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$g */
    /* compiled from: AbstractService */
    class C8506g extends C8518a {
        C8506g(C8517i0 i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public boolean mo31716a() {
            return C8499g.this.mo31597a().compareTo(State.RUNNING) <= 0;
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$h */
    /* compiled from: AbstractService */
    class C8507h extends C8518a {
        C8507h(C8517i0 i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public boolean mo31716a() {
            return C8499g.this.mo31597a().compareTo(State.RUNNING) >= 0;
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$i */
    /* compiled from: AbstractService */
    class C8508i extends C8518a {
        C8508i(C8517i0 i0Var) {
            super(i0Var);
        }

        /* renamed from: a */
        public boolean mo31716a() {
            return C8499g.this.mo31597a().isTerminal();
        }
    }

    /* renamed from: com.google.common.util.concurrent.g$j */
    /* compiled from: AbstractService */
    class C8509j extends C8498a<C8435b> {

        /* renamed from: b */
        final /* synthetic */ State f22452b;

        /* renamed from: c */
        final /* synthetic */ Throwable f22453c;

        C8509j(String str, State state, Throwable th) {
            this.f22452b = state;
            this.f22453c = th;
            super(str);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo31707a(C8435b bVar) {
            bVar.mo31610a(this.f22452b, this.f22453c);
        }
    }

    @C5967b
    /* renamed from: com.google.common.util.concurrent.g$k */
    /* compiled from: AbstractService */
    private static final class C8510k {

        /* renamed from: a */
        final State f22455a;

        /* renamed from: b */
        final boolean f22456b;
        @C5952h

        /* renamed from: c */
        final Throwable f22457c;

        C8510k(State state) {
            this(state, false, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public State mo31718a() {
            if (!this.f22456b || this.f22455a != State.STARTING) {
                return this.f22455a;
            }
            return State.STOPPING;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Throwable mo31719b() {
            C7397x.m35678b(this.f22455a == State.FAILED, "failureCause() is only valid if the service has failed, service is %s", this.f22455a);
            return this.f22457c;
        }

        C8510k(State state, boolean z, @C5952h Throwable th) {
            C7397x.m35672a(!z || state == State.STARTING, "shudownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", state);
            C7397x.m35672a(!((th != null) ^ (state == State.FAILED)), "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", state, th);
            this.f22455a = state;
            this.f22456b = z;
            this.f22457c = th;
        }
    }

    protected C8499g() {
    }

    /* renamed from: c */
    private static C8498a<C8435b> m40173c(State state) {
        StringBuilder sb = new StringBuilder();
        sb.append("stopping({from = ");
        sb.append(state);
        sb.append("})");
        return new C8504e(sb.toString(), state);
    }

    /* renamed from: e */
    private static C8498a<C8435b> m40175e(State state) {
        StringBuilder sb = new StringBuilder();
        sb.append("terminated({from = ");
        sb.append(state);
        sb.append("})");
        return new C8503d(sb.toString(), state);
    }

    /* renamed from: k */
    private void m40176k() {
        if (!this.f22438a.mo31753h()) {
            for (int i = 0; i < this.f22443f.size(); i++) {
                ((C8497f0) this.f22443f.get(i)).mo31703a();
            }
        }
    }

    @C5966a("monitor")
    /* renamed from: l */
    private void m40177l() {
        f22432i.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
    }

    @C5966a("monitor")
    /* renamed from: m */
    private void m40178m() {
        f22431h.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
    }

    /* renamed from: a */
    public final void mo31598a(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f22438a.mo31743d(this.f22441d, j, timeUnit)) {
            try {
                m40170a(State.RUNNING);
            } finally {
                this.f22438a.mo31754i();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Timed out waiting for ");
            sb.append(this);
            sb.append(" to reach the RUNNING state. ");
            sb.append("Current state: ");
            sb.append(mo31597a());
            throw new TimeoutException(sb.toString());
        }
    }

    /* renamed from: b */
    public final void mo31600b() {
        this.f22438a.mo31742d(this.f22441d);
        try {
            m40170a(State.RUNNING);
        } finally {
            this.f22438a.mo31754i();
        }
    }

    /* renamed from: d */
    public final Service mo31603d() {
        if (this.f22438a.mo31731a(this.f22440c)) {
            try {
                State a = mo31597a();
                switch (C8500a.f22445a[a.ordinal()]) {
                    case 1:
                        this.f22444g = new C8510k(State.TERMINATED);
                        m40174d(State.NEW);
                        break;
                    case 2:
                        this.f22444g = new C8510k(State.STARTING, true, null);
                        m40172b(State.STARTING);
                        break;
                    case 3:
                        this.f22444g = new C8510k(State.STOPPING);
                        m40172b(State.RUNNING);
                        mo31649h();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        StringBuilder sb = new StringBuilder();
                        sb.append("isStoppable is incorrectly implemented, saw: ");
                        sb.append(a);
                        throw new AssertionError(sb.toString());
                    default:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected state: ");
                        sb2.append(a);
                        throw new AssertionError(sb2.toString());
                }
            } catch (Throwable th) {
                this.f22438a.mo31754i();
                m40176k();
                throw th;
            }
            this.f22438a.mo31754i();
            m40176k();
        }
        return this;
    }

    /* renamed from: f */
    public final Service mo31605f() {
        if (this.f22438a.mo31731a(this.f22439b)) {
            try {
                this.f22444g = new C8510k(State.STARTING);
                m40178m();
                mo31648g();
            } catch (Throwable th) {
                this.f22438a.mo31754i();
                m40176k();
                throw th;
            }
            this.f22438a.mo31754i();
            m40176k();
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Service ");
        sb.append(this);
        sb.append(" has already been started");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo31648g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo31649h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo31709i() {
        this.f22438a.mo31729a();
        try {
            if (this.f22444g.f22455a == State.STARTING) {
                if (this.f22444g.f22456b) {
                    this.f22444g = new C8510k(State.STOPPING);
                    mo31649h();
                } else {
                    this.f22444g = new C8510k(State.RUNNING);
                    m40177l();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot notifyStarted() when the service is ");
            sb.append(this.f22444g.f22455a);
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            mo31708a((Throwable) illegalStateException);
            throw illegalStateException;
        } finally {
            this.f22438a.mo31754i();
            m40176k();
        }
    }

    public final boolean isRunning() {
        return mo31597a() == State.RUNNING;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo31710j() {
        this.f22438a.mo31729a();
        try {
            State state = this.f22444g.f22455a;
            if (state != State.STOPPING) {
                if (state != State.RUNNING) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot notifyStopped() when the service is ");
                    sb.append(state);
                    IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
                    mo31708a((Throwable) illegalStateException);
                    throw illegalStateException;
                }
            }
            this.f22444g = new C8510k(State.TERMINATED);
            m40174d(state);
        } finally {
            this.f22438a.mo31754i();
            m40176k();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(mo31597a());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: c */
    public final Throwable mo31602c() {
        return this.f22444g.mo31719b();
    }

    /* renamed from: e */
    public final void mo31604e() {
        this.f22438a.mo31742d(this.f22442e);
        try {
            m40170a(State.TERMINATED);
        } finally {
            this.f22438a.mo31754i();
        }
    }

    /* renamed from: b */
    public final void mo31601b(long j, TimeUnit timeUnit) throws TimeoutException {
        if (this.f22438a.mo31743d(this.f22442e, j, timeUnit)) {
            try {
                m40170a(State.TERMINATED);
            } finally {
                this.f22438a.mo31754i();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Timed out waiting for ");
            sb.append(this);
            sb.append(" to reach a terminal state. ");
            sb.append("Current state: ");
            sb.append(mo31597a());
            throw new TimeoutException(sb.toString());
        }
    }

    @C5966a("monitor")
    /* renamed from: a */
    private void m40170a(State state) {
        State a = mo31597a();
        if (a != state) {
            String str = "Expected the service to be ";
            if (a == State.FAILED) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(state);
                sb.append(", but the service has FAILED");
                throw new IllegalStateException(sb.toString(), mo31602c());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(state);
            sb2.append(", but was ");
            sb2.append(a);
            throw new IllegalStateException(sb2.toString());
        }
    }

    @C5966a("monitor")
    /* renamed from: b */
    private void m40172b(State state) {
        if (state == State.STARTING) {
            f22433j.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
        } else if (state == State.RUNNING) {
            f22434k.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31708a(Throwable th) {
        C7397x.m35664a(th);
        this.f22438a.mo31729a();
        try {
            State a = mo31597a();
            switch (C8500a.f22445a[a.ordinal()]) {
                case 1:
                case 5:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed while in state:");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString(), th);
                case 2:
                case 3:
                case 4:
                    this.f22444g = new C8510k(State.FAILED, false, th);
                    m40171a(a, th);
                    break;
                case 6:
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unexpected state: ");
                    sb2.append(a);
                    throw new AssertionError(sb2.toString());
            }
        } finally {
            this.f22438a.mo31754i();
            m40176k();
        }
    }

    @C5966a("monitor")
    /* renamed from: d */
    private void m40174d(State state) {
        int i = C8500a.f22445a[state.ordinal()];
        if (i == 1) {
            f22435l.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
        } else if (i == 3) {
            f22436m.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
        } else if (i == 4) {
            f22437n.mo31706a((Iterable<C8497f0<L>>) this.f22443f);
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public final State mo31597a() {
        return this.f22444g.mo31718a();
    }

    /* renamed from: a */
    public final void mo31599a(C8435b bVar, Executor executor) {
        C7397x.m35665a(bVar, (Object) C4307a.f13384a);
        C7397x.m35665a(executor, (Object) "executor");
        this.f22438a.mo31729a();
        try {
            if (!mo31597a().isTerminal()) {
                this.f22443f.add(new C8497f0(bVar, executor));
            }
        } finally {
            this.f22438a.mo31754i();
        }
    }

    @C5966a("monitor")
    /* renamed from: a */
    private void m40171a(State state, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("failed({from = ");
        sb.append(state);
        sb.append(", cause = ");
        sb.append(th);
        sb.append("})");
        new C8509j(sb.toString(), state, th).mo31706a((Iterable<C8497f0<L>>) this.f22443f);
    }
}
