package com.google.firebase.iid;

import android.util.Pair;
import androidx.collection.C0635a;
import com.google.android.gms.tasks.C5560k;
import java.util.Map;
import java.util.concurrent.Executor;
import p201f.p202a.p203u.C5966a;

/* renamed from: com.google.firebase.iid.q */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8715q {

    /* renamed from: a */
    private final Executor f22853a;
    @C5966a("this")

    /* renamed from: b */
    private final Map<Pair<String, String>, C5560k<C8677a>> f22854b = new C0635a();

    C8715q(Executor executor) {
        this.f22853a = executor;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.tasks.C5560k<com.google.firebase.iid.C8677a> mo32144a(java.lang.String r3, java.lang.String r4, com.google.firebase.iid.C8719s r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0075 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.k<com.google.firebase.iid.a>> r3 = r2.f22854b     // Catch:{ all -> 0x0075 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.tasks.k r3 = (com.google.android.gms.tasks.C5560k) r3     // Catch:{ all -> 0x0075 }
            r4 = 3
            if (r3 == 0) goto L_0x0039
            java.lang.String r5 = "FirebaseInstanceId"
            boolean r4 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x0075 }
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0075 }
            int r5 = r5.length()     // Catch:{ all -> 0x0075 }
            int r5 = r5 + 29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r0.<init>(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "Joining ongoing request for: "
            r0.append(r5)     // Catch:{ all -> 0x0075 }
            r0.append(r4)     // Catch:{ all -> 0x0075 }
            r0.toString()     // Catch:{ all -> 0x0075 }
        L_0x0037:
            monitor-exit(r2)
            return r3
        L_0x0039:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x005f
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0075 }
            int r4 = r4.length()     // Catch:{ all -> 0x0075 }
            int r4 = r4 + 24
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>(r4)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "Making new request for: "
            r1.append(r4)     // Catch:{ all -> 0x0075 }
            r1.append(r3)     // Catch:{ all -> 0x0075 }
            r1.toString()     // Catch:{ all -> 0x0075 }
        L_0x005f:
            com.google.android.gms.tasks.k r3 = r5.mo32142a()     // Catch:{ all -> 0x0075 }
            java.util.concurrent.Executor r4 = r2.f22853a     // Catch:{ all -> 0x0075 }
            com.google.firebase.iid.p r5 = new com.google.firebase.iid.p     // Catch:{ all -> 0x0075 }
            r5.<init>(r2, r0)     // Catch:{ all -> 0x0075 }
            com.google.android.gms.tasks.k r3 = r3.mo22007b(r4, r5)     // Catch:{ all -> 0x0075 }
            java.util.Map<android.util.Pair<java.lang.String, java.lang.String>, com.google.android.gms.tasks.k<com.google.firebase.iid.a>> r4 = r2.f22854b     // Catch:{ all -> 0x0075 }
            r4.put(r0, r3)     // Catch:{ all -> 0x0075 }
            monitor-exit(r2)
            return r3
        L_0x0075:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8715q.mo32144a(java.lang.String, java.lang.String, com.google.firebase.iid.s):com.google.android.gms.tasks.k");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C5560k mo32143a(Pair pair, C5560k kVar) throws Exception {
        synchronized (this) {
            this.f22854b.remove(pair);
        }
        return kVar;
    }
}
