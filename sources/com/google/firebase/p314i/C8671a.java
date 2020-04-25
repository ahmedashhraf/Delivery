package com.google.firebase.p314i;

import com.google.android.gms.common.annotation.C4056a;
import com.google.android.gms.common.internal.C4300a0;

@C4056a
/* renamed from: com.google.firebase.i.a */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8671a<T> {

    /* renamed from: a */
    private final Class<T> f22765a;

    /* renamed from: b */
    private final T f22766b;

    @C4056a
    public C8671a(Class<T> cls, T t) {
        this.f22765a = (Class) C4300a0.m18620a(cls);
        this.f22766b = C4300a0.m18620a(t);
    }

    @C4056a
    /* renamed from: a */
    public T mo32055a() {
        return this.f22766b;
    }

    @C4056a
    /* renamed from: b */
    public Class<T> mo32056b() {
        return this.f22765a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f22765a, this.f22766b});
    }
}
