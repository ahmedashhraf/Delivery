package com.fasterxml.jackson.core;

import com.facebook.common.util.UriUtil;
import com.fasterxml.jackson.core.C3791f.C3792a;
import com.fasterxml.jackson.core.C3794h.C3796b;
import com.fasterxml.jackson.core.p157r.C3813c;
import com.fasterxml.jackson.core.p157r.C3815d;
import com.fasterxml.jackson.core.p158s.C3818c;
import com.fasterxml.jackson.core.p158s.C3819d;
import com.fasterxml.jackson.core.p158s.C3820e;
import com.fasterxml.jackson.core.p158s.C3825j;
import com.fasterxml.jackson.core.p158s.C3827l;
import com.fasterxml.jackson.core.p158s.C3829n;
import com.fasterxml.jackson.core.p159t.C3830a;
import com.fasterxml.jackson.core.p159t.C3832b;
import com.fasterxml.jackson.core.p159t.C3836f;
import com.fasterxml.jackson.core.p159t.C3838g;
import com.fasterxml.jackson.core.p159t.C3841i;
import com.fasterxml.jackson.core.p160u.C3842a;
import com.fasterxml.jackson.core.p160u.C3845b;
import com.fasterxml.jackson.core.p162w.C3854a;
import com.fasterxml.jackson.core.p162w.C3858c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.SoftReference;
import java.net.URL;

/* renamed from: com.fasterxml.jackson.core.e */
/* compiled from: JsonFactory */
public class C3789e implements C3805p, Serializable {

    /* renamed from: V */
    public static final String f11819V = "JSON";

    /* renamed from: W */
    protected static final int f11820W = C3790a.m15915f();

    /* renamed from: X */
    protected static final int f11821X = C3796b.m16064f();

    /* renamed from: Y */
    protected static final int f11822Y = C3792a.m15987f();

    /* renamed from: Z */
    private static final C3802m f11823Z = C3858c.f12230Q;

    /* renamed from: a0 */
    protected static final ThreadLocal<SoftReference<C3854a>> f11824a0 = new ThreadLocal<>();
    private static final long serialVersionUID = 8726401676402117450L;

    /* renamed from: N */
    protected C3800k f11825N;

    /* renamed from: O */
    protected int f11826O;

    /* renamed from: P */
    protected int f11827P;

    /* renamed from: Q */
    protected int f11828Q;

    /* renamed from: R */
    protected C3818c f11829R;

    /* renamed from: S */
    protected C3820e f11830S;

    /* renamed from: T */
    protected C3825j f11831T;

    /* renamed from: U */
    protected C3802m f11832U;

    /* renamed from: a */
    protected final transient C3845b f11833a;

    /* renamed from: b */
    protected final transient C3842a f11834b;

    /* renamed from: com.fasterxml.jackson.core.e$a */
    /* compiled from: JsonFactory */
    public enum C3790a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true);
        
        private final boolean _defaultState;

        private C3790a(boolean z) {
            this._defaultState = z;
        }

        /* renamed from: f */
        public static int m15915f() {
            C3790a[] values;
            int i = 0;
            for (C3790a aVar : values()) {
                if (aVar.mo16579d()) {
                    i |= aVar.mo16580e();
                }
            }
            return i;
        }

        /* renamed from: a */
        public boolean mo16578a(int i) {
            return (i & mo16580e()) != 0;
        }

        /* renamed from: d */
        public boolean mo16579d() {
            return this._defaultState;
        }

        /* renamed from: e */
        public int mo16580e() {
            return 1 << ordinal();
        }
    }

    public C3789e() {
        this(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16540a(Class<?> cls) {
        if (C3789e.class != cls) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed copy(): ");
            sb.append(C3789e.class.getName());
            sb.append(" (version: ");
            sb.append(version());
            sb.append(") does not override copy(); it has to");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3815d mo16561b(C3813c cVar) throws IOException {
        return C3830a.m16344a(cVar);
    }

    /* renamed from: c */
    public final boolean mo16564c(C3790a aVar) {
        return (aVar.mo16580e() & this.f11826O) != 0;
    }

    /* renamed from: d */
    public C3789e mo16567d() {
        mo16540a(C3789e.class);
        return new C3789e(null);
    }

    /* renamed from: e */
    public C3818c mo16569e() {
        return this.f11829R;
    }

    /* renamed from: f */
    public C3800k mo16570f() {
        return this.f11825N;
    }

    /* renamed from: g */
    public String mo16571g() {
        if (C3789e.class == C3789e.class) {
            return f11819V;
        }
        return null;
    }

    /* renamed from: h */
    public C3820e mo16572h() {
        return this.f11830S;
    }

    /* renamed from: i */
    public C3825j mo16573i() {
        return this.f11831T;
    }

    /* renamed from: j */
    public String mo16574j() {
        C3802m mVar = this.f11832U;
        if (mVar == null) {
            return null;
        }
        return mVar.getValue();
    }

    /* renamed from: k */
    public boolean mo16575k() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return new C3789e(this.f11825N);
    }

    public C3804o version() {
        return C3832b.f12070d.mo17137a();
    }

    public C3789e(C3800k kVar) {
        this.f11833a = C3845b.m16677i();
        this.f11834b = C3842a.m16642h();
        this.f11826O = f11820W;
        this.f11827P = f11821X;
        this.f11828Q = f11822Y;
        this.f11832U = f11823Z;
        this.f11825N = kVar;
    }

    /* renamed from: b */
    public C3789e mo16542b(C3790a aVar) {
        this.f11826O = aVar.mo16580e() | this.f11826O;
        return this;
    }

    /* renamed from: c */
    public final boolean mo16566c(C3796b bVar) {
        return (bVar.mo16734e() & this.f11827P) != 0;
    }

    /* renamed from: a */
    public boolean mo16541a(C3787c cVar) {
        String g = mo16571g();
        return g != null && g.equals(cVar.mo16508a());
    }

    /* renamed from: b */
    public C3789e mo16544b(C3796b bVar) {
        this.f11827P = bVar.mo16734e() | this.f11827P;
        return this;
    }

    /* renamed from: c */
    public final boolean mo16565c(C3792a aVar) {
        return (aVar.mo16653e() & this.f11828Q) != 0;
    }

    /* renamed from: d */
    public C3789e mo16568d(String str) {
        this.f11832U = str == null ? null : new C3827l(str);
        return this;
    }

    /* renamed from: b */
    public C3789e mo16543b(C3792a aVar) {
        this.f11828Q = aVar.mo16653e() | this.f11828Q;
        return this;
    }

    /* renamed from: c */
    public C3794h mo16563c(URL url) throws IOException, JsonParseException {
        return mo16557b(url);
    }

    /* renamed from: a */
    public C3815d mo16535a(C3813c cVar) throws IOException {
        if (C3789e.class == C3789e.class) {
            return mo16561b(cVar);
        }
        return null;
    }

    /* renamed from: b */
    public C3794h mo16551b(File file) throws IOException, JsonParseException {
        return mo16527a(file);
    }

    /* renamed from: c */
    public C3794h mo16562c(String str) throws IOException, JsonParseException {
        return mo16556b(str);
    }

    /* renamed from: b */
    public C3794h mo16552b(InputStream inputStream) throws IOException, JsonParseException {
        return mo16528a(inputStream);
    }

    /* renamed from: a */
    public final C3789e mo16512a(C3790a aVar, boolean z) {
        return z ? mo16542b(aVar) : mo16511a(aVar);
    }

    /* renamed from: b */
    public C3794h mo16554b(Reader reader) throws IOException, JsonParseException {
        return mo16530a(reader);
    }

    /* renamed from: a */
    public C3789e mo16511a(C3790a aVar) {
        this.f11826O = (aVar.mo16580e() ^ -1) & this.f11826O;
        return this;
    }

    /* renamed from: b */
    public C3794h mo16558b(byte[] bArr) throws IOException, JsonParseException {
        return mo16532a(bArr);
    }

    /* renamed from: a */
    public final C3789e mo16516a(C3796b bVar, boolean z) {
        return z ? mo16544b(bVar) : mo16515a(bVar);
    }

    /* renamed from: b */
    public C3794h mo16559b(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        return mo16533a(bArr, i, i2);
    }

    /* renamed from: a */
    public C3789e mo16515a(C3796b bVar) {
        this.f11827P = (bVar.mo16734e() ^ -1) & this.f11827P;
        return this;
    }

    /* renamed from: b */
    public C3794h mo16557b(URL url) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) url, true);
        InputStream a2 = mo16538a(url);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            a2 = eVar.mo16892a(a, a2);
        }
        return mo16553b(a2, a);
    }

    /* renamed from: a */
    public C3789e mo16519a(C3820e eVar) {
        this.f11830S = eVar;
        return this;
    }

    /* renamed from: a */
    public final C3789e mo16514a(C3792a aVar, boolean z) {
        return z ? mo16543b(aVar) : mo16513a(aVar);
    }

    /* renamed from: a */
    public C3789e mo16513a(C3792a aVar) {
        this.f11828Q = (aVar.mo16653e() ^ -1) & this.f11828Q;
        return this;
    }

    /* renamed from: a */
    public C3789e mo16518a(C3818c cVar) {
        this.f11829R = cVar;
        return this;
    }

    /* renamed from: a */
    public C3789e mo16520a(C3825j jVar) {
        this.f11831T = jVar;
        return this;
    }

    /* renamed from: b */
    public C3794h mo16556b(String str) throws IOException, JsonParseException {
        Reader stringReader = new StringReader(str);
        C3819d a = mo16536a((Object) stringReader, true);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            stringReader = eVar.mo16894a(a, stringReader);
        }
        return mo16555b(stringReader, a);
    }

    /* renamed from: a */
    public C3789e mo16517a(C3800k kVar) {
        this.f11825N = kVar;
        return this;
    }

    /* renamed from: a */
    public C3794h mo16527a(File file) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) file, true);
        InputStream fileInputStream = new FileInputStream(file);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            fileInputStream = eVar.mo16892a(a, fileInputStream);
        }
        return mo16553b(fileInputStream, a);
    }

    /* renamed from: b */
    public C3791f mo16547b(OutputStream outputStream, C3788d dVar) throws IOException {
        C3819d a = mo16536a((Object) outputStream, false);
        a.mo16875a(dVar);
        if (dVar == C3788d.UTF8) {
            C3825j jVar = this.f11831T;
            if (jVar != null) {
                outputStream = jVar.mo16907a(a, outputStream);
            }
            return mo16548b(outputStream, a);
        }
        Writer a2 = mo16539a(outputStream, dVar, a);
        C3825j jVar2 = this.f11831T;
        if (jVar2 != null) {
            a2 = jVar2.mo16908a(a, a2);
        }
        return mo16526a(a2, a);
    }

    /* renamed from: a */
    public C3794h mo16528a(InputStream inputStream) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) inputStream, false);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            inputStream = eVar.mo16892a(a, inputStream);
        }
        return mo16553b(inputStream, a);
    }

    /* renamed from: a */
    public C3794h mo16530a(Reader reader) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) reader, false);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            reader = eVar.mo16894a(a, reader);
        }
        return mo16555b(reader, a);
    }

    /* renamed from: a */
    public C3794h mo16532a(byte[] bArr) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) bArr, true);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            InputStream a2 = eVar.mo16893a(a, bArr, 0, bArr.length);
            if (a2 != null) {
                return mo16553b(a2, a);
            }
        }
        return mo16560b(bArr, 0, bArr.length, a);
    }

    /* renamed from: b */
    public C3791f mo16549b(Writer writer) throws IOException {
        C3819d a = mo16536a((Object) writer, false);
        C3825j jVar = this.f11831T;
        if (jVar != null) {
            writer = jVar.mo16908a(a, writer);
        }
        return mo16526a(writer, a);
    }

    /* renamed from: b */
    public C3791f mo16546b(OutputStream outputStream) throws IOException {
        return mo16547b(outputStream, C3788d.UTF8);
    }

    /* renamed from: a */
    public C3794h mo16533a(byte[] bArr, int i, int i2) throws IOException, JsonParseException {
        C3819d a = mo16536a((Object) bArr, true);
        C3820e eVar = this.f11830S;
        if (eVar != null) {
            InputStream a2 = eVar.mo16893a(a, bArr, i, i2);
            if (a2 != null) {
                return mo16553b(a2, a);
            }
        }
        return mo16560b(bArr, i, i2, a);
    }

    /* renamed from: b */
    public C3791f mo16545b(File file, C3788d dVar) throws IOException {
        OutputStream fileOutputStream = new FileOutputStream(file);
        C3819d a = mo16536a((Object) fileOutputStream, true);
        a.mo16875a(dVar);
        if (dVar == C3788d.UTF8) {
            C3825j jVar = this.f11831T;
            if (jVar != null) {
                fileOutputStream = jVar.mo16907a(a, fileOutputStream);
            }
            return mo16548b(fileOutputStream, a);
        }
        Writer a2 = mo16539a(fileOutputStream, dVar, a);
        C3825j jVar2 = this.f11831T;
        if (jVar2 != null) {
            a2 = jVar2.mo16908a(a, a2);
        }
        return mo16526a(a2, a);
    }

    /* renamed from: a */
    public C3791f mo16523a(OutputStream outputStream, C3788d dVar) throws IOException {
        return mo16547b(outputStream, dVar);
    }

    /* renamed from: a */
    public C3791f mo16525a(Writer writer) throws IOException {
        return mo16549b(writer);
    }

    /* renamed from: a */
    public C3791f mo16522a(OutputStream outputStream) throws IOException {
        return mo16546b(outputStream);
    }

    /* renamed from: a */
    public C3791f mo16521a(File file, C3788d dVar) throws IOException {
        return mo16545b(file, dVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public C3794h mo16529a(InputStream inputStream, C3819d dVar) throws IOException, JsonParseException {
        return new C3830a(dVar, inputStream).mo16933a(this.f11827P, this.f11825N, this.f11834b, this.f11833a, mo16564c(C3790a.CANONICALIZE_FIELD_NAMES), mo16564c(C3790a.INTERN_FIELD_NAMES));
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public C3794h mo16531a(Reader reader, C3819d dVar) throws IOException, JsonParseException {
        C3836f fVar = new C3836f(dVar, this.f11827P, reader, this.f11825N, this.f11833a.mo17035a(mo16564c(C3790a.CANONICALIZE_FIELD_NAMES), mo16564c(C3790a.INTERN_FIELD_NAMES)));
        return fVar;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: a */
    public C3794h mo16534a(byte[] bArr, int i, int i2, C3819d dVar) throws IOException, JsonParseException {
        return new C3830a(dVar, bArr, i, i2).mo16933a(this.f11827P, this.f11825N, this.f11834b, this.f11833a, mo16564c(C3790a.CANONICALIZE_FIELD_NAMES), mo16564c(C3790a.INTERN_FIELD_NAMES));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3794h mo16553b(InputStream inputStream, C3819d dVar) throws IOException, JsonParseException {
        return mo16529a(inputStream, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3791f mo16526a(Writer writer, C3819d dVar) throws IOException {
        return mo16550b(writer, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3794h mo16555b(Reader reader, C3819d dVar) throws IOException, JsonParseException {
        return mo16531a(reader, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3791f mo16524a(OutputStream outputStream, C3819d dVar) throws IOException {
        return mo16548b(outputStream, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C3794h mo16560b(byte[] bArr, int i, int i2, C3819d dVar) throws IOException, JsonParseException {
        return mo16534a(bArr, i, i2, dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Writer mo16539a(OutputStream outputStream, C3788d dVar, C3819d dVar2) throws IOException {
        if (dVar == C3788d.UTF8) {
            return new C3829n(dVar2, outputStream);
        }
        return new OutputStreamWriter(outputStream, dVar.mo16509d());
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C3791f mo16550b(Writer writer, C3819d dVar) throws IOException {
        C3841i iVar = new C3841i(dVar, this.f11828Q, this.f11825N, writer);
        C3818c cVar = this.f11829R;
        if (cVar != null) {
            iVar.mo16595a(cVar);
        }
        C3802m mVar = this.f11832U;
        if (mVar != f11823Z) {
            iVar.mo16594a(mVar);
        }
        return iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3819d mo16536a(Object obj, boolean z) {
        return new C3819d(mo16537a(), obj, z);
    }

    /* renamed from: a */
    public C3854a mo16537a() {
        C3854a aVar;
        SoftReference softReference = (SoftReference) f11824a0.get();
        if (softReference == null) {
            aVar = null;
        } else {
            aVar = (C3854a) softReference.get();
        }
        if (aVar != null) {
            return aVar;
        }
        C3854a aVar2 = new C3854a();
        f11824a0.set(new SoftReference(aVar2));
        return aVar2;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C3791f mo16548b(OutputStream outputStream, C3819d dVar) throws IOException {
        C3838g gVar = new C3838g(dVar, this.f11828Q, this.f11825N, outputStream);
        C3818c cVar = this.f11829R;
        if (cVar != null) {
            gVar.mo16595a(cVar);
        }
        C3802m mVar = this.f11832U;
        if (mVar != f11823Z) {
            gVar.mo16594a(mVar);
        }
        return gVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream mo16538a(URL url) throws IOException {
        if (UriUtil.LOCAL_FILE_SCHEME.equals(url.getProtocol())) {
            String host = url.getHost();
            if (host == null || host.length() == 0) {
                if (url.getPath().indexOf(37) < 0) {
                    return new FileInputStream(url.getPath());
                }
                return new FileInputStream(url.getPath());
            }
        }
        return url.openStream();
    }
}
