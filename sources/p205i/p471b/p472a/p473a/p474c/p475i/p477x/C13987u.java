package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: i.b.a.a.c.i.x.u */
/* compiled from: TableSwitchInsnNode */
public class C13987u extends C13965a {

    /* renamed from: w */
    public int f41122w;

    /* renamed from: x */
    public int f41123x;

    /* renamed from: y */
    public C13976k f41124y;

    /* renamed from: z */
    public List<C13976k> f41125z = new ArrayList();

    public C13987u(int i, int i2, C13976k kVar, C13976k... kVarArr) {
        super(C13959t.f40792G2);
        this.f41122w = i;
        this.f41123x = i2;
        this.f41124y = kVar;
        if (kVarArr != null) {
            this.f41125z.addAll(Arrays.asList(kVarArr));
        }
    }

    /* renamed from: a */
    public void mo44226a(C13957r rVar) {
        C13956q[] qVarArr = new C13956q[this.f41125z.size()];
        for (int i = 0; i < qVarArr.length; i++) {
            qVarArr[i] = ((C13976k) this.f41125z.get(i)).mo44268e();
        }
        rVar.mo44173a(this.f41122w, this.f41123x, this.f41124y.mo44268e(), qVarArr);
        mo44228b(rVar);
    }

    /* renamed from: d */
    public int mo44230d() {
        return 11;
    }

    /* renamed from: a */
    public C13965a mo44225a(Map<C13976k, C13976k> map) {
        return new C13987u(this.f41122w, this.f41123x, C13965a.m60205a(this.f41124y, map), C13965a.m60206a(this.f41125z, map)).mo44224a((C13965a) this);
    }
}
