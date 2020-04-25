package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: N */
    private static final FormatException f23364N;

    static {
        FormatException formatException = new FormatException();
        f23364N = formatException;
        formatException.setStackTrace(ReaderException.f23367b);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m41710a() {
        return ReaderException.f23366a ? new FormatException() : f23364N;
    }

    private FormatException(Throwable th) {
        super(th);
    }

    /* renamed from: a */
    public static FormatException m41711a(Throwable th) {
        return ReaderException.f23366a ? new FormatException(th) : f23364N;
    }
}
