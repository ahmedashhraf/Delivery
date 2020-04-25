package p470h;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: h.a0 */
/* compiled from: Source */
public interface C13883a0 extends Closeable {
    void close() throws IOException;

    long read(C13887c cVar, long j) throws IOException;

    C13885b0 timeout();
}
