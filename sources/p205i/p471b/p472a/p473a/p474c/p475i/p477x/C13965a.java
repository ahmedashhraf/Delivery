package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13940a;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;

/* renamed from: i.b.a.a.c.i.x.a */
/* compiled from: AbstractInsnNode */
public abstract class C13965a {

    /* renamed from: g */
    public static final int f41029g = 0;

    /* renamed from: h */
    public static final int f41030h = 1;

    /* renamed from: i */
    public static final int f41031i = 2;

    /* renamed from: j */
    public static final int f41032j = 3;

    /* renamed from: k */
    public static final int f41033k = 4;

    /* renamed from: l */
    public static final int f41034l = 5;

    /* renamed from: m */
    public static final int f41035m = 6;

    /* renamed from: n */
    public static final int f41036n = 7;

    /* renamed from: o */
    public static final int f41037o = 8;

    /* renamed from: p */
    public static final int f41038p = 9;

    /* renamed from: q */
    public static final int f41039q = 10;

    /* renamed from: r */
    public static final int f41040r = 11;

    /* renamed from: s */
    public static final int f41041s = 12;

    /* renamed from: t */
    public static final int f41042t = 13;

    /* renamed from: u */
    public static final int f41043u = 14;

    /* renamed from: v */
    public static final int f41044v = 15;

    /* renamed from: a */
    protected int f41045a;

    /* renamed from: b */
    public List<C13989w> f41046b;

    /* renamed from: c */
    public List<C13989w> f41047c;

    /* renamed from: d */
    C13965a f41048d;

    /* renamed from: e */
    C13965a f41049e;

    /* renamed from: f */
    int f41050f = -1;

    protected C13965a(int i) {
        this.f41045a = i;
    }

    /* renamed from: a */
    public C13965a mo44223a() {
        return this.f41049e;
    }

    /* renamed from: a */
    public abstract C13965a mo44225a(Map<C13976k, C13976k> map);

    /* renamed from: a */
    public abstract void mo44226a(C13957r rVar);

    /* renamed from: b */
    public int mo44227b() {
        return this.f41045a;
    }

    /* renamed from: c */
    public C13965a mo44229c() {
        return this.f41048d;
    }

    /* renamed from: d */
    public abstract int mo44230d();

    /* renamed from: a */
    static C13976k m60205a(C13976k kVar, Map<C13976k, C13976k> map) {
        return (C13976k) map.get(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44228b(C13957r rVar) {
        int i;
        int i2;
        List<C13989w> list = this.f41046b;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        for (int i3 = 0; i3 < i; i3++) {
            C13989w wVar = (C13989w) this.f41046b.get(i3);
            wVar.mo44232a(rVar.mo44168a(wVar.f41132e, wVar.f41133f, wVar.f41051c, true));
        }
        List<C13989w> list2 = this.f41047c;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C13989w wVar2 = (C13989w) this.f41047c.get(i4);
            wVar2.mo44232a(rVar.mo44168a(wVar2.f41132e, wVar2.f41133f, wVar2.f41051c, false));
        }
    }

    /* renamed from: a */
    static C13976k[] m60206a(List<C13976k> list, Map<C13976k, C13976k> map) {
        C13976k[] kVarArr = new C13976k[list.size()];
        for (int i = 0; i < kVarArr.length; i++) {
            kVarArr[i] = (C13976k) map.get(list.get(i));
        }
        return kVarArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C13965a mo44224a(C13965a aVar) {
        if (aVar.f41046b != null) {
            this.f41046b = new ArrayList();
            for (int i = 0; i < aVar.f41046b.size(); i++) {
                C13989w wVar = (C13989w) aVar.f41046b.get(i);
                C13989w wVar2 = new C13989w(wVar.f41132e, wVar.f41133f, wVar.f41051c);
                wVar.mo44232a((C13940a) wVar2);
                this.f41046b.add(wVar2);
            }
        }
        if (aVar.f41047c != null) {
            this.f41047c = new ArrayList();
            for (int i2 = 0; i2 < aVar.f41047c.size(); i2++) {
                C13989w wVar3 = (C13989w) aVar.f41047c.get(i2);
                C13989w wVar4 = new C13989w(wVar3.f41132e, wVar3.f41133f, wVar3.f41051c);
                wVar3.mo44232a((C13940a) wVar4);
                this.f41047c.add(wVar4);
            }
        }
        return this;
    }
}
