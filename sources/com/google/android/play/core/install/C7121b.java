package com.google.android.play.core.install;

/* renamed from: com.google.android.play.core.install.b */
final class C7121b extends InstallState {

    /* renamed from: a */
    private final int f20215a;

    /* renamed from: b */
    private final int f20216b;

    /* renamed from: c */
    private final String f20217c;

    C7121b(int i, int i2, String str) {
        this.f20215a = i;
        this.f20216b = i2;
        if (str != null) {
            this.f20217c = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            return this.f20215a == installState.installStatus() && this.f20216b == installState.installErrorCode() && this.f20217c.equals(installState.packageName());
        }
    }

    public final int hashCode() {
        return ((((this.f20215a ^ 1000003) * 1000003) ^ this.f20216b) * 1000003) ^ this.f20217c.hashCode();
    }

    public final int installErrorCode() {
        return this.f20216b;
    }

    public final int installStatus() {
        return this.f20215a;
    }

    public final String packageName() {
        return this.f20217c;
    }

    public final String toString() {
        int i = this.f20215a;
        int i2 = this.f20216b;
        String str = this.f20217c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 83);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
