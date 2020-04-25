package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.p189c0.C7160c;

public class SplitInstallException extends RuntimeException {

    /* renamed from: a */
    private final int f20264a;

    public SplitInstallException(int i) {
        super(String.format("Split Install Error(%d): %s", new Object[]{Integer.valueOf(i), C7160c.m34414a(i)}));
        this.f20264a = i;
    }

    /* renamed from: a */
    public int mo28561a() {
        return this.f20264a;
    }
}
