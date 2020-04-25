package com.google.api.client.googleapis.media;

import com.google.api.client.http.C7253a0;
import com.google.api.client.http.C7254b;
import com.google.api.client.http.C7257c0;
import com.google.api.client.http.C7260e;
import com.google.api.client.http.C7262f;
import com.google.api.client.http.C7263f0;
import com.google.api.client.http.C7271i;
import com.google.api.client.http.C7274j;
import com.google.api.client.http.C7295m;
import com.google.api.client.http.C7296n;
import com.google.api.client.http.C7299q;
import com.google.api.client.http.C7304t;
import com.google.api.client.http.C7305u;
import com.google.api.client.http.C7307v;
import com.google.api.client.http.C7308w;
import com.google.api.client.http.C7309x;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6381h0;
import p076c.p112d.p134b.p135a.p143g.C6382i;
import p076c.p112d.p134b.p135a.p143g.C6389k0;
import p076c.p112d.p134b.p135a.p235c.C6193b;
import p205i.p489f.C14069f;

public final class MediaHttpUploader {

    /* renamed from: A */
    public static final int f20496A = 262144;

    /* renamed from: B */
    public static final int f20497B = 10485760;

    /* renamed from: w */
    public static final String f20498w = "X-Upload-Content-Length";

    /* renamed from: x */
    public static final String f20499x = "X-Upload-Content-Type";

    /* renamed from: y */
    static final int f20500y = 1048576;

    /* renamed from: z */
    private static final int f20501z = 1024;

    /* renamed from: a */
    private UploadState f20502a = UploadState.NOT_STARTED;

    /* renamed from: b */
    private final C7254b f20503b;

    /* renamed from: c */
    private final C7307v f20504c;

    /* renamed from: d */
    private final C7253a0 f20505d;

    /* renamed from: e */
    private C7295m f20506e;

    /* renamed from: f */
    private long f20507f;

    /* renamed from: g */
    private boolean f20508g;

    /* renamed from: h */
    private String f20509h = "POST";

    /* renamed from: i */
    private C7299q f20510i = new C7299q();

    /* renamed from: j */
    private C7305u f20511j;

    /* renamed from: k */
    private InputStream f20512k;

    /* renamed from: l */
    private boolean f20513l;

    /* renamed from: m */
    private C7249b f20514m;

    /* renamed from: n */
    String f20515n = C14069f.f41343G;

    /* renamed from: o */
    private long f20516o;

    /* renamed from: p */
    private int f20517p = f20497B;

    /* renamed from: q */
    private Byte f20518q;

    /* renamed from: r */
    private long f20519r;

    /* renamed from: s */
    private int f20520s;

    /* renamed from: t */
    private byte[] f20521t;

    /* renamed from: u */
    private boolean f20522u;

    /* renamed from: v */
    C6389k0 f20523v = C6389k0.f17813a;

    public enum UploadState {
        NOT_STARTED,
        INITIATION_STARTED,
        INITIATION_COMPLETE,
        MEDIA_IN_PROGRESS,
        MEDIA_COMPLETE
    }

    public MediaHttpUploader(C7254b bVar, C7253a0 a0Var, C7308w wVar) {
        this.f20503b = (C7254b) C6381h0.m29663a(bVar);
        this.f20505d = (C7253a0) C6381h0.m29663a(a0Var);
        this.f20504c = wVar == null ? a0Var.mo28859b() : a0Var.mo28858a(wVar);
    }

    /* renamed from: b */
    private C7309x m34918b(C7274j jVar) throws IOException {
        m34916a(UploadState.MEDIA_IN_PROGRESS);
        C7295m mVar = this.f20503b;
        String str = "uploadType";
        if (this.f20506e != null) {
            mVar = new C7263f0().mo28883a((Collection<? extends C7295m>) Arrays.asList(new C7295m[]{this.f20506e, this.f20503b}));
            jVar.put(str, "multipart");
        } else {
            jVar.put(str, "media");
        }
        C7305u a = this.f20504c.mo29132a(this.f20509h, jVar, mVar);
        a.mo29111i().putAll(this.f20510i);
        C7309x a2 = m34915a(a);
        try {
            if (m34923p()) {
                this.f20516o = m34922o();
            }
            m34916a(UploadState.MEDIA_COMPLETE);
            return a2;
        } catch (Throwable th) {
            a2.mo29143a();
            throw th;
        }
    }

    /* renamed from: c */
    private C7309x m34920c(C7274j jVar) throws IOException {
        m34916a(UploadState.INITIATION_STARTED);
        jVar.put("uploadType", "resumable");
        C7295m mVar = this.f20506e;
        if (mVar == null) {
            mVar = new C7262f();
        }
        C7305u a = this.f20504c.mo29132a(this.f20509h, jVar, mVar);
        this.f20510i.mo25098b(f20499x, (Object) this.f20503b.getType());
        if (m34923p()) {
            this.f20510i.mo25098b(f20498w, (Object) Long.valueOf(m34922o()));
        }
        a.mo29111i().putAll(this.f20510i);
        C7309x a2 = m34915a(a);
        try {
            m34916a(UploadState.INITIATION_COMPLETE);
            return a2;
        } catch (Throwable th) {
            a2.mo29143a();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    private C7309x m34921d(C7274j jVar) throws IOException {
        C7309x xVar;
        C7309x c = m34920c(jVar);
        if (!c.mo29158o()) {
            return c;
        }
        try {
            C7274j jVar2 = new C7274j(c.mo29150g().mo29001C());
            c.mo29143a();
            this.f20512k = this.f20503b.mo28864d();
            if (!this.f20512k.markSupported() && m34923p()) {
                this.f20512k = new BufferedInputStream(this.f20512k);
            }
            while (true) {
                this.f20511j = this.f20504c.mo29138c(jVar2, null);
                m34924q();
                new C7250c(this, this.f20511j);
                if (m34923p()) {
                    xVar = m34919b(this.f20511j);
                } else {
                    xVar = m34915a(this.f20511j);
                }
                try {
                    if (xVar.mo29158o()) {
                        this.f20516o = m34922o();
                        if (this.f20503b.mo28863c()) {
                            this.f20512k.close();
                        }
                        m34916a(UploadState.MEDIA_COMPLETE);
                        return xVar;
                    } else if (xVar.mo29153j() != 308) {
                        return xVar;
                    } else {
                        String C = xVar.mo29150g().mo29001C();
                        if (C != null) {
                            jVar2 = new C7274j(C);
                        }
                        long b = m34917b(xVar.mo29150g().mo29003E());
                        long j = b - this.f20516o;
                        boolean z = true;
                        C6381h0.m29669b(j >= 0 && j <= ((long) this.f20520s));
                        long j2 = ((long) this.f20520s) - j;
                        if (m34923p()) {
                            if (j2 > 0) {
                                this.f20512k.reset();
                                if (j != this.f20512k.skip(j)) {
                                    z = false;
                                }
                                C6381h0.m29669b(z);
                            }
                        } else if (j2 == 0) {
                            this.f20521t = null;
                        }
                        this.f20516o = b;
                        m34916a(UploadState.MEDIA_IN_PROGRESS);
                    }
                } finally {
                    xVar.mo29143a();
                }
            }
        } catch (Throwable th) {
            c.mo29143a();
            throw th;
        }
    }

    /* renamed from: o */
    private long m34922o() throws IOException {
        if (!this.f20508g) {
            this.f20507f = this.f20503b.mo25634b();
            this.f20508g = true;
        }
        return this.f20507f;
    }

    /* renamed from: p */
    private boolean m34923p() throws IOException {
        return m34922o() >= 0;
    }

    /* renamed from: q */
    private void m34924q() throws IOException {
        int i;
        C7295m mVar;
        int i2;
        int i3;
        if (m34923p()) {
            i = (int) Math.min((long) this.f20517p, m34922o() - this.f20516o);
        } else {
            i = this.f20517p;
        }
        if (m34923p()) {
            this.f20512k.mark(i);
            long j = (long) i;
            mVar = new C7257c0(this.f20503b.getType(), C6382i.m29674a(this.f20512k, j)).mo28869b(true).mo28868a(j).mo28862a(false);
            this.f20515n = String.valueOf(m34922o());
        } else {
            byte[] bArr = this.f20521t;
            if (bArr == null) {
                i3 = this.f20518q == null ? i + 1 : i;
                this.f20521t = new byte[(i + 1)];
                Byte b = this.f20518q;
                if (b != null) {
                    this.f20521t[0] = b.byteValue();
                }
                i2 = 0;
            } else {
                i2 = (int) (this.f20519r - this.f20516o);
                System.arraycopy(bArr, this.f20520s - i2, bArr, 0, i2);
                Byte b2 = this.f20518q;
                if (b2 != null) {
                    this.f20521t[i2] = b2.byteValue();
                }
                i3 = i - i2;
            }
            int a = C6382i.m29672a(this.f20512k, this.f20521t, (i + 1) - i3, i3);
            if (a < i3) {
                int max = i2 + Math.max(0, a);
                if (this.f20518q != null) {
                    max++;
                    this.f20518q = null;
                }
                if (this.f20515n.equals(C14069f.f41343G)) {
                    this.f20515n = String.valueOf(this.f20516o + ((long) max));
                }
                i = max;
            } else {
                this.f20518q = Byte.valueOf(this.f20521t[i]);
            }
            mVar = new C7260e(this.f20503b.getType(), this.f20521t, 0, i);
            this.f20519r = this.f20516o + ((long) i);
        }
        this.f20520s = i;
        this.f20511j.mo29084a(mVar);
        if (i == 0) {
            C7299q i4 = this.f20511j.mo29111i();
            String str = "bytes */";
            String valueOf = String.valueOf(this.f20515n);
            i4.mo29028j(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return;
        }
        C7299q i5 = this.f20511j.mo29111i();
        long j2 = this.f20516o;
        long j3 = (((long) i) + j2) - 1;
        String valueOf2 = String.valueOf(String.valueOf(this.f20515n));
        StringBuilder sb = new StringBuilder(valueOf2.length() + 48);
        sb.append("bytes ");
        sb.append(j2);
        sb.append("-");
        sb.append(j3);
        sb.append("/");
        sb.append(valueOf2);
        i5.mo29028j(sb.toString());
    }

    /* renamed from: a */
    public C7309x mo28819a(C7274j jVar) throws IOException {
        C6381h0.m29666a(this.f20502a == UploadState.NOT_STARTED);
        if (this.f20513l) {
            return m34918b(jVar);
        }
        return m34921d(jVar);
    }

    /* renamed from: e */
    public C7295m mo28824e() {
        return this.f20503b;
    }

    /* renamed from: f */
    public C7295m mo28825f() {
        return this.f20506e;
    }

    /* renamed from: g */
    public long mo28826g() {
        return this.f20516o;
    }

    /* renamed from: h */
    public double mo28827h() throws IOException {
        C6381h0.m29667a(m34923p(), (Object) "Cannot call getProgress() if the specified AbstractInputStreamContent has no content length. Use  getNumBytesUploaded() to denote progress instead.");
        if (m34922o() == 0) {
            return 0.0d;
        }
        double d = (double) this.f20516o;
        double o = (double) m34922o();
        Double.isNaN(d);
        Double.isNaN(o);
        return d / o;
    }

    /* renamed from: i */
    public C7249b mo28828i() {
        return this.f20514m;
    }

    /* renamed from: j */
    public C6389k0 mo28829j() {
        return this.f20523v;
    }

    /* renamed from: k */
    public C7253a0 mo28830k() {
        return this.f20505d;
    }

    /* renamed from: l */
    public UploadState mo28831l() {
        return this.f20502a;
    }

    /* renamed from: m */
    public boolean mo28832m() {
        return this.f20513l;
    }

    /* access modifiers changed from: 0000 */
    @C2766f
    /* renamed from: n */
    public void mo28833n() throws IOException {
        C6381h0.m29664a(this.f20511j, (Object) "The current request should not be null");
        this.f20511j.mo29084a((C7295m) new C7262f());
        C7299q i = this.f20511j.mo29111i();
        String valueOf = String.valueOf(this.f20515n);
        String str = "bytes */";
        i.mo29028j(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    private C7309x m34915a(C7305u uVar) throws IOException {
        if (!this.f20522u && !(uVar.mo29105e() instanceof C7262f)) {
            uVar.mo29085a((C7296n) new C7271i());
        }
        return m34919b(uVar);
    }

    /* renamed from: a */
    public MediaHttpUploader mo28815a(C7295m mVar) {
        this.f20506e = mVar;
        return this;
    }

    /* renamed from: a */
    public MediaHttpUploader mo28818a(boolean z) {
        this.f20513l = z;
        return this;
    }

    /* renamed from: a */
    public MediaHttpUploader mo28814a(C7249b bVar) {
        this.f20514m = bVar;
        return this;
    }

    /* renamed from: a */
    public MediaHttpUploader mo28812a(int i) {
        C6381h0.m29667a(i > 0 && i % 262144 == 0, (Object) "chunkSize must be a positive multiple of 262144.");
        this.f20517p = i;
        return this;
    }

    /* renamed from: c */
    public C7299q mo28822c() {
        return this.f20510i;
    }

    /* renamed from: a */
    public int mo28811a() {
        return this.f20517p;
    }

    /* renamed from: b */
    private C7309x m34919b(C7305u uVar) throws IOException {
        new C6193b().mo25080a(uVar);
        uVar.mo29108f(false);
        return uVar.mo29092a();
    }

    /* renamed from: a */
    public MediaHttpUploader mo28813a(C6389k0 k0Var) {
        this.f20523v = k0Var;
        return this;
    }

    /* renamed from: a */
    public MediaHttpUploader mo28817a(String str) {
        C6381h0.m29666a(str.equals("POST") || str.equals("PUT") || str.equals(C7304t.f20670f));
        this.f20509h = str;
        return this;
    }

    /* renamed from: b */
    private long m34917b(String str) {
        if (str == null) {
            return 0;
        }
        return Long.parseLong(str.substring(str.indexOf(45) + 1)) + 1;
    }

    /* renamed from: a */
    public MediaHttpUploader mo28816a(C7299q qVar) {
        this.f20510i = qVar;
        return this;
    }

    /* renamed from: a */
    private void m34916a(UploadState uploadState) throws IOException {
        this.f20502a = uploadState;
        C7249b bVar = this.f20514m;
        if (bVar != null) {
            bVar.mo28835a(this);
        }
    }

    /* renamed from: b */
    public boolean mo28821b() {
        return this.f20522u;
    }

    /* renamed from: b */
    public MediaHttpUploader mo28820b(boolean z) {
        this.f20522u = z;
        return this;
    }

    /* renamed from: d */
    public String mo28823d() {
        return this.f20509h;
    }
}
