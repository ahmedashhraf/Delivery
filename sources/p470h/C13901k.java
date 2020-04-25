package p470h;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* renamed from: h.k */
/* compiled from: GzipSink */
public final class C13901k implements C13924z {

    /* renamed from: N */
    private final C13897g f40361N;

    /* renamed from: O */
    private boolean f40362O;

    /* renamed from: P */
    private final CRC32 f40363P = new CRC32();

    /* renamed from: a */
    private final C13892d f40364a;

    /* renamed from: b */
    private final Deflater f40365b;

    public C13901k(C13924z zVar) {
        if (zVar != null) {
            this.f40365b = new Deflater(-1, true);
            this.f40364a = C13906p.m59738a(zVar);
            this.f40361N = new C13897g(this.f40364a, this.f40365b);
            m59712d();
            return;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: c */
    private void m59711c() throws IOException {
        this.f40364a.mo43873c((int) this.f40363P.getValue());
        this.f40364a.mo43873c((int) this.f40365b.getBytesRead());
    }

    /* renamed from: d */
    private void m59712d() {
        C13887c b = this.f40364a.mo43867b();
        b.writeShort(8075);
        b.writeByte(8);
        b.writeByte(0);
        b.writeInt(0);
        b.writeByte(0);
        b.writeByte(0);
    }

    /* renamed from: a */
    public final Deflater mo43999a() {
        return this.f40365b;
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j != 0) {
            m59710a(cVar, j);
            this.f40361N.mo43815b(cVar, j);
        }
    }

    public void close() throws IOException {
        if (!this.f40362O) {
            Throwable th = null;
            try {
                this.f40361N.mo43991a();
                m59711c();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f40365b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f40364a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f40362O = true;
            if (th != null) {
                C13893d0.m59607a(th);
            }
        }
    }

    public void flush() throws IOException {
        this.f40361N.flush();
    }

    public C13885b0 timeout() {
        return this.f40364a.timeout();
    }

    /* renamed from: a */
    private void m59710a(C13887c cVar, long j) {
        C13921w wVar = cVar.f40339a;
        while (j > 0) {
            int min = (int) Math.min(j, (long) (wVar.f40428c - wVar.f40427b));
            this.f40363P.update(wVar.f40426a, wVar.f40427b, min);
            j -= (long) min;
            wVar = wVar.f40431f;
        }
    }
}
