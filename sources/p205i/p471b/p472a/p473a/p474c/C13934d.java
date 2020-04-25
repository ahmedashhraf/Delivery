package p205i.p471b.p472a.p473a.p474c;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import p205i.p471b.p472a.p473a.p474c.p478j.p479b.C13993a;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14030b;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14035f;
import p205i.p471b.p472a.p473a.p474c.p478j.p484d.C14042k;

/* renamed from: i.b.a.a.c.d */
/* compiled from: CoverageTransformer */
public class C13934d implements ClassFileTransformer {

    /* renamed from: i */
    private static final String f40456i;

    /* renamed from: a */
    private final C13993a f40457a;

    /* renamed from: b */
    private final C13935e f40458b;

    /* renamed from: c */
    private final C14042k f40459c;

    /* renamed from: d */
    private final C14042k f40460d;

    /* renamed from: e */
    private final C14042k f40461e;

    /* renamed from: f */
    private final C13932b f40462f;

    /* renamed from: g */
    private final boolean f40463g;

    /* renamed from: h */
    private final boolean f40464h;

    static {
        String name = C13934d.class.getName();
        f40456i = m59879a(name.substring(0, name.lastIndexOf(46)));
    }

    public C13934d(C14035f fVar, C14030b bVar, C13935e eVar) {
        this.f40457a = new C13993a(fVar);
        this.f40458b = eVar;
        this.f40459c = new C14042k(m59879a(bVar.mo44347j()));
        this.f40460d = new C14042k(m59879a(bVar.mo44342g()));
        this.f40461e = new C14042k(bVar.mo44340f());
        this.f40462f = new C13932b(bVar.mo44331c());
        this.f40463g = bVar.mo44345h();
        this.f40464h = bVar.mo44346i();
    }

    /* renamed from: a */
    public byte[] mo44048a(ClassLoader classLoader, String str, Class<?> cls, ProtectionDomain protectionDomain, byte[] bArr) throws IllegalClassFormatException {
        if (cls != null || !mo44047a(classLoader, str, protectionDomain)) {
            return null;
        }
        try {
            this.f40462f.mo44046a(str, bArr);
            return this.f40457a.mo44287a(bArr, str);
        } catch (Exception e) {
            IllegalClassFormatException illegalClassFormatException = new IllegalClassFormatException(e.getMessage());
            illegalClassFormatException.initCause(e);
            this.f40458b.mo44049a(illegalClassFormatException);
            throw illegalClassFormatException;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo44047a(ClassLoader classLoader, String str, ProtectionDomain protectionDomain) {
        boolean z = false;
        if (classLoader == null) {
            if (!this.f40463g) {
                return false;
            }
        } else if ((!this.f40464h && !m59880a(protectionDomain)) || this.f40461e.mo44367a(classLoader.getClass().getName())) {
            return false;
        }
        if (!str.startsWith(f40456i) && this.f40459c.mo44367a(str) && !this.f40460d.mo44367a(str)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private boolean m59880a(ProtectionDomain protectionDomain) {
        boolean z = false;
        if (protectionDomain == null) {
            return false;
        }
        CodeSource codeSource = protectionDomain.getCodeSource();
        if (codeSource == null) {
            return false;
        }
        if (codeSource.getLocation() != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    private static String m59879a(String str) {
        return str.replace('.', '/');
    }
}
