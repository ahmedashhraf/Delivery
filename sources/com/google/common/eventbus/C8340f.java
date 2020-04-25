package com.google.common.eventbus;

import com.google.common.base.C7397x;
import java.lang.reflect.Method;

/* renamed from: com.google.common.eventbus.f */
/* compiled from: SubscriberExceptionContext */
public class C8340f {

    /* renamed from: a */
    private final EventBus f22236a;

    /* renamed from: b */
    private final Object f22237b;

    /* renamed from: c */
    private final Object f22238c;

    /* renamed from: d */
    private final Method f22239d;

    C8340f(EventBus eventBus, Object obj, Object obj2, Method method) {
        this.f22236a = (EventBus) C7397x.m35664a(eventBus);
        this.f22237b = C7397x.m35664a(obj);
        this.f22238c = C7397x.m35664a(obj2);
        this.f22239d = (Method) C7397x.m35664a(method);
    }

    /* renamed from: a */
    public Object mo31384a() {
        return this.f22237b;
    }

    /* renamed from: b */
    public EventBus mo31385b() {
        return this.f22236a;
    }

    /* renamed from: c */
    public Object mo31386c() {
        return this.f22238c;
    }

    /* renamed from: d */
    public Method mo31387d() {
        return this.f22239d;
    }
}
