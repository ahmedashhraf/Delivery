package com.google.common.util.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p076c.p112d.p148d.p149a.C2775a;
import p201f.p202a.C5952h;

@C2775a
/* renamed from: com.google.common.util.concurrent.e */
/* compiled from: AbstractListeningExecutorService */
public abstract class C8481e implements C8511g0 {
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        if (collection != null) {
            ArrayList<Future> arrayList = new ArrayList<>(collection.size());
            try {
                for (Callable a : collection) {
                    C8480d0 a2 = C8480d0.m40126a(a);
                    arrayList.add(a2);
                    execute(a2);
                }
                for (Future future : arrayList) {
                    if (!future.isDone()) {
                        try {
                            future.get();
                        } catch (CancellationException | ExecutionException unused) {
                        }
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                for (Future cancel : arrayList) {
                    cancel.cancel(true);
                }
                throw th;
            }
        } else {
            throw new NullPointerException();
        }
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        try {
            return C8520j0.m40266a(this, collection, false, 0);
        } catch (TimeoutException unused) {
            throw new AssertionError();
        }
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return C8520j0.m40266a(this, collection, true, timeUnit.toNanos(j));
    }

    public C8473c0<?> submit(Runnable runnable) {
        C8480d0 a = C8480d0.m40125a(runnable, null);
        execute(a);
        return a;
    }

    public <T> C8473c0<T> submit(Runnable runnable, @C5952h T t) {
        C8480d0 a = C8480d0.m40125a(runnable, t);
        execute(a);
        return a;
    }

    public <T> C8473c0<T> submit(Callable<T> callable) {
        C8480d0 a = C8480d0.m40126a(callable);
        execute(a);
        return a;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> r9, long r10, java.util.concurrent.TimeUnit r12) throws java.lang.InterruptedException {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00cf
            if (r12 == 0) goto L_0x00cf
            long r10 = r12.toNanos(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r9.size()
            r12.<init>(r0)
            r0 = 1
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0016:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ all -> 0x00b9 }
            com.google.common.util.concurrent.d0 r1 = com.google.common.util.concurrent.C8480d0.m40126a(r1)     // Catch:{ all -> 0x00b9 }
            r12.add(r1)     // Catch:{ all -> 0x00b9 }
            goto L_0x0016
        L_0x002a:
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b9 }
            java.util.Iterator r9 = r12.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0032:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00b9 }
            r4 = 0
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00b9 }
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x00b9 }
            r8.execute(r3)     // Catch:{ all -> 0x00b9 }
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b9 }
            long r1 = r6 - r1
            long r10 = r10 - r1
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0063
            java.util.Iterator r9 = r12.iterator()
        L_0x0052:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r9.next()
            java.util.concurrent.Future r10 = (java.util.concurrent.Future) r10
            r10.cancel(r0)
            goto L_0x0052
        L_0x0062:
            return r12
        L_0x0063:
            r1 = r6
            goto L_0x0032
        L_0x0065:
            java.util.Iterator r9 = r12.iterator()     // Catch:{ all -> 0x00b9 }
        L_0x0069:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x00b9 }
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x00b9 }
            java.util.concurrent.Future r3 = (java.util.concurrent.Future) r3     // Catch:{ all -> 0x00b9 }
            boolean r6 = r3.isDone()     // Catch:{ all -> 0x00b9 }
            if (r6 != 0) goto L_0x0069
            int r6 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0094
            java.util.Iterator r9 = r12.iterator()
        L_0x0083:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0093
            java.lang.Object r10 = r9.next()
            java.util.concurrent.Future r10 = (java.util.concurrent.Future) r10
            r10.cancel(r0)
            goto L_0x0083
        L_0x0093:
            return r12
        L_0x0094:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ CancellationException | ExecutionException -> 0x00af, TimeoutException -> 0x009a }
            r3.get(r10, r6)     // Catch:{ CancellationException | ExecutionException -> 0x00af, TimeoutException -> 0x009a }
            goto L_0x00af
        L_0x009a:
            java.util.Iterator r9 = r12.iterator()
        L_0x009e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00ae
            java.lang.Object r10 = r9.next()
            java.util.concurrent.Future r10 = (java.util.concurrent.Future) r10
            r10.cancel(r0)
            goto L_0x009e
        L_0x00ae:
            return r12
        L_0x00af:
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00b9 }
            long r1 = r6 - r1
            long r10 = r10 - r1
            r1 = r6
            goto L_0x0069
        L_0x00b8:
            return r12
        L_0x00b9:
            r9 = move-exception
            java.util.Iterator r10 = r12.iterator()
        L_0x00be:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00ce
            java.lang.Object r11 = r10.next()
            java.util.concurrent.Future r11 = (java.util.concurrent.Future) r11
            r11.cancel(r0)
            goto L_0x00be
        L_0x00ce:
            throw r9
        L_0x00cf:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            r9.<init>()
            goto L_0x00d6
        L_0x00d5:
            throw r9
        L_0x00d6:
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C8481e.invokeAll(java.util.Collection, long, java.util.concurrent.TimeUnit):java.util.List");
    }
}
