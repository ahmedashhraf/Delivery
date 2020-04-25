package org.apache.http.conn;

import java.util.concurrent.TimeUnit;
import org.apache.http.conn.p535o.C15202b;
import org.apache.http.conn.p536p.C15213e;

/* renamed from: org.apache.http.conn.c */
/* compiled from: ClientConnectionManager */
public interface C15179c {
    /* renamed from: a */
    C15182f mo46987a(C15202b bVar, Object obj);

    /* renamed from: a */
    C15213e mo46988a();

    /* renamed from: a */
    void mo46989a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    void mo46990a(C15187k kVar, long j, TimeUnit timeUnit);

    /* renamed from: b */
    void mo46991b();

    void shutdown();
}
