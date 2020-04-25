package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.v */
/* compiled from: ViewModelStore */
public class C1483v {

    /* renamed from: a */
    private final HashMap<String, C1477t> f5741a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6541a(String str, C1477t tVar) {
        C1477t tVar2 = (C1477t) this.f5741a.put(str, tVar);
        if (tVar2 != null) {
            tVar2.mo6367b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<String> mo6542b() {
        return new HashSet(this.f5741a.keySet());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1477t mo6539a(String str) {
        return (C1477t) this.f5741a.get(str);
    }

    /* renamed from: a */
    public final void mo6540a() {
        for (C1477t a : this.f5741a.values()) {
            a.mo6535a();
        }
        this.f5741a.clear();
    }
}
