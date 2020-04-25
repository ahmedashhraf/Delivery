package kotlin.p214b1.p216u;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: kotlin.b1.u.k1 */
/* compiled from: SpreadBuilder */
public class C14455k1 {

    /* renamed from: a */
    private final ArrayList<Object> f42583a;

    public C14455k1(int i) {
        this.f42583a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public int mo45599a() {
        return this.f42583a.size();
    }

    /* renamed from: b */
    public void mo45602b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f42583a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    for (Object add : objArr) {
                        this.f42583a.add(add);
                    }
                }
            } else if (obj instanceof Collection) {
                this.f42583a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add2 : (Iterable) obj) {
                    this.f42583a.add(add2);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f42583a.add(it.next());
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Don't know how to spread ");
                sb.append(obj.getClass());
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo45600a(Object obj) {
        this.f42583a.add(obj);
    }

    /* renamed from: a */
    public Object[] mo45601a(Object[] objArr) {
        return this.f42583a.toArray(objArr);
    }
}
