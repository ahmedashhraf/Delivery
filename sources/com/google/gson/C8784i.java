package com.google.gson;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.i */
/* compiled from: JsonArray */
public final class C8784i extends C8787l implements Iterable<C8787l> {

    /* renamed from: a */
    private final List<C8787l> f23031a;

    public C8784i() {
        this.f23031a = new ArrayList();
    }

    /* renamed from: a */
    public void mo32364a(Boolean bool) {
        this.f23031a.add(bool == null ? C8788m.f23032a : new C8791p(bool));
    }

    /* renamed from: c */
    public boolean mo32371c(C8787l lVar) {
        return this.f23031a.remove(lVar);
    }

    /* renamed from: e */
    public BigInteger mo32372e() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32372e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C8784i) && ((C8784i) obj).f23031a.equals(this.f23031a));
    }

    /* renamed from: f */
    public boolean mo32374f() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32374f();
        }
        throw new IllegalStateException();
    }

    public C8787l get(int i) {
        return (C8787l) this.f23031a.get(i);
    }

    public int hashCode() {
        return this.f23031a.hashCode();
    }

    public Iterator<C8787l> iterator() {
        return this.f23031a.iterator();
    }

    /* renamed from: m */
    public byte mo32378m() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32378m();
        }
        throw new IllegalStateException();
    }

    /* renamed from: n */
    public char mo32379n() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32379n();
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public double mo32380o() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32380o();
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public float mo32381p() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32381p();
        }
        throw new IllegalStateException();
    }

    /* renamed from: q */
    public int mo32382q() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32382q();
        }
        throw new IllegalStateException();
    }

    public C8787l remove(int i) {
        return (C8787l) this.f23031a.remove(i);
    }

    public int size() {
        return this.f23031a.size();
    }

    /* renamed from: v */
    public long mo32385v() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32385v();
        }
        throw new IllegalStateException();
    }

    /* renamed from: w */
    public Number mo32386w() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32386w();
        }
        throw new IllegalStateException();
    }

    /* renamed from: x */
    public short mo32387x() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32387x();
        }
        throw new IllegalStateException();
    }

    /* renamed from: y */
    public String mo32388y() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32388y();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void mo32365a(Character ch) {
        this.f23031a.add(ch == null ? C8788m.f23032a : new C8791p(ch));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C8784i m41182b() {
        if (this.f23031a.isEmpty()) {
            return new C8784i();
        }
        C8784i iVar = new C8784i(this.f23031a.size());
        for (C8787l b : this.f23031a) {
            iVar.mo32363a(b.mo32368b());
        }
        return iVar;
    }

    /* renamed from: c */
    public BigDecimal mo32370c() {
        if (this.f23031a.size() == 1) {
            return ((C8787l) this.f23031a.get(0)).mo32370c();
        }
        throw new IllegalStateException();
    }

    public C8784i(int i) {
        this.f23031a = new ArrayList(i);
    }

    /* renamed from: a */
    public void mo32366a(Number number) {
        this.f23031a.add(number == null ? C8788m.f23032a : new C8791p(number));
    }

    /* renamed from: a */
    public void mo32367a(String str) {
        this.f23031a.add(str == null ? C8788m.f23032a : new C8791p(str));
    }

    /* renamed from: a */
    public void mo32363a(C8787l lVar) {
        if (lVar == null) {
            lVar = C8788m.f23032a;
        }
        this.f23031a.add(lVar);
    }

    /* renamed from: a */
    public void mo32362a(C8784i iVar) {
        this.f23031a.addAll(iVar.f23031a);
    }

    /* renamed from: b */
    public boolean mo32369b(C8787l lVar) {
        return this.f23031a.contains(lVar);
    }

    /* renamed from: a */
    public C8787l mo32361a(int i, C8787l lVar) {
        return (C8787l) this.f23031a.set(i, lVar);
    }
}
