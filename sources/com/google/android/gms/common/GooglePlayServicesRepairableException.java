package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* renamed from: b */
    private final int f12772b;

    public GooglePlayServicesRepairableException(int i, String str, Intent intent) {
        super(str, intent);
        this.f12772b = i;
    }

    /* renamed from: d */
    public int mo17592d() {
        return this.f12772b;
    }
}
