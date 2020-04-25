package com.google.android.gms.measurement.internal;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.gms.measurement.internal.n4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5337n4<V> extends FutureTask<V> implements Comparable<C5337n4> {

    /* renamed from: N */
    private final String f15335N;

    /* renamed from: O */
    private final /* synthetic */ C5326m4 f15336O;

    /* renamed from: a */
    private final long f15337a = C5326m4.f15299l.getAndIncrement();

    /* renamed from: b */
    final boolean f15338b;

    C5337n4(C5326m4 m4Var, Callable<V> callable, boolean z, String str) {
        this.f15336O = m4Var;
        super(callable);
        C4300a0.m18620a(str);
        this.f15335N = str;
        this.f15338b = z;
        if (this.f15337a == Long.MAX_VALUE) {
            m4Var.mo21205d().mo21533t().mo21549a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(@C0193h0 Object obj) {
        C5337n4 n4Var = (C5337n4) obj;
        boolean z = this.f15338b;
        if (z != n4Var.f15338b) {
            return z ? -1 : 1;
        }
        long j = this.f15337a;
        long j2 = n4Var.f15337a;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.f15336O.mo21205d().mo21534u().mo21550a("Two tasks share the same index. index", Long.valueOf(this.f15337a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f15336O.mo21205d().mo21533t().mo21550a(this.f15335N, th);
        if (th instanceof C5315l4) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    C5337n4(C5326m4 m4Var, Runnable runnable, boolean z, String str) {
        this.f15336O = m4Var;
        super(runnable, null);
        C4300a0.m18620a(str);
        this.f15335N = str;
        this.f15338b = false;
        if (this.f15337a == Long.MAX_VALUE) {
            m4Var.mo21205d().mo21533t().mo21549a("Tasks index overflow");
        }
    }
}
