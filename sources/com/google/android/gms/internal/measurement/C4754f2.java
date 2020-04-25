package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: com.google.android.gms.internal.measurement.f2 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.1.0 */
final class C4754f2<T> implements C4708c2<T>, Serializable {
    @NullableDecl

    /* renamed from: N */
    private transient T f14094N;

    /* renamed from: a */
    private final C4708c2<T> f14095a;

    /* renamed from: b */
    private volatile transient boolean f14096b;

    C4754f2(C4708c2<T> c2Var) {
        this.f14095a = (C4708c2) C4680a2.m19904a(c2Var);
    }

    /* renamed from: a */
    public final T mo18847a() {
        if (!this.f14096b) {
            synchronized (this) {
                if (!this.f14096b) {
                    T a = this.f14095a.mo18847a();
                    this.f14094N = a;
                    this.f14096b = true;
                    return a;
                }
            }
        }
        return this.f14094N;
    }

    public final String toString() {
        Object obj;
        if (this.f14096b) {
            String valueOf = String.valueOf(this.f14094N);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f14095a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
