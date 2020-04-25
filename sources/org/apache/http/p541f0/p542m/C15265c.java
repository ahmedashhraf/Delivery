package org.apache.http.p541f0.p542m;

import java.io.IOException;
import org.apache.http.C15460l;
import org.apache.http.conn.C15179c;
import org.apache.http.conn.C15189m;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.f0.m.c */
/* compiled from: AbstractPooledConnAdapter */
public abstract class C15265c extends C15263a {

    /* renamed from: Q */
    protected volatile C15264b f44221Q;

    protected C15265c(C15179c cVar, C15264b bVar) {
        super(cVar, bVar.f44217b);
        this.f44221Q = bVar;
    }

    /* renamed from: a */
    public void mo47011a(C15202b bVar, C15431f fVar, C15357i iVar) throws IOException {
        mo47246b();
        C15264b bVar2 = this.f44221Q;
        if (bVar2 != null) {
            bVar2.mo47252a(bVar, fVar, iVar);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public synchronized void mo47247c() {
        super.mo47247c();
        this.f44221Q = null;
    }

    public void close() throws IOException {
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47256b();
        }
        C15189m k = mo47249k();
        if (k != null) {
            k.close();
        }
    }

    public Object getState() {
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            return bVar.mo47250a();
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    /* renamed from: h */
    public C15202b mo47020h() {
        C15264b bVar = this.f44221Q;
        if (bVar == null) {
            throw new IllegalStateException("Adapter is detached.");
        } else if (bVar.f44220e == null) {
            return null;
        } else {
            return bVar.f44220e.mo47071k();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: l */
    public final void mo47257l() {
        if (this.f44221Q == null) {
            throw new IllegalStateException("Adapter is detached.");
        }
    }

    public void shutdown() throws IOException {
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47256b();
        }
        C15189m k = mo47249k();
        if (k != null) {
            k.shutdown();
        }
    }

    /* renamed from: a */
    public void mo47014a(boolean z, C15357i iVar) throws IOException {
        mo47246b();
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47255a(z, iVar);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    /* renamed from: a */
    public void mo47013a(C15460l lVar, boolean z, C15357i iVar) throws IOException {
        mo47246b();
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47254a(lVar, z, iVar);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    /* renamed from: a */
    public void mo47012a(C15431f fVar, C15357i iVar) throws IOException {
        mo47246b();
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47253a(fVar, iVar);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }

    /* renamed from: a */
    public void mo47010a(Object obj) {
        C15264b bVar = this.f44221Q;
        if (bVar != null) {
            bVar.mo47251a(obj);
            return;
        }
        throw new IllegalStateException("Adapter is detached.");
    }
}
