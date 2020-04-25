package org.apache.http.client;

import org.apache.http.p224d0.C6144b;

@C6144b
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;

    /* renamed from: a */
    private final int f44004a;

    public HttpResponseException(int i, String str) {
        super(str);
        this.f44004a = i;
    }

    /* renamed from: a */
    public int mo46920a() {
        return this.f44004a;
    }
}
