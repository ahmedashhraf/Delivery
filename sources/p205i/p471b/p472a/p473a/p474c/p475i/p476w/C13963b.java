package p205i.p471b.p472a.p473a.p474c.p475i.p476w;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13965a;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13970f;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13972g;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13975j;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13976k;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13980o;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13981p;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13983r;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13987u;
import p205i.p471b.p472a.p473a.p474c.p475i.p477x.C13988v;

/* renamed from: i.b.a.a.c.i.w.b */
/* compiled from: JSRInlinerAdapter */
public class C13963b extends C13983r implements C13959t {

    /* renamed from: K3 */
    private static final boolean f41020K3 = false;

    /* renamed from: H3 */
    private final Map<C13976k, BitSet> f41021H3;

    /* renamed from: I3 */
    private final BitSet f41022I3;

    /* renamed from: J3 */
    final BitSet f41023J3;

    /* renamed from: i.b.a.a.c.i.w.b$a */
    /* compiled from: JSRInlinerAdapter */
    private class C13964a extends AbstractMap<C13976k, C13976k> {

        /* renamed from: N */
        public final Map<C13976k, C13976k> f41024N = new HashMap();

        /* renamed from: O */
        public final C13976k f41025O;

        /* renamed from: a */
        final C13964a f41027a;

        /* renamed from: b */
        public final BitSet f41028b;

        C13964a(C13964a aVar, BitSet bitSet) {
            this.f41027a = aVar;
            this.f41028b = bitSet;
            C13964a aVar2 = aVar;
            while (aVar2 != null) {
                if (aVar2.f41028b != bitSet) {
                    aVar2 = aVar2.f41027a;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Recursive invocation of ");
                    sb.append(bitSet);
                    throw new RuntimeException(sb.toString());
                }
            }
            if (aVar != null) {
                this.f41025O = new C13976k();
            } else {
                this.f41025O = null;
            }
            int f = C13963b.this.f41116z3.mo44255f();
            C13976k kVar = null;
            for (int i = 0; i < f; i++) {
                C13965a a = C13963b.this.f41116z3.mo44234a(i);
                if (a.mo44230d() == 8) {
                    C13976k kVar2 = (C13976k) a;
                    if (kVar == null) {
                        kVar = new C13976k();
                    }
                    this.f41024N.put(kVar2, kVar);
                } else if (mo44218a(i) == this) {
                    kVar = null;
                }
            }
        }

        /* renamed from: a */
        public C13964a mo44218a(int i) {
            if (!this.f41028b.get(i)) {
                return null;
            }
            if (!C13963b.this.f41023J3.get(i)) {
                return this;
            }
            C13964a aVar = this;
            for (C13964a aVar2 = this.f41027a; aVar2 != null; aVar2 = aVar2.f41027a) {
                if (aVar2.f41028b.get(i)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        /* renamed from: b */
        public C13976k mo44220b(C13976k kVar) {
            return (C13976k) this.f41024N.get(kVar);
        }

        public Set<Entry<C13976k, C13976k>> entrySet() {
            return null;
        }

        public C13976k get(Object obj) {
            return mo44219a((C13976k) obj);
        }

        /* renamed from: a */
        public C13976k mo44219a(C13976k kVar) {
            return (C13976k) mo44218a(C13963b.this.f41116z3.mo44248c(kVar)).f41024N.get(kVar);
        }
    }

    public C13963b(C13957r rVar, int i, String str, String str2, String str3, String[] strArr) {
        this(327680, rVar, i, str, str2, str3, strArr);
        if (getClass() != C13963b.class) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: b */
    private void m60197b(BitSet bitSet, int i, BitSet bitSet2) {
        do {
            C13965a a = this.f41116z3.mo44234a(i);
            if (!bitSet.get(i)) {
                bitSet.set(i);
                if (bitSet2.get(i)) {
                    this.f41023J3.set(i);
                }
                bitSet2.set(i);
                if (a.mo44230d() == 7 && a.mo44227b() != 168) {
                    m60197b(bitSet, this.f41116z3.mo44248c(((C13975j) a).f41074w), bitSet2);
                }
                if (a.mo44230d() == 11) {
                    C13987u uVar = (C13987u) a;
                    m60197b(bitSet, this.f41116z3.mo44248c(uVar.f41124y), bitSet2);
                    for (int size = uVar.f41125z.size() - 1; size >= 0; size--) {
                        m60197b(bitSet, this.f41116z3.mo44248c((C13976k) uVar.f41125z.get(size)), bitSet2);
                    }
                }
                if (a.mo44230d() == 12) {
                    C13981p pVar = (C13981p) a;
                    m60197b(bitSet, this.f41116z3.mo44248c(pVar.f41088w), bitSet2);
                    for (int size2 = pVar.f41090y.size() - 1; size2 >= 0; size2--) {
                        m60197b(bitSet, this.f41116z3.mo44248c((C13976k) pVar.f41090y.get(size2)), bitSet2);
                    }
                }
                int b = this.f41116z3.mo44234a(i).mo44227b();
                if (b != 167 && b != 191) {
                    switch (b) {
                        case C13959t.f40788F2 /*169*/:
                        case C13959t.f40792G2 /*170*/:
                        case C13959t.f40796H2 /*171*/:
                        case C13959t.f40800I2 /*172*/:
                        case C13959t.f40804J2 /*173*/:
                        case C13959t.f40808K2 /*174*/:
                        case 175:
                        case C13959t.f40816M2 /*176*/:
                        case C13959t.f40820N2 /*177*/:
                            break;
                        default:
                            i++;
                            break;
                    }
                } else {
                    break;
                }
            } else {
                return;
            }
        } while (i < this.f41116z3.mo44255f());
    }

    /* renamed from: d */
    private void m60198d() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C13964a(null, this.f41022I3));
        C13970f fVar = new C13970f();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (!linkedList.isEmpty()) {
            m60194a((C13964a) linkedList.removeFirst(), linkedList, fVar, arrayList, arrayList2);
        }
        this.f41116z3 = fVar;
        this.f41095A3 = arrayList;
        this.f41098D3 = arrayList2;
    }

    /* renamed from: e */
    private void m60199e() {
        BitSet bitSet = new BitSet();
        m60196a(this.f41022I3, 0, bitSet);
        for (Entry entry : this.f41021H3.entrySet()) {
            m60196a((BitSet) entry.getValue(), this.f41116z3.mo44248c((C13976k) entry.getKey()), bitSet);
        }
    }

    /* renamed from: a */
    public void mo44175a(int i, C13956q qVar) {
        super.mo44175a(i, qVar);
        C13976k kVar = ((C13975j) this.f41116z3.mo44249c()).f41074w;
        if (i == 168 && !this.f41021H3.containsKey(kVar)) {
            this.f41021H3.put(kVar, new BitSet());
        }
    }

    /* renamed from: c */
    public void mo44195c() {
        if (!this.f41021H3.isEmpty()) {
            m60199e();
            m60198d();
        }
        C13957r rVar = this.f40701k3;
        if (rVar != null) {
            mo44274a(rVar);
        }
    }

    protected C13963b(int i, C13957r rVar, int i2, String str, String str2, String str3, String[] strArr) {
        super(i, i2, str, str2, str3, strArr);
        this.f41021H3 = new HashMap();
        this.f41022I3 = new BitSet();
        this.f41023J3 = new BitSet();
        this.f40701k3 = rVar;
    }

    /* renamed from: a */
    private void m60196a(BitSet bitSet, int i, BitSet bitSet2) {
        m60197b(bitSet, i, bitSet2);
        boolean z = true;
        while (z) {
            z = false;
            for (C13988v vVar : this.f41095A3) {
                int c = this.f41116z3.mo44248c(vVar.f41128c);
                if (!bitSet.get(c)) {
                    int c2 = this.f41116z3.mo44248c(vVar.f41126a);
                    int c3 = this.f41116z3.mo44248c(vVar.f41127b);
                    int nextSetBit = bitSet.nextSetBit(c2);
                    if (nextSetBit != -1 && nextSetBit < c3) {
                        m60197b(bitSet, c, bitSet2);
                        z = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m60194a(C13964a aVar, List<C13964a> list, C13970f fVar, List<C13988v> list2, List<C13980o> list3) {
        int f = this.f41116z3.mo44255f();
        C13976k kVar = null;
        for (int i = 0; i < f; i++) {
            C13965a a = this.f41116z3.mo44234a(i);
            C13964a a2 = aVar.mo44218a(i);
            if (a.mo44230d() == 8) {
                C13976k b = aVar.mo44220b((C13976k) a);
                if (b != kVar) {
                    fVar.mo44237a((C13965a) b);
                    kVar = b;
                }
            } else if (a2 != aVar) {
                continue;
            } else if (a.mo44227b() == 169) {
                C13976k kVar2 = null;
                for (C13964a aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f41027a) {
                    if (aVar2.f41028b.get(i)) {
                        kVar2 = aVar2.f41025O;
                    }
                }
                if (kVar2 != null) {
                    fVar.mo44237a((C13965a) new C13975j(C13959t.f40780D2, kVar2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Instruction #");
                    sb.append(i);
                    sb.append(" is a RET not owned by any subroutine");
                    throw new RuntimeException(sb.toString());
                }
            } else if (a.mo44227b() == 168) {
                C13976k kVar3 = ((C13975j) a).f41074w;
                C13964a aVar3 = new C13964a(aVar, (BitSet) this.f41021H3.get(kVar3));
                C13976k a3 = aVar3.mo44219a(kVar3);
                fVar.mo44237a((C13965a) new C13972g(1));
                fVar.mo44237a((C13965a) new C13975j(C13959t.f40780D2, a3));
                fVar.mo44237a((C13965a) aVar3.f41025O);
                list.add(aVar3);
            } else {
                fVar.mo44237a(a.mo44225a((Map<C13976k, C13976k>) aVar));
            }
        }
        for (C13988v vVar : this.f41095A3) {
            C13976k b2 = aVar.mo44220b(vVar.f41126a);
            C13976k b3 = aVar.mo44220b(vVar.f41127b);
            if (b2 != b3) {
                C13976k a4 = aVar.mo44219a(vVar.f41128c);
                if (b2 == null || b3 == null || a4 == null) {
                    throw new RuntimeException("Internal error!");
                }
                list2.add(new C13988v(b2, b3, a4, vVar.f41129d));
            }
        }
        for (C13980o oVar : this.f41098D3) {
            C13976k b4 = aVar.mo44220b(oVar.f41085d);
            C13976k b5 = aVar.mo44220b(oVar.f41086e);
            if (b4 != b5) {
                C13980o oVar2 = new C13980o(oVar.f41082a, oVar.f41083b, oVar.f41084c, b4, b5, oVar.f41087f);
                list3.add(oVar2);
            }
        }
    }

    /* renamed from: a */
    private static void m60195a(String str) {
        System.err.println(str);
    }
}
