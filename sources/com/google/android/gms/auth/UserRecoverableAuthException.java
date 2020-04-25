package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends GoogleAuthException {

    /* renamed from: a */
    private final Intent f12413a;

    public UserRecoverableAuthException(String str, Intent intent) {
        super(str);
        this.f12413a = intent;
    }

    /* renamed from: a */
    public Intent mo17295a() {
        Intent intent = this.f12413a;
        if (intent == null) {
            return null;
        }
        return new Intent(intent);
    }
}
