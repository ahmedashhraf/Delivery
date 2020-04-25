package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: N */
    private static final ChecksumException f23363N;

    static {
        ChecksumException checksumException = new ChecksumException();
        f23363N = checksumException;
        checksumException.setStackTrace(ReaderException.f23367b);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m41708a() {
        return ReaderException.f23366a ? new ChecksumException() : f23363N;
    }

    private ChecksumException(Throwable th) {
        super(th);
    }

    /* renamed from: a */
    public static ChecksumException m41709a(Throwable th) {
        return ReaderException.f23366a ? new ChecksumException(th) : f23363N;
    }
}
