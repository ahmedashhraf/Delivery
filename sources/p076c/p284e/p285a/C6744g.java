package p076c.p284e.p285a;

import com.pusher.java_websocket.drafts.C12046a;
import com.pusher.java_websocket.drafts.C12048b;
import com.pusher.java_websocket.drafts.C12049c;
import com.pusher.java_websocket.drafts.C12050d;
import com.pusher.java_websocket.drafts.Draft;
import com.pusher.java_websocket.drafts.Draft.C12045a;
import com.pusher.java_websocket.drafts.Draft.HandshakeState;
import com.pusher.java_websocket.exceptions.IncompleteHandshakeException;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import com.pusher.java_websocket.exceptions.WebsocketNotConnectedException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import p076c.p284e.p285a.C6739d.C6740a;
import p076c.p284e.p285a.C6739d.C6741b;
import p076c.p284e.p285a.p287k.C6751a;
import p076c.p284e.p285a.p287k.C6752b;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p289m.C6768c.C6770b;
import p076c.p284e.p285a.p290n.C6776b;

/* renamed from: c.e.a.g */
/* compiled from: WebSocketImpl */
public class C6744g implements C6739d {

    /* renamed from: d0 */
    public static int f18733d0 = 16384;

    /* renamed from: e0 */
    public static boolean f18734e0 = false;

    /* renamed from: f0 */
    public static final List<Draft> f18735f0 = new ArrayList(4);

    /* renamed from: g0 */
    static final /* synthetic */ boolean f18736g0 = false;

    /* renamed from: N */
    public final BlockingQueue<ByteBuffer> f18737N;

    /* renamed from: O */
    public final BlockingQueue<ByteBuffer> f18738O;

    /* renamed from: P */
    public volatile C6770b f18739P;

    /* renamed from: Q */
    private volatile boolean f18740Q;

    /* renamed from: R */
    private C6740a f18741R;

    /* renamed from: S */
    private final C6745h f18742S;

    /* renamed from: T */
    private List<Draft> f18743T;

    /* renamed from: U */
    private Draft f18744U;

    /* renamed from: V */
    private C6741b f18745V;

    /* renamed from: W */
    private C6755a f18746W;

    /* renamed from: X */
    private ByteBuffer f18747X;

    /* renamed from: Y */
    private C6757a f18748Y;

    /* renamed from: Z */
    private String f18749Z;

    /* renamed from: a */
    public SelectionKey f18750a;

    /* renamed from: a0 */
    private Integer f18751a0;

    /* renamed from: b */
    public ByteChannel f18752b;

    /* renamed from: b0 */
    private Boolean f18753b0;

    /* renamed from: c0 */
    private String f18754c0;

    static {
        f18735f0.add(new C12048b());
        f18735f0.add(new C12046a());
        f18735f0.add(new C12050d());
        f18735f0.add(new C12049c());
    }

    public C6744g(C6745h hVar, List<Draft> list) {
        this(hVar, (Draft) null);
        this.f18745V = C6741b.SERVER;
        if (list == null || list.isEmpty()) {
            this.f18743T = f18735f0;
        } else {
            this.f18743T = list;
        }
    }

    /* renamed from: c */
    private void m32187c(ByteBuffer byteBuffer) {
        try {
            for (C6754d dVar : this.f18744U.mo41202a(byteBuffer)) {
                if (f18734e0) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("matched frame: ");
                    sb.append(dVar);
                    printStream.println(sb.toString());
                }
                C6755a b = dVar.mo27004b();
                boolean c = dVar.mo27005c();
                if (b == C6755a.CLOSING) {
                    int i = 1005;
                    String str = "";
                    if (dVar instanceof C6751a) {
                        C6751a aVar = (C6751a) dVar;
                        i = aVar.mo26995f();
                        str = aVar.mo26994e();
                    }
                    if (this.f18741R == C6740a.CLOSING) {
                        mo26956a(i, str, true);
                    } else if (this.f18744U.mo41207b() == C12045a.TWOWAY) {
                        m32186c(i, str, true);
                    } else {
                        mo26960b(i, str, false);
                    }
                } else if (b == C6755a.PING) {
                    this.f18742S.mo26952b(this, dVar);
                } else if (b == C6755a.PONG) {
                    this.f18742S.mo26949a((C6739d) this, dVar);
                } else {
                    if (c) {
                        if (b != C6755a.CONTINUOUS) {
                            if (this.f18746W != null) {
                                throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                            } else if (b == C6755a.TEXT) {
                                try {
                                    this.f18742S.mo26970a((C6739d) this, C6776b.m32427a(dVar.mo26997d()));
                                } catch (RuntimeException e) {
                                    this.f18742S.mo26969a((C6739d) this, (Exception) e);
                                }
                            } else if (b == C6755a.BINARY) {
                                try {
                                    this.f18742S.mo26971a((C6739d) this, dVar.mo26997d());
                                } catch (RuntimeException e2) {
                                    this.f18742S.mo26969a((C6739d) this, (Exception) e2);
                                }
                            } else {
                                throw new InvalidDataException(1002, "non control or continious frame expected");
                            }
                        }
                    }
                    if (b == C6755a.CONTINUOUS) {
                        String str2 = "Continuous frame sequence was not started.";
                        if (c) {
                            if (this.f18746W != null) {
                                this.f18746W = null;
                            } else {
                                throw new InvalidDataException(1002, str2);
                            }
                        } else if (this.f18746W == null) {
                            throw new InvalidDataException(1002, str2);
                        }
                    } else if (this.f18746W == null) {
                        this.f18746W = b;
                    } else {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                    try {
                        this.f18742S.mo26953c(this, dVar);
                    } catch (RuntimeException e3) {
                        this.f18742S.mo26969a((C6739d) this, (Exception) e3);
                    }
                }
            }
        } catch (InvalidDataException e4) {
            this.f18742S.mo26969a((C6739d) this, (Exception) e4);
            mo26959a(e4);
        }
    }

    /* renamed from: d */
    private boolean m32188d(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        if (this.f18747X.capacity() == 0) {
            byteBuffer2 = byteBuffer;
        } else {
            if (this.f18747X.remaining() < byteBuffer.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(this.f18747X.capacity() + byteBuffer.remaining());
                this.f18747X.flip();
                allocate.put(this.f18747X);
                this.f18747X = allocate;
            }
            this.f18747X.put(byteBuffer);
            this.f18747X.flip();
            byteBuffer2 = this.f18747X;
        }
        byteBuffer2.mark();
        try {
            if (this.f18744U == null && m32189e(byteBuffer2) == HandshakeState.MATCHED) {
                try {
                    m32190f(ByteBuffer.wrap(C6776b.m32433b(this.f18742S.mo26948a(this))));
                    mo26929a(-3, "");
                } catch (InvalidDataException unused) {
                    m32186c(1006, "remote peer closed connection before flashpolicy could be transmitted", true);
                }
                return false;
            }
            try {
                String str = "wrong http function";
                if (this.f18745V != C6741b.SERVER) {
                    if (this.f18745V == C6741b.CLIENT) {
                        this.f18744U.mo41204a(this.f18745V);
                        C6762f b = this.f18744U.mo41206b(byteBuffer2);
                        if (!(b instanceof C6764h)) {
                            mo26960b(1002, str, false);
                            return false;
                        }
                        C6764h hVar = (C6764h) b;
                        if (this.f18744U.mo41195a(this.f18748Y, hVar) == HandshakeState.MATCHED) {
                            try {
                                this.f18742S.mo26951a((C6739d) this, this.f18748Y, hVar);
                                m32183a((C6762f) hVar);
                                return true;
                            } catch (InvalidDataException e) {
                                mo26960b(e.mo41216a(), e.getMessage(), false);
                                return false;
                            } catch (RuntimeException e2) {
                                this.f18742S.mo26969a((C6739d) this, (Exception) e2);
                                mo26960b(-1, e2.getMessage(), false);
                                return false;
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("draft ");
                            sb.append(this.f18744U);
                            sb.append(" refuses handshake");
                            mo26929a(1002, sb.toString());
                        }
                    }
                    return false;
                } else if (this.f18744U == null) {
                    for (Draft a : this.f18743T) {
                        Draft a2 = a.mo41196a();
                        try {
                            a2.mo41204a(this.f18745V);
                            byteBuffer2.reset();
                            C6762f b2 = a2.mo41206b(byteBuffer2);
                            if (!(b2 instanceof C6757a)) {
                                mo26960b(1002, str, false);
                                return false;
                            }
                            C6757a aVar = (C6757a) b2;
                            if (a2.mo41194a(aVar) == HandshakeState.MATCHED) {
                                this.f18754c0 = aVar.mo27006a();
                                try {
                                    m32185a(a2.mo41199a((C6762f) a2.mo41193a(aVar, this.f18742S.mo26947a((C6739d) this, a2, aVar)), this.f18745V));
                                    this.f18744U = a2;
                                    m32183a((C6762f) aVar);
                                    return true;
                                } catch (InvalidDataException e3) {
                                    mo26960b(e3.mo41216a(), e3.getMessage(), false);
                                    return false;
                                } catch (RuntimeException e4) {
                                    this.f18742S.mo26969a((C6739d) this, (Exception) e4);
                                    mo26960b(-1, e4.getMessage(), false);
                                    return false;
                                }
                            } else {
                                continue;
                            }
                        } catch (InvalidHandshakeException unused2) {
                        }
                    }
                    if (this.f18744U == null) {
                        mo26929a(1002, "no draft matches");
                    }
                    return false;
                } else {
                    C6762f b3 = this.f18744U.mo41206b(byteBuffer2);
                    if (!(b3 instanceof C6757a)) {
                        mo26960b(1002, str, false);
                        return false;
                    }
                    C6757a aVar2 = (C6757a) b3;
                    if (this.f18744U.mo41194a(aVar2) == HandshakeState.MATCHED) {
                        m32183a((C6762f) aVar2);
                        return true;
                    }
                    mo26929a(1002, "the handshake did finaly not match");
                    return false;
                }
            } catch (InvalidHandshakeException e5) {
                mo26959a((InvalidDataException) e5);
            }
        } catch (IncompleteHandshakeException e6) {
            if (this.f18747X.capacity() == 0) {
                byteBuffer2.reset();
                int a3 = e6.mo41215a();
                if (a3 == 0) {
                    a3 = byteBuffer2.capacity() + 16;
                }
                this.f18747X = ByteBuffer.allocate(a3);
                this.f18747X.put(byteBuffer);
            } else {
                ByteBuffer byteBuffer3 = this.f18747X;
                byteBuffer3.position(byteBuffer3.limit());
                ByteBuffer byteBuffer4 = this.f18747X;
                byteBuffer4.limit(byteBuffer4.capacity());
            }
        }
    }

    /* renamed from: e */
    private HandshakeState m32189e(ByteBuffer byteBuffer) throws IncompleteHandshakeException {
        byteBuffer.mark();
        if (byteBuffer.limit() > Draft.f34719e.length) {
            return HandshakeState.NOT_MATCHED;
        }
        int limit = byteBuffer.limit();
        byte[] bArr = Draft.f34719e;
        if (limit >= bArr.length) {
            int i = 0;
            while (byteBuffer.hasRemaining()) {
                if (Draft.f34719e[i] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return HandshakeState.NOT_MATCHED;
                }
                i++;
            }
            return HandshakeState.MATCHED;
        }
        throw new IncompleteHandshakeException(bArr.length);
    }

    /* renamed from: f */
    private void m32190f(ByteBuffer byteBuffer) {
        if (f18734e0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("write(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array()));
            sb.append("}");
            printStream.println(sb.toString());
        }
        this.f18737N.add(byteBuffer);
        this.f18742S.mo26975d(this);
    }

    /* renamed from: a */
    public void mo26929a(int i, String str) {
        m32186c(i, str, false);
    }

    /* renamed from: b */
    public void mo26961b(ByteBuffer byteBuffer) {
        if (f18734e0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("process(");
            sb.append(byteBuffer.remaining());
            sb.append("): {");
            sb.append(byteBuffer.remaining() > 1000 ? "too big to display" : new String(byteBuffer.array(), byteBuffer.position(), byteBuffer.remaining()));
            sb.append("}");
            printStream.println(sb.toString());
        }
        if (this.f18741R != C6740a.NOT_YET_CONNECTED) {
            m32187c(byteBuffer);
        } else if (!m32188d(byteBuffer)) {
        } else {
            if (byteBuffer.hasRemaining()) {
                m32187c(byteBuffer);
            } else if (this.f18747X.hasRemaining()) {
                m32187c(this.f18747X);
            }
        }
    }

    public void close() {
        mo26928a(1000);
    }

    /* renamed from: g */
    public boolean mo26942g() {
        return !this.f18737N.isEmpty();
    }

    /* renamed from: h */
    public InetSocketAddress mo26943h() {
        return this.f18742S.mo26972b(this);
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public InetSocketAddress mo26944i() {
        return this.f18742S.mo26974c(this);
    }

    public boolean isClosed() {
        return this.f18741R == C6740a.CLOSED;
    }

    public boolean isOpen() {
        return this.f18741R == C6740a.OPEN;
    }

    /* renamed from: j */
    public void mo26963j() {
        if (this.f18753b0 != null) {
            mo26956a(this.f18751a0.intValue(), this.f18749Z, this.f18753b0.booleanValue());
            return;
        }
        throw new IllegalStateException("this method must be used in conjuction with flushAndClose");
    }

    /* renamed from: k */
    public void mo26964k() {
        if (mo26937c() == C6740a.NOT_YET_CONNECTED) {
            mo26957a(-1, true);
        } else if (this.f18740Q) {
            mo26956a(this.f18751a0.intValue(), this.f18749Z, this.f18753b0.booleanValue());
        } else if (this.f18744U.mo41207b() == C12045a.NONE) {
            mo26957a(1000, true);
        } else if (this.f18744U.mo41207b() != C12045a.ONEWAY) {
            mo26957a(1006, true);
        } else if (this.f18745V == C6741b.SERVER) {
            mo26957a(1006, true);
        } else {
            mo26957a(1000, true);
        }
    }

    public String toString() {
        return super.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized void mo26956a(int i, String str, boolean z) {
        if (this.f18741R != C6740a.CLOSED) {
            if (this.f18750a != null) {
                this.f18750a.cancel();
            }
            if (this.f18752b != null) {
                try {
                    this.f18752b.close();
                } catch (IOException e) {
                    this.f18742S.mo26969a((C6739d) this, (Exception) e);
                }
            }
            try {
                this.f18742S.mo26973b(this, i, str, z);
            } catch (RuntimeException e2) {
                this.f18742S.mo26969a((C6739d) this, (Exception) e2);
            }
            if (this.f18744U != null) {
                this.f18744U.mo41209d();
            }
            this.f18748Y = null;
            this.f18741R = C6740a.CLOSED;
            this.f18737N.clear();
            return;
        }
        return;
    }

    /* renamed from: f */
    public boolean mo26941f() {
        return this.f18740Q;
    }

    public C6744g(C6745h hVar, Draft draft) {
        this.f18740Q = false;
        this.f18741R = C6740a.NOT_YET_CONNECTED;
        this.f18744U = null;
        this.f18746W = null;
        this.f18747X = ByteBuffer.allocate(0);
        this.f18748Y = null;
        this.f18749Z = null;
        this.f18751a0 = null;
        this.f18753b0 = null;
        this.f18754c0 = null;
        if (hVar == null || (draft == null && this.f18745V == C6741b.SERVER)) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.f18737N = new LinkedBlockingQueue();
        this.f18738O = new LinkedBlockingQueue();
        this.f18742S = hVar;
        this.f18745V = C6741b.CLIENT;
        if (draft != null) {
            this.f18744U = draft.mo41196a();
        }
    }

    /* renamed from: b */
    public void mo26935b(int i, String str) {
        mo26956a(i, str, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public synchronized void mo26960b(int i, String str, boolean z) {
        if (!this.f18740Q) {
            this.f18751a0 = Integer.valueOf(i);
            this.f18749Z = str;
            this.f18753b0 = Boolean.valueOf(z);
            this.f18740Q = true;
            this.f18742S.mo26975d(this);
            try {
                this.f18742S.mo26967a(this, i, str, z);
            } catch (RuntimeException e) {
                this.f18742S.mo26969a((C6739d) this, (Exception) e);
            }
            if (this.f18744U != null) {
                this.f18744U.mo41209d();
            }
            this.f18748Y = null;
        }
    }

    /* renamed from: e */
    public Draft mo26940e() {
        return this.f18744U;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26957a(int i, boolean z) {
        mo26956a(i, "", z);
    }

    /* renamed from: a */
    public void mo26928a(int i) {
        m32186c(i, "", false);
    }

    /* renamed from: a */
    public void mo26959a(InvalidDataException invalidDataException) {
        m32186c(invalidDataException.mo41216a(), invalidDataException.getMessage(), false);
    }

    /* renamed from: a */
    public void mo26932a(String str) throws WebsocketNotConnectedException {
        if (str != null) {
            m32184a((Collection<C6754d>) this.f18744U.mo41201a(str, this.f18745V == C6741b.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    /* renamed from: a */
    public void mo26933a(ByteBuffer byteBuffer) throws IllegalArgumentException, WebsocketNotConnectedException {
        if (byteBuffer != null) {
            m32184a((Collection<C6754d>) this.f18744U.mo41203a(byteBuffer, this.f18745V == C6741b.CLIENT));
            return;
        }
        throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
    }

    @Deprecated
    public C6744g(C6745h hVar, Draft draft, Socket socket) {
        this(hVar, draft);
    }

    /* renamed from: a */
    public void mo26934a(byte[] bArr) throws IllegalArgumentException, WebsocketNotConnectedException {
        mo26933a(ByteBuffer.wrap(bArr));
    }

    /* renamed from: b */
    public boolean mo26936b() {
        return this.f18741R == C6740a.CLOSING;
    }

    @Deprecated
    public C6744g(C6745h hVar, List<Draft> list, Socket socket) {
        this(hVar, list);
    }

    /* renamed from: a */
    private void m32184a(Collection<C6754d> collection) {
        if (isOpen()) {
            for (C6754d a : collection) {
                mo26931a(a);
            }
            return;
        }
        throw new WebsocketNotConnectedException();
    }

    /* renamed from: a */
    public void mo26930a(C6755a aVar, ByteBuffer byteBuffer, boolean z) {
        m32184a((Collection<C6754d>) this.f18744U.mo41198a(aVar, byteBuffer, z));
    }

    /* renamed from: a */
    public void mo26931a(C6754d dVar) {
        if (f18734e0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("send frame: ");
            sb.append(dVar);
            printStream.println(sb.toString());
        }
        m32190f(this.f18744U.mo41197a(dVar));
    }

    /* renamed from: a */
    public void mo26958a(C6758b bVar) throws InvalidHandshakeException {
        this.f18748Y = this.f18744U.mo41192a(bVar);
        this.f18754c0 = bVar.mo27006a();
        try {
            this.f18742S.mo26950a((C6739d) this, this.f18748Y);
            m32185a(this.f18744U.mo41199a((C6762f) this.f18748Y, this.f18745V));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e) {
            this.f18742S.mo26969a((C6739d) this, (Exception) e);
            StringBuilder sb = new StringBuilder();
            sb.append("rejected because of");
            sb.append(e);
            throw new InvalidHandshakeException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m32185a(List<ByteBuffer> list) {
        for (ByteBuffer f : list) {
            m32190f(f);
        }
    }

    /* renamed from: a */
    private void m32183a(C6762f fVar) {
        if (f18734e0) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("open using draft: ");
            sb.append(this.f18744U.getClass().getSimpleName());
            printStream.println(sb.toString());
        }
        this.f18741R = C6740a.OPEN;
        try {
            this.f18742S.mo26968a((C6739d) this, fVar);
        } catch (RuntimeException e) {
            this.f18742S.mo26969a((C6739d) this, (Exception) e);
        }
    }

    /* renamed from: c */
    private void m32186c(int i, String str, boolean z) {
        C6740a aVar = this.f18741R;
        if (!(aVar == C6740a.CLOSING || aVar == C6740a.CLOSED)) {
            if (aVar == C6740a.OPEN) {
                if (i == 1006) {
                    this.f18741R = C6740a.CLOSING;
                    mo26960b(i, str, false);
                    return;
                }
                if (this.f18744U.mo41207b() != C12045a.NONE) {
                    if (!z) {
                        try {
                            this.f18742S.mo26966a((C6739d) this, i, str);
                        } catch (RuntimeException e) {
                            try {
                                this.f18742S.mo26969a((C6739d) this, (Exception) e);
                            } catch (InvalidDataException e2) {
                                this.f18742S.mo26969a((C6739d) this, (Exception) e2);
                                mo26960b(1006, "generated frame is invalid", false);
                            }
                        }
                    }
                    mo26931a((C6754d) new C6752b(i, str));
                }
                mo26960b(i, str, z);
            } else if (i == -3) {
                mo26960b(-3, str, true);
            } else {
                mo26960b(-1, str, false);
            }
            if (i == 1002) {
                mo26960b(i, str, z);
            }
            this.f18741R = C6740a.CLOSING;
            this.f18747X = null;
        }
    }

    /* renamed from: a */
    public String mo26927a() {
        return this.f18754c0;
    }

    /* renamed from: c */
    public C6740a mo26937c() {
        return this.f18741R;
    }

    /* renamed from: d */
    public boolean mo26939d() {
        return this.f18741R == C6740a.CONNECTING;
    }
}
