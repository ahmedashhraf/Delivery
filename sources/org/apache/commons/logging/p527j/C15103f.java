package org.apache.commons.logging.p527j;

import java.security.PrivilegedAction;

/* renamed from: org.apache.commons.logging.j.f */
/* compiled from: LogFactoryImpl */
class C15103f implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ String f43911a;

    /* renamed from: b */
    private final /* synthetic */ String f43912b;

    C15103f(String str, String str2) {
        this.f43911a = str;
        this.f43912b = str2;
    }

    public Object run() {
        return System.getProperty(this.f43911a, this.f43912b);
    }
}
