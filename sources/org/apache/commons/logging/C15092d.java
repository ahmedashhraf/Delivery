package org.apache.commons.logging;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.d */
/* compiled from: LogFactory */
class C15092d implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ ClassLoader f43866a;

    /* renamed from: b */
    private final /* synthetic */ String f43867b;

    C15092d(ClassLoader classLoader, String str) {
        this.f43866a = classLoader;
        this.f43867b = str;
    }

    public Object run() {
        ClassLoader classLoader = this.f43866a;
        if (classLoader != null) {
            return classLoader.getResourceAsStream(this.f43867b);
        }
        return ClassLoader.getSystemResourceAsStream(this.f43867b);
    }
}
