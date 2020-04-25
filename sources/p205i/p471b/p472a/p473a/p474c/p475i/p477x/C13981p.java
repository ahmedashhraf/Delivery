package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

/* renamed from: i.b.a.a.c.i.x.p */
/* compiled from: LookupSwitchInsnNode */
public class C13981p extends C13965a {

    /* renamed from: w */
    public C13976k f41088w;

    /* renamed from: x */
    public List<Integer> f41089x;

    /* renamed from: y */
    public List<C13976k> f41090y;

    public C13981p(C13976k kVar, int[] iArr, C13976k[] kVarArr) {
        super(C13959t.f40796H2);
        this.f41088w = kVar;
        this.f41089x = new ArrayList(iArr == null ? 0 : iArr.length);
        this.f41090y = new ArrayList(kVarArr == null ? 0 : kVarArr.length);
        if (iArr != null) {
            for (int valueOf : iArr) {
                this.f41089x.add(Integer.valueOf(valueOf));
            }
        }
        if (kVarArr != null) {
            this.f41090y.addAll(Arrays.asList(kVarArr));
        }
    }

    /* renamed from: a */
    public void mo44226a(C13957r rVar) {
        int[] iArr = new int[this.f41089x.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = ((Integer) this.f41089x.get(i)).intValue();
        }
        C13956q[] qVarArr = new C13956q[this.f41090y.size()];
        for (int i2 = 0; i2 < qVarArr.length; i2++) {
            qVarArr[i2] = ((C13976k) this.f41090y.get(i2)).mo44268e();
        }
        rVar.mo44182a(this.f41088w.mo44268e(), iArr, qVarArr);
        mo44228b(rVar);
    }

    /* renamed from: d */
    public int mo44230d() {
        return 12;
    }

    /* renamed from: a */
    public C13965a mo44225a(Map<C13976k, C13976k> map) {
        C13981p pVar = new C13981p(C13965a.m60205a(this.f41088w, map), null, C13965a.m60206a(this.f41090y, map));
        pVar.f41089x.addAll(this.f41089x);
        return pVar.mo44224a((C13965a) this);
    }
}
