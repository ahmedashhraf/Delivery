package p205i.p471b.p472a.p473a.p474c.p475i;

/* renamed from: i.b.a.a.c.i.p */
/* compiled from: Item */
final class C13955p {

    /* renamed from: a */
    int f40667a;

    /* renamed from: b */
    int f40668b;

    /* renamed from: c */
    int f40669c;

    /* renamed from: d */
    long f40670d;

    /* renamed from: e */
    String f40671e;

    /* renamed from: f */
    String f40672f;

    /* renamed from: g */
    String f40673g;

    /* renamed from: h */
    int f40674h;

    /* renamed from: i */
    C13955p f40675i;

    C13955p() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44152a(int i) {
        this.f40668b = 3;
        this.f40669c = i;
        this.f40674h = Integer.MAX_VALUE & (this.f40668b + i);
    }

    C13955p(int i) {
        this.f40667a = i;
    }

    C13955p(int i, C13955p pVar) {
        this.f40667a = i;
        this.f40668b = pVar.f40668b;
        this.f40669c = pVar.f40669c;
        this.f40670d = pVar.f40670d;
        this.f40671e = pVar.f40671e;
        this.f40672f = pVar.f40672f;
        this.f40673g = pVar.f40673g;
        this.f40674h = pVar.f40674h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44155a(long j) {
        this.f40668b = 5;
        this.f40670d = j;
        this.f40674h = Integer.MAX_VALUE & (this.f40668b + ((int) j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44151a(float f) {
        this.f40668b = 4;
        this.f40669c = Float.floatToRawIntBits(f);
        this.f40674h = Integer.MAX_VALUE & (this.f40668b + ((int) f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44150a(double d) {
        this.f40668b = 6;
        this.f40670d = Double.doubleToRawLongBits(d);
        this.f40674h = Integer.MAX_VALUE & (this.f40668b + ((int) d));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44154a(int i, String str, String str2, String str3) {
        this.f40668b = i;
        this.f40671e = str;
        this.f40672f = str2;
        this.f40673g = str3;
        if (i != 1) {
            if (i == 12) {
                this.f40674h = (i + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
                return;
            } else if (!(i == 16 || i == 30)) {
                if (i == 7) {
                    this.f40669c = 0;
                } else if (i != 8) {
                    this.f40674h = (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
                    return;
                }
            }
        }
        this.f40674h = (i + str.hashCode()) & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44156a(String str, String str2, int i) {
        this.f40668b = 18;
        this.f40670d = (long) i;
        this.f40671e = str;
        this.f40672f = str2;
        this.f40674h = Integer.MAX_VALUE & ((i * this.f40671e.hashCode() * this.f40672f.hashCode()) + 18);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44153a(int i, int i2) {
        this.f40668b = 33;
        this.f40669c = i;
        this.f40674h = i2;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r9.f40670d != r8.f40670d) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo44157a(p205i.p471b.p472a.p473a.p474c.p475i.C13955p r9) {
        /*
            r8 = this;
            int r0 = r8.f40668b
            r1 = 1
            if (r0 == r1) goto L_0x0096
            r2 = 12
            r3 = 0
            if (r0 == r2) goto L_0x007f
            r2 = 16
            if (r0 == r2) goto L_0x0096
            r2 = 18
            if (r0 == r2) goto L_0x0060
            switch(r0) {
                case 3: goto L_0x0057;
                case 4: goto L_0x0057;
                case 5: goto L_0x004c;
                case 6: goto L_0x004c;
                case 7: goto L_0x0096;
                case 8: goto L_0x0096;
                default: goto L_0x0015;
            }
        L_0x0015:
            switch(r0) {
                case 30: goto L_0x0096;
                case 31: goto L_0x0039;
                case 32: goto L_0x004c;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r0 = r9.f40671e
            java.lang.String r2 = r8.f40671e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r9.f40672f
            java.lang.String r2 = r8.f40672f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0037
            java.lang.String r9 = r9.f40673g
            java.lang.String r0 = r8.f40673g
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            return r1
        L_0x0039:
            int r0 = r9.f40669c
            int r2 = r8.f40669c
            if (r0 != r2) goto L_0x004a
            java.lang.String r9 = r9.f40671e
            java.lang.String r0 = r8.f40671e
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x004a
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            return r1
        L_0x004c:
            long r4 = r9.f40670d
            long r6 = r8.f40670d
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            return r1
        L_0x0057:
            int r9 = r9.f40669c
            int r0 = r8.f40669c
            if (r9 != r0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            return r1
        L_0x0060:
            long r4 = r9.f40670d
            long r6 = r8.f40670d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007d
            java.lang.String r0 = r9.f40671e
            java.lang.String r2 = r8.f40671e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007d
            java.lang.String r9 = r9.f40672f
            java.lang.String r0 = r8.f40672f
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            return r1
        L_0x007f:
            java.lang.String r0 = r9.f40671e
            java.lang.String r2 = r8.f40671e
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0094
            java.lang.String r9 = r9.f40672f
            java.lang.String r0 = r8.f40672f
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            return r1
        L_0x0096:
            java.lang.String r9 = r9.f40671e
            java.lang.String r0 = r8.f40671e
            boolean r9 = r9.equals(r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p205i.p471b.p472a.p473a.p474c.p475i.C13955p.mo44157a(i.b.a.a.c.i.p):boolean");
    }
}
