package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import p053b.p054a.p055a.p057c.C2082a;

/* renamed from: androidx.lifecycle.j */
/* compiled from: LifecycleRegistry */
public class C1460j extends Lifecycle {

    /* renamed from: b */
    private C2082a<C1458h, C1462b> f5710b = new C2082a<>();

    /* renamed from: c */
    private State f5711c;

    /* renamed from: d */
    private final WeakReference<C1459i> f5712d;

    /* renamed from: e */
    private int f5713e = 0;

    /* renamed from: f */
    private boolean f5714f = false;

    /* renamed from: g */
    private boolean f5715g = false;

    /* renamed from: h */
    private ArrayList<State> f5716h = new ArrayList<>();

    /* renamed from: androidx.lifecycle.j$a */
    /* compiled from: LifecycleRegistry */
    static /* synthetic */ class C1461a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5717a = new int[C1441a.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f5718b = new int[State.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0086 */
        static {
            /*
                androidx.lifecycle.Lifecycle$State[] r0 = androidx.lifecycle.Lifecycle.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5718b = r0
                r0 = 1
                int[] r1 = f5718b     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f5718b     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.Lifecycle$State r3 = androidx.lifecycle.Lifecycle.State.CREATED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f5718b     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f5718b     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.Lifecycle$State r5 = androidx.lifecycle.Lifecycle.State.RESUMED     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                r4 = 5
                int[] r5 = f5718b     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                androidx.lifecycle.Lifecycle$a[] r5 = androidx.lifecycle.Lifecycle.C1441a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f5717a = r5
                int[] r5 = f5717a     // Catch:{ NoSuchFieldError -> 0x0053 }
                androidx.lifecycle.Lifecycle$a r6 = androidx.lifecycle.Lifecycle.C1441a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x005d }
                androidx.lifecycle.Lifecycle$a r5 = androidx.lifecycle.Lifecycle.C1441a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x005d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x0067 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_START     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x0071 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x007b }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x0086 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f5717a     // Catch:{ NoSuchFieldError -> 0x0091 }
                androidx.lifecycle.Lifecycle$a r1 = androidx.lifecycle.Lifecycle.C1441a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1460j.C1461a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.j$b */
    /* compiled from: LifecycleRegistry */
    static class C1462b {

        /* renamed from: a */
        State f5719a;

        /* renamed from: b */
        C1457g f5720b;

        C1462b(C1458h hVar, State state) {
            this.f5720b = Lifecycling.m7643b((Object) hVar);
            this.f5719a = state;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo6516a(C1459i iVar, C1441a aVar) {
            State b = C1460j.m7696b(aVar);
            this.f5719a = C1460j.m7694a(this.f5719a, b);
            this.f5720b.mo632a(iVar, aVar);
            this.f5719a = b;
        }
    }

    public C1460j(@C0193h0 C1459i iVar) {
        this.f5712d = new WeakReference<>(iVar);
        this.f5711c = State.INITIALIZED;
    }

    /* renamed from: c */
    private boolean m7700c() {
        boolean z = true;
        if (this.f5710b.size() == 0) {
            return true;
        }
        State state = ((C1462b) this.f5710b.mo9060b().getValue()).f5719a;
        State state2 = ((C1462b) this.f5710b.mo9063e().getValue()).f5719a;
        if (!(state == state2 && this.f5711c == state2)) {
            z = false;
        }
        return z;
    }

    /* renamed from: d */
    private void m7702d(State state) {
        if (this.f5711c != state) {
            this.f5711c = state;
            if (this.f5714f || this.f5713e != 0) {
                this.f5715g = true;
                return;
            }
            this.f5714f = true;
            m7703e();
            this.f5714f = false;
        }
    }

    /* renamed from: e */
    private void m7704e(State state) {
        this.f5716h.add(state);
    }

    /* renamed from: f */
    private static C1441a m7705f(State state) {
        int i = C1461a.f5718b[state.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C1441a.ON_START;
            }
            if (i == 3) {
                return C1441a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return C1441a.ON_CREATE;
    }

    @Deprecated
    @C0187e0
    /* renamed from: a */
    public void mo6512a(@C0193h0 State state) {
        mo6515b(state);
    }

    @C0187e0
    /* renamed from: b */
    public void mo6515b(@C0193h0 State state) {
        m7702d(state);
    }

    /* renamed from: e */
    private void m7703e() {
        C1459i iVar = (C1459i) this.f5712d.get();
        if (iVar != null) {
            while (!m7700c()) {
                this.f5715g = false;
                if (this.f5711c.compareTo(((C1462b) this.f5710b.mo9060b().getValue()).f5719a) < 0) {
                    m7695a(iVar);
                }
                Entry e = this.f5710b.mo9063e();
                if (!this.f5715g && e != null && this.f5711c.compareTo(((C1462b) e.getValue()).f5719a) > 0) {
                    m7697b(iVar);
                }
            }
            this.f5715g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    /* renamed from: a */
    public void mo6513a(@C0193h0 C1441a aVar) {
        m7702d(m7696b(aVar));
    }

    /* renamed from: b */
    public void mo6473b(@C0193h0 C1458h hVar) {
        this.f5710b.remove(hVar);
    }

    /* renamed from: b */
    public int mo6514b() {
        return this.f5710b.size();
    }

    /* renamed from: b */
    static State m7696b(C1441a aVar) {
        switch (C1461a.f5717a[aVar.ordinal()]) {
            case 1:
            case 2:
                return State.CREATED;
            case 3:
            case 4:
                return State.STARTED;
            case 5:
                return State.RESUMED;
            case 6:
                return State.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo6472a(@C0193h0 C1458h hVar) {
        State state = this.f5711c;
        State state2 = State.DESTROYED;
        if (state != state2) {
            state2 = State.INITIALIZED;
        }
        C1462b bVar = new C1462b(hVar, state2);
        if (((C1462b) this.f5710b.mo9055b(hVar, bVar)) == null) {
            C1459i iVar = (C1459i) this.f5712d.get();
            if (iVar != null) {
                boolean z = this.f5713e != 0 || this.f5714f;
                State c = m7698c(hVar);
                this.f5713e++;
                while (bVar.f5719a.compareTo(c) < 0 && this.f5710b.contains(hVar)) {
                    m7704e(bVar.f5719a);
                    bVar.mo6516a(iVar, m7705f(bVar.f5719a));
                    m7701d();
                    c = m7698c(hVar);
                }
                if (!z) {
                    m7703e();
                }
                this.f5713e--;
            }
        }
    }

    /* renamed from: c */
    private State m7698c(C1458h hVar) {
        Entry c = this.f5710b.mo9056c(hVar);
        State state = null;
        State state2 = c != null ? ((C1462b) c.getValue()).f5719a : null;
        if (!this.f5716h.isEmpty()) {
            ArrayList<State> arrayList = this.f5716h;
            state = (State) arrayList.get(arrayList.size() - 1);
        }
        return m7694a(m7694a(this.f5711c, state2), state);
    }

    /* renamed from: d */
    private void m7701d() {
        ArrayList<State> arrayList = this.f5716h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: c */
    private static C1441a m7699c(State state) {
        int i = C1461a.f5718b[state.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C1441a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C1441a.ON_STOP;
            }
            if (i == 4) {
                return C1441a.ON_PAUSE;
            }
            if (i != 5) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state value ");
                sb.append(state);
                throw new IllegalArgumentException(sb.toString());
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    private void m7697b(C1459i iVar) {
        C2087d c = this.f5710b.mo9061c();
        while (c.hasNext() && !this.f5715g) {
            Entry entry = (Entry) c.next();
            C1462b bVar = (C1462b) entry.getValue();
            while (bVar.f5719a.compareTo(this.f5711c) < 0 && !this.f5715g && this.f5710b.contains(entry.getKey())) {
                m7704e(bVar.f5719a);
                bVar.mo6516a(iVar, m7705f(bVar.f5719a));
                m7701d();
            }
        }
    }

    @C0193h0
    /* renamed from: a */
    public State mo6471a() {
        return this.f5711c;
    }

    /* renamed from: a */
    private void m7695a(C1459i iVar) {
        Iterator descendingIterator = this.f5710b.descendingIterator();
        while (descendingIterator.hasNext() && !this.f5715g) {
            Entry entry = (Entry) descendingIterator.next();
            C1462b bVar = (C1462b) entry.getValue();
            while (bVar.f5719a.compareTo(this.f5711c) > 0 && !this.f5715g && this.f5710b.contains(entry.getKey())) {
                C1441a c = m7699c(bVar.f5719a);
                m7704e(m7696b(c));
                bVar.mo6516a(iVar, c);
                m7701d();
            }
        }
    }

    /* renamed from: a */
    static State m7694a(@C0193h0 State state, @C0195i0 State state2) {
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }
}
