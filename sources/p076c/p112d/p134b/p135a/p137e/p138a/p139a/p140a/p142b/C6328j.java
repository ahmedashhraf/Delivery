package p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p142b;

import java.lang.ref.WeakReference;
import p076c.p112d.p134b.p135a.p137e.p138a.p139a.p140a.p141a.C2716b;

@C2716b(emulated = true)
/* renamed from: c.d.b.a.e.a.a.a.b.j */
/* compiled from: Platform */
final class C6328j {
    private C6328j() {
    }

    /* renamed from: a */
    static long m29430a() {
        return System.nanoTime();
    }

    /* renamed from: a */
    static C2719c m29431a(C2719c cVar) {
        return cVar.mo10409c();
    }

    /* renamed from: a */
    static <T extends Enum<T>> C6325i<T> m29432a(Class<T> cls, String str) {
        WeakReference weakReference = (WeakReference) C6320e.m29408a(cls).get(str);
        return weakReference == null ? C6325i.m29420g() : C6325i.m29419c(cls.cast(weakReference.get()));
    }
}
