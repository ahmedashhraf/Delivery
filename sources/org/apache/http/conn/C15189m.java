package org.apache.http.conn;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.C15316g;
import org.apache.http.C15460l;
import org.apache.http.C15461m;
import org.apache.http.p548i0.C15357i;

/* renamed from: org.apache.http.conn.m */
/* compiled from: OperatedClientConnection */
public interface C15189m extends C15316g, C15461m {
    /* renamed from: a */
    void mo47024a(Socket socket, C15460l lVar) throws IOException;

    /* renamed from: a */
    void mo47025a(Socket socket, C15460l lVar, boolean z, C15357i iVar) throws IOException;

    /* renamed from: b */
    C15460l mo47026b();

    /* renamed from: b */
    void mo47027b(boolean z, C15357i iVar) throws IOException;

    /* renamed from: c */
    Socket mo47028c();

    /* renamed from: d */
    boolean mo47029d();
}
