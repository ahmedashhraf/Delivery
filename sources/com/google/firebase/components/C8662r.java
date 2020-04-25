package com.google.firebase.components;

import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.annotation.C0224v0;
import com.google.firebase.p317l.C8738a;

@C0207n0({C0208a.LIBRARY})
/* renamed from: com.google.firebase.components.r */
/* compiled from: com.google.firebase:firebase-common@@19.0.0 */
public class C8662r<T> implements C8738a<T> {

    /* renamed from: c */
    private static final Object f22708c = new Object();

    /* renamed from: a */
    private volatile Object f22709a = f22708c;

    /* renamed from: b */
    private volatile C8738a<T> f22710b;

    C8662r(T t) {
        this.f22709a = t;
    }

    /* access modifiers changed from: 0000 */
    @C0224v0
    /* renamed from: a */
    public boolean mo32034a() {
        return this.f22709a != f22708c;
    }

    public T get() {
        T t = this.f22709a;
        if (t == f22708c) {
            synchronized (this) {
                t = this.f22709a;
                if (t == f22708c) {
                    t = this.f22710b.get();
                    this.f22709a = t;
                    this.f22710b = null;
                }
            }
        }
        return t;
    }

    public C8662r(C8738a<T> aVar) {
        this.f22710b = aVar;
    }
}
