package androidx.viewpager2.widget;

import androidx.annotation.C0193h0;
import androidx.annotation.C0199k0;
import androidx.viewpager2.widget.ViewPager2.C2056j;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

/* renamed from: androidx.viewpager2.widget.b */
/* compiled from: CompositeOnPageChangeCallback */
final class C2068b extends C2056j {
    @C0193h0

    /* renamed from: a */
    private final List<C2056j> f7902a;

    C2068b(int i) {
        this.f7902a = new ArrayList(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9025a(C2056j jVar) {
        this.f7902a.add(jVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo9026b(C2056j jVar) {
        this.f7902a.remove(jVar);
    }

    /* renamed from: a */
    public void mo9016a(int i, float f, @C0199k0 int i2) {
        try {
            for (C2056j a : this.f7902a) {
                a.mo9016a(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m10772a(e);
        }
    }

    /* renamed from: b */
    public void mo8945b(int i) {
        try {
            for (C2056j b : this.f7902a) {
                b.mo8945b(i);
            }
        } catch (ConcurrentModificationException e) {
            m10772a(e);
        }
    }

    /* renamed from: a */
    public void mo8944a(int i) {
        try {
            for (C2056j a : this.f7902a) {
                a.mo8944a(i);
            }
        } catch (ConcurrentModificationException e) {
            m10772a(e);
        }
    }

    /* renamed from: a */
    private void m10772a(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
