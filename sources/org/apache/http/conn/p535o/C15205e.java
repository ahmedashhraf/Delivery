package org.apache.http.conn.p535o;

import java.net.InetAddress;
import org.apache.http.C15460l;

/* renamed from: org.apache.http.conn.o.e */
/* compiled from: RouteInfo */
public interface C15205e {

    /* renamed from: org.apache.http.conn.o.e$a */
    /* compiled from: RouteInfo */
    public enum C15206a {
        PLAIN,
        LAYERED
    }

    /* renamed from: org.apache.http.conn.o.e$b */
    /* compiled from: RouteInfo */
    public enum C15207b {
        PLAIN,
        TUNNELLED
    }

    /* renamed from: a */
    C15460l mo47047a(int i);

    /* renamed from: b */
    C15460l mo47048b();

    /* renamed from: c */
    int mo47049c();

    /* renamed from: d */
    boolean mo47051d();

    /* renamed from: e */
    C15207b mo47052e();

    /* renamed from: f */
    boolean mo47054f();

    /* renamed from: g */
    C15206a mo47055g();

    InetAddress getLocalAddress();

    /* renamed from: h */
    C15460l mo47057h();

    /* renamed from: i */
    boolean mo47059i();
}
