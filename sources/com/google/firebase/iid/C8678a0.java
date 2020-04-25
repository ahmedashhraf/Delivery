package com.google.firebase.iid;

import android.text.TextUtils;
import androidx.annotation.C0195i0;
import androidx.annotation.C0221u;
import androidx.annotation.C0226w0;
import androidx.collection.C0635a;
import com.google.android.gms.tasks.C5560k;
import com.google.android.gms.tasks.C5562l;
import java.io.IOException;
import java.util.Map;
import p053b.p063d.p064b.C2108a;

/* renamed from: com.google.firebase.iid.a0 */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
final class C8678a0 {
    @C0221u("this")

    /* renamed from: a */
    private int f22786a = 0;
    @C0221u("this")

    /* renamed from: b */
    private final Map<Integer, C5562l<Void>> f22787b = new C0635a();
    @C0221u("itself")

    /* renamed from: c */
    private final C8727w f22788c;

    C8678a0(C8727w wVar) {
        this.f22788c = wVar;
    }

    @C0195i0
    @C0221u("this")
    /* renamed from: b */
    private final String m40798b() {
        String a;
        synchronized (this.f22788c) {
            a = this.f22788c.mo32163a();
        }
        if (!TextUtils.isEmpty(a)) {
            String[] split = a.split(",");
            if (split.length > 1 && !TextUtils.isEmpty(split[1])) {
                return split[1];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized C5560k<Void> mo32090a(String str) {
        String a;
        C5562l lVar;
        int i;
        synchronized (this.f22788c) {
            a = this.f22788c.mo32163a();
            C8727w wVar = this.f22788c;
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + String.valueOf(str).length());
            sb.append(a);
            sb.append(",");
            sb.append(str);
            wVar.mo32164a(sb.toString());
        }
        lVar = new C5562l();
        Map<Integer, C5562l<Void>> map = this.f22787b;
        if (TextUtils.isEmpty(a)) {
            i = 0;
        } else {
            i = a.split(",").length - 1;
        }
        map.put(Integer.valueOf(this.f22786a + i), lVar);
        return lVar.mo22017a();
    }

    /* renamed from: b */
    private final synchronized boolean m40799b(String str) {
        synchronized (this.f22788c) {
            String a = this.f22788c.mo32163a();
            String str2 = ",";
            String valueOf = String.valueOf(str);
            if (!a.startsWith(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))) {
                return false;
            }
            String str3 = ",";
            String valueOf2 = String.valueOf(str);
            this.f22788c.mo32164a(a.substring((valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3)).length()));
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized boolean mo32091a() {
        return m40798b() != null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r2 = (com.google.android.gms.tasks.C5562l) r4.f22787b.remove(java.lang.Integer.valueOf(r4.f22786a));
        m40799b(r0);
        r4.f22786a++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r2 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r2.mo22019a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (m40797a(r5, r0) != false) goto L_0x0017;
     */
    @androidx.annotation.C0226w0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32092a(com.google.firebase.iid.FirebaseInstanceId r5) throws java.io.IOException {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            java.lang.String r0 = r4.m40798b()     // Catch:{ all -> 0x0039 }
            r1 = 1
            if (r0 != 0) goto L_0x000e
            boolean r5 = com.google.firebase.iid.FirebaseInstanceId.m40759o()     // Catch:{ all -> 0x0039 }
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x000e:
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            boolean r2 = m40797a(r5, r0)
            if (r2 != 0) goto L_0x0017
            r5 = 0
            return r5
        L_0x0017:
            monitor-enter(r4)
            java.util.Map<java.lang.Integer, com.google.android.gms.tasks.l<java.lang.Void>> r2 = r4.f22787b     // Catch:{ all -> 0x0036 }
            int r3 = r4.f22786a     // Catch:{ all -> 0x0036 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r2.remove(r3)     // Catch:{ all -> 0x0036 }
            com.google.android.gms.tasks.l r2 = (com.google.android.gms.tasks.C5562l) r2     // Catch:{ all -> 0x0036 }
            r4.m40799b(r0)     // Catch:{ all -> 0x0036 }
            int r0 = r4.f22786a     // Catch:{ all -> 0x0036 }
            int r0 = r0 + r1
            r4.f22786a = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0000
            r0 = 0
            r2.mo22019a(r0)
            goto L_0x0000
        L_0x0036:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r5
        L_0x0039:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x003c:
            throw r5
        L_0x003d:
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C8678a0.mo32092a(com.google.firebase.iid.FirebaseInstanceId):boolean");
    }

    @C0226w0
    /* renamed from: a */
    private static boolean m40797a(FirebaseInstanceId firebaseInstanceId, String str) throws IOException {
        String[] split = str.split("!");
        if (split.length == 2) {
            String str2 = split[0];
            String str3 = split[1];
            char c = 65535;
            try {
                int hashCode = str2.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85) {
                        if (str2.equals("U")) {
                            c = 1;
                        }
                    }
                } else if (str2.equals(C2108a.f8087L4)) {
                    c = 0;
                }
                if (c == 0) {
                    firebaseInstanceId.mo32069b(str3);
                    boolean o = FirebaseInstanceId.m40759o();
                } else if (c == 1) {
                    firebaseInstanceId.mo32072c(str3);
                    boolean o2 = FirebaseInstanceId.m40759o();
                }
            } catch (IOException e) {
                if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                    if (!"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                        if (e.getMessage() == null) {
                            return false;
                        }
                        throw e;
                    }
                }
                String message = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 53);
                sb.append("Topic operation failed: ");
                sb.append(message);
                sb.append(". Will retry Topic operation.");
                sb.toString();
                return false;
            }
        }
        return true;
    }
}
