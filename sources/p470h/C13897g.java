package p470h;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: h.g */
/* compiled from: DeflaterSink */
public final class C13897g implements C13924z {

    /* renamed from: N */
    private boolean f40356N;

    /* renamed from: a */
    private final C13892d f40357a;

    /* renamed from: b */
    private final Deflater f40358b;

    public C13897g(C13924z zVar, Deflater deflater) {
        this(C13906p.m59738a(zVar), deflater);
    }

    @IgnoreJRERequirement
    /* renamed from: a */
    private void m59695a(boolean z) throws IOException {
        C13921w e;
        int i;
        C13887c b = this.f40357a.mo43867b();
        while (true) {
            e = b.mo43883e(1);
            if (z) {
                Deflater deflater = this.f40358b;
                byte[] bArr = e.f40426a;
                int i2 = e.f40428c;
                i = deflater.deflate(bArr, i2, 8192 - i2, 2);
            } else {
                Deflater deflater2 = this.f40358b;
                byte[] bArr2 = e.f40426a;
                int i3 = e.f40428c;
                i = deflater2.deflate(bArr2, i3, 8192 - i3);
            }
            if (i > 0) {
                e.f40428c += i;
                b.f40340b += (long) i;
                this.f40357a.mo43901m();
            } else if (this.f40358b.needsInput()) {
                break;
            }
        }
        if (e.f40427b == e.f40428c) {
            b.f40339a = e.mo44032b();
            C13922x.m59827a(e);
        }
    }

    /* renamed from: b */
    public void mo43815b(C13887c cVar, long j) throws IOException {
        C13893d0.m59606a(cVar.f40340b, 0, j);
        while (j > 0) {
            C13921w wVar = cVar.f40339a;
            int min = (int) Math.min(j, (long) (wVar.f40428c - wVar.f40427b));
            this.f40358b.setInput(wVar.f40426a, wVar.f40427b, min);
            m59695a(false);
            long j2 = (long) min;
            cVar.f40340b -= j2;
            wVar.f40427b += min;
            if (wVar.f40427b == wVar.f40428c) {
                cVar.f40339a = wVar.mo44032b();
                C13922x.m59827a(wVar);
            }
            j -= j2;
        }
    }

    public void close() throws IOException {
        if (!this.f40356N) {
            Throwable th = null;
            try {
                mo43991a();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f40358b.end();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            try {
                this.f40357a.close();
            } catch (Throwable th4) {
                if (th == null) {
                    th = th4;
                }
            }
            this.f40356N = true;
            if (th != null) {
                C13893d0.m59607a(th);
            }
        }
    }

    public void flush() throws IOException {
        m59695a(true);
        this.f40357a.flush();
    }

    public C13885b0 timeout() {
        return this.f40357a.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeflaterSink(");
        sb.append(this.f40357a);
        sb.append(")");
        return sb.toString();
    }

    C13897g(C13892d dVar, Deflater deflater) {
        if (dVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (deflater != null) {
            this.f40357a = dVar;
            this.f40358b = deflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo43991a() throws IOException {
        this.f40358b.finish();
        m59695a(false);
    }
}
