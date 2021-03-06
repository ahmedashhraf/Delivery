package org.apache.http.client;

import org.apache.http.ProtocolException;
import org.apache.http.p224d0.C6144b;

@C6144b
public class RedirectException extends ProtocolException {
    private static final long serialVersionUID = 4418824536372559326L;

    public RedirectException() {
    }

    public RedirectException(String str) {
        super(str);
    }

    public RedirectException(String str, Throwable th) {
        super(str, th);
    }
}
