package com.google.android.gms.tasks;

import androidx.annotation.C0193h0;
import java.util.ArrayDeque;
import java.util.Queue;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.android.gms.tasks.f0 */
final class C5550f0<TResult> {

    /* renamed from: a */
    private final Object f15856a = new Object();
    @C5966a("mLock")

    /* renamed from: b */
    private Queue<C5548e0<TResult>> f15857b;
    @C5966a("mLock")

    /* renamed from: c */
    private boolean f15858c;

    C5550f0() {
    }

    /* renamed from: a */
    public final void mo21982a(@C0193h0 C5548e0<TResult> e0Var) {
        synchronized (this.f15856a) {
            if (this.f15857b == null) {
                this.f15857b = new ArrayDeque();
            }
            this.f15857b.add(e0Var);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f15856a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (com.google.android.gms.tasks.C5548e0) r2.f15857b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f15858c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo21973a(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21983a(@androidx.annotation.C0193h0 com.google.android.gms.tasks.C5560k<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f15856a
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.e0<TResult>> r1 = r2.f15857b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f15858c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f15858c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f15856a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.tasks.e0<TResult>> r0 = r2.f15857b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.tasks.e0 r0 = (com.google.android.gms.tasks.C5548e0) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f15858c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo21973a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002f:
            throw r3
        L_0x0030:
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C5550f0.mo21983a(com.google.android.gms.tasks.k):void");
    }
}
