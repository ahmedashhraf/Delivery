package p076c.p284e.p285a;

import com.pusher.java_websocket.drafts.Draft;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;

/* renamed from: c.e.a.d */
/* compiled from: WebSocket */
public interface C6739d {

    /* renamed from: o */
    public static final int f18731o = 80;

    /* renamed from: p */
    public static final int f18732p = 443;

    /* renamed from: c.e.a.d$a */
    /* compiled from: WebSocket */
    public enum C6740a {
        NOT_YET_CONNECTED,
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED
    }

    /* renamed from: c.e.a.d$b */
    /* compiled from: WebSocket */
    public enum C6741b {
        CLIENT,
        SERVER
    }

    /* renamed from: a */
    String mo26927a();

    /* renamed from: a */
    void mo26928a(int i);

    /* renamed from: a */
    void mo26929a(int i, String str);

    /* renamed from: a */
    void mo26930a(C6755a aVar, ByteBuffer byteBuffer, boolean z);

    /* renamed from: a */
    void mo26931a(C6754d dVar);

    /* renamed from: a */
    void mo26932a(String str) throws NotYetConnectedException;

    /* renamed from: a */
    void mo26933a(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException;

    /* renamed from: a */
    void mo26934a(byte[] bArr) throws IllegalArgumentException, NotYetConnectedException;

    /* renamed from: b */
    void mo26935b(int i, String str);

    /* renamed from: b */
    boolean mo26936b();

    /* renamed from: c */
    C6740a mo26937c();

    void close();

    /* renamed from: d */
    boolean mo26939d();

    /* renamed from: e */
    Draft mo26940e();

    /* renamed from: f */
    boolean mo26941f();

    /* renamed from: g */
    boolean mo26942g();

    /* renamed from: h */
    InetSocketAddress mo26943h();

    /* renamed from: i */
    InetSocketAddress mo26944i();

    boolean isClosed();

    boolean isOpen();
}
