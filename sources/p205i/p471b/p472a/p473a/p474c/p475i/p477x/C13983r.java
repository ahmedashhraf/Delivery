package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13940a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13942c;
import p205i.p471b.p472a.p473a.p474c.p475i.C13945f;
import p205i.p471b.p472a.p473a.p474c.p475i.C13953n;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13960u;
import p205i.p471b.p472a.p473a.p474c.p475i.C13961v;

/* renamed from: i.b.a.a.c.i.x.r */
/* compiled from: MethodNode */
public class C13983r extends C13957r {

    /* renamed from: A3 */
    public List<C13988v> f41095A3;

    /* renamed from: B3 */
    public int f41096B3;

    /* renamed from: C3 */
    public int f41097C3;

    /* renamed from: D3 */
    public List<C13980o> f41098D3;

    /* renamed from: E3 */
    public List<C13979n> f41099E3;

    /* renamed from: F3 */
    public List<C13979n> f41100F3;

    /* renamed from: G3 */
    private boolean f41101G3;

    /* renamed from: l3 */
    public int f41102l3;

    /* renamed from: m3 */
    public String f41103m3;

    /* renamed from: n3 */
    public String f41104n3;

    /* renamed from: o3 */
    public String f41105o3;

    /* renamed from: p3 */
    public List<String> f41106p3;

    /* renamed from: q3 */
    public List<C13986t> f41107q3;

    /* renamed from: r3 */
    public List<C13966b> f41108r3;

    /* renamed from: s3 */
    public List<C13966b> f41109s3;

    /* renamed from: t3 */
    public List<C13989w> f41110t3;

    /* renamed from: u3 */
    public List<C13989w> f41111u3;

    /* renamed from: v3 */
    public List<C13942c> f41112v3;

    /* renamed from: w3 */
    public Object f41113w3;

    /* renamed from: x3 */
    public List<C13966b>[] f41114x3;

    /* renamed from: y3 */
    public List<C13966b>[] f41115y3;

    /* renamed from: z3 */
    public C13970f f41116z3;

    /* renamed from: i.b.a.a.c.i.x.r$a */
    /* compiled from: MethodNode */
    class C13984a extends ArrayList<Object> {
        C13984a(int i) {
            super(i);
        }

        public boolean add(Object obj) {
            C13983r.this.f41113w3 = obj;
            return super.add(obj);
        }
    }

    public C13983r() {
        this(327680);
        if (getClass() != C13983r.class) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public C13940a mo44167a() {
        return new C13966b((List<Object>) new C13984a<Object>(0));
    }

    /* renamed from: b */
    public void mo44188b() {
    }

    /* renamed from: b */
    public void mo44193b(String str, int i) {
        if (this.f41107q3 == null) {
            this.f41107q3 = new ArrayList(5);
        }
        this.f41107q3.add(new C13986t(str, i));
    }

    /* renamed from: c */
    public C13940a mo44194c(int i, C13961v vVar, String str, boolean z) {
        C13989w wVar = new C13989w(i, vVar, str);
        if (z) {
            if (this.f41110t3 == null) {
                this.f41110t3 = new ArrayList(1);
            }
            this.f41110t3.add(wVar);
        } else {
            if (this.f41111u3 == null) {
                this.f41111u3 = new ArrayList(1);
            }
            this.f41111u3.add(wVar);
        }
        return wVar;
    }

    /* renamed from: c */
    public void mo44195c() {
    }

    /* renamed from: d */
    public void mo44197d(int i, int i2) {
        this.f41116z3.mo44237a((C13965a) new C13991y(i, i2));
    }

    /* renamed from: a */
    public C13940a mo44171a(String str, boolean z) {
        C13966b bVar = new C13966b(str);
        if (z) {
            if (this.f41108r3 == null) {
                this.f41108r3 = new ArrayList(1);
            }
            this.f41108r3.add(bVar);
        } else {
            if (this.f41109s3 == null) {
                this.f41109s3 = new ArrayList(1);
            }
            this.f41109s3.add(bVar);
        }
        return bVar;
    }

    public C13983r(int i) {
        super(i);
        this.f41116z3 = new C13970f();
    }

    /* renamed from: b */
    public void mo44189b(int i) {
        this.f41116z3.mo44237a((C13965a) new C13972g(i));
    }

    /* renamed from: b */
    public void mo44190b(int i, int i2) {
        this.f41116z3.mo44237a((C13965a) new C13973h(i, i2));
    }

    public C13983r(int i, String str, String str2, String str3, String[] strArr) {
        this(327680, i, str, str2, str3, strArr);
        if (getClass() != C13983r.class) {
            throw new IllegalStateException();
        }
    }

    @Deprecated
    /* renamed from: b */
    public void mo44192b(int i, String str, String str2, String str3) {
        if (this.f40700j3 >= 327680) {
            super.mo44192b(i, str, str2, str3);
        } else {
            this.f41116z3.mo44237a((C13965a) new C13982q(i, str, str2, str3));
        }
    }

    /* renamed from: c */
    public void mo44196c(int i, int i2) {
        this.f41096B3 = i;
        this.f41097C3 = i2;
    }

    public C13983r(int i, int i2, String str, String str2, String str3, String[] strArr) {
        super(i);
        this.f41102l3 = i2;
        this.f41103m3 = str;
        this.f41104n3 = str2;
        this.f41105o3 = str3;
        boolean z = false;
        this.f41106p3 = new ArrayList(strArr == null ? 0 : strArr.length);
        if ((i2 & 1024) != 0) {
            z = true;
        }
        if (!z) {
            this.f41098D3 = new ArrayList(5);
        }
        this.f41095A3 = new ArrayList();
        if (strArr != null) {
            this.f41106p3.addAll(Arrays.asList(strArr));
        }
        this.f41116z3 = new C13970f();
    }

    /* renamed from: a */
    public C13940a mo44170a(int i, String str, boolean z) {
        C13966b bVar = new C13966b(str);
        if (z) {
            if (this.f41114x3 == null) {
                this.f41114x3 = new List[C13960u.m60138a(this.f41104n3).length];
            }
            List<C13966b>[] listArr = this.f41114x3;
            if (listArr[i] == null) {
                listArr[i] = new ArrayList(1);
            }
            this.f41114x3[i].add(bVar);
        } else {
            if (this.f41115y3 == null) {
                this.f41115y3 = new List[C13960u.m60138a(this.f41104n3).length];
            }
            List<C13966b>[] listArr2 = this.f41115y3;
            if (listArr2[i] == null) {
                listArr2[i] = new ArrayList(1);
            }
            this.f41115y3[i].add(bVar);
        }
        return bVar;
    }

    /* renamed from: b */
    public C13940a mo44187b(int i, C13961v vVar, String str, boolean z) {
        C13988v vVar2 = (C13988v) this.f41095A3.get((16776960 & i) >> 8);
        C13989w wVar = new C13989w(i, vVar, str);
        if (z) {
            if (vVar2.f41130e == null) {
                vVar2.f41130e = new ArrayList(1);
            }
            vVar2.f41130e.add(wVar);
        } else {
            if (vVar2.f41131f == null) {
                vVar2.f41131f = new ArrayList(1);
            }
            vVar2.f41131f.add(wVar);
        }
        return wVar;
    }

    /* renamed from: c */
    public void mo44276c(int i) {
        if (i == 262144) {
            List<C13989w> list = this.f41110t3;
            if (list == null || list.size() <= 0) {
                List<C13989w> list2 = this.f41111u3;
                if (list2 == null || list2.size() <= 0) {
                    List<C13988v> list3 = this.f41095A3;
                    int size = list3 == null ? 0 : list3.size();
                    int i2 = 0;
                    while (i2 < size) {
                        C13988v vVar = (C13988v) this.f41095A3.get(i2);
                        List<C13989w> list4 = vVar.f41130e;
                        if (list4 == null || list4.size() <= 0) {
                            List<C13989w> list5 = vVar.f41131f;
                            if (list5 == null || list5.size() <= 0) {
                                i2++;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    int i3 = 0;
                    while (i3 < this.f41116z3.mo44255f()) {
                        C13965a a = this.f41116z3.mo44234a(i3);
                        List<C13989w> list6 = a.f41046b;
                        if (list6 == null || list6.size() <= 0) {
                            List<C13989w> list7 = a.f41047c;
                            if (list7 == null || list7.size() <= 0) {
                                if (a instanceof C13982q) {
                                    if (((C13982q) a).f41094z != (a.f41045a == 185)) {
                                        throw new RuntimeException();
                                    }
                                }
                                i3++;
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    List<C13979n> list8 = this.f41099E3;
                    if (list8 == null || list8.size() <= 0) {
                        List<C13979n> list9 = this.f41100F3;
                        if (list9 != null && list9.size() > 0) {
                            throw new RuntimeException();
                        }
                        return;
                    }
                    throw new RuntimeException();
                }
                throw new RuntimeException();
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: b */
    public void mo44191b(int i, C13956q qVar) {
        this.f41116z3.mo44237a((C13965a) new C13978m(i, mo44275b(qVar)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C13976k mo44275b(C13956q qVar) {
        if (!(qVar.f40688a instanceof C13976k)) {
            qVar.f40688a = new C13976k();
        }
        return (C13976k) qVar.f40688a;
    }

    /* renamed from: a */
    public void mo44179a(C13942c cVar) {
        if (this.f41112v3 == null) {
            this.f41112v3 = new ArrayList(1);
        }
        this.f41112v3.add(cVar);
    }

    /* renamed from: a */
    public void mo44174a(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        Object[] objArr3;
        Object[] objArr4;
        C13970f fVar = this.f41116z3;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = m60293a(objArr);
        }
        if (objArr2 == null) {
            objArr4 = null;
        } else {
            objArr4 = m60293a(objArr2);
        }
        C13968d dVar = new C13968d(i, i2, objArr3, i3, objArr4);
        fVar.mo44237a((C13965a) dVar);
    }

    /* renamed from: a */
    public void mo44176a(int i, String str) {
        this.f41116z3.mo44237a((C13965a) new C13990x(i, str));
    }

    /* renamed from: a */
    public void mo44177a(int i, String str, String str2, String str3) {
        this.f41116z3.mo44237a((C13965a) new C13967c(i, str, str2, str3));
    }

    /* renamed from: a */
    public void mo44178a(int i, String str, String str2, String str3, boolean z) {
        if (this.f40700j3 < 327680) {
            super.mo44178a(i, str, str2, str3, z);
            return;
        }
        C13970f fVar = this.f41116z3;
        C13982q qVar = new C13982q(i, str, str2, str3, z);
        fVar.mo44237a((C13965a) qVar);
    }

    /* renamed from: a */
    public void mo44185a(String str, String str2, C13953n nVar, Object... objArr) {
        this.f41116z3.mo44237a((C13965a) new C13974i(str, str2, nVar, objArr));
    }

    /* renamed from: a */
    public void mo44175a(int i, C13956q qVar) {
        this.f41116z3.mo44237a((C13965a) new C13975j(i, mo44275b(qVar)));
    }

    /* renamed from: a */
    public void mo44180a(C13956q qVar) {
        this.f41116z3.mo44237a((C13965a) mo44275b(qVar));
    }

    /* renamed from: a */
    public void mo44183a(Object obj) {
        this.f41116z3.mo44237a((C13965a) new C13977l(obj));
    }

    /* renamed from: a */
    public void mo44172a(int i, int i2) {
        this.f41116z3.mo44237a((C13965a) new C13969e(i, i2));
    }

    /* renamed from: a */
    public void mo44173a(int i, int i2, C13956q qVar, C13956q... qVarArr) {
        this.f41116z3.mo44237a((C13965a) new C13987u(i, i2, mo44275b(qVar), m60292a(qVarArr)));
    }

    /* renamed from: a */
    public void mo44182a(C13956q qVar, int[] iArr, C13956q[] qVarArr) {
        this.f41116z3.mo44237a((C13965a) new C13981p(mo44275b(qVar), iArr, m60292a(qVarArr)));
    }

    /* renamed from: a */
    public void mo44184a(String str, int i) {
        this.f41116z3.mo44237a((C13965a) new C13985s(str, i));
    }

    /* renamed from: a */
    public C13940a mo44168a(int i, C13961v vVar, String str, boolean z) {
        C13965a c = this.f41116z3.mo44249c();
        while (c.mo44227b() == -1) {
            c = c.mo44229c();
        }
        C13989w wVar = new C13989w(i, vVar, str);
        if (z) {
            if (c.f41046b == null) {
                c.f41046b = new ArrayList(1);
            }
            c.f41046b.add(wVar);
        } else {
            if (c.f41047c == null) {
                c.f41047c = new ArrayList(1);
            }
            c.f41047c.add(wVar);
        }
        return wVar;
    }

    /* renamed from: a */
    public void mo44181a(C13956q qVar, C13956q qVar2, C13956q qVar3, String str) {
        this.f41095A3.add(new C13988v(mo44275b(qVar), mo44275b(qVar2), mo44275b(qVar3), str));
    }

    /* renamed from: a */
    public void mo44186a(String str, String str2, String str3, C13956q qVar, C13956q qVar2, int i) {
        List<C13980o> list = this.f41098D3;
        C13980o oVar = new C13980o(str, str2, str3, mo44275b(qVar), mo44275b(qVar2), i);
        list.add(oVar);
    }

    /* renamed from: a */
    public C13940a mo44169a(int i, C13961v vVar, C13956q[] qVarArr, C13956q[] qVarArr2, int[] iArr, String str, boolean z) {
        C13979n nVar = new C13979n(i, vVar, m60292a(qVarArr), m60292a(qVarArr2), iArr, str);
        if (z) {
            if (this.f41099E3 == null) {
                this.f41099E3 = new ArrayList(1);
            }
            this.f41099E3.add(nVar);
        } else {
            if (this.f41100F3 == null) {
                this.f41100F3 = new ArrayList(1);
            }
            this.f41100F3.add(nVar);
        }
        return nVar;
    }

    /* renamed from: a */
    private C13976k[] m60292a(C13956q[] qVarArr) {
        C13976k[] kVarArr = new C13976k[qVarArr.length];
        for (int i = 0; i < qVarArr.length; i++) {
            kVarArr[i] = mo44275b(qVarArr[i]);
        }
        return kVarArr;
    }

    /* renamed from: a */
    private Object[] m60293a(Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            C13976k kVar = objArr[i];
            if (kVar instanceof C13956q) {
                kVar = mo44275b((C13956q) kVar);
            }
            objArr2[i] = kVar;
        }
        return objArr2;
    }

    /* renamed from: a */
    public void mo44273a(C13945f fVar) {
        String[] strArr = new String[this.f41106p3.size()];
        this.f41106p3.toArray(strArr);
        C13957r a = fVar.mo44097a(this.f41102l3, this.f41103m3, this.f41104n3, this.f41105o3, strArr);
        if (a != null) {
            mo44274a(a);
        }
    }

    /* renamed from: a */
    public void mo44274a(C13957r rVar) {
        int i;
        int i2;
        int i3;
        List<C13986t> list = this.f41107q3;
        int size = list == null ? 0 : list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C13986t tVar = (C13986t) this.f41107q3.get(i4);
            rVar.mo44193b(tVar.f41120a, tVar.f41121b);
        }
        if (this.f41113w3 != null) {
            C13940a a = rVar.mo44167a();
            C13966b.m60215a(a, (String) null, this.f41113w3);
            if (a != null) {
                a.mo44053a();
            }
        }
        List<C13966b> list2 = this.f41108r3;
        int size2 = list2 == null ? 0 : list2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C13966b bVar = (C13966b) this.f41108r3.get(i5);
            bVar.mo44232a(rVar.mo44171a(bVar.f41051c, true));
        }
        List<C13966b> list3 = this.f41109s3;
        int size3 = list3 == null ? 0 : list3.size();
        for (int i6 = 0; i6 < size3; i6++) {
            C13966b bVar2 = (C13966b) this.f41109s3.get(i6);
            bVar2.mo44232a(rVar.mo44171a(bVar2.f41051c, false));
        }
        List<C13989w> list4 = this.f41110t3;
        int size4 = list4 == null ? 0 : list4.size();
        for (int i7 = 0; i7 < size4; i7++) {
            C13989w wVar = (C13989w) this.f41110t3.get(i7);
            wVar.mo44232a(rVar.mo44194c(wVar.f41132e, wVar.f41133f, wVar.f41051c, true));
        }
        List<C13989w> list5 = this.f41111u3;
        if (list5 == null) {
            i = 0;
        } else {
            i = list5.size();
        }
        for (int i8 = 0; i8 < i; i8++) {
            C13989w wVar2 = (C13989w) this.f41111u3.get(i8);
            wVar2.mo44232a(rVar.mo44194c(wVar2.f41132e, wVar2.f41133f, wVar2.f41051c, false));
        }
        List<C13966b>[] listArr = this.f41114x3;
        int length = listArr == null ? 0 : listArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            List<C13966b> list6 = this.f41114x3[i9];
            if (list6 != null) {
                for (int i10 = 0; i10 < list6.size(); i10++) {
                    C13966b bVar3 = (C13966b) list6.get(i10);
                    bVar3.mo44232a(rVar.mo44170a(i9, bVar3.f41051c, true));
                }
            }
        }
        List<C13966b>[] listArr2 = this.f41115y3;
        int length2 = listArr2 == null ? 0 : listArr2.length;
        for (int i11 = 0; i11 < length2; i11++) {
            List<C13966b> list7 = this.f41115y3[i11];
            if (list7 != null) {
                for (int i12 = 0; i12 < list7.size(); i12++) {
                    C13966b bVar4 = (C13966b) list7.get(i12);
                    bVar4.mo44232a(rVar.mo44170a(i11, bVar4.f41051c, false));
                }
            }
        }
        if (this.f41101G3) {
            this.f41116z3.mo44253e();
        }
        List<C13942c> list8 = this.f41112v3;
        int size5 = list8 == null ? 0 : list8.size();
        for (int i13 = 0; i13 < size5; i13++) {
            rVar.mo44179a((C13942c) this.f41112v3.get(i13));
        }
        if (this.f41116z3.mo44255f() > 0) {
            rVar.mo44188b();
            List<C13988v> list9 = this.f41095A3;
            int size6 = list9 == null ? 0 : list9.size();
            for (int i14 = 0; i14 < size6; i14++) {
                ((C13988v) this.f41095A3.get(i14)).mo44279a(i14);
                ((C13988v) this.f41095A3.get(i14)).mo44280a(rVar);
            }
            this.f41116z3.mo44236a(rVar);
            List<C13980o> list10 = this.f41098D3;
            int size7 = list10 == null ? 0 : list10.size();
            for (int i15 = 0; i15 < size7; i15++) {
                ((C13980o) this.f41098D3.get(i15)).mo44271a(rVar);
            }
            List<C13979n> list11 = this.f41099E3;
            if (list11 == null) {
                i2 = 0;
            } else {
                i2 = list11.size();
            }
            for (int i16 = 0; i16 < i2; i16++) {
                ((C13979n) this.f41099E3.get(i16)).mo44270a(rVar, true);
            }
            List<C13979n> list12 = this.f41100F3;
            if (list12 == null) {
                i3 = 0;
            } else {
                i3 = list12.size();
            }
            for (int i17 = 0; i17 < i3; i17++) {
                ((C13979n) this.f41100F3.get(i17)).mo44270a(rVar, false);
            }
            rVar.mo44196c(this.f41096B3, this.f41097C3);
            this.f41101G3 = true;
        }
        rVar.mo44195c();
    }
}
