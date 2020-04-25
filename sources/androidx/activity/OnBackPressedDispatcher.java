package androidx.activity;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.lifecycle.C1457g;
import androidx.lifecycle.C1459i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.C1441a;
import androidx.lifecycle.Lifecycle.State;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    @C0195i0

    /* renamed from: a */
    private final Runnable f620a;

    /* renamed from: b */
    final ArrayDeque<C0176b> f621b;

    private class LifecycleOnBackPressedCancellable implements C1457g, C0175a {

        /* renamed from: a */
        private final Lifecycle f622a;

        /* renamed from: b */
        private final C0176b f623b;
        @C0195i0

        /* renamed from: c */
        private C0175a f624c;

        LifecycleOnBackPressedCancellable(@C0193h0 Lifecycle lifecycle, @C0193h0 C0176b bVar) {
            this.f622a = lifecycle;
            this.f623b = bVar;
            lifecycle.mo6472a(this);
        }

        /* renamed from: a */
        public void mo632a(@C0193h0 C1459i iVar, @C0193h0 C1441a aVar) {
            if (aVar == C1441a.ON_START) {
                this.f624c = OnBackPressedDispatcher.this.mo637b(this.f623b);
            } else if (aVar == C1441a.ON_STOP) {
                C0175a aVar2 = this.f624c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C1441a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f622a.mo6473b(this);
            this.f623b.mo643b(this);
            C0175a aVar = this.f624c;
            if (aVar != null) {
                aVar.cancel();
                this.f624c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0170a implements C0175a {

        /* renamed from: a */
        private final C0176b f626a;

        C0170a(C0176b bVar) {
            this.f626a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f621b.remove(this.f626a);
            this.f626a.mo643b(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @C0187e0
    /* renamed from: a */
    public void mo634a(@C0193h0 C0176b bVar) {
        mo637b(bVar);
    }

    /* access modifiers changed from: 0000 */
    @C0193h0
    @C0187e0
    /* renamed from: b */
    public C0175a mo637b(@C0193h0 C0176b bVar) {
        this.f621b.add(bVar);
        C0170a aVar = new C0170a(bVar);
        bVar.mo641a((C0175a) aVar);
        return aVar;
    }

    public OnBackPressedDispatcher(@C0195i0 Runnable runnable) {
        this.f621b = new ArrayDeque<>();
        this.f620a = runnable;
    }

    @C0187e0
    /* renamed from: a */
    public void mo635a(@C0193h0 C1459i iVar, @C0193h0 C0176b bVar) {
        Lifecycle lifecycle = iVar.getLifecycle();
        if (lifecycle.mo6471a() != State.DESTROYED) {
            bVar.mo641a((C0175a) new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    @C0187e0
    /* renamed from: b */
    public void mo638b() {
        Iterator descendingIterator = this.f621b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0176b bVar = (C0176b) descendingIterator.next();
            if (bVar.mo644b()) {
                bVar.mo640a();
                return;
            }
        }
        Runnable runnable = this.f620a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @C0187e0
    /* renamed from: a */
    public boolean mo636a() {
        Iterator descendingIterator = this.f621b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C0176b) descendingIterator.next()).mo644b()) {
                return true;
            }
        }
        return false;
    }
}
