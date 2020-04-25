package com.google.android.play.core.internal;

/* renamed from: com.google.android.play.core.internal.i0 */
public final class C5744i0 {

    /* renamed from: a */
    private static final C5750l0 f16616a;

    /* renamed from: b */
    private static final int f16617b;

    /* renamed from: com.google.android.play.core.internal.i0$a */
    static final class C5745a extends C5750l0 {
        C5745a() {
        }

        /* renamed from: a */
        public final void mo23049a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m25250a()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ all -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            com.google.android.play.core.internal.o0 r2 = new com.google.android.play.core.internal.o0     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            com.google.android.play.core.internal.m0 r2 = new com.google.android.play.core.internal.m0     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            com.google.android.play.core.internal.i0$a r2 = new com.google.android.play.core.internal.i0$a     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x002a:
            r2 = move-exception
            goto L_0x002e
        L_0x002c:
            r2 = move-exception
            r1 = 0
        L_0x002e:
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<com.google.android.play.core.internal.i0$a> r4 = com.google.android.play.core.internal.C5744i0.C5745a.class
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = java.lang.String.valueOf(r4)
            int r5 = r5.length()
            int r5 = r5 + 133
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r4 = "will be used. The error is: "
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r3.println(r4)
            java.io.PrintStream r3 = java.lang.System.err
            r2.printStackTrace(r3)
            com.google.android.play.core.internal.i0$a r2 = new com.google.android.play.core.internal.i0$a
            r2.<init>()
        L_0x0063:
            f16616a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f16617b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C5744i0.<clinit>():void");
    }

    /* renamed from: a */
    private static Integer m25250a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }

    /* renamed from: a */
    public static void m25251a(Throwable th, Throwable th2) {
        f16616a.mo23049a(th, th2);
    }
}
