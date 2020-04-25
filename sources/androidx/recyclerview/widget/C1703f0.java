package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* renamed from: androidx.recyclerview.widget.f0 */
/* compiled from: TileList */
class C1703f0<T> {

    /* renamed from: a */
    final int f6543a;

    /* renamed from: b */
    private final SparseArray<C1704a<T>> f6544b = new SparseArray<>(10);

    /* renamed from: c */
    C1704a<T> f6545c;

    /* renamed from: androidx.recyclerview.widget.f0$a */
    /* compiled from: TileList */
    public static class C1704a<T> {

        /* renamed from: a */
        public final T[] f6546a;

        /* renamed from: b */
        public int f6547b;

        /* renamed from: c */
        public int f6548c;

        /* renamed from: d */
        C1704a<T> f6549d;

        public C1704a(Class<T> cls, int i) {
            this.f6546a = (Object[]) Array.newInstance(cls, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo7805a(int i) {
            int i2 = this.f6547b;
            return i2 <= i && i < i2 + this.f6548c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public T mo7806b(int i) {
            return this.f6546a[i - this.f6547b];
        }
    }

    public C1703f0(int i) {
        this.f6543a = i;
    }

    /* renamed from: a */
    public void mo7801a() {
        this.f6544b.clear();
    }

    /* renamed from: b */
    public T mo7803b(int i) {
        C1704a<T> aVar = this.f6545c;
        if (aVar == null || !aVar.mo7805a(i)) {
            int indexOfKey = this.f6544b.indexOfKey(i - (i % this.f6543a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f6545c = (C1704a) this.f6544b.valueAt(indexOfKey);
        }
        return this.f6545c.mo7806b(i);
    }

    /* renamed from: c */
    public C1704a<T> mo7804c(int i) {
        C1704a<T> aVar = (C1704a) this.f6544b.get(i);
        if (this.f6545c == aVar) {
            this.f6545c = null;
        }
        this.f6544b.delete(i);
        return aVar;
    }

    /* renamed from: a */
    public C1704a<T> mo7799a(int i) {
        return (C1704a) this.f6544b.valueAt(i);
    }

    /* renamed from: a */
    public C1704a<T> mo7800a(C1704a<T> aVar) {
        int indexOfKey = this.f6544b.indexOfKey(aVar.f6547b);
        if (indexOfKey < 0) {
            this.f6544b.put(aVar.f6547b, aVar);
            return null;
        }
        C1704a<T> aVar2 = (C1704a) this.f6544b.valueAt(indexOfKey);
        this.f6544b.setValueAt(indexOfKey, aVar);
        if (this.f6545c == aVar2) {
            this.f6545c = aVar;
        }
        return aVar2;
    }

    /* renamed from: b */
    public int mo7802b() {
        return this.f6544b.size();
    }
}
