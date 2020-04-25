package p468g;

import java.io.IOException;
import p470h.C13885b0;

/* renamed from: g.e */
/* compiled from: Call */
public interface C13821e extends Cloneable {

    /* renamed from: g.e$a */
    /* compiled from: Call */
    public interface C13822a {
        /* renamed from: a */
        C13821e mo43405a(C13813c0 c0Var);
    }

    /* renamed from: a */
    void mo43292a(C13825f fVar);

    void cancel();

    C13821e clone();

    C13823e0 execute() throws IOException;

    boolean isCanceled();

    boolean isExecuted();

    C13813c0 request();

    C13885b0 timeout();
}
