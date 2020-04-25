package org.apache.commons.logging.p527j;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.j.l */
/* compiled from: SimpleLog */
class C15109l implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ String f43947a;

    C15109l(String str) {
        this.f43947a = str;
    }

    public Object run() {
        ClassLoader j = C15110m.m67132k();
        if (j != null) {
            return j.getResourceAsStream(this.f43947a);
        }
        return ClassLoader.getSystemResourceAsStream(this.f43947a);
    }
}
