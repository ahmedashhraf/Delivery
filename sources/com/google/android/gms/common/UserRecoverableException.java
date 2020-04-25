package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {

    /* renamed from: a */
    private final Intent f12773a;

    public UserRecoverableException(String str, Intent intent) {
        super(str);
        this.f12773a = intent;
    }

    /* renamed from: a */
    public Intent mo17593a() {
        return new Intent(this.f12773a);
    }
}
