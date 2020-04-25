package com.google.android.gms.measurement.internal;

import androidx.annotation.C0226w0;
import com.google.android.gms.common.internal.C4300a0;
import java.net.URL;
import java.util.Map;

@C0226w0
/* renamed from: com.google.android.gms.measurement.internal.s3 */
/* compiled from: com.google.android.gms:play-services-measurement@@17.1.0 */
final class C5391s3 implements Runnable {

    /* renamed from: N */
    private final C5369q3 f15446N;

    /* renamed from: O */
    private final String f15447O;

    /* renamed from: P */
    private final Map<String, String> f15448P;

    /* renamed from: Q */
    private final /* synthetic */ C5347o3 f15449Q;

    /* renamed from: a */
    private final URL f15450a;

    /* renamed from: b */
    private final byte[] f15451b;

    public C5391s3(C5347o3 o3Var, String str, URL url, byte[] bArr, Map<String, String> map, C5369q3 q3Var) {
        this.f15449Q = o3Var;
        C4300a0.m18630b(str);
        C4300a0.m18620a(url);
        C4300a0.m18620a(q3Var);
        this.f15450a = url;
        this.f15451b = bArr;
        this.f15446N = q3Var;
        this.f15447O = str;
        this.f15448P = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0101 A[SYNTHETIC, Splitter:B:57:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.o3 r1 = r13.f15449Q
            r1.mo21207f()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.o3 r3 = r13.f15449Q     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.URL r4 = r13.f15450a     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.net.HttpURLConnection r3 = r3.mo21575a(r4)     // Catch:{ IOException -> 0x00fa, all -> 0x00c0 }
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f15448P     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x003b
            java.util.Map<java.lang.String, java.lang.String> r4 = r13.f15448P     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
        L_0x001f:
            boolean r5 = r4.hasNext()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r4.next()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r6 = r5.getKey()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Object r5 = r5.getValue()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.addRequestProperty(r6, r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            goto L_0x001f
        L_0x003b:
            byte[] r4 = r13.f15451b     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            if (r4 == 0) goto L_0x0086
            com.google.android.gms.measurement.internal.o3 r4 = r13.f15449Q     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.c9 r4 = r4.mo21216o()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r5 = r13.f15451b     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            byte[] r4 = r4.mo21204c(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.o3 r5 = r13.f15449Q     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.k3 r5 = r5.mo21205d()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            com.google.android.gms.measurement.internal.m3 r5 = r5.mo21528C()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r6 = "Uploading data. size"
            int r7 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.mo21550a(r6, r7)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5 = 1
            r3.setDoOutput(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r5, r6)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            int r5 = r4.length     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.setFixedLengthStreamingMode(r5)     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r3.connect()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            r5.write(r4)     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            r5.close()     // Catch:{ IOException -> 0x0080, all -> 0x007c }
            goto L_0x0086
        L_0x007c:
            r4 = move-exception
            r11 = r1
            r1 = r5
            goto L_0x00c3
        L_0x0080:
            r4 = move-exception
            r11 = r1
            r9 = r4
            r1 = r5
            goto L_0x00fe
        L_0x0086:
            int r8 = r3.getResponseCode()     // Catch:{ IOException -> 0x00bd, all -> 0x00ba }
            java.util.Map r11 = r3.getHeaderFields()     // Catch:{ IOException -> 0x00b6, all -> 0x00b3 }
            com.google.android.gms.measurement.internal.o3 r2 = r13.f15449Q     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            byte[] r10 = com.google.android.gms.measurement.internal.C5347o3.m23299a(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00af }
            if (r3 == 0) goto L_0x0099
            r3.disconnect()
        L_0x0099:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f15449Q
            com.google.android.gms.measurement.internal.m4 r0 = r0.mo21203c()
            com.google.android.gms.measurement.internal.t3 r1 = new com.google.android.gms.measurement.internal.t3
            java.lang.String r6 = r13.f15447O
            com.google.android.gms.measurement.internal.q3 r7 = r13.f15446N
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo21555a(r1)
            return
        L_0x00af:
            r4 = move-exception
            goto L_0x00c4
        L_0x00b1:
            r4 = move-exception
            goto L_0x00b8
        L_0x00b3:
            r4 = move-exception
            r11 = r1
            goto L_0x00c4
        L_0x00b6:
            r4 = move-exception
            r11 = r1
        L_0x00b8:
            r9 = r4
            goto L_0x00ff
        L_0x00ba:
            r4 = move-exception
            r11 = r1
            goto L_0x00c3
        L_0x00bd:
            r4 = move-exception
            r11 = r1
            goto L_0x00fd
        L_0x00c0:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            if (r1 == 0) goto L_0x00de
            r1.close()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00de
        L_0x00ca:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f15449Q
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()
            java.lang.String r5 = r13.f15447O
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r5)
            r2.mo21551a(r0, r5, r1)
        L_0x00de:
            if (r3 == 0) goto L_0x00e3
            r3.disconnect()
        L_0x00e3:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f15449Q
            com.google.android.gms.measurement.internal.m4 r0 = r0.mo21203c()
            com.google.android.gms.measurement.internal.t3 r1 = new com.google.android.gms.measurement.internal.t3
            java.lang.String r6 = r13.f15447O
            com.google.android.gms.measurement.internal.q3 r7 = r13.f15446N
            r9 = 0
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo21555a(r1)
            throw r4
        L_0x00fa:
            r4 = move-exception
            r3 = r1
            r11 = r3
        L_0x00fd:
            r9 = r4
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r1 == 0) goto L_0x0119
            r1.close()     // Catch:{ IOException -> 0x0105 }
            goto L_0x0119
        L_0x0105:
            r1 = move-exception
            com.google.android.gms.measurement.internal.o3 r2 = r13.f15449Q
            com.google.android.gms.measurement.internal.k3 r2 = r2.mo21205d()
            com.google.android.gms.measurement.internal.m3 r2 = r2.mo21533t()
            java.lang.String r4 = r13.f15447O
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C5303k3.m23051a(r4)
            r2.mo21551a(r0, r4, r1)
        L_0x0119:
            if (r3 == 0) goto L_0x011e
            r3.disconnect()
        L_0x011e:
            com.google.android.gms.measurement.internal.o3 r0 = r13.f15449Q
            com.google.android.gms.measurement.internal.m4 r0 = r0.mo21203c()
            com.google.android.gms.measurement.internal.t3 r1 = new com.google.android.gms.measurement.internal.t3
            java.lang.String r6 = r13.f15447O
            com.google.android.gms.measurement.internal.q3 r7 = r13.f15446N
            r10 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.mo21555a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C5391s3.run():void");
    }
}
