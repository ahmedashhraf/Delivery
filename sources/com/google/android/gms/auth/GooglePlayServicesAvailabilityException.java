package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {

    /* renamed from: b */
    private final int f12405b;

    GooglePlayServicesAvailabilityException(int i, String str, Intent intent) {
        super(str, intent);
        this.f12405b = i;
    }

    /* renamed from: d */
    public int mo17290d() {
        return this.f12405b;
    }
}
