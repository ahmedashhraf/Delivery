package p076c.p112d.p134b.p135a.p143g;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: c.d.b.a.g.a0 */
/* compiled from: LoggingStreamingContent */
public final class C6361a0 implements C6397m0 {

    /* renamed from: a */
    private final C6397m0 f17772a;

    /* renamed from: b */
    private final int f17773b;

    /* renamed from: c */
    private final Level f17774c;

    /* renamed from: d */
    private final Logger f17775d;

    public C6361a0(C6397m0 m0Var, Logger logger, Level level, int i) {
        this.f17772a = m0Var;
        this.f17775d = logger;
        this.f17774c = level;
        this.f17773b = i;
    }

    /* JADX INFO: finally extract failed */
    public void writeTo(OutputStream outputStream) throws IOException {
        C6439z zVar = new C6439z(outputStream, this.f17775d, this.f17774c, this.f17773b);
        try {
            this.f17772a.writeTo(zVar);
            zVar.mo25885a().close();
            outputStream.flush();
        } catch (Throwable th) {
            zVar.mo25885a().close();
            throw th;
        }
    }
}
