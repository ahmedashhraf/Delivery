package androidx.databinding;

import androidx.databinding.C1301z.C1302a;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: androidx.databinding.w */
/* compiled from: ObservableArrayList */
public class C1298w<T> extends ArrayList<T> implements C1301z<T> {

    /* renamed from: a */
    private transient C1290s f5177a = new C1290s();

    /* renamed from: a */
    public void mo5698a(C1302a aVar) {
        C1290s sVar = this.f5177a;
        if (sVar != null) {
            sVar.mo5669b(aVar);
        }
    }

    public boolean add(T t) {
        super.add(t);
        m6902a(size() - 1, 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            m6902a(size, size() - size);
        }
        return addAll;
    }

    /* renamed from: b */
    public void mo5703b(C1302a aVar) {
        if (this.f5177a == null) {
            this.f5177a = new C1290s();
        }
        this.f5177a.mo5665a(aVar);
    }

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            m6903b(0, size);
        }
    }

    public T remove(int i) {
        T remove = super.remove(i);
        m6903b(i, 1);
        return remove;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        super.removeRange(i, i2);
        m6903b(i, i2 - i);
    }

    public T set(int i, T t) {
        T t2 = super.set(i, t);
        C1290s sVar = this.f5177a;
        if (sVar != null) {
            sVar.mo5688a((C1301z) this, i, 1);
        }
        return t2;
    }

    /* renamed from: a */
    private void m6902a(int i, int i2) {
        C1290s sVar = this.f5177a;
        if (sVar != null) {
            sVar.mo5691b(this, i, i2);
        }
    }

    public void add(int i, T t) {
        super.add(i, t);
        m6902a(i, 1);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* renamed from: b */
    private void m6903b(int i, int i2) {
        C1290s sVar = this.f5177a;
        if (sVar != null) {
            sVar.mo5692c(this, i, i2);
        }
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i, collection);
        if (addAll) {
            m6902a(i, collection.size());
        }
        return addAll;
    }
}
