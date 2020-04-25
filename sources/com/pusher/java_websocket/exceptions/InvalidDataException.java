package com.pusher.java_websocket.exceptions;

public class InvalidDataException extends Exception {
    private static final long serialVersionUID = 3731842424390998726L;

    /* renamed from: a */
    private int f34740a;

    public InvalidDataException(int i) {
        this.f34740a = i;
    }

    /* renamed from: a */
    public int mo41216a() {
        return this.f34740a;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.f34740a = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.f34740a = i;
    }

    public InvalidDataException(int i, String str, Throwable th) {
        super(str, th);
        this.f34740a = i;
    }
}
