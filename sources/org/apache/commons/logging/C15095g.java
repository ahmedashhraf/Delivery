package org.apache.commons.logging;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.g */
/* compiled from: LogFactory */
class C15095g implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ String f43871a;

    /* renamed from: b */
    private final /* synthetic */ String f43872b;

    C15095g(String str, String str2) {
        this.f43871a = str;
        this.f43872b = str2;
    }

    public Object run() {
        return System.getProperty(this.f43871a, this.f43872b);
    }
}
