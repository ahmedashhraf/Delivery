package p468g.p469k0;

import com.fasterxml.jackson.core.p162w.C3868i;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p519j.C15011f;
import org.apache.http.p549j0.C15430e;
import p468g.C13813c0;
import p468g.C13817d0;
import p468g.C13823e0;
import p468g.C13826f0;
import p468g.C13839j;
import p468g.C13866u;
import p468g.C13870w;
import p468g.C13870w.C13871a;
import p468g.C13872x;
import p470h.C13887c;
import p470h.C13894e;

/* renamed from: g.k0.a */
/* compiled from: HttpLoggingInterceptor */
public final class C13843a implements C13870w {

    /* renamed from: c */
    private static final Charset f40142c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C13845b f40143a;

    /* renamed from: b */
    private volatile C13844a f40144b;

    /* renamed from: g.k0.a$a */
    /* compiled from: HttpLoggingInterceptor */
    public enum C13844a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* renamed from: g.k0.a$b */
    /* compiled from: HttpLoggingInterceptor */
    public interface C13845b {

        /* renamed from: a */
        public static final C13845b f40145a = new C13846a();

        /* renamed from: g.k0.a$b$a */
        /* compiled from: HttpLoggingInterceptor */
        class C13846a implements C13845b {
            C13846a() {
            }

            /* renamed from: a */
            public void mo43514a(String str) {
                C15011f.m66571d().mo46615a(4, str, (Throwable) null);
            }
        }

        /* renamed from: a */
        void mo43514a(String str);
    }

    public C13843a() {
        this(C13845b.f40145a);
    }

    /* renamed from: a */
    public C13843a mo43513a(C13844a aVar) {
        if (aVar != null) {
            this.f40144b = aVar;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    public C13843a(C13845b bVar) {
        this.f40144b = C13844a.NONE;
        this.f40143a = bVar;
    }

    /* renamed from: a */
    public C13844a mo43512a() {
        return this.f40144b;
    }

    /* renamed from: a */
    public C13823e0 mo23463a(C13871a aVar) throws IOException {
        String str;
        boolean z;
        String str2;
        long j;
        String str3;
        char c;
        String str4;
        boolean z2;
        C13871a aVar2 = aVar;
        C13844a aVar3 = this.f40144b;
        C13813c0 request = aVar.request();
        if (aVar3 == C13844a.NONE) {
            return aVar2.mo43698a(request);
        }
        boolean z3 = true;
        boolean z4 = aVar3 == C13844a.BODY;
        boolean z5 = z4 || aVar3 == C13844a.HEADERS;
        C13817d0 a = request.mo43349a();
        if (a == null) {
            z3 = false;
        }
        C13839j c2 = aVar.mo43702c();
        StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(request.mo43356e());
        sb.append(' ');
        sb.append(request.mo43359h());
        String str5 = "";
        if (c2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C3868i.f12248b);
            sb2.append(c2.mo43493a());
            str = sb2.toString();
        } else {
            str = str5;
        }
        sb.append(str);
        String sb3 = sb.toString();
        String str6 = "-byte body)";
        String str7 = " (";
        if (!z5 && z3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append(str7);
            sb4.append(a.contentLength());
            sb4.append(str6);
            sb3 = sb4.toString();
        }
        this.f40143a.mo43514a(sb3);
        String str8 = "-byte body omitted)";
        String str9 = ": ";
        if (z5) {
            if (z3) {
                if (a.contentType() != null) {
                    C13845b bVar = this.f40143a;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Content-Type: ");
                    sb5.append(a.contentType());
                    bVar.mo43514a(sb5.toString());
                }
                if (a.contentLength() != -1) {
                    C13845b bVar2 = this.f40143a;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Content-Length: ");
                    sb6.append(a.contentLength());
                    bVar2.mo43514a(sb6.toString());
                }
            }
            C13866u c3 = request.mo43354c();
            int d = c3.mo43618d();
            int i = 0;
            while (i < d) {
                String a2 = c3.mo43611a(i);
                int i2 = d;
                if ("Content-Type".equalsIgnoreCase(a2) || "Content-Length".equalsIgnoreCase(a2)) {
                    z2 = z5;
                } else {
                    C13845b bVar3 = this.f40143a;
                    z2 = z5;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(a2);
                    sb7.append(str9);
                    sb7.append(c3.mo43613b(i));
                    bVar3.mo43514a(sb7.toString());
                }
                i++;
                d = i2;
                z5 = z2;
            }
            z = z5;
            String str10 = "--> END ";
            if (!z4 || !z3) {
                C13845b bVar4 = this.f40143a;
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str10);
                sb8.append(request.mo43356e());
                bVar4.mo43514a(sb8.toString());
            } else if (m59121a(request.mo43354c())) {
                C13845b bVar5 = this.f40143a;
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str10);
                sb9.append(request.mo43356e());
                sb9.append(" (encoded body omitted)");
                bVar5.mo43514a(sb9.toString());
            } else {
                C13887c cVar = new C13887c();
                a.writeTo(cVar);
                Charset charset = f40142c;
                C13872x contentType = a.contentType();
                if (contentType != null) {
                    charset = contentType.mo43708a(f40142c);
                }
                this.f40143a.mo43514a(str5);
                if (m59122a(cVar)) {
                    this.f40143a.mo43514a(cVar.mo43860a(charset));
                    C13845b bVar6 = this.f40143a;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(str10);
                    sb10.append(request.mo43356e());
                    sb10.append(str7);
                    sb10.append(a.contentLength());
                    sb10.append(str6);
                    bVar6.mo43514a(sb10.toString());
                } else {
                    C13845b bVar7 = this.f40143a;
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str10);
                    sb11.append(request.mo43356e());
                    sb11.append(" (binary ");
                    sb11.append(a.contentLength());
                    sb11.append(str8);
                    bVar7.mo43514a(sb11.toString());
                }
            }
        } else {
            z = z5;
        }
        long nanoTime = System.nanoTime();
        try {
            C13823e0 a3 = aVar2.mo43698a(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            C13826f0 a4 = a3.mo43416a();
            long contentLength = a4.contentLength();
            if (contentLength != -1) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(contentLength);
                sb12.append("-byte");
                str2 = sb12.toString();
            } else {
                str2 = "unknown-length";
            }
            C13845b bVar8 = this.f40143a;
            StringBuilder sb13 = new StringBuilder();
            String str11 = str6;
            sb13.append("<-- ");
            sb13.append(a3.mo43425g());
            if (a3.mo43408G().isEmpty()) {
                j = contentLength;
                str3 = str5;
                c = ' ';
            } else {
                StringBuilder sb14 = new StringBuilder();
                j = contentLength;
                c = ' ';
                sb14.append(' ');
                sb14.append(a3.mo43408G());
                str3 = sb14.toString();
            }
            sb13.append(str3);
            sb13.append(c);
            sb13.append(a3.mo43414M().mo43359h());
            sb13.append(str7);
            sb13.append(millis);
            sb13.append("ms");
            if (!z) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(", ");
                sb15.append(str2);
                sb15.append(" body");
                str4 = sb15.toString();
            } else {
                str4 = str5;
            }
            sb13.append(str4);
            sb13.append(')');
            bVar8.mo43514a(sb13.toString());
            if (z) {
                C13866u i3 = a3.mo43427i();
                int d2 = i3.mo43618d();
                for (int i4 = 0; i4 < d2; i4++) {
                    C13845b bVar9 = this.f40143a;
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(i3.mo43611a(i4));
                    sb16.append(str9);
                    sb16.append(i3.mo43613b(i4));
                    bVar9.mo43514a(sb16.toString());
                }
                if (!z4 || !C14947e.m66237b(a3)) {
                    this.f40143a.mo43514a("<-- END HTTP");
                } else if (m59121a(a3.mo43427i())) {
                    this.f40143a.mo43514a("<-- END HTTP (encoded body omitted)");
                } else {
                    C13894e source = a4.source();
                    source.mo43874c(Long.MAX_VALUE);
                    C13887c b = source.mo43867b();
                    Charset charset2 = f40142c;
                    C13872x contentType2 = a4.contentType();
                    if (contentType2 != null) {
                        charset2 = contentType2.mo43708a(f40142c);
                    }
                    if (!m59122a(b)) {
                        this.f40143a.mo43514a(str5);
                        C13845b bVar10 = this.f40143a;
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("<-- END HTTP (binary ");
                        sb17.append(b.size());
                        sb17.append(str8);
                        bVar10.mo43514a(sb17.toString());
                        return a3;
                    }
                    if (j != 0) {
                        this.f40143a.mo43514a(str5);
                        this.f40143a.mo43514a(b.clone().mo43860a(charset2));
                    }
                    C13845b bVar11 = this.f40143a;
                    StringBuilder sb18 = new StringBuilder();
                    sb18.append("<-- END HTTP (");
                    sb18.append(b.size());
                    sb18.append(str11);
                    bVar11.mo43514a(sb18.toString());
                }
            }
            return a3;
        } catch (Exception e) {
            Exception exc = e;
            C13845b bVar12 = this.f40143a;
            StringBuilder sb19 = new StringBuilder();
            sb19.append("<-- HTTP FAILED: ");
            sb19.append(exc);
            bVar12.mo43514a(sb19.toString());
            throw exc;
        }
    }

    /* renamed from: a */
    static boolean m59122a(C13887c cVar) {
        try {
            C13887c cVar2 = new C13887c();
            cVar.mo43846a(cVar2, 0, cVar.size() < 64 ? cVar.size() : 64);
            int i = 0;
            while (true) {
                if (i >= 16) {
                    break;
                } else if (cVar2.mo43904p()) {
                    break;
                } else {
                    int s = cVar2.mo43916s();
                    if (Character.isISOControl(s) && !Character.isWhitespace(s)) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m59121a(C13866u uVar) {
        String a = uVar.mo43612a("Content-Encoding");
        return a != null && !a.equalsIgnoreCase(C15430e.f44592s);
    }
}
