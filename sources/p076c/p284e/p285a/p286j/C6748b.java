package p076c.p284e.p285a.p286j;

import com.pusher.java_websocket.drafts.C12048b;
import com.pusher.java_websocket.drafts.Draft;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CountDownLatch;
import p076c.p284e.p285a.C6739d;
import p076c.p284e.p285a.C6739d.C6740a;
import p076c.p284e.p285a.C6742e;
import p076c.p284e.p285a.C6744g;
import p076c.p284e.p285a.C6745h;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6760d;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;

/* renamed from: c.e.a.j.b */
/* compiled from: WebSocketClient */
public abstract class C6748b extends C6742e implements Runnable, C6739d {

    /* renamed from: X */
    static final /* synthetic */ boolean f18756X = false;

    /* renamed from: N */
    private Socket f18757N;

    /* renamed from: O */
    private InputStream f18758O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public OutputStream f18759P;

    /* renamed from: Q */
    private Proxy f18760Q;

    /* renamed from: R */
    private Thread f18761R;

    /* renamed from: S */
    private Draft f18762S;

    /* renamed from: T */
    private Map<String, String> f18763T;

    /* renamed from: U */
    private CountDownLatch f18764U;

    /* renamed from: V */
    private CountDownLatch f18765V;

    /* renamed from: W */
    private int f18766W;

    /* renamed from: a */
    protected URI f18767a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6744g f18768b;

    /* renamed from: c.e.a.j.b$b */
    /* compiled from: WebSocketClient */
    private class C6750b implements Runnable {
        private C6750b() {
        }

        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer byteBuffer = (ByteBuffer) C6748b.this.f18768b.f18737N.take();
                    C6748b.this.f18759P.write(byteBuffer.array(), 0, byteBuffer.limit());
                    C6748b.this.f18759P.flush();
                } catch (IOException unused) {
                    C6748b.this.f18768b.mo26964k();
                    return;
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }

    static {
        Class<C6748b> cls = C6748b.class;
    }

    public C6748b(URI uri) {
        this(uri, new C12048b());
    }

    /* renamed from: o */
    private int mo41144o() {
        int port = this.f18767a.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.f18767a.getScheme();
        if (scheme.equals("wss")) {
            return 443;
        }
        if (scheme.equals("ws")) {
            return 80;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unkonow scheme");
        sb.append(scheme);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: p */
    private void m32241p() throws InvalidHandshakeException {
        String str;
        String path = this.f18767a.getPath();
        String query = this.f18767a.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(path);
            sb.append("?");
            sb.append(query);
            path = sb.toString();
        }
        int o = mo41144o();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18767a.getHost());
        if (o != 80) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(":");
            sb3.append(o);
            str = sb3.toString();
        } else {
            str = "";
        }
        sb2.append(str);
        String sb4 = sb2.toString();
        C6760d dVar = new C6760d();
        dVar.mo27007c(path);
        dVar.mo27008a("Host", sb4);
        Map<String, String> map = this.f18763T;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                dVar.mo27008a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.f18768b.mo26958a((C6758b) dVar);
    }

    /* renamed from: a */
    public abstract void mo26977a(int i, String str, boolean z);

    /* renamed from: a */
    public abstract void mo26978a(C6764h hVar);

    /* renamed from: a */
    public abstract void mo26979a(Exception exc);

    /* renamed from: b */
    public void mo26982b(int i, String str, boolean z) {
    }

    /* renamed from: b */
    public void mo26983b(C6754d dVar) {
    }

    /* renamed from: b */
    public abstract void mo26984b(String str);

    /* renamed from: b */
    public void mo26985b(ByteBuffer byteBuffer) {
    }

    /* renamed from: c */
    public C6740a mo26937c() {
        return this.f18768b.mo26937c();
    }

    /* renamed from: c */
    public void mo26986c(int i, String str) {
    }

    public void close() {
        if (this.f18761R != null) {
            this.f18768b.mo26928a(1000);
        }
    }

    /* renamed from: d */
    public final void mo26975d(C6739d dVar) {
    }

    /* renamed from: d */
    public boolean mo26939d() {
        return this.f18768b.mo26939d();
    }

    /* renamed from: e */
    public Draft mo26940e() {
        return this.f18762S;
    }

    /* renamed from: f */
    public boolean mo26941f() {
        return this.f18768b.mo26941f();
    }

    /* renamed from: g */
    public boolean mo26942g() {
        return this.f18768b.mo26942g();
    }

    /* renamed from: h */
    public InetSocketAddress mo26943h() {
        return this.f18768b.mo26943h();
    }

    /* renamed from: i */
    public InetSocketAddress mo26944i() {
        return this.f18768b.mo26944i();
    }

    public boolean isClosed() {
        return this.f18768b.isClosed();
    }

    public boolean isOpen() {
        return this.f18768b.isOpen();
    }

    /* renamed from: j */
    public void mo26987j() throws InterruptedException {
        close();
        this.f18765V.await();
    }

    /* renamed from: k */
    public void mo26988k() {
        if (this.f18761R == null) {
            this.f18761R = new Thread(this);
            this.f18761R.start();
            return;
        }
        throw new IllegalStateException("WebSocketClient objects are not reuseable");
    }

    /* renamed from: l */
    public boolean mo26989l() throws InterruptedException {
        mo26988k();
        this.f18764U.await();
        return this.f18768b.isOpen();
    }

    /* renamed from: m */
    public C6739d mo26990m() {
        return this.f18768b;
    }

    /* renamed from: n */
    public URI mo26991n() {
        return this.f18767a;
    }

    public void run() {
        try {
            if (this.f18757N == null) {
                this.f18757N = new Socket(this.f18760Q);
            } else if (this.f18757N.isClosed()) {
                throw new IOException();
            }
            if (!this.f18757N.isBound()) {
                this.f18757N.connect(new InetSocketAddress(this.f18767a.getHost(), mo41144o()), this.f18766W);
            }
            this.f18758O = this.f18757N.getInputStream();
            this.f18759P = this.f18757N.getOutputStream();
            m32241p();
            this.f18761R = new Thread(new C6750b());
            this.f18761R.start();
            byte[] bArr = new byte[C6744g.f18733d0];
            while (!isClosed()) {
                try {
                    int read = this.f18758O.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    this.f18768b.mo26961b(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f18768b.mo26964k();
                } catch (RuntimeException e) {
                    mo26979a((Exception) e);
                    this.f18768b.mo26935b(1006, e.getMessage());
                }
            }
            this.f18768b.mo26964k();
        } catch (Exception e2) {
            mo26969a((C6739d) this.f18768b, e2);
            this.f18768b.mo26935b(-1, e2.getMessage());
        }
    }

    public C6748b(URI uri, Draft draft) {
        this(uri, draft, null, 0);
    }

    /* renamed from: a */
    public void mo26932a(String str) throws NotYetConnectedException {
        this.f18768b.mo26932a(str);
    }

    /* renamed from: b */
    public final void mo26973b(C6739d dVar, int i, String str, boolean z) {
        this.f18764U.countDown();
        this.f18765V.countDown();
        Thread thread = this.f18761R;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            if (this.f18757N != null) {
                this.f18757N.close();
            }
        } catch (IOException e) {
            mo26969a((C6739d) this, (Exception) e);
        }
        mo26977a(i, str, z);
    }

    /* renamed from: c */
    public void mo26953c(C6739d dVar, C6754d dVar2) {
        mo26983b(dVar2);
    }

    public C6748b(URI uri, Draft draft, Map<String, String> map, int i) {
        this.f18767a = null;
        this.f18768b = null;
        this.f18757N = null;
        this.f18760Q = Proxy.NO_PROXY;
        this.f18764U = new CountDownLatch(1);
        this.f18765V = new CountDownLatch(1);
        this.f18766W = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        } else if (draft != null) {
            this.f18767a = uri;
            this.f18762S = draft;
            this.f18763T = map;
            this.f18766W = i;
            this.f18768b = new C6744g((C6745h) this, draft);
        } else {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
    }

    /* renamed from: a */
    public void mo26934a(byte[] bArr) throws NotYetConnectedException {
        this.f18768b.mo26934a(bArr);
    }

    /* renamed from: c */
    public InetSocketAddress mo26974c(C6739d dVar) {
        Socket socket = this.f18757N;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo26970a(C6739d dVar, String str) {
        mo26984b(str);
    }

    /* renamed from: a */
    public final void mo26971a(C6739d dVar, ByteBuffer byteBuffer) {
        mo26985b(byteBuffer);
    }

    /* renamed from: a */
    public final void mo26968a(C6739d dVar, C6762f fVar) {
        this.f18764U.countDown();
        mo26978a((C6764h) fVar);
    }

    /* renamed from: a */
    public final void mo26969a(C6739d dVar, Exception exc) {
        mo26979a(exc);
    }

    /* renamed from: a */
    public void mo26966a(C6739d dVar, int i, String str) {
        mo26986c(i, str);
    }

    /* renamed from: a */
    public void mo26967a(C6739d dVar, int i, String str, boolean z) {
        mo26982b(i, str, z);
    }

    /* renamed from: b */
    public InetSocketAddress mo26972b(C6739d dVar) {
        Socket socket = this.f18757N;
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    /* renamed from: a */
    public void mo26980a(Proxy proxy) {
        if (proxy != null) {
            this.f18760Q = proxy;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public boolean mo26936b() {
        return this.f18768b.mo26936b();
    }

    /* renamed from: a */
    public void mo26981a(Socket socket) {
        if (this.f18757N == null) {
            this.f18757N = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    /* renamed from: b */
    public void mo26935b(int i, String str) {
        this.f18768b.mo26935b(i, str);
    }

    /* renamed from: a */
    public void mo26930a(C6755a aVar, ByteBuffer byteBuffer, boolean z) {
        this.f18768b.mo26930a(aVar, byteBuffer, z);
    }

    /* renamed from: a */
    public void mo26928a(int i) {
        this.f18768b.close();
    }

    /* renamed from: a */
    public void mo26929a(int i, String str) {
        this.f18768b.mo26929a(i, str);
    }

    /* renamed from: a */
    public void mo26933a(ByteBuffer byteBuffer) throws IllegalArgumentException, NotYetConnectedException {
        this.f18768b.mo26933a(byteBuffer);
    }

    /* renamed from: a */
    public void mo26931a(C6754d dVar) {
        this.f18768b.mo26931a(dVar);
    }

    /* renamed from: a */
    public String mo26927a() {
        return this.f18767a.getPath();
    }
}
