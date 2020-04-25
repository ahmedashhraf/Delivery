package p470h;

import com.mrsool.utils.C11644i;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: h.o */
/* compiled from: InflaterSource */
public final class C13905o implements C13883a0 {

    /* renamed from: N */
    private int f40383N;

    /* renamed from: O */
    private boolean f40384O;

    /* renamed from: a */
    private final C13894e f40385a;

    /* renamed from: b */
    private final Inflater f40386b;

    public C13905o(C13883a0 a0Var, Inflater inflater) {
        this(C13906p.m59739a(a0Var), inflater);
    }

    /* renamed from: d */
    private void m59734d() throws IOException {
        int i = this.f40383N;
        if (i != 0) {
            int remaining = i - this.f40386b.getRemaining();
            this.f40383N -= remaining;
            this.f40385a.skip((long) remaining);
        }
    }

    /* renamed from: a */
    public final boolean mo44002a() throws IOException {
        if (!this.f40386b.needsInput()) {
            return false;
        }
        m59734d();
        if (this.f40386b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f40385a.mo43904p()) {
            return true;
        } else {
            C13921w wVar = this.f40385a.mo43867b().f40339a;
            int i = wVar.f40428c;
            int i2 = wVar.f40427b;
            this.f40383N = i - i2;
            this.f40386b.setInput(wVar.f40426a, i2, this.f40383N);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f40384O) {
            this.f40386b.end();
            this.f40384O = true;
            this.f40385a.close();
        }
    }

    public long read(C13887c cVar, long j) throws IOException {
        C13921w e;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f40384O) {
            throw new IllegalStateException(C11644i.f33433v3);
        } else if (j == 0) {
            return 0;
        } else {
            while (true) {
                boolean a = mo44002a();
                try {
                    e = cVar.mo43883e(1);
                    int inflate = this.f40386b.inflate(e.f40426a, e.f40428c, (int) Math.min(j, (long) (8192 - e.f40428c)));
                    if (inflate > 0) {
                        e.f40428c += inflate;
                        long j2 = (long) inflate;
                        cVar.f40340b += j2;
                        return j2;
                    } else if (this.f40386b.finished()) {
                        break;
                    } else if (this.f40386b.needsDictionary()) {
                        break;
                    } else if (a) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            m59734d();
            if (e.f40427b == e.f40428c) {
                cVar.f40339a = e.mo44032b();
                C13922x.m59827a(e);
            }
            return -1;
        }
    }

    public C13885b0 timeout() {
        return this.f40385a.timeout();
    }

    C13905o(C13894e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f40385a = eVar;
            this.f40386b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }
}
