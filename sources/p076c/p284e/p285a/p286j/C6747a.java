package p076c.p284e.p285a.p286j;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import org.apache.http.p549j0.C15430e;
import p076c.p284e.p285a.C6736a;

/* renamed from: c.e.a.j.a */
/* compiled from: AbstractClientProxyChannel */
public abstract class C6747a extends C6736a {

    /* renamed from: b */
    protected final ByteBuffer f18755b;

    public C6747a(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.f18755b = ByteBuffer.wrap(mo26976a().getBytes(C15430e.f44596w));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public abstract String mo26976a();

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f18755b.hasRemaining()) {
            return super.write(byteBuffer);
        }
        return super.write(this.f18755b);
    }
}
