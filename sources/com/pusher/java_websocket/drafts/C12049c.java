package com.pusher.java_websocket.drafts;

import com.pusher.java_websocket.drafts.Draft.C12045a;
import com.pusher.java_websocket.drafts.Draft.HandshakeState;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidFrameException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import com.pusher.java_websocket.exceptions.LimitExedeedException;
import com.pusher.java_websocket.exceptions.NotSendableException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import p076c.p112d.p148d.p279f.C6610c;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p287k.C6756e;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6759c;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p288l.C6765i;
import p076c.p284e.p285a.p290n.C6776b;

/* renamed from: com.pusher.java_websocket.drafts.c */
/* compiled from: Draft_75 */
public class C12049c extends Draft {

    /* renamed from: j */
    public static final byte f34728j = 13;

    /* renamed from: k */
    public static final byte f34729k = 10;

    /* renamed from: l */
    public static final byte f34730l = 0;

    /* renamed from: m */
    public static final byte f34731m = -1;

    /* renamed from: f */
    protected boolean f34732f = false;

    /* renamed from: g */
    protected List<C6754d> f34733g = new LinkedList();

    /* renamed from: h */
    protected ByteBuffer f34734h;

    /* renamed from: i */
    private final Random f34735i = new Random();

    /* renamed from: a */
    public HandshakeState mo41195a(C6757a aVar, C6764h hVar) {
        return (!aVar.mo27015b("WebSocket-Origin").equals(hVar.mo27015b(C6610c.f18378B)) || !mo41205a((C6762f) hVar)) ? HandshakeState.NOT_MATCHED : HandshakeState.MATCHED;
    }

    /* renamed from: b */
    public C12045a mo41207b() {
        return C12045a.NONE;
    }

    /* renamed from: d */
    public void mo41209d() {
        this.f34732f = false;
        this.f34734h = null;
    }

    /* renamed from: e */
    public ByteBuffer mo41212e() {
        return ByteBuffer.allocate(Draft.f34718d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public List<C6754d> mo41214f(ByteBuffer byteBuffer) throws InvalidDataException {
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b == 0) {
                if (!this.f34732f) {
                    this.f34732f = true;
                } else {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
            } else if (b == -1) {
                if (this.f34732f) {
                    ByteBuffer byteBuffer2 = this.f34734h;
                    if (byteBuffer2 != null) {
                        byteBuffer2.flip();
                        C6756e eVar = new C6756e();
                        eVar.mo26996a(this.f34734h);
                        eVar.mo27001b(true);
                        eVar.mo26999a(C6755a.TEXT);
                        this.f34733g.add(eVar);
                        this.f34734h = null;
                        byteBuffer.mark();
                    }
                    this.f34732f = false;
                } else {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
            } else if (!this.f34732f) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.f34734h;
                if (byteBuffer3 == null) {
                    this.f34734h = mo41212e();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.f34734h = mo41213e(this.f34734h);
                }
                this.f34734h.put(b);
            }
        }
        List<C6754d> list = this.f34733g;
        this.f34733g = new LinkedList();
        return list;
    }

    /* renamed from: a */
    public HandshakeState mo41194a(C6757a aVar) {
        if (!aVar.mo27014a(C6610c.f18378B) || !mo41205a((C6762f) aVar)) {
            return HandshakeState.NOT_MATCHED;
        }
        return HandshakeState.MATCHED;
    }

    /* renamed from: e */
    public ByteBuffer mo41213e(ByteBuffer byteBuffer) throws LimitExedeedException, InvalidDataException {
        byteBuffer.flip();
        ByteBuffer allocate = ByteBuffer.allocate(mo41191a(byteBuffer.capacity() * 2));
        allocate.put(byteBuffer);
        return allocate;
    }

    /* renamed from: a */
    public ByteBuffer mo41197a(C6754d dVar) {
        if (dVar.mo27004b() == C6755a.TEXT) {
            ByteBuffer d = dVar.mo26997d();
            ByteBuffer allocate = ByteBuffer.allocate(d.remaining() + 2);
            allocate.put(0);
            d.mark();
            allocate.put(d);
            d.reset();
            allocate.put(-1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    /* renamed from: a */
    public List<C6754d> mo41203a(ByteBuffer byteBuffer, boolean z) {
        throw new RuntimeException("not yet implemented");
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
    public C6758b mo41192a(C6758b bVar) throws InvalidHandshakeException {
        String str = C6610c.f18385G;
        bVar.mo27008a(str, "WebSocket");
        bVar.mo27008a("Connection", str);
        String str2 = C6610c.f18378B;
        if (!bVar.mo27014a(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("random");
            sb.append(this.f34735i.nextInt());
            bVar.mo27008a(str2, sb.toString());
        }
        return bVar;
    }

    /* renamed from: a */
    public C6759c mo41193a(C6757a aVar, C6765i iVar) throws InvalidHandshakeException {
        iVar.mo27013d("Web Socket Protocol Handshake");
        iVar.mo27008a(C6610c.f18385G, "WebSocket");
        String str = "Connection";
        iVar.mo27008a(str, aVar.mo27015b(str));
        iVar.mo27008a("WebSocket-Origin", aVar.mo27015b(C6610c.f18378B));
        StringBuilder sb = new StringBuilder();
        sb.append("ws://");
        sb.append(aVar.mo27015b("Host"));
        sb.append(aVar.mo27006a());
        iVar.mo27008a("WebSocket-Location", sb.toString());
        return iVar;
    }

    /* renamed from: a */
    public List<C6754d> mo41202a(ByteBuffer byteBuffer) throws InvalidDataException {
        List<C6754d> f = mo41214f(byteBuffer);
        if (f != null) {
            return f;
        }
        throw new InvalidDataException(1002);
    }

    /* renamed from: a */
    public Draft mo41196a() {
        return new C12049c();
    }
}
