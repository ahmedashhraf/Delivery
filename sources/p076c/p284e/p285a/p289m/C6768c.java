package p076c.p284e.p285a.p289m;

import com.pusher.java_websocket.drafts.Draft;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p076c.p284e.p285a.C6739d;
import p076c.p284e.p285a.C6742e;
import p076c.p284e.p285a.C6743f;
import p076c.p284e.p285a.C6744g;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6765i;

/* renamed from: c.e.a.m.c */
/* compiled from: WebSocketServer */
public abstract class C6768c extends C6742e implements Runnable {

    /* renamed from: Y */
    public static int f18800Y = Runtime.getRuntime().availableProcessors();

    /* renamed from: Z */
    static final /* synthetic */ boolean f18801Z = false;

    /* renamed from: N */
    private ServerSocketChannel f18802N;

    /* renamed from: O */
    private Selector f18803O;

    /* renamed from: P */
    private List<Draft> f18804P;

    /* renamed from: Q */
    private Thread f18805Q;

    /* renamed from: R */
    private final AtomicBoolean f18806R;

    /* renamed from: S */
    private List<C6770b> f18807S;

    /* renamed from: T */
    private List<C6744g> f18808T;

    /* renamed from: U */
    private BlockingQueue<ByteBuffer> f18809U;

    /* renamed from: V */
    private int f18810V;

    /* renamed from: W */
    private final AtomicInteger f18811W;

    /* renamed from: X */
    private C6769a f18812X;

    /* renamed from: a */
    private final Collection<C6739d> f18813a;

    /* renamed from: b */
    private final InetSocketAddress f18814b;

    /* renamed from: c.e.a.m.c$a */
    /* compiled from: WebSocketServer */
    public interface C6769a extends C6743f {
        /* renamed from: a */
        C6744g mo26954a(C6742e eVar, Draft draft, Socket socket);

        /* renamed from: a */
        C6744g mo26955a(C6742e eVar, List<Draft> list, Socket socket);

        /* renamed from: a */
        ByteChannel mo27018a(SocketChannel socketChannel, SelectionKey selectionKey) throws IOException;
    }

    /* renamed from: c.e.a.m.c$b */
    /* compiled from: WebSocketServer */
    public class C6770b extends Thread {

        /* renamed from: N */
        static final /* synthetic */ boolean f18815N = false;

        /* renamed from: a */
        private BlockingQueue<C6744g> f18816a = new LinkedBlockingQueue();

        /* renamed from: c.e.a.m.c$b$a */
        /* compiled from: WebSocketServer */
        class C6771a implements UncaughtExceptionHandler {

            /* renamed from: a */
            final /* synthetic */ C6768c f18818a;

            C6771a(C6768c cVar) {
                this.f18818a = cVar;
            }

            public void uncaughtException(Thread thread, Throwable th) {
                Thread.getDefaultUncaughtExceptionHandler().uncaughtException(thread, th);
            }
        }

        static {
            Class<C6768c> cls = C6768c.class;
        }

        public C6770b() {
            StringBuilder sb = new StringBuilder();
            sb.append("WebSocketWorker-");
            sb.append(getId());
            setName(sb.toString());
            setUncaughtExceptionHandler(new C6771a(C6768c.this));
        }

        /* renamed from: a */
        public void mo27044a(C6744g gVar) throws InterruptedException {
            this.f18816a.put(gVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            r6 = r1;
            r1 = r0;
            r0 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Removed duplicated region for block: B:23:? A[ExcHandler: InterruptedException (unused java.lang.InterruptedException), SYNTHETIC, Splitter:B:1:0x0001] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                r0 = 0
            L_0x0001:
                java.util.concurrent.BlockingQueue<c.e.a.g> r1 = r7.f18816a     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x0040 }
                java.lang.Object r1 = r1.take()     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x0040 }
                c.e.a.g r1 = (p076c.p284e.p285a.C6744g) r1     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x0040 }
                java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r0 = r1.f18738O     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                java.lang.Object r0 = r0.poll()     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                r1.mo26961b(r0)     // Catch:{ Exception -> 0x001c }
                c.e.a.m.c r2 = p076c.p284e.p285a.p289m.C6768c.this     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
            L_0x0016:
                r2.m32349b(r0)     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                goto L_0x0036
            L_0x001a:
                r2 = move-exception
                goto L_0x0038
            L_0x001c:
                r2 = move-exception
                java.io.PrintStream r3 = java.lang.System.err     // Catch:{ all -> 0x001a }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x001a }
                r4.<init>()     // Catch:{ all -> 0x001a }
                java.lang.String r5 = "Error while reading from remote connection: "
                r4.append(r5)     // Catch:{ all -> 0x001a }
                r4.append(r2)     // Catch:{ all -> 0x001a }
                java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x001a }
                r3.println(r2)     // Catch:{ all -> 0x001a }
                c.e.a.m.c r2 = p076c.p284e.p285a.p289m.C6768c.this     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                goto L_0x0016
            L_0x0036:
                r0 = r1
                goto L_0x0001
            L_0x0038:
                c.e.a.m.c r3 = p076c.p284e.p285a.p289m.C6768c.this     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                r3.m32349b(r0)     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
                throw r2     // Catch:{ InterruptedException -> 0x0049, RuntimeException -> 0x003e }
            L_0x003e:
                r0 = move-exception
                goto L_0x0044
            L_0x0040:
                r1 = move-exception
                r6 = r1
                r1 = r0
                r0 = r6
            L_0x0044:
                c.e.a.m.c r2 = p076c.p284e.p285a.p289m.C6768c.this
                r2.m32350c(r1, r0)
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p289m.C6768c.C6770b.run():void");
        }
    }

    static {
        Class<C6768c> cls = C6768c.class;
    }

    public C6768c() throws UnknownHostException {
        this(new InetSocketAddress(80), f18800Y, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m32350c(C6739d dVar, Exception exc) {
        mo27024b(dVar, exc);
        try {
            mo27042q();
        } catch (IOException e) {
            mo27024b((C6739d) null, (Exception) e);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            mo27024b((C6739d) null, (Exception) e2);
        }
    }

    /* renamed from: i */
    private Socket m32351i(C6739d dVar) {
        return ((SocketChannel) ((C6744g) dVar).f18750a.channel()).socket();
    }

    /* renamed from: r */
    private ByteBuffer m32352r() throws InterruptedException {
        return (ByteBuffer) this.f18809U.take();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo27020a(SelectionKey selectionKey) {
        return true;
    }

    /* renamed from: b */
    public void mo27021b(int i) throws InterruptedException {
        ArrayList<C6739d> arrayList;
        if (this.f18806R.compareAndSet(false, true)) {
            synchronized (this.f18813a) {
                arrayList = new ArrayList<>(this.f18813a);
            }
            for (C6739d a : arrayList) {
                a.mo26928a(1001);
            }
            synchronized (this) {
                if (!(this.f18805Q == null || this.f18805Q == Thread.currentThread())) {
                    this.f18803O.wakeup();
                    this.f18805Q.interrupt();
                    this.f18805Q.join((long) i);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo27022b(C6739d dVar, int i, String str) {
    }

    /* renamed from: b */
    public abstract void mo27023b(C6739d dVar, C6757a aVar);

    /* renamed from: b */
    public abstract void mo27024b(C6739d dVar, Exception exc);

    /* renamed from: b */
    public abstract void mo27025b(C6739d dVar, String str);

    /* renamed from: b */
    public void mo27026b(C6739d dVar, ByteBuffer byteBuffer) {
    }

    /* renamed from: c */
    public abstract void mo27027c(C6739d dVar, int i, String str, boolean z);

    /* renamed from: d */
    public final void mo26975d(C6739d dVar) {
        C6744g gVar = (C6744g) dVar;
        try {
            gVar.f18750a.interestOps(5);
        } catch (CancelledKeyException unused) {
            gVar.f18737N.clear();
        }
        this.f18803O.wakeup();
    }

    /* renamed from: d */
    public void mo27028d(C6739d dVar, int i, String str, boolean z) {
    }

    /* renamed from: d */
    public void mo27029d(C6739d dVar, C6754d dVar2) {
    }

    /* renamed from: e */
    public List<Draft> mo27030e() {
        return Collections.unmodifiableList(this.f18804P);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27032f(C6739d dVar) throws InterruptedException {
        if (this.f18811W.get() < (this.f18807S.size() * 2) + 1) {
            this.f18811W.incrementAndGet();
            this.f18809U.put(mo27036k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo27033g(C6739d dVar) throws InterruptedException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo27034h(C6739d dVar) {
        boolean remove;
        synchronized (this.f18813a) {
            remove = this.f18813a.remove(dVar);
        }
        if (this.f18806R.get() && this.f18813a.size() == 0) {
            this.f18805Q.interrupt();
        }
        return remove;
    }

    /* renamed from: j */
    public Collection<C6739d> mo27035j() {
        return this.f18813a;
    }

    /* renamed from: k */
    public ByteBuffer mo27036k() {
        return ByteBuffer.allocate(C6744g.f18733d0);
    }

    /* renamed from: l */
    public InetSocketAddress mo27037l() {
        return this.f18814b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public String mo27038m() {
        StringBuilder sb = new StringBuilder();
        sb.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
        sb.append(mo27039n());
        sb.append("\" /></cross-domain-policy>");
        return sb.toString();
    }

    /* renamed from: n */
    public int mo27039n() {
        int port = mo27037l().getPort();
        if (port != 0) {
            return port;
        }
        ServerSocketChannel serverSocketChannel = this.f18802N;
        return serverSocketChannel != null ? serverSocketChannel.socket().getLocalPort() : port;
    }

    /* renamed from: o */
    public final C6743f mo27040o() {
        return this.f18812X;
    }

    /* renamed from: p */
    public void mo27041p() {
        if (this.f18805Q == null) {
            new Thread(this).start();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C6768c.class.getName());
        sb.append(" can only be started once.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public void mo27042q() throws IOException, InterruptedException {
        mo27021b(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a1, code lost:
        if (r1 != null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01a8, code lost:
        mo27024b((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01ac, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ad, code lost:
        r4 = null;
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01af, code lost:
        if (r5 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r5.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01b4, code lost:
        m32348a(r5, (p076c.p284e.p285a.C6739d) r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b9, code lost:
        r1 = r11.f18807S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01bc, code lost:
        if (r1 != null) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01be, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01c6, code lost:
        if (r1.hasNext() != false) goto L_0x01c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c8, code lost:
        ((p076c.p284e.p285a.p289m.C6768c.C6770b) r1.next()).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d2, code lost:
        r1 = r11.f18802N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r11.f18802N = java.nio.channels.ServerSocketChannel.open();
        r11.f18802N.configureBlocking(false);
        r1 = r11.f18802N.socket();
        r1.setReceiveBufferSize(p076c.p284e.p285a.C6744g.f18733d0);
        r1.bind(r11.f18814b);
        r11.f18803O = java.nio.channels.Selector.open();
        r11.f18802N.register(r11.f18803O, r11.f18802N.validOps());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01d4, code lost:
        if (r1 != null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01da, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01db, code lost:
        mo27024b((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01df, code lost:
        r1 = r11.f18807S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e1, code lost:
        if (r1 != null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e3, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01eb, code lost:
        if (r1.hasNext() != false) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ed, code lost:
        ((p076c.p284e.p285a.p289m.C6768c.C6770b) r1.next()).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f7, code lost:
        r1 = r11.f18802N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f9, code lost:
        if (r1 != null) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01ff, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0201, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:?, code lost:
        m32350c((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0205, code lost:
        r1 = r11.f18807S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0207, code lost:
        if (r1 != null) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0209, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0211, code lost:
        if (r1.hasNext() != false) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0213, code lost:
        ((p076c.p284e.p285a.p289m.C6768c.C6770b) r1.next()).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x021d, code lost:
        r1 = r11.f18802N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x021f, code lost:
        if (r1 != null) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        if (r11.f18805Q.isInterrupted() == false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0225, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0226, code lost:
        mo27024b((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0229, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x022a, code lost:
        r2 = r11.f18807S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x022c, code lost:
        if (r2 != null) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022e, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0236, code lost:
        if (r2.hasNext() != false) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0238, code lost:
        ((p076c.p284e.p285a.p289m.C6768c.C6770b) r2.next()).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0242, code lost:
        r2 = r11.f18802N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0244, code lost:
        if (r2 != null) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x024a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x024b, code lost:
        mo27024b((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x024e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x024f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0250, code lost:
        m32350c((p076c.p284e.p285a.C6739d) null, (java.lang.Exception) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0253, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r11.f18803O.select();
        r1 = r11.f18803O.selectedKeys().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0062, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r3 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x00cc, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        if (r1.hasNext() != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r5 = (java.nio.channels.SelectionKey) r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008b, code lost:
        if (r5.isValid() == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r5.isAcceptable() != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (mo27020a(r5) == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r5.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r3 = r11.f18802N.accept();
        r3.configureBlocking(false);
        r7 = r11.f18812X.mo26955a((p076c.p284e.p285a.C6742e) r11, r11.f18804P, r3.socket());
        r7.f18750a = r3.register(r11.f18803O, 1, r7);
        r7.f18752b = r11.f18812X.mo27018a(r3, r7.f18750a);
        r1.remove();
        mo27032f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        if (r5.isReadable() != false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d4, code lost:
        r3 = (p076c.p284e.p285a.C6744g) r5.attachment();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00da, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r4 = m32352r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00de, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e4, code lost:
        if (p076c.p284e.p285a.C6738c.m32156a(r4, r3, r3.f18752b) != false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r4.hasRemaining() != false) goto L_0x00ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r3.f18738O.put(r4);
        m32345a(r3);
        r1.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        r11.f18808T.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010d, code lost:
        m32349b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0111, code lost:
        m32349b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0114, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0116, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0117, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        m32349b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011a, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r5.isWritable() != false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0125, code lost:
        r3 = (p076c.p284e.p285a.C6744g) r5.attachment();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        r5.interestOps(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x013c, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x013e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0147, code lost:
        if (r11.f18808T.isEmpty() != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0149, code lost:
        r1 = (p076c.p284e.p285a.C6744g) r11.f18808T.remove(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r4 = (p076c.p284e.p285a.C6746i) r1.f18752b;
        r5 = m32352r();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0159, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015d, code lost:
        if (p076c.p284e.p285a.C6738c.m32155a(r5, r1, r4) == false) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015f, code lost:
        r11.f18808T.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0168, code lost:
        if (r5.hasRemaining() == false) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016a, code lost:
        r1.f18738O.put(r5);
        m32345a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0173, code lost:
        m32349b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0176, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0178, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0179, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        m32349b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017c, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        r5 = r3;
        r10 = r4;
        r4 = r1;
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0183, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0184, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0186, code lost:
        r1 = r11.f18807S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0189, code lost:
        if (r1 != null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018b, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0193, code lost:
        if (r1.hasNext() != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0195, code lost:
        ((p076c.p284e.p285a.p289m.C6768c.C6770b) r1.next()).interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019f, code lost:
        r1 = r11.f18802N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = r11.f18805Q;
        r1 = new java.lang.StringBuilder();
        r1.append("WebsocketSelector");
        r1.append(r11.f18805Q.getId());
        r0.setName(r1.toString());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0062 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b1 A[SYNTHETIC, Splitter:B:109:0x01b1] */
    /* JADX WARNING: Removed duplicated region for block: B:113:? A[ExcHandler: ClosedByInterruptException (unused java.nio.channels.ClosedByInterruptException), SYNTHETIC, Splitter:B:15:0x006a] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0062 A[LOOP:0: B:12:0x0062->B:175:0x0062, LOOP_START, SYNTHETIC, Splitter:B:12:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ExcHandler: InterruptedException (unused java.lang.InterruptedException), SYNTHETIC, Splitter:B:69:0x0141] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.Thread r0 = r11.f18805Q     // Catch:{ all -> 0x0273 }
            if (r0 != 0) goto L_0x0254
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0273 }
            r11.f18805Q = r0     // Catch:{ all -> 0x0273 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.f18806R     // Catch:{ all -> 0x0273 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0273 }
            if (r0 == 0) goto L_0x0015
            monitor-exit(r11)     // Catch:{ all -> 0x0273 }
            return
        L_0x0015:
            monitor-exit(r11)     // Catch:{ all -> 0x0273 }
            java.lang.Thread r0 = r11.f18805Q
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "WebsocketSelector"
            r1.append(r2)
            java.lang.Thread r2 = r11.f18805Q
            long r2 = r2.getId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setName(r1)
            r0 = 0
            java.nio.channels.ServerSocketChannel r1 = java.nio.channels.ServerSocketChannel.open()     // Catch:{ IOException -> 0x024f }
            r11.f18802N = r1     // Catch:{ IOException -> 0x024f }
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N     // Catch:{ IOException -> 0x024f }
            r2 = 0
            r1.configureBlocking(r2)     // Catch:{ IOException -> 0x024f }
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N     // Catch:{ IOException -> 0x024f }
            java.net.ServerSocket r1 = r1.socket()     // Catch:{ IOException -> 0x024f }
            int r3 = p076c.p284e.p285a.C6744g.f18733d0     // Catch:{ IOException -> 0x024f }
            r1.setReceiveBufferSize(r3)     // Catch:{ IOException -> 0x024f }
            java.net.InetSocketAddress r3 = r11.f18814b     // Catch:{ IOException -> 0x024f }
            r1.bind(r3)     // Catch:{ IOException -> 0x024f }
            java.nio.channels.Selector r1 = java.nio.channels.Selector.open()     // Catch:{ IOException -> 0x024f }
            r11.f18803O = r1     // Catch:{ IOException -> 0x024f }
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N     // Catch:{ IOException -> 0x024f }
            java.nio.channels.Selector r3 = r11.f18803O     // Catch:{ IOException -> 0x024f }
            java.nio.channels.ServerSocketChannel r4 = r11.f18802N     // Catch:{ IOException -> 0x024f }
            int r4 = r4.validOps()     // Catch:{ IOException -> 0x024f }
            r1.register(r3, r4)     // Catch:{ IOException -> 0x024f }
        L_0x0062:
            java.lang.Thread r1 = r11.f18805Q     // Catch:{ RuntimeException -> 0x0201 }
            boolean r1 = r1.isInterrupted()     // Catch:{ RuntimeException -> 0x0201 }
            if (r1 != 0) goto L_0x01df
            java.nio.channels.Selector r1 = r11.f18803O     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x01ac, InterruptedException -> 0x0186 }
            r1.select()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x01ac, InterruptedException -> 0x0186 }
            java.nio.channels.Selector r1 = r11.f18803O     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x01ac, InterruptedException -> 0x0186 }
            java.util.Set r1 = r1.selectedKeys()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x01ac, InterruptedException -> 0x0186 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x01ac, InterruptedException -> 0x0186 }
            r3 = r0
            r4 = r3
        L_0x007b:
            boolean r5 = r1.hasNext()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            if (r5 == 0) goto L_0x0141
            java.lang.Object r5 = r1.next()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            java.nio.channels.SelectionKey r5 = (java.nio.channels.SelectionKey) r5     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            boolean r3 = r5.isValid()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            if (r3 != 0) goto L_0x008e
            goto L_0x00cc
        L_0x008e:
            boolean r3 = r5.isAcceptable()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r6 = 1
            if (r3 == 0) goto L_0x00ce
            boolean r3 = r11.mo27020a(r5)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            if (r3 != 0) goto L_0x009f
            r5.cancel()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            goto L_0x00cc
        L_0x009f:
            java.nio.channels.ServerSocketChannel r3 = r11.f18802N     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.SocketChannel r3 = r3.accept()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r3.configureBlocking(r2)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            c.e.a.m.c$a r7 = r11.f18812X     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.util.List<com.pusher.java_websocket.drafts.Draft> r8 = r11.f18804P     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.net.Socket r9 = r3.socket()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            c.e.a.g r7 = r7.mo26955a(r11, r8, r9)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.Selector r8 = r11.f18803O     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.SelectionKey r6 = r3.register(r8, r6, r7)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r7.f18750a = r6     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            c.e.a.m.c$a r6 = r11.f18812X     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.SelectionKey r8 = r7.f18750a     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.ByteChannel r3 = r6.mo27018a(r3, r8)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r7.f18752b = r3     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r1.remove()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            r11.mo27032f(r7)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
        L_0x00cc:
            r3 = r5
            goto L_0x007b
        L_0x00ce:
            boolean r3 = r5.isReadable()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            if (r3 == 0) goto L_0x011f
            java.lang.Object r3 = r5.attachment()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            c.e.a.g r3 = (p076c.p284e.p285a.C6744g) r3     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.ByteBuffer r4 = r11.m32352r()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
            java.nio.channels.ByteChannel r7 = r3.f18752b     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            boolean r7 = p076c.p284e.p285a.C6738c.m32156a(r4, r3, r7)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r7 == 0) goto L_0x0111
            boolean r7 = r4.hasRemaining()     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r7 == 0) goto L_0x010d
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r7 = r3.f18738O     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r7.put(r4)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r11.m32345a(r3)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r1.remove()     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            java.nio.channels.ByteChannel r7 = r3.f18752b     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            boolean r7 = r7 instanceof p076c.p284e.p285a.C6746i     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r7 == 0) goto L_0x0114
            java.nio.channels.ByteChannel r7 = r3.f18752b     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            c.e.a.i r7 = (p076c.p284e.p285a.C6746i) r7     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            boolean r7 = r7.mo26908E()     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r7 == 0) goto L_0x0114
            java.util.List<c.e.a.g> r7 = r11.f18808T     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r7.add(r3)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            goto L_0x0114
        L_0x010d:
            r11.m32349b(r4)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            goto L_0x0114
        L_0x0111:
            r11.m32349b(r4)     // Catch:{ IOException -> 0x0116, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
        L_0x0114:
            r4 = r3
            goto L_0x011f
        L_0x0116:
            r1 = move-exception
            r11.m32349b(r4)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
            throw r1     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
        L_0x011b:
            r1 = move-exception
            r4 = r3
            goto L_0x01af
        L_0x011f:
            boolean r3 = r5.isWritable()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            if (r3 == 0) goto L_0x00cc
            java.lang.Object r3 = r5.attachment()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            c.e.a.g r3 = (p076c.p284e.p285a.C6744g) r3     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x013e, InterruptedException -> 0x0186 }
            java.nio.channels.ByteChannel r4 = r3.f18752b     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
            boolean r4 = p076c.p284e.p285a.C6738c.m32154a(r3, r4)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
            if (r4 == 0) goto L_0x013c
            boolean r4 = r5.isValid()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
            if (r4 == 0) goto L_0x013c
            r5.interestOps(r6)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x011b, InterruptedException -> 0x0186 }
        L_0x013c:
            r4 = r3
            goto L_0x00cc
        L_0x013e:
            r1 = move-exception
            goto L_0x01af
        L_0x0141:
            java.util.List<c.e.a.g> r1 = r11.f18808T     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            boolean r1 = r1.isEmpty()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            if (r1 != 0) goto L_0x0062
            java.util.List<c.e.a.g> r1 = r11.f18808T     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            c.e.a.g r1 = (p076c.p284e.p285a.C6744g) r1     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x0183, InterruptedException -> 0x0186 }
            java.nio.channels.ByteChannel r4 = r1.f18752b     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x017d, InterruptedException -> 0x0186 }
            c.e.a.i r4 = (p076c.p284e.p285a.C6746i) r4     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x017d, InterruptedException -> 0x0186 }
            java.nio.ByteBuffer r5 = r11.m32352r()     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x017d, InterruptedException -> 0x0186 }
            boolean r4 = p076c.p284e.p285a.C6738c.m32155a(r5, r1, r4)     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r4 == 0) goto L_0x0164
            java.util.List<c.e.a.g> r4 = r11.f18808T     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r4.add(r1)     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
        L_0x0164:
            boolean r4 = r5.hasRemaining()     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            if (r4 == 0) goto L_0x0173
            java.util.concurrent.BlockingQueue<java.nio.ByteBuffer> r4 = r1.f18738O     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r4.put(r5)     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            r11.m32345a(r1)     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
            goto L_0x0176
        L_0x0173:
            r11.m32349b(r5)     // Catch:{ IOException -> 0x0178, CancelledKeyException -> 0x0062, InterruptedException -> 0x0186 }
        L_0x0176:
            r4 = r1
            goto L_0x0141
        L_0x0178:
            r4 = move-exception
            r11.m32349b(r5)     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x017d, InterruptedException -> 0x0186 }
            throw r4     // Catch:{ CancelledKeyException -> 0x0062, ClosedByInterruptException -> 0x01b9, IOException -> 0x017d, InterruptedException -> 0x0186 }
        L_0x017d:
            r4 = move-exception
            r5 = r3
            r10 = r4
            r4 = r1
            r1 = r10
            goto L_0x01af
        L_0x0183:
            r1 = move-exception
            r5 = r3
            goto L_0x01af
        L_0x0186:
            java.util.List<c.e.a.m.c$b> r1 = r11.f18807S
            if (r1 == 0) goto L_0x019f
            java.util.Iterator r1 = r1.iterator()
        L_0x018f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x019f
            java.lang.Object r2 = r1.next()
            c.e.a.m.c$b r2 = (p076c.p284e.p285a.p289m.C6768c.C6770b) r2
            r2.interrupt()
            goto L_0x018f
        L_0x019f:
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N
            if (r1 == 0) goto L_0x01ab
            r1.close()     // Catch:{ IOException -> 0x01a7 }
            goto L_0x01ab
        L_0x01a7:
            r1 = move-exception
            r11.mo27024b(r0, r1)
        L_0x01ab:
            return
        L_0x01ac:
            r1 = move-exception
            r4 = r0
            r5 = r4
        L_0x01af:
            if (r5 == 0) goto L_0x01b4
            r5.cancel()     // Catch:{ RuntimeException -> 0x0201 }
        L_0x01b4:
            r11.m32348a(r5, r4, r1)     // Catch:{ RuntimeException -> 0x0201 }
            goto L_0x0062
        L_0x01b9:
            java.util.List<c.e.a.m.c$b> r1 = r11.f18807S
            if (r1 == 0) goto L_0x01d2
            java.util.Iterator r1 = r1.iterator()
        L_0x01c2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d2
            java.lang.Object r2 = r1.next()
            c.e.a.m.c$b r2 = (p076c.p284e.p285a.p289m.C6768c.C6770b) r2
            r2.interrupt()
            goto L_0x01c2
        L_0x01d2:
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N
            if (r1 == 0) goto L_0x01de
            r1.close()     // Catch:{ IOException -> 0x01da }
            goto L_0x01de
        L_0x01da:
            r1 = move-exception
            r11.mo27024b(r0, r1)
        L_0x01de:
            return
        L_0x01df:
            java.util.List<c.e.a.m.c$b> r1 = r11.f18807S
            if (r1 == 0) goto L_0x01f7
            java.util.Iterator r1 = r1.iterator()
        L_0x01e7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01f7
            java.lang.Object r2 = r1.next()
            c.e.a.m.c$b r2 = (p076c.p284e.p285a.p289m.C6768c.C6770b) r2
            r2.interrupt()
            goto L_0x01e7
        L_0x01f7:
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N
            if (r1 == 0) goto L_0x0229
            r1.close()     // Catch:{ IOException -> 0x0225 }
            goto L_0x0229
        L_0x01ff:
            r1 = move-exception
            goto L_0x022a
        L_0x0201:
            r1 = move-exception
            r11.m32350c(r0, r1)     // Catch:{ all -> 0x01ff }
            java.util.List<c.e.a.m.c$b> r1 = r11.f18807S
            if (r1 == 0) goto L_0x021d
            java.util.Iterator r1 = r1.iterator()
        L_0x020d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x021d
            java.lang.Object r2 = r1.next()
            c.e.a.m.c$b r2 = (p076c.p284e.p285a.p289m.C6768c.C6770b) r2
            r2.interrupt()
            goto L_0x020d
        L_0x021d:
            java.nio.channels.ServerSocketChannel r1 = r11.f18802N
            if (r1 == 0) goto L_0x0229
            r1.close()     // Catch:{ IOException -> 0x0225 }
            goto L_0x0229
        L_0x0225:
            r1 = move-exception
            r11.mo27024b(r0, r1)
        L_0x0229:
            return
        L_0x022a:
            java.util.List<c.e.a.m.c$b> r2 = r11.f18807S
            if (r2 == 0) goto L_0x0242
            java.util.Iterator r2 = r2.iterator()
        L_0x0232:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0242
            java.lang.Object r3 = r2.next()
            c.e.a.m.c$b r3 = (p076c.p284e.p285a.p289m.C6768c.C6770b) r3
            r3.interrupt()
            goto L_0x0232
        L_0x0242:
            java.nio.channels.ServerSocketChannel r2 = r11.f18802N
            if (r2 == 0) goto L_0x024e
            r2.close()     // Catch:{ IOException -> 0x024a }
            goto L_0x024e
        L_0x024a:
            r2 = move-exception
            r11.mo27024b(r0, r2)
        L_0x024e:
            throw r1
        L_0x024f:
            r1 = move-exception
            r11.m32350c(r0, r1)
            return
        L_0x0254:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0273 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0273 }
            r1.<init>()     // Catch:{ all -> 0x0273 }
            java.lang.Class r2 = r11.getClass()     // Catch:{ all -> 0x0273 }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0273 }
            r1.append(r2)     // Catch:{ all -> 0x0273 }
            java.lang.String r2 = " can only be started once."
            r1.append(r2)     // Catch:{ all -> 0x0273 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0273 }
            r0.<init>(r1)     // Catch:{ all -> 0x0273 }
            throw r0     // Catch:{ all -> 0x0273 }
        L_0x0273:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0273 }
            goto L_0x0277
        L_0x0276:
            throw r0
        L_0x0277:
            goto L_0x0276
        */
        throw new UnsupportedOperationException("Method not decompiled: p076c.p284e.p285a.p289m.C6768c.run():void");
    }

    public C6768c(InetSocketAddress inetSocketAddress) {
        this(inetSocketAddress, f18800Y, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo27031e(C6739d dVar) {
        boolean add;
        if (!this.f18806R.get()) {
            synchronized (this.f18813a) {
                add = this.f18813a.add(dVar);
            }
            return add;
        }
        dVar.mo26928a(1001);
        return true;
    }

    public C6768c(InetSocketAddress inetSocketAddress, int i) {
        this(inetSocketAddress, i, null);
    }

    /* renamed from: a */
    private void m32345a(C6744g gVar) throws InterruptedException {
        if (gVar.f18739P == null) {
            List<C6770b> list = this.f18807S;
            gVar.f18739P = (C6770b) list.get(this.f18810V % list.size());
            this.f18810V++;
        }
        gVar.f18739P.mo27044a(gVar);
    }

    public C6768c(InetSocketAddress inetSocketAddress, List<Draft> list) {
        this(inetSocketAddress, f18800Y, list);
    }

    public C6768c(InetSocketAddress inetSocketAddress, int i, List<Draft> list) {
        this(inetSocketAddress, i, list, new HashSet());
    }

    public C6768c(InetSocketAddress inetSocketAddress, int i, List<Draft> list, Collection<C6739d> collection) {
        this.f18806R = new AtomicBoolean(false);
        this.f18810V = 0;
        this.f18811W = new AtomicInteger(0);
        this.f18812X = new C6767b();
        if (inetSocketAddress == null || i < 1 || collection == null) {
            throw new IllegalArgumentException("address and connectionscontainer must not be null and you need at least 1 decoder");
        }
        if (list == null) {
            this.f18804P = Collections.emptyList();
        } else {
            this.f18804P = list;
        }
        this.f18814b = inetSocketAddress;
        this.f18813a = collection;
        this.f18808T = new LinkedList();
        this.f18807S = new ArrayList(i);
        this.f18809U = new LinkedBlockingQueue();
        for (int i2 = 0; i2 < i; i2++) {
            C6770b bVar = new C6770b();
            this.f18807S.add(bVar);
            bVar.start();
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo26953c(C6739d dVar, C6754d dVar2) {
        mo27029d(dVar, dVar2);
    }

    /* renamed from: a */
    private void m32348a(SelectionKey selectionKey, C6739d dVar, IOException iOException) {
        if (dVar != null) {
            dVar.mo26935b(1006, iOException.getMessage());
        } else if (selectionKey != null) {
            SelectableChannel channel = selectionKey.channel();
            if (channel != null && channel.isOpen()) {
                try {
                    channel.close();
                } catch (IOException unused) {
                }
                if (C6744g.f18734e0) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Connection closed because of");
                    sb.append(iOException);
                    printStream.println(sb.toString());
                }
            }
        }
    }

    /* renamed from: c */
    public InetSocketAddress mo26974c(C6739d dVar) {
        return (InetSocketAddress) m32351i(dVar).getLocalSocketAddress();
    }

    /* renamed from: a */
    public final void mo26970a(C6739d dVar, String str) {
        mo27025b(dVar, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m32349b(ByteBuffer byteBuffer) throws InterruptedException {
        if (this.f18809U.size() <= this.f18811W.intValue()) {
            this.f18809U.put(byteBuffer);
        }
    }

    /* renamed from: a */
    public final void mo26971a(C6739d dVar, ByteBuffer byteBuffer) {
        mo27026b(dVar, byteBuffer);
    }

    /* renamed from: a */
    public final void mo26968a(C6739d dVar, C6762f fVar) {
        if (mo27031e(dVar)) {
            mo27023b(dVar, (C6757a) fVar);
        }
    }

    /* renamed from: b */
    public final void mo26973b(C6739d dVar, int i, String str, boolean z) {
        this.f18803O.wakeup();
        try {
            if (mo27034h(dVar)) {
                mo27027c(dVar, i, str, z);
            }
            try {
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } finally {
            try {
                mo27033g(dVar);
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: a */
    public C6765i mo26947a(C6739d dVar, Draft draft, C6757a aVar) throws InvalidDataException {
        return super.mo26947a(dVar, draft, aVar);
    }

    /* renamed from: a */
    public final void mo26969a(C6739d dVar, Exception exc) {
        mo27024b(dVar, exc);
    }

    /* renamed from: a */
    public void mo26966a(C6739d dVar, int i, String str) {
        mo27022b(dVar, i, str);
    }

    /* renamed from: a */
    public void mo26967a(C6739d dVar, int i, String str, boolean z) {
        mo27028d(dVar, i, str, z);
    }

    /* renamed from: a */
    public final void mo27019a(C6769a aVar) {
        this.f18812X = aVar;
    }

    /* renamed from: b */
    public InetSocketAddress mo26972b(C6739d dVar) {
        return (InetSocketAddress) m32351i(dVar).getRemoteSocketAddress();
    }
}
