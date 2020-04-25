package com.google.android.gms.measurement.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import java.net.URL;
import java.util.List;
import java.util.Map;

@C0226w0
/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C5449x6 implements Runnable {

    /* renamed from: N */
    private final C5459y6 f15602N;

    /* renamed from: O */
    private final String f15603O;

    /* renamed from: P */
    private final Map<String, String> f15604P;

    /* renamed from: Q */
    private final /* synthetic */ C5427v6 f15605Q;

    /* renamed from: a */
    private final URL f15606a;

    /* renamed from: b */
    private final byte[] f15607b = null;

    public C5449x6(C5427v6 v6Var, String str, URL url, byte[] bArr, Map<String, String> map, C5459y6 y6Var) {
        this.f15605Q = v6Var;
        C4300a0.m18630b(str);
        C4300a0.m18620a(url);
        C4300a0.m18620a(y6Var);
        this.f15606a = url;
        this.f15602N = y6Var;
        this.f15603O = str;
        this.f15604P = null;
    }

    /* renamed from: b */
    private final void m23750b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        C5326m4 c = this.f15605Q.mo21203c();
        C5197a7 a7Var = new C5197a7(this, i, exc, bArr, map);
        c.mo21555a((Runnable) a7Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21821a(int i, Exception exc, byte[] bArr, Map map) {
        this.f15602N.mo21664a(this.f15603O, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            com.google.android.gms.measurement.internal.v6 r0 = r7.f15605Q
            r0.mo21207f()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.v6 r2 = r7.f15605Q     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.net.URL r3 = r7.f15606a     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.net.HttpURLConnection r2 = r2.mo21735a(r3)     // Catch:{ IOException -> 0x0077, all -> 0x006a }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f15604P     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r3 == 0) goto L_0x0039
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.f15604P     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
        L_0x001d:
            boolean r4 = r3.hasNext()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            if (r4 == 0) goto L_0x0039
            java.lang.Object r4 = r3.next()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            r2.addRequestProperty(r5, r4)     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            goto L_0x001d
        L_0x0039:
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0067, all -> 0x0064 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0060, all -> 0x005c }
            com.google.android.gms.measurement.internal.v6 r4 = r7.f15605Q     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            byte[] r4 = com.google.android.gms.measurement.internal.C5427v6.m23594a(r2)     // Catch:{ IOException -> 0x0056, all -> 0x0050 }
            if (r2 == 0) goto L_0x004c
            r2.disconnect()
        L_0x004c:
            r7.m23750b(r1, r0, r4, r3)
            return
        L_0x0050:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x006e
        L_0x0056:
            r4 = move-exception
            r6 = r4
            r4 = r1
            r1 = r3
            r3 = r6
            goto L_0x007b
        L_0x005c:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x006e
        L_0x0060:
            r3 = move-exception
            r4 = r1
            r1 = r0
            goto L_0x007b
        L_0x0064:
            r3 = move-exception
            r1 = r0
            goto L_0x006d
        L_0x0067:
            r3 = move-exception
            r1 = r0
            goto L_0x007a
        L_0x006a:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r2 == 0) goto L_0x0073
            r2.disconnect()
        L_0x0073:
            r7.m23750b(r4, r0, r0, r1)
            throw r3
        L_0x0077:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L_0x007a:
            r4 = 0
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.disconnect()
        L_0x0080:
            r7.m23750b(r4, r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5449x6.run():void");
    }
}
