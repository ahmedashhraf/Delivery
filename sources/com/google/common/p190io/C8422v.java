package com.google.common.p190io;

import java.io.IOException;

/* renamed from: com.google.common.io.v */
/* compiled from: LineBuffer */
abstract class C8422v {

    /* renamed from: a */
    private StringBuilder f22318a = new StringBuilder();

    /* renamed from: b */
    private boolean f22319b;

    C8422v() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31566a(String str, String str2) throws IOException;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31567a(char[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.f22319b
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L_0x001a
            if (r9 <= 0) goto L_0x001a
            char r0 = r7[r8]
            if (r0 != r2) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            boolean r0 = r6.m39990a(r0)
            if (r0 == 0) goto L_0x001a
            int r0 = r8 + 1
            goto L_0x001b
        L_0x001a:
            r0 = r8
        L_0x001b:
            int r8 = r8 + r9
            r9 = r0
        L_0x001d:
            if (r0 >= r8) goto L_0x0052
            char r4 = r7[r0]
            if (r4 == r2) goto L_0x0044
            r5 = 13
            if (r4 == r5) goto L_0x0028
            goto L_0x0050
        L_0x0028:
            java.lang.StringBuilder r4 = r6.f22318a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.f22319b = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L_0x004e
            char r4 = r7[r9]
            if (r4 != r2) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            boolean r4 = r6.m39990a(r4)
            if (r4 == 0) goto L_0x004e
            r0 = r9
            goto L_0x004e
        L_0x0044:
            java.lang.StringBuilder r4 = r6.f22318a
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.m39990a(r3)
        L_0x004e:
            int r9 = r0 + 1
        L_0x0050:
            int r0 = r0 + r3
            goto L_0x001d
        L_0x0052:
            java.lang.StringBuilder r0 = r6.f22318a
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p190io.C8422v.mo31567a(char[], int, int):void");
    }

    /* renamed from: a */
    private boolean m39990a(boolean z) throws IOException {
        String sb = this.f22318a.toString();
        String str = this.f22319b ? z ? "\r\n" : "\r" : z ? "\n" : "";
        mo31566a(sb, str);
        this.f22318a = new StringBuilder();
        this.f22319b = false;
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31565a() throws IOException {
        if (this.f22319b || this.f22318a.length() > 0) {
            m39990a(false);
        }
    }
}
