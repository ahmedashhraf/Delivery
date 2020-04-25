package com.google.gson.p321x;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: com.google.gson.x.f */
/* compiled from: LazilyParsedNumber */
public final class C8829f extends Number {

    /* renamed from: a */
    private final String f23147a;

    public C8829f(String str) {
        this.f23147a = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f23147a);
    }

    public double doubleValue() {
        return Double.parseDouble(this.f23147a);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8829f)) {
            return false;
        }
        C8829f fVar = (C8829f) obj;
        String str = this.f23147a;
        String str2 = fVar.f23147a;
        if (str != str2 && !str.equals(str2)) {
            z = false;
        }
        return z;
    }

    public float floatValue() {
        return Float.parseFloat(this.f23147a);
    }

    public int hashCode() {
        return this.f23147a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f23147a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f23147a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f23147a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f23147a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r1 = (int) r0
            return r1
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f23147a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.p321x.C8829f.intValue():int");
    }

    public long longValue() {
        try {
            return Long.parseLong(this.f23147a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f23147a).longValue();
        }
    }

    public String toString() {
        return this.f23147a;
    }
}
