package okhttp3.internal.p516g;

import p201f.p202a.C5952h;
import p468g.C13826f0;
import p468g.C13872x;
import p470h.C13894e;

/* renamed from: okhttp3.internal.g.h */
/* compiled from: RealResponseBody */
public final class C14950h extends C13826f0 {

    /* renamed from: N */
    private final C13894e f43351N;
    @C5952h

    /* renamed from: a */
    private final String f43352a;

    /* renamed from: b */
    private final long f43353b;

    public C14950h(@C5952h String str, long j, C13894e eVar) {
        this.f43352a = str;
        this.f43353b = j;
        this.f43351N = eVar;
    }

    public long contentLength() {
        return this.f43353b;
    }

    public C13872x contentType() {
        String str = this.f43352a;
        if (str != null) {
            return C13872x.m59361b(str);
        }
        return null;
    }

    public C13894e source() {
        return this.f43351N;
    }
}
