package com.google.api.client.googleapis.auth.clientlogin;

import com.google.api.client.googleapis.auth.clientlogin.C7238b.C7239a;
import com.google.api.client.http.HttpResponseException;
import com.google.api.client.http.HttpResponseException.C7251a;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
public class ClientLoginResponseException extends HttpResponseException {
    private static final long serialVersionUID = 4974317674023010928L;

    /* renamed from: P */
    private final transient C7239a f20450P;

    ClientLoginResponseException(C7251a aVar, C7239a aVar2) {
        super(aVar);
        this.f20450P = aVar2;
    }

    /* renamed from: h */
    public final C7239a mo28754h() {
        return this.f20450P;
    }
}
