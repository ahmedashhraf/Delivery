package androidx.lifecycle;

import androidx.annotation.C0187e0;
import androidx.annotation.C0193h0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Lifecycle {
    @C0193h0
    @C0207n0({C0208a.LIBRARY_GROUP})

    /* renamed from: a */
    AtomicReference<Object> f5662a = new AtomicReference<>();

    public enum State {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(@C0193h0 State state) {
            return compareTo(state) >= 0;
        }
    }

    /* renamed from: androidx.lifecycle.Lifecycle$a */
    public enum C1441a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY
    }

    @C0193h0
    @C0187e0
    /* renamed from: a */
    public abstract State mo6471a();

    @C0187e0
    /* renamed from: a */
    public abstract void mo6472a(@C0193h0 C1458h hVar);

    @C0187e0
    /* renamed from: b */
    public abstract void mo6473b(@C0193h0 C1458h hVar);
}
