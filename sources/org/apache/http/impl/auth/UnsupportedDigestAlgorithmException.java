package org.apache.http.impl.auth;

import org.apache.http.p224d0.C6144b;

@C6144b
public class UnsupportedDigestAlgorithmException extends RuntimeException {
    private static final long serialVersionUID = 319558534317118022L;

    public UnsupportedDigestAlgorithmException() {
    }

    public UnsupportedDigestAlgorithmException(String str) {
        super(str);
    }

    public UnsupportedDigestAlgorithmException(String str, Throwable th) {
        super(str, th);
    }
}
