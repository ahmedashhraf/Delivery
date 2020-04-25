package p076c.p284e.p285a.p287k;

import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p290n.C6776b;

/* renamed from: c.e.a.k.e */
/* compiled from: FramedataImpl1 */
public class C6756e implements C6753c {

    /* renamed from: t */
    protected static byte[] f18788t = new byte[0];

    /* renamed from: p */
    protected boolean f18789p;

    /* renamed from: q */
    protected C6755a f18790q;

    /* renamed from: r */
    private ByteBuffer f18791r;

    /* renamed from: s */
    protected boolean f18792s;

    public C6756e() {
    }

    /* renamed from: a */
    public boolean mo27003a() {
        return this.f18792s;
    }

    /* renamed from: b */
    public C6755a mo27004b() {
        return this.f18790q;
    }

    /* renamed from: c */
    public boolean mo27005c() {
        return this.f18789p;
    }

    /* renamed from: d */
    public ByteBuffer mo26997d() {
        return this.f18791r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(mo27004b());
        sb.append(", fin:");
        sb.append(mo27005c());
        sb.append(", payloadlength:[pos:");
        sb.append(this.f18791r.position());
        sb.append(", len:");
        sb.append(this.f18791r.remaining());
        sb.append("], payload:");
        sb.append(Arrays.toString(C6776b.m32433b(new String(this.f18791r.array()))));
        sb.append("}");
        return sb.toString();
    }

    public C6756e(C6755a aVar) {
        this.f18790q = aVar;
        this.f18791r = ByteBuffer.wrap(f18788t);
    }

    /* renamed from: a */
    public void mo26999a(C6755a aVar) {
        this.f18790q = aVar;
    }

    /* renamed from: b */
    public void mo27001b(boolean z) {
        this.f18789p = z;
    }

    /* renamed from: a */
    public void mo26996a(ByteBuffer byteBuffer) throws InvalidDataException {
        this.f18791r = byteBuffer;
    }

    /* renamed from: a */
    public void mo27000a(boolean z) {
        this.f18792s = z;
    }

    public C6756e(C6754d dVar) {
        this.f18789p = dVar.mo27005c();
        this.f18790q = dVar.mo27004b();
        this.f18791r = dVar.mo26997d();
        this.f18792s = dVar.mo27003a();
    }

    /* renamed from: a */
    public void mo27002a(C6754d dVar) throws InvalidFrameException {
        ByteBuffer d = dVar.mo26997d();
        if (this.f18791r == null) {
            this.f18791r = ByteBuffer.allocate(d.remaining());
            d.mark();
            this.f18791r.put(d);
            d.reset();
        } else {
            d.mark();
            ByteBuffer byteBuffer = this.f18791r;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f18791r;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (d.remaining() > this.f18791r.remaining()) {
                ByteBuffer allocate = ByteBuffer.allocate(d.remaining() + this.f18791r.capacity());
                this.f18791r.flip();
                allocate.put(this.f18791r);
                allocate.put(d);
                this.f18791r = allocate;
            } else {
                this.f18791r.put(d);
            }
            this.f18791r.rewind();
            d.reset();
        }
        this.f18789p = dVar.mo27005c();
    }
}
