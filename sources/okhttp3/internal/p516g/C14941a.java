package okhttp3.internal.p516g;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.C14910b;
import okhttp3.internal.C14913c;
import org.apache.http.p549j0.C15430e;
import p076c.p112d.p148d.p279f.C6610c;
import p212io.fabric.sdk.android.services.network.HttpRequest;
import p468g.C13813c0;
import p468g.C13813c0.C13814a;
import p468g.C13817d0;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13826f0;
import p468g.C13851m;
import p468g.C13853n;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p468g.C13872x;
import p470h.C13883a0;
import p470h.C13902l;
import p470h.C13906p;

/* renamed from: okhttp3.internal.g.a */
/* compiled from: BridgeInterceptor */
public final class C14941a implements C13870w {

    /* renamed from: a */
    private final C13853n f43329a;

    public C14941a(C13853n nVar) {
        this.f43329a = nVar;
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        C13813c0 request = aVar.request();
        C13814a f = request.mo43357f();
        C13817d0 a = request.mo43349a();
        String str = "Content-Type";
        String str2 = "Content-Length";
        if (a != null) {
            C13872x contentType = a.contentType();
            if (contentType != null) {
                f.mo43375b(str, contentType.toString());
            }
            long contentLength = a.contentLength();
            String str3 = "Transfer-Encoding";
            if (contentLength != -1) {
                f.mo43375b(str2, Long.toString(contentLength));
                f.mo43367a(str3);
            } else {
                f.mo43375b(str3, C15430e.f44591r);
                f.mo43367a(str2);
            }
        }
        String str4 = "Host";
        boolean z = false;
        if (request.mo43351a(str4) == null) {
            f.mo43375b(str4, C14910b.m66043a(request.mo43359h(), false));
        }
        String str5 = "Connection";
        if (request.mo43351a(str5) == null) {
            f.mo43375b(str5, C15430e.f44590q);
        }
        String str6 = "Accept-Encoding";
        String a2 = request.mo43351a(str6);
        String str7 = HttpRequest.f42459o;
        if (a2 == null && request.mo43351a(C6610c.f18382D) == null) {
            z = true;
            f.mo43375b(str6, str7);
        }
        List a3 = this.f43329a.mo43555a(request.mo43359h());
        if (!a3.isEmpty()) {
            f.mo43375b("Cookie", m66210a(a3));
        }
        String str8 = "User-Agent";
        if (request.mo43351a(str8) == null) {
            f.mo43375b(str8, C14913c.m66075a());
        }
        C13823e0 a4 = aVar.mo43698a(f.mo43371a());
        C14947e.m66232a(this.f43329a, request.mo43359h(), a4.mo43427i());
        C13824a a5 = a4.mo43410I().mo43432a(request);
        if (z) {
            String str9 = "Content-Encoding";
            if (str7.equalsIgnoreCase(a4.mo43419b(str9)) && C14947e.m66237b(a4)) {
                C13902l lVar = new C13902l(a4.mo43416a().source());
                a5.mo43436a(a4.mo43427i().mo43616c().mo43633d(str9).mo43633d(str2).mo43627a());
                a5.mo43434a((C13826f0) new C14950h(a4.mo43419b(str), -1, C13906p.m59739a((C13883a0) lVar)));
            }
        }
        return a5.mo43439a();
    }

    /* renamed from: a */
    private String m66210a(List<C13851m> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C13851m mVar = (C13851m) list.get(i);
            sb.append(mVar.mo43538e());
            sb.append('=');
            sb.append(mVar.mo43544i());
        }
        return sb.toString();
    }
}
