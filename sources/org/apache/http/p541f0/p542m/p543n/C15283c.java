package org.apache.http.p541f0.p542m.p543n;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p224d0.C6144b;

@C6144b
/* renamed from: org.apache.http.f0.m.n.c */
/* compiled from: BasicPoolEntryRef */
public class C15283c extends WeakReference<C15282b> {

    /* renamed from: a */
    private final C15202b f44270a;

    public C15283c(C15282b bVar, ReferenceQueue<Object> referenceQueue) {
        super(bVar, referenceQueue);
        if (bVar != null) {
            this.f44270a = bVar.mo47314d();
            return;
        }
        throw new IllegalArgumentException("Pool entry must not be null.");
    }

    /* renamed from: a */
    public final C15202b mo47316a() {
        return this.f44270a;
    }
}
