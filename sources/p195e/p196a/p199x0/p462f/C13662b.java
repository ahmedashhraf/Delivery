package p195e.p196a.p199x0.p462f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p195e.p196a.p198t0.C5938g;
import p195e.p196a.p199x0.p200j.C13767t;
import p195e.p196a.p199x0.p452c.C12405n;

/* renamed from: e.a.x0.f.b */
/* compiled from: SpscArrayQueue */
public final class C13662b<E> extends AtomicReferenceArray<E> implements C12405n<E> {

    /* renamed from: Q */
    private static final Integer f39520Q = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: N */
    long f39521N;

    /* renamed from: O */
    final AtomicLong f39522O = new AtomicLong();

    /* renamed from: P */
    final int f39523P;

    /* renamed from: a */
    final int f39524a = (length() - 1);

    /* renamed from: b */
    final AtomicLong f39525b = new AtomicLong();

    public C13662b(int i) {
        super(C13767t.m58771b(i));
        this.f39523P = Math.min(i / 4, f39520Q.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo43029a(long j, int i) {
        return ((int) j) & i;
    }

    /* renamed from: a */
    public boolean mo42104a(E e, E e2) {
        return offer(e) && offer(e2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo43032b(long j) {
        this.f39522O.lazySet(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo43033c(long j) {
        this.f39525b.lazySet(j);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean isEmpty() {
        return this.f39525b.get() == this.f39522O.get();
    }

    public boolean offer(E e) {
        if (e != null) {
            int i = this.f39524a;
            long j = this.f39525b.get();
            int a = mo43029a(j, i);
            if (j >= this.f39521N) {
                long j2 = ((long) this.f39523P) + j;
                if (mo43030a(mo43029a(j2, i)) == null) {
                    this.f39521N = j2;
                } else if (mo43030a(a) != null) {
                    return false;
                }
            }
            mo43031a(a, e);
            mo43033c(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @C5938g
    public E poll() {
        long j = this.f39522O.get();
        int a = mo43028a(j);
        E a2 = mo43030a(a);
        if (a2 == null) {
            return null;
        }
        mo43032b(j + 1);
        mo43031a(a, (E) null);
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo43028a(long j) {
        return this.f39524a & ((int) j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43031a(int i, E e) {
        lazySet(i, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public E mo43030a(int i) {
        return get(i);
    }
}
