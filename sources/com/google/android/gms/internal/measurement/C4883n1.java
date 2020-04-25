package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: com.google.android.gms.internal.measurement.n1 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4883n1 {
    C4883n1() {
    }

    /* renamed from: a */
    static C4829k1 m20744a(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return C4829k1.m20469a();
        }
        if (C4679a1.m19900a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        C4694b2 b = m20746b(context);
        if (b.mo18861a()) {
            return m20745a((File) b.mo18862d());
        }
        return C4829k1.m20469a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = com.google.android.gms.internal.measurement.C4694b2.m19950e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        android.os.StrictMode.setThreadPolicy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0028 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.C4694b2<java.io.File> m20746b(android.content.Context r4) {
        /*
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0030 }
            java.io.File r1 = new java.io.File     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r2 = "phenotype_hermetic"
            r3 = 0
            java.io.File r4 = r4.getDir(r2, r3)     // Catch:{ RuntimeException -> 0x0028 }
            java.lang.String r2 = "overrides.txt"
            r1.<init>(r4, r2)     // Catch:{ RuntimeException -> 0x0028 }
            boolean r4 = r1.exists()     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0020
            com.google.android.gms.internal.measurement.b2 r4 = com.google.android.gms.internal.measurement.C4694b2.m19949a(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x0024
        L_0x0020:
            com.google.android.gms.internal.measurement.b2 r4 = com.google.android.gms.internal.measurement.C4694b2.m19950e()     // Catch:{ all -> 0x0030 }
        L_0x0024:
            android.os.StrictMode.setThreadPolicy(r0)
            return r4
        L_0x0028:
            com.google.android.gms.internal.measurement.b2 r4 = com.google.android.gms.internal.measurement.C4694b2.m19950e()     // Catch:{ all -> 0x0030 }
            android.os.StrictMode.setThreadPolicy(r0)
            return r4
        L_0x0030:
            r4 = move-exception
            android.os.StrictMode.setThreadPolicy(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4883n1.m20746b(android.content.Context):com.google.android.gms.internal.measurement.b2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.internal.measurement.C4829k1 m20745a(java.io.File r6) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0096 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0096 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0096 }
            r2.<init>(r6)     // Catch:{ IOException -> 0x0096 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0096 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0096 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x008a }
            r1.<init>()     // Catch:{ all -> 0x008a }
        L_0x0014:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0063
            java.lang.String r3 = " "
            r4 = 3
            java.lang.String[] r3 = r2.split(r3, r4)     // Catch:{ all -> 0x008a }
            int r5 = r3.length     // Catch:{ all -> 0x008a }
            if (r5 == r4) goto L_0x003a
            java.lang.String r3 = "Invalid: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x008a }
            int r4 = r2.length()     // Catch:{ all -> 0x008a }
            if (r4 == 0) goto L_0x0034
            r3.concat(r2)     // Catch:{ all -> 0x008a }
            goto L_0x0014
        L_0x0034:
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x008a }
            r2.<init>(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0014
        L_0x003a:
            r2 = 0
            r2 = r3[r2]     // Catch:{ all -> 0x008a }
            r4 = 1
            r4 = r3[r4]     // Catch:{ all -> 0x008a }
            java.lang.String r4 = android.net.Uri.decode(r4)     // Catch:{ all -> 0x008a }
            r5 = 2
            r3 = r3[r5]     // Catch:{ all -> 0x008a }
            java.lang.String r3 = android.net.Uri.decode(r3)     // Catch:{ all -> 0x008a }
            boolean r5 = r1.containsKey(r2)     // Catch:{ all -> 0x008a }
            if (r5 != 0) goto L_0x0059
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x008a }
            r5.<init>()     // Catch:{ all -> 0x008a }
            r1.put(r2, r5)     // Catch:{ all -> 0x008a }
        L_0x0059:
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x008a }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x008a }
            r2.put(r4, r3)     // Catch:{ all -> 0x008a }
            goto L_0x0014
        L_0x0063:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x008a }
            int r2 = r2.length()     // Catch:{ all -> 0x008a }
            int r2 = r2 + 7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Parsed "
            r3.append(r2)     // Catch:{ all -> 0x008a }
            r3.append(r6)     // Catch:{ all -> 0x008a }
            r3.toString()     // Catch:{ all -> 0x008a }
            com.google.android.gms.internal.measurement.k1 r6 = new com.google.android.gms.internal.measurement.k1     // Catch:{ all -> 0x008a }
            r6.<init>(r1)     // Catch:{ all -> 0x008a }
            r0.close()     // Catch:{ IOException -> 0x0096 }
            return r6
        L_0x008a:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            com.google.android.gms.internal.measurement.C4830k2.m20472a(r6, r0)     // Catch:{ IOException -> 0x0096 }
        L_0x0095:
            throw r1     // Catch:{ IOException -> 0x0096 }
        L_0x0096:
            r6 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r6)
            goto L_0x009e
        L_0x009d:
            throw r0
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C4883n1.m20745a(java.io.File):com.google.android.gms.internal.measurement.k1");
    }
}
