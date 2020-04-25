package p076c.p284e.p285a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import javax.net.ssl.SSLException;

/* renamed from: c.e.a.i */
/* compiled from: WrappedByteChannel */
public interface C6746i extends ByteChannel {
    /* renamed from: C */
    void mo26906C() throws IOException;

    /* renamed from: D */
    boolean mo26907D();

    /* renamed from: E */
    boolean mo26908E();

    /* renamed from: a */
    int mo26909a(ByteBuffer byteBuffer) throws SSLException;

    boolean isBlocking();
}
