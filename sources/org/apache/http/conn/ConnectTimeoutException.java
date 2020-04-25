package org.apache.http.conn;

import java.io.InterruptedIOException;
import org.apache.http.p224d0.C6144b;

@C6144b
public class ConnectTimeoutException extends InterruptedIOException {
    private static final long serialVersionUID = -4816682903149535989L;

    public ConnectTimeoutException() {
    }

    public ConnectTimeoutException(String str) {
        super(str);
    }
}
