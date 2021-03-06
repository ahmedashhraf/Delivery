package org.apache.http.auth;

import org.apache.http.ProtocolException;
import org.apache.http.p224d0.C6144b;

@C6144b
public class AuthenticationException extends ProtocolException {
    private static final long serialVersionUID = -6794031905674764776L;

    public AuthenticationException() {
    }

    public AuthenticationException(String str) {
        super(str);
    }

    public AuthenticationException(String str, Throwable th) {
        super(str, th);
    }
}
