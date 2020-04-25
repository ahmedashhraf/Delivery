package p195e.p196a.p467z0;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p195e.p196a.C12200a0;
import p195e.p196a.p198t0.C5936e;
import p195e.p196a.p199x0.p200j.C13754k;
import p195e.p196a.p199x0.p200j.C13771y;
import p195e.p196a.p199x0.p451b.C12351a;
import p195e.p196a.p199x0.p451b.C12390b;
import p195e.p196a.p447u0.C12314c;
import p195e.p196a.p449w0.C12342r;
import p195e.p196a.p467z0.C13775a;
import p212io.reactivex.exceptions.CompositeException;

/* renamed from: e.a.z0.a */
/* compiled from: BaseTestConsumer */
public abstract class C13775a<T, U extends C13775a<T, U>> implements C12314c {

    /* renamed from: N */
    protected final List<Throwable> f39822N = new C13771y();

    /* renamed from: O */
    protected long f39823O;

    /* renamed from: P */
    protected Thread f39824P;

    /* renamed from: Q */
    protected boolean f39825Q;

    /* renamed from: R */
    protected int f39826R;

    /* renamed from: S */
    protected int f39827S;

    /* renamed from: T */
    protected CharSequence f39828T;

    /* renamed from: U */
    protected boolean f39829U;

    /* renamed from: a */
    protected final CountDownLatch f39830a = new CountDownLatch(1);

    /* renamed from: b */
    protected final List<T> f39831b = new C13771y();

    /* renamed from: e.a.z0.a$b */
    /* compiled from: BaseTestConsumer */
    public enum C13777b implements Runnable {
        SPIN {
            public void run() {
            }
        },
        YIELD {
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS {
            public void run() {
                C13777b.m58850a(1);
            }
        },
        SLEEP_10MS {
            public void run() {
                C13777b.m58850a(10);
            }
        },
        SLEEP_100MS {
            public void run() {
                C13777b.m58850a(100);
            }
        },
        SLEEP_1000MS {
            public void run() {
                C13777b.m58850a(1000);
            }
        };

        /* renamed from: a */
        static void m58850a(int i) {
            try {
                Thread.sleep((long) i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public abstract void run();
    }

    /* renamed from: e */
    public static String m58799e(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" (class: ");
        sb.append(obj.getClass().getSimpleName());
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo43217a(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean z = this.f39830a.getCount() == 0 || this.f39830a.await(j, timeUnit);
        this.f39829U = !z;
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final AssertionError mo43223b(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 64);
        sb.append(str);
        sb.append(" (");
        sb.append("latch = ");
        sb.append(this.f39830a.getCount());
        String str2 = ", ";
        sb.append(str2);
        sb.append("values = ");
        sb.append(this.f39831b.size());
        sb.append(str2);
        sb.append("errors = ");
        sb.append(this.f39822N.size());
        sb.append(str2);
        sb.append("completions = ");
        sb.append(this.f39823O);
        if (this.f39829U) {
            sb.append(", timeout!");
        }
        if (mo41878d()) {
            sb.append(", disposed!");
        }
        CharSequence charSequence = this.f39828T;
        if (charSequence != null) {
            sb.append(", tag = ");
            sb.append(charSequence);
        }
        sb.append(')');
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f39822N.isEmpty()) {
            if (this.f39822N.size() == 1) {
                assertionError.initCause((Throwable) this.f39822N.get(0));
            } else {
                assertionError.initCause(new CompositeException((Iterable<? extends Throwable>) this.f39822N));
            }
        }
        return assertionError;
    }

    /* renamed from: c */
    public final U mo43224c() {
        if (this.f39822N.size() == 0) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error(s) present: ");
        sb.append(this.f39822N);
        throw mo43223b(sb.toString());
    }

    /* renamed from: d */
    public final U mo43229d(T t) {
        String str = ", Actual: ";
        String str2 = "Expected: ";
        if (this.f39831b.size() == 1) {
            Object obj = this.f39831b.get(0);
            if (C12390b.m55564a((Object) t, obj)) {
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(m58799e(t));
            sb.append(str);
            sb.append(m58799e(obj));
            throw mo43223b(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(m58799e(t));
        sb2.append(str);
        sb2.append(this.f39831b);
        throw mo43223b(sb2.toString());
    }

    /* renamed from: f */
    public final U mo43231f() {
        return mo43201a(0);
    }

    /* renamed from: g */
    public final U mo43232g() {
        long j = this.f39823O;
        if (j == 1) {
            throw mo43223b("Completed!");
        } else if (j <= 1) {
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Multiple completions: ");
            sb.append(j);
            throw mo43223b(sb.toString());
        }
    }

    /* renamed from: h */
    public abstract U mo42012h();

    /* renamed from: i */
    public final U mo43233i() {
        if (this.f39830a.getCount() != 0) {
            return this;
        }
        throw mo43223b("Subscriber terminated!");
    }

    /* renamed from: j */
    public abstract U mo42013j();

    /* renamed from: k */
    public final U mo43234k() {
        if (this.f39830a.getCount() == 0) {
            long j = this.f39823O;
            if (j <= 1) {
                int size = this.f39822N.size();
                if (size > 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Terminated with multiple errors: ");
                    sb.append(size);
                    throw mo43223b(sb.toString());
                } else if (j == 0 || size == 0) {
                    return this;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Terminated with multiple completions and errors: ");
                    sb2.append(j);
                    throw mo43223b(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Terminated with multiple completions: ");
                sb3.append(j);
                throw mo43223b(sb3.toString());
            }
        } else {
            throw mo43223b("Subscriber still running!");
        }
    }

    /* renamed from: l */
    public final U mo43235l() {
        if (this.f39829U) {
            return this;
        }
        throw mo43223b("No timeout?!");
    }

    /* renamed from: m */
    public final U mo43236m() throws InterruptedException {
        if (this.f39830a.getCount() == 0) {
            return this;
        }
        this.f39830a.await();
        return this;
    }

    /* renamed from: n */
    public final boolean mo43237n() {
        try {
            mo43236m();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    /* renamed from: o */
    public final U mo43238o() {
        this.f39829U = false;
        return this;
    }

    /* renamed from: p */
    public final long mo43239p() {
        return this.f39823O;
    }

    /* renamed from: q */
    public final int mo43240q() {
        return this.f39822N.size();
    }

    /* renamed from: r */
    public final List<Throwable> mo43241r() {
        return this.f39822N;
    }

    /* renamed from: s */
    public final List<List<Object>> mo43242s() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo43247x());
        arrayList.add(mo43241r());
        ArrayList arrayList2 = new ArrayList();
        for (long j = 0; j < this.f39823O; j++) {
            arrayList2.add(C12200a0.m54847f());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    /* renamed from: t */
    public final boolean mo43243t() {
        return this.f39830a.getCount() == 0;
    }

    /* renamed from: u */
    public final boolean mo43244u() {
        return this.f39829U;
    }

    /* renamed from: v */
    public final Thread mo43245v() {
        return this.f39824P;
    }

    /* renamed from: w */
    public final int mo43246w() {
        return this.f39831b.size();
    }

    /* renamed from: x */
    public final List<T> mo43247x() {
        return this.f39831b;
    }

    /* renamed from: e */
    public final U mo43230e() {
        if (!this.f39829U) {
            return this;
        }
        throw mo43223b("Timeout?!");
    }

    /* renamed from: a */
    public final U mo43200a() {
        long j = this.f39823O;
        if (j == 0) {
            throw mo43223b("Not completed");
        } else if (j <= 1) {
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Multiple completions: ");
            sb.append(j);
            throw mo43223b(sb.toString());
        }
    }

    /* renamed from: c */
    public final U mo43226c(T t) {
        int size = this.f39831b.size();
        int i = 0;
        while (i < size) {
            if (!C12390b.m55564a(this.f39831b.get(i), (Object) t)) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Value at position ");
                sb.append(i);
                sb.append(" is equal to ");
                sb.append(m58799e(t));
                sb.append("; Expected them to be different");
                throw mo43223b(sb.toString());
            }
        }
        return this;
    }

    /* renamed from: a */
    public final U mo43214a(Throwable th) {
        return mo43206a(C12351a.m55511a(th));
    }

    /* renamed from: a */
    public final U mo43209a(Class<? extends Throwable> cls) {
        return mo43206a(C12351a.m55515b(cls));
    }

    /* renamed from: c */
    public final U mo43225c(C12342r<T> rVar) {
        mo43202a(0, rVar);
        if (this.f39831b.size() <= 1) {
            return this;
        }
        throw mo43223b("Value present but other values as well");
    }

    /* renamed from: a */
    public final U mo43206a(C12342r<Throwable> rVar) {
        int size = this.f39822N.size();
        if (size != 0) {
            boolean z = false;
            Iterator it = this.f39822N.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    if (rVar.mo41812b((Throwable) it.next())) {
                        z = true;
                        break;
                    }
                } catch (Exception e) {
                    throw C13754k.m58724c(e);
                }
            }
            if (!z) {
                throw mo43223b("Error not present");
            } else if (size == 1) {
                return this;
            } else {
                throw mo43223b("Error present but other errors as well");
            }
        } else {
            throw mo43223b("No errors");
        }
    }

    @C5936e
    /* renamed from: c */
    public final U mo43227c(T... tArr) {
        return mo42013j().mo43222b(tArr).mo43224c().mo43232g();
    }

    /* renamed from: c */
    public final boolean mo43228c(long j, TimeUnit timeUnit) {
        try {
            return mo43217a(j, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    @C5936e
    /* renamed from: a */
    public final U mo43203a(int i, T t) {
        int size = this.f39831b.size();
        if (size == 0) {
            throw mo43223b("No values");
        } else if (i < size) {
            Object obj = this.f39831b.get(i);
            if (C12390b.m55564a((Object) t, obj)) {
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected: ");
            sb.append(m58799e(t));
            sb.append(", Actual: ");
            sb.append(m58799e(obj));
            throw mo43223b(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid index: ");
            sb2.append(i);
            throw mo43223b(sb2.toString());
        }
    }

    /* renamed from: a */
    public final U mo43202a(int i, C12342r<T> rVar) {
        if (this.f39831b.size() == 0) {
            throw mo43223b("No values");
        } else if (i < this.f39831b.size()) {
            try {
                if (rVar.mo41812b(this.f39831b.get(i))) {
                    return this;
                }
                throw mo43223b("Value not present");
            } catch (Exception e) {
                throw C13754k.m58724c(e);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid index: ");
            sb.append(i);
            throw mo43223b(sb.toString());
        }
    }

    /* renamed from: b */
    public final U mo43221b(C12342r<? super T> rVar) {
        int size = this.f39831b.size();
        int i = 0;
        while (i < size) {
            try {
                if (!rVar.mo41812b(this.f39831b.get(i))) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Value at position ");
                    sb.append(i);
                    sb.append(" matches predicate ");
                    sb.append(rVar.toString());
                    sb.append(", which was not expected.");
                    throw mo43223b(sb.toString());
                }
            } catch (Exception e) {
                throw C13754k.m58724c(e);
            }
        }
        return this;
    }

    /* renamed from: b */
    public final U mo43222b(T... tArr) {
        int size = this.f39831b.size();
        String str = ", Actual: ";
        if (size == tArr.length) {
            int i = 0;
            while (i < size) {
                Object obj = this.f39831b.get(i);
                T t = tArr[i];
                if (C12390b.m55564a((Object) t, obj)) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Values at position ");
                    sb.append(i);
                    sb.append(" differ; Expected: ");
                    sb.append(m58799e(t));
                    sb.append(str);
                    sb.append(m58799e(obj));
                    throw mo43223b(sb.toString());
                }
            }
            return this;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Value count differs; Expected: ");
        sb2.append(tArr.length);
        String str2 = C3868i.f12248b;
        sb2.append(str2);
        sb2.append(Arrays.toString(tArr));
        sb2.append(str);
        sb2.append(size);
        sb2.append(str2);
        sb2.append(this.f39831b);
        throw mo43223b(sb2.toString());
    }

    /* renamed from: a */
    public final U mo43201a(int i) {
        int size = this.f39831b.size();
        if (size == i) {
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Value counts differ; Expected: ");
        sb.append(i);
        sb.append(", Actual: ");
        sb.append(size);
        throw mo43223b(sb.toString());
    }

    /* renamed from: a */
    public final U mo43215a(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            mo43231f();
            return this;
        }
        for (Object next : this.f39831b) {
            if (!collection.contains(next)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Value not in the expected collection: ");
                sb.append(m58799e(next));
                throw mo43223b(sb.toString());
            }
        }
        return this;
    }

    /* renamed from: b */
    public final U mo43220b(long j, TimeUnit timeUnit) {
        try {
            if (!this.f39830a.await(j, timeUnit)) {
                this.f39829U = true;
                dispose();
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw C13754k.m58724c(e);
        }
    }

    /* renamed from: a */
    public final U mo43212a(Iterable<? extends T> iterable) {
        boolean hasNext;
        boolean hasNext2;
        Iterator it = this.f39831b.iterator();
        Iterator it2 = iterable.iterator();
        int i = 0;
        while (true) {
            hasNext = it2.hasNext();
            hasNext2 = it.hasNext();
            if (!hasNext2 || !hasNext) {
                String str = ")";
            } else {
                Object next = it2.next();
                Object next2 = it.next();
                if (C12390b.m55564a(next, next2)) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Values at position ");
                    sb.append(i);
                    sb.append(" differ; Expected: ");
                    sb.append(m58799e(next));
                    sb.append(", Actual: ");
                    sb.append(m58799e(next2));
                    throw mo43223b(sb.toString());
                }
            }
        }
        String str2 = ")";
        if (hasNext2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("More values received than expected (");
            sb2.append(i);
            sb2.append(str2);
            throw mo43223b(sb2.toString());
        } else if (!hasNext) {
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fewer values received than expected (");
            sb3.append(i);
            sb3.append(str2);
            throw mo43223b(sb3.toString());
        }
    }

    /* renamed from: b */
    public final U mo43218b() {
        return mo42013j().mo43231f().mo43224c().mo43232g();
    }

    /* renamed from: b */
    public final U mo43219b(int i) {
        return mo43205a(i, (Runnable) C13777b.SLEEP_10MS, 5000);
    }

    /* renamed from: a */
    public final U mo43213a(String str) {
        int size = this.f39822N.size();
        if (size == 0) {
            throw mo43223b("No errors");
        } else if (size == 1) {
            String message = ((Throwable) this.f39822N.get(0)).getMessage();
            if (C12390b.m55564a((Object) str, (Object) message)) {
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Error message differs; Expected: ");
            sb.append(str);
            sb.append(", Actual: ");
            sb.append(message);
            throw mo43223b(sb.toString());
        } else {
            throw mo43223b("Multiple errors");
        }
    }

    /* renamed from: a */
    public final U mo43216a(T... tArr) {
        return mo42013j().mo43222b(tArr).mo43224c().mo43200a();
    }

    /* renamed from: a */
    public final U mo43211a(Class<? extends Throwable> cls, T... tArr) {
        return mo42013j().mo43222b(tArr).mo43209a(cls).mo43232g();
    }

    /* renamed from: a */
    public final U mo43207a(C12342r<Throwable> rVar, T... tArr) {
        return mo42013j().mo43222b(tArr).mo43206a(rVar).mo43232g();
    }

    /* renamed from: a */
    public final U mo43210a(Class<? extends Throwable> cls, String str, T... tArr) {
        return mo42013j().mo43222b(tArr).mo43209a(cls).mo43213a(str).mo43232g();
    }

    /* renamed from: a */
    public final U mo43208a(CharSequence charSequence) {
        this.f39828T = charSequence;
        return this;
    }

    /* renamed from: a */
    public final U mo43204a(int i, Runnable runnable) {
        return mo43205a(i, runnable, 5000);
    }

    /* renamed from: a */
    public final U mo43205a(int i, Runnable runnable, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j <= 0 || System.currentTimeMillis() - currentTimeMillis < j) {
                if (this.f39830a.getCount() == 0 || this.f39831b.size() >= i) {
                    break;
                }
                runnable.run();
            } else {
                this.f39829U = true;
                break;
            }
        }
        return this;
    }
}
