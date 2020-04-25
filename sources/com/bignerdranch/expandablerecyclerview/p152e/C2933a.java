package com.bignerdranch.expandablerecyclerview.p152e;

import androidx.annotation.C0193h0;
import com.bignerdranch.expandablerecyclerview.p152e.C2934b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bignerdranch.expandablerecyclerview.e.a */
/* compiled from: ExpandableWrapper */
public class C2933a<P extends C2934b<C>, C> {

    /* renamed from: a */
    private P f10393a;

    /* renamed from: b */
    private C f10394b;

    /* renamed from: c */
    private boolean f10395c = true;

    /* renamed from: d */
    private boolean f10396d = false;

    /* renamed from: e */
    private List<C2933a<P, C>> f10397e;

    public C2933a(@C0193h0 P p) {
        this.f10393a = p;
        this.f10397e = m14037b(p);
    }

    /* renamed from: a */
    public void mo11666a(@C0193h0 P p) {
        this.f10393a = p;
        this.f10397e = m14037b(p);
    }

    /* renamed from: b */
    public P mo11668b() {
        return this.f10393a;
    }

    /* renamed from: c */
    public List<C2933a<P, C>> mo11669c() {
        if (this.f10395c) {
            return this.f10397e;
        }
        throw new IllegalStateException("Parent not wrapped");
    }

    /* renamed from: d */
    public boolean mo11670d() {
        return this.f10396d;
    }

    /* renamed from: e */
    public boolean mo11671e() {
        return this.f10395c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2933a.class != obj.getClass()) {
            return false;
        }
        C2933a aVar = (C2933a) obj;
        P p = this.f10393a;
        if (p == null ? aVar.f10393a != null : !p.equals(aVar.f10393a)) {
            return false;
        }
        C c = this.f10394b;
        C c2 = aVar.f10394b;
        if (c != null) {
            z = c.equals(c2);
        } else if (c2 != null) {
            z = false;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo11673f() {
        if (this.f10395c) {
            return this.f10393a.mo11676b();
        }
        throw new IllegalStateException("Parent not wrapped");
    }

    public int hashCode() {
        P p = this.f10393a;
        int i = 0;
        int hashCode = (p != null ? p.hashCode() : 0) * 31;
        C c = this.f10394b;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode + i;
    }

    /* renamed from: b */
    private List<C2933a<P, C>> m14037b(P p) {
        ArrayList arrayList = new ArrayList();
        for (Object aVar : p.mo11675a()) {
            arrayList.add(new C2933a((C) aVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public C mo11665a() {
        return this.f10394b;
    }

    /* renamed from: a */
    public void mo11667a(boolean z) {
        this.f10396d = z;
    }

    public C2933a(@C0193h0 C c) {
        this.f10394b = c;
    }
}
