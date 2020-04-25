package kotlin.p508io;

import java.io.Closeable;
import kotlin.C6050b0;
import kotlin.C6096e0;
import kotlin.p214b1.C6055e;
import p205i.p209c.p210a.C6004e;

@C6055e(name = "CloseableKt")
/* renamed from: kotlin.io.b */
/* compiled from: Closeable.kt */
public final class C14693b {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        kotlin.p214b1.p216u.C14427e0.m62417b(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (kotlin.p213a1.C14402l.m62371a(1, 1, 0) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        m63699a((java.io.Closeable) r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        kotlin.p214b1.p216u.C14427e0.m62414a(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        throw r2;
     */
    @kotlin.p213a1.C6041f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T extends java.io.Closeable, R> R m63698a(T r3, kotlin.p214b1.p215t.C6080l<? super T, ? extends R> r4) {
        /*
            r0 = 0
            r1 = 1
            java.lang.Object r4 = r4.invoke(r3)     // Catch:{ all -> 0x001e }
            kotlin.p214b1.p216u.C14427e0.m62417b(r1)
            boolean r0 = kotlin.p213a1.C14402l.m62371a(r1, r1, r0)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            m63699a(r3, r0)
            goto L_0x001a
        L_0x0014:
            if (r3 != 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r3.close()
        L_0x001a:
            kotlin.p214b1.p216u.C14427e0.m62414a(r1)
            return r4
        L_0x001e:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2 = move-exception
            kotlin.p214b1.p216u.C14427e0.m62417b(r1)
            boolean r0 = kotlin.p213a1.C14402l.m62371a(r1, r1, r0)
            if (r0 != 0) goto L_0x0030
            if (r3 == 0) goto L_0x0033
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0033
        L_0x0030:
            m63699a(r3, r4)
        L_0x0033:
            kotlin.p214b1.p216u.C14427e0.m62414a(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p508io.C14693b.m63698a(java.io.Closeable, kotlin.b1.t.l):java.lang.Object");
    }

    @C6096e0(version = "1.1")
    @C6050b0
    /* renamed from: a */
    public static final void m63699a(@C6004e Closeable closeable, @C6004e Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C14535f.m63009a(th, th2);
            }
        }
    }
}
