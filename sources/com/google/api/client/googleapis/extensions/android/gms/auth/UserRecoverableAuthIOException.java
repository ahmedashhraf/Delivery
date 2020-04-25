package com.google.api.client.googleapis.extensions.android.gms.auth;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;
import p076c.p112d.p134b.p135a.p143g.C2766f;

@C2766f
public class UserRecoverableAuthIOException extends GoogleAuthIOException {
    private static final long serialVersionUID = 1;

    public UserRecoverableAuthIOException(UserRecoverableAuthException userRecoverableAuthException) {
        super(userRecoverableAuthException);
    }

    /* renamed from: a */
    public final Intent mo28762a() {
        return getCause().mo17295a();
    }

    public UserRecoverableAuthException getCause() {
        return (UserRecoverableAuthException) super.getCause();
    }
}
