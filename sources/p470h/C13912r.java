package p470h;

import com.mrsool.utils.C11644i;
import java.io.IOException;

/* renamed from: h.r */
/* compiled from: PeekSource */
final class C13912r implements C13883a0 {

    /* renamed from: N */
    private C13921w f40395N = this.f40400b.f40339a;

    /* renamed from: O */
    private int f40396O;

    /* renamed from: P */
    private boolean f40397P;

    /* renamed from: Q */
    private long f40398Q;

    /* renamed from: a */
    private final C13894e f40399a;

    /* renamed from: b */
    private final C13887c f40400b;

    C13912r(C13894e eVar) {
        this.f40399a = eVar;
        this.f40400b = eVar.mo43867b();
        C13921w wVar = this.f40395N;
        this.f40396O = wVar != null ? wVar.f40427b : -1;
    }

    public void close() throws IOException {
        this.f40397P = true;
    }

    public long read(C13887c cVar, long j) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f40397P) {
            C13921w wVar = this.f40395N;
            if (wVar != null) {
                C13921w wVar2 = this.f40400b.f40339a;
                if (!(wVar == wVar2 && this.f40396O == wVar2.f40427b)) {
                    throw new IllegalStateException("Peek source is invalid because upstream source was used");
                }
            }
            if (j == 0) {
                return 0;
            }
            if (!this.f40399a.mo43874c(this.f40398Q + 1)) {
                return -1;
            }
            if (this.f40395N == null) {
                C13921w wVar3 = this.f40400b.f40339a;
                if (wVar3 != null) {
                    this.f40395N = wVar3;
                    this.f40396O = wVar3.f40427b;
                }
            }
            long min = Math.min(j, this.f40400b.f40340b - this.f40398Q);
            this.f40400b.mo43846a(cVar, this.f40398Q, min);
            this.f40398Q += min;
            return min;
        } else {
            throw new IllegalStateException(C11644i.f33433v3);
        }
    }

    public C13885b0 timeout() {
        return this.f40399a.timeout();
    }
}
