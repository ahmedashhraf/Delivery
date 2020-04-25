package com.instabug.bug;

import androidx.annotation.C0216r0;
import com.instabug.library.InstabugColorTheme;
import p205i.p471b.p472a.p473a.p474c.C13938g;

/* renamed from: com.instabug.bug.d */
/* compiled from: BugReportingWrapper */
public class C9250d {

    /* renamed from: a */
    private static transient /* synthetic */ boolean[] f24464a;

    /* renamed from: com.instabug.bug.d$a */
    /* compiled from: BugReportingWrapper */
    static /* synthetic */ class C9251a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24465a = new int[PromptOption.values().length];

        /* renamed from: b */
        private static transient /* synthetic */ boolean[] f24466b;

        /* JADX WARNING: Can't wrap try/catch for region: R(2:4|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0[4] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            r0[6] = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r0[2] = true;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0020 */
        static {
            /*
                boolean[] r0 = m43235a()
                com.instabug.bug.PromptOption[] r1 = com.instabug.bug.PromptOption.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                f24465a = r1
                r1 = 0
                r2 = 3
                r3 = 2
                r4 = 1
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                int[] r1 = f24465a     // Catch:{ NoSuchFieldError -> 0x0020 }
                com.instabug.bug.PromptOption r5 = com.instabug.bug.PromptOption.BUG     // Catch:{ NoSuchFieldError -> 0x0020 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0020 }
                r1[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0020 }
                r0[r4] = r4
                goto L_0x0022
            L_0x0020:
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x0022:
                int[] r1 = f24465a     // Catch:{ NoSuchFieldError -> 0x002f }
                com.instabug.bug.PromptOption r5 = com.instabug.bug.PromptOption.CHAT     // Catch:{ NoSuchFieldError -> 0x002f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002f }
                r1[r5] = r3     // Catch:{ NoSuchFieldError -> 0x002f }
                r0[r2] = r4
                goto L_0x0032
            L_0x002f:
                r1 = 4
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0032:
                int[] r1 = f24465a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.instabug.bug.PromptOption r3 = com.instabug.bug.PromptOption.FEEDBACK     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
                r1 = 5
                r0[r1] = r4
                goto L_0x0043
            L_0x0040:
                r1 = 6
                r0[r1] = r4
            L_0x0043:
                r1 = 7
                r0[r1] = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.C9250d.C9251a.<clinit>():void");
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43235a() {
            boolean[] zArr = f24466b;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-7685627351902040739L, "com/instabug/bug/BugReportingWrapper$1", 8);
            f24466b = a;
            return a;
        }
    }

    /* renamed from: com.instabug.bug.d$b */
    /* compiled from: BugReportingThemeResolver */
    public class C9252b {

        /* renamed from: a */
        private static transient /* synthetic */ boolean[] f24467a;

        @C0216r0
        /* renamed from: a */
        public static int m43236a(InstabugColorTheme instabugColorTheme) {
            boolean[] a = m43237a();
            if (instabugColorTheme == InstabugColorTheme.InstabugColorThemeLight) {
                int i = C9231R.style.InstabugBugReportingLight;
                a[1] = true;
                return i;
            }
            int i2 = C9231R.style.InstabugBugReportingDark;
            a[2] = true;
            return i2;
        }

        /* renamed from: a */
        private static /* synthetic */ boolean[] m43237a() {
            boolean[] zArr = f24467a;
            if (zArr != null) {
                return zArr;
            }
            boolean[] a = C13938g.m59885a(-5328056486896687612L, "com/instabug/bug/utils/BugReportingThemeResolver", 3);
            f24467a = a;
            return a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43233a(com.instabug.bug.PromptOption... r13) {
        /*
            boolean[] r0 = m43234a()
            com.instabug.library.invocation.InvocationManager r1 = com.instabug.library.invocation.InvocationManager.getInstance()
            com.instabug.library.invocation.InvocationSettings r1 = r1.getCurrentInvocationSettings()
            int r2 = r13.length
            r3 = 1
            r0[r3] = r3
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0015:
            r9 = 4
            r10 = 2
            if (r5 >= r2) goto L_0x0042
            r11 = r13[r5]
            r0[r10] = r3
            int[] r12 = com.instabug.bug.C9250d.C9251a.f24465a
            int r11 = r11.ordinal()
            r11 = r12[r11]
            if (r11 == r3) goto L_0x0039
            if (r11 == r10) goto L_0x0034
            r9 = 3
            if (r11 == r9) goto L_0x002f
            r0[r9] = r3
            goto L_0x003c
        L_0x002f:
            r8 = 6
            r0[r8] = r3
            r8 = 1
            goto L_0x003c
        L_0x0034:
            r6 = 5
            r0[r6] = r3
            r6 = 1
            goto L_0x003c
        L_0x0039:
            r0[r9] = r3
            r7 = 1
        L_0x003c:
            int r5 = r5 + 1
            r9 = 7
            r0[r9] = r3
            goto L_0x0015
        L_0x0042:
            if (r6 == 0) goto L_0x0050
            r13 = 8
            r0[r13] = r3
            r1.enabledPromptOption(r9)
            r13 = 9
            r0[r13] = r3
            goto L_0x0057
        L_0x0050:
            r1.disabledPromptOption(r9)
            r13 = 10
            r0[r13] = r3
        L_0x0057:
            if (r7 == 0) goto L_0x0065
            r13 = 11
            r0[r13] = r3
            r1.enabledPromptOption(r3)
            r13 = 12
            r0[r13] = r3
            goto L_0x006c
        L_0x0065:
            r1.disabledPromptOption(r3)
            r13 = 13
            r0[r13] = r3
        L_0x006c:
            if (r8 == 0) goto L_0x007a
            r13 = 14
            r0[r13] = r3
            r1.enabledPromptOption(r10)
            r13 = 15
            r0[r13] = r3
            goto L_0x0081
        L_0x007a:
            r1.disabledPromptOption(r10)
            r13 = 16
            r0[r13] = r3
        L_0x0081:
            if (r6 != 0) goto L_0x0088
            r13 = 17
            r0[r13] = r3
            goto L_0x009a
        L_0x0088:
            if (r7 == 0) goto L_0x008f
            r13 = 18
            r0[r13] = r3
            goto L_0x00da
        L_0x008f:
            if (r8 == 0) goto L_0x0096
            r13 = 19
            r0[r13] = r3
            goto L_0x00da
        L_0x0096:
            r13 = 20
            r0[r13] = r3
        L_0x009a:
            if (r7 != 0) goto L_0x00a1
            r13 = 21
            r0[r13] = r3
            goto L_0x00a7
        L_0x00a1:
            if (r8 != 0) goto L_0x00d6
            r13 = 22
            r0[r13] = r3
        L_0x00a7:
            if (r6 == 0) goto L_0x00b5
            r13 = 25
            r0[r13] = r3
            r1.setDefaultInvocationMode(r9)
            r13 = 26
            r0[r13] = r3
            goto L_0x00e1
        L_0x00b5:
            if (r7 == 0) goto L_0x00c3
            r13 = 27
            r0[r13] = r3
            r1.setDefaultInvocationMode(r3)
            r13 = 28
            r0[r13] = r3
            goto L_0x00e1
        L_0x00c3:
            if (r8 != 0) goto L_0x00ca
            r13 = 29
            r0[r13] = r3
            goto L_0x00e1
        L_0x00ca:
            r13 = 30
            r0[r13] = r3
            r1.setDefaultInvocationMode(r10)
            r13 = 31
            r0[r13] = r3
            goto L_0x00e1
        L_0x00d6:
            r13 = 23
            r0[r13] = r3
        L_0x00da:
            r1.setDefaultInvocationMode(r4)
            r13 = 24
            r0[r13] = r3
        L_0x00e1:
            if (r6 == 0) goto L_0x00e8
            r13 = 32
            r0[r13] = r3
            goto L_0x0108
        L_0x00e8:
            if (r7 == 0) goto L_0x00ef
            r13 = 33
            r0[r13] = r3
            goto L_0x0108
        L_0x00ef:
            if (r8 == 0) goto L_0x00f6
            r13 = 34
            r0[r13] = r3
            goto L_0x0108
        L_0x00f6:
            r13 = 35
            r0[r13] = r3
            r1.enabledPromptOption(r3)
            r13 = 36
            r0[r13] = r3
            r1.setDefaultInvocationMode(r3)
            r13 = 37
            r0[r13] = r3
        L_0x0108:
            r13 = 38
            r0[r13] = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.C9250d.m43233a(com.instabug.bug.PromptOption[]):void");
    }

    /* renamed from: a */
    private static /* synthetic */ boolean[] m43234a() {
        boolean[] zArr = f24464a;
        if (zArr != null) {
            return zArr;
        }
        boolean[] a = C13938g.m59885a(-403698780180278457L, "com/instabug/bug/BugReportingWrapper", 39);
        f24464a = a;
        return a;
    }
}
