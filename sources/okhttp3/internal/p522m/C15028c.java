package okhttp3.internal.p522m;

import com.google.common.base.C5785c;
import com.mrsool.utils.C11644i;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import p470h.C13887c;
import p470h.C13887c.C13890c;
import p470h.C13894e;
import p470h.C13896f;

/* renamed from: okhttp3.internal.m.c */
/* compiled from: WebSocketReader */
final class C15028c {

    /* renamed from: a */
    final boolean f43716a;

    /* renamed from: b */
    final C13894e f43717b;

    /* renamed from: c */
    final C15029a f43718c;

    /* renamed from: d */
    boolean f43719d;

    /* renamed from: e */
    int f43720e;

    /* renamed from: f */
    long f43721f;

    /* renamed from: g */
    boolean f43722g;

    /* renamed from: h */
    boolean f43723h;

    /* renamed from: i */
    private final C13887c f43724i = new C13887c();

    /* renamed from: j */
    private final C13887c f43725j = new C13887c();

    /* renamed from: k */
    private final byte[] f43726k;

    /* renamed from: l */
    private final C13890c f43727l;

    /* renamed from: okhttp3.internal.m.c$a */
    /* compiled from: WebSocketReader */
    public interface C15029a {
        /* renamed from: b */
        void mo46660b(int i, String str);

        /* renamed from: b */
        void mo46661b(C13896f fVar) throws IOException;

        /* renamed from: b */
        void mo46662b(String str) throws IOException;

        /* renamed from: c */
        void mo46663c(C13896f fVar);

        /* renamed from: d */
        void mo46666d(C13896f fVar);
    }

    C15028c(boolean z, C13894e eVar, C15029a aVar) {
        if (eVar == null) {
            throw new NullPointerException("source == null");
        } else if (aVar != null) {
            this.f43716a = z;
            this.f43717b = eVar;
            this.f43718c = aVar;
            C13890c cVar = null;
            this.f43726k = z ? null : new byte[4];
            if (!z) {
                cVar = new C13890c();
            }
            this.f43727l = cVar;
        } else {
            throw new NullPointerException("frameCallback == null");
        }
    }

    /* renamed from: b */
    private void m66639b() throws IOException {
        String str;
        long j = this.f43721f;
        if (j > 0) {
            this.f43717b.mo43861a(this.f43724i, j);
            if (!this.f43716a) {
                this.f43724i.mo43845a(this.f43727l);
                this.f43727l.mo43947b(0);
                C15027b.m66637a(this.f43727l, this.f43726k);
                this.f43727l.close();
            }
        }
        switch (this.f43720e) {
            case 8:
                short s = 1005;
                long size = this.f43724i.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.f43724i.readShort();
                        str = this.f43724i.mo43923w();
                        String a = C15027b.m66635a((int) s);
                        if (a != null) {
                            throw new ProtocolException(a);
                        }
                    } else {
                        str = "";
                    }
                    this.f43718c.mo46660b(s, str);
                    this.f43719d = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f43718c.mo46663c(this.f43724i.mo43919t());
                return;
            case 10:
                this.f43718c.mo46666d(this.f43724i.mo43919t());
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown control opcode: ");
                sb.append(Integer.toHexString(this.f43720e));
                throw new ProtocolException(sb.toString());
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private void m66640c() throws IOException {
        if (!this.f43719d) {
            long f = this.f43717b.timeout().mo43832f();
            this.f43717b.timeout().mo43827b();
            try {
                byte readByte = this.f43717b.readByte() & 255;
                this.f43717b.timeout().mo43828b(f, TimeUnit.NANOSECONDS);
                this.f43720e = readByte & C5785c.f16698q;
                boolean z = true;
                this.f43722g = (readByte & 128) != 0;
                this.f43723h = (readByte & 8) != 0;
                if (!this.f43723h || this.f43722g) {
                    boolean z2 = (readByte & 64) != 0;
                    boolean z3 = (readByte & 32) != 0;
                    boolean z4 = (readByte & 16) != 0;
                    if (z2 || z3 || z4) {
                        throw new ProtocolException("Reserved flags are unsupported.");
                    }
                    byte readByte2 = this.f43717b.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z = false;
                    }
                    boolean z5 = this.f43716a;
                    if (z == z5) {
                        throw new ProtocolException(z5 ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    this.f43721f = (long) (readByte2 & Byte.MAX_VALUE);
                    long j = this.f43721f;
                    if (j == 126) {
                        this.f43721f = ((long) this.f43717b.readShort()) & 65535;
                    } else if (j == 127) {
                        this.f43721f = this.f43717b.readLong();
                        if (this.f43721f < 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Frame length 0x");
                            sb.append(Long.toHexString(this.f43721f));
                            sb.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    if (this.f43723h && this.f43721f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    } else if (z) {
                        this.f43717b.readFully(this.f43726k);
                    }
                } else {
                    throw new ProtocolException("Control frames must be final.");
                }
            } catch (Throwable th) {
                this.f43717b.timeout().mo43828b(f, TimeUnit.NANOSECONDS);
                throw th;
            }
        } else {
            throw new IOException(C11644i.f33433v3);
        }
    }

    /* renamed from: d */
    private void m66641d() throws IOException {
        while (!this.f43719d) {
            long j = this.f43721f;
            if (j > 0) {
                this.f43717b.mo43861a(this.f43725j, j);
                if (!this.f43716a) {
                    this.f43725j.mo43845a(this.f43727l);
                    this.f43727l.mo43947b(this.f43725j.size() - this.f43721f);
                    C15027b.m66637a(this.f43727l, this.f43726k);
                    this.f43727l.close();
                }
            }
            if (!this.f43722g) {
                m66643f();
                if (this.f43720e != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected continuation opcode. Got: ");
                    sb.append(Integer.toHexString(this.f43720e));
                    throw new ProtocolException(sb.toString());
                }
            } else {
                return;
            }
        }
        throw new IOException(C11644i.f33433v3);
    }

    /* renamed from: e */
    private void m66642e() throws IOException {
        int i = this.f43720e;
        if (i == 1 || i == 2) {
            m66641d();
            if (i == 1) {
                this.f43718c.mo46662b(this.f43725j.mo43923w());
            } else {
                this.f43718c.mo46661b(this.f43725j.mo43919t());
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown opcode: ");
            sb.append(Integer.toHexString(i));
            throw new ProtocolException(sb.toString());
        }
    }

    /* renamed from: f */
    private void m66643f() throws IOException {
        while (!this.f43719d) {
            m66640c();
            if (this.f43723h) {
                m66639b();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46676a() throws IOException {
        m66640c();
        if (this.f43723h) {
            m66639b();
        } else {
            m66642e();
        }
    }
}
