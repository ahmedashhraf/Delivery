package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13961v;

/* renamed from: i.b.a.a.c.i.x.n */
/* compiled from: LocalVariableAnnotationNode */
public class C13979n extends C13989w {

    /* renamed from: g */
    public List<C13976k> f41079g;

    /* renamed from: h */
    public List<C13976k> f41080h;

    /* renamed from: i */
    public List<Integer> f41081i;

    public C13979n(int i, C13961v vVar, C13976k[] kVarArr, C13976k[] kVarArr2, int[] iArr, String str) {
        this(327680, i, vVar, kVarArr, kVarArr2, iArr, str);
    }

    /* renamed from: a */
    public void mo44270a(C13957r rVar, boolean z) {
        C13956q[] qVarArr = new C13956q[this.f41079g.size()];
        C13956q[] qVarArr2 = new C13956q[this.f41080h.size()];
        int[] iArr = new int[this.f41081i.size()];
        for (int i = 0; i < qVarArr.length; i++) {
            qVarArr[i] = ((C13976k) this.f41079g.get(i)).mo44268e();
            qVarArr2[i] = ((C13976k) this.f41080h.get(i)).mo44268e();
            iArr[i] = ((Integer) this.f41081i.get(i)).intValue();
        }
        mo44232a(rVar.mo44169a(this.f41132e, this.f41133f, qVarArr, qVarArr2, iArr, this.f41051c, true));
    }

    public C13979n(int i, int i2, C13961v vVar, C13976k[] kVarArr, C13976k[] kVarArr2, int[] iArr, String str) {
        super(i, i2, vVar, str);
        this.f41079g = new ArrayList(kVarArr.length);
        this.f41079g.addAll(Arrays.asList(kVarArr));
        this.f41080h = new ArrayList(kVarArr2.length);
        this.f41080h.addAll(Arrays.asList(kVarArr2));
        this.f41081i = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            this.f41081i.add(Integer.valueOf(valueOf));
        }
    }
}
