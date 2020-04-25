package p076c.p112d.p134b.p135a.p235c.p237d.p238a;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7309x;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p076c.p112d.p134b.p135a.p136d.C6290d;
import p076c.p112d.p134b.p135a.p136d.C6294g;
import p076c.p112d.p134b.p135a.p136d.C6296j;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6384i0;
import p076c.p112d.p134b.p135a.p143g.C6391l;
import p076c.p112d.p134b.p135a.p143g.C6399n0;

@C2766f
/* renamed from: c.d.b.a.c.d.a.l */
/* compiled from: GooglePublicKeysManager */
public class C6215l {

    /* renamed from: h */
    private static final long f17492h = 300000;

    /* renamed from: i */
    private static final Pattern f17493i = Pattern.compile("\\s*max-age\\s*=\\s*(\\d+)\\s*");

    /* renamed from: a */
    private final C6290d f17494a;

    /* renamed from: b */
    private List<PublicKey> f17495b;

    /* renamed from: c */
    private long f17496c;

    /* renamed from: d */
    private final C7253a0 f17497d;

    /* renamed from: e */
    private final Lock f17498e;

    /* renamed from: f */
    private final C6391l f17499f;

    /* renamed from: g */
    private final String f17500g;

    @C2766f
    /* renamed from: c.d.b.a.c.d.a.l$a */
    /* compiled from: GooglePublicKeysManager */
    public static class C6216a {

        /* renamed from: a */
        C6391l f17501a = C6391l.f17814a;

        /* renamed from: b */
        final C7253a0 f17502b;

        /* renamed from: c */
        final C6290d f17503c;

        /* renamed from: d */
        String f17504d = C6214k.f17490c;

        public C6216a(C7253a0 a0Var, C6290d dVar) {
            this.f17502b = (C7253a0) C6381h0.m29663a(a0Var);
            this.f17503c = (C6290d) C6381h0.m29663a(dVar);
        }

        /* renamed from: a */
        public C6215l mo25327a() {
            return new C6215l(this);
        }

        /* renamed from: b */
        public final C6391l mo25328b() {
            return this.f17501a;
        }

        /* renamed from: c */
        public final C6290d mo25329c() {
            return this.f17503c;
        }

        /* renamed from: d */
        public final String mo25330d() {
            return this.f17504d;
        }

        /* renamed from: e */
        public final C7253a0 mo25331e() {
            return this.f17502b;
        }

        /* renamed from: a */
        public C6216a mo25326a(String str) {
            this.f17504d = (String) C6381h0.m29663a(str);
            return this;
        }

        /* renamed from: a */
        public C6216a mo25325a(C6391l lVar) {
            this.f17501a = (C6391l) C6381h0.m29663a(lVar);
            return this;
        }
    }

    public C6215l(C7253a0 a0Var, C6290d dVar) {
        this(new C6216a(a0Var, dVar));
    }

    /* renamed from: a */
    public final C6391l mo25318a() {
        return this.f17499f;
    }

    /* renamed from: b */
    public final long mo25319b() {
        return this.f17496c;
    }

    /* renamed from: c */
    public final C6290d mo25320c() {
        return this.f17494a;
    }

    /* renamed from: d */
    public final String mo25321d() {
        return this.f17500g;
    }

    /* renamed from: e */
    public final List<PublicKey> mo25322e() throws GeneralSecurityException, IOException {
        this.f17498e.lock();
        try {
            if (this.f17495b == null || this.f17499f.mo25628a() + 300000 > this.f17496c) {
                mo25324g();
            }
            return this.f17495b;
        } finally {
            this.f17498e.unlock();
        }
    }

    /* renamed from: f */
    public final C7253a0 mo25323f() {
        return this.f17497d;
    }

    /* renamed from: g */
    public C6215l mo25324g() throws GeneralSecurityException, IOException {
        C6294g a;
        this.f17498e.lock();
        try {
            this.f17495b = new ArrayList();
            CertificateFactory g = C6384i0.m29688g();
            C7309x a2 = this.f17497d.mo28859b().mo29135b(new C7274j(this.f17500g)).mo29092a();
            this.f17496c = this.f17499f.mo25628a() + (mo25317a(a2.mo29150g()) * 1000);
            a = this.f17494a.mo25141a(a2.mo29145b());
            C6296j e = a.mo25173e();
            if (e == null) {
                e = a.mo25182n();
            }
            C6381h0.m29666a(e == C6296j.START_OBJECT);
            while (a.mo25182n() != C6296j.END_OBJECT) {
                a.mo25182n();
                this.f17495b.add(((X509Certificate) g.generateCertificate(new ByteArrayInputStream(C6399n0.m29727a(a.mo25181m())))).getPublicKey());
            }
            this.f17495b = Collections.unmodifiableList(this.f17495b);
            a.mo25169a();
            this.f17498e.unlock();
            return this;
        } catch (Throwable th) {
            this.f17498e.unlock();
            throw th;
        }
    }

    protected C6215l(C6216a aVar) {
        this.f17498e = new ReentrantLock();
        this.f17497d = aVar.f17502b;
        this.f17494a = aVar.f17503c;
        this.f17499f = aVar.f17501a;
        this.f17500g = aVar.f17504d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public long mo25317a(C7299q qVar) {
        long j;
        if (qVar.mo29032l() != null) {
            String[] split = qVar.mo29032l().split(",");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Matcher matcher = f17493i.matcher(split[i]);
                if (matcher.matches()) {
                    j = Long.valueOf(matcher.group(1)).longValue();
                    break;
                }
                i++;
            }
        }
        j = 0;
        if (qVar.mo29021f() != null) {
            j -= qVar.mo29021f().longValue();
        }
        return Math.max(0, j);
    }
}
