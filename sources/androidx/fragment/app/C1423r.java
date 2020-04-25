package androidx.fragment.app;

import androidx.annotation.C0193h0;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.C1460j;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;

/* renamed from: androidx.fragment.app.r */
/* compiled from: FragmentViewLifecycleOwner */
class C1423r implements C1459i {

    /* renamed from: a */
    private C1460j f5641a = null;

    C1423r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6455a() {
        if (this.f5641a == null) {
            this.f5641a = new C1460j(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6457b() {
        return this.f5641a != null;
    }

    @C0193h0
    public Lifecycle getLifecycle() {
        mo6455a();
        return this.f5641a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6456a(@C0193h0 C1441a aVar) {
        this.f5641a.mo6513a(aVar);
    }
}
