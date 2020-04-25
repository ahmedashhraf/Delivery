package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: N */
    private static final NotFoundException f23365N;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f23365N = notFoundException;
        notFoundException.setStackTrace(ReaderException.f23367b);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m41712a() {
        return f23365N;
    }
}
