package com.oppwa.mobile.connect.checkout.dialog;

import android.content.Context;
import java.io.File;
import java.util.Date;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.w0 */
class C11915w0 {
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v10, types: [android.graphics.Bitmap] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [android.graphics.Bitmap, ?[int, boolean, OBJECT, ARRAY, byte, short, char], java.io.FileInputStream]
      mth insns count: 38
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC, Splitter:B:21:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041 A[SYNTHETIC, Splitter:B:28:0x0041] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Bitmap m53573a(android.content.Context r4, java.lang.String r5) {
        /*
            java.io.File r0 = m53574a(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            long r2 = m53578b(r4, r5)
            boolean r4 = m53577a(r2)
            if (r4 == 0) goto L_0x004a
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            java.lang.String r5 = m53575a(r0, r5)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            r4.<init>(r5)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r4)     // Catch:{ Exception -> 0x0029 }
            r4.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            r4.getMessage()
        L_0x0027:
            r1 = r5
            goto L_0x005d
        L_0x0029:
            r5 = move-exception
            goto L_0x002f
        L_0x002b:
            r5 = move-exception
            goto L_0x003f
        L_0x002d:
            r5 = move-exception
            r4 = r1
        L_0x002f:
            r5.getMessage()     // Catch:{ all -> 0x003d }
            if (r4 == 0) goto L_0x005d
            r4.close()     // Catch:{ Exception -> 0x0038 }
            goto L_0x005d
        L_0x0038:
            r4 = move-exception
            r4.getMessage()
            goto L_0x005d
        L_0x003d:
            r5 = move-exception
            r1 = r4
        L_0x003f:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Exception -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r4 = move-exception
            r4.getMessage()
        L_0x0049:
            throw r5
        L_0x004a:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = m53575a(r0, r5)
            r4.<init>(r5)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L_0x005d
            boolean r4 = r4.delete()
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11915w0.m53573a(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: a */
    private static File m53574a(Context context) {
        return context.getFilesDir();
    }

    /* renamed from: a */
    private static String m53575a(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append("/");
        sb.append(str);
        sb.append(".png");
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027 A[SYNTHETIC, Splitter:B:16:0x0027] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0032 A[SYNTHETIC, Splitter:B:21:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m53576a(android.content.Context r2, java.lang.String r3, android.graphics.Bitmap r4) {
        /*
            java.io.File r2 = m53574a(r2)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0021 }
            java.lang.String r2 = m53575a(r2, r3)     // Catch:{ Exception -> 0x0021 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0021 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r3 = 100
            r4.compress(r2, r3, r1)     // Catch:{ Exception -> 0x001c, all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x0019:
            r2 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x001c:
            r2 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001f:
            r2 = move-exception
            goto L_0x0030
        L_0x0021:
            r2 = move-exception
        L_0x0022:
            r2.getMessage()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r2.getMessage()
        L_0x002f:
            return
        L_0x0030:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ IOException -> 0x0036 }
            goto L_0x003a
        L_0x0036:
            r3 = move-exception
            r3.getMessage()
        L_0x003a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.checkout.dialog.C11915w0.m53576a(android.content.Context, java.lang.String, android.graphics.Bitmap):void");
    }

    /* renamed from: a */
    private static boolean m53577a(long j) {
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= 1209600000) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Prepare to delete ");
        sb.append(currentTimeMillis);
        sb.toString();
        return true;
    }

    /* renamed from: b */
    private static long m53578b(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(m53574a(context));
        sb.append("/");
        sb.append(str);
        sb.append(".png");
        File file = new File(sb.toString());
        if (!file.exists()) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Check creation date ");
        sb2.append(str);
        sb2.toString();
        return new Date(file.lastModified()).getTime();
    }
}
