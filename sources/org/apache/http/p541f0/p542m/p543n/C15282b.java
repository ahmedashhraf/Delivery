package org.apache.http.p541f0.p542m.p543n;

import java.lang.ref.ReferenceQueue;
import org.apache.http.conn.C15181e;
import org.apache.http.conn.C15189m;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p541f0.p542m.C15264b;

/* renamed from: org.apache.http.f0.m.n.b */
/* compiled from: BasicPoolEntry */
public class C15282b extends C15264b {
    @Deprecated
    public C15282b(C15181e eVar, C15202b bVar, ReferenceQueue<Object> referenceQueue) {
        super(eVar, bVar);
        if (bVar == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo47256b() {
        super.mo47256b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15189m mo47313c() {
        return this.f44217b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C15202b mo47314d() {
        return this.f44218c;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: e */
    public final C15283c mo47315e() {
        return null;
    }

    public C15282b(C15181e eVar, C15202b bVar) {
        super(eVar, bVar);
        if (bVar == null) {
            throw new IllegalArgumentException("HTTP route may not be null");
        }
    }
}
