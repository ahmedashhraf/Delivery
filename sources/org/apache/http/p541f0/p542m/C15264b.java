package org.apache.http.p541f0.p542m;

import java.io.IOException;
import org.apache.http.C15460l;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.C15189m;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p535o.C15208f;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.f0.m.b */
/* compiled from: AbstractPoolEntry */
public abstract class C15264b {

    /* renamed from: a */
    protected final C15181e f44216a;

    /* renamed from: b */
    protected final C15189m f44217b;

    /* renamed from: c */
    protected volatile C15202b f44218c;

    /* renamed from: d */
    protected volatile Object f44219d;

    /* renamed from: e */
    protected volatile C15208f f44220e;

    protected C15264b(C15181e eVar, C15202b bVar) {
        if (eVar != null) {
            this.f44216a = eVar;
            this.f44217b = eVar.mo46994a();
            this.f44218c = bVar;
            this.f44220e = null;
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    /* renamed from: a */
    public Object mo47250a() {
        return this.f44219d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47256b() {
        this.f44220e = null;
        this.f44219d = null;
    }

    /* renamed from: a */
    public void mo47251a(Object obj) {
        this.f44219d = obj;
    }

    /* renamed from: a */
    public void mo47252a(C15202b bVar, C15431f fVar, C15357i iVar) throws IOException {
        if (bVar == null) {
            throw new IllegalArgumentException("Route must not be null.");
        } else if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f44220e == null || !this.f44220e.mo47070j()) {
            this.f44220e = new C15208f(bVar);
            C15460l h = bVar.mo47057h();
            this.f44216a.mo46995a(this.f44217b, h != null ? h : bVar.mo47048b(), bVar.getLocalAddress(), fVar, iVar);
            C15208f fVar2 = this.f44220e;
            if (fVar2 == null) {
                throw new IOException("Request aborted");
            } else if (h == null) {
                fVar2.mo47063a(this.f44217b.mo47029d());
            } else {
                fVar2.mo47062a(h, this.f44217b.mo47029d());
            }
        } else {
            throw new IllegalStateException("Connection already open.");
        }
    }

    /* renamed from: a */
    public void mo47255a(boolean z, C15357i iVar) throws IOException {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f44220e == null || !this.f44220e.mo47070j()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.f44220e.mo47054f()) {
            this.f44217b.mo47025a(null, this.f44220e.mo47048b(), z, iVar);
            this.f44220e.mo47066c(z);
        } else {
            throw new IllegalStateException("Connection is already tunnelled.");
        }
    }

    /* renamed from: a */
    public void mo47254a(C15460l lVar, boolean z, C15357i iVar) throws IOException {
        if (lVar == null) {
            throw new IllegalArgumentException("Next proxy must not be null.");
        } else if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f44220e == null || !this.f44220e.mo47070j()) {
            throw new IllegalStateException("Connection not open.");
        } else {
            this.f44217b.mo47025a(null, lVar, z, iVar);
            this.f44220e.mo47064b(lVar, z);
        }
    }

    /* renamed from: a */
    public void mo47253a(C15431f fVar, C15357i iVar) throws IOException {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.f44220e == null || !this.f44220e.mo47070j()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.f44220e.mo47054f()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        } else if (!this.f44220e.mo47059i()) {
            this.f44216a.mo46996a(this.f44217b, this.f44220e.mo47048b(), fVar, iVar);
            this.f44220e.mo47065b(this.f44217b.mo47029d());
        } else {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        }
    }
}
