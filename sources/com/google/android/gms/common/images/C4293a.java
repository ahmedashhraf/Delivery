package com.google.android.gms.common.images;

/* renamed from: com.google.android.gms.common.images.a */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4293a {

    /* renamed from: a */
    private final int f13323a;

    /* renamed from: b */
    private final int f13324b;

    public C4293a(int i, int i2) {
        this.f13323a = i;
        this.f13324b = i2;
    }

    /* renamed from: a */
    public final int mo18151a() {
        return this.f13324b;
    }

    /* renamed from: b */
    public final int mo18152b() {
        return this.f13323a;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4293a) {
            C4293a aVar = (C4293a) obj;
            return this.f13323a == aVar.f13323a && this.f13324b == aVar.f13324b;
        }
    }

    public final int hashCode() {
        int i = this.f13324b;
        int i2 = this.f13323a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.f13323a;
        int i2 = this.f13324b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static C4293a m18564a(String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new C4293a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw m18565b(str);
                }
            } else {
                throw m18565b(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    /* renamed from: b */
    private static NumberFormatException m18565b(String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16);
        sb.append("Invalid Size: \"");
        sb.append(str);
        sb.append("\"");
        throw new NumberFormatException(sb.toString());
    }
}
