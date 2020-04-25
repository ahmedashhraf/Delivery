package com.pusher.java_websocket.drafts;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.pusher.java_websocket.exceptions.IncompleteHandshakeException;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import com.pusher.java_websocket.exceptions.LimitExedeedException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p076c.p112d.p148d.p279f.C6610c;
import p076c.p284e.p285a.C6739d.C6741b;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p287k.C6756e;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6759c;
import p076c.p284e.p285a.p288l.C6760d;
import p076c.p284e.p285a.p288l.C6761e;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p288l.C6765i;
import p076c.p284e.p285a.p290n.C6776b;

public abstract class Draft {

    /* renamed from: c */
    public static int f34717c = 1000;

    /* renamed from: d */
    public static int f34718d = 64;

    /* renamed from: e */
    public static final byte[] f34719e = C6776b.m32433b("<policy-file-request/>\u0000");

    /* renamed from: a */
    protected C6741b f34720a = null;

    /* renamed from: b */
    protected C6755a f34721b = null;

    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    /* renamed from: com.pusher.java_websocket.drafts.Draft$a */
    public enum C12045a {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* renamed from: a */
    public static C6759c m54354a(ByteBuffer byteBuffer, C6741b bVar) throws InvalidHandshakeException, IncompleteHandshakeException {
        C6759c cVar;
        String d = m54356d(byteBuffer);
        if (d != null) {
            String[] split = d.split(C3868i.f12248b, 3);
            if (split.length == 3) {
                if (bVar == C6741b.CLIENT) {
                    C6765i eVar = new C6761e();
                    eVar.mo27010a(Short.parseShort(split[1]));
                    eVar.mo27013d(split[2]);
                    cVar = eVar;
                } else {
                    C6758b dVar = new C6760d();
                    dVar.mo27007c(split[1]);
                    cVar = dVar;
                }
                String d2 = m54356d(byteBuffer);
                while (d2 != null && d2.length() > 0) {
                    String[] split2 = d2.split(":", 2);
                    if (split2.length == 2) {
                        cVar.mo27008a(split2[0], split2[1].replaceFirst("^ +", ""));
                        d2 = m54356d(byteBuffer);
                    } else {
                        throw new InvalidHandshakeException("not an http header");
                    }
                }
                if (d2 != null) {
                    return cVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    /* renamed from: c */
    public static ByteBuffer m54355c(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b = 48;
        while (byteBuffer.hasRemaining()) {
            byte b2 = byteBuffer.get();
            allocate.put(b2);
            if (b == 13 && b2 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                return allocate;
            }
            b = b2;
        }
        byteBuffer.position(byteBuffer.position() - allocate.position());
        return null;
    }

    /* renamed from: d */
    public static String m54356d(ByteBuffer byteBuffer) {
        ByteBuffer c = m54355c(byteBuffer);
        if (c == null) {
            return null;
        }
        return C6776b.m32429a(c.array(), 0, c.limit());
    }

    /* renamed from: a */
    public abstract C6758b mo41192a(C6758b bVar) throws InvalidHandshakeException;

    /* renamed from: a */
    public abstract C6759c mo41193a(C6757a aVar, C6765i iVar) throws InvalidHandshakeException;

    /* renamed from: a */
    public abstract HandshakeState mo41194a(C6757a aVar) throws InvalidHandshakeException;

    /* renamed from: a */
    public abstract HandshakeState mo41195a(C6757a aVar, C6764h hVar) throws InvalidHandshakeException;

    /* renamed from: a */
    public abstract Draft mo41196a();

    /* renamed from: a */
    public abstract ByteBuffer mo41197a(C6754d dVar);

    /* renamed from: a */
    public abstract List<C6754d> mo41201a(String str, boolean z);

    /* renamed from: a */
    public abstract List<C6754d> mo41202a(ByteBuffer byteBuffer) throws InvalidDataException;

    /* renamed from: a */
    public abstract List<C6754d> mo41203a(ByteBuffer byteBuffer, boolean z);

    /* renamed from: b */
    public C6762f mo41206b(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        return m54354a(byteBuffer, this.f34720a);
    }

    /* renamed from: b */
    public abstract C12045a mo41207b();

    /* renamed from: d */
    public abstract void mo41209d();

    /* renamed from: c */
    public C6741b mo41208c() {
        return this.f34720a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo41205a(C6762f fVar) {
        return fVar.mo27015b(C6610c.f18385G).equalsIgnoreCase("websocket") && fVar.mo27015b("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    /* renamed from: a */
    public List<C6754d> mo41198a(C6755a aVar, ByteBuffer byteBuffer, boolean z) {
        if (aVar != C6755a.BINARY) {
            C6755a aVar2 = C6755a.TEXT;
            if (!(aVar == aVar2 || aVar == aVar2)) {
                throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
            }
        }
        if (this.f34721b != null) {
            this.f34721b = C6755a.CONTINUOUS;
        } else {
            this.f34721b = aVar;
        }
        C6756e eVar = new C6756e(this.f34721b);
        try {
            eVar.mo26996a(byteBuffer);
            eVar.mo27001b(z);
            if (z) {
                this.f34721b = null;
            } else {
                this.f34721b = aVar;
            }
            return Collections.singletonList(eVar);
        } catch (InvalidDataException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public List<ByteBuffer> mo41199a(C6762f fVar, C6741b bVar) {
        return mo41200a(fVar, bVar, true);
    }

    /* renamed from: a */
    public List<ByteBuffer> mo41200a(C6762f fVar, C6741b bVar, boolean z) {
        int i;
        StringBuilder sb = new StringBuilder(100);
        if (fVar instanceof C6757a) {
            sb.append("GET ");
            sb.append(((C6757a) fVar).mo27006a());
            sb.append(" HTTP/1.1");
        } else if (fVar instanceof C6764h) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("HTTP/1.1 101 ");
            sb2.append(((C6764h) fVar).mo27012d());
            sb.append(sb2.toString());
        } else {
            throw new RuntimeException("unknow role");
        }
        String str = "\r\n";
        sb.append(str);
        Iterator b = fVar.mo27016b();
        while (b.hasNext()) {
            String str2 = (String) b.next();
            String b2 = fVar.mo27015b(str2);
            sb.append(str2);
            sb.append(": ");
            sb.append(b2);
            sb.append(str);
        }
        sb.append(str);
        byte[] a = C6776b.m32431a(sb.toString());
        byte[] content = z ? fVar.getContent() : null;
        if (content == null) {
            i = 0;
        } else {
            i = content.length;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i + a.length);
        allocate.put(a);
        if (content != null) {
            allocate.put(content);
        }
        allocate.flip();
        return Collections.singletonList(allocate);
    }

    /* renamed from: a */
    public int mo41191a(int i) throws LimitExedeedException, InvalidDataException {
        if (i >= 0) {
            return i;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    /* renamed from: a */
    public void mo41204a(C6741b bVar) {
        this.f34720a = bVar;
    }
}
