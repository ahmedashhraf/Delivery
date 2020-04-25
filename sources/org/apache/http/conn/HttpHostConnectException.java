package org.apache.http.conn;

import java.net.ConnectException;
import org.apache.http.C15460l;
import org.apache.http.p224d0.C6144b;

@C6144b
public class HttpHostConnectException extends ConnectException {
    private static final long serialVersionUID = -3194482710275220224L;

    /* renamed from: a */
    private final C15460l f44068a;

    public HttpHostConnectException(C15460l lVar, ConnectException connectException) {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection to ");
        sb.append(lVar);
        sb.append(" refused");
        super(sb.toString());
        this.f44068a = lVar;
        initCause(connectException);
    }

    /* renamed from: a */
    public C15460l mo46979a() {
        return this.f44068a;
    }
}
