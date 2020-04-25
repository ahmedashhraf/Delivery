package p076c.p112d.p113a.p114a.p118d.p123e;

/* renamed from: c.d.a.a.d.e.m */
/* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
public final class C2632m {

    /* renamed from: a */
    private static final C2636p f9742a;

    /* renamed from: b */
    private static final int f9743b;

    /* renamed from: c.d.a.a.d.e.m$a */
    /* compiled from: com.google.firebase:firebase-iid@@20.0.0 */
    static final class C2633a extends C2636p {
        C2633a() {
        }

        /* renamed from: a */
        public final void mo10149a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    static {
        /*
            r0 = 1
            java.lang.Integer r1 = m12741a()     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0015
            int r2 = r1.intValue()     // Catch:{ all -> 0x002a }
            r3 = 19
            if (r2 < r3) goto L_0x0015
            c.d.a.a.d.e.s r2 = new c.d.a.a.d.e.s     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0015:
            java.lang.String r2 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r2 = java.lang.Boolean.getBoolean(r2)     // Catch:{ all -> 0x002a }
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0024
            c.d.a.a.d.e.q r2 = new c.d.a.a.d.e.q     // Catch:{ all -> 0x002a }
            r2.<init>()     // Catch:{ all -> 0x002a }
            goto L_0x0063
        L_0x0024:
            c.d.a.a.d.e.m$a r2 = new c.d.a.a.d.e.m$a     // Catch:{ all -> 0x002a }
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
            java.lang.Class<c.d.a.a.d.e.m$a> r4 = p076c.p112d.p113a.p114a.p118d.p123e.C2632m.C2633a.class
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
            c.d.a.a.d.e.m$a r2 = new c.d.a.a.d.e.m$a
            r2.<init>()
        L_0x0063:
            f9742a = r2
            if (r1 != 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            int r0 = r1.intValue()
        L_0x006c:
            f9743b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p112d.p113a.p114a.p118d.p123e.C2632m.<clinit>():void");
    }

    /* renamed from: a */
    public static void m12742a(Throwable th, Throwable th2) {
        f9742a.mo10149a(th, th2);
    }

    /* renamed from: a */
    private static Integer m12741a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
