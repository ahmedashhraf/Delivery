package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.annotation.C4056a;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import p201f.p202a.C5952h;

@C4056a
/* renamed from: com.google.android.gms.common.util.x */
public class C4505x {

    /* renamed from: a */
    private static String f13765a;

    /* renamed from: b */
    private static int f13766b;

    private C4505x() {
    }

    @C4056a
    @C5952h
    /* renamed from: a */
    public static String m19424a() {
        if (f13765a == null) {
            if (f13766b == 0) {
                f13766b = Process.myPid();
            }
            f13765a = m19425a(f13766b);
        }
        return f13765a;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    @p201f.p202a.C5952h
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m19425a(int r4) {
        /*
            r0 = 0
            if (r4 > 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = "/proc/"
            r2.append(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = "/cmdline"
            r2.append(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.io.BufferedReader r4 = m19423a(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0031 }
            java.lang.String r1 = r4.readLine()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            java.lang.String r0 = r1.trim()     // Catch:{ IOException -> 0x0037, all -> 0x002c }
            com.google.android.gms.common.util.C4498q.m19396a(r4)
            goto L_0x003a
        L_0x002c:
            r0 = move-exception
            r3 = r0
            r0 = r4
            r4 = r3
            goto L_0x0032
        L_0x0031:
            r4 = move-exception
        L_0x0032:
            com.google.android.gms.common.util.C4498q.m19396a(r0)
            throw r4
        L_0x0036:
            r4 = r0
        L_0x0037:
            com.google.android.gms.common.util.C4498q.m19396a(r4)
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.util.C4505x.m19425a(int):java.lang.String");
    }

    /* renamed from: a */
    private static BufferedReader m19423a(String str) throws IOException {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
