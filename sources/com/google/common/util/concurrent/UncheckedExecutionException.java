package com.google.common.util.concurrent;

import p076c.p112d.p148d.p149a.C2776b;
import p201f.p202a.C5952h;

@C2776b
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected UncheckedExecutionException() {
    }

    protected UncheckedExecutionException(@C5952h String str) {
        super(str);
    }

    public UncheckedExecutionException(@C5952h String str, @C5952h Throwable th) {
        super(str, th);
    }

    public UncheckedExecutionException(@C5952h Throwable th) {
        super(th);
    }
}
