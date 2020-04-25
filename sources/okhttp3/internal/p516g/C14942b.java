package okhttp3.internal.p516g;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.internal.C14910b;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14921f;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Close;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p470h.C13887c;
import p470h.C13892d;
import p470h.C13898h;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.g.b */
/* compiled from: CallServerInterceptor */
public final class C14942b implements C13870w {

    /* renamed from: a */
    private final boolean f43330a;

    /* renamed from: okhttp3.internal.g.b$a */
    /* compiled from: CallServerInterceptor */
    static final class C14943a extends C13898h {

        /* renamed from: b */
        long f43331b;

        C14943a(C13924z zVar) {
            super(zVar);
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            super.mo43815b(cVar, j);
            this.f43331b += j;
        }
    }

    public C14942b(boolean z) {
        this.f43330a = z;
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        C13823e0 e0Var;
        C14949g gVar = (C14949g) aVar;
        C14944c f = gVar.mo46465f();
        C14921f g = gVar.mo46466g();
        C14916c cVar = (C14916c) gVar.mo43702c();
        C13813c0 request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.mo46464e().mo43589d(gVar.call());
        f.mo46459a(request);
        gVar.mo46464e().mo43575a(gVar.call(), request);
        C13824a aVar2 = null;
        if (C14948f.m66245b(request.mo43356e()) && request.mo43349a() != null) {
            if ("100-continue".equalsIgnoreCase(request.mo43351a("Expect"))) {
                f.mo46460b();
                gVar.mo46464e().mo43591f(gVar.call());
                aVar2 = f.mo46455a(true);
            }
            if (aVar2 == null) {
                gVar.mo46464e().mo43588c(gVar.call());
                C14943a aVar3 = new C14943a(f.mo46457a(request, request.mo43349a().contentLength()));
                C13892d a = C13906p.m59738a((C13924z) aVar3);
                request.mo43349a().writeTo(a);
                a.close();
                gVar.mo46464e().mo43574a(gVar.call(), aVar3.f43331b);
            } else if (!cVar.mo46384f()) {
                g.mo46405e();
            }
        }
        f.mo46458a();
        if (aVar2 == null) {
            gVar.mo46464e().mo43591f(gVar.call());
            aVar2 = f.mo46455a(false);
        }
        C13823e0 a2 = aVar2.mo43432a(request).mo43435a(g.mo46403c().mo43495c()).mo43440b(currentTimeMillis).mo43430a(System.currentTimeMillis()).mo43439a();
        int g2 = a2.mo43425g();
        if (g2 == 100) {
            a2 = f.mo46455a(false).mo43432a(request).mo43435a(g.mo46403c().mo43495c()).mo43440b(currentTimeMillis).mo43430a(System.currentTimeMillis()).mo43439a();
            g2 = a2.mo43425g();
        }
        gVar.mo46464e().mo43576a(gVar.call(), a2);
        if (!this.f43330a || g2 != 101) {
            e0Var = a2.mo43410I().mo43434a(f.mo46456a(a2)).mo43439a();
        } else {
            e0Var = a2.mo43410I().mo43434a(C14910b.f43160c).mo43439a();
        }
        String str = "Connection";
        String a3 = e0Var.mo43414M().mo43351a(str);
        String str2 = Close.ELEMENT;
        if (str2.equalsIgnoreCase(a3) || str2.equalsIgnoreCase(e0Var.mo43419b(str))) {
            g.mo46405e();
        }
        if ((g2 != 204 && g2 != 205) || e0Var.mo43416a().contentLength() <= 0) {
            return e0Var;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(g2);
        sb.append(" had non-zero Content-Length: ");
        sb.append(e0Var.mo43416a().contentLength());
        throw new ProtocolException(sb.toString());
    }
}
