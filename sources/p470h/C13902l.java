package p470h;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: h.l */
/* compiled from: GzipSource */
public final class C13902l implements C13883a0 {

    /* renamed from: Q */
    private static final byte f40366Q = 1;

    /* renamed from: R */
    private static final byte f40367R = 2;

    /* renamed from: S */
    private static final byte f40368S = 3;

    /* renamed from: T */
    private static final byte f40369T = 4;

    /* renamed from: U */
    private static final byte f40370U = 0;

    /* renamed from: V */
    private static final byte f40371V = 1;

    /* renamed from: W */
    private static final byte f40372W = 2;

    /* renamed from: X */
    private static final byte f40373X = 3;

    /* renamed from: N */
    private final Inflater f40374N;

    /* renamed from: O */
    private final C13905o f40375O;

    /* renamed from: P */
    private final CRC32 f40376P = new CRC32();

    /* renamed from: a */
    private int f40377a = 0;

    /* renamed from: b */
    private final C13894e f40378b;

    public C13902l(C13883a0 a0Var) {
        if (a0Var != null) {
            this.f40374N = new Inflater(true);
            this.f40378b = C13906p.m59739a(a0Var);
            this.f40375O = new C13905o(this.f40378b, this.f40374N);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    private void m59715a() throws IOException {
        this.f40378b.mo43899k(10);
        byte a = this.f40378b.mo43867b().mo43836a(3);
        boolean z = ((a >> 1) & 1) == 1;
        if (z) {
            m59716a(this.f40378b.mo43867b(), 0, 10);
        }
        m59717a("ID1ID2", 8075, (int) this.f40378b.readShort());
        this.f40378b.skip(8);
        if (((a >> 2) & 1) == 1) {
            this.f40378b.mo43899k(2);
            if (z) {
                m59716a(this.f40378b.mo43867b(), 0, 2);
            }
            long x = (long) this.f40378b.mo43867b().mo43931x();
            this.f40378b.mo43899k(x);
            if (z) {
                m59716a(this.f40378b.mo43867b(), 0, x);
            }
            this.f40378b.skip(x);
        }
        if (((a >> 3) & 1) == 1) {
            long a2 = this.f40378b.mo43839a(0);
            if (a2 != -1) {
                if (z) {
                    m59716a(this.f40378b.mo43867b(), 0, a2 + 1);
                }
                this.f40378b.skip(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((a >> 4) & 1) == 1) {
            long a3 = this.f40378b.mo43839a(0);
            if (a3 != -1) {
                if (z) {
                    m59716a(this.f40378b.mo43867b(), 0, a3 + 1);
                }
                this.f40378b.skip(a3 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m59717a("FHCRC", (int) this.f40378b.mo43931x(), (int) (short) ((int) this.f40376P.getValue()));
            this.f40376P.reset();
        }
    }

    /* renamed from: d */
    private void m59718d() throws IOException {
        m59717a("CRC", this.f40378b.mo43922v(), (int) this.f40376P.getValue());
        m59717a("ISIZE", this.f40378b.mo43922v(), (int) this.f40374N.getBytesWritten());
    }

    public void close() throws IOException {
        this.f40375O.close();
    }

    public long read(C13887c cVar, long j) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return 0;
        } else {
            if (this.f40377a == 0) {
                m59715a();
                this.f40377a = 1;
            }
            if (this.f40377a == 1) {
                long j2 = cVar.f40340b;
                long read = this.f40375O.read(cVar, j);
                if (read != -1) {
                    m59716a(cVar, j2, read);
                    return read;
                }
                this.f40377a = 2;
            }
            if (this.f40377a == 2) {
                m59718d();
                this.f40377a = 3;
                if (!this.f40378b.mo43904p()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public C13885b0 timeout() {
        return this.f40378b.timeout();
    }

    /* renamed from: a */
    private void m59716a(C13887c cVar, long j, long j2) {
        C13921w wVar = cVar.f40339a;
        while (true) {
            int i = wVar.f40428c;
            int i2 = wVar.f40427b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            wVar = wVar.f40431f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) wVar.f40427b) + j);
            int min = (int) Math.min((long) (wVar.f40428c - i3), j2);
            this.f40376P.update(wVar.f40426a, i3, min);
            j2 -= (long) min;
            wVar = wVar.f40431f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m59717a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
