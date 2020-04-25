package com.google.common.collect;

import com.google.common.base.C7397x;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.collect.c */
/* compiled from: AbstractIterator */
public abstract class C7603c<T> extends C8023l6<T> {

    /* renamed from: a */
    private C7605b f21185a = C7605b.NOT_READY;

    /* renamed from: b */
    private T f21186b;

    /* renamed from: com.google.common.collect.c$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C7604a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21187a = new int[C7605b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.collect.c$b[] r0 = com.google.common.collect.C7603c.C7605b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21187a = r0
                int[] r0 = f21187a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.collect.c$b r1 = com.google.common.collect.C7603c.C7605b.DONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21187a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.collect.c$b r1 = com.google.common.collect.C7603c.C7605b.READY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C7603c.C7604a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.c$b */
    /* compiled from: AbstractIterator */
    private enum C7605b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C7603c() {
    }

    /* renamed from: d */
    private boolean mo31286d() {
        this.f21185a = C7605b.FAILED;
        this.f21186b = mo29748b();
        if (this.f21185a == C7605b.DONE) {
            return false;
        }
        this.f21185a = C7605b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo29748b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo29793c() {
        this.f21185a = C7605b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C7397x.m35676b(this.f21185a != C7605b.FAILED);
        int i = C7604a.f21187a[this.f21185a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return mo31286d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f21185a = C7605b.NOT_READY;
            T t = this.f21186b;
            this.f21186b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final T peek() {
        if (hasNext()) {
            return this.f21186b;
        }
        throw new NoSuchElementException();
    }
}
