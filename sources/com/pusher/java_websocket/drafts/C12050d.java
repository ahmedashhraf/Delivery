package com.pusher.java_websocket.drafts;

import com.fasterxml.jackson.core.p162w.C3868i;
import com.pusher.java_websocket.drafts.Draft.C12045a;
import com.pusher.java_websocket.drafts.Draft.HandshakeState;
import com.pusher.java_websocket.exceptions.IncompleteHandshakeException;
import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidFrameException;
import com.pusher.java_websocket.exceptions.InvalidHandshakeException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import org.jivesoftware.smack.util.StringUtils;
import p076c.p112d.p148d.p279f.C6610c;
import p076c.p284e.p285a.C6739d.C6741b;
import p076c.p284e.p285a.p287k.C6752b;
import p076c.p284e.p285a.p287k.C6754d;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p288l.C6757a;
import p076c.p284e.p285a.p288l.C6758b;
import p076c.p284e.p285a.p288l.C6759c;
import p076c.p284e.p285a.p288l.C6762f;
import p076c.p284e.p285a.p288l.C6764h;
import p076c.p284e.p285a.p288l.C6765i;

/* renamed from: com.pusher.java_websocket.drafts.d */
/* compiled from: Draft_76 */
public class C12050d extends C12049c {

    /* renamed from: p */
    private static final byte[] f34736p = {-1, 0};

    /* renamed from: n */
    private boolean f34737n = false;

    /* renamed from: o */
    private final Random f34738o = new Random();

    /* renamed from: a */
    public static byte[] m54412a(String str, String str2, byte[] bArr) throws InvalidHandshakeException {
        byte[] a = m54411a(str);
        byte[] a2 = m54411a(str2);
        try {
            return MessageDigest.getInstance(StringUtils.MD5).digest(new byte[]{a[0], a[1], a[2], a[3], a2[0], a2[1], a2[2], a2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    private static String m54413f() {
        Random random = new Random();
        long nextInt = (long) (random.nextInt(12) + 1);
        int nextInt2 = random.nextInt(12) + 1;
        String l = Long.toString(((long) (random.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1)) * nextInt);
        for (int i = 0; i < nextInt2; i++) {
            int abs = Math.abs(random.nextInt(l.length()));
            char nextInt3 = (char) (random.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l = new StringBuilder(l).insert(abs, nextInt3).toString();
        }
        for (int i2 = 0; ((long) i2) < nextInt; i2++) {
            l = new StringBuilder(l).insert(Math.abs(random.nextInt(l.length() - 1) + 1), C3868i.f12248b).toString();
        }
        return l;
    }

    /* renamed from: b */
    public C6762f mo41206b(ByteBuffer byteBuffer) throws InvalidHandshakeException {
        C6759c a = Draft.m54354a(byteBuffer, this.f34720a);
        if ((a.mo27014a("Sec-WebSocket-Key1") || this.f34720a == C6741b.CLIENT) && !a.mo27014a("Sec-WebSocket-Version")) {
            byte[] bArr = new byte[(this.f34720a == C6741b.SERVER ? 8 : 16)];
            try {
                byteBuffer.get(bArr);
                a.mo27009a(bArr);
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return a;
    }

    /* renamed from: b */
    public C12045a mo41207b() {
        return C12045a.ONEWAY;
    }

    /* renamed from: a */
    private static byte[] m54411a(String str) throws InvalidHandshakeException {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = (long) (str.split(C3868i.f12248b).length - 1);
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) ((int) (longValue >> 24)), (byte) ((int) ((longValue << 8) >> 24)), (byte) ((int) ((longValue << 16) >> 24)), (byte) ((int) ((longValue << 24) >> 24))};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    /* renamed from: a */
    public HandshakeState mo41195a(C6757a aVar, C6764h hVar) {
        if (this.f34737n) {
            return HandshakeState.NOT_MATCHED;
        }
        try {
            if (hVar.mo27015b("Sec-WebSocket-Origin").equals(aVar.mo27015b(C6610c.f18378B))) {
                if (mo41205a((C6762f) hVar)) {
                    byte[] content = hVar.getContent();
                    if (content == null || content.length == 0) {
                        throw new IncompleteHandshakeException();
                    } else if (Arrays.equals(content, m54412a(aVar.mo27015b("Sec-WebSocket-Key1"), aVar.mo27015b("Sec-WebSocket-Key2"), aVar.getContent()))) {
                        return HandshakeState.MATCHED;
                    } else {
                        return HandshakeState.NOT_MATCHED;
                    }
                }
            }
            return HandshakeState.NOT_MATCHED;
        } catch (InvalidHandshakeException e) {
            throw new RuntimeException("bad handshakerequest", e);
        }
    }

    /* renamed from: a */
    public HandshakeState mo41194a(C6757a aVar) {
        String str = C6610c.f18385G;
        if (!aVar.mo27015b(str).equals("WebSocket") || !aVar.mo27015b("Connection").contains(str) || aVar.mo27015b("Sec-WebSocket-Key1").length() <= 0 || aVar.mo27015b("Sec-WebSocket-Key2").isEmpty() || !aVar.mo27014a(C6610c.f18378B)) {
            return HandshakeState.NOT_MATCHED;
        }
        return HandshakeState.MATCHED;
    }

    /* renamed from: a */
    public C6758b mo41192a(C6758b bVar) {
        String str = C6610c.f18385G;
        bVar.mo27008a(str, "WebSocket");
        bVar.mo27008a("Connection", str);
        bVar.mo27008a("Sec-WebSocket-Key1", m54413f());
        bVar.mo27008a("Sec-WebSocket-Key2", m54413f());
        String str2 = C6610c.f18378B;
        if (!bVar.mo27014a(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("random");
            sb.append(this.f34738o.nextInt());
            bVar.mo27008a(str2, sb.toString());
        }
        byte[] bArr = new byte[8];
        this.f34738o.nextBytes(bArr);
        bVar.mo27009a(bArr);
        return bVar;
    }

    /* renamed from: a */
    public C6759c mo41193a(C6757a aVar, C6765i iVar) throws InvalidHandshakeException {
        iVar.mo27013d("WebSocket Protocol Handshake");
        iVar.mo27008a(C6610c.f18385G, "WebSocket");
        String str = "Connection";
        iVar.mo27008a(str, aVar.mo27015b(str));
        iVar.mo27008a("Sec-WebSocket-Origin", aVar.mo27015b(C6610c.f18378B));
        StringBuilder sb = new StringBuilder();
        sb.append("ws://");
        sb.append(aVar.mo27015b("Host"));
        sb.append(aVar.mo27006a());
        iVar.mo27008a("Sec-WebSocket-Location", sb.toString());
        String b = aVar.mo27015b("Sec-WebSocket-Key1");
        String b2 = aVar.mo27015b("Sec-WebSocket-Key2");
        byte[] content = aVar.getContent();
        if (b == null || b2 == null || content == null || content.length != 8) {
            throw new InvalidHandshakeException("Bad keys");
        }
        iVar.mo27009a(m54412a(b, b2, content));
        return iVar;
    }

    /* renamed from: a */
    public List<C6754d> mo41202a(ByteBuffer byteBuffer) throws InvalidDataException {
        byteBuffer.mark();
        List<C6754d> f = super.mo41214f(byteBuffer);
        if (f != null) {
            return f;
        }
        byteBuffer.reset();
        List<C6754d> list = this.f34733g;
        this.f34732f = true;
        if (this.f34734h == null) {
            this.f34734h = ByteBuffer.allocate(2);
            if (byteBuffer.remaining() <= this.f34734h.remaining()) {
                this.f34734h.put(byteBuffer);
                if (this.f34734h.hasRemaining()) {
                    this.f34733g = new LinkedList();
                    return list;
                } else if (Arrays.equals(this.f34734h.array(), f34736p)) {
                    list.add(new C6752b(1000));
                    return list;
                } else {
                    throw new InvalidFrameException();
                }
            } else {
                throw new InvalidFrameException();
            }
        } else {
            throw new InvalidFrameException();
        }
    }

    /* renamed from: a */
    public ByteBuffer mo41197a(C6754d dVar) {
        if (dVar.mo27004b() == C6755a.CLOSING) {
            return ByteBuffer.wrap(f34736p);
        }
        return super.mo41197a(dVar);
    }

    /* renamed from: a */
    public Draft mo41196a() {
        return new C12050d();
    }
}
