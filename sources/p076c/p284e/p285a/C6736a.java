package p076c.p284e.p285a;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SocketChannel;
import javax.net.ssl.SSLException;

/* renamed from: c.e.a.a */
/* compiled from: AbstractWrappedByteChannel */
public class C6736a implements C6746i {

    /* renamed from: a */
    private final ByteChannel f18717a;

    public C6736a(ByteChannel byteChannel) {
        this.f18717a = byteChannel;
    }

    /* renamed from: C */
    public void mo26906C() throws IOException {
        ByteChannel byteChannel = this.f18717a;
        if (byteChannel instanceof C6746i) {
            ((C6746i) byteChannel).mo26906C();
        }
    }

    /* renamed from: D */
    public boolean mo26907D() {
        ByteChannel byteChannel = this.f18717a;
        if (byteChannel instanceof C6746i) {
            return ((C6746i) byteChannel).mo26907D();
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo26908E() {
        ByteChannel byteChannel = this.f18717a;
        if (byteChannel instanceof C6746i) {
            return ((C6746i) byteChannel).mo26908E();
        }
        return false;
    }

    /* renamed from: a */
    public int mo26909a(ByteBuffer byteBuffer) throws SSLException {
        ByteChannel byteChannel = this.f18717a;
        if (byteChannel instanceof C6746i) {
            return ((C6746i) byteChannel).mo26909a(byteBuffer);
        }
        return 0;
    }

    public void close() throws IOException {
        this.f18717a.close();
    }

    public boolean isBlocking() {
        ByteChannel byteChannel = this.f18717a;
        if (byteChannel instanceof SocketChannel) {
            return ((SocketChannel) byteChannel).isBlocking();
        }
        if (byteChannel instanceof C6746i) {
            return ((C6746i) byteChannel).isBlocking();
        }
        return false;
    }

    public boolean isOpen() {
        return this.f18717a.isOpen();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        return this.f18717a.read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        return this.f18717a.write(byteBuffer);
    }

    public C6736a(C6746i iVar) {
        this.f18717a = iVar;
    }
}
