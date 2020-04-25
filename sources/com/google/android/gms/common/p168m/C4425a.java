package com.google.android.gms.common.p168m;

import android.content.Context;
import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.util.C4476d0;
import java.util.HashSet;
import p201f.p202a.p203u.C5966a;

@C4056a
/* renamed from: com.google.android.gms.common.m.a */
public abstract class C4425a<T> {

    /* renamed from: d */
    private static final Object f13590d = new Object();

    /* renamed from: e */
    private static C4426a f13591e;

    /* renamed from: f */
    private static int f13592f;

    /* renamed from: g */
    private static Context f13593g;
    @C5966a("sLock")

    /* renamed from: h */
    private static HashSet<String> f13594h;

    /* renamed from: a */
    protected final String f13595a;

    /* renamed from: b */
    protected final T f13596b;

    /* renamed from: c */
    private T f13597c = null;

    /* renamed from: com.google.android.gms.common.m.a$a */
    private interface C4426a {
        /* renamed from: a */
        Boolean mo18424a(String str, Boolean bool);

        /* renamed from: a */
        Float mo18425a(String str, Float f);

        /* renamed from: a */
        Integer mo18426a(String str, Integer num);

        /* renamed from: a */
        Long mo18427a(String str, Long l);

        /* renamed from: a */
        String mo18428a(String str, String str2);
    }

    protected C4425a(String str, T t) {
        this.f13595a = str;
        this.f13596b = t;
    }

    @C4056a
    /* renamed from: d */
    public static boolean m19069d() {
        synchronized (f13590d) {
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m19070e() {
        synchronized (f13590d) {
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo18420a(String str);

    @C4056a
    @C4476d0
    /* renamed from: a */
    public void mo18421a(T t) {
        this.f13597c = t;
        synchronized (f13590d) {
            m19070e();
        }
    }

    @C4056a
    @Deprecated
    /* renamed from: b */
    public final T mo18422b() {
        return mo18419a();
    }

    @C4056a
    @C4476d0
    /* renamed from: c */
    public void mo18423c() {
        this.f13597c = null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:18|19|20|21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = android.os.Binder.clearCallingIdentity();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3 = mo18420a(r4.f13595a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0032, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0033, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        android.os.Binder.restoreCallingIdentity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0037, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0038, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003b, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0022 */
    @com.google.android.gms.common.annotation.C4056a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo18419a() {
        /*
            r4 = this;
            T r0 = r4.f13597c
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            java.lang.Object r1 = f13590d
            monitor-enter(r1)
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            java.lang.Object r2 = f13590d
            monitor-enter(r2)
            r1 = 0
            f13594h = r1     // Catch:{ all -> 0x003c }
            f13593g = r1     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            java.lang.String r1 = r4.f13595a     // Catch:{ SecurityException -> 0x0022 }
            java.lang.Object r1 = r4.mo18420a(r1)     // Catch:{ SecurityException -> 0x0022 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L_0x0020:
            r1 = move-exception
            goto L_0x0038
        L_0x0022:
            long r1 = android.os.Binder.clearCallingIdentity()     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = r4.f13595a     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r4.mo18420a(r3)     // Catch:{ all -> 0x0033 }
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0020 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r3
        L_0x0033:
            r3 = move-exception
            android.os.Binder.restoreCallingIdentity(r1)     // Catch:{ all -> 0x0020 }
            throw r3     // Catch:{ all -> 0x0020 }
        L_0x0038:
            android.os.StrictMode.setThreadPolicy(r0)
            throw r1
        L_0x003c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r0
        L_0x003f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.p168m.C4425a.mo18419a():java.lang.Object");
    }

    @C4056a
    /* renamed from: a */
    public static C4425a<Boolean> m19068a(String str, boolean z) {
        return new C4427b(str, Boolean.valueOf(z));
    }

    @C4056a
    /* renamed from: a */
    public static C4425a<Long> m19066a(String str, Long l) {
        return new C4428c(str, l);
    }

    @C4056a
    /* renamed from: a */
    public static C4425a<Integer> m19065a(String str, Integer num) {
        return new C4429d(str, num);
    }

    @C4056a
    /* renamed from: a */
    public static C4425a<Float> m19064a(String str, Float f) {
        return new C4430e(str, f);
    }

    @C4056a
    /* renamed from: a */
    public static C4425a<String> m19067a(String str, String str2) {
        return new C4431f(str, str2);
    }
}
