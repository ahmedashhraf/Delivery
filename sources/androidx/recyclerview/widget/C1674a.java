package androidx.recyclerview.widget;

import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0942b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p212io.branch.indexing.C14099c;

/* renamed from: androidx.recyclerview.widget.a */
/* compiled from: AdapterHelper */
class C1674a implements C1774a {

    /* renamed from: i */
    static final int f6428i = 0;

    /* renamed from: j */
    static final int f6429j = 1;

    /* renamed from: k */
    private static final boolean f6430k = false;

    /* renamed from: l */
    private static final String f6431l = "AHT";

    /* renamed from: a */
    private C0941a<C1676b> f6432a;

    /* renamed from: b */
    final ArrayList<C1676b> f6433b;

    /* renamed from: c */
    final ArrayList<C1676b> f6434c;

    /* renamed from: d */
    final C1675a f6435d;

    /* renamed from: e */
    Runnable f6436e;

    /* renamed from: f */
    final boolean f6437f;

    /* renamed from: g */
    final C1773v f6438g;

    /* renamed from: h */
    private int f6439h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* compiled from: AdapterHelper */
    interface C1675a {
        /* renamed from: a */
        C1635d0 mo7306a(int i);

        /* renamed from: a */
        void mo7307a(int i, int i2);

        /* renamed from: a */
        void mo7308a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo7309a(C1676b bVar);

        /* renamed from: b */
        void mo7310b(int i, int i2);

        /* renamed from: b */
        void mo7311b(C1676b bVar);

        /* renamed from: c */
        void mo7312c(int i, int i2);

        /* renamed from: d */
        void mo7314d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    /* compiled from: AdapterHelper */
    static class C1676b {

        /* renamed from: e */
        static final int f6440e = 1;

        /* renamed from: f */
        static final int f6441f = 2;

        /* renamed from: g */
        static final int f6442g = 4;

        /* renamed from: h */
        static final int f6443h = 8;

        /* renamed from: i */
        static final int f6444i = 30;

        /* renamed from: a */
        int f6445a;

        /* renamed from: b */
        int f6446b;

        /* renamed from: c */
        Object f6447c;

        /* renamed from: d */
        int f6448d;

        C1676b(int i, int i2, int i3, Object obj) {
            this.f6445a = i;
            this.f6446b = i2;
            this.f6448d = i3;
            this.f6447c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo7692a() {
            int i = this.f6445a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : C14099c.f41429k;
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1676b.class != obj.getClass()) {
                return false;
            }
            C1676b bVar = (C1676b) obj;
            int i = this.f6445a;
            if (i != bVar.f6445a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f6448d - this.f6446b) == 1 && this.f6448d == bVar.f6446b && this.f6446b == bVar.f6448d) {
                return true;
            }
            if (this.f6448d != bVar.f6448d || this.f6446b != bVar.f6446b) {
                return false;
            }
            Object obj2 = this.f6447c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f6447c)) {
                    return false;
                }
            } else if (bVar.f6447c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f6445a * 31) + this.f6446b) * 31) + this.f6448d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo7692a());
            sb.append(",s:");
            sb.append(this.f6446b);
            sb.append("c:");
            sb.append(this.f6448d);
            sb.append(",p:");
            sb.append(this.f6447c);
            sb.append("]");
            return sb.toString();
        }
    }

    C1674a(C1675a aVar) {
        this(aVar, false);
    }

    /* renamed from: b */
    private void m9022b(C1676b bVar) {
        m9029g(bVar);
    }

    /* renamed from: c */
    private void m9023c(C1676b bVar) {
        m9029g(bVar);
    }

    /* renamed from: d */
    private void m9025d(C1676b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f6446b;
        int i2 = bVar.f6448d + i;
        int i3 = 0;
        char c2 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f6435d.mo7306a(i4) != null || m9026d(i4)) {
                if (c2 == 0) {
                    m9028f(mo7675a(2, i, i3, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m9029g(mo7675a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c2 = c;
        }
        if (i3 != bVar.f6448d) {
            mo7678a(bVar);
            bVar = mo7675a(2, i, i3, null);
        }
        if (c2 == 0) {
            m9028f(bVar);
        } else {
            m9029g(bVar);
        }
    }

    /* renamed from: g */
    private void m9029g(C1676b bVar) {
        this.f6434c.add(bVar);
        int i = bVar.f6445a;
        if (i == 1) {
            this.f6435d.mo7312c(bVar.f6446b, bVar.f6448d);
        } else if (i == 2) {
            this.f6435d.mo7310b(bVar.f6446b, bVar.f6448d);
        } else if (i == 4) {
            this.f6435d.mo7308a(bVar.f6446b, bVar.f6448d, bVar.f6447c);
        } else if (i == 8) {
            this.f6435d.mo7307a(bVar.f6446b, bVar.f6448d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1674a mo7676a(C1676b... bVarArr) {
        Collections.addAll(this.f6433b, bVarArr);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo7690e() {
        this.f6438g.mo8008a(this.f6433b);
        int size = this.f6433b.size();
        for (int i = 0; i < size; i++) {
            C1676b bVar = (C1676b) this.f6433b.get(i);
            int i2 = bVar.f6445a;
            if (i2 == 1) {
                m9022b(bVar);
            } else if (i2 == 2) {
                m9025d(bVar);
            } else if (i2 == 4) {
                m9027e(bVar);
            } else if (i2 == 8) {
                m9023c(bVar);
            }
            Runnable runnable = this.f6436e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f6433b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo7691f() {
        mo7680a((List<C1676b>) this.f6433b);
        mo7680a((List<C1676b>) this.f6434c);
        this.f6439h = 0;
    }

    C1674a(C1675a aVar, boolean z) {
        this.f6432a = new C0942b(30);
        this.f6433b = new ArrayList<>();
        this.f6434c = new ArrayList<>();
        this.f6439h = 0;
        this.f6435d = aVar;
        this.f6437f = z;
        this.f6438g = new C1773v(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7677a() {
        int size = this.f6434c.size();
        for (int i = 0; i < size; i++) {
            this.f6435d.mo7311b((C1676b) this.f6434c.get(i));
        }
        mo7680a((List<C1676b>) this.f6434c);
        this.f6439h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo7683b(int i) {
        return mo7674a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7686c() {
        return this.f6433b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo7685b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f6433b.add(mo7675a(1, i, i2, null));
        this.f6439h |= 1;
        if (this.f6433b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7687c(int i) {
        return (i & this.f6439h) != 0;
    }

    /* renamed from: f */
    private void m9028f(C1676b bVar) {
        int i;
        int i2 = bVar.f6445a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m9024d(bVar.f6446b, i2);
        int i3 = bVar.f6446b;
        int i4 = bVar.f6445a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = d;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f6448d; i8++) {
            int d2 = m9024d(bVar.f6446b + (i * i8), bVar.f6445a);
            int i9 = bVar.f6445a;
            if (i9 == 2 ? d2 == i5 : i9 == 4 && d2 == i5 + 1) {
                i7++;
            } else {
                C1676b a = mo7675a(bVar.f6445a, i5, i7, bVar.f6447c);
                mo7679a(a, i6);
                mo7678a(a);
                if (bVar.f6445a == 4) {
                    i6 += i7;
                }
                i5 = d2;
                i7 = 1;
            }
        }
        Object obj = bVar.f6447c;
        mo7678a(bVar);
        if (i7 > 0) {
            C1676b a2 = mo7675a(bVar.f6445a, i5, i7, obj);
            mo7679a(a2, i6);
            mo7678a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7688c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f6433b.add(mo7675a(2, i, i2, null));
        this.f6439h |= 2;
        if (this.f6433b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7679a(C1676b bVar, int i) {
        this.f6435d.mo7309a(bVar);
        int i2 = bVar.f6445a;
        if (i2 == 2) {
            this.f6435d.mo7314d(i, bVar.f6448d);
        } else if (i2 == 4) {
            this.f6435d.mo7308a(i, bVar.f6448d, bVar.f6447c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7684b() {
        mo7677a();
        int size = this.f6433b.size();
        for (int i = 0; i < size; i++) {
            C1676b bVar = (C1676b) this.f6433b.get(i);
            int i2 = bVar.f6445a;
            if (i2 == 1) {
                this.f6435d.mo7311b(bVar);
                this.f6435d.mo7312c(bVar.f6446b, bVar.f6448d);
            } else if (i2 == 2) {
                this.f6435d.mo7311b(bVar);
                this.f6435d.mo7314d(bVar.f6446b, bVar.f6448d);
            } else if (i2 == 4) {
                this.f6435d.mo7311b(bVar);
                this.f6435d.mo7308a(bVar.f6446b, bVar.f6448d, bVar.f6447c);
            } else if (i2 == 8) {
                this.f6435d.mo7311b(bVar);
                this.f6435d.mo7307a(bVar.f6446b, bVar.f6448d);
            }
            Runnable runnable = this.f6436e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo7680a((List<C1676b>) this.f6433b);
        this.f6439h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo7674a(int i, int i2) {
        int size = this.f6434c.size();
        while (i2 < size) {
            C1676b bVar = (C1676b) this.f6434c.get(i2);
            int i3 = bVar.f6445a;
            if (i3 == 8) {
                int i4 = bVar.f6446b;
                if (i4 == i) {
                    i = bVar.f6448d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f6448d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f6446b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f6448d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f6448d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: e */
    private void m9027e(C1676b bVar) {
        int i = bVar.f6446b;
        int i2 = bVar.f6448d + i;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        while (i < i2) {
            if (this.f6435d.mo7306a(i) != null || m9026d(i)) {
                if (c == 0) {
                    m9028f(mo7675a(4, i3, i4, bVar.f6447c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m9029g(mo7675a(4, i3, i4, bVar.f6447c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f6448d) {
            Object obj = bVar.f6447c;
            mo7678a(bVar);
            bVar = mo7675a(4, i3, i4, obj);
        }
        if (c == 0) {
            m9028f(bVar);
        } else {
            m9029g(bVar);
        }
    }

    /* renamed from: d */
    private int m9024d(int i, int i2) {
        for (int size = this.f6434c.size() - 1; size >= 0; size--) {
            C1676b bVar = (C1676b) this.f6434c.get(size);
            int i3 = bVar.f6445a;
            if (i3 == 8) {
                int i4 = bVar.f6446b;
                int i5 = bVar.f6448d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f6446b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f6446b = i7 + 1;
                            bVar.f6448d++;
                        } else if (i2 == 2) {
                            bVar.f6446b = i7 - 1;
                            bVar.f6448d--;
                        }
                    }
                } else {
                    int i8 = bVar.f6446b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f6448d++;
                        } else if (i2 == 2) {
                            bVar.f6448d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f6446b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f6446b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f6446b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f6448d;
                    } else if (i3 == 2) {
                        i += bVar.f6448d;
                    }
                } else if (i2 == 1) {
                    bVar.f6446b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f6446b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f6434c.size() - 1; size2 >= 0; size2--) {
            C1676b bVar2 = (C1676b) this.f6434c.get(size2);
            if (bVar2.f6445a == 8) {
                int i10 = bVar2.f6448d;
                if (i10 == bVar2.f6446b || i10 < 0) {
                    this.f6434c.remove(size2);
                    mo7678a(bVar2);
                }
            } else if (bVar2.f6448d <= 0) {
                this.f6434c.remove(size2);
                mo7678a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7682a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f6433b.add(mo7675a(4, i, i2, obj));
        this.f6439h |= 4;
        if (this.f6433b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo7681a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f6433b.add(mo7675a(8, i, i2, null));
            this.f6439h |= 8;
            if (this.f6433b.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: a */
    public int mo7673a(int i) {
        int size = this.f6433b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1676b bVar = (C1676b) this.f6433b.get(i2);
            int i3 = bVar.f6445a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f6446b;
                    if (i4 <= i) {
                        int i5 = bVar.f6448d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f6446b;
                    if (i6 == i) {
                        i = bVar.f6448d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f6448d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f6446b <= i) {
                i += bVar.f6448d;
            }
        }
        return i;
    }

    /* renamed from: a */
    public C1676b mo7675a(int i, int i2, int i3, Object obj) {
        C1676b bVar = (C1676b) this.f6432a.mo4743a();
        if (bVar == null) {
            return new C1676b(i, i2, i3, obj);
        }
        bVar.f6445a = i;
        bVar.f6446b = i2;
        bVar.f6448d = i3;
        bVar.f6447c = obj;
        return bVar;
    }

    /* renamed from: d */
    private boolean m9026d(int i) {
        int size = this.f6434c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1676b bVar = (C1676b) this.f6434c.get(i2);
            int i3 = bVar.f6445a;
            if (i3 == 8) {
                if (mo7674a(bVar.f6448d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f6446b;
                int i5 = bVar.f6448d + i4;
                while (i4 < i5) {
                    if (mo7674a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo7678a(C1676b bVar) {
        if (!this.f6437f) {
            bVar.f6447c = null;
            this.f6432a.release(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7680a(List<C1676b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo7678a((C1676b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo7689d() {
        return !this.f6434c.isEmpty() && !this.f6433b.isEmpty();
    }
}
