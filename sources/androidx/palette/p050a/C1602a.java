package androidx.palette.p050a;

import android.graphics.Color;
import android.util.TimingLogger;
import androidx.annotation.C0195i0;
import androidx.core.p018c.C0821b;
import androidx.palette.p050a.C1605b.C1609c;
import androidx.palette.p050a.C1605b.C1611e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: androidx.palette.a.a */
/* compiled from: ColorCutQuantizer */
final class C1602a {

    /* renamed from: g */
    private static final String f6082g = "ColorCutQuantizer";

    /* renamed from: h */
    private static final boolean f6083h = false;

    /* renamed from: i */
    static final int f6084i = -3;

    /* renamed from: j */
    static final int f6085j = -2;

    /* renamed from: k */
    static final int f6086k = -1;

    /* renamed from: l */
    private static final int f6087l = 5;

    /* renamed from: m */
    private static final int f6088m = 31;

    /* renamed from: n */
    private static final Comparator<C1604b> f6089n = new C1603a();

    /* renamed from: a */
    final int[] f6090a;

    /* renamed from: b */
    final int[] f6091b;

    /* renamed from: c */
    final List<C1611e> f6092c;
    @C0195i0

    /* renamed from: d */
    final TimingLogger f6093d = null;

    /* renamed from: e */
    final C1609c[] f6094e;

    /* renamed from: f */
    private final float[] f6095f = new float[3];

    /* renamed from: androidx.palette.a.a$a */
    /* compiled from: ColorCutQuantizer */
    static class C1603a implements Comparator<C1604b> {
        C1603a() {
        }

        /* renamed from: a */
        public int compare(C1604b bVar, C1604b bVar2) {
            return bVar2.mo6838g() - bVar.mo6838g();
        }
    }

    /* renamed from: androidx.palette.a.a$b */
    /* compiled from: ColorCutQuantizer */
    private class C1604b {

        /* renamed from: a */
        private int f6096a;

        /* renamed from: b */
        private int f6097b;

        /* renamed from: c */
        private int f6098c;

        /* renamed from: d */
        private int f6099d;

        /* renamed from: e */
        private int f6100e;

        /* renamed from: f */
        private int f6101f;

        /* renamed from: g */
        private int f6102g;

        /* renamed from: h */
        private int f6103h;

        /* renamed from: i */
        private int f6104i;

        C1604b(int i, int i2) {
            this.f6096a = i;
            this.f6097b = i2;
            mo6834c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6832a() {
            return mo6836e() > 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo6833b() {
            int f = mo6837f();
            C1602a aVar = C1602a.this;
            int[] iArr = aVar.f6090a;
            int[] iArr2 = aVar.f6091b;
            C1602a.m8140a(iArr, f, this.f6096a, this.f6097b);
            Arrays.sort(iArr, this.f6096a, this.f6097b + 1);
            C1602a.m8140a(iArr, f, this.f6096a, this.f6097b);
            int i = this.f6098c / 2;
            int i2 = this.f6096a;
            int i3 = 0;
            while (true) {
                int i4 = this.f6097b;
                if (i2 > i4) {
                    return this.f6096a;
                }
                i3 += iArr2[iArr[i2]];
                if (i3 >= i) {
                    return Math.min(i4 - 1, i2);
                }
                i2++;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo6834c() {
            C1602a aVar = C1602a.this;
            int[] iArr = aVar.f6090a;
            int[] iArr2 = aVar.f6091b;
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            int i7 = 0;
            for (int i8 = this.f6096a; i8 <= this.f6097b; i8++) {
                int i9 = iArr[i8];
                i7 += iArr2[i9];
                int f = C1602a.m8148f(i9);
                int e = C1602a.m8147e(i9);
                int d = C1602a.m8146d(i9);
                if (f > i2) {
                    i2 = f;
                }
                if (f < i) {
                    i = f;
                }
                if (e > i4) {
                    i4 = e;
                }
                if (e < i3) {
                    i3 = e;
                }
                if (d > i6) {
                    i6 = d;
                }
                if (d < i5) {
                    i5 = d;
                }
            }
            this.f6099d = i;
            this.f6100e = i2;
            this.f6101f = i3;
            this.f6102g = i4;
            this.f6103h = i5;
            this.f6104i = i6;
            this.f6098c = i7;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C1611e mo6835d() {
            C1602a aVar = C1602a.this;
            int[] iArr = aVar.f6090a;
            int[] iArr2 = aVar.f6091b;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = this.f6096a; i5 <= this.f6097b; i5++) {
                int i6 = iArr[i5];
                int i7 = iArr2[i6];
                i2 += i7;
                i += C1602a.m8148f(i6) * i7;
                i3 += C1602a.m8147e(i6) * i7;
                i4 += i7 * C1602a.m8146d(i6);
            }
            float f = (float) i2;
            return new C1611e(C1602a.m8137a(Math.round(((float) i) / f), Math.round(((float) i3) / f), Math.round(((float) i4) / f)), i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final int mo6836e() {
            return (this.f6097b + 1) - this.f6096a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public final int mo6837f() {
            int i = this.f6100e - this.f6099d;
            int i2 = this.f6102g - this.f6101f;
            int i3 = this.f6104i - this.f6103h;
            if (i < i2 || i < i3) {
                return (i2 < i || i2 < i3) ? -1 : -2;
            }
            return -3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public final int mo6838g() {
            return ((this.f6100e - this.f6099d) + 1) * ((this.f6102g - this.f6101f) + 1) * ((this.f6104i - this.f6103h) + 1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public final C1604b mo6839h() {
            if (mo6832a()) {
                int b = mo6833b();
                C1604b bVar = new C1604b(b + 1, this.f6097b);
                this.f6097b = b;
                mo6834c();
                return bVar;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

    C1602a(int[] iArr, int i, C1609c[] cVarArr) {
        this.f6094e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f6091b = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int b = m8143b(iArr[i2]);
            iArr[i2] = b;
            iArr2[b] = iArr2[b] + 1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < iArr2.length; i4++) {
            if (iArr2[i4] > 0 && m8149g(i4)) {
                iArr2[i4] = 0;
            }
            if (iArr2[i4] > 0) {
                i3++;
            }
        }
        int[] iArr3 = new int[i3];
        this.f6090a = iArr3;
        int i5 = 0;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            if (iArr2[i6] > 0) {
                int i7 = i5 + 1;
                iArr3[i5] = i6;
                i5 = i7;
            }
        }
        if (i3 <= i) {
            this.f6092c = new ArrayList();
            for (int i8 : iArr3) {
                this.f6092c.add(new C1611e(m8136a(i8), iArr2[i8]));
            }
            return;
        }
        this.f6092c = m8145c(i);
    }

    /* renamed from: b */
    private static int m8143b(int i) {
        return m8144b(Color.blue(i), 8, 5) | (m8144b(Color.red(i), 8, 5) << 10) | (m8144b(Color.green(i), 8, 5) << 5);
    }

    /* renamed from: b */
    private static int m8144b(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: c */
    private List<C1611e> m8145c(int i) {
        PriorityQueue priorityQueue = new PriorityQueue(i, f6089n);
        priorityQueue.offer(new C1604b(0, this.f6090a.length - 1));
        m8139a(priorityQueue, i);
        return m8138a((Collection<C1604b>) priorityQueue);
    }

    /* renamed from: d */
    static int m8146d(int i) {
        return i & 31;
    }

    /* renamed from: e */
    static int m8147e(int i) {
        return (i >> 5) & 31;
    }

    /* renamed from: f */
    static int m8148f(int i) {
        return (i >> 10) & 31;
    }

    /* renamed from: g */
    private boolean m8149g(int i) {
        int a = m8136a(i);
        C0821b.m4799a(a, this.f6095f);
        return m8141a(a, this.f6095f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C1611e> mo6829a() {
        return this.f6092c;
    }

    /* renamed from: a */
    private void m8139a(PriorityQueue<C1604b> priorityQueue, int i) {
        while (priorityQueue.size() < i) {
            C1604b bVar = (C1604b) priorityQueue.poll();
            if (bVar != null && bVar.mo6832a()) {
                priorityQueue.offer(bVar.mo6839h());
                priorityQueue.offer(bVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private List<C1611e> m8138a(Collection<C1604b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C1604b d : collection) {
            C1611e d2 = d.mo6835d();
            if (!m8142a(d2)) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static void m8140a(int[] iArr, int i, int i2, int i3) {
        if (i == -3) {
            return;
        }
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = m8146d(i4) | (m8147e(i4) << 10) | (m8148f(i4) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = m8148f(i5) | (m8146d(i5) << 10) | (m8147e(i5) << 5);
                i2++;
            }
        }
    }

    /* renamed from: a */
    private boolean m8142a(C1611e eVar) {
        return m8141a(eVar.mo6879d(), eVar.mo6877b());
    }

    /* renamed from: a */
    private boolean m8141a(int i, float[] fArr) {
        C1609c[] cVarArr = this.f6094e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (!this.f6094e[i2].mo6859a(i, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    static int m8137a(int i, int i2, int i3) {
        return Color.rgb(m8144b(i, 5, 8), m8144b(i2, 5, 8), m8144b(i3, 5, 8));
    }

    /* renamed from: a */
    private static int m8136a(int i) {
        return m8137a(m8148f(i), m8147e(i), m8146d(i));
    }
}
