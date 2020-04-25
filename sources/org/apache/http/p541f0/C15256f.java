package org.apache.http.p541f0;

import java.util.Locale;
import org.apache.http.C15132b0;
import org.apache.http.C15466r;
import org.apache.http.C15467s;
import org.apache.http.C15473y;
import org.apache.http.C15474z;
import org.apache.http.p547h0.C15333j;
import org.apache.http.p547h0.C15339p;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.f0.f */
/* compiled from: DefaultHttpResponseFactory */
public class C15256f implements C15467s {

    /* renamed from: a */
    protected final C15474z f44195a;

    public C15256f(C15474z zVar) {
        if (zVar != null) {
            this.f44195a = zVar;
            return;
        }
        throw new IllegalArgumentException("Reason phrase catalog must not be null.");
    }

    /* renamed from: a */
    public C15466r mo47213a(C15473y yVar, int i, C15431f fVar) {
        if (yVar != null) {
            Locale a = mo47211a(fVar);
            return new C15333j((C15132b0) new C15339p(yVar, i, this.f44195a.mo47216a(i, a)), this.f44195a, a);
        }
        throw new IllegalArgumentException("HTTP version may not be null");
    }

    public C15256f() {
        this(C15258h.f44196a);
    }

    /* renamed from: a */
    public C15466r mo47212a(C15132b0 b0Var, C15431f fVar) {
        if (b0Var != null) {
            return new C15333j(b0Var, this.f44195a, mo47211a(fVar));
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Locale mo47211a(C15431f fVar) {
        return Locale.getDefault();
    }
}
