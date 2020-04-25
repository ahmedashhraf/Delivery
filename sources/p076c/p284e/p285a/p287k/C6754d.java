package p076c.p284e.p285a.p287k;

import com.pusher.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;

/* renamed from: c.e.a.k.d */
/* compiled from: Framedata */
public interface C6754d {

    /* renamed from: c.e.a.k.d$a */
    /* compiled from: Framedata */
    public enum C6755a {
        CONTINUOUS,
        TEXT,
        BINARY,
        PING,
        PONG,
        CLOSING
    }

    /* renamed from: a */
    void mo27002a(C6754d dVar) throws InvalidFrameException;

    /* renamed from: a */
    boolean mo27003a();

    /* renamed from: b */
    C6755a mo27004b();

    /* renamed from: c */
    boolean mo27005c();

    /* renamed from: d */
    ByteBuffer mo26997d();
}
