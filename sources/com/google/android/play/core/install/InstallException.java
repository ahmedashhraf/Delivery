package com.google.android.play.core.install;

import com.google.android.play.core.install.p188c.C7123f;

public class InstallException extends RuntimeException {

    /* renamed from: a */
    private final int f20214a;

    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), C7123f.m34298a(i)}));
        this.f20214a = i;
    }

    /* renamed from: a */
    public int mo28485a() {
        return this.f20214a;
    }
}
