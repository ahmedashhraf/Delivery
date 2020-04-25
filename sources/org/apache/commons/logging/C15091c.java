package org.apache.commons.logging;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.c */
/* compiled from: LogFactory */
class C15091c implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ String f43864a;

    /* renamed from: b */
    private final /* synthetic */ ClassLoader f43865b;

    C15091c(String str, ClassLoader classLoader) {
        this.f43864a = str;
        this.f43865b = classLoader;
    }

    public Object run() {
        return C15096h.m66926a(this.f43864a, this.f43865b);
    }
}
