package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;

/* renamed from: i.b.a.a.c.i.x.f */
/* compiled from: InsnList */
public class C13970f {

    /* renamed from: a */
    private int f41061a;

    /* renamed from: b */
    private C13965a f41062b;

    /* renamed from: c */
    private C13965a f41063c;

    /* renamed from: d */
    C13965a[] f41064d;

    /* renamed from: i.b.a.a.c.i.x.f$a */
    /* compiled from: InsnList */
    private final class C13971a implements ListIterator {

        /* renamed from: N */
        C13965a f41065N;

        /* renamed from: a */
        C13965a f41067a;

        /* renamed from: b */
        C13965a f41068b;

        C13971a(int i) {
            if (i == C13970f.this.mo44255f()) {
                this.f41067a = null;
                this.f41068b = C13970f.this.mo44249c();
                return;
            }
            this.f41067a = C13970f.this.mo44234a(i);
            this.f41068b = this.f41067a.f41048d;
        }

        public void add(Object obj) {
            C13965a aVar = this.f41067a;
            if (aVar != null) {
                C13970f.this.mo44244b(aVar, (C13965a) obj);
            } else {
                C13965a aVar2 = this.f41068b;
                if (aVar2 != null) {
                    C13970f.this.mo44238a(aVar2, (C13965a) obj);
                } else {
                    C13970f.this.mo44237a((C13965a) obj);
                }
            }
            this.f41068b = (C13965a) obj;
            this.f41065N = null;
        }

        public boolean hasNext() {
            return this.f41067a != null;
        }

        public boolean hasPrevious() {
            return this.f41068b != null;
        }

        public Object next() {
            C13965a aVar = this.f41067a;
            if (aVar != null) {
                this.f41068b = aVar;
                this.f41067a = aVar.f41049e;
                this.f41065N = aVar;
                return aVar;
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            if (this.f41067a == null) {
                return C13970f.this.mo44255f();
            }
            C13970f fVar = C13970f.this;
            if (fVar.f41064d == null) {
                fVar.f41064d = fVar.mo44256g();
            }
            return this.f41067a.f41050f;
        }

        public Object previous() {
            C13965a aVar = this.f41068b;
            this.f41067a = aVar;
            this.f41068b = aVar.f41048d;
            this.f41065N = aVar;
            return aVar;
        }

        public int previousIndex() {
            if (this.f41068b == null) {
                return -1;
            }
            C13970f fVar = C13970f.this;
            if (fVar.f41064d == null) {
                fVar.f41064d = fVar.mo44256g();
            }
            return this.f41068b.f41050f;
        }

        public void remove() {
            C13965a aVar = this.f41065N;
            if (aVar != null) {
                C13965a aVar2 = this.f41067a;
                if (aVar == aVar2) {
                    this.f41067a = aVar2.f41049e;
                } else {
                    this.f41068b = this.f41068b.f41048d;
                }
                C13970f.this.mo44254e(this.f41065N);
                this.f41065N = null;
                return;
            }
            throw new IllegalStateException();
        }

        public void set(Object obj) {
            C13965a aVar = this.f41065N;
            if (aVar != null) {
                C13965a aVar2 = (C13965a) obj;
                C13970f.this.mo44250c(aVar, aVar2);
                if (this.f41065N == this.f41068b) {
                    this.f41068b = aVar2;
                } else {
                    this.f41067a = aVar2;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: a */
    public C13965a mo44234a(int i) {
        if (i < 0 || i >= this.f41061a) {
            throw new IndexOutOfBoundsException();
        }
        if (this.f41064d == null) {
            this.f41064d = mo44256g();
        }
        return this.f41064d[i];
    }

    /* renamed from: b */
    public C13965a mo44242b() {
        return this.f41062b;
    }

    /* renamed from: c */
    public C13965a mo44249c() {
        return this.f41063c;
    }

    /* renamed from: d */
    public ListIterator<C13965a> mo44251d() {
        return mo44243b(0);
    }

    /* renamed from: e */
    public void mo44254e(C13965a aVar) {
        this.f41061a--;
        C13965a aVar2 = aVar.f41049e;
        C13965a aVar3 = aVar.f41048d;
        if (aVar2 == null) {
            if (aVar3 == null) {
                this.f41062b = null;
                this.f41063c = null;
            } else {
                aVar3.f41049e = null;
                this.f41063c = aVar3;
            }
        } else if (aVar3 == null) {
            this.f41062b = aVar2;
            aVar2.f41048d = null;
        } else {
            aVar3.f41049e = aVar2;
            aVar2.f41048d = aVar3;
        }
        this.f41064d = null;
        aVar.f41050f = -1;
        aVar.f41048d = null;
        aVar.f41049e = null;
    }

    /* renamed from: f */
    public int mo44255f() {
        return this.f41061a;
    }

    /* renamed from: g */
    public C13965a[] mo44256g() {
        C13965a aVar = this.f41062b;
        C13965a[] aVarArr = new C13965a[this.f41061a];
        int i = 0;
        while (aVar != null) {
            aVarArr[i] = aVar;
            int i2 = i + 1;
            aVar.f41050f = i;
            aVar = aVar.f41049e;
            i = i2;
        }
        return aVarArr;
    }

    /* renamed from: b */
    public boolean mo44247b(C13965a aVar) {
        C13965a aVar2 = this.f41062b;
        while (aVar2 != null && aVar2 != aVar) {
            aVar2 = aVar2.f41049e;
        }
        return aVar2 != null;
    }

    /* renamed from: c */
    public int mo44248c(C13965a aVar) {
        if (this.f41064d == null) {
            this.f41064d = mo44256g();
        }
        return aVar.f41050f;
    }

    /* renamed from: d */
    public void mo44252d(C13965a aVar) {
        this.f41061a++;
        C13965a aVar2 = this.f41062b;
        if (aVar2 == null) {
            this.f41062b = aVar;
            this.f41063c = aVar;
        } else {
            aVar2.f41048d = aVar;
            aVar.f41049e = aVar2;
        }
        this.f41062b = aVar;
        this.f41064d = null;
        aVar.f41050f = 0;
    }

    /* renamed from: b */
    public ListIterator<C13965a> mo44243b(int i) {
        return new C13971a(i);
    }

    /* renamed from: b */
    public void mo44246b(C13970f fVar) {
        int i = fVar.f41061a;
        if (i != 0) {
            this.f41061a += i;
            C13965a aVar = this.f41062b;
            if (aVar == null) {
                this.f41062b = fVar.f41062b;
                this.f41063c = fVar.f41063c;
            } else {
                C13965a aVar2 = fVar.f41063c;
                aVar.f41048d = aVar2;
                aVar2.f41049e = aVar;
                this.f41062b = fVar.f41062b;
            }
            this.f41064d = null;
            fVar.mo44241a(false);
        }
    }

    /* renamed from: c */
    public void mo44250c(C13965a aVar, C13965a aVar2) {
        C13965a aVar3 = aVar.f41049e;
        aVar2.f41049e = aVar3;
        if (aVar3 != null) {
            aVar3.f41048d = aVar2;
        } else {
            this.f41063c = aVar2;
        }
        C13965a aVar4 = aVar.f41048d;
        aVar2.f41048d = aVar4;
        if (aVar4 != null) {
            aVar4.f41049e = aVar2;
        } else {
            this.f41062b = aVar2;
        }
        C13965a[] aVarArr = this.f41064d;
        if (aVarArr != null) {
            int i = aVar.f41050f;
            aVarArr[i] = aVar2;
            aVar2.f41050f = i;
        } else {
            aVar2.f41050f = 0;
        }
        aVar.f41050f = -1;
        aVar.f41048d = null;
        aVar.f41049e = null;
    }

    /* renamed from: a */
    public void mo44236a(C13957r rVar) {
        for (C13965a aVar = this.f41062b; aVar != null; aVar = aVar.f41049e) {
            aVar.mo44226a(rVar);
        }
    }

    /* renamed from: a */
    public void mo44237a(C13965a aVar) {
        this.f41061a++;
        C13965a aVar2 = this.f41063c;
        if (aVar2 == null) {
            this.f41062b = aVar;
            this.f41063c = aVar;
        } else {
            aVar2.f41049e = aVar;
            aVar.f41048d = aVar2;
        }
        this.f41063c = aVar;
        this.f41064d = null;
        aVar.f41050f = 0;
    }

    /* renamed from: b */
    public void mo44244b(C13965a aVar, C13965a aVar2) {
        this.f41061a++;
        C13965a aVar3 = aVar.f41048d;
        if (aVar3 == null) {
            this.f41062b = aVar2;
        } else {
            aVar3.f41049e = aVar2;
        }
        aVar.f41048d = aVar2;
        aVar2.f41049e = aVar;
        aVar2.f41048d = aVar3;
        this.f41064d = null;
        aVar2.f41050f = 0;
    }

    /* renamed from: e */
    public void mo44253e() {
        for (C13965a aVar = this.f41062b; aVar != null; aVar = aVar.f41049e) {
            if (aVar instanceof C13976k) {
                ((C13976k) aVar).mo44269f();
            }
        }
    }

    /* renamed from: a */
    public void mo44240a(C13970f fVar) {
        int i = fVar.f41061a;
        if (i != 0) {
            this.f41061a += i;
            C13965a aVar = this.f41063c;
            if (aVar == null) {
                this.f41062b = fVar.f41062b;
                this.f41063c = fVar.f41063c;
            } else {
                C13965a aVar2 = fVar.f41062b;
                aVar.f41049e = aVar2;
                aVar2.f41048d = aVar;
                this.f41063c = fVar.f41063c;
            }
            this.f41064d = null;
            fVar.mo44241a(false);
        }
    }

    /* renamed from: b */
    public void mo44245b(C13965a aVar, C13970f fVar) {
        int i = fVar.f41061a;
        if (i != 0) {
            this.f41061a += i;
            C13965a aVar2 = fVar.f41062b;
            C13965a aVar3 = fVar.f41063c;
            C13965a aVar4 = aVar.f41048d;
            if (aVar4 == null) {
                this.f41062b = aVar2;
            } else {
                aVar4.f41049e = aVar2;
            }
            aVar.f41048d = aVar3;
            aVar3.f41049e = aVar;
            aVar2.f41048d = aVar4;
            this.f41064d = null;
            fVar.mo44241a(false);
        }
    }

    /* renamed from: a */
    public void mo44238a(C13965a aVar, C13965a aVar2) {
        this.f41061a++;
        C13965a aVar3 = aVar.f41049e;
        if (aVar3 == null) {
            this.f41063c = aVar2;
        } else {
            aVar3.f41048d = aVar2;
        }
        aVar.f41049e = aVar2;
        aVar2.f41049e = aVar3;
        aVar2.f41048d = aVar;
        this.f41064d = null;
        aVar2.f41050f = 0;
    }

    /* renamed from: a */
    public void mo44239a(C13965a aVar, C13970f fVar) {
        int i = fVar.f41061a;
        if (i != 0) {
            this.f41061a += i;
            C13965a aVar2 = fVar.f41062b;
            C13965a aVar3 = fVar.f41063c;
            C13965a aVar4 = aVar.f41049e;
            if (aVar4 == null) {
                this.f41063c = aVar3;
            } else {
                aVar4.f41048d = aVar3;
            }
            aVar.f41049e = aVar2;
            aVar3.f41049e = aVar4;
            aVar2.f41048d = aVar;
            this.f41064d = null;
            fVar.mo44241a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo44241a(boolean z) {
        if (z) {
            C13965a aVar = this.f41062b;
            while (aVar != null) {
                C13965a aVar2 = aVar.f41049e;
                aVar.f41050f = -1;
                aVar.f41048d = null;
                aVar.f41049e = null;
                aVar = aVar2;
            }
        }
        this.f41061a = 0;
        this.f41062b = null;
        this.f41063c = null;
        this.f41064d = null;
    }

    /* renamed from: a */
    public void mo44235a() {
        mo44241a(false);
    }
}
