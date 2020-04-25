package com.instabug.library.internal.device;

import android.os.Build;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import p205i.p471b.p472a.p473a.p474c.C13938g;

@SuppressFBWarnings({"DMI_HARDCODED_ABSOLUTE_FILENAME"})
/* renamed from: com.instabug.library.internal.device.a */
/* compiled from: InstabugRootChecker */
public class C9826a {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f26050a;

    public C9826a() {
        m45827e()[0] = true;
    }

    /* renamed from: a */
    public static boolean m45823a() {
        boolean z;
        boolean[] e = m45827e();
        if (m45824b()) {
            e[1] = true;
        } else if (m45825c()) {
            e[2] = true;
        } else if (m45826d()) {
            e[3] = true;
        } else {
            z = false;
            e[5] = true;
            e[6] = true;
            return z;
        }
        e[4] = true;
        z = true;
        e[6] = true;
        return z;
    }

    /* renamed from: b */
    public static boolean m45824b() {
        boolean z;
        boolean[] e = m45827e();
        String str = Build.TAGS;
        e[7] = true;
        if (str == null) {
            e[8] = true;
        } else if (!str.contains("test-keys")) {
            e[9] = true;
        } else {
            e[10] = true;
            z = true;
            e[12] = true;
            return z;
        }
        z = false;
        e[11] = true;
        e[12] = true;
        return z;
    }

    /* renamed from: c */
    public static boolean m45825c() {
        boolean[] e = m45827e();
        try {
            File file = new File("/system/app/Superuser.apk");
            e[13] = true;
            boolean exists = file.exists();
            e[14] = true;
            return exists;
        } catch (Exception unused) {
            e[15] = true;
            return false;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m45826d() {
        /*
            java.lang.Class<com.instabug.library.internal.device.a> r0 = com.instabug.library.internal.device.C9826a.class
            boolean[] r1 = m45827e()
            r2 = 1
            r3 = 16
            r1[r3] = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 17
            r5 = 0
            r1[r4] = r2     // Catch:{ Exception -> 0x00f3 }
            java.lang.Runtime r4 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x00f3 }
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r7 = "/system/xbin/which"
            r6[r5] = r7     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r7 = "su"
            r6[r2] = r7     // Catch:{ Exception -> 0x00f3 }
            java.lang.Process r4 = r4.exec(r6)     // Catch:{ Exception -> 0x00f3 }
            java.io.BufferedReader r6 = new java.io.BufferedReader
            java.io.InputStreamReader r7 = new java.io.InputStreamReader
            r8 = 19
            r1[r8] = r2
            java.io.InputStream r4 = r4.getInputStream()
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r7.<init>(r4, r8)
            r6.<init>(r7)
            r4 = 20
            r1[r4] = r2     // Catch:{ Exception -> 0x0089 }
        L_0x0044:
            java.lang.String r4 = r6.readLine()     // Catch:{ Exception -> 0x0089 }
            if (r4 != 0) goto L_0x0063
            r4 = 21
            r1[r4] = r2     // Catch:{ Exception -> 0x0089 }
            r6.close()     // Catch:{ IOException -> 0x0056 }
            r4 = 25
            r1[r4] = r2
            goto L_0x00a9
        L_0x0056:
            r4 = move-exception
            r6 = 26
            r1[r6] = r2
            r4.printStackTrace()
            r4 = 27
            r1[r4] = r2
            goto L_0x00a9
        L_0x0063:
            r7 = 22
            r1[r7] = r2     // Catch:{ Exception -> 0x0089 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0089 }
            r7.<init>()     // Catch:{ Exception -> 0x0089 }
            java.lang.String r8 = "SHELL --> Line received: "
            r7.append(r8)     // Catch:{ Exception -> 0x0089 }
            r7.append(r4)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0089 }
            com.instabug.library.util.InstabugSDKLogger.m46622d(r0, r7)     // Catch:{ Exception -> 0x0089 }
            r7 = 23
            r1[r7] = r2     // Catch:{ Exception -> 0x0089 }
            r3.add(r4)     // Catch:{ Exception -> 0x0089 }
            r4 = 24
            r1[r4] = r2     // Catch:{ Exception -> 0x0089 }
            goto L_0x0044
        L_0x0087:
            r0 = move-exception
            goto L_0x00d6
        L_0x0089:
            r4 = move-exception
            r7 = 28
            r1[r7] = r2     // Catch:{ all -> 0x0087 }
            r4.printStackTrace()     // Catch:{ all -> 0x0087 }
            r4 = 29
            r1[r4] = r2     // Catch:{ IOException -> 0x009d }
            r6.close()     // Catch:{  }
            r4 = 30
            r1[r4] = r2
            goto L_0x00a9
        L_0x009d:
            r4 = move-exception
            r6 = 31
            r1[r6] = r2
            r4.printStackTrace()
            r4 = 32
            r1[r4] = r2
        L_0x00a9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "SHELL --> Full response was: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.instabug.library.util.InstabugSDKLogger.m46622d(r0, r4)
            r0 = 38
            r1[r0] = r2
            int r0 = r3.size()
            if (r0 == 0) goto L_0x00cd
            r0 = 39
            r1[r0] = r2
            r5 = 1
            goto L_0x00d1
        L_0x00cd:
            r0 = 40
            r1[r0] = r2
        L_0x00d1:
            r0 = 41
            r1[r0] = r2
            return r5
        L_0x00d6:
            r3 = 33
            r1[r3] = r2     // Catch:{ IOException -> 0x00e2 }
            r6.close()     // Catch:{  }
            r3 = 34
            r1[r3] = r2
            goto L_0x00ee
        L_0x00e2:
            r3 = move-exception
            r4 = 35
            r1[r4] = r2
            r3.printStackTrace()
            r3 = 36
            r1[r3] = r2
        L_0x00ee:
            r3 = 37
            r1[r3] = r2
            throw r0
        L_0x00f3:
            r0 = 18
            r1[r0] = r2
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.device.C9826a.m45826d():boolean");
    }

    /* renamed from: e */
    private static /* synthetic */ boolean[] m45827e() {
        boolean[] zArr = f26050a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-1978120144649516374L, "com/instabug/library/internal/device/InstabugRootChecker", 42);
        f26050a = a;
        return a;
    }
}
