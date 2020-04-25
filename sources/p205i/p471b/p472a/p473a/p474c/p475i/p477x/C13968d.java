package p205i.p471b.p472a.p473a.p474c.p475i.p477x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p205i.p471b.p472a.p473a.p474c.p475i.C13957r;

/* renamed from: i.b.a.a.c.i.x.d */
/* compiled from: FrameNode */
public class C13968d extends C13965a {

    /* renamed from: w */
    public int f41056w;

    /* renamed from: x */
    public List<Object> f41057x;

    /* renamed from: y */
    public List<Object> f41058y;

    private C13968d() {
        super(-1);
    }

    /* renamed from: a */
    public void mo44226a(C13957r rVar) {
        int i = this.f41056w;
        if (i == -1 || i == 0) {
            rVar.mo44174a(this.f41056w, this.f41057x.size(), m60228a(this.f41057x), this.f41058y.size(), m60228a(this.f41058y));
        } else if (i == 1) {
            rVar.mo44174a(i, this.f41057x.size(), m60228a(this.f41057x), 0, (Object[]) null);
        } else if (i == 2) {
            rVar.mo44174a(i, this.f41057x.size(), (Object[]) null, 0, (Object[]) null);
        } else if (i == 3) {
            rVar.mo44174a(i, 0, (Object[]) null, 0, (Object[]) null);
        } else if (i == 4) {
            rVar.mo44174a(i, 0, (Object[]) null, 1, m60228a(this.f41058y));
        }
    }

    /* renamed from: d */
    public int mo44230d() {
        return 14;
    }

    public C13968d(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super(-1);
        this.f41056w = i;
        if (i == -1 || i == 0) {
            this.f41057x = m60227a(i2, objArr);
            this.f41058y = m60227a(i3, objArr2);
        } else if (i == 1) {
            this.f41057x = m60227a(i2, objArr);
        } else if (i == 2) {
            this.f41057x = Arrays.asList(new Object[i2]);
        } else if (i != 3 && i == 4) {
            this.f41058y = m60227a(1, objArr2);
        }
    }

    /* renamed from: a */
    public C13965a mo44225a(Map<C13976k, C13976k> map) {
        C13968d dVar = new C13968d();
        dVar.f41056w = this.f41056w;
        if (this.f41057x != null) {
            dVar.f41057x = new ArrayList();
            for (int i = 0; i < this.f41057x.size(); i++) {
                Object obj = this.f41057x.get(i);
                if (obj instanceof C13976k) {
                    obj = map.get(obj);
                }
                dVar.f41057x.add(obj);
            }
        }
        if (this.f41058y != null) {
            dVar.f41058y = new ArrayList();
            for (int i2 = 0; i2 < this.f41058y.size(); i2++) {
                Object obj2 = this.f41058y.get(i2);
                if (obj2 instanceof C13976k) {
                    obj2 = map.get(obj2);
                }
                dVar.f41058y.add(obj2);
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static List<Object> m60227a(int i, Object[] objArr) {
        return Arrays.asList(objArr).subList(0, i);
    }

    /* renamed from: a */
    private static Object[] m60228a(List<Object> list) {
        Object[] objArr = new Object[list.size()];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = list.get(i);
            if (obj instanceof C13976k) {
                obj = ((C13976k) obj).mo44268e();
            }
            objArr[i] = obj;
        }
        return objArr;
    }
}
