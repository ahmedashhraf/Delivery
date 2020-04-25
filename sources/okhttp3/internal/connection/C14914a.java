package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.internal.p516g.C14949g;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p468g.C13876z;

/* renamed from: okhttp3.internal.connection.a */
/* compiled from: ConnectInterceptor */
public final class C14914a implements C13870w {

    /* renamed from: a */
    public final C13876z f43181a;

    public C14914a(C13876z zVar) {
        this.f43181a = zVar;
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        C14949g gVar = (C14949g) aVar;
        C13813c0 request = gVar.request();
        C14921f g = gVar.mo46466g();
        return gVar.mo46463a(request, g, g.mo46397a(this.f43181a, aVar, !request.mo43356e().equals("GET")), g.mo46403c());
    }
}
