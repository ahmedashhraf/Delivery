package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p076c.p112d.p148d.p149a.C2776b;

@C2776b
/* renamed from: com.google.common.base.b */
/* compiled from: AbstractIterator */
abstract class C7321b<T> implements Iterator<T> {

    /* renamed from: a */
    private C7323b f20768a = C7323b.NOT_READY;

    /* renamed from: b */
    private T f20769b;

    /* renamed from: com.google.common.base.b$a */
    /* compiled from: AbstractIterator */
    static /* synthetic */ class C7322a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20770a = new int[C7323b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.google.common.base.b$b[] r0 = com.google.common.base.C7321b.C7323b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20770a = r0
                int[] r0 = f20770a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.common.base.b$b r1 = com.google.common.base.C7321b.C7323b.DONE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20770a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.common.base.b$b r1 = com.google.common.base.C7321b.C7323b.READY     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C7321b.C7322a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.base.b$b */
    /* compiled from: AbstractIterator */
    private enum C7323b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C7321b() {
    }

    /* renamed from: d */
    private boolean m35486d() {
        this.f20768a = C7323b.FAILED;
        this.f20769b = mo23084b();
        if (this.f20768a == C7323b.DONE) {
            return false;
        }
        this.f20768a = C7323b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo23084b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final T mo29191c() {
        this.f20768a = C7323b.DONE;
        return null;
    }

    public final boolean hasNext() {
        C7397x.m35676b(this.f20768a != C7323b.FAILED);
        int i = C7322a.f20770a[this.f20768a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m35486d();
        }
        return true;
    }

    public final T next() {
        if (hasNext()) {
            this.f20768a = C7323b.NOT_READY;
            T t = this.f20769b;
            this.f20769b = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
