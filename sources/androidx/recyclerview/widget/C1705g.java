package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
/* compiled from: ChildHelper */
class C1705g {

    /* renamed from: d */
    private static final boolean f6550d = false;

    /* renamed from: e */
    private static final String f6551e = "ChildrenHelper";

    /* renamed from: a */
    final C1707b f6552a;

    /* renamed from: b */
    final C1706a f6553b = new C1706a();

    /* renamed from: c */
    final List<View> f6554c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    /* compiled from: ChildHelper */
    static class C1706a {

        /* renamed from: c */
        static final int f6555c = 64;

        /* renamed from: d */
        static final long f6556d = Long.MIN_VALUE;

        /* renamed from: a */
        long f6557a = 0;

        /* renamed from: b */
        C1706a f6558b;

        C1706a() {
        }

        /* renamed from: b */
        private void m9249b() {
            if (this.f6558b == null) {
                this.f6558b = new C1706a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7826a(int i) {
            if (i >= 64) {
                C1706a aVar = this.f6558b;
                if (aVar != null) {
                    aVar.mo7826a(i - 64);
                    return;
                }
                return;
            }
            this.f6557a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo7829c(int i) {
            if (i >= 64) {
                m9249b();
                return this.f6558b.mo7829c(i - 64);
            }
            return (this.f6557a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo7830d(int i) {
            if (i >= 64) {
                m9249b();
                return this.f6558b.mo7830d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f6557a & j) != 0;
            this.f6557a &= j ^ -1;
            long j2 = j - 1;
            long j3 = this.f6557a;
            this.f6557a = Long.rotateRight(j3 & (j2 ^ -1), 1) | (j3 & j2);
            C1706a aVar = this.f6558b;
            if (aVar != null) {
                if (aVar.mo7829c(0)) {
                    mo7831e(63);
                }
                this.f6558b.mo7830d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo7831e(int i) {
            if (i >= 64) {
                m9249b();
                this.f6558b.mo7831e(i - 64);
                return;
            }
            this.f6557a |= 1 << i;
        }

        public String toString() {
            if (this.f6558b == null) {
                return Long.toBinaryString(this.f6557a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f6558b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f6557a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo7828b(int i) {
            C1706a aVar = this.f6558b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f6557a);
                }
                return Long.bitCount(this.f6557a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f6557a & ((1 << i) - 1));
            } else {
                return aVar.mo7828b(i - 64) + Long.bitCount(this.f6557a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7825a() {
            this.f6557a = 0;
            C1706a aVar = this.f6558b;
            if (aVar != null) {
                aVar.mo7825a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo7827a(int i, boolean z) {
            if (i >= 64) {
                m9249b();
                this.f6558b.mo7827a(i - 64, z);
                return;
            }
            boolean z2 = (this.f6557a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f6557a;
            this.f6557a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                mo7831e(i);
            } else {
                mo7826a(i);
            }
            if (z2 || this.f6558b != null) {
                m9249b();
                this.f6558b.mo7827a(0, z2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    /* compiled from: ChildHelper */
    interface C1707b {
        /* renamed from: a */
        int mo7295a();

        /* renamed from: a */
        View mo7296a(int i);

        /* renamed from: a */
        void mo7297a(View view);

        /* renamed from: a */
        void mo7298a(View view, int i);

        /* renamed from: a */
        void mo7299a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        int mo7300b(View view);

        /* renamed from: b */
        void mo7301b();

        /* renamed from: b */
        void mo7302b(int i);

        /* renamed from: c */
        C1635d0 mo7303c(View view);

        /* renamed from: c */
        void mo7304c(int i);

        /* renamed from: d */
        void mo7305d(View view);
    }

    C1705g(C1707b bVar) {
        this.f6552a = bVar;
    }

    /* renamed from: f */
    private int m9229f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f6552a.mo7295a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f6553b.mo7828b(i2));
            if (b == 0) {
                while (this.f6553b.mo7829c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m9230g(View view) {
        this.f6554c.add(view);
        this.f6552a.mo7297a(view);
    }

    /* renamed from: h */
    private boolean m9231h(View view) {
        if (!this.f6554c.remove(view)) {
            return false;
        }
        this.f6552a.mo7305d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7812a(View view, boolean z) {
        mo7811a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo7815b(int i) {
        int size = this.f6554c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f6554c.get(i2);
            C1635d0 c = this.f6552a.mo7303c(view);
            if (c.mo7276i() == i && !c.mo7283p() && !c.mo7285r()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo7816c(int i) {
        return this.f6552a.mo7296a(m9229f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo7820d(View view) {
        int b = this.f6552a.mo7300b(view);
        if (b >= 0) {
            if (this.f6553b.mo7830d(b)) {
                m9231h(view);
            }
            this.f6552a.mo7304c(b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7821e(int i) {
        int f = m9229f(i);
        View a = this.f6552a.mo7296a(f);
        if (a != null) {
            if (this.f6553b.mo7830d(f)) {
                m9231h(a);
            }
            this.f6552a.mo7304c(f);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6553b.toString());
        sb.append(", hidden list:");
        sb.append(this.f6554c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7811a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f6552a.mo7295a();
        } else {
            i2 = m9229f(i);
        }
        this.f6553b.mo7827a(i2, z);
        if (z) {
            m9230g(view);
        }
        this.f6552a.mo7298a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7817c() {
        this.f6553b.mo7825a();
        for (int size = this.f6554c.size() - 1; size >= 0; size--) {
            this.f6552a.mo7305d((View) this.f6554c.get(size));
            this.f6554c.remove(size);
        }
        this.f6552a.mo7301b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo7823f(View view) {
        int b = this.f6552a.mo7300b(view);
        if (b < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f6553b.mo7829c(b)) {
            this.f6553b.mo7826a(b);
            m9231h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo7819d(int i) {
        return this.f6552a.mo7296a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo7822e(View view) {
        int b = this.f6552a.mo7300b(view);
        if (b == -1) {
            m9231h(view);
            return true;
        } else if (!this.f6553b.mo7829c(b)) {
            return false;
        } else {
            this.f6553b.mo7830d(b);
            m9231h(view);
            this.f6552a.mo7304c(b);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7810a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f6552a.mo7295a();
        } else {
            i2 = m9229f(i);
        }
        this.f6553b.mo7827a(i2, z);
        if (z) {
            m9230g(view);
        }
        this.f6552a.mo7299a(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo7813b() {
        return this.f6552a.mo7295a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo7814b(View view) {
        int b = this.f6552a.mo7300b(view);
        if (b != -1 && !this.f6553b.mo7829c(b)) {
            return b - this.f6553b.mo7828b(b);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7818c(View view) {
        return this.f6554c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7807a() {
        return this.f6552a.mo7295a() - this.f6554c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7808a(int i) {
        int f = m9229f(i);
        this.f6553b.mo7830d(f);
        this.f6552a.mo7302b(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7809a(View view) {
        int b = this.f6552a.mo7300b(view);
        if (b >= 0) {
            this.f6553b.mo7831e(b);
            m9230g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }
}
