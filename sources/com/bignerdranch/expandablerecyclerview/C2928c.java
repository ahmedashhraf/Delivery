package com.bignerdranch.expandablerecyclerview;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0222u0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1635d0;
import androidx.recyclerview.widget.RecyclerView.C1638g;
import com.bignerdranch.expandablerecyclerview.C2927b;
import com.bignerdranch.expandablerecyclerview.C2931d;
import com.bignerdranch.expandablerecyclerview.p152e.C2933a;
import com.bignerdranch.expandablerecyclerview.p152e.C2934b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bignerdranch.expandablerecyclerview.c */
/* compiled from: ExpandableRecyclerAdapter */
public abstract class C2928c<P extends C2934b<C>, C, PVH extends C2931d, CVH extends C2927b> extends C1638g<C1635d0> {

    /* renamed from: i */
    private static final String f10377i = "ExpandableRecyclerAdapter.ExpandedStateMap";

    /* renamed from: j */
    public static final int f10378j = 0;

    /* renamed from: k */
    public static final int f10379k = 1;

    /* renamed from: l */
    public static final int f10380l = 2;

    /* renamed from: m */
    private static final int f10381m = -1;
    @C0193h0

    /* renamed from: c */
    protected List<C2933a<P, C>> f10382c;
    @C0193h0

    /* renamed from: d */
    private List<P> f10383d;
    @C0195i0

    /* renamed from: e */
    private C2930b f10384e;
    @C0193h0

    /* renamed from: f */
    private List<RecyclerView> f10385f;

    /* renamed from: g */
    private Map<P, Boolean> f10386g;

    /* renamed from: h */
    private C2932a f10387h = new C2929a();

    /* renamed from: com.bignerdranch.expandablerecyclerview.c$a */
    /* compiled from: ExpandableRecyclerAdapter */
    class C2929a implements C2932a {
        C2929a() {
        }

        @C0222u0
        /* renamed from: a */
        public void mo11651a(int i) {
            C2928c.this.mo11649p(i);
        }

        @C0222u0
        /* renamed from: b */
        public void mo11652b(int i) {
            C2928c.this.mo11650q(i);
        }
    }

    /* renamed from: com.bignerdranch.expandablerecyclerview.c$b */
    /* compiled from: ExpandableRecyclerAdapter */
    public interface C2930b {
        @C0222u0
        /* renamed from: a */
        void mo11653a(int i);

        @C0222u0
        /* renamed from: b */
        void mo11654b(int i);
    }

    public C2928c(@C0193h0 List<P> list) {
        this.f10383d = list;
        this.f10382c = m13964a(list);
        this.f10385f = new ArrayList();
        this.f10386g = new HashMap(this.f10383d.size());
    }

    @C0222u0
    /* renamed from: r */
    private int m13974r(int i) {
        int size = this.f10382c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((C2933a) this.f10382c.get(i3)).mo11671e()) {
                i2++;
                if (i2 > i) {
                    return i3;
                }
            }
        }
        return -1;
    }

    @C0222u0
    /* renamed from: s */
    private int m13975s(int i) {
        C2933a aVar = (C2933a) this.f10382c.remove(i);
        int i2 = 1;
        if (aVar.mo11670d()) {
            int size = aVar.mo11669c().size();
            for (int i3 = 0; i3 < size; i3++) {
                this.f10382c.remove(i);
                i2++;
            }
        }
        return i2;
    }

    @C0222u0
    /* renamed from: a */
    public abstract void mo11614a(@C0193h0 CVH cvh, int i, int i2, @C0193h0 C c);

    @C0222u0
    /* renamed from: a */
    public abstract void mo11616a(@C0193h0 PVH pvh, int i, @C0193h0 P p);

    @C0222u0
    /* renamed from: a */
    public void mo11618a(@C0193h0 List<P> list, boolean z) {
        this.f10383d = list;
        mo11622b(z);
    }

    @C0193h0
    @C0222u0
    /* renamed from: b */
    public C1635d0 mo7327b(@C0193h0 ViewGroup viewGroup, int i) {
        if (mo11643l(i)) {
            C2931d d = mo11625d(viewGroup, i);
            d.mo11661a(this.f10387h);
            d.f10392v0 = this;
            return d;
        }
        C2927b c = mo11623c(viewGroup, i);
        c.f10376t0 = this;
        return c;
    }

    @C0222u0
    /* renamed from: c */
    public int mo7333c(int i) {
        if (((C2933a) this.f10382c.get(i)).mo11671e()) {
            return mo11640k(mo11638j(i));
        }
        return mo11630g(mo11638j(i), mo11636i(i));
    }

    @C0193h0
    @C0222u0
    /* renamed from: c */
    public abstract CVH mo11623c(@C0193h0 ViewGroup viewGroup, int i);

    @C0193h0
    @C0222u0
    /* renamed from: d */
    public abstract PVH mo11625d(@C0193h0 ViewGroup viewGroup, int i);

    @C0222u0
    /* renamed from: d */
    public void mo11626d(int i, int i2, int i3) {
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a((C2934b) this.f10383d.get(i));
        if (aVar.mo11670d()) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.f10382c.remove(r + i2 + 1);
            }
            mo7338d(r + i2 + 1, i3);
        }
    }

    @C0222u0
    /* renamed from: e */
    public void mo11627e(int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            mo11632g(i);
            i++;
        }
    }

    @C0222u0
    /* renamed from: f */
    public void mo11629f(int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            mo11634h(i);
            i++;
        }
    }

    /* renamed from: g */
    public int mo11630g(int i, int i2) {
        return 1;
    }

    @C0222u0
    /* renamed from: g */
    public void mo11631g() {
        for (P b : this.f10383d) {
            mo11621b(b);
        }
    }

    @C0193h0
    @C0222u0
    /* renamed from: h */
    public List<P> mo11633h() {
        return this.f10383d;
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: i */
    public int mo11636i(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = ((C2933a) this.f10382c.get(i3)).mo11671e() ? 0 : i2 + 1;
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    @C0222u0
    /* renamed from: j */
    public int mo11638j(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = -1;
        for (int i3 = 0; i3 <= i; i3++) {
            if (((C2933a) this.f10382c.get(i3)).mo11671e()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: k */
    public int mo11640k(int i) {
        return 0;
    }

    @C0222u0
    /* renamed from: k */
    public void mo11641k(int i, int i2) {
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        boolean z = !aVar.mo11670d();
        int i3 = 0;
        boolean z2 = !z && aVar.mo11669c().size() == 0;
        if (z || z2) {
            int r2 = m13974r(i2);
            C2933a aVar2 = (C2933a) this.f10382c.get(r2);
            this.f10382c.remove(r);
            if (aVar2.mo11670d()) {
                i3 = aVar2.mo11669c().size();
            }
            int i4 = r2 + i3;
            this.f10382c.add(i4, aVar);
            mo7316a(r, i4);
            return;
        }
        int size = aVar.mo11669c().size();
        int i5 = 0;
        for (int i6 = 0; i6 < size + 1; i6++) {
            this.f10382c.remove(r);
            i5++;
        }
        mo7338d(r, i5);
        int r3 = m13974r(i2);
        if (r3 != -1) {
            C2933a aVar3 = (C2933a) this.f10382c.get(r3);
            if (aVar3.mo11670d()) {
                i3 = aVar3.mo11669c().size();
            }
        } else {
            r3 = this.f10382c.size();
        }
        int i7 = r3 + i3;
        this.f10382c.add(i7, aVar);
        List c = aVar.mo11669c();
        int size2 = c.size() + 1;
        this.f10382c.addAll(i7 + 1, c);
        mo7334c(i7, size2);
    }

    @C0222u0
    /* renamed from: l */
    public void mo11642l(int i, int i2) {
        int r = m13974r(i);
        int i3 = i;
        int i4 = r;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int b = m13970b(i4, (P) (C2934b) this.f10383d.get(i3));
            i5 += b;
            i4 += b;
            i3++;
        }
        mo7328b(r, i5);
    }

    /* renamed from: l */
    public boolean mo11643l(int i) {
        return i == 0;
    }

    @C0222u0
    /* renamed from: m */
    public void mo11645m(int i, int i2) {
        int i3;
        if (i < this.f10383d.size() - i2) {
            i3 = m13974r(i);
        } else {
            i3 = this.f10382c.size();
        }
        int i4 = 0;
        int i5 = i2 + i;
        int i6 = i3;
        while (i < i5) {
            int a = m13963a(i6, (P) (C2934b) this.f10383d.get(i));
            i6 += a;
            i4 += a;
            i++;
        }
        mo7334c(i3, i4);
    }

    @C0222u0
    /* renamed from: n */
    public void mo11646n(int i) {
        int i2;
        C2934b bVar = (C2934b) this.f10383d.get(i);
        if (i < this.f10383d.size() - 1) {
            i2 = m13974r(i);
        } else {
            i2 = this.f10382c.size();
        }
        mo7334c(i2, m13963a(i2, (P) bVar));
    }

    @C0222u0
    /* renamed from: o */
    public void mo11648o(int i) {
        int r = m13974r(i);
        mo7338d(r, m13975s(r));
    }

    /* access modifiers changed from: protected */
    @C0222u0
    /* renamed from: p */
    public void mo11649p(int i) {
        m13967a((C2933a) this.f10382c.get(i), i, true);
    }

    /* access modifiers changed from: protected */
    @C0222u0
    /* renamed from: q */
    public void mo11650q(int i) {
        m13972b((C2933a) this.f10382c.get(i), i, true);
    }

    @C0222u0
    /* renamed from: f */
    public void mo11628f() {
        for (P a : this.f10383d) {
            mo11617a(a);
        }
    }

    @C0222u0
    /* renamed from: h */
    public void mo11634h(int i) {
        mo11621b((P) (C2934b) this.f10383d.get(i));
    }

    @C0222u0
    /* renamed from: a */
    public void mo7322a(@C0193h0 RecyclerView recyclerView) {
        super.mo7322a(recyclerView);
        this.f10385f.add(recyclerView);
    }

    @C0222u0
    /* renamed from: g */
    public void mo11632g(int i) {
        mo11617a((P) (C2934b) this.f10383d.get(i));
    }

    @C0222u0
    /* renamed from: h */
    public void mo11635h(int i, int i2) {
        C2934b bVar = (C2934b) this.f10383d.get(i);
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a(bVar);
        if (aVar.mo11670d()) {
            int i3 = r + i2 + 1;
            this.f10382c.set(i3, (C2933a) aVar.mo11669c().get(i2));
            mo7337d(i3);
        }
    }

    @C0222u0
    /* renamed from: i */
    public void mo11637i(int i, int i2) {
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a((C2934b) this.f10383d.get(i));
        if (aVar.mo11670d()) {
            int i3 = r + i2 + 1;
            this.f10382c.add(i3, (C2933a) aVar.mo11669c().get(i2));
            mo7342e(i3);
        }
    }

    @C0222u0
    /* renamed from: j */
    public void mo11639j(int i, int i2) {
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a((C2934b) this.f10383d.get(i));
        if (aVar.mo11670d()) {
            int i3 = r + i2 + 1;
            this.f10382c.remove(i3);
            mo7343f(i3);
        }
    }

    @C0222u0
    /* renamed from: a */
    public void mo11615a(@C0195i0 C2930b bVar) {
        this.f10384e = bVar;
    }

    @C0222u0
    /* renamed from: c */
    public void mo11624c(int i, int i2, int i3) {
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a((C2934b) this.f10383d.get(i));
        if (aVar.mo11670d()) {
            List c = aVar.mo11669c();
            for (int i4 = 0; i4 < i3; i4++) {
                this.f10382c.add(r + i2 + i4 + 1, (C2933a) c.get(i2 + i4));
            }
            mo7334c(r + i2 + 1, i3);
        }
    }

    @C0222u0
    /* renamed from: a */
    public void mo11617a(@C0193h0 P p) {
        int indexOf = this.f10382c.indexOf(new C2933a(p));
        if (indexOf != -1) {
            m13966a((C2933a) this.f10382c.get(indexOf), indexOf);
        }
    }

    @C0222u0
    /* renamed from: b */
    public void mo7330b(@C0193h0 C1635d0 d0Var, int i) {
        if (i <= this.f10382c.size()) {
            C2933a aVar = (C2933a) this.f10382c.get(i);
            if (aVar.mo11671e()) {
                C2931d dVar = (C2931d) d0Var;
                if (dVar.mo11660J()) {
                    dVar.mo11659I();
                }
                dVar.mo11663c(aVar.mo11670d());
                dVar.f10391u0 = aVar.mo11668b();
                mo11616a((PVH) dVar, mo11638j(i), (P) aVar.mo11668b());
                return;
            }
            C2927b bVar = (C2927b) d0Var;
            bVar.f10375s0 = aVar.mo11665a();
            mo11614a(bVar, mo11638j(i), mo11636i(i), aVar.mo11665a());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Trying to bind item out of bounds, size ");
        sb.append(this.f10382c.size());
        sb.append(" flatPosition ");
        sb.append(i);
        sb.append(". Was the data changed without a call to notify...()?");
        throw new IllegalStateException(sb.toString());
    }

    @C0222u0
    /* renamed from: m */
    public void mo11644m(int i) {
        C2934b bVar = (C2934b) this.f10383d.get(i);
        int r = m13974r(i);
        mo7328b(r, m13970b(r, (P) bVar));
    }

    /* renamed from: n */
    public void mo11647n(int i, int i2) {
        int r = m13974r(i);
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += m13975s(r);
        }
        mo7338d(r, i3);
    }

    @C0222u0
    /* renamed from: a */
    public void mo11613a(@C0195i0 Bundle bundle) {
        if (bundle != null) {
            String str = f10377i;
            if (bundle.containsKey(str)) {
                HashMap hashMap = (HashMap) bundle.getSerializable(str);
                if (hashMap != null) {
                    ArrayList arrayList = new ArrayList();
                    int size = this.f10383d.size();
                    for (int i = 0; i < size; i++) {
                        C2933a aVar = new C2933a((C2934b) this.f10383d.get(i));
                        arrayList.add(aVar);
                        if (hashMap.containsKey(Integer.valueOf(i))) {
                            boolean booleanValue = ((Boolean) hashMap.get(Integer.valueOf(i))).booleanValue();
                            aVar.mo11667a(booleanValue);
                            if (booleanValue) {
                                List c = aVar.mo11669c();
                                int size2 = c.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    arrayList.add((C2933a) c.get(i2));
                                }
                            }
                        }
                    }
                    this.f10382c = arrayList;
                    mo7341e();
                }
            }
        }
    }

    @C0193h0
    @C0222u0
    /* renamed from: i */
    private HashMap<Integer, Boolean> m13973i() {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        int size = this.f10382c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f10382c.get(i2) != null) {
                C2933a aVar = (C2933a) this.f10382c.get(i2);
                if (aVar.mo11671e()) {
                    hashMap.put(Integer.valueOf(i2 - i), Boolean.valueOf(aVar.mo11670d()));
                } else {
                    i++;
                }
            }
        }
        return hashMap;
    }

    @C0222u0
    /* renamed from: b */
    public int mo7325b() {
        return this.f10382c.size();
    }

    @C0222u0
    /* renamed from: b */
    public void mo7332b(@C0193h0 RecyclerView recyclerView) {
        super.mo7332b(recyclerView);
        this.f10385f.remove(recyclerView);
    }

    @C0222u0
    /* renamed from: b */
    public void mo11621b(@C0193h0 P p) {
        int indexOf = this.f10382c.indexOf(new C2933a(p));
        if (indexOf != -1) {
            m13971b((C2933a) this.f10382c.get(indexOf), indexOf);
        }
    }

    @C0222u0
    /* renamed from: a */
    private void m13966a(@C0193h0 C2933a<P, C> aVar, int i) {
        for (RecyclerView findViewHolderForAdapterPosition : this.f10385f) {
            C2931d dVar = (C2931d) findViewHolderForAdapterPosition.findViewHolderForAdapterPosition(i);
            if (dVar != null && dVar.mo11658H()) {
                dVar.mo11663c(false);
                dVar.mo11662b(true);
            }
        }
        m13967a(aVar, i, false);
    }

    @C0222u0
    /* renamed from: b */
    public void mo11620b(@C0193h0 Bundle bundle) {
        bundle.putSerializable(f10377i, m13973i());
    }

    @C0222u0
    /* renamed from: b */
    private void m13971b(@C0193h0 C2933a<P, C> aVar, int i) {
        for (RecyclerView findViewHolderForAdapterPosition : this.f10385f) {
            C2931d dVar = (C2931d) findViewHolderForAdapterPosition.findViewHolderForAdapterPosition(i);
            if (dVar != null && !dVar.mo11658H()) {
                dVar.mo11663c(true);
                dVar.mo11662b(false);
            }
        }
        m13972b(aVar, i, false);
    }

    @C0222u0
    /* renamed from: a */
    private void m13967a(@C0193h0 C2933a<P, C> aVar, int i, boolean z) {
        if (aVar.mo11670d()) {
            aVar.mo11667a(false);
            this.f10386g.put(aVar.mo11668b(), Boolean.valueOf(false));
            List c = aVar.mo11669c();
            if (c != null) {
                int size = c.size();
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    this.f10382c.remove(i + i2 + 1);
                }
                mo7338d(i + 1, size);
            }
            if (z) {
                C2930b bVar = this.f10384e;
                if (bVar != null) {
                    bVar.mo11653a(mo11638j(i));
                }
            }
        }
    }

    @C0222u0
    /* renamed from: b */
    private void m13972b(@C0193h0 C2933a<P, C> aVar, int i, boolean z) {
        if (!aVar.mo11670d()) {
            aVar.mo11667a(true);
            this.f10386g.put(aVar.mo11668b(), Boolean.valueOf(true));
            List c = aVar.mo11669c();
            if (c != null) {
                int size = c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f10382c.add(i + i2 + 1, c.get(i2));
                }
                mo7334c(i + 1, size);
            }
            if (z) {
                C2930b bVar = this.f10384e;
                if (bVar != null) {
                    bVar.mo11654b(mo11638j(i));
                }
            }
        }
    }

    @C0222u0
    /* renamed from: a */
    private int m13963a(int i, P p) {
        C2933a aVar = new C2933a(p);
        this.f10382c.add(i, aVar);
        if (!aVar.mo11673f()) {
            return 1;
        }
        aVar.mo11667a(true);
        List c = aVar.mo11669c();
        this.f10382c.addAll(i + 1, c);
        return 1 + c.size();
    }

    @C0222u0
    /* renamed from: b */
    public void mo11622b(boolean z) {
        if (z) {
            this.f10382c = m13965a(this.f10383d, this.f10386g);
        } else {
            this.f10382c = m13964a(this.f10383d);
        }
        mo7341e();
    }

    /* renamed from: b */
    private int m13970b(int i, P p) {
        C2933a aVar = (C2933a) this.f10382c.get(i);
        aVar.mo11666a(p);
        if (!aVar.mo11670d()) {
            return 1;
        }
        List c = aVar.mo11669c();
        int size = c.size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            this.f10382c.set(i + i3 + 1, c.get(i3));
            i2++;
        }
        return i2;
    }

    @C0222u0
    /* renamed from: a */
    public void mo11612a(int i, int i2, int i3) {
        C2934b bVar = (C2934b) this.f10383d.get(i);
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a(bVar);
        if (aVar.mo11670d()) {
            int i4 = r + 1;
            int i5 = i2 + i4;
            int i6 = i4 + i3;
            this.f10382c.add(i6, (C2933a) this.f10382c.remove(i5));
            mo7316a(i5, i6);
        }
    }

    @C0222u0
    /* renamed from: b */
    public void mo11619b(int i, int i2, int i3) {
        C2934b bVar = (C2934b) this.f10383d.get(i);
        int r = m13974r(i);
        C2933a aVar = (C2933a) this.f10382c.get(r);
        aVar.mo11666a(bVar);
        if (aVar.mo11670d()) {
            int i4 = r + i2 + 1;
            for (int i5 = 0; i5 < i3; i5++) {
                this.f10382c.set(i4 + i5, (C2933a) aVar.mo11669c().get(i2 + i5));
            }
            mo7328b(i4, i3);
        }
    }

    /* renamed from: a */
    private List<C2933a<P, C>> m13964a(List<P> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2934b bVar = (C2934b) list.get(i);
            m13969a((List<C2933a<P, C>>) arrayList, (P) bVar, bVar.mo11676b());
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<C2933a<P, C>> m13965a(List<P> list, Map<P, Boolean> map) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2934b bVar = (C2934b) list.get(i);
            Boolean bool = (Boolean) map.get(bVar);
            m13969a((List<C2933a<P, C>>) arrayList, (P) bVar, bool == null ? bVar.mo11676b() : bool.booleanValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m13969a(List<C2933a<P, C>> list, P p, boolean z) {
        C2933a aVar = new C2933a(p);
        list.add(aVar);
        if (z) {
            m13968a(list, aVar);
        }
    }

    /* renamed from: a */
    private void m13968a(List<C2933a<P, C>> list, C2933a<P, C> aVar) {
        aVar.mo11667a(true);
        List c = aVar.mo11669c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            list.add((C2933a) c.get(i));
        }
    }
}
