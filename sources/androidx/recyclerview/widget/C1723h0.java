package androidx.recyclerview.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0224v0;
import androidx.collection.C0642f;
import androidx.collection.C0649h;
import androidx.core.p033k.C0940h.C0941a;
import androidx.core.p033k.C0940h.C0942b;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1644l.C1648d;

/* renamed from: androidx.recyclerview.widget.h0 */
/* compiled from: ViewInfoStore */
class C1723h0 {

    /* renamed from: c */
    private static final boolean f6638c = false;
    @C0224v0

    /* renamed from: a */
    final C0649h<C1635d0, C1724a> f6639a = new C0649h<>();
    @C0224v0

    /* renamed from: b */
    final C0642f<C1635d0> f6640b = new C0642f<>();

    /* renamed from: androidx.recyclerview.widget.h0$a */
    /* compiled from: ViewInfoStore */
    static class C1724a {

        /* renamed from: d */
        static final int f6641d = 1;

        /* renamed from: e */
        static final int f6642e = 2;

        /* renamed from: f */
        static final int f6643f = 4;

        /* renamed from: g */
        static final int f6644g = 8;

        /* renamed from: h */
        static final int f6645h = 3;

        /* renamed from: i */
        static final int f6646i = 12;

        /* renamed from: j */
        static final int f6647j = 14;

        /* renamed from: k */
        static C0941a<C1724a> f6648k = new C0942b(20);

        /* renamed from: a */
        int f6649a;
        @C0195i0

        /* renamed from: b */
        C1648d f6650b;
        @C0195i0

        /* renamed from: c */
        C1648d f6651c;

        private C1724a() {
        }

        /* renamed from: a */
        static void m9317a(C1724a aVar) {
            aVar.f6649a = 0;
            aVar.f6650b = null;
            aVar.f6651c = null;
            f6648k.release(aVar);
        }

        /* renamed from: b */
        static C1724a m9318b() {
            C1724a aVar = (C1724a) f6648k.mo4743a();
            return aVar == null ? new C1724a() : aVar;
        }

        /* renamed from: a */
        static void m9316a() {
            do {
            } while (f6648k.mo4743a() != null);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h0$b */
    /* compiled from: ViewInfoStore */
    interface C1725b {
        /* renamed from: a */
        void mo7251a(C1635d0 d0Var);

        /* renamed from: a */
        void mo7252a(C1635d0 d0Var, @C0195i0 C1648d dVar, C1648d dVar2);

        /* renamed from: b */
        void mo7253b(C1635d0 d0Var, @C0193h0 C1648d dVar, @C0195i0 C1648d dVar2);

        /* renamed from: c */
        void mo7254c(C1635d0 d0Var, @C0193h0 C1648d dVar, @C0193h0 C1648d dVar2);
    }

    C1723h0() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7862a() {
        this.f6639a.clear();
        this.f6640b.mo3279b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo7869b(C1635d0 d0Var) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar == null || (aVar.f6649a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo7870c(C1635d0 d0Var, C1648d dVar) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar == null) {
            aVar = C1724a.m9318b();
            this.f6639a.put(d0Var, aVar);
        }
        aVar.f6650b = dVar;
        aVar.f6649a |= 4;
    }

    /* renamed from: d */
    public void mo7872d(C1635d0 d0Var) {
        mo7875g(d0Var);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: e */
    public C1648d mo7873e(C1635d0 d0Var) {
        return m9299a(d0Var, 8);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: f */
    public C1648d mo7874f(C1635d0 d0Var) {
        return m9299a(d0Var, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo7875g(C1635d0 d0Var) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar != null) {
            aVar.f6649a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo7876h(C1635d0 d0Var) {
        int d = this.f6640b.mo3287d() - 1;
        while (true) {
            if (d < 0) {
                break;
            } else if (d0Var == this.f6640b.mo3282c(d)) {
                this.f6640b.mo3280b(d);
                break;
            } else {
                d--;
            }
        }
        C1724a aVar = (C1724a) this.f6639a.remove(d0Var);
        if (aVar != null) {
            C1724a.m9317a(aVar);
        }
    }

    /* renamed from: a */
    private C1648d m9299a(C1635d0 d0Var, int i) {
        C1648d dVar;
        int b = this.f6639a.mo3360b((Object) d0Var);
        if (b < 0) {
            return null;
        }
        C1724a aVar = (C1724a) this.f6639a.mo3367d(b);
        if (aVar != null) {
            int i2 = aVar.f6649a;
            if ((i2 & i) != 0) {
                aVar.f6649a = (i ^ -1) & i2;
                if (i == 4) {
                    dVar = aVar.f6650b;
                } else if (i == 8) {
                    dVar = aVar.f6651c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.f6649a & 12) == 0) {
                    this.f6639a.mo3363c(b);
                    C1724a.m9317a(aVar);
                }
                return dVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7868b(C1635d0 d0Var, C1648d dVar) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar == null) {
            aVar = C1724a.m9318b();
            this.f6639a.put(d0Var, aVar);
        }
        aVar.f6651c = dVar;
        aVar.f6649a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo7871c(C1635d0 d0Var) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        return (aVar == null || (aVar.f6649a & 4) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo7867b() {
        C1724a.m9316a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7863a(long j, C1635d0 d0Var) {
        this.f6640b.mo3284c(j, d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7865a(C1635d0 d0Var, C1648d dVar) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar == null) {
            aVar = C1724a.m9318b();
            this.f6639a.put(d0Var, aVar);
        }
        aVar.f6649a |= 2;
        aVar.f6650b = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1635d0 mo7861a(long j) {
        return (C1635d0) this.f6640b.mo3283c(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7864a(C1635d0 d0Var) {
        C1724a aVar = (C1724a) this.f6639a.get(d0Var);
        if (aVar == null) {
            aVar = C1724a.m9318b();
            this.f6639a.put(d0Var, aVar);
        }
        aVar.f6649a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo7866a(C1725b bVar) {
        for (int size = this.f6639a.size() - 1; size >= 0; size--) {
            C1635d0 d0Var = (C1635d0) this.f6639a.mo3361b(size);
            C1724a aVar = (C1724a) this.f6639a.mo3363c(size);
            int i = aVar.f6649a;
            if ((i & 3) == 3) {
                bVar.mo7251a(d0Var);
            } else if ((i & 1) != 0) {
                C1648d dVar = aVar.f6650b;
                if (dVar == null) {
                    bVar.mo7251a(d0Var);
                } else {
                    bVar.mo7253b(d0Var, dVar, aVar.f6651c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo7252a(d0Var, aVar.f6650b, aVar.f6651c);
            } else if ((i & 12) == 12) {
                bVar.mo7254c(d0Var, aVar.f6650b, aVar.f6651c);
            } else if ((i & 4) != 0) {
                bVar.mo7253b(d0Var, aVar.f6650b, null);
            } else if ((i & 8) != 0) {
                bVar.mo7252a(d0Var, aVar.f6650b, aVar.f6651c);
            }
            C1724a.m9317a(aVar);
        }
    }
}
