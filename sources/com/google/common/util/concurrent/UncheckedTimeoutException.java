package com.google.common.util.concurrent;

import p201f.p202a.C5952h;

public class UncheckedTimeoutException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(@C5952h String str) {
        super(str);
    }

    public UncheckedTimeoutException(@C5952h Throwable th) {
        super(th);
    }

    public UncheckedTimeoutException(@C5952h String str, @C5952h Throwable th) {
        super(str, th);
    }
}
