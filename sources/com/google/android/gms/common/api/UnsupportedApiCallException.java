package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C4056a;

public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: a */
    private final Feature f12791a;

    @C4056a
    public UnsupportedApiCallException(Feature feature) {
        this.f12791a = feature;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.f12791a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
