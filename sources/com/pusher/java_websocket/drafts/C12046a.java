package com.pusher.java_websocket.drafts;

import com.google.common.base.C5785c;
import com.pusher.java_websocket.drafts.Draft.C12045a;
import com.pusher.java_websocket.drafts.Draft.HandshakeState;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidFrameException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import com.pusher.java_websocket.exceptions.LimitExedeedException;
import com.pusher.java_websocket.exceptions.NotSendableException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p076c.p112d.p148d.p279f.C6610c;
import p076c.p284e.p285a.C6739d.C6741b;
import p076c.p284e.p285a.p287k.C6752b;
import p076c.p284e.p285a.p287k.C6753c;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p287k.C6756e;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6759c;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p288l.C6765i;
import p076c.p284e.p285a.p290n.C6772a;
import p076c.p284e.p285a.p290n.C6776b;

/* renamed from: com.pusher.java_websocket.drafts.a */
/* compiled from: Draft_10 */
public class C12046a extends Draft {

    /* renamed from: i */
    static final /* synthetic */ boolean f34722i = false;

    /* renamed from: f */
    private ByteBuffer f34723f;

    /* renamed from: g */
    private C6754d f34724g = null;

    /* renamed from: h */
    private final Random f34725h = new Random();

    /* renamed from: com.pusher.java_websocket.drafts.a$a */
    /* compiled from: Draft_10 */
    private class C12047a extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;

        /* renamed from: a */
        private int f34726a;

        public C12047a(int i) {
            this.f34726a = i;
        }

        /* renamed from: a */
        public int mo41211a() {
            return this.f34726a;
        }
    }

    /* renamed from: b */
    public static int m54380b(C6762f fVar) {
        String b = fVar.mo27015b("Sec-WebSocket-Version");
        if (b.length() > 0) {
            try {
                return new Integer(b.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    /* renamed from: a */
    public HandshakeState mo41195a(C6757a aVar, C6764h hVar) throws InvalidHandshakeException {
        String str = "Sec-WebSocket-Key";
        if (aVar.mo27014a(str)) {
            String str2 = "Sec-WebSocket-Accept";
            if (hVar.mo27014a(str2)) {
                if (m54378a(aVar.mo27015b(str)).equals(hVar.mo27015b(str2))) {
                    return HandshakeState.MATCHED;
                }
                return HandshakeState.NOT_MATCHED;
            }
        }
        return HandshakeState.NOT_MATCHED;
    }

    /* renamed from: d */
    public void mo41209d() {
        this.f34723f = null;
    }

    /* renamed from: e */
    public C6754d mo41210e(ByteBuffer byteBuffer) throws C12047a, InvalidDataException {
        C6753c cVar;
        int remaining = byteBuffer.remaining();
        int i = 2;
        if (remaining >= 2) {
            byte b = byteBuffer.get();
            boolean z = (b >> 8) != 0;
            byte b2 = (byte) ((b & Byte.MAX_VALUE) >> 4);
            if (b2 == 0) {
                byte b3 = byteBuffer.get();
                boolean z2 = (b3 & Byte.MIN_VALUE) != 0;
                int i2 = (byte) (b3 & Byte.MAX_VALUE);
                C6755a a = m54377a((byte) (b & C5785c.f16698q));
                if (z || !(a == C6755a.PING || a == C6755a.PONG || a == C6755a.CLOSING)) {
                    if (i2 < 0 || i2 > 125) {
                        if (a == C6755a.PING || a == C6755a.PONG || a == C6755a.CLOSING) {
                            throw new InvalidFrameException("more than 125 octets");
                        } else if (i2 != 126) {
                            i = 10;
                            if (remaining >= 10) {
                                byte[] bArr = new byte[8];
                                for (int i3 = 0; i3 < 8; i3++) {
                                    bArr[i3] = byteBuffer.get();
                                }
                                long longValue = new BigInteger(bArr).longValue();
                                if (longValue <= 2147483647L) {
                                    i2 = (int) longValue;
                                } else {
                                    throw new LimitExedeedException("Payloadsize is to big...");
                                }
                            } else {
                                throw new C12047a(10);
                            }
                        } else if (remaining >= 4) {
                            byte[] bArr2 = new byte[3];
                            bArr2[1] = byteBuffer.get();
                            bArr2[2] = byteBuffer.get();
                            i2 = new BigInteger(bArr2).intValue();
                            i = 4;
                        } else {
                            throw new C12047a(4);
                        }
                    }
                    int i4 = i + (z2 ? 4 : 0) + i2;
                    if (remaining >= i4) {
                        ByteBuffer allocate = ByteBuffer.allocate(mo41191a(i2));
                        if (z2) {
                            byte[] bArr3 = new byte[4];
                            byteBuffer.get(bArr3);
                            for (int i5 = 0; i5 < i2; i5++) {
                                allocate.put((byte) (byteBuffer.get() ^ bArr3[i5 % 4]));
                            }
                        } else {
                            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                            byteBuffer.position(byteBuffer.position() + allocate.limit());
                        }
                        if (a == C6755a.CLOSING) {
                            cVar = new C6752b();
                        } else {
                            cVar = new C6756e();
                            cVar.mo27001b(z);
                            cVar.mo26999a(a);
                        }
                        allocate.flip();
                        cVar.mo26996a(allocate);
                        return cVar;
                    }
                    throw new C12047a(i4);
                }
                throw new InvalidFrameException("control frames may no be fragmented");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("bad rsv ");
            sb.append(b2);
            throw new InvalidFrameException(sb.toString());
        }
        throw new C12047a(2);
    }

    /* renamed from: b */
    public C12045a mo41207b() {
        return C12045a.TWOWAY;
    }

    /* renamed from: a */
    public HandshakeState mo41194a(C6757a aVar) throws InvalidHandshakeException {
        int b = m54380b(aVar);
        if (b != 7 && b != 8) {
            return HandshakeState.NOT_MATCHED;
        }
        return mo41205a((C6762f) aVar) ? HandshakeState.MATCHED : HandshakeState.NOT_MATCHED;
    }

    /* renamed from: a */
    public ByteBuffer mo41197a(C6754d dVar) {
        ByteBuffer d = dVar.mo26997d();
        int i = 0;
        boolean z = this.f34720a == C6741b.CLIENT;
        int i2 = d.remaining() <= 125 ? 1 : d.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate((i2 > 1 ? i2 + 1 : i2) + 1 + (z ? 4 : 0) + d.remaining());
        byte b = Byte.MIN_VALUE;
        allocate.put((byte) (((byte) (dVar.mo27005c() ? -128 : 0)) | m54376a(dVar.mo27004b())));
        byte[] a = m54379a((long) d.remaining(), i2);
        if (i2 == 1) {
            byte b2 = a[0];
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b2 | b));
        } else if (i2 == 2) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | 126));
            allocate.put(a);
        } else if (i2 == 8) {
            if (!z) {
                b = 0;
            }
            allocate.put((byte) (b | Byte.MAX_VALUE));
            allocate.put(a);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f34725h.nextInt());
            allocate.put(allocate2.array());
            while (d.hasRemaining()) {
                allocate.put((byte) (d.get() ^ allocate2.get(i % 4)));
                i++;
            }
        } else {
            allocate.put(d);
        }
        allocate.flip();
        return allocate;
    }

    /* renamed from: a */
    public List<C6754d> mo41203a(ByteBuffer byteBuffer, boolean z) {
        C6756e eVar = new C6756e();
        try {
            eVar.mo26996a(byteBuffer);
            eVar.mo27001b(true);
            eVar.mo26999a(C6755a.BINARY);
            eVar.mo27000a(z);
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException((Throwable) e);
        }
    }

    /* renamed from: a */
    public List<C6754d> mo41201a(String str, boolean z) {
        C6756e eVar = new C6756e();
        try {
            eVar.mo26996a(ByteBuffer.wrap(C6776b.m32433b(str)));
            eVar.mo27001b(true);
            eVar.mo26999a(C6755a.TEXT);
            eVar.mo27000a(z);
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e) {
            throw new NotSendableException((Throwable) e);
        }
    }

    /* renamed from: a */
    private byte m54376a(C6755a aVar) {
        if (aVar == C6755a.CONTINUOUS) {
            return 0;
        }
        if (aVar == C6755a.TEXT) {
            return 1;
        }
        if (aVar == C6755a.BINARY) {
            return 2;
        }
        if (aVar == C6755a.CLOSING) {
            return 8;
        }
        if (aVar == C6755a.PING) {
            return 9;
        }
        if (aVar == C6755a.PONG) {
            return 10;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Don't know how to handle ");
        sb.append(aVar.toString());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    private String m54378a(String str) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder();
        sb.append(trim);
        sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        String sb2 = sb.toString();
        try {
            return C6772a.m32411b(MessageDigest.getInstance("SHA1").digest(sb2.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public C6758b mo41192a(C6758b bVar) {
        String str = C6610c.f18385G;
        bVar.mo27008a(str, "websocket");
        bVar.mo27008a("Connection", str);
        bVar.mo27008a("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f34725h.nextBytes(bArr);
        bVar.mo27008a("Sec-WebSocket-Key", C6772a.m32411b(bArr));
        return bVar;
    }

    /* renamed from: a */
    public C6759c mo41193a(C6757a aVar, C6765i iVar) throws InvalidHandshakeException {
        iVar.mo27008a(C6610c.f18385G, "websocket");
        String str = "Connection";
        iVar.mo27008a(str, aVar.mo27015b(str));
        iVar.mo27013d("Switching Protocols");
        String b = aVar.mo27015b("Sec-WebSocket-Key");
        if (b != null) {
            iVar.mo27008a("Sec-WebSocket-Accept", m54378a(b));
            return iVar;
        }
        throw new InvalidHandshakeException("missing Sec-WebSocket-Key");
    }

    /* renamed from: a */
    private byte[] m54379a(long j, int i) {
        byte[] bArr = new byte[i];
        int i2 = (i * 8) - 8;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((int) (j >>> (i2 - (i3 * 8))));
        }
        return bArr;
    }

    /* renamed from: a */
    private C6755a m54377a(byte b) throws InvalidFrameException {
        if (b == 0) {
            return C6755a.CONTINUOUS;
        }
        if (b == 1) {
            return C6755a.TEXT;
        }
        if (b == 2) {
            return C6755a.BINARY;
        }
        switch (b) {
            case 8:
                return C6755a.CLOSING;
            case 9:
                return C6755a.PING;
            case 10:
                return C6755a.PONG;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknow optcode ");
                sb.append((short) b);
                throw new InvalidFrameException(sb.toString());
        }
    }

    /* renamed from: a */
    public List<C6754d> mo41202a(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        LinkedList linkedList = new LinkedList();
        if (this.f34723f != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.f34723f.remaining();
                if (remaining2 > remaining) {
                    this.f34723f.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.f34723f.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(mo41210e((ByteBuffer) this.f34723f.duplicate().position(0)));
                this.f34723f = null;
            } catch (C12047a e) {
                this.f34723f.limit();
                ByteBuffer allocate = ByteBuffer.allocate(mo41191a(e.mo41211a()));
                this.f34723f.rewind();
                allocate.put(this.f34723f);
                this.f34723f = allocate;
                return mo41202a(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(mo41210e(byteBuffer));
            } catch (C12047a e2) {
                byteBuffer.reset();
                this.f34723f = ByteBuffer.allocate(mo41191a(e2.mo41211a()));
                this.f34723f.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* renamed from: a */
    public Draft mo41196a() {
        return new C12046a();
    }
}
