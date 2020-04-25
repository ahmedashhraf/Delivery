package com.clevertap.android.sdk.exceptions;

@Deprecated
public abstract class CleverTapException extends Exception {
    public CleverTapException() {
    }

    public CleverTapException(String str) {
        super(str);
    }

    public CleverTapException(String str, Throwable th) {
        super(str, th);
    }

    public CleverTapException(Throwable th) {
        super(th);
    }
}
