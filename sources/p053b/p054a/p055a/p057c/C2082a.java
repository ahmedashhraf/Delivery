package p053b.p054a.p055a.p057c;

import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.HashMap;
import java.util.Map.Entry;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: b.a.a.c.a */
/* compiled from: FastSafeIterableMap */
public class C2082a<K, V> extends C2083b<K, V> {

    /* renamed from: P */
    private HashMap<K, C2086c<K, V>> f7948P = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C2086c<K, V> mo9054a(K k) {
        return (C2086c) this.f7948P.get(k);
    }

    /* renamed from: b */
    public V mo9055b(@C0193h0 K k, @C0193h0 V v) {
        C2086c a = mo9054a(k);
        if (a != null) {
            return a.f7956b;
        }
        this.f7948P.put(k, mo9059a(k, v));
        return null;
    }

    /* renamed from: c */
    public Entry<K, V> mo9056c(K k) {
        if (contains(k)) {
            return ((C2086c) this.f7948P.get(k)).f7954O;
        }
        return null;
    }

    public boolean contains(K k) {
        return this.f7948P.containsKey(k);
    }

    public V remove(@C0193h0 K k) {
        V remove = super.remove(k);
        this.f7948P.remove(k);
        return remove;
    }
}
