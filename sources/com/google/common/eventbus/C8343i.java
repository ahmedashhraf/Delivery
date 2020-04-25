package com.google.common.eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.common.eventbus.i */
/* compiled from: SynchronizedEventSubscriber */
final class C8343i extends C8339d {
    public C8343i(Object obj, Method method) {
        super(obj, method);
    }

    /* renamed from: a */
    public void mo31379a(Object obj) throws InvocationTargetException {
        synchronized (this) {
            super.mo31379a(obj);
        }
    }
}
