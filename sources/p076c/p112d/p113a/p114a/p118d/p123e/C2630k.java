package p076c.p112d.p113a.p114a.p118d.p123e;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;

/* renamed from: c.d.a.a.d.e.k */
/* compiled from: com.google.firebase:firebase-messaging@@20.0.0 */
public final class C2630k {

    /* renamed from: a */
    private static final Logger f9739a = Logger.getLogger(C2630k.class.getName());

    private C2630k() {
    }

    /* renamed from: a */
    public static void m12740a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f9739a.logp(Level.WARNING, "com.google.common.io.Closeables", Close.ELEMENT, "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
