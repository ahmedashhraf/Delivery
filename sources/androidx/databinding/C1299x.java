package androidx.databinding;

import androidx.collection.C0635a;
import androidx.databinding.C1171a0.C1172a;
import java.util.Collection;

/* renamed from: androidx.databinding.x */
/* compiled from: ObservableArrayMap */
public class C1299x<K, V> extends C0635a<K, V> implements C1171a0<K, V> {

    /* renamed from: Y */
    private transient C1293t f5178Y;

    /* renamed from: d */
    private void m6906d(Object obj) {
        C1293t tVar = this.f5178Y;
        if (tVar != null) {
            tVar.mo5666a(this, 0, obj);
        }
    }

    /* renamed from: a */
    public void mo5581a(C1172a<? extends C1171a0<K, V>, K, V> aVar) {
        if (this.f5178Y == null) {
            this.f5178Y = new C1293t();
        }
        this.f5178Y.mo5665a(aVar);
    }

    /* renamed from: b */
    public void mo5582b(C1172a<? extends C1171a0<K, V>, K, V> aVar) {
        C1293t tVar = this.f5178Y;
        if (tVar != null) {
            tVar.mo5669b(aVar);
        }
    }

    /* renamed from: c */
    public boolean mo3210c(Collection<?> collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(mo3361b(size))) {
                mo3363c(size);
                z = true;
            }
        }
        return z;
    }

    public void clear() {
        if (!isEmpty()) {
            super.clear();
            m6906d(null);
        }
    }

    public V put(K k, V v) {
        super.put(k, v);
        m6906d(k);
        return v;
    }

    /* renamed from: b */
    public boolean mo3209b(Collection<?> collection) {
        boolean z = false;
        for (Object b : collection) {
            int b2 = mo3360b(b);
            if (b2 >= 0) {
                z = true;
                mo3363c(b2);
            }
        }
        return z;
    }

    /* renamed from: a */
    public V mo3357a(int i, V v) {
        Object b = mo3361b(i);
        V a = super.mo3357a(i, v);
        m6906d(b);
        return a;
    }

    /* renamed from: c */
    public V mo3363c(int i) {
        Object b = mo3361b(i);
        V c = super.mo3363c(i);
        if (c != null) {
            m6906d(b);
        }
        return c;
    }
}
