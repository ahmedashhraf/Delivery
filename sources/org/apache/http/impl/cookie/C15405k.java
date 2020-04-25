package org.apache.http.impl.cookie;

import java.util.List;
import org.apache.http.C15133c;
import org.apache.http.C15236d;
import org.apache.http.client.p531l.C15160e;
import org.apache.http.cookie.C15222a;
import org.apache.http.cookie.C15223b;
import org.apache.http.cookie.C15226e;
import org.apache.http.cookie.C15228g;
import org.apache.http.cookie.C15232k;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.p224d0.C6145c;

@C6145c
/* renamed from: org.apache.http.impl.cookie.k */
/* compiled from: BestMatchSpec */
public class C15405k implements C15228g {

    /* renamed from: a */
    private final String[] f44527a;

    /* renamed from: b */
    private final boolean f44528b;

    /* renamed from: c */
    private C15397e0 f44529c;

    /* renamed from: d */
    private C15420x f44530d;

    /* renamed from: e */
    private C15407m f44531e;

    /* renamed from: f */
    private C15415s f44532f;

    public C15405k(String[] strArr, boolean z) {
        String[] strArr2;
        if (strArr == null) {
            strArr2 = null;
        } else {
            strArr2 = (String[]) strArr.clone();
        }
        this.f44527a = strArr2;
        this.f44528b = z;
    }

    /* renamed from: c */
    private C15407m m68301c() {
        if (this.f44531e == null) {
            this.f44531e = new C15407m(this.f44527a);
        }
        return this.f44531e;
    }

    /* renamed from: d */
    private C15415s m68302d() {
        if (this.f44532f == null) {
            this.f44532f = new C15415s(this.f44527a);
        }
        return this.f44532f;
    }

    /* renamed from: e */
    private C15420x m68303e() {
        if (this.f44530d == null) {
            this.f44530d = new C15420x(this.f44527a, this.f44528b);
        }
        return this.f44530d;
    }

    /* renamed from: f */
    private C15397e0 m68304f() {
        if (this.f44529c == null) {
            this.f44529c = new C15397e0(this.f44527a, this.f44528b);
        }
        return this.f44529c;
    }

    /* renamed from: a */
    public List<C15223b> mo47126a(C15133c cVar, C15226e eVar) throws MalformedCookieException {
        if (cVar == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (eVar != null) {
            C15236d[] b = cVar.mo46915b();
            boolean z = false;
            boolean z2 = false;
            for (C15236d dVar : b) {
                if (dVar.mo47151a("version") != null) {
                    z = true;
                }
                if (dVar.mo47151a(C15222a.f44136B) != null) {
                    z2 = true;
                }
            }
            if (z) {
                if ("Set-Cookie2".equals(cVar.getName())) {
                    return m68304f().mo47673a(b, eVar);
                }
                return m68303e().mo47673a(b, eVar);
            } else if (z2) {
                return m68302d().mo47126a(cVar, eVar);
            } else {
                return m68301c().mo47673a(b, eVar);
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    /* renamed from: b */
    public boolean mo47130b(C15223b bVar, C15226e eVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo47102b() <= 0) {
            return m68301c().mo47130b(bVar, eVar);
        } else {
            if (bVar instanceof C15232k) {
                return m68304f().mo47130b(bVar, eVar);
            }
            return m68303e().mo47130b(bVar, eVar);
        }
    }

    public String toString() {
        return C15160e.f44036e;
    }

    public C15405k() {
        this(null, false);
    }

    /* renamed from: b */
    public int mo47129b() {
        return m68304f().mo47129b();
    }

    /* renamed from: a */
    public void mo47128a(C15223b bVar, C15226e eVar) throws MalformedCookieException {
        if (bVar == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (eVar == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (bVar.mo47102b() <= 0) {
            m68301c().mo47128a(bVar, eVar);
        } else if (bVar instanceof C15232k) {
            m68304f().mo47128a(bVar, eVar);
        } else {
            m68303e().mo47128a(bVar, eVar);
        }
    }

    /* renamed from: a */
    public List<C15133c> mo47125a(List<C15223b> list) {
        if (list != null) {
            int i = Integer.MAX_VALUE;
            boolean z = true;
            for (C15223b bVar : list) {
                if (!(bVar instanceof C15232k)) {
                    z = false;
                }
                if (bVar.mo47102b() < i) {
                    i = bVar.mo47102b();
                }
            }
            if (i <= 0) {
                return m68301c().mo47125a(list);
            }
            if (z) {
                return m68304f().mo47125a(list);
            }
            return m68303e().mo47125a(list);
        }
        throw new IllegalArgumentException("List of cookie may not be null");
    }

    /* renamed from: a */
    public C15133c mo47127a() {
        return m68304f().mo47127a();
    }
}
