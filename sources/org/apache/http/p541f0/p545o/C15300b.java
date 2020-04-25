package org.apache.http.p541f0.p545o;

import java.io.IOException;
import org.apache.http.C15133c;
import org.apache.http.C15250f;
import org.apache.http.C15462n;
import org.apache.http.HttpException;
import org.apache.http.p546g0.C15319c;
import org.apache.http.p546g0.C15322f;
import org.apache.http.p547h0.C15334k;
import org.apache.http.p547h0.C15345v;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p550k0.C15454b;

/* renamed from: org.apache.http.f0.o.b */
/* compiled from: AbstractMessageWriter */
public abstract class C15300b implements C15319c {

    /* renamed from: a */
    protected final C15322f f44309a;

    /* renamed from: b */
    protected final C15454b f44310b;

    /* renamed from: c */
    protected final C15345v f44311c;

    public C15300b(C15322f fVar, C15345v vVar, C15357i iVar) {
        if (fVar != null) {
            this.f44309a = fVar;
            this.f44310b = new C15454b(128);
            if (vVar == null) {
                vVar = C15334k.f44392a;
            }
            this.f44311c = vVar;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    /* renamed from: a */
    public void mo47368a(C15462n nVar) throws IOException, HttpException {
        if (nVar != null) {
            mo47369b(nVar);
            C15250f d = nVar.mo47423d();
            while (d.hasNext()) {
                this.f44309a.mo47273a(this.f44311c.mo47474a(this.f44310b, (C15133c) d.next()));
            }
            this.f44310b.mo47768c();
            this.f44309a.mo47273a(this.f44310b);
            return;
        }
        throw new IllegalArgumentException("HTTP message may not be null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo47369b(C15462n nVar) throws IOException;
}
