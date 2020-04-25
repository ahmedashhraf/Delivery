package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.annotation.C0237z;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.fasterxml.jackson.core.p162w.C3868i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: DiffUtil */
public class C1726i {

    /* renamed from: a */
    private static final Comparator<C1733g> f6652a = new C1727a();

    /* renamed from: androidx.recyclerview.widget.i$a */
    /* compiled from: DiffUtil */
    static class C1727a implements Comparator<C1733g> {
        C1727a() {
        }

        /* renamed from: a */
        public int compare(C1733g gVar, C1733g gVar2) {
            int i = gVar.f6675a - gVar2.f6675a;
            return i == 0 ? gVar.f6676b - gVar2.f6676b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$b */
    /* compiled from: DiffUtil */
    public static abstract class C1728b {
        /* renamed from: a */
        public abstract int mo7767a();

        /* renamed from: a */
        public abstract boolean mo7768a(int i, int i2);

        /* renamed from: b */
        public abstract int mo7769b();

        /* renamed from: b */
        public abstract boolean mo7770b(int i, int i2);

        @C0195i0
        /* renamed from: c */
        public Object mo7771c(int i, int i2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$c */
    /* compiled from: DiffUtil */
    public static class C1729c {

        /* renamed from: h */
        public static final int f6653h = -1;

        /* renamed from: i */
        private static final int f6654i = 1;

        /* renamed from: j */
        private static final int f6655j = 2;

        /* renamed from: k */
        private static final int f6656k = 4;

        /* renamed from: l */
        private static final int f6657l = 8;

        /* renamed from: m */
        private static final int f6658m = 16;

        /* renamed from: n */
        private static final int f6659n = 5;

        /* renamed from: o */
        private static final int f6660o = 31;

        /* renamed from: a */
        private final List<C1733g> f6661a;

        /* renamed from: b */
        private final int[] f6662b;

        /* renamed from: c */
        private final int[] f6663c;

        /* renamed from: d */
        private final C1728b f6664d;

        /* renamed from: e */
        private final int f6665e;

        /* renamed from: f */
        private final int f6666f;

        /* renamed from: g */
        private final boolean f6667g;

        C1729c(C1728b bVar, List<C1733g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f6661a = list;
            this.f6662b = iArr;
            this.f6663c = iArr2;
            Arrays.fill(this.f6662b, 0);
            Arrays.fill(this.f6663c, 0);
            this.f6664d = bVar;
            this.f6665e = bVar.mo7769b();
            this.f6666f = bVar.mo7767a();
            this.f6667g = z;
            m9336b();
            m9339c();
        }

        /* renamed from: a */
        private void m9333a(int i, int i2, int i3) {
            if (this.f6662b[i - 1] == 0) {
                m9335a(i, i2, i3, false);
            }
        }

        /* renamed from: b */
        private void m9336b() {
            C1733g gVar = this.f6661a.isEmpty() ? null : (C1733g) this.f6661a.get(0);
            if (gVar == null || gVar.f6675a != 0 || gVar.f6676b != 0) {
                C1733g gVar2 = new C1733g();
                gVar2.f6675a = 0;
                gVar2.f6676b = 0;
                gVar2.f6678d = false;
                gVar2.f6677c = 0;
                gVar2.f6679e = false;
                this.f6661a.add(0, gVar2);
            }
        }

        /* renamed from: c */
        private void m9339c() {
            int i = this.f6665e;
            int i2 = this.f6666f;
            for (int size = this.f6661a.size() - 1; size >= 0; size--) {
                C1733g gVar = (C1733g) this.f6661a.get(size);
                int i3 = gVar.f6675a;
                int i4 = gVar.f6677c;
                int i5 = i3 + i4;
                int i6 = gVar.f6676b + i4;
                if (this.f6667g) {
                    while (i > i5) {
                        m9333a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m9337b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < gVar.f6677c; i7++) {
                    int i8 = gVar.f6675a + i7;
                    int i9 = gVar.f6676b + i7;
                    int i10 = this.f6664d.mo7768a(i8, i9) ? 1 : 2;
                    this.f6662b[i8] = (i9 << 5) | i10;
                    this.f6663c[i9] = (i8 << 5) | i10;
                }
                i = gVar.f6675a;
                i2 = gVar.f6676b;
            }
        }

        /* renamed from: a */
        public int mo7879a(@C0237z(from = 0) int i) {
            if (i < 0 || i >= this.f6666f) {
                StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", new list size = ");
                sb.append(this.f6666f);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.f6663c[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        /* renamed from: a */
        private boolean m9335a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1733g gVar = (C1733g) this.f6661a.get(i3);
                int i6 = gVar.f6675a;
                int i7 = gVar.f6677c;
                int i8 = i6 + i7;
                int i9 = gVar.f6676b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.f6664d.mo7770b(i11, i4)) {
                            if (!this.f6664d.mo7768a(i11, i4)) {
                                i10 = 4;
                            }
                            this.f6663c[i4] = (i11 << 5) | 16;
                            this.f6662b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f6664d.mo7770b(i4, i12)) {
                            if (!this.f6664d.mo7768a(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f6662b[i13] = (i12 << 5) | 16;
                            this.f6663c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = gVar.f6675a;
                i2 = gVar.f6676b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m9337b(int i, int i2, int i3) {
            if (this.f6663c[i2 - 1] == 0) {
                m9335a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        public int mo7883b(@C0237z(from = 0) int i) {
            if (i < 0 || i >= this.f6665e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", old list size = ");
                sb.append(this.f6665e);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.f6662b[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        /* renamed from: b */
        private void m9338b(List<C1731e> list, C1765t tVar, int i, int i2, int i3) {
            if (!this.f6667g) {
                tVar.mo7721c(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f6662b[i5] & 31;
                if (i6 == 0) {
                    tVar.mo7721c(i + i4, 1);
                    for (C1731e eVar : list) {
                        eVar.f6669b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f6662b[i5] >> 5;
                    C1731e a = m9332a(list, i7, false);
                    tVar.mo7718a(i + i4, a.f6669b - 1);
                    if (i6 == 4) {
                        tVar.mo7719a(a.f6669b - 1, 1, this.f6664d.mo7771c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1731e(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(C3868i.f12248b);
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: a */
        public void mo7881a(@C0193h0 C1638g gVar) {
            mo7882a((C1765t) new C1678b(gVar));
        }

        /* renamed from: a */
        public void mo7882a(@C0193h0 C1765t tVar) {
            C1702f fVar;
            if (tVar instanceof C1702f) {
                fVar = (C1702f) tVar;
            } else {
                fVar = new C1702f(tVar);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f6665e;
            int i2 = this.f6666f;
            for (int size = this.f6661a.size() - 1; size >= 0; size--) {
                C1733g gVar = (C1733g) this.f6661a.get(size);
                int i3 = gVar.f6677c;
                int i4 = gVar.f6675a + i3;
                int i5 = gVar.f6676b + i3;
                if (i4 < i) {
                    m9338b(arrayList, fVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m9334a(arrayList, fVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f6662b;
                    int i7 = gVar.f6675a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        fVar.mo7719a(i7 + i6, 1, this.f6664d.mo7771c(i7 + i6, gVar.f6676b + i6));
                    }
                }
                i = gVar.f6675a;
                i2 = gVar.f6676b;
            }
            fVar.mo7798a();
        }

        /* renamed from: a */
        private static C1731e m9332a(List<C1731e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1731e eVar = (C1731e) list.get(size);
                if (eVar.f6668a == i && eVar.f6670c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C1731e eVar2 = (C1731e) list.get(size);
                        eVar2.f6669b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m9334a(List<C1731e> list, C1765t tVar, int i, int i2, int i3) {
            if (!this.f6667g) {
                tVar.mo7720b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f6663c[i5] & 31;
                if (i6 == 0) {
                    tVar.mo7720b(i, 1);
                    for (C1731e eVar : list) {
                        eVar.f6669b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f6663c[i5] >> 5;
                    tVar.mo7718a(m9332a(list, i7, true).f6669b, i);
                    if (i6 == 4) {
                        tVar.mo7719a(i, 1, this.f6664d.mo7771c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1731e(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(C3868i.f12248b);
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        @C0224v0
        /* renamed from: a */
        public List<C1733g> mo7880a() {
            return this.f6661a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$d */
    /* compiled from: DiffUtil */
    public static abstract class C1730d<T> {
        /* renamed from: a */
        public abstract boolean mo7884a(@C0193h0 T t, @C0193h0 T t2);

        /* renamed from: b */
        public abstract boolean mo7885b(@C0193h0 T t, @C0193h0 T t2);

        @C0195i0
        /* renamed from: c */
        public Object mo7886c(@C0193h0 T t, @C0193h0 T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$e */
    /* compiled from: DiffUtil */
    private static class C1731e {

        /* renamed from: a */
        int f6668a;

        /* renamed from: b */
        int f6669b;

        /* renamed from: c */
        boolean f6670c;

        public C1731e(int i, int i2, boolean z) {
            this.f6668a = i;
            this.f6669b = i2;
            this.f6670c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$f */
    /* compiled from: DiffUtil */
    static class C1732f {

        /* renamed from: a */
        int f6671a;

        /* renamed from: b */
        int f6672b;

        /* renamed from: c */
        int f6673c;

        /* renamed from: d */
        int f6674d;

        public C1732f() {
        }

        public C1732f(int i, int i2, int i3, int i4) {
            this.f6671a = i;
            this.f6672b = i2;
            this.f6673c = i3;
            this.f6674d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.i$g */
    /* compiled from: DiffUtil */
    static class C1733g {

        /* renamed from: a */
        int f6675a;

        /* renamed from: b */
        int f6676b;

        /* renamed from: c */
        int f6677c;

        /* renamed from: d */
        boolean f6678d;

        /* renamed from: e */
        boolean f6679e;

        C1733g() {
        }
    }

    private C1726i() {
    }

    @C0193h0
    /* renamed from: a */
    public static C1729c m9323a(@C0193h0 C1728b bVar) {
        return m9324a(bVar, true);
    }

    @C0193h0
    /* renamed from: a */
    public static C1729c m9324a(@C0193h0 C1728b bVar, boolean z) {
        C1732f fVar;
        int b = bVar.mo7769b();
        int a = bVar.mo7767a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1732f(0, b, 0, a));
        int abs = Math.abs(b - a) + b + a;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1732f fVar2 = (C1732f) arrayList2.remove(arrayList2.size() - 1);
            C1733g a2 = m9325a(bVar, fVar2.f6671a, fVar2.f6672b, fVar2.f6673c, fVar2.f6674d, iArr, iArr2, abs);
            if (a2 != null) {
                if (a2.f6677c > 0) {
                    arrayList.add(a2);
                }
                a2.f6675a += fVar2.f6671a;
                a2.f6676b += fVar2.f6673c;
                if (arrayList3.isEmpty()) {
                    fVar = new C1732f();
                } else {
                    fVar = (C1732f) arrayList3.remove(arrayList3.size() - 1);
                }
                fVar.f6671a = fVar2.f6671a;
                fVar.f6673c = fVar2.f6673c;
                if (a2.f6679e) {
                    fVar.f6672b = a2.f6675a;
                    fVar.f6674d = a2.f6676b;
                } else if (a2.f6678d) {
                    fVar.f6672b = a2.f6675a - 1;
                    fVar.f6674d = a2.f6676b;
                } else {
                    fVar.f6672b = a2.f6675a;
                    fVar.f6674d = a2.f6676b - 1;
                }
                arrayList2.add(fVar);
                if (!a2.f6679e) {
                    int i2 = a2.f6675a;
                    int i3 = a2.f6677c;
                    fVar2.f6671a = i2 + i3;
                    fVar2.f6673c = a2.f6676b + i3;
                } else if (a2.f6678d) {
                    int i4 = a2.f6675a;
                    int i5 = a2.f6677c;
                    fVar2.f6671a = i4 + i5 + 1;
                    fVar2.f6673c = a2.f6676b + i5;
                } else {
                    int i6 = a2.f6675a;
                    int i7 = a2.f6677c;
                    fVar2.f6671a = i6 + i7;
                    fVar2.f6673c = a2.f6676b + i7 + 1;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
        }
        Collections.sort(arrayList, f6652a);
        C1729c cVar = new C1729c(bVar, arrayList, iArr, iArr2, z);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C1726i.C1733g m9325a(androidx.recyclerview.widget.C1726i.C1728b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0133
            if (r4 >= r5) goto L_0x0011
            goto L_0x0133
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.mo7770b(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009c
            androidx.recyclerview.widget.i$g r0 = new androidx.recyclerview.widget.i$g
            r0.<init>()
            r3 = r2[r5]
            r0.f6675a = r3
            int r3 = r0.f6675a
            int r3 = r3 - r12
            r0.f6676b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f6677c = r1
            r0.f6678d = r14
            r5 = 0
            r0.f6679e = r5
            return r0
        L_0x009c:
            r5 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r5 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r6
            int r13 = r9 + r6
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r6
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r5 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.mo7770b(r5, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r5 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r5 = r1[r3]
            r13 = r2[r3]
            if (r5 < r13) goto L_0x0119
            androidx.recyclerview.widget.i$g r0 = new androidx.recyclerview.widget.i$g
            r0.<init>()
            r4 = r2[r3]
            r0.f6675a = r4
            int r4 = r0.f6675a
            int r4 = r4 - r12
            r0.f6676b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f6677c = r1
            r0.f6678d = r14
            r3 = 1
            r0.f6679e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r5 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1726i.m9325a(androidx.recyclerview.widget.i$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.i$g");
    }
}
