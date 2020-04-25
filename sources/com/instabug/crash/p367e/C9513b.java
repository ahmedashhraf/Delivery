package com.instabug.crash.p367e;

import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.crash.e.b */
/* compiled from: ExceptionFormatter */
public class C9513b {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f25175a;

    public C9513b() {
        m44534a()[0] = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3 A[Catch:{ JSONException -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8 A[Catch:{ JSONException -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e8 A[Catch:{ JSONException -> 0x0107 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed A[Catch:{ JSONException -> 0x0107 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m44533a(java.lang.Throwable r7, @androidx.annotation.C0195i0 java.lang.String r8) {
        /*
            java.lang.Class<com.instabug.crash.e.b> r0 = com.instabug.crash.p367e.C9513b.class
            boolean[] r1 = m44534a()
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = 1
            r1[r3] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.Class r4 = r7.getClass()     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r4 = r4.getName()     // Catch:{ JSONException -> 0x0107 }
            if (r8 != 0) goto L_0x001c
            r5 = 2
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0036
        L_0x001c:
            r5 = 3
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0107 }
            r5.<init>()     // Catch:{ JSONException -> 0x0107 }
            r5.append(r4)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r4 = "-"
            r5.append(r4)     // Catch:{ JSONException -> 0x0107 }
            r5.append(r8)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0107 }
            r5 = 4
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x0036:
            java.lang.String r5 = "name"
            r2.put(r5, r4)     // Catch:{ JSONException -> 0x0107 }
            r4 = 0
            r5 = 5
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.StackTraceElement[] r5 = r7.getStackTrace()     // Catch:{ JSONException -> 0x0107 }
            if (r5 != 0) goto L_0x0049
            r5 = 6
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0063
        L_0x0049:
            java.lang.StackTraceElement[] r5 = r7.getStackTrace()     // Catch:{ JSONException -> 0x0107 }
            int r5 = r5.length     // Catch:{ JSONException -> 0x0107 }
            if (r5 > 0) goto L_0x0054
            r5 = 7
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0063
        L_0x0054:
            r4 = 8
            r1[r4] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.StackTraceElement[] r4 = r7.getStackTrace()     // Catch:{ JSONException -> 0x0107 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ JSONException -> 0x0107 }
            r5 = 9
            r1[r5] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x0063:
            if (r4 != 0) goto L_0x006a
            r4 = 10
            r1[r4] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0074
        L_0x006a:
            java.lang.String r5 = r4.getFileName()     // Catch:{ JSONException -> 0x0107 }
            if (r5 != 0) goto L_0x0087
            r4 = 11
            r1[r4] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x0074:
            java.lang.String r4 = "Incomplete crash stacktrace, if you're using Proguard, add the following line to your configuration file to have file name and line number in your crash report:"
            com.instabug.library.util.InstabugSDKLogger.m46627w(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r4 = 14
            r1[r4] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r4 = "-keepattributes SourceFile,LineNumberTable"
            com.instabug.library.util.InstabugSDKLogger.m46627w(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r0 = 15
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x00b0
        L_0x0087:
            r0 = 12
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = "location"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0107 }
            r5.<init>()     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r6 = r4.getFileName()     // Catch:{ JSONException -> 0x0107 }
            r5.append(r6)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r6 = ":"
            r5.append(r6)     // Catch:{ JSONException -> 0x0107 }
            int r4 = r4.getLineNumber()     // Catch:{ JSONException -> 0x0107 }
            r5.append(r4)     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r4 = r5.toString()     // Catch:{ JSONException -> 0x0107 }
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r0 = 13
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x00b0:
            java.lang.String r0 = "exception"
            java.lang.String r4 = r7.toString()     // Catch:{ JSONException -> 0x0107 }
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r0 = 16
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = r7.getMessage()     // Catch:{ JSONException -> 0x0107 }
            if (r0 != 0) goto L_0x00c8
            r0 = 17
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x00d5
        L_0x00c8:
            java.lang.String r0 = "message"
            java.lang.String r4 = r7.getMessage()     // Catch:{ JSONException -> 0x0107 }
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r0 = 18
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x00d5:
            java.lang.String r0 = "stackTrace"
            java.lang.String r4 = m44532a(r7)     // Catch:{ JSONException -> 0x0107 }
            r2.put(r0, r4)     // Catch:{ JSONException -> 0x0107 }
            r0 = 19
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ JSONException -> 0x0107 }
            if (r0 != 0) goto L_0x00ed
            r7 = 20
            r1[r7] = r3     // Catch:{ JSONException -> 0x0107 }
            goto L_0x0102
        L_0x00ed:
            r0 = 21
            r1[r0] = r3     // Catch:{ JSONException -> 0x0107 }
            java.lang.String r0 = "cause"
            java.lang.Throwable r7 = r7.getCause()     // Catch:{ JSONException -> 0x0107 }
            org.json.JSONObject r7 = m44533a(r7, r8)     // Catch:{ JSONException -> 0x0107 }
            r2.put(r0, r7)     // Catch:{ JSONException -> 0x0107 }
            r7 = 22
            r1[r7] = r3     // Catch:{ JSONException -> 0x0107 }
        L_0x0102:
            r7 = 23
            r1[r7] = r3
            goto L_0x0113
        L_0x0107:
            r7 = move-exception
            r8 = 24
            r1[r8] = r3
            r7.printStackTrace()
            r7 = 25
            r1[r7] = r3
        L_0x0113:
            r7 = 26
            r1[r7] = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.crash.p367e.C9513b.m44533a(java.lang.Throwable, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m44534a() {
        boolean[] zArr = f25175a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-3924203429546035358L, "com/instabug/crash/utils/ExceptionFormatter", 32);
        f25175a = a;
        return a;
    }

    /* renamed from: a */
    public static String m44532a(Throwable th) {
        boolean[] a = m44534a();
        StringBuilder sb = new StringBuilder(th.toString());
        String str = "\n";
        sb.append(str);
        a[27] = true;
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        a[28] = true;
        int i = 0;
        while (i < length) {
            StackTraceElement stackTraceElement = stackTrace[i];
            a[29] = true;
            sb.append("\t at ");
            sb.append(stackTraceElement.toString());
            sb.append(str);
            i++;
            a[30] = true;
        }
        String sb2 = sb.toString();
        a[31] = true;
        return sb2;
    }
}
