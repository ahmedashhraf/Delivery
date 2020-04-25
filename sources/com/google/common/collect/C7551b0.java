package com.google.common.collect;

import java.util.Comparator;
import p076c.p112d.p148d.p149a.C2776b;
import p076c.p112d.p148d.p150g.C6621a;
import p076c.p112d.p148d.p150g.C6637f;
import p076c.p112d.p148d.p150g.C6641g;
import p201f.p202a.C5952h;

@C2776b
/* renamed from: com.google.common.collect.b0 */
/* compiled from: ComparisonChain */
public abstract class C7551b0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C7551b0 f21106a = new C7552a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C7551b0 f21107b = new C7553b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C7551b0 f21108c = new C7553b(1);

    /* renamed from: com.google.common.collect.b0$a */
    /* compiled from: ComparisonChain */
    static class C7552a extends C7551b0 {
        C7552a() {
            super(null);
        }

        /* renamed from: a */
        public int mo29667a() {
            return 0;
        }

        /* renamed from: a */
        public C7551b0 mo29672a(Comparable comparable, Comparable comparable2) {
            return mo29676a(comparable.compareTo(comparable2));
        }

        /* renamed from: b */
        public C7551b0 mo29675b(boolean z, boolean z2) {
            return mo29676a(C6621a.m31533a(z2, z));
        }

        /* renamed from: a */
        public <T> C7551b0 mo29673a(@C5952h T t, @C5952h T t2, Comparator<T> comparator) {
            return mo29676a(comparator.compare(t, t2));
        }

        /* renamed from: a */
        public C7551b0 mo29670a(int i, int i2) {
            return mo29676a(C6637f.m31658a(i, i2));
        }

        /* renamed from: a */
        public C7551b0 mo29671a(long j, long j2) {
            return mo29676a(C6641g.m31691a(j, j2));
        }

        /* renamed from: a */
        public C7551b0 mo29669a(float f, float f2) {
            return mo29676a(Float.compare(f, f2));
        }

        /* renamed from: a */
        public C7551b0 mo29668a(double d, double d2) {
            return mo29676a(Double.compare(d, d2));
        }

        /* renamed from: a */
        public C7551b0 mo29674a(boolean z, boolean z2) {
            return mo29676a(C6621a.m31533a(z, z2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C7551b0 mo29676a(int i) {
            if (i < 0) {
                return C7551b0.f21107b;
            }
            return i > 0 ? C7551b0.f21108c : C7551b0.f21106a;
        }
    }

    /* renamed from: com.google.common.collect.b0$b */
    /* compiled from: ComparisonChain */
    private static final class C7553b extends C7551b0 {

        /* renamed from: d */
        final int f21109d;

        C7553b(int i) {
            super(null);
            this.f21109d = i;
        }

        /* renamed from: a */
        public int mo29667a() {
            return this.f21109d;
        }

        /* renamed from: a */
        public C7551b0 mo29668a(double d, double d2) {
            return this;
        }

        /* renamed from: a */
        public C7551b0 mo29669a(float f, float f2) {
            return this;
        }

        /* renamed from: a */
        public C7551b0 mo29670a(int i, int i2) {
            return this;
        }

        /* renamed from: a */
        public C7551b0 mo29671a(long j, long j2) {
            return this;
        }

        /* renamed from: a */
        public C7551b0 mo29672a(@C5952h Comparable comparable, @C5952h Comparable comparable2) {
            return this;
        }

        /* renamed from: a */
        public <T> C7551b0 mo29673a(@C5952h T t, @C5952h T t2, @C5952h Comparator<T> comparator) {
            return this;
        }

        /* renamed from: a */
        public C7551b0 mo29674a(boolean z, boolean z2) {
            return this;
        }

        /* renamed from: b */
        public C7551b0 mo29675b(boolean z, boolean z2) {
            return this;
        }
    }

    /* synthetic */ C7551b0(C7552a aVar) {
        this();
    }

    /* renamed from: e */
    public static C7551b0 m36254e() {
        return f21106a;
    }

    /* renamed from: a */
    public abstract int mo29667a();

    /* renamed from: a */
    public abstract C7551b0 mo29668a(double d, double d2);

    /* renamed from: a */
    public abstract C7551b0 mo29669a(float f, float f2);

    /* renamed from: a */
    public abstract C7551b0 mo29670a(int i, int i2);

    /* renamed from: a */
    public abstract C7551b0 mo29671a(long j, long j2);

    /* renamed from: a */
    public abstract C7551b0 mo29672a(Comparable<?> comparable, Comparable<?> comparable2);

    /* renamed from: a */
    public abstract <T> C7551b0 mo29673a(@C5952h T t, @C5952h T t2, Comparator<T> comparator);

    /* renamed from: a */
    public abstract C7551b0 mo29674a(boolean z, boolean z2);

    /* renamed from: b */
    public abstract C7551b0 mo29675b(boolean z, boolean z2);

    private C7551b0() {
    }
}
