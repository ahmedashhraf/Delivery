package com.pusher.java_websocket.exceptions;

public class IncompleteHandshakeException extends RuntimeException {
    private static final long serialVersionUID = 7906596804233893092L;

    /* renamed from: a */
    private int f34739a;

    public IncompleteHandshakeException(int i) {
        this.f34739a = i;
    }

    /* renamed from: a */
    public int mo41215a() {
        return this.f34739a;
    }

    public IncompleteHandshakeException() {
        this.f34739a = 0;
    }
}
