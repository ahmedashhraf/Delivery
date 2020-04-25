package okhttp3.internal.p517h;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.mrsool.utils.C11644i;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.C14910b;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.C14916c;
import okhttp3.internal.connection.C14921f;
import okhttp3.internal.p516g.C14944c;
import okhttp3.internal.p516g.C14947e;
import okhttp3.internal.p516g.C14950h;
import okhttp3.internal.p516g.C14951i;
import okhttp3.internal.p516g.C14953k;
import org.apache.http.p549j0.C15430e;
import p468g.C13813c0;
import p468g.C13823e0;
import p468g.C13823e0.C13824a;
import p468g.C13826f0;
import p468g.C13866u;
import p468g.C13866u.C13867a;
import p468g.C13868v;
import p468g.C13876z;
import p470h.C13883a0;
import p470h.C13885b0;
import p470h.C13887c;
import p470h.C13892d;
import p470h.C13894e;
import p470h.C13900j;
import p470h.C13906p;
import p470h.C13924z;

/* renamed from: okhttp3.internal.h.a */
/* compiled from: Http1Codec */
public final class C14955a implements C14944c {

    /* renamed from: h */
    private static final int f43366h = 0;

    /* renamed from: i */
    private static final int f43367i = 1;

    /* renamed from: j */
    private static final int f43368j = 2;

    /* renamed from: k */
    private static final int f43369k = 3;

    /* renamed from: l */
    private static final int f43370l = 4;

    /* renamed from: m */
    private static final int f43371m = 5;

    /* renamed from: n */
    private static final int f43372n = 6;

    /* renamed from: o */
    private static final int f43373o = 262144;

    /* renamed from: b */
    final C13876z f43374b;

    /* renamed from: c */
    final C14921f f43375c;

    /* renamed from: d */
    final C13894e f43376d;

    /* renamed from: e */
    final C13892d f43377e;

    /* renamed from: f */
    int f43378f = 0;

    /* renamed from: g */
    private long f43379g = PlaybackStateCompat.f481p0;

    /* renamed from: okhttp3.internal.h.a$b */
    /* compiled from: Http1Codec */
    private abstract class C14957b implements C13883a0 {

        /* renamed from: N */
        protected long f43380N;

        /* renamed from: a */
        protected final C13900j f43382a;

        /* renamed from: b */
        protected boolean f43383b;

        private C14957b() {
            this.f43382a = new C13900j(C14955a.this.f43376d.timeout());
            this.f43380N = 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo46481a(boolean z, IOException iOException) throws IOException {
            C14955a aVar = C14955a.this;
            int i = aVar.f43378f;
            if (i != 6) {
                if (i == 5) {
                    aVar.mo46475a(this.f43382a);
                    C14955a aVar2 = C14955a.this;
                    aVar2.f43378f = 6;
                    C14921f fVar = aVar2.f43375c;
                    if (fVar != null) {
                        fVar.mo46401a(!z, aVar2, this.f43380N, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(C14955a.this.f43378f);
                throw new IllegalStateException(sb.toString());
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            try {
                long read = C14955a.this.f43376d.read(cVar, j);
                if (read > 0) {
                    this.f43380N += read;
                }
                return read;
            } catch (IOException e) {
                mo46481a(false, e);
                throw e;
            }
        }

        public C13885b0 timeout() {
            return this.f43382a;
        }
    }

    /* renamed from: okhttp3.internal.h.a$c */
    /* compiled from: Http1Codec */
    private final class C14958c implements C13924z {

        /* renamed from: a */
        private final C13900j f43385a = new C13900j(C14955a.this.f43377e.timeout());

        /* renamed from: b */
        private boolean f43386b;

        C14958c() {
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            if (this.f43386b) {
                throw new IllegalStateException(C11644i.f33433v3);
            } else if (j != 0) {
                C14955a.this.f43377e.mo43881e(j);
                String str = "\r\n";
                C14955a.this.f43377e.mo43853a(str);
                C14955a.this.f43377e.mo43815b(cVar, j);
                C14955a.this.f43377e.mo43853a(str);
            }
        }

        public synchronized void close() throws IOException {
            if (!this.f43386b) {
                this.f43386b = true;
                C14955a.this.f43377e.mo43853a("0\r\n\r\n");
                C14955a.this.mo46475a(this.f43385a);
                C14955a.this.f43378f = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.f43386b) {
                C14955a.this.f43377e.flush();
            }
        }

        public C13885b0 timeout() {
            return this.f43385a;
        }
    }

    /* renamed from: okhttp3.internal.h.a$d */
    /* compiled from: Http1Codec */
    private class C14959d extends C14957b {

        /* renamed from: T */
        private static final long f43387T = -1;

        /* renamed from: P */
        private final C13868v f43388P;

        /* renamed from: Q */
        private long f43389Q = -1;

        /* renamed from: R */
        private boolean f43390R = true;

        C14959d(C13868v vVar) {
            super();
            this.f43388P = vVar;
        }

        /* renamed from: a */
        private void m66295a() throws IOException {
            if (this.f43389Q != -1) {
                C14955a.this.f43376d.mo43921u();
            }
            try {
                this.f43389Q = C14955a.this.f43376d.mo43933z();
                String trim = C14955a.this.f43376d.mo43921u().trim();
                if (this.f43389Q < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.f43389Q);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.f43389Q == 0) {
                    this.f43390R = false;
                    C14947e.m66232a(C14955a.this.f43374b.mo43738i(), this.f43388P, C14955a.this.mo46480f());
                    mo46481a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        public void close() throws IOException {
            if (!this.f43383b) {
                if (this.f43390R && !C14910b.m66059a((C13883a0) this, 100, TimeUnit.MILLISECONDS)) {
                    mo46481a(false, null);
                }
                this.f43383b = true;
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f43383b) {
                throw new IllegalStateException(C11644i.f33433v3);
            } else if (!this.f43390R) {
                return -1;
            } else {
                long j2 = this.f43389Q;
                if (j2 == 0 || j2 == -1) {
                    m66295a();
                    if (!this.f43390R) {
                        return -1;
                    }
                }
                long read = super.read(cVar, Math.min(j, this.f43389Q));
                if (read != -1) {
                    this.f43389Q -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo46481a(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* renamed from: okhttp3.internal.h.a$e */
    /* compiled from: Http1Codec */
    private final class C14960e implements C13924z {

        /* renamed from: N */
        private long f43392N;

        /* renamed from: a */
        private final C13900j f43394a = new C13900j(C14955a.this.f43377e.timeout());

        /* renamed from: b */
        private boolean f43395b;

        C14960e(long j) {
            this.f43392N = j;
        }

        /* renamed from: b */
        public void mo43815b(C13887c cVar, long j) throws IOException {
            if (!this.f43395b) {
                C14910b.m66054a(cVar.size(), 0, j);
                if (j <= this.f43392N) {
                    C14955a.this.f43377e.mo43815b(cVar, j);
                    this.f43392N -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("expected ");
                sb.append(this.f43392N);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException(C11644i.f33433v3);
        }

        public void close() throws IOException {
            if (!this.f43395b) {
                this.f43395b = true;
                if (this.f43392N <= 0) {
                    C14955a.this.mo46475a(this.f43394a);
                    C14955a.this.f43378f = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public void flush() throws IOException {
            if (!this.f43395b) {
                C14955a.this.f43377e.flush();
            }
        }

        public C13885b0 timeout() {
            return this.f43394a;
        }
    }

    /* renamed from: okhttp3.internal.h.a$f */
    /* compiled from: Http1Codec */
    private class C14961f extends C14957b {

        /* renamed from: P */
        private long f43396P;

        C14961f(long j) throws IOException {
            super();
            this.f43396P = j;
            if (this.f43396P == 0) {
                mo46481a(true, null);
            }
        }

        public void close() throws IOException {
            if (!this.f43383b) {
                if (this.f43396P != 0 && !C14910b.m66059a((C13883a0) this, 100, TimeUnit.MILLISECONDS)) {
                    mo46481a(false, null);
                }
                this.f43383b = true;
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f43383b) {
                long j2 = this.f43396P;
                if (j2 == 0) {
                    return -1;
                }
                long read = super.read(cVar, Math.min(j2, j));
                if (read != -1) {
                    this.f43396P -= read;
                    if (this.f43396P == 0) {
                        mo46481a(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo46481a(false, protocolException);
                throw protocolException;
            } else {
                throw new IllegalStateException(C11644i.f33433v3);
            }
        }
    }

    /* renamed from: okhttp3.internal.h.a$g */
    /* compiled from: Http1Codec */
    private class C14962g extends C14957b {

        /* renamed from: P */
        private boolean f43398P;

        C14962g() {
            super();
        }

        public void close() throws IOException {
            if (!this.f43383b) {
                if (!this.f43398P) {
                    mo46481a(false, null);
                }
                this.f43383b = true;
            }
        }

        public long read(C13887c cVar, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f43383b) {
                throw new IllegalStateException(C11644i.f33433v3);
            } else if (this.f43398P) {
                return -1;
            } else {
                long read = super.read(cVar, j);
                if (read != -1) {
                    return read;
                }
                this.f43398P = true;
                mo46481a(true, null);
                return -1;
            }
        }
    }

    public C14955a(C13876z zVar, C14921f fVar, C13894e eVar, C13892d dVar) {
        this.f43374b = zVar;
        this.f43375c = fVar;
        this.f43376d = eVar;
        this.f43377e = dVar;
    }

    /* renamed from: g */
    private String m66277g() throws IOException {
        String i = this.f43376d.mo43893i(this.f43379g);
        this.f43379g -= (long) i.length();
        return i;
    }

    /* renamed from: a */
    public C13924z mo46457a(C13813c0 c0Var, long j) {
        if (C15430e.f44591r.equalsIgnoreCase(c0Var.mo43351a("Transfer-Encoding"))) {
            return mo46478d();
        }
        if (j != -1) {
            return mo46473a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* renamed from: b */
    public void mo46460b() throws IOException {
        this.f43377e.flush();
    }

    /* renamed from: c */
    public boolean mo46477c() {
        return this.f43378f == 6;
    }

    public void cancel() {
        C14916c c = this.f43375c.mo46403c();
        if (c != null) {
            c.mo46383e();
        }
    }

    /* renamed from: d */
    public C13924z mo46478d() {
        if (this.f43378f == 1) {
            this.f43378f = 2;
            return new C14958c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public C13883a0 mo46479e() throws IOException {
        if (this.f43378f == 4) {
            C14921f fVar = this.f43375c;
            if (fVar != null) {
                this.f43378f = 5;
                fVar.mo46405e();
                return new C14962g();
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public C13866u mo46480f() throws IOException {
        C13867a aVar = new C13867a();
        while (true) {
            String g = m66277g();
            if (g.length() == 0) {
                return aVar.mo43627a();
            }
            Internal.instance.addLenient(aVar, g);
        }
    }

    /* renamed from: b */
    public C13883a0 mo46476b(long j) throws IOException {
        if (this.f43378f == 4) {
            this.f43378f = 5;
            return new C14961f(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo46459a(C13813c0 c0Var) throws IOException {
        mo46474a(c0Var.mo43354c(), C14951i.m66261a(c0Var, this.f43375c.mo46403c().mo43494b().mo43467b().type()));
    }

    /* renamed from: a */
    public C13826f0 mo46456a(C13823e0 e0Var) throws IOException {
        C14921f fVar = this.f43375c;
        fVar.f43221f.mo43590e(fVar.f43220e);
        String b = e0Var.mo43419b("Content-Type");
        if (!C14947e.m66237b(e0Var)) {
            return new C14950h(b, 0, C13906p.m59739a(mo46476b(0)));
        }
        if (C15430e.f44591r.equalsIgnoreCase(e0Var.mo43419b("Transfer-Encoding"))) {
            return new C14950h(b, -1, C13906p.m59739a(mo46472a(e0Var.mo43414M().mo43359h())));
        }
        long a = C14947e.m66225a(e0Var);
        if (a != -1) {
            return new C14950h(b, a, C13906p.m59739a(mo46476b(a)));
        }
        return new C14950h(b, -1, C13906p.m59739a(mo46479e()));
    }

    /* renamed from: a */
    public void mo46458a() throws IOException {
        this.f43377e.flush();
    }

    /* renamed from: a */
    public void mo46474a(C13866u uVar, String str) throws IOException {
        if (this.f43378f == 0) {
            String str2 = "\r\n";
            this.f43377e.mo43853a(str).mo43853a(str2);
            int d = uVar.mo43618d();
            for (int i = 0; i < d; i++) {
                this.f43377e.mo43853a(uVar.mo43611a(i)).mo43853a(": ").mo43853a(uVar.mo43613b(i)).mo43853a(str2);
            }
            this.f43377e.mo43853a(str2);
            this.f43378f = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C13824a mo46455a(boolean z) throws IOException {
        int i = this.f43378f;
        if (i == 1 || i == 3) {
            try {
                C14953k a = C14953k.m66276a(m66277g());
                C13824a a2 = new C13824a().mo43431a(a.f43363a).mo43429a(a.f43364b).mo43437a(a.f43365c).mo43436a(mo46480f());
                if (z && a.f43364b == 100) {
                    return null;
                }
                if (a.f43364b == 100) {
                    this.f43378f = 3;
                    return a2;
                }
                this.f43378f = 4;
                return a2;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(this.f43375c);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.f43378f);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public C13924z mo46473a(long j) {
        if (this.f43378f == 1) {
            this.f43378f = 2;
            return new C14960e(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C13883a0 mo46472a(C13868v vVar) throws IOException {
        if (this.f43378f == 4) {
            this.f43378f = 5;
            return new C14959d(vVar);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.f43378f);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo46475a(C13900j jVar) {
        C13885b0 g = jVar.mo43998g();
        jVar.mo43997a(C13885b0.f40333d);
        g.mo43823a();
        g.mo43827b();
    }
}
