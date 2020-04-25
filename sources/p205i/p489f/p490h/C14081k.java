package p205i.p489f.p490h;

import java.util.ArrayList;
import java.util.List;
import p205i.p489f.C14064a;
import p205i.p489f.C14066c;

/* renamed from: i.f.h.k */
/* compiled from: SubstituteLoggerFactory */
public class C14081k implements C14064a {

    /* renamed from: a */
    final List f41364a = new ArrayList();

    /* renamed from: a */
    public C14066c mo44419a(String str) {
        synchronized (this.f41364a) {
            this.f41364a.add(str);
        }
        return C14077g.f41362b;
    }

    /* renamed from: a */
    public List mo44508a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f41364a) {
            arrayList.addAll(this.f41364a);
        }
        return arrayList;
    }
}
