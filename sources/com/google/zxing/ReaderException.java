package com.google.zxing;

public abstract class ReaderException extends Exception {

    /* renamed from: a */
    protected static final boolean f23366a = (System.getProperty("surefire.test.class.path") != null);

    /* renamed from: b */
    protected static final StackTraceElement[] f23367b = new StackTraceElement[0];

    ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    ReaderException(Throwable th) {
        super(th);
    }
}
