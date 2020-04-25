package com.google.android.gms.measurement.internal;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import com.google.android.gms.common.util.C4476d0;

@C4476d0
/* renamed from: com.google.android.gms.measurement.internal.d3 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
public final class C5226d3<V> {

    /* renamed from: h */
    private static final Object f14940h = new Object();

    /* renamed from: a */
    private final String f14941a;

    /* renamed from: b */
    private final C5466z2<V> f14942b;

    /* renamed from: c */
    private final V f14943c;

    /* renamed from: d */
    private final V f14944d;

    /* renamed from: e */
    private final Object f14945e;
    @C0221u("overrideLock")

    /* renamed from: f */
    private volatile V f14946f;
    @C0221u("cachingLock")

    /* renamed from: g */
    private volatile V f14947g;

    private C5226d3(@C0193h0 String str, @C0193h0 V v, @C0193h0 V v2, @C0195i0 C5466z2<V> z2Var) {
        this.f14945e = new Object();
        this.f14946f = null;
        this.f14947g = null;
        this.f14941a = str;
        this.f14943c = v;
        this.f14944d = v2;
        this.f14942b = z2Var;
    }

    /* renamed from: a */
    public final String mo21226a() {
        return this.f14941a;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 180 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0021, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r1.f14947g = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0057 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo21225a(@androidx.annotation.C0195i0 V r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f14945e
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            if (r6 == 0) goto L_0x0007
            return r6
        L_0x0007:
            com.google.android.gms.measurement.internal.n9 r6 = com.google.android.gms.measurement.internal.C5310l.f15227a
            if (r6 != 0) goto L_0x000e
            V r6 = r5.f14943c
            return r6
        L_0x000e:
            java.lang.Object r6 = f14940h
            monitor-enter(r6)
            boolean r0 = com.google.android.gms.measurement.internal.C5342n9.m23293a()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0022
            V r0 = r5.f14947g     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x001e
            V r0 = r5.f14943c     // Catch:{ all -> 0x008f }
            goto L_0x0020
        L_0x001e:
            V r0 = r5.f14947g     // Catch:{ all -> 0x008f }
        L_0x0020:
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            return r0
        L_0x0022:
            boolean r0 = com.google.android.gms.measurement.internal.C5342n9.m23293a()     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.measurement.internal.n9 r0 = com.google.android.gms.measurement.internal.C5310l.f15227a     // Catch:{ all -> 0x008f }
            java.util.List r0 = com.google.android.gms.measurement.internal.C5310l.f15229b     // Catch:{ SecurityException -> 0x0066 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ SecurityException -> 0x0066 }
        L_0x0032:
            boolean r1 = r0.hasNext()     // Catch:{ SecurityException -> 0x0066 }
            if (r1 == 0) goto L_0x006a
            java.lang.Object r1 = r0.next()     // Catch:{ SecurityException -> 0x0066 }
            com.google.android.gms.measurement.internal.d3 r1 = (com.google.android.gms.measurement.internal.C5226d3) r1     // Catch:{ SecurityException -> 0x0066 }
            java.lang.Object r2 = f14940h     // Catch:{ SecurityException -> 0x0066 }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x0066 }
            boolean r3 = com.google.android.gms.measurement.internal.C5342n9.m23293a()     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x005b
            r3 = 0
            com.google.android.gms.measurement.internal.z2<V> r4 = r1.f14942b     // Catch:{ IllegalStateException -> 0x0057 }
            if (r4 == 0) goto L_0x0053
            com.google.android.gms.measurement.internal.z2<V> r4 = r1.f14942b     // Catch:{ IllegalStateException -> 0x0057 }
            java.lang.Object r4 = r4.mo21140a()     // Catch:{ IllegalStateException -> 0x0057 }
            goto L_0x0054
        L_0x0053:
            r4 = r3
        L_0x0054:
            r1.f14947g = r4     // Catch:{ IllegalStateException -> 0x0057 }
            goto L_0x0059
        L_0x0057:
            r1.f14947g = r3     // Catch:{ all -> 0x0063 }
        L_0x0059:
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0032
        L_0x005b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "Refreshing flag cache must be done on a worker thread."
            r0.<init>(r1)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ SecurityException -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            com.google.android.gms.measurement.internal.C5310l.m23130a(r0)     // Catch:{ all -> 0x008f }
        L_0x006a:
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            com.google.android.gms.measurement.internal.z2<V> r6 = r5.f14942b
            if (r6 != 0) goto L_0x0074
            com.google.android.gms.measurement.internal.n9 r6 = com.google.android.gms.measurement.internal.C5310l.f15227a
            V r6 = r5.f14943c
            return r6
        L_0x0074:
            java.lang.Object r6 = r6.mo21140a()     // Catch:{ SecurityException -> 0x007e, IllegalStateException -> 0x0079 }
            return r6
        L_0x0079:
            com.google.android.gms.measurement.internal.n9 r6 = com.google.android.gms.measurement.internal.C5310l.f15227a
            V r6 = r5.f14943c
            return r6
        L_0x007e:
            r6 = move-exception
            com.google.android.gms.measurement.internal.C5310l.m23130a(r6)
            com.google.android.gms.measurement.internal.n9 r6 = com.google.android.gms.measurement.internal.C5310l.f15227a
            V r6 = r5.f14943c
            return r6
        L_0x0087:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "Tried to refresh flag cache on main thread or on package side."
            r0.<init>(r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008f }
            throw r0
        L_0x0092:
            monitor-exit(r0)     // Catch:{ all -> 0x0094 }
            throw r6
        L_0x0094:
            r6 = move-exception
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5226d3.mo21225a(java.lang.Object):java.lang.Object");
    }
}
