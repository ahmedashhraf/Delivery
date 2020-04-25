package androidx.savedstate;

import android.os.Bundle;
import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;

/* renamed from: androidx.savedstate.b */
/* compiled from: SavedStateRegistryController */
public final class C1788b {

    /* renamed from: a */
    private final C1789c f6932a;

    /* renamed from: b */
    private final SavedStateRegistry f6933b = new SavedStateRegistry();

    private C1788b(C1789c cVar) {
        this.f6932a = cVar;
    }

    @C0193h0
    /* renamed from: a */
    public SavedStateRegistry mo8043a() {
        return this.f6933b;
    }

    @C0187e0
    /* renamed from: b */
    public void mo8045b(@C0193h0 Bundle bundle) {
        this.f6933b.mo8036a(bundle);
    }

    @C0187e0
    /* renamed from: a */
    public void mo8044a(@C0195i0 Bundle bundle) {
        Lifecycle lifecycle = this.f6932a.getLifecycle();
        if (lifecycle.mo6471a() == State.INITIALIZED) {
            lifecycle.mo6472a(new Recreator(this.f6932a));
            this.f6933b.mo8037a(lifecycle, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    @C0193h0
    /* renamed from: a */
    public static C1788b m9655a(@C0193h0 C1789c cVar) {
        return new C1788b(cVar);
    }
}
