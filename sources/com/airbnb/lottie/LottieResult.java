package com.airbnb.lottie;

import androidx.annotation.C0195i0;
import java.util.Arrays;

public final class LottieResult<V> {
    @C0195i0
    private final Throwable exception;
    @C0195i0
    private final V value;

    public LottieResult(V v) {
        this.value = v;
        this.exception = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        if (getValue() != null && getValue().equals(lottieResult.getValue())) {
            return true;
        }
        if (getException() == null || lottieResult.getException() == null) {
            return false;
        }
        return getException().toString().equals(getException().toString());
    }

    @C0195i0
    public Throwable getException() {
        return this.exception;
    }

    @C0195i0
    public V getValue() {
        return this.value;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{getValue(), getException()});
    }

    public LottieResult(Throwable th) {
        this.exception = th;
        this.value = null;
    }
}
