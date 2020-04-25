package p076c.p284e.p285a;

import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: c.e.a.b */
/* compiled from: SSLSocketChannel2 */
public class C6737b implements ByteChannel, C6746i {

    /* renamed from: W */
    protected static ByteBuffer f18718W = ByteBuffer.allocate(0);

    /* renamed from: X */
    static final /* synthetic */ boolean f18719X = false;

    /* renamed from: N */
    protected ByteBuffer f18720N;

    /* renamed from: O */
    protected ByteBuffer f18721O;

    /* renamed from: P */
    protected ByteBuffer f18722P;

    /* renamed from: Q */
    protected SocketChannel f18723Q;

    /* renamed from: R */
    protected SelectionKey f18724R;

    /* renamed from: S */
    protected SSLEngine f18725S;

    /* renamed from: T */
    protected SSLEngineResult f18726T;

    /* renamed from: U */
    protected SSLEngineResult f18727U;

    /* renamed from: V */
    protected int f18728V = 0;

    /* renamed from: a */
    protected ExecutorService f18729a;

    /* renamed from: b */
    protected List<Future<?>> f18730b;

    static {
        Class<C6737b> cls = C6737b.class;
    }

    public C6737b(SocketChannel socketChannel, SSLEngine sSLEngine, ExecutorService executorService, SelectionKey selectionKey) throws IOException {
        if (socketChannel == null || sSLEngine == null || executorService == null) {
            throw new IllegalArgumentException("parameter must not be null");
        }
        this.f18723Q = socketChannel;
        this.f18725S = sSLEngine;
        this.f18729a = executorService;
        SSLEngineResult sSLEngineResult = new SSLEngineResult(Status.BUFFER_UNDERFLOW, sSLEngine.getHandshakeStatus(), 0, 0);
        this.f18727U = sSLEngineResult;
        this.f18726T = sSLEngineResult;
        this.f18730b = new ArrayList(3);
        if (selectionKey != null) {
            selectionKey.interestOps(selectionKey.interestOps() | 4);
            this.f18724R = selectionKey;
        }
        mo26917a(sSLEngine.getSession());
        this.f18723Q.write(m32138c(f18718W));
        m32140g();
    }

    /* renamed from: a */
    private void m32136a(Future<?> future) {
        boolean z = false;
        while (true) {
            try {
                future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            try {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    private int m32137b(ByteBuffer byteBuffer) throws SSLException {
        if (this.f18720N.hasRemaining()) {
            return m32135a(this.f18720N, byteBuffer);
        }
        if (!this.f18720N.hasRemaining()) {
            this.f18720N.clear();
        }
        if (this.f18722P.hasRemaining()) {
            m32141h();
            int a = m32135a(this.f18720N, byteBuffer);
            if (this.f18726T.getStatus() == Status.CLOSED) {
                return -1;
            }
            if (a > 0) {
                return a;
            }
        }
        return 0;
    }

    /* renamed from: c */
    private synchronized ByteBuffer m32138c(ByteBuffer byteBuffer) throws SSLException {
        this.f18721O.compact();
        this.f18727U = this.f18725S.wrap(byteBuffer, this.f18721O);
        this.f18721O.flip();
        return this.f18721O;
    }

    /* renamed from: f */
    private boolean m32139f() {
        HandshakeStatus handshakeStatus = this.f18725S.getHandshakeStatus();
        return handshakeStatus == HandshakeStatus.FINISHED || handshakeStatus == HandshakeStatus.NOT_HANDSHAKING;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m32140g() throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            javax.net.ssl.SSLEngine r0 = r3.f18725S     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x000d
            monitor-exit(r3)
            return
        L_0x000d:
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f18730b     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x003c
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f18730b     // Catch:{ all -> 0x00ca }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00ca }
        L_0x001b:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00ca }
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch:{ all -> 0x00ca }
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x00ca }
            if (r2 == 0) goto L_0x0031
            r0.remove()     // Catch:{ all -> 0x00ca }
            goto L_0x001b
        L_0x0031:
            boolean r0 = r3.isBlocking()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x003a
            r3.m32136a(r1)     // Catch:{ all -> 0x00ca }
        L_0x003a:
            monitor-exit(r3)
            return
        L_0x003c:
            javax.net.ssl.SSLEngine r0 = r3.f18725S     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_UNWRAP     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x0090
            boolean r0 = r3.isBlocking()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0056
            javax.net.ssl.SSLEngineResult r0 = r3.f18726T     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$Status r0 = r0.getStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$Status r1 = javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x006b
        L_0x0056:
            java.nio.ByteBuffer r0 = r3.f18722P     // Catch:{ all -> 0x00ca }
            r0.compact()     // Catch:{ all -> 0x00ca }
            java.nio.channels.SocketChannel r0 = r3.f18723Q     // Catch:{ all -> 0x00ca }
            java.nio.ByteBuffer r1 = r3.f18722P     // Catch:{ all -> 0x00ca }
            int r0 = r0.read(r1)     // Catch:{ all -> 0x00ca }
            r1 = -1
            if (r0 == r1) goto L_0x0088
            java.nio.ByteBuffer r0 = r3.f18722P     // Catch:{ all -> 0x00ca }
            r0.flip()     // Catch:{ all -> 0x00ca }
        L_0x006b:
            java.nio.ByteBuffer r0 = r3.f18720N     // Catch:{ all -> 0x00ca }
            r0.compact()     // Catch:{ all -> 0x00ca }
            r3.m32141h()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult r0 = r3.f18726T     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x0090
            javax.net.ssl.SSLEngine r0 = r3.f18725S     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch:{ all -> 0x00ca }
            r3.mo26917a(r0)     // Catch:{ all -> 0x00ca }
            monitor-exit(r3)
            return
        L_0x0088:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = "connection closed unexpectedly by peer"
            r0.<init>(r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x0090:
            r3.mo26916a()     // Catch:{ all -> 0x00ca }
            java.util.List<java.util.concurrent.Future<?>> r0 = r3.f18730b     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x00a5
            javax.net.ssl.SSLEngine r0 = r3.f18725S     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.NEED_WRAP     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x00c5
        L_0x00a5:
            java.nio.channels.SocketChannel r0 = r3.f18723Q     // Catch:{ all -> 0x00ca }
            java.nio.ByteBuffer r1 = f18718W     // Catch:{ all -> 0x00ca }
            java.nio.ByteBuffer r1 = r3.m32138c(r1)     // Catch:{ all -> 0x00ca }
            r0.write(r1)     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult r0 = r3.f18727U     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r0 = r0.getHandshakeStatus()     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLEngineResult$HandshakeStatus r1 = javax.net.ssl.SSLEngineResult.HandshakeStatus.FINISHED     // Catch:{ all -> 0x00ca }
            if (r0 != r1) goto L_0x00c5
            javax.net.ssl.SSLEngine r0 = r3.f18725S     // Catch:{ all -> 0x00ca }
            javax.net.ssl.SSLSession r0 = r0.getSession()     // Catch:{ all -> 0x00ca }
            r3.mo26917a(r0)     // Catch:{ all -> 0x00ca }
            monitor-exit(r3)
            return
        L_0x00c5:
            r0 = 1
            r3.f18728V = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r3)
            return
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r3)
            goto L_0x00ce
        L_0x00cd:
            throw r0
        L_0x00ce:
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.C6737b.m32140g():void");
    }

    /* renamed from: h */
    private synchronized ByteBuffer m32141h() throws SSLException {
        while (true) {
            int remaining = this.f18720N.remaining();
            this.f18726T = this.f18725S.unwrap(this.f18722P, this.f18720N);
            if (this.f18726T.getStatus() != Status.OK || (remaining == this.f18720N.remaining() && this.f18725S.getHandshakeStatus() != HandshakeStatus.NEED_UNWRAP)) {
                this.f18720N.flip();
            }
        }
        this.f18720N.flip();
        return this.f18720N;
    }

    /* renamed from: C */
    public void mo26906C() throws IOException {
        write(this.f18721O);
    }

    /* renamed from: D */
    public boolean mo26907D() {
        return this.f18721O.hasRemaining() || !m32139f();
    }

    /* renamed from: E */
    public boolean mo26908E() {
        return this.f18720N.hasRemaining() || !(!this.f18722P.hasRemaining() || this.f18726T.getStatus() == Status.BUFFER_UNDERFLOW || this.f18726T.getStatus() == Status.CLOSED);
    }

    public void close() throws IOException {
        this.f18725S.closeOutbound();
        this.f18725S.getSession().invalidate();
        if (this.f18723Q.isOpen()) {
            this.f18723Q.write(m32138c(f18718W));
        }
        this.f18723Q.close();
        this.f18729a.shutdownNow();
    }

    /* renamed from: d */
    public boolean mo26922d() {
        return this.f18725S.isInboundDone();
    }

    /* renamed from: e */
    public Socket mo26923e() {
        return this.f18723Q.socket();
    }

    public boolean isBlocking() {
        return this.f18723Q.isBlocking();
    }

    public boolean isOpen() {
        return this.f18723Q.isOpen();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            return 0;
        }
        if (!m32139f()) {
            if (isBlocking()) {
                while (!m32139f()) {
                    m32140g();
                }
            } else {
                m32140g();
                if (!m32139f()) {
                    return 0;
                }
            }
        }
        int b = m32137b(byteBuffer);
        if (b != 0) {
            return b;
        }
        this.f18720N.clear();
        if (!this.f18722P.hasRemaining()) {
            this.f18722P.clear();
        } else {
            this.f18722P.compact();
        }
        if ((isBlocking() || this.f18726T.getStatus() == Status.BUFFER_UNDERFLOW) && this.f18723Q.read(this.f18722P) == -1) {
            return -1;
        }
        this.f18722P.flip();
        m32141h();
        int a = m32135a(this.f18720N, byteBuffer);
        return (a != 0 || !isBlocking()) ? a : read(byteBuffer);
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!m32139f()) {
            m32140g();
            return 0;
        }
        int write = this.f18723Q.write(m32138c(byteBuffer));
        if (this.f18727U.getStatus() != Status.CLOSED) {
            return write;
        }
        throw new EOFException("Connection is closed");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26916a() {
        while (true) {
            Runnable delegatedTask = this.f18725S.getDelegatedTask();
            if (delegatedTask != null) {
                this.f18730b.add(this.f18729a.submit(delegatedTask));
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo26920c() {
        return this.f18723Q.isConnected();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26917a(SSLSession sSLSession) {
        int packetBufferSize = sSLSession.getPacketBufferSize();
        int max = Math.max(sSLSession.getApplicationBufferSize(), packetBufferSize);
        ByteBuffer byteBuffer = this.f18720N;
        if (byteBuffer == null) {
            this.f18720N = ByteBuffer.allocate(max);
            this.f18721O = ByteBuffer.allocate(packetBufferSize);
            this.f18722P = ByteBuffer.allocate(packetBufferSize);
        } else {
            if (byteBuffer.capacity() != max) {
                this.f18720N = ByteBuffer.allocate(max);
            }
            if (this.f18721O.capacity() != packetBufferSize) {
                this.f18721O = ByteBuffer.allocate(packetBufferSize);
            }
            if (this.f18722P.capacity() != packetBufferSize) {
                this.f18722P = ByteBuffer.allocate(packetBufferSize);
            }
        }
        this.f18720N.rewind();
        this.f18720N.flip();
        this.f18722P.rewind();
        this.f18722P.flip();
        this.f18721O.rewind();
        this.f18721O.flip();
        this.f18728V++;
    }

    /* renamed from: b */
    public boolean mo26919b() throws IOException {
        return this.f18723Q.finishConnect();
    }

    /* renamed from: a */
    public SelectableChannel mo26915a(boolean z) throws IOException {
        return this.f18723Q.configureBlocking(z);
    }

    /* renamed from: a */
    public boolean mo26918a(SocketAddress socketAddress) throws IOException {
        return this.f18723Q.connect(socketAddress);
    }

    /* renamed from: a */
    public int mo26909a(ByteBuffer byteBuffer) throws SSLException {
        return m32137b(byteBuffer);
    }

    /* renamed from: a */
    private int m32135a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer.remaining();
        int remaining2 = byteBuffer2.remaining();
        if (remaining > remaining2) {
            int min = Math.min(remaining, remaining2);
            for (int i = 0; i < min; i++) {
                byteBuffer2.put(byteBuffer.get());
            }
            return min;
        }
        byteBuffer2.put(byteBuffer);
        return remaining;
    }
}
