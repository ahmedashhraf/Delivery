package androidx.fragment.app;

import androidx.annotation.C0195i0;
import androidx.lifecycle.C1483v;
import java.util.Collection;
import java.util.Map;

@Deprecated
/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentManagerNonConfig */
public class C1401j {
    @C0195i0

    /* renamed from: a */
    private final Collection<Fragment> f5506a;
    @C0195i0

    /* renamed from: b */
    private final Map<String, C1401j> f5507b;
    @C0195i0

    /* renamed from: c */
    private final Map<String, C1483v> f5508c;

    C1401j(@C0195i0 Collection<Fragment> collection, @C0195i0 Map<String, C1401j> map, @C0195i0 Map<String, C1483v> map2) {
        this.f5506a = collection;
        this.f5507b = map;
        this.f5508c = map2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6362a(Fragment fragment) {
        Collection<Fragment> collection = this.f5506a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: b */
    public Collection<Fragment> mo6363b() {
        return this.f5506a;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: c */
    public Map<String, C1483v> mo6364c() {
        return this.f5508c;
    }

    /* access modifiers changed from: 0000 */
    @C0195i0
    /* renamed from: a */
    public Map<String, C1401j> mo6361a() {
        return this.f5507b;
    }
}
