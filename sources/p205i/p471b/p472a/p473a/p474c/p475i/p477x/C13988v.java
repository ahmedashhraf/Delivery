package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13956q;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;

/* renamed from: i.b.a.a.c.i.x.v */
/* compiled from: TryCatchBlockNode */
public class C13988v {

    /* renamed from: a */
    public C13976k f41126a;

    /* renamed from: b */
    public C13976k f41127b;

    /* renamed from: c */
    public C13976k f41128c;

    /* renamed from: d */
    public String f41129d;

    /* renamed from: e */
    public List<C13989w> f41130e;

    /* renamed from: f */
    public List<C13989w> f41131f;

    public C13988v(C13976k kVar, C13976k kVar2, C13976k kVar3, String str) {
        this.f41126a = kVar;
        this.f41127b = kVar2;
        this.f41128c = kVar3;
        this.f41129d = str;
    }

    /* renamed from: a */
    public void mo44279a(int i) {
        int i2 = (i << 8) | 1107296256;
        List<C13989w> list = this.f41130e;
        if (list != null) {
            for (C13989w wVar : list) {
                wVar.f41132e = i2;
            }
        }
        List<C13989w> list2 = this.f41131f;
        if (list2 != null) {
            for (C13989w wVar2 : list2) {
                wVar2.f41132e = i2;
            }
        }
    }

    /* renamed from: a */
    public void mo44280a(C13957r rVar) {
        C13956q qVar;
        int i;
        int i2;
        C13956q e = this.f41126a.mo44268e();
        C13956q e2 = this.f41127b.mo44268e();
        C13976k kVar = this.f41128c;
        if (kVar == null) {
            qVar = null;
        } else {
            qVar = kVar.mo44268e();
        }
        rVar.mo44181a(e, e2, qVar, this.f41129d);
        List<C13989w> list = this.f41130e;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        for (int i3 = 0; i3 < i; i3++) {
            C13989w wVar = (C13989w) this.f41130e.get(i3);
            wVar.mo44232a(rVar.mo44187b(wVar.f41132e, wVar.f41133f, wVar.f41051c, true));
        }
        List<C13989w> list2 = this.f41131f;
        if (list2 == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        for (int i4 = 0; i4 < i2; i4++) {
            C13989w wVar2 = (C13989w) this.f41131f.get(i4);
            wVar2.mo44232a(rVar.mo44187b(wVar2.f41132e, wVar2.f41133f, wVar2.f41051c, false));
        }
    }
}
