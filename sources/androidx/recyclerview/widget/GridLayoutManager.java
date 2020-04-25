package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.p034l.p035o0.C1016d;
import androidx.core.p034l.p035o0.C1016d.C1019c;
import androidx.recyclerview.widget.RecyclerView.C1651o;
import androidx.recyclerview.widget.RecyclerView.C1651o.C1654c;
import androidx.recyclerview.widget.RecyclerView.C1656p;
import androidx.recyclerview.widget.RecyclerView.C1664w;
import androidx.recyclerview.widget.RecyclerView.State;
import java.util.Arrays;
import p076c.p112d.p148d.p150g.C6637f;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: X */
    private static final boolean f6170X = false;

    /* renamed from: Y */
    private static final String f6171Y = "GridLayoutManager";

    /* renamed from: Z */
    public static final int f6172Z = -1;

    /* renamed from: O */
    boolean f6173O = false;

    /* renamed from: P */
    int f6174P = -1;

    /* renamed from: Q */
    int[] f6175Q;

    /* renamed from: R */
    View[] f6176R;

    /* renamed from: S */
    final SparseIntArray f6177S = new SparseIntArray();

    /* renamed from: T */
    final SparseIntArray f6178T = new SparseIntArray();

    /* renamed from: U */
    C1620c f6179U = new C1618a();

    /* renamed from: V */
    final Rect f6180V = new Rect();

    /* renamed from: W */
    private boolean f6181W;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1618a extends C1620c {
        /* renamed from: a */
        public int mo6941a(int i) {
            return 1;
        }

        /* renamed from: d */
        public int mo6942d(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1619b extends C1656p {

        /* renamed from: g */
        public static final int f6182g = -1;

        /* renamed from: e */
        int f6183e = -1;

        /* renamed from: f */
        int f6184f = 0;

        public C1619b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: h */
        public int mo6943h() {
            return this.f6183e;
        }

        /* renamed from: i */
        public int mo6944i() {
            return this.f6184f;
        }

        public C1619b(int i, int i2) {
            super(i, i2);
        }

        public C1619b(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1619b(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1619b(C1656p pVar) {
            super(pVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class C1620c {

        /* renamed from: a */
        final SparseIntArray f6185a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f6186b = new SparseIntArray();

        /* renamed from: c */
        private boolean f6187c = false;

        /* renamed from: d */
        private boolean f6188d = false;

        /* renamed from: a */
        public abstract int mo6941a(int i);

        /* renamed from: a */
        public void mo6947a(boolean z) {
            if (!z) {
                this.f6186b.clear();
            }
            this.f6188d = z;
        }

        /* renamed from: b */
        public void mo6950b(boolean z) {
            if (!z) {
                this.f6186b.clear();
            }
            this.f6187c = z;
        }

        /* renamed from: c */
        public boolean mo6952c() {
            return this.f6188d;
        }

        /* renamed from: d */
        public boolean mo6953d() {
            return this.f6187c;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6951c(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f6188d
                r1 = 0
                if (r0 == 0) goto L_0x0026
                android.util.SparseIntArray r0 = r6.f6186b
                int r0 = m8301a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0026
                android.util.SparseIntArray r2 = r6.f6186b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo6948b(r0, r8)
                int r0 = r6.mo6941a(r0)
                int r0 = r0 + r4
                if (r0 != r8) goto L_0x0029
                int r0 = r2 + 1
                r2 = r0
                r0 = 0
                goto L_0x0029
            L_0x0026:
                r0 = 0
                r2 = 0
                r3 = 0
            L_0x0029:
                int r4 = r6.mo6941a(r7)
            L_0x002d:
                if (r3 >= r7) goto L_0x0042
                int r5 = r6.mo6941a(r3)
                int r0 = r0 + r5
                if (r0 != r8) goto L_0x003a
                int r2 = r2 + 1
                r0 = 0
                goto L_0x003f
            L_0x003a:
                if (r0 <= r8) goto L_0x003f
                int r2 = r2 + 1
                r0 = r5
            L_0x003f:
                int r3 = r3 + 1
                goto L_0x002d
            L_0x0042:
                int r0 = r0 + r4
                if (r0 <= r8) goto L_0x0047
                int r2 = r2 + 1
            L_0x0047:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1620c.mo6951c(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[RETURN] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6942d(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.mo6941a(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.f6187c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.f6185a
                int r2 = m8301a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.f6185a
                int r3 = r3.get(r2)
                int r4 = r5.mo6941a(r2)
                int r3 = r3 + r4
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r3 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r4 = r5.mo6941a(r2)
                int r3 = r3 + r4
                if (r3 != r7) goto L_0x002d
                r3 = 0
                goto L_0x0030
            L_0x002d:
                if (r3 <= r7) goto L_0x0030
                r3 = r4
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r3
                if (r0 > r7) goto L_0x0037
                return r3
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1620c.mo6942d(int, int):int");
        }

        /* renamed from: a */
        public void mo6946a() {
            this.f6186b.clear();
        }

        /* renamed from: b */
        public void mo6949b() {
            this.f6185a.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo6945a(int i, int i2) {
            if (!this.f6188d) {
                return mo6951c(i, i2);
            }
            int i3 = this.f6186b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo6951c(i, i2);
            this.f6186b.put(i, c);
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo6948b(int i, int i2) {
            if (!this.f6187c) {
                return mo6942d(i, i2);
            }
            int i3 = this.f6185a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo6942d(i, i2);
            this.f6185a.put(i, d);
            return d;
        }

        /* renamed from: a */
        static int m8301a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo6940m(C1651o.m8612a(context, attributeSet, i, i2).f6345b);
    }

    /* renamed from: c0 */
    private void m8255c0() {
        int e = mo7467e();
        for (int i = 0; i < e; i++) {
            C1619b bVar = (C1619b) mo7462d(i).getLayoutParams();
            int b = bVar.mo7519b();
            this.f6177S.put(b, bVar.mo6944i());
            this.f6178T.put(b, bVar.mo6943h());
        }
    }

    /* renamed from: d0 */
    private void m8256d0() {
        this.f6177S.clear();
        this.f6178T.clear();
    }

    /* renamed from: e0 */
    private void m8257e0() {
        View[] viewArr = this.f6176R;
        if (viewArr == null || viewArr.length != this.f6174P) {
            this.f6176R = new View[this.f6174P];
        }
    }

    /* renamed from: f0 */
    private void m8258f0() {
        int i;
        int i2;
        if (mo6963R() == 1) {
            i2 = mo7503t() - mo7497q();
            i = mo7495p();
        } else {
            i2 = mo7478h() - mo7491n();
            i = mo7501s();
        }
        m8261n(i2 - i);
    }

    /* renamed from: i */
    private int m8259i(State state) {
        int i;
        if (!(mo7467e() == 0 || state.getItemCount() == 0)) {
            mo6957L();
            boolean W = mo6968W();
            View b = mo6984b(!W, true);
            View a = mo6975a(!W, true);
            if (!(b == null || a == null)) {
                int a2 = this.f6179U.mo6945a(mo7496p(b), this.f6174P);
                int a3 = this.f6179U.mo6945a(mo7496p(a), this.f6174P);
                int min = Math.min(a2, a3);
                int max = Math.max(a2, a3);
                int a4 = this.f6179U.mo6945a(state.getItemCount() - 1, this.f6174P) + 1;
                if (this.f6208x) {
                    i = Math.max(0, (a4 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!W) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f6205u.mo8012a(a) - this.f6205u.mo8019d(b))) / ((float) ((this.f6179U.mo6945a(mo7496p(a), this.f6174P) - this.f6179U.mo6945a(mo7496p(b), this.f6174P)) + 1)))) + ((float) (this.f6205u.mo8025g() - this.f6205u.mo8019d(b))));
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m8260j(State state) {
        if (!(mo7467e() == 0 || state.getItemCount() == 0)) {
            mo6957L();
            View b = mo6984b(!mo6968W(), true);
            View a = mo6975a(!mo6968W(), true);
            if (!(b == null || a == null)) {
                if (!mo6968W()) {
                    return this.f6179U.mo6945a(state.getItemCount() - 1, this.f6174P) + 1;
                }
                int a2 = this.f6205u.mo8012a(a) - this.f6205u.mo8019d(b);
                int a3 = this.f6179U.mo6945a(mo7496p(b), this.f6174P);
                return (int) ((((float) a2) / ((float) ((this.f6179U.mo6945a(mo7496p(a), this.f6174P) - a3) + 1))) * ((float) (this.f6179U.mo6945a(state.getItemCount() - 1, this.f6174P) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: n */
    private void m8261n(int i) {
        this.f6175Q = m8251a(this.f6175Q, this.f6174P, i);
    }

    /* renamed from: J */
    public boolean mo6906J() {
        return this.f6198D == null && !this.f6173O;
    }

    /* renamed from: Z */
    public int mo6907Z() {
        return this.f6174P;
    }

    /* renamed from: a */
    public int mo6909a(C1664w wVar, State state) {
        if (this.f6203s == 1) {
            return this.f6174P;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m8246a(wVar, state, state.getItemCount() - 1) + 1;
    }

    /* renamed from: a0 */
    public C1620c mo6924a0() {
        return this.f6179U;
    }

    /* renamed from: b */
    public int mo6927b(C1664w wVar, State state) {
        if (this.f6203s == 0) {
            return this.f6174P;
        }
        if (state.getItemCount() < 1) {
            return 0;
        }
        return m8246a(wVar, state, state.getItemCount() - 1) + 1;
    }

    /* renamed from: b0 */
    public boolean mo6929b0() {
        return this.f6181W;
    }

    /* renamed from: c */
    public C1656p mo6931c() {
        if (this.f6203s == 0) {
            return new C1619b(-2, -1);
        }
        return new C1619b(-1, -2);
    }

    /* renamed from: d */
    public void mo6932d(RecyclerView recyclerView) {
        this.f6179U.mo6949b();
        this.f6179U.mo6946a();
    }

    /* renamed from: e */
    public void mo6934e(C1664w wVar, State state) {
        if (state.isPreLayout()) {
            m8255c0();
        }
        super.mo6934e(wVar, state);
        m8256d0();
    }

    /* renamed from: f */
    public int mo6935f(State state) {
        if (this.f6181W) {
            return m8260j(state);
        }
        return super.mo6935f(state);
    }

    /* renamed from: g */
    public void mo6938g(boolean z) {
        if (!z) {
            super.mo6938g(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: h */
    public void mo6939h(boolean z) {
        this.f6181W = z;
    }

    /* renamed from: m */
    public void mo6940m(int i) {
        if (i != this.f6174P) {
            this.f6173O = true;
            if (i >= 1) {
                this.f6174P = i;
                this.f6179U.mo6949b();
                mo7401F();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: g */
    public void mo6937g(State state) {
        super.mo6937g(state);
        this.f6173O = false;
    }

    /* renamed from: c */
    private int m8254c(C1664w wVar, State state, int i) {
        if (!state.isPreLayout()) {
            return this.f6179U.mo6941a(i);
        }
        int i2 = this.f6177S.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wVar.mo7547a(i);
        if (a != -1) {
            return this.f6179U.mo6941a(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        sb.toString();
        return 1;
    }

    /* renamed from: a */
    public void mo6917a(C1664w wVar, State state, View view, C1016d dVar) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1619b)) {
            super.mo7412a(view, dVar);
            return;
        }
        C1619b bVar = (C1619b) layoutParams;
        int a = m8246a(wVar, state, bVar.mo7519b());
        if (this.f6203s == 0) {
            dVar.mo4949b((Object) C1019c.m5966a(bVar.mo6943h(), bVar.mo6944i(), a, 1, false, false));
        } else {
            dVar.mo4949b((Object) C1019c.m5966a(a, 1, bVar.mo6943h(), bVar.mo6944i(), false, false));
        }
    }

    /* renamed from: b */
    public void mo6928b(RecyclerView recyclerView, int i, int i2) {
        this.f6179U.mo6949b();
        this.f6179U.mo6946a();
    }

    /* renamed from: e */
    public int mo6933e(State state) {
        if (this.f6181W) {
            return m8259i(state);
        }
        return super.mo6933e(state);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo6936g(int i, int i2) {
        if (this.f6203s != 1 || !mo6967V()) {
            int[] iArr = this.f6175Q;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f6175Q;
        int i3 = this.f6174P;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: b */
    public int mo6925b(int i, C1664w wVar, State state) {
        m8258f0();
        m8257e0();
        return super.mo6925b(i, wVar, state);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo6940m(i);
    }

    /* renamed from: b */
    private void m8253b(C1664w wVar, State state, C1622a aVar, int i) {
        boolean z = i == 1;
        int b = m8252b(wVar, state, aVar.f6212b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f6212b;
                if (i2 > 0) {
                    aVar.f6212b = i2 - 1;
                    b = m8252b(wVar, state, aVar.f6212b);
                } else {
                    return;
                }
            }
            return;
        }
        int itemCount = state.getItemCount() - 1;
        int i3 = aVar.f6212b;
        while (i3 < itemCount) {
            int i4 = i3 + 1;
            int b2 = m8252b(wVar, state, i4);
            if (b2 <= b) {
                break;
            }
            i3 = i4;
            b = b2;
        }
        aVar.f6212b = i3;
    }

    /* renamed from: c */
    public int mo6930c(State state) {
        if (this.f6181W) {
            return m8260j(state);
        }
        return super.mo6930c(state);
    }

    /* renamed from: a */
    public void mo6920a(RecyclerView recyclerView, int i, int i2) {
        this.f6179U.mo6949b();
        this.f6179U.mo6946a();
    }

    /* renamed from: a */
    public void mo6922a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f6179U.mo6949b();
        this.f6179U.mo6946a();
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        mo6940m(i);
    }

    /* renamed from: b */
    private int m8252b(C1664w wVar, State state, int i) {
        if (!state.isPreLayout()) {
            return this.f6179U.mo6948b(i, this.f6174P);
        }
        int i2 = this.f6178T.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = wVar.mo7547a(i);
        if (a != -1) {
            return this.f6179U.mo6948b(a, this.f6174P);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        sb.toString();
        return 0;
    }

    /* renamed from: a */
    public void mo6921a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f6179U.mo6949b();
        this.f6179U.mo6946a();
    }

    /* renamed from: a */
    public C1656p mo6912a(Context context, AttributeSet attributeSet) {
        return new C1619b(context, attributeSet);
    }

    /* renamed from: a */
    public C1656p mo6913a(LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new C1619b((MarginLayoutParams) layoutParams);
        }
        return new C1619b(layoutParams);
    }

    /* renamed from: b */
    public int mo6926b(State state) {
        if (this.f6181W) {
            return m8259i(state);
        }
        return super.mo6926b(state);
    }

    /* renamed from: a */
    public boolean mo6923a(C1656p pVar) {
        return pVar instanceof C1619b;
    }

    /* renamed from: a */
    public void mo6915a(C1620c cVar) {
        this.f6179U = cVar;
    }

    /* renamed from: a */
    public void mo6914a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f6175Q == null) {
            super.mo6914a(rect, i, i2);
        }
        int p = mo7495p() + mo7497q();
        int s = mo7501s() + mo7491n();
        if (this.f6203s == 1) {
            i4 = C1651o.m8609a(i2, rect.height() + s, mo7487l());
            int[] iArr = this.f6175Q;
            i3 = C1651o.m8609a(i, iArr[iArr.length - 1] + p, mo7489m());
        } else {
            i3 = C1651o.m8609a(i, rect.width() + p, mo7489m());
            int[] iArr2 = this.f6175Q;
            i4 = C1651o.m8609a(i2, iArr2[iArr2.length - 1] + s, mo7487l());
        }
        mo7454c(i3, i4);
    }

    /* renamed from: a */
    static int[] m8251a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6918a(C1664w wVar, State state, C1622a aVar, int i) {
        super.mo6918a(wVar, state, aVar, i);
        m8258f0();
        if (state.getItemCount() > 0 && !state.isPreLayout()) {
            m8253b(wVar, state, aVar, i);
        }
        m8257e0();
    }

    /* renamed from: a */
    public int mo6908a(int i, C1664w wVar, State state) {
        m8258f0();
        m8257e0();
        return super.mo6908a(i, wVar, state);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo6911a(C1664w wVar, State state, int i, int i2, int i3) {
        mo6957L();
        int g = this.f6205u.mo8025g();
        int b = this.f6205u.mo8015b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d = mo7462d(i);
            int p = mo7496p(d);
            if (p >= 0 && p < i3 && m8252b(wVar, state, p) == 0) {
                if (((C1656p) d.getLayoutParams()).mo7522e()) {
                    if (view2 == null) {
                        view2 = d;
                    }
                } else if (this.f6205u.mo8019d(d) < b && this.f6205u.mo8012a(d) >= g) {
                    return d;
                } else {
                    if (view == null) {
                        view = d;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* renamed from: a */
    private int m8246a(C1664w wVar, State state, int i) {
        if (!state.isPreLayout()) {
            return this.f6179U.mo6945a(i, this.f6174P);
        }
        int a = wVar.mo7547a(i);
        if (a != -1) {
            return this.f6179U.mo6945a(a, this.f6174P);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        sb.toString();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6916a(State state, C1624c cVar, C1654c cVar2) {
        int i = this.f6174P;
        for (int i2 = 0; i2 < this.f6174P && cVar.mo7018a(state) && i > 0; i2++) {
            int i3 = cVar.f6230d;
            cVar2.mo7517a(i3, Math.max(0, cVar.f6233g));
            i -= this.f6179U.mo6941a(i3);
            cVar.f6230d += cVar.f6231e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6919a(C1664w wVar, State state, C1624c cVar, C1623b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1664w wVar2 = wVar;
        State state2 = state;
        C1624c cVar2 = cVar;
        C1623b bVar2 = bVar;
        int f = this.f6205u.mo8023f();
        boolean z = false;
        boolean z2 = f != 1073741824;
        int i11 = mo7467e() > 0 ? this.f6175Q[this.f6174P] : 0;
        if (z2) {
            m8258f0();
        }
        boolean z3 = cVar2.f6231e == 1;
        int i12 = this.f6174P;
        if (!z3) {
            i12 = m8252b(wVar2, state2, cVar2.f6230d) + m8254c(wVar2, state2, cVar2.f6230d);
        }
        int i13 = i12;
        int i14 = 0;
        while (i14 < this.f6174P && cVar2.mo7018a(state2) && i13 > 0) {
            int i15 = cVar2.f6230d;
            int c = m8254c(wVar2, state2, i15);
            if (c <= this.f6174P) {
                i13 -= c;
                if (i13 < 0) {
                    break;
                }
                View a = cVar2.mo7015a(wVar2);
                if (a == null) {
                    break;
                }
                this.f6176R[i14] = a;
                i14++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i15);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f6174P);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i14 == 0) {
            bVar2.f6217b = true;
            return;
        }
        float f2 = 0.0f;
        m8250a(wVar2, state2, i14, z3);
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            View view = this.f6176R[i16];
            if (cVar2.f6238l == null) {
                if (z3) {
                    mo7441b(view);
                } else {
                    mo7442b(view, (int) z);
                }
            } else if (z3) {
                mo7406a(view);
            } else {
                mo7407a(view, z ? 1 : 0);
            }
            mo7411a(view, this.f6180V);
            m8249a(view, f, z);
            int b = this.f6205u.mo8016b(view);
            if (b > i17) {
                i17 = b;
            }
            float c2 = (((float) this.f6205u.mo8018c(view)) * 1.0f) / ((float) ((C1619b) view.getLayoutParams()).f6184f);
            if (c2 > f2) {
                f2 = c2;
            }
            i16++;
            z = false;
        }
        if (z2) {
            m8247a(f2, i11);
            i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f6176R[i18];
                m8249a(view2, (int) C6637f.f18605b, true);
                int b2 = this.f6205u.mo8016b(view2);
                if (b2 > i17) {
                    i17 = b2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f6176R[i19];
            if (this.f6205u.mo8016b(view3) != i17) {
                C1619b bVar3 = (C1619b) view3.getLayoutParams();
                Rect rect = bVar3.f6349b;
                int i20 = rect.top + rect.bottom + bVar3.topMargin + bVar3.bottomMargin;
                int i21 = rect.left + rect.right + bVar3.leftMargin + bVar3.rightMargin;
                int g = mo6936g(bVar3.f6183e, bVar3.f6184f);
                if (this.f6203s == 1) {
                    i10 = C1651o.m8610a(g, (int) C6637f.f18605b, i21, bVar3.width, false);
                    i9 = MeasureSpec.makeMeasureSpec(i17 - i20, C6637f.f18605b);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i17 - i21, C6637f.f18605b);
                    i9 = C1651o.m8610a(g, (int) C6637f.f18605b, i20, bVar3.height, false);
                    i10 = makeMeasureSpec;
                }
                m8248a(view3, i10, i9, true);
            }
        }
        int i22 = 0;
        bVar2.f6216a = i17;
        if (this.f6203s == 1) {
            if (cVar2.f6232f == -1) {
                int i23 = cVar2.f6228b;
                i3 = i23 - i17;
                i2 = i23;
            } else {
                int i24 = cVar2.f6228b;
                i2 = i24 + i17;
                i3 = i24;
            }
            i4 = 0;
            i = 0;
        } else if (cVar2.f6232f == -1) {
            i = cVar2.f6228b;
            i4 = i - i17;
            i3 = 0;
            i2 = 0;
        } else {
            int i25 = cVar2.f6228b;
            int i26 = i25 + i17;
            i3 = 0;
            i2 = 0;
            int i27 = i25;
            i = i26;
            i4 = i27;
        }
        while (i22 < i14) {
            View view4 = this.f6176R[i22];
            C1619b bVar4 = (C1619b) view4.getLayoutParams();
            if (this.f6203s != 1) {
                int s = mo7501s() + this.f6175Q[bVar4.f6183e];
                i8 = i4;
                i7 = s;
                i5 = this.f6205u.mo8018c(view4) + s;
                i6 = i;
            } else if (mo6967V()) {
                int p = mo7495p() + this.f6175Q[this.f6174P - bVar4.f6183e];
                i6 = p;
                i7 = i3;
                i5 = i2;
                i8 = p - this.f6205u.mo8018c(view4);
            } else {
                int p2 = mo7495p() + this.f6175Q[bVar4.f6183e];
                i8 = p2;
                i7 = i3;
                i5 = i2;
                i6 = this.f6205u.mo8018c(view4) + p2;
            }
            mo7444b(view4, i8, i7, i6, i5);
            if (bVar4.mo7522e() || bVar4.mo7521d()) {
                bVar2.f6218c = true;
            }
            bVar2.f6219d |= view4.hasFocusable();
            i22++;
            i4 = i8;
            i3 = i7;
            i = i6;
            i2 = i5;
        }
        Arrays.fill(this.f6176R, null);
    }

    /* renamed from: a */
    private void m8249a(View view, int i, boolean z) {
        int i2;
        int i3;
        C1619b bVar = (C1619b) view.getLayoutParams();
        Rect rect = bVar.f6349b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int g = mo6936g(bVar.f6183e, bVar.f6184f);
        if (this.f6203s == 1) {
            i2 = C1651o.m8610a(g, i, i5, bVar.width, false);
            i3 = C1651o.m8610a(this.f6205u.mo8026h(), mo7481i(), i4, bVar.height, true);
        } else {
            int a = C1651o.m8610a(g, i, i4, bVar.height, false);
            int a2 = C1651o.m8610a(this.f6205u.mo8026h(), mo7505u(), i5, bVar.width, true);
            i3 = a;
            i2 = a2;
        }
        m8248a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m8247a(float f, int i) {
        m8261n(Math.max(Math.round(f * ((float) this.f6174P)), i));
    }

    /* renamed from: a */
    private void m8248a(View view, int i, int i2, boolean z) {
        boolean z2;
        C1656p pVar = (C1656p) view.getLayoutParams();
        if (z) {
            z2 = mo7451b(view, i, i2, pVar);
        } else {
            z2 = mo7428a(view, i, i2, pVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m8250a(C1664w wVar, State state, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f6176R[i3];
            C1619b bVar = (C1619b) view.getLayoutParams();
            bVar.f6184f = m8254c(wVar, state, mo7496p(view));
            bVar.f6183e = i4;
            i4 += bVar.f6184f;
            i3 += i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo6910a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1664w r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo7471f(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.C1619b) r5
            int r6 = r5.f6183e
            int r5 = r5.f6184f
            int r5 = r5 + r6
            android.view.View r7 = super.mo6910a(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo6998j(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f6208x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo7467e()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo7467e()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f6203s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo6967V()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m8246a(r1, r2, r7)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m8246a(r1, r2, r7)
            android.view.View r1 = r0.mo7462d(r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.C1619b) r9
            int r2 = r9.f6183e
            r18 = r3
            int r3 = r9.f6184f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo7430a(r1, r8, r11)
            r8 = r16
            if (r22 == 0) goto L_0x0100
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f6183e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f6183e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo6910a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }
}
