package androidx.recyclerview.widget;

import java.util.List;

/* renamed from: androidx.recyclerview.widget.v */
/* compiled from: OpReorderer */
class C1773v {

    /* renamed from: a */
    final C1774a f6906a;

    /* renamed from: androidx.recyclerview.widget.v$a */
    /* compiled from: OpReorderer */
    interface C1774a {
        /* renamed from: a */
        C1676b mo7675a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo7678a(C1676b bVar);
    }

    C1773v(C1774a aVar) {
        this.f6906a = aVar;
    }

    /* renamed from: c */
    private void m9551c(List<C1676b> list, int i, C1676b bVar, int i2, C1676b bVar2) {
        int i3 = bVar.f6448d < bVar2.f6446b ? -1 : 0;
        if (bVar.f6446b < bVar2.f6446b) {
            i3++;
        }
        int i4 = bVar2.f6446b;
        int i5 = bVar.f6446b;
        if (i4 <= i5) {
            bVar.f6446b = i5 + bVar2.f6448d;
        }
        int i6 = bVar2.f6446b;
        int i7 = bVar.f6448d;
        if (i6 <= i7) {
            bVar.f6448d = i7 + bVar2.f6448d;
        }
        bVar2.f6446b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8008a(List<C1676b> list) {
        while (true) {
            int b = m9550b(list);
            if (b != -1) {
                m9549a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8010b(java.util.List<androidx.recyclerview.widget.C1674a.C1676b> r9, int r10, androidx.recyclerview.widget.C1674a.C1676b r11, int r12, androidx.recyclerview.widget.C1674a.C1676b r13) {
        /*
            r8 = this;
            int r0 = r11.f6448d
            int r1 = r13.f6446b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f6446b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f6448d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f6448d = r5
            androidx.recyclerview.widget.v$a r0 = r8.f6906a
            int r1 = r11.f6446b
            java.lang.Object r5 = r13.f6447c
            androidx.recyclerview.widget.a$b r0 = r0.mo7675a(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f6446b
            int r5 = r13.f6446b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f6446b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f6448d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.v$a r3 = r8.f6906a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f6447c
            androidx.recyclerview.widget.a$b r3 = r3.mo7675a(r2, r1, r5, r4)
            int r1 = r13.f6448d
            int r1 = r1 - r5
            r13.f6448d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f6448d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.v$a r11 = r8.f6906a
            r11.mo7678a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1773v.mo8010b(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* renamed from: a */
    private void m9549a(List<C1676b> list, int i, int i2) {
        C1676b bVar = (C1676b) list.get(i);
        C1676b bVar2 = (C1676b) list.get(i2);
        int i3 = bVar2.f6445a;
        if (i3 == 1) {
            m9551c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo8009a(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo8010b(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8009a(java.util.List<androidx.recyclerview.widget.C1674a.C1676b> r10, int r11, androidx.recyclerview.widget.C1674a.C1676b r12, int r13, androidx.recyclerview.widget.C1674a.C1676b r14) {
        /*
            r9 = this;
            int r0 = r12.f6446b
            int r1 = r12.f6448d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x0015
            int r4 = r14.f6446b
            if (r4 != r0) goto L_0x0013
            int r4 = r14.f6448d
            int r1 = r1 - r0
            if (r4 != r1) goto L_0x0013
            r0 = 0
            goto L_0x0021
        L_0x0013:
            r0 = 0
            goto L_0x0024
        L_0x0015:
            int r4 = r14.f6446b
            int r5 = r1 + 1
            if (r4 != r5) goto L_0x0023
            int r4 = r14.f6448d
            int r0 = r0 - r1
            if (r4 != r0) goto L_0x0023
            r0 = 1
        L_0x0021:
            r2 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 1
        L_0x0024:
            int r1 = r12.f6448d
            int r4 = r14.f6446b
            r5 = 2
            if (r1 >= r4) goto L_0x002f
            int r4 = r4 - r3
            r14.f6446b = r4
            goto L_0x0048
        L_0x002f:
            int r6 = r14.f6448d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x0048
            int r6 = r6 - r3
            r14.f6448d = r6
            r12.f6445a = r5
            r12.f6448d = r3
            int r11 = r14.f6448d
            if (r11 != 0) goto L_0x0047
            r10.remove(r13)
            androidx.recyclerview.widget.v$a r10 = r9.f6906a
            r10.mo7678a(r14)
        L_0x0047:
            return
        L_0x0048:
            int r1 = r12.f6446b
            int r4 = r14.f6446b
            r6 = 0
            if (r1 > r4) goto L_0x0053
            int r4 = r4 + r3
            r14.f6446b = r4
            goto L_0x0069
        L_0x0053:
            int r7 = r14.f6448d
            int r8 = r4 + r7
            if (r1 >= r8) goto L_0x0069
            int r4 = r4 + r7
            int r4 = r4 - r1
            androidx.recyclerview.widget.v$a r7 = r9.f6906a
            int r1 = r1 + r3
            androidx.recyclerview.widget.a$b r6 = r7.mo7675a(r5, r1, r4, r6)
            int r1 = r12.f6446b
            int r3 = r14.f6446b
            int r1 = r1 - r3
            r14.f6448d = r1
        L_0x0069:
            if (r2 == 0) goto L_0x0077
            r10.set(r11, r14)
            r10.remove(r13)
            androidx.recyclerview.widget.v$a r10 = r9.f6906a
            r10.mo7678a(r12)
            return
        L_0x0077:
            if (r0 == 0) goto L_0x00a8
            if (r6 == 0) goto L_0x0091
            int r0 = r12.f6446b
            int r1 = r6.f6446b
            if (r0 <= r1) goto L_0x0086
            int r1 = r6.f6448d
            int r0 = r0 - r1
            r12.f6446b = r0
        L_0x0086:
            int r0 = r12.f6448d
            int r1 = r6.f6446b
            if (r0 <= r1) goto L_0x0091
            int r1 = r6.f6448d
            int r0 = r0 - r1
            r12.f6448d = r0
        L_0x0091:
            int r0 = r12.f6446b
            int r1 = r14.f6446b
            if (r0 <= r1) goto L_0x009c
            int r1 = r14.f6448d
            int r0 = r0 - r1
            r12.f6446b = r0
        L_0x009c:
            int r0 = r12.f6448d
            int r1 = r14.f6446b
            if (r0 <= r1) goto L_0x00d6
            int r1 = r14.f6448d
            int r0 = r0 - r1
            r12.f6448d = r0
            goto L_0x00d6
        L_0x00a8:
            if (r6 == 0) goto L_0x00c0
            int r0 = r12.f6446b
            int r1 = r6.f6446b
            if (r0 < r1) goto L_0x00b5
            int r1 = r6.f6448d
            int r0 = r0 - r1
            r12.f6446b = r0
        L_0x00b5:
            int r0 = r12.f6448d
            int r1 = r6.f6446b
            if (r0 < r1) goto L_0x00c0
            int r1 = r6.f6448d
            int r0 = r0 - r1
            r12.f6448d = r0
        L_0x00c0:
            int r0 = r12.f6446b
            int r1 = r14.f6446b
            if (r0 < r1) goto L_0x00cb
            int r1 = r14.f6448d
            int r0 = r0 - r1
            r12.f6446b = r0
        L_0x00cb:
            int r0 = r12.f6448d
            int r1 = r14.f6446b
            if (r0 < r1) goto L_0x00d6
            int r1 = r14.f6448d
            int r0 = r0 - r1
            r12.f6448d = r0
        L_0x00d6:
            r10.set(r11, r14)
            int r14 = r12.f6446b
            int r0 = r12.f6448d
            if (r14 == r0) goto L_0x00e3
            r10.set(r13, r12)
            goto L_0x00e6
        L_0x00e3:
            r10.remove(r13)
        L_0x00e6:
            if (r6 == 0) goto L_0x00eb
            r10.add(r11, r6)
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1773v.mo8009a(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* renamed from: b */
    private int m9550b(List<C1676b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1676b) list.get(size)).f6445a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
