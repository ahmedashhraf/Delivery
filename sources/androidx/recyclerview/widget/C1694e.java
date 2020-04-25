package androidx.recyclerview.widget;

import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0222u0;
import androidx.annotation.C0226w0;
import androidx.recyclerview.widget.C1699e0.C1700a;
import androidx.recyclerview.widget.C1699e0.C1701b;
import androidx.recyclerview.widget.C1703f0.C1704a;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: AsyncListUtil */
public class C1694e<T> {

    /* renamed from: s */
    static final String f6503s = "AsyncListUtil";

    /* renamed from: t */
    static final boolean f6504t = false;

    /* renamed from: a */
    final Class<T> f6505a;

    /* renamed from: b */
    final int f6506b;

    /* renamed from: c */
    final C1697c<T> f6507c;

    /* renamed from: d */
    final C1698d f6508d;

    /* renamed from: e */
    final C1703f0<T> f6509e;

    /* renamed from: f */
    final C1701b<T> f6510f;

    /* renamed from: g */
    final C1700a<T> f6511g;

    /* renamed from: h */
    final int[] f6512h = new int[2];

    /* renamed from: i */
    final int[] f6513i = new int[2];

    /* renamed from: j */
    final int[] f6514j = new int[2];

    /* renamed from: k */
    boolean f6515k;

    /* renamed from: l */
    private int f6516l = 0;

    /* renamed from: m */
    int f6517m = 0;

    /* renamed from: n */
    int f6518n = 0;

    /* renamed from: o */
    int f6519o = this.f6518n;

    /* renamed from: p */
    final SparseIntArray f6520p = new SparseIntArray();

    /* renamed from: q */
    private final C1701b<T> f6521q = new C1695a();

    /* renamed from: r */
    private final C1700a<T> f6522r = new C1696b();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: AsyncListUtil */
    class C1695a implements C1701b<T> {
        C1695a() {
        }

        /* renamed from: a */
        public void mo7782a(int i, C1704a<T> aVar) {
            if (!m9183a(i)) {
                C1694e.this.f6511g.mo7787a(aVar);
                return;
            }
            C1704a a = C1694e.this.f6509e.mo7800a(aVar);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("duplicate tile @");
                sb.append(a.f6547b);
                sb.toString();
                C1694e.this.f6511g.mo7787a(a);
            }
            int i2 = aVar.f6547b + aVar.f6548c;
            int i3 = 0;
            while (i3 < C1694e.this.f6520p.size()) {
                int keyAt = C1694e.this.f6520p.keyAt(i3);
                if (aVar.f6547b > keyAt || keyAt >= i2) {
                    i3++;
                } else {
                    C1694e.this.f6520p.removeAt(i3);
                    C1694e.this.f6508d.mo7793a(keyAt);
                }
            }
        }

        /* renamed from: b */
        public void mo7783b(int i, int i2) {
            if (m9183a(i)) {
                C1694e eVar = C1694e.this;
                eVar.f6517m = i2;
                eVar.f6508d.mo7792a();
                C1694e eVar2 = C1694e.this;
                eVar2.f6518n = eVar2.f6519o;
                m9182a();
                C1694e eVar3 = C1694e.this;
                eVar3.f6515k = false;
                eVar3.mo7780d();
            }
        }

        /* renamed from: a */
        public void mo7781a(int i, int i2) {
            if (m9183a(i)) {
                C1704a c = C1694e.this.f6509e.mo7804c(i2);
                if (c == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("tile not found @");
                    sb.append(i2);
                    sb.toString();
                    return;
                }
                C1694e.this.f6511g.mo7787a(c);
            }
        }

        /* renamed from: a */
        private void m9182a() {
            for (int i = 0; i < C1694e.this.f6509e.mo7802b(); i++) {
                C1694e eVar = C1694e.this;
                eVar.f6511g.mo7787a(eVar.f6509e.mo7799a(i));
            }
            C1694e.this.f6509e.mo7801a();
        }

        /* renamed from: a */
        private boolean m9183a(int i) {
            return i == C1694e.this.f6519o;
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: AsyncListUtil */
    class C1696b implements C1700a<T> {

        /* renamed from: a */
        private C1704a<T> f6524a;

        /* renamed from: b */
        final SparseBooleanArray f6525b = new SparseBooleanArray();

        /* renamed from: c */
        private int f6526c;

        /* renamed from: d */
        private int f6527d;

        /* renamed from: e */
        private int f6528e;

        /* renamed from: f */
        private int f6529f;

        C1696b() {
        }

        /* renamed from: b */
        private void m9191b(C1704a<T> aVar) {
            this.f6525b.put(aVar.f6547b, true);
            C1694e.this.f6510f.mo7782a(this.f6526c, aVar);
        }

        /* renamed from: c */
        private int m9192c(int i) {
            return i - (i % C1694e.this.f6506b);
        }

        /* renamed from: d */
        private boolean m9193d(int i) {
            return this.f6525b.get(i);
        }

        /* renamed from: e */
        private void m9194e(int i) {
            this.f6525b.delete(i);
            C1694e.this.f6510f.mo7781a(this.f6526c, i);
        }

        /* renamed from: a */
        public void mo7784a(int i) {
            this.f6526c = i;
            this.f6525b.clear();
            this.f6527d = C1694e.this.f6507c.mo7791b();
            C1694e.this.f6510f.mo7783b(this.f6526c, this.f6527d);
        }

        /* renamed from: b */
        private void m9190b(int i) {
            int a = C1694e.this.f6507c.mo7788a();
            while (this.f6525b.size() >= a) {
                int keyAt = this.f6525b.keyAt(0);
                SparseBooleanArray sparseBooleanArray = this.f6525b;
                int keyAt2 = sparseBooleanArray.keyAt(sparseBooleanArray.size() - 1);
                int i2 = this.f6528e - keyAt;
                int i3 = keyAt2 - this.f6529f;
                if (i2 > 0 && (i2 >= i3 || i == 2)) {
                    m9194e(keyAt);
                } else if (i3 <= 0) {
                    return;
                } else {
                    if (i2 < i3 || i == 1) {
                        m9194e(keyAt2);
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo7786a(int i, int i2, int i3, int i4, int i5) {
            if (i <= i2) {
                int c = m9192c(i);
                int c2 = m9192c(i2);
                this.f6528e = m9192c(i3);
                this.f6529f = m9192c(i4);
                if (i5 == 1) {
                    m9188a(this.f6528e, c2, i5, true);
                    m9188a(c2 + C1694e.this.f6506b, this.f6529f, i5, false);
                } else {
                    m9188a(c, this.f6529f, i5, false);
                    m9188a(this.f6528e, c - C1694e.this.f6506b, i5, true);
                }
            }
        }

        /* renamed from: a */
        private void m9188a(int i, int i2, int i3, boolean z) {
            int i4 = i;
            while (i4 <= i2) {
                C1694e.this.f6511g.mo7785a(z ? (i2 + i) - i4 : i4, i3);
                i4 += C1694e.this.f6506b;
            }
        }

        /* renamed from: a */
        public void mo7785a(int i, int i2) {
            if (!m9193d(i)) {
                C1704a a = m9187a();
                a.f6547b = i;
                a.f6548c = Math.min(C1694e.this.f6506b, this.f6527d - a.f6547b);
                C1694e.this.f6507c.mo7790a(a.f6546a, a.f6547b, a.f6548c);
                m9190b(i2);
                m9191b(a);
            }
        }

        /* renamed from: a */
        public void mo7787a(C1704a<T> aVar) {
            C1694e.this.f6507c.mo7789a(aVar.f6546a, aVar.f6548c);
            aVar.f6549d = this.f6524a;
            this.f6524a = aVar;
        }

        /* renamed from: a */
        private C1704a<T> m9187a() {
            C1704a<T> aVar = this.f6524a;
            if (aVar != null) {
                this.f6524a = aVar.f6549d;
                return aVar;
            }
            C1694e eVar = C1694e.this;
            return new C1704a<>(eVar.f6505a, eVar.f6506b);
        }

        /* renamed from: a */
        private void m9189a(String str, Object... objArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("[BKGR] ");
            sb.append(String.format(str, objArr));
            sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: AsyncListUtil */
    public static abstract class C1697c<T> {
        @C0226w0
        /* renamed from: a */
        public int mo7788a() {
            return 10;
        }

        @C0226w0
        /* renamed from: a */
        public void mo7789a(@C0193h0 T[] tArr, int i) {
        }

        @C0226w0
        /* renamed from: a */
        public abstract void mo7790a(@C0193h0 T[] tArr, int i, int i2);

        @C0226w0
        /* renamed from: b */
        public abstract int mo7791b();
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* compiled from: AsyncListUtil */
    public static abstract class C1698d {

        /* renamed from: a */
        public static final int f6531a = 0;

        /* renamed from: b */
        public static final int f6532b = 1;

        /* renamed from: c */
        public static final int f6533c = 2;

        @C0222u0
        /* renamed from: a */
        public abstract void mo7792a();

        @C0222u0
        /* renamed from: a */
        public abstract void mo7793a(int i);

        @C0222u0
        /* renamed from: a */
        public abstract void mo7794a(@C0193h0 int[] iArr);

        @C0222u0
        /* renamed from: a */
        public void mo7795a(@C0193h0 int[] iArr, @C0193h0 int[] iArr2, int i) {
            int i2 = (iArr[1] - iArr[0]) + 1;
            int i3 = i2 / 2;
            iArr2[0] = iArr[0] - (i == 1 ? i2 : i3);
            int i4 = iArr[1];
            if (i != 2) {
                i2 = i3;
            }
            iArr2[1] = i4 + i2;
        }
    }

    public C1694e(@C0193h0 Class<T> cls, int i, @C0193h0 C1697c<T> cVar, @C0193h0 C1698d dVar) {
        this.f6505a = cls;
        this.f6506b = i;
        this.f6507c = cVar;
        this.f6508d = dVar;
        this.f6509e = new C1703f0<>(this.f6506b);
        C1766u uVar = new C1766u();
        this.f6510f = uVar.mo7797a(this.f6521q);
        this.f6511g = uVar.mo7796a(this.f6522r);
        mo7779c();
    }

    /* renamed from: e */
    private boolean m9175e() {
        return this.f6519o != this.f6518n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7777a(String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[MAIN] ");
        sb.append(String.format(str, objArr));
        sb.toString();
    }

    /* renamed from: b */
    public void mo7778b() {
        if (!m9175e()) {
            mo7780d();
            this.f6515k = true;
        }
    }

    /* renamed from: c */
    public void mo7779c() {
        this.f6520p.clear();
        C1700a<T> aVar = this.f6511g;
        int i = this.f6519o + 1;
        this.f6519o = i;
        aVar.mo7784a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7780d() {
        this.f6508d.mo7794a(this.f6512h);
        int[] iArr = this.f6512h;
        if (iArr[0] <= iArr[1] && iArr[0] >= 0 && iArr[1] < this.f6517m) {
            if (!this.f6515k) {
                this.f6516l = 0;
            } else {
                int i = iArr[0];
                int[] iArr2 = this.f6513i;
                if (i > iArr2[1] || iArr2[0] > iArr[1]) {
                    this.f6516l = 0;
                } else if (iArr[0] < iArr2[0]) {
                    this.f6516l = 1;
                } else if (iArr[0] > iArr2[0]) {
                    this.f6516l = 2;
                }
            }
            int[] iArr3 = this.f6513i;
            int[] iArr4 = this.f6512h;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
            this.f6508d.mo7795a(iArr4, this.f6514j, this.f6516l);
            int[] iArr5 = this.f6514j;
            iArr5[0] = Math.min(this.f6512h[0], Math.max(iArr5[0], 0));
            int[] iArr6 = this.f6514j;
            iArr6[1] = Math.max(this.f6512h[1], Math.min(iArr6[1], this.f6517m - 1));
            C1700a<T> aVar = this.f6511g;
            int[] iArr7 = this.f6512h;
            int i2 = iArr7[0];
            int i3 = iArr7[1];
            int[] iArr8 = this.f6514j;
            aVar.mo7786a(i2, i3, iArr8[0], iArr8[1], this.f6516l);
        }
    }

    @C0195i0
    /* renamed from: a */
    public T mo7776a(int i) {
        if (i < 0 || i >= this.f6517m) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is not within 0 and ");
            sb.append(this.f6517m);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        T b = this.f6509e.mo7803b(i);
        if (b == null && !m9175e()) {
            this.f6520p.put(i, 0);
        }
        return b;
    }

    /* renamed from: a */
    public int mo7775a() {
        return this.f6517m;
    }
}
