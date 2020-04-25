package p076c.p284e.p285a.p289m;

import com.pusher.java_websocket.drafts.Draft;
import java.io.IOException;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import p076c.p284e.p285a.C6737b;
import p076c.p284e.p285a.C6742e;
import p076c.p284e.p285a.C6744g;
import p076c.p284e.p285a.C6745h;
import p076c.p284e.p285a.p289m.C6768c.C6769a;

/* renamed from: c.e.a.m.a */
/* compiled from: DefaultSSLWebSocketServerFactory */
public class C6766a implements C6769a {

    /* renamed from: a */
    protected SSLContext f18798a;

    /* renamed from: b */
    protected ExecutorService f18799b;

    public C6766a(SSLContext sSLContext) {
        this(sSLContext, Executors.newSingleThreadScheduledExecutor());
    }

    public C6766a(SSLContext sSLContext, ExecutorService executorService) {
        if (sSLContext == null || executorService == null) {
            throw new IllegalArgumentException();
        }
        this.f18798a = sSLContext;
        this.f18799b = executorService;
    }

    /* renamed from: a */
    public ByteChannel mo27018a(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException {
        SSLEngine createSSLEngine = this.f18798a.createSSLEngine();
        createSSLEngine.setUseClientMode(false);
        return new C6737b(socketChannel, createSSLEngine, this.f18799b, selectionKey);
    }

    /* renamed from: a */
    public C6744g m32336a(C6742e eVar, Draft draft, Socket socket) {
        return new C6744g((C6745h) eVar, draft);
    }

    /* renamed from: a */
    public C6744g m32337a(C6742e eVar, List<Draft> list, Socket socket) {
        return new C6744g((C6745h) eVar, list);
    }
}
