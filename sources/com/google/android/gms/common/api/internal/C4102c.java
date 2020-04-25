package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4059a;
import com.google.android.gms.common.api.C4059a.C4062c;
import com.google.android.gms.common.api.C4059a.C4063d;
import com.google.android.gms.common.internal.C4413y;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class C4102c<O extends C4063d> {

    /* renamed from: a */
    private final boolean f12894a = true;

    /* renamed from: b */
    private final int f12895b;

    /* renamed from: c */
    private final C4059a<O> f12896c;

    /* renamed from: d */
    private final O f12897d;

    private C4102c(C4059a<O> aVar, O o) {
        this.f12896c = aVar;
        this.f12897d = o;
        this.f12895b = C4413y.m19051a(this.f12896c, this.f12897d);
    }

    /* renamed from: a */
    public static <O extends C4063d> C4102c<O> m17733a(C4059a<O> aVar, O o) {
        return new C4102c<>(aVar, o);
    }

    /* renamed from: b */
    public final C4062c<?> mo17781b() {
        return this.f12896c.mo17625a();
    }

    /* renamed from: c */
    public final boolean mo17782c() {
        return this.f12894a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4102c)) {
            return false;
        }
        C4102c cVar = (C4102c) obj;
        return !this.f12894a && !cVar.f12894a && C4413y.m19053a(this.f12896c, cVar.f12896c) && C4413y.m19053a(this.f12897d, cVar.f12897d);
    }

    public final int hashCode() {
        return this.f12895b;
    }

    /* renamed from: a */
    public static <O extends C4063d> C4102c<O> m17732a(C4059a<O> aVar) {
        return new C4102c<>(aVar);
    }

    /* renamed from: a */
    public final String mo17780a() {
        return this.f12896c.mo17626b();
    }

    private C4102c(C4059a<O> aVar) {
        this.f12896c = aVar;
        this.f12897d = null;
        this.f12895b = System.identityHashCode(this);
    }
}
