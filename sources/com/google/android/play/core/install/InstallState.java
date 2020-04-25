package com.google.android.play.core.install;

public abstract class InstallState {
    /* renamed from: a */
    public static InstallState m34297a(int i, int i2, String str) {
        return new C7121b(i, i2, str);
    }

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract String packageName();
}
