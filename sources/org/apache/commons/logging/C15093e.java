package org.apache.commons.logging;

import java.io.IOException;
import java.security.PrivilegedAction;
import java.util.Enumeration;

/* renamed from: org.apache.commons.logging.e */
/* compiled from: LogFactory */
class C15093e implements PrivilegedAction {

    /* renamed from: a */
    private final /* synthetic */ ClassLoader f43868a;

    /* renamed from: b */
    private final /* synthetic */ String f43869b;

    C15093e(ClassLoader classLoader, String str) {
        this.f43868a = classLoader;
        this.f43869b = str;
    }

    public Object run() {
        Enumeration enumeration = null;
        try {
            if (this.f43868a != null) {
                return this.f43868a.getResources(this.f43869b);
            }
            enumeration = ClassLoader.getSystemResources(this.f43869b);
            return enumeration;
        } catch (IOException e) {
            if (C15096h.m66955i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.f43869b);
                stringBuffer.append(":");
                stringBuffer.append(e.getMessage());
                C15096h.mo46816g(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
        }
    }
}
