package com.google.firebase;

import androidx.annotation.C0193h0;
import com.google.android.gms.common.internal.C4300a0;

public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    public FirebaseException(@C0193h0 String str) {
        super(C4300a0.m18622a(str, (Object) "Detail message must not be empty"));
    }

    public FirebaseException(@C0193h0 String str, Throwable th) {
        super(C4300a0.m18622a(str, (Object) "Detail message must not be empty"), th);
    }
}
