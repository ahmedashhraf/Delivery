package org.apache.http.impl.client;

import org.apache.http.C15466r;
import org.apache.http.HttpException;
import org.apache.http.p224d0.C6144b;

@C6144b
public class TunnelRefusedException extends HttpException {
    private static final long serialVersionUID = -8646722842745617323L;

    /* renamed from: a */
    private final C15466r f44453a;

    public TunnelRefusedException(String str, C15466r rVar) {
        super(str);
        this.f44453a = rVar;
    }

    /* renamed from: a */
    public C15466r mo47575a() {
        return this.f44453a;
    }
}
