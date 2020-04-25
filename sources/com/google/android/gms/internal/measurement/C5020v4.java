package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.v4 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@17.1.0 */
public class C5020v4 {

    /* renamed from: d */
    private static final C5005u3 f14460d = C5005u3.m21602a();

    /* renamed from: a */
    private C5070z2 f14461a;

    /* renamed from: b */
    private volatile C4945r5 f14462b;

    /* renamed from: c */
    private volatile C5070z2 f14463c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.measurement.C4945r5 m21643b(com.google.android.gms.internal.measurement.C4945r5 r2) {
        /*
            r1 = this;
            com.google.android.gms.internal.measurement.r5 r0 = r1.f14462b
            if (r0 != 0) goto L_0x001d
            monitor-enter(r1)
            com.google.android.gms.internal.measurement.r5 r0 = r1.f14462b     // Catch:{ all -> 0x001a }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x000b:
            r1.f14462b = r2     // Catch:{ zzfn -> 0x0012 }
            com.google.android.gms.internal.measurement.z2 r0 = com.google.android.gms.internal.measurement.C5070z2.f14557b     // Catch:{ zzfn -> 0x0012 }
            r1.f14463c = r0     // Catch:{ zzfn -> 0x0012 }
            goto L_0x0018
        L_0x0012:
            r1.f14462b = r2     // Catch:{ all -> 0x001a }
            com.google.android.gms.internal.measurement.z2 r2 = com.google.android.gms.internal.measurement.C5070z2.f14557b     // Catch:{ all -> 0x001a }
            r1.f14463c = r2     // Catch:{ all -> 0x001a }
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            goto L_0x001d
        L_0x001a:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r2
        L_0x001d:
            com.google.android.gms.internal.measurement.r5 r2 = r1.f14462b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C5020v4.m21643b(com.google.android.gms.internal.measurement.r5):com.google.android.gms.internal.measurement.r5");
    }

    /* renamed from: a */
    public final C4945r5 mo19721a(C4945r5 r5Var) {
        C4945r5 r5Var2 = this.f14462b;
        this.f14461a = null;
        this.f14463c = null;
        this.f14462b = r5Var;
        return r5Var2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5020v4)) {
            return false;
        }
        C5020v4 v4Var = (C5020v4) obj;
        C4945r5 r5Var = this.f14462b;
        C4945r5 r5Var2 = v4Var.f14462b;
        if (r5Var == null && r5Var2 == null) {
            return mo19722b().equals(v4Var.mo19722b());
        }
        if (r5Var != null && r5Var2 != null) {
            return r5Var.equals(r5Var2);
        }
        if (r5Var != null) {
            return r5Var.equals(v4Var.m21643b(r5Var.mo19053j()));
        }
        return m21643b(r5Var2.mo19053j()).equals(r5Var2);
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: a */
    public final int mo19720a() {
        if (this.f14463c != null) {
            return this.f14463c.mo18883a();
        }
        if (this.f14462b != null) {
            return this.f14462b.mo19045b();
        }
        return 0;
    }

    /* renamed from: b */
    public final C5070z2 mo19722b() {
        if (this.f14463c != null) {
            return this.f14463c;
        }
        synchronized (this) {
            if (this.f14463c != null) {
                C5070z2 z2Var = this.f14463c;
                return z2Var;
            }
            if (this.f14462b == null) {
                this.f14463c = C5070z2.f14557b;
            } else {
                this.f14463c = this.f14462b.mo19358e();
            }
            C5070z2 z2Var2 = this.f14463c;
            return z2Var2;
        }
    }
}
