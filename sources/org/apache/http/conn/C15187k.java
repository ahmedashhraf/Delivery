package org.apache.http.conn;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSession;
import org.apache.http.C15316g;
import org.apache.http.C15460l;
import org.apache.http.C15461m;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.p548i0.C15357i;
import org.apache.http.p549j0.C15431f;

/* renamed from: org.apache.http.conn.k */
/* compiled from: ManagedClientConnection */
public interface C15187k extends C15316g, C15461m, C15184h {
    /* renamed from: a */
    void mo47009a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    void mo47010a(Object obj);

    /* renamed from: a */
    void mo47011a(C15202b bVar, C15431f fVar, C15357i iVar) throws IOException;

    /* renamed from: a */
    void mo47012a(C15431f fVar, C15357i iVar) throws IOException;

    /* renamed from: a */
    void mo47013a(C15460l lVar, boolean z, C15357i iVar) throws IOException;

    /* renamed from: a */
    void mo47014a(boolean z, C15357i iVar) throws IOException;

    /* renamed from: d */
    boolean mo47015d();

    /* renamed from: e */
    boolean mo47016e();

    /* renamed from: f */
    void mo47017f();

    /* renamed from: g */
    void mo47018g();

    Object getState();

    /* renamed from: h */
    C15202b mo47020h();

    /* renamed from: i */
    SSLSession mo47021i();
}
