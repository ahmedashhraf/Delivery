package p076c.p082c.p083a.p084a0;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: c.c.a.a0.f */
/* compiled from: LruCache */
public class C2213f<T, Y> {

    /* renamed from: a */
    private final LinkedHashMap<T, Y> f8764a = new LinkedHashMap<>(100, 0.75f, true);

    /* renamed from: b */
    private int f8765b;

    /* renamed from: c */
    private final int f8766c;

    /* renamed from: d */
    private int f8767d = 0;

    public C2213f(int i) {
        this.f8766c = i;
        this.f8765b = i;
    }

    /* renamed from: a */
    public void mo9382a(float f) {
        if (f >= 0.0f) {
            this.f8765b = Math.round(((float) this.f8766c) * f);
            m11321d();
            return;
        }
        throw new IllegalArgumentException("Multiplier must be >= 0");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9383a(T t, Y y) {
    }

    /* renamed from: b */
    public Y mo9385b(T t) {
        return this.f8764a.get(t);
    }

    /* renamed from: c */
    public int mo9389c() {
        return this.f8767d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo9390c(Y y) {
        return 1;
    }

    /* renamed from: d */
    public Y mo9391d(T t) {
        Y remove = this.f8764a.remove(t);
        if (remove != null) {
            this.f8767d -= mo9390c(remove);
        }
        return remove;
    }

    /* renamed from: b */
    public Y mo9386b(T t, Y y) {
        if (mo9390c(y) >= this.f8765b) {
            mo9383a(t, y);
            return null;
        }
        Y put = this.f8764a.put(t, y);
        if (y != null) {
            this.f8767d += mo9390c(y);
        }
        if (put != null) {
            this.f8767d -= mo9390c(put);
        }
        m11321d();
        return put;
    }

    /* renamed from: d */
    private void m11321d() {
        mo9388b(this.f8765b);
    }

    /* renamed from: a */
    public int mo9381a() {
        return this.f8765b;
    }

    /* renamed from: a */
    public boolean mo9384a(T t) {
        return this.f8764a.containsKey(t);
    }

    /* renamed from: b */
    public void mo9387b() {
        mo9388b(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9388b(int i) {
        while (this.f8767d > i) {
            Entry entry = (Entry) this.f8764a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.f8767d -= mo9390c(value);
            Object key = entry.getKey();
            this.f8764a.remove(key);
            mo9383a(key, value);
        }
    }
}
