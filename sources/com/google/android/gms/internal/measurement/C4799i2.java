package com.google.android.gms.internal.measurement;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.i2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4799i2<T> implements C4708c2<T> {
    @NullableDecl

    /* renamed from: N */
    private T f14178N;

    /* renamed from: a */
    private volatile C4708c2<T> f14179a;

    /* renamed from: b */
    private volatile boolean f14180b;

    C4799i2(C4708c2<T> c2Var) {
        this.f14179a = (C4708c2) C4680a2.m19904a(c2Var);
    }

    /* renamed from: a */
    public final T mo18847a() {
        if (!this.f14180b) {
            synchronized (this) {
                if (!this.f14180b) {
                    T a = this.f14179a.mo18847a();
                    this.f14178N = a;
                    this.f14180b = true;
                    this.f14179a = null;
                    return a;
                }
            }
        }
        return this.f14178N;
    }

    public final String toString() {
        Object obj = this.f14179a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f14178N);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
