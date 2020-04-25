package org.apache.http.p547h0;

import java.util.Locale;
import org.apache.http.C15132b0;
import org.apache.http.C15423j;
import org.apache.http.C15466r;
import org.apache.http.C15473y;
import org.apache.http.C15474z;

/* renamed from: org.apache.http.h0.j */
/* compiled from: BasicHttpResponse */
public class C15333j extends C15324a implements C15466r {

    /* renamed from: N */
    private C15132b0 f44388N;

    /* renamed from: O */
    private C15423j f44389O;

    /* renamed from: P */
    private C15474z f44390P;

    /* renamed from: Q */
    private Locale f44391Q;

    public C15333j(C15132b0 b0Var, C15474z zVar, Locale locale) {
        if (b0Var != null) {
            this.f44388N = b0Var;
            this.f44390P = zVar;
            if (locale == null) {
                locale = Locale.getDefault();
            }
            this.f44391Q = locale;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null.");
    }

    /* renamed from: a */
    public void mo47461a(C15132b0 b0Var) {
        if (b0Var != null) {
            this.f44388N = b0Var;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* renamed from: b */
    public C15473y mo46955b() {
        return this.f44388N.mo46912b();
    }

    /* renamed from: g */
    public C15423j mo47466g() {
        return this.f44389O;
    }

    /* renamed from: l */
    public C15132b0 mo47468l() {
        return this.f44388N;
    }

    /* renamed from: m */
    public Locale mo47469m() {
        return this.f44391Q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo47465b(int i) {
        C15474z zVar = this.f44390P;
        if (zVar == null) {
            return null;
        }
        return zVar.mo47216a(i, this.f44391Q);
    }

    /* renamed from: g */
    public void mo47467g(String str) {
        if (str == null || (str.indexOf(10) < 0 && str.indexOf(13) < 0)) {
            this.f44388N = new C15339p(this.f44388N.mo46912b(), this.f44388N.mo46913c(), str);
            return;
        }
        throw new IllegalArgumentException("Line break in reason phrase.");
    }

    /* renamed from: a */
    public void mo47463a(C15473y yVar, int i) {
        this.f44388N = new C15339p(yVar, i, mo47465b(i));
    }

    /* renamed from: a */
    public void mo47464a(C15473y yVar, int i, String str) {
        this.f44388N = new C15339p(yVar, i, str);
    }

    /* renamed from: a */
    public void mo47459a(int i) {
        this.f44388N = new C15339p(this.f44388N.mo46912b(), i, mo47465b(i));
    }

    public C15333j(C15132b0 b0Var) {
        this(b0Var, (C15474z) null, (Locale) null);
    }

    public C15333j(C15473y yVar, int i, String str) {
        this((C15132b0) new C15339p(yVar, i, str), (C15474z) null, (Locale) null);
    }

    /* renamed from: a */
    public void mo47462a(C15423j jVar) {
        this.f44389O = jVar;
    }

    /* renamed from: a */
    public void mo47460a(Locale locale) {
        if (locale != null) {
            this.f44391Q = locale;
            int c = this.f44388N.mo46913c();
            this.f44388N = new C15339p(this.f44388N.mo46912b(), c, mo47465b(c));
            return;
        }
        throw new IllegalArgumentException("Locale may not be null.");
    }
}
