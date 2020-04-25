package androidx.transition;

import android.os.IBinder;

/* renamed from: androidx.transition.g1 */
/* compiled from: WindowIdApi14 */
class C1895g1 implements C1909i1 {

    /* renamed from: a */
    private final IBinder f7317a;

    C1895g1(IBinder iBinder) {
        this.f7317a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1895g1) && ((C1895g1) obj).f7317a.equals(this.f7317a);
    }

    public int hashCode() {
        return this.f7317a.hashCode();
    }
}
