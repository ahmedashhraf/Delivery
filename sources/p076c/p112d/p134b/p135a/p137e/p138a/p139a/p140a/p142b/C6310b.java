package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;

@C2716b
/* renamed from: c.d.b.a.e.a.a.a.b.b */
/* compiled from: AbstractIterator */
abstract class C6310b<T> implements Iterator<T> {

    /* renamed from: a */
    private C6312b f17679a = C6312b.NOT_READY;

    /* renamed from: b */
    private T f17680b;

    /* renamed from: c.d.b.a.e.a.a.a.b.b$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C6311a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17681a = new int[C6312b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                c.d.b.a.e.a.a.a.b.b$b[] r0 = p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C6310b.C6312b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17681a = r0
                int[] r0 = f17681a     // Catch:{ NoSuchFieldError -> 0x0014 }
                c.d.b.a.e.a.a.a.b.b$b r1 = p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C6310b.C6312b.DONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f17681a     // Catch:{ NoSuchFieldError -> 0x001f }
                c.d.b.a.e.a.a.a.b.b$b r1 = p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C6310b.C6312b.READY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b.C6310b.C6311a.<clinit>():void");
        }
    }

    /* renamed from: c.d.b.a.e.a.a.a.b.b$b */
    /* compiled from: AbstractIterator */
    private enum C6312b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C6310b() {
    }

    /* renamed from: d */
    private boolean m29377d() {
        this.f17679a = C6312b.FAILED;
        this.f17680b = mo10480b();
        if (this.f17679a == C6312b.DONE) {
            return false;
        }
        this.f17679a = C6312b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo10480b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo25594c() {
        this.f17679a = C6312b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C6329k.m29446b(this.f17679a != C6312b.FAILED);
        int i = C6311a.f17681a[this.f17679a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m29377d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f17679a = C6312b.NOT_READY;
            T t = this.f17680b;
            this.f17680b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
