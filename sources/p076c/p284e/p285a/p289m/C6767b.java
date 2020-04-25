package p076c.p284e.p285a.p289m;

import com.pusher.java_websocket.drafts.Draft;
import java.net.Socket;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.List;
import p076c.p284e.p285a.C6742e;
import p076c.p284e.p285a.C6744g;
import p076c.p284e.p285a.C6745h;
import p076c.p284e.p285a.p289m.C6768c.C6769a;

/* renamed from: c.e.a.m.b */
/* compiled from: DefaultWebSocketServerFactory */
public class C6767b implements C6769a {
    /* renamed from: a */
    public SocketChannel m32344a(SocketChannel socketChannel, SelectionKey selectionKey) {
        return socketChannel;
    }

    /* renamed from: a */
    public C6744g m32341a(C6742e eVar, Draft draft, Socket socket) {
        return new C6744g((C6745h) eVar, draft);
    }

    /* renamed from: a */
    public C6744g m32342a(C6742e eVar, List<Draft> list, Socket socket) {
        return new C6744g((C6745h) eVar, list);
    }
}
