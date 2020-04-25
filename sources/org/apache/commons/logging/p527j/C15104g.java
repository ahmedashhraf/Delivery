package org.apache.commons.logging.p527j;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.j.g */
/* compiled from: LogFactoryImpl */
class C15104g implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ ClassLoader f43913a;

    /* renamed from: b */
    private final /* synthetic */ C15105h f43914b;

    C15104g(C15105h hVar, ClassLoader classLoader) {
        this.f43914b = hVar;
        this.f43913a = classLoader;
    }

    public Object run() {
        return this.f43913a.getParent();
    }
}
