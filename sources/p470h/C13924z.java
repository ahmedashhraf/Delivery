package p470h;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* renamed from: h.z */
/* compiled from: Sink */
public interface C13924z extends Closeable, Flushable {
    /* renamed from: b */
    void mo43815b(C13887c cVar, long j) throws IOException;

    void close() throws IOException;

    void flush() throws IOException;

    C13885b0 timeout();
}
