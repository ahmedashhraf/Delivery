package p076c.p284e.p285a.p287k;

import com.pusher.java_websocket.exceptions.InvalidDataException;
import com.pusher.java_websocket.exceptions.InvalidFrameException;
import java.nio.ByteBuffer;
import p076c.p284e.p285a.p287k.C6754d.C6755a;
import p076c.p284e.p285a.p290n.C6776b;

/* renamed from: c.e.a.k.b */
/* compiled from: CloseFrameBuilder */
public class C6752b extends C6756e implements C6751a {

    /* renamed from: w */
    static final ByteBuffer f18785w = ByteBuffer.allocate(0);

    /* renamed from: u */
    private int f18786u;

    /* renamed from: v */
    private String f18787v;

    public C6752b() {
        super(C6755a.CLOSING);
        mo27001b(true);
    }

    /* renamed from: a */
    private void m32287a(int i, String str) throws InvalidDataException {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (i == 1015) {
            str = str2;
            i = 1005;
        }
        if (i != 1005) {
            byte[] b = C6776b.m32433b(str);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.putInt(i);
            allocate.position(2);
            ByteBuffer allocate2 = ByteBuffer.allocate(b.length + 2);
            allocate2.put(allocate);
            allocate2.put(b);
            allocate2.rewind();
            mo26996a(allocate2);
        } else if (str.length() > 0) {
            throw new InvalidDataException(1002, "A close frame must have a closecode if it has a reason");
        }
    }

    /* renamed from: g */
    private void m32288g() throws InvalidFrameException {
        this.f18786u = 1005;
        ByteBuffer d = super.mo26997d();
        d.mark();
        if (d.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(d.getShort());
            allocate.position(0);
            this.f18786u = allocate.getInt();
            int i = this.f18786u;
            if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
                StringBuilder sb = new StringBuilder();
                sb.append("closecode must not be sent over the wire: ");
                sb.append(this.f18786u);
                throw new InvalidFrameException(sb.toString());
            }
        }
        d.reset();
    }

    /* renamed from: h */
    private void m32289h() throws InvalidDataException {
        if (this.f18786u == 1005) {
            this.f18787v = C6776b.m32427a(super.mo26997d());
            return;
        }
        ByteBuffer d = super.mo26997d();
        int position = d.position();
        try {
            d.position(d.position() + 2);
            this.f18787v = C6776b.m32427a(d);
            d.position(position);
        } catch (IllegalArgumentException e) {
            throw new InvalidFrameException((Throwable) e);
        } catch (Throwable th) {
            d.position(position);
            throw th;
        }
    }

    /* renamed from: d */
    public ByteBuffer mo26997d() {
        if (this.f18786u == 1005) {
            return f18785w;
        }
        return super.mo26997d();
    }

    /* renamed from: e */
    public String mo26994e() {
        return this.f18787v;
    }

    /* renamed from: f */
    public int mo26995f() {
        return this.f18786u;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("code: ");
        sb.append(this.f18786u);
        return sb.toString();
    }

    public C6752b(int i) throws InvalidDataException {
        super(C6755a.CLOSING);
        mo27001b(true);
        m32287a(i, "");
    }

    public C6752b(int i, String str) throws InvalidDataException {
        super(C6755a.CLOSING);
        mo27001b(true);
        m32287a(i, str);
    }

    /* renamed from: a */
    public void mo26996a(ByteBuffer byteBuffer) throws InvalidDataException {
        super.mo26996a(byteBuffer);
        m32288g();
        m32289h();
    }
}
