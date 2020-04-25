package androidx.activity;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
/* compiled from: OnBackPressedCallback */
public abstract class C0176b {

    /* renamed from: a */
    private boolean f628a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0175a> f629b = new CopyOnWriteArrayList<>();

    public C0176b(boolean z) {
        this.f628a = z;
    }

    @C0187e0
    /* renamed from: a */
    public abstract void mo640a();

    @C0187e0
    /* renamed from: a */
    public final void mo642a(boolean z) {
        this.f628a = z;
    }

    @C0187e0
    /* renamed from: b */
    public final boolean mo644b() {
        return this.f628a;
    }

    @C0187e0
    /* renamed from: c */
    public final void mo645c() {
        Iterator it = this.f629b.iterator();
        while (it.hasNext()) {
            ((C0175a) it.next()).cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo641a(@C0193h0 C0175a aVar) {
        this.f629b.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo643b(@C0193h0 C0175a aVar) {
        this.f629b.remove(aVar);
    }
}
