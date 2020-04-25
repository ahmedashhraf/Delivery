package p205i.p471b.p472a.p473a.p474c.p478j.p480c.p482e;

import java.util.ArrayList;
import java.util.List;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;
import p205i.p471b.p472a.p473a.p474c.p475i.p476w.C13962a;

/* renamed from: i.b.a.a.c.j.c.e.c */
/* compiled from: FrameSnapshot */
class C14006c implements C14007d {

    /* renamed from: c */
    private static final C14006c f41160c = new C14006c(null, null);

    /* renamed from: a */
    private final Object[] f41161a;

    /* renamed from: b */
    private final Object[] f41162b;

    private C14006c(Object[] objArr, Object[] objArr2) {
        this.f41161a = objArr;
        this.f41162b = objArr2;
    }

    /* renamed from: a */
    static C14007d m60386a(C13962a aVar, int i) {
        if (aVar != null) {
            List<Object> list = aVar.f41013l3;
            if (list != null) {
                return new C14006c(m60387a(list, 0), m60387a(aVar.f41014m3, i));
            }
        }
        return f41160c;
    }

    /* renamed from: a */
    private static Object[] m60387a(List<Object> list, int i) {
        ArrayList arrayList = new ArrayList(list);
        int size = list.size() - i;
        arrayList.subList(size, list.size()).clear();
        while (true) {
            size--;
            if (size < 0) {
                return arrayList.toArray();
            }
            Object obj = list.get(size);
            if (obj == C13959t.f40895f0 || obj == C13959t.f40890e0) {
                arrayList.remove(size + 1);
            }
        }
    }

    /* renamed from: a */
    public void mo44298a(C13957r rVar) {
        Object[] objArr = this.f41161a;
        if (objArr != null) {
            int length = objArr.length;
            Object[] objArr2 = this.f41162b;
            rVar.mo44174a(-1, length, objArr, objArr2.length, objArr2);
        }
    }
}
