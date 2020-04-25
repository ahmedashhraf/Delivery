package com.krishna.fileloader.p408i;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.krishna.fileloader.i.c */
/* compiled from: MD5 */
public class C10187c {

    /* renamed from: a */
    private static final String f27193a = "MD5";

    /* renamed from: a */
    public static boolean m47379a(String str, File file) {
        if (TextUtils.isEmpty(str) || file == null) {
            return false;
        }
        String a = m47378a(file);
        if (a == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Calculated digest: ");
        sb.append(a);
        sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Provided digest: ");
        sb2.append(str);
        sb2.toString();
        return a.equalsIgnoreCase(str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m47378a(java.io.File r4) {
        /*
            r0 = 0
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0050 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r4)     // Catch:{  }
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]
        L_0x0010:
            int r0 = r2.read(r4)     // Catch:{ IOException -> 0x0043 }
            r3 = 0
            if (r0 <= 0) goto L_0x001b
            r1.update(r4, r3, r0)     // Catch:{ IOException -> 0x0043 }
            goto L_0x0010
        L_0x001b:
            byte[] r4 = r1.digest()     // Catch:{ IOException -> 0x0043 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ IOException -> 0x0043 }
            r1 = 1
            r0.<init>(r1, r4)     // Catch:{ IOException -> 0x0043 }
            r4 = 16
            java.lang.String r4 = r0.toString(r4)     // Catch:{ IOException -> 0x0043 }
            java.lang.String r0 = "%32s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0043 }
            r1[r3] = r4     // Catch:{ IOException -> 0x0043 }
            java.lang.String r4 = java.lang.String.format(r0, r1)     // Catch:{ IOException -> 0x0043 }
            r0 = 32
            r1 = 48
            java.lang.String r4 = r4.replace(r0, r1)     // Catch:{ IOException -> 0x0043 }
            r2.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r4
        L_0x0041:
            r4 = move-exception
            goto L_0x004c
        L_0x0043:
            r4 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0041 }
            java.lang.String r1 = "Unable to process file for MD5"
            r0.<init>(r1, r4)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x004c:
            r2.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r4
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.krishna.fileloader.p408i.C10187c.m47378a(java.io.File):java.lang.String");
    }
}
